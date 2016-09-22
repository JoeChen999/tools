package com.kabam.playv3; class IabResult {/*

.class public Lcom/kabam/playv3/IabResult;
.super Ljava/lang/Object;
.source "IabResult.java"


# instance fields
.field mMessage:Ljava/lang/String;

.field mResponse:I


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 2
    .parameter "response"
    .parameter "message"

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    #p0=(Reference);
    iput p1, p0, Lcom/kabam/playv3/IabResult;->mResponse:I

    .line 31
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_1

    .line 32
    :cond_0
    #v0=(Conflicted);
    invoke-static {p1}, Lcom/kabam/playv3/IabHelper;->getResponseDesc(I)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/playv3/IabResult;->mMessage:Ljava/lang/String;

    .line 37
    :goto_0
    #v1=(Conflicted);
    return-void

    .line 35
    :cond_1
    #v0=(Integer);v1=(Uninit);
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    const-string v1, " (response: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/kabam/playv3/IabHelper;->getResponseDesc(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kabam/playv3/IabResult;->mMessage:Ljava/lang/String;

    goto :goto_0
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/kabam/playv3/IabResult;->mMessage:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getResponse()I
    .locals 1

    .prologue
    .line 38
    iget v0, p0, Lcom/kabam/playv3/IabResult;->mResponse:I

    #v0=(Integer);
    return v0
.end method

.method public isFailure()Z
    .locals 1

    .prologue
    .line 41
    invoke-virtual {p0}, Lcom/kabam/playv3/IabResult;->isSuccess()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method

.method public isSuccess()Z
    .locals 1

    .prologue
    .line 40
    iget v0, p0, Lcom/kabam/playv3/IabResult;->mResponse:I

    #v0=(Integer);
    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    const-string v1, "IabResult: "

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    invoke-virtual {p0}, Lcom/kabam/playv3/IabResult;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

*/}
