package com.tapjoy; class TJCOffersWebView$TapjoyWebViewClient {/*

.class Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient;
.super Landroid/webkit/WebViewClient;
.source "TJCOffersWebView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tapjoy/TJCOffersWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TapjoyWebViewClient"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tapjoy/TJCOffersWebView;


# direct methods
.method private constructor <init>(Lcom/tapjoy/TJCOffersWebView;)V
    .locals 0
    .parameter

    .prologue
    .line 180
    iput-object p1, p0, Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient;->this$0:Lcom/tapjoy/TJCOffersWebView;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method synthetic constructor <init>(Lcom/tapjoy/TJCOffersWebView;Lcom/tapjoy/TJCOffersWebView$1;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 180
    invoke-direct {p0, p1}, Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient;-><init>(Lcom/tapjoy/TJCOffersWebView;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2
    .parameter "view"
    .parameter "url"

    .prologue
    .line 193
    iget-object v0, p0, Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient;->this$0:Lcom/tapjoy/TJCOffersWebView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/tapjoy/TJCOffersWebView;->access$100(Lcom/tapjoy/TJCOffersWebView;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 194
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2
    .parameter "view"
    .parameter "url"
    .parameter "favicon"

    .prologue
    .line 184
    iget-object v0, p0, Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient;->this$0:Lcom/tapjoy/TJCOffersWebView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/tapjoy/TJCOffersWebView;->access$100(Lcom/tapjoy/TJCOffersWebView;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 185
    iget-object v0, p0, Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient;->this$0:Lcom/tapjoy/TJCOffersWebView;

    invoke-static {v0}, Lcom/tapjoy/TJCOffersWebView;->access$100(Lcom/tapjoy/TJCOffersWebView;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->bringToFront()V

    .line 186
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 23
    .parameter "view"
    .parameter "url"

    .prologue
    .line 201
    const-string v2, "Offers"

    #v2=(Reference);
    new-instance v20, Ljava/lang/StringBuilder;

    #v20=(UninitRef);
    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    #v20=(Reference);
    const-string v21, "URL = ["

    #v21=(Reference);
    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    #v0=(Reference);
    move-object/from16 v1, p2

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    const-string v21, "]"

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-static {v2, v0}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    const-string v2, "tjvideo://"

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_8

    .line 207
    const/4 v13, 0x0

    .line 216
    .local v13, index:I
    #v13=(Null);
    new-instance v17, Ljava/util/Hashtable;

    #v17=(UninitRef);
    invoke-direct/range {v17 .. v17}, Ljava/util/Hashtable;-><init>()V

    .line 218
    .local v17, params:Ljava/util/Hashtable;,"Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/String;>;"
    #v17=(Reference);
    const-string v2, "://"

    #v2=(Reference);
    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    const-string v20, "://"

    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I

    move-result v20

    #v20=(Integer);
    add-int v13, v2, v20

    .line 220
    #v13=(Integer);
    const/4 v9, 0x0

    .line 221
    .local v9, KEY:I
    #v9=(Null);
    const/4 v10, 0x1

    .line 222
    .local v10, VALUE:I
    #v10=(One);
    const/16 v16, 0x0

    .line 224
    .local v16, mode:I
    #v16=(Null);
    const-string v19, ""

    .line 225
    .local v19, word:Ljava/lang/String;
    #v19=(Reference);
    const-string v15, ""

    .line 226
    .local v15, key:Ljava/lang/String;
    #v15=(Reference);
    const-string v18, ""

    .line 228
    .local v18, value:Ljava/lang/String;
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);v11=(Conflicted);v16=(Boolean);v18=(Reference);v20=(Conflicted);
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    if-ge v13, v2, :cond_4

    const/4 v2, -0x1

    #v2=(Byte);
    if-eq v13, v2, :cond_4

    .line 230
    move-object/from16 v0, p2

    #v0=(Reference);
    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    move-result v11

    .line 231
    .local v11, c:C
    #v11=(Char);
    if-nez v16, :cond_2

    .line 233
    const/16 v2, 0x3d

    #v2=(PosByte);
    if-ne v11, v2, :cond_1

    .line 235
    const/16 v16, 0x1

    .line 236
    #v16=(One);
    invoke-static/range {v19 .. v19}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 237
    const-string v19, ""

    .line 262
    :cond_0
    :goto_1
    #v0=(Conflicted);v2=(Conflicted);v16=(Boolean);
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 241
    :cond_1
    #v0=(Reference);v2=(PosByte);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    move-object/from16 v0, v19

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    goto :goto_1

    .line 245
    :cond_2
    #v2=(Byte);
    const/4 v2, 0x1

    #v2=(One);
    move/from16 v0, v16

    #v0=(Boolean);
    if-ne v0, v2, :cond_0

    .line 247
    const/16 v2, 0x26

    #v2=(PosByte);
    if-ne v11, v2, :cond_3

    .line 249
    const/16 v16, 0x0

    .line 250
    #v16=(Null);
    invoke-static/range {v19 .. v19}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 251
    const-string v19, ""

    .line 253
    const-string v2, "Offers"

    #v2=(Reference);
    new-instance v20, Ljava/lang/StringBuilder;

    #v20=(UninitRef);
    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    #v20=(Reference);
    const-string v21, "k:v: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    #v0=(Reference);
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    const-string v21, ", "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-static {v2, v0}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-virtual {v0, v15, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 258
    :cond_3
    #v0=(Boolean);v2=(PosByte);v16=(Boolean);v20=(Conflicted);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    move-object/from16 v0, v19

    #v0=(Reference);
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    goto :goto_1

    .line 265
    .end local v11           #c:C
    :cond_4
    #v0=(Conflicted);v2=(Integer);v11=(Conflicted);
    const/4 v2, 0x1

    #v2=(One);
    move/from16 v0, v16

    #v0=(Boolean);
    if-ne v0, v2, :cond_5

    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    if-lez v2, :cond_5

    .line 267
    invoke-static/range {v19 .. v19}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 268
    const-string v2, "Offers"

    #v2=(Reference);
    new-instance v20, Ljava/lang/StringBuilder;

    #v20=(UninitRef);
    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    #v20=(Reference);
    const-string v21, "k:v: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    #v0=(Reference);
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    const-string v21, ", "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-static {v2, v0}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-virtual {v0, v15, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    :cond_5
    #v0=(Conflicted);v2=(Conflicted);v20=(Conflicted);
    const-string v2, "video_id"

    #v2=(Reference);
    move-object/from16 v0, v17

    #v0=(Reference);
    invoke-virtual {v0, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Ljava/lang/String;

    .line 273
    .local v3, videoID:Ljava/lang/String;
    const-string v2, "amount"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    #v5=(Reference);
    check-cast v5, Ljava/lang/String;

    .line 274
    .local v5, currencyAmount:Ljava/lang/String;
    const-string v2, "currency_name"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    #v4=(Reference);
    check-cast v4, Ljava/lang/String;

    .line 275
    .local v4, currencyName:Ljava/lang/String;
    const-string v2, "click_url"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    #v6=(Reference);
    check-cast v6, Ljava/lang/String;

    .line 276
    .local v6, clickURL:Ljava/lang/String;
    const-string v2, "video_complete_url"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    #v7=(Reference);
    check-cast v7, Ljava/lang/String;

    .line 277
    .local v7, webviewURL:Ljava/lang/String;
    const-string v2, "video_url"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    #v8=(Reference);
    check-cast v8, Ljava/lang/String;

    .line 279
    .local v8, videoURL:Ljava/lang/String;
    const-string v2, "Offers"

    new-instance v20, Ljava/lang/StringBuilder;

    #v20=(UninitRef);
    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    #v20=(Reference);
    const-string v21, "videoID: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-static {v2, v0}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    const-string v2, "Offers"

    new-instance v20, Ljava/lang/StringBuilder;

    #v20=(UninitRef);
    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    #v20=(Reference);
    const-string v21, "currencyAmount: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-static {v2, v0}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    const-string v2, "Offers"

    new-instance v20, Ljava/lang/StringBuilder;

    #v20=(UninitRef);
    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    #v20=(Reference);
    const-string v21, "currencyName: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-static {v2, v0}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    const-string v2, "Offers"

    new-instance v20, Ljava/lang/StringBuilder;

    #v20=(UninitRef);
    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    #v20=(Reference);
    const-string v21, "clickURL: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-static {v2, v0}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    const-string v2, "Offers"

    new-instance v20, Ljava/lang/StringBuilder;

    #v20=(UninitRef);
    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    #v20=(Reference);
    const-string v21, "webviewURL: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-static {v2, v0}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    const-string v2, "Offers"

    new-instance v20, Ljava/lang/StringBuilder;

    #v20=(UninitRef);
    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    #v20=(Reference);
    const-string v21, "videoURL: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-static {v2, v0}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    invoke-static {}, Lcom/tapjoy/TapjoyVideo;->getInstance()Lcom/tapjoy/TapjoyVideo;

    move-result-object v2

    invoke-virtual/range {v2 .. v8}, Lcom/tapjoy/TapjoyVideo;->startVideo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_7

    .line 288
    const-string v2, "Offers"

    #v2=(Reference);
    const-string v20, "VIDEO"

    move-object/from16 v0, v20

    invoke-static {v2, v0}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 336
    .end local v3           #videoID:Ljava/lang/String;
    .end local v4           #currencyName:Ljava/lang/String;
    .end local v5           #currencyAmount:Ljava/lang/String;
    .end local v6           #clickURL:Ljava/lang/String;
    .end local v7           #webviewURL:Ljava/lang/String;
    .end local v8           #videoURL:Ljava/lang/String;
    .end local v9           #KEY:I
    .end local v10           #VALUE:I
    .end local v13           #index:I
    .end local v15           #key:Ljava/lang/String;
    .end local v16           #mode:I
    .end local v17           #params:Ljava/util/Hashtable;,"Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v18           #value:Ljava/lang/String;
    .end local v19           #word:Ljava/lang/String;
    :cond_6
    :goto_2
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v21=(Conflicted);v22=(Conflicted);
    const/4 v2, 0x1

    #v2=(One);
    return v2

    .line 293
    .restart local v3       #videoID:Ljava/lang/String;
    .restart local v4       #currencyName:Ljava/lang/String;
    .restart local v5       #currencyAmount:Ljava/lang/String;
    .restart local v6       #clickURL:Ljava/lang/String;
    .restart local v7       #webviewURL:Ljava/lang/String;
    .restart local v8       #videoURL:Ljava/lang/String;
    .restart local v9       #KEY:I
    .restart local v10       #VALUE:I
    .restart local v13       #index:I
    .restart local v15       #key:Ljava/lang/String;
    .restart local v16       #mode:I
    .restart local v17       #params:Ljava/util/Hashtable;,"Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/String;>;"
    .restart local v18       #value:Ljava/lang/String;
    .restart local v19       #word:Ljava/lang/String;
    :cond_7
    #v2=(Boolean);v3=(Reference);v4=(Reference);v5=(Reference);v6=(Reference);v7=(Reference);v8=(Reference);v9=(Null);v10=(One);v12=(Uninit);v13=(Integer);v14=(Uninit);v15=(Reference);v16=(Boolean);v17=(Reference);v18=(Reference);v19=(Reference);v21=(Reference);v22=(Uninit);
    const-string v2, "Offers"

    #v2=(Reference);
    new-instance v20, Ljava/lang/StringBuilder;

    #v20=(UninitRef);
    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    #v20=(Reference);
    const-string v21, "Unable to play video: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-static {v2, v0}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 294
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient;->this$0:Lcom/tapjoy/TJCOffersWebView;

    new-instance v20, Landroid/app/AlertDialog$Builder;

    #v20=(UninitRef);
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient;->this$0:Lcom/tapjoy/TJCOffersWebView;

    move-object/from16 v21, v0

    invoke-direct/range {v20 .. v21}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    #v20=(Reference);
    const-string v21, ""

    invoke-virtual/range {v20 .. v21}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v20

    const-string v21, "Unable to play video."

    invoke-virtual/range {v20 .. v21}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v20

    const-string v21, "OK"

    new-instance v22, Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient$1;

    #v22=(UninitRef);
    invoke-direct/range {v22 .. v23}, Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient$1;-><init>(Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient;)V

    #v22=(Reference);
    invoke-virtual/range {v20 .. v22}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-static {v2, v0}, Lcom/tapjoy/TJCOffersWebView;->access$202(Lcom/tapjoy/TJCOffersWebView;Landroid/app/Dialog;)Landroid/app/Dialog;

    .line 304
    :try_start_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient;->this$0:Lcom/tapjoy/TJCOffersWebView;

    invoke-static {v2}, Lcom/tapjoy/TJCOffersWebView;->access$200(Lcom/tapjoy/TJCOffersWebView;)Landroid/app/Dialog;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Dialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 306
    :catch_0
    move-exception v12

    .line 308
    .local v12, e:Ljava/lang/Exception;
    #v12=(Reference);
    const-string v2, "Offers"

    new-instance v20, Ljava/lang/StringBuilder;

    #v20=(UninitRef);
    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    #v20=(Reference);
    const-string v21, "e: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual {v12}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-static {v2, v0}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 314
    .end local v3           #videoID:Ljava/lang/String;
    .end local v4           #currencyName:Ljava/lang/String;
    .end local v5           #currencyAmount:Ljava/lang/String;
    .end local v6           #clickURL:Ljava/lang/String;
    .end local v7           #webviewURL:Ljava/lang/String;
    .end local v8           #videoURL:Ljava/lang/String;
    .end local v9           #KEY:I
    .end local v10           #VALUE:I
    .end local v12           #e:Ljava/lang/Exception;
    .end local v13           #index:I
    .end local v15           #key:Ljava/lang/String;
    .end local v16           #mode:I
    .end local v17           #params:Ljava/util/Hashtable;,"Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v18           #value:Ljava/lang/String;
    .end local v19           #word:Ljava/lang/String;
    :cond_8
    #v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v22=(Uninit);
    const-string v2, "ws.tapjoyads.com"

    #v2=(Reference);
    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_9

    .line 316
    const-string v2, "Offers"

    #v2=(Reference);
    new-instance v20, Ljava/lang/StringBuilder;

    #v20=(UninitRef);
    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    #v20=(Reference);
    const-string v21, "Open redirecting URL = ["

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    const-string v21, "]"

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-static {v2, v0}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    invoke-virtual/range {p1 .. p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 322
    :cond_9
    #v2=(Boolean);
    const-string v2, "Offers"

    #v2=(Reference);
    new-instance v20, Ljava/lang/StringBuilder;

    #v20=(UninitRef);
    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    #v20=(Reference);
    const-string v21, "Opening URL in new browser = ["

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    const-string v21, "]"

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-static {v2, v0}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 323
    new-instance v14, Landroid/content/Intent;

    #v14=(UninitRef);
    const-string v2, "android.intent.action.VIEW"

    invoke-static/range {p2 .. p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-direct {v14, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 324
    .local v14, intent:Landroid/content/Intent;
    #v14=(Reference);
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient;->this$0:Lcom/tapjoy/TJCOffersWebView;

    invoke-virtual {v2, v14}, Lcom/tapjoy/TJCOffersWebView;->startActivity(Landroid/content/Intent;)V

    .line 326
    const-string v2, "Offers"

    new-instance v20, Ljava/lang/StringBuilder;

    #v20=(UninitRef);
    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    #v20=(Reference);
    const-string v21, "skipOfferWall: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient;->this$0:Lcom/tapjoy/TJCOffersWebView;

    move-object/from16 v21, v0

    invoke-static/range {v21 .. v21}, Lcom/tapjoy/TJCOffersWebView;->access$300(Lcom/tapjoy/TJCOffersWebView;)Z

    move-result v21

    #v21=(Boolean);
    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-static {v2, v0}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient;->this$0:Lcom/tapjoy/TJCOffersWebView;

    invoke-static {v2}, Lcom/tapjoy/TJCOffersWebView;->access$300(Lcom/tapjoy/TJCOffersWebView;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_6

    .line 332
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/tapjoy/TJCOffersWebView$TapjoyWebViewClient;->this$0:Lcom/tapjoy/TJCOffersWebView;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/tapjoy/TJCOffersWebView;->finish()V

    goto/16 :goto_2
.end method

*/}
