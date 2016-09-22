#!/bin/sh

printHelp()
{
	echo "Usage:\n\t./androidAutoBuild.sh BranchName Publish|Release|Dev GameVersion All|ATC|DXT|ETC|PVRTC Google|Amazon PaymentVersion qa2|qa3|beta|stage|delta"
	echo "\nExample:\n\t./androidAutoBuild.sh master Dev 10.0.1 ATC Google 8.2.0 qa3"
	echo "\t./androidAutoBuild.sh master Release 10.0.1 All Google 9.1.0 stage\n"
}

#START
if [ $# -lt 7 ];then
	printHelp
	exit
fi

if [ $# -eq 7 ];then
    curDir=`pwd`
    mkdir /tmp/androidAutoTool
    cp ./*.sh /tmp/androidAutoTool
    /tmp/androidAutoTool/androidAutoBuild.sh $1 $2 $3 $4 $5 $6 $7 ${curDir}
    exit
fi

cd /tmp/androidAutoTool
tmpPath=`pwd`
source env.sh

case $2 in
    "Dev")
        ;;
    "Release")
        ;;
    "Publish")
        ;;
    *)
        printHelp
        exit;;
esac

case $4 in
    "ATC")
        subCode="4";;
    "DXT")
        subCode="3";;
    "ETC")
        subCode="2";;
    "PVRTC")
        subCode="1";;
    "All")
        subCode="0";;
    *)
        printHelp
        exit;;
esac

case $7 in
    "qa3")
        DATA_STR_SERVER=www.cmqa3.kabam.asia;;
    "qa2")
        DATA_STR_SERVER=www.cmqa2.kabam.asia;;
    "beta")
        DATA_STR_SERVER=beta.kocbattle.com;;
    "stage")
        DATA_STR_SERVER=stage.kocbattle.com;;
    "delta")
        DATA_STR_SERVER=delta.kocbattle.com;;
    *)
        printHelp
        exit;;
esac

#variables/Applications/Unity-4.3.4
unityApp=/Applications/Unity-4.3.4/Unity.app/Contents/MacOS/Unity
#unity command line doesn't support relative project path

cd $8
toolsPath=`pwd`;

cd ../../..
rootPath=`pwd`

unityProjectPath="${rootPath}/client/Unity"
resourcesPath="${unityProjectPath}/Assets/Resources"
client_eclipse="${rootPath}/client_eclipse"
client_xcode="${rootPath}/client_xcode"
keystore="${client_eclipse}/trunk/client_eclipse/Project/KBN/refer/camelot.keystore"
projectPath="${rootPath}/android_project/$1_V$3_$5_$2_$4"
kbnPath="${rootPath}/android_project/$1_V$3_$5_$2_$4/Camelot"
apkName="Camelot_V$3_$5_$2_$4"

errorCode=0


case $5 in
    "Google")
        publishString="Google"
        cp ${client_eclipse}/trunk/client_eclipse/Project/KBN/GooglePlay/AndroidManifest.xml ${unityProjectPath}/Assets/Plugins/Android
        projectConstanceFile="${client_eclipse}/trunk/client_eclipse/Project/KBN/GooglePlay/projectconstance/ProjectConstance.java";;
    "Amazon")
        publishString="Amazon"
        cp ${client_eclipse}/trunk/client_eclipse/Project/KBN/Amazon/AndroidManifest.xml ${unityProjectPath}/Assets/Plugins/Android
        projectConstanceFile="${client_eclipse}/trunk/client_eclipse/Project/KBN/Amazon/projectconstance/ProjectConstance.java";;
    *)
        printHelp
        exit;;
esac

#Functions
#Update project from Git
gitPull(){
    cd ${rootPath}
    echo -e "\ngit pull"

    git checkout $1
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
    curl -o ~/releasenote.txt -d "action=commitlog&branchname=$1&gameversion=$3" http://10.80.0.207:8000

    errorCode=$?
    if [ $errorCode -ne 0 ];then
        echo "git pull  error! Error code:$errorCode"
        exit
    fi
#cd ${toolsPath}
}

#update Game data.txt and supported luangage strings
gameDataUpdate()
{
    if [ $1 = "Release" ] || [ $1 = "AdHoc" ];then
        return
    fi

    echo -e "\nUpdate ${resourcesPath}/Data/d.txt..."
    curl -o ${resourcesPath}/Data/d.txt -d "gver=$3" -d ${DATA_DOWNLOAD_PARAMS}  http://${DATA_STR_SERVER}/ajax/upgrade.php

    errorCode=$?
    if [ $errorCode -ne 0 ];then
        echo -e "\nUpdate ${resourcesPath}/Data/d.txt error! Error code:$errorCode"
        exit
    fi


    echo -e "\nUpdate ${resourcesPath}/Data/building.txt..."
    curl -o ${resourcesPath}/Data/building.txt -d "gver=$3" -d ${GDS_BUILDING_DOWNLOAD_PARAMS}\
            http://${DATA_STR_SERVER}/ajax/gds.php

    errorCode=$?
    if [ $errorCode -ne 0 ];then
        echo -e "\nUpdate ${resourcesPath}/Data/building.txt error! Error code:$errorCode"
        exit
    fi

    echo -e "\nUpdate ${resourcesPath}/Data/troop.txt..."
    curl -o ${resourcesPath}/Data/troop.txt -d "gver=$3" -d ${GDS_TROOP_DOWNLOAD_PARAMS}\
            http://${DATA_STR_SERVER}/ajax/gds.php


    errorCode=$?
    if [ $errorCode -ne 0 ];then
        echo -e "\nUpdate ${resourcesPath}/Data/troop.txt error! Error code:$errorCode"
        exit
    fi
#edit by chenbiao-------------------------------------------------------------------------
    echo -e "\nUpdate ${resourcesPath}/Data/gear.txt..."
    curl -o ${resourcesPath}/Data/gear.txt -d "gver=$3" -d ${GDS_GEAR_DOWNLOAD_PARAMS}\
            http://${DATA_STR_SERVER}/ajax/gds.php

    errorCode=$?
    if [ $errorCode -ne 0 ];then
        echo -e "\nUpdate ${resourcesPath}/Data/gear.txt error! Error code:$errorCode"
        exit
    fi

    echo -e "\nUpdate ${resourcesPath}/Data/gearSkill.txt..."
    curl -o ${resourcesPath}/Data/gearSkill.txt -d "gver=$3" -d ${GDS_GEARSKILL_DOWNLOAD_PARAMS}\
            http://${DATA_STR_SERVER}/ajax/gds.php

    errorCode=$?
    if [ $errorCode -ne 0 ];then
        echo -e "\nUpdate ${resourcesPath}/Data/gearSkill.txt error! Error code:$errorCode"
        exit
    fi

    echo -e "\nUpdate ${resourcesPath}/Data/gearLevelUp.txt..."
    curl -o ${resourcesPath}/Data/gearLevelUp.txt -d "gver=$3" -d ${GDS_GEARLEVELUP_DOWNLOAD_PARAMS}\
            http://${DATA_STR_SERVER}/ajax/gds.php

    errorCode=$?
    if [ $errorCode -ne 0 ];then
        echo -e "\nUpdate ${resourcesPath}/Data/gearLevelUp.txt error! Error code:$errorCode"
        exit
    fi

    echo -e "\nUpdate ${resourcesPath}/Data/gearSysUnlock.txt..."
    curl -o ${resourcesPath}/Data/gearSysUnlock.txt -d "gver=$3" -d ${GDS_GEAR_SYS_UNLOCK_DOWNLOAD_PARAMS}\
            http://${DATA_STR_SERVER}/ajax/gds.php

    errorCode=$?
    if [ $errorCode -ne 0 ];then
        echo -e "\nUpdate ${resourcesPath}/Data/sysConfig.txt error! Error code:$errorCode"
        exit
    fi

    echo -e "\nUpdate ${resourcesPath}/Data/gearItemChest.txt..."
    curl -o ${resourcesPath}/Data/gearItemChest.txt -d "gver=$3" -d ${GDS_GEAR_ITEM_CHESTLIST_DOWNLOAD_PARAMS}\
            http://${DATA_STR_SERVER}/ajax/gds.php

    errorCode=$?
    if [ $errorCode -ne 0 ];then
        echo -e "\nUpdate ${resourcesPath}/Data/gearItemChest.txt error! Error code:$errorCode"
        exit
    fi
#edit by chenbiao over----------------------------------------------------------------------
    echo -e "\n update protobuf gds"
    cd ${toolsPath}
#echo "python updateGDS.py ${resourcesPath} $2 ${DATA_STR_SERVER}"
    python updateGDS.py ${resourcesPath} $2 ${DATA_STR_SERVER}
    echo -e "\n"
    IFS=','
    for language in ${SUPPORT_LANGUAGE};do
        echo -e "\nUpdate ${resourcesPath}/Data/s_${language}.txt..."
        curl -o ${resourcesPath}/Data/s_${language}.txt -d "language=${language}&gver=$3" -d ${STR_DOWNLOAD_PARAMS}\
                http://${DATA_STR_SERVER}/ajax/upgrade.php

        errorCode=$?
        if [ $errorCode -ne 0 ];then
            echo -e "\nUpdate ${resourcesPath}/Data/s_${language}.txt error! Error code:$errorCode"
            exit
        fi
    done
}

unityExport()
{
	#set build variable, output to file:BuildSetting.js
    if [ $2 != "Dev" ];then
        debugMode=0
    else
        debugMode=1
    fi

    buildSettingFile="${unityProjectPath}/Assets/Standard Assets/Data/BuildSetting.cs"
    buildSettingContent="public static class BuildSetting {
    public const int INTERNAL_VERSION = ${debugMode};
    public const int DEBUG_MODE = ${debugMode};
    public const string CLIENT_VERSION = \"$3\";\n
    }"
    echo -e "\nwriting BuildSetting.cs..."
    echo "${buildSettingContent}">"${buildSettingFile}"

    echo '\nExporting project...'

    ${unityApp} -logFile ${toolsPath}/log.txt -quit -batchmode -projectPath $unityProjectPath -executeMethod BuildProject.AndroidDevelopmentBuild $keystore $storepwd $alias $aliaspwd $1 $2 $3 $4 $5 $6

	errorCode=$?
    if [ $errorCode -ne 0 ];then
        echo "\nUnity export project error! Error code:$errorCode"
        exit
    else
        echo "\nUnity export project Success!"
    fi
    cp -r ${client_eclipse}/trunk/client_eclipse/ ${projectPath}
}

prepareProject()
{
    #rm -f ${komPath}/res/values/attrs.xml
    cd ${projectPath}
    cp -f ${projectConstanceFile} ./UnityPlungin/src/com/kabam/utility/projectconstance/ProjectConstance.java
    cp -f ${keystore} ./Camelot/
#cp -f ${rootPath}/$4.xml ./KOM/AndroidManifest.xml

    android update project -p ./facebook/
    android update project -p ./google-play-services_lib/
    android update project -p ./UnityPlungin/
    android update project -p ./Camelot/

    #write UnityPlungin project.properties
    UpropertiesFile=${projectPath}/UnityPlungin/project.properties
    UpropertiesContent="target=android-10\n
android.library.reference.1=../facebook\n
android.library.reference.2=../google-play-services_lib\n
android.library=true\n"

    echo "\nWriting UnityPlungin project.properties"
    echo ${UpropertiesContent}>${UpropertiesFile}

    #write KOM project.properties
    KpropertiesFile=${projectPath}/Camelot/project.properties
    KpropertiesContent="target=android-19\n
android.library.reference.1=../UnityPlungin\n"
    echo "\nWriting Camelot project.properties"
    echo ${KpropertiesContent}>${KpropertiesFile}
    
    #write KOM ant.properties
    cd ${kbnPath}
    touch ant.properties
    ant_propertiesFile=${kbnPath}/ant.properties
    ant_propertiesContent="key.store=camelot.keystore\n
key.alias=${alias}\n
\n
key.store.password=${storepwd}\n
key.alias.password=${aliaspwd}\n"

    echo "\nWriting KOM ant.properties"
    echo ${ant_propertiesContent}>${ant_propertiesFile}

    #clean all project bin file
    cd ${projectPath}/facebook
    rm -rf ./bin/*
    cd ${projectPath}/google-play-services_lib
    rm -rf ./bin/*
    cd ${projectPath}/UnityPlungin
    rm -rf ./bin/*
    cd ${projectPath}/Camelot
    rm -rf ./bin/*
}

packageAPK()
{
    cd ${kbnPath}
    ant release
    if [ $? -ne 0 ];then
        echo "\nPackage APK error! Error code:$errorCode"
        exit
    fi

    cp -f ${kbnPath}/bin/KBNActivity-release.apk ${projectPath}/${apkName}.apk
}

prepareForOta()
{
    #The following code is prepare for OTA directory
    var="$3"
    strCode=${var//./}

    rm -rf ${projectPath}
    mkdir ${projectPath}
    cd ${projectPath}
    cp -f ${client_xcode}/KBN/ICON/Icon-152.png ./${apkName}.png
    touch ${apkName}.html
    touch ${apkName}.json

    echo "\nPrepare for OTA..."

    htmlFile=${projectPath}/${apkName}.html
    htmlContent="<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\n
    <html>\n
    <head>\n
    \t  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n
    \t  <meta http-equiv=\"Content-Style-Type\" content=\"text/css\">\n
    \t  <title></title>\n
    \t  <meta name=\"Generator\" content=\"Cocoa HTML Writer\">\n
    \t  <meta name=\"CocoaVersion\" content=\"1187\">\n
    \t  <style type=\"text/css\">\n
    \t\t  p.p1 {margin: 0.0px 0.0px 0.0px 0.0px; font: 12.0px Times}\n
    \t  </style>\n
    </head>\n
    <body>\n
    <p class=\"p1\">Camelot Android app version $3 $2</p>\n
    </body>\n
    </html>"

    echo "\nWriting ${apkName}.html..."
    echo ${htmlContent}>${htmlFile}

    jsonFile=${projectPath}/${apkName}.json
    jsonContent="{\n
    \t   \"title\":\"${apkName}.apk V$3\",\n
    \t   \"versionCode\":${subCode}${strCode},\n
    \t   \"versionName\":\"$3\"\n
    }"

    echo "\nWriting ${apkName}.json..."
    echo ${jsonContent}>${jsonFile}
}

CopyAPKtoOTA()
{   
    /tmp/androidAutoTool/uploadOta.sh ${projectPath} ${apkName}

    if [ $? -ne 0 ];then
        echo -e "\nCopy ipa to OTA error! Error code:$?\n"
        exit
    else
        echo -e "\nCopy to OTA Success! \n"
    fi
}

main()
{   
    #git reset --hard HEAD
    gitPull $1 $2 $3 $4 $5 $6 $7
    prepareForOta $1 $2 $3 $4 $5 $6 $7
    gameDataUpdate $1 $2 $3 $4 $5 $6 $7
    unityExport $1 $2 $3 $4 $5 $6 $7
    prepareProject $1 $2 $3 $4 $5 $6 $7
    packageAPK
    if [ $2 != Publish ];then
        CopyAPKtoOTA
    fi
}

main $1 $2 $3 $4 $5 $6 $7
