from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice, MonkeyImage
import checkpic
caseName='Alliance'
device = MonkeyRunner.waitForConnection(5,'c0808a31e28199f')
de = MonkeyRunner.waitForConnection(5,'IRMM0100411093')
#def init():
	
  #device.startActivity('com.kabam.fortress/.KBNActivity')
  
def execute():	
	device.touch(350,920,'DOWN_AND_UP')
	de.touch(260,840,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,470,'DOWN_AND_UP')
	de.touch(240,350,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	device.touch(300,290,'DOWN_AND_UP')
	de.touch(100,200,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.type('joe')
	de.press('J','DOWN_AND_UP')
	MonkeyRunner.sleep(0.5)
	device.touch(570,830,'DOWN_AND_UP')
	de.press('O','DOWN_AND_UP')
	MonkeyRunner.sleep(0.5)
	device.touch(570,830,'DOWN_AND_UP')
	de.press('E','DOWN_AND_UP')
	MonkeyRunner.sleep(0.5)
	device.touch(300,500,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.type('testalliance')
	MonkeyRunner.sleep(0.5)
	device.touch(570,830,'DOWN_AND_UP')
	MonkeyRunner.sleep(0.5)
	device.touch(570,830,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(300,880,'DOWN_AND_UP')
	MonkeyRunner.sleep(6)
	de.touch(400,200,'DOWN_AND_UP')
	if checkpic.keyCheck(device,caseName,1,1,'menu')==0:
		return 0
	de.touch(240,300,'DOWN_AND_UP')
	device.touch(40,40,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	de.touch(240,800,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	device.touch(350,920,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,600,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(300,350,'DOWN_AND_UP')
	MonkeyRunner.sleep(0.5)
	device.touch(500,920,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(220,120,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	if checkpic.keyCheck(device,caseName,1,2,'menu')==0:
		return 0
	device.touch(300,400,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	if checkpic.keyCheck(device,caseName,1,3,'Pinfo')==0:
		return 0
	device.touch(430,630,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	device.touch(430,630,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	device.touch(430,630,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	device.touch(430,630,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	device.touch(430,630,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	if checkpic.keyCheck(device,caseName,1,4,'Pinfo')==0:
		return 0
	device.touch(550,80,'DOWN_AND_UP')
	de.touch(260,840,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	de.touch(180,80,'DOWN_AND_UP')
	device.touch(40,40,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	de.touch(130,280,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	de.touch(360,570,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	de.touch(360,570,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	de.touch(360,570,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	de.touch(360,570,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	de.touch(360,570,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	de.touch(440,70,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	de.touch(30,30,'DOWN_AND_UP')
	device.touch(350,920,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(220,120,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(300,400,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	if checkpic.keyCheck(device,caseName,1,5,'Pinfo')==0:
		return 0
	device.touch(420,760,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	if checkpic.keyCheck(device,caseName,1,6,'menu')==0:
		return 0
	device.touch(90,120,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.touch(460,920,'DOWN_AND_UP')
	MonkeyRunner.sleep(1.5)
	device.touch(170,680,'DOWN_AND_UP')
	MonkeyRunner.sleep(5)
	if checkpic.picCompare(device,caseName,0.9,7)==0:
		return 0
	device.touch(350,920,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	#if checkpic.keyCheck(device,caseName,1,8,'menu')==0:
		#return 0
	device.touch(300,380,'DOWN_AND_UP')
	MonkeyRunner.sleep(4)
	device.touch(170,210,'DOWN_AND_UP')
	MonkeyRunner.sleep(2)
	device.type('joe')
	MonkeyRunner.sleep(0.5)
	device.touch(570,830,'DOWN_AND_UP')
	MonkeyRunner.sleep(0.5)
	device.touch(570,830,'DOWN_AND_UP')
	MonkeyRunner.sleep(1)
	device.touch(490,210,'DOWN_AND_UP')
	MonkeyRunner.sleep(3)
	if checkpic.keyCheck(device,caseName,0.99,8,'menu')==0:
		return 0
	device.touch(40,40,'DOWN_AND_UP')

if __name__=='__main__':
	#init()
	execute()