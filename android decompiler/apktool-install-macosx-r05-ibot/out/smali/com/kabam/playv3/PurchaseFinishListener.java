package com.kabam.playv3; class PurchaseFinishListener {/*

.class public Lcom/kabam/playv3/PurchaseFinishListener;
.super Ljava/lang/Object;
.source "PurchaseFinishListener.java"

# interfaces
.implements Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onIabPurchaseFinished(Lcom/kabam/playv3/IabResult;Lcom/kabam/playv3/Purchase;)V
    .locals 4
    .parameter "result"
    .parameter "info"

    .prologue
    .line 13
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "onIabPurchaseFinished"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "onIabPurchaseFinished: finished, result="

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    const-string v1, "onIabPurchaseFinished"

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "onIabPurchaseFinished: finished, result.getResponse()="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {p1}, Lcom/kabam/playv3/IabResult;->getResponse()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    invoke-virtual {p1}, Lcom/kabam/playv3/IabResult;->getResponse()I

    move-result v0

    #v0=(Integer);
    const/16 v1, -0x3ed

    #v1=(Short);
    if-ne v0, v1, :cond_0

    .line 17
    invoke-static {}, Lcom/kabam/utility/UnitySender;->SendCancelBill()V

    .line 18
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "onIabPurchaseFinished"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "onIabPurchaseFinished: SendCancelBill, result="

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
    return-void
.end method

*/}
