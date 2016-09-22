package com.kabam.facebook; class FacebookSender {/*

.class public Lcom/kabam/facebook/FacebookSender;
.super Ljava/lang/Object;
.source "FacebookSender.java"


# instance fields
.field private mActivity:Landroid/app/Activity;

.field private mFacebook:Lcom/facebook/android/Facebook;

.field private mPermissions:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 3
    .parameter "activity"
    .parameter "appID"

    .prologue
    const/4 v1, 0x0

    .line 22
    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    #p0=(Reference);
    iput-object v1, p0, Lcom/kabam/facebook/FacebookSender;->mFacebook:Lcom/facebook/android/Facebook;

    .line 18
    iput-object v1, p0, Lcom/kabam/facebook/FacebookSender;->mActivity:Landroid/app/Activity;

    .line 19
    iput-object v1, p0, Lcom/kabam/facebook/FacebookSender;->mPermissions:[Ljava/lang/String;

    .line 26
    :try_start_0
    iput-object p1, p0, Lcom/kabam/facebook/FacebookSender;->mActivity:Landroid/app/Activity;

    .line 27
    new-instance v1, Lcom/facebook/android/Facebook;

    #v1=(UninitRef);
    invoke-direct {v1, p2}, Lcom/facebook/android/Facebook;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/kabam/facebook/FacebookSender;->mFacebook:Lcom/facebook/android/Facebook;

    .line 28
    iget-object v1, p0, Lcom/kabam/facebook/FacebookSender;->mFacebook:Lcom/facebook/android/Facebook;

    invoke-virtual {v1, p1}, Lcom/facebook/android/Facebook;->publishInstall(Landroid/content/Context;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    .line 31
    :catch_0
    #v0=(Uninit);v1=(Conflicted);v2=(Uninit);
    move-exception v0

    .line 33
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    sget v2, Lcom/kabam/utility/constance/Constance;->Facebook:I

    #v2=(Integer);
    invoke-static {v1, v2}, Lcom/kabam/utility/UnitySender;->SendErrorMessage(Ljava/lang/String;I)V

    goto :goto_0
.end method

.method static synthetic access$0(Lcom/kabam/facebook/FacebookSender;)Lcom/facebook/android/Facebook;
    .locals 1
    .parameter

    .prologue
    .line 17
    iget-object v0, p0, Lcom/kabam/facebook/FacebookSender;->mFacebook:Lcom/facebook/android/Facebook;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$1(Lcom/kabam/facebook/FacebookSender;)Landroid/app/Activity;
    .locals 1
    .parameter

    .prologue
    .line 18
    iget-object v0, p0, Lcom/kabam/facebook/FacebookSender;->mActivity:Landroid/app/Activity;

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public AuthorizeCallBack(IILandroid/content/Intent;)V
    .locals 1
    .parameter "requestCode"
    .parameter "resultCode"
    .parameter "data"

    .prologue
    .line 128
    iget-object v0, p0, Lcom/kabam/facebook/FacebookSender;->mFacebook:Lcom/facebook/android/Facebook;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 129
    iget-object v0, p0, Lcom/kabam/facebook/FacebookSender;->mFacebook:Lcom/facebook/android/Facebook;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/android/Facebook;->authorizeCallback(IILandroid/content/Intent;)V

    .line 130
    :cond_0
    return-void
.end method

.method public IsLoginFacebook()Z
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/kabam/facebook/FacebookSender;->mFacebook:Lcom/facebook/android/Facebook;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/facebook/android/Facebook;->isSessionValid()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public Login()Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 39
    #v1=(One);
    iget-object v2, p0, Lcom/kabam/facebook/FacebookSender;->mFacebook:Lcom/facebook/android/Facebook;

    #v2=(Reference);
    if-nez v2, :cond_1

    .line 40
    const/4 v1, 0x0

    .line 69
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);
    return v1

    .line 41
    :cond_1
    #v0=(Uninit);v1=(One);v2=(Reference);
    iget-object v2, p0, Lcom/kabam/facebook/FacebookSender;->mFacebook:Lcom/facebook/android/Facebook;

    invoke-virtual {v2}, Lcom/facebook/android/Facebook;->isSessionValid()Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    .line 44
    new-instance v0, Lcom/kabam/facebook/FacebookSender$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/kabam/facebook/FacebookSender$1;-><init>(Lcom/kabam/facebook/FacebookSender;)V

    .line 68
    .local v0, action:Ljava/lang/Runnable;
    #v0=(Reference);
    iget-object v2, p0, Lcom/kabam/facebook/FacebookSender;->mActivity:Landroid/app/Activity;

    #v2=(Reference);
    invoke-virtual {v2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public LoginOut()Z
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 73
    #v2=(Null);
    iget-object v3, p0, Lcom/kabam/facebook/FacebookSender;->mFacebook:Lcom/facebook/android/Facebook;

    #v3=(Reference);
    if-nez v3, :cond_1

    .line 88
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);
    return v2

    .line 75
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Reference);
    iget-object v3, p0, Lcom/kabam/facebook/FacebookSender;->mFacebook:Lcom/facebook/android/Facebook;

    invoke-virtual {v3}, Lcom/facebook/android/Facebook;->isSessionValid()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_0

    .line 79
    :try_start_0
    new-instance v0, Lcom/facebook/android/AsyncFacebookRunner;

    #v0=(UninitRef);
    iget-object v2, p0, Lcom/kabam/facebook/FacebookSender;->mFacebook:Lcom/facebook/android/Facebook;

    #v2=(Reference);
    invoke-direct {v0, v2}, Lcom/facebook/android/AsyncFacebookRunner;-><init>(Lcom/facebook/android/Facebook;)V

    .line 80
    .local v0, asyncRunner:Lcom/facebook/android/AsyncFacebookRunner;
    #v0=(Reference);
    iget-object v2, p0, Lcom/kabam/facebook/FacebookSender;->mActivity:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getBaseContext()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Lcom/kabam/facebook/LogoutRequestListener;

    #v3=(UninitRef);
    invoke-direct {v3}, Lcom/kabam/facebook/LogoutRequestListener;-><init>()V

    #v3=(Reference);
    invoke-virtual {v0, v2, v3}, Lcom/facebook/android/AsyncFacebookRunner;->logout(Landroid/content/Context;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .end local v0           #asyncRunner:Lcom/facebook/android/AsyncFacebookRunner;
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
    const/4 v2, 0x1

    #v2=(One);
    goto :goto_0

    .line 83
    :catch_0
    #v1=(Uninit);v2=(Reference);
    move-exception v1

    .line 85
    .local v1, ex:Ljava/lang/Exception;
    #v1=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    .line 86
    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/kabam/utility/constance/Constance;->Facebook:I

    #v3=(Integer);
    invoke-static {v2, v3}, Lcom/kabam/utility/UnitySender;->SendErrorMessage(Ljava/lang/String;I)V

    goto :goto_1
.end method

.method public SendMessage(Ljava/lang/String;)V
    .locals 2
    .parameter "message"

    .prologue
    .line 99
    new-instance v0, Lcom/kabam/facebook/FacebookSender$2;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p1}, Lcom/kabam/facebook/FacebookSender$2;-><init>(Lcom/kabam/facebook/FacebookSender;Ljava/lang/String;)V

    .line 124
    .local v0, action:Ljava/lang/Runnable;
    #v0=(Reference);
    iget-object v1, p0, Lcom/kabam/facebook/FacebookSender;->mActivity:Landroid/app/Activity;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 125
    return-void
.end method

*/}
