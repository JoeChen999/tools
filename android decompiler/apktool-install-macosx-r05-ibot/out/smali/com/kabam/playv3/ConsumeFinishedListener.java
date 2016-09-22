package com.kabam.playv3; class ConsumeFinishedListener {/*

.class public Lcom/kabam/playv3/ConsumeFinishedListener;
.super Ljava/lang/Object;
.source "ConsumeFinishedListener.java"

# interfaces
.implements Lcom/kabam/playv3/IabHelper$OnConsumeFinishedListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onConsumeFinished(Lcom/kabam/playv3/Purchase;Lcom/kabam/playv3/IabResult;)V
    .locals 3
    .parameter "purchase"
    .parameter "result"

    .prologue
    .line 12
    invoke-virtual {p2}, Lcom/kabam/playv3/IabResult;->isFailure()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 14
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "onConsumeFinished"

    #v1=(Reference);
    const-string v2, "onConsumeFinished failed"

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    :goto_0
    return-void

    .line 17
    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "onConsumeFinished"

    #v1=(Reference);
    const-string v2, "onConsumeFinished finished."

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

*/}
