# -*- coding: utf-8 -*-

"""
Module implementing Dialog.
"""

from PyQt4.QtGui import *
from PyQt4.QtCore import *
from PyQt4 import QtGui
import sys

from Ui_treetest import Ui_Dialog

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
        for n in range(3):
            i=QTreeWidgetItem(self.treeWidget)
            i.setText(0, 'first'+str(n))
            i.setText(1, 'second')
            for m in range(3):
                j=QTreeWidgetItem(i)
                j.setText(0, 'child first'+str(m))
        b1=QCheckBox('push me 0', self.treeWidget)
        self.treeWidget.setItemWidget(self.treeWidget.topLevelItem(0).child(1), 1, b1)

if __name__=='__main__':
    app=QtGui.QApplication(sys.argv)
    dialog=Dialog()
    dialog.show()
    app.exec_()
