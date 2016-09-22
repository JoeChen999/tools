package com.tapjoy; class TJCOffers$2 {/*

.class Lcom/tapjoy/TJCOffers$2;
.super Ljava/lang/Object;
.source "TJCOffers.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tapjoy/TJCOffers;->spendTapPoints(ILcom/tapjoy/TapjoySpendPointsNotifier;)V
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
    .line 144
    iput-object p1, p0, Lcom/tapjoy/TJCOffers$2;->this$0:Lcom/tapjoy/TJCOffers;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 147
    const/4 v1, 0x0

    .line 150
    .local v1, returnValue:Z
    #v1=(Null);
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getURLParams()Ljava/lang/String;

    move-result-object v2

    .line 151
    .local v2, url_params:Ljava/lang/String;
    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "&tap_points="

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/tapjoy/TJCOffers$2;->this$0:Lcom/tapjoy/TJCOffers;

    iget-object v4, v4, Lcom/tapjoy/TJCOffers;->spendTapPoints:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 152
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "&publisher_user_id="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getUserID()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 153
    new-instance v3, Lcom/tapjoy/TapjoyURLConnection;

    #v3=(UninitRef);
    invoke-direct {v3}, Lcom/tapjoy/TapjoyURLConnection;-><init>()V

    #v3=(Reference);
    const-string v4, "https://ws.tapjoyads.com/points/spend?"

    invoke-virtual {v3, v4, v2}, Lcom/tapjoy/TapjoyURLConnection;->connectToURL(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 156
    .local v0, result:Ljava/lang/String;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 158
    iget-object v3, p0, Lcom/tapjoy/TJCOffers$2;->this$0:Lcom/tapjoy/TJCOffers;

    invoke-static {v3, v0}, Lcom/tapjoy/TJCOffers;->access$200(Lcom/tapjoy/TJCOffers;Ljava/lang/String;)Z

    move-result v1

    .line 162
    :cond_0
    #v1=(Boolean);
    if-nez v1, :cond_1

    .line 163
    invoke-static {}, Lcom/tapjoy/TJCOffers;->access$300()Lcom/tapjoy/TapjoySpendPointsNotifier;

    move-result-object v3

    const-string v4, "Failed to spend points."

    invoke-interface {v3, v4}, Lcom/tapjoy/TapjoySpendPointsNotifier;->getSpendPointsResponseFailed(Ljava/lang/String;)V

    .line 166
    :cond_1
    return-void
.end method

*/}
