package com.kabam.playv3; class SkuDetails {/*

.class public Lcom/kabam/playv3/SkuDetails;
.super Ljava/lang/Object;
.source "SkuDetails.java"


# instance fields
.field mDescription:Ljava/lang/String;

.field mJson:Ljava/lang/String;

.field mPrice:Ljava/lang/String;

.field mSku:Ljava/lang/String;

.field mTitle:Ljava/lang/String;

.field mType:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2
    .parameter "jsonSkuDetails"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    #p0=(Reference);
    iput-object p1, p0, Lcom/kabam/playv3/SkuDetails;->mJson:Ljava/lang/String;

    .line 35
    new-instance v0, Lorg/json/JSONObject;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/kabam/playv3/SkuDetails;->mJson:Ljava/lang/String;

    #v1=(Reference);
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 36
    .local v0, o:Lorg/json/JSONObject;
    #v0=(Reference);
    const-string v1, "productId"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/kabam/playv3/SkuDetails;->mSku:Ljava/lang/String;

    .line 37
    const-string v1, "type"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/kabam/playv3/SkuDetails;->mType:Ljava/lang/String;

    .line 38
    const-string v1, "price"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/kabam/playv3/SkuDetails;->mPrice:Ljava/lang/String;

    .line 39
    const-string v1, "title"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/kabam/playv3/SkuDetails;->mTitle:Ljava/lang/String;

    .line 40
    const-string v1, "description"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/kabam/playv3/SkuDetails;->mDescription:Ljava/lang/String;

    .line 41
    return-void
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/kabam/playv3/SkuDetails;->mDescription:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getPrice()Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/kabam/playv3/SkuDetails;->mPrice:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getSku()Ljava/lang/String;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/kabam/playv3/SkuDetails;->mSku:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/kabam/playv3/SkuDetails;->mTitle:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/kabam/playv3/SkuDetails;->mType:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    const-string v1, "SkuDetails:"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    iget-object v1, p0, Lcom/kabam/playv3/SkuDetails;->mJson:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

*/}
