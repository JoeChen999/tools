package com.kabam.ad; class AndroidChartboost {/*

.class public Lcom/kabam/ad/AndroidChartboost;
.super Ljava/lang/Object;
.source "AndroidChartboost.java"


# static fields
.field private static sChartBoost:Lcom/chartboost/sdk/ChartBoost;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 12
    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/kabam/ad/AndroidChartboost;->sChartBoost:Lcom/chartboost/sdk/ChartBoost;

    .line 10
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static ChartBoostAction(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V
    .locals 1
    .parameter "signature"
    .parameter "appID"
    .parameter "activity"

    .prologue
    .line 87
    new-instance v0, Lcom/kabam/ad/AndroidChartboost$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p1, p2}, Lcom/kabam/ad/AndroidChartboost$1;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V

    .line 97
    .local v0, action:Ljava/lang/Runnable;
    #v0=(Reference);
    invoke-virtual {p2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 98
    return-void
.end method

.method public static CreateChartBoost(Landroid/app/Activity;)V
    .locals 1
    .parameter "activity"

    .prologue
    .line 16
    invoke-static {p0}, Lcom/chartboost/sdk/ChartBoost;->getSharedChartBoost(Landroid/content/Context;)Lcom/chartboost/sdk/ChartBoost;

    move-result-object v0

    #v0=(Reference);
    sput-object v0, Lcom/kabam/ad/AndroidChartboost;->sChartBoost:Lcom/chartboost/sdk/ChartBoost;

    .line 18
    return-void
.end method

.method public static Initialize(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V
    .locals 3
    .parameter "signature"
    .parameter "appID"
    .parameter "activity"

    .prologue
    .line 25
    :try_start_0
    const-string v1, "chartboost"

    #v1=(Reference);
    const-string v2, "chartboost 1"

    #v2=(Reference);
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    invoke-static {p2}, Lcom/kabam/ad/AndroidChartboost;->CreateChartBoost(Landroid/app/Activity;)V

    .line 27
    sget-object v1, Lcom/kabam/ad/AndroidChartboost;->sChartBoost:Lcom/chartboost/sdk/ChartBoost;

    const-string v2, "507ca53d17ba47912d000001"

    invoke-virtual {v1, v2}, Lcom/chartboost/sdk/ChartBoost;->setAppId(Ljava/lang/String;)V

    .line 28
    sget-object v1, Lcom/kabam/ad/AndroidChartboost;->sChartBoost:Lcom/chartboost/sdk/ChartBoost;

    const-string v2, "0e2534c7611a00211f660563fac3d4c9a80617e6"

    invoke-virtual {v1, v2}, Lcom/chartboost/sdk/ChartBoost;->setAppSignature(Ljava/lang/String;)V

    .line 30
    const-string v1, "chartboost"

    const-string v2, "chartboost 2"

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    .line 32
    :catch_0
    move-exception v0

    .line 34
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public static OnInstall()V
    .locals 3

    .prologue
    .line 43
    :try_start_0
    const-string v1, "chartboost"

    #v1=(Reference);
    const-string v2, "chartboost 3"

    #v2=(Reference);
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    sget-object v1, Lcom/kabam/ad/AndroidChartboost;->sChartBoost:Lcom/chartboost/sdk/ChartBoost;

    if-eqz v1, :cond_0

    .line 45
    sget-object v1, Lcom/kabam/ad/AndroidChartboost;->sChartBoost:Lcom/chartboost/sdk/ChartBoost;

    invoke-virtual {v1}, Lcom/chartboost/sdk/ChartBoost;->install()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .local v0, ex:Ljava/lang/Exception;
    :cond_0
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    .line 47
    .end local v0           #ex:Ljava/lang/Exception;
    :catch_0
    move-exception v0

    .line 49
    .restart local v0       #ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public static OnResume(Landroid/app/Activity;)V
    .locals 3
    .parameter "activity"

    .prologue
    .line 75
    :try_start_0
    const-string v1, "chartboost"

    #v1=(Reference);
    const-string v2, "chartboost 5"

    #v2=(Reference);
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    sget-object v1, Lcom/kabam/ad/AndroidChartboost;->sChartBoost:Lcom/chartboost/sdk/ChartBoost;

    if-eqz v1, :cond_0

    .line 77
    invoke-static {p0}, Lcom/chartboost/sdk/ChartBoost;->getSharedChartBoost(Landroid/content/Context;)Lcom/chartboost/sdk/ChartBoost;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    :cond_0
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    .line 79
    :catch_0
    move-exception v0

    .line 81
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public static ShowChartboost()V
    .locals 3

    .prologue
    .line 58
    :try_start_0
    const-string v1, "chartboost"

    #v1=(Reference);
    const-string v2, "chartboost 4"

    #v2=(Reference);
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    sget-object v1, Lcom/kabam/ad/AndroidChartboost;->sChartBoost:Lcom/chartboost/sdk/ChartBoost;

    if-eqz v1, :cond_0

    .line 60
    sget-object v1, Lcom/kabam/ad/AndroidChartboost;->sChartBoost:Lcom/chartboost/sdk/ChartBoost;

    invoke-virtual {v1}, Lcom/chartboost/sdk/ChartBoost;->showInterstitial()V

    .line 62
    :cond_0
    const-string v1, "chartboost"

    const-string v2, "chartboost 6"

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .local v0, ex:Ljava/lang/Exception;
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    .line 64
    .end local v0           #ex:Ljava/lang/Exception;
    :catch_0
    move-exception v0

    .line 66
    .restart local v0       #ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

*/}
