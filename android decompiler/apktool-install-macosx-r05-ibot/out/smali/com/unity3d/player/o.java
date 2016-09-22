package com.unity3d.player; class o {/*

.class final Lcom/unity3d/player/o;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unity3d/player/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic a:Lcom/unity3d/player/h;


# direct methods
.method constructor <init>(Lcom/unity3d/player/h;)V
    .locals 0

    iput-object p1, p0, Lcom/unity3d/player/o;->a:Lcom/unity3d/player/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/unity3d/player/o;->a:Lcom/unity3d/player/h;

    #v0=(Reference);
    invoke-static {v0}, Lcom/unity3d/player/h;->e(Lcom/unity3d/player/h;)Lcom/unity3d/player/UnityPlayer;

    move-result-object v0

    iget-object v1, p0, Lcom/unity3d/player/o;->a:Lcom/unity3d/player/h;

    #v1=(Reference);
    invoke-static {v1}, Lcom/unity3d/player/h;->x(Lcom/unity3d/player/h;)I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/unity3d/player/UnityPlayer;->nativeDeviceOrientation(I)V

    return-void
.end method

*/}
