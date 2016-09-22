package com.unity3d.player; class p$1 {/*

.class final Lcom/unity3d/player/p$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/unity3d/player/p;-><init>(Landroid/content/Context;Lcom/unity3d/player/UnityPlayer;Ljava/lang/String;IZZZLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic a:Lcom/unity3d/player/p;


# direct methods
.method constructor <init>(Lcom/unity3d/player/p;)V
    .locals 0

    iput-object p1, p0, Lcom/unity3d/player/p$1;->a:Lcom/unity3d/player/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 2

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/p$1;->a:Lcom/unity3d/player/p;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/unity3d/player/p;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x5

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void
.end method

*/}
