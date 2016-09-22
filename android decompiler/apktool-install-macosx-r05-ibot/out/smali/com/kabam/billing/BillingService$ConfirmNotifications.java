package com.kabam.billing; class BillingService$ConfirmNotifications {/*

.class Lcom/kabam/billing/BillingService$ConfirmNotifications;
.super Lcom/kabam/billing/BillingService$BillingRequest;
.source "BillingService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kabam/billing/BillingService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ConfirmNotifications"
.end annotation


# instance fields
.field final mNotifyIds:[Ljava/lang/String;

.field final synthetic this$0:Lcom/kabam/billing/BillingService;


# direct methods
.method public constructor <init>(Lcom/kabam/billing/BillingService;I[Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter "startId"
    .parameter "notifyIds"

    .prologue
    .line 381
    iput-object p1, p0, Lcom/kabam/billing/BillingService$ConfirmNotifications;->this$0:Lcom/kabam/billing/BillingService;

    .line 382
    invoke-direct {p0, p1, p2}, Lcom/kabam/billing/BillingService$BillingRequest;-><init>(Lcom/kabam/billing/BillingService;I)V

    .line 383
    #p0=(Reference);
    iput-object p3, p0, Lcom/kabam/billing/BillingService$ConfirmNotifications;->mNotifyIds:[Ljava/lang/String;

    .line 384
    return-void
.end method


# virtual methods
.method protected run()J
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 389
    const-string v2, "CONFIRM_NOTIFICATIONS"

    #v2=(Reference);
    invoke-virtual {p0, v2}, Lcom/kabam/billing/BillingService$ConfirmNotifications;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 390
    .local v0, request:Landroid/os/Bundle;
    #v0=(Reference);
    const-string v2, "NOTIFY_IDS"

    .line 391
    iget-object v3, p0, Lcom/kabam/billing/BillingService$ConfirmNotifications;->mNotifyIds:[Ljava/lang/String;

    .line 390
    #v3=(Reference);
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 392
    invoke-static {}, Lcom/kabam/billing/BillingService;->access$1()Lcom/android/vending/billing/IMarketBillingService;

    move-result-object v2

    invoke-interface {v2, v0}, Lcom/android/vending/billing/IMarketBillingService;->sendBillingRequest(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v1

    .line 393
    .local v1, response:Landroid/os/Bundle;
    #v1=(Reference);
    const-string v2, "confirmNotifications"

    invoke-virtual {p0, v2, v1}, Lcom/kabam/billing/BillingService$ConfirmNotifications;->logResponseCode(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 394
    const-string v2, "REQUEST_ID"

    .line 395
    sget-wide v3, Lcom/kabam/utility/constance/Constance;->BILLING_RESPONSE_INVALID_REQUEST_ID:J

    .line 394
    #v3=(LongLo);v4=(LongHi);
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    return-wide v2
.end method

*/}
