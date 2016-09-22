import sys
import urllib
import httplib
import requestforcookie
import unzip

url=sys.argv[1]

Host='http://'+url
requestforcookie.game_server_url=Host
requestforcookie.init_httpopener_cookie_by_login()
header=requestforcookie.default_header.copy()
header['Host']=url
headers=header.copy()

languages=['en','fr','de','it','es','tr','sv','nl','da','ru','pl','pt','zs','zt','ko','ja']
for language in languages:
    conn=httplib.HTTPConnection(url)
    conn.request('GET', '/admin/SyncString.php?lang=%s'%language,'',headers)
    result=conn.getresponse()
    data=result.read()
    try:
        rdata=unzip.unzip(data)
    except:
        rdata=data
    print rdata
params='dataType=0&upgrade=1&gameVer=16&masterVer=1'
headers['Content-Length']=len(params)
conn=httplib.HTTPConnection(url)
conn.request('POST', '/admin/upgradeSubVer.php?dataType=0&gameVer=16',params,headers)
result=conn.getresponse()
data=result.read()
try:
   rdata=unzip.unzip(data)
except:
    rdata=data
print rdata
print 'synchronize succeed'
