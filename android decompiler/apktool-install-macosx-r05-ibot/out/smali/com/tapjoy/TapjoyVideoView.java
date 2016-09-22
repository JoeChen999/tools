package com.tapjoy; class TapjoyVideoView {/*

.class public Lcom/tapjoy/TapjoyVideoView;
.super Landroid/app/Activity;
.source "TapjoyVideoView.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;
.implements Landroid/media/MediaPlayer$OnErrorListener;
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tapjoy/TapjoyVideoView$RemainingTime;
    }
.end annotation


# static fields
.field private static final BUNDLE_DIALOG_SHOWING:Ljava/lang/String; = "dialog_showing"

.field private static final BUNDLE_SEEK_TIME:Ljava/lang/String; = "seek_time"

.field private static final DIALOG_WARNING_ID:I = 0x0

.field private static streamingVideo:Z = false

.field static textSize:I = 0x0

.field private static videoData:Lcom/tapjoy/TapjoyVideoObject; = null

.field private static videoError:Z = false

.field private static final videoSecondsText:Ljava/lang/String; = " seconds"

.field private static final videoWillResumeText:Ljava/lang/String; = ""


# instance fields
.field final TAPJOY_VIDEO:Ljava/lang/String;

.field private allowBackKey:Z

.field private clickRequestSuccess:Z

.field deviceScreenDensity:I

.field deviceScreenLayoutSize:I

.field dialog:Landroid/app/Dialog;

.field private dialogShowing:Z

.field final mHandler:Landroid/os/Handler;

.field final mUpdateResults:Ljava/lang/Runnable;

.field private overlayText:Landroid/widget/TextView;

.field private relativeLayout:Landroid/widget/RelativeLayout;

.field private seekTime:I

.field private sendClick:Z

.field private tapjoyImage:Landroid/widget/ImageView;

.field private timeRemaining:I

.field timer:Ljava/util/Timer;

.field private videoPath:Ljava/lang/String;

.field private videoView:Landroid/widget/VideoView;

.field private watermark:Landroid/graphics/Bitmap;

.field private webView:Landroid/webkit/WebView;

.field private webviewURL:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 49
    #v0=(Null);
    sput-boolean v0, Lcom/tapjoy/TapjoyVideoView;->videoError:Z

    .line 50
    sput-boolean v0, Lcom/tapjoy/TapjoyVideoView;->streamingVideo:Z

    .line 78
    const/16 v0, 0x10

    #v0=(PosByte);
    sput v0, Lcom/tapjoy/TapjoyVideoView;->textSize:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    #v1=(Null);
    const/4 v0, 0x0

    .line 35
    #v0=(Null);
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 37
    #p0=(Reference);
    iput-object v1, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    .line 38
    iput-object v1, p0, Lcom/tapjoy/TapjoyVideoView;->videoPath:Ljava/lang/String;

    .line 39
    iput-object v1, p0, Lcom/tapjoy/TapjoyVideoView;->overlayText:Landroid/widget/TextView;

    .line 40
    iput-object v1, p0, Lcom/tapjoy/TapjoyVideoView;->webviewURL:Ljava/lang/String;

    .line 47
    iput-object v1, p0, Lcom/tapjoy/TapjoyVideoView;->timer:Ljava/util/Timer;

    .line 54
    iput-boolean v0, p0, Lcom/tapjoy/TapjoyVideoView;->dialogShowing:Z

    .line 58
    iput-boolean v0, p0, Lcom/tapjoy/TapjoyVideoView;->sendClick:Z

    .line 59
    iput-boolean v0, p0, Lcom/tapjoy/TapjoyVideoView;->clickRequestSuccess:Z

    .line 60
    iput-boolean v0, p0, Lcom/tapjoy/TapjoyVideoView;->allowBackKey:Z

    .line 61
    iput v0, p0, Lcom/tapjoy/TapjoyVideoView;->timeRemaining:I

    .line 62
    iput v0, p0, Lcom/tapjoy/TapjoyVideoView;->seekTime:I

    .line 73
    const-string v0, "VIDEO"

    #v0=(Reference);
    iput-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->TAPJOY_VIDEO:Ljava/lang/String;

    .line 76
    new-instance v0, Landroid/os/Handler;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->mHandler:Landroid/os/Handler;

    .line 433
    new-instance v0, Lcom/tapjoy/TapjoyVideoView$3;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/tapjoy/TapjoyVideoView$3;-><init>(Lcom/tapjoy/TapjoyVideoView;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->mUpdateResults:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic access$000(Lcom/tapjoy/TapjoyVideoView;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/tapjoy/TapjoyVideoView;->initVideoView()V

    return-void
.end method

.method static synthetic access$200()Lcom/tapjoy/TapjoyVideoObject;
    .locals 1

    .prologue
    .line 35
    sget-object v0, Lcom/tapjoy/TapjoyVideoView;->videoData:Lcom/tapjoy/TapjoyVideoObject;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$300(Lcom/tapjoy/TapjoyVideoView;)Z
    .locals 1
    .parameter "x0"

    .prologue
    .line 35
    iget-boolean v0, p0, Lcom/tapjoy/TapjoyVideoView;->clickRequestSuccess:Z

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$302(Lcom/tapjoy/TapjoyVideoView;Z)Z
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 35
    iput-boolean p1, p0, Lcom/tapjoy/TapjoyVideoView;->clickRequestSuccess:Z

    return p1
.end method

.method static synthetic access$400(Lcom/tapjoy/TapjoyVideoView;)I
    .locals 1
    .parameter "x0"

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/tapjoy/TapjoyVideoView;->getRemainingVideoTime()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method static synthetic access$500(Lcom/tapjoy/TapjoyVideoView;)Landroid/widget/TextView;
    .locals 1
    .parameter "x0"

    .prologue
    .line 35
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->overlayText:Landroid/widget/TextView;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$600(Lcom/tapjoy/TapjoyVideoView;)I
    .locals 1
    .parameter "x0"

    .prologue
    .line 35
    iget v0, p0, Lcom/tapjoy/TapjoyVideoView;->seekTime:I

    #v0=(Integer);
    return v0
.end method

.method static synthetic access$700(Lcom/tapjoy/TapjoyVideoView;)Landroid/widget/VideoView;
    .locals 1
    .parameter "x0"

    .prologue
    .line 35
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$802(Lcom/tapjoy/TapjoyVideoView;Z)Z
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 35
    iput-boolean p1, p0, Lcom/tapjoy/TapjoyVideoView;->dialogShowing:Z

    return p1
.end method

.method private getRemainingVideoTime()I
    .locals 3

    .prologue
    .line 410
    iget-object v1, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/widget/VideoView;->getDuration()I

    move-result v1

    #v1=(Integer);
    iget-object v2, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/widget/VideoView;->getCurrentPosition()I

    move-result v2

    #v2=(Integer);
    sub-int/2addr v1, v2

    div-int/lit16 v0, v1, 0x3e8

    .line 412
    .local v0, timeRemaining:I
    #v0=(Integer);
    if-gez v0, :cond_0

    .line 413
    const/4 v0, 0x0

    .line 415
    :cond_0
    return v0
.end method

.method private initVideoCompletionScreen()V
    .locals 3

    .prologue
    .line 284
    new-instance v1, Landroid/webkit/WebView;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/tapjoy/TapjoyVideoView;->webView:Landroid/webkit/WebView;

    .line 285
    iget-object v1, p0, Lcom/tapjoy/TapjoyVideoView;->webView:Landroid/webkit/WebView;

    new-instance v2, Lcom/tapjoy/TapjoyVideoView$1;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Lcom/tapjoy/TapjoyVideoView$1;-><init>(Lcom/tapjoy/TapjoyVideoView;)V

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 326
    iget-object v1, p0, Lcom/tapjoy/TapjoyVideoView;->webView:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    .line 327
    .local v0, webSettings:Landroid/webkit/WebSettings;
    #v0=(Reference);
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 329
    iget-object v1, p0, Lcom/tapjoy/TapjoyVideoView;->webView:Landroid/webkit/WebView;

    #v1=(Reference);
    iget-object v2, p0, Lcom/tapjoy/TapjoyVideoView;->webviewURL:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 330
    return-void
.end method

.method private initVideoView()V
    .locals 9

    .prologue
    const/16 v8, 0xc

    #v8=(PosByte);
    const/4 v7, 0x1

    #v7=(One);
    const/4 v6, -0x2

    .line 213
    #v6=(Byte);
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->relativeLayout:Landroid/widget/RelativeLayout;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 214
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->relativeLayout:Landroid/widget/RelativeLayout;

    const/high16 v4, -0x100

    #v4=(Integer);
    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 216
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    if-nez v3, :cond_1

    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->overlayText:Landroid/widget/TextView;

    if-nez v3, :cond_1

    .line 221
    new-instance v3, Landroid/widget/ImageView;

    #v3=(UninitRef);
    invoke-direct {v3, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    #v3=(Reference);
    iput-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->tapjoyImage:Landroid/widget/ImageView;

    .line 224
    invoke-static {}, Lcom/tapjoy/TapjoyVideo;->getWatermarkImage()Landroid/graphics/Bitmap;

    move-result-object v3

    iput-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->watermark:Landroid/graphics/Bitmap;

    .line 226
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->watermark:Landroid/graphics/Bitmap;

    if-eqz v3, :cond_0

    .line 227
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->tapjoyImage:Landroid/widget/ImageView;

    iget-object v4, p0, Lcom/tapjoy/TapjoyVideoView;->watermark:Landroid/graphics/Bitmap;

    #v4=(Reference);
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 229
    :cond_0
    #v4=(Conflicted);
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    #v0=(UninitRef);
    invoke-direct {v0, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 230
    .local v0, imageParams:Landroid/widget/RelativeLayout$LayoutParams;
    #v0=(Reference);
    invoke-virtual {v0, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 231
    const/16 v3, 0xb

    #v3=(PosByte);
    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 232
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->tapjoyImage:Landroid/widget/ImageView;

    #v3=(Reference);
    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 237
    new-instance v3, Landroid/widget/VideoView;

    #v3=(UninitRef);
    invoke-direct {v3, p0}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;)V

    #v3=(Reference);
    iput-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    .line 238
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    invoke-virtual {v3, p0}, Landroid/widget/VideoView;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 239
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    invoke-virtual {v3, p0}, Landroid/widget/VideoView;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 240
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    invoke-virtual {v3, p0}, Landroid/widget/VideoView;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 242
    sget-boolean v3, Lcom/tapjoy/TapjoyVideoView;->streamingVideo:Z

    #v3=(Boolean);
    if-eqz v3, :cond_2

    .line 244
    const-string v3, "VIDEO"

    #v3=(Reference);
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    #v4=(Reference);
    const-string v5, "streaming video: "

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/tapjoy/TapjoyVideoView;->videoPath:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    iget-object v4, p0, Lcom/tapjoy/TapjoyVideoView;->videoPath:Ljava/lang/String;

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/VideoView;->setVideoURI(Landroid/net/Uri;)V

    .line 253
    :goto_0
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    #v1=(UninitRef);
    invoke-direct {v1, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 254
    .local v1, layoutParams:Landroid/widget/RelativeLayout$LayoutParams;
    #v1=(Reference);
    const/16 v3, 0xd

    #v3=(PosByte);
    invoke-virtual {v1, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 255
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    #v3=(Reference);
    invoke-virtual {v3, v1}, Landroid/widget/VideoView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 260
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    invoke-virtual {v3}, Landroid/widget/VideoView;->getDuration()I

    move-result v3

    #v3=(Integer);
    div-int/lit16 v3, v3, 0x3e8

    iput v3, p0, Lcom/tapjoy/TapjoyVideoView;->timeRemaining:I

    .line 262
    const-string v3, "VIDEO"

    #v3=(Reference);
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    #v4=(Reference);
    const-string v5, "videoView.getDuration(): "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    invoke-virtual {v5}, Landroid/widget/VideoView;->getDuration()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    const-string v3, "VIDEO"

    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    #v4=(Reference);
    const-string v5, "timeRemaining: "

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v5, p0, Lcom/tapjoy/TapjoyVideoView;->timeRemaining:I

    #v5=(Integer);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    new-instance v3, Landroid/widget/TextView;

    #v3=(UninitRef);
    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    #v3=(Reference);
    iput-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->overlayText:Landroid/widget/TextView;

    .line 266
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->overlayText:Landroid/widget/TextView;

    sget v4, Lcom/tapjoy/TapjoyVideoView;->textSize:I

    #v4=(Integer);
    int-to-float v4, v4

    #v4=(Float);
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 267
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->overlayText:Landroid/widget/TextView;

    const-string v4, "default"

    #v4=(Reference);
    invoke-static {v4, v7}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v4

    invoke-virtual {v3, v4, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 269
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    #v2=(UninitRef);
    invoke-direct {v2, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 270
    .local v2, textParams:Landroid/widget/RelativeLayout$LayoutParams;
    #v2=(Reference);
    invoke-virtual {v2, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 271
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->overlayText:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 274
    .end local v0           #imageParams:Landroid/widget/RelativeLayout$LayoutParams;
    .end local v1           #layoutParams:Landroid/widget/RelativeLayout$LayoutParams;
    .end local v2           #textParams:Landroid/widget/RelativeLayout$LayoutParams;
    :cond_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    invoke-direct {p0}, Lcom/tapjoy/TapjoyVideoView;->startVideo()V

    .line 276
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->relativeLayout:Landroid/widget/RelativeLayout;

    iget-object v4, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    #v4=(Reference);
    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 277
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->relativeLayout:Landroid/widget/RelativeLayout;

    iget-object v4, p0, Lcom/tapjoy/TapjoyVideoView;->tapjoyImage:Landroid/widget/ImageView;

    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 278
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->relativeLayout:Landroid/widget/RelativeLayout;

    iget-object v4, p0, Lcom/tapjoy/TapjoyVideoView;->overlayText:Landroid/widget/TextView;

    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 279
    return-void

    .line 249
    .restart local v0       #imageParams:Landroid/widget/RelativeLayout$LayoutParams;
    :cond_2
    #v0=(Reference);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(Conflicted);v5=(Uninit);
    const-string v3, "VIDEO"

    #v3=(Reference);
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    #v4=(Reference);
    const-string v5, "cached video: "

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/tapjoy/TapjoyVideoView;->videoPath:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    iget-object v4, p0, Lcom/tapjoy/TapjoyVideoView;->videoPath:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/widget/VideoView;->setVideoPath(Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method private showVideoCompletionScreen()V
    .locals 3

    .prologue
    const/4 v2, -0x1

    .line 335
    #v2=(Byte);
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->relativeLayout:Landroid/widget/RelativeLayout;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 336
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->relativeLayout:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/tapjoy/TapjoyVideoView;->webView:Landroid/webkit/WebView;

    #v1=(Reference);
    invoke-virtual {v0, v1, v2, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;II)V

    .line 337
    return-void
.end method

.method private startVideo()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 345
    #v6=(Null);
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/VideoView;->requestFocus()Z

    .line 348
    iget-boolean v0, p0, Lcom/tapjoy/TapjoyVideoView;->dialogShowing:Z

    #v0=(Boolean);
    if-eqz v0, :cond_2

    .line 350
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    #v0=(Reference);
    iget v1, p0, Lcom/tapjoy/TapjoyVideoView;->seekTime:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->seekTo(I)V

    .line 351
    const-string v0, "VIDEO"

    const-string v1, "dialog is showing -- don\'t start"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    :goto_0
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->timer:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 366
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->timer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 370
    :cond_0
    new-instance v0, Ljava/util/Timer;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->timer:Ljava/util/Timer;

    .line 371
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->timer:Ljava/util/Timer;

    new-instance v1, Lcom/tapjoy/TapjoyVideoView$RemainingTime;

    #v1=(UninitRef);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-direct {v1, p0, v2}, Lcom/tapjoy/TapjoyVideoView$RemainingTime;-><init>(Lcom/tapjoy/TapjoyVideoView;Lcom/tapjoy/TapjoyVideoView$1;)V

    #v1=(Reference);
    const-wide/16 v2, 0x1f4

    #v2=(LongLo);v3=(LongHi);
    const-wide/16 v4, 0x64

    #v4=(LongLo);v5=(LongHi);
    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 374
    invoke-direct {p0}, Lcom/tapjoy/TapjoyVideoView;->initVideoCompletionScreen()V

    .line 377
    iput-boolean v6, p0, Lcom/tapjoy/TapjoyVideoView;->clickRequestSuccess:Z

    .line 380
    iget-boolean v0, p0, Lcom/tapjoy/TapjoyVideoView;->sendClick:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 382
    new-instance v0, Ljava/lang/Thread;

    #v0=(UninitRef);
    new-instance v1, Lcom/tapjoy/TapjoyVideoView$2;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/tapjoy/TapjoyVideoView$2;-><init>(Lcom/tapjoy/TapjoyVideoView;)V

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 399
    iput-boolean v6, p0, Lcom/tapjoy/TapjoyVideoView;->sendClick:Z

    .line 401
    :cond_1
    #v0=(Conflicted);
    return-void

    .line 355
    :cond_2
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    const-string v0, "VIDEO"

    #v0=(Reference);
    const-string v1, "start"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 356
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    invoke-virtual {v0, v6}, Landroid/widget/VideoView;->seekTo(I)V

    .line 357
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->start()V

    .line 360
    invoke-static {}, Lcom/tapjoy/TapjoyVideo;->videoNotifierStart()V

    goto :goto_0
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 2
    .parameter "mp"

    .prologue
    .line 472
    const-string v0, "VIDEO"

    #v0=(Reference);
    const-string v1, "onCompletion"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 474
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->timer:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 475
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->timer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 477
    :cond_0
    invoke-direct {p0}, Lcom/tapjoy/TapjoyVideoView;->showVideoCompletionScreen()V

    .line 479
    sget-boolean v0, Lcom/tapjoy/TapjoyVideoView;->videoError:Z

    #v0=(Boolean);
    if-nez v0, :cond_1

    .line 481
    invoke-static {}, Lcom/tapjoy/TapjoyVideo;->videoNotifierComplete()V

    .line 483
    new-instance v0, Ljava/lang/Thread;

    #v0=(UninitRef);
    new-instance v1, Lcom/tapjoy/TapjoyVideoView$4;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/tapjoy/TapjoyVideoView$4;-><init>(Lcom/tapjoy/TapjoyVideoView;)V

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 495
    :cond_1
    #v0=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    sput-boolean v0, Lcom/tapjoy/TapjoyVideoView;->videoError:Z

    .line 496
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/tapjoy/TapjoyVideoView;->allowBackKey:Z

    .line 497
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 7
    .parameter "savedInstanceState"

    .prologue
    const/4 v6, -0x1

    #v6=(Byte);
    const/4 v5, 0x1

    .line 84
    #v5=(One);
    const-string v2, "VIDEO"

    #v2=(Reference);
    const-string v3, "onCreate"

    #v3=(Reference);
    invoke-static {v2, v3}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 87
    if-eqz p1, :cond_0

    .line 89
    const-string v2, "VIDEO"

    const-string v3, "*** Loading saved data from bundle ***"

    invoke-static {v2, v3}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    const-string v2, "seek_time"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    iput v2, p0, Lcom/tapjoy/TapjoyVideoView;->seekTime:I

    .line 91
    const-string v2, "dialog_showing"

    #v2=(Reference);
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    #v2=(Boolean);
    iput-boolean v2, p0, Lcom/tapjoy/TapjoyVideoView;->dialogShowing:Z

    .line 94
    :cond_0
    #v2=(Conflicted);
    const-string v2, "VIDEO"

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "dialogShowing: "

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-boolean v4, p0, Lcom/tapjoy/TapjoyVideoView;->dialogShowing:Z

    #v4=(Boolean);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", seekTime: "

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lcom/tapjoy/TapjoyVideoView;->seekTime:I

    #v4=(Integer);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    iput-boolean v5, p0, Lcom/tapjoy/TapjoyVideoView;->sendClick:Z

    .line 97
    const/4 v2, 0x0

    #v2=(Null);
    sput-boolean v2, Lcom/tapjoy/TapjoyVideoView;->streamingVideo:Z

    .line 100
    invoke-static {}, Lcom/tapjoy/TapjoyVideo;->getInstance()Lcom/tapjoy/TapjoyVideo;

    move-result-object v2

    #v2=(Reference);
    if-nez v2, :cond_1

    .line 102
    const-string v2, "VIDEO"

    const-string v3, "null video"

    invoke-static {v2, v3}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    invoke-virtual {p0}, Lcom/tapjoy/TapjoyVideoView;->finish()V

    .line 151
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    .line 107
    :cond_1
    #v0=(Uninit);v1=(Uninit);
    invoke-static {}, Lcom/tapjoy/TapjoyVideo;->getInstance()Lcom/tapjoy/TapjoyVideo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tapjoy/TapjoyVideo;->getCurrentVideoData()Lcom/tapjoy/TapjoyVideoObject;

    move-result-object v2

    sput-object v2, Lcom/tapjoy/TapjoyVideoView;->videoData:Lcom/tapjoy/TapjoyVideoObject;

    .line 108
    sget-object v2, Lcom/tapjoy/TapjoyVideoView;->videoData:Lcom/tapjoy/TapjoyVideoObject;

    iget-object v2, v2, Lcom/tapjoy/TapjoyVideoObject;->dataLocation:Ljava/lang/String;

    iput-object v2, p0, Lcom/tapjoy/TapjoyVideoView;->videoPath:Ljava/lang/String;

    .line 109
    sget-object v2, Lcom/tapjoy/TapjoyVideoView;->videoData:Lcom/tapjoy/TapjoyVideoObject;

    iget-object v2, v2, Lcom/tapjoy/TapjoyVideoObject;->webviewURL:Ljava/lang/String;

    iput-object v2, p0, Lcom/tapjoy/TapjoyVideoView;->webviewURL:Ljava/lang/String;

    .line 112
    iget-object v2, p0, Lcom/tapjoy/TapjoyVideoView;->videoPath:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/tapjoy/TapjoyVideoView;->videoPath:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    if-nez v2, :cond_3

    .line 114
    :cond_2
    #v2=(Conflicted);
    const-string v2, "VIDEO"

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "no cached video, try streaming video at location: "

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Lcom/tapjoy/TapjoyVideoView;->videoData:Lcom/tapjoy/TapjoyVideoObject;

    iget-object v4, v4, Lcom/tapjoy/TapjoyVideoObject;->videoURL:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    sget-object v2, Lcom/tapjoy/TapjoyVideoView;->videoData:Lcom/tapjoy/TapjoyVideoObject;

    iget-object v2, v2, Lcom/tapjoy/TapjoyVideoObject;->videoURL:Ljava/lang/String;

    iput-object v2, p0, Lcom/tapjoy/TapjoyVideoView;->videoPath:Ljava/lang/String;

    .line 116
    sput-boolean v5, Lcom/tapjoy/TapjoyVideoView;->streamingVideo:Z

    .line 119
    :cond_3
    #v2=(Conflicted);v4=(Conflicted);
    const-string v2, "VIDEO"

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "videoPath: "

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/tapjoy/TapjoyVideoView;->videoPath:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    invoke-virtual {p0, v5}, Lcom/tapjoy/TapjoyVideoView;->requestWindowFeature(I)Z

    .line 123
    new-instance v2, Landroid/widget/RelativeLayout;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    #v2=(Reference);
    iput-object v2, p0, Lcom/tapjoy/TapjoyVideoView;->relativeLayout:Landroid/widget/RelativeLayout;

    .line 124
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    #v1=(UninitRef);
    invoke-direct {v1, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 125
    .local v1, params:Landroid/widget/RelativeLayout$LayoutParams;
    #v1=(Reference);
    iget-object v2, p0, Lcom/tapjoy/TapjoyVideoView;->relativeLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 127
    iget-object v2, p0, Lcom/tapjoy/TapjoyVideoView;->relativeLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {p0, v2}, Lcom/tapjoy/TapjoyVideoView;->setContentView(Landroid/view/View;)V

    .line 130
    sget-object v2, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    const/4 v3, 0x3

    #v3=(PosByte);
    if-le v2, v3, :cond_4

    .line 132
    new-instance v0, Lcom/tapjoy/TapjoyDisplayMetricsUtil;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/tapjoy/TapjoyDisplayMetricsUtil;-><init>(Landroid/content/Context;)V

    .line 134
    .local v0, displayMetricsUtil:Lcom/tapjoy/TapjoyDisplayMetricsUtil;
    #v0=(Reference);
    invoke-virtual {v0}, Lcom/tapjoy/TapjoyDisplayMetricsUtil;->getScreenLayoutSize()I

    move-result v2

    iput v2, p0, Lcom/tapjoy/TapjoyVideoView;->deviceScreenLayoutSize:I

    .line 136
    const-string v2, "VIDEO"

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "deviceScreenLayoutSize: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lcom/tapjoy/TapjoyVideoView;->deviceScreenLayoutSize:I

    #v4=(Integer);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    iget v2, p0, Lcom/tapjoy/TapjoyVideoView;->deviceScreenLayoutSize:I

    #v2=(Integer);
    const/4 v3, 0x4

    #v3=(PosByte);
    if-ne v2, v3, :cond_4

    .line 142
    const/16 v2, 0x20

    #v2=(PosByte);
    sput v2, Lcom/tapjoy/TapjoyVideoView;->textSize:I

    .line 146
    .end local v0           #displayMetricsUtil:Lcom/tapjoy/TapjoyDisplayMetricsUtil;
    :cond_4
    #v0=(Conflicted);v2=(Integer);v4=(Conflicted);
    const-string v2, "VIDEO"

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "textSize: "

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget v4, Lcom/tapjoy/TapjoyVideoView;->textSize:I

    #v4=(Integer);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    invoke-direct {p0}, Lcom/tapjoy/TapjoyVideoView;->initVideoView()V

    .line 150
    const-string v2, "VIDEO"

    const-string v3, "onCreate DONE"

    invoke-static {v2, v3}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 3
    .parameter "id"

    .prologue
    .line 544
    const-string v0, "VIDEO"

    #v0=(Reference);
    const-string v1, "dialog onCreateDialog"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 547
    iget-boolean v0, p0, Lcom/tapjoy/TapjoyVideoView;->dialogShowing:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 548
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->dialog:Landroid/app/Dialog;

    .line 602
    :goto_0
    #v0=(Reference);v2=(Conflicted);
    return-object v0

    .line 551
    :cond_0
    #v0=(Boolean);v2=(Uninit);
    packed-switch p1, :pswitch_data_0

    .line 600
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->dialog:Landroid/app/Dialog;

    .line 602
    :goto_1
    #v0=(Boolean);v2=(Conflicted);
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->dialog:Landroid/app/Dialog;

    #v0=(Reference);
    goto :goto_0

    .line 554
    :pswitch_0
    #v0=(Boolean);v2=(Uninit);
    new-instance v0, Landroid/app/AlertDialog$Builder;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    const-string v1, "Cancel Video?"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "Currency will not be awarded, are you sure you want to cancel the video?"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "End"

    new-instance v2, Lcom/tapjoy/TapjoyVideoView$6;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Lcom/tapjoy/TapjoyVideoView$6;-><init>(Lcom/tapjoy/TapjoyVideoView;)V

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "Resume"

    new-instance v2, Lcom/tapjoy/TapjoyVideoView$5;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Lcom/tapjoy/TapjoyVideoView$5;-><init>(Lcom/tapjoy/TapjoyVideoView;)V

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->dialog:Landroid/app/Dialog;

    .line 581
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->dialog:Landroid/app/Dialog;

    new-instance v1, Lcom/tapjoy/TapjoyVideoView$7;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/tapjoy/TapjoyVideoView$7;-><init>(Lcom/tapjoy/TapjoyVideoView;)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 596
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->dialog:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 597
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/tapjoy/TapjoyVideoView;->dialogShowing:Z

    goto :goto_1

    .line 551
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onError(Landroid/media/MediaPlayer;II)Z
    .locals 3
    .parameter "mp"
    .parameter "what"
    .parameter "extra"

    .prologue
    const/4 v2, 0x1

    .line 456
    #v2=(One);
    sput-boolean v2, Lcom/tapjoy/TapjoyVideoView;->videoError:Z

    .line 457
    const-string v0, "VIDEO"

    #v0=(Reference);
    const-string v1, "onError"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 459
    const/4 v0, 0x3

    #v0=(PosByte);
    invoke-static {v0}, Lcom/tapjoy/TapjoyVideo;->videoNotifierError(I)V

    .line 460
    iput-boolean v2, p0, Lcom/tapjoy/TapjoyVideoView;->allowBackKey:Z

    .line 462
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->timer:Ljava/util/Timer;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 463
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->timer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 465
    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 5
    .parameter "keyCode"
    .parameter "event"

    .prologue
    const/4 v0, 0x1

    .line 503
    #v0=(One);
    const/4 v1, 0x4

    #v1=(PosByte);
    if-ne p1, v1, :cond_2

    .line 506
    iget-boolean v1, p0, Lcom/tapjoy/TapjoyVideoView;->allowBackKey:Z

    #v1=(Boolean);
    if-nez v1, :cond_1

    .line 510
    iget-object v1, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/widget/VideoView;->getCurrentPosition()I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Lcom/tapjoy/TapjoyVideoView;->seekTime:I

    .line 511
    iget-object v1, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/widget/VideoView;->pause()V

    .line 513
    iput-boolean v0, p0, Lcom/tapjoy/TapjoyVideoView;->dialogShowing:Z

    .line 514
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p0, v1}, Lcom/tapjoy/TapjoyVideoView;->showDialog(I)V

    .line 516
    const-string v1, "VIDEO"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "PAUSE VIDEO time: "

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/tapjoy/TapjoyVideoView;->seekTime:I

    #v3=(Integer);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 517
    const-string v1, "VIDEO"

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "currentPosition: "

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    invoke-virtual {v3}, Landroid/widget/VideoView;->getCurrentPosition()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 518
    const-string v1, "VIDEO"

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "duration: "

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    invoke-virtual {v3}, Landroid/widget/VideoView;->getDuration()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", elapsed: "

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    invoke-virtual {v3}, Landroid/widget/VideoView;->getDuration()I

    move-result v3

    #v3=(Integer);
    iget-object v4, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/widget/VideoView;->getCurrentPosition()I

    move-result v4

    #v4=(Integer);
    sub-int/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 538
    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return v0

    .line 525
    :cond_1
    #v0=(One);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    iget-object v1, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/widget/VideoView;->isPlaying()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    .line 527
    iget-object v1, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/widget/VideoView;->stopPlayback()V

    .line 528
    invoke-direct {p0}, Lcom/tapjoy/TapjoyVideoView;->showVideoCompletionScreen()V

    .line 530
    iget-object v1, p0, Lcom/tapjoy/TapjoyVideoView;->timer:Ljava/util/Timer;

    if-eqz v1, :cond_0

    .line 531
    iget-object v1, p0, Lcom/tapjoy/TapjoyVideoView;->timer:Ljava/util/Timer;

    invoke-virtual {v1}, Ljava/util/Timer;->cancel()V

    goto :goto_0

    .line 538
    :cond_2
    #v1=(PosByte);
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method protected onPause()V
    .locals 3

    .prologue
    .line 156
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 159
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/VideoView;->isPlaying()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 161
    const-string v0, "VIDEO"

    #v0=(Reference);
    const-string v1, "onPause"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->getCurrentPosition()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/tapjoy/TapjoyVideoView;->seekTime:I

    .line 163
    const-string v0, "VIDEO"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "seekTime: "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/tapjoy/TapjoyVideoView;->seekTime:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void
.end method

.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 2
    .parameter "mp"

    .prologue
    .line 449
    const-string v0, "VIDEO"

    #v0=(Reference);
    const-string v1, "onPrepared"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 450
    return-void
.end method

.method protected onResume()V
    .locals 3

    .prologue
    .line 171
    const-string v0, "VIDEO"

    #v0=(Reference);
    const-string v1, "onResume"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 175
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, v0}, Lcom/tapjoy/TapjoyVideoView;->setRequestedOrientation(I)V

    .line 178
    iget v0, p0, Lcom/tapjoy/TapjoyVideoView;->seekTime:I

    #v0=(Integer);
    if-lez v0, :cond_1

    .line 180
    const-string v0, "VIDEO"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "seekTime: "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/tapjoy/TapjoyVideoView;->seekTime:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    iget v1, p0, Lcom/tapjoy/TapjoyVideoView;->seekTime:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->seekTo(I)V

    .line 185
    iget-boolean v0, p0, Lcom/tapjoy/TapjoyVideoView;->dialogShowing:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->dialog:Landroid/app/Dialog;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->dialog:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    .line 186
    :cond_0
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoView;->videoView:Landroid/widget/VideoView;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/VideoView;->start()V

    .line 188
    :cond_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3
    .parameter "outState"

    .prologue
    .line 194
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 196
    const-string v0, "VIDEO"

    #v0=(Reference);
    const-string v1, "*** onSaveInstanceState ***"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    const-string v0, "VIDEO"

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "dialogShowing: "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lcom/tapjoy/TapjoyVideoView;->dialogShowing:Z

    #v2=(Boolean);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", seekTime: "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/tapjoy/TapjoyVideoView;->seekTime:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    const-string v0, "dialog_showing"

    iget-boolean v1, p0, Lcom/tapjoy/TapjoyVideoView;->dialogShowing:Z

    #v1=(Boolean);
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 199
    const-string v0, "seek_time"

    iget v1, p0, Lcom/tapjoy/TapjoyVideoView;->seekTime:I

    #v1=(Integer);
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 200
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 2
    .parameter "hasFocus"

    .prologue
    .line 206
    const-string v0, "VIDEO"

    #v0=(Reference);
    const-string v1, "onWindowFocusChanged"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V

    .line 208
    return-void
.end method

*/}
