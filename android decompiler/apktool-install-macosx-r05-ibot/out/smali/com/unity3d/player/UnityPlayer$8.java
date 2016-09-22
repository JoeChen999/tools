package com.unity3d.player; class UnityPlayer$8 {/*

.class final Lcom/unity3d/player/UnityPlayer$8;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/unity3d/player/UnityPlayer;->showSoftInput(Ljava/lang/String;IZZZZLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic a:Lcom/unity3d/player/UnityPlayer;

.field private synthetic b:Ljava/lang/String;

.field private synthetic c:I

.field private synthetic d:Z

.field private synthetic e:Z

.field private synthetic f:Z

.field private synthetic g:Z

.field private synthetic h:Ljava/lang/String;

.field private synthetic i:Lcom/unity3d/player/UnityPlayer;


# direct methods
.method constructor <init>(Lcom/unity3d/player/UnityPlayer;Lcom/unity3d/player/UnityPlayer;Ljava/lang/String;IZZZZLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/unity3d/player/UnityPlayer$8;->i:Lcom/unity3d/player/UnityPlayer;

    iput-object p2, p0, Lcom/unity3d/player/UnityPlayer$8;->a:Lcom/unity3d/player/UnityPlayer;

    iput-object p3, p0, Lcom/unity3d/player/UnityPlayer$8;->b:Ljava/lang/String;

    iput p4, p0, Lcom/unity3d/player/UnityPlayer$8;->c:I

    iput-boolean p5, p0, Lcom/unity3d/player/UnityPlayer$8;->d:Z

    iput-boolean p6, p0, Lcom/unity3d/player/UnityPlayer$8;->e:Z

    iput-boolean p7, p0, Lcom/unity3d/player/UnityPlayer$8;->f:Z

    iput-boolean p8, p0, Lcom/unity3d/player/UnityPlayer$8;->g:Z

    iput-object p9, p0, Lcom/unity3d/player/UnityPlayer$8;->h:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    const/4 v2, 0x1

    #v2=(One);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$8;->i:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    invoke-static {v0}, Lcom/unity3d/player/UnityPlayer;->p(Lcom/unity3d/player/UnityPlayer;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$8;->a:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    invoke-static {v0}, Lcom/unity3d/player/UnityPlayer;->m(Lcom/unity3d/player/UnityPlayer;)Landroid/content/ContextWrapper;

    move-result-object v0

    const-string v1, "input_method"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/ContextWrapper;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$8;->i:Lcom/unity3d/player/UnityPlayer;

    invoke-static {v0, v2}, Lcom/unity3d/player/UnityPlayer;->e(Lcom/unity3d/player/UnityPlayer;Z)Z

    :goto_0
    #v1=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    return-void

    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(One);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    iget-object v9, p0, Lcom/unity3d/player/UnityPlayer$8;->i:Lcom/unity3d/player/UnityPlayer;

    #v9=(Reference);
    new-instance v0, Lcom/unity3d/player/p;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer$8;->i:Lcom/unity3d/player/UnityPlayer;

    #v1=(Reference);
    invoke-static {v1}, Lcom/unity3d/player/UnityPlayer;->m(Lcom/unity3d/player/UnityPlayer;)Landroid/content/ContextWrapper;

    move-result-object v1

    iget-object v2, p0, Lcom/unity3d/player/UnityPlayer$8;->a:Lcom/unity3d/player/UnityPlayer;

    #v2=(Reference);
    iget-object v3, p0, Lcom/unity3d/player/UnityPlayer$8;->b:Ljava/lang/String;

    #v3=(Reference);
    iget v4, p0, Lcom/unity3d/player/UnityPlayer$8;->c:I

    #v4=(Integer);
    iget-boolean v5, p0, Lcom/unity3d/player/UnityPlayer$8;->d:Z

    #v5=(Boolean);
    iget-boolean v6, p0, Lcom/unity3d/player/UnityPlayer$8;->e:Z

    #v6=(Boolean);
    iget-boolean v7, p0, Lcom/unity3d/player/UnityPlayer$8;->f:Z

    #v7=(Boolean);
    iget-boolean v8, p0, Lcom/unity3d/player/UnityPlayer$8;->g:Z

    #v8=(Boolean);
    iget-object v8, p0, Lcom/unity3d/player/UnityPlayer$8;->h:Ljava/lang/String;

    #v8=(Reference);
    invoke-direct/range {v0 .. v8}, Lcom/unity3d/player/p;-><init>(Landroid/content/Context;Lcom/unity3d/player/UnityPlayer;Ljava/lang/String;IZZZLjava/lang/String;)V

    #v0=(Reference);
    iput-object v0, v9, Lcom/unity3d/player/UnityPlayer;->a:Lcom/unity3d/player/p;

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer$8;->i:Lcom/unity3d/player/UnityPlayer;

    iget-object v0, v0, Lcom/unity3d/player/UnityPlayer;->a:Lcom/unity3d/player/p;

    invoke-virtual {v0}, Lcom/unity3d/player/p;->show()V

    goto :goto_0
.end method

*/}
