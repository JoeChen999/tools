package com.kabam.facebook; class AppRequestListener {/*

.class public Lcom/kabam/facebook/AppRequestListener;
.super Ljava/lang/Object;
.source "AppRequestListener.java"

# interfaces
.implements Lcom/facebook/android/Facebook$DialogListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 2

    .prologue
    .line 74
    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {v0}, Lcom/kabam/utility/UnitySender;->SendLockScreen(Z)V

    .line 75
    const-string v0, "cancel message"

    #v0=(Reference);
    const-string v1, "success"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    return-void
.end method

.method public onComplete(Landroid/os/Bundle;)V
    .locals 7
    .parameter "values"

    .prologue
    .line 29
    const-string v4, "send message"

    #v4=(Reference);
    const-string v5, "start"

    #v5=(Reference);
    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    const/4 v4, 0x0

    #v4=(Null);
    invoke-static {v4}, Lcom/kabam/utility/UnitySender;->SendLockScreen(Z)V

    .line 33
    const/4 v0, 0x0

    .line 34
    .local v0, i:I
    #v0=(Null);
    invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v1

    .line 35
    .local v1, keys:Ljava/util/Set;,"Ljava/util/Set<Ljava/lang/String;>;"
    #v1=(Reference);
    if-nez v1, :cond_1

    .line 53
    :cond_0
    :goto_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
    return-void

    .line 36
    :cond_1
    #v2=(Uninit);v3=(Uninit);v4=(Null);v6=(Uninit);
    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v4

    #v4=(Integer);
    if-lez v4, :cond_0

    .line 38
    const-string v4, "onComplete"

    #v4=(Reference);
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    const-string v6, "keys.size()="

    #v6=(Reference);
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v6

    #v6=(Integer);
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    const-string v2, ""

    .line 40
    .local v2, result:Ljava/lang/String;
    #v2=(Reference);
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_1
    #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    #v5=(Boolean);
    if-nez v5, :cond_3

    .line 50
    sget v4, Lcom/kabam/utility/constance/Constance;->Facebook:I

    #v4=(Integer);
    invoke-static {v2, v4}, Lcom/kabam/utility/UnitySender;->SendAfterInviteMessage(Ljava/lang/String;I)V

    .line 52
    const-string v4, "send message"

    #v4=(Reference);
    const-string v5, "success"

    #v5=(Reference);
    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 40
    :cond_3
    #v5=(Boolean);
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Ljava/lang/String;

    .line 42
    .local v3, s:Ljava/lang/String;
    const-string v5, ""

    #v5=(Reference);
    if-eq v2, v5, :cond_4

    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    #v6=(Reference);
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    const-string v6, ","

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 43
    :cond_4
    #v6=(Conflicted);
    if-eqz v3, :cond_2

    const-string v5, "to"

    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    #v5=(Boolean);
    if-eqz v5, :cond_2

    .line 45
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    #v6=(Reference);
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    invoke-virtual {p1, v3}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1
.end method

.method public onError(Lcom/facebook/android/DialogError;)V
    .locals 2
    .parameter "e"

    .prologue
    .line 66
    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {v0}, Lcom/kabam/utility/UnitySender;->SendLockScreen(Z)V

    .line 67
    invoke-virtual {p1}, Lcom/facebook/android/DialogError;->getMessage()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    sget v1, Lcom/kabam/utility/constance/Constance;->Facebook:I

    #v1=(Integer);
    invoke-static {v0, v1}, Lcom/kabam/utility/UnitySender;->SendErrorMessage(Ljava/lang/String;I)V

    .line 68
    invoke-virtual {p1}, Lcom/facebook/android/DialogError;->printStackTrace()V

    .line 69
    return-void
.end method

.method public onFacebookError(Lcom/facebook/android/FacebookError;)V
    .locals 2
    .parameter "e"

    .prologue
    .line 58
    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {v0}, Lcom/kabam/utility/UnitySender;->SendLockScreen(Z)V

    .line 59
    invoke-virtual {p1}, Lcom/facebook/android/FacebookError;->getMessage()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    sget v1, Lcom/kabam/utility/constance/Constance;->Facebook:I

    #v1=(Integer);
    invoke-static {v0, v1}, Lcom/kabam/utility/UnitySender;->SendErrorMessage(Ljava/lang/String;I)V

    .line 60
    invoke-virtual {p1}, Lcom/facebook/android/FacebookError;->printStackTrace()V

    .line 61
    return-void
.end method

*/}
