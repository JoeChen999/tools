package com.android.vending.billing; class IMarketBillingService$Stub$Proxy {/*

.class Lcom/android/vending/billing/IMarketBillingService$Stub$Proxy;
.super Ljava/lang/Object;
.source "IMarketBillingService.java"

# interfaces
.implements Lcom/android/vending/billing/IMarketBillingService;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/vending/billing/IMarketBillingService$Stub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Proxy"
.end annotation


# instance fields
.field private mRemote:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0
    .parameter "remote"

    .prologue
    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    #p0=(Reference);
    iput-object p1, p0, Lcom/android/vending/billing/IMarketBillingService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    .line 75
    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/android/vending/billing/IMarketBillingService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    #v0=(Reference);
    return-object v0
.end method

.method public getInterfaceDescriptor()Ljava/lang/String;
    .locals 1

    .prologue
    .line 82
    const-string v0, "com.android.vending.billing.IMarketBillingService"

    #v0=(Reference);
    return-object v0
.end method

.method public sendBillingRequest(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 6
    .parameter "bundle"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 87
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 88
    .local v0, _data:Landroid/os/Parcel;
    #v0=(Reference);
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    .line 91
    .local v1, _reply:Landroid/os/Parcel;
    :try_start_0
    #v1=(Reference);
    const-string v3, "com.android.vending.billing.IMarketBillingService"

    #v3=(Reference);
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 92
    if-eqz p1, :cond_0

    .line 93
    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 94
    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    .line 99
    :goto_0
    iget-object v3, p0, Lcom/android/vending/billing/IMarketBillingService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    #v3=(Reference);
    const/4 v4, 0x1

    #v4=(One);
    const/4 v5, 0x0

    #v5=(Null);
    invoke-interface {v3, v4, v0, v1, v5}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 100
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 101
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    #v3=(Integer);
    if-eqz v3, :cond_1

    .line 102
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    #v3=(Reference);
    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/os/Bundle;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .local v2, _result:Landroid/os/Bundle;
    :goto_1
    #v3=(Conflicted);
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 110
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 112
    return-object v2

    .line 97
    .end local v2           #_result:Landroid/os/Bundle;
    :cond_0
    #v2=(Uninit);v3=(Reference);v4=(Uninit);v5=(Uninit);
    const/4 v3, 0x0

    :try_start_1
    #v3=(Null);
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 108
    :catchall_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    move-exception v3

    .line 109
    #v3=(Reference);
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 110
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 111
    throw v3

    .line 105
    :cond_1
    #v2=(Uninit);v3=(Integer);v4=(One);v5=(Null);
    const/4 v2, 0x0

    .restart local v2       #_result:Landroid/os/Bundle;
    #v2=(Null);
    goto :goto_1
.end method

*/}
