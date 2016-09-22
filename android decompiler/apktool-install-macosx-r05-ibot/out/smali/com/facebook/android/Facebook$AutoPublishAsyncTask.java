package com.facebook.android; class Facebook$AutoPublishAsyncTask {/*

.class Lcom/facebook/android/Facebook$AutoPublishAsyncTask;
.super Landroid/os/AsyncTask;
.source "Facebook.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/android/Facebook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AutoPublishAsyncTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private final mApplicationContext:Landroid/content/Context;

.field private final mApplicationId:Ljava/lang/String;

.field final synthetic this$0:Lcom/facebook/android/Facebook;


# direct methods
.method public constructor <init>(Lcom/facebook/android/Facebook;Ljava/lang/String;Landroid/content/Context;)V
    .locals 1
    .parameter
    .parameter "applicationId"
    .parameter "context"

    .prologue
    .line 1066
    iput-object p1, p0, Lcom/facebook/android/Facebook$AutoPublishAsyncTask;->this$0:Lcom/facebook/android/Facebook;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 1067
    #p0=(Reference);
    iput-object p2, p0, Lcom/facebook/android/Facebook$AutoPublishAsyncTask;->mApplicationId:Ljava/lang/String;

    .line 1068
    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/facebook/android/Facebook$AutoPublishAsyncTask;->mApplicationContext:Landroid/content/Context;

    .line 1069
    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/android/Facebook$AutoPublishAsyncTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 4
    .parameter "voids"

    .prologue
    .line 1074
    :try_start_0
    iget-object v1, p0, Lcom/facebook/android/Facebook$AutoPublishAsyncTask;->this$0:Lcom/facebook/android/Facebook;

    #v1=(Reference);
    iget-object v2, p0, Lcom/facebook/android/Facebook$AutoPublishAsyncTask;->mApplicationId:Ljava/lang/String;

    #v2=(Reference);
    iget-object v3, p0, Lcom/facebook/android/Facebook$AutoPublishAsyncTask;->mApplicationContext:Landroid/content/Context;

    #v3=(Reference);
    invoke-static {v1, v2, v3}, Lcom/facebook/android/Facebook;->access$1(Lcom/facebook/android/Facebook;Ljava/lang/String;Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1078
    :goto_0
    #v0=(Conflicted);v3=(Conflicted);
    const/4 v1, 0x0

    #v1=(Null);
    return-object v1

    .line 1075
    :catch_0
    move-exception v0

    .line 1076
    .local v0, e:Ljava/lang/Exception;
    #v0=(Reference);
    const-string v1, "Facebook-publish"

    #v1=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-static {v1, v2}, Lcom/facebook/android/Util;->logd(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/android/Facebook$AutoPublishAsyncTask;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 3
    .parameter "result"

    .prologue
    .line 1084
    iget-object v1, p0, Lcom/facebook/android/Facebook$AutoPublishAsyncTask;->this$0:Lcom/facebook/android/Facebook;

    #v1=(Reference);
    monitor-enter v1

    .line 1085
    :try_start_0
    iget-object v0, p0, Lcom/facebook/android/Facebook$AutoPublishAsyncTask;->this$0:Lcom/facebook/android/Facebook;

    #v0=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-static {v0, v2}, Lcom/facebook/android/Facebook;->access$2(Lcom/facebook/android/Facebook;Lcom/facebook/android/Facebook$AutoPublishAsyncTask;)V

    .line 1084
    monitor-exit v1

    .line 1087
    return-void

    .line 1084
    :catchall_0
    #v0=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

*/}
