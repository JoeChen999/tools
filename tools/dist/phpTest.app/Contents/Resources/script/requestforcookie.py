#!/usr/bin/python
# -*- coding:utf-8 -*-
# requestforcookie.py


import os,urllib,urllib2,cookielib,socket

###################################################Configs###############################################################

admin_account = {"username":"qa","password":"qa123qwe"}
game_server_url = "http://www.fortqa3.kabam.asia"
request_time_out = 5

enable_proxy =  False # True #
proxy_url = {"http":"http://10.80.30.120:8888"} # for  proxy like charles


enable_cookie_save_in_file = False
default_header =  {'Content-Type':'application/x-www-form-urlencoded',
        'User-Agent':'ThisIsMyMacBook', 
        'Connection':'keep-alive',
        'Accept-Encoding':'gzip,deflate,sdch'}


###################################################Functions###############################################################
def init_httpopener_cookie_by_login():

    if enable_cookie_save_in_file == True:
        cookie_file = r"cookie.txt" # save in file
        cookie = cookielib.MozillaCookieJar(cookie_file) # save in file
        if os.path.exists(cookie_file): # check file exits
            cookie.load(cookie_file, ignore_discard=True, ignore_expires=True)
    else:
        cookie = cookielib.CookieJar()  # save in memory

    cookie_handler = urllib2.HTTPCookieProcessor(cookie)
    opener = urllib2.build_opener(cookie_handler, urllib2.HTTPHandler)
    url_login =  game_server_url + '/admin/login.php'
    params =  {"uname": admin_account['username'],
              "upasswd":admin_account['password'],
              "cmd" : "login"}
    opener.open(url_login, urllib.urlencode(params))

    cookie_string = ""
    for item in cookie:
        #print item.name,item.value # get cookie successful, and append to the header
        cookie_string += (item.name + "=" + item.value + ";")
        #example --->  'Cookie':'gw_admin_id=MQ%3D%3D; gw_admin_name=YWRtaW4%3D; gw_admin_level=Mw%3D%3D; gw_admin_se=93ec4917030e889788ea76835b30bd18',
    default_header['Cookie'] = cookie_string

    if enable_cookie_save_in_file == True:
        cookie.save(ignore_discard=True,ignore_expires=True)
        
    #return cookie_string
    #urllib2.install_opener(opener)
    #content = urllib2.urlopen(url_login).read()
    #print content
    #print len(content) 

def send_http_request(ext_url,params,request_type='POST'):
    socket.setdefaulttimeout(request_time_out)
    url =  game_server_url + ext_url
    proxy_handler = urllib2.ProxyHandler(proxy_url)
    null_proxy_handler = urllib2.ProxyHandler({})
    if enable_proxy:
        opener = urllib2.build_opener(proxy_handler, urllib2.HTTPHandler)
    else:
        opener = urllib2.build_opener(null_proxy_handler, urllib2.HTTPHandler)

    urllib2.install_opener(opener) # set up global opener
    req = urllib2.Request(url, data=urllib.urlencode(params), headers=default_header)
    req.get_method = lambda: request_type
    try:
        content = urllib2.urlopen(req).read()
        print content
        #print page.headers.items()
    except urllib2.HTTPError, e:
        print "Error Code:", e.code
    except urllib2.URLError, e:
        print "Error Reason:", e.reason
