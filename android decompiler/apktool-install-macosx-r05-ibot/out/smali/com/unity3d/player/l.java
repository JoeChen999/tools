package com.unity3d.player; class l {/*

.class final Lcom/unity3d/player/l;
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

    iput-object p1, p0, Lcom/unity3d/player/l;->a:Lcom/unity3d/player/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/unity3d/player/l;->a:Lcom/unity3d/player/h;

    #v0=(Reference);
    invoke-static {v0}, Lcom/unity3d/player/h;->e(Lcom/unity3d/player/h;)Lcom/unity3d/player/UnityPlayer;

    move-result-object v0

    iget-object v1, p0, Lcom/unity3d/player/l;->a:Lcom/unity3d/player/h;

    #v1=(Reference);
    invoke-static {v1}, Lcom/unity3d/player/h;->n(Lcom/unity3d/player/h;)F

    move-result v1

    #v1=(Float);
    iget-object v2, p0, Lcom/unity3d/player/l;->a:Lcom/unity3d/player/h;

    #v2=(Reference);
    invoke-static {v2}, Lcom/unity3d/player/h;->o(Lcom/unity3d/player/h;)F

    move-result v2

    #v2=(Float);
    iget-object v3, p0, Lcom/unity3d/player/l;->a:Lcom/unity3d/player/h;

    #v3=(Reference);
    invoke-static {v3}, Lcom/unity3d/player/h;->p(Lcom/unity3d/player/h;)F

    move-result v3

    #v3=(Float);
    iget-object v4, p0, Lcom/unity3d/player/l;->a:Lcom/unity3d/player/h;

    #v4=(Reference);
    invoke-static {v4}, Lcom/unity3d/player/h;->q(Lcom/unity3d/player/h;)J

    move-result-wide v4

    #v4=(LongLo);v5=(LongHi);
    invoke-virtual/range {v0 .. v5}, Lcom/unity3d/player/UnityPlayer;->nativeLinearAcc(FFFJ)V

    return-void
.end method

*/}
