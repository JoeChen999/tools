package com.unity3d.player; class b {/*

.class final Lcom/unity3d/player/b;
.super Ljava/lang/Object;


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:I


# direct methods
.method constructor <init>()V
    .locals 7

    const/4 v3, 0x0

    #v3=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput v3, p0, Lcom/unity3d/player/b;->a:I

    iput v3, p0, Lcom/unity3d/player/b;->c:I

    const-string v0, "/proc/cpuinfo"

    #v0=(Reference);
    invoke-static {v0}, Lcom/unity3d/player/b;->a(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    #v4=(Reference);
    const-string v0, "CPU architecture"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "Features"

    #v1=(Reference);
    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    #v5=(Integer);
    move v2, v3

    :goto_0
    #v2=(Integer);v6=(Conflicted);
    if-ge v2, v5, :cond_0

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v6

    #v6=(Char);
    invoke-static {v6}, Ljava/lang/Character;->isDigit(C)Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    #v6=(Conflicted);
    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    const-string v3, "arm"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_3

    iget v2, p0, Lcom/unity3d/player/b;->a:I

    #v2=(Integer);
    or-int/lit8 v2, v2, 0x2

    iput v2, p0, Lcom/unity3d/player/b;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    #v2=(Integer);
    const/4 v3, 0x7

    #v3=(PosByte);
    if-lt v2, v3, :cond_1

    sget-object v2, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    #v2=(Reference);
    const-string v3, "armeabi"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_1

    iget v2, p0, Lcom/unity3d/player/b;->a:I

    #v2=(Integer);
    or-int/lit8 v2, v2, 0x10

    iput v2, p0, Lcom/unity3d/player/b;->a:I

    :cond_1
    #v3=(Conflicted);
    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    #v2=(Integer);
    const/4 v3, 0x6

    #v3=(PosByte);
    if-lt v2, v3, :cond_2

    iget v2, p0, Lcom/unity3d/player/b;->a:I

    or-int/lit8 v2, v2, 0x8

    iput v2, p0, Lcom/unity3d/player/b;->a:I

    :cond_2
    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    #v0=(Integer);
    const/4 v2, 0x5

    #v2=(PosByte);
    if-lt v0, v2, :cond_3

    iget v0, p0, Lcom/unity3d/player/b;->a:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/unity3d/player/b;->a:I

    :cond_3
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
    if-eqz v1, :cond_6

    const-string v0, "vfpv3"

    #v0=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_4

    iget v0, p0, Lcom/unity3d/player/b;->a:I

    #v0=(Integer);
    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/unity3d/player/b;->a:I

    :cond_4
    const-string v0, "neon"

    #v0=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_5

    iget v0, p0, Lcom/unity3d/player/b;->a:I

    #v0=(Integer);
    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/unity3d/player/b;->a:I

    :cond_5
    const-string v0, "vfp"

    #v0=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_6

    iget v0, p0, Lcom/unity3d/player/b;->a:I

    #v0=(Integer);
    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/unity3d/player/b;->a:I

    :cond_6
    #v0=(Conflicted);
    sget-object v0, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    #v0=(Reference);
    const-string v1, "x86"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_7

    const/4 v0, 0x1

    #v0=(One);
    iput v0, p0, Lcom/unity3d/player/b;->a:I

    :cond_7
    #v0=(Boolean);
    const-string v0, "Processor"

    #v0=(Reference);
    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/unity3d/player/b;->b:Ljava/lang/String;

    const-string v0, "/proc/meminfo"

    invoke-static {v0}, Lcom/unity3d/player/b;->a(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "MemTotal"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/unity3d/player/b;->b(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/unity3d/player/b;->c:I

    return-void
.end method

.method private static a(Ljava/lang/String;)Ljava/util/Map;
    .locals 5

    new-instance v1, Ljava/util/HashMap;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    #v1=(Reference);
    new-instance v0, Ljava/io/FileReader;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    new-instance v2, Ljava/io/LineNumberReader;

    #v2=(UninitRef);
    const/16 v3, 0x2000

    #v3=(PosShort);
    invoke-direct {v2, v0, v3}, Ljava/io/LineNumberReader;-><init>(Ljava/io/Reader;I)V

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/io/LineNumberReader;->readLine()Ljava/lang/String;

    move-result-object v0

    :goto_0
    #v3=(Integer);v4=(Conflicted);
    if-eqz v0, :cond_1

    const/16 v3, 0x3a

    #v3=(PosByte);
    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    #v3=(Integer);
    if-ltz v3, :cond_0

    const/4 v4, 0x0

    #v4=(Null);
    invoke-virtual {v0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    #v4=(Conflicted);
    invoke-virtual {v2}, Ljava/io/LineNumberReader;->readLine()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    move-exception v0

    #v0=(Reference);
    const-string v2, "FileNotFoundException"

    #v2=(Reference);
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_1
    return-object v1

    :catch_1
    #v0=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    const-string v2, "IOException"

    #v2=(Reference);
    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1
.end method

.method private static b(Ljava/lang/String;)I
    .locals 4

    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    move v0, v1

    :goto_0
    #v0=(Integer);v3=(Conflicted);
    if-ge v0, v2, :cond_0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    #v3=(Char);
    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    #v3=(Conflicted);
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    #v0=(Integer);
    return v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/unity3d/player/b;->a:I

    #v0=(Integer);
    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/b;->b:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lcom/unity3d/player/b;->c:I

    #v0=(Integer);
    div-int/lit16 v0, v0, 0x400

    return v0
.end method

*/}
