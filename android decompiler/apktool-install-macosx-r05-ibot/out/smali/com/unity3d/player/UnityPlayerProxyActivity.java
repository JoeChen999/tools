package com.unity3d.player; class UnityPlayerProxyActivity {/*

.class public Lcom/unity3d/player/UnityPlayerProxyActivity;
.super Landroid/app/Activity;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method protected static copyPlayerPrefs(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 9

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p0, v0, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v1

    #v1=(Reference);
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_1

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return-void

    :cond_1
    #v0=(Reference);v1=(Boolean);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    #v4=(Reference);
    array-length v5, p1

    #v5=(Integer);
    move v2, v3

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    if-ge v2, v5, :cond_0

    aget-object v0, p1, v2

    #v0=(Null);
    invoke-virtual {p0, v0, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    #v0=(Reference);
    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_6

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    :goto_1
    #v1=(Conflicted);v6=(Reference);
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    #v7=(Reference);
    const-class v8, Ljava/lang/Integer;

    #v8=(Reference);
    if-ne v7, v8, :cond_3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    #v1=(Integer);
    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    goto :goto_1

    :cond_3
    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Ljava/lang/Float;

    if-ne v7, v8, :cond_4

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    #v1=(Float);
    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    goto :goto_1

    :cond_4
    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Ljava/lang/String;

    if-ne v7, v8, :cond_2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    check-cast v1, Ljava/lang/String;

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_1

    :cond_5
    #v0=(Boolean);v1=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_6
    #v0=(Conflicted);v6=(Conflicted);
    add-int/lit8 v0, v2, 0x1

    #v0=(Integer);
    move v2, v0

    goto :goto_0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    const/4 v2, 0x2

    #v2=(PosByte);
    new-array v3, v2, [Ljava/lang/String;

    #v3=(Reference);
    const-string v2, "com.unity3d.player.UnityPlayerActivity"

    #v2=(Reference);
    aput-object v2, v3, v1

    const-string v2, "com.unity3d.player.UnityPlayerNativeActivity"

    aput-object v2, v3, v0

    invoke-static {p0, v3}, Lcom/unity3d/player/UnityPlayerProxyActivity;->copyPlayerPrefs(Landroid/content/Context;[Ljava/lang/String;)V

    :try_start_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    #v2=(Integer);
    const/16 v4, 0x9

    #v4=(PosByte);
    if-lt v2, v4, :cond_1

    move v2, v0

    :goto_0
    #v2=(Boolean);
    if-eqz v2, :cond_2

    :goto_1
    #v0=(Boolean);
    aget-object v0, v3, v0

    #v0=(Null);
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    #v0=(Reference);
    new-instance v1, Landroid/content/Intent;

    #v1=(UninitRef);
    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    #v1=(Reference);
    const/high16 v0, 0x1

    #v0=(Integer);
    invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/unity3d/player/UnityPlayerProxyActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_0
    invoke-virtual {p0, v1}, Lcom/unity3d/player/UnityPlayerProxyActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0}, Lcom/unity3d/player/UnityPlayerProxyActivity;->finish()V

    :goto_2
    #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
    return-void

    :cond_1
    #v0=(One);v1=(Null);v2=(Integer);v4=(PosByte);
    move v2, v1

    #v2=(Null);
    goto :goto_0

    :cond_2
    #v2=(Boolean);
    move v0, v1

    #v0=(Null);
    goto :goto_1

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
    move-exception v0

    :try_start_1
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/ClassNotFoundException;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p0}, Lcom/unity3d/player/UnityPlayerProxyActivity;->finish()V

    goto :goto_2

    :catchall_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {p0}, Lcom/unity3d/player/UnityPlayerProxyActivity;->finish()V

    throw v0
.end method

*/}
