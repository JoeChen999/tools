package com.unity3d.player; class UnityPlayer$17 {/*

.class final Lcom/unity3d/player/UnityPlayer$17;
.super Lcom/unity3d/player/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/unity3d/player/UnityPlayer;->a(IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic a:Landroid/view/View;

.field private synthetic b:Lcom/unity3d/player/UnityPlayer;


# direct methods
.method constructor <init>(Lcom/unity3d/player/UnityPlayer;Landroid/content/Context;IZZLandroid/view/View;)V
    .locals 1

    iput-object p1, p0, Lcom/unity3d/player/UnityPlayer$17;->b:Lcom/unity3d/player/UnityPlayer;

    iput-object p6, p0, Lcom/unity3d/player/UnityPlayer$17;->a:Landroid/view/View;

    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p2, p3, p4, v0}, Lcom/unity3d/player/q;-><init>(Landroid/content/Context;IZZ)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method protected final init(IZIIII)V
    .locals 7

    const/16 v1, 0x10

    #v1=(PosByte);
    const/4 v5, 0x0

    #v5=(Null);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$17;->b:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    invoke-static {v0}, Lcom/unity3d/player/UnityPlayer;->b(Lcom/unity3d/player/UnityPlayer;)I

    move-result v0

    #v0=(Integer);
    const/4 v2, -0x1

    #v2=(Byte);
    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$17;->b:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    iget-object v2, p0, Lcom/unity3d/player/UnityPlayer$17;->b:Lcom/unity3d/player/UnityPlayer;

    #v2=(Reference);
    invoke-static {v2}, Lcom/unity3d/player/UnityPlayer;->c(Lcom/unity3d/player/UnityPlayer;)Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "default_aa"

    #v3=(Reference);
    invoke-virtual {v2, v3, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    #v2=(Integer);
    invoke-static {v0, v2}, Lcom/unity3d/player/UnityPlayer;->a(Lcom/unity3d/player/UnityPlayer;I)I

    :cond_0
    #v0=(Conflicted);v3=(Conflicted);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$17;->b:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    invoke-static {v0}, Lcom/unity3d/player/UnityPlayer;->d(Lcom/unity3d/player/UnityPlayer;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    iget-object v2, p0, Lcom/unity3d/player/UnityPlayer$17;->b:Lcom/unity3d/player/UnityPlayer;

    #v2=(Reference);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$17;->b:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/unity3d/player/UnityPlayer;->canUse32bitDisplayBuffer()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$17;->b:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    invoke-static {v0}, Lcom/unity3d/player/UnityPlayer;->c(Lcom/unity3d/player/UnityPlayer;)Landroid/os/Bundle;

    move-result-object v0

    const-string v3, "32bit_display"

    #v3=(Reference);
    invoke-virtual {v0, v3, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    :goto_0
    #v0=(Boolean);v3=(Conflicted);
    invoke-static {v2, v0}, Lcom/unity3d/player/UnityPlayer;->a(Lcom/unity3d/player/UnityPlayer;Z)Z

    :cond_1
    #v2=(Conflicted);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$17;->b:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    invoke-static {v0}, Lcom/unity3d/player/UnityPlayer;->d(Lcom/unity3d/player/UnityPlayer;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_3

    const/16 v3, 0x20

    :goto_1
    #v3=(PosByte);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$17;->b:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    invoke-static {v0}, Lcom/unity3d/player/UnityPlayer;->c(Lcom/unity3d/player/UnityPlayer;)Landroid/os/Bundle;

    move-result-object v0

    const-string v2, "24bit_depth"

    #v2=(Reference);
    invoke-virtual {v0, v2, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_4

    const/16 v4, 0x18

    :goto_2
    #v4=(PosByte);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$17;->b:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    invoke-static {v0}, Lcom/unity3d/player/UnityPlayer;->b(Lcom/unity3d/player/UnityPlayer;)I

    move-result v6

    #v6=(Integer);
    move-object v0, p0

    move v1, p1

    #v1=(Integer);
    move v2, p2

    #v2=(Boolean);
    invoke-super/range {v0 .. v6}, Lcom/unity3d/player/q;->init(IZIIII)V

    return-void

    :cond_2
    #v0=(Boolean);v1=(PosByte);v2=(Reference);v3=(Conflicted);v4=(Uninit);v6=(Uninit);
    move v0, v5

    #v0=(Null);
    goto :goto_0

    :cond_3
    #v0=(Boolean);v2=(Conflicted);
    move v3, v1

    #v3=(PosByte);
    goto :goto_1

    :cond_4
    #v2=(Reference);
    move v4, v1

    #v4=(PosByte);
    goto :goto_2
.end method

.method public final onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$17;->a:Landroid/view/View;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public final onKeyPreIme(ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$17;->a:Landroid/view/View;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->onKeyPreIme(ILandroid/view/KeyEvent;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    invoke-super {p0, p1, p2}, Lcom/unity3d/player/q;->onKeyPreIme(ILandroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

*/}
