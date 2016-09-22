package com.unity3d.player; class q {/*

.class Lcom/unity3d/player/q;
.super Landroid/opengl/GLSurfaceView;

# interfaces
.implements Lcom/unity3d/player/UnityGL;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/unity3d/player/q$a;,
        Lcom/unity3d/player/q$b;
    }
.end annotation


# static fields
.field private static a:Z

.field private static b:Z


# instance fields
.field private c:Lcom/unity3d/player/q$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    sput-boolean v0, Lcom/unity3d/player/q;->a:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;IZZ)V
    .locals 7

    const/16 v3, 0x10

    #v3=(PosByte);
    const/4 v5, 0x0

    #v5=(Null);
    invoke-direct {p0, p1}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;)V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/unity3d/player/q;->c:Lcom/unity3d/player/q$a;

    sput-boolean p4, Lcom/unity3d/player/q;->a:Z

    move-object v0, p0

    #v0=(Reference);
    move v1, p2

    #v1=(Integer);
    move v2, p3

    #v2=(Boolean);
    move v4, v3

    #v4=(PosByte);
    move v6, v5

    #v6=(Null);
    invoke-virtual/range {v0 .. v6}, Lcom/unity3d/player/q;->init(IZIIII)V

    return-void
.end method

.method static synthetic a(Ljava/lang/String;)V
    .locals 1

    sget-boolean v0, Lcom/unity3d/player/q;->a:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    const-string v0, "Unity"

    #v0=(Reference);
    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    #v0=(Conflicted);
    return-void
.end method

.method static synthetic a(Ljava/lang/String;Ljavax/microedition/khronos/egl/EGL10;)V
    .locals 8

    const/4 v7, 0x2

    #v7=(PosByte);
    const/4 v1, 0x0

    #v1=(Null);
    move v0, v1

    :goto_0
    #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    if-ge v0, v7, :cond_0

    invoke-interface {p1}, Ljavax/microedition/khronos/egl/EGL10;->eglGetError()I

    move-result v2

    #v2=(Integer);
    const/16 v3, 0x3000

    #v3=(PosShort);
    if-eq v2, v3, :cond_0

    const-string v3, "Unity"

    #v3=(Reference);
    const-string v4, "%s: EGL error: 0x%x"

    #v4=(Reference);
    new-array v5, v7, [Ljava/lang/Object;

    #v5=(Reference);
    aput-object p0, v5, v1

    const/4 v6, 0x1

    #v6=(One);
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v5, v6

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-void
.end method

.method public static b()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0x9

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method static synthetic c()Z
    .locals 1

    sget-boolean v0, Lcom/unity3d/player/q;->b:Z

    #v0=(Boolean);
    return v0
.end method


# virtual methods
.method public final a()V
    .locals 0

    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onDetachedFromWindow()V

    return-void
.end method

.method public final a(I)V
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/q;->c:Lcom/unity3d/player/q$a;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/q;->c:Lcom/unity3d/player/q$a;

    iput p1, v0, Lcom/unity3d/player/q$a;->e:I

    :cond_0
    return-void
.end method

.method public final a(Z)V
    .locals 5

    const/4 v4, 0x5

    #v4=(PosByte);
    const/4 v1, 0x0

    #v1=(Null);
    const/16 v3, 0x8

    #v3=(PosByte);
    iget-object v0, p0, Lcom/unity3d/player/q;->c:Lcom/unity3d/player/q$a;

    #v0=(Reference);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    :cond_1
    #v0=(Reference);v2=(Uninit);
    if-eqz p1, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v2, 0x9

    #v2=(PosByte);
    if-lt v0, v2, :cond_3

    const/4 v0, 0x1

    :goto_1
    #v0=(Boolean);
    if-eqz v0, :cond_0

    :cond_2
    #v0=(Conflicted);v2=(Conflicted);
    if-eqz p1, :cond_4

    iget-object v0, p0, Lcom/unity3d/player/q;->c:Lcom/unity3d/player/q$a;

    #v0=(Reference);
    iput v3, v0, Lcom/unity3d/player/q$a;->a:I

    iget-object v0, p0, Lcom/unity3d/player/q;->c:Lcom/unity3d/player/q$a;

    iput v3, v0, Lcom/unity3d/player/q$a;->b:I

    iget-object v0, p0, Lcom/unity3d/player/q;->c:Lcom/unity3d/player/q$a;

    iput v3, v0, Lcom/unity3d/player/q$a;->c:I

    iget-object v0, p0, Lcom/unity3d/player/q;->c:Lcom/unity3d/player/q$a;

    iput v3, v0, Lcom/unity3d/player/q$a;->d:I

    goto :goto_0

    :cond_3
    #v0=(Integer);v2=(PosByte);
    move v0, v1

    #v0=(Null);
    goto :goto_1

    :cond_4
    #v0=(Conflicted);v2=(Conflicted);
    iget-object v0, p0, Lcom/unity3d/player/q;->c:Lcom/unity3d/player/q$a;

    #v0=(Reference);
    iput v4, v0, Lcom/unity3d/player/q$a;->a:I

    iget-object v0, p0, Lcom/unity3d/player/q;->c:Lcom/unity3d/player/q$a;

    const/4 v2, 0x6

    #v2=(PosByte);
    iput v2, v0, Lcom/unity3d/player/q$a;->b:I

    iget-object v0, p0, Lcom/unity3d/player/q;->c:Lcom/unity3d/player/q$a;

    iput v4, v0, Lcom/unity3d/player/q$a;->c:I

    iget-object v0, p0, Lcom/unity3d/player/q;->c:Lcom/unity3d/player/q$a;

    iput v1, v0, Lcom/unity3d/player/q$a;->d:I

    goto :goto_0
.end method

.method protected init(IZIIII)V
    .locals 8

    const/16 v6, 0x20

    #v6=(PosByte);
    const/4 v5, 0x5

    #v5=(PosByte);
    const/4 v2, 0x1

    #v2=(One);
    const/4 v4, 0x0

    #v4=(Null);
    const/16 v1, 0x8

    #v1=(PosByte);
    const/4 v0, 0x2

    #v0=(PosByte);
    if-ne p1, v0, :cond_3

    move v0, v2

    :goto_0
    #v0=(Boolean);
    sput-boolean v0, Lcom/unity3d/player/q;->b:Z

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v3, 0x9

    #v3=(PosByte);
    if-lt v0, v3, :cond_4

    :goto_1
    #v2=(Boolean);
    if-nez v2, :cond_0

    const/16 p3, 0x10

    :cond_0
    invoke-virtual {p0}, Lcom/unity3d/player/q;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v2

    #v2=(Reference);
    if-nez p2, :cond_1

    if-ne p3, v6, :cond_5

    :cond_1
    const/4 v0, -0x3

    :goto_2
    #v0=(Byte);
    invoke-interface {v2, v0}, Landroid/view/SurfaceHolder;->setFormat(I)V

    new-instance v0, Lcom/unity3d/player/q$b;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/unity3d/player/q$b;-><init>()V

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/unity3d/player/q;->setEGLContextFactory(Landroid/opengl/GLSurfaceView$EGLContextFactory;)V

    if-nez p2, :cond_2

    if-ne p3, v6, :cond_6

    :cond_2
    new-instance v0, Lcom/unity3d/player/q$a;

    #v0=(UninitRef);
    move v2, v1

    #v2=(PosByte);
    move v3, v1

    move v4, v1

    #v4=(PosByte);
    move v5, p4

    #v5=(Integer);
    move v6, p5

    #v6=(Integer);
    move v7, p6

    #v7=(Integer);
    invoke-direct/range {v0 .. v7}, Lcom/unity3d/player/q$a;-><init>(IIIIIII)V

    :goto_3
    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/q;->c:Lcom/unity3d/player/q$a;

    iget-object v0, p0, Lcom/unity3d/player/q;->c:Lcom/unity3d/player/q$a;

    invoke-virtual {p0, v0}, Lcom/unity3d/player/q;->setEGLConfigChooser(Landroid/opengl/GLSurfaceView$EGLConfigChooser;)V

    return-void

    :cond_3
    #v0=(PosByte);v2=(One);v3=(Uninit);v4=(Null);v5=(PosByte);v6=(PosByte);v7=(Uninit);
    move v0, v4

    #v0=(Null);
    goto :goto_0

    :cond_4
    #v0=(Integer);v3=(PosByte);
    move v2, v4

    #v2=(Null);
    goto :goto_1

    :cond_5
    #v2=(Reference);
    const/4 v0, -0x1

    #v0=(Byte);
    goto :goto_2

    :cond_6
    #v0=(Reference);
    new-instance v0, Lcom/unity3d/player/q$a;

    #v0=(UninitRef);
    const/4 v2, 0x6

    #v2=(PosByte);
    move v1, v5

    move v3, v5

    move v5, p4

    #v5=(Integer);
    move v6, p5

    #v6=(Integer);
    move v7, p6

    #v7=(Integer);
    invoke-direct/range {v0 .. v7}, Lcom/unity3d/player/q$a;-><init>(IIIIIII)V

    #v0=(Reference);
    goto :goto_3
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    const-string v0, "onDetachedFromWindow"

    #v0=(Reference);
    sget-boolean v1, Lcom/unity3d/player/q;->a:Z

    #v1=(Boolean);
    if-nez v1, :cond_0

    const-string v1, "Unity"

    #v1=(Reference);
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    #v1=(Conflicted);
    return-void
.end method

.method public onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

*/}
