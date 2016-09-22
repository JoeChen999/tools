#!/usr/bin/expect
spawn ssh bchen@10.80.0.207
expect "*yes/no*" {send "yes\r"; expect "*password*" {send "123456\r"}} \
            "*password*" {send "123456\r"}
send "cd /opt/www/mobile1/cmdev3/fb/ota/kbn\r"
send "rm -rf [lindex $argv 0]\r"
send "mkdir [lindex $argv 0]\r"
send "exit\r"
interact


