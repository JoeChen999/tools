import hashlib
import sys
import urllib
import httplib
import time
import json
import requestforcookie

ImageF={0:'trumpet', 1:'drust', 2:'tokens', 3:'warning', 4:'arthur', 5:'sale_sign', 6:'chest', 7:'hourglass', 8:'question', 9:'alliance', 10:'shield', 11:'Kabam', 12:'check', 13:'swords', 14:'morgause', 15:'trophy', 16:'gem_80', 17:'towersale',18:'alliance', 19:'check' }
Destination={0:'url', 1:'inventory', 2:'alliance', 3:'quest',4:'shop', 5:'getGems', 6:'kabamID', 7:'share', 8:'roundtower', 9:'EventCenter' , 10:'shop', 11:'shop', 12:'shop', 13:'shop', 14:'shop', 15:'shop', 16:'shop', 17:'shop', 18:'inventory', 19:'quest'}
Delfrom=int(sys.argv[1])
Delend=int(sys.argv[2])
CaseNo=int(sys.argv[3])
CurUrl=sys.argv[4]

#header={'Content-Type':'application/x-www-form-urlencoded',
#        'User-Agent':'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/28.0.1500.71 Safari/537.36', 
#        'Host':'www.fortqa3.kabam.asia',
#        'Connection':'keep-alive',
#        'Accept-Encoding':'gzip,deflate,sdch',
#        'Cookie':'gw_admin_id=MQ%3D%3D; gw_admin_name=YWRtaW4%3D; gw_admin_level=Mw%3D%3D; gw_admin_se=93ec4917030e889788ea76835b30bd18', 
#}

transUrl='http://'+CurUrl
requestforcookie.game_server_url=transUrl
requestforcookie.init_httpopener_cookie_by_login()
header=requestforcookie.default_header.copy()
header['Host']=CurUrl
headers=header.copy()

Case=[0, 5, 10, 15]
assert CaseNo<len(Case), 'Invalid CaseNo!'  
p=Case[CaseNo]

for j in range(Delfrom, Delend+1):

    url='/admin/chatSale.php?cmd=delete&id='+'%d'%j
    params='cmd=delete&'+'%d'%j
    
    conn=httplib.HTTPConnection(CurUrl)
    conn.request('GET', url, params,header)
    
    result=conn.getresponse()
 #   data=result.read()
 #   print data
 
for i in range(5):
    if i+p==0:
        s='serverButton_1=1&serverPlatforms%5B%5D=1__201&serverPlatforms%5B%5D=1__203&imgFile='+ImageF[i+p]+'&destination='+Destination[i+p]+'&position=1&linkUrl=www.baidu.com&title=tap+me&detail=test+with+python&rollSeconds=5&sort=1&urgent=1&starttime=08%2F05%2F2013+16%3A16&endtime=01%2F01%2F2025+00%3A00&saleId=&cmd=save'
    else:
        s='serverButton_1=1&serverPlatforms%5B%5D=1__201&serverPlatforms%5B%5D=1__203&imgFile='+ImageF[i+p]+'&destination='+Destination[i+p]+'&position=1&linkUrl=&title=auto+test&detail=python+auto+test+for+'+ImageF[i+p]+'&rollSeconds=50&sort=1&starttime=08%2F02%2F2013+13%3A49&endtime=01%2F01%2F2025+00%3A00&saleId=&cmd=save'
    
    params=s
    headers['Content-Length']=len(params)
 #       'Content-Length':len(params),

    conn=httplib.HTTPConnection(CurUrl)
    conn.request('POST', '/admin/chatSale.php', params, headers)
    
    result=conn.getresponse()
 #   data=result.read()
 #   print data
    
for k in range(Delend+1, Delend+5+1):
    url='/admin/chatSale.php?cmd=changeStatus&id='+'%d'%k+'&status=1'
    params='cmd=changeStatus&id='+'%d'%k+'&status=1'
    
    conn=httplib.HTTPConnection(CurUrl)
    conn.request('GET', url, params,header)
    
    result=conn.getresponse()
print 'there is no output'
#    data=result.read()
#    print data    
