<?php
//game config setup
//this function only admin level

$admin_level_req = 2;
require("admincommon.php"); 

if($adminLevel < $admin_level_req)
{
	echo 'You have no right to access this mode';
	exit;	
}
?>

<html>
<head>
<style>
.header {
	font-size:20px;
	font-weight:bold;
}
.actions {
	font-size:10px;
	padding-left:10px;
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
<td style="vertical-align:top;"> <!-- Start Right Column -->
<p style="font-size:18px;color:orange;font-weight:bold;">Kabam <?php echo
$appName;?><br> <span
style="margin-left:10px;font-weight:normal;color:#000;">Player City Fix</span></p>

<?php

$cmd = isset($_REQUEST['cmd']) ? $_REQUEST['cmd'] : '';

switch($cmd)
{       case 'tileIdFix':
                fix_tileId_error();
        break;
    
	case 'fix':
		fix_player_signal_city();
	break;

	case 'view':
		view_player_cities();
	break;

	default:
		show_unnormal_players();
	break;
}
function fix_tileId_error(){
    global $_REQUEST, $serverId, $db;
    
    if(isset($_REQUEST['s']))
    {
        $serverId = isset($_REQUEST['s']) ? $_REQUEST['s'] : 1;
        $db = instantiateDB();
    }
    
    $playerId = isset($_REQUEST['playerId']) ? $_REQUEST['playerId'] : '';
    $cityId = isset($_REQUEST['cityId']) ? $_REQUEST['cityId'] : '';
    $errTileId = isset($_REQUEST['errTileId']) ? $_REQUEST['errTileId'] : '';
    if(!is_numeric($playerId) || $playerId <= 0)
    {
	echo "Invalid player id";
	exit();
    }
    if(!is_numeric($cityId) || $cityId <= 0)
    {
        echo "Invalid city id";
        exit();
    }
    
    $sql = "select tileId from city where cityUserId = {$playerId}";
    if(!$db->query($sql, true))
    {
        echo "Query player cities failed";
        exit();
    }
    $cityCount = $db->resultCount();
    for($i = 0; $i < $cityCount; $i++)
    {
        $row = $db->moveNext();
        $tileId = $row['tileId'];
        $arCityTile[$i] = $tileId;
    }
    
    $sql = "select tileId from tile where tileUserId = {$playerId} and tileType = 51";
    if(!$db->query($sql, true))
    {
        echo "Query player cities failed";
        exit();
    }
    $tileCount = $db->resultCount();
    if($cityCount!=$tileCount){
        echo "city Count error, can not auto fix, please query userinfo";
        exit();
    }
    $correctedTileId=0;
    for($i = 0; $i < $tileCount; $i++)
    {
        $row = $db->moveNext();
        $tileId = $row['tileId'];
        if(!in_array($tileId,$arCityTile)){
            $correctedTileId = $tileId;
            break;
        }
    }
    if($correctedTileId==0){
        echo "not a tileId error, please query userinfo";
        exit();
    }
    else{
        try{
            $sql = "update city set tileId = {$correctedTileId} where cityId = {$cityId}";
            $db->query($sql, true);
        } catch (Exception $e) {
            echo "update player unnormal city data failed";
            exit();
        }
        try{
            $cityDataObj = cityDataAccessor::getInstance();
            $cityDataObj->forceDeleteFromMemcached(array($playerId => $playerId));
            $cityAcc = new mcCityAccessor();
            $cityAcc->ungetInfo($cityId);
            $playerWildCityAcc = new mcPlayerWildCityAccessor();
            $playerWildCityAcc->ungetInfo($cityId);
            $playerCitiesAcc = new mcPlayerCitiesAccessor();
            $playerCitiesAcc->ungetInfo($playerId);
            $cityWildsAcc = new mcCityWildsAccessor();
            $cityWildsAcc->ungetInfo($cityId);
            $playerWildsAcc = new mcPlayerWildsAccessor();
            $playerWildsAcc->ungetInfo($cityId);
            $arBlockIds = array();
            $playerTileObj = new mcPlayerTilesAccess();
            $arPlayerTiles = $playerTileObj->getInfo($playerId);
            foreach($arPlayerTiles as $sigPlayerTile)
            {
                    $xCoord = $sigPlayerTile['xCoord'];
                    $yCoord = $sigPlayerTile['yCoord'];
                    $tmpBlockId = getTileBlockFromCoords($xCoord + 1, $yCoord + 1);
                    $arBlockIds[] = $tmpBlockId;
            }
            if(!empty($arBlockIds))
            {
                    mcClearTileSquareByBlockIds($arBlockIds);
            }
            $playerTileAcc = new mcPlayerTilesAccess();
            $playerTileAcc->ungetInfo($playerId);
        }catch (Exception $e) {
            echo "flush memcache failed";
            exit();
        }
        echo "UPDATE player: {$playerId} unnormal city: {$cityId} success.";
    }
}

//fix signal city
function fix_player_signal_city() {
	global $_REQUEST, $serverId, $db;

	if(isset($_REQUEST['s']))
	{
		$serverId = isset($_REQUEST['s']) ? $_REQUEST['s'] : 1;
		$db = instantiateDB();
	}

	$playerId = isset($_REQUEST['playerId']) ? $_REQUEST['playerId'] : '';
	$cityId = isset($_REQUEST['cityId']) ? $_REQUEST['cityId'] : '';
	$isDelOpt = isset($_REQUEST['del']) ? $_REQUEST['del'] : false;

	if(!is_numeric($playerId) || $playerId <= 0)
	{
		echo "Invalid player id";
		exit();
	}

	if(!is_numeric($cityId) || $cityId <= 0)
	{
		echo "Invalid city id";
		exit();
	}


	//check city is really unnormal
	//the rule is current city at least have 2 city
	//and the assigned city id big than old, and tile id is 0
	$sql = "select * from city where cityUserId = {$playerId} order by cityId";

	if(!$db->query($sql, true))
	{
		echo "Query player cities failed";
		exit();
	}

	$number = $db->resultCount();

	if($number <= 1)
	{
		//no any unnormal city
		echo "Player have no any unnormal cities";
		exit();
	}

	$arPlayerCity = array();

	for($i = 0; $i < $number; $i++)
	{
		$row = $db->moveNext();

		$tmpCityId = $row['cityId'];
		$tmpCityTileId = $row['tileId'];

		$arPlayerCity[$tmpCityId] = $tmpCityTileId;
	}

	if($isDelOpt)
	{
		//del unnormal city
		$cityNo = 1;
		$cityTileId = 0;
		foreach($arPlayerCity as $tmpCityId => $tmpCityTileId)
		{
			if($tmpCityId == $cityId)
			{
				$cityTileId = $tmpCityTileId;
				break;
			}
			$cityNo++;
		}

		if($cityNo == 1)
		{
			echo "City first city, can't be delete";
			exit();
		}

		//how know player have real second city??
		//base on tile id is empty?
		if($cityTileId > 0)
		{
			//city have tile, can't be deleted
			echo "City have tile, can't be deleted";
			exit();
		}

		//delete assigned city data from world db
		try {

				if(!$db->isInTransaction())
				{
					$db->beginTransaction();
				}
				
				$sql = "delete from city where cityUserId = {$playerId} and cityId = {$cityId}";
				$db->query($sql, true);
			
				$sql = "delete from cityAssets where cityId = {$cityId}";
				$db->query($sql, true);

				$sql = "delete from cityBuildings where cityId = {$cityId}";
				$db->query($sql, true);

				$sql = "delete from cityResearch where cityId = {$cityId}";
				$db->query($sql, true);

				$sql = "delete from cityResourceGathering where cityId = {$cityId}";
				$db->query($sql, true);

				$sql = "delete from cityScouting where cityId = {$cityId}";
				$db->query($sql, true);

				$db->commitTransaction();

		} catch(Exception $e) {
			$db->rollbackTransaction();

			echo "delete player unnormal city data failed";
			exit();
		}
		

		//clear caches
		//clear player city cache
                try{
                    $cityDataObj = cityDataAccessor::getInstance();
                    $cityDataObj->forceDeleteFromMemcached(array($playerId => $playerId));
                    $cityAcc = new mcCityAccessor();
                    $cityAcc->ungetInfo($cityId);
                    $playerWildCityAcc = new mcPlayerWildCityAccessor();
                    $playerWildCityAcc->ungetInfo($cityId);
                    $playerCitiesAcc = new mcPlayerCitiesAccessor();
                    $playerCitiesAcc->ungetInfo($playerId);
                    $cityWildsAcc = new mcCityWildsAccessor();
                    $cityWildsAcc->ungetInfo($cityId);
                    $playerWildsAcc = new mcPlayerWildsAccessor();
                    $playerWildsAcc->ungetInfo($cityId);
                    $arBlockIds = array();
                    $playerTileObj = new mcPlayerTilesAccess();
                    $arPlayerTiles = $playerTileObj->getInfo($playerId);
                    foreach($arPlayerTiles as $sigPlayerTile)
                    {
                            $xCoord = $sigPlayerTile['xCoord'];
                            $yCoord = $sigPlayerTile['yCoord'];
                            $tmpBlockId = getTileBlockFromCoords($xCoord + 1, $yCoord + 1);
                            $arBlockIds[] = $tmpBlockId;
                    }
                    if(!empty($arBlockIds))
                    {
                            mcClearTileSquareByBlockIds($arBlockIds);
                    }
                    $playerTileAcc = new mcPlayerTilesAccess();
                    $playerTileAcc->ungetInfo($playerId);
                }catch (Exception $e) {
                    echo "flush memcache failed";
                    exit();
                }
		echo "Del player: {$playerId} unnormal city: {$cityId} success.";
	}
	else
	{
		//fix unnormal city, normally is tile problem???
	}
}



//view signal player cities
function view_player_cities() {
	global $_REQUEST, $serverId, $db;

	if(isset($_REQUEST['s']))
	{
		$serverId = isset($_REQUEST['s']) ? $_REQUEST['s'] : 1;
		$db = instantiateDB();
	}

	$playerId = isset($_REQUEST['playerId']) ? $_REQUEST['playerId'] : '';

	if(!is_numeric($playerId) || $playerId <= 0)
	{
		echo "Invalid player id";
		exit();
	}

	$sql = "select * from city where cityUserId = {$playerId}";

	if(!$db->query($sql, true))
	{
		echo "Get player cities info failed";
		exit();
	}
        
?>

	<script>
	function fixCity(playerId, cityId, delOpt) {
		if(typeof(playerId) == 'undefined' || playerId == '')
		{
			return;
		}

		if(typeof(cityId) == 'undefined' || cityId == '')
		{
			return;
		}


		var exTip = "Fix";
		if(delOpt == true)
		{
			exTip = "Del";
		}

		if(!confirm('Do you really want ' + exTip + ' this city?'))
		{
			return;
		}

		var url = "/admin/PlayerCityFix.php?cmd=fix&playerId=" + playerId + "&cityId=" + cityId + "&del=" + delOpt;
		window.open(url, '_blank');
	}
	</script>
        <p style="font-size:20px;color:blue">city table</p>
	<table cellpadding=2 border=1>
	<tr>
	<td>City Id</td>
	<td>City Name</td>
	<td>Tile Id</td>
	<td>City User Id</td>
	<td>City Status</td>
	<td>Create Time</td>
	<td>Manage</td>
	</tr>
<?php
	$number = $db->resultCount();
	
	for($i = 0; $i < $number; $i++)
	{
		$row = $db->moveNext();
		
		$cityId = $row['cityId'];
		$cityName = $row['cityName'];
		$tileId = $row['tileId'];
		$cityUserId = $row['cityUserId'];
		$cityStatus = $row['cityStatus'];
		$createdTime = $row['createdTime'];

		echo "<tr><td>{$cityId}</td>";
		echo "<td>{$cityName}</td>";
		echo "<td>{$tileId}</td>";
		echo "<td>{$cityUserId}</td>";
		echo "<td>{$cityStatus}</td>";
		echo "<td>{$createdTime}</td>";

		$manageStr = "&nbsp;&nbsp;";
		if($tileId <= 0)
		{
			//maybe unnormal city?
			$manageStr = "<a href='javascript:fixCity({$playerId}, {$cityId}, true);'>Del City</a> &nbsp;&nbsp; ";
			//$manageStr .= "<a href='javascript:fixCity({$playerId}, {$cityId}, false);'>Fix City</a>";
		}
                echo "<td>{$manageStr}</td>";
	}
?>
        </table>
<?php	   
        $sql = "select * from tile where tileUserId = {$playerId}";
        if(!$db->query($sql, true))
	{
		echo "Get player cities info failed";
		exit();
	}
        $number = $db->resultCount();
	
        $tileTable="<table cellpadding=2 border=1><tr><th>Tile Id</th><th>X Coord</th><th>Y Coord</th><th>tile Type</th>";
        $tileTable.="<th>Tile City Id</th><th>Tile User Id</th><th>Tile Block Id</th></tr>";
	for($i = 0; $i < $number; $i++)
	{
		$row = $db->moveNext();
		$tileId = $row['tileId'];
		$xCoord = $row['xCoord'];
		$yCoord = $row['yCoord'];
		$tileType = $row['tileType'];
		$tileCityId = $row['tileCityId'];
		$tileUserId = $row['tileUserId'];
                $tileBlockId = $row['tileBlockId'];

		$tileTable.="<tr><td>{$tileId}</td>";
		$tileTable.="<td>{$xCoord}</td>";
		$tileTable.="<td>{$yCoord}</td>";
		$tileTable.="<td>{$tileType}</td>";
		$tileTable.="<td>{$tileCityId}</td>";
		$tileTable.="<td>{$tileUserId}</td>";
                $tileTable.="<td>{$tileBlockId}</td></tr>";
	}
        $tileTable.="</table>";
?>
        <br><br>
        <span  align="center" style="font-size:18px;font-weight:bold;">
                            <a href='#' class='main' onclick='parentNode.getElementsByTagName("div")[0].style.display=="none"?parentNode.getElementsByTagName("div")[0].style.display="block":parentNode.getElementsByTagName("div")[0].style.display="none";'>tile Table</a>
                                <div style='display:none;'><?=$tileTable?></div>
                    </span>
<?php
        $sql = "select a.*,b.* from city a,tile b where a.cityUserId = {$playerId} and a.tileId=b.tileId";
        if(!$db->query($sql, true))
	{
		echo "Get player cities info failed";
		exit();
	}
        $number = $db->resultCount();
	
        $relatedTable="<table cellpadding=2 border=1><tr><th>city Id</th><th>city Name</th><th>tile Id</th><th>city User Id</th>";
        $relatedTable.="<th>city Status</th><th>created Time</th><th>x Coord</th><th>y Coord</th><th>tile Type</th><th>tile City Id</th><th>tile User Id</th></tr>";
	for($i = 0; $i < $number; $i++)
	{
		$row = $db->moveNext();
		$cityId = $row['cityId'];
		$cityName = $row['cityName'];
		$tileId = $row['tileId'];
		$cityUserId = $row['cityUserId'];
		$cityStatus = $row['cityStatus'];
		$createdTime = $row['createdTime'];
                $xCoord = $row['xCoord'];
                $yCoord = $row['yCoord'];
                $tileType = $row['tileType'];
                $tileCityId = $row['tileCityId'];
                $tileUserId = $row['tileUserId'];


		$relatedTable.="<tr><td>{$cityId}</td>";
		$relatedTable.="<td>{$cityName}</td>";
		$relatedTable.="<td>{$tileId}</td>";
		$relatedTable.="<td>{$cityUserId}</td>";
		$relatedTable.="<td>{$cityStatus}</td>";
		$relatedTable.="<td>{$createdTime}</td>";
                $relatedTable.="<td>{$xCoord}</td>";
                $relatedTable.="<td>{$yCoord}</td>";
                $relatedTable.="<td>{$tileType}</td>";
                $relatedTable.="<td>{$tileCityId}</td>";
                $relatedTable.="<td>{$tileUserId}</td></tr>";
	}
        $relatedTable.="</table>";
?>
        <br><br>
        <span  align="center" style="font-size:18px;font-weight:bold;">
                            <a href='#' class='main' onclick='parentNode.getElementsByTagName("div")[0].style.display=="none"?parentNode.getElementsByTagName("div")[0].style.display="block":parentNode.getElementsByTagName("div")[0].style.display="none";'>related Table</a>
                                <div style='display:none;'><?=$relatedTable?></div>
                    </span>
<?php
}



//show unnormal player list
function show_unnormal_players() {
	global $_REQUEST, $serverId, $db;
        
        if(isset($_REQUEST['s']))
	{
		$serverId = isset($_REQUEST['s']) ? $_REQUEST['s'] : 1;
		$db = instantiateDB();
	}
        
        $errorTable="<table cellpadding=2 border=1><tr><th>city Id</th><th>city Name</th><th>tile Id</th><th>city User Id</th>";
        $errorTable.="<th>city Status</th><th>created Time</th><th>x Coord</th><th>y Coord</th><th>tile Type</th><th>tile City Id</th><th>tile User Id</th><th>manage</th></tr>";
        $sql="select t1.*,t2.* from city t1,tile t2 where t1.tileId=t2.tileId and t2.tileType=50";
        if(!$db->query($sql, true))
	{
            echo "Get player cities info failed";
            exit();
	}
        $number = $db->resultCount();
        if($number>0){
            for($i = 0;$i < $number;$i++)
            {
                $row = $db->moveNext();
                $cityId = $row['cityId'];
                $cityName = $row['cityName'];
                $tileId = $row['tileId'];
                $cityUserId = $row['cityUserId'];
                $cityStatus = $row['cityStatus'];
                $createdTime = $row['createdTime'];
                $xCoord = $row['xCoord'];
                $yCoord = $row['yCoord'];
                $tileType = $row['tileType'];
                $tileCityId = $row['tileCityId'];
                $tileUserId = $row['tileUserId'];


                $errorTable.="<tr><td>{$cityId}</td>";
                $errorTable.="<td>{$cityName}</td>";
                $errorTable.="<td>{$tileId}</td>";
                $errorTable.="<td>{$cityUserId}</td>";
                $errorTable.="<td>{$cityStatus}</td>";
                $errorTable.="<td>{$createdTime}</td>";
                $errorTable.="<td>{$xCoord}</td>";
                $errorTable.="<td>{$yCoord}</td>";
                $errorTable.="<td>{$tileType}</td>";
                $errorTable.="<td>{$tileCityId}</td>";
                $errorTable.="<td>{$tileUserId}</td>";
                $errorTable.="<td><a href='?cmd=tileIdFix&playerId={$cityUserId}&cityId={$cityId}&errTileId={$tileId}'>auto fix</a></td></tr>";
            }
            $errorTable.="</table>";
        }
        else{
            $errorTable.='<tr><td colspan="12" align="center" style="color:green;font-size:18px">there is no tileId error</td></tr></table>';
        }
?>
        <?=$errorTable?>
<?php        
	$page = isset($_REQUEST['p']) ? $_REQUEST['p'] : 1;
	$rec_per_page = 20;
	$offset = ($page - 1) * $rec_per_page;
?>
	
	<table cellpadding=2>
	<form action="PlayerCityFix.php" method="post">
	<tr><td>
	tvuid: <input type="text" name="playerId" size="20">
	</td><td>
	<input type="hidden" name="cmd" value="view">
	<input type="submit" value="Query">
	<input type="button" value="Refresh" onclick="javascript:window.location='?';">
	</td></tr></form>
	</table>
	
	<br>
	<b>Tips: If player city count exceed he allowed, some city will be
unnormal.</b>
	<br><br>

	<table cellpadding=2 border=1>
	<tr>
	<td>PlayerId</td>
	<td>CityCount</td>
	<td>Manage</td>
	</tr>
<?php
	
	//get suit player list, order by city count desc
	$sql = "select count(*) as totalCity, cityUserId from city group by
cityUserId order by totalCity desc limit {$offset}, {$rec_per_page}";
	
	if(!$db->query($sql, true))
	{
		echo "sql error happend";
		exit();
	}

	$number = $db->resultCount();
	
	for($i = 0; $i < $number; $i++)
	{
		$row = $db->moveNext();

		$cityUserId = $row['cityUserId'];
		$totalCity = $row['totalCity'];

		echo "<tr><td>{$cityUserId}</td>";
		echo "<td>{$totalCity}</td>";
		echo "<td><a href='?cmd=view&playerId={$cityUserId}'>View</a></td>";
		echo "</tr>\n";
	}

	echo "</table>\n";

	if($number == $rec_per_page)
	{
		//have more?
		$url = "<a href='?p=" . ($page + 1) . "'>Next Page</a>";
		echo "<br><br>{$url}";
	}
}

