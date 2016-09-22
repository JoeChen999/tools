package com.facebook.android; class AsyncFacebookRunner$1 {/*

.class Lcom/facebook/android/AsyncFacebookRunner$1;
.super Ljava/lang/Thread;
.source "AsyncFacebookRunner.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/android/AsyncFacebookRunner;->logout(Landroid/content/Context;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/android/AsyncFacebookRunner;

.field private final synthetic val$context:Landroid/content/Context;

.field private final synthetic val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;

.field private final synthetic val$state:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lcom/facebook/android/AsyncFacebookRunner;Landroid/content/Context;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->this$0:Lcom/facebook/android/AsyncFacebookRunner;

    iput-object p2, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;

    iput-object p4, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$state:Ljava/lang/Object;

    .line 80
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 83
    :try_start_0
    iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->this$0:Lcom/facebook/android/AsyncFacebookRunner;

    #v2=(Reference);
    iget-object v2, v2, Lcom/facebook/android/AsyncFacebookRunner;->fb:Lcom/facebook/android/Facebook;

    iget-object v3, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$context:Landroid/content/Context;

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lcom/facebook/android/Facebook;->logout(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 84
    .local v1, response:Ljava/lang/String;
    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    if-eqz v2, :cond_0

    const-string v2, "false"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_1

    .line 85
    :cond_0
    #v2=(Integer);
    iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;

    #v2=(Reference);
    new-instance v3, Lcom/facebook/android/FacebookError;

    .line 86
    #v3=(UninitRef);
    const-string v4, "auth.expireSession failed"

    #v4=(Reference);
    invoke-direct {v3, v4}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    iget-object v4, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$state:Ljava/lang/Object;

    .line 85
    invoke-interface {v2, v3, v4}, Lcom/facebook/android/AsyncFacebookRunner$RequestListener;->onFacebookError(Lcom/facebook/android/FacebookError;Ljava/lang/Object;)V

    .line 97
    .end local v1           #response:Ljava/lang/String;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);
    return-void

    .line 89
    .restart local v1       #response:Ljava/lang/String;
    :cond_1
    #v0=(Uninit);v1=(Reference);v2=(Boolean);v4=(Uninit);
    iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;

    #v2=(Reference);
    iget-object v3, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$state:Ljava/lang/Object;

    invoke-interface {v2, v1, v3}, Lcom/facebook/android/AsyncFacebookRunner$RequestListener;->onComplete(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_0

    .line 90
    .end local v1           #response:Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 91
    .local v0, e:Ljava/io/FileNotFoundException;
    #v0=(Reference);
    iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;

    #v2=(Reference);
    iget-object v3, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$state:Ljava/lang/Object;

    #v3=(Reference);
    invoke-interface {v2, v0, v3}, Lcom/facebook/android/AsyncFacebookRunner$RequestListener;->onFileNotFoundException(Ljava/io/FileNotFoundException;Ljava/lang/Object;)V

    goto :goto_0

    .line 92
    .end local v0           #e:Ljava/io/FileNotFoundException;
    :catch_1
    move-exception v0

    .line 93
    .local v0, e:Ljava/net/MalformedURLException;
    #v0=(Reference);
    iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;

    #v2=(Reference);
    iget-object v3, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$state:Ljava/lang/Object;

    #v3=(Reference);
    invoke-interface {v2, v0, v3}, Lcom/facebook/android/AsyncFacebookRunner$RequestListener;->onMalformedURLException(Ljava/net/MalformedURLException;Ljava/lang/Object;)V

    goto :goto_0

    .line 94
    .end local v0           #e:Ljava/net/MalformedURLException;
    :catch_2
    move-exception v0

    .line 95
    .local v0, e:Ljava/io/IOException;
    #v0=(Reference);
    iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;

    #v2=(Reference);
    iget-object v3, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$state:Ljava/lang/Object;

    #v3=(Reference);
    invoke-interface {v2, v0, v3}, Lcom/facebook/android/AsyncFacebookRunner$RequestListener;->onIOException(Ljava/io/IOException;Ljava/lang/Object;)V

    goto :goto_0
.end method

*/}
