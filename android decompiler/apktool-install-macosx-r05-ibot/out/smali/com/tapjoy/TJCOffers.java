package com.tapjoy; class TJCOffers {/*

.class public Lcom/tapjoy/TJCOffers;
.super Ljava/lang/Object;
.source "TJCOffers.java"


# static fields
.field public static final TAPJOY_OFFERS:Ljava/lang/String; = "TapjoyOffers"

.field public static final TAPJOY_POINTS:Ljava/lang/String; = "TapjoyPoints"

.field private static tapjoyAwardPointsNotifier:Lcom/tapjoy/TapjoyAwardPointsNotifier;

.field private static tapjoyEarnedPointsNotifier:Lcom/tapjoy/TapjoyEarnedPointsNotifier;

.field private static tapjoyNotifier:Lcom/tapjoy/TapjoyNotifier;

.field private static tapjoySpendPointsNotifier:Lcom/tapjoy/TapjoySpendPointsNotifier;


# instance fields
.field awardTapPoints:I

.field context:Landroid/content/Context;

.field private multipleCurrencyID:Ljava/lang/String;

.field private multipleCurrencySelector:Ljava/lang/String;

.field spendTapPoints:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter "applicationContext"

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/tapjoy/TJCOffers;->spendTapPoints:Ljava/lang/String;

    .line 23
    const/4 v0, 0x0

    iput v0, p0, Lcom/tapjoy/TJCOffers;->awardTapPoints:I

    .line 28
    const-string v0, ""

    #v0=(Reference);
    iput-object v0, p0, Lcom/tapjoy/TJCOffers;->multipleCurrencyID:Ljava/lang/String;

    .line 29
    const-string v0, ""

    iput-object v0, p0, Lcom/tapjoy/TJCOffers;->multipleCurrencySelector:Ljava/lang/String;

    .line 42
    iput-object p1, p0, Lcom/tapjoy/TJCOffers;->context:Landroid/content/Context;

    .line 43
    return-void
.end method

.method static synthetic access$000(Lcom/tapjoy/TJCOffers;Ljava/lang/String;)Z
    .locals 1
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 15
    invoke-direct {p0, p1}, Lcom/tapjoy/TJCOffers;->handleGetPointsResponse(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$100()Lcom/tapjoy/TapjoyNotifier;
    .locals 1

    .prologue
    .line 15
    sget-object v0, Lcom/tapjoy/TJCOffers;->tapjoyNotifier:Lcom/tapjoy/TapjoyNotifier;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$200(Lcom/tapjoy/TJCOffers;Ljava/lang/String;)Z
    .locals 1
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 15
    invoke-direct {p0, p1}, Lcom/tapjoy/TJCOffers;->handleSpendPointsResponse(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$300()Lcom/tapjoy/TapjoySpendPointsNotifier;
    .locals 1

    .prologue
    .line 15
    sget-object v0, Lcom/tapjoy/TJCOffers;->tapjoySpendPointsNotifier:Lcom/tapjoy/TapjoySpendPointsNotifier;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$400(Lcom/tapjoy/TJCOffers;Ljava/lang/String;)Z
    .locals 1
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 15
    invoke-direct {p0, p1}, Lcom/tapjoy/TJCOffers;->handleAwardPointsResponse(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$500()Lcom/tapjoy/TapjoyAwardPointsNotifier;
    .locals 1

    .prologue
    .line 15
    sget-object v0, Lcom/tapjoy/TJCOffers;->tapjoyAwardPointsNotifier:Lcom/tapjoy/TapjoyAwardPointsNotifier;

    #v0=(Reference);
    return-object v0
.end method

.method private handleAwardPointsResponse(Ljava/lang/String;)Z
    .locals 8
    .parameter "response"

    .prologue
    const/4 v5, 0x1

    .line 380
    #v5=(One);
    const-string v2, ""

    .line 383
    .local v2, message:Ljava/lang/String;
    #v2=(Reference);
    invoke-static {p1}, Lcom/tapjoy/TapjoyUtil;->buildDocument(Ljava/lang/String;)Lorg/w3c/dom/Document;

    move-result-object v1

    .line 385
    .local v1, document:Lorg/w3c/dom/Document;
    #v1=(Reference);
    if-eqz v1, :cond_1

    .line 387
    const-string v6, "Success"

    #v6=(Reference);
    invoke-interface {v1, v6}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v6

    invoke-static {v6}, Lcom/tapjoy/TapjoyUtil;->getNodeTrimValue(Lorg/w3c/dom/NodeList;)Ljava/lang/String;

    move-result-object v3

    .line 390
    .local v3, nodeValue:Ljava/lang/String;
    #v3=(Reference);
    if-eqz v3, :cond_2

    const-string v6, "true"

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_2

    .line 394
    const-string v6, "TapPoints"

    #v6=(Reference);
    invoke-interface {v1, v6}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v6

    invoke-static {v6}, Lcom/tapjoy/TapjoyUtil;->getNodeTrimValue(Lorg/w3c/dom/NodeList;)Ljava/lang/String;

    move-result-object v4

    .line 395
    .local v4, pointsTotal:Ljava/lang/String;
    #v4=(Reference);
    const-string v6, "CurrencyName"

    invoke-interface {v1, v6}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v6

    invoke-static {v6}, Lcom/tapjoy/TapjoyUtil;->getNodeTrimValue(Lorg/w3c/dom/NodeList;)Ljava/lang/String;

    move-result-object v0

    .line 398
    .local v0, currencyName:Ljava/lang/String;
    #v0=(Reference);
    if-eqz v4, :cond_0

    if-eqz v0, :cond_0

    .line 404
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    #v6=(Integer);
    invoke-static {v6}, Lcom/tapjoy/TapjoyConnectCore;->saveTapPointsTotal(I)V

    .line 407
    sget-object v6, Lcom/tapjoy/TJCOffers;->tapjoyAwardPointsNotifier:Lcom/tapjoy/TapjoyAwardPointsNotifier;

    #v6=(Reference);
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    invoke-interface {v6, v0, v7}, Lcom/tapjoy/TapjoyAwardPointsNotifier;->getAwardPointsResponse(Ljava/lang/String;I)V

    .line 431
    .end local v0           #currencyName:Ljava/lang/String;
    .end local v3           #nodeValue:Ljava/lang/String;
    .end local v4           #pointsTotal:Ljava/lang/String;
    :goto_0
    #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Boolean);v6=(Conflicted);v7=(Conflicted);
    return v5

    .line 412
    .restart local v0       #currencyName:Ljava/lang/String;
    .restart local v3       #nodeValue:Ljava/lang/String;
    .restart local v4       #pointsTotal:Ljava/lang/String;
    :cond_0
    #v0=(Reference);v3=(Reference);v4=(Reference);v5=(One);v6=(Reference);v7=(Uninit);
    const-string v5, "TapjoyPoints"

    #v5=(Reference);
    const-string v6, "Invalid XML: Missing tags."

    invoke-static {v5, v6}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 431
    .end local v0           #currencyName:Ljava/lang/String;
    .end local v3           #nodeValue:Ljava/lang/String;
    .end local v4           #pointsTotal:Ljava/lang/String;
    :cond_1
    :goto_1
    #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    const/4 v5, 0x0

    #v5=(Null);
    goto :goto_0

    .line 417
    .restart local v3       #nodeValue:Ljava/lang/String;
    :cond_2
    #v0=(Uninit);v3=(Reference);v4=(Uninit);v5=(One);
    if-eqz v3, :cond_3

    const-string v6, "false"

    #v6=(Reference);
    invoke-virtual {v3, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_3

    .line 419
    const-string v6, "Message"

    #v6=(Reference);
    invoke-interface {v1, v6}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v6

    invoke-static {v6}, Lcom/tapjoy/TapjoyUtil;->getNodeTrimValue(Lorg/w3c/dom/NodeList;)Ljava/lang/String;

    move-result-object v2

    .line 420
    const-string v6, "TapjoyPoints"

    invoke-static {v6, v2}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 422
    sget-object v6, Lcom/tapjoy/TJCOffers;->tapjoyAwardPointsNotifier:Lcom/tapjoy/TapjoyAwardPointsNotifier;

    invoke-interface {v6, v2}, Lcom/tapjoy/TapjoyAwardPointsNotifier;->getAwardPointsResponseFailed(Ljava/lang/String;)V

    goto :goto_0

    .line 427
    :cond_3
    #v6=(Conflicted);
    const-string v5, "TapjoyPoints"

    #v5=(Reference);
    const-string v6, "Invalid XML: Missing <Success> tag."

    #v6=(Reference);
    invoke-static {v5, v6}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method private declared-synchronized handleGetPointsResponse(Ljava/lang/String;)Z
    .locals 10
    .parameter "response"

    .prologue
    .line 241
    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lcom/tapjoy/TapjoyUtil;->buildDocument(Ljava/lang/String;)Lorg/w3c/dom/Document;

    move-result-object v0

    .line 243
    .local v0, document:Lorg/w3c/dom/Document;
    #v0=(Reference);
    if-eqz v0, :cond_1

    .line 245
    const-string v7, "Success"

    #v7=(Reference);
    invoke-interface {v0, v7}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v7

    invoke-static {v7}, Lcom/tapjoy/TapjoyUtil;->getNodeTrimValue(Lorg/w3c/dom/NodeList;)Ljava/lang/String;

    move-result-object v4

    .line 248
    .local v4, nodeValue:Ljava/lang/String;
    #v4=(Reference);
    if-eqz v4, :cond_3

    const-string v7, "true"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    #v7=(Boolean);
    if-eqz v7, :cond_3

    .line 252
    const-string v7, "TapPoints"

    #v7=(Reference);
    invoke-interface {v0, v7}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v7

    invoke-static {v7}, Lcom/tapjoy/TapjoyUtil;->getNodeTrimValue(Lorg/w3c/dom/NodeList;)Ljava/lang/String;

    move-result-object v6

    .line 253
    .local v6, points:Ljava/lang/String;
    #v6=(Reference);
    const-string v7, "CurrencyName"

    invoke-interface {v0, v7}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v7

    invoke-static {v7}, Lcom/tapjoy/TapjoyUtil;->getNodeTrimValue(Lorg/w3c/dom/NodeList;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 256
    .local v3, name:Ljava/lang/String;
    #v3=(Reference);
    if-eqz v6, :cond_2

    if-eqz v3, :cond_2

    .line 261
    :try_start_1
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 262
    .local v5, pointTotal:I
    #v5=(Integer);
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getLocalTapPointsTotal()I

    move-result v2

    .line 269
    .local v2, lastLocalPointTotal:I
    #v2=(Integer);
    sget-object v7, Lcom/tapjoy/TJCOffers;->tapjoyEarnedPointsNotifier:Lcom/tapjoy/TapjoyEarnedPointsNotifier;

    if-eqz v7, :cond_0

    .line 272
    const/16 v7, -0x270f

    #v7=(Short);
    if-eq v2, v7, :cond_0

    .line 275
    if-le v5, v2, :cond_0

    .line 277
    const-string v7, "TapjoyPoints"

    #v7=(Reference);
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    #v8=(Reference);
    const-string v9, "earned: "

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    sub-int v9, v5, v2

    #v9=(Integer);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    sget-object v7, Lcom/tapjoy/TJCOffers;->tapjoyEarnedPointsNotifier:Lcom/tapjoy/TapjoyEarnedPointsNotifier;

    sub-int v8, v5, v2

    #v8=(Integer);
    invoke-interface {v7, v8}, Lcom/tapjoy/TapjoyEarnedPointsNotifier;->earnedTapPoints(I)V

    .line 284
    :cond_0
    #v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    invoke-static {v7}, Lcom/tapjoy/TapjoyConnectCore;->saveTapPointsTotal(I)V

    .line 287
    sget-object v7, Lcom/tapjoy/TJCOffers;->tapjoyNotifier:Lcom/tapjoy/TapjoyNotifier;

    #v7=(Reference);
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    #v8=(Integer);
    invoke-interface {v7, v3, v8}, Lcom/tapjoy/TapjoyNotifier;->getUpdatePoints(Ljava/lang/String;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 289
    const/4 v7, 0x1

    .line 307
    .end local v2           #lastLocalPointTotal:I
    .end local v3           #name:Ljava/lang/String;
    .end local v4           #nodeValue:Ljava/lang/String;
    .end local v5           #pointTotal:I
    .end local v6           #points:Ljava/lang/String;
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Boolean);v8=(Conflicted);
    monitor-exit p0

    return v7

    .line 291
    .restart local v3       #name:Ljava/lang/String;
    .restart local v4       #nodeValue:Ljava/lang/String;
    .restart local v6       #points:Ljava/lang/String;
    :catch_0
    #v1=(Uninit);v3=(Reference);v4=(Reference);v6=(Reference);v7=(Conflicted);
    move-exception v1

    .line 293
    .local v1, e:Ljava/lang/Exception;
    :try_start_2
    #v1=(Reference);
    const-string v7, "TapjoyPoints"

    #v7=(Reference);
    const-string v8, "Error parsing XML."

    #v8=(Reference);
    invoke-static {v7, v8}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    .end local v1           #e:Ljava/lang/Exception;
    .end local v3           #name:Ljava/lang/String;
    .end local v4           #nodeValue:Ljava/lang/String;
    .end local v6           #points:Ljava/lang/String;
    :cond_1
    :goto_1
    #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    const/4 v7, 0x0

    #v7=(Null);
    goto :goto_0

    .line 298
    .restart local v3       #name:Ljava/lang/String;
    .restart local v4       #nodeValue:Ljava/lang/String;
    .restart local v6       #points:Ljava/lang/String;
    :cond_2
    #v1=(Uninit);v2=(Uninit);v3=(Reference);v4=(Reference);v5=(Uninit);v6=(Reference);v7=(Reference);v8=(Uninit);v9=(Uninit);
    const-string v7, "TapjoyPoints"

    const-string v8, "Invalid XML: Missing tags."

    #v8=(Reference);
    invoke-static {v7, v8}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 241
    .end local v0           #document:Lorg/w3c/dom/Document;
    .end local v3           #name:Ljava/lang/String;
    .end local v4           #nodeValue:Ljava/lang/String;
    .end local v6           #points:Ljava/lang/String;
    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    move-exception v7

    #v7=(Reference);
    monitor-exit p0

    throw v7

    .line 303
    .restart local v0       #document:Lorg/w3c/dom/Document;
    .restart local v4       #nodeValue:Ljava/lang/String;
    :cond_3
    :try_start_3
    #v0=(Reference);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Reference);v5=(Uninit);v6=(Uninit);v7=(Conflicted);v8=(Uninit);v9=(Uninit);
    const-string v7, "TapjoyPoints"

    #v7=(Reference);
    const-string v8, "Invalid XML: Missing <Success> tag."

    #v8=(Reference);
    invoke-static {v7, v8}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1
.end method

.method private handleSpendPointsResponse(Ljava/lang/String;)Z
    .locals 8
    .parameter "response"

    .prologue
    const/4 v5, 0x1

    .line 318
    #v5=(One);
    const-string v2, ""

    .line 321
    .local v2, message:Ljava/lang/String;
    #v2=(Reference);
    invoke-static {p1}, Lcom/tapjoy/TapjoyUtil;->buildDocument(Ljava/lang/String;)Lorg/w3c/dom/Document;

    move-result-object v1

    .line 323
    .local v1, document:Lorg/w3c/dom/Document;
    #v1=(Reference);
    if-eqz v1, :cond_1

    .line 325
    const-string v6, "Success"

    #v6=(Reference);
    invoke-interface {v1, v6}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v6

    invoke-static {v6}, Lcom/tapjoy/TapjoyUtil;->getNodeTrimValue(Lorg/w3c/dom/NodeList;)Ljava/lang/String;

    move-result-object v3

    .line 328
    .local v3, nodeValue:Ljava/lang/String;
    #v3=(Reference);
    if-eqz v3, :cond_2

    const-string v6, "true"

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_2

    .line 332
    const-string v6, "TapPoints"

    #v6=(Reference);
    invoke-interface {v1, v6}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v6

    invoke-static {v6}, Lcom/tapjoy/TapjoyUtil;->getNodeTrimValue(Lorg/w3c/dom/NodeList;)Ljava/lang/String;

    move-result-object v4

    .line 333
    .local v4, pointsTotal:Ljava/lang/String;
    #v4=(Reference);
    const-string v6, "CurrencyName"

    invoke-interface {v1, v6}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v6

    invoke-static {v6}, Lcom/tapjoy/TapjoyUtil;->getNodeTrimValue(Lorg/w3c/dom/NodeList;)Ljava/lang/String;

    move-result-object v0

    .line 336
    .local v0, currencyName:Ljava/lang/String;
    #v0=(Reference);
    if-eqz v4, :cond_0

    if-eqz v0, :cond_0

    .line 342
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    #v6=(Integer);
    invoke-static {v6}, Lcom/tapjoy/TapjoyConnectCore;->saveTapPointsTotal(I)V

    .line 345
    sget-object v6, Lcom/tapjoy/TJCOffers;->tapjoySpendPointsNotifier:Lcom/tapjoy/TapjoySpendPointsNotifier;

    #v6=(Reference);
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    invoke-interface {v6, v0, v7}, Lcom/tapjoy/TapjoySpendPointsNotifier;->getSpendPointsResponse(Ljava/lang/String;I)V

    .line 369
    .end local v0           #currencyName:Ljava/lang/String;
    .end local v3           #nodeValue:Ljava/lang/String;
    .end local v4           #pointsTotal:Ljava/lang/String;
    :goto_0
    #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Boolean);v6=(Conflicted);v7=(Conflicted);
    return v5

    .line 350
    .restart local v0       #currencyName:Ljava/lang/String;
    .restart local v3       #nodeValue:Ljava/lang/String;
    .restart local v4       #pointsTotal:Ljava/lang/String;
    :cond_0
    #v0=(Reference);v3=(Reference);v4=(Reference);v5=(One);v6=(Reference);v7=(Uninit);
    const-string v5, "TapjoyPoints"

    #v5=(Reference);
    const-string v6, "Invalid XML: Missing tags."

    invoke-static {v5, v6}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 369
    .end local v0           #currencyName:Ljava/lang/String;
    .end local v3           #nodeValue:Ljava/lang/String;
    .end local v4           #pointsTotal:Ljava/lang/String;
    :cond_1
    :goto_1
    #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    const/4 v5, 0x0

    #v5=(Null);
    goto :goto_0

    .line 355
    .restart local v3       #nodeValue:Ljava/lang/String;
    :cond_2
    #v0=(Uninit);v3=(Reference);v4=(Uninit);v5=(One);
    if-eqz v3, :cond_3

    const-string v6, "false"

    #v6=(Reference);
    invoke-virtual {v3, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_3

    .line 357
    const-string v6, "Message"

    #v6=(Reference);
    invoke-interface {v1, v6}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v6

    invoke-static {v6}, Lcom/tapjoy/TapjoyUtil;->getNodeTrimValue(Lorg/w3c/dom/NodeList;)Ljava/lang/String;

    move-result-object v2

    .line 358
    const-string v6, "TapjoyPoints"

    invoke-static {v6, v2}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 360
    sget-object v6, Lcom/tapjoy/TJCOffers;->tapjoySpendPointsNotifier:Lcom/tapjoy/TapjoySpendPointsNotifier;

    invoke-interface {v6, v2}, Lcom/tapjoy/TapjoySpendPointsNotifier;->getSpendPointsResponseFailed(Ljava/lang/String;)V

    goto :goto_0

    .line 365
    :cond_3
    #v6=(Conflicted);
    const-string v5, "TapjoyPoints"

    #v5=(Reference);
    const-string v6, "Invalid XML: Missing <Success> tag."

    #v6=(Reference);
    invoke-static {v5, v6}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method


# virtual methods
.method public awardTapPoints(ILcom/tapjoy/TapjoyAwardPointsNotifier;)V
    .locals 2
    .parameter "amount"
    .parameter "notifier"

    .prologue
    .line 178
    if-gez p1, :cond_0

    .line 180
    const-string v0, "TapjoyPoints"

    #v0=(Reference);
    const-string v1, "spendTapPoints error: amount must be a positive number"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    :goto_0
    return-void

    .line 184
    :cond_0
    #v0=(Uninit);v1=(Uninit);
    iput p1, p0, Lcom/tapjoy/TJCOffers;->awardTapPoints:I

    .line 186
    sput-object p2, Lcom/tapjoy/TJCOffers;->tapjoyAwardPointsNotifier:Lcom/tapjoy/TapjoyAwardPointsNotifier;

    .line 188
    new-instance v0, Ljava/lang/Thread;

    #v0=(UninitRef);
    new-instance v1, Lcom/tapjoy/TJCOffers$3;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/tapjoy/TJCOffers$3;-><init>(Lcom/tapjoy/TJCOffers;)V

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0
.end method

.method public getTapPoints(Lcom/tapjoy/TapjoyNotifier;)V
    .locals 2
    .parameter "notifier"

    .prologue
    .line 98
    sput-object p1, Lcom/tapjoy/TJCOffers;->tapjoyNotifier:Lcom/tapjoy/TapjoyNotifier;

    .line 100
    new-instance v0, Ljava/lang/Thread;

    #v0=(UninitRef);
    new-instance v1, Lcom/tapjoy/TJCOffers$1;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/tapjoy/TJCOffers$1;-><init>(Lcom/tapjoy/TJCOffers;)V

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 123
    return-void
.end method

.method public setEarnedPointsNotifier(Lcom/tapjoy/TapjoyEarnedPointsNotifier;)V
    .locals 0
    .parameter "notifier"

    .prologue
    .line 229
    sput-object p1, Lcom/tapjoy/TJCOffers;->tapjoyEarnedPointsNotifier:Lcom/tapjoy/TapjoyEarnedPointsNotifier;

    .line 230
    return-void
.end method

.method public showOffers()V
    .locals 4

    .prologue
    .line 54
    const-string v1, "TapjoyOffers"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "Showing offers with userID: "

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getUserID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/tapjoy/TJCOffers;->context:Landroid/content/Context;

    const-class v2, Lcom/tapjoy/TJCOffersWebView;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 57
    .local v0, offersIntent:Landroid/content/Intent;
    #v0=(Reference);
    const/high16 v1, 0x1000

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 58
    const-string v1, "USER_ID"

    #v1=(Reference);
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getUserID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 59
    const-string v1, "URL_PARAMS"

    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getURLParams()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 60
    iget-object v1, p0, Lcom/tapjoy/TJCOffers;->context:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 61
    return-void
.end method

.method public showOffersWithCurrencyID(Ljava/lang/String;Z)V
    .locals 5
    .parameter "currencyID"
    .parameter "enableCurrencySelector"

    .prologue
    .line 73
    const-string v2, "TapjoyOffers"

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "Showing offers with currencyID: "

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", selector: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " (userID = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getUserID()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ")"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    iput-object p1, p0, Lcom/tapjoy/TJCOffers;->multipleCurrencyID:Ljava/lang/String;

    .line 76
    if-eqz p2, :cond_0

    const-string v2, "1"

    :goto_0
    iput-object v2, p0, Lcom/tapjoy/TJCOffers;->multipleCurrencySelector:Ljava/lang/String;

    .line 79
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getURLParams()Ljava/lang/String;

    move-result-object v1

    .line 80
    .local v1, offersURLParams:Ljava/lang/String;
    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "&currency_id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/tapjoy/TJCOffers;->multipleCurrencyID:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 81
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "&currency_selector="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/tapjoy/TJCOffers;->multipleCurrencySelector:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 83
    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    iget-object v2, p0, Lcom/tapjoy/TJCOffers;->context:Landroid/content/Context;

    const-class v3, Lcom/tapjoy/TJCOffersWebView;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 84
    .local v0, offersIntent:Landroid/content/Intent;
    #v0=(Reference);
    const/high16 v2, 0x1000

    #v2=(Integer);
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 85
    const-string v2, "USER_ID"

    #v2=(Reference);
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getUserID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 86
    const-string v2, "URL_PARAMS"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 87
    iget-object v2, p0, Lcom/tapjoy/TJCOffers;->context:Landroid/content/Context;

    invoke-virtual {v2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 88
    return-void

    .line 76
    .end local v0           #offersIntent:Landroid/content/Intent;
    .end local v1           #offersURLParams:Ljava/lang/String;
    :cond_0
    #v0=(Uninit);v1=(Uninit);
    const-string v2, "0"

    goto :goto_0
.end method

.method public spendTapPoints(ILcom/tapjoy/TapjoySpendPointsNotifier;)V
    .locals 2
    .parameter "amount"
    .parameter "notifier"

    .prologue
    .line 133
    if-gez p1, :cond_0

    .line 135
    const-string v0, "TapjoyPoints"

    #v0=(Reference);
    const-string v1, "spendTapPoints error: amount must be a positive number"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    :goto_0
    return-void

    .line 139
    :cond_0
    #v0=(Uninit);v1=(Uninit);
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tapjoy/TJCOffers;->spendTapPoints:Ljava/lang/String;

    .line 141
    sput-object p2, Lcom/tapjoy/TJCOffers;->tapjoySpendPointsNotifier:Lcom/tapjoy/TapjoySpendPointsNotifier;

    .line 143
    new-instance v0, Ljava/lang/Thread;

    #v0=(UninitRef);
    new-instance v1, Lcom/tapjoy/TJCOffers$2;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/tapjoy/TJCOffers$2;-><init>(Lcom/tapjoy/TJCOffers;)V

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0
.end method

*/}
