package com.kabam.facebook; class FacebookSender$1 {/*

.class Lcom/kabam/facebook/FacebookSender$1;
.super Ljava/lang/Object;
.source "FacebookSender.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kabam/facebook/FacebookSender;->Login()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kabam/facebook/FacebookSender;


# direct methods
.method constructor <init>(Lcom/kabam/facebook/FacebookSender;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/kabam/facebook/FacebookSender$1;->this$0:Lcom/kabam/facebook/FacebookSender;

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    const/4 v2, 0x1

    #v2=(One);
    const/4 v3, 0x0

    .line 51
    #v3=(Null);
    const/4 v4, 0x1

    :try_start_0
    #v4=(One);
    invoke-static {v4}, Lcom/kabam/utility/UnitySender;->SendLockScreen(Z)V

    .line 53
    const/4 v4, 0x5

    #v4=(PosByte);
    new-array v1, v4, [Ljava/lang/String;

    #v1=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    const-string v5, "offline_access"

    #v5=(Reference);
    aput-object v5, v1, v4

    const/4 v4, 0x1

    #v4=(One);
    const-string v5, "publish_stream"

    aput-object v5, v1, v4

    const/4 v4, 0x2

    #v4=(PosByte);
    const-string v5, "user_photos"

    aput-object v5, v1, v4

    const/4 v4, 0x3

    const-string v5, "publish_checkins"

    aput-object v5, v1, v4

    const/4 v4, 0x4

    const-string v5, "photo_upload"

    aput-object v5, v1, v4

    .line 55
    .local v1, permissions:[Ljava/lang/String;
    const-string v4, "login"

    #v4=(Reference);
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    const-string v6, "login facebook start.mFacebook==null"

    #v6=(Reference);
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    iget-object v6, p0, Lcom/kabam/facebook/FacebookSender$1;->this$0:Lcom/kabam/facebook/FacebookSender;

    invoke-static {v6}, Lcom/kabam/facebook/FacebookSender;->access$0(Lcom/kabam/facebook/FacebookSender;)Lcom/facebook/android/Facebook;

    move-result-object v6

    if-nez v6, :cond_0

    :goto_0
    #v2=(Boolean);
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    iget-object v2, p0, Lcom/kabam/facebook/FacebookSender$1;->this$0:Lcom/kabam/facebook/FacebookSender;

    invoke-static {v2}, Lcom/kabam/facebook/FacebookSender;->access$0(Lcom/kabam/facebook/FacebookSender;)Lcom/facebook/android/Facebook;

    move-result-object v2

    iget-object v3, p0, Lcom/kabam/facebook/FacebookSender$1;->this$0:Lcom/kabam/facebook/FacebookSender;

    #v3=(Reference);
    invoke-static {v3}, Lcom/kabam/facebook/FacebookSender;->access$1(Lcom/kabam/facebook/FacebookSender;)Landroid/app/Activity;

    move-result-object v3

    new-instance v4, Lcom/kabam/facebook/LoginDialogListener;

    #v4=(UninitRef);
    iget-object v5, p0, Lcom/kabam/facebook/FacebookSender$1;->this$0:Lcom/kabam/facebook/FacebookSender;

    invoke-static {v5}, Lcom/kabam/facebook/FacebookSender;->access$0(Lcom/kabam/facebook/FacebookSender;)Lcom/facebook/android/Facebook;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/kabam/facebook/LoginDialogListener;-><init>(Lcom/facebook/android/Facebook;)V

    #v4=(Reference);
    invoke-virtual {v2, v3, v1, v4}, Lcom/facebook/android/Facebook;->authorize(Landroid/app/Activity;[Ljava/lang/String;Lcom/facebook/android/Facebook$DialogListener;)V

    .line 57
    const/4 v2, 0x0

    #v2=(Null);
    invoke-static {v2}, Lcom/kabam/utility/UnitySender;->SendLockScreen(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .end local v1           #permissions:[Ljava/lang/String;
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Reference);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-void

    .restart local v1       #permissions:[Ljava/lang/String;
    :cond_0
    #v0=(Uninit);v1=(Reference);v2=(One);v3=(Null);v4=(Reference);v5=(Reference);v6=(Reference);
    move v2, v3

    .line 55
    #v2=(Null);
    goto :goto_0

    .line 59
    .end local v1           #permissions:[Ljava/lang/String;
    :catch_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Reference);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    move-exception v0

    .line 61
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    .line 62
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/kabam/utility/constance/Constance;->Facebook:I

    #v3=(Integer);
    invoke-static {v2, v3}, Lcom/kabam/utility/UnitySender;->SendLoginFailedMessage(Ljava/lang/String;I)V

    .line 63
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/kabam/utility/constance/Constance;->Facebook:I

    invoke-static {v2, v3}, Lcom/kabam/utility/UnitySender;->SendErrorMessage(Ljava/lang/String;I)V

    goto :goto_1
.end method

*/}
