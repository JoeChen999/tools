package com.kabam.billing; class PurchaseObserver {/*

.class public abstract Lcom/kabam/billing/PurchaseObserver;
.super Ljava/lang/Object;
.source "PurchaseObserver.java"


# static fields
.field private static final START_INTENT_SENDER_SIG:[Ljava/lang/Class; = null

.field private static final TAG:Ljava/lang/String; = "PurchaseObserver"


# instance fields
.field private final mActivity:Landroid/app/Activity;

.field private final mHandler:Landroid/os/Handler;

.field private mStartIntentSender:Ljava/lang/reflect/Method;

.field private mStartIntentSenderArgs:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 39
    const/4 v0, 0x5

    #v0=(PosByte);
    new-array v0, v0, [Ljava/lang/Class;

    #v0=(Reference);
    const/4 v1, 0x0

    .line 40
    #v1=(Null);
    const-class v2, Landroid/content/IntentSender;

    #v2=(Reference);
    aput-object v2, v0, v1

    const/4 v1, 0x1

    #v1=(One);
    const-class v2, Landroid/content/Intent;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    #v1=(PosByte);
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v0, v1

    .line 37
    sput-object v0, Lcom/kabam/billing/PurchaseObserver;->START_INTENT_SENDER_SIG:[Ljava/lang/Class;

    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Landroid/os/Handler;)V
    .locals 1
    .parameter "activity"
    .parameter "handler"

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    #p0=(Reference);
    const/4 v0, 0x5

    #v0=(PosByte);
    new-array v0, v0, [Ljava/lang/Object;

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/billing/PurchaseObserver;->mStartIntentSenderArgs:[Ljava/lang/Object;

    .line 45
    iput-object p1, p0, Lcom/kabam/billing/PurchaseObserver;->mActivity:Landroid/app/Activity;

    .line 46
    iput-object p2, p0, Lcom/kabam/billing/PurchaseObserver;->mHandler:Landroid/os/Handler;

    .line 47
    invoke-direct {p0}, Lcom/kabam/billing/PurchaseObserver;->initCompatibilityLayer()V

    .line 48
    return-void
.end method

.method private initCompatibilityLayer()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 113
    :try_start_0
    #v4=(Null);
    iget-object v1, p0, Lcom/kabam/billing/PurchaseObserver;->mActivity:Landroid/app/Activity;

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "startIntentSender"

    .line 114
    #v2=(Reference);
    sget-object v3, Lcom/kabam/billing/PurchaseObserver;->START_INTENT_SENDER_SIG:[Ljava/lang/Class;

    .line 113
    #v3=(Reference);
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lcom/kabam/billing/PurchaseObserver;->mStartIntentSender:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1

    .line 124
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    .line 116
    :catch_0
    #v0=(Uninit);
    move-exception v0

    .line 118
    .local v0, e:Ljava/lang/SecurityException;
    #v0=(Reference);
    iput-object v4, p0, Lcom/kabam/billing/PurchaseObserver;->mStartIntentSender:Ljava/lang/reflect/Method;

    goto :goto_0

    .line 120
    .end local v0           #e:Ljava/lang/SecurityException;
    :catch_1
    #v0=(Uninit);
    move-exception v0

    .line 122
    .local v0, e:Ljava/lang/NoSuchMethodException;
    #v0=(Reference);
    iput-object v4, p0, Lcom/kabam/billing/PurchaseObserver;->mStartIntentSender:Ljava/lang/reflect/Method;

    goto :goto_0
.end method


# virtual methods
.method public abstract onBillingSupported(ZLjava/lang/String;)V
.end method

.method public abstract onPurchaseStateChange(Lcom/kabam/utility/constance/Constance$PurchaseState;Ljava/lang/String;IJLjava/lang/String;)V
.end method

.method public abstract onRequestPurchaseResponse(Lcom/kabam/billing/BillingService$RequestPurchase;Lcom/kabam/utility/constance/Constance$ResponseCode;)V
.end method

.method public abstract onRestoreTransactionsResponse(Lcom/kabam/billing/BillingService$RestoreTransactions;Lcom/kabam/utility/constance/Constance$ResponseCode;)V
.end method

.method postPurchaseStateChange(Lcom/kabam/utility/constance/Constance$PurchaseState;Ljava/lang/String;IJLjava/lang/String;)V
    .locals 9
    .parameter "purchaseState"
    .parameter "itemId"
    .parameter "quantity"
    .parameter "purchaseTime"
    .parameter "developerPayload"

    .prologue
    .line 178
    iget-object v8, p0, Lcom/kabam/billing/PurchaseObserver;->mHandler:Landroid/os/Handler;

    #v8=(Reference);
    new-instance v0, Lcom/kabam/billing/PurchaseObserver$1;

    #v0=(UninitRef);
    move-object v1, p0

    #v1=(Reference);
    move-object v2, p1

    #v2=(Reference);
    move-object v3, p2

    #v3=(Reference);
    move v4, p3

    #v4=(Integer);
    move-wide v5, p4

    #v5=(LongLo);v6=(LongHi);
    move-object v7, p6

    #v7=(Reference);
    invoke-direct/range {v0 .. v7}, Lcom/kabam/billing/PurchaseObserver$1;-><init>(Lcom/kabam/billing/PurchaseObserver;Lcom/kabam/utility/constance/Constance$PurchaseState;Ljava/lang/String;IJLjava/lang/String;)V

    #v0=(Reference);
    invoke-virtual {v8, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 187
    return-void
.end method

.method startBuyPageActivity(Landroid/app/PendingIntent;Landroid/content/Intent;)V
    .locals 6
    .parameter "pendingIntent"
    .parameter "intent"

    .prologue
    const/4 v1, 0x1

    #v1=(One);
    const/4 v2, 0x0

    .line 128
    #v2=(Null);
    const-string v3, "PurchaseObserver"

    #v3=(Reference);
    const-string v4, "startBuyPageActivity begins."

    #v4=(Reference);
    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    iget-object v3, p0, Lcom/kabam/billing/PurchaseObserver;->mStartIntentSender:Ljava/lang/reflect/Method;

    if-eqz v3, :cond_1

    .line 140
    :try_start_0
    iget-object v3, p0, Lcom/kabam/billing/PurchaseObserver;->mStartIntentSenderArgs:[Ljava/lang/Object;

    const/4 v4, 0x0

    #v4=(Null);
    invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v3, v4

    .line 141
    iget-object v3, p0, Lcom/kabam/billing/PurchaseObserver;->mStartIntentSenderArgs:[Ljava/lang/Object;

    const/4 v4, 0x1

    #v4=(One);
    aput-object p2, v3, v4

    .line 142
    iget-object v3, p0, Lcom/kabam/billing/PurchaseObserver;->mStartIntentSenderArgs:[Ljava/lang/Object;

    const/4 v4, 0x2

    #v4=(PosByte);
    const/4 v5, 0x0

    #v5=(Null);
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v3, v4

    .line 143
    iget-object v3, p0, Lcom/kabam/billing/PurchaseObserver;->mStartIntentSenderArgs:[Ljava/lang/Object;

    const/4 v4, 0x3

    const/4 v5, 0x0

    #v5=(Null);
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v3, v4

    .line 144
    iget-object v3, p0, Lcom/kabam/billing/PurchaseObserver;->mStartIntentSenderArgs:[Ljava/lang/Object;

    const/4 v4, 0x4

    const/4 v5, 0x0

    #v5=(Null);
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v3, v4

    .line 145
    const-string v3, "PurchaseObserver"

    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    const-string v5, "starting activity"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    iget-object v5, p0, Lcom/kabam/billing/PurchaseObserver;->mStartIntentSender:Ljava/lang/reflect/Method;

    if-nez v5, :cond_0

    :goto_0
    #v1=(Boolean);
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    iget-object v1, p0, Lcom/kabam/billing/PurchaseObserver;->mStartIntentSender:Ljava/lang/reflect/Method;

    iget-object v2, p0, Lcom/kabam/billing/PurchaseObserver;->mActivity:Landroid/app/Activity;

    #v2=(Reference);
    iget-object v3, p0, Lcom/kabam/billing/PurchaseObserver;->mStartIntentSenderArgs:[Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 165
    :goto_1
    #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void

    :cond_0
    #v0=(Uninit);v1=(One);v2=(Null);v4=(Reference);v5=(Reference);
    move v1, v2

    .line 145
    #v1=(Null);
    goto :goto_0

    .line 148
    :catch_0
    #v1=(Conflicted);v2=(Reference);v4=(Conflicted);v5=(Conflicted);
    move-exception v0

    .line 150
    .local v0, e:Ljava/lang/Exception;
    #v0=(Reference);
    const-string v1, "PurchaseObserver"

    #v1=(Reference);
    const-string v2, "error starting activity"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 162
    .end local v0           #e:Ljava/lang/Exception;
    :cond_1
    #v0=(Uninit);v1=(One);v2=(Null);v4=(Reference);v5=(Uninit);
    const-string v1, "PurchaseObserver"

    #v1=(Reference);
    const-string v2, "error starting activity"

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-static {v1, v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

*/}
