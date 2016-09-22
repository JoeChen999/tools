# -*- coding: utf-8 -*-

"""
Module implementing Dialog.
"""

from PyQt4.QtGui import *
from PyQt4.QtCore import *
from PyQt4 import QtGui
import sys
import os
import commands
import thread

from Ui_couput import Ui_Dialog

class Dialog(QDialog, Ui_Dialog):
    """
    Class documentation goes here.
    """
    def __init__(self, autoUrl, parent = None):
        """
        Constructor
        """
        QDialog.__init__(self, parent)
        self.setupUi(self)
        thread.start_new_thread(self.run, (autoUrl, ))
        
    def run(self, autoUrl):
        os.chdir(autoUrl)
        result=commands.getoutput('python %s/run.py %s'%(autoUrl, autoUrl))
        self.textBrowser.append(result)
        """i=0
        while self.listWidget.item(i)!=None:
            item=self.listWidget.item(i)
            a=item.text()
            self.textBrowser.append(a)
            i+=1"""
        
            
if __name__=='__main__':
    app=QtGui.QApplication(sys.argv)
    myapp=Dialog()
    myapp.show()
    sys.exit(app.exec_())
