package com.unity3d.player; class r {/*

.class final Lcom/unity3d/player/r;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unity3d/player/UnityPlayer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic a:Lcom/unity3d/player/UnityPlayer;


# direct methods
.method constructor <init>(Lcom/unity3d/player/UnityPlayer;)V
    .locals 0

    iput-object p1, p0, Lcom/unity3d/player/r;->a:Lcom/unity3d/player/UnityPlayer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/unity3d/player/r;->a:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    invoke-static {v0}, Lcom/unity3d/player/UnityPlayer;->i(Lcom/unity3d/player/UnityPlayer;)Lcom/unity3d/player/UnityGL;

    move-result-object v0

    invoke-interface {v0}, Lcom/unity3d/player/UnityGL;->onPause()V

    iget-object v0, p0, Lcom/unity3d/player/r;->a:Lcom/unity3d/player/UnityPlayer;

    invoke-static {v0}, Lcom/unity3d/player/UnityPlayer;->i(Lcom/unity3d/player/UnityPlayer;)Lcom/unity3d/player/UnityGL;

    move-result-object v0

    check-cast v0, Lcom/unity3d/player/q;

    invoke-virtual {v0}, Lcom/unity3d/player/q;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    #v1=(Reference);
    iget-object v0, p0, Lcom/unity3d/player/r;->a:Lcom/unity3d/player/UnityPlayer;

    invoke-static {v0}, Lcom/unity3d/player/UnityPlayer;->d(Lcom/unity3d/player/UnityPlayer;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const/4 v0, -0x3

    :goto_0
    #v0=(Byte);
    invoke-interface {v1, v0}, Landroid/view/SurfaceHolder;->setFormat(I)V

    iget-object v0, p0, Lcom/unity3d/player/r;->a:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    invoke-static {v0}, Lcom/unity3d/player/UnityPlayer;->i(Lcom/unity3d/player/UnityPlayer;)Lcom/unity3d/player/UnityGL;

    move-result-object v0

    invoke-interface {v0}, Lcom/unity3d/player/UnityGL;->onResume()V

    iget-object v1, p0, Lcom/unity3d/player/r;->a:Lcom/unity3d/player/UnityPlayer;

    iget-object v0, p0, Lcom/unity3d/player/r;->a:Lcom/unity3d/player/UnityPlayer;

    invoke-static {v0}, Lcom/unity3d/player/UnityPlayer;->i(Lcom/unity3d/player/UnityPlayer;)Lcom/unity3d/player/UnityGL;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v1, v0}, Lcom/unity3d/player/UnityPlayer;->removeView(Landroid/view/View;)V

    iget-object v1, p0, Lcom/unity3d/player/r;->a:Lcom/unity3d/player/UnityPlayer;

    iget-object v0, p0, Lcom/unity3d/player/r;->a:Lcom/unity3d/player/UnityPlayer;

    invoke-static {v0}, Lcom/unity3d/player/UnityPlayer;->i(Lcom/unity3d/player/UnityPlayer;)Lcom/unity3d/player/UnityGL;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v1, v0}, Lcom/unity3d/player/UnityPlayer;->addView(Landroid/view/View;)V

    return-void

    :cond_0
    #v0=(Boolean);
    const/4 v0, -0x1

    #v0=(Byte);
    goto :goto_0
.end method

*/}
