package com.kabam.nitificationmanager; class AndroidNotificationManager {/*

.class public Lcom/kabam/nitificationmanager/AndroidNotificationManager;
.super Ljava/lang/Object;
.source "AndroidNotificationManager.java"


# static fields
.field private static sCount:I


# instance fields
.field private mActivity:Landroid/app/Activity;

.field private mHash:Ljava/util/Hashtable;

.field private mManager:Landroid/app/NotificationManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x0

    #v0=(Null);
    sput v0, Lcom/kabam/nitificationmanager/AndroidNotificationManager;->sCount:I

    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 2
    .parameter "activity"

    .prologue
    const/4 v0, 0x0

    .line 32
    #v0=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    #p0=(Reference);
    iput-object v0, p0, Lcom/kabam/nitificationmanager/AndroidNotificationManager;->mActivity:Landroid/app/Activity;

    .line 29
    iput-object v0, p0, Lcom/kabam/nitificationmanager/AndroidNotificationManager;->mManager:Landroid/app/NotificationManager;

    .line 30
    new-instance v0, Ljava/util/Hashtable;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/nitificationmanager/AndroidNotificationManager;->mHash:Ljava/util/Hashtable;

    .line 34
    iput-object p1, p0, Lcom/kabam/nitificationmanager/AndroidNotificationManager;->mActivity:Landroid/app/Activity;

    .line 35
    iget-object v0, p0, Lcom/kabam/nitificationmanager/AndroidNotificationManager;->mActivity:Landroid/app/Activity;

    const-string v1, "notification"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    iput-object v0, p0, Lcom/kabam/nitificationmanager/AndroidNotificationManager;->mManager:Landroid/app/NotificationManager;

    .line 36
    return-void
.end method

.method private SendBI(Ljava/lang/String;)V
    .locals 0
    .parameter "bi"

    .prologue
    .line 121
    return-void
.end method

.method private Split(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .parameter "original"
    .parameter "sign"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 58
    #v1=(Null);
    if-nez p2, :cond_1

    .line 74
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-object v1

    .line 59
    :cond_1
    #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    const-string v4, ""

    #v4=(Reference);
    if-eq v3, v4, :cond_0

    .line 60
    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .local v1, r:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    :goto_1
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);v3=(Conflicted);
    invoke-virtual {p1, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    .line 66
    .local v0, index:I
    #v0=(Integer);
    if-gez v0, :cond_2

    .line 72
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 68
    :cond_2
    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {p1, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 69
    .local v2, term:Ljava/lang/String;
    #v2=(Reference);
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v3

    #v3=(Integer);
    add-int/2addr v3, v0

    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 70
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method


# virtual methods
.method public ParseArray(Ljava/lang/String;)Ljava/util/List;
    .locals 12
    .parameter "content"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v11, 0x0

    .line 83
    #v11=(Null);
    if-nez p1, :cond_1

    .line 115
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    return-object v11

    .line 84
    :cond_1
    :try_start_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
    const-string v7, ""

    #v7=(Reference);
    if-eq p1, v7, :cond_0

    .line 86
    const-string v7, "@"

    invoke-direct {p0, p1, v7}, Lcom/kabam/nitificationmanager/AndroidNotificationManager;->Split(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 87
    .local v5, terms:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    #v5=(Reference);
    if-nez v5, :cond_2

    .line 88
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v7

    const-string v8, "parse array error."

    #v8=(Reference);
    invoke-virtual {v7, v8}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/String;)V

    .line 89
    :cond_2
    #v8=(Conflicted);
    const/4 v2, 0x0

    .local v2, i:I
    :goto_1
    #v0=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    #v7=(Integer);
    if-ge v2, v7, :cond_0

    .line 91
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    #v7=(Reference);
    check-cast v7, Ljava/lang/String;

    const-string v8, "|"

    #v8=(Reference);
    invoke-direct {p0, v7, v8}, Lcom/kabam/nitificationmanager/AndroidNotificationManager;->Split(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 92
    .local v4, term:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    #v4=(Reference);
    if-nez v4, :cond_3

    .line 93
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v7

    const-string v8, "parse term error."

    invoke-virtual {v7, v8}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/String;)V

    .line 94
    :cond_3
    const/4 v6, 0x0

    .line 97
    .local v6, time:I
    #v6=(Null);
    const/4 v7, 0x0

    #v7=(Null);
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    #v7=(Reference);
    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 98
    #v6=(Integer);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v9

    #v9=(Reference);
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v8=(Reference);
    const-string v9, ":original time"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/String;)V

    .line 101
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    #v9=(LongLo);v10=(LongHi);
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v9

    #v9=(Reference);
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v8=(Reference);
    const-string v9, ":current time"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/String;)V

    .line 102
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v8=(Reference);
    const-string v9, ":final time"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/String;)V

    .line 104
    const/4 v7, 0x1

    #v7=(One);
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Ljava/lang/String;

    .line 105
    .local v3, message:Ljava/lang/String;
    const/4 v7, 0x2

    #v7=(PosByte);
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/lang/String;

    .line 106
    .local v0, bi:Ljava/lang/String;
    invoke-virtual {p0, v3, v6}, Lcom/kabam/nitificationmanager/AndroidNotificationManager;->SendAlarm(Ljava/lang/String;I)V

    .line 107
    invoke-direct {p0, v0}, Lcom/kabam/nitificationmanager/AndroidNotificationManager;->SendBI(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_1

    .line 110
    .end local v0           #bi:Ljava/lang/String;
    .end local v2           #i:I
    .end local v3           #message:Ljava/lang/String;
    .end local v4           #term:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    .end local v5           #terms:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    .end local v6           #time:I
    :catch_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    move-exception v1

    .line 112
    .local v1, ex:Ljava/lang/Exception;
    #v1=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v7

    #v7=(Reference);
    invoke-virtual {v7, v1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto/16 :goto_0
.end method

.method public SendAlarm(Ljava/lang/String;I)V
    .locals 8
    .parameter "content"
    .parameter "time"

    .prologue
    .line 40
    new-instance v1, Landroid/content/Intent;

    #v1=(UninitRef);
    iget-object v3, p0, Lcom/kabam/nitificationmanager/AndroidNotificationManager;->mActivity:Landroid/app/Activity;

    #v3=(Reference);
    const-class v4, Lcom/kabam/billing/BillingReceiver;

    #v4=(Reference);
    invoke-direct {v1, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 41
    .local v1, intent:Landroid/content/Intent;
    #v1=(Reference);
    const-string v3, "messagekey"

    invoke-virtual {v1, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 42
    const-string v3, "com.kabam.notification"

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 44
    iget-object v3, p0, Lcom/kabam/nitificationmanager/AndroidNotificationManager;->mActivity:Landroid/app/Activity;

    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v4

    invoke-virtual {v4, p1}, Lcom/kabam/utility/Provider;->ProvideNotificationMatch(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    const/high16 v5, 0x800

    #v5=(Integer);
    invoke-static {v3, v4, v1, v5}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    .line 45
    .local v2, pendingIntent:Landroid/app/PendingIntent;
    #v2=(Reference);
    const/4 v0, 0x0

    .line 46
    .local v0, alarmManager:Landroid/app/AlarmManager;
    #v0=(Null);
    iget-object v3, p0, Lcom/kabam/nitificationmanager/AndroidNotificationManager;->mActivity:Landroid/app/Activity;

    const-string v4, "alarm"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .end local v0           #alarmManager:Landroid/app/AlarmManager;
    #v0=(Reference);
    check-cast v0, Landroid/app/AlarmManager;

    .line 47
    .restart local v0       #alarmManager:Landroid/app/AlarmManager;
    const/4 v3, 0x0

    #v3=(Null);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    #v4=(LongLo);v5=(LongHi);
    mul-int/lit16 v6, p2, 0x3e8

    #v6=(Integer);
    int-to-long v6, v6

    #v6=(LongLo);v7=(LongHi);
    add-long/2addr v4, v6

    invoke-virtual {v0, v3, v4, v5, v2}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 50
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v3

    #v3=(Reference);
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    const-string v5, "notificaiton sent time = "

    #v5=(Reference);
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/String;)V

    .line 51
    return-void
.end method

*/}
