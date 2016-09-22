package com.google.android.apps.analytics; class Transaction$Builder {/*

.class public Lcom/google/android/apps/analytics/Transaction$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/apps/analytics/Transaction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private final orderId:Ljava/lang/String;

.field private shippingCost:D

.field private storeName:Ljava/lang/String;

.field private final totalCost:D

.field private totalTax:D


# direct methods
.method public constructor <init>(Ljava/lang/String;D)V
    .locals 3

    const-wide/16 v1, 0x0

    #v1=(LongLo);v2=(LongHi);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/google/android/apps/analytics/Transaction$Builder;->storeName:Ljava/lang/String;

    iput-wide v1, p0, Lcom/google/android/apps/analytics/Transaction$Builder;->totalTax:D

    iput-wide v1, p0, Lcom/google/android/apps/analytics/Transaction$Builder;->shippingCost:D

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "orderId must not be empty or null"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_1
    #v0=(Integer);v1=(LongLo);
    iput-object p1, p0, Lcom/google/android/apps/analytics/Transaction$Builder;->orderId:Ljava/lang/String;

    iput-wide p2, p0, Lcom/google/android/apps/analytics/Transaction$Builder;->totalCost:D

    return-void
.end method

.method static synthetic access$000(Lcom/google/android/apps/analytics/Transaction$Builder;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/apps/analytics/Transaction$Builder;->orderId:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$100(Lcom/google/android/apps/analytics/Transaction$Builder;)D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/apps/analytics/Transaction$Builder;->totalCost:D

    #v0=(DoubleLo);v1=(DoubleHi);
    return-wide v0
.end method

.method static synthetic access$200(Lcom/google/android/apps/analytics/Transaction$Builder;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/apps/analytics/Transaction$Builder;->storeName:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$300(Lcom/google/android/apps/analytics/Transaction$Builder;)D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/apps/analytics/Transaction$Builder;->totalTax:D

    #v0=(DoubleLo);v1=(DoubleHi);
    return-wide v0
.end method

.method static synthetic access$400(Lcom/google/android/apps/analytics/Transaction$Builder;)D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/apps/analytics/Transaction$Builder;->shippingCost:D

    #v0=(DoubleLo);v1=(DoubleHi);
    return-wide v0
.end method


# virtual methods
.method public build()Lcom/google/android/apps/analytics/Transaction;
    .locals 2

    new-instance v0, Lcom/google/android/apps/analytics/Transaction;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Lcom/google/android/apps/analytics/Transaction;-><init>(Lcom/google/android/apps/analytics/Transaction$Builder;Lcom/google/android/apps/analytics/Transaction$1;)V

    #v0=(Reference);
    return-object v0
.end method

.method public setShippingCost(D)Lcom/google/android/apps/analytics/Transaction$Builder;
    .locals 0

    iput-wide p1, p0, Lcom/google/android/apps/analytics/Transaction$Builder;->shippingCost:D

    return-object p0
.end method

.method public setStoreName(Ljava/lang/String;)Lcom/google/android/apps/analytics/Transaction$Builder;
    .locals 0

    iput-object p1, p0, Lcom/google/android/apps/analytics/Transaction$Builder;->storeName:Ljava/lang/String;

    return-object p0
.end method

.method public setTotalTax(D)Lcom/google/android/apps/analytics/Transaction$Builder;
    .locals 0

    iput-wide p1, p0, Lcom/google/android/apps/analytics/Transaction$Builder;->totalTax:D

    return-object p0
.end method

*/}
