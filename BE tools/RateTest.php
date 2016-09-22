<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

require_once('admincommon.php');
set_time_limit(9999); 
$count	=	isset($_REQUEST['count']) ? $_REQUEST['count'] : 1;
$chestIdInput	=	isset($_REQUEST['chestIdInput']) ? $_REQUEST['chestIdInput'] : 0;
if($chestIdInput==0)
{
    $chestId=isset($_REQUEST['chestId']) ? $_REQUEST['chestId'] : 0;
}
else {
    $chestId=$chestIdInput;
}
$isGearChest = 0;
/*$con = mysql_connect("10.80.0.209","chinagw","chinagw!");
if (!$con)
{
  die('Could not connect: ' . mysql_error());
}
mysql_select_db("gw_aux_cmqa3");*/
require_once(INCPATH . 'db/DB_Base.php');

$GearData=  DB_Base::auxQueryOne("select gearDrop from mysteryChestStatus where chestId=".$chestId);
$result=array();
if(!empty($GearData['gearDrop']))
{
    $arGear =  explode(":",$GearData['gearDrop']);
    foreach($arGear as $Gear)
    {
        $gearInfo = explode("-",$Gear);
        if(count($gearInfo)!=2)
        {
            $result['error']="gearChest config error";
        }
        else 
        {
          $gearId=$gearInfo[0];
          $GdropRate=$gearInfo[1]/10;
          $result[$gearId]=$GdropRate;
        }       
    }
    $isGearChest=1;
}
else
{
    $sql = "select loadout1,loadout2,loadout3,loadout4,loadout5,loadout6,loadout7,loadout8,loadout9,loadout10 from mysteryChestStatus where chestId=".$chestId;
    $ItemData = DB_Base::auxQueryOne($sql);
    foreach($ItemData as $loadout=>$data)
    {
        if(!empty($data))    
        {
            $arItem = explode(':',$data);
            foreach($arItem as $Item)
            {
                $ItemInfo=explode("-",$Item);
                if(count($ItemInfo)!=3)
                {
                    $result['error']="mysteryChest config error";
                }
                else
                {
                    $itemId=$ItemInfo[0]."*".$ItemInfo[1];
                    $IdropRate=$ItemInfo[2];
                    $result[$itemId]=$IdropRate;
                }           
            }
        }
    }
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

if(!empty($result)&&!isset($result['error']))
{
    require_once(INCPATH . "MysteryChest.php");

    $chestItem = array();
    foreach($result as $id=>$rate)
    {
        $chestItem[$id]=0;
    }
    $Ids=array_keys($chestItem);

    for($i=0;$i<$count;$i++)
    {
        if($isGearChest)
        {
            require_once(INCPATH . "model/gear/gear_drop.php");
            $gearChest= new ChestGearDrop(1);
            $gainGearId=$gearChest->getDropGearChestId($chestId);
            if(in_array($gainGearId,$Ids))
            {
                $chestItem[$gainGearId]+=1;
            }
            else 
            {
                array_push($Ids,$gainGearId);
                $chestItem[$gainGearId]=1;
            }
        }
        else 
        {
            $chest=new MysteryChest();
            $itemIds = $chest->unpack($chestId);
            foreach($itemIds as $slot=>$item)
            {
                $itemId=$item[0]."*".$item[1];
                if(in_array($itemId, $Ids))
                {
                    $chestItem[$itemId]+=1;
                }
                else
                {
                    array_push($Ids,$itemId);
                    $chestItem[$itemId]=1;
                }
            } 
        }
    }
    $modelRate=array();
    foreach($chestItem as $iid=>$num)
    {
        $modelRate[$iid]=$num/$count;
    }
    $modelTable="";
    $modelTable .= "<table border='2'>";
    $modelTable .= "<tr><th style=\"color:red\">ID</th><th style=\"color:red\">Rate</th>";
    foreach($modelRate as $id=>$rate)
    {
        $modelTable .="<tr>";
        $modelTable .="<td>{$id}</td>";
        $modelTable .="<td>{$rate}</td>";
        $modelTable .="</tr>";
    }
    $modelTable .= "</table>";
    if(count($modelRate)>count($result))
    {
        $variance="unexpected item appears" ;
    }
    else {
        $variance="0";
        foreach($result as $id=>$rate)
        {
            $dvalue= $result[$id]-$modelRate[$id];
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
				<td bgcolor="#efefef" style="padding:4px; margin:4px;">Chest Id</td>
                                <td bgcolor="#efefef" style="padding:4px; margin:4px;">
                                    <input type='input' name='chestIdInput'>
                                    <select name='chestId' id='chestId'>
                                        <?  
                                            $sql ="select chestId from mysteryChestStatus";
                                            $chestIdList = DB_Base::auxQueryAll($sql);
                                            foreach($chestIdList as $k=>$v){
                                                    $v=$v['chestId'];
                                                    echo("<option value='{$v}'>{$v}</option>");
                                            }
                                        ?>
                                    </select>
                                </td>
                                
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
</body>
</html>
