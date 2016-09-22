import commands
import urllib
import base64
import re
import pbconf
import unzip, sendUrlRequest

def dealData(qs):
    datas=qs.split('&')
    params={}
    for item in datas:
        param=item.split('=')
        if len(param)==2:
            key=param[0]
            value=param[1]
            params[key]=value
        else:
            print 'check your request data, asshole'
    if params['action']=='memcache':
        server=params['servername']
        result=dealMemcache(server)
    elif params['action']=='makeRole':
        mid=params['mid']
        server=params['server']
        result=makeRole(mid, server)
    elif params['action']=='tobepowerful':
        userId=params['userid']
        cityId=params['cityid']
        url=params['url']
        result=toBePowerful(userId, cityId, url)
    elif params['action']=='commitlog':
        branchName=params['branchname']
        gameVersion=params['gameversion']
        result=commitLog(branchName, gameVersion)
    elif params['action']=='doUpdate':
        branchName=params['branch']
        branchName=urllib.unquote(branchName)
        env=params['env']
        result=codeUpdate(branchName, env)
        result=result.replace('\n', '<br>')
        result=devToolsDisplay(result)
    elif params['action']=='doEasy':
        env=params['env']
        version=params['version']
        result=commands.getoutput('php ./phpsql/DBupdate.php %s %s'%(env, version))
        result=devToolsDisplay(result)
    elif params['action']=='transGDS':
        sourceUrl=params['sourceUrl']
        sourceServer=params['sourceServer']
        sourceServer=sourceServer.replace('%2C',',')
        desUrl=params['desUrl']
        desServer=params['desServer']
        desServer=desServer.replace('%2C',',')
        result=commands.getoutput('python ./serverScript/transGDS.py %s %s %s %s'%(sourceUrl, sourceServer, desUrl, desServer))
        result=result.replace('\n', '<br>')
        result=devToolsDisplay(result)
    elif params['action']=='doPush':
        env=params['env']
        version=params['version']
        result=commands.getoutput('./serverScript/serverPush.sh %s %s'%(env, version))
        result=result.replace('\n', '<br>')
        result=result.replace('\r', '<br>')
    elif params['action']=='transRequest':
        protocol=params['protocol']
        request=params['request']
        server=params['server']
        worldId=params['worldId']
        result=transRequest(protocol, request, server, worldId)
        result=devToolsDisplay(result)
    elif params['action']=='sendRequest':
        protocol=params['protocol']
        request=params['request']
        server=params['server']
        worldId=params['worldId']
        result=sendRequest(protocol, request, server, worldId)
        result=result.replace('\n', '<br>')
        result=devToolsDisplay(result)
    elif params['action']=='transResponse':
        prototype=params['prototype']
        response=params['response']
        response=urllib.unquote(response)
        result=transProto(prototype, response)
        result=devToolsDisplay(result)
    elif params['action']=='sendUrlRequest':
        result=sendUrlRequest.sendUrlRequest(params)
        result=result.replace('\n', '<br>')
        result=devToolsDisplay(result)
    return result
    
        
def dealMemcache(server):
    result=commands.getoutput('php ./serverScript/memFlush.php %s'%server)
    return result

def  makeRole(mid, server):
    result=commands.getoutput('php /opt/www/mobile1/cmdev2/fb/tools/ebox/test/robot/makeNewUser.php %s %s'%(mid, server))
    return result
    
def toBePowerful(userId, cityId, url):
    result=commands.getoutput('python ./serverScript/toBePowerful.py %s %s %s'%(userId, cityId, url))
    return result

def commitLog(branchName, gameVersion):
    result=commands.getoutput('python ./serverScript/commitLog.py %s %s'%(branchName, gameVersion))
    return result

def codeUpdate(branchName, env):
    result=commands.getoutput('python ./serverScript/codeUpdate.py %s %s'%(branchName, env))
    return result

def devToolsDisplay(input):
    devToolsHead='<html><head><meta content="text/html; charset=utf-8" http-equiv="Content-Type"></head><body><style>td{padding: 4px;}</style>'
    devToolsHead+='<table width="100%" height="100%"><tr><td width="190" height="100%" valign="top">'
    devToolsHead+='<script language="javascript" src="devTools.js"></script></td>'
    devToolsHead+='</td><td bgcolor="#ccffff" align="center"><table>'
    devToosEnd='<a href="javascript:history.back(-1);">back</a></table></td></body></html>'
    output=devToolsHead+input+devToosEnd
    return output

def transRequest(protocol, request, server, worldId):
    url = 'http://www'+worldId+'.'+server+'.kabam.asia/ajax/'+protocol+'.php'
    reload(pbconf)
    protoConf=pbconf.pbconfig.pbconfig
    from pb2py import PBMsgHeader_pb2
    reload(PBMsgHeader_pb2)
    importStr='from pb2py import '+protoConf[protocol]['requestProto']
    reloadStr='reload('+protoConf[protocol]['requestProto']+')'
    exec(importStr)
    exec(reloadStr)
    initStr='requestData='+protoConf[protocol]['requestProto']+'.'+protoConf[protocol]['requestClass']+'()'
    exec(initStr)
    requestHeader=PBMsgHeader_pb2.PBMsgHeader()
    request=urllib.unquote(request)
    request=request.split('&')
    for data in request:
        key=data.split('=')[0]
        value=data.split('=')[1]
        if key=='data':
            b64data=value.replace('%3d', '=').replace('%2f', '/').replace('%2b', '+')
        elif key=='header':
            b64header=value.replace('%3d', '=').replace('%2f', '/').replace('%2b', '+')
    serializedData=base64.b64decode(b64data)
    serializedHeader=base64.b64decode(b64header)
    requestData.ParseFromString(serializedData)
    requestHeader.ParseFromString(serializedHeader)
    stringData=requestData.__str__()
    tableData=string2table(stringData)
    stringHeader=requestHeader.__str__()
    tableHeader=string2table(stringHeader)
    result='<form name="form1" action="" method="post"><tr><td style="font-size:18px;color:blue;font-weight:bold;>url=%s</td></tr>'%url
    result+='<tr><td colspan=2 style="font-size:18px;color:blue;font-weight:bold;"><=========header==========></td></tr>'
    result+=tableHeader
    result+='<tr><td><br><br></td></tr><tr><td colspan=2 style="font-size:18px;color:blue;font-weight:bold;"><==========data===========></td></tr>'
    result+=tableData
    result+='<tr><td colspan=2><input type="hidden" name="action" value="sendUrlRequest"><input type="hidden" name="server" value="%s"><input type="hidden" name="worldId" value="%s"><input type="hidden" name="protocol" value="%s">'%(server, worldId,  protocol)
    result+='<input style="font-size: 20px;width:300px;background-color:green" type="submit" value="send"></td></tr>'
    return result

def transResponse(protocol, response):
    if protocol == 'getMysteryChestList_proto':
        try:
            response = unzip.unzip(response)
        except:
            return response
    reload(pbconf)
    protoConf=pbconf.pbconfig.pbconfig
    from pb2py import PBMsgResponse_pb2
    reload(PBMsgResponse_pb2)
    importStr='from pb2py import '+protoConf[protocol]['responseProto']
    reloadStr='reload('+protoConf[protocol]['responseProto']+')'
    exec(importStr)
    exec(reloadStr)
    responseObj=PBMsgResponse_pb2.PBMsgResponse()
    try:
        responseObj.ParseFromString(response)
    except:
        return response
    if responseObj.ok==False:
        return '<tr><td>OK:'+str(responseObj.ok)+'</td></tr>'+'<tr><td>error_code:'+str(responseObj.error_code)+'</td></tr>'+'<tr><td>msg:'+responseObj.msg+'</td></tr>'
    else:
        responseData=responseObj.data
    initStr='data='+protoConf[protocol]['responseProto']+'.'+protoConf[protocol]['responseClass']+'()'
    exec(initStr)
    data.ParseFromString(responseData)
    stringData=data.__str__()
    if protocol=='pve1':
        if data.staminaInfo:
            staminaInfo=data.staminaInfo
            from pb2py import PBMsgPveStaminaInfo_pb2
            stamina=PBMsgPveStaminaInfo_pb2.PBMsgPveStaminaInfo()
            stamina.ParseFromString(staminaInfo)
            staminaString='{\n'+stamina.__str__()+'}'
            stringData=replaceValue('staminaInfo', stringData, staminaString)
        if data.resultInfo:
            resultInfo=data.resultInfo
            from pb2py import PBMsgPveResultInfo_pb2
            result=PBMsgPveResultInfo_pb2.PBMsgPveResultInfo()
            result.ParseFromString(resultInfo)
            resultString='{\n'+result.__str__()+'}'
            stringData=replaceValue('resultInfo', stringData, resultString)
        if data.marchInfo:
            marchInfo=data.marchInfo
            from pb2py import PBMsgPveMarchInfo_pb2
            march=PBMsgPveMarchInfo_pb2.PBMsgPveMarchInfo()
            march.ParseFromString(marchInfo)
            marchString='{\n'+march.__str__()+'}'
            stringData=replaceValue('marchInfo', stringData, marchString)
    treeData=string2tree(stringData)
    return treeData

def replaceValue(key, string, replace):
    match1=re.search(key, string)
    if match1:
        index1=match1.end()
        string2=string[index1:]
        match2=re.search('\n', string2)
        if match2:
            index2=match2.start()
        result=string[index1:index2+index1]
        string=string.replace(result, replace)
        return string
    else:
        return string

def transProto(pbclass, proto):
    importStr='from pb2py import '+pbclass+'_pb2'
    exec(importStr)
    initStr='data='+pbclass+'_pb2.'+pbclass+'()'
    exec(initStr)
    proto=urllib.unquote_plus(proto)
    data.ParseFromString(proto)
    stringData=data.__str__()
    treeData=string2tree(stringData)
    return treeData
    
def string2table(string):
    lines=string.split('\n')
    table=''
    for line in lines:
        if line=='':
            continue
        table+='<tr><td>'
        key=line.split(':')[0]
        value=line.split(':')[1]
        table+=key+'</td><td><input type="input" name="%s" value=\'%s\'>'%(key, value)+'</td></tr>'
    return table

def string2tree(string):
    lines=string.split('\n')
    tree=''
    depth=0
    for line in lines:
        if line == '':
            continue
        pre=''
        for i in range(depth):
            pre+='&nbsp;&nbsp;'
        if re.search(':', line):
            tree+=pre+line+'<br>'
        elif re.search('{', line):
            node=line.split('{')[0]
            tree+='<span><a style="color:blue;font-weight:bold;" onclick=\'parentNode.getElementsByTagName("div")[0].style.display=="none"?parentNode.getElementsByTagName("div")[0].style.display="block":parentNode.getElementsByTagName("div")[0].style.display="none";\'>'+pre+'+'+node+'</a><div style="display:none;">'
            depth+=1
        elif re.search('}', line):
            tree+='</div></span><br>'
            depth-=1
    return tree
            
def sendRequest(protocol, request, server, worldId):
    reload(pbconf)
    protoConf=pbconf.pbconfig.pbconfig
    from pb2py import PBMsgHeader_pb2
    reload(PBMsgHeader_pb2)
    importStr='from pb2py import '+protoConf[protocol]['requestProto']
    reloadStr='reload('+protoConf[protocol]['requestProto']+')'
    exec(importStr)
    exec(reloadStr)
    initStr='requestData='+protoConf[protocol]['requestProto']+'.'+protoConf[protocol]['requestClass']+'()'
    exec(initStr)
    requestHeader=PBMsgHeader_pb2.PBMsgHeader()
    request=urllib.unquote(request)
    requestlist=request.split('&')
    for data in requestlist:
        key=data.split('=')[0]
        value=data.split('=')[1]
        if key=='data':
            b64data=value.replace('%3d', '=').replace('%2f', '/').replace('%2b', '+').replace('%3D', '=').replace('%2F', '/').replace('%2B', '+')
        elif key=='header':
            b64header=value.replace('%3d', '=').replace('%2f', '/').replace('%2b', '+').replace('%3D', '=').replace('%2F', '/').replace('%2B', '+')
    try:
        serializedData=base64.b64decode(b64data)
        serializedHeader=base64.b64decode(b64header)
    except:
        return "please input base64 request"
    try:
        requestData.ParseFromString(serializedData)
        requestHeader.ParseFromString(serializedHeader)
    except:
        return "incorrect request"
    stringData=requestData.__str__()
    tableData=string2table(stringData)
    stringHeader=requestHeader.__str__()
    tableHeader=string2table(stringHeader)
    requestResult='<tr><td colspan=2 style="font-size:18px;color:blue;font-weight:bold;"><=========header==========></td></tr>'+tableHeader+'<tr><td><br><br></td></tr><tr><td colspan=2 style="font-size:18px;color:blue;font-weight:bold;"><==========data===========></td></tr>'+tableData
    #request=urllib.unquote(request)
    url = 'http://www'+worldId+'.'+server+'.kabam.asia/ajax/'+protocol+'.php'
    res = urllib.urlopen(url,request)
    response=res.read()
    if protocol=='pve':
        if requestData.type==0:
            protocol=''
        elif requestData.type==1:
            protocol='pve1'
        elif requestData.type==2:
            protocol='pve2'
        elif requestData.type==3:
            protocol='pve3'
        elif requestData.type==4:
            protocol='pve4'
        elif requestData.type==5:
            protocol='pve5'
    responseResult=transResponse(protocol, response)
    result='<tr><td style="font-size:18px;color:green;font-weight:bold;">Request:</td><td style="font-size:18px;color:green;font-weight:bold;">Response:</td></tr>'
    result+='<tr><td width="50%"><table>'+requestResult+'</table></td>'+'<td width="50%" align="left" valign="top"><table>'+responseResult+'</table></td>'
    return result
    
