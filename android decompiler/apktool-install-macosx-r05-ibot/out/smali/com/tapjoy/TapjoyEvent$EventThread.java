package com.tapjoy; class TapjoyEvent$EventThread {/*

.class public Lcom/tapjoy/TapjoyEvent$EventThread;
.super Ljava/lang/Object;
.source "TapjoyEvent.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tapjoy/TapjoyEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "EventThread"
.end annotation


# instance fields
.field private params:Ljava/lang/String;

.field final synthetic this$0:Lcom/tapjoy/TapjoyEvent;


# direct methods
.method public constructor <init>(Lcom/tapjoy/TapjoyEvent;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter "urlParams"

    .prologue
    .line 104
    iput-object p1, p0, Lcom/tapjoy/TapjoyEvent$EventThread;->this$0:Lcom/tapjoy/TapjoyEvent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    #p0=(Reference);
    iput-object p2, p0, Lcom/tapjoy/TapjoyEvent$EventThread;->params:Ljava/lang/String;

    .line 106
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 110
    invoke-static {}, Lcom/tapjoy/TapjoyEvent;->access$000()Lcom/tapjoy/TapjoyURLConnection;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "https://ws.tapjoyads.com/user_events?"

    #v2=(Reference);
    iget-object v3, p0, Lcom/tapjoy/TapjoyEvent$EventThread;->params:Ljava/lang/String;

    #v3=(Reference);
    const/4 v4, 0x1

    #v4=(One);
    invoke-virtual {v1, v2, v3, v4}, Lcom/tapjoy/TapjoyURLConnection;->getResponseFromURL(Ljava/lang/String;Ljava/lang/String;I)Lcom/tapjoy/TapjoyHttpURLResponse;

    move-result-object v0

    .line 112
    .local v0, httpResponse:Lcom/tapjoy/TapjoyHttpURLResponse;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 114
    iget v1, v0, Lcom/tapjoy/TapjoyHttpURLResponse;->statusCode:I

    #v1=(Integer);
    sparse-switch v1, :sswitch_data_0

    .line 128
    const-string v1, "Event"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "Server/network error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v0, Lcom/tapjoy/TapjoyHttpURLResponse;->statusCode:I

    #v3=(Integer);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    :goto_0
    #v3=(Conflicted);
    return-void

    .line 118
    :sswitch_0
    #v1=(Integer);v3=(Reference);
    const-string v1, "Event"

    #v1=(Reference);
    const-string v2, "Successfully sent Tapjoy event"

    invoke-static {v1, v2}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 124
    :sswitch_1
    #v1=(Integer);
    const-string v1, "Event"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "Error sending event: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v0, Lcom/tapjoy/TapjoyHttpURLResponse;->response:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 134
    :cond_0
    const-string v1, "Event"

    const-string v2, "Server/network error"

    invoke-static {v1, v2}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 114
    :sswitch_data_0
    .sparse-switch
        0xc8 -> :sswitch_0
        0x190 -> :sswitch_1
    .end sparse-switch
.end method

*/}