package com.tapjoy; class TapjoyDisplayAd$GetBannerAdTask$1 {/*

.class Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask$1;
.super Landroid/webkit/WebViewClient;
.source "TapjoyDisplayAd.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;->onPostExecute(Lcom/tapjoy/TapjoyHttpURLResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;


# direct methods
.method constructor <init>(Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;)V
    .locals 0
    .parameter

    .prologue
    .line 261
    iput-object p1, p0, Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask$1;->this$1:Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 7
    .parameter "view"
    .parameter "url"

    .prologue
    const-wide/16 v2, 0x2710

    .line 264
    #v2=(LongLo);v3=(LongHi);
    new-instance v6, Landroid/content/Intent;

    #v6=(UninitRef);
    iget-object v0, p0, Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask$1;->this$1:Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;

    #v0=(Reference);
    iget-object v0, v0, Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;->this$0:Lcom/tapjoy/TapjoyDisplayAd;

    invoke-static {v0}, Lcom/tapjoy/TapjoyDisplayAd;->access$200(Lcom/tapjoy/TapjoyDisplayAd;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/tapjoy/TJCOffersWebView;

    #v1=(Reference);
    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 265
    .local v6, intent:Landroid/content/Intent;
    #v6=(Reference);
    const-string v0, "DISPLAY_AD_URL"

    invoke-virtual {v6, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 266
    const/high16 v0, 0x1000

    #v0=(Integer);
    invoke-virtual {v6, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 267
    iget-object v0, p0, Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask$1;->this$1:Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;

    #v0=(Reference);
    iget-object v0, v0, Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;->this$0:Lcom/tapjoy/TapjoyDisplayAd;

    invoke-static {v0}, Lcom/tapjoy/TapjoyDisplayAd;->access$200(Lcom/tapjoy/TapjoyDisplayAd;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 272
    iget-object v0, p0, Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask$1;->this$1:Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;

    iget-object v0, v0, Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;->this$0:Lcom/tapjoy/TapjoyDisplayAd;

    iget-object v0, v0, Lcom/tapjoy/TapjoyDisplayAd;->resumeTimer:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 274
    iget-object v0, p0, Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask$1;->this$1:Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;

    iget-object v0, v0, Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;->this$0:Lcom/tapjoy/TapjoyDisplayAd;

    iget-object v0, v0, Lcom/tapjoy/TapjoyDisplayAd;->resumeTimer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 277
    :cond_0
    iget-object v0, p0, Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask$1;->this$1:Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;

    iget-object v0, v0, Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;->this$0:Lcom/tapjoy/TapjoyDisplayAd;

    const-wide/16 v4, 0x0

    #v4=(LongLo);v5=(LongHi);
    iput-wide v4, v0, Lcom/tapjoy/TapjoyDisplayAd;->elapsed_time:J

    .line 278
    iget-object v0, p0, Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask$1;->this$1:Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;

    iget-object v0, v0, Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;->this$0:Lcom/tapjoy/TapjoyDisplayAd;

    new-instance v1, Ljava/util/Timer;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    #v1=(Reference);
    iput-object v1, v0, Lcom/tapjoy/TapjoyDisplayAd;->resumeTimer:Ljava/util/Timer;

    .line 279
    iget-object v0, p0, Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask$1;->this$1:Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;

    iget-object v0, v0, Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;->this$0:Lcom/tapjoy/TapjoyDisplayAd;

    iget-object v0, v0, Lcom/tapjoy/TapjoyDisplayAd;->resumeTimer:Ljava/util/Timer;

    new-instance v1, Lcom/tapjoy/TapjoyDisplayAd$CheckForResumeTimer;

    #v1=(UninitRef);
    iget-object v4, p0, Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask$1;->this$1:Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;

    #v4=(Reference);
    iget-object v4, v4, Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;->this$0:Lcom/tapjoy/TapjoyDisplayAd;

    const/4 v5, 0x0

    #v5=(Null);
    invoke-direct {v1, v4, v5}, Lcom/tapjoy/TapjoyDisplayAd$CheckForResumeTimer;-><init>(Lcom/tapjoy/TapjoyDisplayAd;Lcom/tapjoy/TapjoyDisplayAd$1;)V

    #v1=(Reference);
    move-wide v4, v2

    #v4=(LongLo);v5=(LongHi);
    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 280
    const/4 v0, 0x1

    #v0=(One);
    return v0
.end method

*/}
