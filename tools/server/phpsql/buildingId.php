<?php
$cityId=$argv[1];
$database=$argv[2];
$con = mysql_connect("10.80.0.209","chinagw","chinagw!");
if (!$con)
{
  die('Could not connect: ' . mysql_error());
}
mysql_select_db($database);
$result = mysql_query("select buildingId from cityBuildings where cityId=".$cityId);
while($row = mysql_fetch_array($result))
{
  echo $row['buildingId']."\n";
}
mysql_close($con);
?>