package com.unity3d.player; class UnityPlayer$4 {/*

.class final Lcom/unity3d/player/UnityPlayer$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/unity3d/player/UnityPlayer;->dispatchTouchEvent(IIIFFJI)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic a:I

.field private synthetic b:F

.field private synthetic c:F

.field private synthetic d:I

.field private synthetic e:J

.field private synthetic f:I

.field private synthetic g:Lcom/unity3d/player/UnityPlayer;


# direct methods
.method constructor <init>(Lcom/unity3d/player/UnityPlayer;IFFIJI)V
    .locals 0

    iput-object p1, p0, Lcom/unity3d/player/UnityPlayer$4;->g:Lcom/unity3d/player/UnityPlayer;

    iput p2, p0, Lcom/unity3d/player/UnityPlayer$4;->a:I

    iput p3, p0, Lcom/unity3d/player/UnityPlayer$4;->b:F

    iput p4, p0, Lcom/unity3d/player/UnityPlayer$4;->c:F

    iput p5, p0, Lcom/unity3d/player/UnityPlayer$4;->d:I

    iput-wide p6, p0, Lcom/unity3d/player/UnityPlayer$4;->e:J

    iput p8, p0, Lcom/unity3d/player/UnityPlayer$4;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$4;->g:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    iget v1, p0, Lcom/unity3d/player/UnityPlayer$4;->a:I

    #v1=(Integer);
    iget v2, p0, Lcom/unity3d/player/UnityPlayer$4;->b:F

    #v2=(Integer);
    iget v3, p0, Lcom/unity3d/player/UnityPlayer$4;->c:F

    #v3=(Integer);
    iget v4, p0, Lcom/unity3d/player/UnityPlayer$4;->d:I

    #v4=(Integer);
    iget-wide v5, p0, Lcom/unity3d/player/UnityPlayer$4;->e:J

    #v5=(LongLo);v6=(LongHi);
    iget v7, p0, Lcom/unity3d/player/UnityPlayer$4;->f:I

    #v7=(Integer);
    invoke-static/range {v0 .. v7}, Lcom/unity3d/player/UnityPlayer;->a(Lcom/unity3d/player/UnityPlayer;IFFIJI)V

    return-void
.end method

*/}
