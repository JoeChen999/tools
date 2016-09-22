<?php

class DB_Verify_Gems {

    const
            TABLE_NAME = 'verifyGemsGranting';

    public static function create($requester, $requesterIP, $playerId, $amount, $verifyStatus, $createdTime) {
        $auxDB = self::getDatabase();
        $sql = "INSERT INTO ".self::TABLE_NAME."(`requester`, `requesterIP`, `playerId`, `gemsCnt`, `verifyStatus`, `createdTime`) "
                . "VALUES('{$requester}', '{$requesterIP}', {$playerId}, {$amount}, {$verifyStatus}, '{$createdTime}');";
        $auxDB->query($sql, true);
    }
    
    //ids is an array
    public static function update($verifyStatus, $verifyAccount, $ids) {
        $auxDB = self::getDatabase();
        $sql = "UPDATE ".self::TABLE_NAME." SET `verifyStatus`={$verifyStatus}, `verifyAccount`='{$verifyAccount}' WHERE `id` IN (".implode(',', $ids).");";
        $auxDB->query($sql, true);
        return $auxDB->affectedCount();
    }
    
    //ids is an array
    public static function delete($ids) {
        $auxDB = self::getDatabase();
        $sql = "DELETE FROM ".self::TABLE_NAME." WHERE `id` IN (".implode(',', $ids).");";
        $auxDB->query($sql, true);
        return $auxDB->affectedCount();
    }
    
    public static function getList($condition, $start, $limit) {
        $auxDB = self::getDatabase();
        $sql = "SELECT * FROM ".self::TABLE_NAME;
        if(!empty($condition)) {
            $sql .= ' WHERE '. implode(' AND ', $condition);
        }
        $sql .= " ORDER BY `id` DESC LIMIT {$start}, {$limit}";
        $auxDB->query($sql);
        $list = array();
        $rowCount = $auxDB->resultCount();
        if($rowCount) {
            for($i=0; $i<$rowCount; $i++) {
                $list[] = $auxDB->moveNext();
            }
        }
        return $list;
    }
    
    public static function getCount($condition) {
        $auxDB = self::getDatabase();
        $sql = "SELECT count(1) AS `cnt` FROM ".self::TABLE_NAME;
        if(!empty($condition)) {
            $sql .= 'WHERE '. implode(' AND ', $condition);
        }
        $auxDB->query($sql);
        $count = 0;
        $rowCount = $auxDB->resultCount();
        if($rowCount) {
            $row = $auxDB->moveNext();
            $count = $row['cnt'];
        }
        return $count;
    }

    public static function getDatabase() {
        $db=  instantiateOtherDB('aux');
        return $db;
    }
    
    public static function getPermission($adminId) {
        $auxDB = self::getDatabase('dev');
        $sql = "select canVerifyGems from admin where adminId = {$adminId}";
        $auxDB->query($sql);
        $rowCount = $auxDB->resultCount();
        echo $rowCount;
        if($rowCount){
            $permission=$auxDB->moveNext();
            echo $permission['canVerifyGems'];
            if($permission['canVerifyGems']){
                return true;
            }
        }
        return false;
    }
}
