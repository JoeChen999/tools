package com.google.android.apps.analytics; class Transaction {/*

.class public Lcom/google/android/apps/analytics/Transaction;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/apps/analytics/Transaction$1;,
        Lcom/google/android/apps/analytics/Transaction$Builder;
    }
.end annotation


# instance fields
.field private final orderId:Ljava/lang/String;

.field private final shippingCost:D

.field private final storeName:Ljava/lang/String;

.field private final totalCost:D

.field private final totalTax:D


# direct methods
.method private constructor <init>(Lcom/google/android/apps/analytics/Transaction$Builder;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    invoke-static {p1}, Lcom/google/android/apps/analytics/Transaction$Builder;->access$000(Lcom/google/android/apps/analytics/Transaction$Builder;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/google/android/apps/analytics/Transaction;->orderId:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/apps/analytics/Transaction$Builder;->access$100(Lcom/google/android/apps/analytics/Transaction$Builder;)D

    move-result-wide v0

    #v0=(DoubleLo);v1=(DoubleHi);
    iput-wide v0, p0, Lcom/google/android/apps/analytics/Transaction;->totalCost:D

    invoke-static {p1}, Lcom/google/android/apps/analytics/Transaction$Builder;->access$200(Lcom/google/android/apps/analytics/Transaction$Builder;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/google/android/apps/analytics/Transaction;->storeName:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/apps/analytics/Transaction$Builder;->access$300(Lcom/google/android/apps/analytics/Transaction$Builder;)D

    move-result-wide v0

    #v0=(DoubleLo);
    iput-wide v0, p0, Lcom/google/android/apps/analytics/Transaction;->totalTax:D

    invoke-static {p1}, Lcom/google/android/apps/analytics/Transaction$Builder;->access$400(Lcom/google/android/apps/analytics/Transaction$Builder;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/apps/analytics/Transaction;->shippingCost:D

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/apps/analytics/Transaction$Builder;Lcom/google/android/apps/analytics/Transaction$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/apps/analytics/Transaction;-><init>(Lcom/google/android/apps/analytics/Transaction$Builder;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method getOrderId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/apps/analytics/Transaction;->orderId:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method getShippingCost()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/apps/analytics/Transaction;->shippingCost:D

    #v0=(DoubleLo);v1=(DoubleHi);
    return-wide v0
.end method

.method getStoreName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/apps/analytics/Transaction;->storeName:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method getTotalCost()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/apps/analytics/Transaction;->totalCost:D

    #v0=(DoubleLo);v1=(DoubleHi);
    return-wide v0
.end method

.method getTotalTax()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/apps/analytics/Transaction;->totalTax:D

    #v0=(DoubleLo);v1=(DoubleHi);
    return-wide v0
.end method

*/}
