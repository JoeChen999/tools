import sys
import httplib
import urllib
import requestforcookie
import commands

userId=sys.argv[1]
cityId=sys.argv[2]
#serverId=sys.argv[3]
url=sys.argv[3]
"""
userId='1221'
cityId='234'
serverId='2'
url='www2.cmqa3.kabam.asia'
"""
Host='http://'+url
print Host
requestforcookie.game_server_url=Host
requestforcookie.init_httpopener_cookie_by_login()
header=requestforcookie.default_header.copy()
header['Host']=url
headers=header.copy()
serverName=url.split('.')[1]
serverId=url.split('.')[0][3]
database='gw%s_%s'%(serverId, serverName)

#add research
for i in range(1, 17):
    for j in range(10):
        addResearchParams='additemid='+str(i)+'&addserverid='+serverId+'&addcityid='+cityId+'&userid='+userId
        headers['Content-Length']=len(addResearchParams)
        conn=httplib.HTTPConnection(url)
        conn.request('POST','/admin/creditResearch.php?userid=%s&cityid=%s&serverid=%s.php'%(userId, cityId, serverId),addResearchParams,header)
        result=conn.getresponse()
        #data=result.read()
        #print data

#add buildings
buildingOutput=commands.getoutput('php ../phpsql/buildingId.php %s %s'%(cityId, database))
result= buildingOutput.split('\n')
for r in result:
    buildingId=r
    buildingParams='setitemlevel=10&setitemid=%s&setserverid=%s&setcityid=%s&setuserid=%s'%(buildingId, serverId, cityId, userId)
    headers['Content-Length']=len(buildingParams)
    conn=httplib.HTTPConnection(url)
    conn.request('POST','/admin/creditBuildings.php?cityid=%s&userid=%s&serverid=%s'%(cityId, userId, serverId),buildingParams,header)
    result=conn.getresponse()
    #data=result.read()
    #print data
    print "building(%s)levelup to lv10"%buildingId

#add Knight level
knightOutput=commands.getoutput('php ../phpsql/knightId.php %s %s'%(cityId, database))
result= knightOutput.split('\n')
for r in result:
    knightId=r
    knightParams='knightId=%s&knightLevel=250&userid=%s&cityid=%s&serverId=%s'%(knightId, userId, cityId, serverId)
    headers['Content-Length']=len(knightParams)
    conn=httplib.HTTPConnection(url)
    conn.request('POST','/admin/ajaxurl/updateKnight.php?v=1',knightParams,header)
    result=conn.getresponse()
    data=result.read()
    print data
    
