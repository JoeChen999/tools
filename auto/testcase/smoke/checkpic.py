#encoding:utf-8
from __future__ import division
import os
from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice, MonkeyImage
import pprint
import conf


isRecord=conf.getIsRecord()

#imageB=device.takeSnapshot()

key_list=[{'name':'foodProduction','x':240,'y':250,'width':30,'height':110},
{'name':'woodProduction','x':390,'y':250,'width':30,'height':110},
{'name':'stoneProduction','x':530,'y':250,'width':30,'height':110},
{'name':'oreProduction','x':675,'y':250,'width':30,'height':110},
{'name':'GoldProduction','x':815,'y':250,'width':30,'height':110},
{'name':'menu','x':80,'y':0,'width':900,'height':600},
{'name':'Name','x':180,'y':180,'width':50,'height':240},
{'name':'world','x':250,'y':25,'width':150,'height':550},
{'name':'Pinfo','x':240,'y':0,'width':740,'height':600},
{'name':'allianceList','x':250,'y':25,'width':620,'height':550},
{'name':'taxRate','x':310,'y':450,'width':50,'height':90},
{'name':'production','x':250,'y':30,'width':330,'height':540},
{'name':'resourceInfo','x':250,'y':30,'width':570,'height':540},
{'name':'buffIcon','x':170,'y':0,'width':50,'height':210},
{'name':'selfChat','x':350,'y':80,'width':120,'height':520},
{'name':'mailContent','x':320,'y':0,'width':550,'height':600},
{'name':'mailList','x':180,'y':270,'width':340,'height':330},
{'name':'mailSubject','x':150,'y':0,'width':130,'height':600},
{'name':'selfChat','x':360,'y':80,'width':110,'height':510},
{'name':'othersChat','x':0,'y':370,'width':450,'height':90}
]

		
def picCompare(device,caseName,factor,checkNum):
	width=conf.getWidth()
	height=conf.getHeight()
	num=0
	imageB=device.takeSnapshot()
	pprint.pprint('------------------------------%s:checkNum:%d\n'%(caseName,checkNum))
	if(isRecord==False):
		i=0
		Rc=Gc=Bc=0
		Total=255*width*height/4
		imageA=MonkeyRunner.loadImageFromFile('/Users/chenbiao/Desktop/auto/pic/%s_%d.png'%(caseName,checkNum))
		while i<width:
			j=0
			while j<height:
				cc=imageA.getRawPixel(i,j)
				dd=imageB.getRawPixel(i,j)
				Rc=Rc+abs(cc[1]-dd[1])
				Gc=Gc+abs(cc[2]-dd[2])
				Bc=Bc+abs(cc[3]-dd[3])
				j=j+2
			i=i+2
		Rsub=Rc/Total
		Gsub=Gc/Total
		Bsub=Bc/Total
		picSame=1-(Rsub+Gsub+Bsub)/3
		print picSame
		if picSame>=factor:
			pprint.pprint('pass')
			return 1
		else:
			pprint.pprint('fail')
			while os.path.isfile('/Users/chenbiao/Desktop/auto/fault/error_%s_%d_%d.png' %(caseName,checkNum,num)):
				num=num+1
			imageB.writeToFile('/Users/chenbiao/Desktop/auto/fault/error_%s_%d_%d.png' %(caseName,checkNum,num),'png')
			return 0
	else:
		imageB.writeToFile('/Users/chenbiao/Desktop/auto/pic/%s_%d.png'%(caseName,checkNum),'png')
		return 1

def compare(imageA,imageB,factor):
	i=0
	Rc=Gc=Bc=0
	Total=255*width*height/4
	while i<width:
		j=0
		while j<height:
			cc=imageA.getRawPixel(i,j)
			dd=imageB.getRawPixel(i,j)
			Rc=Rc+abs(cc[1]-dd[1])
			Gc=Gc+abs(cc[2]-dd[2])
			Bc=Bc+abs(cc[3]-dd[3])
			j=j+2			
		i=i+2
	Rsub=Rc/Total
	Gsub=Gc/Total
	Bsub=Bc/Total
	picSame=1-(Rsub+Gsub+Bsub)/3
	if picSame>factor:
		return 1
	else:
		return 0
		
def picCheck(device,caseName,factor,checkNum):
	imageB=device.takeSnapshot()
	imageA=MonkeyRunner.loadImageFromFile('/Users/chenbiao/Desktop/auto/pic/%s_%d.png'%(caseName,checkNum))
	if compare(imageA,imageB,factor):
		pprint.pprint('pass')
	else:
		device.press('KEYCODE_BACK','DOWN_AND_UP')
		if compare(imageA,imageB,factor):
			pprint.pprint('pass')
		else:
			pprint.pprint('fail')
			imageB.writeToFile('/Users/chenbiao/Desktop/auto/fault/error_%s_%d.png' %(caseName,checkNum),'png')

def keyCheck(device,caseName,factor,checkNum,kname):
	num=0
	imageB=device.takeSnapshot()
	pprint.pprint('------------------------------%s:checkNum:%d\n'%(caseName,checkNum))
	if isRecord==False:
		for key in key_list:
			if key['name']==kname:
				x=key['x']
				y=key['y']
				width=key['width']
				height=key['height']
				break			
		i=x
		Rc=Gc=Bc=0
		Total=255*width*height/4
		imageA=MonkeyRunner.loadImageFromFile('/Users/chenbiao/Desktop/auto/pic/%s_%d.png'%(caseName,checkNum))
		while i<x+width:
			j=y
			while j<y+height:
				pA=imageA.getRawPixel(i,j)
				pB=imageB.getRawPixel(i,j)
				r=abs(pA[1]-pB[1])
				g=abs(pA[2]-pB[2])
				b=abs(pA[3]-pB[3])
				if r+g+b>25:
					Rc=Rc+r
					Gc=Gc+g
					Bc=Bc+b
				#if(r!=0) or (g!=0) or (b!=0):
					print i,j,r,g,b
				j=j+1
			i=i+1
		Rsub=Rc/Total
		Gsub=Gc/Total
		Bsub=Bc/Total
		picSame=1-(Rsub+Gsub+Bsub)/3
		print picSame
		if picSame>=factor:
			pprint.pprint('pass')
			return 1
		else:
			pprint.pprint('fail')
			while os.path.isfile('/Users/chenbiao/Desktop/auto/fault/error_%s_%d_%d.png' %(caseName,checkNum,num)):
				num=num+1
			imageB.writeToFile('/Users/chenbiao/Desktop/auto/fault/error_%s_%d_%d.png' %(caseName,checkNum,num),'png')
			return 0
	else:
		imageB.writeToFile('/Users/chenbiao/Desktop/auto/pic/%s_%d.png'%(caseName,checkNum),'png')
		return 1

if __name__ == "__main__":
	device = MonkeyRunner.waitForConnection()
	picCheck(device,'View_switch',0.95,3)
