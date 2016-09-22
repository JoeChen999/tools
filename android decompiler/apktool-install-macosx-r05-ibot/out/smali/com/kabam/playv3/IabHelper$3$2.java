package com.kabam.playv3; class IabHelper$3$2 {/*

.class Lcom/kabam/playv3/IabHelper$3$2;
.super Ljava/lang/Object;
.source "IabHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kabam/playv3/IabHelper$3;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/kabam/playv3/IabHelper$3;

.field private final synthetic val$multiListener:Lcom/kabam/playv3/IabHelper$OnConsumeMultiFinishedListener;

.field private final synthetic val$purchases:Ljava/util/List;

.field private final synthetic val$results:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/kabam/playv3/IabHelper$3;Lcom/kabam/playv3/IabHelper$OnConsumeMultiFinishedListener;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/kabam/playv3/IabHelper$3$2;->this$1:Lcom/kabam/playv3/IabHelper$3;

    iput-object p2, p0, Lcom/kabam/playv3/IabHelper$3$2;->val$multiListener:Lcom/kabam/playv3/IabHelper$OnConsumeMultiFinishedListener;

    iput-object p3, p0, Lcom/kabam/playv3/IabHelper$3$2;->val$purchases:Ljava/util/List;

    iput-object p4, p0, Lcom/kabam/playv3/IabHelper$3$2;->val$results:Ljava/util/List;

    .line 1019
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 1023
    iget-object v0, p0, Lcom/kabam/playv3/IabHelper$3$2;->val$multiListener:Lcom/kabam/playv3/IabHelper$OnConsumeMultiFinishedListener;

    #v0=(Reference);
    iget-object v1, p0, Lcom/kabam/playv3/IabHelper$3$2;->val$purchases:Ljava/util/List;

    #v1=(Reference);
    iget-object v2, p0, Lcom/kabam/playv3/IabHelper$3$2;->val$results:Ljava/util/List;

    #v2=(Reference);
    invoke-interface {v0, v1, v2}, Lcom/kabam/playv3/IabHelper$OnConsumeMultiFinishedListener;->onConsumeMultiFinished(Ljava/util/List;Ljava/util/List;)V

    .line 1024
    return-void
.end method

*/}
