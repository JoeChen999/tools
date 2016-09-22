from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice, MonkeyImage
import checkpic
import pprint
caseName='Castle'

device = MonkeyRunner.waitForConnection()

def init():
	device.press('KEYCODE_HOME','DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(140,580,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(250,530,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(1000,250,'DOWN_AND_UP')
	device.startActivity('com.kabam.kocmobile/.KBNActivity')
	MonkeyRunner.sleep(7)
	device.touch(200,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.type('joe')
	device.touch(500,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(500,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(420,370,'DOWN_AND_UP')
	MonkeyRunner.sleep(40)
	device.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	
def execute():
	device.touch(100,300,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	if checkpic.picCompare(device,caseName,0.9,1)==0:
			return 0
	device.touch(300,130,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(300,340,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(400,430,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	device.touch(40,40,'DOWN_AND_UP')
	MonkeyRunner.sleep(1.5)
	device.touch(100,300,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	device.touch(300,130,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	if checkpic.keyCheck(device,caseName,1,2,'taxRate')==0:
			return 0
	device.touch(240,340,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(400,430,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	if checkpic.keyCheck(device,caseName,1,3,'taxRate')==0:
			return 0
	device.touch(400,200,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	if checkpic.keyCheck(device,caseName,1,4,'production')==0:
			return 0
	device.touch(300,330,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	if checkpic.keyCheck(device,caseName,1,5,'resourceInfo')==0:
			return 0
	device.touch(80,320,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,410,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	if checkpic.keyCheck(device,caseName,1,6,'resourceInfo')==0:
			return 0
	device.touch(80,320,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,490,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	if checkpic.keyCheck(device,caseName,1,7,'resourceInfo')==0:
			return 0
	device.touch(80,320,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,560,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	if checkpic.keyCheck(device,caseName,1,8,'resourceInfo')==0:
			return 0
	device.touch(80,320,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,630,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	if checkpic.keyCheck(device,caseName,0.99,9,'menu')==0:
			return 0
	device.touch(80,320,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(490,130,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	if checkpic.keyCheck(device,caseName,0.99,10,'menu')==0:
			return 0
			
if __name__=='__main__':
	init()
	execute()