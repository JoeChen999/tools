from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice, MonkeyImage
import checkpic
import pprint
caseName='City_Buildings'

device = MonkeyRunner.waitForConnection()
device.touch(30,540,'DOWN_AND_UP')#home
MonkeyRunner.sleep(2)
device.touch(300,180,'DOWN_AND_UP')
MonkeyRunner.sleep(1.5)
device.touch(230,340,'DOWN_AND_UP')
MonkeyRunner.sleep(7)
checkpic.picCompare(device,caseName,0.95,1)
device.touch(100,600,'DOWN_AND_UP')#Barracks
MonkeyRunner.sleep(2)
device.touch(300,310,'DOWN_AND_UP')
MonkeyRunner.sleep(1.5)
device.touch(230,340,'DOWN_AND_UP')
MonkeyRunner.sleep(3)
device.touch(560,770,'DOWN_AND_UP')
MonkeyRunner.sleep(2)
device.touch(300,220,'DOWN_AND_UP')