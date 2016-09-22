package com.tapjoy; class TapjoyDailyRewardAdWebView$TapjoyWebViewClient {/*

.class Lcom/tapjoy/TapjoyDailyRewardAdWebView$TapjoyWebViewClient;
.super Landroid/webkit/WebViewClient;
.source "TapjoyDailyRewardAdWebView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tapjoy/TapjoyDailyRewardAdWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TapjoyWebViewClient"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tapjoy/TapjoyDailyRewardAdWebView;


# direct methods
.method private constructor <init>(Lcom/tapjoy/TapjoyDailyRewardAdWebView;)V
    .locals 0
    .parameter

    .prologue
    .line 126
    iput-object p1, p0, Lcom/tapjoy/TapjoyDailyRewardAdWebView$TapjoyWebViewClient;->this$0:Lcom/tapjoy/TapjoyDailyRewardAdWebView;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method synthetic constructor <init>(Lcom/tapjoy/TapjoyDailyRewardAdWebView;Lcom/tapjoy/TapjoyDailyRewardAdWebView$1;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 126
    invoke-direct {p0, p1}, Lcom/tapjoy/TapjoyDailyRewardAdWebView$TapjoyWebViewClient;-><init>(Lcom/tapjoy/TapjoyDailyRewardAdWebView;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2
    .parameter "view"
    .parameter "url"

    .prologue
    .line 137
    iget-object v0, p0, Lcom/tapjoy/TapjoyDailyRewardAdWebView$TapjoyWebViewClient;->this$0:Lcom/tapjoy/TapjoyDailyRewardAdWebView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/tapjoy/TapjoyDailyRewardAdWebView;->access$300(Lcom/tapjoy/TapjoyDailyRewardAdWebView;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 138
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2
    .parameter "view"
    .parameter "url"
    .parameter "favicon"

    .prologue
    .line 130
    iget-object v0, p0, Lcom/tapjoy/TapjoyDailyRewardAdWebView$TapjoyWebViewClient;->this$0:Lcom/tapjoy/TapjoyDailyRewardAdWebView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/tapjoy/TapjoyDailyRewardAdWebView;->access$300(Lcom/tapjoy/TapjoyDailyRewardAdWebView;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 131
    iget-object v0, p0, Lcom/tapjoy/TapjoyDailyRewardAdWebView$TapjoyWebViewClient;->this$0:Lcom/tapjoy/TapjoyDailyRewardAdWebView;

    invoke-static {v0}, Lcom/tapjoy/TapjoyDailyRewardAdWebView;->access$300(Lcom/tapjoy/TapjoyDailyRewardAdWebView;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->bringToFront()V

    .line 132
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 3
    .parameter "view"
    .parameter "url"

    .prologue
    .line 145
    const-string v0, "Daily Reward"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "URL = ["

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    const-string v0, "http://ok"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 150
    const-string v0, "Daily Reward"

    #v0=(Reference);
    const-string v1, "dismiss"

    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    iget-object v0, p0, Lcom/tapjoy/TapjoyDailyRewardAdWebView$TapjoyWebViewClient;->this$0:Lcom/tapjoy/TapjoyDailyRewardAdWebView;

    invoke-static {v0}, Lcom/tapjoy/TapjoyDailyRewardAdWebView;->access$400(Lcom/tapjoy/TapjoyDailyRewardAdWebView;)V

    .line 154
    :cond_0
    #v0=(Conflicted);
    const/4 v0, 0x1

    #v0=(One);
    return v0
.end method

*/}
