package com.kabam.openudid; class Openudid {/*

.class public Lcom/kabam/openudid/Openudid;
.super Ljava/lang/Object;
.source "Openudid.java"


# static fields
.field private static sInstance:Lcom/kabam/openudid/Openudid;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 8
    new-instance v0, Lcom/kabam/openudid/Openudid;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/kabam/openudid/Openudid;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/kabam/openudid/Openudid;->sInstance:Lcom/kabam/openudid/Openudid;

    .line 6
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    #p0=(Reference);
    return-void
.end method

.method public static Instance()Lcom/kabam/openudid/Openudid;
    .locals 1

    .prologue
    .line 16
    sget-object v0, Lcom/kabam/openudid/Openudid;->sInstance:Lcom/kabam/openudid/Openudid;

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public GetUDID(Landroid/content/Context;)Ljava/lang/String;
    .locals 1
    .parameter "context"

    .prologue
    .line 21
    invoke-static {p1}, Lnet/openudid/android/OpenUDID;->syncContext(Landroid/content/Context;)V

    .line 22
    invoke-static {}, Lnet/openudid/android/OpenUDID;->getOpenUDIDInContext()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

*/}
