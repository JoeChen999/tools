import commands
import  sys
import os
import ConfigParser

rootDir='/opt/git/code/kbn/'
VerFile=rootDir+'versions.ini'
branch=sys.argv[1]
gameVer=sys.argv[2]

def getGitLog(branch, gameVer):
    os.chdir(rootDir)
    cf = ConfigParser.ConfigParser()
    try:
        cf.read(VerFile)
    except:
        print "there's no version record file"
        return 0
    branches=commands.getoutput('git branch')
    checkout=commands.getoutput('git checkout %s'%branch)
    suc=checkout.find('error')
    if suc>=0:
        print "wrong branch name,branch options:\n%s"%branches
        return 0
    gameVersions=cf.sections()
    index=0
    for v in gameVersions:
        if v==gameVer:
            commit=cf.get(v, 'commit')
            break
        index+=1
    if index==0:
        print "there is no record about this version"
        return 0
    elif index==len(gameVersions):
        pullResult=commands.getoutput('git pull')
        upResult=commands.getoutput('git log -1')
        #print upResult
        commit=upResult[7:14]
        cf.add_section(gameVer)
        cf.set(gameVer, 'commit',commit)
        cf.set(gameVer, 'branch',branch)
        cf.write(open(VerFile,'w'))
    oldcommit=''
    for i in range(1, index):
        if branch==cf.get(gameVersions[index-i], 'branch'):
            oldcommit=cf.get(gameVersions[index-i], 'commit')
            break
    logData=commands.getoutput('git log --pretty=format:"%%n_author_: %%an%%n__date__: %%aD%%n%%n%%s%%n%%b%%n============================================" %s..%s'%(oldcommit, commit))
    print  logData
    return 1

if __name__=="__main__":
    result=getGitLog(branch, gameVer)
    if result!=1:
        print "exception occured"
