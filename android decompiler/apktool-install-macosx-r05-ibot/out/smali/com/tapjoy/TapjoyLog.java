package com.tapjoy; class TapjoyLog {/*

.class public Lcom/tapjoy/TapjoyLog;
.super Ljava/lang/Object;
.source "TapjoyLog.java"


# static fields
.field private static final MAX_STRING_SIZE:I = 0x1000

.field private static showLog:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    const/4 v0, 0x0

    #v0=(Null);
    sput-boolean v0, Lcom/tapjoy/TapjoyLog;->showLog:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .parameter "tag"
    .parameter "msg"

    .prologue
    .line 83
    sget-boolean v0, Lcom/tapjoy/TapjoyLog;->showLog:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 84
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    :cond_0
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .parameter "tag"
    .parameter "msg"

    .prologue
    .line 61
    sget-boolean v0, Lcom/tapjoy/TapjoyLog;->showLog:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 62
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    :cond_0
    return-void
.end method

.method public static enableLogging(Z)V
    .locals 3
    .parameter "enable"

    .prologue
    .line 23
    const-string v0, "TapjoyLog"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "enableLogging: "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    sput-boolean p0, Lcom/tapjoy/TapjoyLog;->showLog:Z

    .line 25
    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .parameter "tag"
    .parameter "msg"

    .prologue
    .line 34
    sget-boolean v3, Lcom/tapjoy/TapjoyLog;->showLog:Z

    #v3=(Boolean);
    if-eqz v3, :cond_2

    .line 37
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    #v3=(Integer);
    const/16 v4, 0x1000

    #v4=(PosShort);
    if-le v3, v4, :cond_1

    .line 39
    const/4 v1, 0x0

    .local v1, i:I
    :goto_0
    #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Conflicted);
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    #v3=(Integer);
    div-int/lit16 v3, v3, 0x1000

    if-gt v1, v3, :cond_2

    .line 41
    mul-int/lit16 v2, v1, 0x1000

    .line 42
    .local v2, start:I
    #v2=(Integer);
    add-int/lit8 v3, v1, 0x1

    mul-int/lit16 v0, v3, 0x1000

    .line 43
    .local v0, end:I
    #v0=(Integer);
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-le v0, v3, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    .line 44
    :cond_0
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-static {p0, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 49
    .end local v0           #end:I
    .end local v1           #i:I
    .end local v2           #start:I
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Integer);
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    :cond_2
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
    return-void
.end method

.method public static v(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .parameter "tag"
    .parameter "msg"

    .prologue
    .line 94
    sget-boolean v0, Lcom/tapjoy/TapjoyLog;->showLog:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 95
    invoke-static {p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 96
    :cond_0
    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .parameter "tag"
    .parameter "msg"

    .prologue
    .line 72
    sget-boolean v0, Lcom/tapjoy/TapjoyLog;->showLog:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 73
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    :cond_0
    return-void
.end method

*/}
