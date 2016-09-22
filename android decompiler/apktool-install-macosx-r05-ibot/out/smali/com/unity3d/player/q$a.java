package com.unity3d.player; class q$a {/*

.class final Lcom/unity3d/player/q$a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/opengl/GLSurfaceView$EGLConfigChooser;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unity3d/player/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field private static final f:[I

.field private static final g:[I

.field private static j:[I

.field private static synthetic k:Z


# instance fields
.field protected a:I

.field protected b:I

.field protected c:I

.field protected d:I

.field public e:I

.field private h:I

.field private i:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v2, 0x9

    #v2=(PosByte);
    const/4 v1, 0x1

    #v1=(One);
    const-class v0, Lcom/unity3d/player/q;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    sput-boolean v0, Lcom/unity3d/player/q$a;->k:Z

    new-array v0, v2, [I

    #v0=(Reference);
    fill-array-data v0, :array_0

    sput-object v0, Lcom/unity3d/player/q$a;->f:[I

    new-array v0, v2, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/unity3d/player/q$a;->g:[I

    new-array v0, v1, [I

    sput-object v0, Lcom/unity3d/player/q$a;->j:[I

    return-void

    :cond_0
    #v0=(Boolean);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0

    #v0=(Unknown);v1=(Unknown);v2=(Unknown);
    nop

    :array_0
    .array-data 0x4
        0x24t 0x30t 0x0t 0x0t
        0x4t 0x0t 0x0t 0x0t
        0x23t 0x30t 0x0t 0x0t
        0x4t 0x0t 0x0t 0x0t
        0x22t 0x30t 0x0t 0x0t
        0x4t 0x0t 0x0t 0x0t
        0x40t 0x30t 0x0t 0x0t
        0x4t 0x0t 0x0t 0x0t
        0x38t 0x30t 0x0t 0x0t
    .end array-data

    :array_1
    .array-data 0x4
        0x24t 0x30t 0x0t 0x0t
        0x5t 0x0t 0x0t 0x0t
        0x23t 0x30t 0x0t 0x0t
        0x6t 0x0t 0x0t 0x0t
        0x22t 0x30t 0x0t 0x0t
        0x5t 0x0t 0x0t 0x0t
        0x40t 0x30t 0x0t 0x0t
        0x1t 0x0t 0x0t 0x0t
        0x38t 0x30t 0x0t 0x0t
    .end array-data
.end method

.method public constructor <init>(IIIIIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput p1, p0, Lcom/unity3d/player/q$a;->a:I

    iput p2, p0, Lcom/unity3d/player/q$a;->b:I

    iput p3, p0, Lcom/unity3d/player/q$a;->c:I

    iput p4, p0, Lcom/unity3d/player/q$a;->d:I

    iput p5, p0, Lcom/unity3d/player/q$a;->h:I

    iput p6, p0, Lcom/unity3d/player/q$a;->i:I

    iput p7, p0, Lcom/unity3d/player/q$a;->e:I

    return-void
.end method

.method static synthetic a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;I)I
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {p0, p1, p2, p3, v0}, Lcom/unity3d/player/q$a;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method private static a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I
    .locals 5

    const/4 v0, 0x0

    #v0=(Null);
    sget-object v1, Lcom/unity3d/player/q$a;->j:[I

    #v1=(Reference);
    invoke-interface {p0, p1, p2, p3, v1}, Ljavax/microedition/khronos/egl/EGL10;->eglGetConfigAttrib(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    sget-object v1, Lcom/unity3d/player/q$a;->j:[I

    #v1=(Reference);
    aget v0, v1, v0

    :goto_0
    #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return v0

    :cond_0
    #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    invoke-interface {p0}, Ljavax/microedition/khronos/egl/EGL10;->eglGetError()I

    move-result v1

    #v1=(Integer);
    const/16 v2, 0x3004

    #v2=(PosShort);
    if-eq v1, v2, :cond_1

    const-string v2, "Unity"

    #v2=(Reference);
    const-string v3, "findConfigAttrib: EGL error: 0x%x"

    #v3=(Reference);
    const/4 v4, 0x1

    #v4=(One);
    new-array v4, v4, [Ljava/lang/Object;

    #v4=(Reference);
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    #v1=(Reference);
    aput-object v1, v4, v0

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "findConfigAttrib ("

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p0}, Lcom/unity3d/player/q;->a(Ljava/lang/String;Ljavax/microedition/khronos/egl/EGL10;)V

    goto :goto_0
.end method

.method private a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;[Ljavax/microedition/khronos/egl/EGLConfig;)Ljavax/microedition/khronos/egl/EGLConfig;
    .locals 9

    const/4 v2, 0x0

    #v2=(Null);
    array-length v3, p3

    #v3=(Integer);
    move v1, v2

    :goto_0
    #v0=(Conflicted);v1=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    if-ge v1, v3, :cond_3

    aget-object v0, p3, v1

    #v0=(Null);
    sget-boolean v4, Lcom/unity3d/player/q$a;->k:Z

    #v4=(Boolean);
    if-nez v4, :cond_0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    #v0=(Reference);
    throw v0

    :cond_0
    #v0=(Null);
    const/16 v4, 0x3025

    #v4=(PosShort);
    invoke-static {p1, p2, v0, v4, v2}, Lcom/unity3d/player/q$a;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    move-result v4

    #v4=(Integer);
    const/16 v5, 0x3026

    #v5=(PosShort);
    invoke-static {p1, p2, v0, v5, v2}, Lcom/unity3d/player/q$a;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    move-result v5

    #v5=(Integer);
    const/16 v6, 0x3031

    #v6=(PosShort);
    invoke-static {p1, p2, v0, v6, v2}, Lcom/unity3d/player/q$a;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    move-result v6

    #v6=(Integer);
    const/16 v7, 0x30e1

    #v7=(PosShort);
    invoke-static {p1, p2, v0, v7, v2}, Lcom/unity3d/player/q$a;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    move-result v7

    #v7=(Integer);
    iget v8, p0, Lcom/unity3d/player/q$a;->h:I

    #v8=(Integer);
    if-lt v4, v8, :cond_2

    iget v4, p0, Lcom/unity3d/player/q$a;->i:I

    if-lt v5, v4, :cond_2

    iget v4, p0, Lcom/unity3d/player/q$a;->e:I

    if-ge v6, v4, :cond_1

    add-int/lit8 v4, v7, -0x1

    iget v5, p0, Lcom/unity3d/player/q$a;->e:I

    if-lt v4, v5, :cond_2

    :cond_1
    const/16 v4, 0x3024

    #v4=(PosShort);
    invoke-static {p1, p2, v0, v4, v2}, Lcom/unity3d/player/q$a;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    move-result v4

    #v4=(Integer);
    const/16 v5, 0x3023

    #v5=(PosShort);
    invoke-static {p1, p2, v0, v5, v2}, Lcom/unity3d/player/q$a;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    move-result v5

    #v5=(Integer);
    const/16 v6, 0x3022

    #v6=(PosShort);
    invoke-static {p1, p2, v0, v6, v2}, Lcom/unity3d/player/q$a;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    move-result v6

    #v6=(Integer);
    const/16 v7, 0x3021

    #v7=(PosShort);
    invoke-static {p1, p2, v0, v7, v2}, Lcom/unity3d/player/q$a;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    move-result v7

    #v7=(Integer);
    iget v8, p0, Lcom/unity3d/player/q$a;->a:I

    if-ne v4, v8, :cond_2

    iget v4, p0, Lcom/unity3d/player/q$a;->b:I

    if-ne v5, v4, :cond_2

    iget v4, p0, Lcom/unity3d/player/q$a;->c:I

    if-ne v6, v4, :cond_2

    iget v4, p0, Lcom/unity3d/player/q$a;->d:I

    if-ne v7, v4, :cond_2

    :goto_1
    #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return-object v0

    :cond_2
    #v4=(Integer);v5=(Integer);v6=(Integer);v7=(Integer);v8=(Integer);
    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_0

    :cond_3
    #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_1
.end method

.method protected static printConfig(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 10

    const/16 v0, 0x23

    #v0=(PosByte);
    const/4 v9, 0x2

    #v9=(PosByte);
    const/4 v8, 0x1

    #v8=(One);
    const/4 v1, 0x0

    #v1=(Null);
    new-array v2, v0, [I

    #v2=(Reference);
    fill-array-data v2, :array_0

    new-array v3, v0, [Ljava/lang/String;

    #v3=(Reference);
    const-string v0, "EGL_BUFFER_SIZE"

    #v0=(Reference);
    aput-object v0, v3, v1

    const-string v0, "EGL_ALPHA_SIZE"

    aput-object v0, v3, v8

    const-string v0, "EGL_BLUE_SIZE"

    aput-object v0, v3, v9

    const/4 v0, 0x3

    #v0=(PosByte);
    const-string v4, "EGL_GREEN_SIZE"

    #v4=(Reference);
    aput-object v4, v3, v0

    const/4 v0, 0x4

    const-string v4, "EGL_RED_SIZE"

    aput-object v4, v3, v0

    const/4 v0, 0x5

    const-string v4, "EGL_DEPTH_SIZE"

    aput-object v4, v3, v0

    const/4 v0, 0x6

    const-string v4, "EGL_STENCIL_SIZE"

    aput-object v4, v3, v0

    const/4 v0, 0x7

    const-string v4, "EGL_CONFIG_CAVEAT"

    aput-object v4, v3, v0

    const/16 v0, 0x8

    const-string v4, "EGL_CONFIG_ID"

    aput-object v4, v3, v0

    const/16 v0, 0x9

    const-string v4, "EGL_LEVEL"

    aput-object v4, v3, v0

    const/16 v0, 0xa

    const-string v4, "EGL_MAX_PBUFFER_HEIGHT"

    aput-object v4, v3, v0

    const/16 v0, 0xb

    const-string v4, "EGL_MAX_PBUFFER_PIXELS"

    aput-object v4, v3, v0

    const/16 v0, 0xc

    const-string v4, "EGL_MAX_PBUFFER_WIDTH"

    aput-object v4, v3, v0

    const/16 v0, 0xd

    const-string v4, "EGL_NATIVE_RENDERABLE"

    aput-object v4, v3, v0

    const/16 v0, 0xe

    const-string v4, "EGL_NATIVE_VISUAL_ID"

    aput-object v4, v3, v0

    const/16 v0, 0xf

    const-string v4, "EGL_NATIVE_VISUAL_TYPE"

    aput-object v4, v3, v0

    const/16 v0, 0x10

    const-string v4, "EGL_PRESERVED_RESOURCES"

    aput-object v4, v3, v0

    const/16 v0, 0x11

    const-string v4, "EGL_SAMPLES"

    aput-object v4, v3, v0

    const/16 v0, 0x12

    const-string v4, "EGL_SAMPLE_BUFFERS"

    aput-object v4, v3, v0

    const/16 v0, 0x13

    const-string v4, "EGL_SURFACE_TYPE"

    aput-object v4, v3, v0

    const/16 v0, 0x14

    const-string v4, "EGL_TRANSPARENT_TYPE"

    aput-object v4, v3, v0

    const/16 v0, 0x15

    const-string v4, "EGL_TRANSPARENT_RED_VALUE"

    aput-object v4, v3, v0

    const/16 v0, 0x16

    const-string v4, "EGL_TRANSPARENT_GREEN_VALUE"

    aput-object v4, v3, v0

    const/16 v0, 0x17

    const-string v4, "EGL_TRANSPARENT_BLUE_VALUE"

    aput-object v4, v3, v0

    const/16 v0, 0x18

    const-string v4, "EGL_BIND_TO_TEXTURE_RGB"

    aput-object v4, v3, v0

    const/16 v0, 0x19

    const-string v4, "EGL_BIND_TO_TEXTURE_RGBA"

    aput-object v4, v3, v0

    const/16 v0, 0x1a

    const-string v4, "EGL_MIN_SWAP_INTERVAL"

    aput-object v4, v3, v0

    const/16 v0, 0x1b

    const-string v4, "EGL_MAX_SWAP_INTERVAL"

    aput-object v4, v3, v0

    const/16 v0, 0x1c

    const-string v4, "EGL_LUMINANCE_SIZE"

    aput-object v4, v3, v0

    const/16 v0, 0x1d

    const-string v4, "EGL_ALPHA_MASK_SIZE"

    aput-object v4, v3, v0

    const/16 v0, 0x1e

    const-string v4, "EGL_COLOR_BUFFER_TYPE"

    aput-object v4, v3, v0

    const/16 v0, 0x1f

    const-string v4, "EGL_RENDERABLE_TYPE"

    aput-object v4, v3, v0

    const/16 v0, 0x20

    const-string v4, "EGL_CONFORMANT"

    aput-object v4, v3, v0

    const/16 v0, 0x21

    const-string v4, "EGL_COVERAGE_BUFFERS_NV"

    aput-object v4, v3, v0

    const/16 v0, 0x22

    const-string v4, "EGL_COVERAGE_SAMPLES_NV"

    aput-object v4, v3, v0

    new-array v4, v8, [I

    move v0, v1

    :goto_0
    #v0=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    array-length v5, v2

    #v5=(Integer);
    if-ge v0, v5, :cond_1

    aget v5, v2, v0

    aget-object v6, v3, v0

    #v6=(Null);
    invoke-interface {p0, p1, p2, v5, v4}, Ljavax/microedition/khronos/egl/EGL10;->eglGetConfigAttrib(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    move-result v5

    #v5=(Boolean);
    if-eqz v5, :cond_0

    const-string v5, "  %s: %d\n"

    #v5=(Reference);
    new-array v7, v9, [Ljava/lang/Object;

    #v7=(Reference);
    aput-object v6, v7, v1

    aget v6, v4, v1

    #v6=(Integer);
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    #v6=(Reference);
    aput-object v6, v7, v8

    invoke-static {v5, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/unity3d/player/q;->a(Ljava/lang/String;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    #v5=(Boolean);v6=(Null);v7=(Conflicted);
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    const-string v7, "printConfig ("

    #v7=(Reference);
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ")"

    #v6=(Reference);
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lcom/unity3d/player/q;->a(Ljava/lang/String;Ljavax/microedition/khronos/egl/EGL10;)V

    goto :goto_1

    :cond_1
    #v5=(Integer);v6=(Conflicted);v7=(Conflicted);
    return-void

    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
    nop

    :array_0
    .array-data 0x4
        0x20t 0x30t 0x0t 0x0t
        0x21t 0x30t 0x0t 0x0t
        0x22t 0x30t 0x0t 0x0t
        0x23t 0x30t 0x0t 0x0t
        0x24t 0x30t 0x0t 0x0t
        0x25t 0x30t 0x0t 0x0t
        0x26t 0x30t 0x0t 0x0t
        0x27t 0x30t 0x0t 0x0t
        0x28t 0x30t 0x0t 0x0t
        0x29t 0x30t 0x0t 0x0t
        0x2at 0x30t 0x0t 0x0t
        0x2bt 0x30t 0x0t 0x0t
        0x2ct 0x30t 0x0t 0x0t
        0x2dt 0x30t 0x0t 0x0t
        0x2et 0x30t 0x0t 0x0t
        0x2ft 0x30t 0x0t 0x0t
        0x30t 0x30t 0x0t 0x0t
        0x31t 0x30t 0x0t 0x0t
        0x32t 0x30t 0x0t 0x0t
        0x33t 0x30t 0x0t 0x0t
        0x34t 0x30t 0x0t 0x0t
        0x37t 0x30t 0x0t 0x0t
        0x36t 0x30t 0x0t 0x0t
        0x35t 0x30t 0x0t 0x0t
        0x39t 0x30t 0x0t 0x0t
        0x3at 0x30t 0x0t 0x0t
        0x3bt 0x30t 0x0t 0x0t
        0x3ct 0x30t 0x0t 0x0t
        0x3dt 0x30t 0x0t 0x0t
        0x3et 0x30t 0x0t 0x0t
        0x3ft 0x30t 0x0t 0x0t
        0x40t 0x30t 0x0t 0x0t
        0x42t 0x30t 0x0t 0x0t
        0xe0t 0x30t 0x0t 0x0t
        0xe1t 0x30t 0x0t 0x0t
    .end array-data
.end method


# virtual methods
.method public final chooseConfig(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;)Ljavax/microedition/khronos/egl/EGLConfig;
    .locals 12

    const/4 v4, 0x0

    #v4=(Null);
    invoke-static {}, Lcom/unity3d/player/q;->c()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    sget-object v2, Lcom/unity3d/player/q$a;->f:[I

    :goto_0
    #v2=(Reference);
    const/4 v0, 0x1

    #v0=(One);
    new-array v5, v0, [I

    #v5=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    move-object v0, p1

    #v0=(Reference);
    move-object v1, p2

    #v1=(Reference);
    invoke-interface/range {v0 .. v5}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    aget v10, v5, v4

    #v10=(Integer);
    if-gtz v10, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "No configs match configSpec"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v10=(Uninit);
    sget-object v2, Lcom/unity3d/player/q$a;->g:[I

    #v2=(Reference);
    goto :goto_0

    :cond_1
    #v0=(Reference);v1=(Reference);v3=(Null);v5=(Reference);v10=(Integer);
    new-array v9, v10, [Ljavax/microedition/khronos/egl/EGLConfig;

    #v9=(Reference);
    move-object v6, p1

    #v6=(Reference);
    move-object v7, p2

    #v7=(Reference);
    move-object v8, v2

    #v8=(Reference);
    move-object v11, v5

    #v11=(Reference);
    invoke-interface/range {v6 .. v11}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    invoke-direct {p0, p1, p2, v9}, Lcom/unity3d/player/q$a;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;[Ljavax/microedition/khronos/egl/EGLConfig;)Ljavax/microedition/khronos/egl/EGLConfig;

    move-result-object v0

    :goto_1
    #v1=(Conflicted);
    if-nez v0, :cond_3

    iget v1, p0, Lcom/unity3d/player/q$a;->e:I

    #v1=(Integer);
    if-lez v1, :cond_3

    iget v0, p0, Lcom/unity3d/player/q$a;->e:I

    #v0=(Integer);
    const/4 v1, 0x2

    #v1=(PosByte);
    if-ne v0, v1, :cond_2

    move v0, v4

    :goto_2
    iput v0, p0, Lcom/unity3d/player/q$a;->e:I

    invoke-direct {p0, p1, p2, v9}, Lcom/unity3d/player/q$a;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;[Ljavax/microedition/khronos/egl/EGLConfig;)Ljavax/microedition/khronos/egl/EGLConfig;

    move-result-object v0

    #v0=(Reference);
    goto :goto_1

    :cond_2
    #v0=(Integer);
    iget v0, p0, Lcom/unity3d/player/q$a;->e:I

    div-int/lit8 v0, v0, 0x2

    goto :goto_2

    :cond_3
    #v0=(Reference);v1=(Conflicted);
    if-nez v0, :cond_4

    iget v1, p0, Lcom/unity3d/player/q$a;->h:I

    #v1=(Integer);
    const/16 v2, 0x18

    #v2=(PosByte);
    if-ne v1, v2, :cond_4

    const/16 v0, 0x10

    #v0=(PosByte);
    iput v0, p0, Lcom/unity3d/player/q$a;->h:I

    invoke-direct {p0, p1, p2, v9}, Lcom/unity3d/player/q$a;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;[Ljavax/microedition/khronos/egl/EGLConfig;)Ljavax/microedition/khronos/egl/EGLConfig;

    move-result-object v0

    :cond_4
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);
    if-nez v0, :cond_5

    aget-object v0, v9, v4

    :cond_5
    return-object v0
.end method

*/}
