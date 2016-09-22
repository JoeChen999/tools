import hashlib
import sys
import urllib
import httplib
import time
import json
import requestforcookie

userId=sys.argv[1]
serverId=sys.argv[2]
count=sys.argv[3]
url=sys.argv[4]

Host='http://'+url
requestforcookie.game_server_url=Host
requestforcookie.init_httpopener_cookie_by_login()
header=requestforcookie.default_header.copy()
header['Host']=url
print header['Cookie']
headers=header.copy()
params='action=saveMulti&userid=%s'%userId

conn=httplib.HTTPConnection(url)
conn.request('GET','/admin/manageDownGds.php?type=Hero_RenownItem&serverid=%s'%serverId,'',header)
GDS=conn.getresponse().read()
items=GDS.split('\n')

i=0
for line in items:
    if i!=0 and i!=1 and line!='':
        item=line.split(',')
        min=int(item[1])
        max=int(item[2])+1
        itemRange=range(min, max)
        for itemId in itemRange:
            itemId=str(itemId)
            params+='&saveValue%%5B%%5D=%s%%7C%s'%(itemId, count)
    i+=1
conn.request('POST', '/admin/manageInventory.php?userid=%s&serverid=%s'%(userId, serverId), params, header)
result=conn.getresponse().read()
print result
