package com.unity3d.player; class f {/*

.class final Lcom/unity3d/player/f;
.super Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method protected static Log(ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x6

    #v0=(PosByte);
    if-ne p0, v0, :cond_0

    const-string v0, "Unity"

    #v0=(Reference);
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    #v0=(Conflicted);
    const/4 v0, 0x5

    #v0=(PosByte);
    if-ne p0, v0, :cond_1

    const-string v0, "Unity"

    #v0=(Reference);
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    #v0=(Conflicted);
    return-void
.end method

*/}
