package com.unity3d.player; class UnityPlayer$3 {/*

.class final Lcom/unity3d/player/UnityPlayer$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/unity3d/player/UnityPlayer;->a(ILandroid/view/KeyEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic a:I

.field private synthetic b:I

.field private synthetic c:Z

.field private synthetic d:I

.field private synthetic e:I

.field private synthetic f:Lcom/unity3d/player/UnityPlayer;


# direct methods
.method constructor <init>(Lcom/unity3d/player/UnityPlayer;IIZII)V
    .locals 0

    iput-object p1, p0, Lcom/unity3d/player/UnityPlayer$3;->f:Lcom/unity3d/player/UnityPlayer;

    iput p2, p0, Lcom/unity3d/player/UnityPlayer$3;->a:I

    iput p3, p0, Lcom/unity3d/player/UnityPlayer$3;->b:I

    iput-boolean p4, p0, Lcom/unity3d/player/UnityPlayer$3;->c:Z

    iput p5, p0, Lcom/unity3d/player/UnityPlayer$3;->d:I

    iput p6, p0, Lcom/unity3d/player/UnityPlayer$3;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$3;->f:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    iget v1, p0, Lcom/unity3d/player/UnityPlayer$3;->a:I

    #v1=(Integer);
    iget v2, p0, Lcom/unity3d/player/UnityPlayer$3;->b:I

    #v2=(Integer);
    iget-boolean v3, p0, Lcom/unity3d/player/UnityPlayer$3;->c:Z

    #v3=(Boolean);
    iget v4, p0, Lcom/unity3d/player/UnityPlayer$3;->d:I

    #v4=(Integer);
    iget v5, p0, Lcom/unity3d/player/UnityPlayer$3;->e:I

    #v5=(Integer);
    invoke-static/range {v0 .. v5}, Lcom/unity3d/player/UnityPlayer;->a(Lcom/unity3d/player/UnityPlayer;IIZII)V

    return-void
.end method

*/}
