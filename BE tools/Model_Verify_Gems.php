<?php

class Model_Verify_Gems {

    CONST VERIFY_STATUS_DEFAULT = 0;
    CONST VERIFY_STATUS_PASSED = 1;
    CONST VERIFY_STATUS_REFUSED = 2;
    CONST VERIFY_STATUS_DELETE = 3;
    CONST LIST_PAGESIZE = 30;
    
    public static function addRecord($requester, $playerId, $gemsCnt) {
        $requesterIP = $_SERVER['REMOTE_ADDR'];
        $verifyStatus = self::VERIFY_STATUS_DEFAULT;
        $createdTime = date('Y-m-d H:i:s');
        DB_Verify_Gems::create($requester, $requesterIP, $playerId, $gemsCnt, $verifyStatus, $createdTime);
    }

    //ids is an array
    public static function verifyRecord($verifyAccount, $verifyStatus, $ids) {     
        $affectedCount = DB_Verify_Gems::update($verifyStatus, $verifyAccount, $ids);
        return $affectedCount;
    }
    
    //ids is an array
    public static function deleteRecord($ids) {
        $affectedCount = DB_Verify_Gems::delete($ids);
        return $affectedCount;
    }

    public static function listAll($page, $pageSize) {
        $condition = array();
        $list = array();
        $page = $page < 1 ? 1 : $page;
        $limit = $pageSize = $pageSize < 1 ? self::LIST_PAGESIZE : $pageSize;
        $totalPage = 0;
        $count = DB_Verify_Gems::getCount($condition);
        if ($count > 0) {
            $totalPage = ceil($count / $pageSize);
            $page = $page > $totalPage ? $totalPage : $page;
            $start = ($page - 1) * $pageSize;
            $list = DB_Verify_Gems::getList($condition, $start, $limit);
        }
        return array('total' => $count, 'data' => $list, 'page'=>$page, 'pageSize'=>$pageSize, 'totalPage'=>$totalPage);
    }

    public static function listByVerifyStatus($verifyStatus, $page, $pageSize) {
        return array();
    }
    
    //ids is an array
    public static function listByIds($ids) {
        $condition = array('`id` IN ('.implode(',', $ids).')');
        $start = 0;
        $limit = count($ids);
        $result = DB_Verify_Gems::getList($condition,$start, $limit);
        $list = array();
        foreach($result as $item) {
            $list[$item['id']] = $item;
        }
        return $list;
    }
    public static function checkPermission($adminId,$permissionName){
        global $devDB;
        $sql = "select {$permissionName} from admin where adminId = {$adminId}";
        $devDB->query($sql);
        $rowCount = $devDB->resultCount();
        if($rowCount){
            $permission=$devDB->moveNext();
            if(!$permission['canVerifyGems']){
                return false;
            }
        }
        return true;
    }
}
