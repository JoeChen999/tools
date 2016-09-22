package com.chartboost.sdk; class CBAPIConnection {/*

.class public Lcom/chartboost/sdk/CBAPIConnection;
.super Landroid/os/AsyncTask;
.source "CBAPIConnection.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/chartboost/sdk/CBAPIConnection$TrustingSocketFactory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Lcom/chartboost/sdk/CBAPIRequest;",
        "Ljava/lang/Void;",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# static fields
.field private static final CB_DEFAULT_ENDPOINT:Ljava/lang/String; = "https://www.chartboost.com/"

.field public static final DEFAULT_CONNECT_TIMEOUT:I = 0x7530

.field public static final DEFAULT_READ_TIMEOUT:I = 0x7530

.field public static final MIN_TIMEOUT:I = 0x2710


# instance fields
.field protected context:Landroid/content/Context;

.field public data:Ljava/lang/Object;

.field private endpoint:Ljava/lang/String;

.field private httpClient:Lorg/apache/http/client/HttpClient;

.field public loadingMessage:Ljava/lang/String;

.field private progressDialog:Landroid/app/ProgressDialog;

.field public shouldShowProgress:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .parameter "context"

    .prologue
    const/4 v1, 0x0

    .line 69
    #v1=(Null);
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 59
    #p0=(Reference);
    iput-object v1, p0, Lcom/chartboost/sdk/CBAPIConnection;->context:Landroid/content/Context;

    .line 62
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/chartboost/sdk/CBAPIConnection;->shouldShowProgress:Z

    .line 63
    const-string v0, "Loading..."

    #v0=(Reference);
    iput-object v0, p0, Lcom/chartboost/sdk/CBAPIConnection;->loadingMessage:Ljava/lang/String;

    .line 65
    iput-object v1, p0, Lcom/chartboost/sdk/CBAPIConnection;->progressDialog:Landroid/app/ProgressDialog;

    .line 70
    iput-object p1, p0, Lcom/chartboost/sdk/CBAPIConnection;->context:Landroid/content/Context;

    .line 71
    const-string v0, "https://www.chartboost.com/"

    invoke-virtual {p0, v0}, Lcom/chartboost/sdk/CBAPIConnection;->setEndpoint(Ljava/lang/String;)V

    .line 73
    invoke-direct {p0}, Lcom/chartboost/sdk/CBAPIConnection;->createHttpClient()Lorg/apache/http/client/HttpClient;

    move-result-object v0

    iput-object v0, p0, Lcom/chartboost/sdk/CBAPIConnection;->httpClient:Lorg/apache/http/client/HttpClient;

    .line 74
    return-void
.end method

.method private createHttpClient()Lorg/apache/http/client/HttpClient;
    .locals 10

    .prologue
    .line 212
    :try_start_0
    invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;

    move-result-object v6

    #v6=(Reference);
    invoke-static {v6}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v5

    .line 213
    .local v5, trustStore:Ljava/security/KeyStore;
    #v5=(Reference);
    const/4 v6, 0x0

    #v6=(Null);
    const/4 v7, 0x0

    #v7=(Null);
    invoke-virtual {v5, v6, v7}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    .line 215
    new-instance v4, Lcom/chartboost/sdk/CBAPIConnection$TrustingSocketFactory;

    #v4=(UninitRef);
    invoke-direct {v4, p0, v5}, Lcom/chartboost/sdk/CBAPIConnection$TrustingSocketFactory;-><init>(Lcom/chartboost/sdk/CBAPIConnection;Ljava/security/KeyStore;)V

    .line 216
    .local v4, sf:Lorg/apache/http/conn/ssl/SSLSocketFactory;
    #v4=(Reference);
    sget-object v6, Lorg/apache/http/conn/ssl/SSLSocketFactory;->ALLOW_ALL_HOSTNAME_VERIFIER:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    #v6=(Reference);
    invoke-virtual {v4, v6}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->setHostnameVerifier(Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V

    .line 218
    new-instance v2, Lorg/apache/http/params/BasicHttpParams;

    #v2=(UninitRef);
    invoke-direct {v2}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 219
    .local v2, params:Lorg/apache/http/params/HttpParams;
    #v2=(Reference);
    sget-object v6, Lorg/apache/http/HttpVersion;->HTTP_1_1:Lorg/apache/http/HttpVersion;

    invoke-static {v2, v6}, Lorg/apache/http/params/HttpProtocolParams;->setVersion(Lorg/apache/http/params/HttpParams;Lorg/apache/http/ProtocolVersion;)V

    .line 220
    const-string v6, "UTF-8"

    invoke-static {v2, v6}, Lorg/apache/http/params/HttpProtocolParams;->setContentCharset(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V

    .line 222
    new-instance v3, Lorg/apache/http/conn/scheme/SchemeRegistry;

    #v3=(UninitRef);
    invoke-direct {v3}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V

    .line 223
    .local v3, registry:Lorg/apache/http/conn/scheme/SchemeRegistry;
    #v3=(Reference);
    new-instance v6, Lorg/apache/http/conn/scheme/Scheme;

    #v6=(UninitRef);
    const-string v7, "http"

    #v7=(Reference);
    invoke-static {}, Lorg/apache/http/conn/scheme/PlainSocketFactory;->getSocketFactory()Lorg/apache/http/conn/scheme/PlainSocketFactory;

    move-result-object v8

    #v8=(Reference);
    const/16 v9, 0x50

    #v9=(PosByte);
    invoke-direct {v6, v7, v8, v9}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    #v6=(Reference);
    invoke-virtual {v3, v6}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 224
    new-instance v6, Lorg/apache/http/conn/scheme/Scheme;

    #v6=(UninitRef);
    const-string v7, "https"

    const/16 v8, 0x1bb

    #v8=(PosShort);
    invoke-direct {v6, v7, v4, v8}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    #v6=(Reference);
    invoke-virtual {v3, v6}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 226
    new-instance v0, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;

    #v0=(UninitRef);
    invoke-direct {v0, v2, v3}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V

    .line 228
    .local v0, ccm:Lorg/apache/http/conn/ClientConnectionManager;
    #v0=(Reference);
    iget-object v6, p0, Lcom/chartboost/sdk/CBAPIConnection;->context:Landroid/content/Context;

    invoke-static {v6}, Lcom/chartboost/sdk/ChartBoost;->getSharedChartBoost(Landroid/content/Context;)Lcom/chartboost/sdk/ChartBoost;

    move-result-object v6

    invoke-virtual {v6}, Lcom/chartboost/sdk/ChartBoost;->getTimeoutConnect()I

    move-result v6

    #v6=(Integer);
    invoke-static {v2, v6}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 229
    iget-object v6, p0, Lcom/chartboost/sdk/CBAPIConnection;->context:Landroid/content/Context;

    #v6=(Reference);
    invoke-static {v6}, Lcom/chartboost/sdk/ChartBoost;->getSharedChartBoost(Landroid/content/Context;)Lcom/chartboost/sdk/ChartBoost;

    move-result-object v6

    invoke-virtual {v6}, Lcom/chartboost/sdk/ChartBoost;->getTimeoutRead()I

    move-result v6

    #v6=(Integer);
    invoke-static {v2, v6}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 231
    new-instance v6, Lorg/apache/http/impl/client/DefaultHttpClient;

    #v6=(UninitRef);
    invoke-direct {v6, v0, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 234
    .end local v0           #ccm:Lorg/apache/http/conn/ClientConnectionManager;
    .end local v2           #params:Lorg/apache/http/params/HttpParams;
    .end local v3           #registry:Lorg/apache/http/conn/scheme/SchemeRegistry;
    .end local v4           #sf:Lorg/apache/http/conn/ssl/SSLSocketFactory;
    .end local v5           #trustStore:Ljava/security/KeyStore;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Reference);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    return-object v6

    .line 233
    :catch_0
    move-exception v1

    .line 234
    .local v1, e:Ljava/lang/Exception;
    #v1=(Reference);
    new-instance v6, Lorg/apache/http/impl/client/DefaultHttpClient;

    #v6=(UninitRef);
    invoke-direct {v6}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    #v6=(Reference);
    goto :goto_0
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 1
    check-cast p1, [Lcom/chartboost/sdk/CBAPIRequest;

    invoke-virtual {p0, p1}, Lcom/chartboost/sdk/CBAPIConnection;->doInBackground([Lcom/chartboost/sdk/CBAPIRequest;)Lorg/json/JSONObject;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method protected varargs doInBackground([Lcom/chartboost/sdk/CBAPIRequest;)Lorg/json/JSONObject;
    .locals 25
    .parameter "requests"

    .prologue
    .line 99
    const/16 v22, 0x0

    #v22=(Null);
    aget-object v16, p1, v22

    .line 100
    .local v16, request:Lcom/chartboost/sdk/CBAPIRequest;
    #v16=(Null);
    new-instance v22, Ljava/lang/StringBuilder;

    #v22=(UninitRef);
    invoke-virtual/range {p0 .. p0}, Lcom/chartboost/sdk/CBAPIConnection;->getEndpoint()Ljava/lang/String;

    move-result-object v23

    #v23=(Reference);
    invoke-static/range {v23 .. v23}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v23

    invoke-direct/range {v22 .. v23}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v22=(Reference);
    invoke-virtual/range {v16 .. v16}, Lcom/chartboost/sdk/CBAPIRequest;->getController()Ljava/lang/String;

    move-result-object v23

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    const-string v23, "/"

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    invoke-virtual/range {v16 .. v16}, Lcom/chartboost/sdk/CBAPIRequest;->getAction()Ljava/lang/String;

    move-result-object v23

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    const-string v23, ".json"

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    .line 104
    .local v20, urlString:Ljava/lang/String;
    #v20=(Reference);
    invoke-virtual/range {v16 .. v16}, Lcom/chartboost/sdk/CBAPIRequest;->getQuery()Ljava/util/Map;

    move-result-object v13

    .line 105
    .local v13, query:Ljava/util/Map;,"Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    #v13=(Reference);
    if-eqz v13, :cond_0

    .line 106
    const-string v14, ""

    .line 107
    .local v14, queryString:Ljava/lang/String;
    #v14=(Reference);
    invoke-interface {v13}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v22

    invoke-interface/range {v22 .. v22}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v22

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v10=(Conflicted);v21=(Conflicted);v23=(Conflicted);v24=(Conflicted);
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    move-result v23

    #v23=(Boolean);
    if-nez v23, :cond_2

    .line 115
    new-instance v22, Ljava/lang/StringBuilder;

    #v22=(UninitRef);
    invoke-static/range {v20 .. v20}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v23

    #v23=(Reference);
    invoke-direct/range {v22 .. v23}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v22=(Reference);
    const-string v23, "?"

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    move-object/from16 v0, v22

    #v0=(Reference);
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    .line 118
    .end local v14           #queryString:Ljava/lang/String;
    :cond_0
    #v0=(Conflicted);v14=(Conflicted);
    new-instance v8, Lorg/apache/http/client/methods/HttpPost;

    #v8=(UninitRef);
    move-object/from16 v0, v20

    #v0=(Reference);
    invoke-direct {v8, v0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 122
    .local v8, httpRequest:Lorg/apache/http/client/methods/HttpPost;
    #v8=(Reference);
    invoke-virtual/range {v16 .. v16}, Lcom/chartboost/sdk/CBAPIRequest;->getBody()Ljava/util/Map;

    move-result-object v2

    .line 123
    .local v2, body:Ljava/util/Map;,"Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    #v2=(Reference);
    if-eqz v2, :cond_1

    .line 124
    new-instance v12, Ljava/util/ArrayList;

    #v12=(UninitRef);
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .local v12, postPairs:Ljava/util/List;,"Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    #v12=(Reference);
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v22

    invoke-interface/range {v22 .. v22}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v23

    :goto_1
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    #v22=(Boolean);
    if-nez v22, :cond_3

    .line 129
    :try_start_0
    new-instance v22, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    #v22=(UninitRef);
    move-object/from16 v0, v22

    #v0=(UninitRef);
    invoke-direct {v0, v12}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;)V

    #v0=(Reference);v22=(Reference);
    move-object/from16 v0, v22

    invoke-virtual {v8, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    .line 136
    .end local v12           #postPairs:Ljava/util/List;,"Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    :cond_1
    :goto_2
    #v0=(Conflicted);v12=(Conflicted);v22=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v5, v0, Lcom/chartboost/sdk/CBAPIConnection;->httpClient:Lorg/apache/http/client/HttpClient;

    .line 137
    .local v5, finalHttpClient:Lorg/apache/http/client/HttpClient;
    #v5=(Reference);
    move-object v6, v8

    .line 142
    .local v6, finalHttpRequest:Lorg/apache/http/client/methods/HttpPost;
    :try_start_1
    #v6=(Reference);
    invoke-interface {v5, v6}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v17

    .line 144
    .local v17, response:Lorg/apache/http/HttpResponse;
    #v17=(Reference);
    invoke-interface/range {v17 .. v17}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v22

    #v22=(Reference);
    invoke-interface/range {v22 .. v22}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v18

    .line 146
    .local v18, status:I
    #v18=(Integer);
    const/16 v22, 0x12c

    #v22=(PosShort);
    move/from16 v0, v18

    #v0=(Integer);
    move/from16 v1, v22

    #v1=(PosShort);
    if-ge v0, v1, :cond_5

    const/16 v22, 0xc8

    move/from16 v0, v18

    move/from16 v1, v22

    if-lt v0, v1, :cond_5

    .line 148
    new-instance v15, Ljava/io/BufferedReader;

    #v15=(UninitRef);
    new-instance v22, Ljava/io/InputStreamReader;

    #v22=(UninitRef);
    invoke-interface/range {v17 .. v17}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v23

    invoke-interface/range {v23 .. v23}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v23

    const-string v24, "UTF-8"

    #v24=(Reference);
    invoke-direct/range {v22 .. v24}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    #v22=(Reference);
    move-object/from16 v0, v22

    #v0=(Reference);
    invoke-direct {v15, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 149
    .local v15, reader:Ljava/io/BufferedReader;
    #v15=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    .local v3, builder:Ljava/lang/StringBuilder;
    #v3=(Reference);
    const/4 v11, 0x0

    .local v11, line:Ljava/lang/String;
    :goto_3
    #v11=(Reference);
    invoke-virtual {v15}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_4

    .line 153
    new-instance v19, Lorg/json/JSONTokener;

    #v19=(UninitRef);
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v19

    #v0=(UninitRef);
    move-object/from16 v1, v22

    #v1=(Reference);
    invoke-direct {v0, v1}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V

    .line 154
    .local v19, tokener:Lorg/json/JSONTokener;
    #v0=(Reference);v19=(Reference);
    new-instance v9, Lorg/json/JSONObject;

    #v9=(UninitRef);
    move-object/from16 v0, v19

    invoke-direct {v9, v0}, Lorg/json/JSONObject;-><init>(Lorg/json/JSONTokener;)V

    .line 156
    .local v9, jsonObject:Lorg/json/JSONObject;
    #v9=(Reference);
    const-string v22, "ChartBoost"

    new-instance v23, Ljava/lang/StringBuilder;

    #v23=(UninitRef);
    const-string v24, "Request response received: "

    invoke-direct/range {v23 .. v24}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v23=(Reference);
    const-string v24, "message"

    move-object/from16 v0, v24

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {v23 .. v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v23

    invoke-static/range {v22 .. v23}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 162
    move-object v7, v9

    .line 174
    .end local v3           #builder:Ljava/lang/StringBuilder;
    .end local v9           #jsonObject:Lorg/json/JSONObject;
    .end local v11           #line:Ljava/lang/String;
    .end local v15           #reader:Ljava/io/BufferedReader;
    .end local v17           #response:Lorg/apache/http/HttpResponse;
    .end local v18           #status:I
    .end local v19           #tokener:Lorg/json/JSONTokener;
    :goto_4
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v7=(Reference);v9=(Conflicted);v11=(Conflicted);v15=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);
    return-object v7

    .line 107
    .end local v2           #body:Ljava/util/Map;,"Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v5           #finalHttpClient:Lorg/apache/http/client/HttpClient;
    .end local v6           #finalHttpRequest:Lorg/apache/http/client/methods/HttpPost;
    .end local v8           #httpRequest:Lorg/apache/http/client/methods/HttpPost;
    .restart local v14       #queryString:Ljava/lang/String;
    :cond_2
    #v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v11=(Uninit);v12=(Uninit);v14=(Reference);v15=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v23=(Boolean);v24=(Conflicted);
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    #v10=(Reference);
    check-cast v10, Ljava/lang/String;

    .line 108
    .local v10, key:Ljava/lang/String;
    invoke-interface {v13, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v21

    #v21=(Reference);
    check-cast v21, Ljava/lang/String;

    .line 110
    .local v21, value:Ljava/lang/String;
    :try_start_2
    new-instance v23, Ljava/lang/StringBuilder;

    #v23=(UninitRef);
    invoke-static {v14}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v24

    #v24=(Reference);
    invoke-direct/range {v23 .. v24}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v23=(Reference);
    const-string v24, "UTF-8"

    move-object/from16 v0, v24

    #v0=(Reference);
    invoke-static {v10, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {v23 .. v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v23

    const-string v24, "="

    invoke-virtual/range {v23 .. v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v23

    const-string v24, "UTF-8"

    move-object/from16 v0, v21

    move-object/from16 v1, v24

    #v1=(Reference);
    invoke-static {v0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {v23 .. v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v23

    const-string v24, "&"

    invoke-virtual/range {v23 .. v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v14

    goto/16 :goto_0

    .line 111
    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v23=(Conflicted);v24=(Conflicted);
    move-exception v4

    .line 112
    .local v4, e:Ljava/io/UnsupportedEncodingException;
    #v4=(Reference);
    invoke-virtual {v4}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    goto/16 :goto_0

    .line 125
    .end local v4           #e:Ljava/io/UnsupportedEncodingException;
    .end local v10           #key:Ljava/lang/String;
    .end local v14           #queryString:Ljava/lang/String;
    .end local v21           #value:Ljava/lang/String;
    .restart local v2       #body:Ljava/util/Map;,"Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    .restart local v8       #httpRequest:Lorg/apache/http/client/methods/HttpPost;
    .restart local v12       #postPairs:Ljava/util/List;,"Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    :cond_3
    #v0=(Reference);v2=(Reference);v4=(Conflicted);v8=(Reference);v10=(Conflicted);v12=(Reference);v14=(Conflicted);v21=(Conflicted);v22=(Boolean);v23=(Reference);
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    #v10=(Reference);
    check-cast v10, Ljava/lang/String;

    .line 126
    .restart local v10       #key:Ljava/lang/String;
    new-instance v24, Lorg/apache/http/message/BasicNameValuePair;

    #v24=(UninitRef);
    invoke-interface {v2, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v22

    #v22=(Reference);
    check-cast v22, Ljava/lang/String;

    move-object/from16 v0, v24

    #v0=(UninitRef);
    move-object/from16 v1, v22

    #v1=(Reference);
    invoke-direct {v0, v10, v1}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    #v0=(Reference);v24=(Reference);
    move-object/from16 v0, v24

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 130
    .end local v10           #key:Ljava/lang/String;
    :catch_1
    #v0=(Conflicted);v1=(Conflicted);v10=(Conflicted);v22=(Conflicted);v24=(Conflicted);
    move-exception v4

    .line 131
    .restart local v4       #e:Ljava/io/UnsupportedEncodingException;
    #v4=(Reference);
    invoke-virtual {v4}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    goto/16 :goto_2

    .line 151
    .end local v4           #e:Ljava/io/UnsupportedEncodingException;
    .end local v12           #postPairs:Ljava/util/List;,"Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    .restart local v3       #builder:Ljava/lang/StringBuilder;
    .restart local v5       #finalHttpClient:Lorg/apache/http/client/HttpClient;
    .restart local v6       #finalHttpRequest:Lorg/apache/http/client/methods/HttpPost;
    .restart local v11       #line:Ljava/lang/String;
    .restart local v15       #reader:Ljava/io/BufferedReader;
    .restart local v17       #response:Lorg/apache/http/HttpResponse;
    .restart local v18       #status:I
    :cond_4
    :try_start_3
    #v0=(Reference);v1=(PosShort);v3=(Reference);v4=(Conflicted);v5=(Reference);v6=(Reference);v11=(Reference);v12=(Conflicted);v15=(Reference);v17=(Reference);v18=(Integer);v22=(Reference);v24=(Reference);
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    const-string v23, "\n"

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto/16 :goto_3

    .line 172
    .end local v3           #builder:Ljava/lang/StringBuilder;
    .end local v11           #line:Ljava/lang/String;
    .end local v15           #reader:Ljava/io/BufferedReader;
    .end local v17           #response:Lorg/apache/http/HttpResponse;
    .end local v18           #status:I
    :catch_2
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v9=(Conflicted);v11=(Conflicted);v15=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);
    move-exception v4

    .line 173
    .local v4, e:Ljava/lang/Exception;
    #v4=(Reference);
    const-string v22, "ChartBoost"

    #v22=(Reference);
    new-instance v23, Ljava/lang/StringBuilder;

    #v23=(UninitRef);
    const-string v24, "Exception on http request: "

    #v24=(Reference);
    invoke-direct/range {v23 .. v24}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v23=(Reference);
    invoke-virtual {v4}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {v23 .. v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v23

    invoke-static/range {v22 .. v23}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 174
    const/4 v7, 0x0

    #v7=(Null);
    goto/16 :goto_4

    .line 167
    .end local v4           #e:Ljava/lang/Exception;
    .restart local v17       #response:Lorg/apache/http/HttpResponse;
    .restart local v18       #status:I
    :cond_5
    :try_start_4
    #v0=(Integer);v1=(PosShort);v3=(Uninit);v4=(Conflicted);v7=(Uninit);v9=(Uninit);v11=(Uninit);v15=(Uninit);v17=(Reference);v18=(Integer);v19=(Uninit);v22=(PosShort);v24=(Conflicted);
    const-string v22, "ChartBoost"

    #v22=(Reference);
    new-instance v23, Ljava/lang/StringBuilder;

    #v23=(UninitRef);
    const-string v24, "Request failed: "

    #v24=(Reference);
    invoke-direct/range {v23 .. v24}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v23=(Reference);
    move-object/from16 v0, v23

    #v0=(Reference);
    move-object/from16 v1, v17

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v23

    invoke-static/range {v22 .. v23}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 169
    const/4 v7, 0x0

    #v7=(Null);
    goto/16 :goto_4
.end method

.method public getEndpoint()Ljava/lang/String;
    .locals 1

    .prologue
    .line 262
    iget-object v0, p0, Lcom/chartboost/sdk/CBAPIConnection;->endpoint:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {p0, p1}, Lcom/chartboost/sdk/CBAPIConnection;->onPostExecute(Lorg/json/JSONObject;)V

    return-void
.end method

.method protected onPostExecute(Lorg/json/JSONObject;)V
    .locals 2
    .parameter "json"

    .prologue
    .line 198
    iget-object v1, p0, Lcom/chartboost/sdk/CBAPIConnection;->progressDialog:Landroid/app/ProgressDialog;

    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 200
    :try_start_0
    iget-object v1, p0, Lcom/chartboost/sdk/CBAPIConnection;->progressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 207
    :cond_0
    :goto_0
    #v0=(Conflicted);
    const/4 v1, 0x0

    #v1=(Null);
    iput-object v1, p0, Lcom/chartboost/sdk/CBAPIConnection;->progressDialog:Landroid/app/ProgressDialog;

    .line 208
    return-void

    .line 202
    :catch_0
    #v0=(Uninit);v1=(Reference);
    move-exception v0

    .line 204
    .local v0, e:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method protected onPreExecute()V
    .locals 6

    .prologue
    const/4 v3, 0x1

    .line 78
    #v3=(One);
    iget-boolean v0, p0, Lcom/chartboost/sdk/CBAPIConnection;->shouldShowProgress:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 81
    iget-object v0, p0, Lcom/chartboost/sdk/CBAPIConnection;->context:Landroid/content/Context;

    .line 82
    #v0=(Reference);
    const/4 v1, 0x0

    .line 83
    #v1=(Null);
    iget-object v2, p0, Lcom/chartboost/sdk/CBAPIConnection;->loadingMessage:Ljava/lang/String;

    .line 86
    #v2=(Reference);
    new-instance v5, Lcom/chartboost/sdk/CBAPIConnection$1;

    #v5=(UninitRef);
    invoke-direct {v5, p0}, Lcom/chartboost/sdk/CBAPIConnection$1;-><init>(Lcom/chartboost/sdk/CBAPIConnection;)V

    #v5=(Reference);
    move v4, v3

    .line 80
    #v4=(One);
    invoke-static/range {v0 .. v5}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZLandroid/content/DialogInterface$OnCancelListener;)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/chartboost/sdk/CBAPIConnection;->progressDialog:Landroid/app/ProgressDialog;

    .line 94
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void
.end method

.method public sendRequest()V
    .locals 0

    .prologue
    .line 241
    return-void
.end method

.method public setEndpoint(Ljava/lang/String;)V
    .locals 0
    .parameter "endpoint"

    .prologue
    .line 269
    iput-object p1, p0, Lcom/chartboost/sdk/CBAPIConnection;->endpoint:Ljava/lang/String;

    .line 270
    return-void
.end method

.method protected validateJson(Lorg/json/JSONObject;)V
    .locals 3
    .parameter "json"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 179
    if-eqz p1, :cond_1

    .line 180
    const-string v1, "status"

    #v1=(Reference);
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 181
    .local v0, status:I
    #v0=(Integer);
    const/16 v1, 0x12c

    #v1=(PosShort);
    if-ge v0, v1, :cond_0

    const/16 v1, 0xc8

    if-lt v0, v1, :cond_0

    .line 183
    const-string v1, "JSON"

    #v1=(Reference);
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 184
    return-void

    .line 188
    :cond_0
    #v1=(PosShort);v2=(Uninit);
    new-instance v1, Ljava/io/IOException;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/io/IOException;-><init>()V

    #v1=(Reference);
    throw v1

    .line 191
    .end local v0           #status:I
    :cond_1
    #v0=(Uninit);v1=(Uninit);
    new-instance v1, Ljava/io/IOException;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/io/IOException;-><init>()V

    #v1=(Reference);
    throw v1
.end method

*/}
