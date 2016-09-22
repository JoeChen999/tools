package com.kabam.ad; class AdRecorder {/*

.class public Lcom/kabam/ad/AdRecorder;
.super Ljava/lang/Object;
.source "AdRecorder.java"


# static fields
.field protected static sInstance:Lcom/kabam/ad/AdRecorder;


# instance fields
.field private mAddress:Ljava/lang/String;

.field private mCampaign:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    new-instance v0, Lcom/kabam/ad/AdRecorder;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/kabam/ad/AdRecorder;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/kabam/ad/AdRecorder;->sInstance:Lcom/kabam/ad/AdRecorder;

    .line 16
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    #p0=(Reference);
    const-string v0, ""

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/ad/AdRecorder;->mAddress:Ljava/lang/String;

    .line 37
    const-string v0, ""

    iput-object v0, p0, Lcom/kabam/ad/AdRecorder;->mCampaign:Ljava/lang/String;

    .line 22
    return-void
.end method

.method private AddString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .parameter "s"

    .prologue
    .line 31
    iget-object v0, p0, Lcom/kabam/ad/AdRecorder;->mAddress:Ljava/lang/String;

    #v0=(Reference);
    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 32
    iput-object p1, p0, Lcom/kabam/ad/AdRecorder;->mAddress:Ljava/lang/String;

    .line 35
    :goto_0
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/kabam/ad/AdRecorder;->mAddress:Ljava/lang/String;

    #v0=(Reference);
    return-object v0

    .line 34
    :cond_0
    #v0=(Boolean);
    iget-object v0, p0, Lcom/kabam/ad/AdRecorder;->mAddress:Ljava/lang/String;

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

    iput-object v0, p0, Lcom/kabam/ad/AdRecorder;->mAddress:Ljava/lang/String;

    goto :goto_0
.end method

.method public static Instance()Lcom/kabam/ad/AdRecorder;
    .locals 1

    .prologue
    .line 26
    sget-object v0, Lcom/kabam/ad/AdRecorder;->sInstance:Lcom/kabam/ad/AdRecorder;

    #v0=(Reference);
    return-object v0
.end method

.method private PrepareAddress(Landroid/content/Context;)V
    .locals 3
    .parameter "context"

    .prologue
    .line 46
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "android_id"

    #v2=(Reference);
    invoke-static {v1, v2}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 48
    .local v0, androidID:Ljava/lang/String;
    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "udid="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/kabam/ad/AdRecorder;->AddString(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    const-string v1, "type=mktinstall"

    invoke-direct {p0, v1}, Lcom/kabam/ad/AdRecorder;->AddString(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "mktdebug="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    iget-object v2, p0, Lcom/kabam/ad/AdRecorder;->mCampaign:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/kabam/ad/AdRecorder;->AddString(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    return-void
.end method

.method private SendToServer()V
    .locals 7

    .prologue
    .line 70
    new-instance v4, Landroid/os/StrictMode$ThreadPolicy$Builder;

    #v4=(UninitRef);
    invoke-direct {v4}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/os/StrictMode$ThreadPolicy$Builder;->permitAll()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v4

    invoke-virtual {v4}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v1

    .line 71
    .local v1, policy:Landroid/os/StrictMode$ThreadPolicy;
    #v1=(Reference);
    invoke-static {v1}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 72
    new-instance v2, Lorg/apache/http/client/methods/HttpGet;

    #v2=(UninitRef);
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    const-string v5, "http://www.hobbitmobile.com/entrytag.php?"

    #v5=(Reference);
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    iget-object v5, p0, Lcom/kabam/ad/AdRecorder;->mAddress:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 74
    .local v2, request:Lorg/apache/http/client/methods/HttpGet;
    #v2=(Reference);
    const-string v4, "mCampaign"

    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    const-string v6, "mCampaign="

    #v6=(Reference);
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    iget-object v6, p0, Lcom/kabam/ad/AdRecorder;->mCampaign:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 78
    :try_start_0
    new-instance v4, Lorg/apache/http/impl/client/DefaultHttpClient;

    #v4=(UninitRef);
    invoke-direct {v4}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    #v4=(Reference);
    invoke-virtual {v4, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v3

    .line 79
    .local v3, response:Lorg/apache/http/HttpResponse;
    #v3=(Reference);
    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v4

    invoke-interface {v4}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v4

    #v4=(Integer);
    const/16 v5, 0xc8

    #v5=(PosShort);
    if-ne v4, v5, :cond_0

    .line 81
    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v4

    #v4=(Reference);
    invoke-static {v4}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    .end local v3           #response:Lorg/apache/http/HttpResponse;
    :cond_0
    :goto_0
    #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void

    .line 84
    :catch_0
    #v0=(Uninit);
    move-exception v0

    .line 86
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic access$0(Lcom/kabam/ad/AdRecorder;)V
    .locals 0
    .parameter

    .prologue
    .line 68
    invoke-direct {p0}, Lcom/kabam/ad/AdRecorder;->SendToServer()V

    return-void
.end method


# virtual methods
.method public Record(Ljava/lang/String;)V
    .locals 2
    .parameter "s"

    .prologue
    .line 40
    iget-object v0, p0, Lcom/kabam/ad/AdRecorder;->mCampaign:Ljava/lang/String;

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    const-string v0, "vvv"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kabam/ad/AdRecorder;->mCampaign:Ljava/lang/String;

    .line 42
    const-string v0, "insert string"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    return-void
.end method

.method public SendToServer(Landroid/content/Context;)V
    .locals 1
    .parameter "context"

    .prologue
    .line 55
    invoke-direct {p0, p1}, Lcom/kabam/ad/AdRecorder;->PrepareAddress(Landroid/content/Context;)V

    .line 56
    new-instance v0, Lcom/kabam/ad/AdRecorder$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/kabam/ad/AdRecorder$1;-><init>(Lcom/kabam/ad/AdRecorder;)V

    .line 66
    .local v0, action:Ljava/lang/Runnable;
    #v0=(Reference);
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 67
    return-void
.end method

*/}
