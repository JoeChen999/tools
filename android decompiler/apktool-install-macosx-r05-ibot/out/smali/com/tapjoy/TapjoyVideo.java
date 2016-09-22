package com.tapjoy; class TapjoyVideo {/*

.class public Lcom/tapjoy/TapjoyVideo;
.super Ljava/lang/Object;
.source "TapjoyVideo.java"


# static fields
.field public static final TAPJOY_VIDEO:Ljava/lang/String; = "TapjoyVideo"

.field private static tapjoyVideo:Lcom/tapjoy/TapjoyVideo; = null

.field private static tapjoyVideoNotifier:Lcom/tapjoy/TapjoyVideoNotifier; = null

.field private static watermarkImage:Landroid/graphics/Bitmap; = null

.field private static final watermarkURL:Ljava/lang/String; = "https://s3.amazonaws.com/tapjoy/videos/assets/watermark.png"


# instance fields
.field private cache3g:Z

.field private cacheAuto:Z

.field private cacheWifi:Z

.field private cachedVideos:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable",
            "<",
            "Ljava/lang/String;",
            "Lcom/tapjoy/TapjoyVideoObject;",
            ">;"
        }
    .end annotation
.end field

.field context:Landroid/content/Context;

.field private imageCacheDir:Ljava/lang/String;

.field private initialized:Z

.field private uncachedVideos:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable",
            "<",
            "Ljava/lang/String;",
            "Lcom/tapjoy/TapjoyVideoObject;",
            ">;"
        }
    .end annotation
.end field

.field private videoCacheDir:Ljava/lang/String;

.field private videoCacheLimit:I

.field private videoQueue:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private videoToPlay:Lcom/tapjoy/TapjoyVideoObject;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 38
    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/tapjoy/TapjoyVideo;->tapjoyVideo:Lcom/tapjoy/TapjoyVideo;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5
    .parameter "applicationContext"

    .prologue
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v3, 0x0

    .line 68
    #v3=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    #p0=(Reference);
    iput-object v2, p0, Lcom/tapjoy/TapjoyVideo;->videoCacheDir:Ljava/lang/String;

    .line 43
    iput-object v2, p0, Lcom/tapjoy/TapjoyVideo;->imageCacheDir:Ljava/lang/String;

    .line 45
    const/4 v2, 0x5

    #v2=(PosByte);
    iput v2, p0, Lcom/tapjoy/TapjoyVideo;->videoCacheLimit:I

    .line 53
    iput-boolean v3, p0, Lcom/tapjoy/TapjoyVideo;->cacheAuto:Z

    .line 54
    iput-boolean v3, p0, Lcom/tapjoy/TapjoyVideo;->initialized:Z

    .line 55
    iput-boolean v3, p0, Lcom/tapjoy/TapjoyVideo;->cacheWifi:Z

    .line 56
    iput-boolean v3, p0, Lcom/tapjoy/TapjoyVideo;->cache3g:Z

    .line 69
    iput-object p1, p0, Lcom/tapjoy/TapjoyVideo;->context:Landroid/content/Context;

    .line 70
    sput-object p0, Lcom/tapjoy/TapjoyVideo;->tapjoyVideo:Lcom/tapjoy/TapjoyVideo;

    .line 75
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/tjcache/data/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/tapjoy/TapjoyVideo;->videoCacheDir:Ljava/lang/String;

    .line 76
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/tjcache/tmp/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/tapjoy/TapjoyVideo;->imageCacheDir:Ljava/lang/String;

    .line 79
    new-instance v2, Ljava/io/File;

    #v2=(UninitRef);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v4}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/tapjoy/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-static {v2}, Lcom/tapjoy/TapjoyUtil;->deleteFileOrDirectory(Ljava/io/File;)V

    .line 82
    new-instance v2, Ljava/io/File;

    #v2=(UninitRef);
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideo;->imageCacheDir:Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-static {v2}, Lcom/tapjoy/TapjoyUtil;->deleteFileOrDirectory(Ljava/io/File;)V

    .line 84
    new-instance v2, Ljava/util/Vector;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/util/Vector;-><init>()V

    #v2=(Reference);
    iput-object v2, p0, Lcom/tapjoy/TapjoyVideo;->videoQueue:Ljava/util/Vector;

    .line 85
    new-instance v2, Ljava/util/Hashtable;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/util/Hashtable;-><init>()V

    #v2=(Reference);
    iput-object v2, p0, Lcom/tapjoy/TapjoyVideo;->uncachedVideos:Ljava/util/Hashtable;

    .line 86
    new-instance v2, Ljava/util/Hashtable;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/util/Hashtable;-><init>()V

    #v2=(Reference);
    iput-object v2, p0, Lcom/tapjoy/TapjoyVideo;->cachedVideos:Ljava/util/Hashtable;

    .line 89
    const-string v2, "video_cache_count"

    invoke-static {v2}, Lcom/tapjoy/TapjoyConnectCore;->getFlagValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v2, "video_cache_count"

    invoke-static {v2}, Lcom/tapjoy/TapjoyConnectCore;->getFlagValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    if-lez v2, :cond_0

    .line 93
    :try_start_0
    const-string v2, "TapjoyVideo"

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "Setting video cache count to: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "video_cache_count"

    invoke-static {v4}, Lcom/tapjoy/TapjoyConnectCore;->getFlagValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    const-string v2, "video_cache_count"

    invoke-static {v2}, Lcom/tapjoy/TapjoyConnectCore;->getFlagValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 95
    .local v0, count:I
    #v0=(Integer);
    invoke-virtual {p0, v0}, Lcom/tapjoy/TapjoyVideo;->setVideoCacheCount(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    .end local v0           #count:I
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    invoke-virtual {p0}, Lcom/tapjoy/TapjoyVideo;->init()V

    .line 104
    return-void

    .line 97
    :catch_0
    #v1=(Uninit);v3=(Conflicted);
    move-exception v1

    .line 99
    .local v1, e:Ljava/lang/Exception;
    #v1=(Reference);
    const-string v2, "TapjoyVideo"

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "Error, invalid value for video_cache_count: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "video_cache_count"

    invoke-static {v4}, Lcom/tapjoy/TapjoyConnectCore;->getFlagValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic access$000(Lcom/tapjoy/TapjoyVideo;Ljava/lang/String;)Z
    .locals 1
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lcom/tapjoy/TapjoyVideo;->handleGetVideosResponse(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$100(Lcom/tapjoy/TapjoyVideo;)Z
    .locals 1
    .parameter "x0"

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/tapjoy/TapjoyVideo;->validateCachedVideos()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$1000(Lcom/tapjoy/TapjoyVideo;)Ljava/util/Vector;
    .locals 1
    .parameter "x0"

    .prologue
    .line 36
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideo;->videoQueue:Ljava/util/Vector;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$1100(Lcom/tapjoy/TapjoyVideo;)Ljava/util/Hashtable;
    .locals 1
    .parameter "x0"

    .prologue
    .line 36
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideo;->uncachedVideos:Ljava/util/Hashtable;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$1200(Lcom/tapjoy/TapjoyVideo;Ljava/lang/String;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lcom/tapjoy/TapjoyVideo;->cacheVideoFromURL(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$1300(Lcom/tapjoy/TapjoyVideo;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/tapjoy/TapjoyVideo;->printCachedVideos()V

    return-void
.end method

.method static synthetic access$202(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0
    .parameter "x0"

    .prologue
    .line 36
    sput-object p0, Lcom/tapjoy/TapjoyVideo;->watermarkImage:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method static synthetic access$300(Lcom/tapjoy/TapjoyVideo;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/tapjoy/TapjoyVideo;->setVideoIDs()V

    return-void
.end method

.method static synthetic access$400(Lcom/tapjoy/TapjoyVideo;)Z
    .locals 1
    .parameter "x0"

    .prologue
    .line 36
    iget-boolean v0, p0, Lcom/tapjoy/TapjoyVideo;->initialized:Z

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$402(Lcom/tapjoy/TapjoyVideo;Z)Z
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 36
    iput-boolean p1, p0, Lcom/tapjoy/TapjoyVideo;->initialized:Z

    return p1
.end method

.method static synthetic access$500(Lcom/tapjoy/TapjoyVideo;)Z
    .locals 1
    .parameter "x0"

    .prologue
    .line 36
    iget-boolean v0, p0, Lcom/tapjoy/TapjoyVideo;->cacheAuto:Z

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$600(Lcom/tapjoy/TapjoyVideo;)Z
    .locals 1
    .parameter "x0"

    .prologue
    .line 36
    iget-boolean v0, p0, Lcom/tapjoy/TapjoyVideo;->cache3g:Z

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$700(Lcom/tapjoy/TapjoyVideo;)Z
    .locals 1
    .parameter "x0"

    .prologue
    .line 36
    iget-boolean v0, p0, Lcom/tapjoy/TapjoyVideo;->cacheWifi:Z

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$800(Lcom/tapjoy/TapjoyVideo;)Ljava/util/Hashtable;
    .locals 1
    .parameter "x0"

    .prologue
    .line 36
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideo;->cachedVideos:Ljava/util/Hashtable;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$900(Lcom/tapjoy/TapjoyVideo;)I
    .locals 1
    .parameter "x0"

    .prologue
    .line 36
    iget v0, p0, Lcom/tapjoy/TapjoyVideo;->videoCacheLimit:I

    #v0=(Integer);
    return v0
.end method

.method private cacheVideoFromURL(Ljava/lang/String;)V
    .locals 27
    .parameter "url"

    .prologue
    .line 646
    const-string v23, "TapjoyVideo"

    #v23=(Reference);
    new-instance v24, Ljava/lang/StringBuilder;

    #v24=(UninitRef);
    invoke-direct/range {v24 .. v24}, Ljava/lang/StringBuilder;-><init>()V

    #v24=(Reference);
    const-string v25, "download and cache video from: "

    #v25=(Reference);
    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    move-object/from16 v0, v24

    #v0=(Reference);
    move-object/from16 v1, p1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v24

    invoke-static/range {v23 .. v24}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 648
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v21

    .line 650
    .local v21, time:J
    #v21=(LongLo);v22=(LongHi);
    const/4 v14, 0x0

    .line 651
    .local v14, networkTimeout:Z
    #v14=(Null);
    const/4 v5, 0x0

    .line 653
    .local v5, downloadError:Z
    #v5=(Null);
    const/4 v10, 0x0

    .line 654
    .local v10, inputStream:Ljava/io/BufferedInputStream;
    #v10=(Null);
    const/16 v16, 0x0

    .line 656
    .local v16, out:Ljava/io/OutputStream;
    #v16=(Null);
    const/4 v8, 0x0

    .line 657
    .local v8, fileName:Ljava/lang/String;
    #v8=(Null);
    const/16 v18, 0x0

    .line 658
    .local v18, path:Ljava/lang/String;
    #v18=(Null);
    const/16 v19, 0x0

    .line 662
    .local v19, savedFile:Ljava/io/File;
    :try_start_0
    #v19=(Null);
    new-instance v9, Ljava/net/URL;

    #v9=(UninitRef);
    move-object/from16 v0, p1

    invoke-direct {v9, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 663
    .local v9, fileURL:Ljava/net/URL;
    #v9=(Reference);
    invoke-virtual {v9}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v4

    .line 664
    .local v4, connection:Ljava/net/URLConnection;
    #v4=(Reference);
    const/16 v23, 0x3a98

    #v23=(PosShort);
    move/from16 v0, v23

    #v0=(PosShort);
    invoke-virtual {v4, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 665
    const/16 v23, 0x7530

    move/from16 v0, v23

    invoke-virtual {v4, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 666
    invoke-virtual {v4}, Ljava/net/URLConnection;->connect()V

    .line 668
    new-instance v11, Ljava/io/BufferedInputStream;

    #v11=(UninitRef);
    invoke-virtual {v4}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v23

    #v23=(Reference);
    move-object/from16 v0, v23

    #v0=(Reference);
    invoke-direct {v11, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 672
    .end local v10           #inputStream:Ljava/io/BufferedInputStream;
    .local v11, inputStream:Ljava/io/BufferedInputStream;
    :try_start_1
    #v11=(Reference);
    new-instance v7, Ljava/io/File;

    #v7=(UninitRef);
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tapjoy/TapjoyVideo;->videoCacheDir:Ljava/lang/String;

    move-object/from16 v23, v0

    move-object/from16 v0, v23

    invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 674
    .local v7, fileDir:Ljava/io/File;
    #v7=(Reference);
    const/16 v23, 0x0

    #v23=(Null);
    const-string v24, "/"

    move-object/from16 v0, p1

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v24

    #v24=(Integer);
    add-int/lit8 v24, v24, 0x1

    move-object/from16 v0, p1

    move/from16 v1, v23

    #v1=(Null);
    move/from16 v2, v24

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v18

    .line 675
    #v18=(Reference);
    const-string v23, "/"

    #v23=(Reference);
    move-object/from16 v0, p1

    move-object/from16 v1, v23

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v23

    #v23=(Integer);
    add-int/lit8 v23, v23, 0x1

    move-object/from16 v0, p1

    move/from16 v1, v23

    #v1=(Integer);
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    .line 678
    #v8=(Reference);
    const/16 v23, 0x0

    #v23=(Null);
    const/16 v24, 0x2e

    #v24=(PosByte);
    move/from16 v0, v24

    #v0=(PosByte);
    invoke-virtual {v8, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v24

    #v24=(Integer);
    move/from16 v0, v23

    #v0=(Null);
    move/from16 v1, v24

    invoke-virtual {v8, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 680
    const-string v23, "TapjoyVideo"

    #v23=(Reference);
    new-instance v24, Ljava/lang/StringBuilder;

    #v24=(UninitRef);
    invoke-direct/range {v24 .. v24}, Ljava/lang/StringBuilder;-><init>()V

    #v24=(Reference);
    const-string v25, "fileDir: "

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    move-object/from16 v0, v24

    #v0=(Reference);
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v24

    invoke-static/range {v23 .. v24}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 681
    const-string v23, "TapjoyVideo"

    new-instance v24, Ljava/lang/StringBuilder;

    #v24=(UninitRef);
    invoke-direct/range {v24 .. v24}, Ljava/lang/StringBuilder;-><init>()V

    #v24=(Reference);
    const-string v25, "path: "

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    move-object/from16 v0, v24

    move-object/from16 v1, v18

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v24

    invoke-static/range {v23 .. v24}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 682
    const-string v23, "TapjoyVideo"

    new-instance v24, Ljava/lang/StringBuilder;

    #v24=(UninitRef);
    invoke-direct/range {v24 .. v24}, Ljava/lang/StringBuilder;-><init>()V

    #v24=(Reference);
    const-string v25, "file name: "

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    move-object/from16 v0, v24

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v24

    invoke-static/range {v23 .. v24}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 686
    invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z

    move-result v23

    #v23=(Boolean);
    if-eqz v23, :cond_0

    .line 687
    const-string v23, "TapjoyVideo"

    #v23=(Reference);
    new-instance v24, Ljava/lang/StringBuilder;

    #v24=(UninitRef);
    invoke-direct/range {v24 .. v24}, Ljava/lang/StringBuilder;-><init>()V

    #v24=(Reference);
    const-string v25, "created directory at: "

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual {v7}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v24

    invoke-static/range {v23 .. v24}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 689
    :cond_0
    #v23=(Conflicted);
    new-instance v20, Ljava/io/File;

    #v20=(UninitRef);
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tapjoy/TapjoyVideo;->videoCacheDir:Ljava/lang/String;

    move-object/from16 v23, v0

    #v23=(Reference);
    move-object/from16 v0, v20

    #v0=(UninitRef);
    move-object/from16 v1, v23

    invoke-direct {v0, v1, v8}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    .line 690
    .end local v19           #savedFile:Ljava/io/File;
    .local v20, savedFile:Ljava/io/File;
    :try_start_2
    #v0=(Reference);v20=(Reference);
    new-instance v17, Ljava/io/FileOutputStream;

    #v17=(UninitRef);
    move-object/from16 v0, v17

    #v0=(UninitRef);
    move-object/from16 v1, v20

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_9
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5

    .line 692
    .end local v16           #out:Ljava/io/OutputStream;
    .local v17, out:Ljava/io/OutputStream;
    :try_start_3
    #v0=(Reference);v17=(Reference);
    const-string v23, "TapjoyVideo"

    new-instance v24, Ljava/lang/StringBuilder;

    #v24=(UninitRef);
    invoke-direct/range {v24 .. v24}, Ljava/lang/StringBuilder;-><init>()V

    #v24=(Reference);
    const-string v25, "downloading video file to: "

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual/range {v20 .. v20}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v24

    invoke-static/range {v23 .. v24}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 694
    const/16 v23, 0x400

    #v23=(PosShort);
    move/from16 v0, v23

    #v0=(PosShort);
    new-array v3, v0, [B

    .line 697
    .local v3, buf:[B
    :goto_0
    #v0=(Conflicted);v3=(Reference);v13=(Conflicted);
    invoke-virtual {v11, v3}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v13

    .local v13, len:I
    #v13=(Integer);
    const/16 v23, -0x1

    #v23=(Byte);
    move/from16 v0, v23

    #v0=(Byte);
    if-eq v13, v0, :cond_2

    .line 699
    const/16 v23, 0x0

    #v23=(Null);
    move-object/from16 v0, v17

    #v0=(Reference);
    move/from16 v1, v23

    #v1=(Null);
    invoke-virtual {v0, v3, v1, v13}, Ljava/io/OutputStream;->write([BII)V
    :try_end_3
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6

    goto :goto_0

    .line 711
    .end local v3           #buf:[B
    .end local v13           #len:I
    :catch_0
    #v0=(Conflicted);v1=(Reference);v3=(Conflicted);v13=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);
    move-exception v6

    #v6=(Reference);
    move-object/from16 v19, v20

    .end local v20           #savedFile:Ljava/io/File;
    .restart local v19       #savedFile:Ljava/io/File;
    #v19=(Reference);
    move-object/from16 v16, v17

    .end local v17           #out:Ljava/io/OutputStream;
    .restart local v16       #out:Ljava/io/OutputStream;
    #v16=(Reference);
    move-object v10, v11

    .line 713
    .end local v4           #connection:Ljava/net/URLConnection;
    .end local v7           #fileDir:Ljava/io/File;
    .end local v9           #fileURL:Ljava/net/URL;
    .end local v11           #inputStream:Ljava/io/BufferedInputStream;
    .local v6, e:Ljava/net/SocketTimeoutException;
    .restart local v10       #inputStream:Ljava/io/BufferedInputStream;
    :goto_1
    #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Reference);v11=(Conflicted);v17=(Conflicted);v20=(Conflicted);
    const-string v23, "TapjoyVideo"

    #v23=(Reference);
    new-instance v24, Ljava/lang/StringBuilder;

    #v24=(UninitRef);
    invoke-direct/range {v24 .. v24}, Ljava/lang/StringBuilder;-><init>()V

    #v24=(Reference);
    const-string v25, "Network timeout: "

    #v25=(Reference);
    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual {v6}, Ljava/net/SocketTimeoutException;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v24

    invoke-static/range {v23 .. v24}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 714
    const/4 v14, 0x1

    .line 715
    #v14=(One);
    const/4 v5, 0x1

    .line 723
    .end local v6           #e:Ljava/net/SocketTimeoutException;
    :goto_2
    #v5=(Boolean);v6=(Conflicted);v14=(Boolean);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);
    const/16 v23, 0x1

    #v23=(One);
    move/from16 v0, v23

    #v0=(One);
    if-ne v14, v0, :cond_1

    .line 725
    const-string v23, "TapjoyVideo"

    #v23=(Reference);
    const-string v24, "Network timeout"

    #v24=(Reference);
    invoke-static/range {v23 .. v24}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 730
    :try_start_4
    invoke-virtual {v10}, Ljava/io/BufferedInputStream;->close()V

    .line 731
    invoke-virtual/range {v16 .. v16}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 740
    :cond_1
    :goto_3
    #v23=(Conflicted);v24=(Conflicted);
    if-nez v14, :cond_4

    if-nez v5, :cond_4

    .line 745
    :try_start_5
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Lcom/tapjoy/TapjoyVideo;->videoQueue:Ljava/util/Vector;

    move-object/from16 v23, v0

    #v23=(Reference);
    const/16 v24, 0x0

    #v24=(Null);
    invoke-virtual/range {v23 .. v24}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v12

    #v12=(Reference);
    check-cast v12, Ljava/lang/String;

    .line 746
    .local v12, key:Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tapjoy/TapjoyVideo;->uncachedVideos:Ljava/util/Hashtable;

    move-object/from16 v23, v0

    move-object/from16 v0, v23

    invoke-virtual {v0, v12}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    #v15=(Reference);
    check-cast v15, Lcom/tapjoy/TapjoyVideoObject;

    .line 748
    .local v15, newVideo:Lcom/tapjoy/TapjoyVideoObject;
    invoke-virtual/range {v19 .. v19}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v23

    move-object/from16 v0, v23

    iput-object v0, v15, Lcom/tapjoy/TapjoyVideoObject;->dataLocation:Ljava/lang/String;

    .line 751
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tapjoy/TapjoyVideo;->cachedVideos:Ljava/util/Hashtable;

    move-object/from16 v23, v0

    move-object/from16 v0, v23

    invoke-virtual {v0, v12, v15}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 752
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tapjoy/TapjoyVideo;->uncachedVideos:Ljava/util/Hashtable;

    move-object/from16 v23, v0

    move-object/from16 v0, v23

    invoke-virtual {v0, v12}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 753
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tapjoy/TapjoyVideo;->videoQueue:Ljava/util/Vector;

    move-object/from16 v23, v0

    const/16 v24, 0x0

    invoke-virtual/range {v23 .. v24}, Ljava/util/Vector;->removeElementAt(I)V

    .line 755
    invoke-direct/range {p0 .. p0}, Lcom/tapjoy/TapjoyVideo;->setVideoIDs()V

    .line 757
    const-string v23, "TapjoyVideo"

    new-instance v24, Ljava/lang/StringBuilder;

    #v24=(UninitRef);
    invoke-direct/range {v24 .. v24}, Ljava/lang/StringBuilder;-><init>()V

    #v24=(Reference);
    const-string v25, "video cached in: "

    #v25=(Reference);
    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v25

    #v25=(LongLo);v26=(LongHi);
    sub-long v25, v25, v21

    invoke-virtual/range {v24 .. v26}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v24

    const-string v25, "ms"

    #v25=(Reference);
    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v24

    invoke-static/range {v23 .. v24}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 769
    .end local v12           #key:Ljava/lang/String;
    .end local v15           #newVideo:Lcom/tapjoy/TapjoyVideoObject;
    :goto_4
    #v0=(Conflicted);v12=(Conflicted);v15=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);
    return-void

    .line 702
    .end local v10           #inputStream:Ljava/io/BufferedInputStream;
    .end local v16           #out:Ljava/io/OutputStream;
    .end local v19           #savedFile:Ljava/io/File;
    .restart local v3       #buf:[B
    .restart local v4       #connection:Ljava/net/URLConnection;
    .restart local v7       #fileDir:Ljava/io/File;
    .restart local v9       #fileURL:Ljava/net/URL;
    .restart local v11       #inputStream:Ljava/io/BufferedInputStream;
    .restart local v13       #len:I
    .restart local v17       #out:Ljava/io/OutputStream;
    .restart local v20       #savedFile:Ljava/io/File;
    :cond_2
    :try_start_6
    #v0=(Byte);v1=(Reference);v2=(Integer);v3=(Reference);v4=(Reference);v5=(Null);v6=(Uninit);v7=(Reference);v9=(Reference);v10=(Null);v11=(Reference);v12=(Uninit);v13=(Integer);v14=(Null);v15=(Uninit);v16=(Null);v17=(Reference);v19=(Null);v20=(Reference);v23=(Byte);v24=(Reference);v25=(Reference);v26=(Uninit);
    invoke-virtual/range {v17 .. v17}, Ljava/io/OutputStream;->close()V

    .line 703
    invoke-virtual {v11}, Ljava/io/BufferedInputStream;->close()V

    .line 705
    const-string v23, "TapjoyVideo"

    #v23=(Reference);
    new-instance v24, Ljava/lang/StringBuilder;

    #v24=(UninitRef);
    invoke-direct/range {v24 .. v24}, Ljava/lang/StringBuilder;-><init>()V

    #v24=(Reference);
    const-string v25, "FILE SIZE: "

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual/range {v20 .. v20}, Ljava/io/File;->length()J

    move-result-wide v25

    #v25=(LongLo);v26=(LongHi);
    invoke-virtual/range {v24 .. v26}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v24

    invoke-static/range {v23 .. v24}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 708
    invoke-virtual/range {v20 .. v20}, Ljava/io/File;->length()J
    :try_end_6
    .catch Ljava/net/SocketTimeoutException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    move-result-wide v23

    #v23=(LongLo);v24=(LongHi);
    const-wide/16 v25, 0x0

    cmp-long v23, v23, v25

    #v23=(Byte);
    if-nez v23, :cond_3

    .line 709
    const/4 v14, 0x1

    :cond_3
    #v14=(Boolean);
    move-object/from16 v19, v20

    .end local v20           #savedFile:Ljava/io/File;
    .restart local v19       #savedFile:Ljava/io/File;
    #v19=(Reference);
    move-object/from16 v16, v17

    .end local v17           #out:Ljava/io/OutputStream;
    .restart local v16       #out:Ljava/io/OutputStream;
    #v16=(Reference);
    move-object v10, v11

    .line 721
    .end local v11           #inputStream:Ljava/io/BufferedInputStream;
    .restart local v10       #inputStream:Ljava/io/BufferedInputStream;
    #v10=(Reference);
    goto/16 :goto_2

    .line 717
    .end local v3           #buf:[B
    .end local v4           #connection:Ljava/net/URLConnection;
    .end local v7           #fileDir:Ljava/io/File;
    .end local v9           #fileURL:Ljava/net/URL;
    .end local v13           #len:I
    :catch_1
    #v0=(Conflicted);v2=(Uninit);v3=(Uninit);v4=(Conflicted);v7=(Uninit);v8=(Null);v9=(Conflicted);v10=(Null);v11=(Conflicted);v13=(Uninit);v14=(Null);v16=(Null);v17=(Uninit);v18=(Null);v19=(Null);v20=(Uninit);v23=(Conflicted);v24=(Reference);v25=(Reference);v26=(Uninit);
    move-exception v6

    .line 719
    .local v6, e:Ljava/lang/Exception;
    :goto_5
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Reference);v7=(Conflicted);v8=(Reference);v10=(Reference);v13=(Conflicted);v16=(Reference);v17=(Conflicted);v18=(Reference);v19=(Reference);v20=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);
    const-string v23, "TapjoyVideo"

    #v23=(Reference);
    new-instance v24, Ljava/lang/StringBuilder;

    #v24=(UninitRef);
    invoke-direct/range {v24 .. v24}, Ljava/lang/StringBuilder;-><init>()V

    #v24=(Reference);
    const-string v25, "Error caching video file: "

    #v25=(Reference);
    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual {v6}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v24

    invoke-static/range {v23 .. v24}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 720
    const/4 v5, 0x1

    #v5=(One);
    goto/16 :goto_2

    .line 759
    .end local v6           #e:Ljava/lang/Exception;
    :catch_2
    #v0=(Reference);v5=(Boolean);v6=(Conflicted);v12=(Conflicted);v14=(Boolean);v15=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);
    move-exception v6

    .line 761
    .restart local v6       #e:Ljava/lang/Exception;
    #v6=(Reference);
    const-string v23, "TapjoyVideo"

    #v23=(Reference);
    new-instance v24, Ljava/lang/StringBuilder;

    #v24=(UninitRef);
    invoke-direct/range {v24 .. v24}, Ljava/lang/StringBuilder;-><init>()V

    #v24=(Reference);
    const-string v25, "error caching video ???: "

    #v25=(Reference);
    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual {v6}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v24

    invoke-static/range {v23 .. v24}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    .line 767
    .end local v6           #e:Ljava/lang/Exception;
    :cond_4
    #v0=(One);v6=(Conflicted);v12=(Uninit);v15=(Uninit);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);
    const/16 v23, 0x2

    #v23=(PosByte);
    invoke-static/range {v23 .. v23}, Lcom/tapjoy/TapjoyVideo;->videoNotifierError(I)V

    goto :goto_4

    .line 733
    :catch_3
    #v23=(Reference);v24=(Reference);
    move-exception v23

    goto/16 :goto_3

    .line 717
    .end local v10           #inputStream:Ljava/io/BufferedInputStream;
    .restart local v4       #connection:Ljava/net/URLConnection;
    .restart local v9       #fileURL:Ljava/net/URL;
    .restart local v11       #inputStream:Ljava/io/BufferedInputStream;
    :catch_4
    #v0=(Conflicted);v3=(Uninit);v4=(Reference);v5=(Null);v6=(Uninit);v9=(Reference);v10=(Null);v11=(Reference);v13=(Uninit);v14=(Null);v16=(Null);v17=(Uninit);v19=(Null);v23=(Conflicted);v24=(Conflicted);v25=(Reference);v26=(Uninit);
    move-exception v6

    #v6=(Reference);
    move-object v10, v11

    .end local v11           #inputStream:Ljava/io/BufferedInputStream;
    .restart local v10       #inputStream:Ljava/io/BufferedInputStream;
    #v10=(Reference);
    goto :goto_5

    .end local v10           #inputStream:Ljava/io/BufferedInputStream;
    .end local v19           #savedFile:Ljava/io/File;
    .restart local v7       #fileDir:Ljava/io/File;
    .restart local v11       #inputStream:Ljava/io/BufferedInputStream;
    .restart local v20       #savedFile:Ljava/io/File;
    :catch_5
    #v1=(Reference);v2=(Integer);v6=(Uninit);v7=(Reference);v10=(Null);v17=(Conflicted);v20=(Reference);v23=(Reference);v24=(Reference);
    move-exception v6

    #v6=(Reference);
    move-object/from16 v19, v20

    .end local v20           #savedFile:Ljava/io/File;
    .restart local v19       #savedFile:Ljava/io/File;
    #v19=(Reference);
    move-object v10, v11

    .end local v11           #inputStream:Ljava/io/BufferedInputStream;
    .restart local v10       #inputStream:Ljava/io/BufferedInputStream;
    #v10=(Reference);
    goto :goto_5

    .end local v10           #inputStream:Ljava/io/BufferedInputStream;
    .end local v16           #out:Ljava/io/OutputStream;
    .end local v19           #savedFile:Ljava/io/File;
    .restart local v11       #inputStream:Ljava/io/BufferedInputStream;
    .restart local v17       #out:Ljava/io/OutputStream;
    .restart local v20       #savedFile:Ljava/io/File;
    :catch_6
    #v3=(Conflicted);v6=(Uninit);v10=(Null);v13=(Conflicted);v17=(Reference);v19=(Null);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);
    move-exception v6

    #v6=(Reference);
    move-object/from16 v19, v20

    .end local v20           #savedFile:Ljava/io/File;
    .restart local v19       #savedFile:Ljava/io/File;
    #v19=(Reference);
    move-object/from16 v16, v17

    .end local v17           #out:Ljava/io/OutputStream;
    .restart local v16       #out:Ljava/io/OutputStream;
    #v16=(Reference);
    move-object v10, v11

    .end local v11           #inputStream:Ljava/io/BufferedInputStream;
    .restart local v10       #inputStream:Ljava/io/BufferedInputStream;
    #v10=(Reference);
    goto :goto_5

    .line 711
    .end local v4           #connection:Ljava/net/URLConnection;
    .end local v7           #fileDir:Ljava/io/File;
    .end local v9           #fileURL:Ljava/net/URL;
    :catch_7
    #v2=(Uninit);v3=(Uninit);v4=(Conflicted);v6=(Uninit);v7=(Uninit);v8=(Null);v9=(Conflicted);v10=(Null);v11=(Conflicted);v13=(Uninit);v16=(Null);v17=(Uninit);v18=(Null);v19=(Null);v20=(Uninit);v24=(Reference);v25=(Reference);v26=(Uninit);
    move-exception v6

    #v6=(Reference);
    goto/16 :goto_1

    .end local v10           #inputStream:Ljava/io/BufferedInputStream;
    .restart local v4       #connection:Ljava/net/URLConnection;
    .restart local v9       #fileURL:Ljava/net/URL;
    .restart local v11       #inputStream:Ljava/io/BufferedInputStream;
    :catch_8
    #v1=(Conflicted);v2=(Conflicted);v4=(Reference);v6=(Uninit);v7=(Conflicted);v8=(Reference);v9=(Reference);v11=(Reference);v18=(Reference);v20=(Conflicted);v24=(Conflicted);
    move-exception v6

    #v6=(Reference);
    move-object v10, v11

    .end local v11           #inputStream:Ljava/io/BufferedInputStream;
    .restart local v10       #inputStream:Ljava/io/BufferedInputStream;
    #v10=(Reference);
    goto/16 :goto_1

    .end local v10           #inputStream:Ljava/io/BufferedInputStream;
    .end local v19           #savedFile:Ljava/io/File;
    .restart local v7       #fileDir:Ljava/io/File;
    .restart local v11       #inputStream:Ljava/io/BufferedInputStream;
    .restart local v20       #savedFile:Ljava/io/File;
    :catch_9
    #v1=(Reference);v2=(Integer);v6=(Uninit);v7=(Reference);v10=(Null);v17=(Conflicted);v20=(Reference);v23=(Reference);v24=(Reference);
    move-exception v6

    #v6=(Reference);
    move-object/from16 v19, v20

    .end local v20           #savedFile:Ljava/io/File;
    .restart local v19       #savedFile:Ljava/io/File;
    #v19=(Reference);
    move-object v10, v11

    .end local v11           #inputStream:Ljava/io/BufferedInputStream;
    .restart local v10       #inputStream:Ljava/io/BufferedInputStream;
    #v10=(Reference);
    goto/16 :goto_1
.end method

.method public static getInstance()Lcom/tapjoy/TapjoyVideo;
    .locals 1

    .prologue
    .line 113
    sget-object v0, Lcom/tapjoy/TapjoyVideo;->tapjoyVideo:Lcom/tapjoy/TapjoyVideo;

    #v0=(Reference);
    return-object v0
.end method

.method public static getWatermarkImage()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 946
    sget-object v0, Lcom/tapjoy/TapjoyVideo;->watermarkImage:Landroid/graphics/Bitmap;

    #v0=(Reference);
    return-object v0
.end method

.method private handleGetVideosResponse(Ljava/lang/String;)Z
    .locals 27
    .parameter "response"

    .prologue
    .line 275
    invoke-static {}, Ljavax/xml/parsers/DocumentBuilderFactory;->newInstance()Ljavax/xml/parsers/DocumentBuilderFactory;

    move-result-object v9

    .line 278
    .local v9, factory:Ljavax/xml/parsers/DocumentBuilderFactory;
    #v9=(Reference);
    const-string v24, "TapjoyVideo"

    #v24=(Reference);
    const-string v25, "========================================"

    #v25=(Reference);
    invoke-static/range {v24 .. v25}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    :try_start_0
    new-instance v11, Ljava/io/ByteArrayInputStream;

    #v11=(UninitRef);
    const-string v24, "UTF-8"

    move-object/from16 v0, p1

    #v0=(Reference);
    move-object/from16 v1, v24

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v24

    move-object/from16 v0, v24

    invoke-direct {v11, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 285
    .local v11, is:Ljava/io/InputStream;
    #v11=(Reference);
    invoke-virtual {v9}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;

    move-result-object v6

    .line 286
    .local v6, documentBuilder:Ljavax/xml/parsers/DocumentBuilder;
    #v6=(Reference);
    invoke-virtual {v6, v11}, Ljavax/xml/parsers/DocumentBuilder;->parse(Ljava/io/InputStream;)Lorg/w3c/dom/Document;

    move-result-object v5

    .line 289
    .local v5, document:Lorg/w3c/dom/Document;
    #v5=(Reference);
    invoke-interface {v5}, Lorg/w3c/dom/Document;->getDocumentElement()Lorg/w3c/dom/Element;

    move-result-object v24

    invoke-interface/range {v24 .. v24}, Lorg/w3c/dom/Element;->normalize()V

    .line 291
    const-string v24, "TapjoyVideos"

    move-object/from16 v0, v24

    invoke-interface {v5, v0}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v19

    .line 292
    .local v19, nodelistParent:Lorg/w3c/dom/NodeList;
    #v19=(Reference);
    const/16 v24, 0x0

    #v24=(Null);
    move-object/from16 v0, v19

    move/from16 v1, v24

    #v1=(Null);
    invoke-interface {v0, v1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v24

    #v24=(Reference);
    invoke-interface/range {v24 .. v24}, Lorg/w3c/dom/Node;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object v18

    .line 296
    .local v18, nodelist:Lorg/w3c/dom/NodeList;
    #v18=(Reference);
    const/16 v24, 0x0

    #v24=(Null);
    move-object/from16 v0, v19

    move/from16 v1, v24

    invoke-interface {v0, v1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v24

    #v24=(Reference);
    invoke-interface/range {v24 .. v24}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v17

    .line 299
    .local v17, nodeMap:Lorg/w3c/dom/NamedNodeMap;
    #v17=(Reference);
    const-string v24, "cache_auto"

    move-object/from16 v0, v17

    move-object/from16 v1, v24

    #v1=(Reference);
    invoke-interface {v0, v1}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v24

    if-eqz v24, :cond_0

    .line 300
    const-string v24, "cache_auto"

    move-object/from16 v0, v17

    move-object/from16 v1, v24

    invoke-interface {v0, v1}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v24

    invoke-interface/range {v24 .. v24}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v24

    if-eqz v24, :cond_0

    .line 301
    const-string v24, "cache_auto"

    move-object/from16 v0, v17

    move-object/from16 v1, v24

    invoke-interface {v0, v1}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v24

    invoke-interface/range {v24 .. v24}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v24

    invoke-static/range {v24 .. v24}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v24

    #v24=(Boolean);
    move/from16 v0, v24

    #v0=(Boolean);
    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/tapjoy/TapjoyVideo;->cacheAuto:Z

    .line 304
    :cond_0
    #v0=(Conflicted);v24=(Conflicted);
    const-string v24, "cache_wifi"

    #v24=(Reference);
    move-object/from16 v0, v17

    #v0=(Reference);
    move-object/from16 v1, v24

    invoke-interface {v0, v1}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v24

    if-eqz v24, :cond_1

    .line 305
    const-string v24, "cache_wifi"

    move-object/from16 v0, v17

    move-object/from16 v1, v24

    invoke-interface {v0, v1}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v24

    invoke-interface/range {v24 .. v24}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v24

    if-eqz v24, :cond_1

    .line 306
    const-string v24, "cache_wifi"

    move-object/from16 v0, v17

    move-object/from16 v1, v24

    invoke-interface {v0, v1}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v24

    invoke-interface/range {v24 .. v24}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v24

    invoke-static/range {v24 .. v24}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v24

    #v24=(Boolean);
    move/from16 v0, v24

    #v0=(Boolean);
    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/tapjoy/TapjoyVideo;->cacheWifi:Z

    .line 309
    :cond_1
    #v0=(Conflicted);v24=(Conflicted);
    const-string v24, "cache_mobile"

    #v24=(Reference);
    move-object/from16 v0, v17

    #v0=(Reference);
    move-object/from16 v1, v24

    invoke-interface {v0, v1}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v24

    if-eqz v24, :cond_2

    .line 310
    const-string v24, "cache_mobile"

    move-object/from16 v0, v17

    move-object/from16 v1, v24

    invoke-interface {v0, v1}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v24

    invoke-interface/range {v24 .. v24}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v24

    if-eqz v24, :cond_2

    .line 311
    const-string v24, "cache_mobile"

    move-object/from16 v0, v17

    move-object/from16 v1, v24

    invoke-interface {v0, v1}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v24

    invoke-interface/range {v24 .. v24}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v24

    invoke-static/range {v24 .. v24}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v24

    #v24=(Boolean);
    move/from16 v0, v24

    #v0=(Boolean);
    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/tapjoy/TapjoyVideo;->cache3g:Z

    .line 313
    :cond_2
    #v0=(Conflicted);v24=(Conflicted);
    const-string v24, "TapjoyVideo"

    #v24=(Reference);
    new-instance v25, Ljava/lang/StringBuilder;

    #v25=(UninitRef);
    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    #v25=(Reference);
    const-string v26, "cacheAuto: "

    #v26=(Reference);
    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v0, v0, Lcom/tapjoy/TapjoyVideo;->cacheAuto:Z

    #v0=(Boolean);
    move/from16 v26, v0

    #v26=(Boolean);
    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-static/range {v24 .. v25}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    const-string v24, "TapjoyVideo"

    new-instance v25, Ljava/lang/StringBuilder;

    #v25=(UninitRef);
    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    #v25=(Reference);
    const-string v26, "cacheWifi: "

    #v26=(Reference);
    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v0, v0, Lcom/tapjoy/TapjoyVideo;->cacheWifi:Z

    #v0=(Boolean);
    move/from16 v26, v0

    #v26=(Boolean);
    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-static/range {v24 .. v25}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    const-string v24, "TapjoyVideo"

    new-instance v25, Ljava/lang/StringBuilder;

    #v25=(UninitRef);
    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    #v25=(Reference);
    const-string v26, "cache3g: "

    #v26=(Reference);
    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v0, v0, Lcom/tapjoy/TapjoyVideo;->cache3g:Z

    #v0=(Boolean);
    move/from16 v26, v0

    #v26=(Boolean);
    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-static/range {v24 .. v25}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    const-string v24, "TapjoyVideo"

    new-instance v25, Ljava/lang/StringBuilder;

    #v25=(UninitRef);
    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    #v25=(Reference);
    const-string v26, "nodelistParent length: "

    #v26=(Reference);
    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-interface/range {v19 .. v19}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v26

    #v26=(Integer);
    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-static/range {v24 .. v25}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    const-string v24, "TapjoyVideo"

    new-instance v25, Ljava/lang/StringBuilder;

    #v25=(UninitRef);
    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    #v25=(Reference);
    const-string v26, "nodelist length: "

    #v26=(Reference);
    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-interface/range {v18 .. v18}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v26

    #v26=(Integer);
    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-static/range {v24 .. v25}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    const/4 v10, 0x0

    .local v10, i:I
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v8=(Conflicted);v10=(Integer);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);
    invoke-interface/range {v18 .. v18}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v24

    #v24=(Integer);
    move/from16 v0, v24

    #v0=(Integer);
    if-ge v10, v0, :cond_10

    .line 322
    move-object/from16 v0, v18

    #v0=(Reference);
    invoke-interface {v0, v10}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v16

    .line 325
    .local v16, node:Lorg/w3c/dom/Node;
    #v16=(Reference);
    new-instance v23, Lcom/tapjoy/TapjoyVideoObject;

    #v23=(UninitRef);
    invoke-direct/range {v23 .. v23}, Lcom/tapjoy/TapjoyVideoObject;-><init>()V

    .line 327
    .local v23, videoObject:Lcom/tapjoy/TapjoyVideoObject;
    #v23=(Reference);
    if-eqz v16, :cond_f

    invoke-interface/range {v16 .. v16}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v24

    #v24=(Short);
    const/16 v25, 0x1

    #v25=(One);
    move/from16 v0, v24

    #v0=(Short);
    move/from16 v1, v25

    #v1=(One);
    if-ne v0, v1, :cond_f

    .line 329
    move-object/from16 v0, v16

    #v0=(Reference);
    check-cast v0, Lorg/w3c/dom/Element;

    move-object v8, v0

    .line 332
    .local v8, element:Lorg/w3c/dom/Element;
    #v8=(Reference);
    const-string v24, "ClickURL"

    #v24=(Reference);
    move-object/from16 v0, v24

    invoke-interface {v8, v0}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v24

    invoke-static/range {v24 .. v24}, Lcom/tapjoy/TapjoyUtil;->getNodeTrimValue(Lorg/w3c/dom/NodeList;)Ljava/lang/String;

    move-result-object v22

    .line 333
    .local v22, value:Ljava/lang/String;
    #v22=(Reference);
    if-eqz v22, :cond_3

    const-string v24, ""

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v24

    #v24=(Boolean);
    if-nez v24, :cond_3

    .line 334
    move-object/from16 v0, v22

    move-object/from16 v1, v23

    iput-object v0, v1, Lcom/tapjoy/TapjoyVideoObject;->clickURL:Ljava/lang/String;

    .line 336
    :cond_3
    #v1=(Conflicted);v24=(Conflicted);
    const-string v24, "OfferID"

    #v24=(Reference);
    move-object/from16 v0, v24

    invoke-interface {v8, v0}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v24

    invoke-static/range {v24 .. v24}, Lcom/tapjoy/TapjoyUtil;->getNodeTrimValue(Lorg/w3c/dom/NodeList;)Ljava/lang/String;

    move-result-object v22

    .line 337
    if-eqz v22, :cond_4

    const-string v24, ""

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v24

    #v24=(Boolean);
    if-nez v24, :cond_4

    .line 338
    move-object/from16 v0, v22

    move-object/from16 v1, v23

    iput-object v0, v1, Lcom/tapjoy/TapjoyVideoObject;->offerID:Ljava/lang/String;

    .line 340
    :cond_4
    #v1=(Conflicted);v24=(Conflicted);
    const-string v24, "Name"

    #v24=(Reference);
    move-object/from16 v0, v24

    invoke-interface {v8, v0}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v24

    invoke-static/range {v24 .. v24}, Lcom/tapjoy/TapjoyUtil;->getNodeTrimValue(Lorg/w3c/dom/NodeList;)Ljava/lang/String;

    move-result-object v22

    .line 341
    if-eqz v22, :cond_5

    const-string v24, ""

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v24

    #v24=(Boolean);
    if-nez v24, :cond_5

    .line 342
    move-object/from16 v0, v22

    move-object/from16 v1, v23

    iput-object v0, v1, Lcom/tapjoy/TapjoyVideoObject;->videoAdName:Ljava/lang/String;

    .line 344
    :cond_5
    #v1=(Conflicted);v24=(Conflicted);
    const-string v24, "Amount"

    #v24=(Reference);
    move-object/from16 v0, v24

    invoke-interface {v8, v0}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v24

    invoke-static/range {v24 .. v24}, Lcom/tapjoy/TapjoyUtil;->getNodeTrimValue(Lorg/w3c/dom/NodeList;)Ljava/lang/String;

    move-result-object v22

    .line 345
    if-eqz v22, :cond_6

    const-string v24, ""

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v24

    #v24=(Boolean);
    if-nez v24, :cond_6

    .line 346
    move-object/from16 v0, v22

    move-object/from16 v1, v23

    iput-object v0, v1, Lcom/tapjoy/TapjoyVideoObject;->currencyAmount:Ljava/lang/String;

    .line 348
    :cond_6
    #v1=(Conflicted);v24=(Conflicted);
    const-string v24, "CurrencyName"

    #v24=(Reference);
    move-object/from16 v0, v24

    invoke-interface {v8, v0}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v24

    invoke-static/range {v24 .. v24}, Lcom/tapjoy/TapjoyUtil;->getNodeTrimValue(Lorg/w3c/dom/NodeList;)Ljava/lang/String;

    move-result-object v22

    .line 349
    if-eqz v22, :cond_7

    const-string v24, ""

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v24

    #v24=(Boolean);
    if-nez v24, :cond_7

    .line 350
    move-object/from16 v0, v22

    move-object/from16 v1, v23

    iput-object v0, v1, Lcom/tapjoy/TapjoyVideoObject;->currencyName:Ljava/lang/String;

    .line 352
    :cond_7
    #v1=(Conflicted);v24=(Conflicted);
    const-string v24, "VideoURL"

    #v24=(Reference);
    move-object/from16 v0, v24

    invoke-interface {v8, v0}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v24

    invoke-static/range {v24 .. v24}, Lcom/tapjoy/TapjoyUtil;->getNodeTrimValue(Lorg/w3c/dom/NodeList;)Ljava/lang/String;

    move-result-object v22

    .line 353
    if-eqz v22, :cond_8

    const-string v24, ""

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v24

    #v24=(Boolean);
    if-nez v24, :cond_8

    .line 354
    move-object/from16 v0, v22

    move-object/from16 v1, v23

    iput-object v0, v1, Lcom/tapjoy/TapjoyVideoObject;->videoURL:Ljava/lang/String;

    .line 356
    :cond_8
    #v1=(Conflicted);v24=(Conflicted);
    const-string v24, "IconURL"

    #v24=(Reference);
    move-object/from16 v0, v24

    invoke-interface {v8, v0}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v24

    invoke-static/range {v24 .. v24}, Lcom/tapjoy/TapjoyUtil;->getNodeTrimValue(Lorg/w3c/dom/NodeList;)Ljava/lang/String;

    move-result-object v22

    .line 357
    if-eqz v22, :cond_9

    const-string v24, ""

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v24

    #v24=(Boolean);
    if-nez v24, :cond_9

    .line 358
    move-object/from16 v0, v22

    move-object/from16 v1, v23

    iput-object v0, v1, Lcom/tapjoy/TapjoyVideoObject;->iconURL:Ljava/lang/String;

    .line 360
    :cond_9
    #v1=(Conflicted);v24=(Conflicted);
    const-string v24, "TapjoyVideo"

    #v24=(Reference);
    const-string v25, "-----"

    #v25=(Reference);
    invoke-static/range {v24 .. v25}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 362
    const-string v24, "TapjoyVideo"

    new-instance v25, Ljava/lang/StringBuilder;

    #v25=(UninitRef);
    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    #v25=(Reference);
    const-string v26, "videoObject.offerID: "

    #v26=(Reference);
    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    move-object/from16 v0, v23

    iget-object v0, v0, Lcom/tapjoy/TapjoyVideoObject;->offerID:Ljava/lang/String;

    move-object/from16 v26, v0

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-static/range {v24 .. v25}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    const-string v24, "TapjoyVideo"

    new-instance v25, Ljava/lang/StringBuilder;

    #v25=(UninitRef);
    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    #v25=(Reference);
    const-string v26, "videoObject.videoAdName: "

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    move-object/from16 v0, v23

    iget-object v0, v0, Lcom/tapjoy/TapjoyVideoObject;->videoAdName:Ljava/lang/String;

    move-object/from16 v26, v0

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-static/range {v24 .. v25}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 366
    const-string v24, "TapjoyVideo"

    new-instance v25, Ljava/lang/StringBuilder;

    #v25=(UninitRef);
    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    #v25=(Reference);
    const-string v26, "videoObject.videoURL: "

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    move-object/from16 v0, v23

    iget-object v0, v0, Lcom/tapjoy/TapjoyVideoObject;->videoURL:Ljava/lang/String;

    move-object/from16 v26, v0

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-static/range {v24 .. v25}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 369
    const-string v24, "Buttons"

    move-object/from16 v0, v24

    invoke-interface {v8, v0}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v3

    .line 370
    .local v3, buttonData:Lorg/w3c/dom/NodeList;
    #v3=(Reference);
    const/16 v24, 0x0

    #v24=(Null);
    move/from16 v0, v24

    #v0=(Null);
    invoke-interface {v3, v0}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v24

    #v24=(Reference);
    invoke-interface/range {v24 .. v24}, Lorg/w3c/dom/Node;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object v12

    .line 375
    .local v12, itemNodeList:Lorg/w3c/dom/NodeList;
    #v12=(Reference);
    const/4 v13, 0x0

    .local v13, j:I
    :goto_1
    #v0=(Conflicted);v13=(Integer);v24=(Conflicted);
    invoke-interface {v12}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v24

    #v24=(Integer);
    move/from16 v0, v24

    #v0=(Integer);
    if-ge v13, v0, :cond_e

    .line 378
    invoke-interface {v12, v13}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v24

    #v24=(Reference);
    invoke-interface/range {v24 .. v24}, Lorg/w3c/dom/Node;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object v4

    .line 381
    .local v4, child:Lorg/w3c/dom/NodeList;
    #v4=(Reference);
    invoke-interface {v4}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v24

    #v24=(Integer);
    if-nez v24, :cond_a

    .line 375
    :goto_2
    #v0=(Conflicted);v24=(Conflicted);
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 389
    :cond_a
    #v0=(Integer);v24=(Integer);
    const-string v15, ""

    .line 390
    .local v15, name:Ljava/lang/String;
    #v15=(Reference);
    const-string v21, ""

    .line 392
    .local v21, url:Ljava/lang/String;
    #v21=(Reference);
    const/4 v14, 0x0

    .local v14, k:I
    :goto_3
    #v0=(Conflicted);v14=(Integer);v24=(Conflicted);
    invoke-interface {v4}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v24

    #v24=(Integer);
    move/from16 v0, v24

    #v0=(Integer);
    if-ge v14, v0, :cond_d

    .line 394
    invoke-interface {v4, v14}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v24

    #v24=(Reference);
    check-cast v24, Lorg/w3c/dom/Element;

    if-eqz v24, :cond_b

    .line 396
    invoke-interface {v4, v14}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v24

    check-cast v24, Lorg/w3c/dom/Element;

    invoke-interface/range {v24 .. v24}, Lorg/w3c/dom/Element;->getTagName()Ljava/lang/String;

    move-result-object v20

    .line 399
    .local v20, tagName:Ljava/lang/String;
    #v20=(Reference);
    const-string v24, "Name"

    move-object/from16 v0, v20

    #v0=(Reference);
    move-object/from16 v1, v24

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v24

    #v24=(Boolean);
    if-eqz v24, :cond_c

    invoke-interface {v4, v14}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v24

    #v24=(Reference);
    invoke-interface/range {v24 .. v24}, Lorg/w3c/dom/Node;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v24

    if-eqz v24, :cond_c

    .line 401
    invoke-interface {v4, v14}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v24

    invoke-interface/range {v24 .. v24}, Lorg/w3c/dom/Node;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v24

    invoke-interface/range {v24 .. v24}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v15

    .line 392
    .end local v20           #tagName:Ljava/lang/String;
    :cond_b
    :goto_4
    #v0=(Conflicted);v1=(Conflicted);v20=(Conflicted);v24=(Conflicted);
    add-int/lit8 v14, v14, 0x1

    goto :goto_3

    .line 405
    .restart local v20       #tagName:Ljava/lang/String;
    :cond_c
    #v0=(Reference);v1=(Reference);v20=(Reference);
    const-string v24, "URL"

    #v24=(Reference);
    move-object/from16 v0, v20

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v24

    #v24=(Boolean);
    if-eqz v24, :cond_b

    invoke-interface {v4, v14}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v24

    #v24=(Reference);
    invoke-interface/range {v24 .. v24}, Lorg/w3c/dom/Node;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v24

    if-eqz v24, :cond_b

    .line 407
    invoke-interface {v4, v14}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v24

    invoke-interface/range {v24 .. v24}, Lorg/w3c/dom/Node;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v24

    invoke-interface/range {v24 .. v24}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v21

    goto :goto_4

    .line 412
    .end local v20           #tagName:Ljava/lang/String;
    :cond_d
    #v0=(Integer);v1=(Conflicted);v20=(Conflicted);v24=(Integer);
    const-string v24, "TapjoyVideo"

    #v24=(Reference);
    new-instance v25, Ljava/lang/StringBuilder;

    #v25=(UninitRef);
    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    #v25=(Reference);
    const-string v26, "name: "

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    move-object/from16 v0, v25

    #v0=(Reference);
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    const-string v26, ", url: "

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    move-object/from16 v0, v25

    move-object/from16 v1, v21

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-static/range {v24 .. v25}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 414
    move-object/from16 v0, v23

    move-object/from16 v1, v21

    invoke-virtual {v0, v15, v1}, Lcom/tapjoy/TapjoyVideoObject;->addButton(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    .line 423
    .end local v3           #buttonData:Lorg/w3c/dom/NodeList;
    .end local v4           #child:Lorg/w3c/dom/NodeList;
    .end local v5           #document:Lorg/w3c/dom/Document;
    .end local v6           #documentBuilder:Ljavax/xml/parsers/DocumentBuilder;
    .end local v8           #element:Lorg/w3c/dom/Element;
    .end local v10           #i:I
    .end local v11           #is:Ljava/io/InputStream;
    .end local v12           #itemNodeList:Lorg/w3c/dom/NodeList;
    .end local v13           #j:I
    .end local v14           #k:I
    .end local v15           #name:Ljava/lang/String;
    .end local v16           #node:Lorg/w3c/dom/Node;
    .end local v17           #nodeMap:Lorg/w3c/dom/NamedNodeMap;
    .end local v18           #nodelist:Lorg/w3c/dom/NodeList;
    .end local v19           #nodelistParent:Lorg/w3c/dom/NodeList;
    .end local v21           #url:Ljava/lang/String;
    .end local v22           #value:Ljava/lang/String;
    .end local v23           #videoObject:Lcom/tapjoy/TapjoyVideoObject;
    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);
    move-exception v7

    .line 425
    .local v7, e:Ljava/lang/Exception;
    #v7=(Reference);
    const-string v24, "TapjoyVideo"

    #v24=(Reference);
    new-instance v25, Ljava/lang/StringBuilder;

    #v25=(UninitRef);
    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    #v25=(Reference);
    const-string v26, "Error parsing XML: "

    #v26=(Reference);
    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual {v7}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v26

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-static/range {v24 .. v25}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 426
    const/16 v24, 0x0

    .line 431
    .end local v7           #e:Ljava/lang/Exception;
    :goto_5
    #v7=(Conflicted);v24=(Boolean);v26=(Conflicted);
    return v24

    .line 418
    .restart local v3       #buttonData:Lorg/w3c/dom/NodeList;
    .restart local v5       #document:Lorg/w3c/dom/Document;
    .restart local v6       #documentBuilder:Ljavax/xml/parsers/DocumentBuilder;
    .restart local v8       #element:Lorg/w3c/dom/Element;
    .restart local v10       #i:I
    .restart local v11       #is:Ljava/io/InputStream;
    .restart local v12       #itemNodeList:Lorg/w3c/dom/NodeList;
    .restart local v13       #j:I
    .restart local v16       #node:Lorg/w3c/dom/Node;
    .restart local v17       #nodeMap:Lorg/w3c/dom/NamedNodeMap;
    .restart local v18       #nodelist:Lorg/w3c/dom/NodeList;
    .restart local v19       #nodelistParent:Lorg/w3c/dom/NodeList;
    .restart local v22       #value:Ljava/lang/String;
    .restart local v23       #videoObject:Lcom/tapjoy/TapjoyVideoObject;
    :cond_e
    :try_start_1
    #v0=(Integer);v3=(Reference);v5=(Reference);v6=(Reference);v7=(Uninit);v8=(Reference);v10=(Integer);v11=(Reference);v12=(Reference);v13=(Integer);v16=(Reference);v17=(Reference);v18=(Reference);v19=(Reference);v22=(Reference);v23=(Reference);v24=(Integer);v26=(Reference);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Lcom/tapjoy/TapjoyVideo;->videoQueue:Ljava/util/Vector;

    move-object/from16 v24, v0

    #v24=(Reference);
    move-object/from16 v0, v23

    iget-object v0, v0, Lcom/tapjoy/TapjoyVideoObject;->offerID:Ljava/lang/String;

    move-object/from16 v25, v0

    invoke-virtual/range {v24 .. v25}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 419
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tapjoy/TapjoyVideo;->uncachedVideos:Ljava/util/Hashtable;

    move-object/from16 v24, v0

    move-object/from16 v0, v23

    iget-object v0, v0, Lcom/tapjoy/TapjoyVideoObject;->offerID:Ljava/lang/String;

    move-object/from16 v25, v0

    move-object/from16 v0, v24

    move-object/from16 v1, v25

    #v1=(Reference);
    move-object/from16 v2, v23

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 320
    .end local v3           #buttonData:Lorg/w3c/dom/NodeList;
    .end local v8           #element:Lorg/w3c/dom/Element;
    .end local v12           #itemNodeList:Lorg/w3c/dom/NodeList;
    .end local v13           #j:I
    .end local v22           #value:Ljava/lang/String;
    :cond_f
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v8=(Conflicted);v12=(Conflicted);v13=(Conflicted);v22=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 429
    .end local v16           #node:Lorg/w3c/dom/Node;
    .end local v23           #videoObject:Lcom/tapjoy/TapjoyVideoObject;
    :cond_10
    #v0=(Integer);v16=(Conflicted);v23=(Conflicted);v24=(Integer);
    const-string v24, "TapjoyVideo"

    #v24=(Reference);
    const-string v25, "========================================"

    #v25=(Reference);
    invoke-static/range {v24 .. v25}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 431
    const/16 v24, 0x1

    #v24=(One);
    goto :goto_5
.end method

.method private printCachedVideos()V
    .locals 6

    .prologue
    .line 626
    const-string v3, "TapjoyVideo"

    #v3=(Reference);
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    #v4=(Reference);
    const-string v5, "cachedVideos size: "

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/tapjoy/TapjoyVideo;->cachedVideos:Ljava/util/Hashtable;

    invoke-virtual {v5}, Ljava/util/Hashtable;->size()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 629
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideo;->cachedVideos:Ljava/util/Hashtable;

    invoke-virtual {v3}, Ljava/util/Hashtable;->entrySet()Ljava/util/Set;

    move-result-object v0

    .line 630
    .local v0, entries:Ljava/util/Set;,"Ljava/util/Set<Ljava/util/Map$Entry<Ljava/lang/String;Lcom/tapjoy/TapjoyVideoObject;>;>;"
    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 632
    .local v2, iterator:Ljava/util/Iterator;,"Ljava/util/Iterator<Ljava/util/Map$Entry<Ljava/lang/String;Lcom/tapjoy/TapjoyVideoObject;>;>;"
    :goto_0
    #v1=(Conflicted);v2=(Reference);v5=(Conflicted);
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_0

    .line 634
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Ljava/util/Map$Entry;

    .line 635
    .local v1, item:Ljava/util/Map$Entry;,"Ljava/util/Map$Entry<Ljava/lang/String;Lcom/tapjoy/TapjoyVideoObject;>;"
    const-string v4, "TapjoyVideo"

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v5, "key: "

    #v5=(Reference);
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, ", name: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tapjoy/TapjoyVideoObject;

    iget-object v3, v3, Lcom/tapjoy/TapjoyVideoObject;->videoAdName:Ljava/lang/String;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 637
    .end local v1           #item:Ljava/util/Map$Entry;,"Ljava/util/Map$Entry<Ljava/lang/String;Lcom/tapjoy/TapjoyVideoObject;>;"
    :cond_0
    #v1=(Conflicted);v3=(Boolean);v5=(Conflicted);
    return-void
.end method

.method private setVideoIDs()V
    .locals 6

    .prologue
    .line 777
    const-string v2, ""

    .line 779
    .local v2, videoIDs:Ljava/lang/String;
    #v2=(Reference);
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideo;->cachedVideos:Ljava/util/Hashtable;

    #v3=(Reference);
    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/tapjoy/TapjoyVideo;->cachedVideos:Ljava/util/Hashtable;

    invoke-virtual {v3}, Ljava/util/Hashtable;->size()I

    move-result v3

    #v3=(Integer);
    if-lez v3, :cond_2

    .line 781
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideo;->cachedVideos:Ljava/util/Hashtable;

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v1

    .line 783
    .local v1, keys:Ljava/util/Enumeration;,"Ljava/util/Enumeration<Ljava/lang/String;>;"
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Reference);v3=(Conflicted);v4=(Conflicted);
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_1

    .line 785
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/lang/String;

    .line 786
    .local v0, key:Ljava/lang/String;
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 788
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_0

    .line 789
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ","

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 792
    .end local v0           #key:Ljava/lang/String;
    :cond_1
    #v0=(Conflicted);v3=(Boolean);v4=(Conflicted);
    const-string v3, "TapjoyVideo"

    #v3=(Reference);
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    #v4=(Reference);
    const-string v5, "cachedVideos size: "

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/tapjoy/TapjoyVideo;->cachedVideos:Ljava/util/Hashtable;

    invoke-virtual {v5}, Ljava/util/Hashtable;->size()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 795
    .end local v1           #keys:Ljava/util/Enumeration;,"Ljava/util/Enumeration<Ljava/lang/String;>;"
    :cond_2
    #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    const-string v3, "TapjoyVideo"

    #v3=(Reference);
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    #v4=(Reference);
    const-string v5, "videoIDs: ["

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "]"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 796
    invoke-static {v2}, Lcom/tapjoy/TapjoyConnectCore;->setVideoIDs(Ljava/lang/String;)V

    .line 797
    return-void
.end method

.method private validateCachedVideos()Z
    .locals 11

    .prologue
    .line 802
    const/4 v5, 0x0

    .line 803
    .local v5, success:Z
    #v5=(Null);
    const/4 v4, 0x1

    .line 806
    .local v4, proceed:Z
    #v4=(One);
    new-instance v7, Ljava/io/File;

    #v7=(UninitRef);
    iget-object v8, p0, Lcom/tapjoy/TapjoyVideo;->videoCacheDir:Ljava/lang/String;

    #v8=(Reference);
    invoke-direct {v7, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v7=(Reference);
    invoke-virtual {v7}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    .line 808
    .local v0, cachedFilesOnDisk:[Ljava/io/File;
    #v0=(Reference);
    iget-object v7, p0, Lcom/tapjoy/TapjoyVideo;->uncachedVideos:Ljava/util/Hashtable;

    if-nez v7, :cond_0

    .line 810
    const-string v7, "TapjoyVideo"

    const-string v8, "Error: uncachedVideos is null"

    invoke-static {v7, v8}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 811
    const/4 v4, 0x0

    .line 814
    :cond_0
    #v4=(Boolean);
    iget-object v7, p0, Lcom/tapjoy/TapjoyVideo;->cachedVideos:Ljava/util/Hashtable;

    if-nez v7, :cond_1

    .line 816
    const-string v7, "TapjoyVideo"

    const-string v8, "Error: cachedVideos is null"

    invoke-static {v7, v8}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 817
    const/4 v4, 0x0

    .line 820
    :cond_1
    iget-object v7, p0, Lcom/tapjoy/TapjoyVideo;->videoQueue:Ljava/util/Vector;

    if-nez v7, :cond_2

    .line 822
    const-string v7, "TapjoyVideo"

    const-string v8, "Error: videoQueue is null"

    invoke-static {v7, v8}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 823
    const/4 v4, 0x0

    .line 827
    :cond_2
    if-eqz v4, :cond_7

    if-eqz v0, :cond_7

    .line 830
    const/4 v2, 0x0

    .local v2, i:I
    :goto_0
    #v1=(Conflicted);v2=(Integer);v3=(Conflicted);v6=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    array-length v7, v0

    #v7=(Integer);
    if-ge v2, v7, :cond_6

    .line 832
    aget-object v7, v0, v2

    #v7=(Null);
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    .line 835
    .local v3, key:Ljava/lang/String;
    #v3=(Reference);
    const-string v7, "TapjoyVideo"

    #v7=(Reference);
    const-string v8, "-----"

    invoke-static {v7, v8}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 836
    const-string v7, "TapjoyVideo"

    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    #v8=(Reference);
    const-string v9, "Examining cached file["

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "]: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    aget-object v9, v0, v2

    #v9=(Null);
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " --- "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    aget-object v9, v0, v2

    #v9=(Null);
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v9

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 841
    iget-object v7, p0, Lcom/tapjoy/TapjoyVideo;->uncachedVideos:Ljava/util/Hashtable;

    invoke-virtual {v7, v3}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    #v7=(Boolean);
    if-eqz v7, :cond_5

    .line 843
    const-string v7, "TapjoyVideo"

    #v7=(Reference);
    const-string v8, "Local file found"

    invoke-static {v7, v8}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 845
    iget-object v7, p0, Lcom/tapjoy/TapjoyVideo;->uncachedVideos:Ljava/util/Hashtable;

    invoke-virtual {v7, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    #v6=(Reference);
    check-cast v6, Lcom/tapjoy/TapjoyVideoObject;

    .line 847
    .local v6, videoObject:Lcom/tapjoy/TapjoyVideoObject;
    if-nez v6, :cond_3

    .line 849
    const/4 v5, 0x0

    .line 830
    .end local v6           #videoObject:Lcom/tapjoy/TapjoyVideoObject;
    :goto_1
    #v6=(Conflicted);
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 853
    .restart local v6       #videoObject:Lcom/tapjoy/TapjoyVideoObject;
    :cond_3
    #v6=(Reference);
    new-instance v7, Lcom/tapjoy/TapjoyURLConnection;

    #v7=(UninitRef);
    invoke-direct {v7}, Lcom/tapjoy/TapjoyURLConnection;-><init>()V

    #v7=(Reference);
    iget-object v8, v6, Lcom/tapjoy/TapjoyVideoObject;->videoURL:Ljava/lang/String;

    invoke-virtual {v7, v8}, Lcom/tapjoy/TapjoyURLConnection;->getContentLength(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 855
    .local v1, contentLength:Ljava/lang/String;
    #v1=(Reference);
    const-string v7, "TapjoyVideo"

    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    #v8=(Reference);
    const-string v9, "local file size: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    aget-object v9, v0, v2

    #v9=(Null);
    invoke-virtual {v9}, Ljava/io/File;->length()J

    move-result-wide v9

    #v9=(LongLo);v10=(LongHi);
    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " vs. target: "

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 858
    if-eqz v1, :cond_4

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    int-to-long v7, v7

    #v7=(LongLo);v8=(LongHi);
    aget-object v9, v0, v2

    #v9=(Null);
    invoke-virtual {v9}, Ljava/io/File;->length()J

    move-result-wide v9

    #v9=(LongLo);
    cmp-long v7, v7, v9

    #v7=(Byte);
    if-nez v7, :cond_4

    .line 860
    aget-object v7, v0, v2

    #v7=(Null);
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    #v7=(Reference);
    iput-object v7, v6, Lcom/tapjoy/TapjoyVideoObject;->dataLocation:Ljava/lang/String;

    .line 861
    iget-object v7, p0, Lcom/tapjoy/TapjoyVideo;->cachedVideos:Ljava/util/Hashtable;

    invoke-virtual {v7, v3, v6}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 862
    iget-object v7, p0, Lcom/tapjoy/TapjoyVideo;->uncachedVideos:Ljava/util/Hashtable;

    invoke-virtual {v7, v3}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 863
    iget-object v7, p0, Lcom/tapjoy/TapjoyVideo;->videoQueue:Ljava/util/Vector;

    invoke-virtual {v7, v3}, Ljava/util/Vector;->remove(Ljava/lang/Object;)Z

    .line 865
    const-string v7, "TapjoyVideo"

    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    #v8=(Reference);
    const-string v9, "VIDEO PREVIOUSLY CACHED -- "

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ", location: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    iget-object v9, v6, Lcom/tapjoy/TapjoyVideoObject;->dataLocation:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 870
    :cond_4
    #v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    const-string v7, "TapjoyVideo"

    #v7=(Reference);
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    #v8=(Reference);
    const-string v9, "file size mismatch --- deleting video: "

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    aget-object v9, v0, v2

    #v9=(Null);
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 871
    aget-object v7, v0, v2

    #v7=(Null);
    invoke-static {v7}, Lcom/tapjoy/TapjoyUtil;->deleteFileOrDirectory(Ljava/io/File;)V

    goto/16 :goto_1

    .line 878
    .end local v1           #contentLength:Ljava/lang/String;
    .end local v6           #videoObject:Lcom/tapjoy/TapjoyVideoObject;
    :cond_5
    #v1=(Conflicted);v6=(Conflicted);v7=(Boolean);v10=(Conflicted);
    const-string v7, "TapjoyVideo"

    #v7=(Reference);
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    #v8=(Reference);
    const-string v9, "VIDEO EXPIRED? removing video from cache: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " --- "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    aget-object v9, v0, v2

    #v9=(Null);
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 879
    aget-object v7, v0, v2

    #v7=(Null);
    invoke-static {v7}, Lcom/tapjoy/TapjoyUtil;->deleteFileOrDirectory(Ljava/io/File;)V

    goto/16 :goto_1

    .line 883
    .end local v3           #key:Ljava/lang/String;
    :cond_6
    #v3=(Conflicted);v7=(Integer);v9=(Conflicted);
    const/4 v5, 0x1

    .line 886
    .end local v2           #i:I
    :cond_7
    #v2=(Conflicted);v5=(Boolean);v7=(Conflicted);
    return v5
.end method

.method public static videoNotifierComplete()V
    .locals 1

    .prologue
    .line 935
    sget-object v0, Lcom/tapjoy/TapjoyVideo;->tapjoyVideoNotifier:Lcom/tapjoy/TapjoyVideoNotifier;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 936
    sget-object v0, Lcom/tapjoy/TapjoyVideo;->tapjoyVideoNotifier:Lcom/tapjoy/TapjoyVideoNotifier;

    invoke-interface {v0}, Lcom/tapjoy/TapjoyVideoNotifier;->videoComplete()V

    .line 937
    :cond_0
    return-void
.end method

.method public static videoNotifierError(I)V
    .locals 1
    .parameter "error"

    .prologue
    .line 905
    sget-object v0, Lcom/tapjoy/TapjoyVideo;->tapjoyVideoNotifier:Lcom/tapjoy/TapjoyVideoNotifier;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 906
    sget-object v0, Lcom/tapjoy/TapjoyVideo;->tapjoyVideoNotifier:Lcom/tapjoy/TapjoyVideoNotifier;

    invoke-interface {v0, p0}, Lcom/tapjoy/TapjoyVideoNotifier;->videoError(I)V

    .line 907
    :cond_0
    return-void
.end method

.method public static videoNotifierStart()V
    .locals 1

    .prologue
    .line 925
    sget-object v0, Lcom/tapjoy/TapjoyVideo;->tapjoyVideoNotifier:Lcom/tapjoy/TapjoyVideoNotifier;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 926
    sget-object v0, Lcom/tapjoy/TapjoyVideo;->tapjoyVideoNotifier:Lcom/tapjoy/TapjoyVideoNotifier;

    invoke-interface {v0}, Lcom/tapjoy/TapjoyVideoNotifier;->videoStart()V

    .line 927
    :cond_0
    return-void
.end method


# virtual methods
.method public cacheVideos()V
    .locals 2

    .prologue
    .line 554
    new-instance v0, Ljava/lang/Thread;

    #v0=(UninitRef);
    new-instance v1, Lcom/tapjoy/TapjoyVideo$2;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/tapjoy/TapjoyVideo$2;-><init>(Lcom/tapjoy/TapjoyVideo;)V

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 621
    return-void
.end method

.method public enableVideoCache(Z)V
    .locals 0
    .parameter "enable"

    .prologue
    .line 136
    return-void
.end method

.method public getCurrentVideoData()Lcom/tapjoy/TapjoyVideoObject;
    .locals 1

    .prologue
    .line 441
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideo;->videoToPlay:Lcom/tapjoy/TapjoyVideoObject;

    #v0=(Reference);
    return-object v0
.end method

.method public init()V
    .locals 3

    .prologue
    .line 177
    const-string v0, "TapjoyVideo"

    #v0=(Reference);
    const-string v1, "initVideoAd"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    const-string v0, "disable_videos"

    invoke-static {v0}, Lcom/tapjoy/TapjoyConnectCore;->getFlagValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v0, "disable_videos"

    invoke-static {v0}, Lcom/tapjoy/TapjoyConnectCore;->getFlagValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "true"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 182
    const-string v0, "TapjoyVideo"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "disable_videos: "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "disable_videos"

    invoke-static {v2}, Lcom/tapjoy/TapjoyConnectCore;->getFlagValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ". Aborting video initializing... "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {v0}, Lcom/tapjoy/TapjoyConnectCore;->setVideoEnabled(Z)V

    .line 265
    :goto_0
    #v0=(Boolean);v2=(Conflicted);
    return-void

    .line 188
    :cond_0
    #v0=(Conflicted);v2=(Uninit);
    invoke-direct {p0}, Lcom/tapjoy/TapjoyVideo;->setVideoIDs()V

    .line 191
    new-instance v0, Ljava/lang/Thread;

    #v0=(UninitRef);
    new-instance v1, Lcom/tapjoy/TapjoyVideo$1;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/tapjoy/TapjoyVideo$1;-><init>(Lcom/tapjoy/TapjoyVideo;)V

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 264
    const/4 v0, 0x1

    #v0=(One);
    invoke-static {v0}, Lcom/tapjoy/TapjoyConnectCore;->setVideoEnabled(Z)V

    goto :goto_0
.end method

.method public initVideoAd(Lcom/tapjoy/TapjoyVideoNotifier;)V
    .locals 1
    .parameter "notifier"

    .prologue
    .line 145
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, p1, v0}, Lcom/tapjoy/TapjoyVideo;->initVideoAd(Lcom/tapjoy/TapjoyVideoNotifier;Z)V

    .line 146
    return-void
.end method

.method public initVideoAd(Lcom/tapjoy/TapjoyVideoNotifier;Z)V
    .locals 2
    .parameter "notifier"
    .parameter "skipCaching"

    .prologue
    .line 156
    sput-object p1, Lcom/tapjoy/TapjoyVideo;->tapjoyVideoNotifier:Lcom/tapjoy/TapjoyVideoNotifier;

    .line 158
    if-nez p1, :cond_0

    .line 160
    const-string v0, "TapjoyVideo"

    #v0=(Reference);
    const-string v1, "Error during initVideoAd -- TapjoyVideoNotifier is null"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 169
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    .line 168
    :cond_0
    #v0=(Uninit);v1=(Uninit);
    invoke-virtual {p0}, Lcom/tapjoy/TapjoyVideo;->cacheVideos()V

    goto :goto_0
.end method

.method public setVideoCacheCount(I)V
    .locals 0
    .parameter "count"

    .prologue
    .line 123
    iput p1, p0, Lcom/tapjoy/TapjoyVideo;->videoCacheLimit:I

    .line 124
    return-void
.end method

.method public setVideoNotifier(Lcom/tapjoy/TapjoyVideoNotifier;)V
    .locals 0
    .parameter "notifier"

    .prologue
    .line 895
    sput-object p1, Lcom/tapjoy/TapjoyVideo;->tapjoyVideoNotifier:Lcom/tapjoy/TapjoyVideoNotifier;

    .line 896
    return-void
.end method

.method public startVideo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8
    .parameter "videoID"
    .parameter "currencyName"
    .parameter "currencyAmount"
    .parameter "clickURL"
    .parameter "webviewURL"
    .parameter "videoURL"

    .prologue
    .line 451
    const/4 v0, 0x1

    .line 452
    .local v0, cachedVideo:Z
    #v0=(One);
    const-string v5, "TapjoyVideo"

    #v5=(Reference);
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    const-string v7, "Starting video activity with video: "

    #v7=(Reference);
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 455
    if-eqz p1, :cond_0

    if-eqz p4, :cond_0

    if-eqz p5, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    #v5=(Integer);
    if-eqz v5, :cond_0

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {p5}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_1

    .line 457
    :cond_0
    #v5=(Conflicted);
    const-string v5, "TapjoyVideo"

    #v5=(Reference);
    const-string v6, "aborting video playback... invalid or missing parameter"

    invoke-static {v5, v6}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 458
    const/4 v5, 0x0

    .line 545
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Boolean);
    return v5

    .line 461
    :cond_1
    #v0=(One);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Integer);
    iget-object v5, p0, Lcom/tapjoy/TapjoyVideo;->cachedVideos:Ljava/util/Hashtable;

    #v5=(Reference);
    invoke-virtual {v5, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tapjoy/TapjoyVideoObject;

    iput-object v5, p0, Lcom/tapjoy/TapjoyVideo;->videoToPlay:Lcom/tapjoy/TapjoyVideoObject;

    .line 463
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v2

    .line 466
    .local v2, state:Ljava/lang/String;
    #v2=(Reference);
    const-string v5, "mounted"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    #v5=(Boolean);
    if-nez v5, :cond_2

    .line 468
    const-string v5, "TapjoyVideo"

    #v5=(Reference);
    const-string v6, "Cannot access external storage"

    invoke-static {v5, v6}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 471
    const/4 v5, 0x1

    #v5=(One);
    invoke-static {v5}, Lcom/tapjoy/TapjoyVideo;->videoNotifierError(I)V

    .line 472
    const/4 v5, 0x0

    #v5=(Null);
    goto :goto_0

    .line 476
    :cond_2
    #v5=(Boolean);
    iget-object v5, p0, Lcom/tapjoy/TapjoyVideo;->videoToPlay:Lcom/tapjoy/TapjoyVideoObject;

    #v5=(Reference);
    if-nez v5, :cond_4

    .line 478
    const-string v5, "TapjoyVideo"

    const-string v6, "video not cached... checking uncached videos"

    invoke-static {v5, v6}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 480
    iget-object v5, p0, Lcom/tapjoy/TapjoyVideo;->uncachedVideos:Ljava/util/Hashtable;

    invoke-virtual {v5, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tapjoy/TapjoyVideoObject;

    iput-object v5, p0, Lcom/tapjoy/TapjoyVideo;->videoToPlay:Lcom/tapjoy/TapjoyVideoObject;

    .line 483
    iget-object v5, p0, Lcom/tapjoy/TapjoyVideo;->videoToPlay:Lcom/tapjoy/TapjoyVideoObject;

    if-nez v5, :cond_3

    .line 486
    if-eqz p6, :cond_6

    invoke-virtual {p6}, Ljava/lang/String;->length()I

    move-result v5

    #v5=(Integer);
    if-lez v5, :cond_6

    .line 489
    new-instance v1, Lcom/tapjoy/TapjoyVideoObject;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/tapjoy/TapjoyVideoObject;-><init>()V

    .line 490
    .local v1, newVideo:Lcom/tapjoy/TapjoyVideoObject;
    #v1=(Reference);
    iput-object p1, v1, Lcom/tapjoy/TapjoyVideoObject;->offerID:Ljava/lang/String;

    .line 491
    iput-object p2, v1, Lcom/tapjoy/TapjoyVideoObject;->currencyName:Ljava/lang/String;

    .line 492
    iput-object p3, v1, Lcom/tapjoy/TapjoyVideoObject;->currencyAmount:Ljava/lang/String;

    .line 493
    iput-object p4, v1, Lcom/tapjoy/TapjoyVideoObject;->clickURL:Ljava/lang/String;

    .line 494
    iput-object p5, v1, Lcom/tapjoy/TapjoyVideoObject;->webviewURL:Ljava/lang/String;

    .line 495
    iput-object p6, v1, Lcom/tapjoy/TapjoyVideoObject;->videoURL:Ljava/lang/String;

    .line 496
    iget-object v5, p0, Lcom/tapjoy/TapjoyVideo;->uncachedVideos:Ljava/util/Hashtable;

    #v5=(Reference);
    invoke-virtual {v5, p1, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 498
    iget-object v5, p0, Lcom/tapjoy/TapjoyVideo;->uncachedVideos:Ljava/util/Hashtable;

    invoke-virtual {v5, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tapjoy/TapjoyVideoObject;

    iput-object v5, p0, Lcom/tapjoy/TapjoyVideo;->videoToPlay:Lcom/tapjoy/TapjoyVideoObject;

    .line 508
    .end local v1           #newVideo:Lcom/tapjoy/TapjoyVideoObject;
    :cond_3
    #v1=(Conflicted);
    const/4 v0, 0x0

    .line 511
    :cond_4
    #v0=(Boolean);
    iget-object v5, p0, Lcom/tapjoy/TapjoyVideo;->videoToPlay:Lcom/tapjoy/TapjoyVideoObject;

    iput-object p2, v5, Lcom/tapjoy/TapjoyVideoObject;->currencyName:Ljava/lang/String;

    .line 512
    iget-object v5, p0, Lcom/tapjoy/TapjoyVideo;->videoToPlay:Lcom/tapjoy/TapjoyVideoObject;

    iput-object p3, v5, Lcom/tapjoy/TapjoyVideoObject;->currencyAmount:Ljava/lang/String;

    .line 513
    iget-object v5, p0, Lcom/tapjoy/TapjoyVideo;->videoToPlay:Lcom/tapjoy/TapjoyVideoObject;

    iput-object p4, v5, Lcom/tapjoy/TapjoyVideoObject;->clickURL:Ljava/lang/String;

    .line 514
    iget-object v5, p0, Lcom/tapjoy/TapjoyVideo;->videoToPlay:Lcom/tapjoy/TapjoyVideoObject;

    iput-object p5, v5, Lcom/tapjoy/TapjoyVideoObject;->webviewURL:Ljava/lang/String;

    .line 515
    iget-object v5, p0, Lcom/tapjoy/TapjoyVideo;->videoToPlay:Lcom/tapjoy/TapjoyVideoObject;

    iput-object p6, v5, Lcom/tapjoy/TapjoyVideoObject;->videoURL:Ljava/lang/String;

    .line 517
    const-string v5, "TapjoyVideo"

    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    const-string v7, "videoToPlay: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lcom/tapjoy/TapjoyVideo;->videoToPlay:Lcom/tapjoy/TapjoyVideoObject;

    iget-object v7, v7, Lcom/tapjoy/TapjoyVideoObject;->offerID:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 518
    const-string v5, "TapjoyVideo"

    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    const-string v7, "amount: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lcom/tapjoy/TapjoyVideo;->videoToPlay:Lcom/tapjoy/TapjoyVideoObject;

    iget-object v7, v7, Lcom/tapjoy/TapjoyVideoObject;->currencyAmount:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 519
    const-string v5, "TapjoyVideo"

    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    const-string v7, "currency: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lcom/tapjoy/TapjoyVideo;->videoToPlay:Lcom/tapjoy/TapjoyVideoObject;

    iget-object v7, v7, Lcom/tapjoy/TapjoyVideoObject;->currencyName:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 520
    const-string v5, "TapjoyVideo"

    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    const-string v7, "clickURL: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lcom/tapjoy/TapjoyVideo;->videoToPlay:Lcom/tapjoy/TapjoyVideoObject;

    iget-object v7, v7, Lcom/tapjoy/TapjoyVideoObject;->clickURL:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 521
    const-string v5, "TapjoyVideo"

    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    const-string v7, "location: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lcom/tapjoy/TapjoyVideo;->videoToPlay:Lcom/tapjoy/TapjoyVideoObject;

    iget-object v7, v7, Lcom/tapjoy/TapjoyVideoObject;->dataLocation:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 522
    const-string v5, "TapjoyVideo"

    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    const-string v7, "webviewURL: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lcom/tapjoy/TapjoyVideo;->videoToPlay:Lcom/tapjoy/TapjoyVideoObject;

    iget-object v7, v7, Lcom/tapjoy/TapjoyVideoObject;->webviewURL:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 523
    const-string v5, "TapjoyVideo"

    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    const-string v7, "videoURL: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lcom/tapjoy/TapjoyVideo;->videoToPlay:Lcom/tapjoy/TapjoyVideoObject;

    iget-object v7, v7, Lcom/tapjoy/TapjoyVideoObject;->videoURL:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 526
    if-eqz v0, :cond_7

    iget-object v5, p0, Lcom/tapjoy/TapjoyVideo;->videoToPlay:Lcom/tapjoy/TapjoyVideoObject;

    iget-object v5, v5, Lcom/tapjoy/TapjoyVideoObject;->dataLocation:Ljava/lang/String;

    if-eqz v5, :cond_7

    .line 528
    new-instance v3, Ljava/io/File;

    #v3=(UninitRef);
    iget-object v5, p0, Lcom/tapjoy/TapjoyVideo;->videoToPlay:Lcom/tapjoy/TapjoyVideoObject;

    iget-object v5, v5, Lcom/tapjoy/TapjoyVideoObject;->dataLocation:Ljava/lang/String;

    invoke-direct {v3, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 531
    .local v3, video:Ljava/io/File;
    #v3=(Reference);
    if-eqz v3, :cond_5

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v5

    #v5=(Boolean);
    if-nez v5, :cond_7

    .line 533
    :cond_5
    #v5=(Conflicted);
    const-string v5, "TapjoyVideo"

    #v5=(Reference);
    const-string v6, "video file does not exist."

    invoke-static {v5, v6}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 534
    const/4 v5, 0x0

    #v5=(Null);
    goto/16 :goto_0

    .line 502
    .end local v3           #video:Ljava/io/File;
    :cond_6
    #v0=(One);v1=(Uninit);v3=(Uninit);v5=(Conflicted);
    const-string v5, "TapjoyVideo"

    #v5=(Reference);
    const-string v6, "no video data and no video url - aborting playback..."

    invoke-static {v5, v6}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 503
    const/4 v5, 0x0

    #v5=(Null);
    goto/16 :goto_0

    .line 538
    :cond_7
    #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);
    new-instance v4, Landroid/content/Intent;

    #v4=(UninitRef);
    iget-object v5, p0, Lcom/tapjoy/TapjoyVideo;->context:Landroid/content/Context;

    #v5=(Reference);
    const-class v6, Lcom/tapjoy/TapjoyVideoView;

    invoke-direct {v4, v5, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 539
    .local v4, videoIntent:Landroid/content/Intent;
    #v4=(Reference);
    const/high16 v5, 0x1000

    #v5=(Integer);
    invoke-virtual {v4, v5}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 542
    const-string v5, "VIDEO_PATH"

    #v5=(Reference);
    invoke-virtual {v4, v5, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 543
    iget-object v5, p0, Lcom/tapjoy/TapjoyVideo;->context:Landroid/content/Context;

    invoke-virtual {v5, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 545
    const/4 v5, 0x1

    #v5=(One);
    goto/16 :goto_0
.end method

*/}
