package com.facebook.android; class Facebook$TokenRefreshServiceConnection {/*

.class Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;
.super Ljava/lang/Object;
.source "Facebook.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/android/Facebook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TokenRefreshServiceConnection"
.end annotation


# instance fields
.field final applicationsContext:Landroid/content/Context;

.field final messageReceiver:Landroid/os/Messenger;

.field messageSender:Landroid/os/Messenger;

.field final serviceListener:Lcom/facebook/android/Facebook$ServiceListener;

.field final synthetic this$0:Lcom/facebook/android/Facebook;


# direct methods
.method public constructor <init>(Lcom/facebook/android/Facebook;Landroid/content/Context;Lcom/facebook/android/Facebook$ServiceListener;)V
    .locals 2
    .parameter
    .parameter "applicationsContext"
    .parameter "serviceListener"

    .prologue
    .line 594
    iput-object p1, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->this$0:Lcom/facebook/android/Facebook;

    .line 593
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 553
    #p0=(Reference);
    new-instance v0, Landroid/os/Messenger;

    #v0=(UninitRef);
    new-instance v1, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection$1;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection$1;-><init>(Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;)V

    #v1=(Reference);
    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->messageReceiver:Landroid/os/Messenger;

    .line 591
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->messageSender:Landroid/os/Messenger;

    .line 595
    iput-object p2, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->applicationsContext:Landroid/content/Context;

    .line 596
    iput-object p3, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->serviceListener:Lcom/facebook/android/Facebook$ServiceListener;

    .line 597
    return-void
.end method

.method static synthetic access$0(Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;)Lcom/facebook/android/Facebook;
    .locals 1
    .parameter

    .prologue
    .line 551
    iget-object v0, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->this$0:Lcom/facebook/android/Facebook;

    #v0=(Reference);
    return-object v0
.end method

.method private refreshToken()V
    .locals 6

    .prologue
    .line 614
    new-instance v2, Landroid/os/Bundle;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 615
    .local v2, requestData:Landroid/os/Bundle;
    #v2=(Reference);
    const-string v3, "access_token"

    #v3=(Reference);
    iget-object v4, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->this$0:Lcom/facebook/android/Facebook;

    #v4=(Reference);
    invoke-static {v4}, Lcom/facebook/android/Facebook;->access$0(Lcom/facebook/android/Facebook;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 617
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 618
    .local v1, request:Landroid/os/Message;
    #v1=(Reference);
    invoke-virtual {v1, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 619
    iget-object v3, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->messageReceiver:Landroid/os/Messenger;

    iput-object v3, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 622
    :try_start_0
    iget-object v3, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->messageSender:Landroid/os/Messenger;

    invoke-virtual {v3, v1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 626
    :goto_0
    #v0=(Conflicted);v5=(Conflicted);
    return-void

    .line 623
    :catch_0
    #v0=(Uninit);v5=(Uninit);
    move-exception v0

    .line 624
    .local v0, e:Landroid/os/RemoteException;
    #v0=(Reference);
    iget-object v3, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->serviceListener:Lcom/facebook/android/Facebook$ServiceListener;

    new-instance v4, Ljava/lang/Error;

    #v4=(UninitRef);
    const-string v5, "Service connection error"

    #v5=(Reference);
    invoke-direct {v4, v5}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    invoke-interface {v3, v4}, Lcom/facebook/android/Facebook$ServiceListener;->onError(Ljava/lang/Error;)V

    goto :goto_0
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1
    .parameter "className"
    .parameter "service"

    .prologue
    .line 601
    new-instance v0, Landroid/os/Messenger;

    #v0=(UninitRef);
    invoke-direct {v0, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->messageSender:Landroid/os/Messenger;

    .line 602
    invoke-direct {p0}, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->refreshToken()V

    .line 603
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3
    .parameter "arg"

    .prologue
    .line 607
    iget-object v0, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->serviceListener:Lcom/facebook/android/Facebook$ServiceListener;

    #v0=(Reference);
    new-instance v1, Ljava/lang/Error;

    #v1=(UninitRef);
    const-string v2, "Service disconnected"

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-interface {v0, v1}, Lcom/facebook/android/Facebook$ServiceListener;->onError(Ljava/lang/Error;)V

    .line 610
    iget-object v0, p0, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->applicationsContext:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 611
    return-void
.end method

*/}
