package com.kabam.billing; class GooglePlayV3$2 {/*

.class Lcom/kabam/billing/GooglePlayV3$2;
.super Ljava/lang/Object;
.source "GooglePlayV3.java"

# interfaces
.implements Lcom/kabam/playv3/IabHelper$OnConsumeFinishedListener;


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
    iput-object p1, p0, Lcom/kabam/billing/GooglePlayV3$2;->this$0:Lcom/kabam/billing/GooglePlayV3;

    .line 283
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onConsumeFinished(Lcom/kabam/playv3/Purchase;Lcom/kabam/playv3/IabResult;)V
    .locals 3
    .parameter "purchase"
    .parameter "result"

    .prologue
    .line 285
    iget-object v0, p0, Lcom/kabam/billing/GooglePlayV3$2;->this$0:Lcom/kabam/billing/GooglePlayV3;

    #v0=(Reference);
    invoke-static {v0}, Lcom/kabam/billing/GooglePlayV3;->access$0(Lcom/kabam/billing/GooglePlayV3;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "Consumption finished. Purchase: "

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 290
    invoke-virtual {p2}, Lcom/kabam/playv3/IabResult;->isSuccess()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 293
    iget-object v0, p0, Lcom/kabam/billing/GooglePlayV3$2;->this$0:Lcom/kabam/billing/GooglePlayV3;

    #v0=(Reference);
    invoke-static {v0}, Lcom/kabam/billing/GooglePlayV3;->access$0(Lcom/kabam/billing/GooglePlayV3;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Consumption successful. Provisioning."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 301
    :goto_0
    iget-object v0, p0, Lcom/kabam/billing/GooglePlayV3$2;->this$0:Lcom/kabam/billing/GooglePlayV3;

    invoke-static {v0}, Lcom/kabam/billing/GooglePlayV3;->access$0(Lcom/kabam/billing/GooglePlayV3;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "End consumption flow."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 302
    return-void

    .line 297
    :cond_0
    #v0=(Boolean);
    iget-object v0, p0, Lcom/kabam/billing/GooglePlayV3$2;->this$0:Lcom/kabam/billing/GooglePlayV3;

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "Error while consuming: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kabam/billing/GooglePlayV3;->complain(Ljava/lang/String;)V

    goto :goto_0
.end method

*/}
