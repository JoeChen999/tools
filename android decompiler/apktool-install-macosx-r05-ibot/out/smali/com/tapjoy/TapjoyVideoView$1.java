package com.tapjoy; class TapjoyVideoView$1 {/*

.class Lcom/tapjoy/TapjoyVideoView$1;
.super Landroid/webkit/WebViewClient;
.source "TapjoyVideoView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tapjoy/TapjoyVideoView;->initVideoCompletionScreen()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tapjoy/TapjoyVideoView;


# direct methods
.method constructor <init>(Lcom/tapjoy/TapjoyVideoView;)V
    .locals 0
    .parameter

    .prologue
    .line 286
    iput-object p1, p0, Lcom/tapjoy/TapjoyVideoView$1;->this$0:Lcom/tapjoy/TapjoyVideoView;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 4
    .parameter "view"
    .parameter "url"

    .prologue
    .line 292
    const-string v1, "VIDEO"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "URL = ["

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "]"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    const-string v1, "offer_wall"

    invoke-virtual {p2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 297
    const-string v1, "VIDEO"

    #v1=(Reference);
    const-string v2, "back to offers"

    invoke-static {v1, v2}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    iget-object v1, p0, Lcom/tapjoy/TapjoyVideoView$1;->this$0:Lcom/tapjoy/TapjoyVideoView;

    invoke-virtual {v1}, Lcom/tapjoy/TapjoyVideoView;->finish()V

    .line 322
    :goto_0
    #v0=(Conflicted);
    const/4 v1, 0x1

    #v1=(One);
    return v1

    .line 302
    :cond_0
    #v0=(Uninit);v1=(Boolean);
    const-string v1, "tjvideo"

    #v1=(Reference);
    invoke-virtual {p2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    .line 304
    const-string v1, "VIDEO"

    #v1=(Reference);
    const-string v2, "replay"

    invoke-static {v1, v2}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    iget-object v1, p0, Lcom/tapjoy/TapjoyVideoView$1;->this$0:Lcom/tapjoy/TapjoyVideoView;

    invoke-static {v1}, Lcom/tapjoy/TapjoyVideoView;->access$000(Lcom/tapjoy/TapjoyVideoView;)V

    goto :goto_0

    .line 309
    :cond_1
    #v1=(Boolean);
    const-string v1, "ws.tapjoyads.com"

    #v1=(Reference);
    invoke-virtual {p2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    .line 311
    const-string v1, "VIDEO"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "Open redirecting URL = ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "]"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 312
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    .line 317
    :cond_2
    #v1=(Boolean);
    const-string v1, "VIDEO"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "Opening URL in new browser = ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "]"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    const-string v1, "android.intent.action.VIEW"

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 319
    .local v0, intent:Landroid/content/Intent;
    #v0=(Reference);
    iget-object v1, p0, Lcom/tapjoy/TapjoyVideoView$1;->this$0:Lcom/tapjoy/TapjoyVideoView;

    invoke-virtual {v1, v0}, Lcom/tapjoy/TapjoyVideoView;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

*/}
