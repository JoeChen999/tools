package com.google.android.apps.analytics; class Item {/*

.class public Lcom/google/android/apps/analytics/Item;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/apps/analytics/Item$1;,
        Lcom/google/android/apps/analytics/Item$Builder;
    }
.end annotation


# instance fields
.field private final itemCategory:Ljava/lang/String;

.field private final itemCount:J

.field private final itemName:Ljava/lang/String;

.field private final itemPrice:D

.field private final itemSKU:Ljava/lang/String;

.field private final orderId:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/google/android/apps/analytics/Item$Builder;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    invoke-static {p1}, Lcom/google/android/apps/analytics/Item$Builder;->access$000(Lcom/google/android/apps/analytics/Item$Builder;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/google/android/apps/analytics/Item;->orderId:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/apps/analytics/Item$Builder;->access$100(Lcom/google/android/apps/analytics/Item$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/analytics/Item;->itemSKU:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/apps/analytics/Item$Builder;->access$200(Lcom/google/android/apps/analytics/Item$Builder;)D

    move-result-wide v0

    #v0=(DoubleLo);v1=(DoubleHi);
    iput-wide v0, p0, Lcom/google/android/apps/analytics/Item;->itemPrice:D

    invoke-static {p1}, Lcom/google/android/apps/analytics/Item$Builder;->access$300(Lcom/google/android/apps/analytics/Item$Builder;)J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/google/android/apps/analytics/Item;->itemCount:J

    invoke-static {p1}, Lcom/google/android/apps/analytics/Item$Builder;->access$400(Lcom/google/android/apps/analytics/Item$Builder;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/google/android/apps/analytics/Item;->itemName:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/apps/analytics/Item$Builder;->access$500(Lcom/google/android/apps/analytics/Item$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/analytics/Item;->itemCategory:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/apps/analytics/Item$Builder;Lcom/google/android/apps/analytics/Item$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/apps/analytics/Item;-><init>(Lcom/google/android/apps/analytics/Item$Builder;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method getItemCategory()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/apps/analytics/Item;->itemCategory:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method getItemCount()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/apps/analytics/Item;->itemCount:J

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method getItemName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/apps/analytics/Item;->itemName:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method getItemPrice()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/apps/analytics/Item;->itemPrice:D

    #v0=(DoubleLo);v1=(DoubleHi);
    return-wide v0
.end method

.method getItemSKU()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/apps/analytics/Item;->itemSKU:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method getOrderId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/apps/analytics/Item;->orderId:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

*/}
