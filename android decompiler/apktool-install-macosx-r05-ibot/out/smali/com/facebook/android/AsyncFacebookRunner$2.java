package com.facebook.android; class AsyncFacebookRunner$2 {/*

.class Lcom/facebook/android/AsyncFacebookRunner$2;
.super Ljava/lang/Thread;
.source "AsyncFacebookRunner.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/android/AsyncFacebookRunner;

.field private final synthetic val$graphPath:Ljava/lang/String;

.field private final synthetic val$httpMethod:Ljava/lang/String;

.field private final synthetic val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;

.field private final synthetic val$parameters:Landroid/os/Bundle;

.field private final synthetic val$state:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lcom/facebook/android/AsyncFacebookRunner;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->this$0:Lcom/facebook/android/AsyncFacebookRunner;

    iput-object p2, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$graphPath:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$parameters:Landroid/os/Bundle;

    iput-object p4, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$httpMethod:Ljava/lang/String;

    iput-object p5, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;

    iput-object p6, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$state:Ljava/lang/Object;

    .line 250
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 253
    :try_start_0
    iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->this$0:Lcom/facebook/android/AsyncFacebookRunner;

    #v2=(Reference);
    iget-object v2, v2, Lcom/facebook/android/AsyncFacebookRunner;->fb:Lcom/facebook/android/Facebook;

    iget-object v3, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$graphPath:Ljava/lang/String;

    #v3=(Reference);
    iget-object v4, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$parameters:Landroid/os/Bundle;

    #v4=(Reference);
    iget-object v5, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$httpMethod:Ljava/lang/String;

    #v5=(Reference);
    invoke-virtual {v2, v3, v4, v5}, Lcom/facebook/android/Facebook;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 254
    .local v1, resp:Ljava/lang/String;
    #v1=(Reference);
    iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;

    iget-object v3, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$state:Ljava/lang/Object;

    invoke-interface {v2, v1, v3}, Lcom/facebook/android/AsyncFacebookRunner$RequestListener;->onComplete(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    .line 262
    .end local v1           #resp:Ljava/lang/String;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void

    .line 255
    :catch_0
    move-exception v0

    .line 256
    .local v0, e:Ljava/io/FileNotFoundException;
    #v0=(Reference);
    iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;

    #v2=(Reference);
    iget-object v3, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$state:Ljava/lang/Object;

    #v3=(Reference);
    invoke-interface {v2, v0, v3}, Lcom/facebook/android/AsyncFacebookRunner$RequestListener;->onFileNotFoundException(Ljava/io/FileNotFoundException;Ljava/lang/Object;)V

    goto :goto_0

    .line 257
    .end local v0           #e:Ljava/io/FileNotFoundException;
    :catch_1
    move-exception v0

    .line 258
    .local v0, e:Ljava/net/MalformedURLException;
    #v0=(Reference);
    iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;

    #v2=(Reference);
    iget-object v3, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$state:Ljava/lang/Object;

    #v3=(Reference);
    invoke-interface {v2, v0, v3}, Lcom/facebook/android/AsyncFacebookRunner$RequestListener;->onMalformedURLException(Ljava/net/MalformedURLException;Ljava/lang/Object;)V

    goto :goto_0

    .line 259
    .end local v0           #e:Ljava/net/MalformedURLException;
    :catch_2
    move-exception v0

    .line 260
    .local v0, e:Ljava/io/IOException;
    #v0=(Reference);
    iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;

    #v2=(Reference);
    iget-object v3, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$state:Ljava/lang/Object;

    #v3=(Reference);
    invoke-interface {v2, v0, v3}, Lcom/facebook/android/AsyncFacebookRunner$RequestListener;->onIOException(Ljava/io/IOException;Ljava/lang/Object;)V

    goto :goto_0
.end method

*/}
