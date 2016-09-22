package com.unity3d.player; class h {/*

.class final Lcom/unity3d/player/h;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/hardware/SensorEventListener;
.implements Landroid/location/LocationListener;


# static fields
.field private static final d:[I


# instance fields
.field private A:Ljava/lang/Runnable;

.field private B:Ljava/lang/Runnable;

.field private C:Ljava/lang/Runnable;

.field private D:Ljava/lang/Runnable;

.field private E:Ljava/lang/Runnable;

.field private F:[F

.field private G:D

.field private H:Ljava/lang/Runnable;

.field private I:[F

.field private J:[F

.field private K:I

.field private L:Ljava/lang/Runnable;

.field private M:Landroid/location/Location;

.field private N:F

.field private O:Z

.field private P:I

.field private Q:Z

.field private R:I

.field private final a:Landroid/content/Context;

.field private final b:Lcom/unity3d/player/UnityPlayer;

.field private final c:Landroid/view/WindowManager;

.field private e:[F

.field private f:[F

.field private g:F

.field private h:F

.field private i:F

.field private j:J

.field private k:F

.field private l:F

.field private m:F

.field private n:J

.field private o:F

.field private p:F

.field private q:F

.field private r:J

.field private s:F

.field private t:F

.field private u:F

.field private v:J

.field private w:F

.field private x:F

.field private y:F

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    #v0=(PosByte);
    new-array v0, v0, [I

    #v0=(Reference);
    fill-array-data v0, :array_0

    sput-object v0, Lcom/unity3d/player/h;->d:[I

    return-void

    :array_0
    .array-data 0x4
        0x1t 0x0t 0x0t 0x0t
        0x1t 0x0t 0x0t 0x0t
        0x0t 0x0t 0x0t 0x0t
        0x1t 0x0t 0x0t 0x0t
        0xfft 0xfft 0xfft 0xfft
        0x1t 0x0t 0x0t 0x0t
        0x1t 0x0t 0x0t 0x0t
        0x0t 0x0t 0x0t 0x0t
        0xfft 0xfft 0xfft 0xfft
        0xfft 0xfft 0xfft 0xfft
        0x0t 0x0t 0x0t 0x0t
        0x1t 0x0t 0x0t 0x0t
        0x1t 0x0t 0x0t 0x0t
        0xfft 0xfft 0xfft 0xfft
        0x1t 0x0t 0x0t 0x0t
        0x0t 0x0t 0x0t 0x0t
    .end array-data
.end method

.method protected constructor <init>(Landroid/content/Context;Lcom/unity3d/player/UnityPlayer;)V
    .locals 3

    const/4 v2, 0x3

    #v2=(PosByte);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    new-array v0, v2, [F

    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/h;->e:[F

    new-array v0, v2, [F

    iput-object v0, p0, Lcom/unity3d/player/h;->f:[F

    new-instance v0, Lcom/unity3d/player/i;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/unity3d/player/i;-><init>(Lcom/unity3d/player/h;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/h;->A:Ljava/lang/Runnable;

    new-instance v0, Lcom/unity3d/player/j;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/unity3d/player/j;-><init>(Lcom/unity3d/player/h;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/h;->B:Ljava/lang/Runnable;

    new-instance v0, Lcom/unity3d/player/k;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/unity3d/player/k;-><init>(Lcom/unity3d/player/h;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/h;->C:Ljava/lang/Runnable;

    new-instance v0, Lcom/unity3d/player/l;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/unity3d/player/l;-><init>(Lcom/unity3d/player/h;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/h;->D:Ljava/lang/Runnable;

    new-instance v0, Lcom/unity3d/player/m;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/unity3d/player/m;-><init>(Lcom/unity3d/player/h;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/h;->E:Ljava/lang/Runnable;

    const/4 v0, 0x5

    #v0=(PosByte);
    new-array v0, v0, [F

    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/h;->F:[F

    new-instance v0, Lcom/unity3d/player/n;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/unity3d/player/n;-><init>(Lcom/unity3d/player/h;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/h;->H:Ljava/lang/Runnable;

    const/16 v0, 0x9

    #v0=(PosByte);
    new-array v0, v0, [F

    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/h;->I:[F

    new-array v0, v2, [F

    iput-object v0, p0, Lcom/unity3d/player/h;->J:[F

    new-instance v0, Lcom/unity3d/player/o;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/unity3d/player/o;-><init>(Lcom/unity3d/player/h;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/h;->L:Ljava/lang/Runnable;

    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Lcom/unity3d/player/h;->N:F

    iput-boolean v1, p0, Lcom/unity3d/player/h;->O:Z

    iput v1, p0, Lcom/unity3d/player/h;->P:I

    iput-boolean v1, p0, Lcom/unity3d/player/h;->Q:Z

    iput v1, p0, Lcom/unity3d/player/h;->R:I

    iput-object p1, p0, Lcom/unity3d/player/h;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/unity3d/player/h;->b:Lcom/unity3d/player/UnityPlayer;

    iget-object v0, p0, Lcom/unity3d/player/h;->a:Landroid/content/Context;

    #v0=(Reference);
    const-string v1, "window"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/unity3d/player/h;->c:Landroid/view/WindowManager;

    return-void
.end method

.method static synthetic a(Lcom/unity3d/player/h;)F
    .locals 1

    iget v0, p0, Lcom/unity3d/player/h;->g:F

    #v0=(Integer);
    return v0
.end method

.method private a(Landroid/location/Location;)V
    .locals 10

    const/4 v2, 0x0

    #v2=(Null);
    const/4 v1, 0x1

    #v1=(One);
    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Float);v2=(Float);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    return-void

    :cond_1
    #v0=(Uninit);v1=(One);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    iget-object v7, p0, Lcom/unity3d/player/h;->M:Landroid/location/Location;

    #v7=(Reference);
    if-nez v7, :cond_3

    :cond_2
    :goto_1
    #v0=(Conflicted);v1=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    if-eqz v1, :cond_0

    iput-object p1, p0, Lcom/unity3d/player/h;->M:Landroid/location/Location;

    iget-object v0, p0, Lcom/unity3d/player/h;->b:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    #v1=(DoubleLo);v2=(DoubleHi);
    double-to-float v1, v1

    #v1=(Float);
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    #v2=(DoubleLo);v3=(DoubleHi);
    double-to-float v2, v2

    #v2=(Float);
    invoke-virtual {p1}, Landroid/location/Location;->getAltitude()D

    move-result-wide v3

    #v3=(DoubleLo);v4=(DoubleHi);
    double-to-float v3, v3

    #v3=(Float);
    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v4

    #v4=(Float);
    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v5

    #v5=(LongLo);v6=(LongHi);
    long-to-double v5, v5

    #v5=(DoubleLo);v6=(DoubleHi);
    const-wide v7, 0x408f400000000000L

    #v7=(LongLo);v8=(LongHi);
    div-double/2addr v5, v7

    invoke-virtual/range {v0 .. v6}, Lcom/unity3d/player/UnityPlayer;->nativeSetLocation(FFFFD)V

    goto :goto_0

    :cond_3
    #v0=(Uninit);v1=(One);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Reference);v8=(Uninit);v9=(Uninit);
    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v3

    #v3=(LongLo);v4=(LongHi);
    invoke-virtual {v7}, Landroid/location/Location;->getTime()J

    move-result-wide v5

    #v5=(LongLo);v6=(LongHi);
    sub-long v4, v3, v5

    #v4=(LongLo);v5=(LongHi);
    const-wide/32 v8, 0x1d4c0

    #v8=(LongLo);v9=(LongHi);
    cmp-long v0, v4, v8

    #v0=(Byte);
    if-lez v0, :cond_6

    move v3, v1

    :goto_2
    #v3=(Boolean);
    const-wide/32 v8, -0x1d4c0

    cmp-long v0, v4, v8

    if-gez v0, :cond_7

    move v0, v1

    :goto_3
    #v0=(Boolean);
    const-wide/16 v8, 0x0

    cmp-long v4, v4, v8

    #v4=(Byte);
    if-lez v4, :cond_8

    move v6, v1

    :goto_4
    #v6=(Boolean);
    if-nez v3, :cond_2

    if-nez v0, :cond_5

    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    #v0=(Float);
    invoke-virtual {v7}, Landroid/location/Location;->getAccuracy()F

    move-result v3

    #v3=(Float);
    sub-float/2addr v0, v3

    float-to-int v0, v0

    #v0=(Integer);
    if-lez v0, :cond_9

    move v5, v1

    :goto_5
    #v5=(Boolean);
    if-gez v0, :cond_a

    move v4, v1

    :goto_6
    #v4=(Boolean);
    const/16 v3, 0xc8

    #v3=(PosShort);
    if-le v0, v3, :cond_b

    move v0, v1

    :goto_7
    #v0=(Boolean);
    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v3

    #v3=(Float);
    const/4 v8, 0x0

    #v8=(Null);
    cmpl-float v3, v3, v8

    #v3=(Byte);
    if-nez v3, :cond_c

    move v3, v1

    :goto_8
    #v3=(Boolean);
    or-int/2addr v3, v0

    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v7}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v7

    if-nez v0, :cond_e

    if-nez v7, :cond_d

    move v0, v1

    :goto_9
    #v0=(Boolean);
    if-nez v4, :cond_2

    if-eqz v6, :cond_4

    if-eqz v5, :cond_2

    :cond_4
    if-eqz v6, :cond_5

    if-nez v3, :cond_5

    if-nez v0, :cond_2

    :cond_5
    #v4=(Byte);v5=(Conflicted);v8=(Conflicted);
    move v1, v2

    #v1=(Null);
    goto/16 :goto_1

    :cond_6
    #v0=(Byte);v1=(One);v3=(LongLo);v4=(LongLo);v5=(LongHi);v6=(LongHi);v8=(LongLo);
    move v3, v2

    #v3=(Null);
    goto :goto_2

    :cond_7
    #v3=(Boolean);
    move v0, v2

    #v0=(Null);
    goto :goto_3

    :cond_8
    #v0=(Boolean);v4=(Byte);
    move v6, v2

    #v6=(Null);
    goto :goto_4

    :cond_9
    #v0=(Integer);v3=(Float);v6=(Boolean);
    move v5, v2

    #v5=(Null);
    goto :goto_5

    :cond_a
    #v5=(Boolean);
    move v4, v2

    #v4=(Null);
    goto :goto_6

    :cond_b
    #v3=(PosShort);v4=(Boolean);
    move v0, v2

    #v0=(Null);
    goto :goto_7

    :cond_c
    #v0=(Boolean);v3=(Byte);v8=(Null);
    move v3, v2

    #v3=(Null);
    goto :goto_8

    :cond_d
    #v0=(Reference);v3=(Boolean);
    move v0, v2

    #v0=(Null);
    goto :goto_9

    :cond_e
    #v0=(Reference);
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_9
.end method

.method static synthetic b(Lcom/unity3d/player/h;)F
    .locals 1

    iget v0, p0, Lcom/unity3d/player/h;->h:F

    #v0=(Integer);
    return v0
.end method

.method static synthetic c(Lcom/unity3d/player/h;)F
    .locals 1

    iget v0, p0, Lcom/unity3d/player/h;->i:F

    #v0=(Integer);
    return v0
.end method

.method static synthetic d(Lcom/unity3d/player/h;)J
    .locals 2

    iget-wide v0, p0, Lcom/unity3d/player/h;->j:J

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method static synthetic e(Lcom/unity3d/player/h;)Lcom/unity3d/player/UnityPlayer;
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/h;->b:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic f(Lcom/unity3d/player/h;)F
    .locals 1

    iget v0, p0, Lcom/unity3d/player/h;->k:F

    #v0=(Integer);
    return v0
.end method

.method static synthetic f()J
    .locals 2

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method static synthetic g(Lcom/unity3d/player/h;)F
    .locals 1

    iget v0, p0, Lcom/unity3d/player/h;->l:F

    #v0=(Integer);
    return v0
.end method

.method static synthetic h(Lcom/unity3d/player/h;)F
    .locals 1

    iget v0, p0, Lcom/unity3d/player/h;->m:F

    #v0=(Integer);
    return v0
.end method

.method static synthetic i(Lcom/unity3d/player/h;)J
    .locals 2

    iget-wide v0, p0, Lcom/unity3d/player/h;->n:J

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method static synthetic j(Lcom/unity3d/player/h;)F
    .locals 1

    iget v0, p0, Lcom/unity3d/player/h;->o:F

    #v0=(Integer);
    return v0
.end method

.method static synthetic k(Lcom/unity3d/player/h;)F
    .locals 1

    iget v0, p0, Lcom/unity3d/player/h;->p:F

    #v0=(Integer);
    return v0
.end method

.method static synthetic l(Lcom/unity3d/player/h;)F
    .locals 1

    iget v0, p0, Lcom/unity3d/player/h;->q:F

    #v0=(Integer);
    return v0
.end method

.method static synthetic m(Lcom/unity3d/player/h;)J
    .locals 2

    iget-wide v0, p0, Lcom/unity3d/player/h;->r:J

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method static synthetic n(Lcom/unity3d/player/h;)F
    .locals 1

    iget v0, p0, Lcom/unity3d/player/h;->s:F

    #v0=(Integer);
    return v0
.end method

.method static synthetic o(Lcom/unity3d/player/h;)F
    .locals 1

    iget v0, p0, Lcom/unity3d/player/h;->t:F

    #v0=(Integer);
    return v0
.end method

.method static synthetic p(Lcom/unity3d/player/h;)F
    .locals 1

    iget v0, p0, Lcom/unity3d/player/h;->u:F

    #v0=(Integer);
    return v0
.end method

.method static synthetic q(Lcom/unity3d/player/h;)J
    .locals 2

    iget-wide v0, p0, Lcom/unity3d/player/h;->v:J

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method static synthetic r(Lcom/unity3d/player/h;)F
    .locals 1

    iget v0, p0, Lcom/unity3d/player/h;->w:F

    #v0=(Integer);
    return v0
.end method

.method static synthetic s(Lcom/unity3d/player/h;)F
    .locals 1

    iget v0, p0, Lcom/unity3d/player/h;->x:F

    #v0=(Integer);
    return v0
.end method

.method static synthetic t(Lcom/unity3d/player/h;)F
    .locals 1

    iget v0, p0, Lcom/unity3d/player/h;->y:F

    #v0=(Integer);
    return v0
.end method

.method static synthetic u(Lcom/unity3d/player/h;)F
    .locals 1

    iget v0, p0, Lcom/unity3d/player/h;->z:F

    #v0=(Integer);
    return v0
.end method

.method static synthetic v(Lcom/unity3d/player/h;)[F
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/h;->F:[F

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic w(Lcom/unity3d/player/h;)D
    .locals 2

    iget-wide v0, p0, Lcom/unity3d/player/h;->G:D

    #v0=(DoubleLo);v1=(DoubleHi);
    return-wide v0
.end method

.method static synthetic x(Lcom/unity3d/player/h;)I
    .locals 1

    iget v0, p0, Lcom/unity3d/player/h;->K:I

    #v0=(Integer);
    return v0
.end method


# virtual methods
.method public final a(F)V
    .locals 0

    iput p1, p0, Lcom/unity3d/player/h;->N:F

    return-void
.end method

.method public final a()Z
    .locals 3

    const/4 v1, 0x1

    #v1=(One);
    iget-object v0, p0, Lcom/unity3d/player/h;->a:Landroid/content/Context;

    #v0=(Reference);
    const-string v2, "location"

    #v2=(Reference);
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    new-instance v2, Landroid/location/Criteria;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/location/Criteria;-><init>()V

    #v2=(Reference);
    invoke-virtual {v0, v2, v1}, Landroid/location/LocationManager;->getProviders(Landroid/location/Criteria;Z)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public final b()V
    .locals 10

    const/4 v6, 0x2

    #v6=(PosByte);
    const/4 v2, 0x3

    #v2=(PosByte);
    const/4 v9, 0x1

    #v9=(One);
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/unity3d/player/h;->Q:Z

    iget-boolean v0, p0, Lcom/unity3d/player/h;->O:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    const/4 v0, 0x5

    #v0=(PosByte);
    const-string v1, "Location_StartUpdatingLocation already started!"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/unity3d/player/f;->Log(ILjava/lang/String;)V

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(PosByte);v7=(Uninit);v8=(Uninit);
    invoke-virtual {p0}, Lcom/unity3d/player/h;->a()Z

    move-result v0

    if-nez v0, :cond_2

    iput v2, p0, Lcom/unity3d/player/h;->R:I

    iget-object v0, p0, Lcom/unity3d/player/h;->b:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    invoke-virtual {v0, v2}, Lcom/unity3d/player/UnityPlayer;->nativeSetLocationStatus(I)V

    goto :goto_0

    :cond_2
    #v0=(Boolean);
    iget-object v0, p0, Lcom/unity3d/player/h;->a:Landroid/content/Context;

    #v0=(Reference);
    const-string v1, "location"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    iput v9, p0, Lcom/unity3d/player/h;->R:I

    iget-object v1, p0, Lcom/unity3d/player/h;->b:Lcom/unity3d/player/UnityPlayer;

    invoke-virtual {v1, v9}, Lcom/unity3d/player/UnityPlayer;->nativeSetLocationStatus(I)V

    invoke-virtual {v0, v9}, Landroid/location/LocationManager;->getProviders(Z)Ljava/util/List;

    move-result-object v3

    #v3=(Reference);
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_3

    iput v2, p0, Lcom/unity3d/player/h;->R:I

    iget-object v0, p0, Lcom/unity3d/player/h;->b:Lcom/unity3d/player/UnityPlayer;

    invoke-virtual {v0, v2}, Lcom/unity3d/player/UnityPlayer;->nativeSetLocationStatus(I)V

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    #v2=(Null);
    iget v1, p0, Lcom/unity3d/player/h;->P:I

    #v1=(Integer);
    if-ne v1, v6, :cond_7

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    #v1=(Conflicted);v4=(Reference);v5=(Conflicted);
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getProvider(Ljava/lang/String;)Landroid/location/LocationProvider;

    move-result-object v1

    invoke-virtual {v1}, Landroid/location/LocationProvider;->getAccuracy()I

    move-result v5

    #v5=(Integer);
    if-ne v5, v6, :cond_4

    move-object v7, v1

    :goto_1
    #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Reference);
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_5
    :goto_2
    #v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v8=(Reference);
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Ljava/lang/String;

    if-eqz v7, :cond_6

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getProvider(Ljava/lang/String;)Landroid/location/LocationProvider;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/location/LocationProvider;->getAccuracy()I

    move-result v2

    #v2=(Integer);
    if-eq v2, v9, :cond_5

    :cond_6
    #v2=(Conflicted);
    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v2

    #v2=(Reference);
    invoke-direct {p0, v2}, Lcom/unity3d/player/h;->a(Landroid/location/Location;)V

    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    iget v4, p0, Lcom/unity3d/player/h;->N:F

    #v4=(Integer);
    iget-object v5, p0, Lcom/unity3d/player/h;->a:Landroid/content/Context;

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v6

    #v6=(Reference);
    move-object v5, p0

    invoke-virtual/range {v0 .. v6}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V

    iput-boolean v9, p0, Lcom/unity3d/player/h;->O:Z

    goto :goto_2

    :cond_7
    #v1=(Integer);v2=(Null);v3=(Reference);v4=(Conflicted);v5=(Conflicted);v6=(PosByte);v7=(Uninit);v8=(Uninit);
    move-object v7, v2

    #v7=(Null);
    goto :goto_1
.end method

.method public final b(F)V
    .locals 2

    const/4 v1, 0x1

    #v1=(One);
    const/high16 v0, 0x42c8

    #v0=(Integer);
    cmpg-float v0, p1, v0

    #v0=(Byte);
    if-gez v0, :cond_0

    iput v1, p0, Lcom/unity3d/player/h;->P:I

    :goto_0
    return-void

    :cond_0
    const/high16 v0, 0x43fa

    #v0=(Integer);
    cmpg-float v0, p1, v0

    #v0=(Byte);
    if-gez v0, :cond_1

    iput v1, p0, Lcom/unity3d/player/h;->P:I

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    #v0=(PosByte);
    iput v0, p0, Lcom/unity3d/player/h;->P:I

    goto :goto_0
.end method

.method public final c()V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    iget-object v0, p0, Lcom/unity3d/player/h;->a:Landroid/content/Context;

    #v0=(Reference);
    const-string v1, "location"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    invoke-virtual {v0, p0}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    iput-boolean v2, p0, Lcom/unity3d/player/h;->O:Z

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/unity3d/player/h;->M:Landroid/location/Location;

    iput v2, p0, Lcom/unity3d/player/h;->R:I

    iget-object v0, p0, Lcom/unity3d/player/h;->b:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    invoke-virtual {v0, v2}, Lcom/unity3d/player/UnityPlayer;->nativeSetLocationStatus(I)V

    return-void
.end method

.method public final d()V
    .locals 3

    const/4 v2, 0x1

    #v2=(One);
    iget v0, p0, Lcom/unity3d/player/h;->R:I

    #v0=(Integer);
    if-eq v0, v2, :cond_0

    iget v0, p0, Lcom/unity3d/player/h;->R:I

    const/4 v1, 0x2

    #v1=(PosByte);
    if-ne v0, v1, :cond_1

    :cond_0
    #v1=(Conflicted);
    iput-boolean v2, p0, Lcom/unity3d/player/h;->Q:Z

    invoke-virtual {p0}, Lcom/unity3d/player/h;->c()V

    :cond_1
    return-void
.end method

.method public final e()V
    .locals 1

    iget-boolean v0, p0, Lcom/unity3d/player/h;->Q:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/unity3d/player/h;->b()V

    :cond_0
    return-void
.end method

.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public final onLocationChanged(Landroid/location/Location;)V
    .locals 2

    const/4 v1, 0x2

    #v1=(PosByte);
    iput v1, p0, Lcom/unity3d/player/h;->R:I

    iget-object v0, p0, Lcom/unity3d/player/h;->b:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    invoke-virtual {v0, v1}, Lcom/unity3d/player/UnityPlayer;->nativeSetLocationStatus(I)V

    invoke-direct {p0, p1}, Lcom/unity3d/player/h;->a(Landroid/location/Location;)V

    return-void
.end method

.method public final onProviderDisabled(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/unity3d/player/h;->M:Landroid/location/Location;

    return-void
.end method

.method public final onProviderEnabled(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 12

    const/high16 v10, 0x43b4

    #v10=(Integer);
    const/4 v5, 0x1

    #v5=(One);
    const/4 v2, 0x0

    #v2=(Null);
    const v9, -0x422f2981

    #v9=(Integer);
    const/4 v1, 0x2

    #v1=(PosByte);
    iget-object v0, p0, Lcom/unity3d/player/h;->c:Landroid/view/WindowManager;

    #v0=(Reference);
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getOrientation()I

    move-result v3

    #v3=(Integer);
    add-int/lit8 v0, v3, -0x1

    #v0=(Integer);
    and-int/lit8 v0, v0, 0x3

    sget-object v4, Lcom/unity3d/player/h;->d:[I

    #v4=(Reference);
    mul-int/lit8 v6, v0, 0x4

    #v6=(Integer);
    add-int/lit8 v6, v6, 0x0

    aget v4, v4, v6

    #v4=(Integer);
    int-to-float v4, v4

    #v4=(Float);
    sget-object v6, Lcom/unity3d/player/h;->d:[I

    #v6=(Reference);
    mul-int/lit8 v7, v0, 0x4

    #v7=(Integer);
    add-int/lit8 v7, v7, 0x1

    aget v6, v6, v7

    #v6=(Integer);
    int-to-float v6, v6

    #v6=(Float);
    sget-object v7, Lcom/unity3d/player/h;->d:[I

    #v7=(Reference);
    mul-int/lit8 v8, v0, 0x4

    #v8=(Integer);
    add-int/lit8 v8, v8, 0x2

    aget v7, v7, v8

    #v7=(Integer);
    sget-object v8, Lcom/unity3d/player/h;->d:[I

    #v8=(Reference);
    mul-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0x3

    aget v0, v8, v0

    iget-object v8, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v8}, Landroid/hardware/Sensor;->getType()I

    move-result v8

    #v8=(Integer);
    packed-switch v8, :pswitch_data_0

    :cond_0
    :goto_0
    :pswitch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);
    return-void

    :pswitch_1
    #v0=(Integer);v1=(PosByte);v2=(Null);v3=(Integer);v4=(Float);v5=(One);v6=(Float);v7=(Integer);v8=(Integer);v9=(Integer);v11=(Uninit);
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    #v0=(Reference);
    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    iput-object v0, p0, Lcom/unity3d/player/h;->e:[F

    iget-object v0, p0, Lcom/unity3d/player/h;->c:Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getOrientation()I

    move-result v7

    add-int/lit8 v0, v7, -0x1

    #v0=(Integer);
    and-int/lit8 v0, v0, 0x3

    sget-object v3, Lcom/unity3d/player/h;->d:[I

    #v3=(Reference);
    mul-int/lit8 v4, v0, 0x4

    #v4=(Integer);
    add-int/lit8 v4, v4, 0x0

    aget v3, v3, v4

    #v3=(Integer);
    int-to-float v3, v3

    #v3=(Float);
    sget-object v4, Lcom/unity3d/player/h;->d:[I

    #v4=(Reference);
    mul-int/lit8 v6, v0, 0x4

    #v6=(Integer);
    add-int/lit8 v6, v6, 0x1

    aget v4, v4, v6

    #v4=(Integer);
    int-to-float v4, v4

    #v4=(Float);
    sget-object v6, Lcom/unity3d/player/h;->d:[I

    #v6=(Reference);
    mul-int/lit8 v8, v0, 0x4

    add-int/lit8 v8, v8, 0x2

    aget v6, v6, v8

    #v6=(Integer);
    sget-object v8, Lcom/unity3d/player/h;->d:[I

    #v8=(Reference);
    mul-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0x3

    aget v0, v8, v0

    mul-float/2addr v3, v9

    iget-object v8, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v6, v8, v6

    mul-float/2addr v3, v6

    iput v3, p0, Lcom/unity3d/player/h;->g:F

    mul-float v3, v4, v9

    iget-object v4, p1, Landroid/hardware/SensorEvent;->values:[F

    #v4=(Reference);
    aget v0, v4, v0

    mul-float/2addr v0, v3

    #v0=(Float);
    iput v0, p0, Lcom/unity3d/player/h;->h:F

    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    #v0=(Reference);
    aget v0, v0, v1

    #v0=(Integer);
    mul-float/2addr v0, v9

    #v0=(Float);
    iput v0, p0, Lcom/unity3d/player/h;->i:F

    iget-wide v3, p1, Landroid/hardware/SensorEvent;->timestamp:J

    #v3=(LongLo);v4=(LongHi);
    iput-wide v3, p0, Lcom/unity3d/player/h;->j:J

    iget-object v0, p0, Lcom/unity3d/player/h;->b:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    iget-object v3, p0, Lcom/unity3d/player/h;->A:Ljava/lang/Runnable;

    #v3=(Reference);
    invoke-virtual {v0, v3}, Lcom/unity3d/player/UnityPlayer;->queueEvent(Ljava/lang/Runnable;)V

    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v0, v0, v2

    #v0=(Integer);
    iget-object v3, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v3, v3, v5

    #v3=(Integer);
    iget-object v4, p1, Landroid/hardware/SensorEvent;->values:[F

    #v4=(Reference);
    aget v4, v4, v1

    #v4=(Integer);
    const/high16 v6, 0x3f80

    mul-float v8, v0, v0

    #v8=(Float);
    mul-float v9, v3, v3

    #v9=(Float);
    add-float/2addr v8, v9

    mul-float v9, v4, v4

    add-float/2addr v8, v9

    float-to-double v8, v8

    #v8=(DoubleLo);v9=(DoubleHi);
    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v8

    double-to-float v8, v8

    #v8=(Float);
    div-float v8, v6, v8

    mul-float v6, v0, v8

    #v6=(Float);
    mul-float v0, v3, v8

    #v0=(Float);
    mul-float v3, v4, v8

    #v3=(Float);
    iget-object v4, p0, Lcom/unity3d/player/h;->b:Lcom/unity3d/player/UnityPlayer;

    #v4=(Reference);
    invoke-virtual {v4}, Lcom/unity3d/player/UnityPlayer;->getOrientation()I

    move-result v4

    #v4=(Integer);
    if-ne v4, v5, :cond_6

    move v4, v2

    :goto_1
    #v4=(PosByte);
    sub-int v4, v7, v4

    #v4=(Integer);
    and-int/lit8 v4, v4, 0x3

    if-ne v4, v5, :cond_9

    move v4, v0

    :goto_2
    #v4=(Float);
    const/high16 v0, -0x4080

    #v0=(Integer);
    const/high16 v7, -0x4080

    cmpg-float v7, v7, v6

    #v7=(Byte);
    if-gez v7, :cond_12

    move v0, v5

    #v0=(One);
    move v5, v6

    :goto_3
    #v0=(Boolean);v5=(Integer);
    neg-float v7, v6

    #v7=(Float);
    cmpg-float v7, v5, v7

    #v7=(Byte);
    if-gez v7, :cond_11

    neg-float v0, v6

    #v0=(Float);
    move v11, v1

    #v11=(PosByte);
    move v1, v0

    #v1=(Float);
    move v0, v11

    :goto_4
    #v0=(PosByte);v1=(Integer);v11=(Conflicted);
    cmpg-float v5, v1, v4

    #v5=(Byte);
    if-gez v5, :cond_1

    const/4 v0, 0x3

    move v1, v4

    :cond_1
    neg-float v5, v4

    #v5=(Float);
    cmpg-float v5, v1, v5

    #v5=(Byte);
    if-gez v5, :cond_2

    neg-float v1, v4

    #v1=(Float);
    const/4 v0, 0x4

    :cond_2
    #v1=(Integer);
    cmpg-float v4, v1, v3

    #v4=(Byte);
    if-gez v4, :cond_3

    const/4 v0, 0x5

    move v1, v3

    :cond_3
    neg-float v4, v3

    #v4=(Float);
    cmpg-float v4, v1, v4

    #v4=(Byte);
    if-gez v4, :cond_4

    neg-float v1, v3

    #v1=(Float);
    const/4 v0, 0x6

    :cond_4
    #v1=(Integer);
    float-to-double v3, v1

    #v3=(DoubleLo);v4=(DoubleHi);
    const-wide/high16 v5, 0x3fe0

    #v5=(LongLo);v6=(LongHi);
    const-wide/high16 v7, 0x4008

    #v7=(LongLo);v8=(LongHi);
    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v7

    #v7=(DoubleLo);v8=(DoubleHi);
    mul-double/2addr v5, v7

    #v5=(DoubleLo);v6=(DoubleHi);
    cmpg-double v1, v3, v5

    #v1=(Byte);
    if-gez v1, :cond_5

    move v0, v2

    :cond_5
    iput v0, p0, Lcom/unity3d/player/h;->K:I

    iget-object v0, p0, Lcom/unity3d/player/h;->b:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/h;->L:Ljava/lang/Runnable;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/unity3d/player/UnityPlayer;->queueEvent(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    :cond_6
    #v0=(Float);v1=(PosByte);v3=(Float);v4=(Integer);v5=(One);v6=(Float);v7=(Integer);v8=(Float);v11=(Uninit);
    if-nez v4, :cond_7

    move v4, v5

    #v4=(One);
    goto :goto_1

    :cond_7
    #v4=(Integer);
    const/16 v8, 0x9

    #v8=(PosByte);
    if-ne v4, v8, :cond_8

    move v4, v1

    #v4=(PosByte);
    goto :goto_1

    :cond_8
    #v4=(Integer);
    const/16 v8, 0x8

    if-ne v4, v8, :cond_14

    const/4 v4, 0x3

    #v4=(PosByte);
    goto :goto_1

    :cond_9
    #v4=(Integer);v8=(Float);
    const/4 v7, 0x3

    #v7=(PosByte);
    if-ne v4, v7, :cond_13

    neg-float v6, v6

    move v4, v0

    #v4=(Float);
    goto :goto_2

    :pswitch_2
    #v0=(Integer);v3=(Integer);v7=(Integer);v8=(Integer);v9=(Integer);
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    #v0=(Reference);
    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    iput-object v0, p0, Lcom/unity3d/player/h;->f:[F

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    #v6=(LongLo);v7=(LongHi);
    long-to-double v6, v6

    #v6=(DoubleLo);v7=(DoubleHi);
    const-wide v8, 0x408f400000000000L

    #v8=(LongLo);v9=(LongHi);
    div-double/2addr v6, v8

    iput-wide v6, p0, Lcom/unity3d/player/h;->G:D

    iget-object v0, p0, Lcom/unity3d/player/h;->I:[F

    const/4 v4, 0x0

    #v4=(Null);
    iget-object v6, p0, Lcom/unity3d/player/h;->e:[F

    #v6=(Reference);
    iget-object v7, p0, Lcom/unity3d/player/h;->f:[F

    #v7=(Reference);
    invoke-static {v0, v4, v6, v7}, Landroid/hardware/SensorManager;->getRotationMatrix([F[F[F[F)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/h;->I:[F

    #v0=(Reference);
    iget-object v4, p0, Lcom/unity3d/player/h;->J:[F

    #v4=(Reference);
    invoke-static {v0, v4}, Landroid/hardware/SensorManager;->getOrientation([F[F)[F

    iget-object v0, p0, Lcom/unity3d/player/h;->J:[F

    aget v0, v0, v2

    #v0=(Integer);
    float-to-double v6, v0

    #v6=(DoubleLo);v7=(DoubleHi);
    invoke-static {v6, v7}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v6

    double-to-float v0, v6

    #v0=(Float);
    packed-switch v3, :pswitch_data_1

    :goto_5
    cmpl-float v3, v0, v10

    #v3=(Byte);
    if-ltz v3, :cond_c

    sub-float/2addr v0, v10

    goto :goto_5

    :pswitch_3
    #v0=(Integer);v3=(Integer);v4=(Float);v6=(Float);v7=(Integer);v8=(Integer);v9=(Integer);
    iget-object v2, p1, Landroid/hardware/SensorEvent;->values:[F

    #v2=(Reference);
    aget v2, v2, v7

    #v2=(Integer);
    mul-float/2addr v2, v4

    #v2=(Float);
    iput v2, p0, Lcom/unity3d/player/h;->k:F

    iget-object v2, p1, Landroid/hardware/SensorEvent;->values:[F

    #v2=(Reference);
    aget v0, v2, v0

    mul-float/2addr v0, v6

    #v0=(Float);
    iput v0, p0, Lcom/unity3d/player/h;->l:F

    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    #v0=(Reference);
    aget v0, v0, v1

    #v0=(Integer);
    iput v0, p0, Lcom/unity3d/player/h;->m:F

    iget-wide v0, p1, Landroid/hardware/SensorEvent;->timestamp:J

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/unity3d/player/h;->n:J

    iget-object v0, p0, Lcom/unity3d/player/h;->b:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/h;->B:Ljava/lang/Runnable;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/unity3d/player/UnityPlayer;->queueEvent(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    :pswitch_4
    #v0=(Integer);v1=(PosByte);v2=(Null);
    mul-float v2, v4, v9

    #v2=(Float);
    iget-object v3, p1, Landroid/hardware/SensorEvent;->values:[F

    #v3=(Reference);
    aget v3, v3, v7

    #v3=(Integer);
    mul-float/2addr v2, v3

    iput v2, p0, Lcom/unity3d/player/h;->o:F

    mul-float v2, v6, v9

    iget-object v3, p1, Landroid/hardware/SensorEvent;->values:[F

    #v3=(Reference);
    aget v0, v3, v0

    mul-float/2addr v0, v2

    #v0=(Float);
    iput v0, p0, Lcom/unity3d/player/h;->p:F

    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    #v0=(Reference);
    aget v0, v0, v1

    #v0=(Integer);
    mul-float/2addr v0, v9

    #v0=(Float);
    iput v0, p0, Lcom/unity3d/player/h;->q:F

    iget-wide v0, p1, Landroid/hardware/SensorEvent;->timestamp:J

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/unity3d/player/h;->r:J

    iget-object v0, p0, Lcom/unity3d/player/h;->b:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/h;->C:Ljava/lang/Runnable;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/unity3d/player/UnityPlayer;->queueEvent(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    :pswitch_5
    #v0=(Integer);v1=(PosByte);v2=(Null);v3=(Integer);
    mul-float v2, v4, v9

    #v2=(Float);
    iget-object v3, p1, Landroid/hardware/SensorEvent;->values:[F

    #v3=(Reference);
    aget v3, v3, v7

    #v3=(Integer);
    mul-float/2addr v2, v3

    iput v2, p0, Lcom/unity3d/player/h;->s:F

    mul-float v2, v6, v9

    iget-object v3, p1, Landroid/hardware/SensorEvent;->values:[F

    #v3=(Reference);
    aget v0, v3, v0

    mul-float/2addr v0, v2

    #v0=(Float);
    iput v0, p0, Lcom/unity3d/player/h;->t:F

    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    #v0=(Reference);
    aget v0, v0, v1

    #v0=(Integer);
    mul-float/2addr v0, v9

    #v0=(Float);
    iput v0, p0, Lcom/unity3d/player/h;->u:F

    iget-wide v0, p1, Landroid/hardware/SensorEvent;->timestamp:J

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/unity3d/player/h;->v:J

    iget-object v0, p0, Lcom/unity3d/player/h;->b:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/h;->D:Ljava/lang/Runnable;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/unity3d/player/UnityPlayer;->queueEvent(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    :pswitch_6
    #v0=(Integer);v1=(PosByte);v2=(Null);v3=(Integer);
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    #v0=(Reference);
    aget v0, v0, v2

    #v0=(Integer);
    iput v0, p0, Lcom/unity3d/player/h;->x:F

    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    #v0=(Reference);
    aget v0, v0, v5

    #v0=(Integer);
    iput v0, p0, Lcom/unity3d/player/h;->y:F

    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    #v0=(Reference);
    aget v0, v0, v1

    #v0=(Integer);
    iput v0, p0, Lcom/unity3d/player/h;->z:F

    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    #v0=(Reference);
    array-length v0, v0

    #v0=(Integer);
    const/4 v1, 0x4

    if-ne v0, v1, :cond_a

    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    #v0=(Reference);
    const/4 v1, 0x3

    aget v0, v0, v1

    #v0=(Integer);
    move-object v1, p0

    :goto_6
    #v1=(Reference);v2=(Integer);
    iput v0, v1, Lcom/unity3d/player/h;->w:F

    iget-object v0, p0, Lcom/unity3d/player/h;->b:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/h;->E:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/unity3d/player/UnityPlayer;->queueEvent(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    :cond_a
    #v0=(Integer);v1=(PosByte);v2=(Null);
    iget v0, p0, Lcom/unity3d/player/h;->x:F

    iget v1, p0, Lcom/unity3d/player/h;->x:F

    #v1=(Integer);
    mul-float/2addr v0, v1

    #v0=(Float);
    iget v1, p0, Lcom/unity3d/player/h;->y:F

    iget v2, p0, Lcom/unity3d/player/h;->y:F

    #v2=(Integer);
    mul-float/2addr v1, v2

    #v1=(Float);
    add-float/2addr v0, v1

    iget v1, p0, Lcom/unity3d/player/h;->z:F

    #v1=(Integer);
    iget v2, p0, Lcom/unity3d/player/h;->z:F

    mul-float/2addr v1, v2

    #v1=(Float);
    add-float/2addr v0, v1

    const/high16 v1, 0x3f80

    #v1=(Integer);
    cmpg-float v1, v0, v1

    #v1=(Byte);
    if-gez v1, :cond_b

    const/high16 v1, 0x3f80

    #v1=(Integer);
    sub-float v0, v1, v0

    float-to-double v0, v0

    #v0=(DoubleLo);v1=(DoubleHi);
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    #v0=(Float);
    move-object v1, p0

    #v1=(Reference);
    goto :goto_6

    :cond_b
    #v1=(Byte);
    const/4 v0, 0x0

    #v0=(Null);
    move-object v1, p0

    #v1=(Reference);
    goto :goto_6

    :pswitch_7
    #v0=(Float);v1=(PosByte);v2=(Null);v4=(Reference);v6=(DoubleLo);v7=(DoubleHi);v8=(LongLo);v9=(LongHi);
    const/high16 v3, 0x42b4

    add-float/2addr v0, v3

    goto/16 :goto_5

    :pswitch_8
    const/high16 v3, 0x4334

    add-float/2addr v0, v3

    goto/16 :goto_5

    :pswitch_9
    const/high16 v3, 0x4387

    add-float/2addr v0, v3

    goto/16 :goto_5

    :cond_c
    #v3=(Byte);
    const/4 v3, 0x0

    #v3=(Null);
    cmpg-float v3, v0, v3

    #v3=(Byte);
    if-gez v3, :cond_10

    add-float/2addr v0, v10

    move v6, v0

    :goto_7
    #v6=(Float);
    iget-object v0, p0, Lcom/unity3d/player/h;->F:[F

    #v0=(Reference);
    iget-object v3, p0, Lcom/unity3d/player/h;->f:[F

    #v3=(Reference);
    aget v3, v3, v2

    #v3=(Integer);
    aput v3, v0, v2

    iget-object v0, p0, Lcom/unity3d/player/h;->F:[F

    iget-object v2, p0, Lcom/unity3d/player/h;->f:[F

    #v2=(Reference);
    aget v2, v2, v5

    #v2=(Integer);
    aput v2, v0, v5

    iget-object v0, p0, Lcom/unity3d/player/h;->F:[F

    iget-object v2, p0, Lcom/unity3d/player/h;->f:[F

    #v2=(Reference);
    aget v2, v2, v1

    #v2=(Integer);
    aput v2, v0, v1

    iget-object v0, p0, Lcom/unity3d/player/h;->F:[F

    const/4 v1, 0x3

    aput v6, v0, v1

    iget-object v0, p0, Lcom/unity3d/player/h;->M:Landroid/location/Location;

    if-eqz v0, :cond_f

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iget-object v2, p0, Lcom/unity3d/player/h;->M:Landroid/location/Location;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    sub-long/2addr v0, v2

    const-wide/32 v2, 0x124f80

    cmp-long v0, v0, v2

    #v0=(Byte);
    if-gez v0, :cond_f

    new-instance v0, Landroid/hardware/GeomagneticField;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/unity3d/player/h;->M:Landroid/location/Location;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    #v1=(DoubleLo);v2=(DoubleHi);
    double-to-float v1, v1

    #v1=(Float);
    iget-object v2, p0, Lcom/unity3d/player/h;->M:Landroid/location/Location;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    #v2=(DoubleLo);v3=(DoubleHi);
    double-to-float v2, v2

    #v2=(Float);
    iget-object v3, p0, Lcom/unity3d/player/h;->M:Landroid/location/Location;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/location/Location;->getAltitude()D

    move-result-wide v3

    #v3=(DoubleLo);v4=(DoubleHi);
    double-to-float v3, v3

    #v3=(Float);
    iget-object v4, p0, Lcom/unity3d/player/h;->M:Landroid/location/Location;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/location/Location;->getTime()J

    move-result-wide v4

    #v4=(LongLo);v5=(LongHi);
    invoke-direct/range {v0 .. v5}, Landroid/hardware/GeomagneticField;-><init>(FFFJ)V

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/hardware/GeomagneticField;->getDeclination()F

    move-result v0

    #v0=(Float);
    add-float/2addr v6, v0

    move v0, v6

    :goto_8
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    cmpl-float v1, v0, v10

    #v1=(Byte);
    if-ltz v1, :cond_d

    sub-float v6, v0, v10

    move v0, v6

    goto :goto_8

    :cond_d
    const/4 v1, 0x0

    #v1=(Null);
    cmpg-float v1, v0, v1

    #v1=(Byte);
    if-gez v1, :cond_e

    add-float/2addr v0, v10

    :cond_e
    iget-object v1, p0, Lcom/unity3d/player/h;->F:[F

    #v1=(Reference);
    const/4 v2, 0x4

    #v2=(PosByte);
    aput v0, v1, v2

    iget-object v0, p0, Lcom/unity3d/player/h;->b:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/h;->H:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/unity3d/player/UnityPlayer;->queueEvent(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    :cond_f
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Reference);v5=(One);
    move v0, v6

    #v0=(Float);
    goto :goto_8

    :cond_10
    #v1=(PosByte);v2=(Null);v3=(Byte);v6=(DoubleLo);
    move v6, v0

    #v6=(Float);
    goto :goto_7

    :cond_11
    #v0=(Boolean);v3=(Float);v4=(Float);v5=(Integer);v7=(Byte);v8=(Float);v9=(DoubleHi);
    move v1, v5

    #v1=(Integer);
    goto/16 :goto_4

    :cond_12
    #v0=(Integer);v1=(PosByte);v5=(One);
    move v5, v0

    #v5=(Integer);
    move v0, v2

    #v0=(Null);
    goto/16 :goto_3

    :cond_13
    #v0=(Float);v4=(Integer);v5=(One);v7=(PosByte);
    move v4, v6

    #v4=(Float);
    move v6, v0

    goto/16 :goto_2

    :cond_14
    #v4=(Integer);v7=(Integer);v8=(PosByte);
    move v4, v2

    #v4=(Null);
    goto/16 :goto_1

    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_7
        :pswitch_8
        :pswitch_9
    .end packed-switch
.end method

.method public final onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    return-void
.end method

*/}
