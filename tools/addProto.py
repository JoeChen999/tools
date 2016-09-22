# -*- coding: utf-8 -*-

"""
Module implementing Dialog.
"""
from PyQt4.QtGui import *
from PyQt4.QtCore import *
from PyQt4 import QtGui

from Ui_addProto import Ui_Dialog
import readconfig

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
        self.pushButton.connect(self.pushButton, SIGNAL("clicked()"), self.pushButton_clicked)
        
    def pushButton_clicked(self):
        name=self.textEdit.toPlainText()
        name=str(name)
        data=self.textEdit_2.toPlainText()
        data=str(data)
        db=readconfig.ReadConfig('./conf/db_config.ini')
        db.set('baseconf', name, data)
        self.close()
        
