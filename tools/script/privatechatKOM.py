import hashlib
import urllib
from httplib import HTTPConnection
import base64
import time
import json
import sys

player={0:'sdfssaa',1:'v5',2:'amazon83',3:'Prestige1',4:'xcv122',5:'sadd',6:'cwu1',7:'V151',8:'V8',9:'rtyyy'}
naid={0:'144790555',1:'30250209',2:'30243814',3:'23178647',4:'30284504',5:'30248012',6:'30243815',7:'30254696',8:'30254698',9:'30264159',10:'30264163',
      11:'30264167',12:'30264195',13:'30265396',14:'23456649',15:'30337650',16:'30337647',17:'30337654',18:'30337652',19:'30346618',20:'30346619'}
#mobileId={0:'koc',1:'koc',2:'koc',3:'koc',4:'koc',5:'koc',6:'koc',7:'koc',8:'koc',9:'koc',10:'koc',11:'koc',12:'koc',13:'koc',14:'koc',15:'koc',16:'koc',17:'koc',18:'koc',19:'koc',20:'koc'}
name={0:'NewUser-4U',1:'NewUser-55',2:'NewUser-54',3:'NewUser-52',4:'NewUser-51',5:'NewUser-50',6:'NewUser-4Z',7:'NewUser-4Y',8:'NewUser-4X',9:'NewUser-4V',}
race=[2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2]
comment=['python test','wo ca','private chat','be quite','shut up']
name=sys.argv[1]
loop=sys.argv[2]
Host=sys.argv[3]

for i in range(int(loop)):
  for j in range(21):
        #if j==20:
 #           s='ctype=3&additionalInfo=&lang=en&name='+name[i]+'&comment=hi&ctypeId=1&nm='+name[i]+'&sid=2&naid=23740614&gcuid=&gcunick=&mobileid=Cb1&platformid=201&become_user_id=&become_password=&debug=1&gver=15.0.1&gameSlot=263&theme=1'
 #       else:
        s='ctype=3&additionalInfo=&lang=en&name='+name+'&comment='+comment[(i+j)%5]+'&ctypeId=1&nm='+name+'&sid=1&naid='+naid[j]+'&gcuid=&gcunick=&mobileid=cb1&platformid=201&become_user_id=&become_password=&debug=1&gver=6.1.1&gameSlot=263&race='+str(race[j])+'&newlang=en'
        ts=time.time()*1000
        gamenumber=int(ts)
        s=s+'&gameNumber='+str(gamenumber)
#        items=s.split('&')
#        tmpDict={}
#        for item in items:
#            key=item.split('=')[0]
#            value=item.split('=')[1]
#            tmpDict[key]=value
#        keys=tmpDict.keys()
#        keys.sort()
#        k=0
#        for skey in keys:
#            if k==0:
#               s1=skey+'='+tmpDict[skey]
#            else:
#                s1=s1+'&'+skey+'='+tmpDict[skey]
#            k=k+1
#        s1=s1.lower()
        #print s1
#        s2=s1+'20f6e2f8769fb66faf7e7daccf9d342e'
#        h=hashlib.md5()
#        h.update(s2)
#        gamekey=h.hexdigest()
#        data=s+'&gameKey='+gamekey
#        b64data=base64.b64encode(data)
        #print b64data
#        if b64data[len(b64data)-2]=='=':
#            b64data=b64data[:len(b64data)-2]+'%3d%3d'
#        elif b64data[len(b64data)-1]=='=':
#            b64data=b64data[:len(b64data)-1]+'%3d'
#        params='data='+b64data+'&vcs=8.1.1'
        params=s+'&browser=1&vcs=6.1.1'
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
        #f=f+1
        #print f
    #time.sleep(10)
#res=json.loads(data)
#print res['city_unit_count']['c285']
