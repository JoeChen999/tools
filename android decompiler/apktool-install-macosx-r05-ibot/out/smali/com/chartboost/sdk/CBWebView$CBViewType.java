package com.chartboost.sdk; class CBWebView$CBViewType {/*

.class public final enum Lcom/chartboost/sdk/CBWebView$CBViewType;
.super Ljava/lang/Enum;
.source "CBWebView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/chartboost/sdk/CBWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CBViewType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/chartboost/sdk/CBWebView$CBViewType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum CBViewTypeInterstitial:Lcom/chartboost/sdk/CBWebView$CBViewType;

.field public static final enum CBViewTypeMoreApps:Lcom/chartboost/sdk/CBWebView$CBViewType;

.field private static final synthetic ENUM$VALUES:[Lcom/chartboost/sdk/CBWebView$CBViewType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    #v3=(One);
    const/4 v2, 0x0

    .line 18
    #v2=(Null);
    new-instance v0, Lcom/chartboost/sdk/CBWebView$CBViewType;

    #v0=(UninitRef);
    const-string v1, "CBViewTypeInterstitial"

    #v1=(Reference);
    invoke-direct {v0, v1, v2}, Lcom/chartboost/sdk/CBWebView$CBViewType;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    sput-object v0, Lcom/chartboost/sdk/CBWebView$CBViewType;->CBViewTypeInterstitial:Lcom/chartboost/sdk/CBWebView$CBViewType;

    new-instance v0, Lcom/chartboost/sdk/CBWebView$CBViewType;

    #v0=(UninitRef);
    const-string v1, "CBViewTypeMoreApps"

    invoke-direct {v0, v1, v3}, Lcom/chartboost/sdk/CBWebView$CBViewType;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    sput-object v0, Lcom/chartboost/sdk/CBWebView$CBViewType;->CBViewTypeMoreApps:Lcom/chartboost/sdk/CBWebView$CBViewType;

    .line 17
    const/4 v0, 0x2

    #v0=(PosByte);
    new-array v0, v0, [Lcom/chartboost/sdk/CBWebView$CBViewType;

    #v0=(Reference);
    sget-object v1, Lcom/chartboost/sdk/CBWebView$CBViewType;->CBViewTypeInterstitial:Lcom/chartboost/sdk/CBWebView$CBViewType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/chartboost/sdk/CBWebView$CBViewType;->CBViewTypeMoreApps:Lcom/chartboost/sdk/CBWebView$CBViewType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/chartboost/sdk/CBWebView$CBViewType;->ENUM$VALUES:[Lcom/chartboost/sdk/CBWebView$CBViewType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 17
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    #p0=(Reference);
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/chartboost/sdk/CBWebView$CBViewType;
    .locals 1
    .parameter

    .prologue
    .line 1
    const-class v0, Lcom/chartboost/sdk/CBWebView$CBViewType;

    #v0=(Reference);
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/chartboost/sdk/CBWebView$CBViewType;

    return-object v0
.end method

.method public static values()[Lcom/chartboost/sdk/CBWebView$CBViewType;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    #v3=(Null);
    sget-object v0, Lcom/chartboost/sdk/CBWebView$CBViewType;->ENUM$VALUES:[Lcom/chartboost/sdk/CBWebView$CBViewType;

    #v0=(Reference);
    array-length v1, v0

    #v1=(Integer);
    new-array v2, v1, [Lcom/chartboost/sdk/CBWebView$CBViewType;

    #v2=(Reference);
    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method

*/}
