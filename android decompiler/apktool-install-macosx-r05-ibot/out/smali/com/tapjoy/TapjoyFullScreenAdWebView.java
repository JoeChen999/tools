package com.tapjoy; class TapjoyFullScreenAdWebView {/*

.class public Lcom/tapjoy/TapjoyFullScreenAdWebView;
.super Landroid/app/Activity;
.source "TapjoyFullScreenAdWebView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tapjoy/TapjoyFullScreenAdWebView$1;,
        Lcom/tapjoy/TapjoyFullScreenAdWebView$TapjoyWebViewClient;,
        Lcom/tapjoy/TapjoyFullScreenAdWebView$RefreshTask;
    }
.end annotation


# instance fields
.field final TAPJOY_FULL_SCREEN_AD:Ljava/lang/String;

.field private dialog:Landroid/app/Dialog;

.field private htmlRawData:Ljava/lang/String;

.field private progressBar:Landroid/widget/ProgressBar;

.field private resumeCalled:Z

.field private webView:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 29
    #v0=(Null);
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 31
    #p0=(Reference);
    iput-object v0, p0, Lcom/tapjoy/TapjoyFullScreenAdWebView;->webView:Landroid/webkit/WebView;

    .line 34
    iput-object v0, p0, Lcom/tapjoy/TapjoyFullScreenAdWebView;->dialog:Landroid/app/Dialog;

    .line 37
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tapjoy/TapjoyFullScreenAdWebView;->resumeCalled:Z

    .line 39
    const-string v0, "Full Screen Ad"

    #v0=(Reference);
    iput-object v0, p0, Lcom/tapjoy/TapjoyFullScreenAdWebView;->TAPJOY_FULL_SCREEN_AD:Ljava/lang/String;

    .line 154
    return-void
.end method

.method static synthetic access$200(Lcom/tapjoy/TapjoyFullScreenAdWebView;)Landroid/webkit/WebView;
    .locals 1
    .parameter "x0"

    .prologue
    .line 29
    iget-object v0, p0, Lcom/tapjoy/TapjoyFullScreenAdWebView;->webView:Landroid/webkit/WebView;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$300(Lcom/tapjoy/TapjoyFullScreenAdWebView;)Landroid/widget/ProgressBar;
    .locals 1
    .parameter "x0"

    .prologue
    .line 29
    iget-object v0, p0, Lcom/tapjoy/TapjoyFullScreenAdWebView;->progressBar:Landroid/widget/ProgressBar;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$400(Lcom/tapjoy/TapjoyFullScreenAdWebView;)Landroid/app/Dialog;
    .locals 1
    .parameter "x0"

    .prologue
    .line 29
    iget-object v0, p0, Lcom/tapjoy/TapjoyFullScreenAdWebView;->dialog:Landroid/app/Dialog;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$402(Lcom/tapjoy/TapjoyFullScreenAdWebView;Landroid/app/Dialog;)Landroid/app/Dialog;
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 29
    iput-object p1, p0, Lcom/tapjoy/TapjoyFullScreenAdWebView;->dialog:Landroid/app/Dialog;

    return-object p1
.end method

.method static synthetic access$500(Lcom/tapjoy/TapjoyFullScreenAdWebView;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/tapjoy/TapjoyFullScreenAdWebView;->showOffers()V

    return-void
.end method

.method static synthetic access$600(Lcom/tapjoy/TapjoyFullScreenAdWebView;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/tapjoy/TapjoyFullScreenAdWebView;->finishActivity()V

    return-void
.end method

.method private finishActivity()V
    .locals 0

    .prologue
    .line 337
    invoke-virtual {p0}, Lcom/tapjoy/TapjoyFullScreenAdWebView;->finish()V

    .line 338
    return-void
.end method

.method private showOffers()V
    .locals 3

    .prologue
    .line 323
    const-string v1, "Full Screen Ad"

    #v1=(Reference);
    const-string v2, "Showing offers"

    #v2=(Reference);
    invoke-static {v1, v2}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    const-class v1, Lcom/tapjoy/TJCOffersWebView;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 326
    .local v0, offersIntent:Landroid/content/Intent;
    #v0=(Reference);
    const-string v1, "USER_ID"

    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getUserID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 327
    const-string v1, "URL_PARAMS"

    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getURLParams()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 328
    invoke-virtual {p0, v0}, Lcom/tapjoy/TapjoyFullScreenAdWebView;->startActivity(Landroid/content/Intent;)V

    .line 329
    return-void
.end method


# virtual methods
.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2
    .parameter "newConfig"

    .prologue
    .line 87
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 89
    iget-object v1, p0, Lcom/tapjoy/TapjoyFullScreenAdWebView;->webView:Landroid/webkit/WebView;

    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 93
    new-instance v0, Lcom/tapjoy/TapjoyFullScreenAdWebView$RefreshTask;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Lcom/tapjoy/TapjoyFullScreenAdWebView$RefreshTask;-><init>(Lcom/tapjoy/TapjoyFullScreenAdWebView;Lcom/tapjoy/TapjoyFullScreenAdWebView$1;)V

    .line 94
    .local v0, refreshTask:Lcom/tapjoy/TapjoyFullScreenAdWebView$RefreshTask;
    #v0=(Reference);
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/tapjoy/TapjoyFullScreenAdWebView$RefreshTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 96
    .end local v0           #refreshTask:Lcom/tapjoy/TapjoyFullScreenAdWebView$RefreshTask;
    :cond_0
    #v0=(Conflicted);
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 10
    .parameter "savedInstanceState"

    .prologue
    const/4 v4, 0x1

    #v4=(One);
    const/4 v3, -0x1

    #v3=(Byte);
    const/4 v2, -0x2

    #v2=(Byte);
    const/4 v5, 0x0

    .line 46
    #v5=(Null);
    invoke-virtual {p0}, Lcom/tapjoy/TapjoyFullScreenAdWebView;->getIntent()Landroid/content/Intent;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v6

    .line 48
    .local v6, extras:Landroid/os/Bundle;
    #v6=(Reference);
    const-string v0, "FULLSCREEN_HTML_DATA"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tapjoy/TapjoyFullScreenAdWebView;->htmlRawData:Ljava/lang/String;

    .line 50
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 51
    invoke-virtual {p0, v4}, Lcom/tapjoy/TapjoyFullScreenAdWebView;->requestWindowFeature(I)Z

    .line 53
    new-instance v7, Landroid/widget/RelativeLayout;

    #v7=(UninitRef);
    invoke-direct {v7, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 56
    .local v7, layout:Landroid/widget/RelativeLayout;
    #v7=(Reference);
    new-instance v0, Landroid/webkit/WebView;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/tapjoy/TapjoyFullScreenAdWebView;->webView:Landroid/webkit/WebView;

    .line 57
    iget-object v0, p0, Lcom/tapjoy/TapjoyFullScreenAdWebView;->webView:Landroid/webkit/WebView;

    new-instance v1, Lcom/tapjoy/TapjoyFullScreenAdWebView$TapjoyWebViewClient;

    #v1=(UninitRef);
    invoke-direct {v1, p0, v5}, Lcom/tapjoy/TapjoyFullScreenAdWebView$TapjoyWebViewClient;-><init>(Lcom/tapjoy/TapjoyFullScreenAdWebView;Lcom/tapjoy/TapjoyFullScreenAdWebView$1;)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 59
    iget-object v0, p0, Lcom/tapjoy/TapjoyFullScreenAdWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v9

    .line 60
    .local v9, webSettings:Landroid/webkit/WebSettings;
    #v9=(Reference);
    invoke-virtual {v9, v4}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 63
    new-instance v0, Landroid/widget/ProgressBar;

    #v0=(UninitRef);
    const v1, 0x101007a

    #v1=(Integer);
    invoke-direct {v0, p0, v5, v1}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/tapjoy/TapjoyFullScreenAdWebView;->progressBar:Landroid/widget/ProgressBar;

    .line 64
    iget-object v0, p0, Lcom/tapjoy/TapjoyFullScreenAdWebView;->progressBar:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 67
    new-instance v8, Landroid/widget/RelativeLayout$LayoutParams;

    #v8=(UninitRef);
    invoke-direct {v8, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 68
    .local v8, layoutParams:Landroid/widget/RelativeLayout$LayoutParams;
    #v8=(Reference);
    const/16 v0, 0xd

    #v0=(PosByte);
    invoke-virtual {v8, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 69
    iget-object v0, p0, Lcom/tapjoy/TapjoyFullScreenAdWebView;->progressBar:Landroid/widget/ProgressBar;

    #v0=(Reference);
    invoke-virtual {v0, v8}, Landroid/widget/ProgressBar;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 72
    iget-object v0, p0, Lcom/tapjoy/TapjoyFullScreenAdWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {v7, v0, v3, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;II)V

    .line 73
    iget-object v0, p0, Lcom/tapjoy/TapjoyFullScreenAdWebView;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {v7, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 74
    invoke-virtual {p0, v7}, Lcom/tapjoy/TapjoyFullScreenAdWebView;->setContentView(Landroid/view/View;)V

    .line 76
    iget-object v0, p0, Lcom/tapjoy/TapjoyFullScreenAdWebView;->webView:Landroid/webkit/WebView;

    const-string v1, "https://ws.tapjoyads.com/"

    #v1=(Reference);
    iget-object v2, p0, Lcom/tapjoy/TapjoyFullScreenAdWebView;->htmlRawData:Ljava/lang/String;

    #v2=(Reference);
    const-string v3, "text/html"

    #v3=(Reference);
    const-string v4, "utf-8"

    #v4=(Reference);
    invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    return-void
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 102
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 105
    iget-boolean v0, p0, Lcom/tapjoy/TapjoyFullScreenAdWebView;->resumeCalled:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getInstance()Lcom/tapjoy/TapjoyConnectCore;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 107
    const-string v0, "Full Screen Ad"

    const-string v1, "call connect"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getInstance()Lcom/tapjoy/TapjoyConnectCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tapjoy/TapjoyConnectCore;->callConnect()V

    .line 111
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/tapjoy/TapjoyFullScreenAdWebView;->resumeCalled:Z

    .line 112
    return-void
.end method

*/}
