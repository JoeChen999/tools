package com.kabam.facebook; class LoginDialogListener {/*

.class public Lcom/kabam/facebook/LoginDialogListener;
.super Ljava/lang/Object;
.source "LoginDialogListener.java"

# interfaces
.implements Lcom/facebook/android/Facebook$DialogListener;


# instance fields
.field private mFacebook:Lcom/facebook/android/Facebook;


# direct methods
.method public constructor <init>(Lcom/facebook/android/Facebook;)V
    .locals 1
    .parameter "facebook"

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/kabam/facebook/LoginDialogListener;->mFacebook:Lcom/facebook/android/Facebook;

    .line 24
    iput-object p1, p0, Lcom/kabam/facebook/LoginDialogListener;->mFacebook:Lcom/facebook/android/Facebook;

    .line 25
    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 2

    .prologue
    .line 64
    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {v0}, Lcom/kabam/utility/UnitySender;->SendLockScreen(Z)V

    .line 66
    const-string v0, "login "

    #v0=(Reference);
    const-string v1, "canceled"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    return-void
.end method

.method public onComplete(Landroid/os/Bundle;)V
    .locals 4
    .parameter "values"

    .prologue
    .line 30
    const/4 v2, 0x1

    #v2=(One);
    invoke-static {v2}, Lcom/kabam/utility/UnitySender;->SendLockScreen(Z)V

    .line 32
    const-string v2, "login "

    #v2=(Reference);
    const-string v3, "start"

    #v3=(Reference);
    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    new-instance v0, Lcom/facebook/android/AsyncFacebookRunner;

    #v0=(UninitRef);
    iget-object v2, p0, Lcom/kabam/facebook/LoginDialogListener;->mFacebook:Lcom/facebook/android/Facebook;

    invoke-direct {v0, v2}, Lcom/facebook/android/AsyncFacebookRunner;-><init>(Lcom/facebook/android/Facebook;)V

    .line 34
    .local v0, asyncRunner:Lcom/facebook/android/AsyncFacebookRunner;
    #v0=(Reference);
    new-instance v1, Landroid/os/Bundle;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 35
    .local v1, params:Landroid/os/Bundle;
    #v1=(Reference);
    const-string v2, "method"

    const-string v3, "fql.query"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    const-string v2, "query"

    const-string v3, "select uid,sex,birthday_date,first_name,last_name from user where uid = me()"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    const/4 v2, 0x0

    #v2=(Null);
    new-instance v3, Lcom/kabam/facebook/FQLRequestListener;

    #v3=(UninitRef);
    invoke-direct {v3}, Lcom/kabam/facebook/FQLRequestListener;-><init>()V

    #v3=(Reference);
    invoke-virtual {v0, v2, v1, v3}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;)V

    .line 38
    const-string v2, "login "

    #v2=(Reference);
    const-string v3, "success"

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    return-void
.end method

.method public onError(Lcom/facebook/android/DialogError;)V
    .locals 2
    .parameter "e"

    .prologue
    .line 54
    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {v0}, Lcom/kabam/utility/UnitySender;->SendLockScreen(Z)V

    .line 55
    const-string v0, "login "

    #v0=(Reference);
    const-string v1, "failed"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    sget-object v0, Lcom/kabam/utility/constance/Constance;->FacebookLoginDenied:Ljava/lang/String;

    sget v1, Lcom/kabam/utility/constance/Constance;->Facebook:I

    #v1=(Integer);
    invoke-static {v0, v1}, Lcom/kabam/utility/UnitySender;->SendErrorMessage(Ljava/lang/String;I)V

    .line 58
    invoke-virtual {p1}, Lcom/facebook/android/DialogError;->printStackTrace()V

    .line 59
    return-void
.end method

.method public onFacebookError(Lcom/facebook/android/FacebookError;)V
    .locals 2
    .parameter "e"

    .prologue
    .line 44
    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {v0}, Lcom/kabam/utility/UnitySender;->SendLockScreen(Z)V

    .line 46
    const-string v0, "login "

    #v0=(Reference);
    const-string v1, "failed"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    sget-object v0, Lcom/kabam/utility/constance/Constance;->FacebookLoginDenied:Ljava/lang/String;

    sget v1, Lcom/kabam/utility/constance/Constance;->Facebook:I

    #v1=(Integer);
    invoke-static {v0, v1}, Lcom/kabam/utility/UnitySender;->SendErrorMessage(Ljava/lang/String;I)V

    .line 48
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    .line 49
    return-void
.end method

*/}
