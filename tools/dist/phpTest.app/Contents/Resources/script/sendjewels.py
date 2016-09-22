import hashlib
import sys
import urllib
import httplib
import time
import json
import requestforcookie

userId=sys.argv[1]
worldId=sys.argv[2]
count=sys.argv[3]
url=sys.argv[4]

Host='http://'+url
requestforcookie.game_server_url=Host
requestforcookie.init_httpopener_cookie_by_login()
header=requestforcookie.default_header.copy()
header['Host']=url
headers=header.copy()


data='option=userserver&gemAmount=&adminInput='+userId+'%3B'+worldId+'&item1=&item2=&item3=&item4=&item5=&item6=&item7=&item9=&item69=&item97=&item98=&item99=&item101=&item102=&item111=&item112=&item121=&item122=&item131=&item132=&item141=&item142=&item261=&item262=&item271=&item272=&item281=&item291=&item301=&item311=&item351=&item352=&item355=&item361=&item362=&item363=&item401=&item402=&item599=&item860=&item861=&item862=&item863=&item864=&item865=&item866=&item867=&item868=&item869=&item870=&item871=&item872=&item873=&item874=&item875=&item876=&item877=&item878=&item879=&item880=&item881=&item882=&item883=&item884=&item885=&item886=&item887=&item888=&item889=&item901=&item903=&item904=&item911=&item912=&item922=&item923=&item1001=&item1002=&item1003=&item1004=&item1005=&item1006=&item1007=&item1011=&item1012=&item1013=&item1014=&item1015=&item1016=&item1017=&item1021=&item1022=&item1023=&item1024=&item1025=&item1026=&item1027=&item1031=&item1032=&item1033=&item1034=&item1035=&item1036=&item1037=&item1041=&item1042=&item1043=&item1044=&item1045=&item1046=&item1047=&item3001=&item4000=&item4001=&item4002=&item4003=&item4004=&item4005=&item4006=&item4007=&item4008=&item4009=&item4010=&item4011=&item4012=&item4013=&item4014=&item4015=&item4016=&item4017=&item4018=&item10101=&item10102=&item20415=&item20421=&item20431=&item40000=&item40001=&item40002=&item40003=&item40004=&item40005=&item40006=&item40007=&item40008=&item40009=&item40100=&item40101=&item40102=&item40103=&item40104=&item40105=&item40106=&item40107=&item40108=&item40109=&item40200=&item40201=&item40202=&item40203=&item40204=&item40205=&item40206=&item40207=&item40208=&item40209=&item40300=&item40301=&item40302=&item40303=&item40304=&item40305=&item40306=&item40307=&item40308=&item40309=&item42000='+count+'&item42001='+count+'&item42002='+count+'&item42003='+count+'&item42004='+count+'&item42005='+count+'&item42006='+count+'&item42007='+count+'&item42008='+count+'&item42100='+count+'&item42101='+count+'&item42102='+count+'&item42103='+count+'&item42104='+count+'&item42105='+count+'&item42106='+count+'&item42107='+count+'&item42108='+count+'&item42200='+count+'&item42201='+count+'&item42202='+count+'&item42203='+count+'&item42204='+count+'&item42205='+count+'&item42206='+count+'&item42207='+count+'&item42208='+count+'&item42300='+count+'&item42301='+count+'&item42302='+count+'&item42303='+count+'&item42304='+count+'&item42305='+count+'&item42306='+count+'&item42307='+count+'&item42308='+count+'&item50000=&item50001=&item50002=&item50003=&item50004=&item50010=&item50011=&item50012=&item50013=&item50014=&item50020=&item50021=&item50022=&item50023=&item50024=&item50030=&item50031=&item50032=&item50033=&item50034=&item50040=&item50041=&item50042=&item50043=&item50044=&item50045=&item50050=&item50051=&item50052=&item50053=&item50054=&item50055=&item50060=&item50061=&item50062=&item50063=&item50064=&item50065=&item50100=&item50103=&item50104=&item50110=&item50113=&item50114=&item50120=&item50123=&item50124=&item50130=&item50133=&item50134=&item50140=&item50143=&item50144=&item50290=&item50291=&item50292=&item50293=&item50294=&item50295=&item50296=&item50297=&item50298=&item50200=&item50203=&item50204=&item50210=&item50213=&item50214=&item50220=&item50223=&item50224=&item50230=&item50233=&item50234=&item50240=&item50243=&item50244=&item50250=&item50253=&item50254=&item50260=&item50263=&item50264=&item50270=&item50273=&item50274=&item50280=&item50283=&item50284=&item1202=&item1203=&item1204=&item1205=&item1206=&item1207=&item1208=&item1209=&item1210=&item2101=&item2102=&item2103=&item2104=&item2105=&item2106=&item2201=&item2202=&item2203=&item2204=&item2205=&item2206=&item2207=&item2208=&item2209=&item2210=&item2305=&item2310=&item2315=&item2320=&item2325=&item2330=&item2335=&item2340=&item2345=&item2350=&item10000=&item10001=&item10002=&item10003=&item10004=&item10005=&item10007=&item10008=&item10009=&item10010=&item10011=&item10012=&item10013=&item10014=&item10020=&item10023=&item10030=&item10031=&item10032=&item10033=&item10034=&item10035=&item10036=&item10037=&item10038=&item10039=&item10040=&selectItem=1&subject=&body=&sendItems=Send'
headers['Content-Length']=len(data)
conn=httplib.HTTPConnection(url)
conn.request('POST','/admin/sendItemsToUserListDo.php',data,header)
    
result=conn.getresponse()
data=result.read()
print data
#print 'add success to user(%s)&server(%s)'%(userId,worldId)
