package com.kabam.deviceinformation; class DeviceInformation {/*

.class public Lcom/kabam/deviceinformation/DeviceInformation;
.super Ljava/lang/Object;
.source "DeviceInformation.java"


# instance fields
.field private mActivity:Landroid/app/Activity;

.field private mInformation:Lorg/json/JSONObject;

.field private mPreference:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 2
    .parameter "activity"

    .prologue
    const/4 v0, 0x0

    .line 34
    #v0=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    #p0=(Reference);
    iput-object v0, p0, Lcom/kabam/deviceinformation/DeviceInformation;->mActivity:Landroid/app/Activity;

    .line 31
    iput-object v0, p0, Lcom/kabam/deviceinformation/DeviceInformation;->mPreference:Landroid/content/SharedPreferences;

    .line 32
    iput-object v0, p0, Lcom/kabam/deviceinformation/DeviceInformation;->mInformation:Lorg/json/JSONObject;

    .line 36
    iput-object p1, p0, Lcom/kabam/deviceinformation/DeviceInformation;->mActivity:Landroid/app/Activity;

    .line 37
    iget-object v0, p0, Lcom/kabam/deviceinformation/DeviceInformation;->mActivity:Landroid/app/Activity;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/app/Activity;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/kabam/deviceinformation/DeviceInformation;->mPreference:Landroid/content/SharedPreferences;

    .line 38
    new-instance v0, Lorg/json/JSONObject;

    #v0=(UninitRef);
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/deviceinformation/DeviceInformation;->mInformation:Lorg/json/JSONObject;

    .line 39
    return-void
.end method

.method private Record(Ljava/lang/String;I)V
    .locals 2
    .parameter "key"
    .parameter "value"

    .prologue
    .line 282
    :try_start_0
    iget-object v1, p0, Lcom/kabam/deviceinformation/DeviceInformation;->mInformation:Lorg/json/JSONObject;

    #v1=(Reference);
    invoke-virtual {v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 288
    :goto_0
    #v0=(Conflicted);
    return-void

    .line 284
    :catch_0
    move-exception v0

    .line 286
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private Record(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .parameter "key"
    .parameter "value"

    .prologue
    const/4 v1, 0x1

    #v1=(One);
    const/4 v2, 0x0

    .line 261
    :try_start_0
    #v2=(Null);
    const-string v3, "key"

    #v3=(Reference);
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    const-string v5, "key = "

    #v5=(Reference);
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " value = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 262
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    if-ne v3, v4, :cond_1

    .line 263
    :cond_0
    sget-object p2, Lcom/kabam/utility/constance/Constance;->Default:Ljava/lang/String;

    .line 265
    :cond_1
    const-string v3, "key"

    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    const-string v5, "key = "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " value = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 267
    const-string v4, "key"

    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    const-string v3, "value == null"

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    const-string v3, ""

    if-ne p2, v3, :cond_2

    move v3, v1

    :goto_0
    #v3=(Boolean);
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    #v3=(Reference);
    const-string v5, " value = kong "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    #v6=(Reference);
    if-ne v5, v6, :cond_3

    :goto_1
    #v1=(Boolean);
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 268
    iget-object v1, p0, Lcom/kabam/deviceinformation/DeviceInformation;->mInformation:Lorg/json/JSONObject;

    invoke-virtual {v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 274
    :goto_2
    #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-void

    :cond_2
    #v0=(Uninit);v1=(One);v3=(Reference);v4=(Reference);v5=(Reference);v6=(Uninit);
    move v3, v2

    .line 267
    #v3=(Null);
    goto :goto_0

    :cond_3
    #v3=(Reference);v6=(Reference);
    move v1, v2

    #v1=(Null);
    goto :goto_1

    .line 270
    :catch_0
    #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    move-exception v0

    .line 272
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_2
.end method

.method private getCarrierName()V
    .locals 5

    .prologue
    .line 191
    :try_start_0
    iget-object v3, p0, Lcom/kabam/deviceinformation/DeviceInformation;->mActivity:Landroid/app/Activity;

    #v3=(Reference);
    const-string v4, "phone"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/telephony/TelephonyManager;

    .line 192
    .local v2, manager:Landroid/telephony/TelephonyManager;
    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v0

    .line 193
    .local v0, carrierName:Ljava/lang/String;
    #v0=(Reference);
    sget-object v3, Lcom/kabam/utility/constance/Constance;->CarrierNameKey:Ljava/lang/String;

    invoke-direct {p0, v3, v0}, Lcom/kabam/deviceinformation/DeviceInformation;->Record(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 199
    .end local v0           #carrierName:Ljava/lang/String;
    .end local v2           #manager:Landroid/telephony/TelephonyManager;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
    return-void

    .line 195
    :catch_0
    move-exception v1

    .line 197
    .local v1, ex:Ljava/lang/Exception;
    #v1=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3, v1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private getMCC()V
    .locals 4

    .prologue
    .line 217
    :try_start_0
    iget-object v3, p0, Lcom/kabam/deviceinformation/DeviceInformation;->mActivity:Landroid/app/Activity;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 218
    .local v0, config:Landroid/content/res/Configuration;
    #v0=(Reference);
    iget v2, v0, Landroid/content/res/Configuration;->mcc:I

    .line 219
    .local v2, mcc:I
    #v2=(Integer);
    sget-object v3, Lcom/kabam/utility/constance/Constance;->MCCKey:Ljava/lang/String;

    invoke-direct {p0, v3, v2}, Lcom/kabam/deviceinformation/DeviceInformation;->Record(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 225
    .end local v0           #config:Landroid/content/res/Configuration;
    .end local v2           #mcc:I
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    .line 221
    :catch_0
    move-exception v1

    .line 223
    .local v1, ex:Ljava/lang/Exception;
    #v1=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3, v1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private getMNC()V
    .locals 4

    .prologue
    .line 204
    :try_start_0
    iget-object v3, p0, Lcom/kabam/deviceinformation/DeviceInformation;->mActivity:Landroid/app/Activity;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 205
    .local v0, config:Landroid/content/res/Configuration;
    #v0=(Reference);
    iget v2, v0, Landroid/content/res/Configuration;->mnc:I

    .line 206
    .local v2, mnc:I
    #v2=(Integer);
    sget-object v3, Lcom/kabam/utility/constance/Constance;->MNCKey:Ljava/lang/String;

    invoke-direct {p0, v3, v2}, Lcom/kabam/deviceinformation/DeviceInformation;->Record(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 212
    .end local v0           #config:Landroid/content/res/Configuration;
    .end local v2           #mnc:I
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    .line 208
    :catch_0
    move-exception v1

    .line 210
    .local v1, ex:Ljava/lang/Exception;
    #v1=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3, v1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private getMacAddress()V
    .locals 8

    .prologue
    .line 67
    const/4 v2, 0x0

    .line 71
    .local v2, mac:Ljava/lang/String;
    :try_start_0
    #v2=(Null);
    const-string v5, "/sys/class/net/eth0/address"

    #v5=(Reference);
    invoke-static {v5}, Lcom/kabam/deviceinformation/DeviceInformation;->loadFileAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    #v6=(Null);
    const/16 v7, 0x11

    #v7=(PosByte);
    invoke-virtual {v5, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 72
    #v2=(Reference);
    const-string v5, "mac"

    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    const-string v7, "get mac from log mac ="

    #v7=(Reference);
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v6=(Reference);
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    sget-object v5, Lcom/kabam/utility/constance/Constance;->MacAddressKey:Ljava/lang/String;

    invoke-direct {p0, v5, v2}, Lcom/kabam/deviceinformation/DeviceInformation;->Record(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    if-nez v2, :cond_0

    const-string v2, "null"

    .line 101
    :cond_0
    const-string v5, "mac"

    #v5=(Reference);
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    const-string v7, "mac address = "

    #v7=(Reference);
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v6=(Reference);
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    return-void

    .line 75
    :catch_0
    #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move-exception v1

    .line 78
    .local v1, ex:Ljava/lang/Exception;
    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 83
    :try_start_1
    iget-object v5, p0, Lcom/kabam/deviceinformation/DeviceInformation;->mActivity:Landroid/app/Activity;

    #v5=(Reference);
    const-string v6, "wifi"

    #v6=(Reference);
    invoke-virtual {v5, v6}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    #v4=(Reference);
    check-cast v4, Landroid/net/wifi/WifiManager;

    .line 84
    .local v4, wifiMan:Landroid/net/wifi/WifiManager;
    invoke-virtual {v4}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v3

    .line 85
    .local v3, wifiInf:Landroid/net/wifi/WifiInfo;
    #v3=(Reference);
    invoke-virtual {v3}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;

    move-result-object v2

    .line 87
    const-string v5, "mac"

    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    const-string v7, "get mac from vifi mac ="

    #v7=(Reference);
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v6=(Reference);
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    sget-object v5, Lcom/kabam/utility/constance/Constance;->MacAddressKey:Ljava/lang/String;

    invoke-direct {p0, v5, v2}, Lcom/kabam/deviceinformation/DeviceInformation;->Record(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 90
    .end local v3           #wifiInf:Landroid/net/wifi/WifiInfo;
    .end local v4           #wifiMan:Landroid/net/wifi/WifiManager;
    :catch_1
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move-exception v0

    .line 94
    .local v0, e:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method private getMacAll()V
    .locals 0

    .prologue
    .line 115
    return-void
.end method

.method private getManufactor()V
    .locals 3

    .prologue
    .line 120
    :try_start_0
    sget-object v1, Lcom/kabam/utility/constance/Constance;->ManufactorKey:Ljava/lang/String;

    #v1=(Reference);
    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    #v2=(Reference);
    invoke-direct {p0, v1, v2}, Lcom/kabam/deviceinformation/DeviceInformation;->Record(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 126
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    .line 122
    :catch_0
    move-exception v0

    .line 124
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private getModel()V
    .locals 3

    .prologue
    .line 131
    :try_start_0
    sget-object v1, Lcom/kabam/utility/constance/Constance;->ModalKey:Ljava/lang/String;

    #v1=(Reference);
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    #v2=(Reference);
    invoke-direct {p0, v1, v2}, Lcom/kabam/deviceinformation/DeviceInformation;->Record(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    .line 133
    :catch_0
    move-exception v0

    .line 135
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private getOSName()V
    .locals 3

    .prologue
    .line 142
    :try_start_0
    const-string v2, "os.name"

    #v2=(Reference);
    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 143
    .local v1, name:Ljava/lang/String;
    #v1=(Reference);
    sget-object v2, Lcom/kabam/utility/constance/Constance;->OSNameKey:Ljava/lang/String;

    invoke-direct {p0, v2, v1}, Lcom/kabam/deviceinformation/DeviceInformation;->Record(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 150
    .end local v1           #name:Ljava/lang/String;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    .line 145
    :catch_0
    move-exception v0

    .line 147
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private getOSVersion()V
    .locals 3

    .prologue
    .line 155
    :try_start_0
    sget-object v1, Lcom/kabam/utility/constance/Constance;->OSVersionKey:Ljava/lang/String;

    #v1=(Reference);
    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    #v2=(Reference);
    invoke-direct {p0, v1, v2}, Lcom/kabam/deviceinformation/DeviceInformation;->Record(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    .line 157
    :catch_0
    move-exception v0

    .line 159
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private getOpenUDID()V
    .locals 4

    .prologue
    .line 231
    :try_start_0
    invoke-static {}, Lcom/kabam/openudid/Openudid;->Instance()Lcom/kabam/openudid/Openudid;

    move-result-object v2

    .line 232
    .local v2, udid:Lcom/kabam/openudid/Openudid;
    #v2=(Reference);
    iget-object v3, p0, Lcom/kabam/deviceinformation/DeviceInformation;->mActivity:Landroid/app/Activity;

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lcom/kabam/openudid/Openudid;->GetUDID(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 233
    .local v0, UDID:Ljava/lang/String;
    #v0=(Reference);
    sget-object v3, Lcom/kabam/utility/constance/Constance;->OpenUDID:Ljava/lang/String;

    invoke-direct {p0, v3, v0}, Lcom/kabam/deviceinformation/DeviceInformation;->Record(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 239
    .end local v0           #UDID:Ljava/lang/String;
    .end local v2           #udid:Lcom/kabam/openudid/Openudid;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    .line 235
    :catch_0
    move-exception v1

    .line 237
    .local v1, ex:Ljava/lang/Exception;
    #v1=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3, v1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private getSystemLanguage()V
    .locals 3

    .prologue
    .line 166
    :try_start_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/util/Locale;->getDisplayLanguage()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 173
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    .line 169
    :catch_0
    move-exception v0

    .line 171
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private getSystemLanguageISOCode()V
    .locals 3

    .prologue
    .line 178
    :try_start_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 179
    .local v1, language:Ljava/lang/String;
    #v1=(Reference);
    sget-object v2, Lcom/kabam/utility/constance/Constance;->SystemLanguageKey:Ljava/lang/String;

    invoke-direct {p0, v2, v1}, Lcom/kabam/deviceinformation/DeviceInformation;->Record(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 185
    .end local v1           #language:Ljava/lang/String;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    .line 181
    :catch_0
    move-exception v0

    .line 183
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private getUDID()V
    .locals 4

    .prologue
    .line 244
    :try_start_0
    iget-object v2, p0, Lcom/kabam/deviceinformation/DeviceInformation;->mActivity:Landroid/app/Activity;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    const-string v3, "android_id"

    #v3=(Reference);
    invoke-static {v2, v3}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 245
    .local v0, androidID:Ljava/lang/String;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kabam/utility/Provider;->ProvideTapJoy()Lcom/kabam/tapjoy/TapJoy;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/kabam/tapjoy/TapJoy;->SetAndroidID(Ljava/lang/String;)V

    .line 246
    sget-object v2, Lcom/kabam/utility/constance/Constance;->UDID:Ljava/lang/String;

    invoke-direct {p0, v2, v0}, Lcom/kabam/deviceinformation/DeviceInformation;->Record(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 252
    .end local v0           #androidID:Ljava/lang/String;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
    return-void

    .line 248
    :catch_0
    move-exception v1

    .line 250
    .local v1, ex:Ljava/lang/Exception;
    #v1=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2, v1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private static loadFileAsString(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .parameter "filePath"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 293
    new-instance v1, Ljava/lang/StringBuffer;

    #v1=(UninitRef);
    const/16 v5, 0x3e8

    #v5=(PosShort);
    invoke-direct {v1, v5}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 294
    .local v1, fileData:Ljava/lang/StringBuffer;
    #v1=(Reference);
    new-instance v4, Ljava/io/BufferedReader;

    #v4=(UninitRef);
    new-instance v5, Ljava/io/FileReader;

    #v5=(UninitRef);
    invoke-direct {v5, p0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    invoke-direct {v4, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 295
    .local v4, reader:Ljava/io/BufferedReader;
    #v4=(Reference);
    const/16 v5, 0x400

    #v5=(PosShort);
    new-array v0, v5, [C

    .line 296
    .local v0, buf:[C
    #v0=(Reference);
    const/4 v2, 0x0

    .line 297
    .local v2, numRead:I
    :goto_0
    #v2=(Integer);v3=(Conflicted);
    invoke-virtual {v4, v0}, Ljava/io/BufferedReader;->read([C)I

    move-result v2

    const/4 v5, -0x1

    #v5=(Byte);
    if-ne v2, v5, :cond_0

    .line 302
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V

    .line 303
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    return-object v5

    .line 299
    :cond_0
    #v5=(Byte);
    const/4 v5, 0x0

    #v5=(Null);
    invoke-static {v0, v5, v2}, Ljava/lang/String;->valueOf([CII)Ljava/lang/String;

    move-result-object v3

    .line 300
    .local v3, readData:Ljava/lang/String;
    #v3=(Reference);
    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0
.end method


# virtual methods
.method public getDeviceInformation()Ljava/lang/String;
    .locals 3

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/kabam/deviceinformation/DeviceInformation;->getMacAddress()V

    .line 44
    invoke-direct {p0}, Lcom/kabam/deviceinformation/DeviceInformation;->getMacAll()V

    .line 45
    invoke-direct {p0}, Lcom/kabam/deviceinformation/DeviceInformation;->getManufactor()V

    .line 46
    invoke-direct {p0}, Lcom/kabam/deviceinformation/DeviceInformation;->getModel()V

    .line 47
    invoke-direct {p0}, Lcom/kabam/deviceinformation/DeviceInformation;->getOSName()V

    .line 48
    invoke-direct {p0}, Lcom/kabam/deviceinformation/DeviceInformation;->getOSVersion()V

    .line 49
    invoke-direct {p0}, Lcom/kabam/deviceinformation/DeviceInformation;->getSystemLanguage()V

    .line 50
    invoke-direct {p0}, Lcom/kabam/deviceinformation/DeviceInformation;->getSystemLanguageISOCode()V

    .line 51
    invoke-direct {p0}, Lcom/kabam/deviceinformation/DeviceInformation;->getCarrierName()V

    .line 52
    invoke-direct {p0}, Lcom/kabam/deviceinformation/DeviceInformation;->getMNC()V

    .line 53
    invoke-direct {p0}, Lcom/kabam/deviceinformation/DeviceInformation;->getMCC()V

    .line 54
    invoke-direct {p0}, Lcom/kabam/deviceinformation/DeviceInformation;->getOpenUDID()V

    .line 55
    invoke-direct {p0}, Lcom/kabam/deviceinformation/DeviceInformation;->getUDID()V

    .line 57
    const-string v0, "getDeviceInformation"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "ming"

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    iget-object v2, p0, Lcom/kabam/deviceinformation/DeviceInformation;->mInformation:Lorg/json/JSONObject;

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 58
    iget-object v0, p0, Lcom/kabam/deviceinformation/DeviceInformation;->mInformation:Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    .line 59
    iget-object v0, p0, Lcom/kabam/deviceinformation/DeviceInformation;->mInformation:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    .line 61
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

*/}
