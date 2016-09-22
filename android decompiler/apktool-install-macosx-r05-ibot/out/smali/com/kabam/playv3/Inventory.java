package com.kabam.playv3; class Inventory {/*

.class public Lcom/kabam/playv3/Inventory;
.super Ljava/lang/Object;
.source "Inventory.java"


# instance fields
.field mPurchaseMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/kabam/playv3/Purchase;",
            ">;"
        }
    .end annotation
.end field

.field mSkuMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/kabam/playv3/SkuDetails;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    #p0=(Reference);
    new-instance v0, Ljava/util/HashMap;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/playv3/Inventory;->mSkuMap:Ljava/util/Map;

    .line 31
    new-instance v0, Ljava/util/HashMap;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/playv3/Inventory;->mPurchaseMap:Ljava/util/Map;

    .line 33
    return-void
.end method


# virtual methods
.method public LogPurchaseMap()V
    .locals 9

    .prologue
    .line 110
    const/4 v0, 0x0

    .line 111
    .local v0, i:I
    #v0=(Null);
    iget-object v4, p0, Lcom/kabam/playv3/Inventory;->mPurchaseMap:Ljava/util/Map;

    #v4=(Reference);
    invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    #v5=(Boolean);
    if-nez v5, :cond_0

    .line 117
    return-void

    .line 111
    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Ljava/lang/String;

    .line 113
    .local v2, key:Ljava/lang/String;
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v5

    #v5=(Reference);
    const-string v6, "LogPurchaseMap"

    #v6=(Reference);
    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    const-string v8, "LogPurchaseMap i="

    #v8=(Reference);
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v7=(Reference);
    add-int/lit8 v1, v0, 0x1

    .end local v0           #i:I
    .local v1, i:I
    #v1=(Integer);
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    iget-object v5, p0, Lcom/kabam/playv3/Inventory;->mPurchaseMap:Ljava/util/Map;

    invoke-interface {v5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Lcom/kabam/playv3/Purchase;

    .line 115
    .local v3, purchase:Lcom/kabam/playv3/Purchase;
    invoke-virtual {v3}, Lcom/kabam/playv3/Purchase;->LogPurchase()V

    move v0, v1

    .end local v1           #i:I
    .restart local v0       #i:I
    goto :goto_0
.end method

.method addPurchase(Lcom/kabam/playv3/Purchase;)V
    .locals 3
    .parameter "p"

    .prologue
    .line 101
    iget-object v0, p0, Lcom/kabam/playv3/Inventory;->mPurchaseMap:Ljava/util/Map;

    #v0=(Reference);
    invoke-virtual {p1}, Lcom/kabam/playv3/Purchase;->getSku()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    if-eqz p1, :cond_0

    .line 103
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    const-string v1, "addPurchase"

    invoke-virtual {p1}, Lcom/kabam/playv3/Purchase;->getSku()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    :goto_0
    return-void

    .line 105
    :cond_0
    #v2=(Uninit);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    const-string v1, "addPurchase"

    const-string v2, "when addPurchase purchase==null"

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method addSkuDetails(Lcom/kabam/playv3/SkuDetails;)V
    .locals 2
    .parameter "d"

    .prologue
    .line 96
    iget-object v0, p0, Lcom/kabam/playv3/Inventory;->mSkuMap:Ljava/util/Map;

    #v0=(Reference);
    invoke-virtual {p1}, Lcom/kabam/playv3/SkuDetails;->getSku()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    return-void
.end method

.method public erasePurchase(Ljava/lang/String;)V
    .locals 4
    .parameter "sku"

    .prologue
    .line 69
    iget-object v0, p0, Lcom/kabam/playv3/Inventory;->mPurchaseMap:Ljava/util/Map;

    #v0=(Reference);
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kabam/playv3/Inventory;->mPurchaseMap:Ljava/util/Map;

    #v0=(Reference);
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    :cond_0
    #v0=(Conflicted);
    if-eqz p1, :cond_1

    .line 71
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "erasePurchase"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "erasePurchase sku="

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    :goto_0
    #v3=(Conflicted);
    return-void

    .line 73
    :cond_1
    #v0=(Conflicted);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "erasePurchase"

    #v1=(Reference);
    const-string v2, "when erasePurchase sku==null"

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method getAllOwnedSkus()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 80
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/kabam/playv3/Inventory;->mPurchaseMap:Ljava/util/Map;

    #v1=(Reference);
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    #v0=(Reference);
    return-object v0
.end method

.method getAllPurchases()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/kabam/playv3/Purchase;",
            ">;"
        }
    .end annotation

    .prologue
    .line 91
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/kabam/playv3/Inventory;->mPurchaseMap:Ljava/util/Map;

    #v1=(Reference);
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    #v0=(Reference);
    return-object v0
.end method

.method public getAllSkusDetails()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 85
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/kabam/playv3/Inventory;->mSkuMap:Ljava/util/Map;

    #v1=(Reference);
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    #v0=(Reference);
    return-object v0
.end method

.method public getPurchase(Ljava/lang/String;)Lcom/kabam/playv3/Purchase;
    .locals 1
    .parameter "sku"

    .prologue
    .line 44
    iget-object v0, p0, Lcom/kabam/playv3/Inventory;->mPurchaseMap:Ljava/util/Map;

    #v0=(Reference);
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kabam/playv3/Purchase;

    return-object v0
.end method

.method public getSkuDetails(Ljava/lang/String;)Lcom/kabam/playv3/SkuDetails;
    .locals 1
    .parameter "sku"

    .prologue
    .line 38
    iget-object v0, p0, Lcom/kabam/playv3/Inventory;->mSkuMap:Ljava/util/Map;

    #v0=(Reference);
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kabam/playv3/SkuDetails;

    return-object v0
.end method

.method public hasDetails(Ljava/lang/String;)Z
    .locals 1
    .parameter "sku"

    .prologue
    .line 56
    iget-object v0, p0, Lcom/kabam/playv3/Inventory;->mSkuMap:Ljava/util/Map;

    #v0=(Reference);
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public hasPurchase(Ljava/lang/String;)Z
    .locals 1
    .parameter "sku"

    .prologue
    .line 50
    iget-object v0, p0, Lcom/kabam/playv3/Inventory;->mPurchaseMap:Ljava/util/Map;

    #v0=(Reference);
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

*/}
