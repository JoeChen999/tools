package com.kabam.tapjoy; class TapJoy {/*

.class public Lcom/kabam/tapjoy/TapJoy;
.super Ljava/lang/Object;
.source "TapJoy.java"

# interfaces
.implements Lcom/tapjoy/TapjoyEarnedPointsNotifier;


# instance fields
.field private mAndroidID:Ljava/lang/String;

.field private mTVUID:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    #p0=(Reference);
    const-string v0, ""

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/tapjoy/TapJoy;->mAndroidID:Ljava/lang/String;

    .line 60
    const-string v0, ""

    iput-object v0, p0, Lcom/kabam/tapjoy/TapJoy;->mTVUID:Ljava/lang/String;

    .line 21
    return-void
.end method

.method private SetUserID(Ljava/lang/String;)V
    .locals 1
    .parameter "userID"

    .prologue
    .line 56
    invoke-static {}, Lcom/tapjoy/TapjoyConnect;->getTapjoyConnectInstance()Lcom/tapjoy/TapjoyConnect;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/tapjoy/TapjoyConnect;->setUserID(Ljava/lang/String;)V

    .line 57
    return-void
.end method


# virtual methods
.method public OnCreate(Landroid/app/Activity;)V
    .locals 3
    .parameter "activity"

    .prologue
    .line 25
    new-instance v0, Ljava/util/Hashtable;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    .line 26
    .local v0, flags:Ljava/util/Hashtable;,"Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/String;>;"
    #v0=(Reference);
    const-string v1, "enable_logging"

    #v1=(Reference);
    const-string v2, "true"

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    const-string v1, "25459e5b-9bf7-4812-bd34-cfcc907210ad"

    const-string v2, "zdTg28wtp7XJH2OxN4IG"

    invoke-static {p1, v1, v2, v0}, Lcom/tapjoy/TapjoyConnect;->requestTapjoyConnect(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Hashtable;)V

    .line 29
    invoke-static {}, Lcom/tapjoy/TapjoyConnect;->getTapjoyConnectInstance()Lcom/tapjoy/TapjoyConnect;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/tapjoy/TapjoyConnect;->setEarnedPointsNotifier(Lcom/tapjoy/TapjoyEarnedPointsNotifier;)V

    .line 31
    return-void
.end method

.method public OnDestroy()V
    .locals 1

    .prologue
    .line 39
    invoke-static {}, Lcom/tapjoy/TapjoyConnect;->getTapjoyConnectInstance()Lcom/tapjoy/TapjoyConnect;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/tapjoy/TapjoyConnect;->sendShutDownEvent()V

    .line 40
    return-void
.end method

.method public OnPause()V
    .locals 2

    .prologue
    .line 35
    invoke-static {}, Lcom/tapjoy/TapjoyConnect;->getTapjoyConnectInstance()Lcom/tapjoy/TapjoyConnect;

    move-result-object v0

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Lcom/tapjoy/TapjoyConnect;->enableDisplayAdAutoRefresh(Z)V

    .line 36
    return-void
.end method

.method public SetAndroidID(Ljava/lang/String;)V
    .locals 4
    .parameter "androidID"

    .prologue
    .line 64
    iput-object p1, p0, Lcom/kabam/tapjoy/TapJoy;->mAndroidID:Ljava/lang/String;

    .line 65
    iget-object v0, p0, Lcom/kabam/tapjoy/TapJoy;->mTVUID:Ljava/lang/String;

    #v0=(Reference);
    const-string v1, ""

    #v1=(Reference);
    if-eq v0, v1, :cond_0

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/kabam/tapjoy/TapJoy;->mAndroidID:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/kabam/tapjoy/TapJoy;->mTVUID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/kabam/tapjoy/TapJoy;->SetUserID(Ljava/lang/String;)V

    .line 67
    :cond_0
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    const-string v1, "SetAndroidID"

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "SetAndroidID TVUID = "

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    iget-object v3, p0, Lcom/kabam/tapjoy/TapJoy;->mAndroidID:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/kabam/tapjoy/TapJoy;->mTVUID:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    return-void
.end method

.method public SetTVUID(Ljava/lang/String;)V
    .locals 4
    .parameter "TVUID"

    .prologue
    .line 72
    iput-object p1, p0, Lcom/kabam/tapjoy/TapJoy;->mTVUID:Ljava/lang/String;

    .line 73
    iget-object v0, p0, Lcom/kabam/tapjoy/TapJoy;->mAndroidID:Ljava/lang/String;

    #v0=(Reference);
    const-string v1, ""

    #v1=(Reference);
    if-eq v0, v1, :cond_0

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/kabam/tapjoy/TapJoy;->mAndroidID:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/kabam/tapjoy/TapJoy;->mTVUID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/kabam/tapjoy/TapJoy;->SetUserID(Ljava/lang/String;)V

    .line 75
    :cond_0
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    const-string v1, "SetTVUID"

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "SetTVUID:send TVUID = "

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    iget-object v3, p0, Lcom/kabam/tapjoy/TapJoy;->mAndroidID:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/kabam/tapjoy/TapJoy;->mTVUID:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    return-void
.end method

.method public ShowOffers()V
    .locals 1

    .prologue
    .line 51
    invoke-static {}, Lcom/tapjoy/TapjoyConnect;->getTapjoyConnectInstance()Lcom/tapjoy/TapjoyConnect;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/tapjoy/TapjoyConnect;->showOffers()V

    .line 52
    return-void
.end method

.method public earnedTapPoints(I)V
    .locals 0
    .parameter "amount"

    .prologue
    .line 46
    invoke-static {p1}, Lcom/kabam/utility/UnitySender;->SendTapJoyGems(I)V

    .line 47
    return-void
.end method

*/}
