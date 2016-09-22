import commands
import urllib
import re
from dealPost import devToolsDisplay

def dealData(qs, boundary):
    boundary='--'+boundary
    datas=qs.split(boundary)
    params={}
    for data in datas:
        if data=='' or re.search('--', data):
            continue
        i=0
        j=3
        isfile=0
        value=''
        data=data.split('\n')
        for line in data:
            if i==1:
                key=line.split(':')[1]
                if re.search('filename=', key):
                    filename=key.split('filename=')[1]
                    filename=filename[1:len(filename)-2]
                    isfile=1
                key=key.split(';')[1]
                key=key.split('=')[1]
                if key[len(key)-1]=='"':
                    key=key[1:len(key)-1]
                else:
                    key=key[1:len(key)-2]
            elif i==2:
                if line.split(':')[0]!='Content-Type':
                    j=2
            elif i>j:
                value+=line
            i+=1
        value=value[:len(value)-1]
        if isfile==0:
            params[key]=value
        else:
            params[key]={'value':value, 'filename':filename}
        
    if params['action']=='doAccuracy':
        env=params['env']
        if params['aux']['value']!='':
            file=open('aux.sql', 'w')
            file.write(params['aux'])
            file.close()
        if params['dev']['value']!='':
            file=open('dev.sql', 'w')
            file.write(params['dev'])
            file.close()
        if params['err']['value']!='':
            file=open('err.sql', 'w')
            file.write(params['err'])
            file.close()
        if params['master']['value']!='':
            file=open('master.sql', 'w')
            file.write(params['master'])
            file.close()
        if params['world']['value']!='':
            file=open('world.sql', 'w')
            file.write(params['world'])
            file.close()
        resultStr= commands.getoutput('php ./phpsql/DBAupdate.php %s'%env)
        commands.getoutput('rm ./phpsql/*.sql')
        resultStr=devToolsDisplay(resultStr)
    elif params['action']=='addProto':
        name=params['name']
        requestClass=params['requestClass']
        responseClass=params['responseClass']
        requestProto=params['requestProto']['filename'][:len(params['requestProto']['filename'])-6]+'_pb2'
        responseProto=params['responseProto']['filename'][:len(params['responseProto']['filename'])-6]+'_pb2'
        file=open('./proto/'+params['requestProto']['filename'], 'w')
        file.write(params['requestProto']['value'])
        file.close()
        file=open('./proto/'+params['responseProto']['filename'], 'w')
        file.write(params['responseProto']['value'])
        file.close()
        s=commands.getoutput('protoc -I=./proto/ --python_out=./pb2py/ ./proto/*.proto')
        print s
        file=open('./pbconf.py', 'r')
        pbconf=file.read()
        file.close()
        pbconf=pbconf[:len(pbconf)-2]
        pbconf+='\n\'%s\':{\'requestClass\':\'%s\',\'requestProto\':\'%s\',\'responseClass\':\'%s\',\'responseProto\':\'%s\'},'%(name, requestClass, requestProto, responseClass, responseProto)
        pbconf+='\n}'
        file=open('./pbconf.py', 'w')
        file.write(pbconf)
        file.close()
        file=open('./protoList.js', 'a')
        file.write('\ndocument.write("<option value=\'%s\'>%s</option>");'%(name, name))
        file.close()
        resultStr='add protocol success'
        resultStr+='<br><br><a href="protoTest.html">back to protobuf Test</a><br>'
        resultStr=devToolsDisplay(resultStr)
    return resultStr
