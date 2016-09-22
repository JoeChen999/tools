package com.unity3d.player; class s {/*

.class final Lcom/unity3d/player/s;
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

    iput-object p1, p0, Lcom/unity3d/player/s;->a:Lcom/unity3d/player/UnityPlayer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    const/4 v6, -0x2

    #v6=(Byte);
    iget-object v0, p0, Lcom/unity3d/player/s;->a:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    invoke-static {v0}, Lcom/unity3d/player/UnityPlayer;->k(Lcom/unity3d/player/UnityPlayer;)I

    move-result v0

    #v0=(Integer);
    if-ltz v0, :cond_1

    iget-object v1, p0, Lcom/unity3d/player/s;->a:Lcom/unity3d/player/UnityPlayer;

    #v1=(Reference);
    invoke-static {v1}, Lcom/unity3d/player/UnityPlayer;->l(Lcom/unity3d/player/UnityPlayer;)Landroid/widget/ProgressBar;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x4

    #v1=(PosByte);
    new-array v1, v1, [I

    #v1=(Reference);
    fill-array-data v1, :array_0

    iget-object v2, p0, Lcom/unity3d/player/s;->a:Lcom/unity3d/player/UnityPlayer;

    #v2=(Reference);
    new-instance v3, Landroid/widget/ProgressBar;

    #v3=(UninitRef);
    iget-object v4, p0, Lcom/unity3d/player/s;->a:Lcom/unity3d/player/UnityPlayer;

    #v4=(Reference);
    invoke-static {v4}, Lcom/unity3d/player/UnityPlayer;->m(Lcom/unity3d/player/UnityPlayer;)Landroid/content/ContextWrapper;

    move-result-object v4

    const/4 v5, 0x0

    #v5=(Null);
    aget v0, v1, v0

    invoke-direct {v3, v4, v5, v0}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    #v3=(Reference);
    invoke-static {v2, v3}, Lcom/unity3d/player/UnityPlayer;->a(Lcom/unity3d/player/UnityPlayer;Landroid/widget/ProgressBar;)Landroid/widget/ProgressBar;

    iget-object v0, p0, Lcom/unity3d/player/s;->a:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    invoke-static {v0}, Lcom/unity3d/player/UnityPlayer;->l(Lcom/unity3d/player/UnityPlayer;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    iget-object v0, p0, Lcom/unity3d/player/s;->a:Lcom/unity3d/player/UnityPlayer;

    invoke-static {v0}, Lcom/unity3d/player/UnityPlayer;->l(Lcom/unity3d/player/UnityPlayer;)Landroid/widget/ProgressBar;

    move-result-object v0

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    #v1=(UninitRef);
    const/16 v2, 0x33

    #v2=(PosByte);
    invoke-direct {v1, v6, v6, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/unity3d/player/s;->a:Lcom/unity3d/player/UnityPlayer;

    iget-object v1, p0, Lcom/unity3d/player/s;->a:Lcom/unity3d/player/UnityPlayer;

    invoke-static {v1}, Lcom/unity3d/player/UnityPlayer;->l(Lcom/unity3d/player/UnityPlayer;)Landroid/widget/ProgressBar;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/unity3d/player/UnityPlayer;->addView(Landroid/view/View;)V

    :cond_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    iget-object v0, p0, Lcom/unity3d/player/s;->a:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    invoke-static {v0}, Lcom/unity3d/player/UnityPlayer;->l(Lcom/unity3d/player/UnityPlayer;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    iget-object v0, p0, Lcom/unity3d/player/s;->a:Lcom/unity3d/player/UnityPlayer;

    iget-object v1, p0, Lcom/unity3d/player/s;->a:Lcom/unity3d/player/UnityPlayer;

    #v1=(Reference);
    invoke-static {v1}, Lcom/unity3d/player/UnityPlayer;->l(Lcom/unity3d/player/UnityPlayer;)Landroid/widget/ProgressBar;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/unity3d/player/UnityPlayer;->bringChildToFront(Landroid/view/View;)V

    :cond_1
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);p0=(Unknown);
    nop

    :array_0
    .array-data 0x4
        0x7at 0x0t 0x1t 0x1t
        0x89t 0x2t 0x1t 0x1t
        0x79t 0x0t 0x1t 0x1t
        0x88t 0x2t 0x1t 0x1t
    .end array-data
.end method

*/}
