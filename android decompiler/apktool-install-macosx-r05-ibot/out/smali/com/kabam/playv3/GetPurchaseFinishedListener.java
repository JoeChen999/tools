package com.kabam.playv3; class GetPurchaseFinishedListener {/*

.class public Lcom/kabam/playv3/GetPurchaseFinishedListener;
.super Ljava/lang/Object;
.source "GetPurchaseFinishedListener.java"

# interfaces
.implements Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;


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
.method public onQueryInventoryFinished(Lcom/kabam/playv3/IabResult;Lcom/kabam/playv3/Inventory;)V
    .locals 3
    .parameter "result"
    .parameter "inv"

    .prologue
    .line 12
    invoke-virtual {p1}, Lcom/kabam/playv3/IabResult;->isFailure()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 14
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "onQueryInventoryFinished"

    #v1=(Reference);
    const-string v2, "fails"

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    invoke-virtual {p2}, Lcom/kabam/playv3/Inventory;->LogPurchaseMap()V

    .line 17
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "onQueryInventoryFinished"

    #v1=(Reference);
    const-string v2, "onQueryInventoryFinished finished."

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    return-void
.end method

*/}
