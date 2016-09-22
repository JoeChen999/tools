package com.chartboost.sdk; class CBUtility {/*

.class public Lcom/chartboost/sdk/CBUtility;
.super Ljava/lang/Object;
.source "CBUtility.java"


# static fields
.field private static ANDROID_AUID:Ljava/lang/String; = null

.field public static final ANDROID_AUID_COOKIE_FLAG:I = 0x1

.field public static final ANDROID_AUID_COOKIE_KEY:Ljava/lang/String; = "cb_auid"

.field public static final ANDROID_AUID_COOKIE_PREFIX:Ljava/lang/String; = "android-"

.field public static final AUID_STATIC_EMULATOR:Ljava/lang/String; = "ffff"

.field public static final AUID_STATIC_ERROR:Ljava/lang/String; = "unknown"

.field public static final PREFERENCES_FILE:Ljava/lang/String; = "ChartBoost.cb"

.field public static final PREFERENCES_SDCARD_PATH:Ljava/lang/String; = "/Android/data/com.chartboost.sdk/files"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 58
    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/chartboost/sdk/CBUtility;->ANDROID_AUID:Ljava/lang/String;

    .line 18
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static getAUID(Landroid/content/Context;)Ljava/lang/String;
    .locals 14
    .parameter "ctx"

    .prologue
    .line 70
    sget-object v11, Lcom/chartboost/sdk/CBUtility;->ANDROID_AUID:Ljava/lang/String;

    #v11=(Reference);
    if-eqz v11, :cond_0

    .line 71
    sget-object v1, Lcom/chartboost/sdk/CBUtility;->ANDROID_AUID:Ljava/lang/String;

    .line 218
    :goto_0
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    return-object v1

    .line 74
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Reference);v12=(Uninit);v13=(Uninit);
    const/4 v1, 0x0

    .line 75
    .local v1, cookie:Ljava/lang/String;
    #v1=(Null);
    const/4 v3, 0x0

    .line 76
    .local v3, cookiePath:Ljava/io/File;
    #v3=(Null);
    const/4 v5, 0x1

    .line 79
    .local v5, doBackup:Z
    #v5=(One);
    const-string v11, "ChartBoost.cb"

    .line 80
    const/4 v12, 0x1

    .line 79
    #v12=(One);
    invoke-virtual {p0, v11, v12}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v9

    .line 82
    .local v9, preferences:Landroid/content/SharedPreferences;
    #v9=(Reference);
    const-string v11, "cb_auid"

    const/4 v12, 0x0

    #v12=(Null);
    invoke-interface {v9, v11, v12}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 83
    .local v10, value:Ljava/lang/String;
    #v10=(Reference);
    if-eqz v10, :cond_1

    .line 87
    move-object v1, v10

    .line 92
    :cond_1
    #v1=(Reference);
    new-instance v11, Ljava/lang/StringBuilder;

    #v11=(UninitRef);
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v12

    #v12=(Reference);
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    #v11=(Reference);
    const-string v12, "/Android/data/com.chartboost.sdk/files"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, "/"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, "ChartBoost.cb"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    .line 92
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 95
    .local v4, cookieUri:Ljava/lang/String;
    #v4=(Reference);
    new-instance v3, Ljava/io/File;

    .end local v3           #cookiePath:Ljava/io/File;
    #v3=(UninitRef);
    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 98
    .restart local v3       #cookiePath:Ljava/io/File;
    #v3=(Reference);
    if-nez v1, :cond_2

    .line 102
    :try_start_0
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v11

    const-string v12, "mounted"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    #v11=(Boolean);
    if-eqz v11, :cond_2

    .line 106
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    move-result v11

    if-eqz v11, :cond_2

    .line 110
    new-instance v2, Ljava/lang/StringBuffer;

    #v2=(UninitRef);
    const-string v11, ""

    #v11=(Reference);
    invoke-direct {v2, v11}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 111
    .local v2, cookieContent:Ljava/lang/StringBuffer;
    #v2=(Reference);
    new-instance v7, Ljava/io/FileInputStream;

    #v7=(UninitRef);
    invoke-direct {v7, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 114
    .local v7, fis:Ljava/io/FileInputStream;
    :goto_1
    #v0=(Conflicted);v7=(Reference);v11=(Conflicted);
    invoke-virtual {v7}, Ljava/io/FileInputStream;->read()I

    move-result v0

    .local v0, c:I
    #v0=(Integer);
    const/4 v11, -0x1

    #v11=(Byte);
    if-ne v0, v11, :cond_3

    .line 118
    invoke-virtual {v7}, Ljava/io/FileInputStream;->close()V

    .line 124
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->length()I

    move-result v11

    #v11=(Integer);
    const/16 v12, 0x28

    #v12=(PosByte);
    if-ne v11, v12, :cond_2

    .line 125
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 127
    const/4 v5, 0x0

    .line 148
    .end local v0           #c:I
    .end local v2           #cookieContent:Ljava/lang/StringBuffer;
    .end local v7           #fis:Ljava/io/FileInputStream;
    :cond_2
    :goto_2
    #v0=(Conflicted);v2=(Conflicted);v5=(Boolean);v7=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    if-nez v1, :cond_5

    .line 153
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v8

    .line 155
    .local v8, myUUID:Ljava/util/UUID;
    #v8=(Reference);
    if-nez v8, :cond_4

    .line 158
    const-string v1, "unknown"

    .line 160
    goto/16 :goto_0

    .line 115
    .end local v8           #myUUID:Ljava/util/UUID;
    .restart local v0       #c:I
    .restart local v2       #cookieContent:Ljava/lang/StringBuffer;
    .restart local v7       #fis:Ljava/io/FileInputStream;
    :cond_3
    #v0=(Integer);v2=(Reference);v5=(One);v7=(Reference);v8=(Uninit);v11=(Byte);v12=(Reference);
    int-to-char v11, v0

    :try_start_1
    #v11=(Char);
    invoke-virtual {v2, v11}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 141
    .end local v0           #c:I
    .end local v2           #cookieContent:Ljava/lang/StringBuffer;
    .end local v7           #fis:Ljava/io/FileInputStream;
    :catch_0
    #v0=(Conflicted);v2=(Conflicted);v7=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    move-exception v11

    #v11=(Reference);
    goto :goto_2

    .line 162
    .restart local v8       #myUUID:Ljava/util/UUID;
    :cond_4
    #v5=(Boolean);v8=(Reference);v11=(Conflicted);
    invoke-virtual {v8}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    .line 166
    new-instance v11, Ljava/lang/StringBuilder;

    #v11=(UninitRef);
    const-string v12, "android-"

    #v12=(Reference);
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v11=(Reference);
    const-string v12, "-"

    const-string v13, ""

    #v13=(Reference);
    invoke-virtual {v1, v12, v13}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 175
    .end local v8           #myUUID:Ljava/util/UUID;
    :cond_5
    #v8=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    invoke-interface {v9}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v11

    #v11=(Reference);
    const-string v12, "cb_auid"

    #v12=(Reference);
    invoke-interface {v11, v12, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v11

    invoke-interface {v11}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v11

    #v11=(Boolean);
    if-eqz v11, :cond_7

    .line 187
    if-eqz v5, :cond_6

    .line 190
    :try_start_2
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v11

    if-eqz v11, :cond_8

    .line 191
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 196
    :goto_3
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    move-result v11

    if-eqz v11, :cond_6

    .line 197
    new-instance v6, Ljava/io/FileWriter;

    #v6=(UninitRef);
    const/4 v11, 0x0

    #v11=(Null);
    invoke-direct {v6, v3, v11}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V

    .line 198
    .local v6, filewriter:Ljava/io/FileWriter;
    #v6=(Reference);
    invoke-virtual {v6, v1}, Ljava/io/FileWriter;->write(Ljava/lang/String;)V

    .line 199
    invoke-virtual {v6}, Ljava/io/FileWriter;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 216
    .end local v6           #filewriter:Ljava/io/FileWriter;
    :cond_6
    :goto_4
    #v6=(Conflicted);v11=(Conflicted);
    sput-object v1, Lcom/chartboost/sdk/CBUtility;->ANDROID_AUID:Ljava/lang/String;

    goto/16 :goto_0

    .line 181
    :cond_7
    #v6=(Uninit);v11=(Boolean);
    const-string v1, "unknown"

    .line 183
    goto/16 :goto_0

    .line 193
    :cond_8
    :try_start_3
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_3

    .line 207
    :catch_1
    #v6=(Conflicted);
    move-exception v11

    #v11=(Reference);
    goto :goto_4
.end method

*/}
