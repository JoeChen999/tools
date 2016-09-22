package com.unity3d.player; class UnityPlayer$23 {/*

.class final Lcom/unity3d/player/UnityPlayer$23;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/unity3d/player/UnityPlayer;->windowFocusChanged(Z)V
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

    iput-object p1, p0, Lcom/unity3d/player/UnityPlayer$23;->a:Lcom/unity3d/player/UnityPlayer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$23;->a:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer$23;->a:Lcom/unity3d/player/UnityPlayer;

    #v1=(Reference);
    invoke-static {v1}, Lcom/unity3d/player/UnityPlayer;->h(Lcom/unity3d/player/UnityPlayer;)Z

    move-result v1

    #v1=(Boolean);
    invoke-static {v0, v1}, Lcom/unity3d/player/UnityPlayer;->b(Lcom/unity3d/player/UnityPlayer;Z)V

    return-void
.end method

*/}
