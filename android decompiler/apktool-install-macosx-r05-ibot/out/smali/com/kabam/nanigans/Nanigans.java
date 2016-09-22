package com.kabam.nanigans; class Nanigans {/*

.class public Lcom/kabam/nanigans/Nanigans;
.super Ljava/lang/Object;
.source "Nanigans.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;
    }
.end annotation


# static fields
.field private static FB_APP_ID:Ljava/lang/String;


# instance fields
.field private mActivity:Landroid/app/Activity;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 33
    const-string v0, "FILL IN!"

    #v0=(Reference);
    sput-object v0, Lcom/kabam/nanigans/Nanigans;->FB_APP_ID:Ljava/lang/String;

    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1
    .parameter "activity"

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/kabam/nanigans/Nanigans;->mActivity:Landroid/app/Activity;

    .line 15
    iput-object p1, p0, Lcom/kabam/nanigans/Nanigans;->mActivity:Landroid/app/Activity;

    .line 16
    const-string v0, "256425107811295"

    #v0=(Reference);
    sput-object v0, Lcom/kabam/nanigans/Nanigans;->FB_APP_ID:Ljava/lang/String;

    .line 17
    return-void
.end method

.method static synthetic access$0()Ljava/lang/String;
    .locals 1

    .prologue
    .line 33
    sget-object v0, Lcom/kabam/nanigans/Nanigans;->FB_APP_ID:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method private trackNanigansEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .parameter "uid"
    .parameter "type"
    .parameter "name"

    .prologue
    .line 58
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/kabam/nanigans/Nanigans;->trackNanigansEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;)V

    .line 59
    return-void
.end method

.method private varargs trackNanigansEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;)V
    .locals 11
    .parameter "uid"
    .parameter "type"
    .parameter "name"
    .parameter "eventParameter"

    .prologue
    .line 80
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_1

    :cond_0
    #v0=(Conflicted);
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    #v0=(Reference);
    const-string v1, "TRACK EVENT ERROR: uid required"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 155
    :goto_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    return-void

    .line 81
    :cond_1
    #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_3

    :cond_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    #v0=(Reference);
    const-string v1, "TRACK EVENT ERROR: type required"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0

    .line 82
    :cond_3
    #v0=(Integer);v1=(Uninit);
    if-eqz p3, :cond_4

    invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_5

    :cond_4
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    #v0=(Reference);
    const-string v1, "TRACK EVENT ERROR: name required"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0

    .line 84
    :cond_5
    #v0=(Integer);v1=(Uninit);
    const/4 v7, 0x0

    .line 85
    .local v7, attributionId:Ljava/lang/String;
    #v7=(Null);
    const-string v0, "install"

    #v0=(Reference);
    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_6

    const-string v0, "visit"

    #v0=(Reference);
    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_a

    .line 87
    :cond_6
    :try_start_0
    iget-object v0, p0, Lcom/kabam/nanigans/Nanigans;->mActivity:Landroid/app/Activity;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "content://com.facebook.katana.provider.AttributionIdProvider"

    #v1=(Reference);
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 88
    const/4 v2, 0x1

    #v2=(One);
    new-array v2, v2, [Ljava/lang/String;

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    const-string v5, "aid"

    #v5=(Reference);
    aput-object v5, v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    #v4=(Null);
    const/4 v5, 0x0

    .line 87
    #v5=(Null);
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 89
    .local v8, c:Landroid/database/Cursor;
    #v8=(Reference);
    if-eqz v8, :cond_7

    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_8

    :cond_7
    #v0=(Conflicted);
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    #v0=(Reference);
    const-string v1, "TRACK EVENT ERROR: attribution id could not be found?!"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 92
    .end local v8           #c:Landroid/database/Cursor;
    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Reference);v8=(Conflicted);
    move-exception v9

    .line 93
    .local v9, e:Ljava/lang/Exception;
    #v9=(Reference);
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    #v0=(Reference);
    const-string v1, "Error getting FB attribution id!"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 94
    invoke-virtual {v9}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 90
    .end local v9           #e:Ljava/lang/Exception;
    .restart local v8       #c:Landroid/database/Cursor;
    :cond_8
    :try_start_1
    #v0=(Boolean);v2=(Reference);v3=(Null);v4=(Null);v5=(Null);v7=(Null);v8=(Reference);v9=(Uninit);
    const-string v0, "aid"

    #v0=(Reference);
    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 91
    #v7=(Reference);
    if-eqz v7, :cond_9

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_a

    :cond_9
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    #v0=(Reference);
    const-string v1, "TRACK EVENT : attribution is null/empty?!"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    .line 99
    .end local v8           #c:Landroid/database/Cursor;
    :cond_a
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);
    move-object v4, v7

    .line 100
    .local v4, attributionIdFinal:Ljava/lang/String;
    #v4=(Reference);
    new-instance v10, Ljava/lang/Thread;

    #v10=(UninitRef);
    new-instance v0, Lcom/kabam/nanigans/Nanigans$1;

    #v0=(UninitRef);
    move-object v1, p0

    #v1=(Reference);
    move-object v2, p4

    #v2=(Reference);
    move-object v3, p2

    #v3=(Reference);
    move-object v5, p1

    #v5=(Reference);
    move-object v6, p3

    #v6=(Reference);
    invoke-direct/range {v0 .. v6}, Lcom/kabam/nanigans/Nanigans$1;-><init>(Lcom/kabam/nanigans/Nanigans;[Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    #v0=(Reference);
    invoke-direct {v10, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 154
    #v10=(Reference);
    invoke-virtual {v10}, Ljava/lang/Thread;->start()V

    goto/16 :goto_0
.end method


# virtual methods
.method public TrackInstall(Ljava/lang/String;)V
    .locals 4
    .parameter "id"

    .prologue
    .line 24
    :try_start_0
    const-string v1, "install"

    #v1=(Reference);
    const-string v2, "FirstInstall"

    #v2=(Reference);
    invoke-direct {p0, p1, v1, v2}, Lcom/kabam/nanigans/Nanigans;->trackNanigansEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    const-string v1, "TrackInstall"

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "android native Nanigans TrackInstall id="

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    :goto_0
    #v0=(Conflicted);
    return-void

    .line 27
    :catch_0
    move-exception v0

    .line 29
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    const-string v1, "TrackInstall"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "error:android native Nanigans TrackInstall id="

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

*/}
