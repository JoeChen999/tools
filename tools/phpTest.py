# -*- coding: utf-8 -*-
import PyQt4
from PyQt4.QtGui import *
from PyQt4.QtCore import *
from PyQt4 import QtGui
import sys
import protocol
import httplib
import base64
import os
import thread
import threading
import readconfig
import commands
import couput
import update
import addProto
import unzip

from Ui_tools import Ui_MainWindow

class MainWindow(QMainWindow, Ui_MainWindow):
    pname = ''
    def __init__(self, parent = None):
        QMainWindow.__init__(self, parent)
        self.setupUi(self)
        self.textEdit_3.setText('www8.cmqa3.kabam.asia')
        self.autoUrlEdit.setText('/Users/chenbiao/Desktop/auto')
        self.URLText.setText('www1.cmqa3.kabam.asia')
        lm=MyListModel('./conf/db_config.ini', 1)
        self.listView.setModel(lm)
        self.listView.connect(self.listView, SIGNAL("clicked(QModelIndex)"), self.getCurrentIndex)
        slm=MyListModel('./conf/script_config.ini', 0)
        self.listView_2.setModel(slm)
        self.listView_2.connect(self.listView_2, SIGNAL("clicked(QModelIndex)"), self.getScriptDetail)
        self.pushButton.connect(self.pushButton, SIGNAL("clicked()"), self.pushButton_clicked)
        self.pushButton_3.connect(self.pushButton_3, SIGNAL("clicked()"), self.b64decodeButton_clicked)
        self.runButton.connect(self.runButton, SIGNAL("clicked()"), self.runButton_clicked)
        self.generateScriptButton.connect(self.generateScriptButton, SIGNAL("clicked()"), self.generateScriptButton_clicked)
        self.runScriptBtn.connect(self.runScriptBtn, SIGNAL("clicked()"), self.runScriptBtn_clicked)
        self.addProtoBuf.connect(self.addProtoBuf, SIGNAL("clicked()"), self.addProtoBuf_clicked)
        self.deleteProtoBuf.connect(self.deleteProtoBuf, SIGNAL("clicked()"), self.deleteProtoBuf_clicked)
        self.refreshList.connect(self.refreshList, SIGNAL("clicked()"), self.refreshList_clicked)
        self.actionImport.connect(self.actionImport, SIGNAL("triggered()"), self.actionImport_triggered)
        self.actionExport.connect(self.actionExport, SIGNAL("triggered()"), self.actionExport_triggered)
        """for n in range(3):
            i=QTreeWidgetItem(self.treeWidget)
            i.setText(0, 'first'+str(n))
            i.setText(1, 'second')
            for m in range(3):
                j=QTreeWidgetItem(i)
                j.setText(0, 'child first'+str(m))
        b1=QCheckBox('push me 0', self.treeWidget)
        self.treeWidget.setItemWidget(self.treeWidget.topLevelItem(0).child(1), 1, b1)"""
    @pyqtSignature("bool")
    
    def on_actionUpdate_triggered(self):
        updateInfo = update.Dialog()
        updateInfo.show()
        updateInfo.exec_()
    def actionImport_triggered(self):
        dlg = PyQt4.QtGui.QFileDialog(self) 
        filename = dlg.getOpenFileName(self, self.tr('choose your configuration'), '/', self.tr("ini Files (*.ini)"))
        fn = str(filename)
        ok=commands.getoutput('cp %s ./conf/db_config.ini'%fn)
        lm=MyListModel('./conf/db_config.ini', 1)
        self.listView.setModel(lm)
    def actionExport_triggered(self):
        dlg = PyQt4.QtGui.QFileDialog(self) 
        pathname = dlg.getExistingDirectory()
        pn = str(pathname)
        ok=commands.getoutput('cp ./conf/db_config.ini %s'%pn)
    def refreshList_clicked(self):
        lm=MyListModel('./conf/db_config.ini', 1)
        self.listView.setModel(lm)
    def addProtoBuf_clicked(self):
        addProtoDlg = addProto.Dialog()
        addProtoDlg.show()
        addProtoDlg.exec_()
        lm=MyListModel('./conf/db_config.ini', 1)
        self.listView.setModel(lm)
    def deleteProtoBuf_clicked(self):
        conf=readconfig.ReadConfig('./conf/db_config.ini')
        ret=conf.removeOption('baseconf', self.pname)
        if ret:
            lm=MyListModel('./conf/db_config.ini', 1)
            self.listView.setModel(lm)
    def getCurrentIndex(self, index):
        #global pname
        #counter=0
        #while counter < MyListModel('./conf/db_config.ini').rowCount():
            #if index.row()==counter:
                #pname=MyListModel('./conf/db_config.ini')._data[counter]
                #break
            #counter+=1
 #       pname=self.textEdit_4.toPlainText()
 #       pname=pname.toUtf8()
        self.pname=MyListModel('./conf/db_config.ini', 1)._data[index.row()]
        self.textEdit_4.setText(self.pname)
        pdata=protocol.getdata(self.pname)
        self.textEdit.setText(pdata)

    def pushButton_clicked(self):
        data=self.textEdit.toPlainText()
        loop=self.textEdit_2.toPlainText()
        if loop!='':
            loops=int(loop)
        else:
            loops=1
        pname=self.textEdit_4.toPlainText()
        serverUrl=self.textEdit_3.toPlainText()
        pname=pname.toUtf8()
        serverUrl=str(serverUrl)
        if pname=='':
            QtGui.QMessageBox.information(self, 'Information', self.tr('please Input protocol name'))
            return 0
        if serverUrl=='':
            QtGui.QMessageBox.information(self, 'Information', self.tr('please Input server Url'))
            return 0
        params='data='+protocol.generateParams(data)+'&vcs=15.0.0'
        headers={'Host':serverUrl, 
                 'User-Agent':'Camelot/15.0.0 CFNetwork/485.13.9 Darwin/11.0.0', 
                 'Content-Length':len(params), 
                 'Content-Type':'application/x-www-form-urlencoded', 
                 'Accept':'*/*', 
                 'Accept-Language':'en-us', 
                 'Accept-Encoding':'gzip,deflate',
                 'Connection':'keep-alive'
                 }
        conn=httplib.HTTPConnection(serverUrl)
        for i in range(loops):
            conn.request('POST', '/ajax/%s'%pname, params, headers)
            result=conn.getresponse()
            data=result.read()
            try:
                rdata=unzip.unzip(data)
            except:
                rdata=data
            self.textBrowser.append(rdata)
            
    def on_pushButton_2_clicked(self):
        self.textBrowser.setText('')
    
    def on_clearScriptResponse_clicked(self):
        self.scriptResponse.setText('')
                
    def b64decodeButton_clicked(self):
        b64data=self.textEdit_5.toPlainText()
        try:
            b64data=str(b64data)
            UrlData=base64.b64decode(b64data)
        except:
             QtGui.QMessageBox.information(self, 'Information', self.tr('please Input base64 encoded data'))  
        else:
            self.textBrowser_2.setText(UrlData)   
            
    def on_openButton_clicked(self):
        autoUrl=self.autoUrlEdit.toPlainText()
        autoUrl=str(autoUrl)
        file=open('%s/testcases.xml'%autoUrl)
        content=file.read()
        self.testPlanEdit.setText(content)
        file.close()
    
    def on_saveButton_clicked(self):
        autoUrl=self.autoUrlEdit.toPlainText()
        autoUrl=str(autoUrl)
        content=self.testPlanEdit.toPlainText()
        file=open('%s/testcases.xml'%autoUrl, 'w')
        file.write(content)
        file.close()
        
    def  runButton_clicked(self):
        #thread.start_new_thread(self.showLog, ())
        autoUrl=self.autoUrlEdit.toPlainText()
        autoUrl=str(autoUrl)
        log = couput.Dialog(autoUrl)
        log.show()
        log.exec_()
        
    def run(self):
        autoUrl=self.autoUrlEdit.toPlainText()
        autoUrl=str(autoUrl)
        os.chdir(autoUrl)
        os.system('python %s/run.py %s'%(autoUrl, autoUrl))
     
    def generateScriptButton_clicked(self):
        thread.start_new_thread(self.generateScript, ())
        
    def generateScript(self):
        autoUrl=self.autoUrlEdit.toPlainText()
        autoUrl=str(autoUrl)
        #os.chdir("%s/generateScript"%autoUrl)
        #os.system('monkeyrunner %s/generateScript/recorder.py'%autoUrl)
        os.system('python %s/generateScript/generateScript.py %s/generateScript/'%(autoUrl, autoUrl))
    
    def getScriptDetail(self, index):
        global sname 
        sname=MyListModel('./conf/script_config.ini', 0)._data[index.row()]
        arguExample=readconfig.ReadConfig("./conf/script_config.ini").get("%s"%sname, 'argument')
        description=readconfig.ReadConfig("./conf/script_config.ini").get("%s"%sname, 'description')
        self.argumentText.setText(arguExample)
        self.descriptionText.setText(description)
     
    def runScriptBtn_clicked(self):
        #sname='privatechat'
        argText=self.argumentText.toPlainText()
        argText=str(argText)
        Host=self.URLText.toPlainText()
        Host=str(Host)
        result=commands.getoutput('python ./script/%s.py %s %s'%(sname, argText, Host))
        result=result.decode('utf-8')
        try:
            #output=result.read()
            self.scriptResponse.append(result)
        except:
            self.scriptResponse.append("there's no output")
        
    
class MyListModel(QAbstractListModel):
    def __init__(self,path, iskey,  parent=None):
        super(MyListModel, self).__init__(parent)
        if iskey:
            self._data=readconfig.ReadConfig("%s"%path).showkey()
        else:
            self._data=readconfig.ReadConfig("%s"%path).showSections()
        pass
    
    def rowCount(self, parent=QModelIndex()):
        return len(self._data)
    
    def data(self, index, role=Qt.DisplayRole):
        if not index.isValid(): #and role==Qt.DisplayRole:
            return QVariant()
        
        row=index.row()
        if role==Qt.DisplayRole:
            return self._data[row]
        
        else:
            return QVariant()        
    
if __name__=='__main__':
    app=QtGui.QApplication(sys.argv)
    myapp=MainWindow()
    myapp.show()
    sys.exit(app.exec_())
