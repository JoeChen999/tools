package com.kabam.playv3; class IabHelper$3 {/*

.class Lcom/kabam/playv3/IabHelper$3;
.super Ljava/lang/Object;
.source "IabHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kabam/playv3/IabHelper;->consumeAsyncInternal(Ljava/util/List;Lcom/kabam/playv3/IabHelper$OnConsumeFinishedListener;Lcom/kabam/playv3/IabHelper$OnConsumeMultiFinishedListener;Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kabam/playv3/IabHelper;

.field private final synthetic val$multiListener:Lcom/kabam/playv3/IabHelper$OnConsumeMultiFinishedListener;

.field private final synthetic val$purchases:Ljava/util/List;

.field private final synthetic val$singleListener:Lcom/kabam/playv3/IabHelper$OnConsumeFinishedListener;


# direct methods
.method constructor <init>(Lcom/kabam/playv3/IabHelper;Ljava/util/List;Lcom/kabam/playv3/IabHelper$OnConsumeFinishedListener;Lcom/kabam/playv3/IabHelper$OnConsumeMultiFinishedListener;)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/kabam/playv3/IabHelper$3;->this$0:Lcom/kabam/playv3/IabHelper;

    iput-object p2, p0, Lcom/kabam/playv3/IabHelper$3;->val$purchases:Ljava/util/List;

    iput-object p3, p0, Lcom/kabam/playv3/IabHelper$3;->val$singleListener:Lcom/kabam/playv3/IabHelper$OnConsumeFinishedListener;

    iput-object p4, p0, Lcom/kabam/playv3/IabHelper$3;->val$multiListener:Lcom/kabam/playv3/IabHelper$OnConsumeMultiFinishedListener;

    .line 986
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .prologue
    .line 990
    new-instance v1, Landroid/os/Handler;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 991
    .local v1, handler:Landroid/os/Handler;
    #v1=(Reference);
    new-instance v3, Ljava/util/ArrayList;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 992
    .local v3, results:Ljava/util/List;,"Ljava/util/List<Lcom/kabam/playv3/IabResult;>;"
    #v3=(Reference);
    iget-object v4, p0, Lcom/kabam/playv3/IabHelper$3;->val$purchases:Ljava/util/List;

    #v4=(Reference);
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    #v0=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    #v5=(Boolean);
    if-nez v5, :cond_2

    .line 1006
    iget-object v4, p0, Lcom/kabam/playv3/IabHelper$3;->this$0:Lcom/kabam/playv3/IabHelper;

    invoke-virtual {v4}, Lcom/kabam/playv3/IabHelper;->flagEndAsync()V

    .line 1007
    iget-object v4, p0, Lcom/kabam/playv3/IabHelper$3;->val$singleListener:Lcom/kabam/playv3/IabHelper$OnConsumeFinishedListener;

    if-eqz v4, :cond_0

    .line 1009
    new-instance v4, Lcom/kabam/playv3/IabHelper$3$1;

    #v4=(UninitRef);
    iget-object v5, p0, Lcom/kabam/playv3/IabHelper$3;->val$singleListener:Lcom/kabam/playv3/IabHelper$OnConsumeFinishedListener;

    #v5=(Reference);
    iget-object v6, p0, Lcom/kabam/playv3/IabHelper$3;->val$purchases:Ljava/util/List;

    #v6=(Reference);
    invoke-direct {v4, p0, v5, v6, v3}, Lcom/kabam/playv3/IabHelper$3$1;-><init>(Lcom/kabam/playv3/IabHelper$3;Lcom/kabam/playv3/IabHelper$OnConsumeFinishedListener;Ljava/util/List;Ljava/util/List;)V

    #v4=(Reference);
    invoke-virtual {v1, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1017
    :cond_0
    #v5=(Conflicted);v6=(Conflicted);
    iget-object v4, p0, Lcom/kabam/playv3/IabHelper$3;->val$multiListener:Lcom/kabam/playv3/IabHelper$OnConsumeMultiFinishedListener;

    if-eqz v4, :cond_1

    .line 1019
    new-instance v4, Lcom/kabam/playv3/IabHelper$3$2;

    #v4=(UninitRef);
    iget-object v5, p0, Lcom/kabam/playv3/IabHelper$3;->val$multiListener:Lcom/kabam/playv3/IabHelper$OnConsumeMultiFinishedListener;

    #v5=(Reference);
    iget-object v6, p0, Lcom/kabam/playv3/IabHelper$3;->val$purchases:Ljava/util/List;

    #v6=(Reference);
    invoke-direct {v4, p0, v5, v6, v3}, Lcom/kabam/playv3/IabHelper$3$2;-><init>(Lcom/kabam/playv3/IabHelper$3;Lcom/kabam/playv3/IabHelper$OnConsumeMultiFinishedListener;Ljava/util/List;Ljava/util/List;)V

    #v4=(Reference);
    invoke-virtual {v1, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1027
    :cond_1
    #v5=(Conflicted);v6=(Conflicted);
    return-void

    .line 992
    :cond_2
    #v5=(Boolean);
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Lcom/kabam/playv3/Purchase;

    .line 996
    .local v2, purchase:Lcom/kabam/playv3/Purchase;
    :try_start_0
    iget-object v5, p0, Lcom/kabam/playv3/IabHelper$3;->this$0:Lcom/kabam/playv3/IabHelper;

    #v5=(Reference);
    invoke-virtual {v5, v2}, Lcom/kabam/playv3/IabHelper;->consume(Lcom/kabam/playv3/Purchase;)V

    .line 997
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v5

    invoke-virtual {v5}, Lcom/kabam/utility/Provider;->ProvideInventory()Lcom/kabam/playv3/Inventory;

    move-result-object v5

    invoke-virtual {v2}, Lcom/kabam/playv3/Purchase;->getSku()Ljava/lang/String;

    move-result-object v6

    #v6=(Reference);
    invoke-virtual {v5, v6}, Lcom/kabam/playv3/Inventory;->erasePurchase(Ljava/lang/String;)V

    .line 998
    new-instance v5, Lcom/kabam/playv3/IabResult;

    #v5=(UninitRef);
    const/4 v6, 0x0

    #v6=(Null);
    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    const-string v8, "Successful consume of sku "

    #v8=(Reference);
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v7=(Reference);
    invoke-virtual {v2}, Lcom/kabam/playv3/Purchase;->getSku()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Lcom/kabam/playv3/IabResult;-><init>(ILjava/lang/String;)V

    #v5=(Reference);
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/kabam/playv3/IabException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1000
    :catch_0
    #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    move-exception v0

    .line 1002
    .local v0, ex:Lcom/kabam/playv3/IabException;
    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/playv3/IabException;->getResult()Lcom/kabam/playv3/IabResult;

    move-result-object v5

    #v5=(Reference);
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

*/}
