package com.tapjoy; class TJCOffersWebView$TapjoyWebViewClient$1 {/*

.class Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient$1;
.super Ljava/lang/Object;
.source "TJCOffersWebView.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient;


# direct methods
.method constructor <init>(Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient;)V
    .locals 0
    .parameter

    .prologue
    .line 295
    iput-object p1, p0, Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient$1;->this$1:Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0
    .parameter "dialog"
    .parameter "whichButton"

    .prologue
    .line 298
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 299
    return-void
.end method

*/}
