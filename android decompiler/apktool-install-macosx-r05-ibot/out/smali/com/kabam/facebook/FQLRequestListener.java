package com.kabam.facebook; class FQLRequestListener {/*

.class public Lcom/kabam/facebook/FQLRequestListener;
.super Ljava/lang/Object;
.source "FQLRequestListener.java"

# interfaces
.implements Lcom/facebook/android/AsyncFacebookRunner$RequestListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onComplete(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3
    .parameter "response"
    .parameter "state"

    .prologue
    .line 24
    const-string v0, "fql "

    #v0=(Reference);
    const-string v1, "start"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    #v1=(Integer);
    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 26
    sget v0, Lcom/kabam/utility/constance/Constance;->Facebook:I

    #v0=(Integer);
    invoke-static {p1, v0}, Lcom/kabam/utility/UnitySender;->SendLoginInMessage(Ljava/lang/String;I)V

    .line 27
    const-string v0, "fql "

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "success response"

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    return-void
.end method

.method public onFacebookError(Lcom/facebook/android/FacebookError;Ljava/lang/Object;)V
    .locals 2
    .parameter "e"
    .parameter "state"

    .prologue
    .line 62
    invoke-virtual {p1}, Lcom/facebook/android/FacebookError;->getMessage()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    sget v1, Lcom/kabam/utility/constance/Constance;->Facebook:I

    #v1=(Integer);
    invoke-static {v0, v1}, Lcom/kabam/utility/UnitySender;->SendErrorMessage(Ljava/lang/String;I)V

    .line 63
    invoke-virtual {p1}, Lcom/facebook/android/FacebookError;->getMessage()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/kabam/utility/constance/Constance;->Facebook:I

    invoke-static {v0, v1}, Lcom/kabam/utility/UnitySender;->SendLoginFailedMessage(Ljava/lang/String;I)V

    .line 64
    return-void
.end method

.method public onFileNotFoundException(Ljava/io/FileNotFoundException;Ljava/lang/Object;)V
    .locals 2
    .parameter "e"
    .parameter "state"

    .prologue
    .line 43
    const-string v0, "fql "

    #v0=(Reference);
    const-string v1, "error"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    invoke-virtual {p1}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/kabam/utility/constance/Constance;->Facebook:I

    #v1=(Integer);
    invoke-static {v0, v1}, Lcom/kabam/utility/UnitySender;->SendErrorMessage(Ljava/lang/String;I)V

    .line 45
    invoke-virtual {p1}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/kabam/utility/constance/Constance;->Facebook:I

    invoke-static {v0, v1}, Lcom/kabam/utility/UnitySender;->SendLoginFailedMessage(Ljava/lang/String;I)V

    .line 46
    invoke-virtual {p1}, Ljava/io/FileNotFoundException;->printStackTrace()V

    .line 47
    return-void
.end method

.method public onIOException(Ljava/io/IOException;Ljava/lang/Object;)V
    .locals 2
    .parameter "e"
    .parameter "state"

    .prologue
    .line 33
    const-string v0, "fql "

    #v0=(Reference);
    const-string v1, "error"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/kabam/utility/constance/Constance;->Facebook:I

    #v1=(Integer);
    invoke-static {v0, v1}, Lcom/kabam/utility/UnitySender;->SendErrorMessage(Ljava/lang/String;I)V

    .line 35
    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/kabam/utility/constance/Constance;->Facebook:I

    invoke-static {v0, v1}, Lcom/kabam/utility/UnitySender;->SendLoginFailedMessage(Ljava/lang/String;I)V

    .line 36
    const-string v0, "fql "

    const-string v1, "success"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    .line 38
    return-void
.end method

.method public onMalformedURLException(Ljava/net/MalformedURLException;Ljava/lang/Object;)V
    .locals 2
    .parameter "e"
    .parameter "state"

    .prologue
    .line 52
    const-string v0, "fql "

    #v0=(Reference);
    const-string v1, "error"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    invoke-virtual {p1}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/kabam/utility/constance/Constance;->Facebook:I

    #v1=(Integer);
    invoke-static {v0, v1}, Lcom/kabam/utility/UnitySender;->SendErrorMessage(Ljava/lang/String;I)V

    .line 54
    invoke-virtual {p1}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/kabam/utility/constance/Constance;->Facebook:I

    invoke-static {v0, v1}, Lcom/kabam/utility/UnitySender;->SendLoginFailedMessage(Ljava/lang/String;I)V

    .line 55
    invoke-virtual {p1}, Ljava/net/MalformedURLException;->printStackTrace()V

    .line 57
    return-void
.end method

*/}
