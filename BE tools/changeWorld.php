<?php
include_once('admincommon.php'); 
global $mDB;
$userId=isset($_REQUEST['userId']) ? $_REQUEST['userId'] : '0';
?>
<html>
<head>
<style>
.header {
font-weight:bold;
font-size:15px;
}
</style>
</head>
<body>
<table>
<tr><td width="190" valign="top">
<?php
printAdminContents();
?>
</td>
<td style="vertical-align:top;">
   <p style="font-size:18px;color:orange;font-weight:bold;">Change World</p>
<?php

if(isset($_REQUEST['worldId'])){
    $worldId=$_REQUEST['worldId'];
    $sql="select kabam_id,gcuid,naid,mobileid from user where userId={$userId}";
    $mDB->query($sql);
    $count=$mDB->resultCount();
    if($count){
        $row=$mDB->movenext();
        $kabam_id=$row['kabam_id'];
        $gcuid=$row['gcuid'];
        $naid=$row['naid'];
        $mobileid=$row['mobileid'];
    }
    else{
        echo "<p style='font-size:18px;color:red'>invalid userId!!</p>";
    }
    $sql="update user set recentServerId={$worldId} where userId={$userId}";
    try{
        $mDB->query($sql);
    }
    catch (Exception $e) {
        $errMsg = $e->getMessage();
        echo "update database failed cause {$errMsg}";
        exit();
    }
    mc_clearBecomePlayerInfo($userId);
    mc_delPlayerWorlds($userId);
    if($kabam_id > 0){
	mc_SignUp_DelSigOfficalUserInfo($kabam_id);
    }
    if(isset($gcuid) && $gcuid > 0){
	mc_delUserInfoByGameCenterId($gcuid);
    }
    mc_delGuestPlayerInfo($mobileid);	
    mc_delUserInfoByNaid($naid);
    echo "<p style='font-size:18px;'>change world succeed,player <b style='color:red'>{$userId}</b> have been changed to world <b style='color:red'>{$worldId}</b></p>";
}
?>