using UnityEngine;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using UnityEditor;


//This class methods are called by autobuild tool, NOT for menu

public class BuildProject
{	
    private static string[] Scenes
    {
        get
        {
            EditorBuildSettingsScene[] rawScenes = EditorBuildSettings.scenes;
            var ret = new string[rawScenes.Length];
            for (int i = 0; i < rawScenes.Length; ++i)
            {
                ret[i] = rawScenes[i].path;
            }
            return ret;
        }
    }

	public	static	void IOSDevelopmentBuild(){
		string		xcodePath = Application.dataPath;
		int 		slashIdx = 0;
		for( int i = 0; i < 3; i ++ ){
			slashIdx = xcodePath.LastIndexOf("/");
			xcodePath = xcodePath.Remove(slashIdx);
		}
//		xcodePath += "/client_xcode";
		xcodePath += "/temp_xcode";
		BuildPipeline.BuildPlayer(Scenes, xcodePath, BuildTarget.iPhone, BuildOptions.Development/*|BuildOptions.AcceptExternalModificationsToPlayer*/);
	}
	
	public	static	void IOSReleaseBuild(){
		string		xcodePath = Application.dataPath;
		int 		slashIdx = 0;
		for( int i = 0; i < 3; i ++ ){
			slashIdx = xcodePath.LastIndexOf("/");
			xcodePath = xcodePath.Remove(slashIdx);
		}
//		xcodePath += "/client_xcode";
		xcodePath += "/temp_xcode";
		
		Debug.Log("xcodePath:" + xcodePath );
        BuildPipeline.BuildPlayer(Scenes, xcodePath, BuildTarget.iPhone, BuildOptions.None/*BuildOptions.AcceptExternalModificationsToPlayer*/);
	}
	
	public	static	void IOSTempBuild(){
		string		xcodePath = Application.dataPath;
		int 		slashIdx = 0;
		for( int i = 0; i < 3; i ++ ){
			slashIdx = xcodePath.LastIndexOf("/");
			xcodePath = xcodePath.Remove(slashIdx);
		}
		xcodePath += "/temp_xcode";
		
		Debug.Log("xcodePath:" + xcodePath);
        BuildPipeline.BuildPlayer(Scenes, xcodePath, BuildTarget.iPhone, BuildOptions.None);
	}
	
	public	static	void	AndroidDevelopmentBuild(){
		string[]	args = System.Environment.GetCommandLineArgs();
		Debug.Log(" args len:" + args.Length);
		for( int i = 0; i < args.Length; i ++ ){
			Debug.Log(" args[" + i + "]:" + args[i]);
		}
		
		if( args.Length < 11 ){
			EditorApplication.Exit(args.Length);
		}
		
		string		projectPath = Application.dataPath;
		int 		slashIdx = 0;
		for( int i = 0; i < 3; i ++ ){
			slashIdx = projectPath.LastIndexOf("/");
			projectPath = projectPath.Remove(slashIdx);
		}
		
		//args[args.Length - 4] is version
		projectPath += "/android_project/";// + args[args.Length - 5] + "/" + args[args.Length - 2] + "_" + args[args.Length - 4];
		System.IO.DirectoryInfo dirInfo = new System.IO.DirectoryInfo(projectPath);
		if( !dirInfo.Exists ){
			dirInfo.Create();
		}
		//		Debug.Log(" apk path:" + apkPath );
		
		
		BuildOptions	buildOpt = BuildOptions.AcceptExternalModificationsToPlayer;//BuildOptions.None;//args[args.Length - 4] == "Dev" ? BuildOptions.Development : BuildOptions.None;
		PlayerSettings.Android.keystoreName = args[args.Length - 10];
		PlayerSettings.Android.keystorePass = args[args.Length - 9];
		PlayerSettings.Android.keyaliasName = args[args.Length - 8];
		PlayerSettings.Android.keyaliasPass = args[args.Length - 7];
		PlayerSettings.bundleVersion = args[args.Length - 1];
		
		if( args[args.Length - 5] == "Publish" )
		{
			PlayerSettings.Android.useAPKExpansionFiles = true;
		}
		else
		{
			PlayerSettings.Android.useAPKExpansionFiles = false;
		}
		
		//args[args.Length - 6] : branch name
		//args[args.Length - 5] : Dev or Release
		//args[args.Length - 4] : version
		//args[args.Length - 3] : target
		//args[args.Length - 2] : Google or Amazon
		//args[args.Length - 1] : Payment version for Google
		string	preName = projectPath + args[args.Length - 6] + "_V" + args[args.Length - 4] + "_" + args[args.Length - 2] + "_" + args[args.Length - 5] + "_";
		string	apkFullName;
		
		StringBuilder sb = new StringBuilder();
		for( var i = 0; i < PlayerSettings.bundleVersion.Length; i ++ ){
			if( PlayerSettings.bundleVersion[i] !='.' ){
				sb.Append( PlayerSettings.bundleVersion[i] );
			}
		}
		string		strVersionCode = sb.ToString();
		
		string		lastArg = args[args.Length - 3];
		if( lastArg == "All" || lastArg == "ATC" ){
			apkFullName = preName + "ATC";
			PlayerSettings.Android.bundleVersionCode = System.Convert.ToInt32(strVersionCode+"05");
			Debug.Log("bundleVersionCode:" + PlayerSettings.Android.bundleVersionCode );
			EditorUserBuildSettings.androidBuildSubtarget = AndroidBuildSubtarget.ATC;
            BuildPipeline.BuildPlayer( Scenes, apkFullName, BuildTarget.Android, buildOpt/*|BuildOptions.AcceptExternalModificationsToPlayer*/);
		}
		
		if( lastArg == "All" || lastArg == "DXT" ){
			apkFullName = preName + "DXT";
			PlayerSettings.Android.bundleVersionCode = System.Convert.ToInt32(strVersionCode+"04");
			Debug.Log("bundleVersionCode:" + PlayerSettings.Android.bundleVersionCode );
			EditorUserBuildSettings.androidBuildSubtarget = AndroidBuildSubtarget.DXT;
            BuildPipeline.BuildPlayer( Scenes, apkFullName, BuildTarget.Android, buildOpt/*|BuildOptions.AcceptExternalModificationsToPlayer*/);
		}
		
		if( lastArg == "All" || lastArg == "ETC" ){
			apkFullName = preName + "ETC";
			PlayerSettings.Android.bundleVersionCode = System.Convert.ToInt32(strVersionCode+"03");
			Debug.Log("bundleVersionCode:" + PlayerSettings.Android.bundleVersionCode );
			EditorUserBuildSettings.androidBuildSubtarget = AndroidBuildSubtarget.ETC2;
            BuildPipeline.BuildPlayer( Scenes, apkFullName, BuildTarget.Android, buildOpt/*|BuildOptions.AcceptExternalModificationsToPlayer*/);
		}
		
		if( lastArg == "All" || lastArg == "PVRTC" ){
			apkFullName = preName + "PVRTC";
			PlayerSettings.Android.bundleVersionCode = System.Convert.ToInt32(strVersionCode+"06");
			Debug.Log("bundleVersionCode:" + PlayerSettings.Android.bundleVersionCode );
			EditorUserBuildSettings.androidBuildSubtarget = AndroidBuildSubtarget.PVRTC;
            BuildPipeline.BuildPlayer( Scenes, apkFullName, BuildTarget.Android, buildOpt/*|BuildOptions.AcceptExternalModificationsToPlayer*/);
		}
	}
	
}
