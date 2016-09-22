package com.kabam.rater; class RateSender {/*

.class public Lcom/kabam/rater/RateSender;
.super Ljava/lang/Object;
.source "RateSender.java"


# static fields
.field private static sPreference:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 46
    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/kabam/rater/RateSender;->sPreference:Landroid/content/SharedPreferences;

    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method private static IsNeverRate()Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 68
    #v0=(Null);
    sget-object v1, Lcom/kabam/rater/RateSender;->sPreference:Landroid/content/SharedPreferences;

    #v1=(Reference);
    if-nez v1, :cond_0

    .line 69
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kabam/utility/Provider;->GetActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/Activity;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v1

    sput-object v1, Lcom/kabam/rater/RateSender;->sPreference:Landroid/content/SharedPreferences;

    .line 71
    :cond_0
    sget-object v1, Lcom/kabam/rater/RateSender;->sPreference:Landroid/content/SharedPreferences;

    const-string v2, "never"

    #v2=(Reference);
    const-string v3, ""

    #v3=(Reference);
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    if-ne v1, v2, :cond_1

    .line 72
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_1
    #v0=(Null);
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method

.method private static NeverRate()V
    .locals 2

    .prologue
    .line 64
    const-string v0, "never"

    #v0=(Reference);
    const-string v1, "yes"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/kabam/rater/RateSender;->Record(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    return-void
.end method

.method private static Record(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .parameter "key"
    .parameter "value"

    .prologue
    .line 51
    :try_start_0
    sget-object v2, Lcom/kabam/rater/RateSender;->sPreference:Landroid/content/SharedPreferences;

    #v2=(Reference);
    if-nez v2, :cond_0

    .line 52
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kabam/utility/Provider;->GetActivity()Landroid/app/Activity;

    move-result-object v2

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v2, v3}, Landroid/app/Activity;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v2

    sput-object v2, Lcom/kabam/rater/RateSender;->sPreference:Landroid/content/SharedPreferences;

    .line 54
    :cond_0
    #v3=(Conflicted);
    sget-object v2, Lcom/kabam/rater/RateSender;->sPreference:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2, p0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 55
    .local v0, editor:Landroid/content/SharedPreferences$Editor;
    #v0=(Reference);
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .end local v0           #editor:Landroid/content/SharedPreferences$Editor;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    .line 57
    :catch_0
    move-exception v1

    .line 59
    .local v1, ex:Ljava/lang/Exception;
    #v1=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2, v1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private static ShowInformation(Ljava/lang/String;)V
    .locals 3
    .parameter "s"

    .prologue
    .line 26
    const-string v0, "Rater"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "rater"

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    return-void
.end method

.method private static ShowInput(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .parameter "title"
    .parameter "message"
    .parameter "rateNow"
    .parameter "rateLater"
    .parameter "noRate"
    .parameter "clientVer"
    .parameter "url"
    .parameter "tag"

    .prologue
    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-static {p7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    const-string v1, "====================================================="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kabam/rater/RateSender;->ShowInformation(Ljava/lang/String;)V

    .line 33
    invoke-static {p0}, Lcom/kabam/rater/RateSender;->ShowInformation(Ljava/lang/String;)V

    .line 34
    invoke-static {p1}, Lcom/kabam/rater/RateSender;->ShowInformation(Ljava/lang/String;)V

    .line 35
    invoke-static {p2}, Lcom/kabam/rater/RateSender;->ShowInformation(Ljava/lang/String;)V

    .line 36
    invoke-static {p3}, Lcom/kabam/rater/RateSender;->ShowInformation(Ljava/lang/String;)V

    .line 38
    invoke-static {p4}, Lcom/kabam/rater/RateSender;->ShowInformation(Ljava/lang/String;)V

    .line 39
    invoke-static {p5}, Lcom/kabam/rater/RateSender;->ShowInformation(Ljava/lang/String;)V

    .line 40
    invoke-static {p6}, Lcom/kabam/rater/RateSender;->ShowInformation(Ljava/lang/String;)V

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-static {p7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    const-string v1, "====================================================="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kabam/rater/RateSender;->ShowInformation(Ljava/lang/String;)V

    .line 44
    return-void
.end method

.method static synthetic access$0()Z
    .locals 1

    .prologue
    .line 66
    invoke-static {}, Lcom/kabam/rater/RateSender;->IsNeverRate()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 28
    invoke-static/range {p0 .. p7}, Lcom/kabam/rater/RateSender;->ShowInput(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$2(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 23
    invoke-static {p0}, Lcom/kabam/rater/RateSender;->ShowInformation(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$3()V
    .locals 0

    .prologue
    .line 62
    invoke-static {}, Lcom/kabam/rater/RateSender;->NeverRate()V

    return-void
.end method

.method public static showRateDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9
    .parameter "activity"
    .parameter "title"
    .parameter "message"
    .parameter "rateNow"
    .parameter "rateLater"
    .parameter "noRate"
    .parameter "clientVer"
    .parameter "url"

    .prologue
    .line 77
    const-string v7, "1"

    #v7=(Reference);
    move-object v0, p1

    #v0=(Reference);
    move-object v1, p2

    #v1=(Reference);
    move-object v2, p3

    #v2=(Reference);
    move-object v3, p4

    #v3=(Reference);
    move-object v4, p5

    #v4=(Reference);
    move-object v5, p6

    #v5=(Reference);
    move-object/from16 v6, p7

    #v6=(Reference);
    invoke-static/range {v0 .. v7}, Lcom/kabam/rater/RateSender;->ShowInput(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    new-instance v0, Lcom/kabam/rater/RateSender$1;

    #v0=(UninitRef);
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    #v8=(Reference);
    invoke-direct/range {v0 .. v8}, Lcom/kabam/rater/RateSender$1;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .local v0, action:Ljava/lang/Runnable;
    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 158
    return-void
.end method

*/}
