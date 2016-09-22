<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class Model_Verify_IPAccess{
    public static $arAllowedIP=array('127.0.0.1','4.59.221.30','208.185.244.250','173.227.63.239','173.227.63.254','12.216.213.194','204.244.60.70');
    
    public static function checkIP($ip){
        $rule="/^(10\.(2[0-4]\d|25[0-5]|[01]?\d\d?)\.(2[0-4]\d|25[0-5]|[01]?\d\d?)\.(2[0-4]\d|25[0-5]|[01]?\d\d?))";
        $rule.="|(66\.162\.159\.(2[0-4]\d|25[0-5]|[01]?\d\d?))$/";
        if(preg_match($rule,$ip)){
            return true;
        }
        if(in_array($ip, self::$arAllowedIP)){
            return true;
        }
        return false;
    }
    public static function AddIP($ip){
        array_push(self::$arAllowedIP,$ip);
    }
    public static function deleteIP($ip){
        foreach(self::$arAllowedIP as $index=>$value){
            if($ip==$value){
                array_splice(self::$arAllowedIP,$index,1);
                return true;
            }
        }
        return false;
    }
}
?>