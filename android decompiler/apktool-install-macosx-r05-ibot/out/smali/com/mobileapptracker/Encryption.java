package com.mobileapptracker; class Encryption {/*

.class public Lcom/mobileapptracker/Encryption;
.super Ljava/lang/Object;
.source "Encryption.java"


# instance fields
.field private cipher:Ljavax/crypto/Cipher;

.field private ivspec:Ljavax/crypto/spec/IvParameterSpec;

.field private keyspec:Ljavax/crypto/spec/SecretKeySpec;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .parameter "SecretKey"
    .parameter "iv"

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    #p0=(Reference);
    new-instance v1, Ljavax/crypto/spec/IvParameterSpec;

    #v1=(UninitRef);
    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/mobileapptracker/Encryption;->ivspec:Ljavax/crypto/spec/IvParameterSpec;

    .line 22
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    #v1=(UninitRef);
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    const-string v3, "AES"

    #v3=(Reference);
    invoke-direct {v1, v2, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/mobileapptracker/Encryption;->keyspec:Ljavax/crypto/spec/SecretKeySpec;

    .line 25
    :try_start_0
    const-string v1, "AES/CBC/NoPadding"

    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v1

    iput-object v1, p0, Lcom/mobileapptracker/Encryption;->cipher:Ljavax/crypto/Cipher;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_1

    .line 33
    :goto_0
    #v0=(Conflicted);
    return-void

    .line 26
    :catch_0
    #v0=(Uninit);
    move-exception v0

    .line 28
    .local v0, e:Ljava/security/NoSuchAlgorithmException;
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V

    goto :goto_0

    .line 29
    .end local v0           #e:Ljava/security/NoSuchAlgorithmException;
    :catch_1
    #v0=(Uninit);
    move-exception v0

    .line 31
    .local v0, e:Ljavax/crypto/NoSuchPaddingException;
    #v0=(Reference);
    invoke-virtual {v0}, Ljavax/crypto/NoSuchPaddingException;->printStackTrace()V

    goto :goto_0
.end method

.method public static hexToBytes(Ljava/lang/String;)[B
    .locals 5
    .parameter "str"

    .prologue
    const/4 v0, 0x0

    .line 102
    #v0=(Null);
    if-nez p0, :cond_1

    .line 112
    :cond_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-object v0

    .line 104
    :cond_1
    #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    #v3=(Integer);
    const/4 v4, 0x2

    #v4=(PosByte);
    if-lt v3, v4, :cond_0

    .line 107
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    div-int/lit8 v2, v3, 0x2

    .line 108
    .local v2, len:I
    #v2=(Integer);
    new-array v0, v2, [B

    .line 109
    .local v0, buffer:[B
    #v0=(Reference);
    const/4 v1, 0x0

    .local v1, i:I
    :goto_0
    #v1=(Integer);
    if-ge v1, v2, :cond_0

    .line 110
    mul-int/lit8 v3, v1, 0x2

    mul-int/lit8 v4, v1, 0x2

    #v4=(Integer);
    add-int/lit8 v4, v4, 0x2

    invoke-virtual {p0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    const/16 v4, 0x10

    #v4=(PosByte);
    invoke-static {v3, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    #v3=(Integer);
    int-to-byte v3, v3

    #v3=(Byte);
    aput-byte v3, v0, v1

    .line 109
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method private static padString(Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .parameter "source"

    .prologue
    .line 121
    const/16 v2, 0x20

    .line 122
    .local v2, paddingChar:C
    #v2=(PosByte);
    const/16 v3, 0x10

    .line 123
    .local v3, size:I
    #v3=(PosByte);
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    #v5=(Integer);
    rem-int v4, v5, v3

    .line 124
    .local v4, x:I
    #v4=(Integer);
    sub-int v1, v3, v4

    .line 126
    .local v1, padLength:I
    #v1=(Integer);
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v5=(Conflicted);v6=(Conflicted);
    if-lt v0, v1, :cond_0

    .line 130
    return-object p0

    .line 127
    :cond_0
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    #v6=(Reference);
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 126
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public bytesToHex([B)Ljava/lang/String;
    .locals 5
    .parameter "data"

    .prologue
    .line 81
    if-nez p1, :cond_1

    .line 82
    const/4 v2, 0x0

    .line 94
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Reference);v3=(Conflicted);v4=(Conflicted);
    return-object v2

    .line 85
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    array-length v1, p1

    .line 86
    .local v1, len:I
    #v1=(Integer);
    const-string v2, ""

    .line 87
    .local v2, str:Ljava/lang/String;
    #v2=(Reference);
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v3=(Conflicted);v4=(Conflicted);
    if-ge v0, v1, :cond_0

    .line 88
    aget-byte v3, p1, v0

    #v3=(Byte);
    and-int/lit16 v3, v3, 0xff

    #v3=(Integer);
    const/16 v4, 0x10

    #v4=(PosByte);
    if-ge v3, v4, :cond_2

    .line 89
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    const-string v4, "0"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    aget-byte v4, p1, v0

    #v4=(Byte);
    and-int/lit16 v4, v4, 0xff

    #v4=(Integer);
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 87
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 91
    :cond_2
    #v3=(Integer);v4=(PosByte);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    aget-byte v4, p1, v0

    #v4=(Byte);
    and-int/lit16 v4, v4, 0xff

    #v4=(Integer);
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1
.end method

.method public decrypt(Ljava/lang/String;)[B
    .locals 6
    .parameter "code"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 62
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    if-nez v2, :cond_1

    :cond_0
    #v2=(Conflicted);
    new-instance v2, Ljava/lang/Exception;

    #v2=(UninitRef);
    const-string v3, "Empty string"

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    throw v2

    .line 64
    :cond_1
    #v2=(Integer);v3=(Uninit);
    const/4 v0, 0x0

    .line 67
    .local v0, decrypted:[B
    :try_start_0
    #v0=(Null);
    iget-object v2, p0, Lcom/mobileapptracker/Encryption;->cipher:Ljavax/crypto/Cipher;

    #v2=(Reference);
    const/4 v3, 0x2

    #v3=(PosByte);
    iget-object v4, p0, Lcom/mobileapptracker/Encryption;->keyspec:Ljavax/crypto/spec/SecretKeySpec;

    #v4=(Reference);
    iget-object v5, p0, Lcom/mobileapptracker/Encryption;->ivspec:Ljavax/crypto/spec/IvParameterSpec;

    #v5=(Reference);
    invoke-virtual {v2, v3, v4, v5}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 69
    iget-object v2, p0, Lcom/mobileapptracker/Encryption;->cipher:Ljavax/crypto/Cipher;

    invoke-static {p1}, Lcom/mobileapptracker/Encryption;->hexToBytes(Ljava/lang/String;)[B

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljavax/crypto/Cipher;->doFinal([B)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 73
    #v0=(Reference);
    return-object v0

    .line 70
    :catch_0
    #v0=(Null);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    move-exception v1

    .line 71
    .local v1, e:Ljava/lang/Exception;
    #v1=(Reference);
    new-instance v2, Ljava/lang/Exception;

    #v2=(UninitRef);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    const-string v4, "[decrypt] "

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    throw v2
.end method

.method public encrypt(Ljava/lang/String;)[B
    .locals 6
    .parameter "text"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 41
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    if-nez v2, :cond_1

    :cond_0
    #v2=(Conflicted);
    new-instance v2, Ljava/lang/Exception;

    #v2=(UninitRef);
    const-string v3, "Empty string"

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    throw v2

    .line 43
    :cond_1
    #v2=(Integer);v3=(Uninit);
    const/4 v1, 0x0

    .line 46
    .local v1, encrypted:[B
    :try_start_0
    #v1=(Null);
    iget-object v2, p0, Lcom/mobileapptracker/Encryption;->cipher:Ljavax/crypto/Cipher;

    #v2=(Reference);
    const/4 v3, 0x1

    #v3=(One);
    iget-object v4, p0, Lcom/mobileapptracker/Encryption;->keyspec:Ljavax/crypto/spec/SecretKeySpec;

    #v4=(Reference);
    iget-object v5, p0, Lcom/mobileapptracker/Encryption;->ivspec:Ljavax/crypto/spec/IvParameterSpec;

    #v5=(Reference);
    invoke-virtual {v2, v3, v4, v5}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 48
    iget-object v2, p0, Lcom/mobileapptracker/Encryption;->cipher:Ljavax/crypto/Cipher;

    invoke-static {p1}, Lcom/mobileapptracker/Encryption;->padString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljavax/crypto/Cipher;->doFinal([B)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 53
    #v1=(Reference);
    return-object v1

    .line 49
    :catch_0
    #v1=(Null);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    move-exception v0

    .line 50
    .local v0, e:Ljava/lang/Exception;
    #v0=(Reference);
    new-instance v2, Ljava/lang/Exception;

    #v2=(UninitRef);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    const-string v4, "[encrypt] "

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    throw v2
.end method

.method public md5(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .parameter "s"

    .prologue
    .line 136
    :try_start_0
    const-string v5, "MD5"

    #v5=(Reference);
    invoke-static {v5}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    .line 137
    .local v0, digest:Ljava/security/MessageDigest;
    #v0=(Reference);
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/security/MessageDigest;->update([B)V

    .line 138
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v4

    .line 141
    .local v4, messageDigest:[B
    #v4=(Reference);
    new-instance v2, Ljava/lang/StringBuffer;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 142
    .local v2, hexString:Ljava/lang/StringBuffer;
    #v2=(Reference);
    const/4 v3, 0x0

    .local v3, i:I
    :goto_0
    #v3=(Integer);
    array-length v5, v4

    #v5=(Integer);
    if-lt v3, v5, :cond_0

    .line 145
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {v5}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v5

    .line 149
    .end local v0           #digest:Ljava/security/MessageDigest;
    .end local v2           #hexString:Ljava/lang/StringBuffer;
    .end local v3           #i:I
    .end local v4           #messageDigest:[B
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-object v5

    .line 143
    .restart local v0       #digest:Ljava/security/MessageDigest;
    .restart local v2       #hexString:Ljava/lang/StringBuffer;
    .restart local v3       #i:I
    .restart local v4       #messageDigest:[B
    :cond_0
    #v0=(Reference);v1=(Uninit);v2=(Reference);v3=(Integer);v4=(Reference);v5=(Integer);
    aget-byte v5, v4, v3

    #v5=(Byte);
    and-int/lit16 v5, v5, 0xff

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {v2, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 142
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 146
    .end local v0           #digest:Ljava/security/MessageDigest;
    .end local v2           #hexString:Ljava/lang/StringBuffer;
    .end local v3           #i:I
    .end local v4           #messageDigest:[B
    :catch_0
    move-exception v1

    .line 147
    .local v1, e:Ljava/security/NoSuchAlgorithmException;
    #v1=(Reference);
    invoke-virtual {v1}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V

    .line 149
    const-string v5, ""

    #v5=(Reference);
    goto :goto_1
.end method

*/}
