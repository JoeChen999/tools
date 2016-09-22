package com.kabam.rater; class RateSender$1 {/*

.class Lcom/kabam/rater/RateSender$1;
.super Ljava/lang/Object;
.source "RateSender.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kabam/rater/RateSender;->showRateDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final synthetic val$activity:Landroid/app/Activity;

.field private final synthetic val$clientVer:Ljava/lang/String;

.field private final synthetic val$message:Ljava/lang/String;

.field private final synthetic val$noRate:Ljava/lang/String;

.field private final synthetic val$rateLater:Ljava/lang/String;

.field private final synthetic val$rateNow:Ljava/lang/String;

.field private final synthetic val$title:Ljava/lang/String;

.field private final synthetic val$url:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/kabam/rater/RateSender$1;->val$activity:Landroid/app/Activity;

    iput-object p2, p0, Lcom/kabam/rater/RateSender$1;->val$title:Ljava/lang/String;

    iput-object p3, p0, Lcom/kabam/rater/RateSender$1;->val$message:Ljava/lang/String;

    iput-object p4, p0, Lcom/kabam/rater/RateSender$1;->val$rateNow:Ljava/lang/String;

    iput-object p5, p0, Lcom/kabam/rater/RateSender$1;->val$rateLater:Ljava/lang/String;

    iput-object p6, p0, Lcom/kabam/rater/RateSender$1;->val$noRate:Ljava/lang/String;

    iput-object p7, p0, Lcom/kabam/rater/RateSender$1;->val$clientVer:Ljava/lang/String;

    iput-object p8, p0, Lcom/kabam/rater/RateSender$1;->val$url:Ljava/lang/String;

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 14

    .prologue
    const/4 v2, 0x4

    .line 85
    #v2=(PosByte);
    invoke-static {}, Lcom/kabam/rater/RateSender;->access$0()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 151
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    return-void

    .line 87
    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
    new-instance v11, Landroid/app/Dialog;

    #v11=(UninitRef);
    iget-object v0, p0, Lcom/kabam/rater/RateSender$1;->val$activity:Landroid/app/Activity;

    #v0=(Reference);
    invoke-direct {v11, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 88
    .local v11, dialog:Landroid/app/Dialog;
    #v11=(Reference);
    iget-object v0, p0, Lcom/kabam/rater/RateSender$1;->val$title:Ljava/lang/String;

    invoke-virtual {v11, v0}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 90
    new-instance v12, Landroid/widget/LinearLayout;

    #v12=(UninitRef);
    iget-object v0, p0, Lcom/kabam/rater/RateSender$1;->val$activity:Landroid/app/Activity;

    invoke-direct {v12, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 91
    .local v12, ll:Landroid/widget/LinearLayout;
    #v12=(Reference);
    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {v12, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 93
    new-instance v13, Landroid/widget/TextView;

    #v13=(UninitRef);
    iget-object v0, p0, Lcom/kabam/rater/RateSender$1;->val$activity:Landroid/app/Activity;

    #v0=(Reference);
    invoke-direct {v13, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 94
    .local v13, tv:Landroid/widget/TextView;
    #v13=(Reference);
    iget-object v0, p0, Lcom/kabam/rater/RateSender$1;->val$message:Ljava/lang/String;

    invoke-virtual {v13, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    const/16 v0, 0xf0

    #v0=(PosShort);
    invoke-virtual {v13, v0}, Landroid/widget/TextView;->setWidth(I)V

    .line 96
    const/4 v0, 0x0

    #v0=(Null);
    const/16 v1, 0xa

    #v1=(PosByte);
    invoke-virtual {v13, v2, v0, v2, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 97
    invoke-virtual {v12, v13}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 98
    iget-object v0, p0, Lcom/kabam/rater/RateSender$1;->val$title:Ljava/lang/String;

    #v0=(Reference);
    iget-object v1, p0, Lcom/kabam/rater/RateSender$1;->val$message:Ljava/lang/String;

    #v1=(Reference);
    iget-object v2, p0, Lcom/kabam/rater/RateSender$1;->val$rateNow:Ljava/lang/String;

    #v2=(Reference);
    iget-object v3, p0, Lcom/kabam/rater/RateSender$1;->val$rateLater:Ljava/lang/String;

    #v3=(Reference);
    iget-object v4, p0, Lcom/kabam/rater/RateSender$1;->val$noRate:Ljava/lang/String;

    #v4=(Reference);
    iget-object v5, p0, Lcom/kabam/rater/RateSender$1;->val$clientVer:Ljava/lang/String;

    #v5=(Reference);
    iget-object v6, p0, Lcom/kabam/rater/RateSender$1;->val$url:Ljava/lang/String;

    #v6=(Reference);
    const-string v7, "2"

    #v7=(Reference);
    invoke-static/range {v0 .. v7}, Lcom/kabam/rater/RateSender;->access$1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    new-instance v8, Landroid/widget/Button;

    #v8=(UninitRef);
    iget-object v0, p0, Lcom/kabam/rater/RateSender$1;->val$activity:Landroid/app/Activity;

    invoke-direct {v8, v0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 100
    .local v8, b1:Landroid/widget/Button;
    #v8=(Reference);
    iget-object v0, p0, Lcom/kabam/rater/RateSender$1;->val$rateNow:Ljava/lang/String;

    invoke-virtual {v8, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 101
    new-instance v0, Lcom/kabam/rater/RateSender$1$1;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/kabam/rater/RateSender$1;->val$url:Ljava/lang/String;

    iget-object v2, p0, Lcom/kabam/rater/RateSender$1;->val$activity:Landroid/app/Activity;

    invoke-direct {v0, p0, v1, v2, v11}, Lcom/kabam/rater/RateSender$1$1;-><init>(Lcom/kabam/rater/RateSender$1;Ljava/lang/String;Landroid/app/Activity;Landroid/app/Dialog;)V

    #v0=(Reference);
    invoke-virtual {v8, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 119
    invoke-virtual {v12, v8}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 121
    iget-object v0, p0, Lcom/kabam/rater/RateSender$1;->val$title:Ljava/lang/String;

    iget-object v1, p0, Lcom/kabam/rater/RateSender$1;->val$message:Ljava/lang/String;

    iget-object v2, p0, Lcom/kabam/rater/RateSender$1;->val$rateNow:Ljava/lang/String;

    iget-object v3, p0, Lcom/kabam/rater/RateSender$1;->val$rateLater:Ljava/lang/String;

    iget-object v4, p0, Lcom/kabam/rater/RateSender$1;->val$noRate:Ljava/lang/String;

    iget-object v5, p0, Lcom/kabam/rater/RateSender$1;->val$clientVer:Ljava/lang/String;

    iget-object v6, p0, Lcom/kabam/rater/RateSender$1;->val$url:Ljava/lang/String;

    const-string v7, "3"

    invoke-static/range {v0 .. v7}, Lcom/kabam/rater/RateSender;->access$1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    new-instance v9, Landroid/widget/Button;

    #v9=(UninitRef);
    iget-object v0, p0, Lcom/kabam/rater/RateSender$1;->val$activity:Landroid/app/Activity;

    invoke-direct {v9, v0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 123
    .local v9, b2:Landroid/widget/Button;
    #v9=(Reference);
    iget-object v0, p0, Lcom/kabam/rater/RateSender$1;->val$rateLater:Ljava/lang/String;

    invoke-virtual {v9, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 124
    new-instance v0, Lcom/kabam/rater/RateSender$1$2;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/kabam/rater/RateSender$1;->val$url:Ljava/lang/String;

    invoke-direct {v0, p0, v1, v11}, Lcom/kabam/rater/RateSender$1$2;-><init>(Lcom/kabam/rater/RateSender$1;Ljava/lang/String;Landroid/app/Dialog;)V

    #v0=(Reference);
    invoke-virtual {v9, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 132
    invoke-virtual {v12, v9}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 133
    iget-object v0, p0, Lcom/kabam/rater/RateSender$1;->val$title:Ljava/lang/String;

    iget-object v1, p0, Lcom/kabam/rater/RateSender$1;->val$message:Ljava/lang/String;

    iget-object v2, p0, Lcom/kabam/rater/RateSender$1;->val$rateNow:Ljava/lang/String;

    iget-object v3, p0, Lcom/kabam/rater/RateSender$1;->val$rateLater:Ljava/lang/String;

    iget-object v4, p0, Lcom/kabam/rater/RateSender$1;->val$noRate:Ljava/lang/String;

    iget-object v5, p0, Lcom/kabam/rater/RateSender$1;->val$clientVer:Ljava/lang/String;

    iget-object v6, p0, Lcom/kabam/rater/RateSender$1;->val$url:Ljava/lang/String;

    const-string v7, "4"

    invoke-static/range {v0 .. v7}, Lcom/kabam/rater/RateSender;->access$1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    new-instance v10, Landroid/widget/Button;

    #v10=(UninitRef);
    iget-object v0, p0, Lcom/kabam/rater/RateSender$1;->val$activity:Landroid/app/Activity;

    invoke-direct {v10, v0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 135
    .local v10, b3:Landroid/widget/Button;
    #v10=(Reference);
    iget-object v0, p0, Lcom/kabam/rater/RateSender$1;->val$noRate:Ljava/lang/String;

    invoke-virtual {v10, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 136
    new-instance v0, Lcom/kabam/rater/RateSender$1$3;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/kabam/rater/RateSender$1;->val$url:Ljava/lang/String;

    invoke-direct {v0, p0, v1, v11}, Lcom/kabam/rater/RateSender$1$3;-><init>(Lcom/kabam/rater/RateSender$1;Ljava/lang/String;Landroid/app/Dialog;)V

    #v0=(Reference);
    invoke-virtual {v10, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 145
    invoke-virtual {v12, v10}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 146
    iget-object v0, p0, Lcom/kabam/rater/RateSender$1;->val$title:Ljava/lang/String;

    iget-object v1, p0, Lcom/kabam/rater/RateSender$1;->val$message:Ljava/lang/String;

    iget-object v2, p0, Lcom/kabam/rater/RateSender$1;->val$rateNow:Ljava/lang/String;

    iget-object v3, p0, Lcom/kabam/rater/RateSender$1;->val$rateLater:Ljava/lang/String;

    iget-object v4, p0, Lcom/kabam/rater/RateSender$1;->val$noRate:Ljava/lang/String;

    iget-object v5, p0, Lcom/kabam/rater/RateSender$1;->val$clientVer:Ljava/lang/String;

    iget-object v6, p0, Lcom/kabam/rater/RateSender$1;->val$url:Ljava/lang/String;

    const-string v7, "5"

    invoke-static/range {v0 .. v7}, Lcom/kabam/rater/RateSender;->access$1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    invoke-virtual {v11, v12}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 148
    invoke-virtual {v11}, Landroid/app/Dialog;->show()V

    .line 149
    iget-object v0, p0, Lcom/kabam/rater/RateSender$1;->val$title:Ljava/lang/String;

    iget-object v1, p0, Lcom/kabam/rater/RateSender$1;->val$message:Ljava/lang/String;

    iget-object v2, p0, Lcom/kabam/rater/RateSender$1;->val$rateNow:Ljava/lang/String;

    iget-object v3, p0, Lcom/kabam/rater/RateSender$1;->val$rateLater:Ljava/lang/String;

    iget-object v4, p0, Lcom/kabam/rater/RateSender$1;->val$noRate:Ljava/lang/String;

    iget-object v5, p0, Lcom/kabam/rater/RateSender$1;->val$clientVer:Ljava/lang/String;

    iget-object v6, p0, Lcom/kabam/rater/RateSender$1;->val$url:Ljava/lang/String;

    const-string v7, "6"

    invoke-static/range {v0 .. v7}, Lcom/kabam/rater/RateSender;->access$1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0
.end method

*/}
