import paramiko
#import sys
name = 'test'#sys.argv[1]
hostname='10.80.0.207'
username='bchen'

ssh = paramiko.SSHClient()
ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
ssh.connect(hostname=hostname, username=username, password='123456')
ssh.exec_command('rm -rf ls/opt/www/mobile1/cmdev3/fb/ota/kbn/test')
# stdin, stdout, stderr =ssh.exec_command('rm -rf %s'%name)
# print 'rm -rf %s'%name
ssh.exec_command('mkdir /opt/www/mobile1/cmdev3/fb/ota/kbn/test')
ssh.close()