package com.facebook.android; class Util {/*

.class public final Lcom/facebook/android/Util;
.super Ljava/lang/Object;
.source "Util.java"


# static fields
.field private static ENABLE_LOG:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x0

    #v0=(Null);
    sput-boolean v0, Lcom/facebook/android/Util;->ENABLE_LOG:Z

    .line 48
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static clearCookies(Landroid/content/Context;)V
    .locals 2
    .parameter "context"

    .prologue
    .line 241
    invoke-static {p0}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    move-result-object v1

    .line 242
    .local v1, cookieSyncMngr:Landroid/webkit/CookieSyncManager;
    #v1=(Reference);
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v0

    .line 243
    .local v0, cookieManager:Landroid/webkit/CookieManager;
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/webkit/CookieManager;->removeAllCookie()V

    .line 244
    return-void
.end method

.method public static decodeUrl(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 9
    .parameter "s"

    .prologue
    const/4 v5, 0x0

    .line 103
    #v5=(Null);
    new-instance v2, Landroid/os/Bundle;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 104
    .local v2, params:Landroid/os/Bundle;
    #v2=(Reference);
    if-eqz p0, :cond_0

    .line 105
    const-string v4, "&"

    #v4=(Reference);
    invoke-virtual {p0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 106
    .local v0, array:[Ljava/lang/String;
    #v0=(Reference);
    array-length v6, v0

    #v6=(Integer);
    move v4, v5

    :goto_0
    #v1=(Conflicted);v3=(Conflicted);v4=(Integer);v7=(Conflicted);v8=(Conflicted);
    if-lt v4, v6, :cond_1

    .line 114
    .end local v0           #array:[Ljava/lang/String;
    :cond_0
    #v0=(Conflicted);v4=(Conflicted);v6=(Conflicted);
    return-object v2

    .line 106
    .restart local v0       #array:[Ljava/lang/String;
    :cond_1
    #v0=(Reference);v4=(Integer);v6=(Integer);
    aget-object v1, v0, v4

    .line 107
    .local v1, parameter:Ljava/lang/String;
    #v1=(Null);
    const-string v7, "="

    #v7=(Reference);
    invoke-virtual {v1, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 108
    .local v3, v:[Ljava/lang/String;
    #v3=(Reference);
    array-length v7, v3

    #v7=(Integer);
    const/4 v8, 0x2

    #v8=(PosByte);
    if-ne v7, v8, :cond_2

    .line 109
    aget-object v7, v3, v5

    #v7=(Null);
    invoke-static {v7}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 110
    #v7=(Reference);
    const/4 v8, 0x1

    #v8=(One);
    aget-object v8, v3, v8

    #v8=(Null);
    invoke-static {v8}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 109
    #v8=(Reference);
    invoke-virtual {v2, v7, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    :cond_2
    #v7=(Conflicted);v8=(Conflicted);
    add-int/lit8 v4, v4, 0x1

    goto :goto_0
.end method

.method public static encodePostBody(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .parameter "parameters"
    .parameter "boundary"

    .prologue
    .line 65
    if-nez p0, :cond_0

    const-string v3, ""

    .line 79
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Reference);v4=(Conflicted);v5=(Conflicted);
    return-object v3

    .line 66
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .local v2, sb:Ljava/lang/StringBuilder;
    #v2=(Reference);
    invoke-virtual {p0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v3

    #v3=(Reference);
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_2

    .line 79
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 68
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/lang/String;

    .line 69
    .local v0, key:Ljava/lang/String;
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 70
    .local v1, parameter:Ljava/lang/Object;
    #v1=(Reference);
    instance-of v4, v1, Ljava/lang/String;

    if-eqz v4, :cond_1

    .line 74
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    const-string v5, "Content-Disposition: form-data; name=\""

    #v5=(Reference);
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 75
    const-string v5, "\"\r\n\r\n"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    check-cast v1, Ljava/lang/String;

    .end local v1           #parameter:Ljava/lang/Object;
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 74
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    const-string v5, "\r\n--"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\r\n"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1
.end method

.method public static encodeUrl(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 7
    .parameter "parameters"

    .prologue
    .line 83
    if-nez p0, :cond_0

    .line 84
    const-string v4, ""

    .line 99
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference);v5=(Conflicted);v6=(Conflicted);
    return-object v4

    .line 87
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .local v3, sb:Ljava/lang/StringBuilder;
    #v3=(Reference);
    const/4 v0, 0x1

    .line 89
    .local v0, first:Z
    #v0=(One);
    invoke-virtual {p0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v4

    #v4=(Reference);
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_1
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    #v5=(Boolean);
    if-nez v5, :cond_2

    .line 99
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 89
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Ljava/lang/String;

    .line 90
    .local v1, key:Ljava/lang/String;
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 91
    .local v2, parameter:Ljava/lang/Object;
    #v2=(Reference);
    instance-of v5, v2, Ljava/lang/String;

    if-eqz v5, :cond_1

    .line 95
    if-eqz v0, :cond_3

    const/4 v0, 0x0

    .line 96
    :goto_2
    #v5=(Conflicted);
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-static {v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    #v6=(Reference);
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    const-string v6, "="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 97
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 96
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 95
    :cond_3
    #v5=(Boolean);v6=(Conflicted);
    const-string v5, "&"

    #v5=(Reference);
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2
.end method

.method public static logd(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .parameter "tag"
    .parameter "msg"

    .prologue
    .line 325
    sget-boolean v0, Lcom/facebook/android/Util;->ENABLE_LOG:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 326
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 328
    :cond_0
    return-void
.end method

.method public static openUrl(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;
    .locals 16
    .parameter "url"
    .parameter "method"
    .parameter "params"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 153
    const-string v11, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"

    .line 154
    .local v11, strBoundary:Ljava/lang/String;
    #v11=(Reference);
    const-string v6, "\r\n"

    .line 158
    .local v6, endLine:Ljava/lang/String;
    #v6=(Reference);
    const-string v12, "GET"

    #v12=(Reference);
    move-object/from16 v0, p1

    #v0=(Reference);
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    #v12=(Boolean);
    if-eqz v12, :cond_0

    .line 159
    new-instance v12, Ljava/lang/StringBuilder;

    #v12=(UninitRef);
    invoke-static/range {p0 .. p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    #v13=(Reference);
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v12=(Reference);
    const-string v13, "?"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-static/range {p2 .. p2}, Lcom/facebook/android/Util;->encodeUrl(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 161
    :cond_0
    #v12=(Conflicted);v13=(Conflicted);
    const-string v12, "Facebook-Util"

    #v12=(Reference);
    new-instance v13, Ljava/lang/StringBuilder;

    #v13=(UninitRef);
    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    #v14=(Reference);
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v13=(Reference);
    const-string v14, " URL: "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    move-object/from16 v0, p0

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lcom/facebook/android/Util;->logd(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    new-instance v12, Ljava/net/URL;

    #v12=(UninitRef);
    move-object/from16 v0, p0

    invoke-direct {v12, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    #v12=(Reference);
    invoke-virtual {v12}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Ljava/net/HttpURLConnection;

    .line 164
    .local v2, conn:Ljava/net/HttpURLConnection;
    const-string v12, "User-Agent"

    new-instance v13, Ljava/lang/StringBuilder;

    #v13=(UninitRef);
    invoke-static {}, Ljava/lang/System;->getProperties()Ljava/util/Properties;

    move-result-object v14

    .line 165
    const-string v15, "http.agent"

    #v15=(Reference);
    invoke-virtual {v14, v15}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v13=(Reference);
    const-string v14, " FacebookAndroidSDK"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 164
    invoke-virtual {v2, v12, v13}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    const-string v12, "GET"

    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    #v12=(Boolean);
    if-nez v12, :cond_5

    .line 167
    new-instance v3, Landroid/os/Bundle;

    #v3=(UninitRef);
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 168
    .local v3, dataparams:Landroid/os/Bundle;
    #v3=(Reference);
    invoke-virtual/range {p2 .. p2}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v12

    #v12=(Reference);
    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_1
    :goto_0
    #v7=(Conflicted);v9=(Conflicted);v13=(Conflicted);
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    #v13=(Boolean);
    if-nez v13, :cond_6

    .line 176
    const-string v12, "method"

    move-object/from16 v0, p2

    invoke-virtual {v0, v12}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v12

    #v12=(Boolean);
    if-nez v12, :cond_2

    .line 177
    const-string v12, "method"

    #v12=(Reference);
    move-object/from16 v0, p2

    move-object/from16 v1, p1

    #v1=(Reference);
    invoke-virtual {v0, v12, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    :cond_2
    #v1=(Conflicted);v12=(Conflicted);
    const-string v12, "access_token"

    #v12=(Reference);
    move-object/from16 v0, p2

    invoke-virtual {v0, v12}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v12

    #v12=(Boolean);
    if-eqz v12, :cond_3

    .line 182
    const-string v12, "access_token"

    #v12=(Reference);
    move-object/from16 v0, p2

    invoke-virtual {v0, v12}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 183
    .local v4, decoded_token:Ljava/lang/String;
    #v4=(Reference);
    const-string v12, "access_token"

    move-object/from16 v0, p2

    invoke-virtual {v0, v12, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    .end local v4           #decoded_token:Ljava/lang/String;
    :cond_3
    #v4=(Conflicted);v12=(Conflicted);
    const-string v12, "POST"

    #v12=(Reference);
    invoke-virtual {v2, v12}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 188
    const-string v12, "Content-Type"

    .line 189
    new-instance v13, Ljava/lang/StringBuilder;

    #v13=(UninitRef);
    const-string v14, "multipart/form-data;boundary="

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v13=(Reference);
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 187
    invoke-virtual {v2, v12, v13}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    const/4 v12, 0x1

    #v12=(One);
    invoke-virtual {v2, v12}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 191
    const/4 v12, 0x1

    invoke-virtual {v2, v12}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 192
    const-string v12, "Connection"

    #v12=(Reference);
    const-string v13, "Keep-Alive"

    invoke-virtual {v2, v12, v13}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->connect()V

    .line 194
    new-instance v8, Ljava/io/BufferedOutputStream;

    #v8=(UninitRef);
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v12

    invoke-direct {v8, v12}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 196
    .local v8, os:Ljava/io/OutputStream;
    #v8=(Reference);
    new-instance v12, Ljava/lang/StringBuilder;

    #v12=(UninitRef);
    const-string v13, "--"

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v12=(Reference);
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->getBytes()[B

    move-result-object v12

    invoke-virtual {v8, v12}, Ljava/io/OutputStream;->write([B)V

    .line 197
    move-object/from16 v0, p2

    invoke-static {v0, v11}, Lcom/facebook/android/Util;->encodePostBody(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->getBytes()[B

    move-result-object v12

    invoke-virtual {v8, v12}, Ljava/io/OutputStream;->write([B)V

    .line 198
    new-instance v12, Ljava/lang/StringBuilder;

    #v12=(UninitRef);
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v12=(Reference);
    const-string v13, "--"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->getBytes()[B

    move-result-object v12

    invoke-virtual {v8, v12}, Ljava/io/OutputStream;->write([B)V

    .line 200
    invoke-virtual {v3}, Landroid/os/Bundle;->isEmpty()Z

    move-result v12

    #v12=(Boolean);
    if-nez v12, :cond_4

    .line 202
    invoke-virtual {v3}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v12

    #v12=(Reference);
    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    #v13=(Boolean);
    if-nez v13, :cond_7

    .line 210
    :cond_4
    #v12=(Conflicted);v13=(Conflicted);
    invoke-virtual {v8}, Ljava/io/OutputStream;->flush()V

    .line 213
    .end local v3           #dataparams:Landroid/os/Bundle;
    .end local v8           #os:Ljava/io/OutputStream;
    :cond_5
    #v3=(Conflicted);v8=(Conflicted);
    const-string v10, ""

    .line 215
    .local v10, response:Ljava/lang/String;
    :try_start_0
    #v10=(Reference);
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v12

    #v12=(Reference);
    invoke-static {v12}, Lcom/facebook/android/Util;->read(Ljava/io/InputStream;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v10

    .line 220
    :goto_2
    #v5=(Conflicted);
    return-object v10

    .line 168
    .end local v10           #response:Ljava/lang/String;
    .restart local v3       #dataparams:Landroid/os/Bundle;
    :cond_6
    #v1=(Uninit);v3=(Reference);v4=(Uninit);v5=(Uninit);v8=(Uninit);v10=(Uninit);v13=(Boolean);
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    #v7=(Reference);
    check-cast v7, Ljava/lang/String;

    .line 169
    .local v7, key:Ljava/lang/String;
    move-object/from16 v0, p2

    invoke-virtual {v0, v7}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    .line 170
    .local v9, parameter:Ljava/lang/Object;
    #v9=(Reference);
    instance-of v13, v9, [B

    if-eqz v13, :cond_1

    .line 171
    check-cast v9, [B

    .end local v9           #parameter:Ljava/lang/Object;
    invoke-virtual {v3, v7, v9}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    goto/16 :goto_0

    .line 202
    .end local v7           #key:Ljava/lang/String;
    .restart local v8       #os:Ljava/io/OutputStream;
    :cond_7
    #v1=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Reference);v9=(Conflicted);
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    #v7=(Reference);
    check-cast v7, Ljava/lang/String;

    .line 203
    .restart local v7       #key:Ljava/lang/String;
    new-instance v13, Ljava/lang/StringBuilder;

    #v13=(UninitRef);
    const-string v14, "Content-Disposition: form-data; filename=\""

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v13=(Reference);
    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "\""

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->getBytes()[B

    move-result-object v13

    invoke-virtual {v8, v13}, Ljava/io/OutputStream;->write([B)V

    .line 204
    new-instance v13, Ljava/lang/StringBuilder;

    #v13=(UninitRef);
    const-string v14, "Content-Type: content/unknown"

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v13=(Reference);
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->getBytes()[B

    move-result-object v13

    invoke-virtual {v8, v13}, Ljava/io/OutputStream;->write([B)V

    .line 205
    invoke-virtual {v3, v7}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v13

    invoke-virtual {v8, v13}, Ljava/io/OutputStream;->write([B)V

    .line 206
    new-instance v13, Ljava/lang/StringBuilder;

    #v13=(UninitRef);
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v13=(Reference);
    const-string v14, "--"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->getBytes()[B

    move-result-object v13

    invoke-virtual {v8, v13}, Ljava/io/OutputStream;->write([B)V

    goto/16 :goto_1

    .line 216
    .end local v3           #dataparams:Landroid/os/Bundle;
    .end local v7           #key:Ljava/lang/String;
    .end local v8           #os:Ljava/io/OutputStream;
    .restart local v10       #response:Ljava/lang/String;
    :catch_0
    #v3=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Reference);v12=(Conflicted);v13=(Conflicted);
    move-exception v5

    .line 218
    .local v5, e:Ljava/io/FileNotFoundException;
    #v5=(Reference);
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v12

    #v12=(Reference);
    invoke-static {v12}, Lcom/facebook/android/Util;->read(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v10

    goto/16 :goto_2
.end method

.method public static parseJson(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 6
    .parameter "response"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Lcom/facebook/android/FacebookError;
        }
    .end annotation

    .prologue
    .line 267
    const-string v2, "false"

    #v2=(Reference);
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    .line 268
    new-instance v2, Lcom/facebook/android/FacebookError;

    #v2=(UninitRef);
    const-string v3, "request failed"

    #v3=(Reference);
    invoke-direct {v2, v3}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    throw v2

    .line 270
    :cond_0
    #v2=(Boolean);v3=(Uninit);
    const-string v2, "true"

    #v2=(Reference);
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_1

    .line 271
    const-string p0, "{value : true}"

    .line 273
    :cond_1
    new-instance v1, Lorg/json/JSONObject;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 277
    .local v1, json:Lorg/json/JSONObject;
    #v1=(Reference);
    const-string v2, "error"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_2

    .line 278
    const-string v2, "error"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 279
    .local v0, error:Lorg/json/JSONObject;
    #v0=(Reference);
    new-instance v2, Lcom/facebook/android/FacebookError;

    .line 280
    #v2=(UninitRef);
    const-string v3, "message"

    #v3=(Reference);
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "type"

    #v4=(Reference);
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    .line 279
    #v5=(Null);
    invoke-direct {v2, v3, v4, v5}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    #v2=(Reference);
    throw v2

    .line 282
    .end local v0           #error:Lorg/json/JSONObject;
    :cond_2
    #v0=(Uninit);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    const-string v2, "error_code"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_3

    const-string v2, "error_msg"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_3

    .line 283
    new-instance v2, Lcom/facebook/android/FacebookError;

    #v2=(UninitRef);
    const-string v3, "error_msg"

    #v3=(Reference);
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    .line 284
    #v4=(Reference);
    const-string v5, "error_code"

    #v5=(Reference);
    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 283
    #v5=(Integer);
    invoke-direct {v2, v3, v4, v5}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    #v2=(Reference);
    throw v2

    .line 286
    :cond_3
    #v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    const-string v2, "error_code"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_4

    .line 287
    new-instance v2, Lcom/facebook/android/FacebookError;

    #v2=(UninitRef);
    const-string v3, "request failed"

    #v3=(Reference);
    const-string v4, ""

    .line 288
    #v4=(Reference);
    const-string v5, "error_code"

    #v5=(Reference);
    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 287
    #v5=(Integer);
    invoke-direct {v2, v3, v4, v5}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    #v2=(Reference);
    throw v2

    .line 290
    :cond_4
    #v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    const-string v2, "error_msg"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_5

    .line 291
    new-instance v2, Lcom/facebook/android/FacebookError;

    #v2=(UninitRef);
    const-string v3, "error_msg"

    #v3=(Reference);
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    throw v2

    .line 293
    :cond_5
    #v2=(Boolean);v3=(Uninit);
    const-string v2, "error_reason"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_6

    .line 294
    new-instance v2, Lcom/facebook/android/FacebookError;

    #v2=(UninitRef);
    const-string v3, "error_reason"

    #v3=(Reference);
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    throw v2

    .line 296
    :cond_6
    #v2=(Boolean);v3=(Uninit);
    return-object v1
.end method

.method public static parseUrl(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 5
    .parameter "url"

    .prologue
    .line 125
    const-string v3, "fbconnect"

    #v3=(Reference);
    const-string v4, "http"

    #v4=(Reference);
    invoke-virtual {p0, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 127
    :try_start_0
    new-instance v2, Ljava/net/URL;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 128
    .local v2, u:Ljava/net/URL;
    #v2=(Reference);
    invoke-virtual {v2}, Ljava/net/URL;->getQuery()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/android/Util;->decodeUrl(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 129
    .local v0, b:Landroid/os/Bundle;
    #v0=(Reference);
    invoke-virtual {v2}, Ljava/net/URL;->getRef()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/android/Util;->decodeUrl(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    .end local v0           #b:Landroid/os/Bundle;
    .end local v2           #u:Ljava/net/URL;
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-object v0

    .line 131
    :catch_0
    #v0=(Conflicted);v1=(Uninit);
    move-exception v1

    .line 132
    .local v1, e:Ljava/net/MalformedURLException;
    #v1=(Reference);
    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    goto :goto_0
.end method

.method private static read(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 5
    .parameter "in"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 224
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 225
    .local v2, sb:Ljava/lang/StringBuilder;
    #v2=(Reference);
    new-instance v1, Ljava/io/BufferedReader;

    #v1=(UninitRef);
    new-instance v3, Ljava/io/InputStreamReader;

    #v3=(UninitRef);
    invoke-direct {v3, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    #v3=(Reference);
    const/16 v4, 0x3e8

    #v4=(PosShort);
    invoke-direct {v1, v3, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    .line 226
    .local v1, r:Ljava/io/BufferedReader;
    #v1=(Reference);
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    .local v0, line:Ljava/lang/String;
    :goto_0
    #v0=(Reference);
    if-nez v0, :cond_0

    .line 229
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 230
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    return-object v3

    .line 227
    :cond_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static showAlert(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .parameter "context"
    .parameter "title"
    .parameter "text"

    .prologue
    .line 310
    new-instance v0, Landroid/app/AlertDialog$Builder;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 311
    .local v0, alertBuilder:Landroid/app/AlertDialog$Builder;
    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 312
    invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 313
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V

    .line 314
    return-void
.end method

*/}
