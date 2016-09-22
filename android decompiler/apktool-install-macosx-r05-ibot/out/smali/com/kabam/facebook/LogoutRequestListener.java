package com.kabam.facebook; class LogoutRequestListener {/*

.class public Lcom/kabam/facebook/LogoutRequestListener;
.super Ljava/lang/Object;
.source "LogoutRequestListener.java"

# interfaces
.implements Lcom/facebook/android/AsyncFacebookRunner$RequestListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onComplete(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2
    .parameter "response"
    .parameter "state"

    .prologue
    .line 21
    const-string v0, "logout "

    #v0=(Reference);
    const-string v1, "start"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    sget v0, Lcom/kabam/utility/constance/Constance;->Facebook:I

    #v0=(Integer);
    invoke-static {v0}, Lcom/kabam/utility/UnitySender;->SendLoginOutMessage(I)V

    .line 23
    const-string v0, "logout "

    #v0=(Reference);
    const-string v1, "success"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    return-void
.end method

.method public onFacebookError(Lcom/facebook/android/FacebookError;Ljava/lang/Object;)V
    .locals 2
    .parameter "e"
    .parameter "state"

    .prologue
    .line 54
    invoke-virtual {p1}, Lcom/facebook/android/FacebookError;->getMessage()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    sget v1, Lcom/kabam/utility/constance/Constance;->Facebook:I

    #v1=(Integer);
    invoke-static {v0, v1}, Lcom/kabam/utility/UnitySender;->SendErrorMessage(Ljava/lang/String;I)V

    .line 55
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    .line 56
    return-void
.end method

.method public onFileNotFoundException(Ljava/io/FileNotFoundException;Ljava/lang/Object;)V
    .locals 2
    .parameter "e"
    .parameter "state"

    .prologue
    .line 39
    invoke-virtual {p1}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    sget v1, Lcom/kabam/utility/constance/Constance;->Facebook:I

    #v1=(Integer);
    invoke-static {v0, v1}, Lcom/kabam/utility/UnitySender;->SendErrorMessage(Ljava/lang/String;I)V

    .line 40
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    .line 41
    return-void
.end method

.method public onIOException(Ljava/io/IOException;Ljava/lang/Object;)V
    .locals 2
    .parameter "e"
    .parameter "state"

    .prologue
    .line 30
    const-string v0, "logout "

    #v0=(Reference);
    const-string v1, "start"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/kabam/utility/constance/Constance;->Facebook:I

    #v1=(Integer);
    invoke-static {v0, v1}, Lcom/kabam/utility/UnitySender;->SendErrorMessage(Ljava/lang/String;I)V

    .line 32
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    .line 33
    return-void
.end method

.method public onMalformedURLException(Ljava/net/MalformedURLException;Ljava/lang/Object;)V
    .locals 2
    .parameter "e"
    .parameter "state"

    .prologue
    .line 46
    invoke-virtual {p1}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    sget v1, Lcom/kabam/utility/constance/Constance;->Facebook:I

    #v1=(Integer);
    invoke-static {v0, v1}, Lcom/kabam/utility/UnitySender;->SendErrorMessage(Ljava/lang/String;I)V

    .line 47
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kabam/utility/Provider;->OnLogException(Ljava/lang/Exception;)V

    .line 49
    return-void
.end method

*/}
