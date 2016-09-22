package com.kabam.playv3; class IabHelper$2$1 {/*

.class Lcom/kabam/playv3/IabHelper$2$1;
.super Ljava/lang/Object;
.source "IabHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kabam/playv3/IabHelper$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/kabam/playv3/IabHelper$2;

.field private final synthetic val$inv_f:Lcom/kabam/playv3/Inventory;

.field private final synthetic val$listener:Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;

.field private final synthetic val$result_f:Lcom/kabam/playv3/IabResult;


# direct methods
.method constructor <init>(Lcom/kabam/playv3/IabHelper$2;Lcom/kabam/playv3/Inventory;Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;Lcom/kabam/playv3/IabResult;)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/kabam/playv3/IabHelper$2$1;->this$1:Lcom/kabam/playv3/IabHelper$2;

    iput-object p2, p0, Lcom/kabam/playv3/IabHelper$2$1;->val$inv_f:Lcom/kabam/playv3/Inventory;

    iput-object p3, p0, Lcom/kabam/playv3/IabHelper$2$1;->val$listener:Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;

    iput-object p4, p0, Lcom/kabam/playv3/IabHelper$2$1;->val$result_f:Lcom/kabam/playv3/IabResult;

    .line 606
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 610
    iget-object v0, p0, Lcom/kabam/playv3/IabHelper$2$1;->this$1:Lcom/kabam/playv3/IabHelper$2;

    #v0=(Reference);
    invoke-static {v0}, Lcom/kabam/playv3/IabHelper$2;->access$0(Lcom/kabam/playv3/IabHelper$2;)Lcom/kabam/playv3/IabHelper;

    move-result-object v1

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v0, " onQueryInventoryFinished: "

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    iget-object v0, p0, Lcom/kabam/playv3/IabHelper$2$1;->val$inv_f:Lcom/kabam/playv3/Inventory;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 611
    iget-object v0, p0, Lcom/kabam/playv3/IabHelper$2$1;->val$listener:Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;

    iget-object v1, p0, Lcom/kabam/playv3/IabHelper$2$1;->val$result_f:Lcom/kabam/playv3/IabResult;

    iget-object v2, p0, Lcom/kabam/playv3/IabHelper$2$1;->val$inv_f:Lcom/kabam/playv3/Inventory;

    invoke-interface {v0, v1, v2}, Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;->onQueryInventoryFinished(Lcom/kabam/playv3/IabResult;Lcom/kabam/playv3/Inventory;)V

    .line 612
    return-void

    .line 610
    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

*/}
