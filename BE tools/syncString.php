<?php
require(dirname(__FILE__).'/../../config.php');
include_once(STATSPATH.'gameCoreDefines.php');
include_once(INCPATH.'gameCoreFuncs.php');
include_once(INCPATH.'coreInit.php');
include_once(INCPATH.'GameEventCenter.php');
include_once(MODULESPATH.'/Kabam/Log.php');
include_once(MODULESPATH.'/Utils/Toolbox.php');

require_once(INCPATH . 'memcache/memcache_base.php');
require_once(INCPATH . 'memcache.php');
require_once(INCPATH . 'registry.php');
require(INCPATH . 'registryset.php');

$oDB = DB::getDB('aux');
$sql = "select * from kabamTEString where category='itemName'";
if(!$oDB->query($sql,true))
{
	echo "read string failed";
	exit();
}
$number = $oDB->resultCount();

$arItemName = array();
$ItemNameString = array();
$rule = "/^i\d+$/";
$rule1 = "/^\d+$/";

for($i = 0; $i < $number; $i++)
{
	$row = $oDB->moveNext();
        $ItemNameString['itemId']=$row['title'];
        $ItemNameString['language']=$row['language'];
        $ItemNameString['phrase']=$row['phrase'];
        array_push($arItemName,$ItemNameString);
}
try{
    if(!$oDB->isInTransaction())
    {
	$oDB->beginTransaction();
    }
    
    $sql = "truncate table itemNameString";
    $oDB->query($sql, true);
    $sql = "insert into itemNameString values ";
    foreach($arItemName as $string){
        if(preg_match($rule,$string['itemId'])){
            $itemId = substr($string['itemId'],1);
        }
        /*else if(preg_match($rule1,$string['itemId'])){
            $itemId = $string['itemId'];
        }*/
        else{
            continue;
        }
        $phrase = mysql_escape_string($string['phrase']);
        $sql.="('{$itemId}', '{$string['language']}', '{$phrase}'),";
    }
    $sql=substr($sql,0,-1);
    $oDB->query($sql, true);
    $oDB->commitTransaction();
} catch (Exception $e) {
    $oDB->rollbackTransaction();
    $errMsg = $e->getMessage();
    echo "sync string data failed cause {$errMsg}";
    exit();
}
echo "sync item name string success!!"
?>