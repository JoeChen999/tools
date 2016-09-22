package com.unity3d.player; class PlayerPrefs {/*

.class Lcom/unity3d/player/PlayerPrefs;
.super Ljava/lang/Object;


# instance fields
.field private a:Landroid/content/SharedPreferences;

.field private b:Landroid/content/SharedPreferences$Editor;

.field private c:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method constructor <init>(Landroid/content/SharedPreferences;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/PlayerPrefs;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lcom/unity3d/player/PlayerPrefs;->a:Landroid/content/SharedPreferences;

    iget-object v0, p0, Lcom/unity3d/player/PlayerPrefs;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iput-object v0, p0, Lcom/unity3d/player/PlayerPrefs;->b:Landroid/content/SharedPreferences$Editor;

    invoke-direct {p0}, Lcom/unity3d/player/PlayerPrefs;->InitPlayerPrefs()V

    return-void
.end method

.method private DeleteAll()V
    .locals 2

    iget-object v0, p0, Lcom/unity3d/player/PlayerPrefs;->b:Landroid/content/SharedPreferences$Editor;

    #v0=(Reference);
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    iget-object v0, p0, Lcom/unity3d/player/PlayerPrefs;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method private DeleteKey(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/unity3d/player/PlayerPrefs;->b:Landroid/content/SharedPreferences$Editor;

    #v0=(Reference);
    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    iget-object v0, p0, Lcom/unity3d/player/PlayerPrefs;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method private GetFloat(Ljava/lang/String;F)F
    .locals 1

    invoke-direct {p0}, Lcom/unity3d/player/PlayerPrefs;->Sync()V

    iget-object v0, p0, Lcom/unity3d/player/PlayerPrefs;->a:Landroid/content/SharedPreferences;

    #v0=(Reference);
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method private GetInt(Ljava/lang/String;I)I
    .locals 1

    invoke-direct {p0}, Lcom/unity3d/player/PlayerPrefs;->Sync()V

    iget-object v0, p0, Lcom/unity3d/player/PlayerPrefs;->a:Landroid/content/SharedPreferences;

    #v0=(Reference);
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method private GetString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lcom/unity3d/player/PlayerPrefs;->Sync()V

    iget-object v0, p0, Lcom/unity3d/player/PlayerPrefs;->a:Landroid/content/SharedPreferences;

    #v0=(Reference);
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private HasKey(Ljava/lang/String;)Z
    .locals 1

    invoke-direct {p0}, Lcom/unity3d/player/PlayerPrefs;->Sync()V

    iget-object v0, p0, Lcom/unity3d/player/PlayerPrefs;->a:Landroid/content/SharedPreferences;

    #v0=(Reference);
    invoke-interface {v0, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method private final native InitPlayerPrefs()V
.end method

.method private SetFloat(Ljava/lang/String;F)Z
    .locals 2

    const/4 v1, 0x1

    #v1=(One);
    iget-object v0, p0, Lcom/unity3d/player/PlayerPrefs;->b:Landroid/content/SharedPreferences$Editor;

    #v0=(Reference);
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    iget-object v0, p0, Lcom/unity3d/player/PlayerPrefs;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return v1
.end method

.method private SetInt(Ljava/lang/String;I)Z
    .locals 2

    const/4 v1, 0x1

    #v1=(One);
    iget-object v0, p0, Lcom/unity3d/player/PlayerPrefs;->b:Landroid/content/SharedPreferences$Editor;

    #v0=(Reference);
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    iget-object v0, p0, Lcom/unity3d/player/PlayerPrefs;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return v1
.end method

.method private SetString(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const/4 v1, 0x1

    #v1=(One);
    iget-object v0, p0, Lcom/unity3d/player/PlayerPrefs;->b:Landroid/content/SharedPreferences$Editor;

    #v0=(Reference);
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    iget-object v0, p0, Lcom/unity3d/player/PlayerPrefs;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return v1
.end method

.method private Sync()V
    .locals 2

    iget-object v0, p0, Lcom/unity3d/player/PlayerPrefs;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    :goto_0
    #v0=(Conflicted);
    return-void

    :cond_0
    #v0=(Boolean);
    iget-object v0, p0, Lcom/unity3d/player/PlayerPrefs;->b:Landroid/content/SharedPreferences$Editor;

    #v0=(Reference);
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_0
.end method

*/}
