package com.kabam.playv3; class SetupFinishedListener {/*

.class public Lcom/kabam/playv3/SetupFinishedListener;
.super Ljava/lang/Object;
.source "SetupFinishedListener.java"

# interfaces
.implements Lcom/kabam/playv3/IabHelper$OnIabSetupFinishedListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onIabSetupFinished(Lcom/kabam/playv3/IabResult;)V
    .locals 3
    .parameter "result"

    .prologue
    .line 13
    invoke-virtual {p1}, Lcom/kabam/playv3/IabResult;->isSuccess()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 15
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideGooglePlayV3()Lcom/kabam/billing/GooglePlayV3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/billing/GooglePlayV3;->SetSupportV3()V

    .line 16
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    const-string v1, "onIabSetupFinished"

    #v1=(Reference);
    const-string v2, "onIabSetupFinished: finished. Success"

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "onIabSetupFinished"

    #v1=(Reference);
    const-string v2, "onIabSetupFinished: finished."

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    return-void
.end method

*/}
