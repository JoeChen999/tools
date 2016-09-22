import urllib
import httplib
import base64
import sys

allowedServer=['cmqa1', 'cmqa2', 'cmqa3', 'cmdev1', 'cmdev2', 'cmdev3', 'cmdev4', 'cmdev5', 'cmdev6']
if sys.argv[1] =='':
    print  'please input a mobileId'
elif sys.argv[2] in allowedServer:
    params='action=makeRole&mid='+sys.argv[1]+'&server='+sys.argv[2]
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
else :
    print  'error sever'
