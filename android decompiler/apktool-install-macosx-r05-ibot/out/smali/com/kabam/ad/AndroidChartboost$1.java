package com.kabam.ad; class AndroidChartboost$1 {/*

.class Lcom/kabam/ad/AndroidChartboost$1;
.super Ljava/lang/Object;
.source "AndroidChartboost.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kabam/ad/AndroidChartboost;->ChartBoostAction(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final synthetic val$activity:Landroid/app/Activity;

.field private final synthetic val$appID:Ljava/lang/String;

.field private final synthetic val$signature:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/kabam/ad/AndroidChartboost$1;->val$signature:Ljava/lang/String;

    iput-object p2, p0, Lcom/kabam/ad/AndroidChartboost$1;->val$appID:Ljava/lang/String;

    iput-object p3, p0, Lcom/kabam/ad/AndroidChartboost$1;->val$activity:Landroid/app/Activity;

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 92
    iget-object v0, p0, Lcom/kabam/ad/AndroidChartboost$1;->val$signature:Ljava/lang/String;

    #v0=(Reference);
    iget-object v1, p0, Lcom/kabam/ad/AndroidChartboost$1;->val$appID:Ljava/lang/String;

    #v1=(Reference);
    iget-object v2, p0, Lcom/kabam/ad/AndroidChartboost$1;->val$activity:Landroid/app/Activity;

    #v2=(Reference);
    invoke-static {v0, v1, v2}, Lcom/kabam/ad/AndroidChartboost;->Initialize(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V

    .line 93
    invoke-static {}, Lcom/kabam/ad/AndroidChartboost;->OnInstall()V

    .line 94
    invoke-static {}, Lcom/kabam/ad/AndroidChartboost;->ShowChartboost()V

    .line 95
    return-void
.end method

*/}
