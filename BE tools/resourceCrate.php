<?php
require('../_inc/ajaxinit.php');

if (empty($_REQUEST['iid']) || !ctype_digit($_REQUEST['iid']) ||
		empty($_REQUEST['cid']) || !ctype_digit($_REQUEST['cid'])
		){
	echo json_encode(array('ok'=>false, 'error_code'=>0, 'msg'=>'Invalid parameters'));
	exit();
}
$itemId = $_REQUEST['iid'];
$cityId = $_REQUEST['cid'];// city being used from
$cnt = isset($_REQUEST['cnt']) ? $_REQUEST['cnt'] : '1';

if($cnt<1||$cnt>9999){
    echo json_encode(array('ok'=>false, 'error_code'=>0, 'msg'=>'Invalid itemCount'));
    exit();
}
if($cnt>1){
    $batchModel = new Model_BatchUseAndPurchase();
    $batchUse = $batchModel->canBatchUseForItem($itemId);
    if (!$batchUse)
    {
        ajaxExit(array('ok'=>false, 'error_code'=>ERROR_TYPE_UNEXPECTED,'msg'=>'not batch use'));
    }
}

include("../_inc/items.php");

switch($itemId){
 case ITEM_TYPE_INSTANT_RESOURCE0_1:
	 $rtype = 0;
	 $amt = 1000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE0_2:
	 $rtype = 0;
	 $amt = 5000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE0_3:
	 $rtype = 0;
	 $amt = 10000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE0_4:
	 $rtype = 0;
	 $amt = 20000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE0_5:
	 $rtype = 0;
	 $amt = 40000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE0_6:
	 $rtype = 0;
	 $amt = 250000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE0_7:
	 $rtype = 0;
	 $amt = 500000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE1_1:
	 $rtype = 1;
	 $amt = 1000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE1_2:
	 $rtype = 1;
	 $amt = 5000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE1_3:
	 $rtype = 1;
	 $amt = 10000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE1_4:
	 $rtype = 1;
	 $amt = 20000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE1_5:
	 $rtype = 1;
	 $amt = 40000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE1_6:
	 $rtype = 1;
	 $amt = 250000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE1_7:
	 $rtype = 1;
	 $amt = 500000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE2_1:
	 $rtype = 2;
	 $amt = 1000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE2_2:
	 $rtype = 2;
	 $amt = 5000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE2_3:
	 $rtype = 2;
	 $amt = 10000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE2_4:
	 $rtype = 2;
	 $amt = 20000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE2_5:
	 $rtype = 2;
	 $amt = 40000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE2_6:
	 $rtype = 2;
	 $amt = 250000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE2_7:
	 $rtype = 2;
	 $amt = 500000;
	 break;

 case ITEM_TYPE_INSTANT_RESOURCE3_1:
	 $rtype = 3;
	 $amt = 1000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE3_2:
	 $rtype = 3;
	 $amt = 5000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE3_3:
	 $rtype = 3;
	 $amt = 10000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE3_4:
	 $rtype = 3;
	 $amt = 20000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE3_5:
	 $rtype = 3;
	 $amt = 40000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE3_6:
	 $rtype = 3;
	 $amt = 250000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE3_7:
	 $rtype = 3;
	 $amt = 500000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE4_1:
	 $rtype = 4;
	 $amt = 1000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE4_2:
	 $rtype = 4;
	 $amt = 5000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE4_3:
	 $rtype = 4;
	 $amt = 10000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE4_4:
	 $rtype = 4;
	 $amt = 20000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE4_5:
	 $rtype = 4;
	 $amt = 40000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE4_6:
	 $rtype = 4;
	 $amt = 250000;
	 break;
 case ITEM_TYPE_INSTANT_RESOURCE4_7:
	 $rtype = 4;
	 $amt = 500000;
	 break;
 default:
	 ajaxExit(array('ok'=>false, 'error_code'=>ERROR_TYPE_UNEXPECTED));
 }

$amt*=$cnt;


try {
	$db->beginTransaction();
	// getting old events out of the way first in smaller transaction blocks
$updateResult = updatePlayer($tvuid, NULL, $cityId, NULL, array(), false, true); //uses sub-transaction to catch up on old events
if (empty($updateResult)){
		$db->rollbackTransaction();
	ajaxExit(array('ok'=>false, 'error_code'=>ERROR_TYPE_RETRY, 'msg'=>'Unknown error catching up city'));
}


	if (!deductItem($itemId,$cnt)){
		$db->rollbackTransaction();
		$feedback = REQ_TYPE_ITEM."-{$itemId}-0";
		ajaxExit(array('ok'=>false, 'error_code'=>ERROR_TYPE_REQ_NOT_MET, 'msg'=>$feedback));
	}

	$arCost=array(0,0,0,0,0,0,0,0,0,0);
	$arCost[$rtype] = -$amt; // increase is negative cost

	$updateResult = updatePlayer($tvuid, NULL, $cityId, $arCost, array(), false, false, true);
	if (empty($updateResult)){
		$db->rollbackTransaction();
		ajaxExit(array('ok'=>false, 'error_code'=>ERROR_TYPE_RETRY, 'msg'=>'Unknown error catching up city'));
	}
	$db->commitTransaction();

} catch (Exception $e){
	$db->rollbackTransaction();
	ajaxExit(array('ok'=>false, 'error_code'=>ERROR_TYPE_UNEXPECTED));
}
echo json_encode(array('ok'=>true, 'rtype'=>$rtype, 'amt'=>$amt, 'updateSeed'=>$updateResult, 'reqmicrotime'=>"$reqtime", 'resmicrotime'=>''.microtime(true)));
?>
