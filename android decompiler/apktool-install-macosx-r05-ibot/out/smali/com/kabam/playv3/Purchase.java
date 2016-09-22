package com.kabam.playv3; class Purchase {/*

.class public Lcom/kabam/playv3/Purchase;
.super Ljava/lang/Object;
.source "Purchase.java"


# instance fields
.field mDeveloperPayload:Ljava/lang/String;

.field mOrderId:Ljava/lang/String;

.field mOriginalJson:Ljava/lang/String;

.field mPackageName:Ljava/lang/String;

.field mPurchaseState:I

.field mPurchaseTime:J

.field mSignature:Ljava/lang/String;

.field mSku:Ljava/lang/String;

.field mToken:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .parameter "jsonPurchaseInfo"
    .parameter "signature"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    #p0=(Reference);
    iput-object p1, p0, Lcom/kabam/playv3/Purchase;->mOriginalJson:Ljava/lang/String;

    .line 40
    new-instance v0, Lorg/json/JSONObject;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/kabam/playv3/Purchase;->mOriginalJson:Ljava/lang/String;

    #v1=(Reference);
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 41
    .local v0, o:Lorg/json/JSONObject;
    #v0=(Reference);
    const-string v1, "orderId"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/kabam/playv3/Purchase;->mOrderId:Ljava/lang/String;

    .line 42
    const-string v1, "packageName"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/kabam/playv3/Purchase;->mPackageName:Ljava/lang/String;

    .line 43
    const-string v1, "productId"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/kabam/playv3/Purchase;->mSku:Ljava/lang/String;

    .line 44
    const-string v1, "purchaseTime"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v1

    #v1=(LongLo);v2=(LongHi);
    iput-wide v1, p0, Lcom/kabam/playv3/Purchase;->mPurchaseTime:J

    .line 45
    const-string v1, "purchaseState"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Lcom/kabam/playv3/Purchase;->mPurchaseState:I

    .line 46
    const-string v1, "developerPayload"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/kabam/playv3/Purchase;->mDeveloperPayload:Ljava/lang/String;

    .line 47
    const-string v1, "token"

    const-string v2, "purchaseToken"

    #v2=(Reference);
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/kabam/playv3/Purchase;->mToken:Ljava/lang/String;

    .line 48
    iput-object p2, p0, Lcom/kabam/playv3/Purchase;->mSignature:Ljava/lang/String;

    .line 49
    return-void
.end method


# virtual methods
.method public LogPurchase()V
    .locals 5

    .prologue
    .line 66
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "Purchase"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "mOrderId="

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    iget-object v3, p0, Lcom/kabam/playv3/Purchase;->mOrderId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    const-string v1, "Purchase"

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "mPackageName="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    iget-object v3, p0, Lcom/kabam/playv3/Purchase;->mPackageName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    const-string v1, "Purchase"

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "mSku="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    iget-object v3, p0, Lcom/kabam/playv3/Purchase;->mSku:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    const-string v1, "Purchase"

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "mPurchaseTime="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    iget-wide v3, p0, Lcom/kabam/playv3/Purchase;->mPurchaseTime:J

    #v3=(LongLo);v4=(LongHi);
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    const-string v1, "Purchase"

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "mDeveloperPayload="

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    iget-object v3, p0, Lcom/kabam/playv3/Purchase;->mDeveloperPayload:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    const-string v1, "Purchase"

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "mToken="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    iget-object v3, p0, Lcom/kabam/playv3/Purchase;->mToken:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    const-string v1, "Purchase"

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "mPurchaseState="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    iget v3, p0, Lcom/kabam/playv3/Purchase;->mPurchaseState:I

    #v3=(Integer);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    const-string v1, "Purchase"

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "mOriginalJson="

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    iget-object v3, p0, Lcom/kabam/playv3/Purchase;->mOriginalJson:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    const-string v1, "Purchase"

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "mSignature="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    iget-object v3, p0, Lcom/kabam/playv3/Purchase;->mSignature:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    return-void
.end method

.method public getDeveloperPayload()Ljava/lang/String;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/kabam/playv3/Purchase;->mDeveloperPayload:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getOrderId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/kabam/playv3/Purchase;->mOrderId:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getOriginalJson()Ljava/lang/String;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/kabam/playv3/Purchase;->mOriginalJson:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/kabam/playv3/Purchase;->mPackageName:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getPurchaseState()I
    .locals 1

    .prologue
    .line 55
    iget v0, p0, Lcom/kabam/playv3/Purchase;->mPurchaseState:I

    #v0=(Integer);
    return v0
.end method

.method public getPurchaseTime()J
    .locals 2

    .prologue
    .line 54
    iget-wide v0, p0, Lcom/kabam/playv3/Purchase;->mPurchaseTime:J

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method public getSignature()Ljava/lang/String;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/kabam/playv3/Purchase;->mSignature:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getSku()Ljava/lang/String;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/kabam/playv3/Purchase;->mSku:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getToken()Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/kabam/playv3/Purchase;->mToken:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    const-string v1, "PurchaseInfo:"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    iget-object v1, p0, Lcom/kabam/playv3/Purchase;->mOriginalJson:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

*/}
