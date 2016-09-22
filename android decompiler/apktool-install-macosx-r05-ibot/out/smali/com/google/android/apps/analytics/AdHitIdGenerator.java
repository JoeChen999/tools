package com.google.android.apps.analytics; class AdHitIdGenerator {/*

.class public Lcom/google/android/apps/analytics/AdHitIdGenerator;
.super Ljava/lang/Object;


# instance fields
.field private adMobSdkInstalled:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    #p0=(Reference);
    const-string v0, "com.google.ads.AdRequest"

    #v0=(Reference);
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    iput-boolean v0, p0, Lcom/google/android/apps/analytics/AdHitIdGenerator;->adMobSdkInstalled:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    #v0=(Conflicted);
    return-void

    :cond_0
    #v0=(Reference);
    move v0, v1

    #v0=(Null);
    goto :goto_0

    :catch_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    iput-boolean v1, p0, Lcom/google/android/apps/analytics/AdHitIdGenerator;->adMobSdkInstalled:Z

    goto :goto_1
.end method

.method constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-boolean p1, p0, Lcom/google/android/apps/analytics/AdHitIdGenerator;->adMobSdkInstalled:Z

    return-void
.end method


# virtual methods
.method getAdHitId()I
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/apps/analytics/AdHitIdGenerator;->adMobSdkInstalled:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Integer);
    return v0

    :cond_0
    #v0=(Boolean);
    invoke-static {}, Lcom/google/android/apps/analytics/AdMobInfo;->getInstance()Lcom/google/android/apps/analytics/AdMobInfo;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/google/android/apps/analytics/AdMobInfo;->generateAdHitId()I

    move-result v0

    #v0=(Integer);
    goto :goto_0
.end method

*/}
