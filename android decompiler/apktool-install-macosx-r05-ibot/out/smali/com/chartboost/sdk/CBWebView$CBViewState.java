package com.chartboost.sdk; class CBWebView$CBViewState {/*

.class public final enum Lcom/chartboost/sdk/CBWebView$CBViewState;
.super Ljava/lang/Enum;
.source "CBWebView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/chartboost/sdk/CBWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CBViewState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/chartboost/sdk/CBWebView$CBViewState;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum CBViewStateDisplayedByDefaultController:Lcom/chartboost/sdk/CBWebView$CBViewState;

.field public static final enum CBViewStateOther:Lcom/chartboost/sdk/CBWebView$CBViewState;

.field public static final enum CBViewStateWaitingForDismissal:Lcom/chartboost/sdk/CBWebView$CBViewState;

.field public static final enum CBViewStateWaitingForDisplay:Lcom/chartboost/sdk/CBWebView$CBViewState;

.field private static final synthetic ENUM$VALUES:[Lcom/chartboost/sdk/CBWebView$CBViewState;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    #v5=(PosByte);
    const/4 v4, 0x2

    #v4=(PosByte);
    const/4 v3, 0x1

    #v3=(One);
    const/4 v2, 0x0

    .line 14
    #v2=(Null);
    new-instance v0, Lcom/chartboost/sdk/CBWebView$CBViewState;

    #v0=(UninitRef);
    const-string v1, "CBViewStateOther"

    #v1=(Reference);
    invoke-direct {v0, v1, v2}, Lcom/chartboost/sdk/CBWebView$CBViewState;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    sput-object v0, Lcom/chartboost/sdk/CBWebView$CBViewState;->CBViewStateOther:Lcom/chartboost/sdk/CBWebView$CBViewState;

    new-instance v0, Lcom/chartboost/sdk/CBWebView$CBViewState;

    #v0=(UninitRef);
    const-string v1, "CBViewStateWaitingForDisplay"

    invoke-direct {v0, v1, v3}, Lcom/chartboost/sdk/CBWebView$CBViewState;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    sput-object v0, Lcom/chartboost/sdk/CBWebView$CBViewState;->CBViewStateWaitingForDisplay:Lcom/chartboost/sdk/CBWebView$CBViewState;

    new-instance v0, Lcom/chartboost/sdk/CBWebView$CBViewState;

    #v0=(UninitRef);
    const-string v1, "CBViewStateDisplayedByDefaultController"

    invoke-direct {v0, v1, v4}, Lcom/chartboost/sdk/CBWebView$CBViewState;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    sput-object v0, Lcom/chartboost/sdk/CBWebView$CBViewState;->CBViewStateDisplayedByDefaultController:Lcom/chartboost/sdk/CBWebView$CBViewState;

    new-instance v0, Lcom/chartboost/sdk/CBWebView$CBViewState;

    #v0=(UninitRef);
    const-string v1, "CBViewStateWaitingForDismissal"

    invoke-direct {v0, v1, v5}, Lcom/chartboost/sdk/CBWebView$CBViewState;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    sput-object v0, Lcom/chartboost/sdk/CBWebView$CBViewState;->CBViewStateWaitingForDismissal:Lcom/chartboost/sdk/CBWebView$CBViewState;

    .line 13
    const/4 v0, 0x4

    #v0=(PosByte);
    new-array v0, v0, [Lcom/chartboost/sdk/CBWebView$CBViewState;

    #v0=(Reference);
    sget-object v1, Lcom/chartboost/sdk/CBWebView$CBViewState;->CBViewStateOther:Lcom/chartboost/sdk/CBWebView$CBViewState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/chartboost/sdk/CBWebView$CBViewState;->CBViewStateWaitingForDisplay:Lcom/chartboost/sdk/CBWebView$CBViewState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/chartboost/sdk/CBWebView$CBViewState;->CBViewStateDisplayedByDefaultController:Lcom/chartboost/sdk/CBWebView$CBViewState;

    aput-object v1, v0, v4

    sget-object v1, Lcom/chartboost/sdk/CBWebView$CBViewState;->CBViewStateWaitingForDismissal:Lcom/chartboost/sdk/CBWebView$CBViewState;

    aput-object v1, v0, v5

    sput-object v0, Lcom/chartboost/sdk/CBWebView$CBViewState;->ENUM$VALUES:[Lcom/chartboost/sdk/CBWebView$CBViewState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    #p0=(Reference);
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/chartboost/sdk/CBWebView$CBViewState;
    .locals 1
    .parameter

    .prologue
    .line 1
    const-class v0, Lcom/chartboost/sdk/CBWebView$CBViewState;

    #v0=(Reference);
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/chartboost/sdk/CBWebView$CBViewState;

    return-object v0
.end method

.method public static values()[Lcom/chartboost/sdk/CBWebView$CBViewState;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    #v3=(Null);
    sget-object v0, Lcom/chartboost/sdk/CBWebView$CBViewState;->ENUM$VALUES:[Lcom/chartboost/sdk/CBWebView$CBViewState;

    #v0=(Reference);
    array-length v1, v0

    #v1=(Integer);
    new-array v2, v1, [Lcom/chartboost/sdk/CBWebView$CBViewState;

    #v2=(Reference);
    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method

*/}
