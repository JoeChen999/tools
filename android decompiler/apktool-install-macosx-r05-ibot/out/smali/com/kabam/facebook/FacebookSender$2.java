package com.kabam.facebook; class FacebookSender$2 {/*

.class Lcom/kabam/facebook/FacebookSender$2;
.super Ljava/lang/Object;
.source "FacebookSender.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kabam/facebook/FacebookSender;->SendMessage(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kabam/facebook/FacebookSender;

.field private final synthetic val$message:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/kabam/facebook/FacebookSender;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/kabam/facebook/FacebookSender$2;->this$0:Lcom/kabam/facebook/FacebookSender;

    iput-object p2, p0, Lcom/kabam/facebook/FacebookSender$2;->val$message:Ljava/lang/String;

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 106
    const/4 v2, 0x1

    :try_start_0
    #v2=(One);
    invoke-static {v2}, Lcom/kabam/utility/UnitySender;->SendLockScreen(Z)V

    .line 107
    new-instance v1, Landroid/os/Bundle;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 108
    .local v1, params:Landroid/os/Bundle;
    #v1=(Reference);
    const-string v2, "message"

    #v2=(Reference);
    iget-object v3, p0, Lcom/kabam/facebook/FacebookSender$2;->val$message:Ljava/lang/String;

    #v3=(Reference);
    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    const-string v2, "send facebook message"

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    const-string v4, "message:"

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    iget-object v4, p0, Lcom/kabam/facebook/FacebookSender$2;->val$message:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    iget-object v2, p0, Lcom/kabam/facebook/FacebookSender$2;->this$0:Lcom/kabam/facebook/FacebookSender;

    invoke-static {v2}, Lcom/kabam/facebook/FacebookSender;->access$0(Lcom/kabam/facebook/FacebookSender;)Lcom/facebook/android/Facebook;

    move-result-object v2

    iget-object v3, p0, Lcom/kabam/facebook/FacebookSender$2;->this$0:Lcom/kabam/facebook/FacebookSender;

    invoke-static {v3}, Lcom/kabam/facebook/FacebookSender;->access$1(Lcom/kabam/facebook/FacebookSender;)Landroid/app/Activity;

    move-result-object v3

    const-string v4, "apprequests"

    new-instance v5, Lcom/kabam/facebook/AppRequestListener;

    #v5=(UninitRef);
    invoke-direct {v5}, Lcom/kabam/facebook/AppRequestListener;-><init>()V

    #v5=(Reference);
    invoke-virtual {v2, v3, v4, v1, v5}, Lcom/facebook/android/Facebook;->dialog(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/Facebook$DialogListener;)V

    .line 113
    const/4 v2, 0x0

    #v2=(Null);
    invoke-static {v2}, Lcom/kabam/utility/UnitySender;->SendLockScreen(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 120
    .end local v1           #params:Landroid/os/Bundle;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Reference);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void

    .line 115
    :catch_0
    #v0=(Uninit);v2=(Conflicted);
    move-exception v0

    .line 117
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    .line 118
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/kabam/utility/constance/Constance;->Facebook:I

    #v3=(Integer);
    invoke-static {v2, v3}, Lcom/kabam/utility/UnitySender;->SendErrorMessage(Ljava/lang/String;I)V

    goto :goto_0
.end method

*/}
