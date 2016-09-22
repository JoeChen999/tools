package com.kabam.billing; class GooglePlayV3$1 {/*

.class Lcom/kabam/billing/GooglePlayV3$1;
.super Ljava/lang/Object;
.source "GooglePlayV3.java"

# interfaces
.implements Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kabam/billing/GooglePlayV3;
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
    iput-object p1, p0, Lcom/kabam/billing/GooglePlayV3$1;->this$0:Lcom/kabam/billing/GooglePlayV3;

    .line 262
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onQueryInventoryFinished(Lcom/kabam/playv3/IabResult;Lcom/kabam/playv3/Inventory;)V
    .locals 4
    .parameter "result"
    .parameter "inventory"

    .prologue
    .line 264
    iget-object v1, p0, Lcom/kabam/billing/GooglePlayV3$1;->this$0:Lcom/kabam/billing/GooglePlayV3;

    #v1=(Reference);
    invoke-static {v1}, Lcom/kabam/billing/GooglePlayV3;->access$0(Lcom/kabam/billing/GooglePlayV3;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Query inventory finished."

    #v2=(Reference);
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 265
    invoke-virtual {p1}, Lcom/kabam/playv3/IabResult;->isFailure()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 266
    iget-object v1, p0, Lcom/kabam/billing/GooglePlayV3$1;->this$0:Lcom/kabam/billing/GooglePlayV3;

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "Failed to query inventory: "

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kabam/billing/GooglePlayV3;->complain(Ljava/lang/String;)V

    .line 267
    const-string v1, "v2"

    invoke-static {v1}, Lcom/kabam/utility/UnitySender;->setValideProducts(Ljava/lang/String;)V

    .line 278
    :goto_0
    #v0=(Conflicted);v3=(Conflicted);
    return-void

    .line 272
    :cond_0
    #v0=(Uninit);v1=(Boolean);v3=(Uninit);
    invoke-virtual {p2}, Lcom/kabam/playv3/Inventory;->getAllSkusDetails()Ljava/util/List;

    move-result-object v0

    .line 273
    .local v0, responseList:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    #v0=(Reference);
    iget-object v1, p0, Lcom/kabam/billing/GooglePlayV3$1;->this$0:Lcom/kabam/billing/GooglePlayV3;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/billing/GooglePlayV3;->sendValideProductdata(Ljava/util/List;)V

    .line 277
    iget-object v1, p0, Lcom/kabam/billing/GooglePlayV3$1;->this$0:Lcom/kabam/billing/GooglePlayV3;

    invoke-static {v1}, Lcom/kabam/billing/GooglePlayV3;->access$0(Lcom/kabam/billing/GooglePlayV3;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Initial inventory query finished; enabling main UI."

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

*/}
