<?php
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
$env = isset($argv[1]) ? $argv[1] : "cmqa2";
$version = isset($argv[2]) ? $argv[2] : "16.2.0";
$config = "/opt/www/mobile1/" . $env . "/config/storage_config.php";
require_once $config;
$auxHost = $arGameConfig['db']['DBHOSTS']['aux']['m'];
$devHost = $arGameConfig['db']['DBHOSTS']['dev']['m'];
$masterHost = $arGameConfig['db']['DBHOSTS']['master']['m'];
$errHost = $arGameConfig['db']['DBHOSTS']['err']['m'];
$world1Host = $arGameConfig['db']['DBHOSTS']['1']['m'];
$world2Host = $arGameConfig['db']['DBHOSTS']['2']['m'];
$world3Host = $arGameConfig['db']['DBHOSTS']['3']['m'];
$auxDB = $arGameConfig['db']['SERVERS']['aux'];
$devDB = $arGameConfig['db']['SERVERS']['dev'];
$errDB = $arGameConfig['db']['SERVERS']['err'];
$masterDB = $arGameConfig['db']['SERVERS']['master'];
$world1DB = $arGameConfig['db']['SERVERS']['1'];
$world2DB = $arGameConfig['db']['SERVERS']['2'];
$world3DB = $arGameConfig['db']['SERVERS']['3'];
$user = $arGameConfig['db']['SDBLOGIN'];
$password = $arGameConfig['db']['SDBPASS'];
$sqlPath = "/opt/www/mobile1/" . $env . "/fb/initWorld/sql/v" . $version;
//echo $sqlPath;

$resultStr = "";
if (file_exists($sqlPath . "/kbn_aux.sql")) {
    $db = new DBManager($auxHost, $user, $password, $auxDB);
    $db->createFromFile($sqlPath . '/kbn_aux.sql');
    $resultStr.="<tr><td style = \"font-family:arial;color:red;font-size:20px;\">";
    $resultStr.=$sqlPath . '/kbn_aux.sql execute completed on ' . $auxDB . '!</td></tr>';
}

if (file_exists($sqlPath . "/kbn_dev.sql")) {
    $db = new DBManager($devHost, $user, $password, $devDB);
    $db->createFromFile($sqlPath . '/kbn_dev.sql');
    $resultStr.="<tr><td style = \"font-family:arial;color:red;font-size:20px;\">";
    $resultStr.=$sqlPath . '/kbn_dev.sql execute completed on ' . $devDB . '!</td></tr>';
}

if (file_exists($sqlPath . "/kbn_err.sql")) {
    $db = new DBManager($errHost, $user, $password, $errDB);
    $db->createFromFile($sqlPath . '/kbn_err.sql');
    $resultStr.="<tr><td style = \"font-family:arial;color:red;font-size:20px;\">";
    $resultStr.=$sqlPath . '/kbn_err.sql execute completed on ' . $errDB . '!</td></tr>';
}

if (file_exists($sqlPath . "/kbn_master.sql")) {
    $db = new DBManager($masterHost, $user, $password, $masterDB);
    $db->createFromFile($sqlPath . '/kbn_master.sql');
    $resultStr.="<tr><td style = \"font-family:arial;color:red;font-size:20px;\">";
    $resultStr.=$sqlPath . '/kbn_master.sql execute completed on ' . $masterDB . '!</td></tr>';
}

if (file_exists($sqlPath . "/kbn_world.sql")) {
    $db = new DBManager($world1Host, $user, $password, $world1DB);
    $db->createFromFile($sqlPath . '/kbn_world.sql');
    $resultStr.="<tr><td style = \"font-family:arial;color:red;font-size:20px;\">";
    $resultStr.=$sqlPath . '/kbn_world.sql execute completed on ' . $world1DB . '!</td></tr>';
    $db = new DBManager($world2Host, $user, $password, $world2DB);
    $db->createFromFile($sqlPath . '/kbn_world.sql');
    $resultStr.="<tr><td style = \"font-family:arial;color:red;font-size:20px;\">";
    $resultStr.=$sqlPath . '/kbn_world.sql execute completed on ' . $world2DB . '!</td></tr>';
    $db = new DBManager($world3Host, $user, $password, $world3DB);
    $db->createFromFile($sqlPath . '/kbn_world.sql');
    $resultStr.="<tr><td style = \"font-family:arial;color:red;font-size:20px;\">";
    $resultStr.=$sqlPath . '/kbn_world.sql execute completed on ' . $world3DB . '!</td></tr>';
}
echo $resultStr;
?>
