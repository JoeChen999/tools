package com.unity3d.player.a; class a {/*

.class public final Lcom/unity3d/player/a/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/unity3d/player/a/h;


# static fields
.field private static final a:[B


# instance fields
.field private b:Ljavax/crypto/Cipher;

.field private c:Ljavax/crypto/Cipher;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    #v0=(PosByte);
    new-array v0, v0, [B

    #v0=(Reference);
    fill-array-data v0, :array_0

    sput-object v0, Lcom/unity3d/player/a/a;->a:[B

    return-void

    :array_0
    .array-data 0x1
        0x10t
        0x4at
        0x47t
        0xb0t
        0x20t
        0x65t
        0xd1t
        0x48t
        0x75t
        0xf2t
        0x0t
        0xe3t
        0x46t
        0x41t
        0xf4t
        0x4at
    .end array-data
.end method

.method public constructor <init>([BLjava/lang/String;Ljava/lang/String;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    #p0=(Reference);
    const-string v0, "PBEWITHSHAAND256BITAES-CBC-BC"

    #v0=(Reference);
    invoke-static {v0}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v0

    new-instance v1, Ljavax/crypto/spec/PBEKeySpec;

    #v1=(UninitRef);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    const/16 v3, 0x400

    #v3=(PosShort);
    const/16 v4, 0x100

    #v4=(PosShort);
    invoke-direct {v1, v2, p1, v3, v4}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C[BII)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v0

    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    #v1=(UninitRef);
    invoke-interface {v0}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object v0

    const-string v2, "AES"

    invoke-direct {v1, v0, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    #v1=(Reference);
    const-string v0, "AES/CBC/PKCS5Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    iput-object v0, p0, Lcom/unity3d/player/a/a;->b:Ljavax/crypto/Cipher;

    iget-object v0, p0, Lcom/unity3d/player/a/a;->b:Ljavax/crypto/Cipher;

    const/4 v2, 0x1

    #v2=(One);
    new-instance v3, Ljavax/crypto/spec/IvParameterSpec;

    #v3=(UninitRef);
    sget-object v4, Lcom/unity3d/player/a/a;->a:[B

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    #v3=(Reference);
    invoke-virtual {v0, v2, v1, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    const-string v0, "AES/CBC/PKCS5Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    iput-object v0, p0, Lcom/unity3d/player/a/a;->c:Ljavax/crypto/Cipher;

    iget-object v0, p0, Lcom/unity3d/player/a/a;->c:Ljavax/crypto/Cipher;

    const/4 v2, 0x2

    #v2=(PosByte);
    new-instance v3, Ljavax/crypto/spec/IvParameterSpec;

    #v3=(UninitRef);
    sget-object v4, Lcom/unity3d/player/a/a;->a:[B

    invoke-direct {v3, v4}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    #v3=(Reference);
    invoke-virtual {v0, v2, v1, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    move-exception v0

    #v0=(Reference);
    new-instance v1, Ljava/lang/RuntimeException;

    #v1=(UninitRef);
    const-string v2, "Invalid environment"

    #v2=(Reference);
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    #v1=(Reference);
    throw v1
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);
    return-object v0

    :cond_0
    :try_start_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    iget-object v0, p0, Lcom/unity3d/player/a/a;->b:Ljavax/crypto/Cipher;

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "com.android.vending.licensing.AESObfuscator-1|"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    invoke-static {v0}, Lcom/unity3d/player/b/a;->a([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    new-instance v1, Ljava/lang/RuntimeException;

    #v1=(UninitRef);
    const-string v2, "Invalid environment"

    #v2=(Reference);
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    #v1=(Reference);
    throw v1

    :catch_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    new-instance v1, Ljava/lang/RuntimeException;

    #v1=(UninitRef);
    const-string v2, "Invalid environment"

    #v2=(Reference);
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    #v1=(Reference);
    throw v1
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);
    return-object v0

    :cond_0
    :try_start_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    new-instance v0, Ljava/lang/String;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/unity3d/player/a/a;->c:Ljavax/crypto/Cipher;

    #v1=(Reference);
    invoke-static {p1}, Lcom/unity3d/player/b/a;->a(Ljava/lang/String;)[B

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    #v0=(Reference);
    const-string v1, "com.android.vending.licensing.AESObfuscator-1|"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    if-eqz v1, :cond_1

    new-instance v0, Lcom/unity3d/player/a/l;

    #v0=(UninitRef);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "Header not found (invalid data or key):"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/unity3d/player/a/l;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0
    :try_end_0
    .catch Lcom/unity3d/player/b/b; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_3

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    new-instance v1, Lcom/unity3d/player/a/l;

    #v1=(UninitRef);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    invoke-virtual {v0}, Lcom/unity3d/player/b/b;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/unity3d/player/a/l;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    throw v1

    :cond_1
    :try_start_1
    #v1=(Integer);
    const-string v1, "com.android.vending.licensing.AESObfuscator-1|"

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    :try_end_1
    .catch Lcom/unity3d/player/b/b; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljavax/crypto/BadPaddingException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_3

    move-result-object v0

    goto :goto_0

    :catch_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    new-instance v1, Lcom/unity3d/player/a/l;

    #v1=(UninitRef);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    invoke-virtual {v0}, Ljavax/crypto/IllegalBlockSizeException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/unity3d/player/a/l;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    throw v1

    :catch_2
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    new-instance v1, Lcom/unity3d/player/a/l;

    #v1=(UninitRef);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    invoke-virtual {v0}, Ljavax/crypto/BadPaddingException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/unity3d/player/a/l;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    throw v1

    :catch_3
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    new-instance v1, Ljava/lang/RuntimeException;

    #v1=(UninitRef);
    const-string v2, "Invalid environment"

    #v2=(Reference);
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    #v1=(Reference);
    throw v1
.end method

*/}
