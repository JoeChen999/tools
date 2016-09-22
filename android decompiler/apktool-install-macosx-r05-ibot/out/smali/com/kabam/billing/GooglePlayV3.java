package com.kabam.billing; class GooglePlayV3 {/*

.class public Lcom/kabam/billing/GooglePlayV3;
.super Ljava/lang/Object;
.source "GooglePlayV3.java"


# instance fields
.field private TAG:Ljava/lang/String;

.field private mActivity:Landroid/app/Activity;

.field mConsumeFinishedListener:Lcom/kabam/playv3/IabHelper$OnConsumeFinishedListener;

.field mGotInventoryListener:Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;

.field mHelper:Lcom/kabam/playv3/IabHelper;

.field private mIsSupportV3:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 30
    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/kabam/billing/GooglePlayV3;->mIsSupportV3:Z

    .line 33
    iput-object v1, p0, Lcom/kabam/billing/GooglePlayV3;->mActivity:Landroid/app/Activity;

    .line 34
    const-string v0, "V3"

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/billing/GooglePlayV3;->TAG:Ljava/lang/String;

    .line 47
    iput-object v1, p0, Lcom/kabam/billing/GooglePlayV3;->mHelper:Lcom/kabam/playv3/IabHelper;

    .line 262
    new-instance v0, Lcom/kabam/billing/GooglePlayV3$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/kabam/billing/GooglePlayV3$1;-><init>(Lcom/kabam/billing/GooglePlayV3;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/billing/GooglePlayV3;->mGotInventoryListener:Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;

    .line 283
    new-instance v0, Lcom/kabam/billing/GooglePlayV3$2;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/kabam/billing/GooglePlayV3$2;-><init>(Lcom/kabam/billing/GooglePlayV3;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/billing/GooglePlayV3;->mConsumeFinishedListener:Lcom/kabam/playv3/IabHelper$OnConsumeFinishedListener;

    .line 30
    return-void
.end method

.method static synthetic access$0(Lcom/kabam/billing/GooglePlayV3;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 34
    iget-object v0, p0, Lcom/kabam/billing/GooglePlayV3;->TAG:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public Buy(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 8
    .parameter "act"
    .parameter "sku"

    .prologue
    .line 101
    invoke-virtual {p0}, Lcom/kabam/billing/GooglePlayV3;->IsSupportV3()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    .line 112
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return-void

    .line 102
    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    iget-object v0, p0, Lcom/kabam/billing/GooglePlayV3;->mHelper:Lcom/kabam/playv3/IabHelper;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 103
    invoke-static {}, Lcom/kabam/billing/AndroidJSONParser;->Instance()Lcom/kabam/billing/AndroidJSONParser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/billing/AndroidJSONParser;->Token()Ljava/lang/String;

    move-result-object v7

    .line 104
    .local v7, token:Ljava/lang/String;
    #v7=(Reference);
    invoke-static {}, Lcom/kabam/billing/AndroidJSONParser;->Instance()Lcom/kabam/billing/AndroidJSONParser;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/kabam/billing/AndroidJSONParser;->PayoutID(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 105
    .local v6, payoutID:Ljava/lang/String;
    #v6=(Reference);
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    const-string v1, "@=>@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 107
    .local v5, extraData:Ljava/lang/String;
    #v5=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    const-string v1, "OnActivityResult"

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "OnActivityResult:token="

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    const-string v1, "OnActivityResult"

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "OnActivityResult:payoutID="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    const-string v1, "OnActivityResult"

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "OnActivityResult:extraData="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    iget-object v0, p0, Lcom/kabam/billing/GooglePlayV3;->mHelper:Lcom/kabam/playv3/IabHelper;

    const/16 v3, 0x6e

    #v3=(PosByte);
    new-instance v4, Lcom/kabam/playv3/PurchaseFinishListener;

    #v4=(UninitRef);
    invoke-direct {v4}, Lcom/kabam/playv3/PurchaseFinishListener;-><init>()V

    #v4=(Reference);
    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Lcom/kabam/playv3/IabHelper;->launchPurchaseFlow(Landroid/app/Activity;Ljava/lang/String;ILcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method public CheckPackages()V
    .locals 11

    .prologue
    .line 177
    :try_start_0
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v8

    #v8=(Reference);
    invoke-virtual {v8}, Lcom/kabam/utility/Provider;->ProvideGooglePlayV3()Lcom/kabam/billing/GooglePlayV3;

    move-result-object v8

    invoke-virtual {v8}, Lcom/kabam/billing/GooglePlayV3;->IsSupportV3()Z

    move-result v8

    #v8=(Boolean);
    if-nez v8, :cond_0

    .line 179
    const-string v8, "valideProducts CheckPackages"

    #v8=(Reference);
    const-string v9, "valideProducts:v2"

    #v9=(Reference);
    invoke-static {v8, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 180
    const-string v8, "v2"

    invoke-static {v8}, Lcom/kabam/utility/UnitySender;->setValideProducts(Ljava/lang/String;)V

    .line 214
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    return-void

    .line 184
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Boolean);v9=(Uninit);v10=(Uninit);
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    .line 185
    .local v2, curLooper:Landroid/os/Looper;
    #v2=(Reference);
    if-nez v2, :cond_1

    .line 186
    invoke-static {}, Landroid/os/Looper;->prepare()V

    .line 187
    :cond_1
    invoke-static {}, Lcom/kabam/billing/AndroidJSONParser;->Instance()Lcom/kabam/billing/AndroidJSONParser;

    move-result-object v8

    #v8=(Reference);
    invoke-virtual {v8}, Lcom/kabam/billing/AndroidJSONParser;->JSONObj()Lorg/json/JSONObject;

    move-result-object v6

    .line 188
    .local v6, m_Obj:Lorg/json/JSONObject;
    #v6=(Reference);
    const-string v8, "packageData"

    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    #v7=(Reference);
    check-cast v7, Lorg/json/JSONObject;

    .line 189
    .local v7, packages:Lorg/json/JSONObject;
    const-string v8, "packages"

    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 191
    .local v1, array:Lorg/json/JSONArray;
    #v1=(Reference);
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 193
    .local v0, additionalSkuList:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    #v0=(Reference);
    const/4 v4, 0x0

    .local v4, i:I
    :goto_1
    #v4=(Integer);v5=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v8

    #v8=(Integer);
    if-lt v4, v8, :cond_2

    .line 202
    iget-object v8, p0, Lcom/kabam/billing/GooglePlayV3;->TAG:Ljava/lang/String;

    #v8=(Reference);
    const-string v9, "Setup successful. Querying inventory."

    #v9=(Reference);
    invoke-static {v8, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 204
    iget-object v8, p0, Lcom/kabam/billing/GooglePlayV3;->mHelper:Lcom/kabam/playv3/IabHelper;

    const/4 v9, 0x1

    #v9=(One);
    iget-object v10, p0, Lcom/kabam/billing/GooglePlayV3;->mGotInventoryListener:Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;

    #v10=(Reference);
    invoke-virtual {v8, v9, v0, v10}, Lcom/kabam/playv3/IabHelper;->queryInventoryAsync(ZLjava/util/List;Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 206
    .end local v0           #additionalSkuList:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    .end local v1           #array:Lorg/json/JSONArray;
    .end local v2           #curLooper:Landroid/os/Looper;
    .end local v4           #i:I
    .end local v6           #m_Obj:Lorg/json/JSONObject;
    .end local v7           #packages:Lorg/json/JSONObject;
    :catch_0
    move-exception v3

    .line 208
    .local v3, e:Lorg/json/JSONException;
    #v3=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v8

    #v8=(Reference);
    invoke-virtual {v8, v3}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0

    .line 195
    .end local v3           #e:Lorg/json/JSONException;
    .restart local v0       #additionalSkuList:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    .restart local v1       #array:Lorg/json/JSONArray;
    .restart local v2       #curLooper:Landroid/os/Looper;
    .restart local v4       #i:I
    .restart local v6       #m_Obj:Lorg/json/JSONObject;
    .restart local v7       #packages:Lorg/json/JSONObject;
    :cond_2
    :try_start_1
    #v0=(Reference);v1=(Reference);v2=(Reference);v3=(Uninit);v4=(Integer);v6=(Reference);v7=(Reference);v8=(Integer);
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 196
    .local v5, ji:Lorg/json/JSONObject;
    #v5=(Reference);
    const-string v8, "itunes_productid"

    #v8=(Reference);
    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 197
    iget-object v8, p0, Lcom/kabam/billing/GooglePlayV3;->TAG:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    #v9=(UninitRef);
    const-string v10, "additionalSkuList add : "

    #v10=(Reference);
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v9=(Reference);
    const-string v10, "itunes_productid"

    invoke-virtual {v5, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 193
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 210
    .end local v0           #additionalSkuList:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    .end local v1           #array:Lorg/json/JSONArray;
    .end local v2           #curLooper:Landroid/os/Looper;
    .end local v4           #i:I
    .end local v5           #ji:Lorg/json/JSONObject;
    .end local v6           #m_Obj:Lorg/json/JSONObject;
    .end local v7           #packages:Lorg/json/JSONObject;
    :catch_1
    move-exception v3

    .line 212
    .local v3, e:Ljava/lang/Exception;
    #v3=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v8

    #v8=(Reference);
    invoke-virtual {v8, v3}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public Consume(Ljava/lang/String;Landroid/app/Activity;)V
    .locals 4
    .parameter "sku"
    .parameter "activity"

    .prologue
    .line 116
    invoke-virtual {p0}, Lcom/kabam/billing/GooglePlayV3;->IsSupportV3()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 120
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    .line 117
    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "OnActivityResult"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "consume, OnActivityResult:sku="

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideInventory()Lcom/kabam/playv3/Inventory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/playv3/Inventory;->LogPurchaseMap()V

    .line 119
    iget-object v0, p0, Lcom/kabam/billing/GooglePlayV3;->mHelper:Lcom/kabam/playv3/IabHelper;

    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kabam/utility/Provider;->ProvideInventory()Lcom/kabam/playv3/Inventory;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/kabam/playv3/Inventory;->getPurchase(Ljava/lang/String;)Lcom/kabam/playv3/Purchase;

    move-result-object v1

    new-instance v2, Lcom/kabam/playv3/ConsumeFinishedListener;

    #v2=(UninitRef);
    invoke-direct {v2}, Lcom/kabam/playv3/ConsumeFinishedListener;-><init>()V

    #v2=(Reference);
    invoke-virtual {v0, v1, v2, p2}, Lcom/kabam/playv3/IabHelper;->consumeAsync(Lcom/kabam/playv3/Purchase;Lcom/kabam/playv3/IabHelper$OnConsumeFinishedListener;Landroid/app/Activity;)V

    goto :goto_0
.end method

.method public GetPurchase()V
    .locals 2

    .prologue
    .line 67
    invoke-virtual {p0}, Lcom/kabam/billing/GooglePlayV3;->IsSupportV3()Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_1

    .line 80
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    .line 68
    :cond_1
    #v0=(Uninit);v1=(Boolean);
    new-instance v0, Lcom/kabam/billing/GooglePlayV3$3;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/kabam/billing/GooglePlayV3$3;-><init>(Lcom/kabam/billing/GooglePlayV3;)V

    .line 78
    .local v0, action:Ljava/lang/Runnable;
    #v0=(Reference);
    iget-object v1, p0, Lcom/kabam/billing/GooglePlayV3;->mActivity:Landroid/app/Activity;

    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 79
    iget-object v1, p0, Lcom/kabam/billing/GooglePlayV3;->mActivity:Landroid/app/Activity;

    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public IsSupportV3()Z
    .locals 1

    .prologue
    .line 44
    iget-boolean v0, p0, Lcom/kabam/billing/GooglePlayV3;->mIsSupportV3:Z

    #v0=(Boolean);
    return v0
.end method

.method JsonDeCodeProduct(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .parameter "input"

    .prologue
    .line 152
    new-instance v2, Ljava/lang/String;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/String;-><init>()V

    .line 155
    .local v2, result:Ljava/lang/String;
    :try_start_0
    #v2=(Reference);
    new-instance v0, Lorg/json/JSONObject;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 157
    .local v0, JsonObj:Lorg/json/JSONObject;
    #v0=(Reference);
    const-string v3, "productId"

    #v3=(Reference);
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v2

    .line 168
    .end local v0           #JsonObj:Lorg/json/JSONObject;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-object v2

    .line 159
    :catch_0
    #v1=(Uninit);v3=(Conflicted);
    move-exception v1

    .line 161
    .local v1, e:Lorg/json/JSONException;
    #v1=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3, v1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0

    .line 163
    .end local v1           #e:Lorg/json/JSONException;
    :catch_1
    #v1=(Uninit);v3=(Conflicted);
    move-exception v1

    .line 165
    .local v1, e:Ljava/lang/Exception;
    #v1=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3, v1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public OnActivityResult(IILandroid/content/Intent;)V
    .locals 4
    .parameter "requestCode"
    .parameter "resultCode"
    .parameter "data"

    .prologue
    .line 84
    invoke-virtual {p0}, Lcom/kabam/billing/GooglePlayV3;->IsSupportV3()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    .line 90
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    .line 85
    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    iget-object v0, p0, Lcom/kabam/billing/GooglePlayV3;->mHelper:Lcom/kabam/playv3/IabHelper;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 86
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    const-string v1, "OnActivityResult"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "OnActivityResult:requestCode="

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    const-string v1, "OnActivityResult"

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "OnActivityResult:resultCode="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    const-string v1, "OnActivityResult"

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "OnActivityResult:data="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    iget-object v0, p0, Lcom/kabam/billing/GooglePlayV3;->mHelper:Lcom/kabam/playv3/IabHelper;

    invoke-virtual {v0, p1, p2, p3}, Lcom/kabam/playv3/IabHelper;->handleActivityResult(IILandroid/content/Intent;)Z

    goto :goto_0
.end method

.method public OnCreate(Landroid/app/Activity;)V
    .locals 4
    .parameter "activity"

    .prologue
    .line 52
    :try_start_0
    iput-object p1, p0, Lcom/kabam/billing/GooglePlayV3;->mActivity:Landroid/app/Activity;

    .line 53
    new-instance v1, Lcom/kabam/playv3/IabHelper;

    #v1=(UninitRef);
    invoke-direct {v1, p1}, Lcom/kabam/playv3/IabHelper;-><init>(Landroid/content/Context;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/kabam/billing/GooglePlayV3;->mHelper:Lcom/kabam/playv3/IabHelper;

    .line 54
    iget-object v1, p0, Lcom/kabam/billing/GooglePlayV3;->mHelper:Lcom/kabam/playv3/IabHelper;

    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v1, v2}, Lcom/kabam/playv3/IabHelper;->enableDebugLogging(Z)V

    .line 55
    iget-object v1, p0, Lcom/kabam/billing/GooglePlayV3;->mHelper:Lcom/kabam/playv3/IabHelper;

    new-instance v2, Lcom/kabam/playv3/SetupFinishedListener;

    #v2=(UninitRef);
    invoke-direct {v2}, Lcom/kabam/playv3/SetupFinishedListener;-><init>()V

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lcom/kabam/playv3/IabHelper;->startSetup(Lcom/kabam/playv3/IabHelper$OnIabSetupFinishedListener;)V

    .line 57
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    const-string v2, "OnCreate"

    const-string v3, "GooglePlayV3 OnCreate"

    #v3=(Reference);
    invoke-virtual {v1, v2, v3}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    .line 59
    :catch_0
    move-exception v0

    .line 61
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public OnDestroy()V
    .locals 1

    .prologue
    .line 94
    invoke-virtual {p0}, Lcom/kabam/billing/GooglePlayV3;->IsSupportV3()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 97
    :goto_0
    return-void

    .line 95
    :cond_0
    iget-object v0, p0, Lcom/kabam/billing/GooglePlayV3;->mHelper:Lcom/kabam/playv3/IabHelper;

    #v0=(Reference);
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/kabam/billing/GooglePlayV3;->mHelper:Lcom/kabam/playv3/IabHelper;

    invoke-virtual {v0}, Lcom/kabam/playv3/IabHelper;->dispose()V

    .line 96
    :cond_1
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/kabam/billing/GooglePlayV3;->mHelper:Lcom/kabam/playv3/IabHelper;

    goto :goto_0
.end method

.method public SetSupportV3()V
    .locals 1

    .prologue
    .line 37
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/kabam/billing/GooglePlayV3;->mIsSupportV3:Z

    .line 38
    return-void
.end method

.method complain(Ljava/lang/String;)V
    .locals 3
    .parameter "message"

    .prologue
    .line 306
    iget-object v0, p0, Lcom/kabam/billing/GooglePlayV3;->TAG:Ljava/lang/String;

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "**** V3 test Error: "

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 307
    return-void
.end method

.method public filterJsonObj(Ljava/lang/String;)V
    .locals 14
    .parameter "Packagedata"

    .prologue
    .line 220
    :try_start_0
    invoke-static {}, Lcom/kabam/billing/AndroidJSONParser;->Instance()Lcom/kabam/billing/AndroidJSONParser;

    move-result-object v11

    #v11=(Reference);
    invoke-virtual {v11}, Lcom/kabam/billing/AndroidJSONParser;->NameHash()Ljava/util/Hashtable;

    move-result-object v8

    .line 222
    .local v8, m_Hashtable:Ljava/util/Hashtable;
    #v8=(Reference);
    new-instance v7, Lorg/json/JSONObject;

    #v7=(UninitRef);
    invoke-direct {v7, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 223
    .local v7, mJsonObject:Lorg/json/JSONObject;
    #v7=(Reference);
    const-string v11, "Products"

    invoke-virtual {v7, v11}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 225
    .local v0, array:Lorg/json/JSONArray;
    #v0=(Reference);
    invoke-virtual {v8}, Ljava/util/Hashtable;->keySet()Ljava/util/Set;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .local v4, itr:Ljava/util/Iterator;
    :cond_0
    :goto_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Reference);v5=(Conflicted);v6=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    #v11=(Boolean);
    if-nez v11, :cond_1

    .line 259
    .end local v0           #array:Lorg/json/JSONArray;
    .end local v4           #itr:Ljava/util/Iterator;
    .end local v7           #mJsonObject:Lorg/json/JSONObject;
    .end local v8           #m_Hashtable:Ljava/util/Hashtable;
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);v11=(Conflicted);
    return-void

    .line 227
    .restart local v0       #array:Lorg/json/JSONArray;
    .restart local v4       #itr:Ljava/util/Iterator;
    .restart local v7       #mJsonObject:Lorg/json/JSONObject;
    .restart local v8       #m_Hashtable:Ljava/util/Hashtable;
    :cond_1
    #v0=(Reference);v1=(Uninit);v4=(Reference);v7=(Reference);v8=(Reference);v11=(Boolean);
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    #v6=(Reference);
    check-cast v6, Ljava/lang/String;

    .line 228
    .local v6, key:Ljava/lang/String;
    invoke-virtual {v8, v6}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    #v10=(Reference);
    check-cast v10, Ljava/lang/String;

    .line 229
    .local v10, value:Ljava/lang/String;
    iget-object v11, p0, Lcom/kabam/billing/GooglePlayV3;->TAG:Ljava/lang/String;

    #v11=(Reference);
    new-instance v12, Ljava/lang/StringBuilder;

    #v12=(UninitRef);
    const-string v13, "filterJsonObj remove(key) : "

    #v13=(Reference);
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v12=(Reference);
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, "   value = "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 230
    const/4 v2, 0x0

    .line 231
    .local v2, flag:Z
    #v2=(Null);
    const/4 v3, 0x0

    .local v3, i:I
    :goto_2
    #v2=(Boolean);v3=(Integer);v11=(Conflicted);
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v11

    #v11=(Integer);
    if-lt v3, v11, :cond_2

    .line 242
    if-nez v2, :cond_0

    .line 244
    iget-object v11, p0, Lcom/kabam/billing/GooglePlayV3;->TAG:Ljava/lang/String;

    #v11=(Reference);
    new-instance v12, Ljava/lang/StringBuilder;

    #v12=(UninitRef);
    const-string v13, "88888888888 remove(key) : "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v12=(Reference);
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, "   value = "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 245
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 251
    .end local v0           #array:Lorg/json/JSONArray;
    .end local v2           #flag:Z
    .end local v3           #i:I
    .end local v4           #itr:Ljava/util/Iterator;
    .end local v6           #key:Ljava/lang/String;
    .end local v7           #mJsonObject:Lorg/json/JSONObject;
    .end local v8           #m_Hashtable:Ljava/util/Hashtable;
    .end local v10           #value:Ljava/lang/String;
    :catch_0
    move-exception v1

    .line 253
    .local v1, e:Lorg/json/JSONException;
    #v1=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v11

    #v11=(Reference);
    invoke-virtual {v11, v1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_1

    .line 233
    .end local v1           #e:Lorg/json/JSONException;
    .restart local v0       #array:Lorg/json/JSONArray;
    .restart local v2       #flag:Z
    .restart local v3       #i:I
    .restart local v4       #itr:Ljava/util/Iterator;
    .restart local v6       #key:Ljava/lang/String;
    .restart local v7       #mJsonObject:Lorg/json/JSONObject;
    .restart local v8       #m_Hashtable:Ljava/util/Hashtable;
    .restart local v10       #value:Ljava/lang/String;
    :cond_2
    :try_start_1
    #v0=(Reference);v1=(Uninit);v2=(Boolean);v3=(Integer);v4=(Reference);v6=(Reference);v7=(Reference);v8=(Reference);v10=(Reference);v11=(Integer);v12=(Reference);v13=(Reference);
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 234
    .local v5, ji:Lorg/json/JSONObject;
    #v5=(Reference);
    const-string v11, "itunes_productid"

    #v11=(Reference);
    invoke-virtual {v5, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 236
    .local v9, productId:Ljava/lang/String;
    #v9=(Reference);
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v11

    #v11=(Boolean);
    if-eqz v11, :cond_3

    .line 238
    const/4 v2, 0x1

    .line 231
    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 255
    .end local v0           #array:Lorg/json/JSONArray;
    .end local v2           #flag:Z
    .end local v3           #i:I
    .end local v4           #itr:Ljava/util/Iterator;
    .end local v5           #ji:Lorg/json/JSONObject;
    .end local v6           #key:Ljava/lang/String;
    .end local v7           #mJsonObject:Lorg/json/JSONObject;
    .end local v8           #m_Hashtable:Ljava/util/Hashtable;
    .end local v9           #productId:Ljava/lang/String;
    .end local v10           #value:Ljava/lang/String;
    :catch_1
    move-exception v1

    .line 257
    .local v1, e:Ljava/lang/Exception;
    #v1=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v11

    #v11=(Reference);
    invoke-virtual {v11, v1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_1
.end method

.method public sendValideProductdata(Ljava/util/List;)V
    .locals 8
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 126
    .local p1, responseList:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    new-instance v0, Ljava/lang/String;

    #v0=(UninitRef);
    const-string v5, "{\"Products\":{"

    #v5=(Reference);
    invoke-direct {v0, v5}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 127
    .local v0, Packagedata:Ljava/lang/String;
    #v0=(Reference);
    new-instance v1, Ljava/lang/String;

    #v1=(UninitRef);
    const-string v5, "{\"Products\":[{"

    invoke-direct {v1, v5}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 128
    .local v1, filterData:Ljava/lang/String;
    #v1=(Reference);
    const/4 v2, 0x0

    .line 129
    .local v2, index:I
    #v2=(Null);
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    .line 131
    .local v3, lengh:I
    #v3=(Integer);
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    #v2=(Integer);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    #v6=(Boolean);
    if-nez v6, :cond_1

    .line 142
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    #v6=(Reference);
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    const-string v6, "}}"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 143
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    const-string v6, "]}"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 144
    const-string v5, "sendValideProductdata result="

    invoke-static {v5, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 145
    const-string v5, "sendValideProductdata filterData="

    invoke-static {v5, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    invoke-static {v0}, Lcom/kabam/utility/UnitySender;->setValideProducts(Ljava/lang/String;)V

    .line 147
    invoke-virtual {p0, v1}, Lcom/kabam/billing/GooglePlayV3;->filterJsonObj(Ljava/lang/String;)V

    .line 148
    return-void

    .line 131
    :cond_1
    #v6=(Boolean);
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    #v4=(Reference);
    check-cast v4, Ljava/lang/String;

    .line 133
    .local v4, thisResponse:Ljava/lang/String;
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    #v7=(Reference);
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v6=(Reference);
    const-string v7, "\"a"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "\":\""

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "\""

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 134
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v6=(Reference);
    const-string v7, "\"itunes_productid\":\""

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "\"}"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 135
    add-int/lit8 v2, v2, 0x1

    .line 136
    if-ge v2, v3, :cond_0

    .line 138
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v6=(Reference);
    const-string v7, ","

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 139
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v6=(Reference);
    const-string v7, ",{"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_0
.end method

*/}
