package com.unity3d.player.a; class c$a$a {/*

.class final Lcom/unity3d/player/a/c$a$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/unity3d/player/a/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unity3d/player/a/c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-object p1, p0, Lcom/unity3d/player/a/c$a$a;->a:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 5

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_0
    #v1=(Reference);
    new-instance v0, Ljava/lang/String;

    #v0=(UninitRef);
    sget-object v2, Lcom/unity3d/player/a/e;->a:[B

    #v2=(Reference);
    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([B)V

    #v0=(Reference);
    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/unity3d/player/a/c$a$a;->a:Landroid/os/IBinder;

    const/4 v2, 0x1

    #v2=(One);
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v4, 0x1

    #v4=(One);
    invoke-interface {v0, v2, v1, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    throw v0
.end method

.method public final asBinder()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/a/c$a$a;->a:Landroid/os/IBinder;

    #v0=(Reference);
    return-object v0
.end method

*/}