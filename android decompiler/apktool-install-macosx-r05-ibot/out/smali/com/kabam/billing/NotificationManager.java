package com.kabam.billing; class NotificationManager {/*

.class public Lcom/kabam/billing/NotificationManager;
.super Ljava/lang/Object;
.source "NotificationManager.java"


# static fields
.field private static sPass:Z


# instance fields
.field private mNotifications:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mStorage:Lcom/kabam/billing/NotificationStorage;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    const/4 v0, 0x1

    #v0=(One);
    sput-boolean v0, Lcom/kabam/billing/NotificationManager;->sPass:Z

    .line 13
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4
    .parameter "context"

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    #p0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    iput-object v1, p0, Lcom/kabam/billing/NotificationManager;->mStorage:Lcom/kabam/billing/NotificationStorage;

    .line 16
    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Lcom/kabam/billing/NotificationManager;->mNotifications:Ljava/util/List;

    .line 24
    :try_start_0
    new-instance v1, Lcom/kabam/billing/NotificationStorage;

    #v1=(UninitRef);
    invoke-direct {v1, p1}, Lcom/kabam/billing/NotificationStorage;-><init>(Landroid/content/Context;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/kabam/billing/NotificationManager;->mStorage:Lcom/kabam/billing/NotificationStorage;

    .line 26
    invoke-direct {p0}, Lcom/kabam/billing/NotificationManager;->CanPass()Z

    .line 27
    const/4 v1, 0x0

    #v1=(Null);
    sput-boolean v1, Lcom/kabam/billing/NotificationManager;->sPass:Z

    .line 28
    iget-object v1, p0, Lcom/kabam/billing/NotificationManager;->mStorage:Lcom/kabam/billing/NotificationStorage;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/kabam/billing/NotificationStorage;->Read()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/kabam/billing/NotificationManager;->mNotifications:Ljava/util/List;

    .line 29
    const/4 v1, 0x1

    #v1=(One);
    sput-boolean v1, Lcom/kabam/billing/NotificationManager;->sPass:Z

    .line 31
    const-string v1, "sPass construction"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    sget-boolean v3, Lcom/kabam/billing/NotificationManager;->sPass:Z

    #v3=(Boolean);
    invoke-static {v3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    .line 34
    :catch_0
    #v0=(Uninit);v1=(Conflicted);
    move-exception v0

    .line 36
    .local v0, e:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private CanPass()Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 42
    #v3=(One);
    const/4 v1, 0x1

    .line 45
    .local v1, pass:Z
    :cond_0
    #v0=(Conflicted);v1=(One);v2=(Conflicted);
    const/4 v0, 0x0

    .line 46
    .local v0, n:I
    #v0=(Null);
    sget-boolean v2, Lcom/kabam/billing/NotificationManager;->sPass:Z

    #v2=(Boolean);
    if-eqz v2, :cond_1

    .line 50
    :goto_0
    #v0=(Integer);v2=(PosShort);
    return v3

    .line 48
    :cond_1
    #v0=(Null);v2=(Boolean);
    add-int/lit8 v0, v0, 0x1

    .line 49
    #v0=(Integer);
    const/16 v2, 0x3e8

    #v2=(PosShort);
    if-le v0, v2, :cond_0

    goto :goto_0
.end method


# virtual methods
.method public Add(Ljava/lang/String;)Z
    .locals 5
    .parameter "notification"

    .prologue
    const/4 v4, 0x1

    .line 63
    :try_start_0
    #v4=(One);
    invoke-direct {p0}, Lcom/kabam/billing/NotificationManager;->CanPass()Z

    .line 65
    iget-object v1, p0, Lcom/kabam/billing/NotificationManager;->mNotifications:Ljava/util/List;

    #v1=(Reference);
    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    .line 67
    const/4 v1, 0x0

    #v1=(Null);
    sput-boolean v1, Lcom/kabam/billing/NotificationManager;->sPass:Z

    .line 68
    iget-object v1, p0, Lcom/kabam/billing/NotificationManager;->mNotifications:Ljava/util/List;

    #v1=(Reference);
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    iget-object v1, p0, Lcom/kabam/billing/NotificationManager;->mStorage:Lcom/kabam/billing/NotificationStorage;

    iget-object v2, p0, Lcom/kabam/billing/NotificationManager;->mNotifications:Ljava/util/List;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lcom/kabam/billing/NotificationStorage;->Write(Ljava/util/List;)V

    .line 70
    const/4 v1, 0x1

    #v1=(One);
    sput-boolean v1, Lcom/kabam/billing/NotificationManager;->sPass:Z

    .line 74
    :cond_0
    #v1=(Boolean);v2=(Conflicted);
    const-string v1, "sPass add"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    sget-boolean v3, Lcom/kabam/billing/NotificationManager;->sPass:Z

    #v3=(Boolean);
    invoke-static {v3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return v4

    .line 77
    :catch_0
    #v0=(Uninit);v1=(Conflicted);
    move-exception v0

    .line 79
    .local v0, e:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public GetNotifications()Ljava/util/List;
    .locals 1
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
    .line 57
    iget-object v0, p0, Lcom/kabam/billing/NotificationManager;->mNotifications:Ljava/util/List;

    #v0=(Reference);
    return-object v0
.end method

.method public Remove(Ljava/lang/String;)Z
    .locals 5
    .parameter "notification"

    .prologue
    const/4 v4, 0x1

    .line 89
    :try_start_0
    #v4=(One);
    invoke-direct {p0}, Lcom/kabam/billing/NotificationManager;->CanPass()Z

    .line 92
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    iget-object v1, p0, Lcom/kabam/billing/NotificationManager;->mNotifications:Ljava/util/List;

    #v1=(Reference);
    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    .line 101
    const-string v1, "sPass remove"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    sget-boolean v3, Lcom/kabam/billing/NotificationManager;->sPass:Z

    #v3=(Boolean);
    invoke-static {v3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 107
    :goto_1
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return v4

    .line 94
    :cond_0
    #v0=(Uninit);v1=(Boolean);v3=(Uninit);
    const/4 v1, 0x0

    #v1=(Null);
    sput-boolean v1, Lcom/kabam/billing/NotificationManager;->sPass:Z

    .line 95
    iget-object v1, p0, Lcom/kabam/billing/NotificationManager;->mNotifications:Ljava/util/List;

    #v1=(Reference);
    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 96
    iget-object v1, p0, Lcom/kabam/billing/NotificationManager;->mStorage:Lcom/kabam/billing/NotificationStorage;

    iget-object v2, p0, Lcom/kabam/billing/NotificationManager;->mNotifications:Ljava/util/List;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lcom/kabam/billing/NotificationStorage;->Write(Ljava/util/List;)V

    .line 97
    const/4 v1, 0x1

    #v1=(One);
    sput-boolean v1, Lcom/kabam/billing/NotificationManager;->sPass:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 103
    :catch_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    move-exception v0

    .line 105
    .local v0, e:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_1
.end method

.method public Show(Ljava/lang/String;)V
    .locals 6
    .parameter "tag"

    .prologue
    .line 113
    :try_start_0
    iget-object v3, p0, Lcom/kabam/billing/NotificationManager;->mNotifications:Ljava/util/List;

    #v3=(Reference);
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    .line 114
    .local v2, n:I
    #v2=(Integer);
    const/4 v1, 0x0

    .local v1, i:I
    :goto_0
    #v1=(Integer);v4=(Conflicted);v5=(Conflicted);
    if-lt v1, v2, :cond_0

    .line 124
    .end local v1           #i:I
    .end local v2           #n:I
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    .line 117
    .restart local v1       #i:I
    .restart local v2       #n:I
    :cond_0
    #v0=(Uninit);v1=(Integer);v2=(Integer);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    const-string v4, "show notifications "

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    const-string v5, "i="

    #v5=(Reference);
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, " "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v3, p0, Lcom/kabam/billing/NotificationManager;->mNotifications:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 120
    .end local v1           #i:I
    .end local v2           #n:I
    :catch_0
    move-exception v0

    .line 122
    .local v0, e:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3, v0}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    goto :goto_1
.end method

*/}
