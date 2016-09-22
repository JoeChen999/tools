package com.unity3d.player.a; class k {/*

.class final Lcom/unity3d/player/a/k;
.super Ljava/lang/Object;


# instance fields
.field public a:I

.field public b:I

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:J

.field public g:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, "|"

    #v0=(Reference);
    const/4 v1, 0x6

    #v1=(PosByte);
    new-array v1, v1, [Ljava/lang/Object;

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    iget v3, p0, Lcom/unity3d/player/a/k;->a:I

    #v3=(Integer);
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v1, v2

    const/4 v2, 0x1

    #v2=(One);
    iget v3, p0, Lcom/unity3d/player/a/k;->b:I

    #v3=(Integer);
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v1, v2

    const/4 v2, 0x2

    #v2=(PosByte);
    iget-object v3, p0, Lcom/unity3d/player/a/k;->c:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/unity3d/player/a/k;->d:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/unity3d/player/a/k;->e:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x5

    iget-wide v3, p0, Lcom/unity3d/player/a/k;->f:J

    #v3=(LongLo);v4=(LongHi);
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v1, v2

    invoke-static {v0, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

*/}
