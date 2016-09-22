package com.tapjoy; class TJCOffers$3 {/*

.class Lcom/tapjoy/TJCOffers$3;
.super Ljava/lang/Object;
.source "TJCOffers.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tapjoy/TJCOffers;->awardTapPoints(ILcom/tapjoy/TapjoyAwardPointsNotifier;)V
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
    .line 189
    iput-object p1, p0, Lcom/tapjoy/TJCOffers$3;->this$0:Lcom/tapjoy/TJCOffers;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .prologue
    .line 192
    const/4 v2, 0x0

    .line 194
    .local v2, returnValue:Z
    #v2=(Null);
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v6

    #v6=(Reference);
    invoke-virtual {v6}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    .line 195
    .local v0, guid:Ljava/lang/String;
    #v0=(Reference);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    #v6=(LongLo);v7=(LongHi);
    const-wide/16 v8, 0x3e8

    #v8=(LongLo);v9=(LongHi);
    div-long v3, v6, v8

    .line 199
    .local v3, time:J
    #v3=(LongLo);v4=(LongHi);
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getURLParams()Ljava/lang/String;

    move-result-object v5

    .line 200
    .local v5, url_params:Ljava/lang/String;
    #v5=(Reference);
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "&tap_points="

    #v7=(Reference);
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lcom/tapjoy/TJCOffers$3;->this$0:Lcom/tapjoy/TJCOffers;

    iget v7, v7, Lcom/tapjoy/TJCOffers;->awardTapPoints:I

    #v7=(Integer);
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 201
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "&publisher_user_id="

    #v7=(Reference);
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getUserID()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 203
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "&guid="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 204
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "&timestamp="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 205
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "&verifier="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lcom/tapjoy/TJCOffers$3;->this$0:Lcom/tapjoy/TJCOffers;

    iget v7, v7, Lcom/tapjoy/TJCOffers;->awardTapPoints:I

    #v7=(Integer);
    invoke-static {v3, v4, v7, v0}, Lcom/tapjoy/TapjoyConnectCore;->getAwardPointsVerifier(JILjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    #v7=(Reference);
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 207
    new-instance v6, Lcom/tapjoy/TapjoyURLConnection;

    #v6=(UninitRef);
    invoke-direct {v6}, Lcom/tapjoy/TapjoyURLConnection;-><init>()V

    #v6=(Reference);
    const-string v7, "https://ws.tapjoyads.com/points/award?"

    invoke-virtual {v6, v7, v5}, Lcom/tapjoy/TapjoyURLConnection;->connectToURL(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 210
    .local v1, result:Ljava/lang/String;
    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 212
    iget-object v6, p0, Lcom/tapjoy/TJCOffers$3;->this$0:Lcom/tapjoy/TJCOffers;

    invoke-static {v6, v1}, Lcom/tapjoy/TJCOffers;->access$400(Lcom/tapjoy/TJCOffers;Ljava/lang/String;)Z

    move-result v2

    .line 216
    :cond_0
    #v2=(Boolean);
    if-nez v2, :cond_1

    .line 217
    invoke-static {}, Lcom/tapjoy/TJCOffers;->access$500()Lcom/tapjoy/TapjoyAwardPointsNotifier;

    move-result-object v6

    const-string v7, "Failed to award points."

    invoke-interface {v6, v7}, Lcom/tapjoy/TapjoyAwardPointsNotifier;->getAwardPointsResponseFailed(Ljava/lang/String;)V

    .line 218
    :cond_1
    return-void
.end method

*/}
