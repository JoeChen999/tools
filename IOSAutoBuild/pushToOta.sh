#!/usr/bin/expect
spawn scp [lindex $argv 0].ipa bchen@10.80.0.207:/opt/www/mobile1/cmdev3/fb/ota/kbn/[lindex $argv 1]/
expect "*yes/no*" {send "yes\r"; expect "*password*" {send "123456\r"}} \
        "*password*" {send "123456\r"}
expect "*100%*"
spawn scp [lindex $argv 0].plist bchen@10.80.0.207:/opt/www/mobile1/cmdev3/fb/ota/kbn/[lindex $argv 1]/
expect "*yes/no*" {send "yes\r"; expect "*password*" {send "123456\r"}} \
        "*password*" {send "123456\r"}
expect "*100%*"
interact
