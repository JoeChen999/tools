package com.mobileapptracker; class FacebookReceiver {/*

.class public Lcom/mobileapptracker/FacebookReceiver;
.super Landroid/content/BroadcastReceiver;
.source "FacebookReceiver.java"


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
    .line 20
    const-string v2, "mat_fb_intent"

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {p1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 21
    .local v0, SP:Landroid/content/SharedPreferences;
    #v0=(Reference);
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 22
    .local v1, editor:Landroid/content/SharedPreferences$Editor;
    #v1=(Reference);
    const-string v2, "action"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 23
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 24
    return-void
.end method

*/}
