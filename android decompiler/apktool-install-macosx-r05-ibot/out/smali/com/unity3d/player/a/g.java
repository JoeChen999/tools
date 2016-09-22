package com.unity3d.player.a; class g {/*

.class final Lcom/unity3d/player/a/g;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/unity3d/player/a/i;

.field private final b:Lcom/unity3d/player/a/f;

.field private final c:I

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Lcom/unity3d/player/a/b;


# direct methods
.method constructor <init>(Lcom/unity3d/player/a/i;Lcom/unity3d/player/a/b;Lcom/unity3d/player/a/f;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-object p1, p0, Lcom/unity3d/player/a/g;->a:Lcom/unity3d/player/a/i;

    iput-object p2, p0, Lcom/unity3d/player/a/g;->f:Lcom/unity3d/player/a/b;

    iput-object p3, p0, Lcom/unity3d/player/a/g;->b:Lcom/unity3d/player/a/f;

    iput p4, p0, Lcom/unity3d/player/a/g;->c:I

    iput-object p5, p0, Lcom/unity3d/player/a/g;->d:Ljava/lang/String;

    iput-object p6, p0, Lcom/unity3d/player/a/g;->e:Ljava/lang/String;

    return-void
.end method

.method private a(ILcom/unity3d/player/a/k;)V
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/a/g;->a:Lcom/unity3d/player/a/i;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2}, Lcom/unity3d/player/a/i;->a(ILcom/unity3d/player/a/k;)V

    iget-object v0, p0, Lcom/unity3d/player/a/g;->a:Lcom/unity3d/player/a/i;

    invoke-virtual {v0}, Lcom/unity3d/player/a/i;->a()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/a/g;->b:Lcom/unity3d/player/a/f;

    #v0=(Reference);
    invoke-interface {v0}, Lcom/unity3d/player/a/f;->a()V

    :goto_0
    return-void

    :cond_0
    #v0=(Boolean);
    iget-object v0, p0, Lcom/unity3d/player/a/g;->b:Lcom/unity3d/player/a/f;

    #v0=(Reference);
    invoke-interface {v0}, Lcom/unity3d/player/a/f;->b()V

    goto :goto_0
.end method


# virtual methods
.method public final a()Lcom/unity3d/player/a/f;
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/a/g;->b:Lcom/unity3d/player/a/f;

    #v0=(Reference);
    return-object v0
.end method

.method public final a(Ljava/security/PublicKey;ILjava/lang/String;Ljava/lang/String;)V
    .locals 7

    const/4 v1, 0x2

    #v1=(PosByte);
    const/4 v6, 0x0

    #v6=(Null);
    const/4 v5, 0x1

    #v5=(One);
    const/4 v4, -0x1

    #v4=(Byte);
    const/4 v0, 0x0

    #v0=(Null);
    if-eqz p2, :cond_0

    if-eq p2, v5, :cond_0

    if-ne p2, v1, :cond_9

    :cond_0
    :try_start_0
    const-string v0, "SHA1withRSA"

    #v0=(Reference);
    invoke-static {v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    invoke-virtual {p3}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/security/Signature;->update([B)V

    invoke-static {p4}, Lcom/unity3d/player/b/a;->a(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/Signature;->verify([B)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/unity3d/player/a/g;->b:Lcom/unity3d/player/a/f;

    #v0=(Reference);
    invoke-interface {v0}, Lcom/unity3d/player/a/f;->b()V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/unity3d/player/b/b; {:try_start_0 .. :try_end_0} :catch_3

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    :catch_0
    #v0=(Conflicted);v2=(Uninit);v3=(Uninit);
    move-exception v0

    #v0=(Reference);
    new-instance v1, Ljava/lang/RuntimeException;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    #v1=(Reference);
    throw v1

    :catch_1
    #v0=(Conflicted);v1=(Conflicted);
    move-exception v0

    #v0=(Reference);
    sget-object v0, Lcom/unity3d/player/a/f$a;->d:Lcom/unity3d/player/a/f$a;

    iget-object v0, p0, Lcom/unity3d/player/a/g;->b:Lcom/unity3d/player/a/f;

    goto :goto_0

    :catch_2
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    new-instance v1, Ljava/lang/RuntimeException;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    #v1=(Reference);
    throw v1

    :catch_3
    #v0=(Conflicted);v1=(Conflicted);
    move-exception v0

    #v0=(Reference);
    iget-object v0, p0, Lcom/unity3d/player/a/g;->b:Lcom/unity3d/player/a/f;

    invoke-interface {v0}, Lcom/unity3d/player/a/f;->b()V

    goto :goto_0

    :cond_1
    :try_start_1
    #v0=(Boolean);v1=(Reference);
    new-instance v0, Landroid/text/TextUtils$SimpleStringSplitter;

    #v0=(UninitRef);
    const/16 v1, 0x3a

    #v1=(PosByte);
    invoke-direct {v0, v1}, Landroid/text/TextUtils$SimpleStringSplitter;-><init>(C)V

    #v0=(Reference);
    invoke-interface {v0, p3}, Landroid/text/TextUtils$StringSplitter;->setString(Ljava/lang/String;)V

    invoke-interface {v0}, Landroid/text/TextUtils$StringSplitter;->iterator()Ljava/util/Iterator;

    move-result-object v2

    #v2=(Reference);
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, ""

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_4

    :catch_4
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    move-exception v0

    #v0=(Reference);
    iget-object v0, p0, Lcom/unity3d/player/a/g;->b:Lcom/unity3d/player/a/f;

    invoke-interface {v0}, Lcom/unity3d/player/a/f;->b()V

    goto :goto_0

    :cond_2
    :try_start_2
    #v0=(Boolean);v1=(PosByte);v2=(Reference);v3=(Uninit);
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/lang/String;

    const-string v1, ""

    #v1=(Reference);
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    :cond_3
    const-string v2, "|"

    invoke-static {v2}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    array-length v0, v2

    #v0=(Integer);
    const/4 v3, 0x6

    #v3=(PosByte);
    if-ge v0, v3, :cond_4

    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_4
    #v0=(Integer);
    new-instance v0, Lcom/unity3d/player/a/k;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/unity3d/player/a/k;-><init>()V

    #v0=(Reference);
    iput-object v1, v0, Lcom/unity3d/player/a/k;->g:Ljava/lang/String;

    const/4 v1, 0x0

    #v1=(Null);
    aget-object v1, v2, v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    iput v1, v0, Lcom/unity3d/player/a/k;->a:I

    const/4 v1, 0x1

    #v1=(One);
    aget-object v1, v2, v1

    #v1=(Null);
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    iput v1, v0, Lcom/unity3d/player/a/k;->b:I

    const/4 v1, 0x2

    #v1=(PosByte);
    aget-object v1, v2, v1

    #v1=(Null);
    iput-object v1, v0, Lcom/unity3d/player/a/k;->c:Ljava/lang/String;

    const/4 v1, 0x3

    #v1=(PosByte);
    aget-object v1, v2, v1

    #v1=(Null);
    iput-object v1, v0, Lcom/unity3d/player/a/k;->d:Ljava/lang/String;

    const/4 v1, 0x4

    #v1=(PosByte);
    aget-object v1, v2, v1

    #v1=(Null);
    iput-object v1, v0, Lcom/unity3d/player/a/k;->e:Ljava/lang/String;

    const/4 v1, 0x5

    #v1=(PosByte);
    aget-object v1, v2, v1

    #v1=(Null);
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    #v1=(LongLo);v2=(LongHi);
    iput-wide v1, v0, Lcom/unity3d/player/a/k;->f:J
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_4

    iget v1, v0, Lcom/unity3d/player/a/k;->a:I

    #v1=(Integer);
    if-eq v1, p2, :cond_5

    iget-object v0, p0, Lcom/unity3d/player/a/g;->b:Lcom/unity3d/player/a/f;

    invoke-interface {v0}, Lcom/unity3d/player/a/f;->b()V

    goto/16 :goto_0

    :cond_5
    iget v1, v0, Lcom/unity3d/player/a/k;->b:I

    iget v2, p0, Lcom/unity3d/player/a/g;->c:I

    #v2=(Integer);
    if-eq v1, v2, :cond_6

    iget-object v0, p0, Lcom/unity3d/player/a/g;->b:Lcom/unity3d/player/a/f;

    invoke-interface {v0}, Lcom/unity3d/player/a/f;->b()V

    goto/16 :goto_0

    :cond_6
    iget-object v1, v0, Lcom/unity3d/player/a/k;->c:Ljava/lang/String;

    #v1=(Reference);
    iget-object v2, p0, Lcom/unity3d/player/a/g;->d:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_7

    iget-object v0, p0, Lcom/unity3d/player/a/g;->b:Lcom/unity3d/player/a/f;

    invoke-interface {v0}, Lcom/unity3d/player/a/f;->b()V

    goto/16 :goto_0

    :cond_7
    iget-object v1, v0, Lcom/unity3d/player/a/k;->d:Ljava/lang/String;

    #v1=(Reference);
    iget-object v2, p0, Lcom/unity3d/player/a/g;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_8

    iget-object v0, p0, Lcom/unity3d/player/a/g;->b:Lcom/unity3d/player/a/f;

    invoke-interface {v0}, Lcom/unity3d/player/a/f;->b()V

    goto/16 :goto_0

    :cond_8
    iget-object v1, v0, Lcom/unity3d/player/a/k;->e:Ljava/lang/String;

    #v1=(Reference);
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_9

    iget-object v0, p0, Lcom/unity3d/player/a/g;->b:Lcom/unity3d/player/a/f;

    invoke-interface {v0}, Lcom/unity3d/player/a/f;->b()V

    goto/16 :goto_0

    :cond_9
    #v1=(PosByte);v2=(Conflicted);v3=(Conflicted);
    sparse-switch p2, :sswitch_data_0

    iget-object v0, p0, Lcom/unity3d/player/a/g;->b:Lcom/unity3d/player/a/f;

    invoke-interface {v0}, Lcom/unity3d/player/a/f;->b()V

    goto/16 :goto_0

    :sswitch_0
    iget-object v1, p0, Lcom/unity3d/player/a/g;->f:Lcom/unity3d/player/a/b;

    #v1=(Reference);
    invoke-direct {p0, v5, v0}, Lcom/unity3d/player/a/g;->a(ILcom/unity3d/player/a/k;)V

    goto/16 :goto_0

    :sswitch_1
    #v1=(PosByte);
    invoke-direct {p0, v6, v0}, Lcom/unity3d/player/a/g;->a(ILcom/unity3d/player/a/k;)V

    goto/16 :goto_0

    :sswitch_2
    invoke-direct {p0, v4, v0}, Lcom/unity3d/player/a/g;->a(ILcom/unity3d/player/a/k;)V

    goto/16 :goto_0

    :sswitch_3
    invoke-direct {p0, v4, v0}, Lcom/unity3d/player/a/g;->a(ILcom/unity3d/player/a/k;)V

    goto/16 :goto_0

    :sswitch_4
    invoke-direct {p0, v4, v0}, Lcom/unity3d/player/a/g;->a(ILcom/unity3d/player/a/k;)V

    goto/16 :goto_0

    :sswitch_5
    sget-object v0, Lcom/unity3d/player/a/f$a;->a:Lcom/unity3d/player/a/f$a;

    iget-object v0, p0, Lcom/unity3d/player/a/g;->b:Lcom/unity3d/player/a/f;

    goto/16 :goto_0

    :sswitch_6
    sget-object v0, Lcom/unity3d/player/a/f$a;->b:Lcom/unity3d/player/a/f$a;

    iget-object v0, p0, Lcom/unity3d/player/a/g;->b:Lcom/unity3d/player/a/f;

    goto/16 :goto_0

    :sswitch_7
    sget-object v0, Lcom/unity3d/player/a/f$a;->c:Lcom/unity3d/player/a/f$a;

    iget-object v0, p0, Lcom/unity3d/player/a/g;->b:Lcom/unity3d/player/a/f;

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
        0x2 -> :sswitch_0
        0x3 -> :sswitch_7
        0x4 -> :sswitch_3
        0x5 -> :sswitch_4
        0x101 -> :sswitch_2
        0x102 -> :sswitch_5
        0x103 -> :sswitch_6
    .end sparse-switch
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lcom/unity3d/player/a/g;->c:I

    #v0=(Integer);
    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/a/g;->d:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

*/}
