package com.kabam.billing; class BillingService {/*

.class public Lcom/kabam/billing/BillingService;
.super Landroid/app/Service;
.source "BillingService.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kabam/billing/BillingService$BillingRequest;,
        Lcom/kabam/billing/BillingService$CheckBillingSupported;,
        Lcom/kabam/billing/BillingService$ConfirmNotifications;,
        Lcom/kabam/billing/BillingService$GetPurchaseInformation;,
        Lcom/kabam/billing/BillingService$RequestPurchase;,
        Lcom/kabam/billing/BillingService$RestoreTransactions;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "BillingService"

.field private static mPendingRequests:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Lcom/kabam/billing/BillingService$BillingRequest;",
            ">;"
        }
    .end annotation
.end field

.field private static mSentRequests:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Long;",
            "Lcom/kabam/billing/BillingService$BillingRequest;",
            ">;"
        }
    .end annotation
.end field

.field private static mService:Lcom/android/vending/billing/IMarketBillingService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 50
    new-instance v0, Ljava/util/LinkedList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/kabam/billing/BillingService;->mPendingRequests:Ljava/util/LinkedList;

    .line 57
    new-instance v0, Ljava/util/HashMap;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/kabam/billing/BillingService;->mSentRequests:Ljava/util/HashMap;

    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 482
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 483
    #p0=(Reference);
    return-void
.end method

.method static synthetic access$0()Ljava/util/LinkedList;
    .locals 1

    .prologue
    .line 50
    sget-object v0, Lcom/kabam/billing/BillingService;->mPendingRequests:Ljava/util/LinkedList;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$1()Lcom/android/vending/billing/IMarketBillingService;
    .locals 1

    .prologue
    .line 44
    sget-object v0, Lcom/kabam/billing/BillingService;->mService:Lcom/android/vending/billing/IMarketBillingService;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$2()Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 57
    sget-object v0, Lcom/kabam/billing/BillingService;->mSentRequests:Ljava/util/HashMap;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$3(Lcom/android/vending/billing/IMarketBillingService;)V
    .locals 0
    .parameter

    .prologue
    .line 44
    sput-object p0, Lcom/kabam/billing/BillingService;->mService:Lcom/android/vending/billing/IMarketBillingService;

    return-void
.end method

.method private checkResponseCode(JLcom/kabam/utility/constance/Constance$ResponseCode;)V
    .locals 4
    .parameter "requestId"
    .parameter "responseCode"

    .prologue
    .line 822
    sget-object v1, Lcom/kabam/billing/BillingService;->mSentRequests:Ljava/util/HashMap;

    #v1=(Reference);
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/kabam/billing/BillingService$BillingRequest;

    .line 823
    .local v0, request:Lcom/kabam/billing/BillingService$BillingRequest;
    if-eqz v0, :cond_0

    .line 827
    const-string v1, "BillingService"

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 828
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 827
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 830
    invoke-virtual {v0, p3}, Lcom/kabam/billing/BillingService$BillingRequest;->responseCodeReceived(Lcom/kabam/utility/constance/Constance$ResponseCode;)V

    .line 832
    :cond_0
    #v3=(Conflicted);
    sget-object v1, Lcom/kabam/billing/BillingService;->mSentRequests:Ljava/util/HashMap;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 833
    return-void
.end method

.method private getPurchaseInformation(I[Ljava/lang/String;)Z
    .locals 3
    .parameter "startId"
    .parameter "notifyIds"

    .prologue
    const/4 v2, 0x0

    .line 779
    #v2=(Null);
    const-string v0, "add before"

    #v0=(Reference);
    aget-object v1, p2, v2

    #v1=(Null);
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 780
    if-eqz p2, :cond_0

    aget-object v0, p2, v2

    #v0=(Null);
    if-eqz v0, :cond_0

    .line 781
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideNotificationManager()Lcom/kabam/billing/NotificationManager;

    move-result-object v0

    aget-object v1, p2, v2

    invoke-virtual {v0, v1}, Lcom/kabam/billing/NotificationManager;->Add(Ljava/lang/String;)Z

    .line 783
    :cond_0
    const-string v0, "add end"

    aget-object v1, p2, v2

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 784
    new-instance v0, Lcom/kabam/billing/BillingService$GetPurchaseInformation;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p1, p2}, Lcom/kabam/billing/BillingService$GetPurchaseInformation;-><init>(Lcom/kabam/billing/BillingService;I[Ljava/lang/String;)V

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/billing/BillingService$GetPurchaseInformation;->runRequest()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method private purchaseStateChanged(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .parameter "startId"
    .parameter "signedData"
    .parameter "signature"

    .prologue
    .line 802
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0, p1, p2, p3, p0}, Lcom/kabam/utility/Provider;->purchaseStateChanged(ILjava/lang/String;Ljava/lang/String;Lcom/kabam/billing/BillingService;)V

    .line 803
    return-void
.end method

.method private runPendingRequests()V
    .locals 5

    .prologue
    .line 841
    const/4 v0, -0x1

    .line 843
    .local v0, maxStartId:I
    :cond_0
    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
    sget-object v2, Lcom/kabam/billing/BillingService;->mPendingRequests:Ljava/util/LinkedList;

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/util/LinkedList;->peek()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Lcom/kabam/billing/BillingService$BillingRequest;

    .local v1, request:Lcom/kabam/billing/BillingService$BillingRequest;
    if-nez v1, :cond_2

    .line 869
    if-ltz v0, :cond_1

    .line 873
    const-string v2, "BillingService"

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    const-string v4, "stopping service, startId: "

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 875
    invoke-virtual {p0, v0}, Lcom/kabam/billing/BillingService;->stopSelf(I)V

    .line 877
    :cond_1
    :goto_1
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    .line 845
    :cond_2
    #v2=(Reference);v3=(Uninit);v4=(Uninit);
    invoke-virtual {v1}, Lcom/kabam/billing/BillingService$BillingRequest;->runIfConnected()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_3

    .line 848
    sget-object v2, Lcom/kabam/billing/BillingService;->mPendingRequests:Ljava/util/LinkedList;

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    .line 852
    invoke-virtual {v1}, Lcom/kabam/billing/BillingService$BillingRequest;->getStartId()I

    move-result v2

    #v2=(Integer);
    if-ge v0, v2, :cond_0

    .line 854
    invoke-virtual {v1}, Lcom/kabam/billing/BillingService$BillingRequest;->getStartId()I

    move-result v0

    goto :goto_0

    .line 861
    :cond_3
    #v2=(Boolean);
    invoke-virtual {p0}, Lcom/kabam/billing/BillingService;->bindToMarketBillingService()Z

    goto :goto_1
.end method


# virtual methods
.method public bindToMarketBillingService()Z
    .locals 5

    .prologue
    const/4 v2, 0x1

    .line 650
    :try_start_0
    #v2=(One);
    const-string v3, "BillingService"

    #v3=(Reference);
    const-string v4, "binding to Market billing service"

    #v4=(Reference);
    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 652
    new-instance v3, Landroid/content/Intent;

    .line 653
    #v3=(UninitRef);
    const-string v4, "com.android.vending.billing.MarketBillingService.BIND"

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 654
    #v3=(Reference);
    const/4 v4, 0x1

    .line 652
    #v4=(One);
    invoke-virtual {p0, v3, p0, v4}, Lcom/kabam/billing/BillingService;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    .line 656
    .local v0, bindResult:Z
    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 670
    .end local v0           #bindResult:Z
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v4=(Conflicted);
    return v2

    .line 662
    .restart local v0       #bindResult:Z
    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(One);v4=(One);
    const-string v2, "BillingService"

    #v2=(Reference);
    const-string v3, "Could not bind to service."

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 670
    .end local v0           #bindResult:Z
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);
    const/4 v2, 0x0

    #v2=(Null);
    goto :goto_0

    .line 665
    :catch_0
    #v1=(Uninit);v2=(Conflicted);v3=(Conflicted);
    move-exception v1

    .line 667
    .local v1, e:Ljava/lang/SecurityException;
    #v1=(Reference);
    const-string v2, "BillingService"

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    const-string v4, "Security exception: "

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 668
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/kabam/utility/Provider;->OnSendPaymentException(Ljava/lang/Exception;)V

    goto :goto_1
.end method

.method public checkBillingSupported()Z
    .locals 1

    .prologue
    .line 681
    new-instance v0, Lcom/kabam/billing/BillingService$CheckBillingSupported;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/kabam/billing/BillingService$CheckBillingSupported;-><init>(Lcom/kabam/billing/BillingService;)V

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/billing/BillingService$CheckBillingSupported;->runRequest()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public checkBillingSupported(Ljava/lang/String;)Z
    .locals 1
    .parameter "itemType"

    .prologue
    .line 694
    new-instance v0, Lcom/kabam/billing/BillingService$CheckBillingSupported;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p1}, Lcom/kabam/billing/BillingService$CheckBillingSupported;-><init>(Lcom/kabam/billing/BillingService;Ljava/lang/String;)V

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/billing/BillingService$CheckBillingSupported;->runRequest()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public confirmNotifications(I[Ljava/lang/String;)Z
    .locals 3
    .parameter "startId"
    .parameter "notifyIds"

    .prologue
    const/4 v2, 0x0

    .line 753
    #v2=(Null);
    const-string v0, "Remove before"

    #v0=(Reference);
    aget-object v1, p2, v2

    #v1=(Null);
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 754
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideNotificationManager()Lcom/kabam/billing/NotificationManager;

    move-result-object v0

    aget-object v1, p2, v2

    invoke-virtual {v0, v1}, Lcom/kabam/billing/NotificationManager;->Remove(Ljava/lang/String;)Z

    .line 756
    const-string v0, "Remove end"

    aget-object v1, p2, v2

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 757
    new-instance v0, Lcom/kabam/billing/BillingService$ConfirmNotifications;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p1, p2}, Lcom/kabam/billing/BillingService$ConfirmNotifications;-><init>(Lcom/kabam/billing/BillingService;I[Ljava/lang/String;)V

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/billing/BillingService$ConfirmNotifications;->runRequest()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public handleCommand(Landroid/content/Intent;I)V
    .locals 15
    .parameter "intent"
    .parameter "startId"

    .prologue
    .line 521
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 523
    .local v1, action:Ljava/lang/String;
    #v1=(Reference);
    const-string v12, "BillingService"

    #v12=(Reference);
    new-instance v13, Ljava/lang/StringBuilder;

    #v13=(UninitRef);
    const-string v14, "handleCommand() action: "

    #v14=(Reference);
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v13=(Reference);
    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 525
    const-string v12, "CONFIRM_NOTIFICATION"

    invoke-virtual {v12, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v12

    #v12=(Boolean);
    if-eqz v12, :cond_2

    .line 529
    :try_start_1
    const-string v12, "notification_id"

    #v12=(Reference);
    move-object/from16 v0, p1

    #v0=(Reference);
    invoke-virtual {v0, v12}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 530
    .local v5, notifyIds:[Ljava/lang/String;
    #v5=(Reference);
    move/from16 v0, p2

    #v0=(Integer);
    invoke-virtual {p0, v0, v5}, Lcom/kabam/billing/BillingService;->confirmNotifications(I[Ljava/lang/String;)Z

    .line 533
    const-string v13, "BillingService"

    new-instance v12, Ljava/lang/StringBuilder;

    #v12=(UninitRef);
    const-string v14, "startId: "

    invoke-direct {v12, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v12=(Reference);
    move/from16 v0, p2

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v14, "notifyIds==null: "

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    if-nez v5, :cond_1

    const/4 v12, 0x1

    :goto_0
    #v12=(Boolean);
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v12

    #v12=(Reference);
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v13, v12}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 534
    const-string v12, "BillingService"

    new-instance v13, Ljava/lang/StringBuilder;

    #v13=(UninitRef);
    const-string v14, "length"

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v13=(Reference);
    array-length v14, v5

    #v14=(Integer);
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 535
    const-string v12, "BillingService"

    new-instance v13, Ljava/lang/StringBuilder;

    #v13=(UninitRef);
    const-string v14, "remove"

    #v14=(Reference);
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v13=(Reference);
    const/4 v14, 0x0

    #v14=(Null);
    aget-object v14, v5, v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 634
    .end local v1           #action:Ljava/lang/String;
    .end local v5           #notifyIds:[Ljava/lang/String;
    :cond_0
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
    return-void

    .line 533
    .restart local v1       #action:Ljava/lang/String;
    .restart local v5       #notifyIds:[Ljava/lang/String;
    :cond_1
    #v0=(Integer);v1=(Reference);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Reference);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Reference);v13=(Reference);v14=(Reference);
    const/4 v12, 0x0

    #v12=(Null);
    goto :goto_0

    .line 538
    .end local v5           #notifyIds:[Ljava/lang/String;
    :catch_0
    #v0=(Conflicted);v5=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
    move-exception v2

    .line 541
    .local v2, ex:Ljava/lang/Exception;
    :try_start_2
    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    .line 627
    .end local v1           #action:Ljava/lang/String;
    .end local v2           #ex:Ljava/lang/Exception;
    :catch_1
    move-exception v2

    .line 630
    .restart local v2       #ex:Ljava/lang/Exception;
    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    .line 546
    .end local v2           #ex:Ljava/lang/Exception;
    .restart local v1       #action:Ljava/lang/String;
    :cond_2
    :try_start_3
    #v0=(Uninit);v1=(Reference);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Boolean);v13=(Reference);v14=(Reference);
    const-string v12, "GET_PURCHASE_INFORMATION"

    #v12=(Reference);
    invoke-virtual {v12, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    move-result v12

    #v12=(Boolean);
    if-eqz v12, :cond_3

    .line 550
    :try_start_4
    const-string v12, "notification_id"

    #v12=(Reference);
    move-object/from16 v0, p1

    #v0=(Reference);
    invoke-virtual {v0, v12}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 551
    .local v4, notifyId:Ljava/lang/String;
    #v4=(Reference);
    const/4 v12, 0x1

    #v12=(One);
    new-array v12, v12, [Ljava/lang/String;

    #v12=(Reference);
    const/4 v13, 0x0

    #v13=(Null);
    aput-object v4, v12, v13

    move/from16 v0, p2

    #v0=(Integer);
    invoke-direct {p0, v0, v12}, Lcom/kabam/billing/BillingService;->getPurchaseInformation(I[Ljava/lang/String;)Z

    .line 553
    const-string v12, "BillingService"

    new-instance v13, Ljava/lang/StringBuilder;

    #v13=(UninitRef);
    const-string v14, "startId: "

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v13=(Reference);
    move/from16 v0, p2

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "notifyId: "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_1

    .line 555
    .end local v4           #notifyId:Ljava/lang/String;
    :catch_2
    #v0=(Conflicted);v4=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    move-exception v2

    .line 558
    .restart local v2       #ex:Ljava/lang/Exception;
    :try_start_5
    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    .line 563
    .end local v2           #ex:Ljava/lang/Exception;
    :cond_3
    #v0=(Uninit);v2=(Uninit);v4=(Uninit);v12=(Boolean);v13=(Reference);
    const-string v12, "com.android.vending.billing.PURCHASE_STATE_CHANGED"

    #v12=(Reference);
    invoke-virtual {v12, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    move-result v12

    #v12=(Boolean);
    if-eqz v12, :cond_4

    .line 567
    :try_start_6
    const-string v12, "inapp_signed_data"

    #v12=(Reference);
    move-object/from16 v0, p1

    #v0=(Reference);
    invoke-virtual {v0, v12}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 568
    .local v11, signedData:Ljava/lang/String;
    #v11=(Reference);
    const-string v12, "inapp_signature"

    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 569
    .local v10, signature:Ljava/lang/String;
    #v10=(Reference);
    move/from16 v0, p2

    #v0=(Integer);
    invoke-direct {p0, v0, v11, v10}, Lcom/kabam/billing/BillingService;->purchaseStateChanged(ILjava/lang/String;Ljava/lang/String;)V

    .line 571
    const-string v12, "BillingService"

    new-instance v13, Ljava/lang/StringBuilder;

    #v13=(UninitRef);
    const-string v14, "startId: "

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v13=(Reference);
    move/from16 v0, p2

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "signedData: "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "signature: "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    goto/16 :goto_1

    .line 573
    .end local v10           #signature:Ljava/lang/String;
    .end local v11           #signedData:Ljava/lang/String;
    :catch_3
    #v0=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    move-exception v2

    .line 576
    .restart local v2       #ex:Ljava/lang/Exception;
    :try_start_7
    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_1

    .line 581
    .end local v2           #ex:Ljava/lang/Exception;
    :cond_4
    #v0=(Uninit);v2=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Boolean);v13=(Reference);
    const-string v12, "com.android.vending.billing.RESPONSE_CODE"

    #v12=(Reference);
    invoke-virtual {v12, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    move-result v12

    #v12=(Boolean);
    if-eqz v12, :cond_5

    .line 585
    :try_start_8
    const-string v12, "request_id"

    #v12=(Reference);
    const-wide/16 v13, -0x1

    #v13=(LongLo);v14=(LongHi);
    move-object/from16 v0, p1

    #v0=(Reference);
    invoke-virtual {v0, v12, v13, v14}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v6

    .line 587
    .local v6, requestId:J
    #v6=(LongLo);v7=(LongHi);
    const-string v12, "response_code"

    .line 588
    sget-object v13, Lcom/kabam/utility/constance/Constance$ResponseCode;->RESULT_ERROR:Lcom/kabam/utility/constance/Constance$ResponseCode;

    #v13=(Reference);
    invoke-virtual {v13}, Lcom/kabam/utility/constance/Constance$ResponseCode;->ordinal()I

    move-result v13

    .line 586
    #v13=(Integer);
    move-object/from16 v0, p1

    invoke-virtual {v0, v12, v13}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v9

    .line 590
    .local v9, responseCodeIndex:I
    #v9=(Integer);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v12

    invoke-virtual {v12, v9}, Lcom/kabam/utility/Provider;->ProvideOnResponseCode(I)V

    .line 592
    invoke-static {v9}, Lcom/kabam/utility/constance/Constance$ResponseCode;->valueOf(I)Lcom/kabam/utility/constance/Constance$ResponseCode;

    move-result-object v8

    .line 593
    .local v8, responseCode:Lcom/kabam/utility/constance/Constance$ResponseCode;
    #v8=(Reference);
    invoke-direct {p0, v6, v7, v8}, Lcom/kabam/billing/BillingService;->checkResponseCode(JLcom/kabam/utility/constance/Constance$ResponseCode;)V

    .line 595
    const-string v12, "BillingService"

    new-instance v13, Ljava/lang/StringBuilder;

    #v13=(UninitRef);
    const-string v14, "startId: "

    #v14=(Reference);
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v13=(Reference);
    move/from16 v0, p2

    #v0=(Integer);
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "requestId: "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "responseCode: "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    goto/16 :goto_1

    .line 597
    .end local v6           #requestId:J
    .end local v8           #responseCode:Lcom/kabam/utility/constance/Constance$ResponseCode;
    .end local v9           #responseCodeIndex:I
    :catch_4
    #v0=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
    move-exception v2

    .line 600
    .restart local v2       #ex:Ljava/lang/Exception;
    :try_start_9
    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_1

    .line 605
    .end local v2           #ex:Ljava/lang/Exception;
    :cond_5
    #v0=(Uninit);v2=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v12=(Boolean);v13=(Reference);v14=(Reference);
    const-string v12, "com.android.vending.INSTALL_REFERRER"

    #v12=(Reference);
    invoke-virtual {v12, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1

    move-result v12

    #v12=(Boolean);
    if-eqz v12, :cond_0

    .line 609
    :try_start_a
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v12

    #v12=(Reference);
    move-object/from16 v0, p1

    #v0=(Reference);
    invoke-virtual {v12, v0}, Lcom/kabam/utility/Provider;->ProvideJasonString(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v3

    .line 610
    .local v3, information:Ljava/lang/String;
    #v3=(Reference);
    invoke-static {v3}, Lcom/kabam/utility/UnitySender;->SendInstallInformation(Ljava/lang/String;)V

    .line 611
    const-string v12, ""

    const-string v13, "unity sender install sent"

    invoke-static {v12, v13}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 612
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v12

    invoke-virtual {v12}, Lcom/kabam/utility/Provider;->ProvideAdwords()Lcom/kabam/ad/Adwords;

    move-result-object v12

    invoke-virtual {v12}, Lcom/kabam/ad/Adwords;->TrackInstall()V

    .line 615
    const-string v12, "BillingService"

    const-string v13, "ACTION_INSTALL_REFERRER: Arrives."

    invoke-static {v12, v13}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_5

    goto/16 :goto_1

    .line 618
    .end local v3           #information:Ljava/lang/String;
    :catch_5
    #v0=(Conflicted);v3=(Conflicted);v12=(Conflicted);
    move-exception v2

    .line 621
    .restart local v2       #ex:Ljava/lang/Exception;
    :try_start_b
    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1

    goto/16 :goto_1
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1
    .parameter "intent"

    .prologue
    .line 496
    const/4 v0, 0x0

    #v0=(Null);
    return-object v0
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2
    .parameter "name"
    .parameter "service"

    .prologue
    .line 888
    const-string v0, "BillingService"

    #v0=(Reference);
    const-string v1, "Billing service connected"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 890
    invoke-static {p2}, Lcom/android/vending/billing/IMarketBillingService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/android/vending/billing/IMarketBillingService;

    move-result-object v0

    sput-object v0, Lcom/kabam/billing/BillingService;->mService:Lcom/android/vending/billing/IMarketBillingService;

    .line 891
    invoke-direct {p0}, Lcom/kabam/billing/BillingService;->runPendingRequests()V

    .line 892
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2
    .parameter "name"

    .prologue
    .line 900
    const-string v0, "BillingService"

    #v0=(Reference);
    const-string v1, "Billing service disconnected"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 901
    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/kabam/billing/BillingService;->mService:Lcom/android/vending/billing/IMarketBillingService;

    .line 902
    return-void
.end method

.method public onStart(Landroid/content/Intent;I)V
    .locals 0
    .parameter "intent"
    .parameter "startId"

    .prologue
    .line 502
    invoke-virtual {p0, p1, p2}, Lcom/kabam/billing/BillingService;->handleCommand(Landroid/content/Intent;I)V

    .line 503
    return-void
.end method

.method public requestPurchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3
    .parameter "productId"
    .parameter "itemType"
    .parameter "developerPayload"

    .prologue
    .line 716
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-static {}, Lcom/kabam/billing/AndroidJSONParser;->Instance()Lcom/kabam/billing/AndroidJSONParser;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/kabam/billing/AndroidJSONParser;->Token()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    const-string v1, "@=>@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/kabam/billing/AndroidJSONParser;->Instance()Lcom/kabam/billing/AndroidJSONParser;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/kabam/billing/AndroidJSONParser;->PayoutID(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 718
    const-string v0, "when request purchase developerPayload="

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "when request purchase developerPayload="

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 720
    const-string v0, "when request purchase productId="

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "when request purchase productId="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 721
    new-instance v0, Lcom/kabam/billing/BillingService$RequestPurchase;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/kabam/billing/BillingService$RequestPurchase;-><init>(Lcom/kabam/billing/BillingService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/billing/BillingService$RequestPurchase;->runRequest()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public restoreTransactions()Z
    .locals 1

    .prologue
    .line 733
    new-instance v0, Lcom/kabam/billing/BillingService$RestoreTransactions;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/kabam/billing/BillingService$RestoreTransactions;-><init>(Lcom/kabam/billing/BillingService;)V

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/billing/BillingService$RestoreTransactions;->runRequest()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public setContext(Landroid/content/Context;)V
    .locals 0
    .parameter "context"

    .prologue
    .line 487
    invoke-virtual {p0, p1}, Lcom/kabam/billing/BillingService;->attachBaseContext(Landroid/content/Context;)V

    .line 488
    return-void
.end method

.method public unbind()V
    .locals 2

    .prologue
    .line 912
    :try_start_0
    invoke-virtual {p0, p0}, Lcom/kabam/billing/BillingService;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 920
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    .line 914
    :catch_0
    move-exception v0

    .line 917
    .local v0, e:Ljava/lang/IllegalArgumentException;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnSendPaymentException(Ljava/lang/Exception;)V

    .line 918
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

*/}
