package com.kabam.billing; class Security {/*

.class public Lcom/kabam/billing/Security;
.super Ljava/lang/Object;
.source "Security.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kabam/billing/Security$VerifiedPurchase;
    }
.end annotation


# static fields
.field private static final KEY_FACTORY_ALGORITHM:Ljava/lang/String; = "RSA"

.field private static final SIGNATURE_ALGORITHM:Ljava/lang/String; = "SHA1withRSA"

.field private static final TAG:Ljava/lang/String; = "Security"

.field private static sKnownNonces:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 53
    new-instance v0, Ljava/util/HashSet;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/kabam/billing/Security;->sKnownNonces:Ljava/util/HashSet;

    .line 37
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static generateNonce()J
    .locals 4

    .prologue
    .line 80
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/kabam/utility/Provider;->ProvideNounce()J

    move-result-wide v0

    .line 81
    .local v0, nonce:J
    #v0=(LongLo);v1=(LongHi);
    sget-object v2, Lcom/kabam/billing/Security;->sKnownNonces:Ljava/util/HashSet;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 82
    return-wide v0
.end method

.method public static generatePublicKey(Ljava/lang/String;)Ljava/security/PublicKey;
    .locals 4
    .parameter "encodedPublicKey"

    .prologue
    .line 188
    :try_start_0
    invoke-static {p0}, Lcom/kabam/billing/util/Base64;->decode(Ljava/lang/String;)[B

    move-result-object v0

    .line 189
    .local v0, decodedKey:[B
    #v0=(Reference);
    const-string v3, "RSA"

    #v3=(Reference);
    invoke-static {v3}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v2

    .line 190
    .local v2, keyFactory:Ljava/security/KeyFactory;
    #v2=(Reference);
    new-instance v3, Ljava/security/spec/X509EncodedKeySpec;

    #v3=(UninitRef);
    invoke-direct {v3, v0}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/kabam/billing/util/Base64DecoderException; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v3

    return-object v3

    .line 191
    .end local v0           #decodedKey:[B
    .end local v2           #keyFactory:Ljava/security/KeyFactory;
    :catch_0
    move-exception v1

    .line 192
    .local v1, e:Ljava/security/NoSuchAlgorithmException;
    #v1=(Reference);
    new-instance v3, Ljava/lang/RuntimeException;

    #v3=(UninitRef);
    invoke-direct {v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    #v3=(Reference);
    throw v3

    .line 193
    .end local v1           #e:Ljava/security/NoSuchAlgorithmException;
    :catch_1
    move-exception v1

    .line 194
    .local v1, e:Ljava/security/spec/InvalidKeySpecException;
    #v1=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3, v1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    .line 195
    new-instance v3, Ljava/lang/IllegalArgumentException;

    #v3=(UninitRef);
    invoke-direct {v3, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    #v3=(Reference);
    throw v3

    .line 196
    .end local v1           #e:Ljava/security/spec/InvalidKeySpecException;
    :catch_2
    move-exception v1

    .line 197
    .local v1, e:Lcom/kabam/billing/util/Base64DecoderException;
    #v1=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3, v1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    .line 198
    new-instance v3, Ljava/lang/IllegalArgumentException;

    #v3=(UninitRef);
    invoke-direct {v3, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    #v3=(Reference);
    throw v3
.end method

.method public static isNonceKnown(J)Z
    .locals 2
    .parameter "nonce"

    .prologue
    .line 90
    sget-object v0, Lcom/kabam/billing/Security;->sKnownNonces:Ljava/util/HashSet;

    #v0=(Reference);
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static removeNonce(J)V
    .locals 2
    .parameter "nonce"

    .prologue
    .line 86
    sget-object v0, Lcom/kabam/billing/Security;->sKnownNonces:Ljava/util/HashSet;

    #v0=(Reference);
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 87
    return-void
.end method

.method public static verify(Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3
    .parameter "publicKey"
    .parameter "signedData"
    .parameter "signature"

    .prologue
    .line 214
    const-string v0, "Security"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "signature: "

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 216
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Lcom/kabam/utility/Provider;->IsVerified(Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static verifyPurchase(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 26
    .parameter "signedData"
    .parameter "signature"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/kabam/billing/Security$VerifiedPurchase;",
            ">;"
        }
    .end annotation

    .prologue
    .line 106
    if-nez p0, :cond_0

    .line 107
    const-string v3, "Security"

    #v3=(Reference);
    const-string v24, "data is null"

    #v24=(Reference);
    move-object/from16 v0, v24

    #v0=(Reference);
    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    const/16 v21, 0x0

    .line 176
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Reference);v22=(Conflicted);v23=(Conflicted);v25=(Conflicted);
    return-object v21

    .line 111
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);
    const-string v3, "Security"

    #v3=(Reference);
    new-instance v24, Ljava/lang/StringBuilder;

    #v24=(UninitRef);
    const-string v25, "signedData: "

    #v25=(Reference);
    invoke-direct/range {v24 .. v25}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v24=(Reference);
    move-object/from16 v0, v24

    #v0=(Reference);
    move-object/from16 v1, p0

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v24

    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    const/16 v23, 0x0

    .line 114
    .local v23, verified:Z
    #v23=(Null);
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_1

    .line 116
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/kabam/utility/Provider;->ProvidePublicKey()Ljava/security/PublicKey;

    move-result-object v16

    .line 117
    .local v16, key:Ljava/security/PublicKey;
    #v16=(Reference);
    move-object/from16 v0, v16

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    #v2=(Reference);
    invoke-static {v0, v1, v2}, Lcom/kabam/billing/Security;->verify(Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v23

    .line 118
    #v23=(Boolean);
    if-nez v23, :cond_1

    .line 119
    const-string v3, "Security"

    const-string v24, "signature does not match data."

    move-object/from16 v0, v24

    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 120
    const/16 v21, 0x0

    #v21=(Null);
    goto :goto_0

    .line 125
    .end local v16           #key:Ljava/security/PublicKey;
    :cond_1
    #v2=(Conflicted);v3=(Conflicted);v16=(Conflicted);v21=(Uninit);
    const/4 v15, 0x0

    .line 126
    .local v15, jTransactionsArray:Lorg/json/JSONArray;
    #v15=(Null);
    const/16 v19, 0x0

    .line 127
    .local v19, numTransactions:I
    #v19=(Null);
    const-wide/16 v17, 0x0

    .line 129
    .local v17, nonce:J
    :try_start_0
    #v17=(LongLo);v18=(LongHi);
    new-instance v14, Lorg/json/JSONObject;

    #v14=(UninitRef);
    move-object/from16 v0, p0

    invoke-direct {v14, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 132
    .local v14, jObject:Lorg/json/JSONObject;
    #v14=(Reference);
    const-string v3, "nonce"

    #v3=(Reference);
    invoke-virtual {v14, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v17

    .line 133
    const-string v3, "orders"

    invoke-virtual {v14, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v15

    .line 134
    #v15=(Reference);
    if-eqz v15, :cond_2

    .line 135
    invoke-virtual {v15}, Lorg/json/JSONArray;->length()I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v19

    .line 142
    :cond_2
    #v19=(Integer);
    invoke-static/range {v17 .. v18}, Lcom/kabam/billing/Security;->isNonceKnown(J)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_3

    .line 143
    const-string v3, "Security"

    #v3=(Reference);
    new-instance v24, Ljava/lang/StringBuilder;

    #v24=(UninitRef);
    const-string v25, "Nonce not found: "

    invoke-direct/range {v24 .. v25}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v24=(Reference);
    move-object/from16 v0, v24

    move-wide/from16 v1, v17

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v24

    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 144
    const/16 v21, 0x0

    #v21=(Null);
    goto/16 :goto_0

    .line 137
    .end local v14           #jObject:Lorg/json/JSONObject;
    :catch_0
    #v1=(Reference);v2=(Conflicted);v3=(Conflicted);v14=(Conflicted);v19=(Null);v21=(Uninit);
    move-exception v11

    .line 138
    .local v11, e:Lorg/json/JSONException;
    #v11=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3, v11}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    .line 139
    const/16 v21, 0x0

    #v21=(Null);
    goto/16 :goto_0

    .line 147
    .end local v11           #e:Lorg/json/JSONException;
    .restart local v14       #jObject:Lorg/json/JSONObject;
    :cond_3
    #v3=(Boolean);v11=(Uninit);v14=(Reference);v19=(Integer);v21=(Uninit);
    new-instance v21, Ljava/util/ArrayList;

    #v21=(UninitRef);
    invoke-direct/range {v21 .. v21}, Ljava/util/ArrayList;-><init>()V

    .line 149
    .local v21, purchases:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Lcom/kabam/billing/Security$VerifiedPurchase;>;"
    #v21=(Reference);
    const/4 v12, 0x0

    .local v12, i:I
    :goto_1
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Integer);v13=(Conflicted);v20=(Conflicted);v22=(Conflicted);
    move/from16 v0, v19

    #v0=(Integer);
    if-lt v12, v0, :cond_4

    .line 175
    invoke-static/range {v17 .. v18}, Lcom/kabam/billing/Security;->removeNonce(J)V

    goto/16 :goto_0

    .line 150
    :cond_4
    :try_start_1
    invoke-virtual {v15, v12}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v13

    .line 151
    .local v13, jElement:Lorg/json/JSONObject;
    #v13=(Reference);
    const-string v3, "purchaseState"

    #v3=(Reference);
    invoke-virtual {v13, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v22

    .line 152
    .local v22, response:I
    #v22=(Integer);
    invoke-static/range {v22 .. v22}, Lcom/kabam/utility/constance/Constance$PurchaseState;->valueOf(I)Lcom/kabam/utility/constance/Constance$PurchaseState;

    move-result-object v4

    .line 153
    .local v4, purchaseState:Lcom/kabam/utility/constance/Constance$PurchaseState;
    #v4=(Reference);
    const-string v3, "productId"

    invoke-virtual {v13, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 154
    .local v6, productId:Ljava/lang/String;
    #v6=(Reference);
    const-string v3, "packageName"

    invoke-virtual {v13, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 155
    .local v20, packageName:Ljava/lang/String;
    #v20=(Reference);
    const-string v3, "purchaseTime"

    invoke-virtual {v13, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v8

    .line 156
    .local v8, purchaseTime:J
    #v8=(LongLo);v9=(LongHi);
    const-string v3, "orderId"

    const-string v24, ""

    move-object/from16 v0, v24

    #v0=(Reference);
    invoke-virtual {v13, v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 157
    .local v7, orderId:Ljava/lang/String;
    #v7=(Reference);
    const/4 v5, 0x0

    .line 158
    .local v5, notifyId:Ljava/lang/String;
    #v5=(Null);
    const-string v3, "notificationId"

    invoke-virtual {v13, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_5

    .line 159
    const-string v3, "notificationId"

    #v3=(Reference);
    invoke-virtual {v13, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 161
    :cond_5
    #v3=(Conflicted);v5=(Reference);
    const-string v3, "developerPayload"

    #v3=(Reference);
    const/16 v24, 0x0

    #v24=(Null);
    move-object/from16 v0, v24

    #v0=(Null);
    invoke-virtual {v13, v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 165
    .local v10, developerPayload:Ljava/lang/String;
    #v10=(Reference);
    sget-object v3, Lcom/kabam/utility/constance/Constance$PurchaseState;->PURCHASED:Lcom/kabam/utility/constance/Constance$PurchaseState;

    if-ne v4, v3, :cond_6

    if-nez v23, :cond_6

    .line 149
    :goto_2
    #v0=(Reference);
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    .line 168
    :cond_6
    #v0=(Null);
    new-instance v3, Lcom/kabam/billing/Security$VerifiedPurchase;

    .line 169
    #v3=(UninitRef);
    invoke-direct/range {v3 .. v10}, Lcom/kabam/billing/Security$VerifiedPurchase;-><init>(Lcom/kabam/utility/constance/Constance$PurchaseState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 168
    #v3=(Reference);
    move-object/from16 v0, v21

    #v0=(Reference);
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    .line 171
    .end local v4           #purchaseState:Lcom/kabam/utility/constance/Constance$PurchaseState;
    .end local v5           #notifyId:Ljava/lang/String;
    .end local v6           #productId:Ljava/lang/String;
    .end local v7           #orderId:Ljava/lang/String;
    .end local v8           #purchaseTime:J
    .end local v10           #developerPayload:Ljava/lang/String;
    .end local v13           #jElement:Lorg/json/JSONObject;
    .end local v20           #packageName:Ljava/lang/String;
    .end local v22           #response:I
    :catch_1
    #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v13=(Conflicted);v20=(Conflicted);v22=(Conflicted);v24=(Reference);
    move-exception v11

    .line 172
    .restart local v11       #e:Lorg/json/JSONException;
    #v11=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3, v11}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    .line 173
    const/16 v21, 0x0

    #v21=(Null);
    goto/16 :goto_0
.end method

*/}
