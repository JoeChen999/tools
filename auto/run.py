import analysexml
import pprint
import sys
from xml.dom import minidom
import os

def read_testcases_xml():
                path=sys.argv
                os.chdir(path[1])
		print 'start'
		filename='testcases.xml'
		doc = minidom.parse(filename)
		root = doc.documentElement
		
		total_loops=int(analysexml.get_attrvalue(root,'loops'))
		i=0
		modules=[]		
		testcases=[]
		for node in root.childNodes:
			if node.nodeType==node.ELEMENT_NODE:
				module={}
				module['name']=node.nodeName
				module['loops']=int(analysexml.get_attrvalue(node,'loops'))
				modules.append(module)
				testcase_nodes = analysexml.get_xmlnode(node,'testcase')
				#print testcase_nodes
				for t_node in testcase_nodes: 
					#print t_node
					testcase={}
					testcase['Name'] = analysexml.get_attrvalue(t_node,'Name')
					testcase['loops'] = int(analysexml.get_attrvalue(t_node,'loops'))
					#print testcase
					#print testcases
					testcases.append(testcase)
					#print testcases
		for i in range(total_loops):
			for module in modules:
				#print module['name']
				for j in range(module['loops']):
					for testcase in testcases:
						for k in range(testcase['loops']):
							#print testcase['Name']
							os.system('monkeyrunner testcase/%s/%s.py'%(module['name'],testcase['Name']))

if __name__ == "__main__":
	read_testcases_xml()
