# -*- coding: utf-8 -*-

# Form implementation generated from reading ui file '/Users/chenbiao/Documents/workspaces/tools/treetest.ui'
#
# Created: Wed Jul 31 17:11:51 2013
#      by: PyQt4 UI code generator 4.10.2
#
# WARNING! All changes made in this file will be lost!

from PyQt4 import QtCore, QtGui
from PyQt4.QtGui import *
from PyQt4.QtCore import *

try:
    _fromUtf8 = QtCore.QString.fromUtf8
except AttributeError:
    def _fromUtf8(s):
        return s

try:
    _encoding = QtGui.QApplication.UnicodeUTF8
    def _translate(context, text, disambig):
        return QtGui.QApplication.translate(context, text, disambig, _encoding)
except AttributeError:
    def _translate(context, text, disambig):
        return QtGui.QApplication.translate(context, text, disambig)

class Ui_Dialog(object):
    def setupUi(self, Dialog):
        Dialog.setObjectName(_fromUtf8("Dialog"))
        Dialog.resize(516, 414)
        treeWidget = QtGui.QTreeWidget(Dialog)
        treeWidget.setGeometry(QtCore.QRect(0, 0, 256, 411))
        treeWidget.setObjectName(_fromUtf8("treeWidget"))
        treeWidget.headerItem().setText(0, _fromUtf8("key"))
        treeWidget.headerItem().setText(1, _fromUtf8("value"))
        treeWidget.setColumnCount(2)
        
        self.retranslateUi(Dialog)
        QtCore.QMetaObject.connectSlotsByName(Dialog)
        #tree=QTreeWidget()
        

    def retranslateUi(self, Dialog):
        Dialog.setWindowTitle(_translate("Dialog", "Dialog", None))


if __name__ == "__main__":
    import sys
    app = QtGui.QApplication(sys.argv)
    Dialog = QtGui.QDialog()
    ui = Ui_Dialog()
    ui.setupUi(Dialog)
    Dialog.show()
    sys.exit(app.exec_())

