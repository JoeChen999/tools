import paramiko
import sys
name = sys.argv[1]
hostname='10.80.0.207'
username='bchen'

ssh = paramiko.SSHClient()
ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
ssh.connect(hostname=hostname, username=username, password='123456')
#stdin, stdout, stderr =ssh.exec_command('ls')
#for line in stdout:  
        #print '...' + line.strip('\n')
stdin, stdout, stderr =ssh.exec_command('rm -rf /opt/www/mobile1/cmdev3/fb/ota/kbn/%s'%name)
print 'rm -rf /opt/www/mobile1/cmdev3/fb/ota/kbn/%s'%name
for line in stderr:
        print '...' + line.strip('\n')
stdin, stdout, stderr =ssh.exec_command('mkdir /opt/www/mobile1/cmdev3/fb/ota/kbn/%s'%name)
print 'mkdir /opt/www/mobile1/cmdev3/fb/ota/kbn/%s'%name
for line in stderr:
        print '...' + line.strip('\n')
ssh.close()
