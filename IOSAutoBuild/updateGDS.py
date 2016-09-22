import commands, sys
import PBMsgHeader_pb2
import PBMsgReqGds_pb2
import base64

header=PBMsgHeader_pb2.PBMsgHeader()
data=PBMsgReqGds_pb2.PBMsgReqGds()
gdsList=['building','troop','gear','gearSkill','gearLevelUp','gearSysUnlock','gearItemChest',
	'PveChapter', 'PveMap','PveLevel','PveBoss','PveStory','PveDrop','HeroBasic',
            'HeroCommon','HeroExploreDrop','HeroLevel','HeroRenownItem','HeroSkillFate','Vip',]
resourcePath=sys.argv[1]
gameVer=sys.argv[2]
gdsServer=sys.argv[3]

def setHeader():
    header.naId='23740614'
    header.gcUid=''
    header.gcUnick=''
    header.mobileId='Cb1'
    header.platformId=201
    header.becomeUserId=''
    header.becomePassword=''
    header.debug=1
    header.gVer=gameVer
    header.gameSlot=20
    header.theme=1
    header.newLang='zs'
    header.gameNumber=1398313469016
    header.kabamId='0'
    header.access_token=''

def setData(type, worldId=2, version=0):
    data.type=type
    data.worldId=worldId
    data.version=version
    
if __name__=='__main__':
    setHeader()
    serializedHeadStr=header.SerializeToString()
    b64Head=base64.b64encode(serializedHeadStr)
    req_header="header="+b64Head+"&download=1&data="
    for type in gdsList:
        gdsFile=resourcePath+'/Data/'+type+'.txt'
        setData(type)
        serializedDataStr=data.SerializeToString()
        b64Data=base64.b64encode(serializedDataStr)
        req=req_header+b64Data
        result=commands.getoutput('curl -o %s -d "%s" http://%s/ajax/gds.php'%(gdsFile, req, gdsServer))
        print "updating %s"%gdsFile
	print result

    
