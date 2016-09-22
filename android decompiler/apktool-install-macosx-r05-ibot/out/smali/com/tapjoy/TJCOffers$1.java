package com.tapjoy; class TJCOffers$1 {/*

.class Lcom/tapjoy/TJCOffers$1;
.super Ljava/lang/Object;
.source "TJCOffers.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tapjoy/TJCOffers;->getTapPoints(Lcom/tapjoy/TapjoyNotifier;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tapjoy/TJCOffers;


# direct methods
.method constructor <init>(Lcom/tapjoy/TJCOffers;)V
    .locals 0
    .parameter

    .prologue
    .line 101
    iput-object p1, p0, Lcom/tapjoy/TJCOffers$1;->this$0:Lcom/tapjoy/TJCOffers;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 104
    const/4 v1, 0x0

    .line 106
    .local v1, returnValue:Z
    #v1=(Null);
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getURLParams()Ljava/lang/String;

    move-result-object v2

    .line 107
    .local v2, url_params:Ljava/lang/String;
    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "&publisher_user_id="

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getUserID()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 110
    new-instance v3, Lcom/tapjoy/TapjoyURLConnection;

    #v3=(UninitRef);
    invoke-direct {v3}, Lcom/tapjoy/TapjoyURLConnection;-><init>()V

    #v3=(Reference);
    const-string v4, "https://ws.tapjoyads.com/get_vg_store_items/user_account?"

    invoke-virtual {v3, v4, v2}, Lcom/tapjoy/TapjoyURLConnection;->connectToURL(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 113
    .local v0, result:Ljava/lang/String;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 115
    iget-object v3, p0, Lcom/tapjoy/TJCOffers$1;->this$0:Lcom/tapjoy/TJCOffers;

    invoke-static {v3, v0}, Lcom/tapjoy/TJCOffers;->access$000(Lcom/tapjoy/TJCOffers;Ljava/lang/String;)Z

    move-result v1

    .line 119
    :cond_0
    #v1=(Boolean);
    if-nez v1, :cond_1

    .line 120
    invoke-static {}, Lcom/tapjoy/TJCOffers;->access$100()Lcom/tapjoy/TapjoyNotifier;

    move-result-object v3

    const-string v4, "Failed to retrieve points from server"

    invoke-interface {v3, v4}, Lcom/tapjoy/TapjoyNotifier;->getUpdatePointsFailed(Ljava/lang/String;)V

    .line 121
    :cond_1
    return-void
.end method

*/}
