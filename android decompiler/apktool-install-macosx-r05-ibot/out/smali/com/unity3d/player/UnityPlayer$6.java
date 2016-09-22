package com.unity3d.player; class UnityPlayer$6 {/*

.class final Lcom/unity3d/player/UnityPlayer$6;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/unity3d/player/UnityPlayer;->b(Landroid/view/MotionEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic a:Landroid/view/MotionEvent;

.field private synthetic b:Lcom/unity3d/player/UnityPlayer;


# direct methods
.method constructor <init>(Lcom/unity3d/player/UnityPlayer;Landroid/view/MotionEvent;)V
    .locals 0

    iput-object p1, p0, Lcom/unity3d/player/UnityPlayer$6;->b:Lcom/unity3d/player/UnityPlayer;

    iput-object p2, p0, Lcom/unity3d/player/UnityPlayer$6;->a:Landroid/view/MotionEvent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    const/4 v2, 0x1

    #v2=(One);
    const/4 v4, 0x0

    #v4=(Null);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$6;->a:Landroid/view/MotionEvent;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v5

    #v5=(Integer);
    move v3, v4

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    if-ge v3, v5, :cond_1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$6;->a:Landroid/view/MotionEvent;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v0

    #v0=(Integer);
    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer$6;->b:Lcom/unity3d/player/UnityPlayer;

    #v1=(Reference);
    invoke-static {v1, v0}, Lcom/unity3d/player/UnityPlayer;->b(Lcom/unity3d/player/UnityPlayer;I)[Ljava/lang/Integer;

    move-result-object v6

    #v6=(Reference);
    if-eqz v6, :cond_0

    aget-object v0, v6, v4

    #v0=(Null);
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    #v0=(Integer);
    add-int/lit8 v7, v0, 0x1

    #v7=(Integer);
    move v1, v2

    :goto_1
    #v1=(Integer);
    array-length v0, v6

    if-ge v1, v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$6;->b:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    invoke-static {v0}, Lcom/unity3d/player/UnityPlayer;->o(Lcom/unity3d/player/UnityPlayer;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v8, p0, Lcom/unity3d/player/UnityPlayer$6;->a:Landroid/view/MotionEvent;

    #v8=(Reference);
    const/4 v9, 0x2

    #v9=(PosByte);
    new-array v9, v9, [Ljava/lang/Object;

    #v9=(Reference);
    const/4 v10, 0x0

    #v10=(Null);
    aget-object v11, v6, v1

    #v11=(Null);
    aput-object v11, v9, v10

    const/4 v10, 0x1

    #v10=(One);
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    #v11=(Reference);
    aput-object v11, v9, v10

    invoke-virtual {v0, v8, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    #v0=(Float);
    iget-object v8, p0, Lcom/unity3d/player/UnityPlayer$6;->b:Lcom/unity3d/player/UnityPlayer;

    add-int/lit8 v9, v1, -0x1

    #v9=(Integer);
    invoke-static {v8, v7, v9, v0}, Lcom/unity3d/player/UnityPlayer;->a(Lcom/unity3d/player/UnityPlayer;IIF)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    #v0=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_1

    :catch_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_2

    :cond_0
    #v0=(Integer);v1=(Conflicted);v7=(Conflicted);
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :cond_1
    #v0=(Conflicted);v6=(Conflicted);
    return-void
.end method

*/}
