package com.tapjoy; class TapjoyVideoView$3 {/*

.class Lcom/tapjoy/TapjoyVideoView$3;
.super Ljava/lang/Object;
.source "TapjoyVideoView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tapjoy/TapjoyVideoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tapjoy/TapjoyVideoView;


# direct methods
.method constructor <init>(Lcom/tapjoy/TapjoyVideoView;)V
    .locals 0
    .parameter

    .prologue
    .line 434
    iput-object p1, p0, Lcom/tapjoy/TapjoyVideoView$3;->this$0:Lcom/tapjoy/TapjoyVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 438
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView$3;->this$0:Lcom/tapjoy/TapjoyVideoView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/tapjoy/TapjoyVideoView;->access$500(Lcom/tapjoy/TapjoyVideoView;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, ""

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/tapjoy/TapjoyVideoView$3;->this$0:Lcom/tapjoy/TapjoyVideoView;

    invoke-static {v2}, Lcom/tapjoy/TapjoyVideoView;->access$400(Lcom/tapjoy/TapjoyVideoView;)I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " seconds"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 439
    return-void
.end method

*/}
