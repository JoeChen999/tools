package com.kabam.billing; class NotificationStorage {/*

.class public Lcom/kabam/billing/NotificationStorage;
.super Ljava/lang/Object;
.source "NotificationStorage.java"


# instance fields
.field private mContext:Landroid/content/Context;

.field mManager:Lcom/kabam/billing/NotificationFileManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .parameter "context"

    .prologue
    const/4 v0, 0x0

    .line 21
    #v0=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    #p0=(Reference);
    iput-object v0, p0, Lcom/kabam/billing/NotificationStorage;->mManager:Lcom/kabam/billing/NotificationFileManager;

    .line 20
    iput-object v0, p0, Lcom/kabam/billing/NotificationStorage;->mContext:Landroid/content/Context;

    .line 23
    if-nez p1, :cond_0

    .line 24
    const-string v0, "NotificationStorage construction "

    #v0=(Reference);
    const-string v1, "Context is null"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    :cond_0
    #v1=(Conflicted);
    iput-object p1, p0, Lcom/kabam/billing/NotificationStorage;->mContext:Landroid/content/Context;

    .line 26
    new-instance v0, Lcom/kabam/billing/NotificationFileManager;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/kabam/billing/NotificationStorage;->mContext:Landroid/content/Context;

    #v1=(Reference);
    invoke-direct {v0, v1}, Lcom/kabam/billing/NotificationFileManager;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/billing/NotificationStorage;->mManager:Lcom/kabam/billing/NotificationFileManager;

    .line 27
    return-void
.end method

.method private ReadFromFile()Ljava/lang/String;
    .locals 2

    .prologue
    .line 55
    :try_start_0
    iget-object v1, p0, Lcom/kabam/billing/NotificationStorage;->mManager:Lcom/kabam/billing/NotificationFileManager;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/kabam/billing/NotificationFileManager;->Read()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 61
    :goto_0
    #v0=(Conflicted);
    return-object v1

    .line 57
    :catch_0
    move-exception v0

    .line 59
    .local v0, e:Ljava/io/IOException;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    .line 61
    const-string v1, ""

    goto :goto_0
.end method

.method private WriteToString(Ljava/util/List;)Ljava/lang/String;
    .locals 8
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 31
    .local p1, items:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .local v0, builder:Ljava/lang/StringBuilder;
    #v0=(Reference);
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    .line 33
    .local v5, n:I
    #v5=(Integer);
    new-instance v3, Lorg/json/JSONArray;

    #v3=(UninitRef);
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 34
    .local v3, ja:Lorg/json/JSONArray;
    #v3=(Reference);
    const/4 v2, 0x0

    .local v2, i:I
    :goto_0
    #v1=(Conflicted);v2=(Integer);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    if-lt v2, v5, :cond_0

    .line 47
    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v6

    #v6=(Reference);
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    return-object v6

    .line 36
    :cond_0
    #v6=(Conflicted);
    new-instance v4, Lorg/json/JSONObject;

    #v4=(UninitRef);
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 39
    .local v4, jo:Lorg/json/JSONObject;
    :try_start_0
    #v4=(Reference);
    const-string v6, "key"

    #v6=(Reference);
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    #v7=(Reference);
    invoke-virtual {v4, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 40
    invoke-virtual {v3, v2, v4}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    :goto_1
    #v6=(Conflicted);v7=(Conflicted);
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 42
    :catch_0
    move-exception v1

    .line 44
    .local v1, e:Lorg/json/JSONException;
    #v1=(Reference);
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_1
.end method


# virtual methods
.method public Read()Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 78
    invoke-direct {p0}, Lcom/kabam/billing/NotificationStorage;->ReadFromFile()Ljava/lang/String;

    move-result-object v1

    .line 79
    .local v1, content:Ljava/lang/String;
    #v1=(Reference);
    new-instance v4, Ljava/util/ArrayList;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 84
    .local v4, items:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    :try_start_0
    #v4=(Reference);
    const-string v8, "NotificationStorage"

    #v8=(Reference);
    new-instance v9, Ljava/lang/StringBuilder;

    #v9=(UninitRef);
    const-string v10, "content="

    #v10=(Reference);
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v9=(Reference);
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    new-instance v0, Lorg/json/JSONArray;

    #v0=(UninitRef);
    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 86
    .local v0, array:Lorg/json/JSONArray;
    #v0=(Reference);
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v6

    .line 87
    .local v6, length:I
    #v6=(Integer);
    const/4 v3, 0x0

    .local v3, i:I
    :goto_0
    #v3=(Integer);v5=(Conflicted);v7=(Conflicted);
    if-lt v3, v6, :cond_0

    .line 101
    .end local v0           #array:Lorg/json/JSONArray;
    .end local v3           #i:I
    .end local v6           #length:I
    :goto_1
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    return-object v4

    .line 89
    .restart local v0       #array:Lorg/json/JSONArray;
    .restart local v3       #i:I
    .restart local v6       #length:I
    :cond_0
    #v0=(Reference);v2=(Uninit);v3=(Integer);v6=(Integer);v9=(Reference);v10=(Reference);
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 90
    .local v5, jo:Lorg/json/JSONObject;
    #v5=(Reference);
    const-string v8, "key"

    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 91
    .local v7, value:Ljava/lang/String;
    #v7=(Reference);
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 95
    .end local v0           #array:Lorg/json/JSONArray;
    .end local v3           #i:I
    .end local v5           #jo:Lorg/json/JSONObject;
    .end local v6           #length:I
    .end local v7           #value:Ljava/lang/String;
    :catch_0
    #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    move-exception v2

    .line 97
    .local v2, e:Lorg/json/JSONException;
    #v2=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v8

    #v8=(Reference);
    invoke-virtual {v8, v2}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    .line 99
    const-string v8, "Read String"

    invoke-static {v8, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1
.end method

.method public Write(Ljava/util/List;)V
    .locals 3
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 66
    .local p1, items:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0, p1}, Lcom/kabam/billing/NotificationStorage;->WriteToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    .line 69
    .local v0, content:Ljava/lang/String;
    :try_start_0
    #v0=(Reference);
    iget-object v2, p0, Lcom/kabam/billing/NotificationStorage;->mManager:Lcom/kabam/billing/NotificationFileManager;

    #v2=(Reference);
    invoke-virtual {v2, v0}, Lcom/kabam/billing/NotificationFileManager;->Write(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    :goto_0
    #v1=(Conflicted);
    return-void

    .line 71
    :catch_0
    #v1=(Uninit);v2=(Conflicted);
    move-exception v1

    .line 73
    .local v1, e:Ljava/io/IOException;
    #v1=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2, v1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

*/}
