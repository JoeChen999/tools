package com.kabam.billing; class BillingService$CheckBillingSupported {/*

.class Lcom/kabam/billing/BillingService$CheckBillingSupported;
.super Lcom/kabam/billing/BillingService$BillingRequest;
.source "BillingService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kabam/billing/BillingService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "CheckBillingSupported"
.end annotation


# instance fields
.field public mProductType:Ljava/lang/String;

.field final synthetic this$0:Lcom/kabam/billing/BillingService;


# direct methods
.method public constructor <init>(Lcom/kabam/billing/BillingService;)V
    .locals 1
    .parameter
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 216
    iput-object p1, p0, Lcom/kabam/billing/BillingService$CheckBillingSupported;->this$0:Lcom/kabam/billing/BillingService;

    .line 220
    const/4 v0, -0x1

    #v0=(Byte);
    invoke-direct {p0, p1, v0}, Lcom/kabam/billing/BillingService$BillingRequest;-><init>(Lcom/kabam/billing/BillingService;I)V

    .line 205
    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/kabam/billing/BillingService$CheckBillingSupported;->mProductType:Ljava/lang/String;

    .line 221
    return-void
.end method

.method public constructor <init>(Lcom/kabam/billing/BillingService;Ljava/lang/String;)V
    .locals 1
    .parameter
    .parameter "itemType"

    .prologue
    .line 237
    iput-object p1, p0, Lcom/kabam/billing/BillingService$CheckBillingSupported;->this$0:Lcom/kabam/billing/BillingService;

    .line 238
    const/4 v0, -0x1

    #v0=(Byte);
    invoke-direct {p0, p1, v0}, Lcom/kabam/billing/BillingService$BillingRequest;-><init>(Lcom/kabam/billing/BillingService;I)V

    .line 205
    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/kabam/billing/BillingService$CheckBillingSupported;->mProductType:Ljava/lang/String;

    .line 239
    iput-object p2, p0, Lcom/kabam/billing/BillingService$CheckBillingSupported;->mProductType:Ljava/lang/String;

    .line 240
    return-void
.end method


# virtual methods
.method protected run()J
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 245
    const-string v4, "CHECK_BILLING_SUPPORTED"

    #v4=(Reference);
    invoke-virtual {p0, v4}, Lcom/kabam/billing/BillingService$CheckBillingSupported;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    .line 246
    .local v1, request:Landroid/os/Bundle;
    #v1=(Reference);
    iget-object v4, p0, Lcom/kabam/billing/BillingService$CheckBillingSupported;->mProductType:Ljava/lang/String;

    if-eqz v4, :cond_0

    .line 248
    const-string v4, "ITEM_TYPE"

    .line 249
    iget-object v5, p0, Lcom/kabam/billing/BillingService$CheckBillingSupported;->mProductType:Ljava/lang/String;

    .line 248
    #v5=(Reference);
    invoke-virtual {v1, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    :cond_0
    #v5=(Conflicted);
    invoke-static {}, Lcom/kabam/billing/BillingService;->access$1()Lcom/android/vending/billing/IMarketBillingService;

    move-result-object v4

    invoke-interface {v4, v1}, Lcom/android/vending/billing/IMarketBillingService;->sendBillingRequest(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v2

    .line 253
    .local v2, response:Landroid/os/Bundle;
    #v2=(Reference);
    const-string v4, "RESPONSE_CODE"

    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    .line 256
    .local v3, responseCode:I
    #v3=(Integer);
    const-string v4, "BillingService"

    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    const-string v6, "CheckBillingSupported response code: "

    #v6=(Reference);
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    invoke-static {v3}, Lcom/kabam/utility/constance/Constance$ResponseCode;->valueOf(I)Lcom/kabam/utility/constance/Constance$ResponseCode;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 258
    sget-object v4, Lcom/kabam/utility/constance/Constance$ResponseCode;->RESULT_OK:Lcom/kabam/utility/constance/Constance$ResponseCode;

    invoke-virtual {v4}, Lcom/kabam/utility/constance/Constance$ResponseCode;->ordinal()I

    move-result v4

    #v4=(Integer);
    if-ne v3, v4, :cond_1

    const/4 v0, 0x1

    .line 259
    .local v0, billingSupported:Z
    :goto_0
    #v0=(Boolean);
    iget-object v4, p0, Lcom/kabam/billing/BillingService$CheckBillingSupported;->mProductType:Ljava/lang/String;

    #v4=(Reference);
    invoke-static {v0, v4}, Lcom/kabam/billing/ResponseHandler;->checkBillingSupportedResponse(ZLjava/lang/String;)V

    .line 260
    sget-wide v4, Lcom/kabam/utility/constance/Constance;->BILLING_RESPONSE_INVALID_REQUEST_ID:J

    #v4=(LongLo);v5=(LongHi);
    return-wide v4

    .line 258
    .end local v0           #billingSupported:Z
    :cond_1
    #v0=(Uninit);v4=(Integer);v5=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

*/}
