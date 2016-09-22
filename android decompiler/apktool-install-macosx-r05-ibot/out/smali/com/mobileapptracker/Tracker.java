package com.mobileapptracker; class Tracker {/*

.class public Lcom/mobileapptracker/Tracker;
.super Landroid/content/BroadcastReceiver;
.source "Tracker.java"


# instance fields
.field SP:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4
    .parameter "context"
    .parameter "intent"

    .prologue
    .line 22
    const-string v2, "referrer"

    #v2=(Reference);
    invoke-virtual {p2, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 23
    .local v1, referrer:Ljava/lang/String;
    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 24
    const-string v2, "mat_referrer"

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {p1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    iput-object v2, p0, Lcom/mobileapptracker/Tracker;->SP:Landroid/content/SharedPreferences;

    .line 25
    iget-object v2, p0, Lcom/mobileapptracker/Tracker;->SP:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 26
    .local v0, editor:Landroid/content/SharedPreferences$Editor;
    #v0=(Reference);
    const-string v2, "referrer"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 27
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 29
    .end local v0           #editor:Landroid/content/SharedPreferences$Editor;
    :cond_0
    #v0=(Conflicted);v3=(Conflicted);
    return-void
.end method

*/}
