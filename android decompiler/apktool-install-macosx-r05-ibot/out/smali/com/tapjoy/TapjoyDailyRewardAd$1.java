package com.tapjoy; class TapjoyDailyRewardAd$1 {/*

.class Lcom/tapjoy/TapjoyDailyRewardAd$1;
.super Ljava/lang/Object;
.source "TapjoyDailyRewardAd.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tapjoy/TapjoyDailyRewardAd;->getDailyRewardAdWithCurrencyID(Ljava/lang/String;Lcom/tapjoy/TapjoyDailyRewardAdNotifier;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tapjoy/TapjoyDailyRewardAd;


# direct methods
.method constructor <init>(Lcom/tapjoy/TapjoyDailyRewardAd;)V
    .locals 0
    .parameter

    .prologue
    .line 66
    iput-object p1, p0, Lcom/tapjoy/TapjoyDailyRewardAd$1;->this$0:Lcom/tapjoy/TapjoyDailyRewardAd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 69
    invoke-static {}, Lcom/tapjoy/TapjoyDailyRewardAd;->access$000()Lcom/tapjoy/TapjoyURLConnection;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "https://ws.tapjoyads.com/reengagement_rewards?"

    #v2=(Reference);
    sget-object v3, Lcom/tapjoy/TapjoyDailyRewardAd;->dailyRewardURLParams:Ljava/lang/String;

    #v3=(Reference);
    invoke-virtual {v1, v2, v3}, Lcom/tapjoy/TapjoyURLConnection;->getResponseFromURL(Ljava/lang/String;Ljava/lang/String;)Lcom/tapjoy/TapjoyHttpURLResponse;

    move-result-object v0

    .line 71
    .local v0, httpResponse:Lcom/tapjoy/TapjoyHttpURLResponse;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 73
    iget v1, v0, Lcom/tapjoy/TapjoyHttpURLResponse;->statusCode:I

    #v1=(Integer);
    sparse-switch v1, :sswitch_data_0

    .line 92
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-void

    .line 78
    :sswitch_0
    #v1=(Integer);v2=(Reference);
    iget-object v1, v0, Lcom/tapjoy/TapjoyHttpURLResponse;->response:Ljava/lang/String;

    #v1=(Reference);
    invoke-static {v1}, Lcom/tapjoy/TapjoyDailyRewardAd;->access$102(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    invoke-static {}, Lcom/tapjoy/TapjoyDailyRewardAd;->access$200()Lcom/tapjoy/TapjoyDailyRewardAdNotifier;

    move-result-object v1

    invoke-interface {v1}, Lcom/tapjoy/TapjoyDailyRewardAdNotifier;->getDailyRewardAdResponse()V

    goto :goto_0

    .line 84
    :sswitch_1
    #v1=(Integer);
    invoke-static {}, Lcom/tapjoy/TapjoyDailyRewardAd;->access$200()Lcom/tapjoy/TapjoyDailyRewardAdNotifier;

    move-result-object v1

    #v1=(Reference);
    const/4 v2, 0x1

    #v2=(One);
    invoke-interface {v1, v2}, Lcom/tapjoy/TapjoyDailyRewardAdNotifier;->getDailyRewardAdResponseFailed(I)V

    goto :goto_0

    .line 90
    :cond_0
    #v2=(Reference);
    invoke-static {}, Lcom/tapjoy/TapjoyDailyRewardAd;->access$200()Lcom/tapjoy/TapjoyDailyRewardAdNotifier;

    move-result-object v1

    const/4 v2, 0x2

    #v2=(PosByte);
    invoke-interface {v1, v2}, Lcom/tapjoy/TapjoyDailyRewardAdNotifier;->getDailyRewardAdResponseFailed(I)V

    goto :goto_0

    .line 73
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);
    nop

    :sswitch_data_0
    .sparse-switch
        0xc8 -> :sswitch_0
        0xcc -> :sswitch_1
    .end sparse-switch
.end method

*/}
