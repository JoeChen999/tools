package com.google.android.apps.analytics; class NetworkDispatcher$DispatcherThread$AsyncDispatchTask {/*

.class Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AsyncDispatchTask"
.end annotation


# instance fields
.field private final hits:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Lcom/google/android/apps/analytics/Hit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;[Lcom/google/android/apps/analytics/Hit;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->this$0:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    new-instance v0, Ljava/util/LinkedList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->hits:Ljava/util/LinkedList;

    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->hits:Ljava/util/LinkedList;

    invoke-static {v0, p2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-void
.end method

.method private dispatchSomePendingHits(Z)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/apache/http/ParseException;,
            Lorg/apache/http/HttpException;
        }
    .end annotation

    const/4 v2, 0x0

    #v2=(Null);
    invoke-static {}, Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;->getInstance()Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;->getDebug()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    const-string v0, "GoogleAnalyticsTracker"

    #v0=(Reference);
    const-string v1, "dispatching hits in dry run mode"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    move v1, v2

    :goto_0
    #v1=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->hits:Ljava/util/LinkedList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    #v0=(Integer);
    if-ge v1, v0, :cond_a

    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->this$0:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    #v0=(Reference);
    invoke-static {v0}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->access$1000(Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;)I

    move-result v0

    #v0=(Integer);
    if-ge v1, v0, :cond_a

    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->hits:Ljava/util/LinkedList;

    #v0=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/apps/analytics/Hit;

    iget-object v0, v0, Lcom/google/android/apps/analytics/Hit;->hitString:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    #v3=(LongLo);v4=(LongHi);
    invoke-static {v0, v3, v4}, Lcom/google/android/apps/analytics/Utils;->addQueueTimeParameter(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    const/16 v0, 0x3f

    #v0=(PosByte);
    invoke-virtual {v4, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    #v3=(Integer);
    if-gez v3, :cond_2

    const-string v0, ""

    #v0=(Reference);
    move-object v3, v4

    :goto_1
    #v3=(Reference);
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    #v5=(Integer);
    const/16 v6, 0x7f4

    #v6=(PosShort);
    if-ge v5, v6, :cond_5

    new-instance v3, Lorg/apache/http/message/BasicHttpEntityEnclosingRequest;

    #v3=(UninitRef);
    const-string v5, "GET"

    #v5=(Reference);
    invoke-direct {v3, v5, v4}, Lorg/apache/http/message/BasicHttpEntityEnclosingRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    #v3=(Reference);v6=(Conflicted);
    iget-object v4, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->this$0:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    invoke-static {v4}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->access$700(Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;)Lcom/google/android/apps/analytics/NetworkDispatcher;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/apps/analytics/NetworkDispatcher;->access$200(Lcom/google/android/apps/analytics/NetworkDispatcher;)Lorg/apache/http/HttpHost;

    move-result-object v4

    invoke-virtual {v4}, Lorg/apache/http/HttpHost;->getHostName()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->this$0:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    invoke-static {v5}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->access$700(Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;)Lcom/google/android/apps/analytics/NetworkDispatcher;

    move-result-object v5

    invoke-static {v5}, Lcom/google/android/apps/analytics/NetworkDispatcher;->access$200(Lcom/google/android/apps/analytics/NetworkDispatcher;)Lorg/apache/http/HttpHost;

    move-result-object v5

    invoke-virtual {v5}, Lorg/apache/http/HttpHost;->getPort()I

    move-result v5

    #v5=(Integer);
    const/16 v6, 0x50

    #v6=(PosByte);
    if-eq v5, v6, :cond_1

    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ":"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->this$0:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    invoke-static {v5}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->access$700(Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;)Lcom/google/android/apps/analytics/NetworkDispatcher;

    move-result-object v5

    invoke-static {v5}, Lcom/google/android/apps/analytics/NetworkDispatcher;->access$200(Lcom/google/android/apps/analytics/NetworkDispatcher;)Lorg/apache/http/HttpHost;

    move-result-object v5

    invoke-virtual {v5}, Lorg/apache/http/HttpHost;->getPort()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :cond_1
    const-string v5, "Host"

    #v5=(Reference);
    invoke-interface {v3, v5, v4}, Lorg/apache/http/HttpEntityEnclosingRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "User-Agent"

    iget-object v5, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->this$0:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    invoke-static {v5}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->access$1100(Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Lorg/apache/http/HttpEntityEnclosingRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;->getInstance()Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;->getDebug()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_7

    new-instance v5, Ljava/lang/StringBuffer;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    #v5=(Reference);
    invoke-interface {v3}, Lorg/apache/http/HttpEntityEnclosingRequest;->getAllHeaders()[Lorg/apache/http/Header;

    move-result-object v6

    #v6=(Reference);
    array-length v7, v6

    #v7=(Integer);
    move v4, v2

    :goto_3
    #v4=(Integer);
    if-ge v4, v7, :cond_6

    aget-object v8, v6, v4

    #v8=(Null);
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    #v8=(Reference);
    invoke-virtual {v5, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v8

    const-string v9, "\n"

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_2
    #v0=(PosByte);v3=(Integer);v4=(Reference);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    if-lez v3, :cond_3

    invoke-virtual {v4, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :goto_4
    #v0=(Reference);
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    #v5=(Integer);
    add-int/lit8 v5, v5, -0x2

    if-ge v3, v5, :cond_4

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v4, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    move-object v10, v3

    #v10=(Reference);
    move-object v3, v0

    move-object v0, v10

    goto/16 :goto_1

    :cond_3
    #v0=(PosByte);v3=(Integer);v5=(Conflicted);v10=(Conflicted);
    const-string v0, ""

    #v0=(Reference);
    goto :goto_4

    :cond_4
    #v5=(Integer);
    const-string v3, ""

    #v3=(Reference);
    move-object v10, v3

    #v10=(Reference);
    move-object v3, v0

    move-object v0, v10

    goto/16 :goto_1

    :cond_5
    #v6=(PosShort);v10=(Conflicted);
    new-instance v4, Lorg/apache/http/message/BasicHttpEntityEnclosingRequest;

    #v4=(UninitRef);
    const-string v5, "POST"

    #v5=(Reference);
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    const-string v7, "/p"

    #v7=(Reference);
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v5, v3}, Lorg/apache/http/message/BasicHttpEntityEnclosingRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    #v4=(Reference);
    const-string v3, "Content-Length"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-interface {v4, v3, v5}, Lorg/apache/http/HttpEntityEnclosingRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "Content-Type"

    const-string v5, "text/plain"

    invoke-interface {v4, v3, v5}, Lorg/apache/http/HttpEntityEnclosingRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lorg/apache/http/entity/StringEntity;

    #v3=(UninitRef);
    invoke-direct {v3, v0}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    invoke-interface {v4, v3}, Lorg/apache/http/HttpEntityEnclosingRequest;->setEntity(Lorg/apache/http/HttpEntity;)V

    move-object v3, v4

    goto/16 :goto_2

    :cond_6
    #v4=(Integer);v7=(Integer);
    invoke-interface {v3}, Lorg/apache/http/HttpEntityEnclosingRequest;->getRequestLine()Lorg/apache/http/RequestLine;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v4

    const-string v6, "\n"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v4, "GoogleAnalyticsTracker"

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    #v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    const/16 v4, 0x2000

    #v4=(PosShort);
    if-le v0, v4, :cond_8

    const-string v0, "GoogleAnalyticsTracker"

    #v0=(Reference);
    const-string v3, "Hit too long (> 8192 bytes)--not sent"

    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->this$0:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    invoke-static {v0}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->access$1200(Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;)Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$RequesterCallbacks;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$RequesterCallbacks;->requestSent()V

    :goto_5
    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto/16 :goto_0

    :cond_8
    if-eqz p1, :cond_9

    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->this$0:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    #v0=(Reference);
    invoke-static {v0}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->access$1200(Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;)Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$RequesterCallbacks;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$RequesterCallbacks;->requestSent()V

    goto :goto_5

    :cond_9
    #v0=(Integer);
    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->this$0:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    #v0=(Reference);
    invoke-static {v0}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->access$800(Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;)Lcom/google/android/apps/analytics/PipelinedRequester;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/google/android/apps/analytics/PipelinedRequester;->addRequest(Lorg/apache/http/HttpEntityEnclosingRequest;)V

    goto :goto_5

    :cond_a
    #v0=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    if-nez p1, :cond_b

    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->this$0:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    #v0=(Reference);
    invoke-static {v0}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->access$800(Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;)Lcom/google/android/apps/analytics/PipelinedRequester;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/analytics/PipelinedRequester;->sendRequests()V

    :cond_b
    #v0=(Conflicted);
    return-void
.end method


# virtual methods
.method public removeNextHit()Lcom/google/android/apps/analytics/Hit;
    .locals 1

    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->hits:Ljava/util/LinkedList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/apps/analytics/Hit;

    return-object v0
.end method

.method public run()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->this$0:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    #v0=(Reference);
    invoke-static {v0, p0}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->access$402(Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;)Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;

    const/4 v0, 0x0

    #v0=(Null);
    move v2, v0

    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    const/4 v0, 0x5

    #v0=(PosByte);
    if-ge v2, v0, :cond_3

    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->hits:Ljava/util/LinkedList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_3

    const-wide/16 v0, 0x0

    :try_start_0
    #v0=(LongLo);v1=(LongHi);
    iget-object v3, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->this$0:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    #v3=(Reference);
    invoke-static {v3}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->access$500(Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;)I

    move-result v3

    #v3=(Integer);
    const/16 v4, 0x1f4

    #v4=(PosShort);
    if-eq v3, v4, :cond_0

    iget-object v3, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->this$0:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    #v3=(Reference);
    invoke-static {v3}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->access$500(Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;)I

    move-result v3

    #v3=(Integer);
    const/16 v4, 0x1f7

    if-ne v3, v4, :cond_2

    :cond_0
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    #v0=(DoubleLo);v1=(DoubleHi);
    iget-object v3, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->this$0:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    #v3=(Reference);
    invoke-static {v3}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->access$600(Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;)J

    move-result-wide v3

    #v3=(LongLo);v4=(LongHi);
    long-to-double v3, v3

    #v3=(DoubleLo);v4=(DoubleHi);
    mul-double/2addr v0, v3

    double-to-long v0, v0

    #v0=(LongLo);v1=(LongHi);
    iget-object v3, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->this$0:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    #v3=(Reference);
    invoke-static {v3}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->access$600(Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;)J

    move-result-wide v3

    #v3=(LongLo);v4=(LongHi);
    const-wide/16 v5, 0x100

    #v5=(LongLo);v6=(LongHi);
    cmp-long v3, v3, v5

    #v3=(Byte);
    if-gez v3, :cond_1

    iget-object v3, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->this$0:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    #v3=(Reference);
    const-wide/16 v4, 0x2

    #v4=(LongLo);v5=(LongHi);
    invoke-static {v3, v4, v5}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->access$630(Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;J)J

    :cond_1
    :goto_1
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    const-wide/16 v3, 0x3e8

    #v3=(LongLo);v4=(LongHi);
    mul-long/2addr v0, v3

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->this$0:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    #v0=(Reference);
    invoke-static {v0}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->access$700(Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;)Lcom/google/android/apps/analytics/NetworkDispatcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/analytics/NetworkDispatcher;->isDryRun()Z

    move-result v0

    #v0=(Boolean);
    invoke-direct {p0, v0}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->dispatchSomePendingHits(Z)V

    add-int/lit8 v0, v2, 0x1

    #v0=(Integer);
    move v2, v0

    goto :goto_0

    :cond_2
    #v0=(LongLo);v3=(Integer);v4=(PosShort);
    iget-object v3, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->this$0:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    #v3=(Reference);
    const-wide/16 v4, 0x2

    #v4=(LongLo);v5=(LongHi);
    invoke-static {v3, v4, v5}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->access$602(Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;J)J
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/apache/http/HttpException; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_1

    :catch_0
    #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    move-exception v0

    #v0=(Reference);
    const-string v1, "GoogleAnalyticsTracker"

    #v1=(Reference);
    const-string v2, "Couldn\'t sleep."

    #v2=(Reference);
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_3
    :goto_2
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->this$0:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    #v0=(Reference);
    invoke-static {v0}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->access$800(Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;)Lcom/google/android/apps/analytics/PipelinedRequester;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/analytics/PipelinedRequester;->finishedCurrentRequests()V

    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->this$0:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    invoke-static {v0}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->access$900(Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;)Lcom/google/android/apps/analytics/Dispatcher$Callbacks;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/apps/analytics/Dispatcher$Callbacks;->dispatchFinished()V

    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;->this$0:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    const/4 v1, 0x0

    #v1=(Null);
    invoke-static {v0, v1}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->access$402(Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;)Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread$AsyncDispatchTask;

    return-void

    :catch_1
    #v0=(Conflicted);v1=(LongHi);v2=(Integer);
    move-exception v0

    #v0=(Reference);
    const-string v1, "GoogleAnalyticsTracker"

    #v1=(Reference);
    const-string v2, "Problem with socket or streams."

    #v2=(Reference);
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2

    :catch_2
    #v0=(Conflicted);v1=(LongHi);v2=(Integer);
    move-exception v0

    #v0=(Reference);
    const-string v1, "GoogleAnalyticsTracker"

    #v1=(Reference);
    const-string v2, "Problem with http streams."

    #v2=(Reference);
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2
.end method

*/}
