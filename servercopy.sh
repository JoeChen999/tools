#!/usr/bin/expect
set timeout 100
spawn ssh dnwu@ssh3.zowie.kabamdco.net
expect "*yes/no*" {send "yes\r"; expect "*password*" {send "wntonh921\r"}} "*password*" {send "wntonh921\r"}
send "rm *.sql\r"
send "exit\r"
interact
spawn scp kbn_world.sql kbn_dev.sql kbn_dev.data.sql kbn_master.sql kbn_aux.sql kbn_log.sql dnwu@ssh3.zowie.kabamdco.net:~
expect "*yes/no*" {send "yes\r"; expect "*password*" {send "wntonh921\r"}} "*password*" {send "wntonh921\r"}
interact
spawn ssh dnwu@ssh3.zowie.kabamdco.net
expect "*yes/no*" {send "yes\r"; expect "*password*" {send "wntonh921\r"}} "*password*" {send "wntonh921\r"}
if {[lindex $argv 0]=="beta"} {
	send "scp *.sql r2-4a-app.las02.kabamdco.net:~\r"
	expect "*yes/no*" {send "yes\r"; expect "*password*" {send "wntonh921\r"}}  "*password*" {send "wntonh921\r"}
}
if {[lindex $argv 0]=="delta"} {
	send "scp *.sql r10-22c-app.las02.kabamdco.net:~\r"
	expect "*yes/no*" {send "yes\r"; expect "*password*" {send "wntonh921\r"}} "*password*" {send "wntonh921\r"}
}
if {[lindex $argv 0]=="stage"} {
	send "ssh *.sql r3-4d-app.las02.kabamdco.net:~\r"
	expect "*yes/no*" {send "yes\r"; expect "*password*" {send "wntonh921\r"}} "*password*" {send "wntonh921\r"}
}
interact


