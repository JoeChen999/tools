
printHelp()
{
	echo -e "Usage:\n\t./iosAutoBuild.sh Release|Dev|Payment|AdHoc GameVersion [SkipUnityExport|var(branchName)]"
	echo -e "\nExample:\n\t./iosAutoBuild.sh Dev 10.0.1 master"
	echo -e "\t./iosAutoBuild.sh Payment 10.0.1 SkipUnityExport\n"
}

#START
if [ $# -lt 4 ];then
	printHelp
	exit
fi

if [ $# -eq 4 ];then
	curDir=`pwd`
	mkdir /tmp/autoTool
	cp ./*.* /tmp/autoTool
	/tmp/autoTool/iosAutoBuild.sh $1 $2 $3 $4 ${curDir}
	exit
fi

cd /tmp/autoTool

case $1 in
	"Release")
		echo "Build Release..."
		source iosReleaseEnv.sh;;
	"Dev")
		echo "Build Dev..."
		source iosDevEnv.sh;;
	"Payment")
		echo "Build Payment..."
		source iosPaymentEnv.sh;;
	"AdHoc")
		echo "Build AdHoc..."
		source iosAdHocEnv.sh;;
	*)
		printHelp
		exit;;
esac
case $4 in
        "qa2")
                echo "GDS server:qa2"
                DATA_STR_SERVER="www.cmqa2.kabam.asia";;
        "qa3")
                echo "GDS server:qa3"
                DATA_STR_SERVER="www.cmqa3.kabam.asia";;
        *)
                printHelp
                exit;;
esac
source iosGlobalEnv.sh
unityApp=/Applications/Unity/Unity.app/Contents/MacOS/Unity

#unity command line doesn't support relative project path
toolsPath=`pwd`;

cd $5
cd ../../..
rootPath=`pwd`
#cd ${toolsPath}

unityProjectPath="${rootPath}/client/Unity"
resourcesPath="${unityProjectPath}/Assets/Resources"
temp_xcode="${rootPath}/temp_xcode"
client_xcode="${rootPath}/client_xcode"
errorCode=0

#Update project from git
gitPull(){
	git reset --hard HEAD
	cd ${rootPath}
	echo -e "\ngit pull"
	#git reset --hard HEAD
	git checkout $3
	errorCode=$?
        if [ $errorCode -ne 0 ];then
                echo "git pull  error! Error code:$errorCode"
                exit
        fi
	git pull
	errorCode=$?
        if [ $errorCode -ne 0 ];then
                echo "git pull  error! Error code:$errorCode"
                exit
        fi
	git tag -a $2 -m "$1 $2"
	curl -o ~/releasenote.txt -d "action=commitlog&branchname=$3&gameversion=$2" http://10.80.0.207:8000

        errorCode=$?
        if [ $errorCode -ne 0 ];then
                echo "git pull  error! Error code:$errorCode"
                exit
        fi
	#cd ${toolsPath}
}

deleteTestRelated() {
	rm -rf "$unityProjectPath/Assets/UnityTestTools"
	rm -rf "$unityProjectPath/Assets/Editor/UnitTests"
}

#unity export
unityExport(){

	#set build variable, output to file:BuildSetting.js
	if [ $1 = "Release" ] || [ $1 = "AdHoc" ];then
		debugMode=0
		buildMethodName="IOSReleaseBuild"
	else
		debugMode=1
		buildMethodName="IOSDevelopmentBuild"
	fi
    buildSettingFile="${unityProjectPath}/Assets/Standard Assets/Data/BuildSetting.cs"
    buildSettingContent="public static class BuildSetting {
    public const int INTERNAL_VERSION = ${debugMode};
    public const int DEBUG_MODE = ${debugMode};
    public const string CLIENT_VERSION = \"$2\";
    }"
    echo -e "\nwriting BuildSetting.cs..."
    echo "${buildSettingContent}">"${buildSettingFile}"
    rm -rf ${temp_xcode}/*
#export project to client_xcode
    echo -e '\nExporting project...'

	#This step will generate a folder:${rootPath}/temp_xcode. And there is a pbxuser file in temp_xcode/Unity-iPhone.xcodeproj
	${unityApp} -quit -batchmode -projectPath $unityProjectPath -logFile ${toolsPath}/log.txt -executeMethod BuildProject.${buildMethodName}


	errorCode=$?
	if [ $errorCode -ne 0 ];then
		echo -e "\nUnity export project error! Error code:$errorCode"
		exit
	fi

	cp ${temp_xcode}/Info.plist ${client_xcode}/Info.plist
	cp ${temp_xcode}/*.png ${client_xcode}/
	cp ${temp_xcode}/Unity-iPhone.xcodeproj/*.pbxuser ${client_xcode}/Unity-iPhone.xcodeproj/

	rm -r ${client_xcode}/Data
	rm -r ${client_xcode}/Libraries
	cp -r ${temp_xcode}/Data ${client_xcode}/Data
	cp -r ${temp_xcode}/Libraries ${client_xcode}/Libraries
}

#sync and upgrade string
syncStr()
{
    echo "start to sync string.."
    curl -d "uname=admin&upasswd=admin&cmd=login" -D ./cookie0001.txt http://${DATA_STR_SERVER}/admin/login.php
    IFS=','
    for language in ${SUPPORT_LANGUAGE};do
        echo "sync string_${language}"
        curl -b cookie0001.txt http://${DATA_STR_SERVER}/admin/SyncString.php?lang=${language}
        errorCode=$?
            if [ $errorCode -ne 0 ];then
                echo -e "\nUpdate ${resourcesPath}/Data/s_${language}.txt error! Error code:$errorCode"
                exit
            fi
        echo "\n"
    done
    echo "Upgrading String Sub Version.."
    gameVersion=$2
    strVersion=${gameVersion%%.*}
    curl -b cookie0001.txt -d "dataType=0&upgrade=1&gameVer=$strVersion&masterVer=1" http://${DATA_STR_SERVER}/admin/upgradeSubVer.php?dataType=0&gameVer=$strVersion
    rm ./cookie0001.txt
}
#update Game data.txt and supported luangage strings
gameDataUpdate()
{
	if [ $1 = "Release" ] || [ $1 = "AdHoc" ];then
                return
        fi

	echo -e "\nUpdate ${resourcesPath}/Data/d.txt..."
	curl -o ${resourcesPath}/Data/d.txt -d "gver=$2" -d ${DATA_DOWNLOAD_PARAMS}\
		http://${DATA_STR_SERVER}/ajax/upgrade.php

	errorCode=$?
	if [ $errorCode -ne 0 ];then
		echo -e "\nUpdate ${resourcesPath}/Data/d.txt error! Error code:$errorCode"
		exit
	fi


    #edit by chenbiao over----------------------------------------------------------------------
    #echo -e "\n update protobuf gds"
    #cd ${toolsPath}
    #echo "python updateGDS.py ${resourcesPath} $2 ${DATA_STR_SERVER}"
    #python updateGDS.py ${resourcesPath} $2 ${DATA_STR_SERVER}
    #echo -e "\n"
    #IFS=','
    #for language in ${SUPPORT_LANGUAGE};do
    language=en;
    echo -e "\nUpdate ${resourcesPath}/Data/s_${language}.txt..."
    curl -o ${resourcesPath}/Data/s_${language}.txt -d "language=${language}&gver=$2" -d ${STR_DOWNLOAD_PARAMS}\
	http://${DATA_STR_SERVER}/ajax/upgrade.php

    errorCode=$?
    if [ $errorCode -ne 0 ];then
	echo -e "\nUpdate ${resourcesPath}/Data/s_${language}.txt error! Error code:$errorCode"
	exit
    fi
    #done
}


#following code for xcode

appPath="${client_xcode}/Build/$1/$2"
#iosDeploymentTarget=5.0

changeInfoFile()
{

	#Prepare xcode build
	echo -e "\nChanging Info.plist..."

	infoFile=${client_xcode}/Info.plist
	echo -e "\n infofile:${infoFile}"
	plistBuddy="/usr/libexec/PlistBuddy"
	${plistBuddy} -c "Set :CFBundleVersion $2" ${infoFile}
	${plistBuddy} -c "Set :CFBundleIdentifier ${BUNDLE_NAME}" ${infoFile}
	${plistBuddy} -c "Set :CFBundleShortVersionString $2" ${infoFile}
	${plistBuddy} -c "Add :FacebookAppID string ${FACEBOOK_APP_ID}" ${infoFile}
	${plistBuddy} -c "Add :CFBundleURLTypes array" ${infoFile}
	${plistBuddy} -c "Add :CFBundleURLTypes:0 dict" ${infoFile}
	${plistBuddy} -c "Add :CFBundleURLTypes:0:CFBundleURLSchemes array" ${infoFile}
	${plistBuddy} -c "Add :CFBundleURLTypes:0:CFBundleURLSchemes:0 string fb${FACEBOOK_APP_ID}" ${infoFile}
    ${plistBuddy} -c "Add :CFBundleURLTypes:1 dict" ${infoFile}
    ${plistBuddy} -c "Add :CFBundleURLTypes:1:CFBundleURLSchemes array" ${infoFile}
    ${plistBuddy} -c "Add :CFBundleURLTypes:1:CFBundleURLSchemes:0 string ${DEEP_LINKING_URL_SCHEME}" ${infoFile}
	${plistBuddy} -c "Add :CFBundleURLTypes:2 dict" ${infoFile}
    ${plistBuddy} -c "Add :CFBundleURLTypes:2:CFBundleURLName string ${APP_ID}" ${infoFile}
    ${plistBuddy} -c "Add :CFBundleURLTypes:2:CFBundleURLSchemes array" ${infoFile}
    ${plistBuddy} -c "Add :CFBundleURLTypes:2:CFBundleURLSchemes:0 string ${ADX_URL_SCHEME}" ${infoFile}
    ${plistBuddy} -c "Add :CFBundleIconFiles:0 string \"Icon-60.png\"" ${infoFile}
	${plistBuddy} -c "Add :CFBundleIconFiles:0 string \"Icon-120.png\"" ${infoFile}
	${plistBuddy} -c "Add :CFBundleIconFiles:0 string \"Icon-76.png\"" ${infoFile}
	${plistBuddy} -c "Add :CFBundleIconFiles:0 string \"Icon-152.png\"" ${infoFile}
	if [ -n ${URL_SCHEME} ];then
		${plistBuddy} -c "Add :CFBundleURLTypes:0:CFBundleURLSchemes:1 string ${URL_SCHEME}" ${infoFile}
	fi


	if [ $1 = "Release" ] || [ $1 = "AdHoc" ];then
		${plistBuddy} -c "Set :CFBundleDisplayName ${DISPLAY_NAME}" ${infoFile}
	else
		${plistBuddy} -c "Set :CFBundleDisplayName ${DISPLAY_NAME}_$1" ${infoFile}
	fi
}

changeInfoFileId(){
        infoFile=${client_xcode}/Info.plist
        plistBuddy="/usr/libexec/PlistBuddy"
        ${plistBuddy} -c "Set :CFBundleIdentifier ${BUNDLE_NAME}" ${infoFile}

	if [ $1 = "Release" ] || [ $1 = "AdHoc" ];then
                ${plistBuddy} -c "Set :CFBundleDisplayName ${DISPLAY_NAME}" ${infoFile}
        else
                ${plistBuddy} -c "Set :CFBundleDisplayName ${DISPLAY_NAME}_$1" ${infoFile}
        fi
}

xcodeBuildPrj()
{

	echo -e "\nBuilding..."
	xcodebuild -project ${client_xcode}/Unity-iPhone.xcodeproj -target Unity-iPhone -configuration Release \
		"PRODUCT_NAME=${PRODUCT_NAME}" \
#"IPHONEOS_DEPLOYMENT_TARGET=${iosDeploymentTarget}"
		"CODE_SIGN_IDENTITY=${CODE_SIGN_NAME}" \
		"CONFIGURATION_BUILD_DIR=${appPath}" \
		"PROVISIONING_PROFILE=${PROVISIONING_PROFILE}" \
		clean build

	errorCode=$?
	if [ $errorCode -ne 0 ];then
		echo -e "\nProject build error! Error code:$errorCode"
		exit
	fi
}

xcodeArchive()
{
	if [ $1 = "Release" ] || [ $1 = "AdHoc" ];then
		xcodebuild -project ${client_xcode}/Unity-iPhone.xcodeproj -scheme Unity-iPhone -configuration Release \
			"PRODUCT_NAME=${PRODUCT_NAME}" \
#"IPHONEOS_DEPLOYMENT_TARGET=${iosDeploymentTarget}"
			"CODE_SIGN_IDENTITY=${CODE_SIGN_NAME}" \
			"CONFIGURATION_BUILD_DIR=${appPath}" \
			"PROVISIONING_PROFILE=${PROVISIONING_PROFILE}" \
			archive
		errorCode=$?
		if [ $errorCode -ne 0 ];then
			echo -e "\nProject archive error! Error code:$errorCode"
		fi
		exit
    else
        xcodebuild -project ${client_xcode}/Unity-iPhone.xcodeproj -scheme Unity-iPhone -configuration Release \
            "PRODUCT_NAME=${PRODUCT_NAME}" \
#"IPHONEOS_DEPLOYMENT_TARGET=${iosDeploymentTarget}"
            "CODE_SIGN_IDENTITY=${CODE_SIGN_NAME}" \
            "CONFIGURATION_BUILD_DIR=${appPath}" \
            "PROVISIONING_PROFILE=${PROVISIONING_PROFILE}" \
            archive -archivePath ${appPath}/${PRODUCT_NAME}.xcarchive
        if [ $? -ne 0 ];then
            echo -e "\nProject archive error! Error code:$?"
            exit
        fi
	fi
}

outputIPA()
{
	#The following code is only for dev
	echo -e "\nArchiving to ipa..."

	infoPlist=${PRODUCT_NAME}.plist
	infoPlistContent="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n
	<!DOCTYPE plist PUBLIC \"-//Apple//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">\n
	<plist version=\"1.0\">\n
	<dict>\n
	\t	<key>items</key>\n
	\t	<array>\n
	\t\t		<dict>\n
	\t\t\t			<key>assets</key>\n
	\t\t\t			<array>\n
	\t\t\t\t			<dict>\n
	\t\t\t\t\t				<key>kind</key>\n
	\t\t\t\t\t				<string>software-package</string>\n
	\t\t\t\t\t				<key>url</key>\n
	\t\t\t\t\t				<string>__URL__</string>\n
	\t\t\t\t			</dict>\n
	\t\t\t			</array>\n
	\t\t\t			<key>metadata</key>\n
	\t\t\t			<dict>\n
	\t\t\t\t			<key>bundle-identifier</key>\n
	\t\t\t\t			<string>${BUNDLE_NAME}</string>\n
	\t\t\t\t			<key>bundle-version</key>\n
	\t\t\t\t			<string>$2</string>\n
	\t\t\t\t			<key>kind</key>\n
	\t\t\t\t			<string>software</string>\n
	\t\t\t\t			<key>title</key>\n
	\t\t\t\t			<string>Camelot_$2_$1</string>\n
	\t\t\t			</dict>\n
	\t\t		</dict>\n
	\t	</array>\n
	</dict>\n
	</plist>"
	echo  "${infoPlistContent}">"${appPath}/${infoPlist}"

	#/usr/bin/xcrun -sdk iphoneos PackageApplication -v "${appPath}/${PRODUCT_NAME}.app" -o "${appPath}/${PRODUCT_NAME}.ipa" --sign "${DEVELOPPER_NAME}" --embed "${PROVISONING_PROFILE_PATH}"
#/usr/bin/xcrun -sdk iphoneos PackageApplication -v "${appPath}/${PRODUCT_NAME}.app" -o "${appPath}/${PRODUCT_NAME}.ipa" --sign "${CODE_SIGN_NAME}"
    xcodebuild -exportArchive -archivePath ${appPath}/${PRODUCT_NAME}.xcarchive -exportPath ${appPath}/${PRODUCT_NAME} -exportFormat ipa -exportProvisioningProfile "${PROVISONING_PROFILE_NAME}"
	errorCode=$?

    if [ $errorCode -ne 0 ];then
		echo -e "\nArchive to ${PRODUCT_NAME}.ipa error! Error code:$errorCode\n"
		exit
	else
		echo -e "\nArchive Success!\nFind ${PRODUCT_NAME}.ipa in\n\t ${appPath}\n"
	fi
}
#upload to ota
uploadToOta()
{
    case $1 in
	"Release")
	directoryName=com.kabam.chinamobile.project1_Camelot_$2$1
	sourceDir=${client_xcode}/build/Release/$2;;
	"Dev")
	directoryName=com.kabam.chinamobile.project1_Camelot_$2$1
	sourceDir=${client_xcode}/build/Dev/$2;;
	"Payment")
	directoryName=com.kabam.chinamobile.project1_Camelot_Dev
	sourceDir=${client_xcode}/Build/Payment/$2;;
	"AdHoc")
	directoryName=com.kabam.chinamobile.project1_Camelot_$2$1
	sourceDir=${client_xcode}/build/AdHoc/$2;;
	*)
	printHelp
	exit;;
    esac

    python ${toolsPath}/makedir.py $directoryName
    cd $sourceDir
    ${toolsPath}/pushToOta.sh ${PRODUCT_NAME} $directoryName
}

main()
{
	if [ $# -gt 3 ] || [ $3 != "SkipUnityExport" ];then
		gitPull $1 $2 $3
		deleteTestRelated
       	       #syncStr $1 $2
        #gameDataUpdate $1 $2
		if [ $1 = "Release" ];then
			git add ${resourcesPath}
			git commit -m "$2 GDS files"
			git push
		fi
		unityExport $1 $2
		changeInfoFile $1 $2
	elif [ $3 = "SkipUnityExport" ];then
                changeInfoFileId $1 $2
	fi
	xcodeBuildPrj $1 $2
	xcodeArchive $1 $2
	outputIPA $1 $2
    uploadToOta $1 $2
    cd ${toolsPath}
    python ipaSize.py ${rootPath} $1 $2
    #git checkout master
    cat ~/releasenote.txt|mail -s "$(echo -e "${PRODUCT_NAME}_$2_$1 released\nContent-Type: text/html")" -F bchen@kabaminc.com,h.jiang@kabaminc.com,dnwu@kabaminc.com,yxwang@kabaminc.com,lcong@kabaminc.com,kbn-engineer@kabaminc.com,ztna@kabaminc.com,xcao@kabaminc.com
}

main $1 $2 $3
osascript -e 'say "mission completed.."'
