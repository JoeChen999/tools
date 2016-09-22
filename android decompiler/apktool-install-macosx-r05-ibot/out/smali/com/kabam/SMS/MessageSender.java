package com.kabam.SMS; class MessageSender {/*

.class public Lcom/kabam/SMS/MessageSender;
.super Ljava/lang/Object;
.source "MessageSender.java"


# instance fields
.field private mActivity:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1
    .parameter "activity"

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/kabam/SMS/MessageSender;->mActivity:Landroid/app/Activity;

    .line 16
    iput-object p1, p0, Lcom/kabam/SMS/MessageSender;->mActivity:Landroid/app/Activity;

    .line 17
    return-void
.end method


# virtual methods
.method public SendMessage(Ljava/lang/String;)V
    .locals 6
    .parameter "message"

    .prologue
    .line 21
    iget-object v3, p0, Lcom/kabam/SMS/MessageSender;->mActivity:Landroid/app/Activity;

    #v3=(Reference);
    if-nez v3, :cond_0

    .line 43
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void

    .line 25
    :cond_0
    :try_start_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);
    const-string v3, "smsto:"

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 26
    .local v2, uri:Landroid/net/Uri;
    #v2=(Reference);
    new-instance v1, Landroid/content/Intent;

    #v1=(UninitRef);
    const-string v3, "android.intent.action.SENDTO"

    invoke-direct {v1, v3, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 27
    .local v1, intent:Landroid/content/Intent;
    #v1=(Reference);
    const-string v3, "sms_body"

    invoke-virtual {v1, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 28
    iget-object v3, p0, Lcom/kabam/SMS/MessageSender;->mActivity:Landroid/app/Activity;

    invoke-virtual {v3, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 30
    const-string v3, "0"

    sget v4, Lcom/kabam/utility/constance/Constance;->SMS:I

    #v4=(Integer);
    invoke-static {v3, v4}, Lcom/kabam/utility/UnitySender;->SendAfterInviteMessage(Ljava/lang/String;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 32
    .end local v1           #intent:Landroid/content/Intent;
    .end local v2           #uri:Landroid/net/Uri;
    :catch_0
    #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
    move-exception v0

    .line 34
    .local v0, ex:Landroid/content/ActivityNotFoundException;
    #v0=(Reference);
    sget-object v3, Lcom/kabam/utility/constance/Constance;->SMSNotSupportedKey:Ljava/lang/String;

    sget v4, Lcom/kabam/utility/constance/Constance;->SMS:I

    #v4=(Integer);
    invoke-static {v3, v4}, Lcom/kabam/utility/UnitySender;->SendErrorMessage(Ljava/lang/String;I)V

    .line 35
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0

    .line 37
    .end local v0           #ex:Landroid/content/ActivityNotFoundException;
    :catch_1
    #v0=(Uninit);v4=(Conflicted);
    move-exception v0

    .line 39
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/kabam/utility/constance/Constance;->SMS:I

    #v4=(Integer);
    invoke-static {v3, v4}, Lcom/kabam/utility/UnitySender;->SendErrorMessage(Ljava/lang/String;I)V

    .line 40
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    .line 41
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    const-string v5, "exception:"

    #v5=(Reference);
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/String;)V

    goto :goto_0
.end method

*/}
