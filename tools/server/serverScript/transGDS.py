import sys
import re
import urllib2
import httplib
import requestforcookie, unzip
from poster.encode import multipart_encode
from poster.streaminghttp import register_openers

#GDSlist=['Building', 'Troop', 'Gear', 'GearLevelUp', 'SkillChoice', 'GearSkill', 'GearDrop', 'GearSwitcher', 'GearItemChest', 'GearFte']
#upGDSlist=['Building', 'Troop', 'Gear', 'GearLevelup', 'GearSkillChoice', 'GearSkill', 'GearDrop', 'GearSwitcher', 'GearItemChest', 'GearFte']
typelist=['Building','Troop', 'Daily_Quests',
          'Gear', 'Gear_LevelUp', 'Gear_SkillChoice', 'Gear_Skill', 'Gear_Drop', 'Gear_Switcher', 'Gear_ItemChest', 'Gear_Fte', 'Gear_TierSkill',
          'Hero_Basic', 'Hero_SkillFate', 'Hero_Level', 'Hero_ExploreDrop', 'Hero_Common', 'Hero_RenownItem', 'Hero_SkillLevel',
          'PVE_Boss', 'PVE_Map', 'PVE_Chapter', 'PVE_Level', 'PVE_Story', 'PVE_Drop', 'VIP', 'World_Map']
sourceUrl = sys.argv[1]
sourceServer = sys.argv[2]
desUrl = sys.argv[3]
desServer = sys.argv[4]

def getGDS():
    sourceHost='http://'+sourceUrl
    requestforcookie.game_server_url=sourceHost
    requestforcookie.init_httpopener_cookie_by_login()
    header=requestforcookie.default_header.copy()
    header['Host']=sourceUrl
    headers=header.copy()
    data=''

    for gds in typelist:
        conn=httplib.HTTPConnection(sourceUrl)
        conn.request('GET','/admin/manageDownGds.php?type=%s&serverid=1'%gds,data,headers)
        result=conn.getresponse()
        content=result.read()
        content=unzip.unzip(content)
        file=open('%s.csv'%gds, 'w')
        file.write(content)
        file.close()

def uploadGDS():
    desHost='http://'+desUrl
    requestforcookie.game_server_url=desHost
    requestforcookie.init_httpopener_cookie_by_login()
    header=requestforcookie.default_header.copy()
    header['Host']=desUrl
    #data=''
    opener=register_openers()
    for gds in typelist:
        datagen, headers = multipart_encode({"%s"%gds:open("%s.csv"%gds, "rb"), 'action':'uploadGDS', 'serverIds':'%s'%desServer, 'type':'%s'%gds})
        headers['Cookie']=header['Cookie']
        request = urllib2.Request("http://"+desUrl+"/admin/manageGDS.php", datagen, headers)
        result = urllib2.urlopen(request).read()
        match1=re.search('<pre>', result)
        match2=re.search('</pre>',result)
        if match1:
            index1=match1.end()
        else:
            print 'error occured in %s'%gds
            continue
        if match2:
            index2=match2.start()
        result=result[index1:index2]
        result="<p>"+gds+" is uploading....</p>\nresult:\n"+result
        print result
        
if __name__=='__main__':
    getGDS()
    uploadGDS()
