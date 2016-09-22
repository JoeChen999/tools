# -*- coding: utf-8 -*-

import httplib
import urllib
import hashlib
import base64
import time
import json
import readconfig

def getdata(pname):
    data=readconfig.ReadConfig("./conf/db_config.ini").get("baseconf", pname)
    return data
    
def generateParams(data):
    data=data.toUtf8()
    ts=time.time()*1000
    gamenumber=int(ts)
    s=data+'&gameNumber='+str(gamenumber)
    items=s.split(u'&')
    tmpArray={}
    for item in items:
        key =item.split('=')[0]
        value=item.split('=')[1]
        tmpArray[key]=value
    keys=tmpArray.keys()
    keys.sort()
    i=0
    for skey in keys:
        if i==0:
            s1=skey+'='+tmpArray[skey]
        else:
            s1=s1+'&'+skey+'='+tmpArray[skey]
        i=i+1
    s1=s1.toLower()
    s2=s1+'20f6e2f8769fb66faf7e7daccf9d342e'
    h=hashlib.md5()
    h.update(s2)
    gamekey=h.hexdigest()
    paramdata=s+'&gameKey='+gamekey
    #paramdata=param.toUtf8()
    b64data=base64.b64encode(paramdata)
    if b64data[len(b64data)-2]=='=':
        b64data=b64data[:len(b64data)-2]+'%3d%3d'
    elif b64data[len(b64data)-1]=='=':
        b64data=b64data[:len(b64data)-1]+'%3d'
    return b64data
    
