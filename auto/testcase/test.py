#encoding:utf-8
from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice, MonkeyImage
import checkpic
import pprint
import conf

caseName="test"
sizeRatio=conf.getSizeRatio()
w=sizeRatio['w']
h=sizeRatio['h']
#imageA=MonkeyRunner.loadImageFromFile('//Users//chenbiao//Documents//android-sdk-macosx//tools//shot.png')
device = MonkeyRunner.waitForConnection()

device.touch(400*w,370*h,'DOWN_AND_UP')
pprint.pprint('start')
MonkeyRunner.sleep(7)
device.touch(int(100*h),int(50*w),'DOWN_AND_UP')
MonkeyRunner.sleep(1)
device.press('KEYCODE_C','DOWN_AND_UP')
MonkeyRunner.sleep(0.5)
device.press('KEYCODE_B','DOWN_AND_UP')
MonkeyRunner.sleep(0.5)
device.press('KEYCODE_SPACE','DOWN_AND_UP')
MonkeyRunner.sleep(0.5)
device.press('KEYCODE_DEL','DOWN_AND_UP')
MonkeyRunner.sleep(0.5)
device.press('KEYCODE_1','DOWN_AND_UP')
MonkeyRunner.sleep(0.5)
device.touch(460,400,'DOWN_AND_UP')
MonkeyRunner.sleep(0.5)
device.touch(int(500*h),int(50*w),'DOWN_AND_UP')
MonkeyRunner.sleep(0.5)
device.touch(int(450*h),int(300*w),'DOWN_AND_UP')
MonkeyRunner.sleep(3)
device.touch(int(300*h),int(900*w),'DOWN_AND_UP')
MonkeyRunner.sleep(60)
imageB=device.takeSnapshot()
MonkeyRunner.sleep(3)
device.press('KEYCODE_HOME','DOWN_AND_UP')
MonkeyRunner.sleep(2)
device.touch(150*w,590*h,'DOWN_AND_UP')
MonkeyRunner.sleep(1)
device.touch(250*w,550*h,'DOWN_AND_UP')
MonkeyRunner.sleep(1)
device.touch(1000*w,20*h,'DOWN_AND_UP')

if checkpic.picCompare(imageA,imageB,1024*w,600*h,0.9):
    pprint.pprint('pass')
else:
		pprint.pprint('fail')
		imageB.writeToFile('/Users/chenbiao/Desktop/auto/fault/error_%s.png' %caseName,'png')