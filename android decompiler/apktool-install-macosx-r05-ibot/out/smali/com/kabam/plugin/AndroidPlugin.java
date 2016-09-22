package com.kabam.plugin; class AndroidPlugin {/*

.class public Lcom/kabam/plugin/AndroidPlugin;
.super Ljava/lang/Object;
.source "AndroidPlugin.java"


# static fields
.field private static sKeyboard:Lcom/kabam/keyboard/AndroidKeyboard;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 81
    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/kabam/plugin/AndroidPlugin;->sKeyboard:Lcom/kabam/keyboard/AndroidKeyboard;

    .line 23
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static AdwordsTrackFTEComplete()V
    .locals 1

    .prologue
    .line 130
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideAdwords()Lcom/kabam/ad/Adwords;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/ad/Adwords;->TrackFTEComplete()V

    .line 131
    return-void
.end method

.method public static AdwordsTrackPurchase(Ljava/lang/String;Ljava/lang/String;D)V
    .locals 1
    .parameter "sku"
    .parameter "productName"
    .parameter "price"

    .prologue
    .line 149
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideAdwords()Lcom/kabam/ad/Adwords;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/kabam/ad/Adwords;->AddGooglePlayItem(Ljava/lang/String;Ljava/lang/String;D)V

    .line 150
    return-void
.end method

.method public static ChangeInputBoxAtx(Landroid/app/Activity;FFFF)V
    .locals 1
    .parameter "activity"
    .parameter "x"
    .parameter "y"
    .parameter "width"
    .parameter "height"

    .prologue
    .line 98
    invoke-static {p0}, Lcom/kabam/plugin/AndroidPlugin;->GetAndroidKeyboard(Landroid/app/Activity;)Lcom/kabam/keyboard/AndroidKeyboard;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/kabam/keyboard/AndroidKeyboard;->AndroidChangeInputBoxAtx(FFFF)V

    .line 99
    return-void
.end method

.method public static Chartboost(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V
    .locals 0
    .parameter "signature"
    .parameter "appID"
    .parameter "activity"

    .prologue
    .line 114
    invoke-static {p0, p1, p2}, Lcom/kabam/ad/AndroidChartboost;->ChartBoostAction(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V

    .line 115
    return-void
.end method

.method private static GetAndroidKeyboard(Landroid/app/Activity;)Lcom/kabam/keyboard/AndroidKeyboard;
    .locals 1
    .parameter "activity"

    .prologue
    .line 85
    sget-object v0, Lcom/kabam/plugin/AndroidPlugin;->sKeyboard:Lcom/kabam/keyboard/AndroidKeyboard;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 87
    new-instance v0, Lcom/kabam/keyboard/AndroidKeyboard;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/kabam/keyboard/AndroidKeyboard;-><init>(Landroid/app/Activity;)V

    #v0=(Reference);
    sput-object v0, Lcom/kabam/plugin/AndroidPlugin;->sKeyboard:Lcom/kabam/keyboard/AndroidKeyboard;

    .line 89
    :cond_0
    sget-object v0, Lcom/kabam/plugin/AndroidPlugin;->sKeyboard:Lcom/kabam/keyboard/AndroidKeyboard;

    return-object v0
.end method

.method public static GetCents(Ljava/lang/String;)D
    .locals 2
    .parameter "productID"

    .prologue
    .line 135
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideJSONParser()Lcom/kabam/billing/AndroidJSONParser;

    invoke-static {}, Lcom/kabam/billing/AndroidJSONParser;->Instance()Lcom/kabam/billing/AndroidJSONParser;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 136
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideJSONParser()Lcom/kabam/billing/AndroidJSONParser;

    invoke-static {}, Lcom/kabam/billing/AndroidJSONParser;->Instance()Lcom/kabam/billing/AndroidJSONParser;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kabam/billing/AndroidJSONParser;->Cents(Ljava/lang/String;)D

    move-result-wide v0

    .line 138
    :goto_0
    #v0=(LongLo);v1=(LongHi);
    return-wide v0

    :cond_0
    #v0=(Reference);v1=(Uninit);
    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    goto :goto_0
.end method

.method public static GetCurrencySign(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .parameter "name"

    .prologue
    .line 77
    invoke-static {p0}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/Currency;->getSymbol()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static GetDeviceInfo(Landroid/app/Activity;)Ljava/lang/String;
    .locals 2
    .parameter "activity"

    .prologue
    .line 38
    new-instance v0, Lcom/kabam/deviceinformation/DeviceInformation;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/kabam/deviceinformation/DeviceInformation;-><init>(Landroid/app/Activity;)V

    .line 39
    .local v0, deviceInfo:Lcom/kabam/deviceinformation/DeviceInformation;
    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/deviceinformation/DeviceInformation;->getDeviceInformation()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    return-object v1
.end method

.method public static GetInputBoxText(Landroid/app/Activity;)Ljava/lang/String;
    .locals 1
    .parameter "activity"

    .prologue
    .line 106
    invoke-static {p0}, Lcom/kabam/plugin/AndroidPlugin;->GetAndroidKeyboard(Landroid/app/Activity;)Lcom/kabam/keyboard/AndroidKeyboard;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/keyboard/AndroidKeyboard;->AndroidGetInputBoxText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static GetNames(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .parameter "productID"

    .prologue
    .line 142
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideJSONParser()Lcom/kabam/billing/AndroidJSONParser;

    invoke-static {}, Lcom/kabam/billing/AndroidJSONParser;->Instance()Lcom/kabam/billing/AndroidJSONParser;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 143
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideJSONParser()Lcom/kabam/billing/AndroidJSONParser;

    invoke-static {}, Lcom/kabam/billing/AndroidJSONParser;->Instance()Lcom/kabam/billing/AndroidJSONParser;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kabam/billing/AndroidJSONParser;->Names(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 145
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public static HideInputBox(Landroid/app/Activity;)V
    .locals 1
    .parameter "activity"

    .prologue
    .line 102
    invoke-static {p0}, Lcom/kabam/plugin/AndroidPlugin;->GetAndroidKeyboard(Landroid/app/Activity;)Lcom/kabam/keyboard/AndroidKeyboard;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/keyboard/AndroidKeyboard;->AndroidHideInputBox()V

    .line 103
    return-void
.end method

.method public static InitMobileAppTracker(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V
    .locals 0
    .parameter "advertiserID"
    .parameter "key"
    .parameter "activity"

    .prologue
    .line 126
    return-void
.end method

.method public static PushNotification(Ljava/lang/String;Landroid/app/Activity;)V
    .locals 1
    .parameter "content"
    .parameter "activity"

    .prologue
    .line 118
    new-instance v0, Lcom/kabam/nitificationmanager/AndroidNotificationManager;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Lcom/kabam/nitificationmanager/AndroidNotificationManager;-><init>(Landroid/app/Activity;)V

    .line 119
    .local v0, manager:Lcom/kabam/nitificationmanager/AndroidNotificationManager;
    #v0=(Reference);
    invoke-virtual {v0, p0}, Lcom/kabam/nitificationmanager/AndroidNotificationManager;->ParseArray(Ljava/lang/String;)Ljava/util/List;

    .line 121
    return-void
.end method

.method public static SendMail(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V
    .locals 1
    .parameter "subject"
    .parameter "message"
    .parameter "activity"

    .prologue
    .line 33
    new-instance v0, Lcom/kabam/mail/MailSender;

    #v0=(UninitRef);
    invoke-direct {v0, p2}, Lcom/kabam/mail/MailSender;-><init>(Landroid/app/Activity;)V

    .line 34
    .local v0, sender:Lcom/kabam/mail/MailSender;
    #v0=(Reference);
    invoke-virtual {v0, p0, p1}, Lcom/kabam/mail/MailSender;->SendMail(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    return-void
.end method

.method public static SendMessage(Ljava/lang/String;Landroid/app/Activity;)V
    .locals 1
    .parameter "message"
    .parameter "activity"

    .prologue
    .line 28
    new-instance v0, Lcom/kabam/SMS/MessageSender;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Lcom/kabam/SMS/MessageSender;-><init>(Landroid/app/Activity;)V

    .line 29
    .local v0, sender:Lcom/kabam/SMS/MessageSender;
    #v0=(Reference);
    invoke-virtual {v0, p0}, Lcom/kabam/SMS/MessageSender;->SendMessage(Ljava/lang/String;)V

    .line 30
    return-void
.end method

.method public static SetInputBoxText(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1
    .parameter "activity"
    .parameter "text"

    .prologue
    .line 110
    invoke-static {p0}, Lcom/kabam/plugin/AndroidPlugin;->GetAndroidKeyboard(Landroid/app/Activity;)Lcom/kabam/keyboard/AndroidKeyboard;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/kabam/keyboard/AndroidKeyboard;->AndroidSetInputBoxText(Ljava/lang/String;)V

    .line 111
    return-void
.end method

.method public static SetTapJoyTVUID(Ljava/lang/String;)V
    .locals 1
    .parameter "TVUID"

    .prologue
    .line 165
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideTapJoy()Lcom/kabam/tapjoy/TapJoy;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kabam/tapjoy/TapJoy;->SetTVUID(Ljava/lang/String;)V

    .line 166
    return-void
.end method

.method public static ShowInputBoxAtx(Landroid/app/Activity;FFFFI)V
    .locals 1
    .parameter "activity"
    .parameter "x"
    .parameter "y"
    .parameter "width"
    .parameter "height"
    .parameter "inputGuid"

    .prologue
    .line 94
    invoke-static {p0}, Lcom/kabam/plugin/AndroidPlugin;->GetAndroidKeyboard(Landroid/app/Activity;)Lcom/kabam/keyboard/AndroidKeyboard;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/kabam/keyboard/AndroidKeyboard;->AndroidShowInputBoxAtx(FFFF)V

    .line 95
    return-void
.end method

.method public static ShowTapJoyOffers()V
    .locals 1

    .prologue
    .line 160
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideTapJoy()Lcom/kabam/tapjoy/TapJoy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/tapjoy/TapJoy;->ShowOffers()V

    .line 161
    return-void
.end method

.method public static TrackNanigansInstall(Ljava/lang/String;Landroid/app/Activity;)V
    .locals 3
    .parameter "id"
    .parameter "activity"

    .prologue
    .line 154
    const-string v0, "TrackInstall"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "android native Nanigans TrackNanigansInstall id="

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 155
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kabam/utility/Provider;->ProvideNanigans(Landroid/app/Activity;)Lcom/kabam/nanigans/Nanigans;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kabam/nanigans/Nanigans;->TrackInstall(Ljava/lang/String;)V

    .line 156
    return-void
.end method

.method public static showRateDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .parameter "activity"
    .parameter "title"
    .parameter "message"
    .parameter "rateNow"
    .parameter "rateLater"
    .parameter "noRate"
    .parameter "clientVer"
    .parameter "url"

    .prologue
    .line 45
    const-string v0, "rater"

    #v0=(Reference);
    const-string v1, "begin rater"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    invoke-static/range {p0 .. p7}, Lcom/kabam/rater/RateSender;->showRateDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    return-void
.end method


# virtual methods
.method public IsLoginFacebook()Z
    .locals 2

    .prologue
    .line 63
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/kabam/utility/Provider;->ProvideFacebookSender()Lcom/kabam/facebook/FacebookSender;

    move-result-object v0

    .line 64
    .local v0, facebookSender:Lcom/kabam/facebook/FacebookSender;
    #v0=(Reference);
    if-nez v0, :cond_0

    const/4 v1, 0x0

    .line 65
    :goto_0
    #v1=(Boolean);
    return v1

    :cond_0
    #v1=(Reference);
    invoke-virtual {v0}, Lcom/kabam/facebook/FacebookSender;->IsLoginFacebook()Z

    move-result v1

    #v1=(Boolean);
    goto :goto_0
.end method

.method public LoginFacebook()V
    .locals 2

    .prologue
    .line 50
    const/4 v0, 0x0

    .line 51
    .local v0, facebookSender:Lcom/kabam/facebook/FacebookSender;
    #v0=(Null);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/kabam/utility/Provider;->ProvideFacebookSender()Lcom/kabam/facebook/FacebookSender;

    move-result-object v0

    .line 52
    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/facebook/FacebookSender;->Login()Z

    .line 53
    return-void
.end method

.method public LoginoutFacebook()V
    .locals 2

    .prologue
    .line 56
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/kabam/utility/Provider;->ProvideFacebookSender()Lcom/kabam/facebook/FacebookSender;

    move-result-object v0

    .line 57
    .local v0, facebookSender:Lcom/kabam/facebook/FacebookSender;
    #v0=(Reference);
    if-nez v0, :cond_0

    .line 59
    :goto_0
    return-void

    .line 58
    :cond_0
    invoke-virtual {v0}, Lcom/kabam/facebook/FacebookSender;->LoginOut()Z

    goto :goto_0
.end method

.method public SendFacebookMessage(Ljava/lang/String;)V
    .locals 2
    .parameter "message"

    .prologue
    .line 69
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/kabam/utility/Provider;->ProvideFacebookSender()Lcom/kabam/facebook/FacebookSender;

    move-result-object v0

    .line 70
    .local v0, facebookSender:Lcom/kabam/facebook/FacebookSender;
    #v0=(Reference);
    if-nez v0, :cond_0

    .line 73
    :goto_0
    return-void

    .line 72
    :cond_0
    invoke-virtual {v0, p1}, Lcom/kabam/facebook/FacebookSender;->SendMessage(Ljava/lang/String;)V

    goto :goto_0
.end method

*/}
