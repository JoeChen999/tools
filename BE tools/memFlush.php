<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
require_once '/opt/www/mobile1/'.$argv[1].'/config/storage_config.php';
$Nodes = $arGameConfig['memcache']["arMemcacheServerNodes"];
foreach($Nodes as $Node=>$arMc)
{
    foreach($arMc as $mc=>$data)
    {
        $port=$data[1];
        $mem_obj = memcache_connect('localhost',$port);
        memcache_flush($mem_obj);
    }
    echo 'memcache about '.$Node." has been flushed\n";
}
?>
