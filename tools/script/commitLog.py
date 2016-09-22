import urllib
import httplib
import base64
import sys

branchName=sys.argv[1]
gameVersion=sys.argv[2]
params='action=commitlog&branchname=%s&gameversion=%s'%(branchName, gameVersion)
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
