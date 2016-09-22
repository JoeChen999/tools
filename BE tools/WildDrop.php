<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
require_once('admincommon.php');
require_once(INCPATH . 'model/gear/require_gear.php');
$count	=	isset($_REQUEST['count']) ? $_REQUEST['count'] : 1;
$tileId	=	isset($_REQUEST['tileId']) ? $_REQUEST['tileId'] : 11;
$tileLevel =    isset($_REQUEST['tileLevel']) ? $_REQUEST['tileLevel'] : 1;
if(isset($_REQUEST['act']))
{
    $gdsData  = GearDropGDS::createWithType()->setServerId($serverId, $changeServer = true)->setGameVersion($gameMainVer)->getWeight();
    $items=$gdsData['data'][$tileId][$tileLevel-1]['items'];
    $result=array();
    $tweight=0;
    foreach($items as $itemId=>$info)
    {
        $tweight+=$info['weight'];
    }
    foreach($items as $itemId=>$info)
    {
        $result[$itemId]=$info['weight']/$tweight;
    }
    $expectTable="";
    $expectTable .= "<table border='2'>";
    $expectTable .= "<tr><th style=\"color:red\">ID</th><th style=\"color:red\">Rate</th>";
    foreach($result as $id=>$rate)
    {
        $expectTable .="<tr>";
        $expectTable .="<td>$id</td>";
        $expectTable .="<td>$rate</td>";
        $expectTable .="</tr>";
    }
    $expectTable .= "</table>";
    if(isset($result))
    {
        $report=array();
        $modelCount=array();
        foreach($result as $k=>$v)
        {
            $modelCount[$k]=0;
        }
        $Ids=array_keys($modelCount); 
        for($i=0;$i<$count;$i++)
        {
           $gearInfo   = GearDrop::combatDropGearChestToUser($tileId,$tileLevel,4,1,$report);
           if(empty($gearInfo))
           {
               $gearInfo["0"]=1;
           }
           $dropId="";
           foreach($gearInfo as $id=>$qty)
           { 
               $dropId=substr($id,1,strlen($id));
           }
           
           if(in_array($dropId, $Ids))
           {
               $modelCount[$dropId]+=1;
           }
           else
           {
               array_push($Ids, $dropId);
               $modelCount[$dropId]=1;
           }
        }
        $modelData=array();
        foreach($modelCount as $id=>$num)
        {
            $modelData[$id]=$num/$count;
        }
        $modelTable="";
        $modelTable .= "<table border='2'>";
        $modelTable .= "<tr><th style=\"color:red\">ID</th><th style=\"color:red\">Rate</th>";
        foreach($modelData as $id=>$rate)
        {
            $modelTable .="<tr>";
            $modelTable .="<td>$id</td>";
            $modelTable .="<td>$rate</td>";
            $modelTable .="</tr>";
        }
        $modelTable .= "</table>";
    }
    if(count($modelData)>count($result))
    {
        $variance="unexpected item appears" ;
    }
    else {
        $variance="0";
        foreach($result as $id=>$rate)
        {
            $dvalue= $result[$id]-$modelData[$id];
            $variance+=$dvalue*$dvalue;
        }
        $variance=$variance/count($result);
    }
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
		<p style="font-size:18px;color:orange;font-weight:bold;">Kabam <span style="margin-left:10px;font-weight:normal;color:#275;">Random Rate Test</span></p>		
		<table border="2">
			<tr>
			
				<td bgcolor="#efefef" style="padding:8px; margin:8px;"> <a href='RateTest.php'>MysteryChest</a></td>
				
				<td bgcolor="#efefef" style="padding:8px; margin:8px;"> <a href='WildDrop.php'>Wild drop</a> </td>
				
				<td bgcolor="#efefef" style="padding:8px; margin:8px;"> <a href='SkillChoice.php'>skill Choice</a> </td>
				
                                <td bgcolor="#efefef" style="padding:8px; margin:8px;"> <a href='heroDrop.php'>hero explore drop</a> </td>
			</tr>
		</table>
		
		<HR  width="100%" color=#007500 SIZE=2><br>
                <table>
                    <tr>
                        <td>
                        <table border="2">
                        <form name='form1' action="" method="post">
                                <tr>
                                        <td bgcolor="#efefef" style="padding:4px; margin:4px;">Count</td>
                                        <td bgcolor="#efefef" style="padding:4px; margin:4px;"><input type='input' name='count'></td>			
                                </tr>

                                <tr>
                                        <td bgcolor="#efefef" style="padding:4px; margin:4px;">Tile Id</td>
                                        <td bgcolor="#efefef" style="padding:4px; margin:4px;">
                                            <select name='tileId' id='tileId'>
                                                <option value='10'>Grassland</option>
                                                <option value='11'>Lake</option>
                                                <option value='20'>Woods</option>
                                                <option value='30'>Hill</option>
                                                <option value='40'>Mountain</option>
                                                <option value='51'>picts</option>
                                            </select>
                                        </td>
                                </tr>
                                
                                <tr>
                                        <td bgcolor="#efefef" style="padding:4px; margin:4px;">Tile level</td>
                                        <td bgcolor="#efefef" style="padding:4px; margin:4px;"><input type='input' name='tileLevel'></td>			
                                </tr>
                                
                                <tr>
                                        <td style="padding:8px;" colspan="4"> <input type='hidden' name='act' value="doQuery"><input type='submit' value='submit'> </td>	
                                </tr>				
                                </form>
                        </table>		
                        </td>		
                    </tr>
                </table>
                <? if (!empty($result)){ ?>
                    <table>
                        <tr>
                            <th style="padding:4px; margin:4px;">Expect Table</th>
                            <th style="padding:4px; margin:4px;">Model Table</th>
                        </tr>
                        <tr>
                            <td style="padding:4px; margin:4px;"><?=$expectTable?></td>
                            <td style="padding:4px; margin:4px;"><?=$modelTable?></td>
                        </tr>
                    </table>
                    <table>
                        <tr>
                            <td style = "font-family:arial;color:red;font-size:20px;">variance=</td>
                            <td style = "font-family:arial;color:red;font-size:20px;"><?=$variance?></td>
                        </tr>
                    </table>
                 <? } ?>	
        </td>
</tr>
</table>
</body>
</html>