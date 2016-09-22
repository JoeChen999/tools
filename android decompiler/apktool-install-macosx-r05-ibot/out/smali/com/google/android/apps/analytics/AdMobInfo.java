package com.google.android.apps.analytics; class AdMobInfo {/*

.class public Lcom/google/android/apps/analytics/AdMobInfo;
.super Ljava/lang/Object;


# static fields
.field private static final INSTANCE:Lcom/google/android/apps/analytics/AdMobInfo;


# instance fields
.field private adHitId:I

.field private random:Ljava/util/Random;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/apps/analytics/AdMobInfo;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/google/android/apps/analytics/AdMobInfo;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/google/android/apps/analytics/AdMobInfo;->INSTANCE:Lcom/google/android/apps/analytics/AdMobInfo;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    new-instance v0, Ljava/util/Random;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/google/android/apps/analytics/AdMobInfo;->random:Ljava/util/Random;

    return-void
.end method

.method public static getInstance()Lcom/google/android/apps/analytics/AdMobInfo;
    .locals 1

    sget-object v0, Lcom/google/android/apps/analytics/AdMobInfo;->INSTANCE:Lcom/google/android/apps/analytics/AdMobInfo;

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public generateAdHitId()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/apps/analytics/AdMobInfo;->random:Ljava/util/Random;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/google/android/apps/analytics/AdMobInfo;->adHitId:I

    iget v0, p0, Lcom/google/android/apps/analytics/AdMobInfo;->adHitId:I

    return v0
.end method

.method public getAdHitId()I
    .locals 1

    iget v0, p0, Lcom/google/android/apps/analytics/AdMobInfo;->adHitId:I

    #v0=(Integer);
    return v0
.end method

.method public getJoinId()Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    #v0=(Null);
    iget v1, p0, Lcom/google/android/apps/analytics/AdMobInfo;->adHitId:I

    #v1=(Integer);
    if-nez v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Null);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    invoke-static {}, Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;->getInstance()Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;->getVisitorIdForAds()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v1}, Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;->getSessionIdForAds()Ljava/lang/String;

    move-result-object v1

    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    const-string v0, "A,%s,%s,%d"

    #v0=(Reference);
    const/4 v3, 0x3

    #v3=(PosByte);
    new-array v3, v3, [Ljava/lang/Object;

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    aput-object v2, v3, v4

    const/4 v2, 0x1

    #v2=(One);
    aput-object v1, v3, v2

    const/4 v1, 0x2

    #v1=(PosByte);
    iget v2, p0, Lcom/google/android/apps/analytics/AdMobInfo;->adHitId:I

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v3, v1

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public setAdHitId(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/apps/analytics/AdMobInfo;->adHitId:I

    return-void
.end method

*/}
