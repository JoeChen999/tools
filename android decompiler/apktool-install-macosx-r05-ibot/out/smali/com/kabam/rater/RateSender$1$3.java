package com.kabam.rater; class RateSender$1$3 {/*

.class Lcom/kabam/rater/RateSender$1$3;
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

.field private final synthetic val$dialog:Landroid/app/Dialog;

.field private final synthetic val$url:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/kabam/rater/RateSender$1;Ljava/lang/String;Landroid/app/Dialog;)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/kabam/rater/RateSender$1$3;->this$1:Lcom/kabam/rater/RateSender$1;

    iput-object p2, p0, Lcom/kabam/rater/RateSender$1$3;->val$url:Ljava/lang/String;

    iput-object p3, p0, Lcom/kabam/rater/RateSender$1$3;->val$dialog:Landroid/app/Dialog;

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .parameter "v"

    .prologue
    .line 140
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/kabam/rater/RateSender$1$3;->val$url:Ljava/lang/String;

    #v1=(Reference);
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    const-string v1, "b3"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kabam/rater/RateSender;->access$2(Ljava/lang/String;)V

    .line 141
    invoke-static {}, Lcom/kabam/rater/RateSender;->access$3()V

    .line 142
    iget-object v0, p0, Lcom/kabam/rater/RateSender$1$3;->val$dialog:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 143
    return-void
.end method

*/}
