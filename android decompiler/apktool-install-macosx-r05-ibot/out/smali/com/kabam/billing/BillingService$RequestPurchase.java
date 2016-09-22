package com.kabam.billing; class BillingService$RequestPurchase {/*

.class Lcom/kabam/billing/BillingService$RequestPurchase;
.super Lcom/kabam/billing/BillingService$BillingRequest;
.source "BillingService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kabam/billing/BillingService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "RequestPurchase"
.end annotation


# instance fields
.field public final mDeveloperPayload:Ljava/lang/String;

.field public final mProductId:Ljava/lang/String;

.field public final mProductType:Ljava/lang/String;

.field final synthetic this$0:Lcom/kabam/billing/BillingService;


# direct methods
.method public constructor <init>(Lcom/kabam/billing/BillingService;Ljava/lang/String;)V
    .locals 1
    .parameter
    .parameter "itemId"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 281
    #v0=(Null);
    invoke-direct {p0, p1, p2, v0, v0}, Lcom/kabam/billing/BillingService$RequestPurchase;-><init>(Lcom/kabam/billing/BillingService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Lcom/kabam/billing/BillingService;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .parameter
    .parameter "itemId"
    .parameter "developerPayload"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 295
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, p2, v0, p3}, Lcom/kabam/billing/BillingService$RequestPurchase;-><init>(Lcom/kabam/billing/BillingService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Lcom/kabam/billing/BillingService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .parameter
    .parameter "itemId"
    .parameter "itemType"
    .parameter "developerPayload"

    .prologue
    .line 314
    iput-object p1, p0, Lcom/kabam/billing/BillingService$RequestPurchase;->this$0:Lcom/kabam/billing/BillingService;

    .line 318
    const/4 v0, -0x1

    #v0=(Byte);
    invoke-direct {p0, p1, v0}, Lcom/kabam/billing/BillingService$BillingRequest;-><init>(Lcom/kabam/billing/BillingService;I)V

    .line 319
    #p0=(Reference);
    iput-object p2, p0, Lcom/kabam/billing/BillingService$RequestPurchase;->mProductId:Ljava/lang/String;

    .line 320
    iput-object p4, p0, Lcom/kabam/billing/BillingService$RequestPurchase;->mDeveloperPayload:Ljava/lang/String;

    .line 321
    iput-object p3, p0, Lcom/kabam/billing/BillingService$RequestPurchase;->mProductType:Ljava/lang/String;

    .line 322
    return-void
.end method


# virtual methods
.method protected responseCodeReceived(Lcom/kabam/utility/constance/Constance$ResponseCode;)V
    .locals 1
    .parameter "responseCode"

    .prologue
    .line 368
    iget-object v0, p0, Lcom/kabam/billing/BillingService$RequestPurchase;->this$0:Lcom/kabam/billing/BillingService;

    #v0=(Reference);
    invoke-static {v0, p0, p1}, Lcom/kabam/billing/ResponseHandler;->responseCodeReceived(Landroid/content/Context;Lcom/kabam/billing/BillingService$RequestPurchase;Lcom/kabam/utility/constance/Constance$ResponseCode;)V

    .line 370
    return-void
.end method

.method protected run()J
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 326
    const-string v0, "REQUEST_PURCHASE"

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/kabam/billing/BillingService$RequestPurchase;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v8

    .line 327
    .local v8, request:Landroid/os/Bundle;
    #v8=(Reference);
    const-string v0, "ITEM_ID"

    iget-object v1, p0, Lcom/kabam/billing/BillingService$RequestPurchase;->mProductId:Ljava/lang/String;

    #v1=(Reference);
    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    const-string v0, "ITEM_TYPE"

    iget-object v1, p0, Lcom/kabam/billing/BillingService$RequestPurchase;->mProductType:Ljava/lang/String;

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    iget-object v0, p0, Lcom/kabam/billing/BillingService$RequestPurchase;->mDeveloperPayload:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 333
    const-string v0, "DEVELOPER_PAYLOAD"

    .line 334
    iget-object v1, p0, Lcom/kabam/billing/BillingService$RequestPurchase;->mDeveloperPayload:Ljava/lang/String;

    .line 333
    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 336
    :cond_0
    invoke-static {}, Lcom/kabam/billing/BillingService;->access$1()Lcom/android/vending/billing/IMarketBillingService;

    move-result-object v0

    invoke-interface {v0, v8}, Lcom/android/vending/billing/IMarketBillingService;->sendBillingRequest(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v9

    .line 337
    .local v9, response:Landroid/os/Bundle;
    #v9=(Reference);
    const-string v0, "PURCHASE_INTENT"

    invoke-virtual {v9, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v7

    #v7=(Reference);
    check-cast v7, Landroid/app/PendingIntent;

    .line 338
    .local v7, pendingIntent:Landroid/app/PendingIntent;
    if-nez v7, :cond_1

    .line 341
    const-string v0, "BillingService"

    const-string v1, "Error with requestPurchase"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 342
    sget-wide v0, Lcom/kabam/utility/constance/Constance;->BILLING_RESPONSE_INVALID_REQUEST_ID:J

    .line 363
    :goto_0
    #v0=(LongLo);v1=(LongHi);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-wide v0

    .line 346
    :cond_1
    #v0=(Reference);v1=(Reference);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    const-string v0, "BillingService"

    const-string v1, "pending with requestPurchase"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 348
    new-instance v2, Landroid/content/Intent;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 353
    .local v2, intent:Landroid/content/Intent;
    :try_start_0
    #v2=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->GetActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v7}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v1

    const/4 v3, 0x0

    #v3=(Null);
    const/4 v4, 0x0

    #v4=(Null);
    const/4 v5, 0x0

    #v5=(Null);
    invoke-virtual/range {v0 .. v5}, Landroid/app/Activity;->startIntentSender(Landroid/content/IntentSender;Landroid/content/Intent;III)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 361
    :goto_1
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    const-string v0, "BillingService"

    const-string v1, "launch ui is over."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 363
    const-string v0, "REQUEST_ID"

    sget-wide v3, Lcom/kabam/utility/constance/Constance;->BILLING_RESPONSE_INVALID_REQUEST_ID:J

    #v3=(LongLo);v4=(LongHi);
    invoke-virtual {v9, v0, v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    goto :goto_0

    .line 355
    :catch_0
    #v0=(Reference);v1=(Reference);v3=(Conflicted);v4=(Conflicted);v6=(Uninit);
    move-exception v6

    .line 357
    .local v6, e:Landroid/content/IntentSender$SendIntentException;
    #v6=(Reference);
    invoke-virtual {v6}, Landroid/content/IntentSender$SendIntentException;->printStackTrace()V

    .line 358
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/kabam/utility/Provider;->OnSendPaymentException(Ljava/lang/Exception;)V

    goto :goto_1
.end method

*/}
