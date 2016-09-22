package com.kabam.billing; class AndroidJSONParser {/*

.class public Lcom/kabam/billing/AndroidJSONParser;
.super Ljava/lang/Object;
.source "AndroidJSONParser.java"


# static fields
.field private static sInstance:Lcom/kabam/billing/AndroidJSONParser;


# instance fields
.field private mCents:Ljava/util/Hashtable;

.field private mHash:Ljava/util/Hashtable;

.field private mJsonObject:Lorg/json/JSONObject;

.field private mNames:Ljava/util/Hashtable;

.field private mToken:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/kabam/billing/AndroidJSONParser;->sInstance:Lcom/kabam/billing/AndroidJSONParser;

    .line 14
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 25
    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    #p0=(Reference);
    iput-object v1, p0, Lcom/kabam/billing/AndroidJSONParser;->mJsonObject:Lorg/json/JSONObject;

    .line 17
    iput-object v1, p0, Lcom/kabam/billing/AndroidJSONParser;->mHash:Ljava/util/Hashtable;

    .line 18
    const-string v0, ""

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/billing/AndroidJSONParser;->mToken:Ljava/lang/String;

    .line 20
    iput-object v1, p0, Lcom/kabam/billing/AndroidJSONParser;->mCents:Ljava/util/Hashtable;

    .line 21
    iput-object v1, p0, Lcom/kabam/billing/AndroidJSONParser;->mNames:Ljava/util/Hashtable;

    .line 28
    return-void
.end method

.method public static Create(Ljava/lang/String;)Lcom/kabam/billing/AndroidJSONParser;
    .locals 1
    .parameter "json"

    .prologue
    .line 37
    const-string v0, "JSONParser input json is "

    #v0=(Reference);
    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    sget-object v0, Lcom/kabam/billing/AndroidJSONParser;->sInstance:Lcom/kabam/billing/AndroidJSONParser;

    if-nez v0, :cond_0

    new-instance v0, Lcom/kabam/billing/AndroidJSONParser;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/kabam/billing/AndroidJSONParser;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/kabam/billing/AndroidJSONParser;->sInstance:Lcom/kabam/billing/AndroidJSONParser;

    .line 39
    :cond_0
    sget-object v0, Lcom/kabam/billing/AndroidJSONParser;->sInstance:Lcom/kabam/billing/AndroidJSONParser;

    invoke-direct {v0, p0}, Lcom/kabam/billing/AndroidJSONParser;->Initialize(Ljava/lang/String;)V

    .line 40
    sget-object v0, Lcom/kabam/billing/AndroidJSONParser;->sInstance:Lcom/kabam/billing/AndroidJSONParser;

    return-object v0
.end method

.method private Initialize(Ljava/lang/String;)V
    .locals 14
    .parameter "jsonString"

    .prologue
    const/4 v11, 0x0

    .line 45
    #v11=(Null);
    iget-object v4, p0, Lcom/kabam/billing/AndroidJSONParser;->mHash:Ljava/util/Hashtable;

    .line 46
    .local v4, hash:Ljava/util/Hashtable;
    #v4=(Reference);
    iget-object v9, p0, Lcom/kabam/billing/AndroidJSONParser;->mToken:Ljava/lang/String;

    .line 48
    .local v9, token:Ljava/lang/String;
    #v9=(Reference);
    iget-object v1, p0, Lcom/kabam/billing/AndroidJSONParser;->mCents:Ljava/util/Hashtable;

    .line 49
    .local v1, cents:Ljava/util/Hashtable;
    #v1=(Reference);
    iget-object v7, p0, Lcom/kabam/billing/AndroidJSONParser;->mNames:Ljava/util/Hashtable;

    .line 51
    .local v7, names:Ljava/util/Hashtable;
    #v7=(Reference);
    iput-object v11, p0, Lcom/kabam/billing/AndroidJSONParser;->mHash:Ljava/util/Hashtable;

    .line 52
    new-instance v10, Ljava/util/Hashtable;

    #v10=(UninitRef);
    invoke-direct {v10}, Ljava/util/Hashtable;-><init>()V

    #v10=(Reference);
    iput-object v10, p0, Lcom/kabam/billing/AndroidJSONParser;->mHash:Ljava/util/Hashtable;

    .line 53
    const-string v10, ""

    iput-object v10, p0, Lcom/kabam/billing/AndroidJSONParser;->mToken:Ljava/lang/String;

    .line 55
    iput-object v11, p0, Lcom/kabam/billing/AndroidJSONParser;->mCents:Ljava/util/Hashtable;

    .line 56
    new-instance v10, Ljava/util/Hashtable;

    #v10=(UninitRef);
    invoke-direct {v10}, Ljava/util/Hashtable;-><init>()V

    #v10=(Reference);
    iput-object v10, p0, Lcom/kabam/billing/AndroidJSONParser;->mCents:Ljava/util/Hashtable;

    .line 58
    iput-object v11, p0, Lcom/kabam/billing/AndroidJSONParser;->mNames:Ljava/util/Hashtable;

    .line 59
    new-instance v10, Ljava/util/Hashtable;

    #v10=(UninitRef);
    invoke-direct {v10}, Ljava/util/Hashtable;-><init>()V

    #v10=(Reference);
    iput-object v10, p0, Lcom/kabam/billing/AndroidJSONParser;->mNames:Ljava/util/Hashtable;

    .line 63
    :try_start_0
    new-instance v10, Lorg/json/JSONObject;

    #v10=(UninitRef);
    invoke-direct {v10, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v10=(Reference);
    iput-object v10, p0, Lcom/kabam/billing/AndroidJSONParser;->mJsonObject:Lorg/json/JSONObject;

    .line 64
    iget-object v10, p0, Lcom/kabam/billing/AndroidJSONParser;->mJsonObject:Lorg/json/JSONObject;

    const-string v11, "packageData"

    #v11=(Reference);
    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    #v8=(Reference);
    check-cast v8, Lorg/json/JSONObject;

    .line 65
    .local v8, packages:Lorg/json/JSONObject;
    const-string v10, "packages"

    invoke-virtual {v8, v10}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 66
    .local v0, array:Lorg/json/JSONArray;
    #v0=(Reference);
    const-string v10, "externalTrkid"

    invoke-virtual {v8, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    iput-object v10, p0, Lcom/kabam/billing/AndroidJSONParser;->mToken:Ljava/lang/String;

    .line 69
    const-string v10, "JSONParser"

    iget-object v11, p0, Lcom/kabam/billing/AndroidJSONParser;->mToken:Ljava/lang/String;

    invoke-static {v10, v11}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    const-string v11, "array"

    new-instance v12, Ljava/lang/StringBuilder;

    #v12=(UninitRef);
    if-nez v0, :cond_0

    const/4 v10, 0x1

    :goto_0
    #v10=(Boolean);
    invoke-static {v10}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v10

    #v10=(Reference);
    invoke-direct {v12, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v12=(Reference);
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v11, v10}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    const/4 v5, 0x0

    .local v5, i:I
    :goto_1
    #v3=(Conflicted);v5=(Integer);v6=(Conflicted);v10=(Conflicted);v11=(Conflicted);v13=(Conflicted);
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v10

    #v10=(Integer);
    if-lt v5, v10, :cond_1

    .line 114
    .end local v0           #array:Lorg/json/JSONArray;
    .end local v5           #i:I
    .end local v8           #packages:Lorg/json/JSONObject;
    :goto_2
    #v0=(Conflicted);v2=(Conflicted);v5=(Conflicted);v8=(Conflicted);v10=(Conflicted);v12=(Conflicted);
    return-void

    .line 71
    .restart local v0       #array:Lorg/json/JSONArray;
    .restart local v8       #packages:Lorg/json/JSONObject;
    :cond_0
    #v0=(Reference);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Reference);v10=(Reference);v11=(Reference);v12=(UninitRef);v13=(Uninit);
    const/4 v10, 0x0

    #v10=(Null);
    goto :goto_0

    .line 75
    .restart local v5       #i:I
    :cond_1
    #v3=(Conflicted);v5=(Integer);v6=(Conflicted);v10=(Integer);v11=(Conflicted);v12=(Reference);v13=(Conflicted);
    invoke-virtual {v0, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 76
    .local v6, ji:Lorg/json/JSONObject;
    #v6=(Reference);
    iget-object v10, p0, Lcom/kabam/billing/AndroidJSONParser;->mHash:Ljava/util/Hashtable;

    #v10=(Reference);
    const-string v11, "itunes_productid"

    #v11=(Reference);
    invoke-virtual {v6, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "payoutid"

    invoke-virtual {v6, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 81
    :try_start_1
    new-instance v10, Ljava/lang/StringBuilder;

    #v10=(UninitRef);
    const-string v11, "JSONParser i="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v10=(Reference);
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    #v11=(UninitRef);
    const-string v12, "JSONParser mHash="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v11=(Reference);
    iget-object v12, p0, Lcom/kabam/billing/AndroidJSONParser;->mHash:Ljava/util/Hashtable;

    const-string v13, "itunes_productid"

    #v13=(Reference);
    invoke-virtual {v6, v13}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    iget-object v10, p0, Lcom/kabam/billing/AndroidJSONParser;->mNames:Ljava/util/Hashtable;

    const-string v11, "itunes_productid"

    invoke-virtual {v6, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "description"

    invoke-virtual {v6, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    iget-object v10, p0, Lcom/kabam/billing/AndroidJSONParser;->mCents:Ljava/util/Hashtable;

    const-string v11, "itunes_productid"

    invoke-virtual {v6, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "cents"

    invoke-virtual {v6, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    new-instance v10, Ljava/lang/StringBuilder;

    #v10=(UninitRef);
    const-string v11, "JSONParser i="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v10=(Reference);
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    #v11=(UninitRef);
    const-string v12, "JSONParser mCents="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v11=(Reference);
    iget-object v12, p0, Lcom/kabam/billing/AndroidJSONParser;->mCents:Ljava/util/Hashtable;

    const-string v13, "itunes_productid"

    invoke-virtual {v6, v13}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 89
    new-instance v10, Ljava/lang/StringBuilder;

    #v10=(UninitRef);
    const-string v11, "JSONParser i="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v10=(Reference);
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    #v11=(UninitRef);
    const-string v12, "JSONParser mNames="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v11=(Reference);
    iget-object v12, p0, Lcom/kabam/billing/AndroidJSONParser;->mNames:Ljava/util/Hashtable;

    const-string v13, "itunes_productid"

    invoke-virtual {v6, v13}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 73
    :goto_3
    #v10=(Conflicted);v11=(Conflicted);v13=(Conflicted);
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    .line 91
    :catch_0
    move-exception v3

    .line 93
    .local v3, ex:Ljava/lang/Exception;
    :try_start_2
    #v3=(Reference);
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    .line 97
    .end local v0           #array:Lorg/json/JSONArray;
    .end local v3           #ex:Ljava/lang/Exception;
    .end local v5           #i:I
    .end local v6           #ji:Lorg/json/JSONObject;
    .end local v8           #packages:Lorg/json/JSONObject;
    :catch_1
    #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v12=(Conflicted);
    move-exception v2

    .line 99
    .local v2, e:Lorg/json/JSONException;
    #v2=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v10

    #v10=(Reference);
    invoke-virtual {v10, v2}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    .line 100
    iput-object v4, p0, Lcom/kabam/billing/AndroidJSONParser;->mHash:Ljava/util/Hashtable;

    .line 101
    iput-object v9, p0, Lcom/kabam/billing/AndroidJSONParser;->mToken:Ljava/lang/String;

    .line 102
    iput-object v1, p0, Lcom/kabam/billing/AndroidJSONParser;->mCents:Ljava/util/Hashtable;

    .line 103
    iput-object v7, p0, Lcom/kabam/billing/AndroidJSONParser;->mNames:Ljava/util/Hashtable;

    goto/16 :goto_2

    .line 105
    .end local v2           #e:Lorg/json/JSONException;
    :catch_2
    #v2=(Uninit);v10=(Conflicted);
    move-exception v2

    .line 107
    .local v2, e:Ljava/lang/Exception;
    #v2=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v10

    #v10=(Reference);
    invoke-virtual {v10, v2}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    .line 108
    iput-object v4, p0, Lcom/kabam/billing/AndroidJSONParser;->mHash:Ljava/util/Hashtable;

    .line 109
    iput-object v9, p0, Lcom/kabam/billing/AndroidJSONParser;->mToken:Ljava/lang/String;

    .line 110
    iput-object v1, p0, Lcom/kabam/billing/AndroidJSONParser;->mCents:Ljava/util/Hashtable;

    .line 111
    iput-object v7, p0, Lcom/kabam/billing/AndroidJSONParser;->mNames:Ljava/util/Hashtable;

    goto/16 :goto_2
.end method

.method public static Instance()Lcom/kabam/billing/AndroidJSONParser;
    .locals 1

    .prologue
    .line 32
    sget-object v0, Lcom/kabam/billing/AndroidJSONParser;->sInstance:Lcom/kabam/billing/AndroidJSONParser;

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public Cents(Ljava/lang/String;)D
    .locals 6
    .parameter "productID"

    .prologue
    .line 153
    :try_start_0
    iget-object v3, p0, Lcom/kabam/billing/AndroidJSONParser;->mCents:Ljava/util/Hashtable;

    #v3=(Reference);
    if-nez v3, :cond_0

    new-instance v3, Ljava/lang/Exception;

    #v3=(UninitRef);
    const-string v4, "product list Cents is empty."

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    throw v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 164
    :catch_0
    move-exception v2

    .line 166
    .local v2, e:Ljava/lang/Exception;
    #v2=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3, v2}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    .line 169
    const-wide/16 v0, 0x0

    .end local v2           #e:Ljava/lang/Exception;
    :goto_0
    #v0=(LongLo);v1=(LongHi);v2=(Conflicted);v3=(Conflicted);
    return-wide v0

    .line 154
    :cond_0
    :try_start_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Reference);v4=(Uninit);v5=(Uninit);
    iget-object v3, p0, Lcom/kabam/billing/AndroidJSONParser;->mCents:Ljava/util/Hashtable;

    invoke-virtual {v3, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    new-instance v3, Ljava/lang/Exception;

    #v3=(UninitRef);
    const-string v4, "product list Cents is empty."

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 155
    :cond_1
    #v3=(Reference);v4=(Conflicted);
    iget-object v3, p0, Lcom/kabam/billing/AndroidJSONParser;->mCents:Ljava/util/Hashtable;

    invoke-virtual {v3, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, ""

    #v4=(Reference);
    if-ne v3, v4, :cond_2

    new-instance v3, Ljava/lang/Exception;

    #v3=(UninitRef);
    const-string v4, "product list Cents is empty."

    invoke-direct {v3, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 157
    :cond_2
    #v3=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v3

    const-string v4, "cents"

    invoke-virtual {v3, v4, p1}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    const-string v3, ""

    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    const-string v5, "cents parse"

    #v5=(Reference);
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    iget-object v5, p0, Lcom/kabam/billing/AndroidJSONParser;->mCents:Ljava/util/Hashtable;

    invoke-virtual {v5, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 159
    iget-object v3, p0, Lcom/kabam/billing/AndroidJSONParser;->mCents:Ljava/util/Hashtable;

    invoke-virtual {v3, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    .line 160
    .local v0, cents:D
    #v0=(DoubleLo);v1=(DoubleHi);
    const-string v3, ""

    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    const-string v5, "cents parse double="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 161
    const-wide/high16 v3, 0x4059

    #v3=(LongLo);v4=(LongHi);
    div-double/2addr v0, v3

    .line 162
    goto :goto_0
.end method

.method public JSONObj()Lorg/json/JSONObject;
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/kabam/billing/AndroidJSONParser;->mJsonObject:Lorg/json/JSONObject;

    #v0=(Reference);
    return-object v0
.end method

.method public NameHash()Ljava/util/Hashtable;
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Lcom/kabam/billing/AndroidJSONParser;->mNames:Ljava/util/Hashtable;

    #v0=(Reference);
    return-object v0
.end method

.method public Names(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .parameter "productID"

    .prologue
    .line 175
    :try_start_0
    iget-object v1, p0, Lcom/kabam/billing/AndroidJSONParser;->mNames:Ljava/util/Hashtable;

    #v1=(Reference);
    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/Exception;

    #v1=(UninitRef);
    const-string v2, "product list mNames is empty."

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 180
    :catch_0
    move-exception v0

    .line 182
    .local v0, e:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    .line 184
    const/4 v1, 0x0

    .end local v0           #e:Ljava/lang/Exception;
    :goto_0
    #v0=(Conflicted);
    return-object v1

    .line 176
    :cond_0
    :try_start_1
    #v0=(Uninit);v2=(Uninit);
    iget-object v1, p0, Lcom/kabam/billing/AndroidJSONParser;->mNames:Ljava/util/Hashtable;

    invoke-virtual {v1, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/Exception;

    #v1=(UninitRef);
    const-string v2, "product list mNames is empty."

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 177
    :cond_1
    #v1=(Reference);v2=(Conflicted);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    const-string v2, "Names"

    #v2=(Reference);
    invoke-virtual {v1, v2, p1}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    iget-object v1, p0, Lcom/kabam/billing/AndroidJSONParser;->mNames:Ljava/util/Hashtable;

    invoke-virtual {v1, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v1

    goto :goto_0
.end method

.method public PayoutID(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .parameter "productID"

    .prologue
    .line 135
    :try_start_0
    iget-object v1, p0, Lcom/kabam/billing/AndroidJSONParser;->mHash:Ljava/util/Hashtable;

    #v1=(Reference);
    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/Exception;

    #v1=(UninitRef);
    const-string v2, "product list Hash is empty."

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 139
    :catch_0
    move-exception v0

    .line 141
    .local v0, e:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "payout id"

    #v2=(Reference);
    const-string v3, "payout id"

    #v3=(Reference);
    invoke-virtual {v1, v2, v3}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    .line 143
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnSendPaymentException(Ljava/lang/Exception;)V

    .line 146
    const/4 v1, 0x0

    .end local v0           #e:Ljava/lang/Exception;
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-object v1

    .line 136
    :cond_0
    :try_start_1
    #v0=(Uninit);v2=(Uninit);v3=(Uninit);
    iget-object v1, p0, Lcom/kabam/billing/AndroidJSONParser;->mHash:Ljava/util/Hashtable;

    invoke-virtual {v1, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/Exception;

    #v1=(UninitRef);
    const-string v2, "product list Hash is empty."

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 137
    :cond_1
    #v1=(Reference);v2=(Conflicted);
    iget-object v1, p0, Lcom/kabam/billing/AndroidJSONParser;->mHash:Ljava/util/Hashtable;

    invoke-virtual {v1, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v1

    goto :goto_0
.end method

.method public Token()Ljava/lang/String;
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lcom/kabam/billing/AndroidJSONParser;->mToken:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

*/}
