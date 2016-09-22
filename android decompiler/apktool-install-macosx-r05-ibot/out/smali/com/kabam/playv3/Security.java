package com.kabam.playv3; class Security {/*

.class public Lcom/kabam/playv3/Security;
.super Ljava/lang/Object;
.source "Security.java"


# static fields
.field private static final KEY_FACTORY_ALGORITHM:Ljava/lang/String; = "RSA"

.field private static final SIGNATURE_ALGORITHM:Ljava/lang/String; = "SHA1withRSA"

.field private static final TAG:Ljava/lang/String; = "IABUtil/Security"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static generatePublicKey(Ljava/lang/String;)Ljava/security/PublicKey;
    .locals 5
    .parameter "encodedPublicKey"

    .prologue
    .line 84
    :try_start_0
    invoke-static {p0}, Lcom/kabam/playv3/Base64;->decode(Ljava/lang/String;)[B

    move-result-object v0

    .line 85
    .local v0, decodedKey:[B
    #v0=(Reference);
    const-string v3, "RSA"

    #v3=(Reference);
    invoke-static {v3}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v2

    .line 86
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
    .catch Lcom/kabam/playv3/Base64DecoderException; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v3

    return-object v3

    .line 87
    .end local v0           #decodedKey:[B
    .end local v2           #keyFactory:Ljava/security/KeyFactory;
    :catch_0
    move-exception v1

    .line 88
    .local v1, e:Ljava/security/NoSuchAlgorithmException;
    #v1=(Reference);
    new-instance v3, Ljava/lang/RuntimeException;

    #v3=(UninitRef);
    invoke-direct {v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    #v3=(Reference);
    throw v3

    .line 89
    .end local v1           #e:Ljava/security/NoSuchAlgorithmException;
    :catch_1
    move-exception v1

    .line 90
    .local v1, e:Ljava/security/spec/InvalidKeySpecException;
    #v1=(Reference);
    const-string v3, "IABUtil/Security"

    #v3=(Reference);
    const-string v4, "Invalid key specification."

    #v4=(Reference);
    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 91
    new-instance v3, Ljava/lang/IllegalArgumentException;

    #v3=(UninitRef);
    invoke-direct {v3, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    #v3=(Reference);
    throw v3

    .line 92
    .end local v1           #e:Ljava/security/spec/InvalidKeySpecException;
    :catch_2
    move-exception v1

    .line 93
    .local v1, e:Lcom/kabam/playv3/Base64DecoderException;
    #v1=(Reference);
    const-string v3, "IABUtil/Security"

    #v3=(Reference);
    const-string v4, "Base64 decoding failed."

    #v4=(Reference);
    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 94
    new-instance v3, Ljava/lang/IllegalArgumentException;

    #v3=(UninitRef);
    invoke-direct {v3, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    #v3=(Reference);
    throw v3
.end method

.method public static verify(Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5
    .parameter "publicKey"
    .parameter "signedData"
    .parameter "signature"

    .prologue
    const/4 v2, 0x0

    .line 110
    :try_start_0
    #v2=(Null);
    const-string v3, "SHA1withRSA"

    #v3=(Reference);
    invoke-static {v3}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v1

    .line 111
    .local v1, sig:Ljava/security/Signature;
    #v1=(Reference);
    invoke-virtual {v1, p0}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    .line 112
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/security/Signature;->update([B)V

    .line 113
    invoke-static {p2}, Lcom/kabam/playv3/Base64;->decode(Ljava/lang/String;)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/security/Signature;->verify([B)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_0

    .line 114
    const-string v3, "IABUtil/Security"

    #v3=(Reference);
    const-string v4, "Signature verification failed."

    #v4=(Reference);
    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/kabam/playv3/Base64DecoderException; {:try_start_0 .. :try_end_0} :catch_3

    .line 127
    .end local v1           #sig:Ljava/security/Signature;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);
    return v2

    .line 117
    .restart local v1       #sig:Ljava/security/Signature;
    :cond_0
    #v0=(Uninit);v1=(Reference);v2=(Null);v3=(Boolean);v4=(Uninit);
    const/4 v2, 0x1

    #v2=(One);
    goto :goto_0

    .line 118
    .end local v1           #sig:Ljava/security/Signature;
    :catch_0
    #v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Conflicted);
    move-exception v0

    .line 119
    .local v0, e:Ljava/security/NoSuchAlgorithmException;
    #v0=(Reference);
    const-string v3, "IABUtil/Security"

    #v3=(Reference);
    const-string v4, "NoSuchAlgorithmException."

    #v4=(Reference);
    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 120
    .end local v0           #e:Ljava/security/NoSuchAlgorithmException;
    :catch_1
    #v0=(Uninit);v3=(Conflicted);v4=(Conflicted);
    move-exception v0

    .line 121
    .local v0, e:Ljava/security/InvalidKeyException;
    #v0=(Reference);
    const-string v3, "IABUtil/Security"

    #v3=(Reference);
    const-string v4, "Invalid key specification."

    #v4=(Reference);
    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 122
    .end local v0           #e:Ljava/security/InvalidKeyException;
    :catch_2
    #v0=(Uninit);v3=(Conflicted);v4=(Conflicted);
    move-exception v0

    .line 123
    .local v0, e:Ljava/security/SignatureException;
    #v0=(Reference);
    const-string v3, "IABUtil/Security"

    #v3=(Reference);
    const-string v4, "Signature exception."

    #v4=(Reference);
    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 124
    .end local v0           #e:Ljava/security/SignatureException;
    :catch_3
    #v0=(Uninit);v3=(Conflicted);v4=(Conflicted);
    move-exception v0

    .line 125
    .local v0, e:Lcom/kabam/playv3/Base64DecoderException;
    #v0=(Reference);
    const-string v3, "IABUtil/Security"

    #v3=(Reference);
    const-string v4, "Base64 decoding failed."

    #v4=(Reference);
    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static verifyPurchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5
    .parameter "base64PublicKey"
    .parameter "signedData"
    .parameter "signature"

    .prologue
    const/4 v2, 0x0

    .line 58
    #v2=(Null);
    if-nez p1, :cond_0

    .line 59
    const-string v3, "IABUtil/Security"

    #v3=(Reference);
    const-string v4, "data is null"

    #v4=(Reference);
    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);
    return v2

    .line 63
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Uninit);v4=(Uninit);
    const/4 v1, 0x0

    .line 64
    .local v1, verified:Z
    #v1=(Null);
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_1

    .line 65
    invoke-static {p0}, Lcom/kabam/playv3/Security;->generatePublicKey(Ljava/lang/String;)Ljava/security/PublicKey;

    move-result-object v0

    .line 66
    .local v0, key:Ljava/security/PublicKey;
    #v0=(Reference);
    invoke-static {v0, p1, p2}, Lcom/kabam/playv3/Security;->verify(Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    .line 67
    #v1=(Boolean);
    if-nez v1, :cond_1

    .line 68
    const-string v3, "IABUtil/Security"

    #v3=(Reference);
    const-string v4, "signature does not match data."

    #v4=(Reference);
    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 72
    .end local v0           #key:Ljava/security/PublicKey;
    :cond_1
    #v0=(Conflicted);v3=(Boolean);v4=(Uninit);
    const/4 v2, 0x1

    #v2=(One);
    goto :goto_0
.end method

*/}
