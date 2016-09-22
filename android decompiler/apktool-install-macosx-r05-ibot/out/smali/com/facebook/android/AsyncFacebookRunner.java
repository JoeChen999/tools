package com.facebook.android; class AsyncFacebookRunner {/*

.class public Lcom/facebook/android/AsyncFacebookRunner;
.super Ljava/lang/Object;
.source "AsyncFacebookRunner.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/android/AsyncFacebookRunner$RequestListener;
    }
.end annotation


# instance fields
.field fb:Lcom/facebook/android/Facebook;


# direct methods
.method public constructor <init>(Lcom/facebook/android/Facebook;)V
    .locals 0
    .parameter "fb"

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    #p0=(Reference);
    iput-object p1, p0, Lcom/facebook/android/AsyncFacebookRunner;->fb:Lcom/facebook/android/Facebook;

    .line 53
    return-void
.end method


# virtual methods
.method public logout(Landroid/content/Context;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;)V
    .locals 1
    .parameter "context"
    .parameter "listener"

    .prologue
    .line 102
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/android/AsyncFacebookRunner;->logout(Landroid/content/Context;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V

    .line 103
    return-void
.end method

.method public logout(Landroid/content/Context;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V
    .locals 1
    .parameter "context"
    .parameter "listener"
    .parameter "state"

    .prologue
    .line 80
    new-instance v0, Lcom/facebook/android/AsyncFacebookRunner$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/facebook/android/AsyncFacebookRunner$1;-><init>(Lcom/facebook/android/AsyncFacebookRunner;Landroid/content/Context;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V

    .line 98
    #v0=(Reference);
    invoke-virtual {v0}, Lcom/facebook/android/AsyncFacebookRunner$1;->start()V

    .line 99
    return-void
.end method

.method public request(Landroid/os/Bundle;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;)V
    .locals 6
    .parameter "parameters"
    .parameter "listener"

    .prologue
    const/4 v1, 0x0

    .line 141
    #v1=(Null);
    const-string v3, "GET"

    #v3=(Reference);
    move-object v0, p0

    #v0=(Reference);
    move-object v2, p1

    #v2=(Reference);
    move-object v4, p2

    #v4=(Reference);
    move-object v5, v1

    #v5=(Null);
    invoke-virtual/range {v0 .. v5}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V

    .line 142
    return-void
.end method

.method public request(Landroid/os/Bundle;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V
    .locals 6
    .parameter "parameters"
    .parameter "listener"
    .parameter "state"

    .prologue
    .line 137
    const/4 v1, 0x0

    #v1=(Null);
    const-string v3, "GET"

    #v3=(Reference);
    move-object v0, p0

    #v0=(Reference);
    move-object v2, p1

    #v2=(Reference);
    move-object v4, p2

    #v4=(Reference);
    move-object v5, p3

    #v5=(Reference);
    invoke-virtual/range {v0 .. v5}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V

    .line 138
    return-void
.end method

.method public request(Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;)V
    .locals 6
    .parameter "graphPath"
    .parameter "parameters"
    .parameter "listener"

    .prologue
    .line 212
    const-string v3, "GET"

    #v3=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    move-object v0, p0

    #v0=(Reference);
    move-object v1, p1

    #v1=(Reference);
    move-object v2, p2

    #v2=(Reference);
    move-object v4, p3

    #v4=(Reference);
    invoke-virtual/range {v0 .. v5}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V

    .line 213
    return-void
.end method

.method public request(Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V
    .locals 6
    .parameter "graphPath"
    .parameter "parameters"
    .parameter "listener"
    .parameter "state"

    .prologue
    .line 206
    const-string v3, "GET"

    #v3=(Reference);
    move-object v0, p0

    #v0=(Reference);
    move-object v1, p1

    #v1=(Reference);
    move-object v2, p2

    #v2=(Reference);
    move-object v4, p3

    #v4=(Reference);
    move-object v5, p4

    #v5=(Reference);
    invoke-virtual/range {v0 .. v5}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V

    .line 207
    return-void
.end method

.method public request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V
    .locals 7
    .parameter "graphPath"
    .parameter "parameters"
    .parameter "httpMethod"
    .parameter "listener"
    .parameter "state"

    .prologue
    .line 250
    new-instance v0, Lcom/facebook/android/AsyncFacebookRunner$2;

    #v0=(UninitRef);
    move-object v1, p0

    #v1=(Reference);
    move-object v2, p1

    #v2=(Reference);
    move-object v3, p2

    #v3=(Reference);
    move-object v4, p3

    #v4=(Reference);
    move-object v5, p4

    #v5=(Reference);
    move-object v6, p5

    #v6=(Reference);
    invoke-direct/range {v0 .. v6}, Lcom/facebook/android/AsyncFacebookRunner$2;-><init>(Lcom/facebook/android/AsyncFacebookRunner;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V

    .line 263
    #v0=(Reference);
    invoke-virtual {v0}, Lcom/facebook/android/AsyncFacebookRunner$2;->start()V

    .line 264
    return-void
.end method

.method public request(Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;)V
    .locals 6
    .parameter "graphPath"
    .parameter "listener"

    .prologue
    .line 172
    new-instance v2, Landroid/os/Bundle;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    #v2=(Reference);
    const-string v3, "GET"

    #v3=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    move-object v0, p0

    #v0=(Reference);
    move-object v1, p1

    #v1=(Reference);
    move-object v4, p2

    #v4=(Reference);
    invoke-virtual/range {v0 .. v5}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V

    .line 173
    return-void
.end method

.method public request(Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V
    .locals 6
    .parameter "graphPath"
    .parameter "listener"
    .parameter "state"

    .prologue
    .line 168
    new-instance v2, Landroid/os/Bundle;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    #v2=(Reference);
    const-string v3, "GET"

    #v3=(Reference);
    move-object v0, p0

    #v0=(Reference);
    move-object v1, p1

    #v1=(Reference);
    move-object v4, p2

    #v4=(Reference);
    move-object v5, p3

    #v5=(Reference);
    invoke-virtual/range {v0 .. v5}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V

    .line 169
    return-void
.end method

*/}
