package com.tapjoy; class TapjoyVideoObject {/*

.class public Lcom/tapjoy/TapjoyVideoObject;
.super Ljava/lang/Object;
.source "TapjoyVideoObject.java"


# static fields
.field public static final BUTTON_MAX:I = 0xa


# instance fields
.field public buttonCount:I

.field public buttonData:[[Ljava/lang/String;

.field public clickURL:Ljava/lang/String;

.field public currencyAmount:Ljava/lang/String;

.field public currencyName:Ljava/lang/String;

.field public dataLocation:Ljava/lang/String;

.field public iconURL:Ljava/lang/String;

.field public offerID:Ljava/lang/String;

.field public videoAdName:Ljava/lang/String;

.field public videoURL:Ljava/lang/String;

.field public webviewURL:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    #p0=(Reference);
    const/16 v0, 0xa

    #v0=(PosByte);
    const/4 v1, 0x2

    #v1=(PosByte);
    filled-new-array {v0, v1}, [I

    move-result-object v0

    #v0=(Reference);
    const-class v1, Ljava/lang/String;

    #v1=(Reference);
    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[Ljava/lang/String;

    iput-object v0, p0, Lcom/tapjoy/TapjoyVideoObject;->buttonData:[[Ljava/lang/String;

    .line 28
    return-void
.end method


# virtual methods
.method public addButton(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .parameter "name"
    .parameter "url"

    .prologue
    .line 32
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoObject;->buttonData:[[Ljava/lang/String;

    #v0=(Reference);
    iget v1, p0, Lcom/tapjoy/TapjoyVideoObject;->buttonCount:I

    #v1=(Integer);
    aget-object v0, v0, v1

    #v0=(Null);
    const/4 v1, 0x0

    #v1=(Null);
    aput-object p1, v0, v1

    .line 33
    iget-object v0, p0, Lcom/tapjoy/TapjoyVideoObject;->buttonData:[[Ljava/lang/String;

    #v0=(Reference);
    iget v1, p0, Lcom/tapjoy/TapjoyVideoObject;->buttonCount:I

    #v1=(Integer);
    aget-object v0, v0, v1

    #v0=(Null);
    const/4 v1, 0x1

    #v1=(One);
    aput-object p2, v0, v1

    .line 34
    iget v0, p0, Lcom/tapjoy/TapjoyVideoObject;->buttonCount:I

    #v0=(Integer);
    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/tapjoy/TapjoyVideoObject;->buttonCount:I

    .line 35
    return-void
.end method

*/}
