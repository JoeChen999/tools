package com.tapjoy; class TJCOffersWebView {/*

.class public Lcom/tapjoy/TJCOffersWebView;
.super Landroid/app/Activity;
.source "TJCOffersWebView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tapjoy/TJCOffersWebView$1;,
        Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient;
    }
.end annotation


# instance fields
.field final TAPJOY_OFFERS:Ljava/lang/String;

.field private clientPackage:Ljava/lang/String;

.field private dialog:Landroid/app/Dialog;

.field private offersURL:Ljava/lang/String;

.field private progressBar:Landroid/widget/ProgressBar;

.field private resumeCalled:Z

.field private skipOfferWall:Z

.field private urlParams:Ljava/lang/String;

.field private userID:Ljava/lang/String;

.field private webView:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    #v1=(Null);
    const/4 v0, 0x0

    .line 30
    #v0=(Null);
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 32
    #p0=(Reference);
    iput-object v0, p0, Lcom/tapjoy/TJCOffersWebView;->webView:Landroid/webkit/WebView;

    .line 33
    iput-object v0, p0, Lcom/tapjoy/TJCOffersWebView;->offersURL:Ljava/lang/String;

    .line 36
    iput-object v0, p0, Lcom/tapjoy/TJCOffersWebView;->dialog:Landroid/app/Dialog;

    .line 38
    const-string v0, ""

    #v0=(Reference);
    iput-object v0, p0, Lcom/tapjoy/TJCOffersWebView;->clientPackage:Ljava/lang/String;

    .line 39
    const-string v0, ""

    iput-object v0, p0, Lcom/tapjoy/TJCOffersWebView;->urlParams:Ljava/lang/String;

    .line 40
    const-string v0, ""

    iput-object v0, p0, Lcom/tapjoy/TJCOffersWebView;->userID:Ljava/lang/String;

    .line 42
    const-string v0, "Offers"

    iput-object v0, p0, Lcom/tapjoy/TJCOffersWebView;->TAPJOY_OFFERS:Ljava/lang/String;

    .line 44
    iput-boolean v1, p0, Lcom/tapjoy/TJCOffersWebView;->skipOfferWall:Z

    .line 45
    iput-boolean v1, p0, Lcom/tapjoy/TJCOffersWebView;->resumeCalled:Z

    .line 180
    return-void
.end method

.method static synthetic access$100(Lcom/tapjoy/TJCOffersWebView;)Landroid/widget/ProgressBar;
    .locals 1
    .parameter "x0"

    .prologue
    .line 30
    iget-object v0, p0, Lcom/tapjoy/TJCOffersWebView;->progressBar:Landroid/widget/ProgressBar;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$200(Lcom/tapjoy/TJCOffersWebView;)Landroid/app/Dialog;
    .locals 1
    .parameter "x0"

    .prologue
    .line 30
    iget-object v0, p0, Lcom/tapjoy/TJCOffersWebView;->dialog:Landroid/app/Dialog;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$202(Lcom/tapjoy/TJCOffersWebView;Landroid/app/Dialog;)Landroid/app/Dialog;
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 30
    iput-object p1, p0, Lcom/tapjoy/TJCOffersWebView;->dialog:Landroid/app/Dialog;

    return-object p1
.end method

.method static synthetic access$300(Lcom/tapjoy/TJCOffersWebView;)Z
    .locals 1
    .parameter "x0"

    .prologue
    .line 30
    iget-boolean v0, p0, Lcom/tapjoy/TJCOffersWebView;->skipOfferWall:Z

    #v0=(Boolean);
    return v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 12
    .parameter "savedInstanceState"

    .prologue
    const/4 v11, 0x0

    #v11=(Null);
    const/4 v10, 0x0

    #v10=(Null);
    const/4 v9, -0x1

    #v9=(Byte);
    const/4 v8, -0x2

    #v8=(Byte);
    const/4 v7, 0x1

    .line 51
    #v7=(One);
    invoke-virtual {p0}, Lcom/tapjoy/TJCOffersWebView;->getIntent()Landroid/content/Intent;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 54
    .local v0, extras:Landroid/os/Bundle;
    #v0=(Reference);
    if-eqz v0, :cond_3

    .line 57
    const-string v4, "DISPLAY_AD_URL"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 59
    iput-boolean v7, p0, Lcom/tapjoy/TJCOffersWebView;->skipOfferWall:Z

    .line 60
    const-string v4, "DISPLAY_AD_URL"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/tapjoy/TJCOffersWebView;->offersURL:Ljava/lang/String;

    .line 94
    :goto_0
    #v5=(Conflicted);v6=(Conflicted);
    iget-object v4, p0, Lcom/tapjoy/TJCOffersWebView;->offersURL:Ljava/lang/String;

    const-string v5, " "

    #v5=(Reference);
    const-string v6, "%20"

    #v6=(Reference);
    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/tapjoy/TJCOffersWebView;->offersURL:Ljava/lang/String;

    .line 97
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getClientPackage()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/tapjoy/TJCOffersWebView;->clientPackage:Ljava/lang/String;

    .line 99
    const-string v4, "Offers"

    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    const-string v6, "clientPackage: ["

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p0, Lcom/tapjoy/TJCOffersWebView;->clientPackage:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "]"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 102
    invoke-virtual {p0, v7}, Lcom/tapjoy/TJCOffersWebView;->requestWindowFeature(I)Z

    .line 106
    new-instance v1, Landroid/widget/RelativeLayout;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 110
    .local v1, layout:Landroid/widget/RelativeLayout;
    #v1=(Reference);
    new-instance v4, Landroid/webkit/WebView;

    #v4=(UninitRef);
    invoke-direct {v4, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    #v4=(Reference);
    iput-object v4, p0, Lcom/tapjoy/TJCOffersWebView;->webView:Landroid/webkit/WebView;

    .line 111
    iget-object v4, p0, Lcom/tapjoy/TJCOffersWebView;->webView:Landroid/webkit/WebView;

    new-instance v5, Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient;

    #v5=(UninitRef);
    invoke-direct {v5, p0, v11}, Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient;-><init>(Lcom/tapjoy/TJCOffersWebView;Lcom/tapjoy/TJCOffersWebView$1;)V

    #v5=(Reference);
    invoke-virtual {v4, v5}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 113
    iget-object v4, p0, Lcom/tapjoy/TJCOffersWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {v4}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v3

    .line 114
    .local v3, webSettings:Landroid/webkit/WebSettings;
    #v3=(Reference);
    invoke-virtual {v3, v7}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 118
    new-instance v4, Landroid/widget/ProgressBar;

    #v4=(UninitRef);
    const v5, 0x101007a

    #v5=(Integer);
    invoke-direct {v4, p0, v11, v5}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    #v4=(Reference);
    iput-object v4, p0, Lcom/tapjoy/TJCOffersWebView;->progressBar:Landroid/widget/ProgressBar;

    .line 119
    iget-object v4, p0, Lcom/tapjoy/TJCOffersWebView;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {v4, v10}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 122
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    #v2=(UninitRef);
    invoke-direct {v2, v8, v8}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 123
    .local v2, layoutParams:Landroid/widget/RelativeLayout$LayoutParams;
    #v2=(Reference);
    const/16 v4, 0xd

    #v4=(PosByte);
    invoke-virtual {v2, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 124
    iget-object v4, p0, Lcom/tapjoy/TJCOffersWebView;->progressBar:Landroid/widget/ProgressBar;

    #v4=(Reference);
    invoke-virtual {v4, v2}, Landroid/widget/ProgressBar;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 127
    iget-object v4, p0, Lcom/tapjoy/TJCOffersWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {v1, v4, v9, v9}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;II)V

    .line 128
    iget-object v4, p0, Lcom/tapjoy/TJCOffersWebView;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v4}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 129
    invoke-virtual {p0, v1}, Lcom/tapjoy/TJCOffersWebView;->setContentView(Landroid/view/View;)V

    .line 133
    iget-object v4, p0, Lcom/tapjoy/TJCOffersWebView;->webView:Landroid/webkit/WebView;

    iget-object v5, p0, Lcom/tapjoy/TJCOffersWebView;->offersURL:Ljava/lang/String;

    #v5=(Reference);
    invoke-virtual {v4, v5}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 135
    const-string v4, "Offers"

    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    const-string v6, "Opening URL = ["

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p0, Lcom/tapjoy/TJCOffersWebView;->offersURL:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "]"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    return-void

    .line 65
    .end local v1           #layout:Landroid/widget/RelativeLayout;
    .end local v2           #layoutParams:Landroid/widget/RelativeLayout$LayoutParams;
    .end local v3           #webSettings:Landroid/webkit/WebSettings;
    :cond_0
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);
    iput-boolean v10, p0, Lcom/tapjoy/TJCOffersWebView;->skipOfferWall:Z

    .line 67
    const-string v4, "URL_PARAMS"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/tapjoy/TJCOffersWebView;->urlParams:Ljava/lang/String;

    .line 68
    const-string v4, "USER_ID"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/tapjoy/TJCOffersWebView;->userID:Ljava/lang/String;

    .line 71
    iget-object v4, p0, Lcom/tapjoy/TJCOffersWebView;->userID:Ljava/lang/String;

    if-nez v4, :cond_1

    .line 72
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getUserID()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/tapjoy/TJCOffersWebView;->userID:Ljava/lang/String;

    .line 75
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    #v4=(Reference);
    iget-object v5, p0, Lcom/tapjoy/TJCOffersWebView;->urlParams:Ljava/lang/String;

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "&publisher_user_id="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/tapjoy/TJCOffersWebView;->userID:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/tapjoy/TJCOffersWebView;->urlParams:Ljava/lang/String;

    .line 78
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getVideoParams()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    #v4=(Integer);
    if-lez v4, :cond_2

    .line 80
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    #v4=(Reference);
    iget-object v5, p0, Lcom/tapjoy/TJCOffersWebView;->urlParams:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "&"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getVideoParams()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/tapjoy/TJCOffersWebView;->urlParams:Ljava/lang/String;

    .line 83
    :cond_2
    #v4=(Conflicted);
    const-string v4, "Offers"

    #v4=(Reference);
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    const-string v6, "urlParams: ["

    #v6=(Reference);
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p0, Lcom/tapjoy/TJCOffersWebView;->urlParams:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "]"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    #v4=(Reference);
    const-string v5, "https://ws.tapjoyads.com/get_offers/webpage?"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/tapjoy/TJCOffersWebView;->urlParams:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/tapjoy/TJCOffersWebView;->offersURL:Ljava/lang/String;

    goto/16 :goto_0

    .line 91
    :cond_3
    #v5=(Uninit);v6=(Uninit);
    const-string v4, "Offers"

    const-string v5, "Tapjoy offers meta data initialization fail."

    #v5=(Reference);
    invoke-static {v4, v5}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 164
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 166
    iget-object v0, p0, Lcom/tapjoy/TJCOffersWebView;->webView:Landroid/webkit/WebView;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 170
    iget-object v0, p0, Lcom/tapjoy/TJCOffersWebView;->webView:Landroid/webkit/WebView;

    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 171
    iget-object v0, p0, Lcom/tapjoy/TJCOffersWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroyDrawingCache()V

    .line 172
    iget-object v0, p0, Lcom/tapjoy/TJCOffersWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 174
    :cond_0
    #v1=(Conflicted);
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1
    .parameter "keyCode"
    .parameter "event"

    .prologue
    .line 345
    const/4 v0, 0x4

    #v0=(PosByte);
    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/tapjoy/TJCOffersWebView;->webView:Landroid/webkit/WebView;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 347
    iget-object v0, p0, Lcom/tapjoy/TJCOffersWebView;->webView:Landroid/webkit/WebView;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    .line 348
    const/4 v0, 0x1

    .line 350
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(PosByte);
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 144
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 147
    iget-object v0, p0, Lcom/tapjoy/TJCOffersWebView;->offersURL:Ljava/lang/String;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tapjoy/TJCOffersWebView;->webView:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 148
    iget-object v0, p0, Lcom/tapjoy/TJCOffersWebView;->webView:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/tapjoy/TJCOffersWebView;->offersURL:Ljava/lang/String;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 151
    :cond_0
    #v1=(Conflicted);
    iget-boolean v0, p0, Lcom/tapjoy/TJCOffersWebView;->resumeCalled:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getInstance()Lcom/tapjoy/TapjoyConnectCore;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_1

    .line 153
    const-string v0, "Offers"

    const-string v1, "call connect"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getInstance()Lcom/tapjoy/TapjoyConnectCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tapjoy/TapjoyConnectCore;->callConnect()V

    .line 157
    :cond_1
    #v0=(Conflicted);v1=(Conflicted);
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/tapjoy/TJCOffersWebView;->resumeCalled:Z

    .line 158
    return-void
.end method

*/}
