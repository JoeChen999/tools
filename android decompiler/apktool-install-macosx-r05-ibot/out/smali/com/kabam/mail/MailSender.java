package com.kabam.mail; class MailSender {/*

.class public Lcom/kabam/mail/MailSender;
.super Ljava/lang/Object;
.source "MailSender.java"


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
    iput-object v0, p0, Lcom/kabam/mail/MailSender;->mActivity:Landroid/app/Activity;

    .line 16
    iput-object p1, p0, Lcom/kabam/mail/MailSender;->mActivity:Landroid/app/Activity;

    .line 17
    return-void
.end method


# virtual methods
.method public SendMail(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .parameter "subject"
    .parameter "message"

    .prologue
    .line 21
    iget-object v2, p0, Lcom/kabam/mail/MailSender;->mActivity:Landroid/app/Activity;

    #v2=(Reference);
    if-nez v2, :cond_0

    .line 38
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
    return-void

    .line 25
    :cond_0
    :try_start_0
    #v0=(Uninit);v1=(Uninit);v3=(Uninit);
    new-instance v1, Landroid/content/Intent;

    #v1=(UninitRef);
    const-string v2, "android.intent.action.SEND"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 26
    .local v1, intent:Landroid/content/Intent;
    #v1=(Reference);
    const-string v2, "plain/text"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 27
    const-string v2, "android.intent.extra.SUBJECT"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 28
    const-string v2, "android.intent.extra.TEXT"

    invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 29
    iget-object v2, p0, Lcom/kabam/mail/MailSender;->mActivity:Landroid/app/Activity;

    const-string v3, "Sending mail..."

    #v3=(Reference);
    invoke-static {v1, v3}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 30
    const-string v2, "0"

    sget v3, Lcom/kabam/utility/constance/Constance;->EMail:I

    #v3=(Integer);
    invoke-static {v2, v3}, Lcom/kabam/utility/UnitySender;->SendAfterInviteMessage(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 33
    .end local v1           #intent:Landroid/content/Intent;
    :catch_0
    #v1=(Conflicted);v3=(Conflicted);
    move-exception v0

    .line 35
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/kabam/utility/constance/Constance;->EMail:I

    #v3=(Integer);
    invoke-static {v2, v3}, Lcom/kabam/utility/UnitySender;->SendErrorMessage(Ljava/lang/String;I)V

    .line 36
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

*/}
