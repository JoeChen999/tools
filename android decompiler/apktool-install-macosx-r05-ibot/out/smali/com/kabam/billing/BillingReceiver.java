package com.kabam.billing; class BillingReceiver {/*

.class public Lcom/kabam/billing/BillingReceiver;
.super Landroid/content/BroadcastReceiver;
.source "BillingReceiver.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "BillingReceiver"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method private checkResponseCode(Landroid/content/Context;JI)V
    .locals 2
    .parameter "context"
    .parameter "requestId"
    .parameter "responseCodeIndex"

    .prologue
    .line 244
    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    const-string v1, "com.android.vending.billing.RESPONSE_CODE"

    #v1=(Reference);
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 245
    .local v0, intent:Landroid/content/Intent;
    #v0=(Reference);
    const-class v1, Lcom/kabam/billing/BillingService;

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 246
    const-string v1, "request_id"

    invoke-virtual {v0, v1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 247
    const-string v1, "response_code"

    invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 248
    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 249
    return-void
.end method

.method private notify(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2
    .parameter "context"
    .parameter "notifyId"

    .prologue
    .line 228
    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    const-string v1, "GET_PURCHASE_INFORMATION"

    #v1=(Reference);
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 229
    .local v0, intent:Landroid/content/Intent;
    #v0=(Reference);
    const-class v1, Lcom/kabam/billing/BillingService;

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 230
    const-string v1, "notification_id"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 231
    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 232
    return-void
.end method

.method private purchaseStateChanged(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .parameter "context"
    .parameter "signedData"
    .parameter "signature"

    .prologue
    .line 208
    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    const-string v1, "com.android.vending.billing.PURCHASE_STATE_CHANGED"

    #v1=(Reference);
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 209
    .local v0, intent:Landroid/content/Intent;
    #v0=(Reference);
    const-class v1, Lcom/kabam/billing/BillingService;

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 210
    const-string v1, "inapp_signed_data"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 211
    const-string v1, "inapp_signature"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 212
    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 213
    return-void
.end method

.method private trackInstall(Landroid/content/Context;)V
    .locals 2
    .parameter "context"

    .prologue
    .line 252
    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    const-string v1, "com.android.vending.INSTALL_REFERRER"

    #v1=(Reference);
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 253
    .local v0, intent:Landroid/content/Intent;
    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 254
    return-void
.end method


# virtual methods
.method public PrepareAlermManager(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .parameter "context"
    .parameter "title"
    .parameter "message"

    .prologue
    const/4 v7, 0x0

    .line 257
    #v7=(Null);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v4

    #v4=(Reference);
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    const-string v6, "notification message = "

    #v6=(Reference);
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/String;)V

    .line 258
    const/4 v3, 0x0

    .line 259
    .local v3, notificationManager:Landroid/app/NotificationManager;
    #v3=(Null);
    const-string v4, "notification"

    invoke-virtual {p1, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    .end local v3           #notificationManager:Landroid/app/NotificationManager;
    #v3=(Reference);
    check-cast v3, Landroid/app/NotificationManager;

    .line 261
    .restart local v3       #notificationManager:Landroid/app/NotificationManager;
    new-instance v4, Landroid/content/Intent;

    #v4=(UninitRef);
    sget-object v5, Lcom/kabam/utility/constance/Constance;->NotificationClass:Ljava/lang/Class;

    invoke-direct {v4, p1, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    #v4=(Reference);
    invoke-static {p1, v7, v4, v7}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 263
    .local v0, contentIntent:Landroid/app/PendingIntent;
    #v0=(Reference);
    new-instance v2, Landroid/app/Notification;

    #v2=(UninitRef);
    const v4, 0x7f020001

    #v4=(Integer);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    #v5=(LongLo);v6=(LongHi);
    invoke-direct {v2, v4, p2, v5, v6}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V

    .line 264
    .local v2, notification:Landroid/app/Notification;
    #v2=(Reference);
    const/16 v4, 0x10

    #v4=(PosByte);
    iput v4, v2, Landroid/app/Notification;->flags:I

    .line 265
    const/4 v4, -0x1

    #v4=(Byte);
    iput v4, v2, Landroid/app/Notification;->defaults:I

    .line 266
    invoke-virtual {v2, p1, p2, p3, v0}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 267
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v4, p3}, Lcom/kabam/utility/Provider;->ProvideNotificationMatch(Ljava/lang/String;)I

    move-result v1

    .line 268
    .local v1, id:I
    #v1=(Integer);
    if-ltz v1, :cond_0

    .line 269
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v4

    invoke-virtual {v4, p3}, Lcom/kabam/utility/Provider;->ProvideNotificationMatch(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    invoke-virtual {v3, v4, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 270
    :cond_0
    #v4=(Conflicted);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v4

    #v4=(Reference);
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    const-string v6, "notification id = "

    #v6=(Reference);
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/String;)V

    .line 271
    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 25
    .parameter "context"
    .parameter "intent"

    .prologue
    .line 65
    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 69
    .local v4, action:Ljava/lang/String;
    #v4=(Reference);
    const-string v20, "receive begin"

    #v20=(Reference);
    new-instance v21, Ljava/lang/StringBuilder;

    #v21=(UninitRef);
    const-string v22, "receive:"

    #v22=(Reference);
    invoke-direct/range {v21 .. v22}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v21=(Reference);
    move-object/from16 v0, v21

    #v0=(Reference);
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v20 .. v21}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    const-string v20, "com.android.vending.billing.PURCHASE_STATE_CHANGED"

    move-object/from16 v0, v20

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v20

    #v20=(Boolean);
    if-eqz v20, :cond_0

    .line 74
    const-string v20, "inapp_signed_data"

    #v20=(Reference);
    move-object/from16 v0, p2

    move-object/from16 v1, v20

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 75
    .local v18, signedData:Ljava/lang/String;
    #v18=(Reference);
    const-string v20, "inapp_signature"

    move-object/from16 v0, p2

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 77
    .local v17, signature:Ljava/lang/String;
    #v17=(Reference);
    const-string v20, "BillingReceiver"

    new-instance v21, Ljava/lang/StringBuilder;

    #v21=(UninitRef);
    const-string v22, "ACTION_PURCHASE_STATE_CHANGED. signedData="

    invoke-direct/range {v21 .. v22}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v21=(Reference);
    move-object/from16 v0, v21

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    const-string v22, "signature"

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    move-object/from16 v0, v21

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v20 .. v21}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 78
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v18

    #v2=(Reference);
    move-object/from16 v3, v17

    #v3=(Reference);
    invoke-direct {v0, v1, v2, v3}, Lcom/kabam/billing/BillingReceiver;->purchaseStateChanged(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    .end local v17           #signature:Ljava/lang/String;
    .end local v18           #signedData:Ljava/lang/String;
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);
    const-string v20, "receive end"

    move-object/from16 v0, v20

    invoke-static {v0, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 195
    return-void

    .line 80
    :cond_0
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Boolean);v21=(Reference);v22=(Reference);v23=(Uninit);v24=(Uninit);
    const-string v20, "com.android.vending.billing.IN_APP_NOTIFY"

    #v20=(Reference);
    move-object/from16 v0, v20

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v20

    #v20=(Boolean);
    if-eqz v20, :cond_1

    .line 82
    const-string v20, "notification_id"

    #v20=(Reference);
    move-object/from16 v0, p2

    move-object/from16 v1, v20

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 85
    .local v10, notifyId:Ljava/lang/String;
    #v10=(Reference);
    const-string v20, "BillingReceiver"

    new-instance v21, Ljava/lang/StringBuilder;

    #v21=(UninitRef);
    const-string v22, "notifyId: "

    invoke-direct/range {v21 .. v22}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v21=(Reference);
    move-object/from16 v0, v21

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v20 .. v21}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 87
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v10}, Lcom/kabam/billing/BillingReceiver;->notify(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 89
    .end local v10           #notifyId:Ljava/lang/String;
    :cond_1
    #v1=(Uninit);v10=(Uninit);v20=(Boolean);
    const-string v20, "com.android.vending.billing.RESPONSE_CODE"

    #v20=(Reference);
    move-object/from16 v0, v20

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v20

    #v20=(Boolean);
    if-eqz v20, :cond_2

    .line 91
    const-string v20, "request_id"

    #v20=(Reference);
    const-wide/16 v21, -0x1

    #v21=(LongLo);v22=(LongHi);
    move-object/from16 v0, p2

    move-object/from16 v1, v20

    #v1=(Reference);
    move-wide/from16 v2, v21

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v14

    .line 92
    .local v14, requestId:J
    #v14=(LongLo);v15=(LongHi);
    const-string v20, "response_code"

    .line 93
    sget-object v21, Lcom/kabam/utility/constance/Constance$ResponseCode;->RESULT_ERROR:Lcom/kabam/utility/constance/Constance$ResponseCode;

    #v21=(Reference);
    invoke-virtual/range {v21 .. v21}, Lcom/kabam/utility/constance/Constance$ResponseCode;->ordinal()I

    move-result v21

    .line 92
    #v21=(Integer);
    move-object/from16 v0, p2

    move-object/from16 v1, v20

    move/from16 v2, v21

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v16

    .line 96
    .local v16, responseCodeIndex:I
    #v16=(Integer);
    const-string v20, "BillingReceiver"

    new-instance v21, Ljava/lang/StringBuilder;

    #v21=(UninitRef);
    const-string v22, "requestId: "

    #v22=(Reference);
    invoke-direct/range {v21 .. v22}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v21=(Reference);
    move-object/from16 v0, v21

    invoke-virtual {v0, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v20 .. v21}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    const-string v20, "BillingReceiver"

    new-instance v21, Ljava/lang/StringBuilder;

    #v21=(UninitRef);
    const-string v22, "responseCodeIndex: "

    invoke-direct/range {v21 .. v22}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v21=(Reference);
    move-object/from16 v0, v21

    move/from16 v1, v16

    #v1=(Integer);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v20 .. v21}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    #v1=(Reference);
    move/from16 v2, v16

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/kabam/billing/BillingReceiver;->checkResponseCode(Landroid/content/Context;JI)V

    goto/16 :goto_0

    .line 102
    .end local v14           #requestId:J
    .end local v16           #responseCodeIndex:I
    :cond_2
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v20=(Boolean);
    const-string v20, "com.android.vending.INSTALL_REFERRER"

    #v20=(Reference);
    move-object/from16 v0, v20

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v20

    #v20=(Boolean);
    if-eqz v20, :cond_9

    .line 106
    const/4 v7, 0x0

    .line 107
    .local v7, isGoogle:Z
    #v7=(Null);
    const/4 v6, 0x0

    .line 109
    .local v6, isFacebook:Z
    :try_start_0
    #v6=(Null);
    invoke-static {}, Lcom/kabam/ad/AdRecorder;->Instance()Lcom/kabam/ad/AdRecorder;

    move-result-object v20

    #v20=(Reference);
    new-instance v21, Ljava/lang/StringBuilder;

    #v21=(UninitRef);
    const-string v22, "REFERRER_begins:has_referrer_"

    invoke-direct/range {v21 .. v22}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v21=(Reference);
    const-string v22, "referrer"

    move-object/from16 v0, p2

    move-object/from16 v1, v22

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v22

    #v22=(Boolean);
    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-virtual/range {v20 .. v21}, Lcom/kabam/ad/AdRecorder;->Record(Ljava/lang/String;)V

    .line 111
    const-string v20, "referrer"

    move-object/from16 v0, p2

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v20

    #v20=(Boolean);
    if-eqz v20, :cond_3

    .line 114
    const-string v20, "referrer"

    #v20=(Reference);
    move-object/from16 v0, p2

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    const-string v21, "&"

    invoke-virtual/range {v20 .. v21}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v13

    .line 115
    .local v13, referrers:[Ljava/lang/String;
    #v13=(Reference);
    array-length v0, v13

    #v0=(Integer);
    move/from16 v21, v0

    #v21=(Integer);
    const/16 v20, 0x0

    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v6=(Boolean);v7=(Boolean);v8=(Conflicted);v12=(Conflicted);v20=(Integer);v23=(Conflicted);v24=(Conflicted);
    move/from16 v0, v20

    #v0=(Integer);
    move/from16 v1, v21

    #v1=(Integer);
    if-lt v0, v1, :cond_5

    .line 135
    .end local v13           #referrers:[Ljava/lang/String;
    :cond_3
    #v0=(Conflicted);v1=(Conflicted);v13=(Conflicted);v21=(Conflicted);
    invoke-static {}, Lcom/kabam/ad/AdRecorder;->Instance()Lcom/kabam/ad/AdRecorder;

    move-result-object v20

    #v20=(Reference);
    new-instance v21, Ljava/lang/StringBuilder;

    #v21=(UninitRef);
    const-string v22, "_is_google_"

    #v22=(Reference);
    invoke-direct/range {v21 .. v22}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v21=(Reference);
    move-object/from16 v0, v21

    #v0=(Reference);
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-virtual/range {v20 .. v21}, Lcom/kabam/ad/AdRecorder;->Record(Ljava/lang/String;)V

    .line 136
    invoke-static {}, Lcom/kabam/ad/AdRecorder;->Instance()Lcom/kabam/ad/AdRecorder;

    move-result-object v20

    new-instance v21, Ljava/lang/StringBuilder;

    #v21=(UninitRef);
    const-string v22, "_is_facebook_"

    invoke-direct/range {v21 .. v22}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v21=(Reference);
    move-object/from16 v0, v21

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-virtual/range {v20 .. v21}, Lcom/kabam/ad/AdRecorder;->Record(Ljava/lang/String;)V

    .line 139
    if-eqz v6, :cond_8

    .line 141
    const-string v20, "campaignkey"

    const-string v21, "adgroup_id"

    move-object/from16 v0, p2

    move-object/from16 v1, v20

    #v1=(Reference);
    move-object/from16 v2, v21

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 142
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Lcom/kabam/utility/Provider;->ProvideGoogleReceiver()Lcom/kabam/ad/GoogleReceiver;

    move-result-object v20

    move-object/from16 v0, v20

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/ad/GoogleReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 154
    :cond_4
    :goto_2
    #v1=(Conflicted);v2=(Conflicted);v11=(Conflicted);
    new-instance v19, Lcom/mobileapptracker/Tracker;

    #v19=(UninitRef);
    invoke-direct/range {v19 .. v19}, Lcom/mobileapptracker/Tracker;-><init>()V

    .line 155
    .local v19, trackReceiver:Lcom/mobileapptracker/Tracker;
    #v19=(Reference);
    move-object/from16 v0, v19

    move-object/from16 v1, p1

    #v1=(Reference);
    move-object/from16 v2, p2

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Lcom/mobileapptracker/Tracker;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 161
    const-string v20, "BillingReceiver"

    const-string v21, "ad ACTION_INSTALL_REFERRER: Arrives."

    invoke-static/range {v20 .. v21}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 165
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v20

    const-string v21, "ad mat ACTION_INSTALL_REFERRER: Arrives."

    invoke-virtual/range {v20 .. v21}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 174
    invoke-static {}, Lcom/kabam/ad/AdRecorder;->Instance()Lcom/kabam/ad/AdRecorder;

    move-result-object v20

    move-object/from16 v0, v20

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lcom/kabam/ad/AdRecorder;->SendToServer(Landroid/content/Context;)V

    goto/16 :goto_0

    .line 115
    .end local v19           #trackReceiver:Lcom/mobileapptracker/Tracker;
    .restart local v13       #referrers:[Ljava/lang/String;
    :cond_5
    :try_start_1
    #v0=(Integer);v1=(Integer);v2=(Uninit);v11=(Uninit);v13=(Reference);v19=(Uninit);v20=(Integer);v21=(Integer);v22=(Boolean);
    aget-object v12, v13, v20

    .line 117
    .local v12, referrerValue:Ljava/lang/String;
    #v12=(Null);
    const-string v22, "="

    #v22=(Reference);
    move-object/from16 v0, v22

    #v0=(Reference);
    invoke-virtual {v12, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 122
    .local v8, keyValue:[Ljava/lang/String;
    #v8=(Reference);
    invoke-static {}, Lcom/kabam/ad/AdRecorder;->Instance()Lcom/kabam/ad/AdRecorder;

    move-result-object v22

    new-instance v23, Ljava/lang/StringBuilder;

    #v23=(UninitRef);
    const-string v24, "_key_"

    #v24=(Reference);
    invoke-direct/range {v23 .. v24}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v23=(Reference);
    const/16 v24, 0x0

    #v24=(Null);
    aget-object v24, v8, v24

    invoke-virtual/range {v24 .. v24}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v24

    #v24=(Reference);
    invoke-virtual/range {v24 .. v24}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {v23 .. v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v23

    invoke-virtual/range {v22 .. v23}, Lcom/kabam/ad/AdRecorder;->Record(Ljava/lang/String;)V

    .line 123
    invoke-static {}, Lcom/kabam/ad/AdRecorder;->Instance()Lcom/kabam/ad/AdRecorder;

    move-result-object v22

    new-instance v23, Ljava/lang/StringBuilder;

    #v23=(UninitRef);
    const-string v24, "_value_"

    invoke-direct/range {v23 .. v24}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v23=(Reference);
    const/16 v24, 0x1

    #v24=(One);
    aget-object v24, v8, v24

    #v24=(Null);
    invoke-virtual/range {v24 .. v24}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v24

    #v24=(Reference);
    invoke-virtual/range {v24 .. v24}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {v23 .. v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v23

    invoke-virtual/range {v22 .. v23}, Lcom/kabam/ad/AdRecorder;->Record(Ljava/lang/String;)V

    .line 124
    const/16 v22, 0x0

    #v22=(Null);
    aget-object v22, v8, v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v22

    #v22=(Reference);
    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v22

    const-string v23, "utm_source"

    invoke-virtual/range {v22 .. v23}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22

    #v22=(Boolean);
    if-eqz v22, :cond_7

    const/16 v22, 0x1

    #v22=(One);
    aget-object v22, v8, v22

    #v22=(Null);
    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v22

    #v22=(Reference);
    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v22

    const-string v23, "google"

    invoke-virtual/range {v22 .. v23}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22

    #v22=(Boolean);
    if-eqz v22, :cond_7

    .line 126
    const/4 v7, 0x1

    .line 115
    :cond_6
    :goto_3
    add-int/lit8 v20, v20, 0x1

    goto/16 :goto_1

    .line 128
    :cond_7
    const/16 v22, 0x0

    #v22=(Null);
    aget-object v22, v8, v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v22

    #v22=(Reference);
    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v22

    const-string v23, "utm_source"

    invoke-virtual/range {v22 .. v23}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22

    #v22=(Boolean);
    if-eqz v22, :cond_6

    const/16 v22, 0x1

    #v22=(One);
    aget-object v22, v8, v22

    #v22=(Null);
    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v22

    #v22=(Reference);
    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v22

    const-string v23, "apps.facebook.com"

    invoke-virtual/range {v22 .. v23}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22

    #v22=(Boolean);
    if-eqz v22, :cond_6

    .line 130
    const/4 v6, 0x1

    #v6=(One);
    goto :goto_3

    .line 144
    .end local v8           #keyValue:[Ljava/lang/String;
    .end local v12           #referrerValue:Ljava/lang/String;
    .end local v13           #referrers:[Ljava/lang/String;
    :cond_8
    #v1=(Conflicted);v6=(Boolean);v8=(Conflicted);v12=(Conflicted);v13=(Conflicted);v20=(Reference);v21=(Reference);v22=(Reference);v23=(Conflicted);v24=(Conflicted);
    if-eqz v7, :cond_4

    .line 147
    new-instance v11, Lcom/google/android/apps/analytics/AnalyticsReceiver;

    #v11=(UninitRef);
    invoke-direct {v11}, Lcom/google/android/apps/analytics/AnalyticsReceiver;-><init>()V

    .line 148
    .local v11, receiver:Lcom/google/android/apps/analytics/AnalyticsReceiver;
    #v11=(Reference);
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    #v1=(Reference);
    invoke-virtual {v11, v0, v1}, Lcom/google/android/apps/analytics/AnalyticsReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 150
    const-string v20, "campaignkey"

    const-string v21, "utm_campaign"

    move-object/from16 v0, p2

    move-object/from16 v1, v20

    move-object/from16 v2, v21

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 151
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Lcom/kabam/utility/Provider;->ProvideGoogleReceiver()Lcom/kabam/ad/GoogleReceiver;

    move-result-object v20

    move-object/from16 v0, v20

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/ad/GoogleReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_2

    .line 168
    .end local v11           #receiver:Lcom/google/android/apps/analytics/AnalyticsReceiver;
    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v11=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);
    move-exception v5

    .line 170
    .local v5, ex:Ljava/lang/Exception;
    :try_start_2
    #v5=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v20

    #v20=(Reference);
    move-object/from16 v0, v20

    #v0=(Reference);
    invoke-virtual {v0, v5}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 174
    invoke-static {}, Lcom/kabam/ad/AdRecorder;->Instance()Lcom/kabam/ad/AdRecorder;

    move-result-object v20

    move-object/from16 v0, v20

    move-object/from16 v1, p1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/kabam/ad/AdRecorder;->SendToServer(Landroid/content/Context;)V

    goto/16 :goto_0

    .line 173
    .end local v5           #ex:Ljava/lang/Exception;
    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);v20=(Conflicted);
    move-exception v20

    .line 174
    #v20=(Reference);
    invoke-static {}, Lcom/kabam/ad/AdRecorder;->Instance()Lcom/kabam/ad/AdRecorder;

    move-result-object v21

    #v21=(Reference);
    move-object/from16 v0, v21

    #v0=(Reference);
    move-object/from16 v1, p1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/kabam/ad/AdRecorder;->SendToServer(Landroid/content/Context;)V

    .line 175
    throw v20

    .line 178
    .end local v6           #isFacebook:Z
    .end local v7           #isGoogle:Z
    :cond_9
    #v1=(Uninit);v2=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v19=(Uninit);v20=(Boolean);v22=(Reference);v23=(Uninit);v24=(Uninit);
    const-string v20, "com.kabam.notification"

    #v20=(Reference);
    move-object/from16 v0, v20

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v20

    #v20=(Boolean);
    if-eqz v20, :cond_c

    .line 180
    const-string v20, "messagekey"

    #v20=(Reference);
    move-object/from16 v0, p2

    move-object/from16 v1, v20

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 181
    .local v9, message:Ljava/lang/String;
    #v9=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v20

    new-instance v21, Ljava/lang/StringBuilder;

    #v21=(UninitRef);
    const-string v22, "message"

    invoke-direct/range {v21 .. v22}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v21=(Reference);
    move-object/from16 v0, v21

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-virtual/range {v20 .. v21}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/String;)V

    .line 182
    if-eqz v9, :cond_a

    const-string v20, ""

    move-object/from16 v0, v20

    if-ne v9, v0, :cond_b

    :cond_a
    const-string v9, ""

    .line 183
    :cond_b
    const-string v20, "Hobbit: KoM"

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v20

    #v2=(Reference);
    invoke-virtual {v0, v1, v2, v9}, Lcom/kabam/billing/BillingReceiver;->PrepareAlermManager(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 188
    .end local v9           #message:Ljava/lang/String;
    :cond_c
    #v1=(Uninit);v2=(Uninit);v9=(Uninit);v20=(Boolean);
    const-string v20, "BillingReceiver"

    #v20=(Reference);
    new-instance v21, Ljava/lang/StringBuilder;

    #v21=(UninitRef);
    const-string v22, "unexpected action: "

    invoke-direct/range {v21 .. v22}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v21=(Reference);
    move-object/from16 v0, v21

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v20 .. v21}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0
.end method

*/}
