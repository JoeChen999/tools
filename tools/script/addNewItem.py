import hashlib
import sys
import urllib
import httplib
import time
import json
import requestforcookie
"""
itemIdmin=1
itemIdmax=2
category=1
url='www.cmqa2.kabam.asia'
"""
if len(sys.argv)==5:
    itemIdmin=int(sys.argv[1])
    itemIdmax=int(sys.argv[2])+1
    category=sys.argv[3]
    url=sys.argv[4]
elif len(sys.argv)==4:
    itemIdmin=int(sys.argv[1])
    itemIdmax=int(sys.argv[1])+1
    category=sys.argv[2]
    url=sys.argv[3]

Host='http://'+url
requestforcookie.game_server_url=Host
requestforcookie.init_httpopener_cookie_by_login()
header=requestforcookie.default_header.copy()
header['Host']=url
headers=header.copy()

conn=httplib.HTTPConnection(url)
for id in range(itemIdmin, itemIdmax):
    params='itemId=%s&catId=%s&act=save&vid=1&tag=itemCategory'%(str(id), category)
    conn.request('POST', '/admin/gds/gds_data_add.php', params, header)
    result=conn.getresponse().read()
    if result.find('current Item Id had exists'):
        print 'current Item Id <%s> had exists'%str(id)
    elif result.find('Save success'):
        print 'Save item <%s> success'%str(id)
    else:
        print result
params='dataType=1&upgrade=1&gameVer=17&masterVer=1'
conn.request('POST', '/admin/gds/gds_data_add.php', params, header)
result=conn.getresponse().read()
print result
