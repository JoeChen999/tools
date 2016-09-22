package com.kabam.billing; class BillingService$BillingRequest {/*

.class abstract Lcom/kabam/billing/BillingService$BillingRequest;
.super Ljava/lang/Object;
.source "BillingService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kabam/billing/BillingService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "BillingRequest"
.end annotation


# instance fields
.field protected mRequestId:J

.field private final mStartId:I

.field final synthetic this$0:Lcom/kabam/billing/BillingService;


# direct methods
.method public constructor <init>(Lcom/kabam/billing/BillingService;I)V
    .locals 0
    .parameter
    .parameter "startId"

    .prologue
    .line 73
    iput-object p1, p0, Lcom/kabam/billing/BillingService$BillingRequest;->this$0:Lcom/kabam/billing/BillingService;

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    #p0=(Reference);
    iput p2, p0, Lcom/kabam/billing/BillingService$BillingRequest;->mStartId:I

    .line 75
    return-void
.end method


# virtual methods
.method public getStartId()I
    .locals 1

    .prologue
    .line 79
    iget v0, p0, Lcom/kabam/billing/BillingService$BillingRequest;->mStartId:I

    #v0=(Integer);
    return v0
.end method

.method protected logResponseCode(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 4
    .parameter "method"
    .parameter "response"

    .prologue
    .line 186
    .line 187
    const-string v1, "RESPONSE_CODE"

    #v1=(Reference);
    invoke-virtual {p2, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    .line 186
    #v1=(Integer);
    invoke-static {v1}, Lcom/kabam/utility/constance/Constance$ResponseCode;->valueOf(I)Lcom/kabam/utility/constance/Constance$ResponseCode;

    move-result-object v0

    .line 189
    .local v0, responseCode:Lcom/kabam/utility/constance/Constance$ResponseCode;
    #v0=(Reference);
    const-string v1, "BillingService"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    const-string v3, " received "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/kabam/utility/constance/Constance$ResponseCode;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 191
    return-void
.end method

.method protected makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 3
    .parameter "method"

    .prologue
    .line 175
    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 176
    .local v0, request:Landroid/os/Bundle;
    #v0=(Reference);
    const-string v1, "BILLING_REQUEST"

    #v1=(Reference);
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    const-string v1, "API_VERSION"

    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 178
    const-string v1, "PACKAGE_NAME"

    .line 179
    iget-object v2, p0, Lcom/kabam/billing/BillingService$BillingRequest;->this$0:Lcom/kabam/billing/BillingService;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/kabam/billing/BillingService;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 178
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    return-object v0
.end method

.method protected onRemoteException(Landroid/os/RemoteException;)V
    .locals 2
    .parameter "e"

    .prologue
    .line 150
    const-string v0, "BillingService"

    #v0=(Reference);
    const-string v1, "remote billing service crashed"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {v0}, Lcom/kabam/billing/BillingService;->access$3(Lcom/android/vending/billing/IMarketBillingService;)V

    .line 152
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/kabam/utility/Provider;->OnSendPaymentException(Ljava/lang/Exception;)V

    .line 153
    return-void
.end method

.method protected responseCodeReceived(Lcom/kabam/utility/constance/Constance$ResponseCode;)V
    .locals 0
    .parameter "responseCode"

    .prologue
    .line 171
    return-void
.end method

.method protected abstract run()J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public runIfConnected()Z
    .locals 5

    .prologue
    .line 114
    const-string v1, "BillingService"

    #v1=(Reference);
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    invoke-static {}, Lcom/kabam/billing/BillingService;->access$1()Lcom/android/vending/billing/IMarketBillingService;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 119
    :try_start_0
    invoke-virtual {p0}, Lcom/kabam/billing/BillingService$BillingRequest;->run()J

    move-result-wide v1

    #v1=(LongLo);v2=(LongHi);
    iput-wide v1, p0, Lcom/kabam/billing/BillingService$BillingRequest;->mRequestId:J

    .line 122
    const-string v1, "BillingService"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "request id: "

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    iget-wide v3, p0, Lcom/kabam/billing/BillingService$BillingRequest;->mRequestId:J

    #v3=(LongLo);v4=(LongHi);
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 125
    iget-wide v1, p0, Lcom/kabam/billing/BillingService$BillingRequest;->mRequestId:J

    #v1=(LongLo);v2=(LongHi);
    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    #v1=(Byte);
    if-ltz v1, :cond_0

    .line 127
    invoke-static {}, Lcom/kabam/billing/BillingService;->access$2()Ljava/util/HashMap;

    move-result-object v1

    #v1=(Reference);
    iget-wide v2, p0, Lcom/kabam/billing/BillingService$BillingRequest;->mRequestId:J

    #v2=(LongLo);v3=(LongHi);
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v1, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    :cond_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    const/4 v1, 0x1

    .line 137
    :goto_0
    #v0=(Conflicted);v1=(Boolean);v4=(Conflicted);
    return v1

    .line 132
    :catch_0
    #v0=(Uninit);v1=(Conflicted);
    move-exception v0

    .line 134
    .local v0, e:Landroid/os/RemoteException;
    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/kabam/billing/BillingService$BillingRequest;->onRemoteException(Landroid/os/RemoteException;)V

    .line 137
    .end local v0           #e:Landroid/os/RemoteException;
    :cond_1
    #v0=(Conflicted);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0
.end method

.method public runRequest()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 90
    #v0=(One);
    invoke-virtual {p0}, Lcom/kabam/billing/BillingService$BillingRequest;->runIfConnected()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 101
    :goto_0
    #v0=(Boolean);v1=(Conflicted);
    return v0

    .line 95
    :cond_0
    #v0=(One);v1=(Boolean);
    iget-object v1, p0, Lcom/kabam/billing/BillingService$BillingRequest;->this$0:Lcom/kabam/billing/BillingService;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/kabam/billing/BillingService;->bindToMarketBillingService()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    .line 98
    invoke-static {}, Lcom/kabam/billing/BillingService;->access$0()Ljava/util/LinkedList;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, p0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 101
    :cond_1
    #v1=(Boolean);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

*/}
