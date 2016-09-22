import dealPost
import urllib
import pbconf
from pb2py import PBMsgHeader_pb2
import base64

def sendUrlRequest(params):
    header=PBMsgHeader_pb2.PBMsgHeader()
    protocol=params['protocol']
    reload(pbconf)
    protoConf=pbconf.pbconfig.pbconfig
    importStr='from pb2py import '+protoConf[protocol]['requestProto']
    reloadStr='reload('+protoConf[protocol]['requestProto']+')'
    exec(importStr)
    exec(reloadStr)
    initStr='requestData='+protoConf[protocol]['requestProto']+'.'+protoConf[protocol]['requestClass']+'()'
    exec(initStr)
    for item in params:
        if item == 'host':
            host = urllib.unquote(params['host'])
        elif item == 'naId':
            data=params['naId'].replace('+', '')
            header.naId=data[3:len(data)-3]
        elif item == 'gcUid':
            data=params['gcUid'].replace('+', '')
            header.gcUid=data[3:len(data)-3]
        elif item == 'gcUnick':
            data=params['gcUnick'].replace('+', '')
            header.gcUnick=data[3:len(data)-3]
        elif item == 'mobileId':
            data=params['mobileId'].replace('+', '')
            header.mobileId=data[3:len(data)-3]
        elif item == 'platformId':
            header.platformId=int(params['platformId'].replace('+', ''))
        elif item == 'becomeUserId':
            data=params['becomeUserId'].replace('+', '')
            header.becomeUserId=data[3:len(data)-3]
        elif item == 'becomePassword':
            data=params['becomePassword'].replace('+', '')
            header.becomePassword=data[3:len(data)-3]
        elif item == 'debug':
            header.debug=int(params['debug'].replace('+', ''))
        elif item == 'gVer':
            data=params['gVer'].replace('+', '')
            header.gVer=data[3:len(data)-3]
        elif item == 'gameSlot':
            header.gameSlot=int(params['gameSlot'].replace('+', ''))
        elif item == 'theme':
            header.theme=int(params['theme'].replace('+', ''))
        elif item == 'newLang':
            data=params['newLang'].replace('+', '')
            header.newLang=data[3:len(data)-3]
        elif item == 'gameNumber':
            header.gameNumber=int(params['gameNumber'].replace('+', ''))
        elif item == 'kabamId':
            data=params['kabamId'].replace('+', '')
            header.kabamId=data[3:len(data)-3]
        elif item == 'access_token':
            data=params['access_token'].replace('+', '')
            header.access_token=data[3:len(data)-3]
        elif item == 'action':
            continue
        elif item == 'server':
            server=params['server']
        elif item == 'worldId':
            worldId=params['worldId']
        elif item == 'protocol':
            continue
        else:
            data=params[item].replace('+', '')
            data=urllib.unquote(data)
            if data[0]=='"':
                data=data[1:len(data)-1]
                setDataStr='requestData.'+item+'=data'
            else:
                setDataStr='requestData.'+item+'=int(data)'
            exec(setDataStr)

    print header
    print requestData
    serializedDataStr=requestData.SerializeToString()
    serializedHeadStr=header.SerializeToString()
    b64Data=base64.b64encode(serializedDataStr)
    b64Head=base64.b64encode(serializedHeadStr)
    request={'data':b64Data,'header':b64Head}
    request=urllib.urlencode(request).replace('%', '%25').replace('=', '%3d')
    result=dealPost.sendRequest(protocol, request, server, worldId)
    return result
