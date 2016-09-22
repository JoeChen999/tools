#!/usr/bin/expect
set timeout 50
spawn ssh bchen@ssh3.zowie.kabamdco.net
#expect "*yes/no*" {send "yes\r"; expect "*password*" {send "wntonh921\r"}} \
#            "*password*" {send "wntonh921\r"}
expect "*bastion-ssh"
send "ssh r1-34-admin2.las02.kabamdco.net\r"
expect "*yes/no*" {send "yes\r"; expect "*password*" {send "joe232510\r"}} \
            "*password*" {send "joe232510\r"}
expect "*release-rsync"
send "sudo -u kocbattle /home/kocbattle/bin/kocbattlepush.sh [lindex $argv 0] [lindex $argv 1]\r"
expect "*yes/no*" {send "yes\r"; expect "*password*" {send "joe232510\r"}} \
            "*password*" {send "joe232510\r"}
expect "*y/n*"
send "y\r"
expect "*success*"
send "exit\r"
expect "*closed"
send "exit\r"
interact


