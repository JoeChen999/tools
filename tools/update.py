# -*- coding: utf-8 -*-

"""
Module implementing Dialog.
"""

from PyQt4.QtGui import *
from PyQt4.QtCore import *
from PyQt4 import QtGui
import urllib2
import os

from Ui_update import Ui_Dialog

class Dialog(QDialog, Ui_Dialog):
    """
    Class documentation goes here.
    """
    def __init__(self, parent = None):
        """
        Constructor
        """
        QDialog.__init__(self, parent)
        self.setupUi(self)
        f=open('./conf/host','r')
        Host=f.readline()
        Host=Host[:len(Host)-1]
        self.textEdit.setText(Host)
        self.pushButton.connect(self.pushButton, SIGNAL("clicked()"), self.pushButton_clicked)
        self.commandLinkButton.connect(self.commandLinkButton, SIGNAL("clicked()"), self.commandLinkButton_clicked)
        
    def pushButton_clicked(self):
        ip=self.textEdit.toPlainText()
        ip=str(ip)
        url=ip+'/script'
        try:
            files=self.getFiles(url)
        except:
            QtGui.QMessageBox.information(self, 'Information', self.tr('server error occured'))
        for file in files:
            if file[0]!='.':
                full_url='http://'+url+'/%s'%file
                try:
                    data=urllib2.urlopen(full_url)
                except:
                    QtGui.QMessageBox.information(self, 'Information', self.tr('server error occured'))
                Data=data.read()
                f=open('./script/%s'%file,'w')
                f.write(Data)
                f.close()
        url=ip+'/conf'
        files=self.getFiles(url)
        for file in files:
            if file[0]!='.':
                full_url='http://'+url+'/%s'%file
                try:
                    data=urllib2.urlopen(full_url)
                except:
                    QtGui.QMessageBox.information(self, 'Information', self.tr('server error occured'))
                Data=data.read()
                f=open('./conf/%s'%file,'w')
                f.write(Data)
                f.close()
        QtGui.QMessageBox.information(self, 'Information', self.tr('update has succeeded,please restart QATools...'))
        self.close()
        
    def commandLinkButton_clicked(self):
        ip=self.textEdit.toPlainText()
        ip=str(ip)
        url=ip+'/dist/phpTest.tar.gz'
        full_url='http://'+url
        try:
            data=urllib2.urlopen(full_url)
        except:
            QtGui.QMessageBox.information(self, 'Information', self.tr('server error occured'))
        Data=data.read()
        f=open('../../../phpTest.tar.gz','w')
        f.write(Data)
        f.close()
        #os.system('rm -rf ../../../phpTest.app')
        os.system('tar -zxvf ../../../phpTest.tar.gz -C ../../../')
        QtGui.QMessageBox.information(self, 'Information', self.tr('downloading has completed'))
        self.close()
        
    def getFiles(self, url):
        full_url='http://'+url
        data=urllib2.urlopen(full_url)
        Data=data.read()
        file=open('./test.py','w')
        file.write(Data)
        file.close()
        Data='files='+Data
        exec(Data)
        return files
        
        
