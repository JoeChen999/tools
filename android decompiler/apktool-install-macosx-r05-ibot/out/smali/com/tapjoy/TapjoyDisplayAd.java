package com.tapjoy; class TapjoyDisplayAd {/*

.class public Lcom/tapjoy/TapjoyDisplayAd;
.super Ljava/lang/Object;
.source "TapjoyDisplayAd.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tapjoy/TapjoyDisplayAd$1;,
        Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;,
        Lcom/tapjoy/TapjoyDisplayAd$CheckForResumeTimer;,
        Lcom/tapjoy/TapjoyDisplayAd$RefreshTimer;
    }
.end annotation


# static fields
.field public static final TAPJOY_DISPLAY_AD:Ljava/lang/String; = "Banner Ad"

.field private static adClickURL:Ljava/lang/String;

.field private static bannerHeight:I

.field private static bannerWidth:I

.field private static bitmapImage:Landroid/graphics/Bitmap;

.field private static displayAdNotifier:Lcom/tapjoy/TapjoyDisplayAdNotifier;

.field private static displayAdSize:Ljava/lang/String;

.field public static displayAdURLParams:Ljava/lang/String;

.field private static tapjoyURLConnection:Lcom/tapjoy/TapjoyURLConnection;


# instance fields
.field adView:Landroid/view/View;

.field private autoRefresh:Z

.field private context:Landroid/content/Context;

.field elapsed_time:J

.field lastAd:Landroid/graphics/Bitmap;

.field resumeTimer:Ljava/util/Timer;

.field timer:Ljava/util/Timer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/tapjoy/TapjoyDisplayAd;->tapjoyURLConnection:Lcom/tapjoy/TapjoyURLConnection;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter "ctx"

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    #p0=(Reference);
    const-string v0, "640x100"

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/tapjoy/TapjoyDisplayAd;->setDisplayAdSize(Ljava/lang/String;)V

    .line 50
    iput-object p1, p0, Lcom/tapjoy/TapjoyDisplayAd;->context:Landroid/content/Context;

    .line 51
    new-instance v0, Lcom/tapjoy/TapjoyURLConnection;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/tapjoy/TapjoyURLConnection;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/tapjoy/TapjoyDisplayAd;->tapjoyURLConnection:Lcom/tapjoy/TapjoyURLConnection;

    .line 52
    return-void
.end method

.method static synthetic access$100()Lcom/tapjoy/TapjoyDisplayAdNotifier;
    .locals 1

    .prologue
    .line 19
    sget-object v0, Lcom/tapjoy/TapjoyDisplayAd;->displayAdNotifier:Lcom/tapjoy/TapjoyDisplayAdNotifier;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$200(Lcom/tapjoy/TapjoyDisplayAd;)Landroid/content/Context;
    .locals 1
    .parameter "x0"

    .prologue
    .line 19
    iget-object v0, p0, Lcom/tapjoy/TapjoyDisplayAd;->context:Landroid/content/Context;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$400()I
    .locals 1

    .prologue
    .line 19
    sget v0, Lcom/tapjoy/TapjoyDisplayAd;->bannerWidth:I

    #v0=(Integer);
    return v0
.end method

.method static synthetic access$500()I
    .locals 1

    .prologue
    .line 19
    sget v0, Lcom/tapjoy/TapjoyDisplayAd;->bannerHeight:I

    #v0=(Integer);
    return v0
.end method

.method static synthetic access$600(Lcom/tapjoy/TapjoyDisplayAd;)Z
    .locals 1
    .parameter "x0"

    .prologue
    .line 19
    iget-boolean v0, p0, Lcom/tapjoy/TapjoyDisplayAd;->autoRefresh:Z

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$800()Lcom/tapjoy/TapjoyURLConnection;
    .locals 1

    .prologue
    .line 19
    sget-object v0, Lcom/tapjoy/TapjoyDisplayAd;->tapjoyURLConnection:Lcom/tapjoy/TapjoyURLConnection;

    #v0=(Reference);
    return-object v0
.end method

.method public static getBitmapImage()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 227
    sget-object v0, Lcom/tapjoy/TapjoyDisplayAd;->bitmapImage:Landroid/graphics/Bitmap;

    #v0=(Reference);
    return-object v0
.end method

.method public static getLinkURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 233
    sget-object v0, Lcom/tapjoy/TapjoyDisplayAd;->adClickURL:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public enableAutoRefresh(Z)V
    .locals 0
    .parameter "shouldAutoRefresh"

    .prologue
    .line 131
    iput-boolean p1, p0, Lcom/tapjoy/TapjoyDisplayAd;->autoRefresh:Z

    .line 132
    return-void
.end method

.method public getBannerAdSize()Ljava/lang/String;
    .locals 1

    .prologue
    .line 121
    invoke-virtual {p0}, Lcom/tapjoy/TapjoyDisplayAd;->getDisplayAdSize()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public getDisplayAd(Lcom/tapjoy/TapjoyDisplayAdNotifier;)V
    .locals 2
    .parameter "notifier"

    .prologue
    .line 141
    const-string v0, "Banner Ad"

    #v0=(Reference);
    const-string v1, "Get Banner Ad"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, v0, p1}, Lcom/tapjoy/TapjoyDisplayAd;->getDisplayAd(Ljava/lang/String;Lcom/tapjoy/TapjoyDisplayAdNotifier;)V

    .line 143
    return-void
.end method

.method public getDisplayAd(Ljava/lang/String;Lcom/tapjoy/TapjoyDisplayAdNotifier;)V
    .locals 4
    .parameter "currencyID"
    .parameter "notifier"

    .prologue
    .line 153
    const-string v0, "Banner Ad"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "Get Banner Ad, currencyID: "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    sput-object p2, Lcom/tapjoy/TapjoyDisplayAd;->displayAdNotifier:Lcom/tapjoy/TapjoyDisplayAdNotifier;

    .line 158
    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getURLParams()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tapjoy/TapjoyDisplayAd;->displayAdURLParams:Ljava/lang/String;

    .line 159
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    sget-object v1, Lcom/tapjoy/TapjoyDisplayAd;->displayAdURLParams:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&publisher_user_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/tapjoy/TapjoyConnectCore;->getUserID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tapjoy/TapjoyDisplayAd;->displayAdURLParams:Ljava/lang/String;

    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    sget-object v1, Lcom/tapjoy/TapjoyDisplayAd;->displayAdURLParams:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/tapjoy/TapjoyDisplayAd;->displayAdSize:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tapjoy/TapjoyDisplayAd;->displayAdURLParams:Ljava/lang/String;

    .line 163
    if-eqz p1, :cond_0

    .line 164
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    sget-object v1, Lcom/tapjoy/TapjoyDisplayAd;->displayAdURLParams:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&currency_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tapjoy/TapjoyDisplayAd;->displayAdURLParams:Ljava/lang/String;

    .line 167
    :cond_0
    new-instance v0, Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;-><init>(Lcom/tapjoy/TapjoyDisplayAd;Lcom/tapjoy/TapjoyDisplayAd$1;)V

    #v0=(Reference);
    const/4 v1, 0x2

    #v1=(PosByte);
    new-array v1, v1, [Ljava/lang/String;

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    const-string v3, "https://ws.tapjoyads.com/display_ad.html?"

    #v3=(Reference);
    aput-object v3, v1, v2

    const/4 v2, 0x1

    #v2=(One);
    sget-object v3, Lcom/tapjoy/TapjoyDisplayAd;->displayAdURLParams:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/tapjoy/TapjoyDisplayAd$GetBannerAdTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 168
    return-void
.end method

.method public getDisplayAdSize()Ljava/lang/String;
    .locals 1

    .prologue
    .line 93
    sget-object v0, Lcom/tapjoy/TapjoyDisplayAd;->displayAdSize:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public setBannerAdSize(Ljava/lang/String;)V
    .locals 0
    .parameter "dimensions"

    .prologue
    .line 109
    invoke-virtual {p0, p1}, Lcom/tapjoy/TapjoyDisplayAd;->setDisplayAdSize(Ljava/lang/String;)V

    .line 110
    return-void
.end method

.method public setDisplayAdSize(Ljava/lang/String;)V
    .locals 1
    .parameter "dimensions"

    .prologue
    .line 65
    sput-object p1, Lcom/tapjoy/TapjoyDisplayAd;->displayAdSize:Ljava/lang/String;

    .line 67
    const-string v0, "320x50"

    #v0=(Reference);
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 69
    const/16 v0, 0x140

    #v0=(PosShort);
    sput v0, Lcom/tapjoy/TapjoyDisplayAd;->bannerWidth:I

    .line 70
    const/16 v0, 0x32

    #v0=(PosByte);
    sput v0, Lcom/tapjoy/TapjoyDisplayAd;->bannerHeight:I

    .line 84
    :cond_0
    :goto_0
    return-void

    .line 73
    :cond_1
    #v0=(Boolean);
    const-string v0, "640x100"

    #v0=(Reference);
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    .line 75
    const/16 v0, 0x280

    #v0=(PosShort);
    sput v0, Lcom/tapjoy/TapjoyDisplayAd;->bannerWidth:I

    .line 76
    const/16 v0, 0x64

    #v0=(PosByte);
    sput v0, Lcom/tapjoy/TapjoyDisplayAd;->bannerHeight:I

    goto :goto_0

    .line 79
    :cond_2
    #v0=(Boolean);
    const-string v0, "768x90"

    #v0=(Reference);
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 81
    const/16 v0, 0x300

    #v0=(PosShort);
    sput v0, Lcom/tapjoy/TapjoyDisplayAd;->bannerWidth:I

    .line 82
    const/16 v0, 0x5a

    #v0=(PosByte);
    sput v0, Lcom/tapjoy/TapjoyDisplayAd;->bannerHeight:I

    goto :goto_0
.end method

*/}
