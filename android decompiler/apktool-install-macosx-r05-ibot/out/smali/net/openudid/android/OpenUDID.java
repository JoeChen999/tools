package net.openudid.android; class OpenUDID {/*

.class public Lnet/openudid/android/OpenUDID;
.super Ljava/lang/Object;
.source "OpenUDID.java"


# static fields
.field private static final LOG:Z = false

.field public static final PREFS_NAME:Ljava/lang/String; = "openudid_prefs"

.field public static final PREF_KEY:Ljava/lang/String; = "openudid"

.field public static final TAG:Ljava/lang/String; = "OpenUDID"

.field private static final _UseBlueToothFailback:Z

.field private static final _UseImeiFailback:Z

.field private static _openUdid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method private static Md5(Ljava/lang/String;)Ljava/lang/String;
    .locals 9
    .parameter "input"

    .prologue
    .line 153
    const/4 v3, 0x0

    .line 155
    .local v3, m:Ljava/security/MessageDigest;
    :try_start_0
    #v3=(Null);
    const-string v6, "MD5"

    #v6=(Reference);
    invoke-static {v6}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 159
    :goto_0
    #v1=(Conflicted);v3=(Reference);v6=(Conflicted);
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v6

    #v6=(Reference);
    const/4 v7, 0x0

    #v7=(Null);
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v8

    #v8=(Integer);
    invoke-virtual {v3, v6, v7, v8}, Ljava/security/MessageDigest;->update([BII)V

    .line 160
    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v5

    .line 162
    .local v5, p_md5Data:[B
    #v5=(Reference);
    new-instance v4, Ljava/lang/String;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/lang/String;-><init>()V

    .line 163
    .local v4, mOutput:Ljava/lang/String;
    #v4=(Reference);
    const/4 v2, 0x0

    .local v2, i:I
    :goto_1
    #v0=(Conflicted);v2=(Integer);v7=(Reference);
    array-length v6, v5

    #v6=(Integer);
    if-lt v2, v6, :cond_0

    .line 171
    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v6

    #v6=(Reference);
    return-object v6

    .line 156
    .end local v2           #i:I
    .end local v4           #mOutput:Ljava/lang/String;
    .end local v5           #p_md5Data:[B
    :catch_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Conflicted);v7=(Uninit);v8=(Uninit);
    move-exception v1

    .line 157
    .local v1, e:Ljava/security/NoSuchAlgorithmException;
    #v1=(Reference);
    invoke-virtual {v1}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V

    goto :goto_0

    .line 164
    .end local v1           #e:Ljava/security/NoSuchAlgorithmException;
    .restart local v2       #i:I
    .restart local v4       #mOutput:Ljava/lang/String;
    .restart local v5       #p_md5Data:[B
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v3=(Reference);v4=(Reference);v5=(Reference);v6=(Integer);v7=(Reference);v8=(Integer);
    aget-byte v6, v5, v2

    #v6=(Byte);
    and-int/lit16 v0, v6, 0xff

    .line 166
    .local v0, b:I
    #v0=(Integer);
    const/16 v6, 0xf

    #v6=(PosByte);
    if-gt v0, v6, :cond_1

    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v6=(Reference);
    const-string v7, "0"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 168
    :cond_1
    #v6=(Conflicted);
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v6=(Reference);
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 163
    add-int/lit8 v2, v2, 0x1

    goto :goto_1
.end method

.method private static _debugLog(Ljava/lang/String;)V
    .locals 0
    .parameter "lmsg"

    .prologue
    .line 31
    return-void
.end method

.method private static generateBlueToothId()V
    .locals 4

    .prologue
    .line 126
    const/4 v0, 0x0

    .line 127
    .local v0, m_BluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;
    :try_start_0
    #v0=(Null);
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    .line 128
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getAddress()Ljava/lang/String;

    move-result-object v1

    .line 129
    .local v1, m_szBTMAC:Ljava/lang/String;
    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 130
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "BTMAC:"

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lnet/openudid/android/OpenUDID;->_openUdid:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    .end local v1           #m_szBTMAC:Ljava/lang/String;
    :cond_0
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    .line 132
    :catch_0
    move-exception v2

    #v2=(Reference);
    goto :goto_0
.end method

.method private static generateImeiId(Landroid/content/Context;)V
    .locals 4
    .parameter "mContext"

    .prologue
    .line 114
    :try_start_0
    const-string v2, "phone"

    #v2=(Reference);
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 115
    .local v0, TelephonyMgr:Landroid/telephony/TelephonyManager;
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v1

    .line 117
    .local v1, szImei:Ljava/lang/String;
    #v1=(Reference);
    if-eqz v1, :cond_0

    const/4 v2, 0x0

    #v2=(Null);
    const/4 v3, 0x3

    #v3=(PosByte);
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    const-string v3, "000"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    .line 118
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "IMEI:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lnet/openudid/android/OpenUDID;->_openUdid:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    .end local v0           #TelephonyMgr:Landroid/telephony/TelephonyManager;
    .end local v1           #szImei:Ljava/lang/String;
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    .line 120
    :catch_0
    move-exception v2

    #v2=(Reference);
    goto :goto_0
.end method

.method private static generateOpenUDIDInContext(Landroid/content/Context;)V
    .locals 3
    .parameter "mContext"

    .prologue
    .line 75
    invoke-static {p0}, Lnet/openudid/android/OpenUDID;->generateWifiId(Landroid/content/Context;)V

    .line 76
    sget-object v1, Lnet/openudid/android/OpenUDID;->_openUdid:Ljava/lang/String;

    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 109
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    .line 80
    :cond_0
    #v0=(Uninit);v2=(Uninit);
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v2, "android_id"

    #v2=(Reference);
    invoke-static {v1, v2}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 81
    .local v0, _androidId:Ljava/lang/String;
    #v0=(Reference);
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    #v1=(Integer);
    const/16 v2, 0xe

    #v2=(PosByte);
    if-le v1, v2, :cond_1

    const-string v1, "9774d56d682e549c"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_1

    .line 82
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "ANDROID:"

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lnet/openudid/android/OpenUDID;->_openUdid:Ljava/lang/String;

    goto :goto_0

    .line 102
    :cond_1
    #v1=(Conflicted);v2=(Conflicted);
    invoke-static {}, Lnet/openudid/android/OpenUDID;->generateRandomNumber()V

    .line 106
    sget-object v1, Lnet/openudid/android/OpenUDID;->_openUdid:Ljava/lang/String;

    #v1=(Reference);
    invoke-static {v1}, Lnet/openudid/android/OpenUDID;->_debugLog(Ljava/lang/String;)V

    .line 108
    const-string v1, "done"

    invoke-static {v1}, Lnet/openudid/android/OpenUDID;->_debugLog(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private static generateRandomNumber()V
    .locals 1

    .prologue
    .line 176
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/openudid/android/OpenUDID;->Md5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/openudid/android/OpenUDID;->_openUdid:Ljava/lang/String;

    .line 177
    return-void
.end method

.method private static generateSystemId()V
    .locals 6

    .prologue
    .line 184
    const-string v1, "%s/%s/%s/%s:%s/%s/%s:%s/%s/%d-%s-%s-%s-%s"

    #v1=(Reference);
    const/16 v2, 0xe

    #v2=(PosByte);
    new-array v2, v2, [Ljava/lang/Object;

    #v2=(Reference);
    const/4 v3, 0x0

    .line 185
    #v3=(Null);
    sget-object v4, Landroid/os/Build;->BRAND:Ljava/lang/String;

    #v4=(Reference);
    aput-object v4, v2, v3

    const/4 v3, 0x1

    .line 186
    #v3=(One);
    sget-object v4, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x2

    .line 187
    #v3=(PosByte);
    sget-object v4, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x3

    .line 188
    sget-object v4, Landroid/os/Build;->BOARD:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x4

    .line 189
    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x5

    .line 190
    sget-object v4, Landroid/os/Build;->ID:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x6

    .line 191
    sget-object v4, Landroid/os/Build$VERSION;->INCREMENTAL:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x7

    .line 192
    sget-object v4, Landroid/os/Build;->TYPE:Ljava/lang/String;

    aput-object v4, v2, v3

    const/16 v3, 0x8

    .line 193
    sget-object v4, Landroid/os/Build;->TAGS:Ljava/lang/String;

    aput-object v4, v2, v3

    const/16 v3, 0x9

    .line 194
    sget-wide v4, Landroid/os/Build;->TIME:J

    #v4=(LongLo);v5=(LongHi);
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    #v4=(Reference);
    aput-object v4, v2, v3

    const/16 v3, 0xa

    .line 195
    sget-object v4, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    aput-object v4, v2, v3

    const/16 v3, 0xb

    sget-object v4, Landroid/os/Build;->HOST:Ljava/lang/String;

    aput-object v4, v2, v3

    const/16 v3, 0xc

    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    aput-object v4, v2, v3

    const/16 v3, 0xd

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    aput-object v4, v2, v3

    .line 184
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 197
    .local v0, fp:Ljava/lang/String;
    #v0=(Reference);
    invoke-static {v0}, Lnet/openudid/android/OpenUDID;->_debugLog(Ljava/lang/String;)V

    .line 198
    if-eqz v0, :cond_0

    .line 199
    invoke-static {v0}, Lnet/openudid/android/OpenUDID;->Md5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lnet/openudid/android/OpenUDID;->_openUdid:Ljava/lang/String;

    .line 201
    :cond_0
    return-void
.end method

.method private static generateWifiId(Landroid/content/Context;)V
    .locals 7
    .parameter "mContext"

    .prologue
    .line 138
    :try_start_0
    const-string v3, "wifi"

    #v3=(Reference);
    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/net/wifi/WifiManager;

    .line 139
    .local v2, wifiMan:Landroid/net/wifi/WifiManager;
    invoke-virtual {v2}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v1

    .line 141
    .local v1, wifiInf:Landroid/net/wifi/WifiInfo;
    #v1=(Reference);
    const-string v3, "%s"

    const/4 v4, 0x1

    #v4=(One);
    new-array v4, v4, [Ljava/lang/Object;

    #v4=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;

    move-result-object v6

    #v6=(Reference);
    aput-object v6, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lnet/openudid/android/OpenUDID;->_debugLog(Ljava/lang/String;)V

    .line 143
    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;

    move-result-object v0

    .line 144
    .local v0, macAddr:Ljava/lang/String;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 145
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    const-string v4, "WIFIMAC:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lnet/openudid/android/OpenUDID;->_openUdid:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 150
    .end local v0           #macAddr:Ljava/lang/String;
    .end local v1           #wifiInf:Landroid/net/wifi/WifiInfo;
    .end local v2           #wifiMan:Landroid/net/wifi/WifiManager;
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-void

    .line 147
    :catch_0
    move-exception v3

    #v3=(Reference);
    goto :goto_0
.end method

.method public static getCorpUDID(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .parameter "corpIdentifier"

    .prologue
    .line 66
    const-string v0, "%s.%s"

    #v0=(Reference);
    const/4 v1, 0x2

    #v1=(PosByte);
    new-array v1, v1, [Ljava/lang/Object;

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    aput-object p0, v1, v2

    const/4 v2, 0x1

    #v2=(One);
    invoke-static {}, Lnet/openudid/android/OpenUDID;->getOpenUDIDInContext()Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 65
    invoke-static {v0}, Lnet/openudid/android/OpenUDID;->Md5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getOpenUDIDInContext()Ljava/lang/String;
    .locals 1

    .prologue
    .line 61
    sget-object v0, Lnet/openudid/android/OpenUDID;->_openUdid:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public static syncContext(Landroid/content/Context;)V
    .locals 6
    .parameter "mContext"

    .prologue
    .line 38
    sget-object v4, Lnet/openudid/android/OpenUDID;->_openUdid:Ljava/lang/String;

    #v4=(Reference);
    if-nez v4, :cond_0

    .line 39
    const/4 v3, 0x0

    .line 41
    .local v3, openContext:Landroid/content/Context;
    :try_start_0
    #v3=(Null);
    const-string v4, "net.openudid.android"

    const/4 v5, 0x2

    #v5=(PosByte);
    invoke-virtual {p0, v4, v5}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 42
    #v3=(Reference);
    move-object p0, v3

    .line 47
    :goto_0
    #v5=(Conflicted);
    const-string v4, "openudid_prefs"

    const/4 v5, 0x1

    #v5=(One);
    invoke-virtual {p0, v4, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 48
    .local v2, mPreferences:Landroid/content/SharedPreferences;
    #v2=(Reference);
    const-string v4, "openudid"

    const/4 v5, 0x0

    #v5=(Null);
    invoke-interface {v2, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 49
    .local v0, _keyInPref:Ljava/lang/String;
    #v0=(Reference);
    if-nez v0, :cond_1

    .line 50
    invoke-static {p0}, Lnet/openudid/android/OpenUDID;->generateOpenUDIDInContext(Landroid/content/Context;)V

    .line 51
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 52
    .local v1, e:Landroid/content/SharedPreferences$Editor;
    #v1=(Reference);
    const-string v4, "openudid"

    sget-object v5, Lnet/openudid/android/OpenUDID;->_openUdid:Ljava/lang/String;

    #v5=(Reference);
    invoke-interface {v1, v4, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 53
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 58
    .end local v0           #_keyInPref:Ljava/lang/String;
    .end local v1           #e:Landroid/content/SharedPreferences$Editor;
    .end local v2           #mPreferences:Landroid/content/SharedPreferences;
    .end local v3           #openContext:Landroid/content/Context;
    :cond_0
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
    return-void

    .line 55
    .restart local v0       #_keyInPref:Ljava/lang/String;
    .restart local v2       #mPreferences:Landroid/content/SharedPreferences;
    .restart local v3       #openContext:Landroid/content/Context;
    :cond_1
    #v0=(Reference);v1=(Uninit);v2=(Reference);v3=(Reference);v5=(Null);
    sput-object v0, Lnet/openudid/android/OpenUDID;->_openUdid:Ljava/lang/String;

    goto :goto_1

    .line 43
    .end local v0           #_keyInPref:Ljava/lang/String;
    .end local v2           #mPreferences:Landroid/content/SharedPreferences;
    :catch_0
    #v0=(Uninit);v2=(Uninit);v3=(Null);v5=(Conflicted);
    move-exception v4

    goto :goto_0
.end method

*/}
