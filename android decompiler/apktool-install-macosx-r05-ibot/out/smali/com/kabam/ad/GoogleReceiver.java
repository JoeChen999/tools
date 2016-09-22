package com.kabam.ad; class GoogleReceiver {/*

.class public Lcom/kabam/ad/GoogleReceiver;
.super Landroid/content/BroadcastReceiver;
.source "GoogleReceiver.java"


# instance fields
.field private mAddress:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 127
    #p0=(Reference);
    const-string v0, ""

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/ad/GoogleReceiver;->mAddress:Ljava/lang/String;

    .line 23
    return-void
.end method

.method private AddString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .parameter "s"

    .prologue
    .line 130
    iget-object v0, p0, Lcom/kabam/ad/GoogleReceiver;->mAddress:Ljava/lang/String;

    #v0=(Reference);
    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 131
    iput-object p1, p0, Lcom/kabam/ad/GoogleReceiver;->mAddress:Ljava/lang/String;

    .line 134
    :goto_0
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/kabam/ad/GoogleReceiver;->mAddress:Ljava/lang/String;

    #v0=(Reference);
    return-object v0

    .line 133
    :cond_0
    #v0=(Boolean);
    iget-object v0, p0, Lcom/kabam/ad/GoogleReceiver;->mAddress:Ljava/lang/String;

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    const-string v0, "&"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kabam/ad/GoogleReceiver;->mAddress:Ljava/lang/String;

    goto :goto_0
.end method

.method private TrackInstall()V
    .locals 11

    .prologue
    .line 103
    new-instance v8, Landroid/os/StrictMode$ThreadPolicy$Builder;

    #v8=(UninitRef);
    invoke-direct {v8}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    #v8=(Reference);
    invoke-virtual {v8}, Landroid/os/StrictMode$ThreadPolicy$Builder;->permitAll()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v8

    invoke-virtual {v8}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v4

    .line 104
    .local v4, policy:Landroid/os/StrictMode$ThreadPolicy;
    #v4=(Reference);
    invoke-static {v4}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 105
    new-instance v5, Lorg/apache/http/client/methods/HttpGet;

    #v5=(UninitRef);
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    const-string v9, "http://www.hobbitmobile.com/entrytag.php?"

    #v9=(Reference);
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v8=(Reference);
    iget-object v9, p0, Lcom/kabam/ad/GoogleReceiver;->mAddress:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v5, v8}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 108
    .local v5, request:Lorg/apache/http/client/methods/HttpGet;
    :try_start_0
    #v5=(Reference);
    new-instance v8, Lorg/apache/http/impl/client/DefaultHttpClient;

    #v8=(UninitRef);
    invoke-direct {v8}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    #v8=(Reference);
    invoke-virtual {v8, v5}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v6

    .line 109
    .local v6, response:Lorg/apache/http/HttpResponse;
    #v6=(Reference);
    invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v8

    invoke-interface {v8}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v8

    #v8=(Integer);
    const/16 v9, 0xc8

    #v9=(PosShort);
    if-ne v8, v9, :cond_0

    .line 111
    invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v8

    #v8=(Reference);
    invoke-static {v8}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;)Ljava/lang/String;

    move-result-object v7

    .line 112
    .local v7, result:Ljava/lang/String;
    #v7=(Reference);
    const-string v8, "result"

    invoke-static {v8, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 114
    new-instance v1, Lorg/json/JSONObject;

    #v1=(UninitRef);
    invoke-direct {v1, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 115
    .local v1, jo:Lorg/json/JSONObject;
    #v1=(Reference);
    const-string v8, "ok"

    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v3

    .line 116
    .local v3, ok:Z
    #v3=(Boolean);
    invoke-static {}, Lcom/kabam/ad/AdRecorder;->Instance()Lcom/kabam/ad/AdRecorder;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    #v9=(UninitRef);
    const-string v10, "ok"

    #v10=(Reference);
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v9=(Reference);
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/kabam/ad/AdRecorder;->Record(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 126
    .end local v1           #jo:Lorg/json/JSONObject;
    .end local v3           #ok:Z
    .end local v6           #response:Lorg/apache/http/HttpResponse;
    .end local v7           #result:Ljava/lang/String;
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    return-void

    .line 121
    :catch_0
    #v0=(Uninit);v2=(Uninit);
    move-exception v0

    .line 123
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    .line 124
    .local v2, message:Ljava/lang/String;
    #v2=(Reference);
    invoke-static {}, Lcom/kabam/ad/AdRecorder;->Instance()Lcom/kabam/ad/AdRecorder;

    move-result-object v8

    #v8=(Reference);
    new-instance v9, Ljava/lang/StringBuilder;

    #v9=(UninitRef);
    const-string v10, "tiexception_message"

    #v10=(Reference);
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v9=(Reference);
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/kabam/ad/AdRecorder;->Record(Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic access$0(Lcom/kabam/ad/GoogleReceiver;)V
    .locals 0
    .parameter

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/kabam/ad/GoogleReceiver;->TrackInstall()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 18
    .parameter "context"
    .parameter "intent"

    .prologue
    .line 30
    new-instance v12, Ljava/util/HashMap;

    #v12=(UninitRef);
    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 31
    .local v12, values:Ljava/util/HashMap;,"Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    #v12=(Reference);
    const-string v6, ""

    .line 32
    .local v6, extra:Ljava/lang/String;
    #v6=(Reference);
    const-string v13, "campaignkey"

    #v13=(Reference);
    move-object/from16 v0, p2

    #v0=(Reference);
    invoke-virtual {v0, v13}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 33
    .local v3, campaignkey:Ljava/lang/String;
    #v3=(Reference);
    invoke-static {}, Lcom/kabam/ad/AdRecorder;->Instance()Lcom/kabam/ad/AdRecorder;

    move-result-object v13

    new-instance v14, Ljava/lang/StringBuilder;

    #v14=(UninitRef);
    const-string v15, "campaignkey"

    #v15=(Reference);
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v14=(Reference);
    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Lcom/kabam/ad/AdRecorder;->Record(Ljava/lang/String;)V

    .line 37
    :try_start_0
    const-string v13, "referrer"

    move-object/from16 v0, p2

    invoke-virtual {v0, v13}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v13

    #v13=(Boolean);
    if-eqz v13, :cond_0

    .line 40
    const-string v13, "referrer"

    #v13=(Reference);
    move-object/from16 v0, p2

    invoke-virtual {v0, v13}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v14, "&"

    invoke-virtual {v13, v14}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v10

    .line 41
    .local v10, referrers:[Ljava/lang/String;
    #v10=(Reference);
    array-length v14, v10

    #v14=(Integer);
    const/4 v13, 0x0

    :goto_0
    #v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);v13=(Integer);v16=(Conflicted);v17=(Conflicted);
    if-lt v13, v14, :cond_1

    .line 55
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v13

    #v13=(Reference);
    const-string v14, "android_id"

    #v14=(Reference);
    invoke-static {v13, v14}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 57
    .local v2, androidID:Ljava/lang/String;
    #v2=(Reference);
    new-instance v13, Ljava/lang/StringBuilder;

    #v13=(UninitRef);
    const-string v14, "udid="

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v13=(Reference);
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v0, p0

    invoke-direct {v0, v13}, Lcom/kabam/ad/GoogleReceiver;->AddString(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    const-string v13, "type=mktinstall"

    move-object/from16 v0, p0

    invoke-direct {v0, v13}, Lcom/kabam/ad/GoogleReceiver;->AddString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 61
    :try_start_1
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v13

    move-object/from16 v0, p2

    invoke-virtual {v13, v0}, Lcom/kabam/utility/Provider;->ProvideJasonString(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v7

    .line 64
    .local v7, information:Ljava/lang/String;
    #v7=(Reference);
    new-instance v1, Lcom/kabam/ad/GoogleReceiver$1;

    #v1=(UninitRef);
    move-object/from16 v0, p0

    invoke-direct {v1, v0}, Lcom/kabam/ad/GoogleReceiver$1;-><init>(Lcom/kabam/ad/GoogleReceiver;)V

    .line 74
    .local v1, action:Ljava/lang/Runnable;
    #v1=(Reference);
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 76
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v13

    invoke-virtual {v13}, Lcom/kabam/utility/Provider;->ProvideAdwords()Lcom/kabam/ad/Adwords;

    move-result-object v13

    invoke-virtual {v13}, Lcom/kabam/ad/Adwords;->TrackInstall()V

    .line 80
    const-string v13, ""

    const-string v14, "ACTION_INSTALL_REFERRER: Arrives."

    invoke-static {v13, v14}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 99
    .end local v1           #action:Ljava/lang/Runnable;
    .end local v2           #androidID:Ljava/lang/String;
    .end local v7           #information:Ljava/lang/String;
    .end local v10           #referrers:[Ljava/lang/String;
    :cond_0
    :goto_1
    #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v10=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
    return-void

    .line 41
    .restart local v10       #referrers:[Ljava/lang/String;
    :cond_1
    :try_start_2
    #v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v10=(Reference);v13=(Integer);v14=(Integer);v15=(Reference);
    aget-object v9, v10, v13

    .line 43
    .local v9, referrerValue:Ljava/lang/String;
    #v9=(Null);
    const-string v15, "="

    invoke-virtual {v9, v15}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 45
    .local v8, keyValue:[Ljava/lang/String;
    #v8=(Reference);
    const/4 v15, 0x0

    #v15=(Null);
    aget-object v15, v8, v15

    invoke-virtual {v15}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v11

    .line 46
    .local v11, value:Ljava/lang/String;
    #v11=(Reference);
    invoke-static {v11, v11}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    const/4 v15, 0x1

    #v15=(One);
    aget-object v15, v8, v15

    #v15=(Null);
    const/16 v16, 0x1

    #v16=(One);
    aget-object v16, v8, v16

    #v16=(Null);
    invoke-static/range {v15 .. v16}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v15

    #v15=(Reference);
    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    #v15=(Boolean);
    if-eqz v15, :cond_2

    .line 49
    const-string v11, "campaign"

    .line 50
    :cond_2
    new-instance v15, Ljava/lang/StringBuilder;

    #v15=(UninitRef);
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    #v16=(Reference);
    invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v15=(Reference);
    const-string v16, "="

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    const/16 v16, 0x1

    #v16=(One);
    aget-object v16, v8, v16

    #v16=(Null);
    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v0, p0

    invoke-direct {v0, v15}, Lcom/kabam/ad/GoogleReceiver;->AddString(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    invoke-static {}, Lcom/kabam/ad/AdRecorder;->Instance()Lcom/kabam/ad/AdRecorder;

    move-result-object v15

    new-instance v16, Ljava/lang/StringBuilder;

    #v16=(UninitRef);
    const-string v17, "_sent_key_"

    #v17=(Reference);
    invoke-direct/range {v16 .. v17}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v16=(Reference);
    move-object/from16 v0, v16

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v15 .. v16}, Lcom/kabam/ad/AdRecorder;->Record(Ljava/lang/String;)V

    .line 52
    invoke-static {}, Lcom/kabam/ad/AdRecorder;->Instance()Lcom/kabam/ad/AdRecorder;

    move-result-object v15

    new-instance v16, Ljava/lang/StringBuilder;

    #v16=(UninitRef);
    const-string v17, "_sent_value_"

    invoke-direct/range {v16 .. v17}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v16=(Reference);
    const/16 v17, 0x1

    #v17=(One);
    aget-object v17, v8, v17

    #v17=(Null);
    invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v15 .. v16}, Lcom/kabam/ad/AdRecorder;->Record(Ljava/lang/String;)V

    .line 41
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_0

    .line 83
    .end local v8           #keyValue:[Ljava/lang/String;
    .end local v9           #referrerValue:Ljava/lang/String;
    .end local v11           #value:Ljava/lang/String;
    .restart local v2       #androidID:Ljava/lang/String;
    :catch_0
    #v1=(Conflicted);v2=(Reference);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);v13=(Reference);v14=(Reference);v16=(Conflicted);v17=(Conflicted);
    move-exception v5

    .line 86
    .local v5, ex:Ljava/lang/Exception;
    #v5=(Reference);
    invoke-virtual {v5}, Ljava/lang/Exception;->printStackTrace()V

    .line 87
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v13

    invoke-virtual {v13, v5}, Lcom/kabam/utility/Provider;->OnSendPaymentException(Ljava/lang/Exception;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_1

    .line 94
    .end local v2           #androidID:Ljava/lang/String;
    .end local v5           #ex:Ljava/lang/Exception;
    .end local v10           #referrers:[Ljava/lang/String;
    :catch_1
    #v2=(Conflicted);v5=(Conflicted);v10=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
    move-exception v4

    .line 96
    .local v4, e:Ljava/lang/Exception;
    #v4=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v13

    #v13=(Reference);
    invoke-virtual {v13, v4}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto/16 :goto_1
.end method

*/}
