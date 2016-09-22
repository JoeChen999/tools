package com.unity3d.player; class UnityPlayer$14 {/*

.class final Lcom/unity3d/player/UnityPlayer$14;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/unity3d/player/UnityPlayer;->setCompassEnabled(Z)V
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

    iput-object p1, p0, Lcom/unity3d/player/UnityPlayer$14;->a:Lcom/unity3d/player/UnityPlayer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    const/4 v1, 0x0

    #v1=(Null);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$14;->a:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    const-wide/high16 v6, -0x4010

    #v6=(LongLo);v7=(LongHi);
    move v2, v1

    #v2=(Null);
    move v3, v1

    #v3=(Null);
    move v4, v1

    #v4=(Null);
    move v5, v1

    #v5=(Null);
    invoke-virtual/range {v0 .. v7}, Lcom/unity3d/player/UnityPlayer;->nativeCompass(FFFFFD)V

    return-void
.end method

*/}
