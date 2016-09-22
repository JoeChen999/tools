package com.google.android.apps.analytics; class AnalyticsReceiver {/*

.class public Lcom/google/android/apps/analytics/AnalyticsReceiver;
.super Landroid/content/BroadcastReceiver;


# static fields
.field static final INSTALL_ACTION:Ljava/lang/String; = "com.android.vending.INSTALL_REFERRER"

.field static final REFERRER_KEY:Ljava/lang/String; = "referrer"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    const-string v0, "referrer"

    #v0=(Reference);
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.android.vending.INSTALL_REFERRER"

    #v1=(Reference);
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v1=(Conflicted);v3=(Conflicted);
    return-void

    :cond_1
    #v1=(Boolean);v3=(Uninit);
    const-string v1, "GoogleAnalyticsTracker"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "referrer="

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v1, Lcom/google/android/apps/analytics/PersistentHitStore;

    #v1=(UninitRef);
    invoke-direct {v1, p1}, Lcom/google/android/apps/analytics/PersistentHitStore;-><init>(Landroid/content/Context;)V

    #v1=(Reference);
    invoke-interface {v1, v0}, Lcom/google/android/apps/analytics/HitStore;->setReferrer(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    const-string v0, "GoogleAnalyticsTracker"

    #v0=(Reference);
    const-string v1, "Referrer store attemped succeeded."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_2
    #v0=(Boolean);
    const-string v0, "GoogleAnalyticsTracker"

    #v0=(Reference);
    const-string v1, "Referrer store attempt failed."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

*/}
