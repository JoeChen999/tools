package com.kabam.playv3; class IabHelper$2 {/*

.class Lcom/kabam/playv3/IabHelper$2;
.super Ljava/lang/Object;
.source "IabHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kabam/playv3/IabHelper;->queryInventoryAsync(ZLjava/util/List;Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kabam/playv3/IabHelper;

.field private final synthetic val$listener:Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;

.field private final synthetic val$moreSkus:Ljava/util/List;

.field private final synthetic val$querySkuDetails:Z


# direct methods
.method constructor <init>(Lcom/kabam/playv3/IabHelper;ZLjava/util/List;Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/kabam/playv3/IabHelper$2;->this$0:Lcom/kabam/playv3/IabHelper;

    iput-boolean p2, p0, Lcom/kabam/playv3/IabHelper$2;->val$querySkuDetails:Z

    iput-object p3, p0, Lcom/kabam/playv3/IabHelper$2;->val$moreSkus:Ljava/util/List;

    iput-object p4, p0, Lcom/kabam/playv3/IabHelper$2;->val$listener:Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;

    .line 584
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method static synthetic access$0(Lcom/kabam/playv3/IabHelper$2;)Lcom/kabam/playv3/IabHelper;
    .locals 1
    .parameter

    .prologue
    .line 584
    iget-object v0, p0, Lcom/kabam/playv3/IabHelper$2;->this$0:Lcom/kabam/playv3/IabHelper;

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 10

    .prologue
    const/4 v6, 0x0

    .line 588
    #v6=(Null);
    new-instance v1, Landroid/os/Handler;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 589
    .local v1, handler:Landroid/os/Handler;
    #v1=(Reference);
    new-instance v4, Lcom/kabam/playv3/IabResult;

    #v4=(UninitRef);
    const-string v7, "Inventory refresh successful."

    #v7=(Reference);
    invoke-direct {v4, v6, v7}, Lcom/kabam/playv3/IabResult;-><init>(ILjava/lang/String;)V

    .line 590
    .local v4, result:Lcom/kabam/playv3/IabResult;
    #v4=(Reference);
    const/4 v2, 0x0

    .line 593
    .local v2, inv:Lcom/kabam/playv3/Inventory;
    :try_start_0
    #v2=(Null);
    iget-object v7, p0, Lcom/kabam/playv3/IabHelper$2;->this$0:Lcom/kabam/playv3/IabHelper;

    iget-boolean v8, p0, Lcom/kabam/playv3/IabHelper$2;->val$querySkuDetails:Z

    #v8=(Boolean);
    iget-object v9, p0, Lcom/kabam/playv3/IabHelper$2;->val$moreSkus:Ljava/util/List;

    #v9=(Reference);
    invoke-virtual {v7, v8, v9}, Lcom/kabam/playv3/IabHelper;->queryInventory(ZLjava/util/List;)Lcom/kabam/playv3/Inventory;

    move-result-object v2

    .line 594
    #v2=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v7

    invoke-virtual {v7, v2}, Lcom/kabam/utility/Provider;->ProvideStoreInventory(Lcom/kabam/playv3/Inventory;)V
    :try_end_0
    .catch Lcom/kabam/playv3/IabException; {:try_start_0 .. :try_end_0} :catch_0

    .line 601
    :goto_0
    #v0=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    iget-object v7, p0, Lcom/kabam/playv3/IabHelper$2;->this$0:Lcom/kabam/playv3/IabHelper;

    invoke-virtual {v7}, Lcom/kabam/playv3/IabHelper;->flagEndAsync()V

    .line 603
    move-object v5, v4

    .line 604
    .local v5, result_f:Lcom/kabam/playv3/IabResult;
    #v5=(Reference);
    move-object v3, v2

    .line 605
    .local v3, inv_f:Lcom/kabam/playv3/Inventory;
    #v3=(Reference);
    iget-object v7, p0, Lcom/kabam/playv3/IabHelper$2;->this$0:Lcom/kabam/playv3/IabHelper;

    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    const-string v9, " onQueryInventoryFinished: "

    #v9=(Reference);
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v8=(Reference);
    if-nez v3, :cond_0

    const/4 v6, 0x1

    :cond_0
    #v6=(Boolean);
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v6

    #v6=(Reference);
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 606
    new-instance v6, Lcom/kabam/playv3/IabHelper$2$1;

    #v6=(UninitRef);
    iget-object v7, p0, Lcom/kabam/playv3/IabHelper$2;->val$listener:Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;

    invoke-direct {v6, p0, v3, v7, v5}, Lcom/kabam/playv3/IabHelper$2$1;-><init>(Lcom/kabam/playv3/IabHelper$2;Lcom/kabam/playv3/Inventory;Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;Lcom/kabam/playv3/IabResult;)V

    #v6=(Reference);
    invoke-virtual {v1, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 614
    return-void

    .line 596
    .end local v3           #inv_f:Lcom/kabam/playv3/Inventory;
    .end local v5           #result_f:Lcom/kabam/playv3/IabResult;
    :catch_0
    #v0=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Null);v8=(Conflicted);v9=(Conflicted);
    move-exception v0

    .line 598
    .local v0, ex:Lcom/kabam/playv3/IabException;
    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/playv3/IabException;->getResult()Lcom/kabam/playv3/IabResult;

    move-result-object v4

    goto :goto_0
.end method

*/}
