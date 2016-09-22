package com.unity3d.player.a; class e {/*

.class public final Lcom/unity3d/player/a/e;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/unity3d/player/a/e$a;
    }
.end annotation


# static fields
.field protected static a:[B

.field protected static b:[B

.field private static final c:Ljava/security/SecureRandom;


# instance fields
.field private d:Lcom/unity3d/player/a/d;

.field private e:Ljava/security/PublicKey;

.field private final f:Landroid/content/Context;

.field private final g:Lcom/unity3d/player/a/i;

.field private h:Landroid/os/Handler;

.field private final i:Ljava/lang/String;

.field private final j:Ljava/lang/String;

.field private final k:Ljava/util/Set;

.field private final l:Ljava/util/Queue;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/16 v0, 0x34

    #v0=(PosByte);
    new-array v0, v0, [B

    #v0=(Reference);
    fill-array-data v0, :array_0

    sput-object v0, Lcom/unity3d/player/a/e;->a:[B

    const/16 v0, 0x11

    #v0=(PosByte);
    new-array v1, v0, [B

    #v1=(Reference);
    fill-array-data v1, :array_1

    array-length v0, v1

    #v0=(Integer);
    add-int/lit8 v0, v0, 0x1e

    new-array v0, v0, [B

    #v0=(Reference);
    sput-object v0, Lcom/unity3d/player/a/e;->b:[B

    const/4 v0, 0x0

    :goto_0
    #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    sget-object v2, Lcom/unity3d/player/a/e;->a:[B

    #v2=(Reference);
    array-length v2, v2

    #v2=(Integer);
    if-ge v0, v2, :cond_1

    sget-object v2, Lcom/unity3d/player/a/e;->a:[B

    #v2=(Reference);
    sget-object v3, Lcom/unity3d/player/a/e;->a:[B

    #v3=(Reference);
    aget-byte v3, v3, v0

    #v3=(Byte);
    neg-int v3, v3

    #v3=(Integer);
    int-to-byte v3, v3

    #v3=(Byte);
    aput-byte v3, v2, v0

    const/16 v2, 0x1e

    #v2=(PosByte);
    if-ge v0, v2, :cond_0

    sget-object v2, Lcom/unity3d/player/a/e;->b:[B

    #v2=(Reference);
    sget-object v3, Lcom/unity3d/player/a/e;->a:[B

    #v3=(Reference);
    aget-byte v3, v3, v0

    #v3=(Byte);
    aput-byte v3, v2, v0

    array-length v2, v1

    #v2=(Integer);
    if-ge v0, v2, :cond_0

    sget-object v2, Lcom/unity3d/player/a/e;->b:[B

    #v2=(Reference);
    add-int/lit8 v3, v0, 0x1e

    #v3=(Integer);
    aget-byte v4, v1, v0

    #v4=(Byte);
    xor-int/lit8 v4, v4, 0x7f

    #v4=(Integer);
    int-to-byte v4, v4

    #v4=(Byte);
    aput-byte v4, v2, v3

    :cond_0
    #v2=(Conflicted);v4=(Conflicted);
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    #v2=(Integer);v3=(Conflicted);
    new-instance v0, Ljava/security/SecureRandom;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/unity3d/player/a/e;->c:Ljava/security/SecureRandom;

    return-void

    :array_0
    .array-data 0x1
        0x9dt
        0x91t
        0x93t
        0xd2t
        0x9ft
        0x92t
        0x9ct
        0x8et
        0x91t
        0x97t
        0x9ct
        0xd2t
        0x8at
        0x9bt
        0x92t
        0x9ct
        0x97t
        0x92t
        0x99t
        0xd2t
        0x94t
        0x97t
        0x9dt
        0x9bt
        0x92t
        0x8dt
        0x97t
        0x92t
        0x99t
        0xd2t
        0xb7t
        0xb4t
        0x97t
        0x9dt
        0x9bt
        0x92t
        0x8dt
        0x9bt
        0xaet
        0x9bt
        0x8dt
        0x8bt
        0x94t
        0x8ct
        0xb4t
        0x97t
        0x8dt
        0x8ct
        0x9bt
        0x92t
        0x9bt
        0x8et
    .end array-data

    :array_1
    .array-data 0x1
        0x36t
        0x33t
        0x16t
        0x1ct
        0x1at
        0x11t
        0xct
        0x16t
        0x11t
        0x18t
        0x2ct
        0x1at
        0xdt
        0x9t
        0x16t
        0x1ct
        0x1at
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/unity3d/player/a/i;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    new-instance v0, Ljava/util/HashSet;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/a/e;->k:Ljava/util/Set;

    new-instance v0, Ljava/util/LinkedList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/a/e;->l:Ljava/util/Queue;

    iput-object p1, p0, Lcom/unity3d/player/a/e;->f:Landroid/content/Context;

    iput-object p2, p0, Lcom/unity3d/player/a/e;->g:Lcom/unity3d/player/a/i;

    invoke-static {p3}, Lcom/unity3d/player/a/e;->a(Ljava/lang/String;)Ljava/security/PublicKey;

    move-result-object v0

    iput-object v0, p0, Lcom/unity3d/player/a/e;->e:Ljava/security/PublicKey;

    iget-object v0, p0, Lcom/unity3d/player/a/e;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unity3d/player/a/e;->i:Ljava/lang/String;

    iget-object v0, p0, Lcom/unity3d/player/a/e;->i:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/unity3d/player/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unity3d/player/a/e;->j:Ljava/lang/String;

    new-instance v0, Landroid/os/HandlerThread;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/unity3d/player/a/e;->i:Ljava/lang/String;

    #v1=(Reference);
    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    new-instance v1, Landroid/os/Handler;

    #v1=(UninitRef);
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/unity3d/player/a/e;->h:Landroid/os/Handler;

    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    #v0=(Integer);
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    #v0=(Reference);v1=(Conflicted);
    return-object v0

    :catch_0
    move-exception v0

    #v0=(Reference);
    const-string v0, ""

    goto :goto_0
.end method

.method private static a(Ljava/lang/String;)Ljava/security/PublicKey;
    .locals 3

    :try_start_0
    invoke-static {p0}, Lcom/unity3d/player/b/a;->a(Ljava/lang/String;)[B

    move-result-object v0

    #v0=(Reference);
    const-string v1, "RSA"

    #v1=(Reference);
    invoke-static {v1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v1

    new-instance v2, Ljava/security/spec/X509EncodedKeySpec;

    #v2=(UninitRef);
    invoke-direct {v2, v0}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/unity3d/player/b/b; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    #v0=(Reference);
    new-instance v1, Ljava/lang/RuntimeException;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    #v1=(Reference);
    throw v1

    :catch_1
    move-exception v0

    #v0=(Reference);
    new-instance v1, Ljava/lang/IllegalArgumentException;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    #v1=(Reference);
    throw v1

    :catch_2
    move-exception v0

    #v0=(Reference);
    new-instance v1, Ljava/lang/IllegalArgumentException;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    #v1=(Reference);
    throw v1
.end method

.method static synthetic a(Lcom/unity3d/player/a/e;)Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/a/e;->k:Ljava/util/Set;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic a(Lcom/unity3d/player/a/e;Lcom/unity3d/player/a/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/unity3d/player/a/e;->b(Lcom/unity3d/player/a/g;)V

    return-void
.end method

.method private declared-synchronized a(Lcom/unity3d/player/a/g;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/unity3d/player/a/e;->k:Ljava/util/Set;

    #v0=(Reference);
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/unity3d/player/a/e;->k:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/unity3d/player/a/e;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0
.end method

.method static synthetic b(Lcom/unity3d/player/a/e;)Ljava/security/PublicKey;
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/a/e;->e:Ljava/security/PublicKey;

    #v0=(Reference);
    return-object v0
.end method

.method private b()V
    .locals 6

    :goto_0
    iget-object v0, p0, Lcom/unity3d/player/a/e;->l:Ljava/util/Queue;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/unity3d/player/a/g;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v1, p0, Lcom/unity3d/player/a/e;->d:Lcom/unity3d/player/a/d;

    #v1=(Reference);
    invoke-virtual {v0}, Lcom/unity3d/player/a/g;->b()I

    move-result v2

    #v2=(Integer);
    int-to-long v2, v2

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v0}, Lcom/unity3d/player/a/g;->c()Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    new-instance v5, Lcom/unity3d/player/a/e$a;

    #v5=(UninitRef);
    invoke-direct {v5, p0, v0}, Lcom/unity3d/player/a/e$a;-><init>(Lcom/unity3d/player/a/e;Lcom/unity3d/player/a/g;)V

    #v5=(Reference);
    invoke-interface {v1, v2, v3, v4, v5}, Lcom/unity3d/player/a/d;->a(JLjava/lang/String;Lcom/unity3d/player/a/c;)V

    iget-object v1, p0, Lcom/unity3d/player/a/e;->k:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    move-exception v1

    #v1=(Reference);
    invoke-direct {p0, v0}, Lcom/unity3d/player/a/e;->b(Lcom/unity3d/player/a/g;)V

    goto :goto_0

    :cond_0
    #v1=(Conflicted);
    return-void
.end method

.method static synthetic b(Lcom/unity3d/player/a/e;Lcom/unity3d/player/a/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/unity3d/player/a/e;->a(Lcom/unity3d/player/a/g;)V

    return-void
.end method

.method private declared-synchronized b(Lcom/unity3d/player/a/g;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/unity3d/player/a/e;->g:Lcom/unity3d/player/a/i;

    #v0=(Reference);
    const/4 v1, -0x1

    #v1=(Byte);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v0, v1, v2}, Lcom/unity3d/player/a/i;->a(ILcom/unity3d/player/a/k;)V

    iget-object v0, p0, Lcom/unity3d/player/a/e;->g:Lcom/unity3d/player/a/i;

    invoke-virtual {v0}, Lcom/unity3d/player/a/i;->a()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/unity3d/player/a/g;->a()Lcom/unity3d/player/a/f;

    move-result-object v0

    #v0=(Reference);
    invoke-interface {v0}, Lcom/unity3d/player/a/f;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    #v0=(Boolean);
    invoke-virtual {p1}, Lcom/unity3d/player/a/g;->a()Lcom/unity3d/player/a/f;

    move-result-object v0

    #v0=(Reference);
    invoke-interface {v0}, Lcom/unity3d/player/a/f;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0
.end method

.method static synthetic c(Lcom/unity3d/player/a/e;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/a/e;->h:Landroid/os/Handler;

    #v0=(Reference);
    return-object v0
.end method

.method private c()V
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/a/e;->d:Lcom/unity3d/player/a/d;

    #v0=(Reference);
    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/unity3d/player/a/e;->f:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/unity3d/player/a/e;->d:Lcom/unity3d/player/a/d;

    :cond_0
    #v0=(Reference);
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/unity3d/player/a/e;->c()V

    iget-object v0, p0, Lcom/unity3d/player/a/e;->h:Landroid/os/Handler;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a(Lcom/unity3d/player/a/f;)V
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/unity3d/player/a/e;->g:Lcom/unity3d/player/a/i;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/unity3d/player/a/i;->a()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/unity3d/player/a/f;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    new-instance v0, Lcom/unity3d/player/a/g;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/unity3d/player/a/e;->g:Lcom/unity3d/player/a/i;

    #v1=(Reference);
    new-instance v2, Lcom/unity3d/player/a/b;

    #v2=(UninitRef);
    invoke-direct {v2}, Lcom/unity3d/player/a/b;-><init>()V

    #v2=(Reference);
    sget-object v3, Lcom/unity3d/player/a/e;->c:Ljava/security/SecureRandom;

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/security/SecureRandom;->nextInt()I

    move-result v4

    #v4=(Integer);
    iget-object v5, p0, Lcom/unity3d/player/a/e;->i:Ljava/lang/String;

    #v5=(Reference);
    iget-object v6, p0, Lcom/unity3d/player/a/e;->j:Ljava/lang/String;

    #v6=(Reference);
    move-object v3, p1

    invoke-direct/range {v0 .. v6}, Lcom/unity3d/player/a/g;-><init>(Lcom/unity3d/player/a/i;Lcom/unity3d/player/a/b;Lcom/unity3d/player/a/f;ILjava/lang/String;Ljava/lang/String;)V

    #v0=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/a/e;->d:Lcom/unity3d/player/a/d;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_2

    :try_start_2
    iget-object v1, p0, Lcom/unity3d/player/a/e;->f:Landroid/content/Context;

    new-instance v2, Landroid/content/Intent;

    #v2=(UninitRef);
    new-instance v3, Ljava/lang/String;

    #v3=(UninitRef);
    sget-object v4, Lcom/unity3d/player/a/e;->b:[B

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/lang/String;-><init>([B)V

    #v3=(Reference);
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v1, v2, p0, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/unity3d/player/a/e;->l:Ljava/util/Queue;

    #v1=(Reference);
    invoke-interface {v1, v0}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    move-exception v0

    :try_start_3
    sget-object v0, Lcom/unity3d/player/a/f$a;->e:Lcom/unity3d/player/a/f$a;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :cond_1
    :try_start_4
    #v1=(Boolean);v2=(Reference);v3=(One);v4=(Reference);
    invoke-direct {p0, v0}, Lcom/unity3d/player/a/e;->b(Lcom/unity3d/player/a/g;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_0

    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0

    :cond_2
    :try_start_5
    #v1=(Reference);v2=(Reference);v3=(Reference);v4=(Integer);v5=(Reference);v6=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/a/e;->l:Ljava/util/Queue;

    invoke-interface {v1, v0}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lcom/unity3d/player/a/e;->b()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0
.end method

.method public final declared-synchronized onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-static {p2}, Lcom/unity3d/player/a/d$a;->a(Landroid/os/IBinder;)Lcom/unity3d/player/a/d;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/a/e;->d:Lcom/unity3d/player/a/d;

    invoke-direct {p0}, Lcom/unity3d/player/a/e;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    #v0=(Null);
    iput-object v0, p0, Lcom/unity3d/player/a/e;->d:Lcom/unity3d/player/a/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0
.end method

*/}
