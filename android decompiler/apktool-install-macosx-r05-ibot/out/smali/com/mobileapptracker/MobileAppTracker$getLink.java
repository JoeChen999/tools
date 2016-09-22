package com.mobileapptracker; class MobileAppTracker$getLink {/*

.class public Lcom/mobileapptracker/MobileAppTracker$getLink;
.super Ljava/lang/Object;
.source "MobileAppTracker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mobileapptracker/MobileAppTracker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "getLink"
.end annotation


# instance fields
.field private json:Ljava/lang/String;

.field private link:Ljava/lang/String;

.field public status:I

.field final synthetic this$0:Lcom/mobileapptracker/MobileAppTracker;


# direct methods
.method public constructor <init>(Lcom/mobileapptracker/MobileAppTracker;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .parameter
    .parameter "link"
    .parameter "json"

    .prologue
    const/4 v0, 0x0

    .line 872
    #v0=(Null);
    iput-object p1, p0, Lcom/mobileapptracker/MobileAppTracker$getLink;->this$0:Lcom/mobileapptracker/MobileAppTracker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 863
    #p0=(Reference);
    iput-object v0, p0, Lcom/mobileapptracker/MobileAppTracker$getLink;->link:Ljava/lang/String;

    .line 864
    iput-object v0, p0, Lcom/mobileapptracker/MobileAppTracker$getLink;->json:Ljava/lang/String;

    .line 865
    const/4 v0, -0x2

    #v0=(Byte);
    iput v0, p0, Lcom/mobileapptracker/MobileAppTracker$getLink;->status:I

    .line 873
    iput-object p2, p0, Lcom/mobileapptracker/MobileAppTracker$getLink;->link:Ljava/lang/String;

    .line 874
    iput-object p3, p0, Lcom/mobileapptracker/MobileAppTracker$getLink;->json:Ljava/lang/String;

    .line 875
    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .prologue
    .line 881
    invoke-static {}, Lcom/mobileapptracker/MobileAppTracker;->access$1()Z

    move-result v9

    #v9=(Boolean);
    if-eqz v9, :cond_0

    const-string v9, "MobileAppTracker"

    #v9=(Reference);
    const-string v10, "Sending event to server..."

    #v10=(Reference);
    invoke-static {v9, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 884
    :cond_0
    :try_start_0
    #v9=(Conflicted);v10=(Conflicted);
    iget-object v9, p0, Lcom/mobileapptracker/MobileAppTracker$getLink;->this$0:Lcom/mobileapptracker/MobileAppTracker;

    #v9=(Reference);
    iget-object v10, p0, Lcom/mobileapptracker/MobileAppTracker$getLink;->link:Ljava/lang/String;

    #v10=(Reference);
    invoke-static {v9, v10}, Lcom/mobileapptracker/MobileAppTracker;->access$2(Lcom/mobileapptracker/MobileAppTracker;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    iput-object v9, p0, Lcom/mobileapptracker/MobileAppTracker$getLink;->link:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 892
    :goto_0
    :try_start_1
    #v1=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    iget-object v9, p0, Lcom/mobileapptracker/MobileAppTracker$getLink;->json:Ljava/lang/String;

    #v9=(Reference);
    if-nez v9, :cond_3

    .line 893
    new-instance v3, Lorg/apache/http/client/methods/HttpGet;

    #v3=(UninitRef);
    iget-object v9, p0, Lcom/mobileapptracker/MobileAppTracker$getLink;->link:Ljava/lang/String;

    invoke-direct {v3, v9}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 894
    .local v3, request:Lorg/apache/http/client/methods/HttpGet;
    #v3=(Reference);
    iget-object v9, p0, Lcom/mobileapptracker/MobileAppTracker$getLink;->this$0:Lcom/mobileapptracker/MobileAppTracker;

    invoke-static {v9}, Lcom/mobileapptracker/MobileAppTracker;->access$3(Lcom/mobileapptracker/MobileAppTracker;)Lorg/apache/http/client/HttpClient;

    move-result-object v9

    invoke-interface {v9, v3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v4

    .line 907
    .end local v3           #request:Lorg/apache/http/client/methods/HttpGet;
    .local v4, response:Lorg/apache/http/HttpResponse;
    :goto_1
    #v0=(Conflicted);v4=(Reference);v5=(Conflicted);v8=(Conflicted);
    invoke-interface {v4}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v9

    invoke-interface {v9}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v9

    #v9=(Integer);
    iput v9, p0, Lcom/mobileapptracker/MobileAppTracker$getLink;->status:I

    .line 908
    iget v9, p0, Lcom/mobileapptracker/MobileAppTracker$getLink;->status:I

    const/16 v10, 0xc8

    #v10=(PosShort);
    if-ne v9, v10, :cond_4

    .line 909
    invoke-static {}, Lcom/mobileapptracker/MobileAppTracker;->access$1()Z

    move-result v9

    #v9=(Boolean);
    if-eqz v9, :cond_1

    const-string v9, "MobileAppTracker"

    #v9=(Reference);
    const-string v10, "Event was sent"

    #v10=(Reference);
    invoke-static {v9, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 917
    :cond_1
    #v9=(Conflicted);v10=(Conflicted);
    new-instance v2, Ljava/io/BufferedReader;

    #v2=(UninitRef);
    new-instance v9, Ljava/io/InputStreamReader;

    #v9=(UninitRef);
    invoke-interface {v4}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v10

    #v10=(Reference);
    invoke-interface {v10}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v10

    const-string v11, "UTF-8"

    #v11=(Reference);
    invoke-direct {v9, v10, v11}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    #v9=(Reference);
    const/16 v10, 0x2000

    #v10=(PosShort);
    invoke-direct {v2, v9, v10}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    .line 918
    .local v2, reader:Ljava/io/BufferedReader;
    #v2=(Reference);
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v7

    .line 919
    .local v7, success:Ljava/lang/String;
    #v7=(Reference);
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V

    .line 922
    if-eqz v7, :cond_2

    .line 923
    const-string v9, "\\s*\\\"status\\\"\\s*\\:\\s*"

    invoke-virtual {v7, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x1

    #v10=(One);
    aget-object v7, v9, v10

    .line 924
    #v7=(Null);
    const-string v9, "\"rejected\""

    invoke-virtual {v7, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    #v9=(Boolean);
    if-eqz v9, :cond_5

    .line 925
    const-string v9, "\\s*\\\"status_code\\\"\\:\\s*"

    #v9=(Reference);
    invoke-virtual {v7, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x1

    aget-object v7, v9, v10

    .line 926
    const/4 v9, 0x0

    #v9=(Null);
    const/4 v10, 0x2

    #v10=(PosByte);
    invoke-virtual {v7, v9, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 927
    .local v6, statusCode:Ljava/lang/String;
    #v6=(Reference);
    invoke-static {}, Lcom/mobileapptracker/MobileAppTracker;->access$1()Z

    move-result v9

    #v9=(Boolean);
    if-eqz v9, :cond_2

    const-string v9, "MobileAppTracker"

    #v9=(Reference);
    new-instance v10, Ljava/lang/StringBuilder;

    #v10=(UninitRef);
    const-string v11, "Event was rejected by server: status code "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v10=(Reference);
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 935
    .end local v2           #reader:Ljava/io/BufferedReader;
    .end local v4           #response:Lorg/apache/http/HttpResponse;
    .end local v6           #statusCode:Ljava/lang/String;
    .end local v7           #success:Ljava/lang/String;
    :cond_2
    :goto_2
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    return-void

    .line 885
    :catch_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v11=(Uninit);
    move-exception v1

    .line 886
    .local v1, e:Ljava/lang/Exception;
    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_0

    .line 896
    .end local v1           #e:Ljava/lang/Exception;
    :cond_3
    :try_start_2
    #v1=(Conflicted);v9=(Reference);
    new-instance v0, Lorg/json/JSONObject;

    #v0=(UninitRef);
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 897
    .local v0, data:Lorg/json/JSONObject;
    #v0=(Reference);
    new-instance v8, Lorg/json/JSONArray;

    #v8=(UninitRef);
    iget-object v9, p0, Lcom/mobileapptracker/MobileAppTracker$getLink;->json:Ljava/lang/String;

    invoke-direct {v8, v9}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 898
    .local v8, value:Lorg/json/JSONArray;
    #v8=(Reference);
    const-string v9, "data"

    invoke-virtual {v0, v9, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 900
    new-instance v5, Lorg/apache/http/entity/StringEntity;

    #v5=(UninitRef);
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v5, v9}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;)V

    .line 901
    .local v5, se:Lorg/apache/http/entity/StringEntity;
    #v5=(Reference);
    const-string v9, "application/json"

    invoke-virtual {v5, v9}, Lorg/apache/http/entity/StringEntity;->setContentType(Ljava/lang/String;)V

    .line 902
    new-instance v3, Lorg/apache/http/client/methods/HttpPost;

    #v3=(UninitRef);
    iget-object v9, p0, Lcom/mobileapptracker/MobileAppTracker$getLink;->link:Ljava/lang/String;

    invoke-direct {v3, v9}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 903
    .local v3, request:Lorg/apache/http/client/methods/HttpPost;
    #v3=(Reference);
    invoke-virtual {v3, v5}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 904
    iget-object v9, p0, Lcom/mobileapptracker/MobileAppTracker$getLink;->this$0:Lcom/mobileapptracker/MobileAppTracker;

    invoke-static {v9}, Lcom/mobileapptracker/MobileAppTracker;->access$3(Lcom/mobileapptracker/MobileAppTracker;)Lorg/apache/http/client/HttpClient;

    move-result-object v9

    invoke-interface {v9, v3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v4

    .restart local v4       #response:Lorg/apache/http/HttpResponse;
    #v4=(Reference);
    goto/16 :goto_1

    .line 911
    .end local v0           #data:Lorg/json/JSONObject;
    .end local v3           #request:Lorg/apache/http/client/methods/HttpPost;
    .end local v5           #se:Lorg/apache/http/entity/StringEntity;
    .end local v8           #value:Lorg/json/JSONArray;
    :cond_4
    #v0=(Conflicted);v5=(Conflicted);v8=(Conflicted);v9=(Integer);v10=(PosShort);
    iget-object v9, p0, Lcom/mobileapptracker/MobileAppTracker$getLink;->this$0:Lcom/mobileapptracker/MobileAppTracker;

    #v9=(Reference);
    iget-object v10, p0, Lcom/mobileapptracker/MobileAppTracker$getLink;->link:Ljava/lang/String;

    #v10=(Reference);
    iget-object v11, p0, Lcom/mobileapptracker/MobileAppTracker$getLink;->json:Ljava/lang/String;

    #v11=(Reference);
    invoke-static {v9, v10, v11}, Lcom/mobileapptracker/MobileAppTracker;->access$4(Lcom/mobileapptracker/MobileAppTracker;Ljava/lang/String;Ljava/lang/String;)V

    .line 912
    invoke-static {}, Lcom/mobileapptracker/MobileAppTracker;->access$1()Z

    move-result v9

    #v9=(Boolean);
    if-eqz v9, :cond_2

    const-string v9, "MobileAppTracker"

    #v9=(Reference);
    new-instance v10, Ljava/lang/StringBuilder;

    #v10=(UninitRef);
    const-string v11, "Event failed with status "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v10=(Reference);
    iget v11, p0, Lcom/mobileapptracker/MobileAppTracker$getLink;->status:I

    #v11=(Integer);
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    .line 932
    .end local v4           #response:Lorg/apache/http/HttpResponse;
    :catch_1
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    move-exception v1

    .line 933
    .restart local v1       #e:Ljava/lang/Exception;
    #v1=(Reference);
    const/4 v9, -0x3

    #v9=(Byte);
    iput v9, p0, Lcom/mobileapptracker/MobileAppTracker$getLink;->status:I

    goto :goto_2

    .line 929
    .end local v1           #e:Ljava/lang/Exception;
    .restart local v2       #reader:Ljava/io/BufferedReader;
    .restart local v4       #response:Lorg/apache/http/HttpResponse;
    .restart local v7       #success:Ljava/lang/String;
    :cond_5
    :try_start_3
    #v1=(Conflicted);v2=(Reference);v3=(Reference);v4=(Reference);v6=(Uninit);v7=(Null);v9=(Boolean);v10=(One);v11=(Reference);
    invoke-static {}, Lcom/mobileapptracker/MobileAppTracker;->access$1()Z

    move-result v9

    if-eqz v9, :cond_2

    const-string v9, "MobileAppTracker"

    #v9=(Reference);
    const-string v10, "Event was accepted by server"

    #v10=(Reference);
    invoke-static {v9, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2
.end method

*/}
