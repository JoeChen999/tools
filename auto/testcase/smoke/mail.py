from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice, MonkeyImage
import checkpic
import pprint
caseName='mail'

import os

device = MonkeyRunner.waitForConnection(5,'c0808a31e28199f')
device1 = MonkeyRunner.waitForConnection(5,'4df7504976c6113f')

def init():
	os.system('adb -s c0808a31e28199f shell am force-stop com.kabam.fortress')
	os.system('adb -s 4df7504976c6113f shell am force-stop com.kabam.fortress')
	device.startActivity('com.kabam.fortress/.KBNActivity')
	device1.startActivity('com.kabam.fortress/.KBNActivity')
	MonkeyRunner.sleep(10)
	device.touch(200,50,'DOWN_AND_UP')
	device1.touch(200,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.type('cb1')
	device1.type('joe')
	device.touch(500,50,'DOWN_AND_UP')
	device1.touch(580,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(500,50,'DOWN_AND_UP')
	device1.touch(580,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(420,300,'DOWN_AND_UP')
	device1.touch(500,380,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	device.touch(300,900,'DOWN_AND_UP')
	device1.touch(360,1190,'DOWN_AND_UP')
	MonkeyRunner.sleep(70)
	device.press('KEYCODE_BACK','DOWN_AND_UP')
	device1.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.press('KEYCODE_BACK','DOWN_AND_UP')
	device1.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.press('KEYCODE_BACK','DOWN_AND_UP')
	device1.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(440,920,'DOWN_AND_UP')
	device1.touch(520,1200,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(290,920,'DOWN_AND_UP')
	device1.touch(340,1200,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(160,600,'DOWN_AND_UP')
	device1.touch(200,800,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(440,120,'DOWN_AND_UP')
	device1.touch(580,150,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(290,920,'DOWN_AND_UP')
	device1.touch(340,1200,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(160,600,'DOWN_AND_UP')
	device1.touch(200,800,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(90,120,'DOWN_AND_UP')
	device1.touch(130,150,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.press('KEYCODE_BACK','DOWN_AND_UP')
	device1.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	
def execute():
	device.touch(440,920,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(500,920,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(80,40,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(500,920,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	if checkpic.picCompare(device,caseName,0.99,1)==0:
			return 0
	device.touch(300,190,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.type('joe')
	MonkeyRunner.sleep(1)
	device.touch(300,280,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(300,280,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.type('~!@#$%^&*()_+QWERTYUIOP{}|ASDFGHJKL:"')
	device.touch(300,500,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(300,500,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	for i in range(21):
		device.type('~!@#$%^&*()_+QWERTYUIOP{}|ASDFGHJKL:"ZXCVBNM<>?')
		device.press('KEYCODE_SPACE','DOWN_AND_UP')
		device.type("`1234567890-=qwertyuiop[]\sadfghjkl;'zxcvbnm,./")
		device.press('KEYCODE_ENTER','DOWN_AND_UP')
	device.touch(560,220,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(550,40,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	if checkpic.picCompare(device,caseName,0.99,2)==0:
			return 0
	device.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(60)
	device.touch(440,920,'DOWN_AND_UP')
	device1.touch(520,1200,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(500,120,'DOWN_AND_UP')
	device1.touch(130,150,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,240,'DOWN_AND_UP')
	device1.touch(360,320,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	if checkpic.keyCheck(device,caseName,1,3,'mailContent')==0:
			imageB=device1.takeSnapshot()
			num=0
			while os.path.isfile('/Users/chenbiao/Desktop/auto/fault/error_%s_3_1_%d.png' %(caseName,num)):
				num=num+1
			imageB.writeToFile('/Users/chenbiao/Desktop/auto/fault/error_%s_3_1_%d.png' %(caseName,num),'png')
			return 0
	#reply
	device1.touch(80,1200,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device1.touch(360,700,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	for i in range(21):
		device1.type('~!@#$%^&*()_+QWERTYUIOP{}|ASDFGHJKL:"ZXCVBNM<>?')
		device1.press('KEYCODE_SPACE','DOWN_AND_UP')
		device1.type("`1234567890-=qwertyuiop[]\sadfghjkl;'zxcvbnm,./")
		device1.press('KEYCODE_ENTER','DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device1.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device1.touch(640,60,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	#FWD
	device1.touch(250,1200,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device1.touch(360,240,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device1.type('chb')
	MonkeyRunner.sleep(1)
	device1.touch(640,60,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device1.touch(640,60,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	#repeat FWD
	device1.touch(250,1200,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device1.touch(360,240,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device1.type('chb')
	MonkeyRunner.sleep(1)
	device1.touch(640,60,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device1.touch(640,60,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	#block device1.touch(480,900,'DOWN_AND_UP')
	#MonkeyRunner.sleep(3)
	device.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(60)
	device.touch(440,920,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(120,120,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	if checkpic.keyCheck(device,caseName,1,4,'mailList')==0:
		return 0
	device.touch(530,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(40,240,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(40,350,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(490,920,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	if checkpic.keyCheck(device,caseName,1,5,'mailList')==0:
		return 0
	device.touch(300,240,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	if checkpic.keyCheck(device,caseName,1,6,'mailSubject')==0:
			return 0
	device.touch(560,40,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(560,40,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(560,40,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(490,40,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	if checkpic.keyCheck(device,caseName,1,7,'mailSubject')==0:
			return 0
	device.touch(40,40,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	if checkpic.keyCheck(device,caseName,1,8,'mailList')==0:
		return 0
	device.touch(530,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(40,240,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(40,350,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(300,920,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	if checkpic.keyCheck(device,caseName,1,9,'mailList')==0:
		return 0
	
if __name__=='__main__':
	init()
	execute()
