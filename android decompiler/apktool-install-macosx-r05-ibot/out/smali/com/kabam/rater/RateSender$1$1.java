package com.kabam.rater; class RateSender$1$1 {/*

.class Lcom/kabam/rater/RateSender$1$1;
.super Ljava/lang/Object;
.source "RateSender.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kabam/rater/RateSender$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/kabam/rater/RateSender$1;

.field private final synthetic val$activity:Landroid/app/Activity;

.field private final synthetic val$dialog:Landroid/app/Dialog;

.field private final synthetic val$url:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/kabam/rater/RateSender$1;Ljava/lang/String;Landroid/app/Activity;Landroid/app/Dialog;)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/kabam/rater/RateSender$1$1;->this$1:Lcom/kabam/rater/RateSender$1;

    iput-object p2, p0, Lcom/kabam/rater/RateSender$1$1;->val$url:Ljava/lang/String;

    iput-object p3, p0, Lcom/kabam/rater/RateSender$1$1;->val$activity:Landroid/app/Activity;

    iput-object p4, p0, Lcom/kabam/rater/RateSender$1$1;->val$dialog:Landroid/app/Dialog;

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .parameter "v"

    .prologue
    .line 107
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    iget-object v2, p0, Lcom/kabam/rater/RateSender$1$1;->val$url:Ljava/lang/String;

    #v2=(Reference);
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    const-string v2, "b1"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/kabam/rater/RateSender;->access$2(Ljava/lang/String;)V

    .line 108
    iget-object v1, p0, Lcom/kabam/rater/RateSender$1$1;->val$activity:Landroid/app/Activity;

    new-instance v2, Landroid/content/Intent;

    #v2=(UninitRef);
    const-string v3, "android.intent.action.VIEW"

    #v3=(Reference);
    iget-object v4, p0, Lcom/kabam/rater/RateSender$1$1;->val$url:Ljava/lang/String;

    #v4=(Reference);
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 109
    iget-object v1, p0, Lcom/kabam/rater/RateSender$1$1;->val$dialog:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    .line 111
    :catch_0
    move-exception v0

    .line 113
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 114
    iget-object v1, p0, Lcom/kabam/rater/RateSender$1$1;->val$dialog:Landroid/app/Dialog;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    goto :goto_0
.end method

*/}
