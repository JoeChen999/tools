import hashlib
import sys
import urllib
import httplib
import time
import json
import requestforcookie

gearId=['1001001','2001001','3001001','4001001','5001001','1001002','2001002','3001002','4001002','5001002','1001003','2001003','3001003','4001003','5001003', '1001004','2001004','3001004','4001004','5001004','1001005','2001005','3001005','4001005','5001005','1001006','2001006','3001006','4001006','5001006', 
              '1051002', '2051002','3051002', '4051002', '5051002', '1051003', '2051003', '3051003', '4051003', '5051003', '1051103', '1052002', '2052002', '3052002'
              , '4052002', '5052002', '1051001', '2051001', '3051001', '4051001', '5051001', '1051005', '2051005', '3051005', '4051005', '5051005', '1051101', '2051101'
              , '3051101', '4051101', '5051101','1051201', '2051201', '3051201', '4051201', '5051201','1051203', '2051203', '3051203', '4051203', '5051203','1051303', '2051303', '3051303', '4051303', '5051303']
userId=sys.argv[1]
worldId=sys.argv[2]
if len(sys.argv)==4:
    loops=1
    url=sys.argv[3]
else:
    loops=int(sys.argv[3])
    url=sys.argv[4]

Host='http://'+url
requestforcookie.game_server_url=Host
requestforcookie.init_httpopener_cookie_by_login()
header=requestforcookie.default_header.copy()
header['Host']=url
headers=header.copy()

for j in range(loops):
    for i in range(len(gearId)):
        data='userId='+userId+'&server='+worldId+'&gearId='+gearId[i]+'&skill1=&skill2=&skill3=&skill4=&act=add'
        headers['Content-Length']=len(data)
        conn=httplib.HTTPConnection(url)
        conn.request('POST','//admin/gearToolsNewGear.php',data,header)
        
        result=conn.getresponse()
    #data=result.read()
    #print data
print 'add success to user(%s)&server(%s)'%(userId,worldId)
