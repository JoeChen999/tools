from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice, MonkeyImage
import checkpic
import pprint
caseName='Player_info_page'
device=MonkeyRunner.waitForConnection()

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
	MonkeyRunner.sleep(0.5)
	device.touch(500,50,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(420,370,'DOWN_AND_UP')
	MonkeyRunner.sleep(40)
	device.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.press('KEYCODE_BACK','DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	
def execute():
	for i in range(2):
		device.touch(50,50,'DOWN_AND_UP')
		MonkeyRunner.sleep(4)
		if checkpic.picCompare(device,caseName,0.9,1+5*i)==0:
			return 0
		device.touch(300,660,'DOWN_AND_UP')
		MonkeyRunner.sleep(1)
		device.type('joe%d'%(i))
		MonkeyRunner.sleep(0.5)
		device.touch(570,650,'DOWN_AND_UP')
		MonkeyRunner.sleep(1)
		device.touch(300,810,'DOWN_AND_UP')
		MonkeyRunner.sleep(3)
		if checkpic.keyCheck(device,caseName,1,2+5*i,'Name')==0:
			return 0
		device.touch(300,120,'DOWN_AND_UP')
		MonkeyRunner.sleep(1)
		if checkpic.picCompare(device,caseName,0.9,3+5*i)==0:
			return 0
		device.touch(300,730,'DOWN_AND_UP')
		MonkeyRunner.sleep(1)
		device.type('cname%d'%(i))
		MonkeyRunner.sleep(0.5)
		device.touch(570,650,'DOWN_AND_UP')
		MonkeyRunner.sleep(1)
		device.touch(300,890,'DOWN_AND_UP')
		MonkeyRunner.sleep(3)
		if checkpic.keyCheck(device,caseName,1,4+5*i,'Name')==0:
			return 0
		device.touch(480,120,'DOWN_AND_UP')
		MonkeyRunner.sleep(1)
		if checkpic.keyCheck(device,caseName,1,5+5*i,'world')==0:
			return 0
		device.touch(40,40,'DOWN_AND_UP')
		MonkeyRunner.sleep(1)
		
if __name__=='__main__':
	init()
	execute()