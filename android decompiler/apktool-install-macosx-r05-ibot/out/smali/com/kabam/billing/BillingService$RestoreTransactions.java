package com.kabam.billing; class BillingService$RestoreTransactions {/*

.class Lcom/kabam/billing/BillingService$RestoreTransactions;
.super Lcom/kabam/billing/BillingService$BillingRequest;
.source "BillingService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kabam/billing/BillingService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "RestoreTransactions"
.end annotation


# instance fields
.field mNonce:J

.field final synthetic this$0:Lcom/kabam/billing/BillingService;


# direct methods
.method public constructor <init>(Lcom/kabam/billing/BillingService;)V
    .locals 1
    .parameter

    .prologue
    .line 445
    iput-object p1, p0, Lcom/kabam/billing/BillingService$RestoreTransactions;->this$0:Lcom/kabam/billing/BillingService;

    .line 449
    const/4 v0, -0x1

    #v0=(Byte);
    invoke-direct {p0, p1, v0}, Lcom/kabam/billing/BillingService$BillingRequest;-><init>(Lcom/kabam/billing/BillingService;I)V

    .line 450
    #p0=(Reference);
    return-void
.end method


# virtual methods
.method protected onRemoteException(Landroid/os/RemoteException;)V
    .locals 2
    .parameter "e"

    .prologue
    .line 468
    invoke-super {p0, p1}, Lcom/kabam/billing/BillingService$BillingRequest;->onRemoteException(Landroid/os/RemoteException;)V

    .line 469
    iget-wide v0, p0, Lcom/kabam/billing/BillingService$RestoreTransactions;->mNonce:J

    #v0=(LongLo);v1=(LongHi);
    invoke-static {v0, v1}, Lcom/kabam/billing/Security;->removeNonce(J)V

    .line 470
    return-void
.end method

.method protected responseCodeReceived(Lcom/kabam/utility/constance/Constance$ResponseCode;)V
    .locals 1
    .parameter "responseCode"

    .prologue
    .line 475
    iget-object v0, p0, Lcom/kabam/billing/BillingService$RestoreTransactions;->this$0:Lcom/kabam/billing/BillingService;

    #v0=(Reference);
    invoke-static {v0, p0, p1}, Lcom/kabam/billing/ResponseHandler;->responseCodeReceived(Landroid/content/Context;Lcom/kabam/billing/BillingService$RestoreTransactions;Lcom/kabam/utility/constance/Constance$ResponseCode;)V

    .line 477
    return-void
.end method

.method protected run()J
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 455
    invoke-static {}, Lcom/kabam/billing/Security;->generateNonce()J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    iput-wide v2, p0, Lcom/kabam/billing/BillingService$RestoreTransactions;->mNonce:J

    .line 457
    const-string v2, "RESTORE_TRANSACTIONS"

    #v2=(Reference);
    invoke-virtual {p0, v2}, Lcom/kabam/billing/BillingService$RestoreTransactions;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 458
    .local v0, request:Landroid/os/Bundle;
    #v0=(Reference);
    const-string v2, "NONCE"

    iget-wide v3, p0, Lcom/kabam/billing/BillingService$RestoreTransactions;->mNonce:J

    #v3=(LongLo);v4=(LongHi);
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 459
    invoke-static {}, Lcom/kabam/billing/BillingService;->access$1()Lcom/android/vending/billing/IMarketBillingService;

    move-result-object v2

    invoke-interface {v2, v0}, Lcom/android/vending/billing/IMarketBillingService;->sendBillingRequest(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v1

    .line 460
    .local v1, response:Landroid/os/Bundle;
    #v1=(Reference);
    const-string v2, "restoreTransactions"

    invoke-virtual {p0, v2, v1}, Lcom/kabam/billing/BillingService$RestoreTransactions;->logResponseCode(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 461
    const-string v2, "REQUEST_ID"

    .line 462
    sget-wide v3, Lcom/kabam/utility/constance/Constance;->BILLING_RESPONSE_INVALID_REQUEST_ID:J

    .line 461
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    return-wide v2
.end method

*/}
