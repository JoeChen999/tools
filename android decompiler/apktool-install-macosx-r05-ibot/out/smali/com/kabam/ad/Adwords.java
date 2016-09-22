package com.kabam.ad; class Adwords {/*

.class public Lcom/kabam/ad/Adwords;
.super Ljava/lang/Object;
.source "Adwords.java"


# static fields
.field private static sInstance:Lcom/kabam/ad/Adwords;


# instance fields
.field private mTracker:Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 15
    new-instance v0, Lcom/kabam/ad/Adwords;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/kabam/ad/Adwords;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/kabam/ad/Adwords;->sInstance:Lcom/kabam/ad/Adwords;

    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/kabam/ad/Adwords;->mTracker:Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;

    .line 19
    return-void
.end method

.method public static Instance()Lcom/kabam/ad/Adwords;
    .locals 1

    .prologue
    .line 23
    sget-object v0, Lcom/kabam/ad/Adwords;->sInstance:Lcom/kabam/ad/Adwords;

    #v0=(Reference);
    return-object v0
.end method

.method private TrackTrans()V
    .locals 2

    .prologue
    .line 123
    :try_start_0
    iget-object v1, p0, Lcom/kabam/ad/Adwords;->mTracker:Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;

    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 124
    iget-object v1, p0, Lcom/kabam/ad/Adwords;->mTracker:Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;

    invoke-virtual {v1}, Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;->trackTransactions()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    :cond_0
    :goto_0
    #v0=(Conflicted);
    return-void

    .line 126
    :catch_0
    move-exception v0

    .line 128
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method


# virtual methods
.method public AddAmazonTransaction()V
    .locals 5

    .prologue
    .line 107
    :try_start_0
    new-instance v0, Lcom/google/android/apps/analytics/Transaction$Builder;

    #v0=(UninitRef);
    const-string v2, ""

    #v2=(Reference);
    const-wide/16 v3, 0x0

    #v3=(LongLo);v4=(LongHi);
    invoke-direct {v0, v2, v3, v4}, Lcom/google/android/apps/analytics/Transaction$Builder;-><init>(Ljava/lang/String;D)V

    .line 108
    .local v0, builder:Lcom/google/android/apps/analytics/Transaction$Builder;
    #v0=(Reference);
    iget-object v2, p0, Lcom/kabam/ad/Adwords;->mTracker:Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;

    if-eqz v2, :cond_0

    .line 110
    iget-object v2, p0, Lcom/kabam/ad/Adwords;->mTracker:Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;

    invoke-virtual {v0}, Lcom/google/android/apps/analytics/Transaction$Builder;->build()Lcom/google/android/apps/analytics/Transaction;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;->addTransaction(Lcom/google/android/apps/analytics/Transaction;)V

    .line 111
    invoke-direct {p0}, Lcom/kabam/ad/Adwords;->TrackTrans()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    .end local v0           #builder:Lcom/google/android/apps/analytics/Transaction$Builder;
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    .line 114
    :catch_0
    move-exception v1

    .line 116
    .local v1, ex:Ljava/lang/Exception;
    #v1=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2, v1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public AddGooglePlayItem(Ljava/lang/String;Ljava/lang/String;D)V
    .locals 8
    .parameter "sku"
    .parameter "productName"
    .parameter "price"

    .prologue
    .line 86
    :try_start_0
    new-instance v0, Lcom/google/android/apps/analytics/Item$Builder;

    #v0=(UninitRef);
    const-wide/16 v5, 0x1

    #v5=(LongLo);v6=(LongHi);
    move-object v1, p1

    #v1=(Reference);
    move-object v2, p2

    #v2=(Reference);
    move-wide v3, p3

    #v3=(DoubleLo);v4=(DoubleHi);
    invoke-direct/range {v0 .. v6}, Lcom/google/android/apps/analytics/Item$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;DJ)V

    .line 88
    .local v0, builder:Lcom/google/android/apps/analytics/Item$Builder;
    #v0=(Reference);
    iget-object v1, p0, Lcom/kabam/ad/Adwords;->mTracker:Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;

    if-eqz v1, :cond_0

    .line 90
    iget-object v1, p0, Lcom/kabam/ad/Adwords;->mTracker:Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;

    invoke-virtual {v0}, Lcom/google/android/apps/analytics/Item$Builder;->build()Lcom/google/android/apps/analytics/Item;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;->addItem(Lcom/google/android/apps/analytics/Item;)V

    .line 91
    invoke-direct {p0}, Lcom/kabam/ad/Adwords;->TrackTrans()V

    .line 94
    const-string v1, "ad"

    const-string v2, "ad adwords track purchase end."

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    .end local v0           #builder:Lcom/google/android/apps/analytics/Item$Builder;
    :cond_0
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return-void

    .line 97
    :catch_0
    move-exception v7

    .line 99
    .local v7, ex:Ljava/lang/Exception;
    #v7=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v7}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public Destroy()V
    .locals 2

    .prologue
    .line 44
    :try_start_0
    iget-object v1, p0, Lcom/kabam/ad/Adwords;->mTracker:Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;

    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 45
    iget-object v1, p0, Lcom/kabam/ad/Adwords;->mTracker:Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;

    invoke-virtual {v1}, Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;->stopSession()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    :cond_0
    :goto_0
    #v0=(Conflicted);
    return-void

    .line 47
    :catch_0
    move-exception v0

    .line 49
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public Initialize(Landroid/app/Activity;)V
    .locals 3
    .parameter "activity"

    .prologue
    .line 30
    :try_start_0
    invoke-static {}, Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;->getInstance()Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;

    move-result-object v1

    #v1=(Reference);
    iput-object v1, p0, Lcom/kabam/ad/Adwords;->mTracker:Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;

    .line 31
    iget-object v1, p0, Lcom/kabam/ad/Adwords;->mTracker:Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;

    const-string v2, "UA-35699114-1"

    #v2=(Reference);
    invoke-virtual {v1, v2, p1}, Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;->startNewSession(Ljava/lang/String;Landroid/content/Context;)V

    .line 33
    const-string v1, "ad"

    const-string v2, "ad adwords track initalization end."

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    .line 35
    :catch_0
    move-exception v0

    .line 37
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public TrackFTEComplete()V
    .locals 6

    .prologue
    .line 71
    :try_start_0
    iget-object v1, p0, Lcom/kabam/ad/Adwords;->mTracker:Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;

    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 72
    iget-object v1, p0, Lcom/kabam/ad/Adwords;->mTracker:Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;

    const-string v2, "FTE"

    #v2=(Reference);
    const-string v3, "Complete"

    #v3=(Reference);
    const-string v4, ""

    #v4=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;->trackEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 75
    :cond_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    const-string v1, "ad"

    const-string v2, "ad adwords track fte complete end."

    #v2=(Reference);
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    .line 77
    :catch_0
    move-exception v0

    .line 79
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public TrackInstall()V
    .locals 6

    .prologue
    .line 56
    :try_start_0
    iget-object v1, p0, Lcom/kabam/ad/Adwords;->mTracker:Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;

    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 57
    iget-object v1, p0, Lcom/kabam/ad/Adwords;->mTracker:Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;

    const-string v2, "Install"

    #v2=(Reference);
    const-string v3, "Success"

    #v3=(Reference);
    const-string v4, ""

    #v4=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;->trackEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 59
    :cond_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    const-string v1, "ad"

    const-string v2, "ad adwords track install end."

    #v2=(Reference);
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    .line 62
    :catch_0
    move-exception v0

    .line 64
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

*/}
