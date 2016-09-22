package com.unity3d.player; class c {/*

.class public final Lcom/unity3d/player/c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/unity3d/player/e;


# instance fields
.field protected final a:Landroid/content/ContextWrapper;

.field private b:Landroid/app/Activity;

.field private c:Ljava/util/Queue;

.field private d:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/ContextWrapper;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/c;->c:Ljava/util/Queue;

    new-instance v0, Lcom/unity3d/player/d;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/unity3d/player/d;-><init>(Lcom/unity3d/player/c;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/c;->d:Ljava/lang/Runnable;

    iput-object p1, p0, Lcom/unity3d/player/c;->a:Landroid/content/ContextWrapper;

    instance-of v0, p1, Landroid/app/Activity;

    #v0=(Boolean);
    if-eqz v0, :cond_0

    check-cast p1, Landroid/app/Activity;

    :goto_0
    iput-object p1, p0, Lcom/unity3d/player/c;->b:Landroid/app/Activity;

    return-void

    :cond_0
    const/4 p1, 0x0

    #p1=(Null);
    goto :goto_0
.end method

.method private static a([Landroid/view/MotionEvent$PointerCoords;[FI)I
    .locals 4

    const/4 v0, 0x0

    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    array-length v1, p0

    #v1=(Integer);
    if-ge v0, v1, :cond_0

    new-instance v1, Landroid/view/MotionEvent$PointerCoords;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/view/MotionEvent$PointerCoords;-><init>()V

    #v1=(Reference);
    aput-object v1, p0, v0

    add-int/lit8 v2, p2, 0x1

    #v2=(Integer);
    aget v3, p1, p2

    #v3=(Integer);
    iput v3, v1, Landroid/view/MotionEvent$PointerCoords;->orientation:F

    add-int/lit8 v3, v2, 0x1

    aget v2, p1, v2

    iput v2, v1, Landroid/view/MotionEvent$PointerCoords;->pressure:F

    add-int/lit8 v2, v3, 0x1

    aget v3, p1, v3

    iput v3, v1, Landroid/view/MotionEvent$PointerCoords;->size:F

    add-int/lit8 v3, v2, 0x1

    aget v2, p1, v2

    iput v2, v1, Landroid/view/MotionEvent$PointerCoords;->toolMajor:F

    add-int/lit8 v2, v3, 0x1

    aget v3, p1, v3

    iput v3, v1, Landroid/view/MotionEvent$PointerCoords;->toolMinor:F

    add-int/lit8 v3, v2, 0x1

    aget v2, p1, v2

    iput v2, v1, Landroid/view/MotionEvent$PointerCoords;->touchMajor:F

    add-int/lit8 v2, v3, 0x1

    aget v3, p1, v3

    iput v3, v1, Landroid/view/MotionEvent$PointerCoords;->touchMinor:F

    add-int/lit8 v3, v2, 0x1

    aget v2, p1, v2

    iput v2, v1, Landroid/view/MotionEvent$PointerCoords;->x:F

    add-int/lit8 p2, v3, 0x1

    aget v2, p1, v3

    iput v2, v1, Landroid/view/MotionEvent$PointerCoords;->y:F

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    #v1=(Integer);v2=(Conflicted);v3=(Conflicted);
    return p2
.end method

.method static synthetic a(Lcom/unity3d/player/c;)Ljava/util/Queue;
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/c;->c:Ljava/util/Queue;

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public final a(Landroid/view/MotionEvent;)I
    .locals 1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public final a(JJII[I[FIFFIIIII[J[F)V
    .locals 16

    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v1, v0, Lcom/unity3d/player/c;->b:Landroid/app/Activity;

    #v1=(Reference);
    if-eqz v1, :cond_1

    move/from16 v0, p6

    #v0=(Integer);
    new-array v8, v0, [Landroid/view/MotionEvent$PointerCoords;

    #v8=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    move-object/from16 v0, p8

    #v0=(Reference);
    invoke-static {v8, v0, v1}, Lcom/unity3d/player/c;->a([Landroid/view/MotionEvent$PointerCoords;[FI)I

    move-wide/from16 v1, p1

    #v1=(LongLo);v2=(LongHi);
    move-wide/from16 v3, p3

    #v3=(LongLo);v4=(LongHi);
    move/from16 v5, p5

    #v5=(Integer);
    move/from16 v6, p6

    #v6=(Integer);
    move-object/from16 v7, p7

    #v7=(Reference);
    move/from16 v9, p9

    #v9=(Integer);
    move/from16 v10, p10

    #v10=(Float);
    move/from16 v11, p11

    #v11=(Float);
    move/from16 v12, p12

    #v12=(Integer);
    move/from16 v13, p13

    #v13=(Integer);
    move/from16 v14, p14

    #v14=(Integer);
    move/from16 v15, p15

    #v15=(Integer);
    invoke-static/range {v1 .. v15}, Landroid/view/MotionEvent;->obtain(JJII[I[Landroid/view/MotionEvent$PointerCoords;IFFIIII)Landroid/view/MotionEvent;

    move-result-object v3

    #v3=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v1, 0x0

    :goto_0
    #v0=(Conflicted);v1=(Integer);v2=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    move/from16 v0, p16

    #v0=(Integer);
    if-ge v1, v0, :cond_0

    move/from16 v0, p6

    new-array v4, v0, [Landroid/view/MotionEvent$PointerCoords;

    #v4=(Reference);
    move-object/from16 v0, p18

    #v0=(Reference);
    invoke-static {v4, v0, v2}, Lcom/unity3d/player/c;->a([Landroid/view/MotionEvent$PointerCoords;[FI)I

    move-result v2

    aget-wide v5, p17, v1

    #v5=(LongLo);v6=(LongHi);
    move/from16 v0, p9

    #v0=(Integer);
    invoke-virtual {v3, v5, v6, v4, v0}, Landroid/view/MotionEvent;->addBatch(J[Landroid/view/MotionEvent$PointerCoords;I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v1, v0, Lcom/unity3d/player/c;->c:Ljava/util/Queue;

    #v1=(Reference);
    invoke-interface {v1, v3}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/unity3d/player/c;->b:Landroid/app/Activity;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/unity3d/player/c;->d:Ljava/lang/Runnable;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_1
    #v2=(Conflicted);v3=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
    return-void
.end method

.method public final a(I)Z
    .locals 2

    const/4 v0, 0x1

    #v0=(One);
    new-instance v1, Landroid/hardware/Camera$CameraInfo;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    #v1=(Reference);
    invoke-static {p1, v1}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    iget v1, v1, Landroid/hardware/Camera$CameraInfo;->facing:I

    #v1=(Integer);
    if-ne v1, v0, :cond_0

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(One);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public final b()Landroid/graphics/RectF;
    .locals 8

    const v7, 0x100008

    #v7=(Integer);
    const/4 v1, 0x0

    #v1=(Null);
    const/4 v6, 0x0

    #v6=(Null);
    invoke-static {}, Landroid/view/InputDevice;->getDeviceIds()[I

    move-result-object v2

    #v2=(Reference);
    move v0, v1

    :goto_0
    #v0=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    array-length v3, v2

    #v3=(Integer);
    if-ge v0, v3, :cond_1

    aget v3, v2, v0

    invoke-static {v3}, Landroid/view/InputDevice;->getDevice(I)Landroid/view/InputDevice;

    move-result-object v3

    #v3=(Reference);
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/view/InputDevice;->getSources()I

    move-result v4

    #v4=(Integer);
    and-int/2addr v4, v7

    if-ne v4, v7, :cond_0

    invoke-virtual {v3, v1}, Landroid/view/InputDevice;->getMotionRange(I)Landroid/view/InputDevice$MotionRange;

    move-result-object v4

    #v4=(Reference);
    const/4 v5, 0x1

    #v5=(One);
    invoke-virtual {v3, v5}, Landroid/view/InputDevice;->getMotionRange(I)Landroid/view/InputDevice$MotionRange;

    move-result-object v3

    if-eqz v4, :cond_0

    if-eqz v3, :cond_0

    new-instance v0, Landroid/graphics/RectF;

    #v0=(UninitRef);
    invoke-virtual {v4}, Landroid/view/InputDevice$MotionRange;->getRange()F

    move-result v1

    #v1=(Float);
    invoke-virtual {v3}, Landroid/view/InputDevice$MotionRange;->getRange()F

    move-result v2

    #v2=(Float);
    invoke-direct {v0, v6, v6, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    :goto_1
    #v0=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Integer);v1=(Null);v2=(Reference);v3=(Reference);
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    #v3=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_1
.end method

*/}
