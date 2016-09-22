from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice, MonkeyImage
import checkpic
import pprint
import os
caseName='Switch_language'

device = MonkeyRunner.waitForConnection(5,'c0808a31e28199f')
def login():
	device.touch(420,300,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	device.touch(300,900,'DOWN_AND_UP')
	MonkeyRunner.sleep(70)
	device.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(110,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)

def init():
	os.system('adb -s c0808a31e28199f shell am force-stop com.kabam.fortress')
	MonkeyRunner.sleep(1)
	device.startActivity('com.kabam.fortress/.KBNActivity')
	MonkeyRunner.sleep(10)
	device.touch(200,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.type('joe')
	device.touch(500,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(500,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(420,300,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	device.touch(300,900,'DOWN_AND_UP')
	MonkeyRunner.sleep(70)
	device.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(110,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	device.touch(550,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,630,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,230,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(300,880,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	login()
	
def execute():
	device.touch(550,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,630,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,310,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(300,880,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	login()
	if checkpic.picCompare(device,caseName,1,1)==0:
			return 0
	#France		
	device.touch(550,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,630,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,390,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(300,880,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	login()
	if checkpic.picCompare(device,caseName,1,2)==0:
			return 0
	#Deutsch
	device.touch(550,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,630,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,460,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(300,880,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	login()
	if checkpic.picCompare(device,caseName,1,3)==0:
			return 0
	#Italy
	device.touch(550,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,630,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,540,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(300,880,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	login()
	if checkpic.picCompare(device,caseName,1,4)==0:
			return 0
	#Spain
	device.touch(550,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,630,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,620,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(300,880,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	login()
	if checkpic.picCompare(device,caseName,1,5)==0:
			return 0
	#Turkey
	device.touch(550,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,630,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,700,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(300,880,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	login()
	if checkpic.picCompare(device,caseName,1,6)==0:
			return 0
	#Svenska
	device.touch(550,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,630,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,780,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(300,880,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	login()
	if checkpic.picCompare(device,caseName,1,7)==0:
			return 0
	#Netherland
	device.touch(550,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,630,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.drag((300,800),(300,100),0.1,1)
	MonkeyRunner.sleep(1)
	device.touch(300,530,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(300,880,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	login()
	if checkpic.picCompare(device,caseName,1,8)==0:
			return 0
	#Dansk
	device.touch(550,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,630,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.drag((300,800),(300,100),0.1,1)
	MonkeyRunner.sleep(1)
	device.touch(300,610,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(300,880,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	login()
	if checkpic.picCompare(device,caseName,1,9)==0:
			return 0
	#Pykistan
	device.touch(550,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,630,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.drag((300,800),(300,100),0.1,1)
	MonkeyRunner.sleep(1)
	device.touch(300,690,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(300,880,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	login()
	if checkpic.picCompare(device,caseName,1,10)==0:
			return 0
	#Polski
	device.touch(550,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,630,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.drag((300,800),(300,100),0.1,1)
	MonkeyRunner.sleep(1)
	device.touch(300,770,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(300,880,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	login()
	if checkpic.picCompare(device,caseName,1,11)==0:
			return 0
	#Portugal
	
if __name__=='__main__':
	init()
	execute()