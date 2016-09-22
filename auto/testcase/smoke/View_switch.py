from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice, MonkeyImage
import checkpic
import pprint
caseName='View_switch'

device = MonkeyRunner.waitForConnection()
device.touch(50,920,'DOWN_AND_UP')
MonkeyRunner.sleep(3)
checkpic.picCompare(device,caseName,0.9,1)
device.touch(50,920,'DOWN_AND_UP')
MonkeyRunner.sleep(3)
checkpic.picCompare(device,caseName,0.9,2)
device.touch(50,920,'DOWN_AND_UP')
MonkeyRunner.sleep(3)
checkpic.picCompare(device,caseName,0.9,3)
for i in range(30):
	device.touch(50,920,'DOWN_AND_UP')
	MonkeyRunner.sleep(0.3)
MonkeyRunner.sleep(0.5)
checkpic.picCompare(device,caseName,0.9,4)
for i in range(31):
	device.touch(50,920,'DOWN_AND_UP')
	MonkeyRunner.sleep(0.3)
MonkeyRunner.sleep(0.5)
checkpic.picCompare(device,caseName,0.9,5)
for i in range(31):
	device.touch(50,920,'DOWN_AND_UP')
	MonkeyRunner.sleep(0.3)
MonkeyRunner.sleep(0.5)
checkpic.picCompare(device,caseName,0.9,6)
device.touch(50,920,'DOWN_AND_UP')
MonkeyRunner.sleep(0.3)
