import hashlib
import urllib
import httplib
import base64
import time
import json
import sys

cityId=sys.argv[1]
naid=sys.argv[2]
loops=int(sys.argv[3])
host=sys.argv[4]

for i in range(loops):
    j=i%2
    if j==0:
        if i%3==0:
            s='cid=1613&type=1&quant=1&items=0&tid=1323&naid=23740614&gcuid=&gcunick=&mobileid=cb1&platformid=201&become_user_id=&become_password=&debug=1&gver=16.0.15&gameSlot=103&theme=1'
        else:
            s='cid=1613&state=0&naid=23740614&gcuid=&gcunick=&mobileid=cb1&platformid=201&become_user_id=&become_password=&debug=1&gver=16.0.15&gameSlot=93&theme=1'        
        
    else:
        if i%3==0:
            s='cid='+cityId+'&type=1&quant=1&items=0&tid=1323&naid='+naid+'&gcuid=&gcunick=&mobileid=Cb1&platformid=201&become_user_id=&become_password=&debug=1&gver=16.0.15&gameSlot=103&theme=1'
        else:
            s='cid='+cityId+'&state=0&naid='+naid+'&gcuid=&gcunick=&mobileid=Cb1&platformid=201&become_user_id=&become_password=&debug=1&gver=16.0.15&gameSlot=93&theme=1'
    
    ts=time.time()
    gamenumber=int(ts)
    s=s+'&gameNumber='+str(gamenumber)
    items=s.split('&')
    tmpArray={}
    for item in items:
        key=item.split('=')[0]
        value=item.split('=')[1]
        tmpArray[key]=value
    keys=tmpArray.keys()
    keys.sort()
    k=0
    for skey in keys:
        if k==0:
           s1=skey+'='+tmpArray[skey]
        else:
            s1=s1+'&'+skey+'='+tmpArray[skey]
        k=k+1
    s1=s1.lower()
    #print s1
    s2=s1+'20f6e2f8769fb66faf7e7daccf9d342e'
    h=hashlib.md5()
    h.update(s2)
    gamekey=h.hexdigest()
    data=s+'&gameKey='+gamekey
    b64data=base64.b64encode(data)
    #print b64data
    if b64data[len(b64data)-2]=='=':
        b64data=b64data[:len(b64data)-2]+'%3d%3d'
    elif b64data[len(b64data)-1]=='=':
        b64data=b64data[:len(b64data)-1]+'%3d'
    params='data='+b64data+'&vcs=15.0.1'
    headers={'Content-Type':'application/x-www-form-urlencoded',
                    'User-Agent':'Dalvik/1.6.0 (Linux; U; Android 4.1.2; GT-N7100 Build/JZO54K)',
                    'Host':'www2.cmdev7.kabam.asia',
                    'Connection':'keep-alive',
                    'Accept-Encoding':'gzip',
                    'Content-Length':len(params),
                    }
    if j==0:
        headers['Host']='www2.cmqa2.kabam.asia'
        conn=httplib.HTTPConnection('www2.cmqa2.kabam.asia')
    else:
        headers['Host']=host
        conn=httplib.HTTPConnection(host)
    #print params
    if i%3==0:
        conn.request('POST','/ajax/train.php',params,headers)
    else:
        conn.request('POST','/ajax/gate.php',params,headers)
   conn.close()
   print "completed"
#time.sleep(3)
#print i
    #result=conn.getresponse()
    #data=result.read()
    #print data
    #print headers['Host']
