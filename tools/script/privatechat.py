import hashlib
import urllib
from httplib import HTTPConnection
import base64
import time
import json
import sys

player={0:'sdfssaa',1:'v5',2:'amazon83',3:'Prestige1',4:'xcv122',5:'sadd',6:'cwu1',7:'V151',8:'V8',9:'rtyyy'}
naid={0:'23178870',1:'23178803',2:'23179759',3:'23178349',4:'23181127',5:'23178824',6:'23179743',7:'23179691',8:'23179115',9:'23179753',10:'23179754',
      11:'23179756',12:'23179757',13:'23178179',14:'23180088',15:'23179813',16:'23179814',17:'23178794',18:'23179828',19:'23179831',20:'23178731'}
name={0:'NewUser-4U',1:'NewUser-55',2:'NewUser-54',3:'NewUser-52',4:'NewUser-51',5:'NewUser-50',6:'NewUser-4Z',7:'NewUser-4Y',8:'NewUser-4X',9:'NewUser-4V',}
name=sys.argv[1]
Host=sys.argv[2]
for i in range(6):
    for j in range(21):
        #if j==20:
 #           s='ctype=3&additionalInfo=&lang=en&name='+name[i]+'&comment=hi&ctypeId=1&nm='+name[i]+'&sid=2&naid=23740614&gcuid=&gcunick=&mobileid=Cb1&platformid=201&become_user_id=&become_password=&debug=1&gver=15.0.1&gameSlot=263&theme=1'
 #       else:
        s='ctype=3&additionalInfo=&lang=en&name='+name+'&comment=hello&ctypeId=1&nm='+name+'&sid=1&naid='+naid[j]+'&gcuid=&gcunick=&mobileid=cb1&platformid=201&become_user_id=&become_password=&debug=1&gver=15.0.1&gameSlot=263&theme=1'
        ts=time.time()*1000
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
         'Host':Host,
         'Connection':'keep-alive',
         'Accept-Encoding':'gzip',
         'Content-Length':len(params),
        }
        #print params
        conn=HTTPConnection(Host)
        conn.request('POST','/ajax/sendChat.php',params,headers)
        #conn.close()
    #time.sleep(3)
    #print i
        result=conn.getresponse()
        data=result.read()
        print data
    #time.sleep(10)
#res=json.loads(data)
#print res['city_unit_count']['c285']
