package com.tapjoy; class TapjoyVideoView$5 {/*

.class Lcom/tapjoy/TapjoyVideoView$5;
.super Ljava/lang/Object;
.source "TapjoyVideoView.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tapjoy/TapjoyVideoView;->onCreateDialog(I)Landroid/app/Dialog;
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
    .line 563
    iput-object p1, p0, Lcom/tapjoy/TapjoyVideoView$5;->this$0:Lcom/tapjoy/TapjoyVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4
    .parameter "dialog"
    .parameter "whichButton"

    .prologue
    .line 567
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 569
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView$5;->this$0:Lcom/tapjoy/TapjoyVideoView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/tapjoy/TapjoyVideoView;->access$700(Lcom/tapjoy/TapjoyVideoView;)Landroid/widget/VideoView;

    move-result-object v0

    iget-object v1, p0, Lcom/tapjoy/TapjoyVideoView$5;->this$0:Lcom/tapjoy/TapjoyVideoView;

    #v1=(Reference);
    invoke-static {v1}, Lcom/tapjoy/TapjoyVideoView;->access$600(Lcom/tapjoy/TapjoyVideoView;)I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->seekTo(I)V

    .line 570
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView$5;->this$0:Lcom/tapjoy/TapjoyVideoView;

    invoke-static {v0}, Lcom/tapjoy/TapjoyVideoView;->access$700(Lcom/tapjoy/TapjoyVideoView;)Landroid/widget/VideoView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/VideoView;->start()V

    .line 572
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView$5;->this$0:Lcom/tapjoy/TapjoyVideoView;

    const/4 v1, 0x0

    #v1=(Null);
    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyVideoView;->access$802(Lcom/tapjoy/TapjoyVideoView;Z)Z

    .line 574
    const-string v0, "VIDEO"

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "RESUME VIDEO time: "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/tapjoy/TapjoyVideoView$5;->this$0:Lcom/tapjoy/TapjoyVideoView;

    invoke-static {v2}, Lcom/tapjoy/TapjoyVideoView;->access$600(Lcom/tapjoy/TapjoyVideoView;)I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 575
    const-string v0, "VIDEO"

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "currentPosition: "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/tapjoy/TapjoyVideoView$5;->this$0:Lcom/tapjoy/TapjoyVideoView;

    invoke-static {v2}, Lcom/tapjoy/TapjoyVideoView;->access$700(Lcom/tapjoy/TapjoyVideoView;)Landroid/widget/VideoView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/VideoView;->getCurrentPosition()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 576
    const-string v0, "VIDEO"

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "duration: "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/tapjoy/TapjoyVideoView$5;->this$0:Lcom/tapjoy/TapjoyVideoView;

    invoke-static {v2}, Lcom/tapjoy/TapjoyVideoView;->access$700(Lcom/tapjoy/TapjoyVideoView;)Landroid/widget/VideoView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/VideoView;->getDuration()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", elapsed: "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/tapjoy/TapjoyVideoView$5;->this$0:Lcom/tapjoy/TapjoyVideoView;

    invoke-static {v2}, Lcom/tapjoy/TapjoyVideoView;->access$700(Lcom/tapjoy/TapjoyVideoView;)Landroid/widget/VideoView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/VideoView;->getDuration()I

    move-result v2

    #v2=(Integer);
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView$5;->this$0:Lcom/tapjoy/TapjoyVideoView;

    #v3=(Reference);
    invoke-static {v3}, Lcom/tapjoy/TapjoyVideoView;->access$700(Lcom/tapjoy/TapjoyVideoView;)Landroid/widget/VideoView;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/VideoView;->getCurrentPosition()I

    move-result v3

    #v3=(Integer);
    sub-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 577
    return-void
.end method

*/}
