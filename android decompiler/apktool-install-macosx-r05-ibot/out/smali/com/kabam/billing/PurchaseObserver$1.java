package com.kabam.billing; class PurchaseObserver$1 {/*

.class Lcom/kabam/billing/PurchaseObserver$1;
.super Ljava/lang/Object;
.source "PurchaseObserver.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kabam/billing/PurchaseObserver;->postPurchaseStateChange(Lcom/kabam/utility/constance/Constance$PurchaseState;Ljava/lang/String;IJLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kabam/billing/PurchaseObserver;

.field private final synthetic val$developerPayload:Ljava/lang/String;

.field private final synthetic val$itemId:Ljava/lang/String;

.field private final synthetic val$purchaseState:Lcom/kabam/utility/constance/Constance$PurchaseState;

.field private final synthetic val$purchaseTime:J

.field private final synthetic val$quantity:I


# direct methods
.method constructor <init>(Lcom/kabam/billing/PurchaseObserver;Lcom/kabam/utility/constance/Constance$PurchaseState;Ljava/lang/String;IJLjava/lang/String;)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/kabam/billing/PurchaseObserver$1;->this$0:Lcom/kabam/billing/PurchaseObserver;

    iput-object p2, p0, Lcom/kabam/billing/PurchaseObserver$1;->val$purchaseState:Lcom/kabam/utility/constance/Constance$PurchaseState;

    iput-object p3, p0, Lcom/kabam/billing/PurchaseObserver$1;->val$itemId:Ljava/lang/String;

    iput p4, p0, Lcom/kabam/billing/PurchaseObserver$1;->val$quantity:I

    iput-wide p5, p0, Lcom/kabam/billing/PurchaseObserver$1;->val$purchaseTime:J

    iput-object p7, p0, Lcom/kabam/billing/PurchaseObserver$1;->val$developerPayload:Ljava/lang/String;

    .line 178
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    .line 183
    iget-object v0, p0, Lcom/kabam/billing/PurchaseObserver$1;->this$0:Lcom/kabam/billing/PurchaseObserver;

    .line 184
    #v0=(Reference);
    iget-object v1, p0, Lcom/kabam/billing/PurchaseObserver$1;->val$purchaseState:Lcom/kabam/utility/constance/Constance$PurchaseState;

    #v1=(Reference);
    iget-object v2, p0, Lcom/kabam/billing/PurchaseObserver$1;->val$itemId:Ljava/lang/String;

    #v2=(Reference);
    iget v3, p0, Lcom/kabam/billing/PurchaseObserver$1;->val$quantity:I

    #v3=(Integer);
    iget-wide v4, p0, Lcom/kabam/billing/PurchaseObserver$1;->val$purchaseTime:J

    #v4=(LongLo);v5=(LongHi);
    iget-object v6, p0, Lcom/kabam/billing/PurchaseObserver$1;->val$developerPayload:Ljava/lang/String;

    .line 183
    #v6=(Reference);
    invoke-virtual/range {v0 .. v6}, Lcom/kabam/billing/PurchaseObserver;->onPurchaseStateChange(Lcom/kabam/utility/constance/Constance$PurchaseState;Ljava/lang/String;IJLjava/lang/String;)V

    .line 185
    return-void
.end method

*/}
