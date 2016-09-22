<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
require_once('admincommon.php');
set_time_limit(9999);
class DBManager
{
    var $dbHost = '';
    var $dbUser = '';
    var $dbPassword = '';
    var $dbSchema = '';
    
    function __construct($host,$user,$password,$schema)
    {
        $this->dbHost = $host;
        $this->dbUser = $user;
        $this->dbPassword = $password;
        $this->dbSchema = $schema;
    }
    
    function createFromFile($sqlPath)
    {
        if(!file_exists($sqlPath))
            return false;       
        $handle = fopen($sqlPath,'rb');
        $sqlStr = fread($handle,filesize($sqlPath));
        $segment = explode(";",trim($sqlStr)); 
        self::saveByQuery($segment);
        return true;
    }
    
    private function saveByQuery($sqlArray)
    {
        $conn = mysql_connect($this->dbHost,$this->dbUser,$this->dbPassword);
        //echo 'sb='.$conn.'<br>';
        $x=mysql_select_db($this->dbSchema);
        //echo 'db='.$x.'<br>';
        foreach($sqlArray as $sql)
        {
            mysql_query($sql,$conn);
            //echo 'ddd='.$q.'<br>';
        }        
        mysql_close($conn);
    }
}
function checkExtName($fileName)
{
    $fileNames=  explode('.', $fileName);
    $extName=$fileNames[count($fileNames)-1];
    $extName=strtolower($extName);
    if($extName=='sql'){
        return true;
    }  
    else {
        return false;
    }
}
if(isset($_REQUEST['actA'])&&($_REQUEST['actA']=='doAccuracy'))
{
    $resultStr="";
    $env=isset($_REQUEST['env']) ? $_REQUEST['env'] : "cmqa2";
    $config="/opt/www/mobile1/".$env."/config/storage_config.php";
    require_once $config;
    $auxHost=$arGameConfig['db']['DBHOSTS']['aux']['m'];
    $devHost=$arGameConfig['db']['DBHOSTS']['dev']['m'];
    $masterHost=$arGameConfig['db']['DBHOSTS']['master']['m'];
    $errHost=$arGameConfig['db']['DBHOSTS']['err']['m'];
    $world1Host=$arGameConfig['db']['DBHOSTS']['1']['m'];
    $world2Host=$arGameConfig['db']['DBHOSTS']['2']['m'];
    $world3Host=$arGameConfig['db']['DBHOSTS']['3']['m'];
    $auxDB=$arGameConfig['db']['SERVERS']['aux'];
    $devDB=$arGameConfig['db']['SERVERS']['dev'];
    $errDB=$arGameConfig['db']['SERVERS']['err'];
    $masterDB=$arGameConfig['db']['SERVERS']['master'];
    $world1DB=$arGameConfig['db']['SERVERS']['1'];
    $world2DB=$arGameConfig['db']['SERVERS']['2'];
    $world3DB=$arGameConfig['db']['SERVERS']['3'];
    $user=$arGameConfig['db']['SDBLOGIN'];
    $password=$arGameConfig['db']['SDBPASS'];
    
    if(file_exists($_FILES["aux"]["tmp_name"]))
    {
        $ext=  checkExtName($_FILES["aux"]["name"]);
        if(!$ext)
        {
            $resultStr.="<tr><td style = \"font-family:arial;color:red;font-size:20px;\">aux can only use .sql file</td></tr>";
        }
        else{
            $db = new DBManager($auxHost,$user,$password,$auxDB);
            $db -> createFromFile($_FILES["aux"]["tmp_name"]);
            $resultStr.="<tr><td style = \"font-family:arial;color:red;font-size:20px;\">";
            $resultStr.=$_FILES["aux"]["name"].' execute completed on '.$auxDB.'!</td></tr>';
        }
    }

    if(file_exists($_FILES["dev"]["tmp_name"]))
    {
        $ext=  checkExtName($_FILES["dev"]["name"]);
        if(!$ext)
        {
            $resultStr.="<tr><td style = \"font-family:arial;color:red;font-size:20px;\">dev can only use .sql file</td></tr>";
        }
        else
        {
            $db = new DBManager($devHost,$user,$password,$devDB);
            $db -> createFromFile($_FILES["dev"]["tmp_name"]);
            $resultStr.="<tr><td style = \"font-family:arial;color:red;font-size:20px;\">";
            $resultStr.=$_FILES["dev"]["name"].' execute completed on '.$devDB.'!</td></tr>';
        }
    }

    if(file_exists($_FILES["err"]["tmp_name"]))
    {
        $ext=  checkExtName($_FILES["err"]["name"]);
        if(!$ext)
        {
            $resultStr.="<tr><td style = \"font-family:arial;color:red;font-size:20px;\">err can only use .sql file</td></tr>";
        }
        else
        {
            $db = new DBManager($errHost,$user,$password,$errDB);
            $db -> createFromFile($_FILES["err"]["tmp_name"]);
            $resultStr.="<tr><td style = \"font-family:arial;color:red;font-size:20px;\">";
            $resultStr.=$_FILES["err"]["name"].' execute completed on '.$errDB.'!</td></tr>';
        }
    }

    if(file_exists($_FILES["master"]["tmp_name"]))
    {
        $ext=  checkExtName($_FILES["master"]["name"]);
        if(!$ext)
        {
            $resultStr.="<tr><td style = \"font-family:arial;color:red;font-size:20px;\">master can only use .sql file</td></tr>";
        }
        else
        {
            $db = new DBManager($masterHost,$user,$password,$masterDB);
            $db -> createFromFile($_FILES["master"]["tmp_name"]);
            $resultStr.="<tr><td style = \"font-family:arial;color:red;font-size:20px;\">";
            $resultStr.=$_FILES["master"]["name"].' execute completed on '.$masterDB.'!</td></tr>';
        }
    }

    if(file_exists($_FILES["world"]["tmp_name"]))
    {
        $ext=  checkExtName($_FILES["world"]["name"]);
        if(!$ext)
        {
            $resultStr.="<tr><td style = \"font-family:arial;color:red;font-size:20px;\">world can only use .sql file</td></tr>";
        }
        else
        {
            $db = new DBManager($world1Host,$user,$password,$world1DB);
            $db -> createFromFile($_FILES["world"]["tmp_name"]);
            $resultStr.="<tr><td style = \"font-family:arial;color:red;font-size:20px;\">";
            $resultStr.=$_FILES["world"]["name"].' execute completed on '.$world1DB.'!</td></tr>';
            $db = new DBManager($world2Host,$user,$password,$world2DB);
            $db -> createFromFile($_FILES["world"]["tmp_name"]);
            $resultStr.="<tr><td style = \"font-family:arial;color:red;font-size:20px;\">";
            $resultStr.=$_FILES["world"]["name"].' execute completed on '.$world2DB.'!</td></tr>';
            $db = new DBManager($world3Host,$user,$password,$world3DB);
            $db -> createFromFile($_FILES["world"]["tmp_name"]);
            $resultStr.="<tr><td style = \"font-family:arial;color:red;font-size:20px;\">";
            $resultStr.=$_FILES["world"]["name"].' execute completed on '.$world3DB.'!</td></tr>';
        }
    }
    $result=1;
}
?>
<html>
<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
</head>
<body>
<style>
td{
	padding: 4px;
}
</style>
<table>
<tr>
	<td width="190" valign="top">
	<?
		printAdminContents();
	?>
	</td>
        <td valign="top">
		<p style="font-size:18px;color:orange;font-weight:bold;">Kabam <span style="margin-left:10px;font-weight:normal;color:#222;">DB update</span></p>
                <HR  width="100%" color=#011100 SIZE=2><br>
                <table>
                    <tr>
                         <td bgcolor="#efefef" style="padding:8px; margin:8px;font-size: 18px;"> <a href='DBupdate.php'>Easy</a></td>
                         <td bgcolor="#efefef" style="padding:8px; margin:8px;font-size: 18px;"> <a href='DBAupdate.php'>Accuracy</a> </td>															
                    </tr>
                </table>
                <HR  width="100%" color=#011100 SIZE=2><br>
                <table border="2">
                    <form name="form2" method="POST" enctype="multipart/form-data" action=""> 
                        <tr>
				<td bgcolor="#efefef" style="padding:4px; margin:4px;">env</td>
				<td bgcolor="#efefef" style="padding:4px; margin:4px;"><input type='input' name='env'></td>			
			</tr>
                        <tr>
				<td bgcolor="#efefef" style="padding:4px; margin:4px;">aux</td>
                                <td bgcolor="#efefef" style="padding:4px; margin:4px;"><input type='file' name='aux' size="20"></td>			
			</tr>
			<tr>
				<td bgcolor="#efefef" style="padding:4px; margin:4px;">dev</td>
				<td bgcolor="#efefef" style="padding:4px; margin:4px;"><input type='file' name='dev'></td>			
			</tr>
                        <tr>
				<td bgcolor="#efefef" style="padding:4px; margin:4px;">err</td>
				<td bgcolor="#efefef" style="padding:4px; margin:4px;"><input type='file' name='err'></td>
			</tr>
                        <tr>
				<td bgcolor="#efefef" style="padding:4px; margin:4px;">master</td>
				<td bgcolor="#efefef" style="padding:4px; margin:4px;"><input type='file' name='master'></td>			
			</tr>
                        <tr>
				<td bgcolor="#efefef" style="padding:4px; margin:4px;">world</td>
				<td bgcolor="#efefef" style="padding:4px; margin:4px;"><input type='file' name='world'></td>			
			</tr>
                        <tr>
                            <td style="padding:8px;" colspan="4" align="center"><input type='hidden' name='actA' value="doAccuracy"><input type='submit' name="submitA" value='submit'> </td>
                        </tr>
                </table>
                <HR  width="100%" color=#011100 SIZE=2><br>
                <? if (isset($result)){?>
                <table>
                    <?=$resultStr?>
                </table>
                <? } ?>
                </td>
</table>
</body>
</html>