package com.unity3d.player; class WWW {/*

.class Lcom/unity3d/player/WWW;
.super Ljava/lang/Thread;


# instance fields
.field private a:I

.field private b:I

.field private c:Ljava/lang/String;

.field private d:[B

.field private e:Ljava/util/Map;


# direct methods
.method constructor <init>(ILjava/lang/String;[BLjava/util/Map;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    #p0=(Reference);
    iput p1, p0, Lcom/unity3d/player/WWW;->b:I

    iput-object p2, p0, Lcom/unity3d/player/WWW;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/unity3d/player/WWW;->d:[B

    iput-object p4, p0, Lcom/unity3d/player/WWW;->e:Ljava/util/Map;

    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Lcom/unity3d/player/WWW;->a:I

    invoke-virtual {p0}, Lcom/unity3d/player/WWW;->start()V

    return-void
.end method

.method private static native doneCallback(I)V
.end method

.method private static native errorCallback(ILjava/lang/String;)V
.end method

.method private static native headerCallback(ILjava/lang/String;)Z
.end method

.method private static native progressCallback(IFFDI)V
.end method

.method private static native readCallback(I[BI)Z
.end method


# virtual methods
.method protected headerCallback(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n\r"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/unity3d/player/WWW;->b:I

    #v1=(Integer);
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/unity3d/player/WWW;->headerCallback(ILjava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method protected headerCallback(Ljava/util/Map;)Z
    .locals 6

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_1

    :cond_0
    #v0=(Conflicted);
    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return v0

    :cond_1
    #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    #v1=(Conflicted);v2=(Conflicted);v4=(Reference);v5=(Conflicted);
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    #v5=(Reference);
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n\r"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);
    iget v0, p0, Lcom/unity3d/player/WWW;->b:I

    #v0=(Integer);
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/unity3d/player/WWW;->headerCallback(ILjava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method protected progressCallback(IIIIJJ)V
    .locals 13

    if-lez p4, :cond_3

    move/from16 v0, p3

    #v0=(Integer);
    int-to-float v1, v0

    #v1=(Float);
    move/from16 v0, p4

    int-to-float v2, v0

    #v2=(Float);
    div-float v3, v1, v2

    #v3=(Float);
    const/high16 v4, 0x3f80

    #v4=(Integer);
    sub-int v1, p4, p3

    #v1=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    const-wide v5, 0x408f400000000000L

    #v5=(LongLo);v6=(LongHi);
    move/from16 v0, p3

    int-to-double v7, v0

    #v7=(DoubleLo);v8=(DoubleHi);
    mul-double/2addr v5, v7

    #v5=(DoubleLo);v6=(DoubleHi);
    sub-long v7, p5, p7

    #v7=(LongLo);v8=(LongHi);
    long-to-double v7, v7

    #v7=(DoubleLo);v8=(DoubleHi);
    const-wide v9, 0x3fb999999999999aL

    #v9=(LongLo);v10=(LongHi);
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(DD)D

    move-result-wide v7

    div-double/2addr v5, v7

    int-to-double v1, v1

    #v1=(DoubleLo);v2=(DoubleHi);
    div-double/2addr v1, v5

    invoke-static {v1, v2}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v5

    #v5=(Boolean);
    if-nez v5, :cond_0

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v5

    if-eqz v5, :cond_1

    :cond_0
    const-wide/16 v1, 0x0

    :cond_1
    #v1=(LongLo);v2=(LongHi);
    move-wide v11, v1

    #v11=(LongLo);v12=(LongHi);
    move v2, v4

    #v2=(Integer);
    move-wide v4, v11

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v4=(LongLo);v5=(LongHi);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    iget v1, p0, Lcom/unity3d/player/WWW;->b:I

    #v1=(Integer);
    move/from16 v6, p4

    #v6=(Integer);
    invoke-static/range {v1 .. v6}, Lcom/unity3d/player/WWW;->progressCallback(IFFDI)V

    :cond_2
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-void

    :cond_3
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
    if-lez p2, :cond_2

    const/4 v3, 0x0

    #v3=(Null);
    div-int v1, p1, p2

    #v1=(Integer);
    int-to-float v2, v1

    #v2=(Float);
    const-wide/16 v4, 0x0

    #v4=(LongLo);v5=(LongHi);
    goto :goto_0
.end method

.method protected readCallback([BI)Z
    .locals 1

    iget v0, p0, Lcom/unity3d/player/WWW;->b:I

    #v0=(Integer);
    invoke-static {v0, p1, p2}, Lcom/unity3d/player/WWW;->readCallback(I[BI)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public run()V
    .locals 13

    iget v0, p0, Lcom/unity3d/player/WWW;->a:I

    #v0=(Integer);
    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/unity3d/player/WWW;->a:I

    const/4 v1, 0x5

    #v1=(PosByte);
    if-le v0, v1, :cond_0

    iget v0, p0, Lcom/unity3d/player/WWW;->b:I

    const-string v1, "Too many redirects"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/unity3d/player/WWW;->errorCallback(ILjava/lang/String;)V

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    return-void

    :cond_0
    :try_start_0
    #v0=(Integer);v1=(PosByte);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
    new-instance v11, Ljava/net/URL;

    #v11=(UninitRef);
    iget-object v0, p0, Lcom/unity3d/player/WWW;->c:Ljava/lang/String;

    #v0=(Reference);
    invoke-direct {v11, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    #v11=(Reference);
    invoke-virtual {v11}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v9

    #v9=(Reference);
    iget-object v0, p0, Lcom/unity3d/player/WWW;->e:Ljava/util/Map;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/unity3d/player/WWW;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    #v1=(Conflicted);v2=(Reference);
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v9, v1, v0}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_0
    #v0=(Conflicted);v1=(PosByte);v2=(Uninit);v9=(Uninit);v11=(Conflicted);
    move-exception v0

    #v0=(Reference);
    iget v1, p0, Lcom/unity3d/player/WWW;->b:I

    #v1=(Integer);
    invoke-virtual {v0}, Ljava/net/MalformedURLException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/unity3d/player/WWW;->errorCallback(ILjava/lang/String;)V

    goto :goto_0

    :catch_1
    #v0=(Conflicted);v1=(PosByte);
    move-exception v0

    #v0=(Reference);
    iget v1, p0, Lcom/unity3d/player/WWW;->b:I

    #v1=(Integer);
    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/unity3d/player/WWW;->errorCallback(ILjava/lang/String;)V

    goto :goto_0

    :cond_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v9=(Reference);v11=(Reference);
    const/16 v10, 0x594

    #v10=(PosShort);
    iget-object v0, p0, Lcom/unity3d/player/WWW;->d:[B

    #v0=(Reference);
    if-eqz v0, :cond_2

    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {v9, v0}, Ljava/net/URLConnection;->setDoOutput(Z)V

    :try_start_1
    invoke-virtual {v9}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v12

    #v12=(Reference);
    const/4 v1, 0x0

    :goto_2
    #v0=(Conflicted);v1=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    iget-object v0, p0, Lcom/unity3d/player/WWW;->d:[B

    #v0=(Reference);
    array-length v0, v0

    #v0=(Integer);
    if-ge v1, v0, :cond_2

    const/16 v0, 0x594

    #v0=(PosShort);
    iget-object v2, p0, Lcom/unity3d/player/WWW;->d:[B

    #v2=(Reference);
    array-length v2, v2

    #v2=(Integer);
    sub-int/2addr v2, v1

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    #v0=(Integer);
    iget-object v2, p0, Lcom/unity3d/player/WWW;->d:[B

    #v2=(Reference);
    invoke-virtual {v12, v2, v1, v0}, Ljava/io/OutputStream;->write([BII)V

    add-int/2addr v1, v0

    iget-object v0, p0, Lcom/unity3d/player/WWW;->d:[B

    #v0=(Reference);
    array-length v2, v0

    #v2=(Integer);
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v4, 0x0

    #v4=(Null);
    const-wide/16 v5, 0x0

    #v5=(LongLo);v6=(LongHi);
    const-wide/16 v7, 0x0

    #v7=(LongLo);v8=(LongHi);
    move-object v0, p0

    invoke-virtual/range {v0 .. v8}, Lcom/unity3d/player/WWW;->progressCallback(IIIIJJ)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_2

    :catch_2
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v12=(Conflicted);
    move-exception v0

    #v0=(Reference);
    iget v1, p0, Lcom/unity3d/player/WWW;->b:I

    #v1=(Integer);
    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/unity3d/player/WWW;->errorCallback(ILjava/lang/String;)V

    goto/16 :goto_0

    :cond_2
    #v0=(Conflicted);v1=(Conflicted);
    instance-of v0, v9, Ljava/net/HttpURLConnection;

    #v0=(Boolean);
    if-eqz v0, :cond_4

    move-object v0, v9

    #v0=(Reference);
    check-cast v0, Ljava/net/HttpURLConnection;

    :try_start_2
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v2

    #v2=(Reference);
    if-eqz v2, :cond_4

    const/16 v3, 0x12d

    #v3=(PosShort);
    if-eq v1, v3, :cond_3

    const/16 v3, 0x12e

    if-ne v1, v3, :cond_4

    :cond_3
    const-string v1, "Location"

    #v1=(Reference);
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_4

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_4

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    const/4 v0, 0x0

    #v0=(Null);
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/unity3d/player/WWW;->c:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/unity3d/player/WWW;->run()V

    goto/16 :goto_0

    :catch_3
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    move-exception v0

    iget v1, p0, Lcom/unity3d/player/WWW;->b:I

    #v1=(Integer);
    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/unity3d/player/WWW;->errorCallback(ILjava/lang/String;)V

    goto/16 :goto_0

    :cond_4
    #v0=(Conflicted);v1=(Conflicted);
    invoke-virtual {v9}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {p0, v1}, Lcom/unity3d/player/WWW;->headerCallback(Ljava/util/Map;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v1, :cond_5

    const-string v2, "content-length"

    #v2=(Reference);
    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_7

    :cond_5
    #v2=(Conflicted);
    invoke-virtual {v9}, Ljava/net/URLConnection;->getContentLength()I

    move-result v2

    #v2=(Integer);
    const/4 v3, -0x1

    #v3=(Byte);
    if-eq v2, v3, :cond_7

    if-nez v0, :cond_6

    const-string v0, "content-length"

    #v0=(Reference);
    invoke-virtual {v9}, Ljava/net/URLConnection;->getContentLength()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {p0, v0, v2}, Lcom/unity3d/player/WWW;->headerCallback(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_b

    :cond_6
    #v2=(Conflicted);
    const/4 v0, 0x1

    :cond_7
    :goto_3
    #v3=(Conflicted);
    if-eqz v1, :cond_8

    const-string v2, "content-type"

    #v2=(Reference);
    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_a

    :cond_8
    #v1=(Conflicted);v2=(Conflicted);
    invoke-virtual {v9}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    if-eqz v1, :cond_a

    if-nez v0, :cond_9

    const-string v0, "content-type"

    #v0=(Reference);
    invoke-virtual {v9}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/unity3d/player/WWW;->headerCallback(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_c

    :cond_9
    const/4 v0, 0x1

    :cond_a
    :goto_4
    #v1=(Conflicted);
    if-eqz v0, :cond_d

    iget v0, p0, Lcom/unity3d/player/WWW;->b:I

    #v0=(Integer);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    iget-object v2, p0, Lcom/unity3d/player/WWW;->c:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " aborted"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/unity3d/player/WWW;->errorCallback(ILjava/lang/String;)V

    goto/16 :goto_0

    :cond_b
    #v0=(Boolean);v3=(Byte);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_3

    :cond_c
    #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_4

    :cond_d
    #v0=(Boolean);v1=(Conflicted);
    invoke-virtual {v9}, Ljava/net/URLConnection;->getContentLength()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_f

    invoke-virtual {v9}, Ljava/net/URLConnection;->getContentLength()I

    move-result v4

    :goto_5
    #v4=(Integer);
    invoke-virtual {v11}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "file"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_e

    invoke-virtual {v11}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "jar"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_13

    :cond_e
    if-nez v4, :cond_10

    const v0, 0x8000

    :goto_6
    #v0=(Integer);
    const/4 v3, 0x0

    :try_start_3
    #v3=(Null);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    #v7=(LongLo);v8=(LongHi);
    new-array v10, v0, [B

    #v10=(Reference);
    invoke-virtual {v9}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v9

    const/4 v0, 0x0

    :goto_7
    #v3=(Integer);
    const/4 v1, -0x1

    #v1=(Byte);
    if-eq v0, v1, :cond_12

    invoke-virtual {p0, v10, v0}, Lcom/unity3d/player/WWW;->readCallback([BI)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_11

    iget v0, p0, Lcom/unity3d/player/WWW;->b:I

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    iget-object v2, p0, Lcom/unity3d/player/WWW;->c:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " aborted"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/unity3d/player/WWW;->errorCallback(ILjava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    goto/16 :goto_0

    :catch_4
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Conflicted);
    move-exception v0

    #v0=(Reference);
    iget v1, p0, Lcom/unity3d/player/WWW;->b:I

    #v1=(Integer);
    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/unity3d/player/WWW;->errorCallback(ILjava/lang/String;)V

    goto/16 :goto_0

    :cond_f
    #v0=(Integer);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v10=(PosShort);
    const/4 v4, 0x0

    #v4=(Null);
    goto :goto_5

    :cond_10
    #v0=(Boolean);v1=(Reference);v4=(Integer);
    const v0, 0x8000

    #v0=(Char);
    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    #v0=(Integer);
    goto :goto_6

    :cond_11
    #v1=(Boolean);v3=(Integer);v7=(LongLo);v8=(LongHi);v10=(Reference);
    add-int/2addr v3, v0

    const/4 v1, 0x0

    #v1=(Null);
    const/4 v2, 0x0

    :try_start_4
    #v2=(Null);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    #v5=(LongLo);v6=(LongHi);
    move-object v0, p0

    #v0=(Reference);
    invoke-virtual/range {v0 .. v8}, Lcom/unity3d/player/WWW;->progressCallback(IIIIJJ)V

    invoke-virtual {v9, v10}, Ljava/io/InputStream;->read([B)I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    move-result v0

    #v0=(Integer);
    goto :goto_7

    :cond_12
    #v1=(Byte);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    const/4 v1, 0x0

    #v1=(Null);
    const/4 v2, 0x0

    #v2=(Null);
    const-wide/16 v5, 0x0

    #v5=(LongLo);v6=(LongHi);
    const-wide/16 v7, 0x0

    move-object v0, p0

    #v0=(Reference);
    move v4, v3

    invoke-virtual/range {v0 .. v8}, Lcom/unity3d/player/WWW;->progressCallback(IIIIJJ)V

    iget v0, p0, Lcom/unity3d/player/WWW;->b:I

    #v0=(Integer);
    invoke-static {v0}, Lcom/unity3d/player/WWW;->doneCallback(I)V

    goto/16 :goto_0

    :cond_13
    #v0=(Boolean);v1=(Reference);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(PosShort);
    move v0, v10

    #v0=(PosShort);
    goto :goto_6
.end method

*/}
