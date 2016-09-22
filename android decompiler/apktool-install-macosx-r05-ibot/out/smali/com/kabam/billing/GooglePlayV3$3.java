package com.kabam.billing; class GooglePlayV3$3 {/*

.class Lcom/kabam/billing/GooglePlayV3$3;
.super Ljava/lang/Object;
.source "GooglePlayV3.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kabam/billing/GooglePlayV3;->GetPurchase()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kabam/billing/GooglePlayV3;


# direct methods
.method constructor <init>(Lcom/kabam/billing/GooglePlayV3;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/kabam/billing/GooglePlayV3$3;->this$0:Lcom/kabam/billing/GooglePlayV3;

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 73
    iget-object v0, p0, Lcom/kabam/billing/GooglePlayV3$3;->this$0:Lcom/kabam/billing/GooglePlayV3;

    #v0=(Reference);
    iget-object v0, v0, Lcom/kabam/billing/GooglePlayV3;->mHelper:Lcom/kabam/playv3/IabHelper;

    if-eqz v0, :cond_0

    .line 74
    iget-object v0, p0, Lcom/kabam/billing/GooglePlayV3$3;->this$0:Lcom/kabam/billing/GooglePlayV3;

    iget-object v0, v0, Lcom/kabam/billing/GooglePlayV3;->mHelper:Lcom/kabam/playv3/IabHelper;

    const/4 v1, 0x0

    #v1=(Null);
    new-instance v2, Lcom/kabam/playv3/GetPurchaseFinishedListener;

    #v2=(UninitRef);
    invoke-direct {v2}, Lcom/kabam/playv3/GetPurchaseFinishedListener;-><init>()V

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Lcom/kabam/playv3/IabHelper;->queryInventoryAsync(ZLcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;)V

    .line 76
    :cond_0
    #v1=(Conflicted);v2=(Conflicted);
    return-void
.end method

*/}
