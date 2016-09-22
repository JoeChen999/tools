package com.kabam.track; class TrackMobileInformation {/*

.class public Lcom/kabam/track/TrackMobileInformation;
.super Ljava/lang/Object;
.source "TrackMobileInformation.java"


# instance fields
.field private mActivity:Landroid/app/Activity;

.field private mAddress:Ljava/lang/String;

.field private mMac:Ljava/lang/String;

.field private mManufactor:Ljava/lang/String;

.field private mModal:Ljava/lang/String;

.field private mOSVersion:Ljava/lang/String;

.field private mURLAddress:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1
    .parameter "activity"

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/kabam/track/TrackMobileInformation;->mActivity:Landroid/app/Activity;

    .line 20
    const-string v0, ""

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/track/TrackMobileInformation;->mMac:Ljava/lang/String;

    .line 21
    const-string v0, ""

    iput-object v0, p0, Lcom/kabam/track/TrackMobileInformation;->mManufactor:Ljava/lang/String;

    .line 22
    const-string v0, ""

    iput-object v0, p0, Lcom/kabam/track/TrackMobileInformation;->mModal:Ljava/lang/String;

    .line 23
    const-string v0, ""

    iput-object v0, p0, Lcom/kabam/track/TrackMobileInformation;->mOSVersion:Ljava/lang/String;

    .line 54
    const-string v0, ""

    iput-object v0, p0, Lcom/kabam/track/TrackMobileInformation;->mURLAddress:Ljava/lang/String;

    .line 55
    const-string v0, ""

    iput-object v0, p0, Lcom/kabam/track/TrackMobileInformation;->mAddress:Ljava/lang/String;

    .line 27
    iput-object p1, p0, Lcom/kabam/track/TrackMobileInformation;->mActivity:Landroid/app/Activity;

    .line 28
    invoke-direct {p0}, Lcom/kabam/track/TrackMobileInformation;->GetAll()V

    .line 29
    const-string v0, "http://www.hobbitmobile.com/ajax/playerDeviceLog.php?"

    iput-object v0, p0, Lcom/kabam/track/TrackMobileInformation;->mURLAddress:Ljava/lang/String;

    .line 30
    return-void
.end method

.method private AddString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .parameter "name"
    .parameter "value"

    .prologue
    .line 58
    const-string v0, ""

    #v0=(Reference);
    if-eq p1, v0, :cond_0

    const-string v0, ""

    if-ne p2, v0, :cond_1

    :cond_0
    const-string v0, ""

    .line 63
    :goto_0
    #v1=(Conflicted);
    return-object v0

    .line 59
    :cond_1
    #v1=(Uninit);
    iget-object v0, p0, Lcom/kabam/track/TrackMobileInformation;->mAddress:Ljava/lang/String;

    const-string v1, ""

    #v1=(Reference);
    if-ne v0, v1, :cond_2

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kabam/track/TrackMobileInformation;->mAddress:Ljava/lang/String;

    .line 63
    :goto_1
    iget-object v0, p0, Lcom/kabam/track/TrackMobileInformation;->mAddress:Ljava/lang/String;

    goto :goto_0

    .line 62
    :cond_2
    iget-object v0, p0, Lcom/kabam/track/TrackMobileInformation;->mAddress:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    const-string v0, "&"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kabam/track/TrackMobileInformation;->mAddress:Ljava/lang/String;

    goto :goto_1
.end method

.method private GetAll()V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/kabam/track/TrackMobileInformation;->GetMacAddress()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/track/TrackMobileInformation;->mMac:Ljava/lang/String;

    .line 35
    invoke-direct {p0}, Lcom/kabam/track/TrackMobileInformation;->GetManufactor()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kabam/track/TrackMobileInformation;->mManufactor:Ljava/lang/String;

    .line 36
    invoke-direct {p0}, Lcom/kabam/track/TrackMobileInformation;->GetModal()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kabam/track/TrackMobileInformation;->mModal:Ljava/lang/String;

    .line 37
    invoke-direct {p0}, Lcom/kabam/track/TrackMobileInformation;->GetOSVersion()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kabam/track/TrackMobileInformation;->mOSVersion:Ljava/lang/String;

    .line 38
    return-void
.end method

.method private GetMacAddress()Ljava/lang/String;
    .locals 7

    .prologue
    .line 113
    const-string v1, ""

    .line 117
    .local v1, mac:Ljava/lang/String;
    :try_start_0
    #v1=(Reference);
    iget-object v4, p0, Lcom/kabam/track/TrackMobileInformation;->mActivity:Landroid/app/Activity;

    #v4=(Reference);
    const-string v5, "wifi"

    #v5=(Reference);
    invoke-virtual {v4, v5}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/net/wifi/WifiManager;

    .line 118
    .local v3, wifiMan:Landroid/net/wifi/WifiManager;
    invoke-virtual {v3}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v2

    .line 119
    .local v2, wifiInf:Landroid/net/wifi/WifiInfo;
    #v2=(Reference);
    invoke-virtual {v2}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;

    move-result-object v1

    .line 121
    const-string v4, "mac"

    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    const-string v6, "get mac from vifi mac ="

    #v6=(Reference);
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    .end local v2           #wifiInf:Landroid/net/wifi/WifiInfo;
    .end local v3           #wifiMan:Landroid/net/wifi/WifiManager;
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-object v1

    .line 124
    :catch_0
    #v0=(Uninit);
    move-exception v0

    .line 127
    .local v0, e:Ljava/lang/Exception;
    :try_start_1
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .end local v0           #e:Ljava/lang/Exception;
    :catchall_0
    #v0=(Conflicted);
    move-exception v4

    #v4=(Reference);
    goto :goto_0
.end method

.method private GetManufactor()Ljava/lang/String;
    .locals 1

    .prologue
    .line 99
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method private GetModal()Ljava/lang/String;
    .locals 1

    .prologue
    .line 103
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method private GetOSVersion()Ljava/lang/String;
    .locals 1

    .prologue
    .line 107
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method private MakeURL(Ljava/lang/String;)V
    .locals 2
    .parameter "event"

    .prologue
    .line 42
    const-string v0, "mac"

    #v0=(Reference);
    iget-object v1, p0, Lcom/kabam/track/TrackMobileInformation;->mMac:Ljava/lang/String;

    #v1=(Reference);
    invoke-direct {p0, v0, v1}, Lcom/kabam/track/TrackMobileInformation;->AddString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    const-string v0, "manufactor"

    iget-object v1, p0, Lcom/kabam/track/TrackMobileInformation;->mManufactor:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/kabam/track/TrackMobileInformation;->AddString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    const-string v0, "modal"

    iget-object v1, p0, Lcom/kabam/track/TrackMobileInformation;->mModal:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/kabam/track/TrackMobileInformation;->AddString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    const-string v0, "osversion"

    iget-object v1, p0, Lcom/kabam/track/TrackMobileInformation;->mOSVersion:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/kabam/track/TrackMobileInformation;->AddString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    const-string v0, "event"

    invoke-direct {p0, v0, p1}, Lcom/kabam/track/TrackMobileInformation;->AddString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    iget-object v0, p0, Lcom/kabam/track/TrackMobileInformation;->mURLAddress:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    iget-object v0, p0, Lcom/kabam/track/TrackMobileInformation;->mURLAddress:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/kabam/track/TrackMobileInformation;->mAddress:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kabam/track/TrackMobileInformation;->mURLAddress:Ljava/lang/String;

    .line 48
    return-void
.end method

.method private Track(Ljava/lang/String;)V
    .locals 2
    .parameter "event"

    .prologue
    .line 69
    invoke-direct {p0}, Lcom/kabam/track/TrackMobileInformation;->GetAll()V

    .line 70
    invoke-direct {p0, p1}, Lcom/kabam/track/TrackMobileInformation;->MakeURL(Ljava/lang/String;)V

    .line 71
    iget-object v0, p0, Lcom/kabam/track/TrackMobileInformation;->mURLAddress:Ljava/lang/String;

    #v0=(Reference);
    invoke-direct {p0, v0}, Lcom/kabam/track/TrackMobileInformation;->URLEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kabam/track/TrackMobileInformation;->mURLAddress:Ljava/lang/String;

    .line 72
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    iget-object v1, p0, Lcom/kabam/track/TrackMobileInformation;->mURLAddress:Ljava/lang/String;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/kabam/utility/Provider;->ProvideSend(Ljava/lang/String;)V

    .line 73
    return-void
.end method

.method private URLEncode(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .parameter "input"

    .prologue
    .line 51
    invoke-static {p1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public TrackFTEFinish()V
    .locals 1

    .prologue
    .line 88
    const-string v0, "FTEFinish"

    .line 89
    .local v0, event:Ljava/lang/String;
    #v0=(Reference);
    invoke-direct {p0, v0}, Lcom/kabam/track/TrackMobileInformation;->Track(Ljava/lang/String;)V

    .line 90
    return-void
.end method

.method public TrackFirstLogin()V
    .locals 2

    .prologue
    .line 78
    :try_start_0
    const-string v0, "FirstLogin"

    .line 79
    .local v0, event:Ljava/lang/String;
    #v0=(Reference);
    invoke-direct {p0, v0}, Lcom/kabam/track/TrackMobileInformation;->Track(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    .end local v0           #event:Ljava/lang/String;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    .line 81
    :catch_0
    move-exception v1

    #v1=(Reference);
    goto :goto_0
.end method

.method public TrackFirstReceiveChat()V
    .locals 1

    .prologue
    .line 93
    const-string v0, "FirstReceiveChat"

    .line 94
    .local v0, event:Ljava/lang/String;
    #v0=(Reference);
    invoke-direct {p0, v0}, Lcom/kabam/track/TrackMobileInformation;->Track(Ljava/lang/String;)V

    .line 95
    return-void
.end method

*/}
