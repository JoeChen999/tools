package com.unity3d.player; class n {/*

.class final Lcom/unity3d/player/n;
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

    iput-object p1, p0, Lcom/unity3d/player/n;->a:Lcom/unity3d/player/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, Lcom/unity3d/player/n;->a:Lcom/unity3d/player/h;

    #v0=(Reference);
    invoke-static {v0}, Lcom/unity3d/player/h;->e(Lcom/unity3d/player/h;)Lcom/unity3d/player/UnityPlayer;

    move-result-object v0

    iget-object v1, p0, Lcom/unity3d/player/n;->a:Lcom/unity3d/player/h;

    #v1=(Reference);
    invoke-static {v1}, Lcom/unity3d/player/h;->v(Lcom/unity3d/player/h;)[F

    move-result-object v1

    const/4 v2, 0x0

    #v2=(Null);
    aget v1, v1, v2

    #v1=(Integer);
    iget-object v2, p0, Lcom/unity3d/player/n;->a:Lcom/unity3d/player/h;

    #v2=(Reference);
    invoke-static {v2}, Lcom/unity3d/player/h;->v(Lcom/unity3d/player/h;)[F

    move-result-object v2

    const/4 v3, 0x1

    #v3=(One);
    aget v2, v2, v3

    #v2=(Integer);
    iget-object v3, p0, Lcom/unity3d/player/n;->a:Lcom/unity3d/player/h;

    #v3=(Reference);
    invoke-static {v3}, Lcom/unity3d/player/h;->v(Lcom/unity3d/player/h;)[F

    move-result-object v3

    const/4 v4, 0x2

    #v4=(PosByte);
    aget v3, v3, v4

    #v3=(Integer);
    iget-object v4, p0, Lcom/unity3d/player/n;->a:Lcom/unity3d/player/h;

    #v4=(Reference);
    invoke-static {v4}, Lcom/unity3d/player/h;->v(Lcom/unity3d/player/h;)[F

    move-result-object v4

    const/4 v5, 0x3

    #v5=(PosByte);
    aget v4, v4, v5

    #v4=(Integer);
    iget-object v5, p0, Lcom/unity3d/player/n;->a:Lcom/unity3d/player/h;

    #v5=(Reference);
    invoke-static {v5}, Lcom/unity3d/player/h;->v(Lcom/unity3d/player/h;)[F

    move-result-object v5

    const/4 v6, 0x4

    #v6=(PosByte);
    aget v5, v5, v6

    #v5=(Integer);
    iget-object v6, p0, Lcom/unity3d/player/n;->a:Lcom/unity3d/player/h;

    #v6=(Reference);
    invoke-static {v6}, Lcom/unity3d/player/h;->w(Lcom/unity3d/player/h;)D

    move-result-wide v6

    #v6=(DoubleLo);v7=(DoubleHi);
    invoke-virtual/range {v0 .. v7}, Lcom/unity3d/player/UnityPlayer;->nativeCompass(FFFFFD)V

    return-void
.end method

*/}
