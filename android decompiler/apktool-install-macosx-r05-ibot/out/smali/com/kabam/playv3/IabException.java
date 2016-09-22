package com.kabam.playv3; class IabException {/*

.class public Lcom/kabam/playv3/IabException;
.super Ljava/lang/Exception;
.source "IabException.java"


# instance fields
.field mResult:Lcom/kabam/playv3/IabResult;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 1
    .parameter "response"
    .parameter "message"

    .prologue
    .line 30
    new-instance v0, Lcom/kabam/playv3/IabResult;

    #v0=(UninitRef);
    invoke-direct {v0, p1, p2}, Lcom/kabam/playv3/IabResult;-><init>(ILjava/lang/String;)V

    #v0=(Reference);
    invoke-direct {p0, v0}, Lcom/kabam/playv3/IabException;-><init>(Lcom/kabam/playv3/IabResult;)V

    .line 31
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/Exception;)V
    .locals 1
    .parameter "response"
    .parameter "message"
    .parameter "cause"

    .prologue
    .line 37
    new-instance v0, Lcom/kabam/playv3/IabResult;

    #v0=(UninitRef);
    invoke-direct {v0, p1, p2}, Lcom/kabam/playv3/IabResult;-><init>(ILjava/lang/String;)V

    #v0=(Reference);
    invoke-direct {p0, v0, p3}, Lcom/kabam/playv3/IabException;-><init>(Lcom/kabam/playv3/IabResult;Ljava/lang/Exception;)V

    .line 38
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Lcom/kabam/playv3/IabResult;)V
    .locals 1
    .parameter "r"

    .prologue
    .line 27
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, v0}, Lcom/kabam/playv3/IabException;-><init>(Lcom/kabam/playv3/IabResult;Ljava/lang/Exception;)V

    .line 28
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Lcom/kabam/playv3/IabResult;Ljava/lang/Exception;)V
    .locals 1
    .parameter "r"
    .parameter "cause"

    .prologue
    .line 33
    invoke-virtual {p1}, Lcom/kabam/playv3/IabResult;->getMessage()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-direct {p0, v0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    #p0=(Reference);
    iput-object p1, p0, Lcom/kabam/playv3/IabException;->mResult:Lcom/kabam/playv3/IabResult;

    .line 35
    return-void
.end method


# virtual methods
.method public getResult()Lcom/kabam/playv3/IabResult;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/kabam/playv3/IabException;->mResult:Lcom/kabam/playv3/IabResult;

    #v0=(Reference);
    return-object v0
.end method

*/}
