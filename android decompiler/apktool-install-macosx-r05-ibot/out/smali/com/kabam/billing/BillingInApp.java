package com.kabam.billing; class BillingInApp {/*

.class public Lcom/kabam/billing/BillingInApp;
.super Ljava/lang/Object;
.source "BillingInApp.java"


# static fields
.field private static sInstance:Lcom/kabam/billing/BillingInApp;


# instance fields
.field private mActivity:Landroid/app/Activity;

.field private mService:Lcom/kabam/billing/BillingService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 15
    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/kabam/billing/BillingInApp;->sInstance:Lcom/kabam/billing/BillingInApp;

    .line 10
    return-void
.end method

.method private constructor <init>(Landroid/app/Activity;)V
    .locals 2
    .parameter "activity"

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/kabam/billing/BillingInApp;->mActivity:Landroid/app/Activity;

    .line 13
    new-instance v0, Lcom/kabam/billing/BillingService;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/kabam/billing/BillingService;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/billing/BillingInApp;->mService:Lcom/kabam/billing/BillingService;

    .line 23
    iput-object p1, p0, Lcom/kabam/billing/BillingInApp;->mActivity:Landroid/app/Activity;

    .line 24
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideGooglePlayV3()Lcom/kabam/billing/GooglePlayV3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/billing/GooglePlayV3;->IsSupportV3()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 26
    iget-object v0, p0, Lcom/kabam/billing/BillingInApp;->mService:Lcom/kabam/billing/BillingService;

    #v0=(Reference);
    iget-object v1, p0, Lcom/kabam/billing/BillingInApp;->mActivity:Landroid/app/Activity;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/kabam/billing/BillingService;->setContext(Landroid/content/Context;)V

    .line 27
    iget-object v0, p0, Lcom/kabam/billing/BillingInApp;->mService:Lcom/kabam/billing/BillingService;

    invoke-virtual {v0}, Lcom/kabam/billing/BillingService;->bindToMarketBillingService()Z

    .line 36
    :goto_0
    return-void

    .line 31
    :cond_0
    #v0=(Boolean);v1=(Uninit);
    iget-object v0, p0, Lcom/kabam/billing/BillingInApp;->mService:Lcom/kabam/billing/BillingService;

    #v0=(Reference);
    iget-object v1, p0, Lcom/kabam/billing/BillingInApp;->mActivity:Landroid/app/Activity;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/kabam/billing/BillingService;->setContext(Landroid/content/Context;)V

    .line 34
    iget-object v0, p0, Lcom/kabam/billing/BillingInApp;->mService:Lcom/kabam/billing/BillingService;

    invoke-virtual {v0}, Lcom/kabam/billing/BillingService;->bindToMarketBillingService()Z

    goto :goto_0
.end method

.method public static Create(Landroid/app/Activity;)V
    .locals 1
    .parameter "activity"

    .prologue
    .line 39
    new-instance v0, Lcom/kabam/billing/BillingInApp;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/kabam/billing/BillingInApp;-><init>(Landroid/app/Activity;)V

    #v0=(Reference);
    sput-object v0, Lcom/kabam/billing/BillingInApp;->sInstance:Lcom/kabam/billing/BillingInApp;

    .line 40
    return-void
.end method

.method public static Instance()Lcom/kabam/billing/BillingInApp;
    .locals 1

    .prologue
    .line 18
    sget-object v0, Lcom/kabam/billing/BillingInApp;->sInstance:Lcom/kabam/billing/BillingInApp;

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public BuyProduct(Ljava/lang/String;)Z
    .locals 4
    .parameter "ProductID"

    .prologue
    const/4 v0, 0x0

    .line 45
    #v0=(Null);
    const-string v1, "native"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "begin purchase and product id is "

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kabam/utility/Provider;->ProvideGooglePlayV3()Lcom/kabam/billing/GooglePlayV3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kabam/billing/GooglePlayV3;->IsSupportV3()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    .line 49
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideGooglePlayV3()Lcom/kabam/billing/GooglePlayV3;

    move-result-object v0

    iget-object v1, p0, Lcom/kabam/billing/BillingInApp;->mActivity:Landroid/app/Activity;

    #v1=(Reference);
    invoke-virtual {v0, v1, p1}, Lcom/kabam/billing/GooglePlayV3;->Buy(Landroid/app/Activity;Ljava/lang/String;)V

    .line 50
    const/4 v0, 0x1

    .line 58
    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);
    return v0

    .line 54
    :cond_1
    #v0=(Null);v1=(Boolean);v3=(Reference);
    iget-object v1, p0, Lcom/kabam/billing/BillingInApp;->mService:Lcom/kabam/billing/BillingService;

    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 55
    invoke-virtual {p0}, Lcom/kabam/billing/BillingInApp;->CheckSupported()V

    .line 56
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "supported:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v3

    invoke-virtual {v3}, Lcom/kabam/utility/Provider;->IsSupported()Z

    move-result v3

    #v3=(Boolean);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/String;)V

    .line 57
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kabam/utility/Provider;->IsSupported()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 58
    iget-object v0, p0, Lcom/kabam/billing/BillingInApp;->mService:Lcom/kabam/billing/BillingService;

    #v0=(Reference);
    const-string v1, "inapp"

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v0, p1, v1, v2}, Lcom/kabam/billing/BillingService;->requestPurchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public CheckPackages()V
    .locals 2

    .prologue
    .line 118
    :try_start_0
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/kabam/utility/Provider;->ProvideGooglePlayV3()Lcom/kabam/billing/GooglePlayV3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kabam/billing/GooglePlayV3;->CheckPackages()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 125
    :goto_0
    #v0=(Conflicted);
    return-void

    .line 121
    :catch_0
    move-exception v0

    .line 123
    .local v0, e:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public CheckSupported()V
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/kabam/billing/BillingInApp;->mService:Lcom/kabam/billing/BillingService;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/billing/BillingService;->checkBillingSupported()Z

    .line 64
    return-void
.end method

.method public Confirm(Ljava/lang/String;)V
    .locals 5
    .parameter "notificationID"

    .prologue
    .line 69
    const-string v2, "Confirm called by unity."

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    const-string v4, "notificationID="

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kabam/utility/Provider;->ProvideInventory()Lcom/kabam/playv3/Inventory;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/kabam/playv3/Inventory;->getPurchase(Ljava/lang/String;)Lcom/kabam/playv3/Purchase;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 74
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kabam/utility/Provider;->ProvideGooglePlayV3()Lcom/kabam/billing/GooglePlayV3;

    move-result-object v2

    iget-object v3, p0, Lcom/kabam/billing/BillingInApp;->mActivity:Landroid/app/Activity;

    invoke-virtual {v2, p1, v3}, Lcom/kabam/billing/GooglePlayV3;->Consume(Ljava/lang/String;Landroid/app/Activity;)V

    .line 91
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    .line 82
    :cond_1
    #v0=(Uninit);v1=(Uninit);
    iget-object v2, p0, Lcom/kabam/billing/BillingInApp;->mActivity:Landroid/app/Activity;

    if-eqz v2, :cond_0

    .line 84
    const/4 v2, 0x1

    #v2=(One);
    new-array v1, v2, [Ljava/lang/String;

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    aput-object p1, v1, v2

    .line 85
    .local v1, notifyIds:[Ljava/lang/String;
    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    const-string v2, "CONFIRM_NOTIFICATION"

    #v2=(Reference);
    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 86
    .local v0, indent:Landroid/content/Intent;
    #v0=(Reference);
    const-string v2, "notification_id"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 87
    iget-object v2, p0, Lcom/kabam/billing/BillingInApp;->mActivity:Landroid/app/Activity;

    const-class v3, Lcom/kabam/billing/BillingService;

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 88
    iget-object v2, p0, Lcom/kabam/billing/BillingInApp;->mActivity:Landroid/app/Activity;

    invoke-virtual {v2, v0}, Landroid/app/Activity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0
.end method

.method public GetPurchase()V
    .locals 1

    .prologue
    .line 95
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideGooglePlayV3()Lcom/kabam/billing/GooglePlayV3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/billing/GooglePlayV3;->IsSupportV3()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 96
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideGooglePlayV3()Lcom/kabam/billing/GooglePlayV3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/billing/GooglePlayV3;->GetPurchase()V

    .line 97
    :cond_0
    #v0=(Conflicted);
    return-void
.end method

.method public IsSupportV3()Z
    .locals 1

    .prologue
    .line 129
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideGooglePlayV3()Lcom/kabam/billing/GooglePlayV3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/billing/GooglePlayV3;->IsSupportV3()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public SetProductPackages(Ljava/lang/String;)V
    .locals 3
    .parameter "json"

    .prologue
    .line 107
    const-string v0, "json"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "json is "

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    invoke-static {p1}, Lcom/kabam/billing/AndroidJSONParser;->Create(Ljava/lang/String;)Lcom/kabam/billing/AndroidJSONParser;

    .line 112
    return-void
.end method

.method public UnBind()V
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/kabam/billing/BillingInApp;->mService:Lcom/kabam/billing/BillingService;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/billing/BillingService;->unbind()V

    .line 136
    return-void
.end method

*/}
