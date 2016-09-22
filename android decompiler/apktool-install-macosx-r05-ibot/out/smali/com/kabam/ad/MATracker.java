package com.kabam.ad; class MATracker {/*

.class public Lcom/kabam/ad/MATracker;
.super Ljava/lang/Object;
.source "MATracker.java"


# static fields
.field private static sTracker:Lcom/kabam/ad/MATracker;


# instance fields
.field public mMobileAppTracker:Lcom/mobileapptracker/MobileAppTracker;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 11
    new-instance v0, Lcom/kabam/ad/MATracker;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/kabam/ad/MATracker;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/kabam/ad/MATracker;->sTracker:Lcom/kabam/ad/MATracker;

    .line 9
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/kabam/ad/MATracker;->mMobileAppTracker:Lcom/mobileapptracker/MobileAppTracker;

    .line 16
    return-void
.end method

.method public static Instance()Lcom/kabam/ad/MATracker;
    .locals 1

    .prologue
    .line 20
    sget-object v0, Lcom/kabam/ad/MATracker;->sTracker:Lcom/kabam/ad/MATracker;

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public Initialize(Landroid/app/Activity;)V
    .locals 6
    .parameter "activity"

    .prologue
    const/4 v4, 0x1

    .line 26
    #v4=(One);
    new-instance v0, Lcom/mobileapptracker/MobileAppTracker;

    #v0=(UninitRef);
    invoke-virtual {p1}, Landroid/app/Activity;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "885"

    #v2=(Reference);
    const-string v3, "5fe62a47e94a9edb757022c4f72e6386"

    #v3=(Reference);
    move v5, v4

    #v5=(One);
    invoke-direct/range {v0 .. v5}, Lcom/mobileapptracker/MobileAppTracker;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZZ)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/ad/MATracker;->mMobileAppTracker:Lcom/mobileapptracker/MobileAppTracker;

    .line 27
    iget-object v0, p0, Lcom/kabam/ad/MATracker;->mMobileAppTracker:Lcom/mobileapptracker/MobileAppTracker;

    invoke-virtual {v0}, Lcom/mobileapptracker/MobileAppTracker;->trackInstall()I

    .line 28
    iget-object v0, p0, Lcom/kabam/ad/MATracker;->mMobileAppTracker:Lcom/mobileapptracker/MobileAppTracker;

    const-string v1, "4880"

    invoke-virtual {v0, v1}, Lcom/mobileapptracker/MobileAppTracker;->setSiteId(Ljava/lang/String;)V

    .line 31
    const-string v0, "ad"

    const-string v1, "ad mat track initalization end."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    return-void
.end method

*/}
