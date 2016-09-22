package com.kabam.utility; class Provider$PurchasedInformation {/*

.class Lcom/kabam/utility/Provider$PurchasedInformation;
.super Ljava/lang/Object;
.source "Provider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kabam/utility/Provider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "PurchasedInformation"
.end annotation


# instance fields
.field public NotificationId:Ljava/lang/String;

.field public PurchasedState:I

.field final synthetic this$0:Lcom/kabam/utility/Provider;


# direct methods
.method private constructor <init>(Lcom/kabam/utility/Provider;)V
    .locals 1
    .parameter

    .prologue
    .line 228
    iput-object p1, p0, Lcom/kabam/utility/Provider$PurchasedInformation;->this$0:Lcom/kabam/utility/Provider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 230
    #p0=(Reference);
    const/4 v0, -0x1

    #v0=(Byte);
    iput v0, p0, Lcom/kabam/utility/Provider$PurchasedInformation;->PurchasedState:I

    .line 231
    const-string v0, ""

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/utility/Provider$PurchasedInformation;->NotificationId:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/kabam/utility/Provider;Lcom/kabam/utility/Provider$PurchasedInformation;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 228
    invoke-direct {p0, p1}, Lcom/kabam/utility/Provider$PurchasedInformation;-><init>(Lcom/kabam/utility/Provider;)V

    #p0=(Reference);
    return-void
.end method

*/}
