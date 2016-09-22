import os
import sys
path=sys.argv
os.chdir(path[1])
os.system('monkeyrunner recorder.py')
file_in=open('test')
file_out=open('testcase.txt','w')
file_out.write('from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice, MonkeyImage\n')
file_out.write('device = MonkeyRunner.waitForConnection()\n')
file_list=file_in.readlines()
for file_line in file_list:
	s=file_line.split('|')
	act=s[0]
	argv=eval(s[1])
	if cmp(act,'TOUCH')==0:
		file_out.write('device.touch'+'('+str(argv['x'])+','+str(argv['y'])+','+str(argv['type'])+')\n')
	elif cmp(act,'PRESS')==0:
		file_out.write('device.press'+'('+str(argv['name'])+','+str(argv['type'])+')\n')
	elif cmp(act,'TYPE')==0:
		file_out.write('device.type'+'('+str(argv['message'])+')\n')
	elif cmp(act,'WAIT')==0:
		file_out.write('MonkeyRunner.sleep'+'('+str(argv['seconds'])+')\n')
	elif cmp(act,'DRAG')==0:
		file_out.write('device.drag'+'('+str(argv['start'])+','+str(argv['end'])+','+str(argv['duration'])+','+str(argv['steps'])+')\n')
file_in.close()
file_out.close()
