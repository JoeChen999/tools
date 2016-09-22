package com.unity3d.player; class UnityPlayer$10 {/*

.class final Lcom/unity3d/player/UnityPlayer$10;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/unity3d/player/UnityPlayer;->reportSoftInputStr(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:I

.field private synthetic c:Lcom/unity3d/player/UnityPlayer;


# direct methods
.method constructor <init>(Lcom/unity3d/player/UnityPlayer;Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lcom/unity3d/player/UnityPlayer$10;->c:Lcom/unity3d/player/UnityPlayer;

    iput-object p2, p0, Lcom/unity3d/player/UnityPlayer$10;->a:Ljava/lang/String;

    iput p3, p0, Lcom/unity3d/player/UnityPlayer$10;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$10;->a:Ljava/lang/String;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$10;->c:Lcom/unity3d/player/UnityPlayer;

    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer$10;->a:Ljava/lang/String;

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/unity3d/player/UnityPlayer;->a(Lcom/unity3d/player/UnityPlayer;Ljava/lang/String;)V

    :cond_0
    #v1=(Conflicted);
    iget v0, p0, Lcom/unity3d/player/UnityPlayer$10;->b:I

    #v0=(Integer);
    const/4 v1, 0x1

    #v1=(One);
    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$10;->c:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    invoke-static {v0}, Lcom/unity3d/player/UnityPlayer;->r(Lcom/unity3d/player/UnityPlayer;)V

    :cond_1
    #v0=(Conflicted);
    return-void
.end method

*/}
