package com.unity3d.player; class UnityPlayer$11 {/*

.class final Lcom/unity3d/player/UnityPlayer$11;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/unity3d/player/UnityPlayer;->onPreviewFrame([BLandroid/hardware/Camera;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic a:I

.field private synthetic b:[B

.field private synthetic c:I

.field private synthetic d:I

.field private synthetic e:Lcom/unity3d/player/UnityPlayer;


# direct methods
.method constructor <init>(Lcom/unity3d/player/UnityPlayer;I[BII)V
    .locals 0

    iput-object p1, p0, Lcom/unity3d/player/UnityPlayer$11;->e:Lcom/unity3d/player/UnityPlayer;

    iput p2, p0, Lcom/unity3d/player/UnityPlayer$11;->a:I

    iput-object p3, p0, Lcom/unity3d/player/UnityPlayer$11;->b:[B

    iput p4, p0, Lcom/unity3d/player/UnityPlayer$11;->c:I

    iput p5, p0, Lcom/unity3d/player/UnityPlayer$11;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$11;->e:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    iget v1, p0, Lcom/unity3d/player/UnityPlayer$11;->a:I

    #v1=(Integer);
    iget-object v2, p0, Lcom/unity3d/player/UnityPlayer$11;->b:[B

    #v2=(Reference);
    iget v3, p0, Lcom/unity3d/player/UnityPlayer$11;->c:I

    #v3=(Integer);
    iget v4, p0, Lcom/unity3d/player/UnityPlayer$11;->d:I

    #v4=(Integer);
    invoke-static {v0, v1, v2, v3, v4}, Lcom/unity3d/player/UnityPlayer;->a(Lcom/unity3d/player/UnityPlayer;I[BII)V

    return-void
.end method

*/}
