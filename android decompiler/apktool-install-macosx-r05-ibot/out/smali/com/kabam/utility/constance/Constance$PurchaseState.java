package com.kabam.utility.constance; class Constance$PurchaseState {/*

.class public final enum Lcom/kabam/utility/constance/Constance$PurchaseState;
.super Ljava/lang/Enum;
.source "Constance.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kabam/utility/constance/Constance;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PurchaseState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/kabam/utility/constance/Constance$PurchaseState;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum CANCELED:Lcom/kabam/utility/constance/Constance$PurchaseState;

.field private static final synthetic ENUM$VALUES:[Lcom/kabam/utility/constance/Constance$PurchaseState;

.field public static final enum PURCHASED:Lcom/kabam/utility/constance/Constance$PurchaseState;

.field public static final enum REFUNDED:Lcom/kabam/utility/constance/Constance$PurchaseState;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    #v4=(PosByte);
    const/4 v3, 0x1

    #v3=(One);
    const/4 v2, 0x0

    .line 69
    #v2=(Null);
    new-instance v0, Lcom/kabam/utility/constance/Constance$PurchaseState;

    #v0=(UninitRef);
    const-string v1, "PURCHASED"

    #v1=(Reference);
    invoke-direct {v0, v1, v2}, Lcom/kabam/utility/constance/Constance$PurchaseState;-><init>(Ljava/lang/String;I)V

    .line 70
    #v0=(Reference);
    sput-object v0, Lcom/kabam/utility/constance/Constance$PurchaseState;->PURCHASED:Lcom/kabam/utility/constance/Constance$PurchaseState;

    .line 71
    new-instance v0, Lcom/kabam/utility/constance/Constance$PurchaseState;

    #v0=(UninitRef);
    const-string v1, "CANCELED"

    invoke-direct {v0, v1, v3}, Lcom/kabam/utility/constance/Constance$PurchaseState;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    sput-object v0, Lcom/kabam/utility/constance/Constance$PurchaseState;->CANCELED:Lcom/kabam/utility/constance/Constance$PurchaseState;

    .line 72
    new-instance v0, Lcom/kabam/utility/constance/Constance$PurchaseState;

    #v0=(UninitRef);
    const-string v1, "REFUNDED"

    invoke-direct {v0, v1, v4}, Lcom/kabam/utility/constance/Constance$PurchaseState;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    sput-object v0, Lcom/kabam/utility/constance/Constance$PurchaseState;->REFUNDED:Lcom/kabam/utility/constance/Constance$PurchaseState;

    .line 67
    const/4 v0, 0x3

    #v0=(PosByte);
    new-array v0, v0, [Lcom/kabam/utility/constance/Constance$PurchaseState;

    #v0=(Reference);
    sget-object v1, Lcom/kabam/utility/constance/Constance$PurchaseState;->PURCHASED:Lcom/kabam/utility/constance/Constance$PurchaseState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/kabam/utility/constance/Constance$PurchaseState;->CANCELED:Lcom/kabam/utility/constance/Constance$PurchaseState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/kabam/utility/constance/Constance$PurchaseState;->REFUNDED:Lcom/kabam/utility/constance/Constance$PurchaseState;

    aput-object v1, v0, v4

    sput-object v0, Lcom/kabam/utility/constance/Constance$PurchaseState;->ENUM$VALUES:[Lcom/kabam/utility/constance/Constance$PurchaseState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 67
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    #p0=(Reference);
    return-void
.end method

.method public static valueOf(I)Lcom/kabam/utility/constance/Constance$PurchaseState;
    .locals 2
    .parameter "index"

    .prologue
    .line 76
    invoke-static {}, Lcom/kabam/utility/constance/Constance$PurchaseState;->values()[Lcom/kabam/utility/constance/Constance$PurchaseState;

    move-result-object v0

    .line 77
    .local v0, values:[Lcom/kabam/utility/constance/Constance$PurchaseState;
    #v0=(Reference);
    if-ltz p0, :cond_0

    array-length v1, v0

    #v1=(Integer);
    if-lt p0, v1, :cond_1

    .line 78
    :cond_0
    #v1=(Conflicted);
    sget-object v1, Lcom/kabam/utility/constance/Constance$PurchaseState;->CANCELED:Lcom/kabam/utility/constance/Constance$PurchaseState;

    .line 80
    :goto_0
    #v1=(Reference);
    return-object v1

    :cond_1
    #v1=(Integer);
    aget-object v1, v0, p0

    #v1=(Null);
    goto :goto_0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/kabam/utility/constance/Constance$PurchaseState;
    .locals 1
    .parameter

    .prologue
    .line 1
    const-class v0, Lcom/kabam/utility/constance/Constance$PurchaseState;

    #v0=(Reference);
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/kabam/utility/constance/Constance$PurchaseState;

    return-object v0
.end method

.method public static values()[Lcom/kabam/utility/constance/Constance$PurchaseState;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    #v3=(Null);
    sget-object v0, Lcom/kabam/utility/constance/Constance$PurchaseState;->ENUM$VALUES:[Lcom/kabam/utility/constance/Constance$PurchaseState;

    #v0=(Reference);
    array-length v1, v0

    #v1=(Integer);
    new-array v2, v1, [Lcom/kabam/utility/constance/Constance$PurchaseState;

    #v2=(Reference);
    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method

*/}
