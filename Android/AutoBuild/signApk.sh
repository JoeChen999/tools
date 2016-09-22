#!/usr/bin/expect
spawn jarsigner -verbose -keystore [lindex $argv 0]/client_eclipse/camelot.keystore -storepass kabamandroid -signedjar [lindex $argv 1]/camelot.apk [lindex $argv 1]/camelot_tmp.apk "kingdomofcamelot"
expect "*口令*"
send "kocbattle\r"
expect "*classes.dex*"
interact