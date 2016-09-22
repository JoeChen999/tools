package com.tapjoy; class TapjoyVideo$1 {/*

.class Lcom/tapjoy/TapjoyVideo$1;
.super Ljava/lang/Object;
.source "TapjoyVideo.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tapjoy/TapjoyVideo;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tapjoy/TapjoyVideo;


# direct methods
.method constructor <init>(Lcom/tapjoy/TapjoyVideo;)V
    .locals 0
    .parameter

    .prologue
    .line 192
    iput-object p1, p0, Lcom/tapjoy/TapjoyVideo$1;->this$0:Lcom/tapjoy/TapjoyVideo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .prologue
    .line 195
    const/4 v4, 0x0

    .line 197
    .local v4, returnValue:Z
    #v4=(Null);
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getURLParams()Ljava/lang/String;

    move-result-object v5

    .line 198
    .local v5, urlParams:Ljava/lang/String;
    #v5=(Reference);
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "&publisher_user_id="

    #v7=(Reference);
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getUserID()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 201
    new-instance v6, Lcom/tapjoy/TapjoyURLConnection;

    #v6=(UninitRef);
    invoke-direct {v6}, Lcom/tapjoy/TapjoyURLConnection;-><init>()V

    #v6=(Reference);
    const-string v7, "https://ws.tapjoyads.com/videos?"

    invoke-virtual {v6, v7, v5}, Lcom/tapjoy/TapjoyURLConnection;->connectToURL(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 204
    .local v3, result:Ljava/lang/String;
    #v3=(Reference);
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    #v6=(Integer);
    if-lez v6, :cond_0

    .line 206
    iget-object v6, p0, Lcom/tapjoy/TapjoyVideo$1;->this$0:Lcom/tapjoy/TapjoyVideo;

    #v6=(Reference);
    invoke-static {v6, v3}, Lcom/tapjoy/TapjoyVideo;->access$000(Lcom/tapjoy/TapjoyVideo;Ljava/lang/String;)Z

    move-result v4

    .line 210
    :cond_0
    #v4=(Boolean);v6=(Conflicted);
    if-eqz v4, :cond_3

    .line 213
    iget-object v6, p0, Lcom/tapjoy/TapjoyVideo$1;->this$0:Lcom/tapjoy/TapjoyVideo;

    #v6=(Reference);
    invoke-static {v6}, Lcom/tapjoy/TapjoyVideo;->access$100(Lcom/tapjoy/TapjoyVideo;)Z

    .line 216
    const-string v6, "https://s3.amazonaws.com/tapjoy/videos/assets/watermark.png"

    if-eqz v6, :cond_1

    const-string v6, "https://s3.amazonaws.com/tapjoy/videos/assets/watermark.png"

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    #v6=(Integer);
    if-lez v6, :cond_1

    .line 221
    :try_start_0
    new-instance v2, Ljava/net/URL;

    #v2=(UninitRef);
    const-string v6, "https://s3.amazonaws.com/tapjoy/videos/assets/watermark.png"

    #v6=(Reference);
    invoke-direct {v2, v6}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 223
    .local v2, fileURL:Ljava/net/URL;
    #v2=(Reference);
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    .line 224
    .local v0, connection:Ljava/net/URLConnection;
    #v0=(Reference);
    const/16 v6, 0x3a98

    #v6=(PosShort);
    invoke-virtual {v0, v6}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 225
    const/16 v6, 0x61a8

    invoke-virtual {v0, v6}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 226
    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V

    .line 228
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v6

    #v6=(Reference);
    invoke-virtual {v6}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v6

    invoke-static {v6}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v6

    invoke-static {v6}, Lcom/tapjoy/TapjoyVideo;->access$202(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 237
    .end local v0           #connection:Ljava/net/URLConnection;
    .end local v2           #fileURL:Ljava/net/URL;
    :cond_1
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v6=(Conflicted);v8=(Conflicted);
    iget-object v6, p0, Lcom/tapjoy/TapjoyVideo$1;->this$0:Lcom/tapjoy/TapjoyVideo;

    #v6=(Reference);
    invoke-static {v6}, Lcom/tapjoy/TapjoyVideo;->access$300(Lcom/tapjoy/TapjoyVideo;)V

    .line 240
    iget-object v6, p0, Lcom/tapjoy/TapjoyVideo$1;->this$0:Lcom/tapjoy/TapjoyVideo;

    const/4 v7, 0x1

    #v7=(One);
    invoke-static {v6, v7}, Lcom/tapjoy/TapjoyVideo;->access$402(Lcom/tapjoy/TapjoyVideo;Z)Z

    .line 245
    iget-object v6, p0, Lcom/tapjoy/TapjoyVideo$1;->this$0:Lcom/tapjoy/TapjoyVideo;

    invoke-static {v6}, Lcom/tapjoy/TapjoyVideo;->access$500(Lcom/tapjoy/TapjoyVideo;)Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_2

    .line 247
    const-string v6, "TapjoyVideo"

    #v6=(Reference);
    const-string v7, "trying to cache because of cache_auto flag..."

    #v7=(Reference);
    invoke-static {v6, v7}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    iget-object v6, p0, Lcom/tapjoy/TapjoyVideo$1;->this$0:Lcom/tapjoy/TapjoyVideo;

    invoke-virtual {v6}, Lcom/tapjoy/TapjoyVideo;->cacheVideos()V

    .line 251
    :cond_2
    #v6=(Conflicted);v7=(Conflicted);
    const-string v6, "TapjoyVideo"

    #v6=(Reference);
    const-string v7, "------------------------------"

    #v7=(Reference);
    invoke-static {v6, v7}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    const-string v6, "TapjoyVideo"

    const-string v7, "------------------------------"

    invoke-static {v6, v7}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    const-string v6, "TapjoyVideo"

    const-string v7, "INIT DONE!"

    invoke-static {v6, v7}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    const-string v6, "TapjoyVideo"

    const-string v7, "------------------------------"

    invoke-static {v6, v7}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    :goto_1
    #v6=(Conflicted);
    return-void

    .line 230
    :catch_0
    #v1=(Uninit);v8=(Uninit);
    move-exception v1

    .line 232
    .local v1, e:Ljava/lang/Exception;
    #v1=(Reference);
    const-string v6, "TapjoyVideo"

    #v6=(Reference);
    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    #v7=(Reference);
    const-string v8, "e: "

    #v8=(Reference);
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 259
    .end local v1           #e:Ljava/lang/Exception;
    :cond_3
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v6=(Conflicted);v8=(Uninit);
    const/4 v6, 0x2

    #v6=(PosByte);
    invoke-static {v6}, Lcom/tapjoy/TapjoyVideo;->videoNotifierError(I)V

    goto :goto_1
.end method

*/}
