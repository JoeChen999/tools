package com.mobileapptracker; class MobileAppTracker$getUserAgent {/*

.class public Lcom/mobileapptracker/MobileAppTracker$getUserAgent;
.super Ljava/lang/Object;
.source "MobileAppTracker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mobileapptracker/MobileAppTracker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "getUserAgent"
.end annotation


# instance fields
.field private context:Landroid/content/Context;

.field final synthetic this$0:Lcom/mobileapptracker/MobileAppTracker;


# direct methods
.method public constructor <init>(Lcom/mobileapptracker/MobileAppTracker;Landroid/content/Context;)V
    .locals 0
    .parameter
    .parameter "context"

    .prologue
    .line 842
    iput-object p1, p0, Lcom/mobileapptracker/MobileAppTracker$getUserAgent;->this$0:Lcom/mobileapptracker/MobileAppTracker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 843
    #p0=(Reference);
    iput-object p2, p0, Lcom/mobileapptracker/MobileAppTracker$getUserAgent;->context:Landroid/content/Context;

    .line 844
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 849
    :try_start_0
    new-instance v1, Landroid/webkit/WebView;

    #v1=(UninitRef);
    iget-object v2, p0, Lcom/mobileapptracker/MobileAppTracker$getUserAgent;->context:Landroid/content/Context;

    #v2=(Reference);
    invoke-direct {v1, v2}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 850
    .local v1, webview:Landroid/webkit/WebView;
    #v1=(Reference);
    const/16 v2, 0x8

    #v2=(PosByte);
    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 851
    iget-object v2, p0, Lcom/mobileapptracker/MobileAppTracker$getUserAgent;->this$0:Lcom/mobileapptracker/MobileAppTracker;

    #v2=(Reference);
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/mobileapptracker/MobileAppTracker;->access$0(Lcom/mobileapptracker/MobileAppTracker;Ljava/lang/String;)V

    .line 852
    invoke-virtual {v1}, Landroid/webkit/WebView;->destroy()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 856
    .end local v1           #webview:Landroid/webkit/WebView;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    .line 853
    :catch_0
    move-exception v0

    .line 854
    .local v0, e:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

*/}
