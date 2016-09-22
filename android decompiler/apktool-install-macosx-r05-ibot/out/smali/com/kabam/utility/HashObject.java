package com.kabam.utility; class HashObject {/*

.class public Lcom/kabam/utility/HashObject;
.super Ljava/lang/Object;
.source "HashObject.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .parameter "json"

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    #p0=(Reference);
    invoke-direct {p0, p1}, Lcom/kabam/utility/HashObject;->Parse(Ljava/lang/String;)V

    .line 14
    return-void
.end method

.method private Parse(Ljava/lang/String;)V
    .locals 3
    .parameter "json"

    .prologue
    .line 20
    :try_start_0
    invoke-direct {p0, p1}, Lcom/kabam/utility/HashObject;->ParseObject(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    .line 22
    :catch_0
    move-exception v0

    .line 26
    .local v0, e:Lorg/json/JSONException;
    :try_start_1
    #v0=(Reference);
    invoke-direct {p0, p1}, Lcom/kabam/utility/HashObject;->ParseArray(Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 28
    :catch_1
    move-exception v1

    .line 30
    .local v1, ex:Lorg/json/JSONException;
    #v1=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2, v1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private ParseArray(Ljava/lang/String;)V
    .locals 1
    .parameter "json"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 57
    new-instance v0, Lorg/json/JSONArray;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 58
    .local v0, ja:Lorg/json/JSONArray;
    #v0=(Reference);
    return-void
.end method

.method private ParseObject(Ljava/lang/String;)V
    .locals 4
    .parameter "json"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 38
    new-instance v1, Lorg/json/JSONObject;

    #v1=(UninitRef);
    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 40
    .local v1, jo:Lorg/json/JSONObject;
    #v1=(Reference);
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    .line 41
    .local v0, it:Ljava/util/Iterator;
    #v0=(Reference);
    if-nez v0, :cond_1

    .line 53
    :goto_0
    #v2=(Conflicted);v3=(Conflicted);
    return-void

    .line 47
    :cond_0
    #v3=(Boolean);
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 48
    .local v2, key:Ljava/lang/String;
    #v2=(Reference);
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .end local v2           #key:Ljava/lang/String;
    :cond_1
    #v2=(Conflicted);v3=(Conflicted);
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_0

    goto :goto_0
.end method

*/}
