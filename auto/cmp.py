from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice, MonkeyImage
imageA=MonkeyRunner.loadImageFromFile('/Users/chenbiao/Desktop/auto/pic/Chat_2.png')
imageB=MonkeyRunner.loadImageFromFile('/Users/chenbiao/Desktop/auto/fault/error_Chat_2_1.png')
x=0
i=x
y=370
width=450
height=90
Total=255*width*height/4
Rc=Gc=Bc=0.0
while i<x+width:
	j=y
	while j<y+height:
		pA=imageA.getRawPixel(i,j)
		pB=imageB.getRawPixel(i,j)
		r=abs(pA[1]-pB[1])
		g=abs(pA[2]-pB[2])
		b=abs(pA[3]-pB[3])
		Rc=Rc+r
		Gc=Gc+g
		Bc=Bc+b
		if((pA[1]-pB[1])!=0) or ((pA[2]-pB[2])!=0) or ((pA[3]-pB[3])!=0):
			print i,j,r,g,b
		j=j+1
	i=i+1
Rsub=Rc/Total
Gsub=Gc/Total
Bsub=Bc/Total
print Rc,Gc,Bc,Rsub,Gsub,Bsub
picSame=1-(Rsub+Gsub+Bsub)/3
print picSame
		