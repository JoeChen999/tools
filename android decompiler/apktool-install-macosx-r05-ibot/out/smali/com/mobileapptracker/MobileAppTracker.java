package com.mobileapptracker; class MobileAppTracker {/*

.class public Lcom/mobileapptracker/MobileAppTracker;
.super Ljava/lang/Object;
.source "MobileAppTracker.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mobileapptracker/MobileAppTracker$getLink;,
        Lcom/mobileapptracker/MobileAppTracker$getUserAgent;
    }
.end annotation


# static fields
.field private static final ATTRIBUTION_ID_COLUMN_NAME:Ljava/lang/String; = "aid"

.field private static final ATTRIBUTION_ID_CONTENT_URI:Landroid/net/Uri; = null

.field private static final DATE_FORMAT:Ljava/lang/String; = "yyyy-MM-dd HH:mm:ss"

.field private static DEBUG:Z = false

.field private static final DELAY:I = 0xbb8

.field private static final IV:Ljava/lang/String; = "heF9BATUfWuISyO8"

.field private static final MAX_DUMP_SIZE:I = 0x32

.field static final PREFS_FACEBOOK_INTENT:Ljava/lang/String; = "mat_fb_intent"

.field private static final PREFS_INSTALL:Ljava/lang/String; = "mat_install"

.field private static final PREFS_MAT_ID:Ljava/lang/String; = "mat_id"

.field private static final PREFS_NAME:Ljava/lang/String; = "mat_queue"

.field static final PREFS_REFERRER:Ljava/lang/String; = "mat_referrer"

.field private static final PREFS_VERSION:Ljava/lang/String; = "mat_app_version"

.field private static final SDK_VERSION:Ljava/lang/String; = "2.1"

.field private static final TAG:Ljava/lang/String; = "MobileAppTracker"

.field private static final TIMEOUT:I = 0x1388


# instance fields
.field private EventQueue:Landroid/content/SharedPreferences;

.field private SP:Landroid/content/SharedPreferences;

.field private URLEnc:Lcom/mobileapptracker/Encryption;

.field private client:Lorg/apache/http/client/HttpClient;

.field private constructed:Z

.field private context:Landroid/content/Context;

.field private encryptList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private httpsEncryption:Z

.field private initialized:Z

.field private install:Ljava/lang/String;

.field private key:Ljava/lang/String;

.field private paramTable:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private pool:Ljava/util/concurrent/ScheduledExecutorService;

.field private queueAvailable:Ljava/util/concurrent/Semaphore;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 70
    const-string v0, "content://com.facebook.katana.provider.AttributionIdProvider"

    #v0=(Reference);
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/mobileapptracker/MobileAppTracker;->ATTRIBUTION_ID_CONTENT_URI:Landroid/net/Uri;

    .line 82
    const/4 v0, 0x0

    #v0=(Null);
    sput-boolean v0, Lcom/mobileapptracker/MobileAppTracker;->DEBUG:Z

    .line 88
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .parameter "context"
    .parameter "advertiserId"
    .parameter "key"

    .prologue
    const/4 v4, 0x1

    .line 203
    #v4=(One);
    move-object v0, p0

    #v0=(UninitThis);
    move-object v1, p1

    #v1=(Reference);
    move-object v2, p2

    #v2=(Reference);
    move-object v3, p3

    #v3=(Reference);
    move v5, v4

    #v5=(One);
    invoke-direct/range {v0 .. v5}, Lcom/mobileapptracker/MobileAppTracker;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 204
    #v0=(Reference);p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 9
    .parameter "context"
    .parameter "advertiserId"
    .parameter "key"
    .parameter "collectDeviceId"
    .parameter "collectMacAddress"

    .prologue
    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    #p0=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    iput-boolean v5, p0, Lcom/mobileapptracker/MobileAppTracker;->initialized:Z

    .line 93
    const/4 v5, 0x0

    iput-boolean v5, p0, Lcom/mobileapptracker/MobileAppTracker;->constructed:Z

    .line 95
    const/4 v5, 0x1

    #v5=(One);
    iput-boolean v5, p0, Lcom/mobileapptracker/MobileAppTracker;->httpsEncryption:Z

    .line 123
    iget-boolean v5, p0, Lcom/mobileapptracker/MobileAppTracker;->constructed:Z

    #v5=(Boolean);
    if-eqz v5, :cond_0

    .line 196
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return-void

    .line 124
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Boolean);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    const/4 v5, 0x1

    #v5=(One);
    iput-boolean v5, p0, Lcom/mobileapptracker/MobileAppTracker;->constructed:Z

    .line 125
    iput-object p1, p0, Lcom/mobileapptracker/MobileAppTracker;->context:Landroid/content/Context;

    .line 126
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v5

    #v5=(Reference);
    iput-object v5, p0, Lcom/mobileapptracker/MobileAppTracker;->pool:Ljava/util/concurrent/ScheduledExecutorService;

    .line 127
    new-instance v5, Ljava/util/concurrent/Semaphore;

    #v5=(UninitRef);
    const/4 v6, 0x1

    #v6=(One);
    const/4 v7, 0x1

    #v7=(One);
    invoke-direct {v5, v6, v7}, Ljava/util/concurrent/Semaphore;-><init>(IZ)V

    #v5=(Reference);
    iput-object v5, p0, Lcom/mobileapptracker/MobileAppTracker;->queueAvailable:Ljava/util/concurrent/Semaphore;

    .line 130
    new-instance v4, Lorg/apache/http/conn/scheme/SchemeRegistry;

    #v4=(UninitRef);
    invoke-direct {v4}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V

    .line 131
    .local v4, registry:Lorg/apache/http/conn/scheme/SchemeRegistry;
    #v4=(Reference);
    new-instance v5, Lorg/apache/http/conn/scheme/Scheme;

    #v5=(UninitRef);
    const-string v6, "http"

    #v6=(Reference);
    invoke-static {}, Lorg/apache/http/conn/scheme/PlainSocketFactory;->getSocketFactory()Lorg/apache/http/conn/scheme/PlainSocketFactory;

    move-result-object v7

    #v7=(Reference);
    const/16 v8, 0x50

    #v8=(PosByte);
    invoke-direct {v5, v6, v7, v8}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    #v5=(Reference);
    invoke-virtual {v4, v5}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 132
    new-instance v5, Lorg/apache/http/conn/scheme/Scheme;

    #v5=(UninitRef);
    const-string v6, "https"

    invoke-static {}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->getSocketFactory()Lorg/apache/http/conn/ssl/SSLSocketFactory;

    move-result-object v7

    const/16 v8, 0x1bb

    #v8=(PosShort);
    invoke-direct {v5, v6, v7, v8}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    #v5=(Reference);
    invoke-virtual {v4, v5}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 133
    new-instance v3, Lorg/apache/http/params/BasicHttpParams;

    #v3=(UninitRef);
    invoke-direct {v3}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 134
    .local v3, params:Lorg/apache/http/params/HttpParams;
    #v3=(Reference);
    const/16 v5, 0x2000

    #v5=(PosShort);
    invoke-static {v3, v5}, Lorg/apache/http/params/HttpConnectionParams;->setSocketBufferSize(Lorg/apache/http/params/HttpParams;I)V

    .line 135
    const/16 v5, 0x1388

    invoke-static {v3, v5}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 136
    const/16 v5, 0x1388

    invoke-static {v3, v5}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 138
    new-instance v0, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;

    #v0=(UninitRef);
    invoke-direct {v0, v3, v4}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V

    .line 139
    .local v0, connManager:Lorg/apache/http/conn/ClientConnectionManager;
    #v0=(Reference);
    new-instance v5, Lorg/apache/http/impl/client/DefaultHttpClient;

    #v5=(UninitRef);
    invoke-direct {v5, v0, v3}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V

    #v5=(Reference);
    iput-object v5, p0, Lcom/mobileapptracker/MobileAppTracker;->client:Lorg/apache/http/client/HttpClient;

    .line 141
    new-instance v5, Ljava/util/concurrent/ConcurrentHashMap;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    #v5=(Reference);
    iput-object v5, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 142
    const/16 v5, 0x1a

    #v5=(PosByte);
    new-array v5, v5, [Ljava/lang/String;

    #v5=(Reference);
    const/4 v6, 0x0

    #v6=(Null);
    const-string v7, "ir"

    aput-object v7, v5, v6

    const/4 v6, 0x1

    .line 143
    #v6=(One);
    const-string v7, "d"

    aput-object v7, v5, v6

    const/4 v6, 0x2

    .line 144
    #v6=(PosByte);
    const-string v7, "db"

    aput-object v7, v5, v6

    const/4 v6, 0x3

    .line 145
    const-string v7, "dm"

    aput-object v7, v5, v6

    const/4 v6, 0x4

    .line 146
    const-string v7, "ma"

    aput-object v7, v5, v6

    const/4 v6, 0x5

    .line 147
    const-string v7, "ov"

    aput-object v7, v5, v6

    const/4 v6, 0x6

    .line 148
    const-string v7, "cc"

    aput-object v7, v5, v6

    const/4 v6, 0x7

    .line 149
    const-string v7, "l"

    aput-object v7, v5, v6

    const/16 v6, 0x8

    .line 150
    const-string v7, "an"

    aput-object v7, v5, v6

    const/16 v6, 0x9

    .line 151
    const-string v7, "pn"

    aput-object v7, v5, v6

    const/16 v6, 0xa

    .line 152
    const-string v7, "av"

    aput-object v7, v5, v6

    const/16 v6, 0xb

    .line 153
    const-string v7, "dc"

    aput-object v7, v5, v6

    const/16 v6, 0xc

    .line 154
    const-string v7, "ad"

    aput-object v7, v5, v6

    const/16 v6, 0xd

    .line 155
    const-string v7, "r"

    aput-object v7, v5, v6

    const/16 v6, 0xe

    .line 156
    const-string v7, "c"

    aput-object v7, v5, v6

    const/16 v6, 0xf

    .line 157
    const-string v7, "id"

    aput-object v7, v5, v6

    const/16 v6, 0x10

    .line 158
    const-string v7, "ua"

    aput-object v7, v5, v6

    const/16 v6, 0x11

    .line 159
    const-string v7, "tpid"

    aput-object v7, v5, v6

    const/16 v6, 0x12

    .line 160
    const-string v7, "ar"

    aput-object v7, v5, v6

    const/16 v6, 0x13

    .line 161
    const-string v7, "connection_type"

    aput-object v7, v5, v6

    const/16 v6, 0x14

    .line 162
    const-string v7, "mobile_country_code"

    aput-object v7, v5, v6

    const/16 v6, 0x15

    .line 163
    const-string v7, "mobile_network_code"

    aput-object v7, v5, v6

    const/16 v6, 0x16

    .line 164
    const-string v7, "screen_density"

    aput-object v7, v5, v6

    const/16 v6, 0x17

    .line 165
    const-string v7, "screen_layout_size"

    aput-object v7, v5, v6

    const/16 v6, 0x18

    .line 166
    const-string v7, "ti"

    aput-object v7, v5, v6

    const/16 v6, 0x19

    .line 167
    const-string v7, "android_purchase_status"

    aput-object v7, v5, v6

    .line 142
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    iput-object v5, p0, Lcom/mobileapptracker/MobileAppTracker;->encryptList:Ljava/util/List;

    .line 169
    invoke-direct/range {p0 .. p5}, Lcom/mobileapptracker/MobileAppTracker;->initializeVariables(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZZ)Z

    move-result v5

    #v5=(Boolean);
    iput-boolean v5, p0, Lcom/mobileapptracker/MobileAppTracker;->initialized:Z

    .line 170
    new-instance v5, Lcom/mobileapptracker/Encryption;

    #v5=(UninitRef);
    const-string v6, "heF9BATUfWuISyO8"

    #v6=(Reference);
    invoke-direct {v5, p3, v6}, Lcom/mobileapptracker/Encryption;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    #v5=(Reference);
    iput-object v5, p0, Lcom/mobileapptracker/MobileAppTracker;->URLEnc:Lcom/mobileapptracker/Encryption;

    .line 171
    const-string v5, "mat_queue"

    const/4 v6, 0x0

    #v6=(Null);
    invoke-virtual {p1, v5, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v5

    iput-object v5, p0, Lcom/mobileapptracker/MobileAppTracker;->EventQueue:Landroid/content/SharedPreferences;

    .line 172
    const-string v5, "mat_install"

    const/4 v6, 0x0

    invoke-virtual {p1, v5, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v5

    iput-object v5, p0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    .line 173
    iget-object v5, p0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    const-string v6, "install"

    #v6=(Reference);
    const-string v7, ""

    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lcom/mobileapptracker/MobileAppTracker;->install:Ljava/lang/String;

    .line 174
    iget-boolean v5, p0, Lcom/mobileapptracker/MobileAppTracker;->initialized:Z

    #v5=(Boolean);
    if-eqz v5, :cond_1

    invoke-direct {p0}, Lcom/mobileapptracker/MobileAppTracker;->getQueueSize()I

    move-result v5

    #v5=(Integer);
    if-lez v5, :cond_1

    invoke-direct {p0}, Lcom/mobileapptracker/MobileAppTracker;->isOnline()Z

    move-result v5

    #v5=(Boolean);
    if-eqz v5, :cond_1

    .line 175
    invoke-direct {p0}, Lcom/mobileapptracker/MobileAppTracker;->dumpQueue()V

    .line 179
    :cond_1
    #v5=(Integer);
    new-instance v2, Lcom/mobileapptracker/MobileAppTracker$1;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Lcom/mobileapptracker/MobileAppTracker$1;-><init>(Lcom/mobileapptracker/MobileAppTracker;)V

    .line 191
    .local v2, networkStateReceiver:Landroid/content/BroadcastReceiver;
    :try_start_0
    #v2=(Reference);
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {v5, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 194
    :goto_1
    new-instance v1, Landroid/content/IntentFilter;

    #v1=(UninitRef);
    const-string v5, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v1, v5}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 195
    .local v1, filter:Landroid/content/IntentFilter;
    #v1=(Reference);
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5, v2, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    goto/16 :goto_0

    .line 192
    .end local v1           #filter:Landroid/content/IntentFilter;
    :catch_0
    #v1=(Uninit);v5=(Conflicted);
    move-exception v5

    #v5=(Reference);
    goto :goto_1
.end method

.method static synthetic access$0(Lcom/mobileapptracker/MobileAppTracker;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 1219
    invoke-direct {p0, p1}, Lcom/mobileapptracker/MobileAppTracker;->setUserAgent(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$1()Z
    .locals 1

    .prologue
    .line 82
    sget-boolean v0, Lcom/mobileapptracker/MobileAppTracker;->DEBUG:Z

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$2(Lcom/mobileapptracker/MobileAppTracker;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 767
    invoke-direct {p0, p1}, Lcom/mobileapptracker/MobileAppTracker;->buildData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$3(Lcom/mobileapptracker/MobileAppTracker;)Lorg/apache/http/client/HttpClient;
    .locals 1
    .parameter

    .prologue
    .line 107
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->client:Lorg/apache/http/client/HttpClient;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$4(Lcom/mobileapptracker/MobileAppTracker;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 211
    invoke-direct {p0, p1, p2}, Lcom/mobileapptracker/MobileAppTracker;->addEventToQueue(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$5(Lcom/mobileapptracker/MobileAppTracker;)I
    .locals 1
    .parameter

    .prologue
    .line 242
    invoke-direct {p0}, Lcom/mobileapptracker/MobileAppTracker;->getQueueSize()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method static synthetic access$6(Lcom/mobileapptracker/MobileAppTracker;)V
    .locals 0
    .parameter

    .prologue
    .line 261
    invoke-direct {p0}, Lcom/mobileapptracker/MobileAppTracker;->dumpQueue()V

    return-void
.end method

.method private addEventToQueue(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .parameter "event"
    .parameter "json"

    .prologue
    .line 214
    :try_start_0
    iget-object v5, p0, Lcom/mobileapptracker/MobileAppTracker;->queueAvailable:Ljava/util/concurrent/Semaphore;

    #v5=(Reference);
    invoke-virtual {v5}, Ljava/util/concurrent/Semaphore;->acquire()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 219
    :goto_0
    #v2=(Conflicted);v5=(Conflicted);
    new-instance v4, Lorg/json/JSONObject;

    #v4=(UninitRef);
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 221
    .local v4, jsonEvent:Lorg/json/JSONObject;
    :try_start_1
    #v4=(Reference);
    const-string v5, "link"

    #v5=(Reference);
    invoke-virtual {v4, v5, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 222
    if-eqz p2, :cond_0

    .line 223
    const-string v5, "json"

    invoke-virtual {v4, v5, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 228
    :cond_0
    :goto_1
    #v5=(Conflicted);
    iget-object v5, p0, Lcom/mobileapptracker/MobileAppTracker;->EventQueue:Landroid/content/SharedPreferences;

    #v5=(Reference);
    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    .line 229
    .local v3, editor:Landroid/content/SharedPreferences$Editor;
    #v3=(Reference);
    iget-object v5, p0, Lcom/mobileapptracker/MobileAppTracker;->EventQueue:Landroid/content/SharedPreferences;

    const-string v6, "queuesize"

    #v6=(Reference);
    const/4 v7, 0x0

    #v7=(Null);
    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 230
    .local v1, count:I
    #v1=(Integer);
    add-int/lit8 v1, v1, 0x1

    .line 231
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    .line 232
    .local v0, cnt:Ljava/lang/String;
    #v0=(Reference);
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v0, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 233
    const-string v5, "queuesize"

    invoke-interface {v3, v5, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 234
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 235
    iget-object v5, p0, Lcom/mobileapptracker/MobileAppTracker;->queueAvailable:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v5}, Ljava/util/concurrent/Semaphore;->release()V

    .line 236
    return-void

    .line 215
    .end local v0           #cnt:Ljava/lang/String;
    .end local v1           #count:I
    .end local v3           #editor:Landroid/content/SharedPreferences$Editor;
    .end local v4           #jsonEvent:Lorg/json/JSONObject;
    :catch_0
    move-exception v2

    .line 216
    .local v2, e:Ljava/lang/InterruptedException;
    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0

    .line 225
    .end local v2           #e:Ljava/lang/InterruptedException;
    .restart local v4       #jsonEvent:Lorg/json/JSONObject;
    :catch_1
    #v2=(Conflicted);v4=(Reference);
    move-exception v2

    .line 226
    .local v2, e:Lorg/json/JSONException;
    #v2=(Reference);
    invoke-virtual {v2}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_1
.end method

.method private buildData(Ljava/lang/String;)Ljava/lang/String;
    .locals 14
    .parameter "origLink"

    .prologue
    .line 768
    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    invoke-direct {v7, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 771
    .local v7, link:Ljava/lang/StringBuilder;
    #v7=(Reference);
    invoke-virtual {p0}, Lcom/mobileapptracker/MobileAppTracker;->getReferrer()Ljava/lang/String;

    move-result-object v11

    #v11=(Reference);
    if-eqz v11, :cond_0

    invoke-virtual {p0}, Lcom/mobileapptracker/MobileAppTracker;->getReferrer()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v11

    #v11=(Integer);
    if-nez v11, :cond_0

    .line 772
    iget-object v11, p0, Lcom/mobileapptracker/MobileAppTracker;->context:Landroid/content/Context;

    #v11=(Reference);
    const-string v12, "mat_referrer"

    #v12=(Reference);
    const/4 v13, 0x0

    #v13=(Null);
    invoke-virtual {v11, v12, v13}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v11

    iput-object v11, p0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    .line 774
    :try_start_0
    iget-object v11, p0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    const-string v12, "referrer"

    const-string v13, ""

    #v13=(Reference);
    invoke-interface {v11, v12, v13}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 776
    .local v9, referrer:Ljava/lang/String;
    #v9=(Reference);
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v11

    #v11=(Integer);
    if-eqz v11, :cond_0

    .line 777
    invoke-virtual {p0, v9}, Lcom/mobileapptracker/MobileAppTracker;->setReferrer(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 784
    .end local v9           #referrer:Ljava/lang/String;
    :cond_0
    :goto_0
    #v3=(Conflicted);v9=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    new-instance v10, Ljava/text/SimpleDateFormat;

    #v10=(UninitRef);
    const-string v11, "yyyy-MM-dd HH:mm:ss"

    #v11=(Reference);
    sget-object v12, Ljava/util/Locale;->US:Ljava/util/Locale;

    #v12=(Reference);
    invoke-direct {v10, v11, v12}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 785
    .local v10, sdfDate:Ljava/text/SimpleDateFormat;
    #v10=(Reference);
    new-instance v8, Ljava/util/Date;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/util/Date;-><init>()V

    .line 786
    .local v8, now:Ljava/util/Date;
    #v8=(Reference);
    invoke-virtual {v10, v8}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 788
    .local v0, currentTime:Ljava/lang/String;
    :try_start_1
    #v0=(Reference);
    const-string v11, "UTF-8"

    invoke-static {v0, v11}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    .line 794
    :cond_1
    :goto_1
    #v11=(Conflicted);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 795
    .local v1, data:Ljava/lang/StringBuilder;
    #v1=(Reference);
    iget-object v11, p0, Lcom/mobileapptracker/MobileAppTracker;->encryptList:Ljava/util/List;

    #v11=(Reference);
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_2
    :goto_2
    #v5=(Conflicted);
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    #v11=(Boolean);
    if-nez v11, :cond_5

    .line 800
    const-string v11, "&sd="

    #v11=(Reference);
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 803
    :try_start_2
    invoke-direct {p0}, Lcom/mobileapptracker/MobileAppTracker;->getFacebookAttributionId()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_3

    .line 804
    const-string v11, "&fb_cookie_id="

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-direct {p0}, Lcom/mobileapptracker/MobileAppTracker;->getFacebookAttributionId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 811
    :cond_3
    :goto_3
    iget-object v11, p0, Lcom/mobileapptracker/MobileAppTracker;->context:Landroid/content/Context;

    const-string v12, "mat_fb_intent"

    const/4 v13, 0x0

    #v13=(Null);
    invoke-virtual {v11, v12, v13}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v11

    iput-object v11, p0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    .line 812
    iget-object v11, p0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    const-string v12, "action"

    const-string v13, ""

    #v13=(Reference);
    invoke-interface {v11, v12, v13}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 813
    .local v6, intent:Ljava/lang/String;
    #v6=(Reference);
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v11

    #v11=(Integer);
    if-eqz v11, :cond_4

    .line 815
    :try_start_3
    const-string v11, "UTF-8"

    #v11=(Reference);
    invoke-static {v6, v11}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_3
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_3 .. :try_end_3} :catch_4

    move-result-object v6

    .line 819
    :goto_4
    const-string v11, "&source="

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 821
    iget-object v11, p0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    invoke-interface {v11}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    .line 822
    .local v4, editor:Landroid/content/SharedPreferences$Editor;
    #v4=(Reference);
    const-string v11, "action"

    invoke-interface {v4, v11}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 823
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 827
    .end local v4           #editor:Landroid/content/SharedPreferences$Editor;
    :cond_4
    :try_start_4
    #v4=(Conflicted);v11=(Conflicted);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    iget-object v11, p0, Lcom/mobileapptracker/MobileAppTracker;->URLEnc:Lcom/mobileapptracker/Encryption;

    #v11=(Reference);
    iget-object v12, p0, Lcom/mobileapptracker/MobileAppTracker;->URLEnc:Lcom/mobileapptracker/Encryption;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/mobileapptracker/Encryption;->encrypt(Ljava/lang/String;)[B

    move-result-object v12

    invoke-virtual {v11, v12}, Lcom/mobileapptracker/Encryption;->bytesToHex([B)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .end local v1           #data:Ljava/lang/StringBuilder;
    .local v2, data:Ljava/lang/StringBuilder;
    #v2=(Reference);
    move-object v1, v2

    .line 832
    .end local v2           #data:Ljava/lang/StringBuilder;
    .restart local v1       #data:Ljava/lang/StringBuilder;
    :goto_5
    #v2=(Conflicted);v11=(Conflicted);
    const-string v11, "&da="

    #v11=(Reference);
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 833
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    return-object v11

    .line 779
    .end local v0           #currentTime:Ljava/lang/String;
    .end local v1           #data:Ljava/lang/StringBuilder;
    .end local v6           #intent:Ljava/lang/String;
    .end local v8           #now:Ljava/util/Date;
    .end local v10           #sdfDate:Ljava/text/SimpleDateFormat;
    :catch_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v10=(Uninit);v11=(Conflicted);
    move-exception v3

    .line 780
    .local v3, e:Ljava/lang/ClassCastException;
    #v3=(Reference);
    invoke-virtual {v3}, Ljava/lang/ClassCastException;->printStackTrace()V

    goto/16 :goto_0

    .line 789
    .end local v3           #e:Ljava/lang/ClassCastException;
    .restart local v0       #currentTime:Ljava/lang/String;
    .restart local v8       #now:Ljava/util/Date;
    .restart local v10       #sdfDate:Ljava/text/SimpleDateFormat;
    :catch_1
    #v0=(Reference);v3=(Conflicted);v8=(Reference);v10=(Reference);v11=(Reference);v13=(Conflicted);
    move-exception v3

    .line 790
    .local v3, e:Ljava/io/UnsupportedEncodingException;
    #v3=(Reference);
    sget-boolean v11, Lcom/mobileapptracker/MobileAppTracker;->DEBUG:Z

    #v11=(Boolean);
    if-eqz v11, :cond_1

    const-string v11, "MobileAppTracker"

    #v11=(Reference);
    const-string v12, "convert system date failed"

    invoke-static {v11, v12}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    .line 795
    .end local v3           #e:Ljava/io/UnsupportedEncodingException;
    .restart local v1       #data:Ljava/lang/StringBuilder;
    :cond_5
    #v1=(Reference);v3=(Conflicted);v5=(Conflicted);v11=(Boolean);
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    #v5=(Reference);
    check-cast v5, Ljava/lang/String;

    .line 796
    .local v5, encrypt:Ljava/lang/String;
    iget-object v11, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v11=(Reference);
    invoke-virtual {v11, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-eqz v11, :cond_2

    .line 797
    const-string v11, "&"

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v13, "="

    #v13=(Reference);
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    iget-object v11, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v11, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_2

    .line 806
    .end local v5           #encrypt:Ljava/lang/String;
    :catch_2
    #v5=(Conflicted);v13=(Conflicted);
    move-exception v3

    .line 807
    .local v3, e:Ljava/lang/Exception;
    #v3=(Reference);
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_3

    .line 828
    .end local v3           #e:Ljava/lang/Exception;
    .restart local v6       #intent:Ljava/lang/String;
    :catch_3
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Reference);v11=(Conflicted);v13=(Reference);
    move-exception v3

    .line 829
    .restart local v3       #e:Ljava/lang/Exception;
    #v3=(Reference);
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_5

    .line 816
    .end local v3           #e:Ljava/lang/Exception;
    :catch_4
    #v2=(Uninit);v3=(Conflicted);v4=(Uninit);
    move-exception v11

    #v11=(Reference);
    goto/16 :goto_4
.end method

.method private buildLink()Ljava/lang/String;
    .locals 11

    .prologue
    const/4 v2, 0x0

    .line 723
    #v2=(Null);
    const-string v7, "https://"

    .line 724
    .local v7, encryption:Ljava/lang/String;
    #v7=(Reference);
    iget-boolean v0, p0, Lcom/mobileapptracker/MobileAppTracker;->httpsEncryption:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 725
    const-string v7, "http://"

    .line 727
    :cond_0
    new-instance v9, Ljava/lang/StringBuilder;

    #v9=(UninitRef);
    invoke-direct {v9, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 728
    .local v9, link:Ljava/lang/StringBuilder;
    #v9=(Reference);
    invoke-virtual {p0}, Lcom/mobileapptracker/MobileAppTracker;->getAdvertiserId()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ".engine.mobileapptracking.com/serve?s=android&ver="

    #v3=(Reference);
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "2.1"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "&pn="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mobileapptracker/MobileAppTracker;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 729
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    #v0=(Conflicted);v4=(Conflicted);v8=(Conflicted);
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_4

    .line 737
    sget-boolean v0, Lcom/mobileapptracker/MobileAppTracker;->DEBUG:Z

    if-eqz v0, :cond_2

    .line 738
    const-string v0, "&debug=1&skip_dup=1"

    #v0=(Reference);
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 742
    :cond_2
    #v0=(Conflicted);
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    const-string v3, "content://"

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    invoke-virtual {p0}, Lcom/mobileapptracker/MobileAppTracker;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/referrer_apps"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 743
    .local v1, allTitles:Landroid/net/Uri;
    #v1=(Reference);
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v5, "publisher_package_name desc"

    #v5=(Reference);
    move-object v3, v2

    #v3=(Null);
    move-object v4, v2

    #v4=(Null);
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 744
    .local v6, c:Landroid/database/Cursor;
    #v6=(Reference);
    if-eqz v6, :cond_3

    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_3

    .line 745
    const-string v0, "tracking_id"

    #v0=(Reference);
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 748
    .local v10, trackingId:Ljava/lang/String;
    :try_start_0
    #v10=(Reference);
    const-string v0, "UTF-8"

    #v0=(Reference);
    invoke-static {v10, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v10

    .line 753
    :goto_1
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v2, "tracking_id"

    #v2=(Reference);
    invoke-virtual {v0, v2, v10}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 756
    .end local v10           #trackingId:Ljava/lang/String;
    :cond_3
    :try_start_1
    #v0=(Conflicted);v10=(Conflicted);
    invoke-interface {v6}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 759
    :goto_2
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0

    .line 729
    .end local v1           #allTitles:Landroid/net/Uri;
    .end local v6           #c:Landroid/database/Cursor;
    :cond_4
    #v0=(Boolean);v1=(Uninit);v2=(Null);v3=(Reference);v4=(Conflicted);v5=(Uninit);v6=(Uninit);v10=(Uninit);
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    #v8=(Reference);
    check-cast v8, Ljava/lang/String;

    .line 731
    .local v8, key:Ljava/lang/String;
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->encryptList:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    .line 732
    const-string v0, "&"

    #v0=(Reference);
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "="

    #v4=(Reference);
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v8}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 757
    .end local v8           #key:Ljava/lang/String;
    .restart local v1       #allTitles:Landroid/net/Uri;
    .restart local v6       #c:Landroid/database/Cursor;
    :catch_0
    #v0=(Conflicted);v1=(Reference);v2=(Reference);v3=(Null);v4=(Null);v5=(Reference);v6=(Reference);v8=(Conflicted);v10=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_2

    .line 749
    .restart local v10       #trackingId:Ljava/lang/String;
    :catch_1
    #v0=(Conflicted);v2=(Null);v10=(Reference);
    move-exception v0

    #v0=(Reference);
    goto :goto_1
.end method

.method private static containsChar(Ljava/lang/String;)Z
    .locals 6
    .parameter "s"

    .prologue
    const/4 v1, 0x0

    .line 1286
    #v1=(Null);
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    #v3=(Reference);
    array-length v4, v3

    #v4=(Integer);
    move v2, v1

    :goto_0
    #v0=(Conflicted);v2=(Integer);v5=(Conflicted);
    if-lt v2, v4, :cond_0

    .line 1291
    :goto_1
    #v1=(Boolean);
    return v1

    .line 1286
    :cond_0
    #v1=(Null);
    aget-char v0, v3, v2

    .line 1287
    .local v0, c:C
    #v0=(Char);
    invoke-static {v0}, Ljava/lang/Character;->isLetter(C)Z

    move-result v5

    #v5=(Boolean);
    if-eqz v5, :cond_1

    .line 1288
    const/4 v1, 0x1

    #v1=(One);
    goto :goto_1

    .line 1286
    :cond_1
    #v1=(Null);
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method private declared-synchronized dumpQueue()V
    .locals 12

    .prologue
    .line 262
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/mobileapptracker/MobileAppTracker;->getQueueSize()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v8

    .line 263
    .local v8, size:I
    #v8=(Integer);
    if-nez v8, :cond_1

    .line 304
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    monitor-exit p0

    return-void

    .line 267
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
    const/4 v9, 0x1

    .line 268
    .local v9, x:I
    #v9=(One);
    const/16 v10, 0x32

    #v10=(PosByte);
    if-le v8, v10, :cond_2

    .line 269
    add-int/lit8 v10, v8, -0x32

    #v10=(Integer);
    add-int/lit8 v9, v10, 0x1

    .line 273
    :cond_2
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Integer);v10=(Conflicted);v11=(Conflicted);
    if-gt v9, v8, :cond_0

    .line 274
    :try_start_1
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    #v10=(Reference);
    invoke-virtual {v10}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v6

    .line 275
    .local v6, key:Ljava/lang/String;
    #v6=(Reference);
    iget-object v10, p0, Lcom/mobileapptracker/MobileAppTracker;->EventQueue:Landroid/content/SharedPreferences;

    const/4 v11, 0x0

    #v11=(Null);
    invoke-interface {v10, v6, v11}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v4

    .line 277
    .local v4, eventJson:Ljava/lang/String;
    #v4=(Reference);
    if-eqz v4, :cond_4

    .line 278
    const/4 v7, 0x0

    .line 279
    .local v7, link:Ljava/lang/String;
    #v7=(Null);
    const/4 v5, 0x0

    .line 282
    .local v5, json:Ljava/lang/String;
    :try_start_2
    #v5=(Null);
    new-instance v3, Lorg/json/JSONObject;

    #v3=(UninitRef);
    invoke-direct {v3, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 283
    .local v3, event:Lorg/json/JSONObject;
    #v3=(Reference);
    const-string v10, "link"

    invoke-virtual {v3, v10}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    move-object v0, v10

    #v0=(Reference);
    check-cast v0, Ljava/lang/String;

    move-object v7, v0

    .line 284
    #v7=(Reference);
    const-string v10, "json"

    invoke-virtual {v3, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    #v10=(Boolean);
    if-eqz v10, :cond_3

    .line 285
    const-string v10, "json"

    #v10=(Reference);
    invoke-virtual {v3, v10}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    move-object v0, v10

    check-cast v0, Ljava/lang/String;

    move-object v5, v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 291
    .end local v3           #event:Lorg/json/JSONObject;
    :cond_3
    :goto_1
    #v0=(Conflicted);v3=(Conflicted);v5=(Reference);v10=(Conflicted);
    if-eqz v7, :cond_4

    .line 293
    :try_start_3
    invoke-direct {p0}, Lcom/mobileapptracker/MobileAppTracker;->getQueueSize()I

    move-result v10

    #v10=(Integer);
    add-int/lit8 v10, v10, -0x1

    invoke-direct {p0, v10}, Lcom/mobileapptracker/MobileAppTracker;->setQueueSize(I)V

    .line 294
    iget-object v10, p0, Lcom/mobileapptracker/MobileAppTracker;->EventQueue:Landroid/content/SharedPreferences;

    #v10=(Reference);
    invoke-interface {v10}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 295
    .local v2, editor:Landroid/content/SharedPreferences$Editor;
    #v2=(Reference);
    invoke-interface {v2, v6}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 296
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 297
    iget-object v10, p0, Lcom/mobileapptracker/MobileAppTracker;->pool:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v11, Lcom/mobileapptracker/MobileAppTracker$getLink;

    #v11=(UninitRef);
    invoke-direct {v11, p0, v7, v5}, Lcom/mobileapptracker/MobileAppTracker$getLink;-><init>(Lcom/mobileapptracker/MobileAppTracker;Ljava/lang/String;Ljava/lang/String;)V

    #v11=(Reference);
    invoke-interface {v10, v11}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 273
    .end local v2           #editor:Landroid/content/SharedPreferences$Editor;
    .end local v5           #json:Ljava/lang/String;
    .end local v7           #link:Ljava/lang/String;
    :cond_4
    :goto_2
    #v2=(Conflicted);v5=(Conflicted);v7=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 287
    .restart local v5       #json:Ljava/lang/String;
    .restart local v7       #link:Ljava/lang/String;
    :catch_0
    #v5=(Null);v7=(Reference);v11=(Null);
    move-exception v1

    .line 288
    .local v1, e:Lorg/json/JSONException;
    :try_start_4
    #v1=(Reference);
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_1

    .line 262
    .end local v1           #e:Lorg/json/JSONException;
    .end local v4           #eventJson:Ljava/lang/String;
    .end local v5           #json:Ljava/lang/String;
    .end local v6           #key:Ljava/lang/String;
    .end local v7           #link:Ljava/lang/String;
    .end local v8           #size:I
    .end local v9           #x:I
    :catchall_0
    #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);
    move-exception v10

    #v10=(Reference);
    monitor-exit p0

    throw v10

    .line 298
    .restart local v4       #eventJson:Ljava/lang/String;
    .restart local v5       #json:Ljava/lang/String;
    .restart local v6       #key:Ljava/lang/String;
    .restart local v7       #link:Ljava/lang/String;
    .restart local v8       #size:I
    .restart local v9       #x:I
    :catch_1
    #v4=(Reference);v5=(Reference);v6=(Reference);v7=(Reference);v8=(Integer);v9=(Integer);v10=(Conflicted);
    move-exception v1

    .line 299
    .local v1, e:Ljava/lang/Exception;
    :try_start_5
    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_2
.end method

.method private getDeviceId(Landroid/content/Context;)Ljava/lang/String;
    .locals 1
    .parameter "context"

    .prologue
    .line 1277
    const-string v0, "phone"

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getFacebookAttributionId()Ljava/lang/String;
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 1295
    #v3=(Null);
    const/4 v0, 0x1

    #v0=(One);
    new-array v2, v0, [Ljava/lang/String;

    #v2=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    const-string v1, "aid"

    #v1=(Reference);
    aput-object v1, v2, v0

    .line 1296
    .local v2, projection:[Ljava/lang/String;
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->context:Landroid/content/Context;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lcom/mobileapptracker/MobileAppTracker;->ATTRIBUTION_ID_CONTENT_URI:Landroid/net/Uri;

    move-object v4, v3

    #v4=(Null);
    move-object v5, v3

    #v5=(Null);
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 1297
    .local v6, c:Landroid/database/Cursor;
    #v6=(Reference);
    if-eqz v6, :cond_0

    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    .line 1300
    :cond_0
    :goto_0
    #v0=(Conflicted);v3=(Reference);
    return-object v3

    :cond_1
    #v0=(Boolean);v3=(Null);
    const-string v0, "aid"

    #v0=(Reference);
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    goto :goto_0
.end method

.method private getQueueSize()I
    .locals 3

    .prologue
    .line 243
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->EventQueue:Landroid/content/SharedPreferences;

    #v0=(Reference);
    const-string v1, "queuesize"

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method private initializeVariables(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZZ)Z
    .locals 30
    .parameter "context"
    .parameter "advertiserId"
    .parameter "key"
    .parameter "collectDeviceId"
    .parameter "collectMacAddress"

    .prologue
    .line 338
    move-object/from16 v0, p0

    #v0=(Reference);
    move-object/from16 v1, p2

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setAdvertiserId(Ljava/lang/String;)V

    .line 339
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setKey(Ljava/lang/String;)V

    .line 340
    const-string v26, "conversion"

    #v26=(Reference);
    move-object/from16 v0, p0

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setAction(Ljava/lang/String;)V

    .line 342
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    move-object/from16 v26, v0

    const-string v27, "adv"

    #v27=(Reference);
    invoke-virtual/range {v26 .. v27}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v26

    #v26=(Boolean);
    if-eqz v26, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    move-object/from16 v26, v0

    #v26=(Reference);
    const-string v27, "ac"

    invoke-virtual/range {v26 .. v27}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v26

    #v26=(Boolean);
    if-nez v26, :cond_1

    .line 343
    :cond_0
    const/16 v26, 0x0

    .line 479
    :goto_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v28=(Conflicted);v29=(Conflicted);
    return v26

    .line 346
    :cond_1
    #v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v28=(Uninit);v29=(Uninit);
    const-string v26, "mat_id"

    #v26=(Reference);
    const/16 v27, 0x0

    #v27=(Null);
    move-object/from16 v0, p1

    move-object/from16 v1, v26

    move/from16 v2, v27

    #v2=(Null);
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v26

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    .line 347
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    move-object/from16 v26, v0

    const-string v27, "mat_id"

    #v27=(Reference);
    const-string v28, ""

    #v28=(Reference);
    invoke-interface/range {v26 .. v28}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 348
    .local v15, matId:Ljava/lang/String;
    #v15=(Reference);
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v26

    #v26=(Integer);
    if-nez v26, :cond_2

    .line 350
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v26

    #v26=(Reference);
    invoke-virtual/range {v26 .. v26}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v15

    .line 351
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    move-object/from16 v26, v0

    invoke-interface/range {v26 .. v26}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v8

    .line 352
    .local v8, editor:Landroid/content/SharedPreferences$Editor;
    #v8=(Reference);
    const-string v26, "mat_id"

    move-object/from16 v0, v26

    invoke-interface {v8, v0, v15}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 353
    invoke-interface {v8}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 355
    .end local v8           #editor:Landroid/content/SharedPreferences$Editor;
    :cond_2
    #v8=(Conflicted);v26=(Conflicted);
    move-object/from16 v0, p0

    invoke-direct {v0, v15}, Lcom/mobileapptracker/MobileAppTracker;->setMatId(Ljava/lang/String;)V

    .line 356
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v26

    #v26=(Reference);
    const-string v27, "android_id"

    invoke-static/range {v26 .. v27}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, p0

    move-object/from16 v1, v26

    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setAndroidId(Ljava/lang/String;)V

    .line 357
    sget-object v26, Landroid/os/Build;->MODEL:Ljava/lang/String;

    move-object/from16 v0, p0

    move-object/from16 v1, v26

    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setDeviceModel(Ljava/lang/String;)V

    .line 358
    sget-object v26, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    move-object/from16 v0, p0

    move-object/from16 v1, v26

    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setDeviceBrand(Ljava/lang/String;)V

    .line 359
    sget-object v26, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    move-object/from16 v0, p0

    move-object/from16 v1, v26

    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setOsVersion(Ljava/lang/String;)V

    .line 361
    if-eqz p4, :cond_3

    .line 362
    invoke-direct/range {p0 .. p1}, Lcom/mobileapptracker/MobileAppTracker;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, p0

    move-object/from16 v1, v26

    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setDeviceId(Ljava/lang/String;)V

    .line 365
    :cond_3
    if-eqz p5, :cond_4

    .line 366
    const-string v26, "wifi"

    move-object/from16 v0, p1

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v24

    #v24=(Reference);
    check-cast v24, Landroid/net/wifi/WifiManager;

    .line 367
    .local v24, wifiMan:Landroid/net/wifi/WifiManager;
    if-eqz v24, :cond_4

    .line 368
    invoke-virtual/range {v24 .. v24}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v23

    .line 369
    .local v23, wifiInfo:Landroid/net/wifi/WifiInfo;
    #v23=(Reference);
    if-eqz v23, :cond_4

    .line 370
    invoke-virtual/range {v23 .. v23}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;

    move-result-object v26

    if-eqz v26, :cond_4

    .line 371
    invoke-virtual/range {v23 .. v23}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, p0

    move-object/from16 v1, v26

    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setMacAddress(Ljava/lang/String;)V

    .line 378
    .end local v23           #wifiInfo:Landroid/net/wifi/WifiInfo;
    .end local v24           #wifiMan:Landroid/net/wifi/WifiManager;
    :cond_4
    #v23=(Conflicted);v24=(Conflicted);
    const-string v26, "connectivity"

    move-object/from16 v0, p1

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    #v5=(Reference);
    check-cast v5, Landroid/net/ConnectivityManager;

    .line 379
    .local v5, connManager:Landroid/net/ConnectivityManager;
    const/16 v26, 0x1

    #v26=(One);
    move/from16 v0, v26

    #v0=(One);
    invoke-virtual {v5, v0}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v14

    .line 380
    .local v14, mWifi:Landroid/net/NetworkInfo;
    #v14=(Reference);
    invoke-virtual {v14}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v26

    #v26=(Boolean);
    if-eqz v26, :cond_8

    .line 381
    const-string v26, "WIFI"

    #v26=(Reference);
    move-object/from16 v0, p0

    #v0=(Reference);
    move-object/from16 v1, v26

    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setConnectionType(Ljava/lang/String;)V

    .line 386
    :goto_1
    const-string v26, "unknown"

    move-object/from16 v0, p0

    move-object/from16 v1, v26

    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setCountryCode(Ljava/lang/String;)V

    .line 387
    const-string v26, "phone"

    move-object/from16 v0, p1

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v20

    #v20=(Reference);
    check-cast v20, Landroid/telephony/TelephonyManager;

    .line 388
    .local v20, tm:Landroid/telephony/TelephonyManager;
    if-eqz v20, :cond_6

    .line 389
    invoke-virtual/range {v20 .. v20}, Landroid/telephony/TelephonyManager;->getNetworkCountryIso()Ljava/lang/String;

    move-result-object v26

    if-eqz v26, :cond_9

    .line 390
    invoke-virtual/range {v20 .. v20}, Landroid/telephony/TelephonyManager;->getNetworkCountryIso()Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, p0

    move-object/from16 v1, v26

    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setCountryCode(Ljava/lang/String;)V

    .line 396
    :cond_5
    :goto_2
    invoke-virtual/range {v20 .. v20}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, p0

    move-object/from16 v1, v26

    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setCarrier(Ljava/lang/String;)V

    .line 399
    invoke-virtual/range {v20 .. v20}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v18

    .line 400
    .local v18, networkOperator:Ljava/lang/String;
    #v18=(Reference);
    if-eqz v18, :cond_6

    .line 402
    const/16 v26, 0x0

    #v26=(Null);
    const/16 v27, 0x3

    :try_start_0
    #v27=(PosByte);
    move-object/from16 v0, v18

    move/from16 v1, v26

    #v1=(Null);
    move/from16 v2, v27

    #v2=(PosByte);
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v16

    .line 403
    .local v16, mcc:Ljava/lang/String;
    #v16=(Reference);
    const/16 v26, 0x3

    #v26=(PosByte);
    move-object/from16 v0, v18

    move/from16 v1, v26

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v17

    .line 404
    .local v17, mnc:Ljava/lang/String;
    #v17=(Reference);
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    #v1=(Reference);
    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setMCC(Ljava/lang/String;)V

    .line 405
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setMNC(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5

    .line 412
    .end local v16           #mcc:Ljava/lang/String;
    .end local v17           #mnc:Ljava/lang/String;
    .end local v18           #networkOperator:Ljava/lang/String;
    :cond_6
    :goto_3
    #v1=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v26=(Conflicted);v27=(Conflicted);
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v26

    #v26=(Reference);
    sget-object v27, Ljava/util/Locale;->US:Ljava/util/Locale;

    #v27=(Reference);
    invoke-virtual/range {v26 .. v27}, Ljava/util/Locale;->getDisplayLanguage(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, p0

    move-object/from16 v1, v26

    #v1=(Reference);
    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setLanguage(Ljava/lang/String;)V

    .line 413
    const-string v26, "USD"

    move-object/from16 v0, p0

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setCurrencyCode(Ljava/lang/String;)V

    .line 416
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 417
    .local v4, appR:Landroid/content/res/Resources;
    #v4=(Reference);
    const-string v26, "app_name"

    const-string v27, "string"

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v28

    move-object/from16 v0, v26

    move-object/from16 v1, v27

    move-object/from16 v2, v28

    #v2=(Reference);
    invoke-virtual {v4, v0, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v26

    #v26=(Integer);
    move/from16 v0, v26

    #v0=(Integer);
    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v21

    .line 418
    .local v21, txt:Ljava/lang/CharSequence;
    #v21=(Reference);
    invoke-interface/range {v21 .. v21}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v26

    #v26=(Reference);
    move-object/from16 v0, p0

    #v0=(Reference);
    move-object/from16 v1, v26

    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setAppName(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 423
    .end local v4           #appR:Landroid/content/res/Resources;
    .end local v21           #txt:Ljava/lang/CharSequence;
    :goto_4
    #v2=(Conflicted);v4=(Conflicted);v7=(Conflicted);v21=(Conflicted);
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, p0

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setPackageName(Ljava/lang/String;)V

    .line 427
    :try_start_2
    const-string v26, "mat_referrer"

    const/16 v27, 0x0

    #v27=(Null);
    move-object/from16 v0, p1

    move-object/from16 v1, v26

    move/from16 v2, v27

    #v2=(Null);
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v26

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    .line 428
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    move-object/from16 v26, v0

    const-string v27, "referrer"

    #v27=(Reference);
    const-string v28, ""

    invoke-interface/range {v26 .. v28}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, p0

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setReferrer(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_1

    .line 434
    :goto_5
    :try_start_3
    #v2=(Conflicted);
    const-string v26, "mat_install"

    const/16 v27, 0x0

    #v27=(Null);
    move-object/from16 v0, p1

    move-object/from16 v1, v26

    move/from16 v2, v27

    #v2=(Null);
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v26

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    .line 435
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    move-object/from16 v26, v0

    const-string v27, "install"

    #v27=(Reference);
    const-string v28, ""

    invoke-interface/range {v26 .. v28}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/mobileapptracker/MobileAppTracker;->install:Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/ClassCastException; {:try_start_3 .. :try_end_3} :catch_2

    .line 441
    :goto_6
    :try_start_4
    #v2=(Conflicted);
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v26

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mobileapptracker/MobileAppTracker;->context:Landroid/content/Context;

    move-object/from16 v27, v0

    invoke-virtual/range {v27 .. v27}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v27

    const/16 v28, 0x0

    #v28=(Null);
    invoke-virtual/range {v26 .. v28}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v26

    move-object/from16 v0, v26

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    #v0=(Integer);
    move/from16 v26, v0

    #v26=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v26

    #v1=(Integer);
    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setAppVersion(I)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 447
    :goto_7
    :try_start_5
    #v28=(Reference);
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v26

    #v26=(Reference);
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mobileapptracker/MobileAppTracker;->context:Landroid/content/Context;

    move-object/from16 v27, v0

    invoke-virtual/range {v27 .. v27}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v27

    const/16 v28, 0x0

    #v28=(Null);
    invoke-virtual/range {v26 .. v28}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v26

    move-object/from16 v0, v26

    iget-object v3, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 448
    .local v3, appFile:Ljava/lang/String;
    #v3=(Reference);
    new-instance v26, Ljava/io/File;

    #v26=(UninitRef);
    move-object/from16 v0, v26

    #v0=(UninitRef);
    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v0=(Reference);v26=(Reference);
    invoke-virtual/range {v26 .. v26}, Ljava/io/File;->lastModified()J

    move-result-wide v11

    .line 449
    .local v11, insdate:J
    #v11=(LongLo);v12=(LongHi);
    new-instance v13, Ljava/util/Date;

    #v13=(UninitRef);
    invoke-direct {v13, v11, v12}, Ljava/util/Date;-><init>(J)V

    .line 450
    .local v13, installDate:Ljava/util/Date;
    #v13=(Reference);
    new-instance v19, Ljava/text/SimpleDateFormat;

    #v19=(UninitRef);
    const-string v26, "yyyy-MM-dd HH:mm:ss"

    sget-object v27, Ljava/util/Locale;->US:Ljava/util/Locale;

    move-object/from16 v0, v19

    #v0=(UninitRef);
    move-object/from16 v1, v26

    #v1=(Reference);
    move-object/from16 v2, v27

    #v2=(Reference);
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 451
    .local v19, sdfDate:Ljava/text/SimpleDateFormat;
    #v0=(Reference);v19=(Reference);
    const-string v26, "UTC"

    invoke-static/range {v26 .. v26}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v26

    move-object/from16 v0, v19

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 452
    move-object/from16 v0, v19

    invoke-virtual {v0, v13}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, p0

    move-object/from16 v1, v26

    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setInstallDate(Ljava/lang/String;)V
    :try_end_5
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_5 .. :try_end_5} :catch_4

    .line 458
    .end local v3           #appFile:Ljava/lang/String;
    .end local v11           #insdate:J
    .end local v13           #installDate:Ljava/util/Date;
    .end local v19           #sdfDate:Ljava/text/SimpleDateFormat;
    :goto_8
    #v2=(Conflicted);v3=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v19=(Conflicted);v28=(Reference);
    new-instance v9, Landroid/os/Handler;

    #v9=(UninitRef);
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v26

    move-object/from16 v0, v26

    invoke-direct {v9, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 459
    .local v9, handler:Landroid/os/Handler;
    #v9=(Reference);
    new-instance v26, Lcom/mobileapptracker/MobileAppTracker$getUserAgent;

    #v26=(UninitRef);
    move-object/from16 v0, v26

    #v0=(UninitRef);
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    #v2=(Reference);
    invoke-direct {v0, v1, v2}, Lcom/mobileapptracker/MobileAppTracker$getUserAgent;-><init>(Lcom/mobileapptracker/MobileAppTracker;Landroid/content/Context;)V

    #v0=(Reference);v26=(Reference);
    move-object/from16 v0, v26

    invoke-virtual {v9, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 462
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v26

    move-object/from16 v0, v26

    iget v6, v0, Landroid/util/DisplayMetrics;->density:F

    .line 463
    .local v6, density:F
    #v6=(Integer);
    float-to-double v0, v6

    #v0=(DoubleLo);v1=(DoubleHi);
    move-wide/from16 v26, v0

    #v26=(DoubleLo);v27=(DoubleHi);
    const-wide/high16 v28, 0x3fe8

    #v28=(LongLo);v29=(LongHi);
    cmpl-double v26, v26, v28

    #v26=(Byte);
    if-nez v26, :cond_a

    .line 464
    const-string v26, "ldpi"

    #v26=(Reference);
    move-object/from16 v0, p0

    #v0=(Reference);
    move-object/from16 v1, v26

    #v1=(Reference);
    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setScreenDensity(Ljava/lang/String;)V

    .line 474
    :cond_7
    :goto_9
    #v0=(Conflicted);v1=(Conflicted);v26=(Conflicted);
    const-string v26, "window"

    #v26=(Reference);
    move-object/from16 v0, p1

    #v0=(Reference);
    move-object/from16 v1, v26

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v25

    #v25=(Reference);
    check-cast v25, Landroid/view/WindowManager;

    .line 475
    .local v25, wm:Landroid/view/WindowManager;
    invoke-interface/range {v25 .. v25}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Landroid/view/Display;->getWidth()I

    move-result v22

    .line 476
    .local v22, width:I
    #v22=(Integer);
    invoke-interface/range {v25 .. v25}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Landroid/view/Display;->getHeight()I

    move-result v10

    .line 477
    .local v10, height:I
    #v10=(Integer);
    new-instance v26, Ljava/lang/StringBuilder;

    #v26=(UninitRef);
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v27

    #v27=(Reference);
    invoke-static/range {v27 .. v27}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v27

    invoke-direct/range {v26 .. v27}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v26=(Reference);
    const-string v27, "x"

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-static {v10}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, p0

    move-object/from16 v1, v26

    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setScreenSize(Ljava/lang/String;)V

    .line 479
    const/16 v26, 0x1

    #v26=(One);
    goto/16 :goto_0

    .line 383
    .end local v6           #density:F
    .end local v9           #handler:Landroid/os/Handler;
    .end local v10           #height:I
    .end local v20           #tm:Landroid/telephony/TelephonyManager;
    .end local v22           #width:I
    .end local v25           #wm:Landroid/view/WindowManager;
    :cond_8
    #v0=(One);v2=(Null);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v25=(Uninit);v26=(Boolean);v28=(Reference);v29=(Uninit);
    const-string v26, "mobile"

    #v26=(Reference);
    move-object/from16 v0, p0

    #v0=(Reference);
    move-object/from16 v1, v26

    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setConnectionType(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 391
    .restart local v20       #tm:Landroid/telephony/TelephonyManager;
    :cond_9
    #v20=(Reference);
    if-eqz p4, :cond_5

    .line 392
    invoke-virtual/range {v20 .. v20}, Landroid/telephony/TelephonyManager;->getSimCountryIso()Ljava/lang/String;

    move-result-object v26

    if-eqz v26, :cond_5

    .line 393
    invoke-virtual/range {v20 .. v20}, Landroid/telephony/TelephonyManager;->getSimCountryIso()Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, p0

    move-object/from16 v1, v26

    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setCountryCode(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 419
    :catch_0
    #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v21=(Conflicted);v26=(Conflicted);
    move-exception v7

    .line 420
    .local v7, e:Landroid/content/res/Resources$NotFoundException;
    #v7=(Reference);
    const-string v26, "unknown"

    #v26=(Reference);
    move-object/from16 v0, p0

    #v0=(Reference);
    move-object/from16 v1, v26

    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setAppName(Ljava/lang/String;)V

    goto/16 :goto_4

    .line 429
    .end local v7           #e:Landroid/content/res/Resources$NotFoundException;
    :catch_1
    #v7=(Conflicted);
    move-exception v7

    .line 430
    .local v7, e:Ljava/lang/ClassCastException;
    #v7=(Reference);
    const-string v26, "unknown"

    move-object/from16 v0, p0

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setReferrer(Ljava/lang/String;)V

    goto/16 :goto_5

    .line 436
    .end local v7           #e:Ljava/lang/ClassCastException;
    :catch_2
    #v7=(Conflicted);
    move-exception v7

    .line 437
    .restart local v7       #e:Ljava/lang/ClassCastException;
    #v7=(Reference);
    const-string v26, ""

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/mobileapptracker/MobileAppTracker;->install:Ljava/lang/String;

    goto/16 :goto_6

    .line 442
    .end local v7           #e:Ljava/lang/ClassCastException;
    :catch_3
    #v1=(Conflicted);v7=(Conflicted);v26=(Conflicted);
    move-exception v7

    .line 443
    .local v7, e:Ljava/lang/Exception;
    #v7=(Reference);
    const/16 v26, 0x0

    #v26=(Null);
    move-object/from16 v0, p0

    move/from16 v1, v26

    #v1=(Null);
    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setAppVersion(I)V

    goto/16 :goto_7

    .line 453
    .end local v7           #e:Ljava/lang/Exception;
    :catch_4
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v7=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v19=(Conflicted);v26=(Conflicted);
    move-exception v7

    .line 454
    .local v7, e:Landroid/content/pm/PackageManager$NameNotFoundException;
    #v7=(Reference);
    const-string v26, "0"

    #v26=(Reference);
    move-object/from16 v0, p0

    #v0=(Reference);
    move-object/from16 v1, v26

    #v1=(Reference);
    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setInstallDate(Ljava/lang/String;)V

    goto/16 :goto_8

    .line 465
    .end local v7           #e:Landroid/content/pm/PackageManager$NameNotFoundException;
    .restart local v6       #density:F
    .restart local v9       #handler:Landroid/os/Handler;
    :cond_a
    #v0=(DoubleLo);v1=(DoubleHi);v2=(Reference);v6=(Integer);v7=(Conflicted);v9=(Reference);v26=(Byte);v27=(DoubleHi);v28=(LongLo);v29=(LongHi);
    float-to-double v0, v6

    move-wide/from16 v26, v0

    #v26=(DoubleLo);
    const-wide/high16 v28, 0x3ff0

    cmpl-double v26, v26, v28

    #v26=(Byte);
    if-nez v26, :cond_b

    .line 466
    const-string v26, "mdpi"

    #v26=(Reference);
    move-object/from16 v0, p0

    #v0=(Reference);
    move-object/from16 v1, v26

    #v1=(Reference);
    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setScreenDensity(Ljava/lang/String;)V

    goto/16 :goto_9

    .line 467
    :cond_b
    #v0=(DoubleLo);v1=(DoubleHi);v26=(Byte);
    float-to-double v0, v6

    move-wide/from16 v26, v0

    #v26=(DoubleLo);
    const-wide/high16 v28, 0x3ff8

    cmpl-double v26, v26, v28

    #v26=(Byte);
    if-nez v26, :cond_c

    .line 468
    const-string v26, "hdpi"

    #v26=(Reference);
    move-object/from16 v0, p0

    #v0=(Reference);
    move-object/from16 v1, v26

    #v1=(Reference);
    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setScreenDensity(Ljava/lang/String;)V

    goto/16 :goto_9

    .line 469
    :cond_c
    #v0=(DoubleLo);v1=(DoubleHi);v26=(Byte);
    float-to-double v0, v6

    move-wide/from16 v26, v0

    #v26=(DoubleLo);
    const-wide/high16 v28, 0x4000

    cmpl-double v26, v26, v28

    #v26=(Byte);
    if-nez v26, :cond_7

    .line 470
    const-string v26, "xhdpi"

    #v26=(Reference);
    move-object/from16 v0, p0

    #v0=(Reference);
    move-object/from16 v1, v26

    #v1=(Reference);
    invoke-direct {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setScreenDensity(Ljava/lang/String;)V

    goto/16 :goto_9

    .line 406
    .end local v6           #density:F
    .end local v9           #handler:Landroid/os/Handler;
    .restart local v18       #networkOperator:Ljava/lang/String;
    :catch_5
    #v1=(Conflicted);v2=(PosByte);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v18=(Reference);v19=(Uninit);v21=(Uninit);v26=(PosByte);v27=(PosByte);v28=(Reference);v29=(Uninit);
    move-exception v26

    #v26=(Reference);
    goto/16 :goto_3
.end method

.method private isOnline()Z
    .locals 3

    .prologue
    .line 320
    :try_start_0
    iget-object v1, p0, Lcom/mobileapptracker/MobileAppTracker;->context:Landroid/content/Context;

    #v1=(Reference);
    const-string v2, "connectivity"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 321
    .local v0, connectivityManager:Landroid/net/ConnectivityManager;
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    if-eqz v1, :cond_0

    .line 323
    const/4 v1, 0x1

    .line 327
    .end local v0           #connectivityManager:Landroid/net/ConnectivityManager;
    :goto_0
    #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);
    return v1

    .line 325
    :catch_0
    move-exception v1

    .line 327
    :cond_0
    #v1=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0
.end method

.method private putInParamTable(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .parameter "key"
    .parameter "value"

    .prologue
    .line 1246
    :try_start_0
    const-string v1, "UTF-8"

    #v1=(Reference);
    invoke-static {p2, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 1247
    iget-object v1, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1253
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    .line 1248
    :catch_0
    move-exception v0

    .line 1249
    .local v0, e:Ljava/io/UnsupportedEncodingException;
    #v0=(Reference);
    sget-boolean v1, Lcom/mobileapptracker/MobileAppTracker;->DEBUG:Z

    #v1=(Boolean);
    if-eqz v1, :cond_0

    const-string v1, "MobileAppTracker"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "Failed encoding "

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 1250
    .end local v0           #e:Ljava/io/UnsupportedEncodingException;
    :catch_1
    move-exception v0

    .line 1251
    .local v0, e:Ljava/lang/NullPointerException;
    #v0=(Reference);
    sget-boolean v1, Lcom/mobileapptracker/MobileAppTracker;->DEBUG:Z

    #v1=(Boolean);
    if-eqz v1, :cond_0

    const-string v1, "MobileAppTracker"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "Failed to set "

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": received null"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private setAndroidId(Ljava/lang/String;)V
    .locals 1
    .parameter "android_id"

    .prologue
    .line 951
    const-string v0, "ad"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 952
    return-void
.end method

.method private setAppName(Ljava/lang/String;)V
    .locals 1
    .parameter "app_name"

    .prologue
    .line 959
    const-string v0, "an"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 960
    return-void
.end method

.method private setAppVersion(I)V
    .locals 2
    .parameter "app_version"

    .prologue
    .line 967
    const-string v0, "av"

    #v0=(Reference);
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {p0, v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 968
    return-void
.end method

.method private setCarrier(Ljava/lang/String;)V
    .locals 1
    .parameter "carrier"

    .prologue
    .line 983
    const-string v0, "dc"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 984
    return-void
.end method

.method private setConnectionType(Ljava/lang/String;)V
    .locals 1
    .parameter "connection_type"

    .prologue
    .line 995
    const-string v0, "connection_type"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 996
    return-void
.end method

.method private setCountryCode(Ljava/lang/String;)V
    .locals 1
    .parameter "country_code"

    .prologue
    .line 1003
    const-string v0, "cc"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1004
    return-void
.end method

.method private setDeviceBrand(Ljava/lang/String;)V
    .locals 1
    .parameter "device_brand"

    .prologue
    .line 1019
    const-string v0, "db"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1020
    return-void
.end method

.method private setDeviceId(Ljava/lang/String;)V
    .locals 1
    .parameter "device_id"

    .prologue
    .line 1027
    const-string v0, "d"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1028
    return-void
.end method

.method private setDeviceModel(Ljava/lang/String;)V
    .locals 1
    .parameter "device_model"

    .prologue
    .line 1035
    const-string v0, "dm"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1036
    return-void
.end method

.method private setInstallDate(Ljava/lang/String;)V
    .locals 1
    .parameter "install_date"

    .prologue
    .line 1059
    const-string v0, "id"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1060
    return-void
.end method

.method private setLanguage(Ljava/lang/String;)V
    .locals 1
    .parameter "language"

    .prologue
    .line 1084
    const-string v0, "l"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1085
    return-void
.end method

.method private setMCC(Ljava/lang/String;)V
    .locals 1
    .parameter "mcc"

    .prologue
    .line 1112
    const-string v0, "mobile_country_code"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1113
    return-void
.end method

.method private setMNC(Ljava/lang/String;)V
    .locals 1
    .parameter "mnc"

    .prologue
    .line 1124
    const-string v0, "mobile_network_code"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1125
    return-void
.end method

.method private setMacAddress(Ljava/lang/String;)V
    .locals 1
    .parameter "mac_address"

    .prologue
    .line 1092
    const-string v0, "ma"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1093
    return-void
.end method

.method private setMatId(Ljava/lang/String;)V
    .locals 1
    .parameter "mat_id"

    .prologue
    .line 1100
    const-string v0, "mi"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1101
    return-void
.end method

.method private setOsVersion(Ljava/lang/String;)V
    .locals 1
    .parameter "os_version"

    .prologue
    .line 1140
    const-string v0, "ov"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1141
    return-void
.end method

.method private setPurchaseStatus(I)V
    .locals 2
    .parameter "purchaseStatus"

    .prologue
    .line 1152
    const-string v0, "android_purchase_status"

    #v0=(Reference);
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {p0, v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1153
    return-void
.end method

.method private setQueueSize(I)V
    .locals 2
    .parameter "value"

    .prologue
    .line 251
    iget-object v1, p0, Lcom/mobileapptracker/MobileAppTracker;->EventQueue:Landroid/content/SharedPreferences;

    #v1=(Reference);
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 252
    .local v0, editor:Landroid/content/SharedPreferences$Editor;
    #v0=(Reference);
    if-gez p1, :cond_0

    const/4 p1, 0x0

    .line 253
    :cond_0
    const-string v1, "queuesize"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 254
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 255
    return-void
.end method

.method private setScreenDensity(Ljava/lang/String;)V
    .locals 1
    .parameter "density"

    .prologue
    .line 1192
    const-string v0, "screen_density"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1193
    return-void
.end method

.method private setScreenSize(Ljava/lang/String;)V
    .locals 1
    .parameter "screensize"

    .prologue
    .line 1200
    const-string v0, "screen_layout_size"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1201
    return-void
.end method

.method private setUserAgent(Ljava/lang/String;)V
    .locals 1
    .parameter "user_agent"

    .prologue
    .line 1220
    const-string v0, "ua"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1221
    return-void
.end method

.method private declared-synchronized track(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)I
    .locals 7
    .parameter "eventid"
    .parameter "json"
    .parameter "revenue"
    .parameter "currency"

    .prologue
    .line 677
    monitor-enter p0

    :try_start_0
    iget-boolean v2, p0, Lcom/mobileapptracker/MobileAppTracker;->initialized:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    #v2=(Boolean);
    if-nez v2, :cond_0

    const/4 v2, -0x1

    .line 715
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Byte);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    monitor-exit p0

    return v2

    .line 679
    :cond_0
    :try_start_1
    #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    iget-object v2, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v2=(Reference);
    const-string v3, "ei"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 680
    iget-object v2, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v3, "en"

    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 682
    const-string v2, "conversion"

    invoke-virtual {p0, v2}, Lcom/mobileapptracker/MobileAppTracker;->setAction(Ljava/lang/String;)V

    .line 683
    invoke-static {p1}, Lcom/mobileapptracker/MobileAppTracker;->containsChar(Ljava/lang/String;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_7

    .line 684
    const-string v2, "open"

    #v2=(Reference);
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_3

    const-string v2, "open"

    #v2=(Reference);
    invoke-virtual {p0, v2}, Lcom/mobileapptracker/MobileAppTracker;->setAction(Ljava/lang/String;)V

    .line 693
    :goto_1
    #v2=(Conflicted);
    invoke-virtual {p0, p3, p4}, Lcom/mobileapptracker/MobileAppTracker;->setRevenue(D)V

    .line 694
    if-eqz p5, :cond_1

    .line 695
    invoke-virtual {p0, p5}, Lcom/mobileapptracker/MobileAppTracker;->setCurrencyCode(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 698
    :cond_1
    const/4 v1, 0x0

    .line 700
    .local v1, link:Ljava/lang/String;
    :try_start_2
    #v1=(Null);
    invoke-direct {p0}, Lcom/mobileapptracker/MobileAppTracker;->buildLink()Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v1

    .line 705
    :goto_2
    :try_start_3
    #v0=(Conflicted);v1=(Reference);
    invoke-direct {p0}, Lcom/mobileapptracker/MobileAppTracker;->isOnline()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_8

    .line 707
    :try_start_4
    iget-object v2, p0, Lcom/mobileapptracker/MobileAppTracker;->pool:Ljava/util/concurrent/ScheduledExecutorService;

    #v2=(Reference);
    new-instance v3, Lcom/mobileapptracker/MobileAppTracker$getLink;

    #v3=(UninitRef);
    invoke-direct {v3, p0, v1, p2}, Lcom/mobileapptracker/MobileAppTracker$getLink;-><init>(Lcom/mobileapptracker/MobileAppTracker;Ljava/lang/String;Ljava/lang/String;)V

    #v3=(Reference);
    const-wide/16 v4, 0xbb8

    #v4=(LongLo);v5=(LongHi);
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    #v6=(Reference);
    invoke-interface {v2, v3, v4, v5, v6}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 715
    :cond_2
    :goto_3
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    const/4 v2, 0x1

    #v2=(One);
    goto :goto_0

    .line 685
    .end local v1           #link:Ljava/lang/String;
    :cond_3
    :try_start_5
    #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(Reference);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    const-string v2, "close"

    #v2=(Reference);
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_4

    const-string v2, "close"

    #v2=(Reference);
    invoke-virtual {p0, v2}, Lcom/mobileapptracker/MobileAppTracker;->setAction(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_1

    .line 677
    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    move-exception v2

    #v2=(Reference);
    monitor-exit p0

    throw v2

    .line 686
    :cond_4
    :try_start_6
    #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(Reference);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    const-string v2, "install"

    #v2=(Reference);
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_5

    const-string v2, "install"

    #v2=(Reference);
    invoke-virtual {p0, v2}, Lcom/mobileapptracker/MobileAppTracker;->setAction(Ljava/lang/String;)V

    goto :goto_1

    .line 687
    :cond_5
    #v2=(Boolean);
    const-string v2, "update"

    #v2=(Reference);
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_6

    const-string v2, "update"

    #v2=(Reference);
    invoke-virtual {p0, v2}, Lcom/mobileapptracker/MobileAppTracker;->setAction(Ljava/lang/String;)V

    goto :goto_1

    .line 688
    :cond_6
    #v2=(Boolean);
    invoke-virtual {p0, p1}, Lcom/mobileapptracker/MobileAppTracker;->setEventName(Ljava/lang/String;)V

    goto :goto_1

    .line 690
    :cond_7
    invoke-virtual {p0, p1}, Lcom/mobileapptracker/MobileAppTracker;->setEventId(Ljava/lang/String;)V

    goto :goto_1

    .line 701
    .restart local v1       #link:Ljava/lang/String;
    :catch_0
    #v1=(Null);v2=(Conflicted);
    move-exception v0

    .line 702
    .local v0, e:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_2

    .line 708
    .end local v0           #e:Ljava/lang/Exception;
    :catch_1
    #v0=(Conflicted);v1=(Reference);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    move-exception v0

    .line 709
    .restart local v0       #e:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_3

    .line 712
    .end local v0           #e:Ljava/lang/Exception;
    :cond_8
    #v0=(Conflicted);v2=(Boolean);v3=(Reference);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    invoke-direct {p0, v1, p2}, Lcom/mobileapptracker/MobileAppTracker;->addEventToQueue(Ljava/lang/String;Ljava/lang/String;)V

    .line 713
    sget-boolean v2, Lcom/mobileapptracker/MobileAppTracker;->DEBUG:Z

    if-eqz v2, :cond_2

    const-string v2, "MobileAppTracker"

    #v2=(Reference);
    const-string v3, "Not online: track will be queued"

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_3
.end method


# virtual methods
.method public getAction()Ljava/lang/String;
    .locals 2

    .prologue
    .line 939
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "ac"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getAdvertiserId()Ljava/lang/String;
    .locals 2

    .prologue
    .line 971
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "adv"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getAndroidId()Ljava/lang/String;
    .locals 2

    .prologue
    .line 947
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "ad"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getAppName()Ljava/lang/String;
    .locals 2

    .prologue
    .line 955
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "an"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getAppVersion()I
    .locals 2

    .prologue
    .line 963
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "av"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getCarrier()Ljava/lang/String;
    .locals 2

    .prologue
    .line 979
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "dc"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getConnectionType()Ljava/lang/String;
    .locals 2

    .prologue
    .line 991
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "connection_type"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getCountryCode()Ljava/lang/String;
    .locals 2

    .prologue
    .line 999
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "cc"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getCurrencyCode()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1007
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "c"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceBrand()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1015
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "db"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceId()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1023
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "d"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceModel()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1031
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "dm"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getEventId()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1039
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "ei"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1047
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "en"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getInstallDate()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1055
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "id"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1067
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->key:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getLanguage()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1080
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "l"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getMCC()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1108
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "mobile_country_code"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getMNC()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1120
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "mobile_network_code"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getMacAddress()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1088
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "ma"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getMatId()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1096
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "mi"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getOsId()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1128
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "oi"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getOsVersion()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1136
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "ov"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1144
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "pn"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getRefId()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1168
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "ar"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getReferrer()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1156
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "ir"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getRevenue()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1180
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "r"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getScreenDensity()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1188
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "screen_density"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getScreenSize()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1196
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "screen_layout_size"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getSiteId()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1204
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "si"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getTRUSTeId()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1212
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "tpid"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getUserId()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1228
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->paramTable:Ljava/util/concurrent/ConcurrentHashMap;

    #v0=(Reference);
    const-string v1, "ui"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public isInitialized()Z
    .locals 1

    .prologue
    .line 311
    iget-boolean v0, p0, Lcom/mobileapptracker/MobileAppTracker;->initialized:Z

    #v0=(Boolean);
    return v0
.end method

.method public setAction(Ljava/lang/String;)V
    .locals 1
    .parameter "action"

    .prologue
    .line 943
    const-string v0, "ac"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 944
    return-void
.end method

.method public setAdvertiserId(Ljava/lang/String;)V
    .locals 1
    .parameter "advertiser_id"

    .prologue
    .line 975
    const-string v0, "adv"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 976
    return-void
.end method

.method public setCurrencyCode(Ljava/lang/String;)V
    .locals 1
    .parameter "currency_code"

    .prologue
    .line 1011
    const-string v0, "c"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1012
    return-void
.end method

.method public setDebugMode(Z)V
    .locals 0
    .parameter "debug"

    .prologue
    .line 1268
    sput-boolean p1, Lcom/mobileapptracker/MobileAppTracker;->DEBUG:Z

    .line 1269
    return-void
.end method

.method public setEventId(Ljava/lang/String;)V
    .locals 1
    .parameter "event_id"

    .prologue
    .line 1043
    const-string v0, "ei"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1044
    return-void
.end method

.method public setEventName(Ljava/lang/String;)V
    .locals 1
    .parameter "event_name"

    .prologue
    .line 1051
    const-string v0, "en"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1052
    return-void
.end method

.method public setHttpsEncryption(Z)V
    .locals 0
    .parameter "use_https"

    .prologue
    .line 1260
    iput-boolean p1, p0, Lcom/mobileapptracker/MobileAppTracker;->httpsEncryption:Z

    .line 1261
    return-void
.end method

.method public setKey(Ljava/lang/String;)V
    .locals 2
    .parameter "key"

    .prologue
    .line 1075
    iput-object p1, p0, Lcom/mobileapptracker/MobileAppTracker;->key:Ljava/lang/String;

    .line 1076
    new-instance v0, Lcom/mobileapptracker/Encryption;

    #v0=(UninitRef);
    const-string v1, "heF9BATUfWuISyO8"

    #v1=(Reference);
    invoke-direct {v0, p1, v1}, Lcom/mobileapptracker/Encryption;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->URLEnc:Lcom/mobileapptracker/Encryption;

    .line 1077
    return-void
.end method

.method public setOsId(Ljava/lang/String;)V
    .locals 1
    .parameter "os_id"

    .prologue
    .line 1132
    const-string v0, "oi"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1133
    return-void
.end method

.method public setPackageName(Ljava/lang/String;)V
    .locals 1
    .parameter "package_name"

    .prologue
    .line 1148
    const-string v0, "pn"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1149
    return-void
.end method

.method public setRefId(Ljava/lang/String;)V
    .locals 1
    .parameter "ref_id"

    .prologue
    .line 1176
    const-string v0, "ar"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1177
    return-void
.end method

.method public setReferrer(Ljava/lang/String;)V
    .locals 1
    .parameter "referrer"

    .prologue
    .line 1160
    const-string v0, "ir"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1161
    return-void
.end method

.method public setRevenue(D)V
    .locals 2
    .parameter "revenue"

    .prologue
    .line 1184
    const-string v0, "r"

    #v0=(Reference);
    invoke-static {p1, p2}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {p0, v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1185
    return-void
.end method

.method public setSiteId(Ljava/lang/String;)V
    .locals 1
    .parameter "site_id"

    .prologue
    .line 1208
    const-string v0, "si"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1209
    return-void
.end method

.method public setTRUSTeId(Ljava/lang/String;)V
    .locals 1
    .parameter "tpid"

    .prologue
    .line 1216
    const-string v0, "tpid"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1217
    return-void
.end method

.method public setTracking(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 16
    .parameter "publisherAdvertiserId"
    .parameter "targetPackageName"
    .parameter "publisherId"
    .parameter "campaignId"
    .parameter "doRedirect"

    .prologue
    .line 492
    const-string v10, ""

    .line 493
    .local v10, trackingId:Ljava/lang/String;
    #v10=(Reference);
    const-string v7, ""

    .line 495
    .local v7, redirectUrl:Ljava/lang/String;
    #v7=(Reference);
    new-instance v11, Ljava/lang/StringBuilder;

    #v11=(UninitRef);
    const-string v13, "http://engine.mobileapptracking.com/serve?action=click"

    #v13=(Reference);
    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 496
    .local v11, url:Ljava/lang/StringBuilder;
    #v11=(Reference);
    const-string v13, "&publisher_advertiser_id="

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    move-object/from16 v0, p1

    #v0=(Reference);
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 497
    const-string v13, "&package_name="

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    move-object/from16 v0, p2

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 498
    if-eqz p3, :cond_0

    .line 499
    const-string v13, "&publisher_id="

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    move-object/from16 v0, p3

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    :cond_0
    if-eqz p4, :cond_1

    .line 502
    const-string v13, "&campaign_id="

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    move-object/from16 v0, p4

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    :cond_1
    const-string v13, "&response_format=json"

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 506
    new-instance v8, Lorg/apache/http/client/methods/HttpGet;

    #v8=(UninitRef);
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v8, v13}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 508
    .local v8, request:Lorg/apache/http/client/methods/HttpGet;
    :try_start_0
    #v8=(Reference);
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mobileapptracker/MobileAppTracker;->client:Lorg/apache/http/client/HttpClient;

    invoke-interface {v13, v8}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v9

    .line 509
    .local v9, response:Lorg/apache/http/HttpResponse;
    #v9=(Reference);
    new-instance v6, Ljava/io/BufferedReader;

    #v6=(UninitRef);
    new-instance v13, Ljava/io/InputStreamReader;

    #v13=(UninitRef);
    invoke-interface {v9}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v14

    #v14=(Reference);
    invoke-interface {v14}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v14

    const-string v15, "UTF-8"

    #v15=(Reference);
    invoke-direct {v13, v14, v15}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    #v13=(Reference);
    const/16 v14, 0x2000

    #v14=(PosShort);
    invoke-direct {v6, v13, v14}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    .line 510
    .local v6, reader:Ljava/io/BufferedReader;
    #v6=(Reference);
    invoke-virtual {v6}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v4

    .line 511
    .local v4, json:Ljava/lang/String;
    #v4=(Reference);
    new-instance v5, Lorg/json/JSONObject;

    #v5=(UninitRef);
    invoke-direct {v5, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 512
    .local v5, jsonObject:Lorg/json/JSONObject;
    #v5=(Reference);
    const-string v13, "tracking_id"

    invoke-virtual {v5, v13}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 513
    const-string v13, "url"

    invoke-virtual {v5, v13}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v7

    .line 518
    .end local v4           #json:Ljava/lang/String;
    .end local v5           #jsonObject:Lorg/json/JSONObject;
    .end local v6           #reader:Ljava/io/BufferedReader;
    .end local v9           #response:Lorg/apache/http/HttpResponse;
    :goto_0
    #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v9=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
    new-instance v12, Landroid/content/ContentValues;

    #v12=(UninitRef);
    invoke-direct {v12}, Landroid/content/ContentValues;-><init>()V

    .line 519
    .local v12, values:Landroid/content/ContentValues;
    #v12=(Reference);
    const-string v13, "publisher_package_name"

    #v13=(Reference);
    invoke-virtual/range {p0 .. p0}, Lcom/mobileapptracker/MobileAppTracker;->getPackageName()Ljava/lang/String;

    move-result-object v14

    #v14=(Reference);
    invoke-virtual {v12, v13, v14}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 520
    const-string v13, "tracking_id"

    invoke-virtual {v12, v13, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 522
    new-instance v13, Ljava/lang/StringBuilder;

    #v13=(UninitRef);
    const-string v14, "content://"

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v13=(Reference);
    move-object/from16 v0, p2

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "/referrer_apps"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 523
    .local v1, CONTENT_URI:Landroid/net/Uri;
    #v1=(Reference);
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mobileapptracker/MobileAppTracker;->context:Landroid/content/Context;

    invoke-virtual {v13}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v13

    invoke-virtual {v13, v1, v12}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 526
    if-eqz p5, :cond_2

    .line 528
    :try_start_1
    new-instance v3, Landroid/content/Intent;

    #v3=(UninitRef);
    const-string v13, "android.intent.action.VIEW"

    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v14

    invoke-direct {v3, v13, v14}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 529
    .local v3, i:Landroid/content/Intent;
    #v3=(Reference);
    const/high16 v13, 0x1000

    #v13=(Integer);
    invoke-virtual {v3, v13}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 530
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mobileapptracker/MobileAppTracker;->context:Landroid/content/Context;

    #v13=(Reference);
    invoke-virtual {v13, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 535
    .end local v3           #i:Landroid/content/Intent;
    :cond_2
    :goto_1
    #v3=(Conflicted);
    return-object v7

    .line 514
    .end local v1           #CONTENT_URI:Landroid/net/Uri;
    .end local v12           #values:Landroid/content/ContentValues;
    :catch_0
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v12=(Uninit);v13=(Conflicted);v14=(Conflicted);
    move-exception v2

    .line 515
    .local v2, e:Ljava/lang/Exception;
    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 531
    .end local v2           #e:Ljava/lang/Exception;
    .restart local v1       #CONTENT_URI:Landroid/net/Uri;
    .restart local v12       #values:Landroid/content/ContentValues;
    :catch_1
    #v1=(Reference);v2=(Conflicted);v3=(Conflicted);v12=(Reference);v14=(Reference);
    move-exception v13

    #v13=(Reference);
    goto :goto_1
.end method

.method public setUserId(Ljava/lang/String;)V
    .locals 1
    .parameter "user_id"

    .prologue
    .line 1236
    const-string v0, "ui"

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Lcom/mobileapptracker/MobileAppTracker;->putInParamTable(Ljava/lang/String;Ljava/lang/String;)V

    .line 1237
    return-void
.end method

.method public trackAction(Ljava/lang/String;)I
    .locals 6
    .parameter "eventid"

    .prologue
    const/4 v2, 0x0

    .line 613
    #v2=(Null);
    const-wide/16 v3, 0x0

    #v3=(LongLo);v4=(LongHi);
    move-object v0, p0

    #v0=(Reference);
    move-object v1, p1

    #v1=(Reference);
    move-object v5, v2

    #v5=(Null);
    invoke-direct/range {v0 .. v5}, Lcom/mobileapptracker/MobileAppTracker;->track(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public trackAction(Ljava/lang/String;D)I
    .locals 6
    .parameter "eventid"
    .parameter "revenue"

    .prologue
    const/4 v2, 0x0

    .line 654
    #v2=(Null);
    move-object v0, p0

    #v0=(Reference);
    move-object v1, p1

    #v1=(Reference);
    move-wide v3, p2

    #v3=(DoubleLo);v4=(DoubleHi);
    move-object v5, v2

    #v5=(Null);
    invoke-direct/range {v0 .. v5}, Lcom/mobileapptracker/MobileAppTracker;->track(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public trackAction(Ljava/lang/String;DLjava/lang/String;)I
    .locals 6
    .parameter "eventid"
    .parameter "revenue"
    .parameter "currency"

    .prologue
    .line 665
    const/4 v2, 0x0

    #v2=(Null);
    move-object v0, p0

    #v0=(Reference);
    move-object v1, p1

    #v1=(Reference);
    move-wide v3, p2

    #v3=(DoubleLo);v4=(DoubleHi);
    move-object v5, p4

    #v5=(Reference);
    invoke-direct/range {v0 .. v5}, Lcom/mobileapptracker/MobileAppTracker;->track(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public trackAction(Ljava/lang/String;Ljava/util/List;)I
    .locals 9
    .parameter "eventid"
    .parameter "list"

    .prologue
    .line 638
    new-instance v7, Lorg/json/JSONArray;

    #v7=(UninitRef);
    invoke-direct {v7}, Lorg/json/JSONArray;-><init>()V

    .line 639
    .local v7, jsonArray:Lorg/json/JSONArray;
    #v7=(Reference);
    const/4 v6, 0x0

    .local v6, i:I
    :goto_0
    #v0=(Conflicted);v6=(Integer);v8=(Conflicted);
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    if-lt v6, v0, :cond_0

    .line 644
    invoke-virtual {v7}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    const-wide/16 v3, 0x0

    #v3=(LongLo);v4=(LongHi);
    const/4 v5, 0x0

    #v5=(Null);
    move-object v0, p0

    #v0=(Reference);
    move-object v1, p1

    #v1=(Reference);
    invoke-direct/range {v0 .. v5}, Lcom/mobileapptracker/MobileAppTracker;->track(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)I

    move-result v0

    #v0=(Integer);
    return v0

    .line 641
    :cond_0
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    new-instance v8, Lorg/json/JSONObject;

    #v8=(UninitRef);
    invoke-interface {p2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/util/Map;

    invoke-direct {v8, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 642
    .local v8, jsonObject:Lorg/json/JSONObject;
    #v8=(Reference);
    invoke-virtual {v7, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 639
    add-int/lit8 v6, v6, 0x1

    goto :goto_0
.end method

.method public trackAction(Ljava/lang/String;Ljava/util/Map;)I
    .locals 8
    .parameter "eventid"
    .parameter "map"

    .prologue
    .line 624
    new-instance v7, Lorg/json/JSONObject;

    #v7=(UninitRef);
    invoke-direct {v7, p2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 625
    .local v7, jsonObject:Lorg/json/JSONObject;
    #v7=(Reference);
    new-instance v6, Lorg/json/JSONArray;

    #v6=(UninitRef);
    invoke-direct {v6}, Lorg/json/JSONArray;-><init>()V

    .line 626
    .local v6, jsonArray:Lorg/json/JSONArray;
    #v6=(Reference);
    invoke-virtual {v6, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 627
    invoke-virtual {v6}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    const-wide/16 v3, 0x0

    #v3=(LongLo);v4=(LongHi);
    const/4 v5, 0x0

    #v5=(Null);
    move-object v0, p0

    #v0=(Reference);
    move-object v1, p1

    #v1=(Reference);
    invoke-direct/range {v0 .. v5}, Lcom/mobileapptracker/MobileAppTracker;->track(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public trackInstall()I
    .locals 1

    .prologue
    .line 543
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->context:Landroid/content/Context;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/mobileapptracker/MobileAppTracker;->trackInstall(Landroid/content/Context;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public declared-synchronized trackInstall(Landroid/content/Context;)I
    .locals 8
    .parameter "context"

    .prologue
    .line 553
    monitor-enter p0

    :try_start_0
    const-string v0, "mat_install"

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    .line 554
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    const-string v1, "install"

    #v1=(Reference);
    const-string v2, ""

    #v2=(Reference);
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->install:Ljava/lang/String;

    .line 555
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->install:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_3

    .line 556
    const-string v0, "mat_app_version"

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    .line 557
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    const-string v1, "version"

    #v1=(Reference);
    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 558
    .local v7, savedVersion:Ljava/lang/String;
    #v7=(Reference);
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    if-eqz v0, :cond_1

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0}, Lcom/mobileapptracker/MobileAppTracker;->getAppVersion()I

    move-result v1

    #v1=(Integer);
    if-eq v0, v1, :cond_1

    .line 559
    sget-boolean v0, Lcom/mobileapptracker/MobileAppTracker;->DEBUG:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const-string v0, "MobileAppTracker"

    #v0=(Reference);
    const-string v1, "App version has changed since last trackInstall, sending update to server"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 560
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    const-string v1, "update"

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    const-wide/16 v3, 0x0

    #v3=(LongLo);v4=(LongHi);
    const/4 v5, 0x0

    #v5=(Null);
    move-object v0, p0

    #v0=(Reference);
    invoke-direct/range {v0 .. v5}, Lcom/mobileapptracker/MobileAppTracker;->track(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)I

    .line 561
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    .line 562
    .local v6, editor:Landroid/content/SharedPreferences$Editor;
    #v6=(Reference);
    const-string v0, "version"

    invoke-virtual {p0}, Lcom/mobileapptracker/MobileAppTracker;->getAppVersion()I

    move-result v1

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-interface {v6, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 563
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 564
    const/4 v0, 0x3

    .line 581
    .end local v6           #editor:Landroid/content/SharedPreferences$Editor;
    .end local v7           #savedVersion:Ljava/lang/String;
    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Reference);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    monitor-exit p0

    return v0

    .line 566
    .restart local v7       #savedVersion:Ljava/lang/String;
    :cond_1
    :try_start_1
    #v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Reference);
    sget-boolean v0, Lcom/mobileapptracker/MobileAppTracker;->DEBUG:Z

    #v0=(Boolean);
    if-eqz v0, :cond_2

    const-string v0, "MobileAppTracker"

    #v0=(Reference);
    const-string v1, "Install has been tracked before"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 567
    :cond_2
    #v0=(Conflicted);v1=(Conflicted);
    const/4 v0, 0x2

    #v0=(PosByte);
    goto :goto_0

    .line 570
    .end local v7           #savedVersion:Ljava/lang/String;
    :cond_3
    #v0=(Boolean);v1=(Reference);v7=(Uninit);
    const-string v0, "mat_install"

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    .line 571
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    .line 572
    .restart local v6       #editor:Landroid/content/SharedPreferences$Editor;
    #v6=(Reference);
    const-string v0, "install"

    const-string v1, "installed"

    #v1=(Reference);
    invoke-interface {v6, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 573
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 574
    const-string v0, "mat_app_version"

    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    .line 575
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    .line 576
    const-string v0, "version"

    invoke-virtual {p0}, Lcom/mobileapptracker/MobileAppTracker;->getAppVersion()I

    move-result v1

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-interface {v6, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 577
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 578
    const-string v0, "installed"

    iput-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->install:Ljava/lang/String;

    .line 581
    const-string v1, "install"

    const/4 v2, 0x0

    #v2=(Null);
    const-wide/16 v3, 0x0

    #v3=(LongLo);v4=(LongHi);
    const/4 v5, 0x0

    #v5=(Null);
    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/mobileapptracker/MobileAppTracker;->track(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    #v0=(Integer);
    goto :goto_0

    .line 553
    .end local v6           #editor:Landroid/content/SharedPreferences$Editor;
    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0
.end method

.method public trackPurchase(Ljava/lang/String;IDLjava/lang/String;)I
    .locals 6
    .parameter "event"
    .parameter "purchaseStatus"
    .parameter "revenue"
    .parameter "currency"

    .prologue
    .line 603
    invoke-direct {p0, p2}, Lcom/mobileapptracker/MobileAppTracker;->setPurchaseStatus(I)V

    .line 604
    const/4 v2, 0x0

    #v2=(Null);
    move-object v0, p0

    #v0=(Reference);
    move-object v1, p1

    #v1=(Reference);
    move-wide v3, p3

    #v3=(DoubleLo);v4=(DoubleHi);
    move-object v5, p5

    #v5=(Reference);
    invoke-direct/range {v0 .. v5}, Lcom/mobileapptracker/MobileAppTracker;->track(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public trackUpdate()I
    .locals 7

    .prologue
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v3, 0x0

    .line 591
    #v3=(Null);
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->context:Landroid/content/Context;

    #v0=(Reference);
    const-string v1, "mat_install"

    #v1=(Reference);
    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    .line 592
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    .line 593
    .local v6, editor:Landroid/content/SharedPreferences$Editor;
    #v6=(Reference);
    const-string v0, "install"

    const-string v1, "installed"

    invoke-interface {v6, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 594
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 595
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->context:Landroid/content/Context;

    const-string v1, "mat_app_version"

    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    .line 596
    iget-object v0, p0, Lcom/mobileapptracker/MobileAppTracker;->SP:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    .line 597
    const-string v0, "version"

    invoke-virtual {p0}, Lcom/mobileapptracker/MobileAppTracker;->getAppVersion()I

    move-result v1

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-interface {v6, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 598
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 599
    const-string v1, "update"

    const-wide/16 v3, 0x0

    #v3=(LongLo);v4=(LongHi);
    move-object v0, p0

    move-object v5, v2

    #v5=(Null);
    invoke-direct/range {v0 .. v5}, Lcom/mobileapptracker/MobileAppTracker;->track(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

*/}
