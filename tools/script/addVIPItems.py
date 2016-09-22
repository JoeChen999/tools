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
headers=header.copy()
params='action=saveMulti&userid=%s'%userId

vipItemList=['21000', '21001', '21002', '21500', '21501', '21502', '21503', '21504', '21505', '21506', '21507', '21508', '21509']

for id in vipItemList:
    params+='&saveValue%%5B%%5D=%s%%7C%s'%(id, count)
    
conn=httplib.HTTPConnection(url)
conn.request('POST', '/admin/manageInventory.php?userid=%s&serverid=%s'%(userId, serverId), params, header)
result=conn.getresponse().read()
print result
