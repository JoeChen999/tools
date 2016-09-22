package com.kabam.playv3; class IabHelper$1 {/*

.class Lcom/kabam/playv3/IabHelper$1;
.super Ljava/lang/Object;
.source "IabHelper.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kabam/playv3/IabHelper;->startSetup(Lcom/kabam/playv3/IabHelper$OnIabSetupFinishedListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kabam/playv3/IabHelper;

.field private final synthetic val$listener:Lcom/kabam/playv3/IabHelper$OnIabSetupFinishedListener;


# direct methods
.method constructor <init>(Lcom/kabam/playv3/IabHelper;Lcom/kabam/playv3/IabHelper$OnIabSetupFinishedListener;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/kabam/playv3/IabHelper$1;->this$0:Lcom/kabam/playv3/IabHelper;

    iput-object p2, p0, Lcom/kabam/playv3/IabHelper$1;->val$listener:Lcom/kabam/playv3/IabHelper$OnIabSetupFinishedListener;

    .line 219
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 7
    .parameter "name"
    .parameter "service"

    .prologue
    .line 231
    iget-object v3, p0, Lcom/kabam/playv3/IabHelper$1;->this$0:Lcom/kabam/playv3/IabHelper;

    #v3=(Reference);
    const-string v4, "Billing service connected."

    #v4=(Reference);
    invoke-virtual {v3, v4}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 232
    iget-object v3, p0, Lcom/kabam/playv3/IabHelper$1;->this$0:Lcom/kabam/playv3/IabHelper;

    invoke-static {p2}, Lcom/android/vending/billing/IInAppBillingService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/android/vending/billing/IInAppBillingService;

    move-result-object v4

    iput-object v4, v3, Lcom/kabam/playv3/IabHelper;->mService:Lcom/android/vending/billing/IInAppBillingService;

    .line 233
    iget-object v3, p0, Lcom/kabam/playv3/IabHelper$1;->this$0:Lcom/kabam/playv3/IabHelper;

    iget-object v3, v3, Lcom/kabam/playv3/IabHelper;->mContext:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 236
    .local v1, packageName:Ljava/lang/String;
    :try_start_0
    #v1=(Reference);
    iget-object v3, p0, Lcom/kabam/playv3/IabHelper$1;->this$0:Lcom/kabam/playv3/IabHelper;

    const-string v4, "Checking for in-app billing 3 support."

    invoke-virtual {v3, v4}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 237
    iget-object v3, p0, Lcom/kabam/playv3/IabHelper$1;->this$0:Lcom/kabam/playv3/IabHelper;

    iget-object v3, v3, Lcom/kabam/playv3/IabHelper;->mService:Lcom/android/vending/billing/IInAppBillingService;

    const/4 v4, 0x3

    #v4=(PosByte);
    const-string v5, "inapp"

    #v5=(Reference);
    invoke-interface {v3, v4, v1, v5}, Lcom/android/vending/billing/IInAppBillingService;->isBillingSupported(ILjava/lang/String;Ljava/lang/String;)I

    move-result v2

    .line 238
    .local v2, response:I
    #v2=(Integer);
    if-eqz v2, :cond_1

    .line 240
    iget-object v3, p0, Lcom/kabam/playv3/IabHelper$1;->val$listener:Lcom/kabam/playv3/IabHelper$OnIabSetupFinishedListener;

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/kabam/playv3/IabHelper$1;->val$listener:Lcom/kabam/playv3/IabHelper$OnIabSetupFinishedListener;

    new-instance v4, Lcom/kabam/playv3/IabResult;

    #v4=(UninitRef);
    const-string v5, "Error checking for billing v3 support."

    invoke-direct {v4, v2, v5}, Lcom/kabam/playv3/IabResult;-><init>(ILjava/lang/String;)V

    #v4=(Reference);
    invoke-interface {v3, v4}, Lcom/kabam/playv3/IabHelper$OnIabSetupFinishedListener;->onIabSetupFinished(Lcom/kabam/playv3/IabResult;)V

    .line 260
    .end local v2           #response:I
    :cond_0
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-void

    .line 243
    .restart local v2       #response:I
    :cond_1
    #v0=(Uninit);v2=(Integer);v4=(PosByte);v5=(Reference);v6=(Uninit);
    iget-object v3, p0, Lcom/kabam/playv3/IabHelper$1;->this$0:Lcom/kabam/playv3/IabHelper;

    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    const-string v5, "In-app billing version 3 supported for "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 244
    iget-object v3, p0, Lcom/kabam/playv3/IabHelper$1;->this$0:Lcom/kabam/playv3/IabHelper;

    const/4 v4, 0x1

    #v4=(One);
    iput-boolean v4, v3, Lcom/kabam/playv3/IabHelper;->mSetupDone:Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 256
    .end local v2           #response:I
    :goto_1
    #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    iget-object v3, p0, Lcom/kabam/playv3/IabHelper$1;->val$listener:Lcom/kabam/playv3/IabHelper$OnIabSetupFinishedListener;

    if-eqz v3, :cond_0

    .line 258
    iget-object v3, p0, Lcom/kabam/playv3/IabHelper$1;->val$listener:Lcom/kabam/playv3/IabHelper$OnIabSetupFinishedListener;

    new-instance v4, Lcom/kabam/playv3/IabResult;

    #v4=(UninitRef);
    const/4 v5, 0x0

    #v5=(Null);
    const-string v6, "Setup successful."

    #v6=(Reference);
    invoke-direct {v4, v5, v6}, Lcom/kabam/playv3/IabResult;-><init>(ILjava/lang/String;)V

    #v4=(Reference);
    invoke-interface {v3, v4}, Lcom/kabam/playv3/IabHelper$OnIabSetupFinishedListener;->onIabSetupFinished(Lcom/kabam/playv3/IabResult;)V

    goto :goto_0

    .line 246
    :catch_0
    #v0=(Uninit);v4=(Conflicted);v5=(Conflicted);v6=(Uninit);
    move-exception v0

    .line 248
    .local v0, e:Landroid/os/RemoteException;
    #v0=(Reference);
    iget-object v3, p0, Lcom/kabam/playv3/IabHelper$1;->val$listener:Lcom/kabam/playv3/IabHelper$OnIabSetupFinishedListener;

    if-eqz v3, :cond_2

    .line 250
    iget-object v3, p0, Lcom/kabam/playv3/IabHelper$1;->val$listener:Lcom/kabam/playv3/IabHelper$OnIabSetupFinishedListener;

    new-instance v4, Lcom/kabam/playv3/IabResult;

    #v4=(UninitRef);
    const/16 v5, -0x3e9

    .line 251
    #v5=(Short);
    const-string v6, "RemoteException while setting up in-app billing."

    #v6=(Reference);
    invoke-direct {v4, v5, v6}, Lcom/kabam/playv3/IabResult;-><init>(ILjava/lang/String;)V

    .line 250
    #v4=(Reference);
    invoke-interface {v3, v4}, Lcom/kabam/playv3/IabHelper$OnIabSetupFinishedListener;->onIabSetupFinished(Lcom/kabam/playv3/IabResult;)V

    .line 253
    :cond_2
    #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    goto :goto_1
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2
    .parameter "name"

    .prologue
    .line 224
    iget-object v0, p0, Lcom/kabam/playv3/IabHelper$1;->this$0:Lcom/kabam/playv3/IabHelper;

    #v0=(Reference);
    const-string v1, "Billing service disconnected."

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 225
    iget-object v0, p0, Lcom/kabam/playv3/IabHelper$1;->this$0:Lcom/kabam/playv3/IabHelper;

    const/4 v1, 0x0

    #v1=(Null);
    iput-object v1, v0, Lcom/kabam/playv3/IabHelper;->mService:Lcom/android/vending/billing/IInAppBillingService;

    .line 226
    return-void
.end method

*/}
