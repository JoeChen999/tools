from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice, MonkeyImage
import checkpic
import pprint
caseName='mail'

import os

device1 = MonkeyRunner.waitForConnection(5,'4df7504976c6113f')

def init():
	os.system('adb -s 4df7504976c6113f shell am force-stop com.kabam.kocmobile')
	device1.startActivity('com.kabam.kocmobile/.KBNActivity')
	MonkeyRunner.sleep(6)
	device1.touch(200,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device1.type('cb1')
	device1.touch(580,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device1.touch(580,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device1.touch(500,500,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	device1.touch(360,1190,'DOWN_AND_UP')
	MonkeyRunner.sleep(30)
	device1.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device1.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device1.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(1)

def execute():
	device1.touch(165,740,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device1.touch(580,570,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device1.touch(230,1110,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	device1.touch(100,420,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device1.touch(540,170,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	#device1.drag((300,800),(300,100),0.1,1)
	#MonkeyRunner.sleep(2)
	device1.touch(350,520,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device1.touch(550,450,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	device1.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device1.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device1.touch(165,740,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device1.touch(360,150,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device1.drag((300,800),(300,100),0.1,1)
	MonkeyRunner.sleep(1)
	device1.touch(380,1160,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device1.touch(550,920,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	device1.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(1)
		

if __name__=='__main__':
	init()
	execute()

	