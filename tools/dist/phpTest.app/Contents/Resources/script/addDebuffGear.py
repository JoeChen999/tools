import hashlib
import sys
import urllib
import httplib
import time
import json
import requestforcookie

userId=sys.argv[1]
worldId=sys.argv[2]
url =sys.argv[3]

gearId=['1001006','2001006','3001006','4001006','5001006']
jsonfile=open("./script/gearSkill.txt",'r')
#jsonfile=open("gearSkill.txt",'r')
jdata=jsonfile.read()
res=json.loads(jdata)
debuffSkills=[]
Host='http://'+url
requestforcookie.game_server_url=Host
requestforcookie.init_httpopener_cookie_by_login()
header=requestforcookie.default_header.copy()
header['Host']=url
headers=header.copy()
for skill in res["data"]:
    if skill[:3]=="206" or skill[:3]=="207":
        debuffSkills.append(skill)
i=0
j=0
gearSkill={}
for debuffskill in debuffSkills:
    print debuffskill
    gearSkill[i]=debuffskill
    if i!=3:
        i+=1
    else:
        i=0
        print gearId[j]
        data='userId='+userId+'&server='+worldId+'&gearId='+gearId[j]+'&skill1='+gearSkill[0]+'&skill2='+gearSkill[1]+'&skill3='+gearSkill[2]+'&skill4='+gearSkill[3]+'&act=add'
        headers['Content-Length']=len(data)
        conn=httplib.HTTPConnection(url)
        conn.request('POST','/admin/gearToolsNewGear.php',data,header)
        response=conn.getresponse()
        if j!=4:
            j+=1
        else:
            j=0






