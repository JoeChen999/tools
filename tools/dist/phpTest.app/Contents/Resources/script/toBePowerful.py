import urllib
import httplib
import base64
import sys

params='action=tobepowerful&userid=%s&cityid=%s&url=%s'%(sys.argv[1], sys.argv[2], sys.argv[3])
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
