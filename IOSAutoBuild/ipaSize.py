import os,sys
rootPath=sys.argv[1]
mode=sys.argv[2]
version=sys.argv[3]

size=os.path.getsize('%s/client_xcode/Build/%s/%s/Camelot.ipa'%(rootPath, mode, version))
size=size/1000.0
size=size/1000.0
if size>=82:
    mailContent='<p style="color:red;font-size:60px"><font face="Courier New"><b>ipa size=%.1f ,it is greater than 82MB!</b></font></p>'%size
else:
    mailContent='<p style="font-size:20px"><font face="Courier New"><b>ipa size=%.1f</b></font></p>'%size

file=open('/Users/admin/releasenote.txt','r')
content=file.read()
content=content.replace('\n','<br>')
content='<font face="Courier New"><b>'+content+'</b></font>'
file.close()
mailContent+=content
file=open('/Users/admin/releasenote.txt','w')
content=file.write(mailContent)
file.close()
