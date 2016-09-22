import  sys
import os
import commands

rootDir='/opt/git/code/kbn/'
branchName=sys.argv[1]
env=sys.argv[2]
codeDir='/opt/www/mobile1/'+env+'/fb/'

if not os.path.isdir(codeDir):
    print 'environment name error'
    exit()

def checkBranch(branchName):
    os.chdir(rootDir)
    os.system('git fetch')
    branches=commands.getoutput('git branch -r')
    branches=branches.split('\n')
    isBranch=0
    for branch in branches:
        if branch[9:]==branchName:
            isBranch=1
            break
    localBranches=commands.getoutput('git branch')
    localBranches=localBranches.split('\n')
    for branch in localBranches:
        if branch[2:]==branchName:
            isBranch=2
            break
    if isBranch==0:
        print branchName
        print 'branch name error!!'
        exit()
    return isBranch
    
def codeUpdate(isBranch, env):
    result=''
    if isBranch==1:
        checkout=commands.getoutput('git checkout -b %s origin/%s'%(branchName, branchName))
        result+=checkout
    elif isBranch==2:
        checkout=commands.getoutput('git checkout %s'%branchName)
        result+=checkout
    update=commands.getoutput('git pull')
    result+=update
    result+='\n<---------------copy files--------------------->\n'
    copy=commands.getoutput('cp -vr %sserver/fb /opt/www/mobile1/%s'%(rootDir, env))
    result+=copy
    print result

if __name__=='__main__':
    isBranch=checkBranch(branchName)
    codeUpdate(isBranch, env)
    
    
