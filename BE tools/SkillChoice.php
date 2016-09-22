<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
require_once("admincommon.php");
global $gameMainVer;
$count	=	isset($_REQUEST['count']) ? $_REQUEST['count'] : 1;
$gearId	=	isset($_REQUEST['GearIdInput']) ? $_REQUEST['GearIdInput'] : 0;
if($gearId==0)
{
    $gearId = isset($_REQUEST['GearId']) ? $_REQUEST['GearId'] : 0;
}
$worldId  =  isset($_REQUEST['worlId']) ? $_REQUEST['worldId'] : 1;
$gameMainVer=16;
if(isset($_REQUEST['act']))
{
    $gearSkillGDS	=	GearSkillChoiceGDS::createWithType();
    $gearSkillGDS->setGameVersion($gameMainVer)->setServerId($worldId);
    $data = $gearSkillGDS->getGDS();
    $result = array();
    for($i=1;$i<5;$i++)
    {
        $strSkill=$data['data'][$gearId]['1']['0']["skill_".$i];
        $skills =  explode("_", $strSkill);
        $skillnum = count($skills);
        if($skillnum==0)
        {
            $result['error']="error in GDS gearId-{$gearId} slot{$i}";
        }
        $skillRateNum = 0;
        $tmpSkill=array();
        foreach($skills as $skill)
        {
            $skillInfo = explode(":",$skill);
            if(count($skillInfo)!=2)
            {
                $result['error']="error in GDS gearId-{$gearId} slot{$i}";
            }
            $skillId = $skillInfo[0];
            $skillRate= $skillInfo[1];
            $skillRateNum += $skillInfo[1];
            $tmpSkill[$skillId]=$skillRate;
        }
        foreach($tmpSkill as $skillId=>$skillRate)
        {
            $result[$i][$skillId]=$tmpSkill[$skillId]/$skillRateNum;
        }
    }
    $expectTable="";
    $expectTable .= "<table border='2'>";
    $expectTable .= "<tr><th style=\"color:red\">slot</th><th style=\"color:red\">ID</th><th style=\"color:red\">Rate</th>";
    foreach($result as $slot=>$skills)
    {
        $expectTable .= "<tr>";
        $expectTable .= "<td>{$slot}</td>";
        $expectTable .= "<td>";
        $expectTable .= "<table>";
        foreach($skills as $id=>$rate)
        {
            $expectTable .="<tr>";
            $expectTable .="<td>{$id}</td>";
            $expectTable .="</tr>";
        }
        $expectTable .= "</table>";
        $expectTable .= "</td>";
        $expectTable .= "<td>";
        $expectTable .= "<table>";
        foreach($skills as $id=>$rate)
        {
            $expectTable .="<tr>";
            $expectTable .="<td>{$rate}</td>";
            $expectTable .="</tr>";
        }
        $expectTable .= "</table>";
        $expectTable .= "</td>";
        $expectTable .= "</tr>";
    }
    $expectTable .= "</table>";
    if(!empty($result)&&!isset($result['error']))
    {
        require_once(INCPATH . 'model/gear/gear.php');
        $skillcount = array();
        foreach ($result as $slot => $skill)
        {
            foreach($skill as $id=>$rate)
            {
                $skillcount[$slot][$id]=0;
            }
        }
        $Ids = array();
        for ($i=1;$i<5;$i++)
        {
            $Ids[$i]=array_keys($skillcount[$i]);
        }
        for($n=0;$n<$count;$n++)
        {
            $gear=new GearModel(1, 1);
            $arSkill=$gear->makeNewRandomGear($gearId);
            foreach($arSkill as $slot=>$gainSkill)
            {
                switch ($slot)
                {
                    case "skill1":
                        $slotId=1;
                        break;
                    case "skill2":
                        $slotId=2;
                        break;
                    case "skill3":
                        $slotId=3;
                        break;
                    case "skill4":
                        $slotId=4;
                        break;
                }
                if(in_array($gainSkill, $Ids[$slotId]))
                {
                    $skillcount[$slotId][$gainSkill] += 1;
                }
                else
                {
                    array_push($Ids[$slotId],$gainSkill);
                    $skillcount[$slotId][$gainSkill]=0;
                }
            }
        }
        $modelRate=array();
        foreach($skillcount as $slot =>$skills)
        {
            foreach($skills as $skill => $scount)
            {
                $modelRate[$slot][$skill]=$scount/$count;
            }
        }
        $modelTable="";
        $modelTable .= "<table border='2'>";
        $modelTable .= "<tr><th style=\"color:red\">slot</th><th style=\"color:red\">ID</th><th style=\"color:red\">Rate</th>";
        foreach($modelRate as $slot=>$skills)
        {
            $modelTable .= "<tr>";
            $modelTable .= "<td>{$slot}</td>";
            $modelTable .= "<td>";
            $modelTable .= "<table>";
            foreach($skills as $id=>$rate)
            {
                $modelTable .="<tr>";
                $modelTable .="<td>{$id}</td>";
                $modelTable .="</tr>";
            }
            $modelTable .= "</table>";
            $modelTable .= "</td>";
            $modelTable .= "<td>";
            $modelTable .= "<table>";
            foreach($skills as $id=>$rate)
            {
                $modelTable .="<tr>";
                $modelTable .="<td>{$rate}</td>";
                $modelTable .="</tr>";
            }
            $modelTable .= "</table>";
            $modelTable .= "</td>";
            $modelTable .= "</tr>";
        }
        $modelTable .= "</table>";
    }
    if(count($modelRate)>count($result))
    {
        $variance="unexpected item appears" ;
    }
    else {
        $variance="0";
        $numskill="0";
        foreach($result as $slot=>$skill)
        {
            foreach($skill as $id => $rate)
            {
                $dvalue= $result[$slot][$id]-$modelRate[$slot][$id];
                $variance+=$dvalue*$dvalue;
            }
            $numskill+=count($skill);
        }
        $variance=$variance/$numskill;
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
                                        <td bgcolor="#efefef" style="padding:4px; margin:4px;">Gear Id</td>
                                        <td bgcolor="#efefef" style="padding:4px; margin:4px;">
                                            <input type='input' name='GearIdInput'>
                                            <select name='GearId' id='GearId'>
                                                <?
                                                    $gearBaseGDS	=	GearGDS::createWithType();
                                                    $gearBaseGDS->setGameVersion(15)->setServerId(SERVER);
                                                    $gearBaseData	=	$gearBaseGDS->getGDS();
                                                    foreach($gearBaseData['data'] as $gearType => $v){
                                                            $gearList[$gearType]	=	$gearType;
                                                    }
                                                    foreach($gearList as $k => $v){
                                                            echo("<option value='{$v}'>Gear - {$k}</option>");
                                                    }
                                                ?>
                                            </select>
                                        </td>
                                </tr>
                                
                                <tr>
                                        <td bgcolor="#efefef" style="padding:4px; margin:4px;">World Id</td>
                                        <td bgcolor="#efefef" style="padding:4px; margin:4px;"><input type='input' name='WorldId'></td>			
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
