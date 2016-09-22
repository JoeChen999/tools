package com.facebook.android; class FbDialog {/*

.class public Lcom/facebook/android/FbDialog;
.super Landroid/app/Dialog;
.source "FbDialog.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/android/FbDialog$FbWebViewClient;
    }
.end annotation


# static fields
.field static final DIMENSIONS_DIFF_LANDSCAPE:[F = null

.field static final DIMENSIONS_DIFF_PORTRAIT:[F = null

.field static final DISPLAY_STRING:Ljava/lang/String; = "touch"

.field static final FB_BLUE:I = -0x927b4c

.field static final FB_ICON:Ljava/lang/String; = "icon.png"

.field static final FILL:Landroid/widget/FrameLayout$LayoutParams; = null

.field static final MARGIN:I = 0x4

.field static final PADDING:I = 0x2


# instance fields
.field private mContent:Landroid/widget/FrameLayout;

.field private mCrossImage:Landroid/widget/ImageView;

.field private mListener:Lcom/facebook/android/Facebook$DialogListener;

.field private mSpinner:Landroid/app/ProgressDialog;

.field private mUrl:Ljava/lang/String;

.field private mWebView:Landroid/webkit/WebView;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x2

    #v2=(PosByte);
    const/4 v1, -0x1

    .line 44
    #v1=(Byte);
    new-array v0, v2, [F

    #v0=(Reference);
    fill-array-data v0, :array_0

    sput-object v0, Lcom/facebook/android/FbDialog;->DIMENSIONS_DIFF_LANDSCAPE:[F

    .line 45
    new-array v0, v2, [F

    fill-array-data v0, :array_1

    sput-object v0, Lcom/facebook/android/FbDialog;->DIMENSIONS_DIFF_PORTRAIT:[F

    .line 47
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    #v0=(UninitRef);
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 46
    #v0=(Reference);
    sput-object v0, Lcom/facebook/android/FbDialog;->FILL:Landroid/widget/FrameLayout$LayoutParams;

    .line 41
    return-void

    .line 44
    :array_0
    .array-data 0x4
        0x0t 0x0t 0xa0t 0x41t
        0x0t 0x0t 0x70t 0x42t
    .end array-data

    .line 45
    :array_1
    .array-data 0x4
        0x0t 0x0t 0x20t 0x42t
        0x0t 0x0t 0x70t 0x42t
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/android/Facebook$DialogListener;)V
    .locals 1
    .parameter "context"
    .parameter "url"
    .parameter "listener"

    .prologue
    .line 62
    const v0, 0x1030010

    #v0=(Integer);
    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 63
    #p0=(Reference);
    iput-object p2, p0, Lcom/facebook/android/FbDialog;->mUrl:Ljava/lang/String;

    .line 64
    iput-object p3, p0, Lcom/facebook/android/FbDialog;->mListener:Lcom/facebook/android/Facebook$DialogListener;

    .line 65
    return-void
.end method

.method static synthetic access$0(Lcom/facebook/android/FbDialog;)Lcom/facebook/android/Facebook$DialogListener;
    .locals 1
    .parameter

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/android/FbDialog;->mListener:Lcom/facebook/android/Facebook$DialogListener;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$1(Lcom/facebook/android/FbDialog;)Landroid/app/ProgressDialog;
    .locals 1
    .parameter

    .prologue
    .line 56
    iget-object v0, p0, Lcom/facebook/android/FbDialog;->mSpinner:Landroid/app/ProgressDialog;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$2(Lcom/facebook/android/FbDialog;)Landroid/widget/FrameLayout;
    .locals 1
    .parameter

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/android/FbDialog;->mContent:Landroid/widget/FrameLayout;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$3(Lcom/facebook/android/FbDialog;)Landroid/webkit/WebView;
    .locals 1
    .parameter

    .prologue
    .line 58
    iget-object v0, p0, Lcom/facebook/android/FbDialog;->mWebView:Landroid/webkit/WebView;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$4(Lcom/facebook/android/FbDialog;)Landroid/widget/ImageView;
    .locals 1
    .parameter

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/android/FbDialog;->mCrossImage:Landroid/widget/ImageView;

    #v0=(Reference);
    return-object v0
.end method

.method private createCrossImage()V
    .locals 3

    .prologue
    .line 97
    new-instance v1, Landroid/widget/ImageView;

    #v1=(UninitRef);
    invoke-virtual {p0}, Lcom/facebook/android/FbDialog;->getContext()Landroid/content/Context;

    move-result-object v2

    #v2=(Reference);
    invoke-direct {v1, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/facebook/android/FbDialog;->mCrossImage:Landroid/widget/ImageView;

    .line 99
    iget-object v1, p0, Lcom/facebook/android/FbDialog;->mCrossImage:Landroid/widget/ImageView;

    new-instance v2, Lcom/facebook/android/FbDialog$1;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Lcom/facebook/android/FbDialog$1;-><init>(Lcom/facebook/android/FbDialog;)V

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 106
    invoke-virtual {p0}, Lcom/facebook/android/FbDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/high16 v2, 0x7f02

    #v2=(Integer);
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 107
    .local v0, crossDrawable:Landroid/graphics/drawable/Drawable;
    #v0=(Reference);
    iget-object v1, p0, Lcom/facebook/android/FbDialog;->mCrossImage:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 111
    iget-object v1, p0, Lcom/facebook/android/FbDialog;->mCrossImage:Landroid/widget/ImageView;

    const/4 v2, 0x4

    #v2=(PosByte);
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 112
    return-void
.end method

.method private setUpWebView(I)V
    .locals 5
    .parameter "margin"

    .prologue
    const/4 v4, 0x0

    .line 115
    #v4=(Null);
    new-instance v0, Landroid/widget/LinearLayout;

    #v0=(UninitRef);
    invoke-virtual {p0}, Lcom/facebook/android/FbDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 116
    .local v0, webViewContainer:Landroid/widget/LinearLayout;
    #v0=(Reference);
    new-instance v1, Landroid/webkit/WebView;

    #v1=(UninitRef);
    invoke-virtual {p0}, Lcom/facebook/android/FbDialog;->getContext()Landroid/content/Context;

    move-result-object v2

    #v2=(Reference);
    invoke-direct {v1, v2}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/facebook/android/FbDialog;->mWebView:Landroid/webkit/WebView;

    .line 117
    iget-object v1, p0, Lcom/facebook/android/FbDialog;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v1, v4}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V

    .line 118
    iget-object v1, p0, Lcom/facebook/android/FbDialog;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v1, v4}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V

    .line 119
    iget-object v1, p0, Lcom/facebook/android/FbDialog;->mWebView:Landroid/webkit/WebView;

    new-instance v2, Lcom/facebook/android/FbDialog$FbWebViewClient;

    #v2=(UninitRef);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-direct {v2, p0, v3}, Lcom/facebook/android/FbDialog$FbWebViewClient;-><init>(Lcom/facebook/android/FbDialog;Lcom/facebook/android/FbDialog$FbWebViewClient;)V

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 120
    iget-object v1, p0, Lcom/facebook/android/FbDialog;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 121
    iget-object v1, p0, Lcom/facebook/android/FbDialog;->mWebView:Landroid/webkit/WebView;

    iget-object v2, p0, Lcom/facebook/android/FbDialog;->mUrl:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 122
    iget-object v1, p0, Lcom/facebook/android/FbDialog;->mWebView:Landroid/webkit/WebView;

    sget-object v2, Lcom/facebook/android/FbDialog;->FILL:Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 123
    iget-object v1, p0, Lcom/facebook/android/FbDialog;->mWebView:Landroid/webkit/WebView;

    const/4 v2, 0x4

    #v2=(PosByte);
    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 124
    iget-object v1, p0, Lcom/facebook/android/FbDialog;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 126
    invoke-virtual {v0, p1, p1, p1, p1}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 127
    iget-object v1, p0, Lcom/facebook/android/FbDialog;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 128
    iget-object v1, p0, Lcom/facebook/android/FbDialog;->mContent:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 129
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6
    .parameter "savedInstanceState"

    .prologue
    const/4 v3, 0x1

    #v3=(One);
    const/4 v5, -0x1

    #v5=(Byte);
    const/4 v4, -0x2

    .line 69
    #v4=(Byte);
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 70
    new-instance v1, Landroid/app/ProgressDialog;

    #v1=(UninitRef);
    invoke-virtual {p0}, Lcom/facebook/android/FbDialog;->getContext()Landroid/content/Context;

    move-result-object v2

    #v2=(Reference);
    invoke-direct {v1, v2}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/facebook/android/FbDialog;->mSpinner:Landroid/app/ProgressDialog;

    .line 71
    iget-object v1, p0, Lcom/facebook/android/FbDialog;->mSpinner:Landroid/app/ProgressDialog;

    invoke-virtual {v1, v3}, Landroid/app/ProgressDialog;->requestWindowFeature(I)Z

    .line 72
    iget-object v1, p0, Lcom/facebook/android/FbDialog;->mSpinner:Landroid/app/ProgressDialog;

    const-string v2, "Loading..."

    invoke-virtual {v1, v2}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 74
    invoke-virtual {p0, v3}, Lcom/facebook/android/FbDialog;->requestWindowFeature(I)Z

    .line 75
    new-instance v1, Landroid/widget/FrameLayout;

    #v1=(UninitRef);
    invoke-virtual {p0}, Lcom/facebook/android/FbDialog;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/facebook/android/FbDialog;->mContent:Landroid/widget/FrameLayout;

    .line 81
    invoke-direct {p0}, Lcom/facebook/android/FbDialog;->createCrossImage()V

    .line 86
    iget-object v1, p0, Lcom/facebook/android/FbDialog;->mCrossImage:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    .line 87
    .local v0, crossWidth:I
    #v0=(Integer);
    div-int/lit8 v1, v0, 0x2

    #v1=(Integer);
    invoke-direct {p0, v1}, Lcom/facebook/android/FbDialog;->setUpWebView(I)V

    .line 92
    iget-object v1, p0, Lcom/facebook/android/FbDialog;->mContent:Landroid/widget/FrameLayout;

    #v1=(Reference);
    iget-object v2, p0, Lcom/facebook/android/FbDialog;->mCrossImage:Landroid/widget/ImageView;

    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    #v3=(UninitRef);
    invoke-direct {v3, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    #v3=(Reference);
    invoke-virtual {v1, v2, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 93
    iget-object v1, p0, Lcom/facebook/android/FbDialog;->mContent:Landroid/widget/FrameLayout;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    #v2=(UninitRef);
    invoke-direct {v2, v5, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    #v2=(Reference);
    invoke-virtual {p0, v1, v2}, Lcom/facebook/android/FbDialog;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 94
    return-void
.end method

*/}
