package com.tapjoy; class TapjoyConnectCore$ConnectThread {/*

.class public Lcom/tapjoy/TapjoyConnectCore$ConnectThread;
.super Ljava/lang/Object;
.source "TapjoyConnectCore.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tapjoy/TapjoyConnectCore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ConnectThread"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tapjoy/TapjoyConnectCore;


# direct methods
.method public constructor <init>(Lcom/tapjoy/TapjoyConnectCore;)V
    .locals 0
    .parameter

    .prologue
    .line 1365
    iput-object p1, p0, Lcom/tapjoy/TapjoyConnectCore$ConnectThread;->this$0:Lcom/tapjoy/TapjoyConnectCore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .prologue
    const/16 v10, 0xc8

    .line 1369
    #v10=(PosShort);
    const-string v6, "TapjoyConnect"

    #v6=(Reference);
    const-string v7, "starting connect call..."

    #v7=(Reference);
    invoke-static {v6, v7}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 1371
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getURLParams()Ljava/lang/String;

    move-result-object v0

    .line 1374
    .local v0, connectURLParams:Ljava/lang/String;
    #v0=(Reference);
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->access$400()Lcom/tapjoy/TapjoyURLConnection;

    move-result-object v6

    const-string v7, "https://ws.tapjoyads.com/connect?"

    invoke-virtual {v6, v7, v0}, Lcom/tapjoy/TapjoyURLConnection;->getResponseFromURL(Ljava/lang/String;Ljava/lang/String;)Lcom/tapjoy/TapjoyHttpURLResponse;

    move-result-object v1

    .line 1377
    .local v1, httpResponse:Lcom/tapjoy/TapjoyHttpURLResponse;
    #v1=(Reference);
    if-eqz v1, :cond_3

    iget v6, v1, Lcom/tapjoy/TapjoyHttpURLResponse;->statusCode:I

    #v6=(Integer);
    if-ne v6, v10, :cond_3

    .line 1379
    iget-object v6, v1, Lcom/tapjoy/TapjoyHttpURLResponse;->response:Ljava/lang/String;

    #v6=(Reference);
    invoke-static {v6}, Lcom/tapjoy/TapjoyConnectCore;->access$500(Ljava/lang/String;)Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_2

    .line 1381
    const-string v6, "TapjoyConnect"

    #v6=(Reference);
    const-string v7, "Successfully connected to tapjoy site."

    invoke-static {v6, v7}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 1383
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->access$700()Lcom/tapjoy/TapjoyConnectNotifier;

    move-result-object v6

    if-eqz v6, :cond_0

    .line 1384
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->access$700()Lcom/tapjoy/TapjoyConnectNotifier;

    move-result-object v6

    invoke-interface {v6}, Lcom/tapjoy/TapjoyConnectNotifier;->connectSuccess()V

    .line 1394
    :cond_0
    :goto_0
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->access$800()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    #v6=(Integer);
    if-lez v6, :cond_1

    .line 1396
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getGenericURLParams()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "&"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "package_names"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->access$800()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "&"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1397
    .local v2, params:Ljava/lang/String;
    #v2=(Reference);
    const-string v5, ""

    .line 1400
    .local v5, verifier:Ljava/lang/String;
    #v5=(Reference);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    #v6=(LongLo);v7=(LongHi);
    const-wide/16 v8, 0x3e8

    #v8=(LongLo);v9=(LongHi);
    div-long v3, v6, v8

    .line 1401
    .local v3, time:J
    #v3=(LongLo);v4=(LongHi);
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->access$800()Ljava/lang/String;

    move-result-object v6

    #v6=(Reference);
    invoke-static {v3, v4, v6}, Lcom/tapjoy/TapjoyConnectCore;->getPackageNamesVerifier(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1403
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "timestamp="

    #v7=(Reference);
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "&"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1404
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "verifier="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1406
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->access$400()Lcom/tapjoy/TapjoyURLConnection;

    move-result-object v6

    const-string v7, "https://ws.tapjoyads.com/apps_installed?"

    invoke-virtual {v6, v7, v2}, Lcom/tapjoy/TapjoyURLConnection;->getResponseFromURL(Ljava/lang/String;Ljava/lang/String;)Lcom/tapjoy/TapjoyHttpURLResponse;

    move-result-object v1

    .line 1409
    if-eqz v1, :cond_1

    iget v6, v1, Lcom/tapjoy/TapjoyHttpURLResponse;->statusCode:I

    #v6=(Integer);
    if-ne v6, v10, :cond_1

    .line 1410
    const-string v6, "TapjoyConnect"

    #v6=(Reference);
    const-string v7, "Successfully pinged sdkless api."

    invoke-static {v6, v7}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 1419
    .end local v2           #params:Ljava/lang/String;
    .end local v3           #time:J
    .end local v5           #verifier:Ljava/lang/String;
    :cond_1
    :goto_1
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    return-void

    .line 1389
    :cond_2
    #v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Boolean);v8=(Uninit);v9=(Uninit);
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->access$700()Lcom/tapjoy/TapjoyConnectNotifier;

    move-result-object v6

    #v6=(Reference);
    if-eqz v6, :cond_0

    .line 1390
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->access$700()Lcom/tapjoy/TapjoyConnectNotifier;

    move-result-object v6

    invoke-interface {v6}, Lcom/tapjoy/TapjoyConnectNotifier;->connectFail()V

    goto/16 :goto_0

    .line 1416
    :cond_3
    #v6=(Conflicted);
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->access$700()Lcom/tapjoy/TapjoyConnectNotifier;

    move-result-object v6

    #v6=(Reference);
    if-eqz v6, :cond_1

    .line 1417
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->access$700()Lcom/tapjoy/TapjoyConnectNotifier;

    move-result-object v6

    invoke-interface {v6}, Lcom/tapjoy/TapjoyConnectNotifier;->connectFail()V

    goto :goto_1
.end method

*/}
