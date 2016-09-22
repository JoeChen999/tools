package com.tapjoy; class TapjoyConnectCore$PaidAppTimerTask {/*

.class Lcom/tapjoy/TapjoyConnectCore$PaidAppTimerTask;
.super Ljava/util/TimerTask;
.source "TapjoyConnectCore.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tapjoy/TapjoyConnectCore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "PaidAppTimerTask"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tapjoy/TapjoyConnectCore;


# direct methods
.method private constructor <init>(Lcom/tapjoy/TapjoyConnectCore;)V
    .locals 0
    .parameter

    .prologue
    .line 709
    iput-object p1, p0, Lcom/tapjoy/TapjoyConnectCore$PaidAppTimerTask;->this$0:Lcom/tapjoy/TapjoyConnectCore;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method synthetic constructor <init>(Lcom/tapjoy/TapjoyConnectCore;Lcom/tapjoy/TapjoyConnectCore$1;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 709
    invoke-direct {p0, p1}, Lcom/tapjoy/TapjoyConnectCore$PaidAppTimerTask;-><init>(Lcom/tapjoy/TapjoyConnectCore;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .prologue
    const-wide/16 v8, 0x3e8

    #v8=(LongLo);v9=(LongHi);
    const-wide/16 v6, 0x3c

    .line 713
    #v6=(LongLo);v7=(LongHi);
    iget-object v2, p0, Lcom/tapjoy/TapjoyConnectCore$PaidAppTimerTask;->this$0:Lcom/tapjoy/TapjoyConnectCore;

    #v2=(Reference);
    const-wide/16 v3, 0x2710

    #v3=(LongLo);v4=(LongHi);
    invoke-static {v2, v3, v4}, Lcom/tapjoy/TapjoyConnectCore;->access$014(Lcom/tapjoy/TapjoyConnectCore;J)J

    .line 715
    const-string v2, "TapjoyConnect"

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "elapsed_time: "

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/tapjoy/TapjoyConnectCore$PaidAppTimerTask;->this$0:Lcom/tapjoy/TapjoyConnectCore;

    invoke-static {v4}, Lcom/tapjoy/TapjoyConnectCore;->access$000(Lcom/tapjoy/TapjoyConnectCore;)J

    move-result-wide v4

    #v4=(LongLo);v5=(LongHi);
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " ("

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/tapjoy/TapjoyConnectCore$PaidAppTimerTask;->this$0:Lcom/tapjoy/TapjoyConnectCore;

    invoke-static {v4}, Lcom/tapjoy/TapjoyConnectCore;->access$000(Lcom/tapjoy/TapjoyConnectCore;)J

    move-result-wide v4

    #v4=(LongLo);
    div-long/2addr v4, v8

    div-long/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "m "

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/tapjoy/TapjoyConnectCore$PaidAppTimerTask;->this$0:Lcom/tapjoy/TapjoyConnectCore;

    invoke-static {v4}, Lcom/tapjoy/TapjoyConnectCore;->access$000(Lcom/tapjoy/TapjoyConnectCore;)J

    move-result-wide v4

    #v4=(LongLo);
    div-long/2addr v4, v8

    rem-long/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "s)"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 717
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->access$100()Landroid/content/Context;

    move-result-object v2

    const-string v3, "tjcPrefrences"

    const/4 v4, 0x0

    #v4=(Null);
    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 718
    .local v1, prefs:Landroid/content/SharedPreferences;
    #v1=(Reference);
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 719
    .local v0, editor:Landroid/content/SharedPreferences$Editor;
    #v0=(Reference);
    const-string v2, "tapjoy_elapsed_time"

    iget-object v3, p0, Lcom/tapjoy/TapjoyConnectCore$PaidAppTimerTask;->this$0:Lcom/tapjoy/TapjoyConnectCore;

    invoke-static {v3}, Lcom/tapjoy/TapjoyConnectCore;->access$000(Lcom/tapjoy/TapjoyConnectCore;)J

    move-result-wide v3

    #v3=(LongLo);v4=(LongHi);
    invoke-interface {v0, v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 720
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 723
    iget-object v2, p0, Lcom/tapjoy/TapjoyConnectCore$PaidAppTimerTask;->this$0:Lcom/tapjoy/TapjoyConnectCore;

    invoke-static {v2}, Lcom/tapjoy/TapjoyConnectCore;->access$000(Lcom/tapjoy/TapjoyConnectCore;)J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    const-wide/32 v4, 0xdbba0

    #v4=(LongLo);
    cmp-long v2, v2, v4

    #v2=(Byte);
    if-ltz v2, :cond_1

    .line 725
    const-string v2, "TapjoyConnect"

    #v2=(Reference);
    const-string v3, "timer done..."

    #v3=(Reference);
    invoke-static {v2, v3}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 728
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->access$200()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->access$200()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    if-lez v2, :cond_0

    .line 730
    const-string v2, "TapjoyConnect"

    #v2=(Reference);
    const-string v3, "Calling PPA actionComplete..."

    invoke-static {v2, v3}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 732
    iget-object v2, p0, Lcom/tapjoy/TapjoyConnectCore$PaidAppTimerTask;->this$0:Lcom/tapjoy/TapjoyConnectCore;

    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->access$200()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/tapjoy/TapjoyConnectCore;->actionComplete(Ljava/lang/String;)V

    .line 735
    :cond_0
    #v2=(Conflicted);
    invoke-virtual {p0}, Lcom/tapjoy/TapjoyConnectCore$PaidAppTimerTask;->cancel()Z

    .line 737
    :cond_1
    #v3=(Conflicted);
    return-void
.end method

*/}
