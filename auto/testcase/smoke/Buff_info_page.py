from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice, MonkeyImage
import checkpic
import pprint
caseName='Buff_info_page'

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
	device.touch(570,195,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,210,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(460,460,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	if checkpic.picCompare(device,caseName,0.99,1)==0:
			return 0
	device.touch(300,340,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(460,460,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	if checkpic.picCompare(device,caseName,0.99,2)==0:
			return 0
	device.touch(300,470,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(460,520,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	if checkpic.picCompare(device,caseName,0.99,3)==0:
			return 0
	device.touch(300,610,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(460,520,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	if checkpic.picCompare(device,caseName,0.99,4)==0:
			return 0
	device.touch(550,60,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	if checkpic.keyCheck(device,caseName,0.95,5,'buffIcon')==0:
			return 0
	device.touch(570,195,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,740,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(460,460,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	if checkpic.picCompare(device,caseName,0.99,6)==0:
			return 0
	device.touch(300,880,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(460,460,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	if checkpic.picCompare(device,caseName,0.99,7)==0:
			return 0
	device.drag((300,800),(300,100),0.1,1)
	MonkeyRunner.sleep(1)
	device.touch(300,610,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(460,460,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	if checkpic.picCompare(device,caseName,0.99,8)==0:
			return 0
	device.touch(300,740,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(460,460,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	if checkpic.picCompare(device,caseName,0.99,9)==0:
			return 0
	device.touch(300,880,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(460,460,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	if checkpic.picCompare(device,caseName,0.99,10)==0:
			return 0
	device.touch(550,60,'DOWN_AND_UP')