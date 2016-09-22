import urllib
import httplib
import base64
import sys

server=sys.argv[1]
params='action=memcache&servername='+server
if server=='cmqa3' or server=='cmqa1':
    host='10.80.0.228:8000'
else:
    host='10.80.0.207:8000'

#host='localhost:8000'
headers={'Content-Type':'application/x-www-form-urlencoded',
         'Host':host,
         'Connection':'keep-alive',
         'Accept-Encoding':'gzip',
         'Content-Length':len(params),
        }
conn=httplib.HTTPConnection(host)
conn.request('POST','',params,headers)
result=conn.getresponse()
date=result.read()
print date
