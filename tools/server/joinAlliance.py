import httplib
import urllib
import time,hashlib
import base64
import sys
import gzip
from StringIO import StringIO

def unzip(gzipdata):
    	inbuffer = StringIO(gzipdata)
    	f = gzip.GzipFile(mode="rb", fileobj=inbuffer)
    	rdata = f.read()
    	return rdata

allianceId = sys.argv[1]
host = sys.argv[2]
url='http://'+host+'/ajax/allianceJoinRequest.php'
naids=['24574242',]
for naid in naids:
	params='requestToAllianceId=%s&message=Send+your+request+to+join+alliance&subject=I+am+interested+in+joining+your+alliance.&naid=%s&gcuid=&gcunick=&mobileid=ku75&platformid=201&become_user_id=&become_password=&debug=1&gver=16.4.10&gameSlot=743&theme=1&newlang=en&gameNumber=1395824950042&gameKey=b251591470124235bcb54d879321ac24'%(allianceId,naid)	
	request=base64.b64encode(params)
	request=request.replace('=', '%3d').replace('/', '%2f').replace('+', '%2b')
	request='data='+request+'&vcs=16.4.10'
	res=urllib.urlopen(url,request)
	result=res.read()
	try:
   		rdata=unzip(result)
	except:
    		rdata=result
	print rdata

