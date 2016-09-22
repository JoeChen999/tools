package com.tapjoy; class TapjoyConnectFlag {/*

.class public Lcom/tapjoy/TapjoyConnectFlag;
.super Ljava/lang/Object;
.source "TapjoyConnectFlag.java"


# static fields
.field public static final DEBUG_DEVICE_ID:Ljava/lang/String; = "debug_device_id"

.field public static final DISABLE_VIDEOS:Ljava/lang/String; = "disable_videos"

.field public static final ENABLE_LOGGING:Ljava/lang/String; = "enable_logging"

.field public static final FLAG_ARRAY:[Ljava/lang/String; = null

.field public static final SHA_2_UDID:Ljava/lang/String; = "sha_2_udid"

.field public static final STORE_ARRAY:[Ljava/lang/String; = null

.field public static final STORE_GFAN:Ljava/lang/String; = "gfan"

.field public static final STORE_NAME:Ljava/lang/String; = "store_name"

.field public static final STORE_SKT:Ljava/lang/String; = "skt"

.field public static final USER_ID:Ljava/lang/String; = "user_id"

.field public static final VIDEO_CACHE_COUNT:Ljava/lang/String; = "video_cache_count"


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x2

    #v5=(PosByte);
    const/4 v4, 0x1

    #v4=(One);
    const/4 v3, 0x0

    .line 73
    #v3=(Null);
    const/4 v0, 0x7

    #v0=(PosByte);
    new-array v0, v0, [Ljava/lang/String;

    #v0=(Reference);
    const-string v1, "debug_device_id"

    #v1=(Reference);
    aput-object v1, v0, v3

    const-string v1, "sha_2_udid"

    aput-object v1, v0, v4

    const-string v1, "store_name"

    aput-object v1, v0, v5

    const/4 v1, 0x3

    #v1=(PosByte);
    const-string v2, "disable_videos"

    #v2=(Reference);
    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "video_cache_count"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "enable_logging"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "user_id"

    aput-object v2, v0, v1

    sput-object v0, Lcom/tapjoy/TapjoyConnectFlag;->FLAG_ARRAY:[Ljava/lang/String;

    .line 87
    new-array v0, v5, [Ljava/lang/String;

    const-string v1, "gfan"

    #v1=(Reference);
    aput-object v1, v0, v3

    const-string v1, "skt"

    aput-object v1, v0, v4

    sput-object v0, Lcom/tapjoy/TapjoyConnectFlag;->STORE_ARRAY:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

*/}
