package com.tapjoy; class TapjoyFullScreenAdWebView$TapjoyWebViewClient$1 {/*

.class Lcom/tapjoy/TapjoyFullScreenAdWebView$TapjoyWebViewClient$1;
.super Ljava/lang/Object;
.source "TapjoyFullScreenAdWebView.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tapjoy/TapjoyFullScreenAdWebView$TapjoyWebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/tapjoy/TapjoyFullScreenAdWebView$TapjoyWebViewClient;


# direct methods
.method constructor <init>(Lcom/tapjoy/TapjoyFullScreenAdWebView$TapjoyWebViewClient;)V
    .locals 0
    .parameter

    .prologue
    .line 267
    iput-object p1, p0, Lcom/tapjoy/TapjoyFullScreenAdWebView$TapjoyWebViewClient$1;->this$1:Lcom/tapjoy/TapjoyFullScreenAdWebView$TapjoyWebViewClient;

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
    .line 270
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 271
    return-void
.end method

*/}