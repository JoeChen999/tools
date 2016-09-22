package com.tapjoy; class TapjoyURLConnection {/*

.class public Lcom/tapjoy/TapjoyURLConnection;
.super Ljava/lang/Object;
.source "TapjoyURLConnection.java"


# static fields
.field private static final TAPJOY_URL_CONNECTION:Ljava/lang/String; = "TapjoyURLConnection"

.field public static final TYPE_GET:I = 0x0

.field public static final TYPE_POST:I = 0x1


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public connectToURL(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .parameter "url"

    .prologue
    .line 148
    const-string v0, ""

    #v0=(Reference);
    invoke-virtual {p0, p1, v0}, Lcom/tapjoy/TapjoyURLConnection;->connectToURL(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public connectToURL(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 13
    .parameter "url"
    .parameter "params"

    .prologue
    .line 161
    const/4 v2, 0x0

    .line 163
    .local v2, httpResponse:Ljava/lang/String;
    #v2=(Null);
    const/4 v5, 0x0

    .line 164
    .local v5, rd:Ljava/io/BufferedReader;
    #v5=(Null);
    const/4 v8, 0x0

    .line 165
    .local v8, sb:Ljava/lang/StringBuilder;
    #v8=(Null);
    const/4 v4, 0x0

    .line 169
    .local v4, line:Ljava/lang/String;
    :try_start_0
    #v4=(Null);
    new-instance v10, Ljava/lang/StringBuilder;

    #v10=(UninitRef);
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    #v10=(Reference);
    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 172
    .local v7, requestURL:Ljava/lang/String;
    #v7=(Reference);
    const-string v10, " "

    const-string v11, "%20"

    #v11=(Reference);
    invoke-virtual {v7, v10, v11}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 174
    const-string v10, "TapjoyURLConnection"

    new-instance v11, Ljava/lang/StringBuilder;

    #v11=(UninitRef);
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    #v11=(Reference);
    const-string v12, "baseURL: "

    #v12=(Reference);
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    const-string v10, "TapjoyURLConnection"

    new-instance v11, Ljava/lang/StringBuilder;

    #v11=(UninitRef);
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    #v11=(Reference);
    const-string v12, "requestURL: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    new-instance v3, Ljava/net/URL;

    #v3=(UninitRef);
    invoke-direct {v3, v7}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 180
    .local v3, httpURL:Ljava/net/URL;
    #v3=(Reference);
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 181
    .local v0, connection:Ljava/net/HttpURLConnection;
    const/16 v10, 0x3a98

    #v10=(PosShort);
    invoke-virtual {v0, v10}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 182
    const/16 v10, 0x7530

    invoke-virtual {v0, v10}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 183
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v2

    .line 185
    #v2=(Reference);
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V

    .line 188
    new-instance v6, Ljava/io/BufferedReader;

    #v6=(UninitRef);
    new-instance v10, Ljava/io/InputStreamReader;

    #v10=(UninitRef);
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v11

    invoke-direct {v10, v11}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    #v10=(Reference);
    invoke-direct {v6, v10}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 189
    .end local v5           #rd:Ljava/io/BufferedReader;
    .local v6, rd:Ljava/io/BufferedReader;
    :try_start_1
    #v6=(Reference);
    new-instance v9, Ljava/lang/StringBuilder;

    #v9=(UninitRef);
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 191
    .end local v8           #sb:Ljava/lang/StringBuilder;
    .local v9, sb:Ljava/lang/StringBuilder;
    :goto_0
    :try_start_2
    #v4=(Reference);v9=(Reference);v11=(Conflicted);
    invoke-virtual {v6}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 193
    new-instance v10, Ljava/lang/StringBuilder;

    #v10=(UninitRef);
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    #v10=(Reference);
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const/16 v11, 0xa

    #v11=(PosByte);
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    .line 205
    :catch_0
    #v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    move-exception v1

    #v1=(Reference);
    move-object v8, v9

    .end local v9           #sb:Ljava/lang/StringBuilder;
    .restart local v8       #sb:Ljava/lang/StringBuilder;
    #v8=(Reference);
    move-object v5, v6

    .line 207
    .end local v0           #connection:Ljava/net/HttpURLConnection;
    .end local v3           #httpURL:Ljava/net/URL;
    .end local v6           #rd:Ljava/io/BufferedReader;
    .end local v7           #requestURL:Ljava/lang/String;
    .local v1, e:Ljava/lang/Exception;
    .restart local v5       #rd:Ljava/io/BufferedReader;
    :goto_1
    #v0=(Conflicted);v3=(Conflicted);v5=(Reference);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);
    const-string v10, "TapjoyURLConnection"

    #v10=(Reference);
    new-instance v11, Ljava/lang/StringBuilder;

    #v11=(UninitRef);
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    #v11=(Reference);
    const-string v12, "Exception: "

    #v12=(Reference);
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    .end local v1           #e:Ljava/lang/Exception;
    :goto_2
    #v1=(Conflicted);
    return-object v2

    .line 196
    .end local v5           #rd:Ljava/io/BufferedReader;
    .end local v8           #sb:Ljava/lang/StringBuilder;
    .restart local v0       #connection:Ljava/net/HttpURLConnection;
    .restart local v3       #httpURL:Ljava/net/URL;
    .restart local v6       #rd:Ljava/io/BufferedReader;
    .restart local v7       #requestURL:Ljava/lang/String;
    .restart local v9       #sb:Ljava/lang/StringBuilder;
    :cond_0
    :try_start_3
    #v0=(Reference);v1=(Uninit);v3=(Reference);v5=(Null);v6=(Reference);v7=(Reference);v8=(Null);v9=(Reference);v11=(Conflicted);
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 198
    const-string v10, "TapjoyURLConnection"

    const-string v11, "--------------------"

    #v11=(Reference);
    invoke-static {v10, v11}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    const-string v10, "TapjoyURLConnection"

    new-instance v11, Ljava/lang/StringBuilder;

    #v11=(UninitRef);
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    #v11=(Reference);
    const-string v12, "response size: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v12

    #v12=(Integer);
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    const-string v10, "TapjoyURLConnection"

    const-string v11, "response: "

    invoke-static {v10, v11}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    const-string v10, "TapjoyURLConnection"

    new-instance v11, Ljava/lang/StringBuilder;

    #v11=(UninitRef);
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    #v11=(Reference);
    const-string v12, ""

    #v12=(Reference);
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    const-string v10, "TapjoyURLConnection"

    const-string v11, "--------------------"

    invoke-static {v10, v11}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move-object v8, v9

    .end local v9           #sb:Ljava/lang/StringBuilder;
    .restart local v8       #sb:Ljava/lang/StringBuilder;
    #v8=(Reference);
    move-object v5, v6

    .line 208
    .end local v6           #rd:Ljava/io/BufferedReader;
    .restart local v5       #rd:Ljava/io/BufferedReader;
    #v5=(Reference);
    goto :goto_2

    .line 205
    .end local v0           #connection:Ljava/net/HttpURLConnection;
    .end local v3           #httpURL:Ljava/net/URL;
    .end local v7           #requestURL:Ljava/lang/String;
    :catch_1
    #v0=(Conflicted);v3=(Conflicted);v4=(Null);v5=(Null);v6=(Conflicted);v7=(Conflicted);v8=(Null);v9=(Uninit);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    move-exception v1

    #v1=(Reference);
    goto :goto_1

    .end local v5           #rd:Ljava/io/BufferedReader;
    .restart local v0       #connection:Ljava/net/HttpURLConnection;
    .restart local v3       #httpURL:Ljava/net/URL;
    .restart local v6       #rd:Ljava/io/BufferedReader;
    .restart local v7       #requestURL:Ljava/lang/String;
    :catch_2
    #v0=(Reference);v1=(Uninit);v3=(Reference);v6=(Reference);v7=(Reference);v9=(Conflicted);v10=(Reference);v11=(Reference);v12=(Reference);
    move-exception v1

    #v1=(Reference);
    move-object v5, v6

    .end local v6           #rd:Ljava/io/BufferedReader;
    .restart local v5       #rd:Ljava/io/BufferedReader;
    #v5=(Reference);
    goto :goto_1
.end method

.method public connectToURLwithPOST(Ljava/lang/String;Ljava/util/Hashtable;Ljava/util/Hashtable;)Ljava/lang/String;
    .locals 16
    .parameter "url"
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Hashtable",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Hashtable",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 258
    .local p2, params:Ljava/util/Hashtable;,"Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/String;>;"
    .local p3, paramsData:Ljava/util/Hashtable;,"Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/String;>;"
    const/4 v7, 0x0

    .line 262
    .local v7, httpResponse:Ljava/lang/String;
    #v7=(Null);
    move-object/from16 v11, p1

    .line 265
    .local v11, requestURL:Ljava/lang/String;
    :try_start_0
    #v11=(Reference);
    const-string v13, " "

    #v13=(Reference);
    const-string v14, "%20"

    #v14=(Reference);
    invoke-virtual {v11, v13, v14}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 267
    const-string v13, "TapjoyURLConnection"

    new-instance v14, Ljava/lang/StringBuilder;

    #v14=(UninitRef);
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    #v14=(Reference);
    const-string v15, "baseURL: "

    #v15=(Reference);
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    move-object/from16 v0, p1

    #v0=(Reference);
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    const-string v13, "TapjoyURLConnection"

    new-instance v14, Ljava/lang/StringBuilder;

    #v14=(UninitRef);
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    #v14=(Reference);
    const-string v15, "requestURL: "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    new-instance v6, Lorg/apache/http/client/methods/HttpPost;

    #v6=(UninitRef);
    invoke-direct {v6, v11}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 272
    .local v6, httpPost:Lorg/apache/http/client/methods/HttpPost;
    #v6=(Reference);
    new-instance v10, Ljava/util/ArrayList;

    #v10=(UninitRef);
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 274
    .local v10, pairs:Ljava/util/List;,"Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    #v10=(Reference);
    invoke-virtual/range {p2 .. p2}, Ljava/util/Hashtable;->entrySet()Ljava/util/Set;

    move-result-object v4

    .line 275
    .local v4, entries:Ljava/util/Set;,"Ljava/util/Set<Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;>;"
    #v4=(Reference);
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    .line 277
    .local v9, iterator:Ljava/util/Iterator;,"Ljava/util/Iterator<Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;>;"
    :goto_0
    #v8=(Conflicted);v9=(Reference);
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    #v13=(Boolean);
    if-eqz v13, :cond_0

    .line 279
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    #v8=(Reference);
    check-cast v8, Ljava/util/Map$Entry;

    .line 280
    .local v8, item:Ljava/util/Map$Entry;,"Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    new-instance v15, Lorg/apache/http/message/BasicNameValuePair;

    #v15=(UninitRef);
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    #v13=(Reference);
    check-cast v13, Ljava/lang/String;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-direct {v15, v13, v14}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    #v15=(Reference);
    invoke-interface {v10, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 282
    const-string v14, "TapjoyURLConnection"

    new-instance v13, Ljava/lang/StringBuilder;

    #v13=(UninitRef);
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    #v13=(Reference);
    const-string v15, "key: "

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v15, ", value: "

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-static {v13}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v14, v13}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 327
    .end local v4           #entries:Ljava/util/Set;,"Ljava/util/Set<Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;>;"
    .end local v6           #httpPost:Lorg/apache/http/client/methods/HttpPost;
    .end local v8           #item:Ljava/util/Map$Entry;,"Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v9           #iterator:Ljava/util/Iterator;,"Ljava/util/Iterator<Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;>;"
    .end local v10           #pairs:Ljava/util/List;,"Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Reference);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
    move-exception v2

    .line 329
    .local v2, e:Ljava/lang/Exception;
    #v2=(Reference);
    const-string v13, "TapjoyURLConnection"

    #v13=(Reference);
    new-instance v14, Ljava/lang/StringBuilder;

    #v14=(UninitRef);
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    #v14=(Reference);
    const-string v15, "Exception: "

    #v15=(Reference);
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    .end local v2           #e:Ljava/lang/Exception;
    :goto_1
    #v2=(Conflicted);
    return-object v7

    .line 285
    .restart local v4       #entries:Ljava/util/Set;,"Ljava/util/Set<Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;>;"
    .restart local v6       #httpPost:Lorg/apache/http/client/methods/HttpPost;
    .restart local v9       #iterator:Ljava/util/Iterator;,"Ljava/util/Iterator<Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;>;"
    .restart local v10       #pairs:Ljava/util/List;,"Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    :cond_0
    #v0=(Reference);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Reference);v5=(Uninit);v6=(Reference);v7=(Null);v9=(Reference);v10=(Reference);v12=(Uninit);v13=(Boolean);
    if-eqz p3, :cond_1

    :try_start_1
    invoke-virtual/range {p3 .. p3}, Ljava/util/Hashtable;->size()I

    move-result v13

    #v13=(Integer);
    if-lez v13, :cond_1

    .line 287
    invoke-virtual/range {p3 .. p3}, Ljava/util/Hashtable;->entrySet()Ljava/util/Set;

    move-result-object v4

    .line 288
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    .line 290
    :goto_2
    #v13=(Conflicted);
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    #v13=(Boolean);
    if-eqz v13, :cond_1

    .line 292
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    #v8=(Reference);
    check-cast v8, Ljava/util/Map$Entry;

    .line 293
    .restart local v8       #item:Ljava/util/Map$Entry;,"Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    new-instance v14, Lorg/apache/http/message/BasicNameValuePair;

    #v14=(UninitRef);
    new-instance v13, Ljava/lang/StringBuilder;

    #v13=(UninitRef);
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    #v13=(Reference);
    const-string v15, "data["

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v15, "]"

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-direct {v14, v15, v13}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    #v14=(Reference);
    invoke-interface {v10, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 295
    const-string v14, "TapjoyURLConnection"

    new-instance v13, Ljava/lang/StringBuilder;

    #v13=(UninitRef);
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    #v13=(Reference);
    const-string v15, "key: "

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v15, ", value: "

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-static {v13}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v14, v13}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 299
    .end local v8           #item:Ljava/util/Map$Entry;,"Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_1
    #v8=(Conflicted);v13=(Integer);
    new-instance v13, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    #v13=(UninitRef);
    invoke-direct {v13, v10}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;)V

    #v13=(Reference);
    invoke-virtual {v6, v13}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 301
    const-string v13, "TapjoyURLConnection"

    new-instance v14, Ljava/lang/StringBuilder;

    #v14=(UninitRef);
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    #v14=(Reference);
    const-string v15, "HTTP POST: "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    new-instance v5, Lorg/apache/http/params/BasicHttpParams;

    #v5=(UninitRef);
    invoke-direct {v5}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 307
    .local v5, httpParameters:Lorg/apache/http/params/HttpParams;
    #v5=(Reference);
    const/16 v13, 0x3a98

    #v13=(PosShort);
    invoke-static {v5, v13}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 310
    const/16 v13, 0x7530

    invoke-static {v5, v13}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 313
    new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient;

    #v1=(UninitRef);
    invoke-direct {v1, v5}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V

    .line 315
    .local v1, client:Lorg/apache/http/client/HttpClient;
    #v1=(Reference);
    invoke-interface {v1, v6}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v12

    .line 316
    .local v12, response:Lorg/apache/http/HttpResponse;
    #v12=(Reference);
    invoke-interface {v12}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v3

    .line 318
    .local v3, entity:Lorg/apache/http/HttpEntity;
    #v3=(Reference);
    invoke-static {v3}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;)Ljava/lang/String;

    move-result-object v7

    .line 320
    #v7=(Reference);
    const-string v13, "TapjoyURLConnection"

    #v13=(Reference);
    const-string v14, "--------------------"

    invoke-static {v13, v14}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 321
    const-string v13, "TapjoyURLConnection"

    new-instance v14, Ljava/lang/StringBuilder;

    #v14=(UninitRef);
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    #v14=(Reference);
    const-string v15, "response status: "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-interface {v12}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v15

    invoke-interface {v15}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v15

    #v15=(Integer);
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    const-string v13, "TapjoyURLConnection"

    new-instance v14, Ljava/lang/StringBuilder;

    #v14=(UninitRef);
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    #v14=(Reference);
    const-string v15, "response size: "

    #v15=(Reference);
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v15

    #v15=(Integer);
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 323
    const-string v13, "TapjoyURLConnection"

    const-string v14, "response: "

    invoke-static {v13, v14}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    const-string v13, "TapjoyURLConnection"

    new-instance v14, Ljava/lang/StringBuilder;

    #v14=(UninitRef);
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    #v14=(Reference);
    const-string v15, ""

    #v15=(Reference);
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    const-string v13, "TapjoyURLConnection"

    const-string v14, "--------------------"

    invoke-static {v13, v14}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_1
.end method

.method public getContentLength(Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .parameter "url"

    .prologue
    .line 221
    const/4 v1, 0x0

    .line 224
    .local v1, contentLength:Ljava/lang/String;
    #v1=(Null);
    move-object v4, p1

    .line 227
    .local v4, requestURL:Ljava/lang/String;
    :try_start_0
    #v4=(Reference);
    const-string v5, " "

    #v5=(Reference);
    const-string v6, "%20"

    #v6=(Reference);
    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 229
    const-string v5, "TapjoyURLConnection"

    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    const-string v7, "requestURL: "

    #v7=(Reference);
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    new-instance v3, Ljava/net/URL;

    #v3=(UninitRef);
    invoke-direct {v3, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 232
    .local v3, httpURL:Ljava/net/URL;
    #v3=(Reference);
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 233
    .local v0, connection:Ljava/net/HttpURLConnection;
    const/16 v5, 0x3a98

    #v5=(PosShort);
    invoke-virtual {v0, v5}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 234
    const/16 v5, 0x7530

    invoke-virtual {v0, v5}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 235
    const-string v5, "content-length"

    #v5=(Reference);
    invoke-virtual {v0, v5}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 242
    .end local v0           #connection:Ljava/net/HttpURLConnection;
    .end local v3           #httpURL:Ljava/net/URL;
    :goto_0
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);v3=(Conflicted);
    const-string v5, "TapjoyURLConnection"

    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    const-string v7, "content-length: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    return-object v1

    .line 237
    :catch_0
    #v1=(Null);v2=(Uninit);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move-exception v2

    .line 239
    .local v2, e:Ljava/lang/Exception;
    #v2=(Reference);
    const-string v5, "TapjoyURLConnection"

    #v5=(Reference);
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    const-string v7, "Exception: "

    #v7=(Reference);
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public getResponseFromURL(Ljava/lang/String;Ljava/lang/String;)Lcom/tapjoy/TapjoyHttpURLResponse;
    .locals 1
    .parameter "url"
    .parameter "params"

    .prologue
    .line 45
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, p1, p2, v0}, Lcom/tapjoy/TapjoyURLConnection;->getResponseFromURL(Ljava/lang/String;Ljava/lang/String;I)Lcom/tapjoy/TapjoyHttpURLResponse;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public getResponseFromURL(Ljava/lang/String;Ljava/lang/String;I)Lcom/tapjoy/TapjoyHttpURLResponse;
    .locals 16
    .parameter "url"
    .parameter "params"
    .parameter "type"

    .prologue
    .line 50
    new-instance v12, Lcom/tapjoy/TapjoyHttpURLResponse;

    #v12=(UninitRef);
    invoke-direct {v12}, Lcom/tapjoy/TapjoyHttpURLResponse;-><init>()V

    .line 51
    .local v12, tapjoyResponse:Lcom/tapjoy/TapjoyHttpURLResponse;
    #v12=(Reference);
    const/4 v1, 0x0

    .line 52
    .local v1, connection:Ljava/net/HttpURLConnection;
    #v1=(Null);
    const/4 v7, 0x0

    .line 53
    .local v7, rd:Ljava/io/BufferedReader;
    #v7=(Null);
    const/4 v10, 0x0

    .line 54
    .local v10, sb:Ljava/lang/StringBuilder;
    #v10=(Null);
    const/4 v6, 0x0

    .line 58
    .local v6, line:Ljava/lang/String;
    :try_start_0
    #v6=(Null);
    new-instance v13, Ljava/lang/StringBuilder;

    #v13=(UninitRef);
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    #v13=(Reference);
    move-object/from16 v0, p1

    #v0=(Reference);
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    move-object/from16 v0, p2

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 61
    .local v9, requestURL:Ljava/lang/String;
    #v9=(Reference);
    const-string v13, " "

    const-string v14, "%20"

    #v14=(Reference);
    invoke-virtual {v9, v13, v14}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 63
    const-string v13, "TapjoyURLConnection"

    new-instance v14, Ljava/lang/StringBuilder;

    #v14=(UninitRef);
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    #v14=(Reference);
    const-string v15, "baseURL: "

    #v15=(Reference);
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    move-object/from16 v0, p1

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    const-string v13, "TapjoyURLConnection"

    new-instance v14, Ljava/lang/StringBuilder;

    #v14=(UninitRef);
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    #v14=(Reference);
    const-string v15, "requestURL: "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    const-string v13, "TapjoyURLConnection"

    new-instance v14, Ljava/lang/StringBuilder;

    #v14=(UninitRef);
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    #v14=(Reference);
    const-string v15, "type: "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    move/from16 v0, p3

    #v0=(Integer);
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    new-instance v5, Ljava/net/URL;

    #v5=(UninitRef);
    invoke-direct {v5, v9}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 68
    .local v5, httpURL:Ljava/net/URL;
    #v5=(Reference);
    invoke-virtual {v5}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v13

    move-object v0, v13

    #v0=(Reference);
    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v1, v0

    .line 69
    #v1=(Reference);
    const/16 v13, 0x3a98

    #v13=(PosShort);
    invoke-virtual {v1, v13}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 70
    const/16 v13, 0x7530

    invoke-virtual {v1, v13}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 73
    const/4 v13, 0x1

    #v13=(One);
    move/from16 v0, p3

    #v0=(Integer);
    if-ne v0, v13, :cond_0

    .line 75
    const-string v13, "POST"

    #v13=(Reference);
    invoke-virtual {v1, v13}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 78
    :cond_0
    #v13=(Conflicted);
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->connect()V

    .line 80
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v13

    #v13=(Integer);
    iput v13, v12, Lcom/tapjoy/TapjoyHttpURLResponse;->statusCode:I

    .line 83
    new-instance v8, Ljava/io/BufferedReader;

    #v8=(UninitRef);
    new-instance v13, Ljava/io/InputStreamReader;

    #v13=(UninitRef);
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v14

    invoke-direct {v13, v14}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    #v13=(Reference);
    invoke-direct {v8, v13}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5

    .line 84
    .end local v7           #rd:Ljava/io/BufferedReader;
    .local v8, rd:Ljava/io/BufferedReader;
    :try_start_1
    #v8=(Reference);
    new-instance v11, Ljava/lang/StringBuilder;

    #v11=(UninitRef);
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_6

    .line 86
    .end local v10           #sb:Ljava/lang/StringBuilder;
    .local v11, sb:Ljava/lang/StringBuilder;
    :goto_0
    :try_start_2
    #v6=(Reference);v11=(Reference);v14=(Conflicted);
    invoke-virtual {v8}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 88
    new-instance v13, Ljava/lang/StringBuilder;

    #v13=(UninitRef);
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    #v13=(Reference);
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const/16 v14, 0xa

    #v14=(PosByte);
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    .line 107
    :catch_0
    #v2=(Conflicted);v3=(Conflicted);v13=(Conflicted);v14=(Conflicted);
    move-exception v3

    .line 109
    .end local v5           #httpURL:Ljava/net/URL;
    .end local v9           #requestURL:Ljava/lang/String;
    .local v3, e:Ljava/lang/Exception;
    :goto_1
    #v0=(Conflicted);v3=(Reference);v5=(Conflicted);v9=(Conflicted);v15=(Conflicted);
    const-string v13, "TapjoyURLConnection"

    #v13=(Reference);
    new-instance v14, Ljava/lang/StringBuilder;

    #v14=(UninitRef);
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    #v14=(Reference);
    const-string v15, "Exception: "

    #v15=(Reference);
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v3}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    if-eqz v1, :cond_4

    :try_start_3
    iget-object v13, v12, Lcom/tapjoy/TapjoyHttpURLResponse;->response:Ljava/lang/String;

    if-nez v13, :cond_4

    .line 118
    new-instance v7, Ljava/io/BufferedReader;

    #v7=(UninitRef);
    new-instance v13, Ljava/io/InputStreamReader;

    #v13=(UninitRef);
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v14

    invoke-direct {v13, v14}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    #v13=(Reference);
    invoke-direct {v7, v13}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 119
    .end local v8           #rd:Ljava/io/BufferedReader;
    .restart local v7       #rd:Ljava/io/BufferedReader;
    :try_start_4
    #v7=(Reference);
    new-instance v10, Ljava/lang/StringBuilder;

    #v10=(UninitRef);
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 121
    .end local v11           #sb:Ljava/lang/StringBuilder;
    .restart local v10       #sb:Ljava/lang/StringBuilder;
    :goto_2
    :try_start_5
    #v10=(Reference);v14=(Conflicted);
    invoke-virtual {v7}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_3

    .line 123
    new-instance v13, Ljava/lang/StringBuilder;

    #v13=(UninitRef);
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    #v13=(Reference);
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const/16 v14, 0xa

    #v14=(PosByte);
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_2

    .line 129
    :catch_1
    #v13=(Conflicted);v14=(Conflicted);
    move-exception v4

    .line 131
    .local v4, ex:Ljava/lang/Exception;
    :goto_3
    #v4=(Reference);
    const-string v13, "TapjoyURLConnection"

    #v13=(Reference);
    new-instance v14, Ljava/lang/StringBuilder;

    #v14=(UninitRef);
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    #v14=(Reference);
    const-string v15, "Exception trying to get error code/content: "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v4}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .end local v3           #e:Ljava/lang/Exception;
    .end local v4           #ex:Ljava/lang/Exception;
    :goto_4
    #v3=(Conflicted);v4=(Conflicted);v13=(Conflicted);v14=(Conflicted);
    const-string v13, "TapjoyURLConnection"

    #v13=(Reference);
    const-string v14, "--------------------"

    #v14=(Reference);
    invoke-static {v13, v14}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    const-string v13, "TapjoyURLConnection"

    new-instance v14, Ljava/lang/StringBuilder;

    #v14=(UninitRef);
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    #v14=(Reference);
    const-string v15, "response status: "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    iget v15, v12, Lcom/tapjoy/TapjoyHttpURLResponse;->statusCode:I

    #v15=(Integer);
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    const-string v13, "TapjoyURLConnection"

    new-instance v14, Ljava/lang/StringBuilder;

    #v14=(UninitRef);
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    #v14=(Reference);
    const-string v15, "response size: "

    #v15=(Reference);
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    iget v15, v12, Lcom/tapjoy/TapjoyHttpURLResponse;->contentLength:I

    #v15=(Integer);
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    const-string v13, "TapjoyURLConnection"

    const-string v14, "response: "

    invoke-static {v13, v14}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    const-string v13, "TapjoyURLConnection"

    new-instance v14, Ljava/lang/StringBuilder;

    #v14=(UninitRef);
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    #v14=(Reference);
    const-string v15, ""

    #v15=(Reference);
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    iget-object v15, v12, Lcom/tapjoy/TapjoyHttpURLResponse;->response:Ljava/lang/String;

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    const-string v13, "TapjoyURLConnection"

    const-string v14, "--------------------"

    invoke-static {v13, v14}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    return-object v12

    .line 91
    .end local v7           #rd:Ljava/io/BufferedReader;
    .end local v10           #sb:Ljava/lang/StringBuilder;
    .restart local v5       #httpURL:Ljava/net/URL;
    .restart local v8       #rd:Ljava/io/BufferedReader;
    .restart local v9       #requestURL:Ljava/lang/String;
    .restart local v11       #sb:Ljava/lang/StringBuilder;
    :cond_1
    :try_start_6
    #v0=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Reference);v7=(Null);v9=(Reference);v10=(Null);v14=(Conflicted);
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    iput-object v13, v12, Lcom/tapjoy/TapjoyHttpURLResponse;->response:Ljava/lang/String;

    .line 93
    const-string v13, "content-length"

    invoke-virtual {v1, v13}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    move-result-object v2

    .line 95
    .local v2, contentLength:Ljava/lang/String;
    #v2=(Reference);
    if-eqz v2, :cond_2

    .line 99
    :try_start_7
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    #v13=(Integer);
    iput v13, v12, Lcom/tapjoy/TapjoyHttpURLResponse;->contentLength:I
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    :cond_2
    :goto_5
    #v3=(Conflicted);v13=(Conflicted);
    move-object v10, v11

    .end local v11           #sb:Ljava/lang/StringBuilder;
    .restart local v10       #sb:Ljava/lang/StringBuilder;
    #v10=(Reference);
    move-object v7, v8

    .line 133
    .end local v8           #rd:Ljava/io/BufferedReader;
    .restart local v7       #rd:Ljava/io/BufferedReader;
    #v7=(Reference);
    goto :goto_4

    .line 101
    .end local v7           #rd:Ljava/io/BufferedReader;
    .end local v10           #sb:Ljava/lang/StringBuilder;
    .restart local v8       #rd:Ljava/io/BufferedReader;
    .restart local v11       #sb:Ljava/lang/StringBuilder;
    :catch_2
    #v3=(Uninit);v7=(Null);v10=(Null);
    move-exception v3

    .line 103
    .restart local v3       #e:Ljava/lang/Exception;
    :try_start_8
    #v3=(Reference);
    const-string v13, "TapjoyURLConnection"

    #v13=(Reference);
    new-instance v14, Ljava/lang/StringBuilder;

    #v14=(UninitRef);
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    #v14=(Reference);
    const-string v15, "Exception: "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v3}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    goto :goto_5

    .line 126
    .end local v2           #contentLength:Ljava/lang/String;
    .end local v5           #httpURL:Ljava/net/URL;
    .end local v8           #rd:Ljava/io/BufferedReader;
    .end local v9           #requestURL:Ljava/lang/String;
    .end local v11           #sb:Ljava/lang/StringBuilder;
    .restart local v7       #rd:Ljava/io/BufferedReader;
    .restart local v10       #sb:Ljava/lang/StringBuilder;
    :cond_3
    :try_start_9
    #v0=(Conflicted);v2=(Conflicted);v5=(Conflicted);v7=(Reference);v9=(Conflicted);v10=(Reference);v14=(Conflicted);
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    iput-object v13, v12, Lcom/tapjoy/TapjoyHttpURLResponse;->response:Ljava/lang/String;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1

    goto/16 :goto_4

    .line 129
    .end local v7           #rd:Ljava/io/BufferedReader;
    .end local v10           #sb:Ljava/lang/StringBuilder;
    .restart local v8       #rd:Ljava/io/BufferedReader;
    .restart local v11       #sb:Ljava/lang/StringBuilder;
    :catch_3
    #v7=(Conflicted);v10=(Null);v13=(Conflicted);v14=(Reference);
    move-exception v4

    #v4=(Reference);
    move-object v10, v11

    .end local v11           #sb:Ljava/lang/StringBuilder;
    .restart local v10       #sb:Ljava/lang/StringBuilder;
    #v10=(Reference);
    move-object v7, v8

    .end local v8           #rd:Ljava/io/BufferedReader;
    .restart local v7       #rd:Ljava/io/BufferedReader;
    #v7=(Reference);
    goto/16 :goto_3

    .end local v10           #sb:Ljava/lang/StringBuilder;
    .restart local v11       #sb:Ljava/lang/StringBuilder;
    :catch_4
    #v4=(Uninit);v10=(Conflicted);v13=(Reference);
    move-exception v4

    #v4=(Reference);
    move-object v10, v11

    .end local v11           #sb:Ljava/lang/StringBuilder;
    .restart local v10       #sb:Ljava/lang/StringBuilder;
    #v10=(Reference);
    goto/16 :goto_3

    .line 107
    .end local v3           #e:Ljava/lang/Exception;
    :catch_5
    #v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Null);v7=(Null);v8=(Conflicted);v10=(Null);v11=(Uninit);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
    move-exception v3

    #v3=(Reference);
    move-object v11, v10

    .end local v10           #sb:Ljava/lang/StringBuilder;
    .restart local v11       #sb:Ljava/lang/StringBuilder;
    #v11=(Null);
    move-object v8, v7

    .end local v7           #rd:Ljava/io/BufferedReader;
    .restart local v8       #rd:Ljava/io/BufferedReader;
    #v8=(Null);
    goto/16 :goto_1

    .end local v11           #sb:Ljava/lang/StringBuilder;
    .restart local v5       #httpURL:Ljava/net/URL;
    .restart local v9       #requestURL:Ljava/lang/String;
    .restart local v10       #sb:Ljava/lang/StringBuilder;
    :catch_6
    #v0=(Integer);v3=(Uninit);v5=(Reference);v8=(Reference);v9=(Reference);v11=(Conflicted);v13=(Reference);v14=(Reference);v15=(Reference);
    move-exception v3

    #v3=(Reference);
    move-object v11, v10

    .end local v10           #sb:Ljava/lang/StringBuilder;
    .restart local v11       #sb:Ljava/lang/StringBuilder;
    #v11=(Null);
    goto/16 :goto_1

    .end local v5           #httpURL:Ljava/net/URL;
    .end local v9           #requestURL:Ljava/lang/String;
    .restart local v3       #e:Ljava/lang/Exception;
    :cond_4
    #v0=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Reference);v9=(Conflicted);v11=(Reference);
    move-object v10, v11

    .end local v11           #sb:Ljava/lang/StringBuilder;
    .restart local v10       #sb:Ljava/lang/StringBuilder;
    #v10=(Reference);
    move-object v7, v8

    .end local v8           #rd:Ljava/io/BufferedReader;
    .restart local v7       #rd:Ljava/io/BufferedReader;
    #v7=(Reference);
    goto/16 :goto_4
.end method

*/}
