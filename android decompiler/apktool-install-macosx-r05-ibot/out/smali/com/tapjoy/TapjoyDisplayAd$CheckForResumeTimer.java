package com.tapjoy; class TapjoyDisplayAd$CheckForResumeTimer {/*

.class Lcom/tapjoy/TapjoyDisplayAd$CheckForResumeTimer;
.super Ljava/util/TimerTask;
.source "TapjoyDisplayAd.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tapjoy/TapjoyDisplayAd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "CheckForResumeTimer"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tapjoy/TapjoyDisplayAd;


# direct methods
.method private constructor <init>(Lcom/tapjoy/TapjoyDisplayAd;)V
    .locals 0
    .parameter

    .prologue
    .line 186
    iput-object p1, p0, Lcom/tapjoy/TapjoyDisplayAd$CheckForResumeTimer;->this$0:Lcom/tapjoy/TapjoyDisplayAd;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method synthetic constructor <init>(Lcom/tapjoy/TapjoyDisplayAd;Lcom/tapjoy/TapjoyDisplayAd$1;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 186
    invoke-direct {p0, p1}, Lcom/tapjoy/TapjoyDisplayAd$CheckForResumeTimer;-><init>(Lcom/tapjoy/TapjoyDisplayAd;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .prologue
    const-wide/16 v7, 0x3e8

    #v7=(LongLo);v8=(LongHi);
    const-wide/16 v5, 0x3c

    .line 190
    #v5=(LongLo);v6=(LongHi);
    iget-object v0, p0, Lcom/tapjoy/TapjoyDisplayAd$CheckForResumeTimer;->this$0:Lcom/tapjoy/TapjoyDisplayAd;

    #v0=(Reference);
    iget-wide v1, v0, Lcom/tapjoy/TapjoyDisplayAd;->elapsed_time:J

    #v1=(LongLo);v2=(LongHi);
    const-wide/16 v3, 0x2710

    #v3=(LongLo);v4=(LongHi);
    add-long/2addr v1, v3

    iput-wide v1, v0, Lcom/tapjoy/TapjoyDisplayAd;->elapsed_time:J

    .line 192
    const-string v0, "Banner Ad"

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "banner elapsed_time: "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/tapjoy/TapjoyDisplayAd$CheckForResumeTimer;->this$0:Lcom/tapjoy/TapjoyDisplayAd;

    iget-wide v2, v2, Lcom/tapjoy/TapjoyDisplayAd;->elapsed_time:J

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ("

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/tapjoy/TapjoyDisplayAd$CheckForResumeTimer;->this$0:Lcom/tapjoy/TapjoyDisplayAd;

    iget-wide v2, v2, Lcom/tapjoy/TapjoyDisplayAd;->elapsed_time:J

    #v2=(LongLo);
    div-long/2addr v2, v7

    div-long/2addr v2, v5

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "m "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/tapjoy/TapjoyDisplayAd$CheckForResumeTimer;->this$0:Lcom/tapjoy/TapjoyDisplayAd;

    iget-wide v2, v2, Lcom/tapjoy/TapjoyDisplayAd;->elapsed_time:J

    #v2=(LongLo);
    div-long/2addr v2, v7

    rem-long/2addr v2, v5

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "s)"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    iget-object v0, p0, Lcom/tapjoy/TapjoyDisplayAd$CheckForResumeTimer;->this$0:Lcom/tapjoy/TapjoyDisplayAd;

    iget-object v0, v0, Lcom/tapjoy/TapjoyDisplayAd;->adView:Landroid/view/View;

    if-nez v0, :cond_1

    .line 197
    invoke-virtual {p0}, Lcom/tapjoy/TapjoyDisplayAd$CheckForResumeTimer;->cancel()Z

    .line 221
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    .line 202
    :cond_1
    #v0=(Reference);v1=(Reference);v2=(Reference);
    const-string v0, "Banner Ad"

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "adView.isShown: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/tapjoy/TapjoyDisplayAd$CheckForResumeTimer;->this$0:Lcom/tapjoy/TapjoyDisplayAd;

    iget-object v2, v2, Lcom/tapjoy/TapjoyDisplayAd;->adView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->isShown()Z

    move-result v2

    #v2=(Boolean);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    iget-object v0, p0, Lcom/tapjoy/TapjoyDisplayAd$CheckForResumeTimer;->this$0:Lcom/tapjoy/TapjoyDisplayAd;

    iget-object v0, v0, Lcom/tapjoy/TapjoyDisplayAd;->adView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    .line 207
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getInstance()Lcom/tapjoy/TapjoyConnectCore;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_2

    .line 209
    const-string v0, "Banner Ad"

    const-string v1, "call connect"

    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getInstance()Lcom/tapjoy/TapjoyConnectCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tapjoy/TapjoyConnectCore;->callConnect()V

    .line 211
    invoke-virtual {p0}, Lcom/tapjoy/TapjoyDisplayAd$CheckForResumeTimer;->cancel()Z

    .line 216
    :cond_2
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/tapjoy/TapjoyDisplayAd$CheckForResumeTimer;->this$0:Lcom/tapjoy/TapjoyDisplayAd;

    #v0=(Reference);
    iget-wide v0, v0, Lcom/tapjoy/TapjoyDisplayAd;->elapsed_time:J

    #v0=(LongLo);v1=(LongHi);
    const-wide/32 v2, 0x124f80

    #v2=(LongLo);
    cmp-long v0, v0, v2

    #v0=(Byte);
    if-ltz v0, :cond_0

    .line 218
    invoke-virtual {p0}, Lcom/tapjoy/TapjoyDisplayAd$CheckForResumeTimer;->cancel()Z

    goto :goto_0
.end method

*/}
