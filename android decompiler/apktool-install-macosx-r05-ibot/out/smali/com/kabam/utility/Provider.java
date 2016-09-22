package com.kabam.utility; class Provider {/*

.class public Lcom/kabam/utility/Provider;
.super Ljava/lang/Object;
.source "Provider.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kabam/utility/Provider$LoginInformation;,
        Lcom/kabam/utility/Provider$PurchasedInformation;
    }
.end annotation


# static fields
.field static count:I

.field private static mInformation:Lcom/kabam/utility/Provider$LoginInformation;

.field static match:Ljava/util/Hashtable;

.field private static sInstance:Lcom/kabam/utility/Provider;


# instance fields
.field private final RANDOM:Ljava/security/SecureRandom;

.field private mActivity:Landroid/app/Activity;

.field private mBillingInApp:Lcom/kabam/billing/BillingInApp;

.field private mFacebook:Lcom/facebook/android/Facebook;

.field private mFacebookSender:Lcom/kabam/facebook/FacebookSender;

.field private mGoogleReceiver:Lcom/kabam/ad/GoogleReceiver;

.field private mInventory:Lcom/kabam/playv3/Inventory;

.field private mIsSupported:Z

.field private mNotificationManager:Lcom/kabam/billing/NotificationManager;

.field private mTapJoy:Lcom/kabam/tapjoy/TapJoy;

.field private mV3:Lcom/kabam/billing/GooglePlayV3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 61
    new-instance v0, Lcom/kabam/utility/Provider;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/kabam/utility/Provider;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/kabam/utility/Provider;->sInstance:Lcom/kabam/utility/Provider;

    .line 382
    new-instance v0, Lcom/kabam/utility/Provider$LoginInformation;

    #v0=(UninitRef);
    sget-object v1, Lcom/kabam/utility/Provider;->sInstance:Lcom/kabam/utility/Provider;

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, v1}, Lcom/kabam/utility/Provider$LoginInformation;-><init>(Lcom/kabam/utility/Provider;)V

    #v0=(Reference);
    sput-object v0, Lcom/kabam/utility/Provider;->mInformation:Lcom/kabam/utility/Provider$LoginInformation;

    .line 443
    new-instance v0, Ljava/util/Hashtable;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/kabam/utility/Provider;->match:Ljava/util/Hashtable;

    .line 444
    const/4 v0, 0x0

    #v0=(Null);
    sput v0, Lcom/kabam/utility/Provider;->count:I

    .line 59
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 59
    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    #p0=(Reference);
    new-instance v0, Ljava/security/SecureRandom;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/utility/Provider;->RANDOM:Ljava/security/SecureRandom;

    .line 63
    iput-object v1, p0, Lcom/kabam/utility/Provider;->mActivity:Landroid/app/Activity;

    .line 64
    iput-object v1, p0, Lcom/kabam/utility/Provider;->mBillingInApp:Lcom/kabam/billing/BillingInApp;

    .line 65
    iput-object v1, p0, Lcom/kabam/utility/Provider;->mNotificationManager:Lcom/kabam/billing/NotificationManager;

    .line 66
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/kabam/utility/Provider;->mIsSupported:Z

    .line 67
    iput-object v1, p0, Lcom/kabam/utility/Provider;->mFacebookSender:Lcom/kabam/facebook/FacebookSender;

    .line 68
    iput-object v1, p0, Lcom/kabam/utility/Provider;->mFacebook:Lcom/facebook/android/Facebook;

    .line 470
    new-instance v0, Lcom/kabam/ad/GoogleReceiver;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/kabam/ad/GoogleReceiver;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/utility/Provider;->mGoogleReceiver:Lcom/kabam/ad/GoogleReceiver;

    .line 560
    new-instance v0, Lcom/kabam/tapjoy/TapJoy;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/kabam/tapjoy/TapJoy;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/utility/Provider;->mTapJoy:Lcom/kabam/tapjoy/TapJoy;

    .line 574
    new-instance v0, Lcom/kabam/billing/GooglePlayV3;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/kabam/billing/GooglePlayV3;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/utility/Provider;->mV3:Lcom/kabam/billing/GooglePlayV3;

    .line 579
    iput-object v1, p0, Lcom/kabam/utility/Provider;->mInventory:Lcom/kabam/playv3/Inventory;

    .line 59
    return-void
.end method

.method private GetPurchasedState(Ljava/lang/String;)Lcom/kabam/utility/Provider$PurchasedInformation;
    .locals 8
    .parameter "json"

    .prologue
    .line 237
    new-instance v3, Lcom/kabam/utility/Provider$PurchasedInformation;

    #v3=(UninitRef);
    const/4 v7, 0x0

    #v7=(Null);
    invoke-direct {v3, p0, v7}, Lcom/kabam/utility/Provider$PurchasedInformation;-><init>(Lcom/kabam/utility/Provider;Lcom/kabam/utility/Provider$PurchasedInformation;)V

    .line 240
    .local v3, infor:Lcom/kabam/utility/Provider$PurchasedInformation;
    :try_start_0
    #v3=(Reference);
    new-instance v4, Lorg/json/JSONObject;

    #v4=(UninitRef);
    invoke-direct {v4, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 241
    .local v4, jo:Lorg/json/JSONObject;
    #v4=(Reference);
    const-string v7, "orders"

    #v7=(Reference);
    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 242
    .local v0, array:Lorg/json/JSONArray;
    #v0=(Reference);
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v5

    .line 243
    .local v5, length:I
    #v5=(Integer);
    const/4 v2, 0x0

    .local v2, i:I
    #v2=(Null);
    if-ge v2, v5, :cond_0

    .line 245
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 246
    .local v6, purchasedStateJSON:Lorg/json/JSONObject;
    #v6=(Reference);
    const-string v7, "notificationId"

    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    iput v7, v3, Lcom/kabam/utility/Provider$PurchasedInformation;->PurchasedState:I

    .line 247
    const-string v7, "purchaseState"

    #v7=(Reference);
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v3, Lcom/kabam/utility/Provider$PurchasedInformation;->NotificationId:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 258
    .end local v0           #array:Lorg/json/JSONArray;
    .end local v2           #i:I
    .end local v4           #jo:Lorg/json/JSONObject;
    .end local v5           #length:I
    .end local v6           #purchasedStateJSON:Lorg/json/JSONObject;
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-object v3

    .line 252
    :catch_0
    #v1=(Uninit);v7=(Conflicted);
    move-exception v1

    .line 254
    .local v1, e:Lorg/json/JSONException;
    :try_start_1
    #v1=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v7

    #v7=(Reference);
    invoke-virtual {v7, v1}, Lcom/kabam/utility/Provider;->OnSendPaymentException(Ljava/lang/Exception;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .end local v1           #e:Lorg/json/JSONException;
    :catchall_0
    #v1=(Conflicted);v7=(Conflicted);
    move-exception v7

    #v7=(Reference);
    goto :goto_0
.end method

.method public static Instance()Lcom/kabam/utility/Provider;
    .locals 1

    .prologue
    .line 72
    sget-object v0, Lcom/kabam/utility/Provider;->sInstance:Lcom/kabam/utility/Provider;

    #v0=(Reference);
    return-object v0
.end method

.method private ProvideVerifyServiceStandAlone(Ljava/lang/String;Ljava/lang/String;Lcom/kabam/billing/BillingService;)Ljava/util/ArrayList;
    .locals 11
    .parameter "signedData"
    .parameter "signature"
    .parameter "service"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/kabam/billing/BillingService;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 146
    invoke-static {p1, p2}, Lcom/kabam/billing/Security;->verifyPurchase(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v8

    .line 147
    .local v8, purchases:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Lcom/kabam/billing/Security$VerifiedPurchase;>;"
    #v8=(Reference);
    if-nez v8, :cond_1

    .line 148
    const/4 v7, 0x0

    .line 162
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Reference);v9=(Conflicted);v10=(Conflicted);
    return-object v7

    .line 151
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Uninit);v10=(Uninit);
    new-instance v7, Ljava/util/ArrayList;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 152
    .local v7, notifyList:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Ljava/lang/String;>;"
    #v7=(Reference);
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v9=(Conflicted);v10=(Reference);
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    #v9=(Reference);
    check-cast v9, Lcom/kabam/billing/Security$VerifiedPurchase;

    .line 154
    .local v9, vp:Lcom/kabam/billing/Security$VerifiedPurchase;
    iget-object v0, v9, Lcom/kabam/billing/Security$VerifiedPurchase;->notificationId:Ljava/lang/String;

    #v0=(Reference);
    if-eqz v0, :cond_2

    .line 156
    iget-object v0, v9, Lcom/kabam/billing/Security$VerifiedPurchase;->notificationId:Ljava/lang/String;

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    :cond_2
    iget-object v1, v9, Lcom/kabam/billing/Security$VerifiedPurchase;->purchaseState:Lcom/kabam/utility/constance/Constance$PurchaseState;

    .line 159
    #v1=(Reference);
    iget-object v2, v9, Lcom/kabam/billing/Security$VerifiedPurchase;->productId:Ljava/lang/String;

    #v2=(Reference);
    iget-object v3, v9, Lcom/kabam/billing/Security$VerifiedPurchase;->orderId:Ljava/lang/String;

    #v3=(Reference);
    iget-wide v4, v9, Lcom/kabam/billing/Security$VerifiedPurchase;->purchaseTime:J

    .line 160
    #v4=(LongLo);v5=(LongHi);
    iget-object v6, v9, Lcom/kabam/billing/Security$VerifiedPurchase;->developerPayload:Ljava/lang/String;

    #v6=(Reference);
    move-object v0, p3

    .line 158
    invoke-static/range {v0 .. v6}, Lcom/kabam/billing/ResponseHandler;->purchaseResponse(Landroid/content/Context;Lcom/kabam/utility/constance/Constance$PurchaseState;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    goto :goto_0
.end method

.method private ProvideVerifyServiceUnity(Ljava/lang/String;Ljava/lang/String;Lcom/kabam/billing/BillingService;)Ljava/util/ArrayList;
    .locals 1
    .parameter "signedData"
    .parameter "signature"
    .parameter "service"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/kabam/billing/BillingService;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 141
    const/4 v0, 0x0

    #v0=(Null);
    return-object v0
.end method

.method private purchaseStateChangedStandalone(ILjava/lang/String;Ljava/lang/String;Lcom/kabam/billing/BillingService;)V
    .locals 3
    .parameter "startId"
    .parameter "signedData"
    .parameter "signature"
    .parameter "service"

    .prologue
    .line 265
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2, p2, p3, p4}, Lcom/kabam/utility/Provider;->ProvideVerifyService(Ljava/lang/String;Ljava/lang/String;Lcom/kabam/billing/BillingService;)Ljava/util/ArrayList;

    move-result-object v1

    .line 266
    .local v1, notifyList:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Ljava/lang/String;>;"
    #v1=(Reference);
    if-nez v1, :cond_1

    .line 274
    :cond_0
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    .line 268
    :cond_1
    #v0=(Uninit);v2=(Reference);
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    .line 270
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    #v2=(Integer);
    new-array v2, v2, [Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, [Ljava/lang/String;

    .line 271
    .local v0, notifyIds:[Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 272
    invoke-virtual {p4, p1, v0}, Lcom/kabam/billing/BillingService;->confirmNotifications(I[Ljava/lang/String;)Z

    goto :goto_0
.end method

.method private purchaseStateChangedUnity(ILjava/lang/String;Ljava/lang/String;Lcom/kabam/billing/BillingService;)V
    .locals 2
    .parameter "startId"
    .parameter "signedData"
    .parameter "signature"
    .parameter "service"

    .prologue
    .line 211
    const-string v0, "purchaseStateChangedUnity"

    #v0=(Reference);
    const-string v1, "before send to unity."

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 212
    const-string v0, "signature="

    invoke-static {v0, p3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 213
    const-string v0, "signedData="

    invoke-static {v0, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 220
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    const-string v1, "@=>@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kabam/utility/UnitySender;->SendVerifyPayment(Ljava/lang/String;)V

    .line 227
    return-void
.end method


# virtual methods
.method public GetActivity()Landroid/app/Activity;
    .locals 1

    .prologue
    .line 170
    iget-object v0, p0, Lcom/kabam/utility/Provider;->mActivity:Landroid/app/Activity;

    #v0=(Reference);
    return-object v0
.end method

.method public GetBillingInApp()Lcom/kabam/billing/BillingInApp;
    .locals 1

    .prologue
    .line 178
    iget-object v0, p0, Lcom/kabam/utility/Provider;->mBillingInApp:Lcom/kabam/billing/BillingInApp;

    #v0=(Reference);
    return-object v0
.end method

.method public IsSupported()Z
    .locals 1

    .prologue
    .line 77
    iget-boolean v0, p0, Lcom/kabam/utility/Provider;->mIsSupported:Z

    #v0=(Boolean);
    return v0
.end method

.method public IsVerified(Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5
    .parameter "publicKey"
    .parameter "signedData"
    .parameter "signature"

    .prologue
    const/4 v2, 0x0

    .line 99
    :try_start_0
    #v2=(Null);
    const-string v3, "SHA1withRSA"

    #v3=(Reference);
    invoke-static {v3}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v1

    .line 100
    .local v1, sig:Ljava/security/Signature;
    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    .line 101
    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/security/Signature;->update([B)V

    .line 102
    invoke-static {p3}, Lcom/kabam/billing/util/Base64;->decode(Ljava/lang/String;)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/security/Signature;->verify([B)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_0

    .line 104
    const-string v3, "verivy"

    #v3=(Reference);
    const-string v4, "Signature verification failed."

    #v4=(Reference);
    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/kabam/billing/util/Base64DecoderException; {:try_start_0 .. :try_end_0} :catch_3

    .line 125
    .end local v1           #sig:Ljava/security/Signature;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);
    return v2

    .line 107
    .restart local v1       #sig:Ljava/security/Signature;
    :cond_0
    #v0=(Uninit);v1=(Reference);v2=(Null);v3=(Boolean);v4=(Uninit);
    const/4 v2, 0x1

    #v2=(One);
    goto :goto_0

    .line 109
    .end local v1           #sig:Ljava/security/Signature;
    :catch_0
    #v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Conflicted);
    move-exception v0

    .line 111
    .local v0, e:Ljava/security/NoSuchAlgorithmException;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0

    .line 113
    .end local v0           #e:Ljava/security/NoSuchAlgorithmException;
    :catch_1
    #v0=(Uninit);v3=(Conflicted);
    move-exception v0

    .line 115
    .local v0, e:Ljava/security/InvalidKeyException;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0

    .line 117
    .end local v0           #e:Ljava/security/InvalidKeyException;
    :catch_2
    #v0=(Uninit);v3=(Conflicted);
    move-exception v0

    .line 119
    .local v0, e:Ljava/security/SignatureException;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0

    .line 121
    .end local v0           #e:Ljava/security/SignatureException;
    :catch_3
    #v0=(Uninit);v3=(Conflicted);
    move-exception v0

    .line 123
    .local v0, e:Lcom/kabam/billing/util/Base64DecoderException;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public OnLogException(Ljava/lang/Exception;)V
    .locals 0
    .parameter "ex"

    .prologue
    .line 292
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 294
    return-void
.end method

.method public OnLogException(Ljava/lang/String;)V
    .locals 1
    .parameter "message"

    .prologue
    .line 416
    const-string v0, "error"

    #v0=(Reference);
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 417
    return-void
.end method

.method public OnPurchaseStateChanged(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5
    .parameter "data"
    .parameter "signature"

    .prologue
    const/4 v3, 0x0

    .line 367
    :try_start_0
    #v3=(Null);
    new-instance v2, Lorg/json/JSONObject;

    #v2=(UninitRef);
    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 368
    .local v2, jo:Lorg/json/JSONObject;
    #v2=(Reference);
    if-nez v2, :cond_1

    .line 378
    .end local v2           #jo:Lorg/json/JSONObject;
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Conflicted);
    return v3

    .line 369
    .restart local v2       #jo:Lorg/json/JSONObject;
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Reference);v3=(Null);v4=(Uninit);
    const-string v4, "orders"

    #v4=(Reference);
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 370
    .local v0, array:Lorg/json/JSONArray;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 371
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v4

    #v4=(Integer);
    if-lez v4, :cond_0

    .line 378
    const/4 v3, 0x1

    #v3=(One);
    goto :goto_0

    .line 373
    .end local v0           #array:Lorg/json/JSONArray;
    .end local v2           #jo:Lorg/json/JSONObject;
    :catch_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Null);v4=(Conflicted);
    move-exception v1

    .line 375
    .local v1, e:Ljava/lang/Exception;
    #v1=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v4, v1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public OnSendPaymentException(Ljava/lang/Exception;)V
    .locals 3
    .parameter "ex"

    .prologue
    .line 278
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, p1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    .line 282
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "11,"

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/kabam/utility/UnitySender;->SendPaymentErrorToServer(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 288
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    .line 284
    :catch_0
    #v0=(Uninit);v1=(Conflicted);
    move-exception v0

    .line 286
    .local v0, e:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public OnUICanceled()V
    .locals 0

    .prologue
    .line 398
    invoke-static {}, Lcom/kabam/utility/UnitySender;->SendCancelBill()V

    .line 399
    return-void
.end method

.method public ProvideAdwords()Lcom/kabam/ad/Adwords;
    .locals 1

    .prologue
    .line 436
    invoke-static {}, Lcom/kabam/ad/Adwords;->Instance()Lcom/kabam/ad/Adwords;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public ProvideFacebookAuthorizeCallBack(IILandroid/content/Intent;)V
    .locals 1
    .parameter "requestCode"
    .parameter "resultCode"
    .parameter "data"

    .prologue
    .line 422
    iget-object v0, p0, Lcom/kabam/utility/Provider;->mFacebookSender:Lcom/kabam/facebook/FacebookSender;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 424
    :goto_0
    return-void

    .line 423
    :cond_0
    iget-object v0, p0, Lcom/kabam/utility/Provider;->mFacebookSender:Lcom/kabam/facebook/FacebookSender;

    invoke-virtual {v0, p1, p2, p3}, Lcom/kabam/facebook/FacebookSender;->AuthorizeCallBack(IILandroid/content/Intent;)V

    goto :goto_0
.end method

.method public ProvideFacebookSender()Lcom/kabam/facebook/FacebookSender;
    .locals 1

    .prologue
    .line 432
    iget-object v0, p0, Lcom/kabam/utility/Provider;->mFacebookSender:Lcom/kabam/facebook/FacebookSender;

    #v0=(Reference);
    return-object v0
.end method

.method public ProvideGetInformation()V
    .locals 2

    .prologue
    .line 309
    const-string v0, "thread"

    #v0=(Reference);
    const-string v1, "notification thread is running"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 361
    return-void
.end method

.method public ProvideGooglePlayV3()Lcom/kabam/billing/GooglePlayV3;
    .locals 1

    .prologue
    .line 577
    iget-object v0, p0, Lcom/kabam/utility/Provider;->mV3:Lcom/kabam/billing/GooglePlayV3;

    #v0=(Reference);
    return-object v0
.end method

.method public ProvideGoogleReceiver()Lcom/kabam/ad/GoogleReceiver;
    .locals 1

    .prologue
    .line 474
    iget-object v0, p0, Lcom/kabam/utility/Provider;->mGoogleReceiver:Lcom/kabam/ad/GoogleReceiver;

    #v0=(Reference);
    return-object v0
.end method

.method public ProvideInventory()Lcom/kabam/playv3/Inventory;
    .locals 3

    .prologue
    .line 587
    const-string v1, "ProvideInventory"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v0, "ProvideInventory: Inventory. mInventory == null:"

    #v0=(Reference);
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    iget-object v0, p0, Lcom/kabam/utility/Provider;->mInventory:Lcom/kabam/playv3/Inventory;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 588
    iget-object v0, p0, Lcom/kabam/utility/Provider;->mInventory:Lcom/kabam/playv3/Inventory;

    return-object v0

    .line 587
    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public ProvideJSONParser()Lcom/kabam/billing/AndroidJSONParser;
    .locals 1

    .prologue
    .line 440
    invoke-static {}, Lcom/kabam/billing/AndroidJSONParser;->Instance()Lcom/kabam/billing/AndroidJSONParser;

    invoke-static {}, Lcom/kabam/billing/AndroidJSONParser;->Instance()Lcom/kabam/billing/AndroidJSONParser;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public ProvideJasonString(Landroid/content/Intent;)Ljava/lang/String;
    .locals 7
    .parameter "intent"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 478
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 479
    .local v0, bundle:Landroid/os/Bundle;
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v4

    .line 480
    .local v4, set:Ljava/util/Set;,"Ljava/util/Set<Ljava/lang/String;>;"
    #v4=(Reference);
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 481
    .local v1, it:Ljava/util/Iterator;,"Ljava/util/Iterator<Ljava/lang/String;>;"
    #v1=(Reference);
    const-string v3, ""

    .line 482
    .local v3, key:Ljava/lang/String;
    #v3=(Reference);
    const-string v5, ""

    .line 483
    .local v5, value:Ljava/lang/String;
    #v5=(Reference);
    new-instance v2, Lorg/json/JSONObject;

    #v2=(UninitRef);
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 487
    .local v2, json:Lorg/json/JSONObject;
    :goto_0
    #v2=(Reference);v6=(Conflicted);
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    #v6=(Boolean);
    if-nez v6, :cond_0

    .line 493
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    #v6=(Reference);
    return-object v6

    .line 488
    :cond_0
    #v6=(Boolean);
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .end local v3           #key:Ljava/lang/String;
    check-cast v3, Ljava/lang/String;

    .line 489
    .restart local v3       #key:Ljava/lang/String;
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    #v6=(Reference);
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 490
    invoke-virtual {v2, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0
.end method

.method public ProvideLog(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .parameter "title"
    .parameter "log"

    .prologue
    .line 569
    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 570
    return-void
.end method

.method public ProvideLoginInformation()Lcom/kabam/utility/Provider$LoginInformation;
    .locals 1

    .prologue
    .line 386
    sget-object v0, Lcom/kabam/utility/Provider;->mInformation:Lcom/kabam/utility/Provider$LoginInformation;

    #v0=(Reference);
    return-object v0
.end method

.method public ProvideMAT()Lcom/kabam/ad/MATracker;
    .locals 1

    .prologue
    .line 467
    invoke-static {}, Lcom/kabam/ad/MATracker;->Instance()Lcom/kabam/ad/MATracker;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public ProvideNanigans(Landroid/app/Activity;)Lcom/kabam/nanigans/Nanigans;
    .locals 1
    .parameter "activity"

    .prologue
    .line 557
    new-instance v0, Lcom/kabam/nanigans/Nanigans;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Lcom/kabam/nanigans/Nanigans;-><init>(Landroid/app/Activity;)V

    #v0=(Reference);
    return-object v0
.end method

.method public ProvideNewFacebookSender(Landroid/app/Activity;Ljava/lang/String;)Lcom/kabam/facebook/FacebookSender;
    .locals 1
    .parameter "activity"
    .parameter "appID"

    .prologue
    .line 428
    new-instance v0, Lcom/kabam/facebook/FacebookSender;

    #v0=(UninitRef);
    invoke-direct {v0, p1, p2}, Lcom/kabam/facebook/FacebookSender;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/utility/Provider;->mFacebookSender:Lcom/kabam/facebook/FacebookSender;

    return-object v0
.end method

.method public ProvideNotificationManager()Lcom/kabam/billing/NotificationManager;
    .locals 2

    .prologue
    .line 299
    iget-object v0, p0, Lcom/kabam/utility/Provider;->mNotificationManager:Lcom/kabam/billing/NotificationManager;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 300
    iget-object v0, p0, Lcom/kabam/utility/Provider;->mActivity:Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 301
    new-instance v0, Lcom/kabam/billing/NotificationManager;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/kabam/utility/Provider;->mActivity:Landroid/app/Activity;

    #v1=(Reference);
    invoke-direct {v0, v1}, Lcom/kabam/billing/NotificationManager;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/utility/Provider;->mNotificationManager:Lcom/kabam/billing/NotificationManager;

    .line 303
    :cond_0
    #v1=(Conflicted);
    iget-object v0, p0, Lcom/kabam/utility/Provider;->mNotificationManager:Lcom/kabam/billing/NotificationManager;

    return-object v0
.end method

.method public ProvideNotificationMatch(Ljava/lang/String;)I
    .locals 3
    .parameter "message"

    .prologue
    const/4 v1, -0x1

    .line 447
    #v1=(Byte);
    if-nez p1, :cond_1

    .line 462
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Integer);v2=(Conflicted);
    return v1

    .line 448
    :cond_1
    #v0=(Uninit);v1=(Byte);v2=(Uninit);
    const-string v2, ""

    #v2=(Reference);
    if-eq p1, v2, :cond_0

    .line 451
    :try_start_0
    sget-object v1, Lcom/kabam/utility/Provider;->match:Ljava/util/Hashtable;

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    .line 452
    sget-object v1, Lcom/kabam/utility/Provider;->match:Ljava/util/Hashtable;

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    goto :goto_0

    .line 455
    :cond_2
    #v1=(Boolean);
    sget-object v1, Lcom/kabam/utility/Provider;->match:Ljava/util/Hashtable;

    #v1=(Reference);
    sget v2, Lcom/kabam/utility/Provider;->count:I

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v1, p1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    sget v1, Lcom/kabam/utility/Provider;->count:I

    #v1=(Integer);
    add-int/lit8 v2, v1, 0x1

    #v2=(Integer);
    sput v2, Lcom/kabam/utility/Provider;->count:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 459
    :catch_0
    #v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    .line 461
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    .line 462
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0
.end method

.method public ProvideNounce()J
    .locals 2

    .prologue
    .line 86
    iget-object v0, p0, Lcom/kabam/utility/Provider;->RANDOM:Ljava/security/SecureRandom;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/security/SecureRandom;->nextLong()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method public ProvideOnCheckSupported(Z)V
    .locals 0
    .parameter "supported"

    .prologue
    .line 410
    if-nez p1, :cond_0

    .line 411
    invoke-virtual {p0}, Lcom/kabam/utility/Provider;->OnUICanceled()V

    .line 412
    :cond_0
    return-void
.end method

.method public ProvideOnResponseCode(I)V
    .locals 0
    .parameter "responseCodeIndex"

    .prologue
    .line 402
    if-eqz p1, :cond_0

    .line 404
    invoke-virtual {p0}, Lcom/kabam/utility/Provider;->OnUICanceled()V

    .line 406
    :cond_0
    return-void
.end method

.method public ProvidePublicKey()Ljava/security/PublicKey;
    .locals 2

    .prologue
    .line 90
    const-string v0, "Ming Cai\'s public key."

    .line 91
    .local v0, base64EncodedPublicKey:Ljava/lang/String;
    #v0=(Reference);
    invoke-static {v0}, Lcom/kabam/billing/Security;->generatePublicKey(Ljava/lang/String;)Ljava/security/PublicKey;

    move-result-object v1

    .line 92
    .local v1, key:Ljava/security/PublicKey;
    #v1=(Reference);
    return-object v1
.end method

.method public ProvideSend(Ljava/lang/String;)V
    .locals 11
    .parameter "address"

    .prologue
    .line 498
    new-instance v8, Landroid/os/StrictMode$ThreadPolicy$Builder;

    #v8=(UninitRef);
    invoke-direct {v8}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    #v8=(Reference);
    invoke-virtual {v8}, Landroid/os/StrictMode$ThreadPolicy$Builder;->permitAll()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v8

    invoke-virtual {v8}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v4

    .line 499
    .local v4, policy:Landroid/os/StrictMode$ThreadPolicy;
    #v4=(Reference);
    invoke-static {v4}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 501
    new-instance v5, Lorg/apache/http/client/methods/HttpGet;

    #v5=(UninitRef);
    invoke-direct {v5, p1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 504
    .local v5, request:Lorg/apache/http/client/methods/HttpGet;
    :try_start_0
    #v5=(Reference);
    new-instance v8, Lorg/apache/http/impl/client/DefaultHttpClient;

    #v8=(UninitRef);
    invoke-direct {v8}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    #v8=(Reference);
    invoke-virtual {v8, v5}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v6

    .line 505
    .local v6, response:Lorg/apache/http/HttpResponse;
    #v6=(Reference);
    invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v8

    invoke-interface {v8}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v8

    #v8=(Integer);
    const/16 v9, 0xc8

    #v9=(PosShort);
    if-ne v8, v9, :cond_0

    .line 507
    invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v8

    #v8=(Reference);
    invoke-static {v8}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;)Ljava/lang/String;

    move-result-object v7

    .line 508
    .local v7, result:Ljava/lang/String;
    #v7=(Reference);
    const-string v8, "result"

    invoke-static {v8, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 510
    new-instance v1, Lorg/json/JSONObject;

    #v1=(UninitRef);
    invoke-direct {v1, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 511
    .local v1, jo:Lorg/json/JSONObject;
    #v1=(Reference);
    const-string v8, "ok"

    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v3

    .line 512
    .local v3, ok:Z
    #v3=(Boolean);
    invoke-static {}, Lcom/kabam/ad/AdRecorder;->Instance()Lcom/kabam/ad/AdRecorder;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    #v9=(UninitRef);
    const-string v10, "ok"

    #v10=(Reference);
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v9=(Reference);
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/kabam/ad/AdRecorder;->Record(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 521
    .end local v1           #jo:Lorg/json/JSONObject;
    .end local v3           #ok:Z
    .end local v6           #response:Lorg/apache/http/HttpResponse;
    .end local v7           #result:Ljava/lang/String;
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    return-void

    .line 515
    :catch_0
    #v0=(Uninit);v2=(Uninit);
    move-exception v0

    .line 517
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    .line 518
    .local v2, message:Ljava/lang/String;
    #v2=(Reference);
    const-string v8, "track"

    #v8=(Reference);
    invoke-static {v8, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public ProvideStoreInventory(Lcom/kabam/playv3/Inventory;)V
    .locals 3
    .parameter "inventory"

    .prologue
    .line 582
    iput-object p1, p0, Lcom/kabam/utility/Provider;->mInventory:Lcom/kabam/playv3/Inventory;

    .line 583
    const-string v1, "ProvideStoreInventory"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v0, "ProvideStoreInventory: Inventory seted. inventory == null:"

    #v0=(Reference);
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    if-nez p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 584
    return-void

    .line 583
    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public ProvideTapJoy()Lcom/kabam/tapjoy/TapJoy;
    .locals 1

    .prologue
    .line 563
    iget-object v0, p0, Lcom/kabam/utility/Provider;->mTapJoy:Lcom/kabam/tapjoy/TapJoy;

    #v0=(Reference);
    return-object v0
.end method

.method public ProvideTrackFTEFinish(Landroid/app/Activity;)V
    .locals 1
    .parameter "activity"

    .prologue
    .line 539
    new-instance v0, Lcom/kabam/track/TrackMobileInformation;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Lcom/kabam/track/TrackMobileInformation;-><init>(Landroid/app/Activity;)V

    .line 540
    .local v0, information:Lcom/kabam/track/TrackMobileInformation;
    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/track/TrackMobileInformation;->TrackFTEFinish()V

    .line 541
    return-void
.end method

.method public ProvideTrackFirstChat(Landroid/app/Activity;)V
    .locals 5
    .parameter "activity"

    .prologue
    .line 545
    invoke-static {}, Ljava/util/prefs/Preferences;->userRoot()Ljava/util/prefs/Preferences;

    move-result-object v2

    #v2=(Reference);
    const-string v3, "firstchat"

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    invoke-virtual {v2, v3, v4}, Ljava/util/prefs/Preferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 547
    .local v1, value:Z
    #v1=(Boolean);
    if-nez v1, :cond_0

    .line 549
    invoke-static {}, Ljava/util/prefs/Preferences;->userRoot()Ljava/util/prefs/Preferences;

    move-result-object v2

    const-string v3, "firstchat"

    const/4 v4, 0x1

    #v4=(One);
    invoke-virtual {v2, v3, v4}, Ljava/util/prefs/Preferences;->putBoolean(Ljava/lang/String;Z)V

    .line 550
    new-instance v0, Lcom/kabam/track/TrackMobileInformation;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Lcom/kabam/track/TrackMobileInformation;-><init>(Landroid/app/Activity;)V

    .line 551
    .local v0, information:Lcom/kabam/track/TrackMobileInformation;
    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/track/TrackMobileInformation;->TrackFirstReceiveChat()V

    .line 553
    .end local v0           #information:Lcom/kabam/track/TrackMobileInformation;
    :cond_0
    #v0=(Conflicted);v4=(Boolean);
    return-void
.end method

.method public ProvideTrackFirstLogin(Landroid/app/Activity;)V
    .locals 5
    .parameter "activity"

    .prologue
    .line 527
    invoke-static {}, Ljava/util/prefs/Preferences;->userRoot()Ljava/util/prefs/Preferences;

    move-result-object v2

    #v2=(Reference);
    const-string v3, "firstlogin"

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    invoke-virtual {v2, v3, v4}, Ljava/util/prefs/Preferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 529
    .local v1, value:Z
    #v1=(Boolean);
    if-nez v1, :cond_0

    .line 531
    invoke-static {}, Ljava/util/prefs/Preferences;->userRoot()Ljava/util/prefs/Preferences;

    move-result-object v2

    const-string v3, "firstlogin"

    const/4 v4, 0x1

    #v4=(One);
    invoke-virtual {v2, v3, v4}, Ljava/util/prefs/Preferences;->putBoolean(Ljava/lang/String;Z)V

    .line 532
    new-instance v0, Lcom/kabam/track/TrackMobileInformation;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Lcom/kabam/track/TrackMobileInformation;-><init>(Landroid/app/Activity;)V

    .line 533
    .local v0, information:Lcom/kabam/track/TrackMobileInformation;
    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/track/TrackMobileInformation;->TrackFirstLogin()V

    .line 535
    .end local v0           #information:Lcom/kabam/track/TrackMobileInformation;
    :cond_0
    #v0=(Conflicted);v4=(Boolean);
    return-void
.end method

.method public ProvideVerifyService(Ljava/lang/String;Ljava/lang/String;Lcom/kabam/billing/BillingService;)Ljava/util/ArrayList;
    .locals 1
    .parameter "signedData"
    .parameter "signature"
    .parameter "service"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/kabam/billing/BillingService;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 131
    invoke-direct {p0, p1, p2, p3}, Lcom/kabam/utility/Provider;->ProvideVerifyServiceUnity(Ljava/lang/String;Ljava/lang/String;Lcom/kabam/billing/BillingService;)Ljava/util/ArrayList;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public SetActivity(Landroid/app/Activity;)V
    .locals 0
    .parameter "activity"

    .prologue
    .line 166
    iput-object p1, p0, Lcom/kabam/utility/Provider;->mActivity:Landroid/app/Activity;

    .line 167
    return-void
.end method

.method public SetBillingInApp(Lcom/kabam/billing/BillingInApp;)V
    .locals 0
    .parameter "billing"

    .prologue
    .line 174
    iput-object p1, p0, Lcom/kabam/utility/Provider;->mBillingInApp:Lcom/kabam/billing/BillingInApp;

    .line 175
    return-void
.end method

.method public SetSupported(Z)V
    .locals 0
    .parameter "supported"

    .prologue
    .line 81
    iput-boolean p1, p0, Lcom/kabam/utility/Provider;->mIsSupported:Z

    .line 82
    return-void
.end method

.method public purchaseStateChanged(ILjava/lang/String;Ljava/lang/String;Lcom/kabam/billing/BillingService;)V
    .locals 2
    .parameter "startId"
    .parameter "signedData"
    .parameter "signature"
    .parameter "service"

    .prologue
    .line 184
    if-eqz p2, :cond_0

    const-string v0, ""

    #v0=(Reference);
    if-eq p2, v0, :cond_0

    if-eqz p3, :cond_0

    const-string v0, ""

    if-ne p3, v0, :cond_1

    .line 188
    :cond_0
    #v0=(Conflicted);
    const-string v0, "Provider purchaseStateChanged error"

    #v0=(Reference);
    const-string v1, "signedData or signature is null or empty."

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 195
    :goto_0
    #v1=(Conflicted);
    return-void

    .line 192
    :cond_1
    #v1=(Uninit);
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/kabam/utility/Provider;->purchaseStateChangedUnity(ILjava/lang/String;Ljava/lang/String;Lcom/kabam/billing/BillingService;)V

    goto :goto_0
.end method

*/}
