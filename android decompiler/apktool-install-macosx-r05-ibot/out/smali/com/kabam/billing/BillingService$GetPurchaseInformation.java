package com.kabam.billing; class BillingService$GetPurchaseInformation {/*

.class Lcom/kabam/billing/BillingService$GetPurchaseInformation;
.super Lcom/kabam/billing/BillingService$BillingRequest;
.source "BillingService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kabam/billing/BillingService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "GetPurchaseInformation"
.end annotation


# instance fields
.field mNonce:J

.field final mNotifyIds:[Ljava/lang/String;

.field final synthetic this$0:Lcom/kabam/billing/BillingService;


# direct methods
.method public constructor <init>(Lcom/kabam/billing/BillingService;I[Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter "startId"
    .parameter "notifyIds"

    .prologue
    .line 409
    iput-object p1, p0, Lcom/kabam/billing/BillingService$GetPurchaseInformation;->this$0:Lcom/kabam/billing/BillingService;

    .line 410
    invoke-direct {p0, p1, p2}, Lcom/kabam/billing/BillingService$BillingRequest;-><init>(Lcom/kabam/billing/BillingService;I)V

    .line 411
    #p0=(Reference);
    iput-object p3, p0, Lcom/kabam/billing/BillingService$GetPurchaseInformation;->mNotifyIds:[Ljava/lang/String;

    .line 412
    return-void
.end method


# virtual methods
.method protected onRemoteException(Landroid/os/RemoteException;)V
    .locals 2
    .parameter "e"

    .prologue
    .line 432
    invoke-super {p0, p1}, Lcom/kabam/billing/BillingService$BillingRequest;->onRemoteException(Landroid/os/RemoteException;)V

    .line 433
    iget-wide v0, p0, Lcom/kabam/billing/BillingService$GetPurchaseInformation;->mNonce:J

    #v0=(LongLo);v1=(LongHi);
    invoke-static {v0, v1}, Lcom/kabam/billing/Security;->removeNonce(J)V

    .line 434
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
    .line 417
    invoke-static {}, Lcom/kabam/billing/Security;->generateNonce()J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    iput-wide v2, p0, Lcom/kabam/billing/BillingService$GetPurchaseInformation;->mNonce:J

    .line 419
    const-string v2, "GET_PURCHASE_INFORMATION"

    #v2=(Reference);
    invoke-virtual {p0, v2}, Lcom/kabam/billing/BillingService$GetPurchaseInformation;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 420
    .local v0, request:Landroid/os/Bundle;
    #v0=(Reference);
    const-string v2, "NONCE"

    iget-wide v3, p0, Lcom/kabam/billing/BillingService$GetPurchaseInformation;->mNonce:J

    #v3=(LongLo);v4=(LongHi);
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 421
    const-string v2, "NOTIFY_IDS"

    .line 422
    iget-object v3, p0, Lcom/kabam/billing/BillingService$GetPurchaseInformation;->mNotifyIds:[Ljava/lang/String;

    .line 421
    #v3=(Reference);
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 423
    invoke-static {}, Lcom/kabam/billing/BillingService;->access$1()Lcom/android/vending/billing/IMarketBillingService;

    move-result-object v2

    invoke-interface {v2, v0}, Lcom/android/vending/billing/IMarketBillingService;->sendBillingRequest(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v1

    .line 424
    .local v1, response:Landroid/os/Bundle;
    #v1=(Reference);
    const-string v2, "getPurchaseInformation"

    invoke-virtual {p0, v2, v1}, Lcom/kabam/billing/BillingService$GetPurchaseInformation;->logResponseCode(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 425
    const-string v2, "REQUEST_ID"

    .line 426
    sget-wide v3, Lcom/kabam/utility/constance/Constance;->BILLING_RESPONSE_INVALID_REQUEST_ID:J

    .line 425
    #v3=(LongLo);
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    return-wide v2
.end method

*/}
