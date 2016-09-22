#encoding:utf-8
from __future__ import division
import sys
from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice, MonkeyImage
import pprint
#def picCompare(imageA,imageB,width,high,factor):
#    i=0
#    Rc=Gc=Bc=0
#    Total=255*width*high/4
#    while i<width:
#        j=0
#        while j<high:
#            cc=imageA.getRawPixel(i,j)
#            dd=imageB.getRawPixel(i,j)
#           Rc=Rc+abs(cc[1]-dd[1])
#           Gc=Gc+abs(cc[2]-dd[2])
#            Bc=Bc+abs(cc[3]-dd[3])
#            j=j+2
#        i=i+2
#    Rsub=Rc/Total
#   Gsub=Gc/Total
#   Bsub=Bc/Total
#    picSame=1-(Rsub+Gsub+Bsub)/3
#   if picSame>factor:
#        return 1
#    else:
#       return 0
key_list=[{'name':'foodProduction','x':240,'y':250,'width':30,'height':110},
{'name':'woodProduction','x':390,'y':250,'width':30,'height':110},
{'name':'stoneProduction','x':530,'y':250,'width':30,'height':110},
{'name':'oreProduction','x':675,'y':250,'width':30,'height':110},
{'name':'GoldProduction','x':815,'y':250,'width':30,'height':110}]
def keyCheck(device,caseName,factor,checkNum,kname):
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
	imageB=device.takeSnapshot()
	while i<x+width:
		j=y
		while j<y+height:
			pA=imageA.getRawPixel(i,j)
			pB=imageB.getRawPixel(i,j)
			Rc=Rc+abs(pA[1]-pB[1])
			Gc=Gc+abs(pA[2]-pB[2])
			Bc=Bc+abs(pA[3]-pB[3])
			j=j+1
		i=i+1
	Rsub=Rc/Total
	Gsub=Gc/Total
	Bsub=Bc/Total
	picSame=1-(Rsub+Gsub+Bsub)/3
	print picSame
	if picSame>factor:
		pprint.pprint('pass')
	else:
		pprint.pprint('fail')