package com.tapjoy; class TapjoyDailyRewardAdWebView$RefreshTask {/*

.class Lcom/tapjoy/TapjoyDailyRewardAdWebView$RefreshTask;
.super Landroid/os/AsyncTask;
.source "TapjoyDailyRewardAdWebView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tapjoy/TapjoyDailyRewardAdWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "RefreshTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tapjoy/TapjoyDailyRewardAdWebView;


# direct methods
.method private constructor <init>(Lcom/tapjoy/TapjoyDailyRewardAdWebView;)V
    .locals 0
    .parameter

    .prologue
    .line 95
    iput-object p1, p0, Lcom/tapjoy/TapjoyDailyRewardAdWebView$RefreshTask;->this$0:Lcom/tapjoy/TapjoyDailyRewardAdWebView;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method synthetic constructor <init>(Lcom/tapjoy/TapjoyDailyRewardAdWebView;Lcom/tapjoy/TapjoyDailyRewardAdWebView$1;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 95
    invoke-direct {p0, p1}, Lcom/tapjoy/TapjoyDailyRewardAdWebView$RefreshTask;-><init>(Lcom/tapjoy/TapjoyDailyRewardAdWebView;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 3
    .parameter "params"

    .prologue
    .line 102
    const-wide/16 v1, 0xc8

    :try_start_0
    #v1=(LongLo);v2=(LongHi);
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    :goto_0
    #v0=(Conflicted);
    const/4 v1, 0x1

    #v1=(One);
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    #v1=(Reference);
    return-object v1

    .line 104
    :catch_0
    #v0=(Uninit);v1=(LongLo);
    move-exception v0

    .line 106
    .local v0, e:Ljava/lang/InterruptedException;
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter "x0"

    .prologue
    .line 95
    check-cast p1, [Ljava/lang/Void;

    .end local p1
    invoke-virtual {p0, p1}, Lcom/tapjoy/TapjoyDailyRewardAdWebView$RefreshTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method protected onPostExecute(Ljava/lang/Boolean;)V
    .locals 2
    .parameter "result"

    .prologue
    .line 114
    iget-object v0, p0, Lcom/tapjoy/TapjoyDailyRewardAdWebView$RefreshTask;->this$0:Lcom/tapjoy/TapjoyDailyRewardAdWebView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/tapjoy/TapjoyDailyRewardAdWebView;->access$200(Lcom/tapjoy/TapjoyDailyRewardAdWebView;)Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 117
    iget-object v0, p0, Lcom/tapjoy/TapjoyDailyRewardAdWebView$RefreshTask;->this$0:Lcom/tapjoy/TapjoyDailyRewardAdWebView;

    invoke-static {v0}, Lcom/tapjoy/TapjoyDailyRewardAdWebView;->access$200(Lcom/tapjoy/TapjoyDailyRewardAdWebView;)Landroid/webkit/WebView;

    move-result-object v0

    const-string v1, "javascript:window.onorientationchange();"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 119
    :cond_0
    #v1=(Conflicted);
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 95
    check-cast p1, Ljava/lang/Boolean;

    .end local p1
    invoke-virtual {p0, p1}, Lcom/tapjoy/TapjoyDailyRewardAdWebView$RefreshTask;->onPostExecute(Ljava/lang/Boolean;)V

    return-void
.end method

*/}