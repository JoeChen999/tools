package com.tapjoy; class TapjoyConnectCore$PPAThread {/*

.class public Lcom/tapjoy/TapjoyConnectCore$PPAThread;
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
    name = "PPAThread"
.end annotation


# instance fields
.field private params:Ljava/lang/String;

.field final synthetic this$0:Lcom/tapjoy/TapjoyConnectCore;


# direct methods
.method public constructor <init>(Lcom/tapjoy/TapjoyConnectCore;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter "urlParams"

    .prologue
    .line 1432
    iput-object p1, p0, Lcom/tapjoy/TapjoyConnectCore$PPAThread;->this$0:Lcom/tapjoy/TapjoyConnectCore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1433
    #p0=(Reference);
    iput-object p2, p0, Lcom/tapjoy/TapjoyConnectCore$PPAThread;->params:Ljava/lang/String;

    .line 1434
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 1439
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->access$400()Lcom/tapjoy/TapjoyURLConnection;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "https://ws.tapjoyads.com/connect?"

    #v2=(Reference);
    iget-object v3, p0, Lcom/tapjoy/TapjoyConnectCore$PPAThread;->params:Ljava/lang/String;

    #v3=(Reference);
    invoke-virtual {v1, v2, v3}, Lcom/tapjoy/TapjoyURLConnection;->connectToURL(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1442
    .local v0, result:Ljava/lang/String;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 1443
    iget-object v1, p0, Lcom/tapjoy/TapjoyConnectCore$PPAThread;->this$0:Lcom/tapjoy/TapjoyConnectCore;

    invoke-static {v1, v0}, Lcom/tapjoy/TapjoyConnectCore;->access$900(Lcom/tapjoy/TapjoyConnectCore;Ljava/lang/String;)Z

    .line 1444
    :cond_0
    return-void
.end method

*/}
