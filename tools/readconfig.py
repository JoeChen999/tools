     # -*- coding:utf-8 -*-  
    #desc: use to read ini  
    #---------------------   
    
import sys
import os
import time
import ConfigParser
class Configini(ConfigParser.ConfigParser):
    def optionxform(self, optionstr):
        return optionstr
      
class ReadConfig:  
        def __init__(self, path):  
            self.path = path  
            self.cf = Configini()
            self.cf.read(self.path)  
        def showkey(self):    
            result=""
            try:
                result = self.cf.options("baseconf")
            except:
                result = ""
            return result
        def get(self, field, key):  
            result = ""  
            try:  
                result = self.cf.get(field, key)  
            except:  
                result = ""  
            return result  
        def set(self, field, key, value):  
            try:  
                self.cf.set(field, key, value)  
                self.cf.write(open(self.path,'w'))  
            except:  
                return False  
            return True  
        def showSections(self):
            result=""
            try:
                result = self.cf.sections()
            except:
                result = ""
            return result
        def removeOption(self, section, option):
            try:
                self.cf.remove_option(section, option)
                self.cf.write(open(self.path,'w'))
            except:
                return False
            return True
                  
                  
""""      
def read_config(config_file_path, field, key):   
        cf = ConfigParser.ConfigParser()  
        try:  
            cf.read(config_file_path)  
            result = cf.get(field, key)  
        except:  
            sys.exit(1)  
        return result  
      
def write_config(config_file_path, field, key, value):  
        cf = ConfigParser.ConfigParser()  
        try:  
            cf.read(config_file_path)  
            cf.set(field, key, value)  
            cf.write(open(config_file_path,'w'))  
        except:  
            sys.exit(1)  
        return True  

if __name__ == "__main__":  
       if len(sys.argv) < 4:  
          sys.exit(1)  
      
       config_file_path = sys.argv[1]   
       field = sys.argv[2]  
       key = sys.argv[3]  
       if len(sys.argv) == 4:  
          print read_config(config_file_path, field, key)  
       else:  
          value = sys.argv[4]  
          write_config(config_file_path, field, key, value)  
"""

