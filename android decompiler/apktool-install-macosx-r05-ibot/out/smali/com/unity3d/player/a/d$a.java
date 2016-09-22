package com.unity3d.player.a; class d$a {/*

.class public abstract Lcom/unity3d/player/a/d$a;
.super Landroid/os/Binder;

# interfaces
.implements Lcom/unity3d/player/a/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unity3d/player/a/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/unity3d/player/a/d$a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    #p0=(Reference);
    new-instance v0, Ljava/lang/String;

    #v0=(UninitRef);
    sget-object v1, Lcom/unity3d/player/a/e;->b:[B

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    #v0=(Reference);
    invoke-virtual {p0, p0, v0}, Lcom/unity3d/player/a/d$a;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Landroid/os/IBinder;)Lcom/unity3d/player/a/d;
    .locals 2

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Reference);v1=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Uninit);v1=(Uninit);
    new-instance v0, Ljava/lang/String;

    #v0=(UninitRef);
    sget-object v1, Lcom/unity3d/player/a/e;->b:[B

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    #v0=(Reference);
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/unity3d/player/a/d;

    #v1=(Boolean);
    if-eqz v1, :cond_1

    check-cast v0, Lcom/unity3d/player/a/d;

    goto :goto_0

    :cond_1
    #v1=(Conflicted);
    new-instance v0, Lcom/unity3d/player/a/d$a$a;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/unity3d/player/a/d$a$a;-><init>(Landroid/os/IBinder;)V

    #v0=(Reference);
    goto :goto_0
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 5

    const/4 v0, 0x1

    #v0=(One);
    sparse-switch p1, :sswitch_data_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return v0

    :sswitch_0
    #v0=(One);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    new-instance v1, Ljava/lang/String;

    #v1=(UninitRef);
    sget-object v2, Lcom/unity3d/player/a/e;->b:[B

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    #v1=(Reference);
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    :sswitch_1
    #v1=(Uninit);v2=(Uninit);
    new-instance v1, Ljava/lang/String;

    #v1=(UninitRef);
    sget-object v2, Lcom/unity3d/player/a/e;->b:[B

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    #v1=(Reference);
    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v1

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v4

    #v4=(Reference);
    invoke-static {v4}, Lcom/unity3d/player/a/c$a;->a(Landroid/os/IBinder;)Lcom/unity3d/player/a/c;

    move-result-object v4

    invoke-virtual {p0, v1, v2, v3, v4}, Lcom/unity3d/player/a/d$a;->a(JLjava/lang/String;Lcom/unity3d/player/a/c;)V

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method

*/}
