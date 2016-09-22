package com.kabam.utility.constance; class Constance$ResponseCode {/*

.class public final enum Lcom/kabam/utility/constance/Constance$ResponseCode;
.super Ljava/lang/Enum;
.source "Constance.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kabam/utility/constance/Constance;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ResponseCode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/kabam/utility/constance/Constance$ResponseCode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic ENUM$VALUES:[Lcom/kabam/utility/constance/Constance$ResponseCode;

.field public static final enum RESULT_BILLING_UNAVAILABLE:Lcom/kabam/utility/constance/Constance$ResponseCode;

.field public static final enum RESULT_DEVELOPER_ERROR:Lcom/kabam/utility/constance/Constance$ResponseCode;

.field public static final enum RESULT_ERROR:Lcom/kabam/utility/constance/Constance$ResponseCode;

.field public static final enum RESULT_ITEM_UNAVAILABLE:Lcom/kabam/utility/constance/Constance$ResponseCode;

.field public static final enum RESULT_OK:Lcom/kabam/utility/constance/Constance$ResponseCode;

.field public static final enum RESULT_SERVICE_UNAVAILABLE:Lcom/kabam/utility/constance/Constance$ResponseCode;

.field public static final enum RESULT_USER_CANCELED:Lcom/kabam/utility/constance/Constance$ResponseCode;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    #v7=(PosByte);
    const/4 v6, 0x3

    #v6=(PosByte);
    const/4 v5, 0x2

    #v5=(PosByte);
    const/4 v4, 0x1

    #v4=(One);
    const/4 v3, 0x0

    .line 48
    #v3=(Null);
    new-instance v0, Lcom/kabam/utility/constance/Constance$ResponseCode;

    #v0=(UninitRef);
    const-string v1, "RESULT_OK"

    #v1=(Reference);
    invoke-direct {v0, v1, v3}, Lcom/kabam/utility/constance/Constance$ResponseCode;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    sput-object v0, Lcom/kabam/utility/constance/Constance$ResponseCode;->RESULT_OK:Lcom/kabam/utility/constance/Constance$ResponseCode;

    .line 49
    new-instance v0, Lcom/kabam/utility/constance/Constance$ResponseCode;

    #v0=(UninitRef);
    const-string v1, "RESULT_USER_CANCELED"

    invoke-direct {v0, v1, v4}, Lcom/kabam/utility/constance/Constance$ResponseCode;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    sput-object v0, Lcom/kabam/utility/constance/Constance$ResponseCode;->RESULT_USER_CANCELED:Lcom/kabam/utility/constance/Constance$ResponseCode;

    .line 50
    new-instance v0, Lcom/kabam/utility/constance/Constance$ResponseCode;

    #v0=(UninitRef);
    const-string v1, "RESULT_SERVICE_UNAVAILABLE"

    invoke-direct {v0, v1, v5}, Lcom/kabam/utility/constance/Constance$ResponseCode;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    sput-object v0, Lcom/kabam/utility/constance/Constance$ResponseCode;->RESULT_SERVICE_UNAVAILABLE:Lcom/kabam/utility/constance/Constance$ResponseCode;

    .line 51
    new-instance v0, Lcom/kabam/utility/constance/Constance$ResponseCode;

    #v0=(UninitRef);
    const-string v1, "RESULT_BILLING_UNAVAILABLE"

    invoke-direct {v0, v1, v6}, Lcom/kabam/utility/constance/Constance$ResponseCode;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    sput-object v0, Lcom/kabam/utility/constance/Constance$ResponseCode;->RESULT_BILLING_UNAVAILABLE:Lcom/kabam/utility/constance/Constance$ResponseCode;

    .line 52
    new-instance v0, Lcom/kabam/utility/constance/Constance$ResponseCode;

    #v0=(UninitRef);
    const-string v1, "RESULT_ITEM_UNAVAILABLE"

    invoke-direct {v0, v1, v7}, Lcom/kabam/utility/constance/Constance$ResponseCode;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    sput-object v0, Lcom/kabam/utility/constance/Constance$ResponseCode;->RESULT_ITEM_UNAVAILABLE:Lcom/kabam/utility/constance/Constance$ResponseCode;

    .line 53
    new-instance v0, Lcom/kabam/utility/constance/Constance$ResponseCode;

    #v0=(UninitRef);
    const-string v1, "RESULT_DEVELOPER_ERROR"

    const/4 v2, 0x5

    #v2=(PosByte);
    invoke-direct {v0, v1, v2}, Lcom/kabam/utility/constance/Constance$ResponseCode;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    sput-object v0, Lcom/kabam/utility/constance/Constance$ResponseCode;->RESULT_DEVELOPER_ERROR:Lcom/kabam/utility/constance/Constance$ResponseCode;

    .line 54
    new-instance v0, Lcom/kabam/utility/constance/Constance$ResponseCode;

    #v0=(UninitRef);
    const-string v1, "RESULT_ERROR"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/kabam/utility/constance/Constance$ResponseCode;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    sput-object v0, Lcom/kabam/utility/constance/Constance$ResponseCode;->RESULT_ERROR:Lcom/kabam/utility/constance/Constance$ResponseCode;

    .line 46
    const/4 v0, 0x7

    #v0=(PosByte);
    new-array v0, v0, [Lcom/kabam/utility/constance/Constance$ResponseCode;

    #v0=(Reference);
    sget-object v1, Lcom/kabam/utility/constance/Constance$ResponseCode;->RESULT_OK:Lcom/kabam/utility/constance/Constance$ResponseCode;

    aput-object v1, v0, v3

    sget-object v1, Lcom/kabam/utility/constance/Constance$ResponseCode;->RESULT_USER_CANCELED:Lcom/kabam/utility/constance/Constance$ResponseCode;

    aput-object v1, v0, v4

    sget-object v1, Lcom/kabam/utility/constance/Constance$ResponseCode;->RESULT_SERVICE_UNAVAILABLE:Lcom/kabam/utility/constance/Constance$ResponseCode;

    aput-object v1, v0, v5

    sget-object v1, Lcom/kabam/utility/constance/Constance$ResponseCode;->RESULT_BILLING_UNAVAILABLE:Lcom/kabam/utility/constance/Constance$ResponseCode;

    aput-object v1, v0, v6

    sget-object v1, Lcom/kabam/utility/constance/Constance$ResponseCode;->RESULT_ITEM_UNAVAILABLE:Lcom/kabam/utility/constance/Constance$ResponseCode;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    #v1=(PosByte);
    sget-object v2, Lcom/kabam/utility/constance/Constance$ResponseCode;->RESULT_DEVELOPER_ERROR:Lcom/kabam/utility/constance/Constance$ResponseCode;

    #v2=(Reference);
    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/kabam/utility/constance/Constance$ResponseCode;->RESULT_ERROR:Lcom/kabam/utility/constance/Constance$ResponseCode;

    aput-object v2, v0, v1

    sput-object v0, Lcom/kabam/utility/constance/Constance$ResponseCode;->ENUM$VALUES:[Lcom/kabam/utility/constance/Constance$ResponseCode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 46
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    #p0=(Reference);
    return-void
.end method

.method public static valueOf(I)Lcom/kabam/utility/constance/Constance$ResponseCode;
    .locals 2
    .parameter "index"

    .prologue
    .line 58
    invoke-static {}, Lcom/kabam/utility/constance/Constance$ResponseCode;->values()[Lcom/kabam/utility/constance/Constance$ResponseCode;

    move-result-object v0

    .line 59
    .local v0, values:[Lcom/kabam/utility/constance/Constance$ResponseCode;
    #v0=(Reference);
    if-ltz p0, :cond_0

    array-length v1, v0

    #v1=(Integer);
    if-lt p0, v1, :cond_1

    .line 60
    :cond_0
    #v1=(Conflicted);
    sget-object v1, Lcom/kabam/utility/constance/Constance$ResponseCode;->RESULT_ERROR:Lcom/kabam/utility/constance/Constance$ResponseCode;

    .line 62
    :goto_0
    #v1=(Reference);
    return-object v1

    :cond_1
    #v1=(Integer);
    aget-object v1, v0, p0

    #v1=(Null);
    goto :goto_0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/kabam/utility/constance/Constance$ResponseCode;
    .locals 1
    .parameter

    .prologue
    .line 1
    const-class v0, Lcom/kabam/utility/constance/Constance$ResponseCode;

    #v0=(Reference);
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/kabam/utility/constance/Constance$ResponseCode;

    return-object v0
.end method

.method public static values()[Lcom/kabam/utility/constance/Constance$ResponseCode;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    #v3=(Null);
    sget-object v0, Lcom/kabam/utility/constance/Constance$ResponseCode;->ENUM$VALUES:[Lcom/kabam/utility/constance/Constance$ResponseCode;

    #v0=(Reference);
    array-length v1, v0

    #v1=(Integer);
    new-array v2, v1, [Lcom/kabam/utility/constance/Constance$ResponseCode;

    #v2=(Reference);
    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method

*/}
