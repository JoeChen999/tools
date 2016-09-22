package com.mobileapptracker; class MobileAppTracker$1 {/*

.class Lcom/mobileapptracker/MobileAppTracker$1;
.super Landroid/content/BroadcastReceiver;
.source "MobileAppTracker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mobileapptracker/MobileAppTracker;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mobileapptracker/MobileAppTracker;


# direct methods
.method constructor <init>(Lcom/mobileapptracker/MobileAppTracker;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/mobileapptracker/MobileAppTracker$1;->this$0:Lcom/mobileapptracker/MobileAppTracker;

    .line 179
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2
    .parameter "context"
    .parameter "intent"

    .prologue
    .line 182
    const-string v1, "connectivity"

    #v1=(Reference);
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 183
    .local v0, connectivityManager:Landroid/net/ConnectivityManager;
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/mobileapptracker/MobileAppTracker$1;->this$0:Lcom/mobileapptracker/MobileAppTracker;

    invoke-static {v1}, Lcom/mobileapptracker/MobileAppTracker;->access$5(Lcom/mobileapptracker/MobileAppTracker;)I

    move-result v1

    #v1=(Integer);
    if-lez v1, :cond_0

    .line 184
    iget-object v1, p0, Lcom/mobileapptracker/MobileAppTracker$1;->this$0:Lcom/mobileapptracker/MobileAppTracker;

    #v1=(Reference);
    invoke-static {v1}, Lcom/mobileapptracker/MobileAppTracker;->access$6(Lcom/mobileapptracker/MobileAppTracker;)V

    .line 186
    :cond_0
    #v1=(Conflicted);
    return-void
.end method

*/}
