#!/usr/bin/expect
set timeout 3
spawn ssh bchen@10.80.0.207
expect {
"yes/no" {send "yes\r"; exp_continue}
}
expect "*password*"
send "123456\r"
send "cd /opt/www/mobile1/cmdev3/fb/ota/kbn\r"
send "rm -rf [lindex $argv 1]\r"
send "mkdir [lindex $argv 1]\r"
send "exit\r"
interact

spawn scp [lindex $argv 0]/[lindex $argv 1].apk bchen@10.80.0.207:/opt/www/mobile1/cmdev3/fb/ota/kbn/[lindex $argv 1]
expect {
"yes/no" {send "yes\r"; exp_continue}
}
expect "*password*"
send "123456\r"
interact

spawn scp [lindex $argv 0]/[lindex $argv 1].html bchen@10.80.0.207:/opt/www/mobile1/cmdev3/fb/ota/kbn/[lindex $argv 1]
expect {
"yes/no" {send "yes\r"; exp_continue}
}
expect "*password*"
send "123456\r"
interact

spawn scp [lindex $argv 0]/[lindex $argv 1].json bchen@10.80.0.207:/opt/www/mobile1/cmdev3/fb/ota/kbn/[lindex $argv 1]
expect {
"yes/no" {send "yes\r"; exp_continue}
}
expect "*password*"
send "123456\r"
interact

spawn scp [lindex $argv 0]/[lindex $argv 1].png bchen@10.80.0.207:/opt/www/mobile1/cmdev3/fb/ota/kbn/[lindex $argv 1]
expect {
"yes/no" {send "yes\r"; exp_continue}
}
expect "*password*"
send "123456\r"
interact