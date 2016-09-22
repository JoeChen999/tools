package com.unity3d.player; class p$3 {/*

.class final Lcom/unity3d/player/p$3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/unity3d/player/p;->createSoftInputView()Landroid/view/View;
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

    iput-object p1, p0, Lcom/unity3d/player/p$3;->a:Lcom/unity3d/player/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 2

    const/4 v0, 0x6

    #v0=(PosByte);
    if-ne p2, v0, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/p$3;->a:Lcom/unity3d/player/p;

    #v0=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/p$3;->a:Lcom/unity3d/player/p;

    #v1=(Reference);
    invoke-static {v1}, Lcom/unity3d/player/p;->a(Lcom/unity3d/player/p;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/unity3d/player/p;->a(Lcom/unity3d/player/p;Ljava/lang/String;)V

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

*/}
