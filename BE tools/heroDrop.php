<?php
echo "<pre>";
include("admincommon.php");
if(isset($_REQUEST['act']))
{
    $serverId	=	isset($_REQUEST['serverId']) ? $_REQUEST['serverId'] : 1;
    /*
    $heroId	   =	isset($_REQUEST['heroId']) ? $_REQUEST['heroId'] : 101;
    */
    $speed  =    isset($_REQUEST['speed']) ? $_REQUEST['speed'] : 2;
    $level = isset($_REQUEST['level']) ? $_REQUEST['level'] : 1;
    $unlockedHeros = isset($_REQUEST['unlockedHeros']) ? $_REQUEST['unlockedHeros'] : 101;
    $unlockedHeros = explode(',', $unlockedHeros);
    $count  =    isset($_REQUEST['count']) ? $_REQUEST['count'] : 10;
    /*
    $heroObj = Model_Hero_PlayerHero::getInstance()->setServerId($serverId)->setHero(array('heroId'=>$heroId));
    */
    $resultList=array();
    $detailList=array();
    for($i=0;$i<$count;$i++)
    {
        $detailItem=array();
//        $dropList = Model_Hero_PlayerHeroExtra::getInstance($serverId)->setHero($heroObj)->initGDSInfo()->getExploreDropList(array('speed'=>$speed, 'level'=>$level));
        $dropList = Model_Hero_PlayerHeroExtra::getInstance($serverId)->initGDSInfo()->getExploreDropList(array('speed'=>$speed, 'level'=>$level, 'unlockedHero'=>$unlockedHeros));
        foreach($dropList as $key =>$value)
        {
            $id=$value[0];
            $icount=$value[1];
            $content=$id.' * '.$icount;
            $IDS=array_keys($resultList);
            if(in_array($id, $IDS))
            {
                $resultList[$id]+=$icount;
            }
            else
            {
                $resultList[$id]=$icount;
            }
            array_push($detailItem, $content);
        }
        array_push($detailList, $detailItem);
    }
     $resultTable="";
     $resultTable .= "<table border='2'>";
     $resultTable .= "<tr><th style=\"color:red\">ID</th><th style=\"color:red\">count</th></tr>";
     foreach($resultList as $key => $value)
     {
         $resultTable .="<tr>";
         $resultTable .="<td>$key</td>";
         $resultTable .="<td>$value</td>";
         $resultTable .="</tr>";
     }
     $resultTable .= "</table>";
     $detailTable="";
     $detailTable .= "<table border='2'>";
     $detailTable .= "<tr><th style=\"color:red\">No.</th><th style=\"color:red\">item1</th><th style=\"color:red\">item2</th><th style=\"color:red\">item3</th><th style=\"color:red\">item4</th><th style=\"color:red\">item5</th><th style=\"color:red\">item6</th></tr>";
     foreach($detailList as $key=>$value)
     {
         $detailTable.="<tr><td>$key</td>";
         for($i=0;$i<6;$i++)
         {
             $detailTable.="<td>$value[$i]</td>";
         }
         $detailTable.="</tr>";
     }
     $detailTable.="</table>";
     $result=1;
}
echo "</pre>";
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
                                        <td bgcolor="#efefef" style="padding:4px; margin:4px;">serverId</td>
                                        <td bgcolor="#efefef" style="padding:4px; margin:4px;"><input type='input' name='serverId' value="<?php echo isset($_POST['serverId'])?$_POST['serverId']:'';?>"></td>			
                                </tr>

                                <!--tr>
                                        <td bgcolor="#efefef" style="padding:4px; margin:4px;">hero Id</td>
                                        <td bgcolor="#efefef" style="padding:4px; margin:4px;"><input type='input' name='heroId' value="<?php echo isset($_POST['heroId'])?$_POST['heroId']:'';?>"></td>
                                </tr-->
                                
                                <tr>
                                        <td bgcolor="#efefef" style="padding:4px; margin:4px;">speed</td>
                                        <td bgcolor="#efefef" style="padding:4px; margin:4px;"><input type='input' name='speed' value="<?php echo isset($_POST['speed'])?$_POST['speed']:'';?>"></td>			
                                </tr>
                                <tr>
                                        <td bgcolor="#efefef" style="padding:4px; margin:4px;">level</td>
                                        <td bgcolor="#efefef" style="padding:4px; margin:4px;"><input type='input' name='level' value="<?php echo isset($_POST['level'])?$_POST['level']:'';?>"></td>			
                                </tr>
                                <tr>
                                        <td bgcolor="#efefef" style="padding:4px; margin:4px;">unlocked heros</td>
                                        <td bgcolor="#efefef" style="padding:4px; margin:4px;"><input type='input' name='unlockedHeros' value="<?php echo isset($_POST['unlockedHeros'])?$_POST['unlockedHeros']:'';?>"></td>			
                                </tr>
                                <tr>
                                        <td bgcolor="#efefef" style="padding:4px; margin:4px;">count</td>
                                        <td bgcolor="#efefef" style="padding:4px; margin:4px;"><input type='input' name='count' value="<?php echo isset($_POST['count'])?$_POST['count']:'';?>"></td>			
                                </tr>
                                <tr>
                                        <td style="padding:8px;" colspan="2" align="center"> <input type='hidden' name='act' value="doQuery"><input type='submit' value='submit'> </td>	
                                </tr>				
                                </form>
                        </table>		
                        </td>		
                    </tr>
                </table>
                <? if (!empty($result)){ ?>
                    <table>
                        <tr>
                            <td style="padding:4px; margin:4px;"><?=$resultTable?></td>
                        </tr>
                    </table>
                    <span  align="center" style="font-size:18px;font-weight:bold;">
                            <a href='#' class='main' onclick='parentNode.getElementsByTagName("div")[0].style.display=="none"?parentNode.getElementsByTagName("div")[0].style.display="block":parentNode.getElementsByTagName("div")[0].style.display="none";'>check details</a>
                                <div style='display:none;'><?=$detailTable?></div>
                    </span>
                 <? } ?>	
        </td>
</tr>
</table>
</body>
</html>
