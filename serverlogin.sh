#!/usr/bin/expect
set timeout 100
spawn ssh dnwu@ssh3.zowie.kabamdco.net
expect "*yes/no*" {send "yes\r"; expect "*password*" {send "wntonh921\r"}} "*password*" {send "wntonh921\r"}
if {[lindex $argv 0]=="beta"} {
	send "ssh r2-4a-app.las02.kabamdco.net\r"
	expect "*yes/no*" {send "yes\r"; expect "*password*" {send "wntonh921\r"}}  "*password*" {send "wntonh921\r"}
	expect "*beta*"
	send "mysql -ukocbattle -pkocbattle! -h10.100.54.15\r"
}
if {[lindex $argv 0]=="delta"} {
	send "ssh r10-22c-app.las02.kabamdco.net\r"
	expect "*yes/no*" {send "yes\r"; expect "*password*" {send "wntonh921\r"}} "*password*" {send "wntonh921\r"}
	expect "*delta*"
	send "mysql -ukocbattle -pkocbattle! -h10.100.91.77\r"
}
if {[lindex $argv 0]=="stage"} {
	send "ssh r3-4d-app.las02.kabamdco.net\r"
	expect "*yes/no*" {send "yes\r"; expect "*password*" {send "wntonh921\r"}} "*password*" {send "wntonh921\r"}
	expect "*stage*"
	send "mysql -ukocbattle -pkocbattle! -h10.100.66.29\r"
}
interact


