package com.chartboost.sdk; class CBAnalytics {/*

.class public Lcom/chartboost/sdk/CBAnalytics;
.super Ljava/lang/Object;
.source "CBAnalytics.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/chartboost/sdk/CBAnalytics$TransactionConnection;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String; = "ChartBoost Analytics"

.field private static sharedAnalytics:Lcom/chartboost/sdk/CBAnalytics;


# instance fields
.field private activity:Landroid/app/Activity;

.field private context:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/chartboost/sdk/CBAnalytics;->sharedAnalytics:Lcom/chartboost/sdk/CBAnalytics;

    .line 12
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    #p0=(Reference);
    return-void
.end method

.method public static declared-synchronized getSharedAnalytics(Landroid/app/Activity;)Lcom/chartboost/sdk/CBAnalytics;
    .locals 2
    .parameter "activity"

    .prologue
    .line 21
    const-class v1, Lcom/chartboost/sdk/CBAnalytics;

    #v1=(Reference);
    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/chartboost/sdk/CBAnalytics;->sharedAnalytics:Lcom/chartboost/sdk/CBAnalytics;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 22
    new-instance v0, Lcom/chartboost/sdk/CBAnalytics;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/chartboost/sdk/CBAnalytics;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/chartboost/sdk/CBAnalytics;->sharedAnalytics:Lcom/chartboost/sdk/CBAnalytics;

    .line 23
    :cond_0
    sget-object v0, Lcom/chartboost/sdk/CBAnalytics;->sharedAnalytics:Lcom/chartboost/sdk/CBAnalytics;

    iput-object p0, v0, Lcom/chartboost/sdk/CBAnalytics;->context:Landroid/content/Context;

    .line 24
    sget-object v0, Lcom/chartboost/sdk/CBAnalytics;->sharedAnalytics:Lcom/chartboost/sdk/CBAnalytics;

    iput-object p0, v0, Lcom/chartboost/sdk/CBAnalytics;->activity:Landroid/app/Activity;

    .line 25
    sget-object v0, Lcom/chartboost/sdk/CBAnalytics;->sharedAnalytics:Lcom/chartboost/sdk/CBAnalytics;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 21
    :catchall_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit v1

    throw v0
.end method

.method private round(DII)Ljava/lang/String;
    .locals 5
    .parameter "unrounded"
    .parameter "precision"
    .parameter "roundingMode"

    .prologue
    .line 52
    new-instance v0, Ljava/math/BigDecimal;

    #v0=(UninitRef);
    invoke-direct {v0, p1, p2}, Ljava/math/BigDecimal;-><init>(D)V

    .line 53
    .local v0, bd:Ljava/math/BigDecimal;
    #v0=(Reference);
    invoke-virtual {v0, p3, p4}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v1

    .line 54
    .local v1, rounded:Ljava/math/BigDecimal;
    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-virtual {v1}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v3

    #v3=(DoubleLo);v4=(DoubleHi);
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method


# virtual methods
.method public recordPaymentTransaction(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;ILjava/util/Map;)Ljava/lang/Boolean;
    .locals 11
    .parameter "sku"
    .parameter "title"
    .parameter "price"
    .parameter "currency"
    .parameter "quantity"
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "D",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .prologue
    .line 60
    .local p7, meta:Ljava/util/Map;,"Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    :try_start_0
    iget-object v5, p0, Lcom/chartboost/sdk/CBAnalytics;->activity:Landroid/app/Activity;

    #v5=(Reference);
    invoke-static {v5}, Lcom/chartboost/sdk/ChartBoost;->getSharedChartBoost(Landroid/content/Context;)Lcom/chartboost/sdk/ChartBoost;

    move-result-object v1

    .line 61
    .local v1, cb:Lcom/chartboost/sdk/ChartBoost;
    #v1=(Reference);
    invoke-virtual {v1}, Lcom/chartboost/sdk/ChartBoost;->getAppId()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v1}, Lcom/chartboost/sdk/ChartBoost;->getAppSignature()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1

    .line 62
    :cond_0
    const/4 v5, 0x0

    #v5=(Null);
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    .line 86
    .end local v1           #cb:Lcom/chartboost/sdk/ChartBoost;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    return-object v5

    .line 64
    .restart local v1       #cb:Lcom/chartboost/sdk/ChartBoost;
    :cond_1
    #v0=(Uninit);v1=(Reference);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
    new-instance v3, Lcom/chartboost/sdk/CBAPIRequest;

    #v3=(UninitRef);
    iget-object v5, p0, Lcom/chartboost/sdk/CBAnalytics;->activity:Landroid/app/Activity;

    const-string v6, "api"

    #v6=(Reference);
    const-string v7, "purchase"

    #v7=(Reference);
    invoke-direct {v3, v5, v6, v7}, Lcom/chartboost/sdk/CBAPIRequest;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .local v3, request:Lcom/chartboost/sdk/CBAPIRequest;
    #v3=(Reference);
    invoke-virtual {v3}, Lcom/chartboost/sdk/CBAPIRequest;->appendDeviceInfoParams()V

    .line 66
    const-string v5, "product_id"

    invoke-virtual {v3, v5, p1}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    const-string v5, "title"

    invoke-virtual {v3, v5, p2}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    const-string v5, "price"

    const/4 v6, 0x2

    #v6=(PosByte);
    const/4 v7, 0x4

    #v7=(PosByte);
    invoke-direct {p0, p3, p4, v6, v7}, Lcom/chartboost/sdk/CBAnalytics;->round(DII)Ljava/lang/String;

    move-result-object v6

    #v6=(Reference);
    invoke-virtual {v3, v5, v6}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    const-string v5, "currency"

    move-object/from16 v0, p5

    #v0=(Reference);
    invoke-virtual {v3, v5, v0}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    const-string v5, "quantity"

    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-static/range {p6 .. p6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    #v7=(Reference);
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v6=(Reference);
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    const-string v5, "timestamp"

    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    #v7=(LongLo);v8=(LongHi);
    long-to-double v7, v7

    #v7=(DoubleLo);v8=(DoubleHi);
    const-wide v9, 0x408f400000000000L

    #v9=(LongLo);v10=(LongHi);
    div-double/2addr v7, v9

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v7

    #v7=(Reference);
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v6=(Reference);
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    if-eqz p7, :cond_2

    .line 75
    new-instance v2, Lorg/json/JSONObject;

    #v2=(UninitRef);
    move-object/from16 v0, p7

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 76
    .local v2, jsonObj:Lorg/json/JSONObject;
    #v2=(Reference);
    const-string v5, "meta"

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .end local v2           #jsonObj:Lorg/json/JSONObject;
    :cond_2
    #v2=(Conflicted);
    invoke-virtual {v1}, Lcom/chartboost/sdk/ChartBoost;->getAppId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/chartboost/sdk/ChartBoost;->getAppSignature()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lcom/chartboost/sdk/CBAPIRequest;->sign(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    new-instance v4, Lcom/chartboost/sdk/CBAnalytics$TransactionConnection;

    #v4=(UninitRef);
    iget-object v5, p0, Lcom/chartboost/sdk/CBAnalytics;->context:Landroid/content/Context;

    invoke-direct {v4, p0, v5}, Lcom/chartboost/sdk/CBAnalytics$TransactionConnection;-><init>(Lcom/chartboost/sdk/CBAnalytics;Landroid/content/Context;)V

    .line 82
    .local v4, tc:Lcom/chartboost/sdk/CBAnalytics$TransactionConnection;
    #v4=(Reference);
    const/4 v5, 0x1

    #v5=(One);
    new-array v5, v5, [Lcom/chartboost/sdk/CBAPIRequest;

    #v5=(Reference);
    const/4 v6, 0x0

    #v6=(Null);
    aput-object v3, v5, v6

    invoke-virtual {v4, v5}, Lcom/chartboost/sdk/CBAnalytics$TransactionConnection;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    .end local v1           #cb:Lcom/chartboost/sdk/ChartBoost;
    .end local v3           #request:Lcom/chartboost/sdk/CBAPIRequest;
    .end local v4           #tc:Lcom/chartboost/sdk/CBAnalytics$TransactionConnection;
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    const/4 v5, 0x1

    #v5=(One);
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    #v5=(Reference);
    goto/16 :goto_0

    .line 83
    :catch_0
    move-exception v5

    #v5=(Reference);
    goto :goto_1
.end method

.method public trackEvent(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 3
    .parameter "eventIdentifier"

    .prologue
    .line 91
    const-wide/high16 v0, 0x3ff0

    #v0=(LongLo);v1=(LongHi);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/chartboost/sdk/CBAnalytics;->trackEvent(Ljava/lang/String;DLjava/util/Map;)Ljava/lang/Boolean;

    .line 92
    const/4 v0, 0x1

    #v0=(One);
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public trackEvent(Ljava/lang/String;D)Ljava/lang/Boolean;
    .locals 1
    .parameter "eventIdentifier"
    .parameter "value"

    .prologue
    .line 97
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/chartboost/sdk/CBAnalytics;->trackEvent(Ljava/lang/String;DLjava/util/Map;)Ljava/lang/Boolean;

    .line 98
    const/4 v0, 0x1

    #v0=(One);
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public trackEvent(Ljava/lang/String;DLjava/util/Map;)Ljava/lang/Boolean;
    .locals 11
    .parameter "eventIdentifier"
    .parameter "value"
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "D",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .prologue
    .local p4, meta:Ljava/util/Map;,"Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    const/4 v10, 0x1

    .line 104
    :try_start_0
    #v10=(One);
    iget-object v4, p0, Lcom/chartboost/sdk/CBAnalytics;->activity:Landroid/app/Activity;

    #v4=(Reference);
    invoke-static {v4}, Lcom/chartboost/sdk/ChartBoost;->getSharedChartBoost(Landroid/content/Context;)Lcom/chartboost/sdk/ChartBoost;

    move-result-object v0

    .line 105
    .local v0, cb:Lcom/chartboost/sdk/ChartBoost;
    #v0=(Reference);
    invoke-virtual {v0}, Lcom/chartboost/sdk/ChartBoost;->getAppId()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v0}, Lcom/chartboost/sdk/ChartBoost;->getAppSignature()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    .line 106
    :cond_0
    const/4 v4, 0x0

    #v4=(Null);
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 127
    .end local v0           #cb:Lcom/chartboost/sdk/ChartBoost;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    return-object v4

    .line 108
    .restart local v0       #cb:Lcom/chartboost/sdk/ChartBoost;
    :cond_1
    #v0=(Reference);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    new-instance v2, Lcom/chartboost/sdk/CBAPIRequest;

    #v2=(UninitRef);
    iget-object v4, p0, Lcom/chartboost/sdk/CBAnalytics;->activity:Landroid/app/Activity;

    const-string v5, "api"

    #v5=(Reference);
    const-string v6, "event"

    #v6=(Reference);
    invoke-direct {v2, v4, v5, v6}, Lcom/chartboost/sdk/CBAPIRequest;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .local v2, request:Lcom/chartboost/sdk/CBAPIRequest;
    #v2=(Reference);
    invoke-virtual {v2}, Lcom/chartboost/sdk/CBAPIRequest;->appendDeviceInfoParams()V

    .line 110
    const-string v4, "key"

    invoke-virtual {v2, v4, p1}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    const-string v4, "value"

    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    const-string v4, "timestamp"

    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    #v6=(LongLo);v7=(LongHi);
    long-to-double v6, v6

    #v6=(DoubleLo);v7=(DoubleHi);
    const-wide v8, 0x408f400000000000L

    #v8=(LongLo);v9=(LongHi);
    div-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v6

    #v6=(Reference);
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    if-eqz p4, :cond_2

    .line 116
    new-instance v1, Lorg/json/JSONObject;

    #v1=(UninitRef);
    invoke-direct {v1, p4}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 117
    .local v1, jsonObj:Lorg/json/JSONObject;
    #v1=(Reference);
    const-string v4, "meta"

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    .end local v1           #jsonObj:Lorg/json/JSONObject;
    :cond_2
    #v1=(Conflicted);
    invoke-virtual {v0}, Lcom/chartboost/sdk/ChartBoost;->getAppId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/chartboost/sdk/ChartBoost;->getAppSignature()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lcom/chartboost/sdk/CBAPIRequest;->sign(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    new-instance v3, Lcom/chartboost/sdk/CBAnalytics$TransactionConnection;

    #v3=(UninitRef);
    iget-object v4, p0, Lcom/chartboost/sdk/CBAnalytics;->context:Landroid/content/Context;

    invoke-direct {v3, p0, v4}, Lcom/chartboost/sdk/CBAnalytics$TransactionConnection;-><init>(Lcom/chartboost/sdk/CBAnalytics;Landroid/content/Context;)V

    .line 123
    .local v3, tc:Lcom/chartboost/sdk/CBAnalytics$TransactionConnection;
    #v3=(Reference);
    const/4 v4, 0x1

    #v4=(One);
    new-array v4, v4, [Lcom/chartboost/sdk/CBAPIRequest;

    #v4=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    aput-object v2, v4, v5

    invoke-virtual {v3, v4}, Lcom/chartboost/sdk/CBAnalytics$TransactionConnection;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    .end local v0           #cb:Lcom/chartboost/sdk/ChartBoost;
    .end local v2           #request:Lcom/chartboost/sdk/CBAPIRequest;
    .end local v3           #tc:Lcom/chartboost/sdk/CBAnalytics$TransactionConnection;
    :goto_1
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    goto :goto_0

    .line 124
    :catch_0
    #v4=(Conflicted);
    move-exception v4

    #v4=(Reference);
    goto :goto_1
.end method

*/}
