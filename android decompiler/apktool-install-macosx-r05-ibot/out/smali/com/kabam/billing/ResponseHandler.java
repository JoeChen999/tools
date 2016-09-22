package com.kabam.billing; class ResponseHandler {/*

.class public Lcom/kabam/billing/ResponseHandler;
.super Ljava/lang/Object;
.source "ResponseHandler.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "ResponseHandler"

.field private static sPurchaseObserver:Lcom/kabam/billing/PurchaseObserver;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method static synthetic access$0()Lcom/kabam/billing/PurchaseObserver;
    .locals 1

    .prologue
    .line 36
    sget-object v0, Lcom/kabam/billing/ResponseHandler;->sPurchaseObserver:Lcom/kabam/billing/PurchaseObserver;

    #v0=(Reference);
    return-object v0
.end method

.method public static buyPageIntentResponse(Landroid/app/PendingIntent;Landroid/content/Intent;)V
    .locals 2
    .parameter "pendingIntent"
    .parameter "intent"

    .prologue
    .line 88
    sget-object v0, Lcom/kabam/billing/ResponseHandler;->sPurchaseObserver:Lcom/kabam/billing/PurchaseObserver;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 90
    const-string v0, "ResponseHandler"

    const-string v1, "UI is not running"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 95
    :goto_0
    #v1=(Conflicted);
    return-void

    .line 94
    :cond_0
    #v1=(Uninit);
    sget-object v0, Lcom/kabam/billing/ResponseHandler;->sPurchaseObserver:Lcom/kabam/billing/PurchaseObserver;

    invoke-virtual {v0, p0, p1}, Lcom/kabam/billing/PurchaseObserver;->startBuyPageActivity(Landroid/app/PendingIntent;Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public static checkBillingSupportedResponse(ZLjava/lang/String;)V
    .locals 2
    .parameter "supported"
    .parameter "type"

    .prologue
    .line 63
    if-eqz p0, :cond_0

    .line 65
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Lcom/kabam/utility/Provider;->SetSupported(Z)V

    .line 75
    :goto_0
    #v1=(Conflicted);
    return-void

    .line 70
    :cond_0
    #v0=(Uninit);v1=(Uninit);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Lcom/kabam/utility/Provider;->SetSupported(Z)V

    .line 71
    const-string v0, "not supported"

    invoke-static {v0}, Lcom/kabam/utility/UnitySender;->ShowMessage(Ljava/lang/String;)V

    .line 72
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->OnUICanceled()V

    .line 73
    const-string v0, "not supported"

    const-string v1, "not supported message sent"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static purchaseResponse(Landroid/content/Context;Lcom/kabam/utility/constance/Constance$PurchaseState;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
    .locals 7
    .parameter "context"
    .parameter "purchaseState"
    .parameter "productId"
    .parameter "orderId"
    .parameter "purchaseTime"
    .parameter "developerPayload"

    .prologue
    .line 106
    new-instance v6, Ljava/lang/Thread;

    #v6=(UninitRef);
    new-instance v0, Lcom/kabam/billing/ResponseHandler$1;

    #v0=(UninitRef);
    move-object v1, p1

    #v1=(Reference);
    move-object v2, p2

    #v2=(Reference);
    move-wide v3, p4

    #v3=(LongLo);v4=(LongHi);
    move-object v5, p6

    #v5=(Reference);
    invoke-direct/range {v0 .. v5}, Lcom/kabam/billing/ResponseHandler$1;-><init>(Lcom/kabam/utility/constance/Constance$PurchaseState;Ljava/lang/String;JLjava/lang/String;)V

    #v0=(Reference);
    invoke-direct {v6, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 123
    #v6=(Reference);
    invoke-virtual {v6}, Ljava/lang/Thread;->start()V

    .line 124
    return-void
.end method

.method public static declared-synchronized register(Lcom/kabam/billing/PurchaseObserver;)V
    .locals 2
    .parameter "observer"

    .prologue
    .line 43
    const-class v0, Lcom/kabam/billing/ResponseHandler;

    #v0=(Reference);
    monitor-enter v0

    :try_start_0
    sput-object p0, Lcom/kabam/billing/ResponseHandler;->sPurchaseObserver:Lcom/kabam/billing/PurchaseObserver;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    monitor-exit v0

    return-void

    .line 43
    :catchall_0
    move-exception v1

    #v1=(Reference);
    monitor-exit v0

    throw v1
.end method

.method public static responseCodeReceived(Landroid/content/Context;Lcom/kabam/billing/BillingService$RequestPurchase;Lcom/kabam/utility/constance/Constance$ResponseCode;)V
    .locals 1
    .parameter "context"
    .parameter "request"
    .parameter "responseCode"

    .prologue
    .line 142
    sget-object v0, Lcom/kabam/billing/ResponseHandler;->sPurchaseObserver:Lcom/kabam/billing/PurchaseObserver;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 144
    sget-object v0, Lcom/kabam/billing/ResponseHandler;->sPurchaseObserver:Lcom/kabam/billing/PurchaseObserver;

    invoke-virtual {v0, p1, p2}, Lcom/kabam/billing/PurchaseObserver;->onRequestPurchaseResponse(Lcom/kabam/billing/BillingService$RequestPurchase;Lcom/kabam/utility/constance/Constance$ResponseCode;)V

    .line 146
    :cond_0
    return-void
.end method

.method public static responseCodeReceived(Landroid/content/Context;Lcom/kabam/billing/BillingService$RestoreTransactions;Lcom/kabam/utility/constance/Constance$ResponseCode;)V
    .locals 1
    .parameter "context"
    .parameter "request"
    .parameter "responseCode"

    .prologue
    .line 159
    sget-object v0, Lcom/kabam/billing/ResponseHandler;->sPurchaseObserver:Lcom/kabam/billing/PurchaseObserver;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 160
    sget-object v0, Lcom/kabam/billing/ResponseHandler;->sPurchaseObserver:Lcom/kabam/billing/PurchaseObserver;

    invoke-virtual {v0, p1, p2}, Lcom/kabam/billing/PurchaseObserver;->onRestoreTransactionsResponse(Lcom/kabam/billing/BillingService$RestoreTransactions;Lcom/kabam/utility/constance/Constance$ResponseCode;)V

    .line 162
    :cond_0
    return-void
.end method

.method public static declared-synchronized unregister(Lcom/kabam/billing/PurchaseObserver;)V
    .locals 2
    .parameter "observer"

    .prologue
    .line 51
    const-class v0, Lcom/kabam/billing/ResponseHandler;

    #v0=(Reference);
    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    #v1=(Null);
    sput-object v1, Lcom/kabam/billing/ResponseHandler;->sPurchaseObserver:Lcom/kabam/billing/PurchaseObserver;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    monitor-exit v0

    return-void

    .line 51
    :catchall_0
    move-exception v1

    #v1=(Reference);
    monitor-exit v0

    throw v1
.end method

*/}
