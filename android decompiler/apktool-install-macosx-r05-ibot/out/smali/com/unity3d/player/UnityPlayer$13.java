package com.unity3d.player; class UnityPlayer$13 {/*

.class final Lcom/unity3d/player/UnityPlayer$13;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/unity3d/player/UnityPlayer;->setGyroEnabled(Z)V
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

    iput-object p1, p0, Lcom/unity3d/player/UnityPlayer$13;->a:Lcom/unity3d/player/UnityPlayer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    const/4 v1, 0x0

    #v1=(Null);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$13;->a:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    const-wide/16 v4, -0x1

    #v4=(LongLo);v5=(LongHi);
    move v2, v1

    #v2=(Null);
    move v3, v1

    #v3=(Null);
    invoke-virtual/range {v0 .. v5}, Lcom/unity3d/player/UnityPlayer;->nativeGyro(FFFJ)V

    return-void
.end method

*/}
