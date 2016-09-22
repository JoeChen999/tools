package com.tapjoy; class TapjoyVideoView$4 {/*

.class Lcom/tapjoy/TapjoyVideoView$4;
.super Ljava/lang/Object;
.source "TapjoyVideoView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tapjoy/TapjoyVideoView;->onCompletion(Landroid/media/MediaPlayer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tapjoy/TapjoyVideoView;


# direct methods
.method constructor <init>(Lcom/tapjoy/TapjoyVideoView;)V
    .locals 0
    .parameter

    .prologue
    .line 484
    iput-object p1, p0, Lcom/tapjoy/TapjoyVideoView$4;->this$0:Lcom/tapjoy/TapjoyVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 488
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView$4;->this$0:Lcom/tapjoy/TapjoyVideoView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/tapjoy/TapjoyVideoView;->access$300(Lcom/tapjoy/TapjoyVideoView;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 489
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getInstance()Lcom/tapjoy/TapjoyConnectCore;

    move-result-object v0

    #v0=(Reference);
    invoke-static {}, Lcom/tapjoy/TapjoyVideoView;->access$200()Lcom/tapjoy/TapjoyVideoObject;

    move-result-object v1

    #v1=(Reference);
    iget-object v1, v1, Lcom/tapjoy/TapjoyVideoObject;->offerID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/tapjoy/TapjoyConnectCore;->actionComplete(Ljava/lang/String;)V

    .line 490
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void
.end method

*/}
