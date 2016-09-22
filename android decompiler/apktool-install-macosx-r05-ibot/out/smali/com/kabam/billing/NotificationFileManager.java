package com.kabam.billing; class NotificationFileManager {/*

.class public Lcom/kabam/billing/NotificationFileManager;
.super Ljava/lang/Object;
.source "NotificationFileManager.java"


# instance fields
.field private mContext:Landroid/content/Context;

.field private mFile:Ljava/io/File;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .parameter "context"

    .prologue
    const/4 v1, 0x0

    .line 24
    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    #p0=(Reference);
    iput-object v1, p0, Lcom/kabam/billing/NotificationFileManager;->mContext:Landroid/content/Context;

    .line 22
    iput-object v1, p0, Lcom/kabam/billing/NotificationFileManager;->mFile:Ljava/io/File;

    .line 29
    if-nez p1, :cond_0

    .line 30
    :try_start_0
    const-string v1, "NotificationFileManager construction "

    #v1=(Reference);
    const-string v2, "Context is null"

    #v2=(Reference);
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    :cond_0
    #v2=(Conflicted);
    iput-object p1, p0, Lcom/kabam/billing/NotificationFileManager;->mContext:Landroid/content/Context;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    :goto_0
    #v0=(Conflicted);
    return-void

    .line 35
    :catch_0
    #v0=(Uninit);
    move-exception v0

    .line 38
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method private GetFolderName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 44
    const-string v0, "CamelotTemp"

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public Read()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 93
    const-string v0, ""

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/kabam/billing/NotificationFileManager;->Read(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public Read(Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .parameter "fileName"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 65
    if-eqz p1, :cond_0

    const-string v5, ""

    #v5=(Reference);
    if-ne p1, v5, :cond_1

    .line 66
    :cond_0
    #v5=(Conflicted);
    invoke-direct {p0}, Lcom/kabam/billing/NotificationFileManager;->GetFolderName()Ljava/lang/String;

    move-result-object p1

    .line 68
    :cond_1
    const/4 v5, 0x1

    #v5=(One);
    new-array v0, v5, [B

    .line 71
    .local v0, buffer:[B
    #v0=(Reference);
    iget-object v5, p0, Lcom/kabam/billing/NotificationFileManager;->mContext:Landroid/content/Context;

    #v5=(Reference);
    if-nez v5, :cond_2

    .line 72
    const-string v5, "Read "

    const-string v6, "Context is null"

    #v6=(Reference);
    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    :cond_2
    #v6=(Conflicted);
    iget-object v5, p0, Lcom/kabam/billing/NotificationFileManager;->mContext:Landroid/content/Context;

    invoke-virtual {v5, p1}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v2

    .line 75
    .local v2, inputStream:Ljava/io/FileInputStream;
    #v2=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .local v1, builder:Ljava/lang/StringBuilder;
    :goto_0
    #v1=(Reference);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    invoke-virtual {v2, v0}, Ljava/io/FileInputStream;->read([B)I

    move-result v3

    .line 81
    .local v3, response:I
    #v3=(Integer);
    const/4 v5, -0x1

    #v5=(Byte);
    if-ne v3, v5, :cond_3

    .line 87
    const-string v5, "NotificationFileManager Read content "

    #v5=(Reference);
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    const-string v7, "content="

    #v7=(Reference);
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v6=(Reference);
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    .line 89
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    return-object v5

    .line 82
    :cond_3
    #v5=(Byte);v6=(Conflicted);v7=(Uninit);
    new-instance v4, Ljava/lang/String;

    #v4=(UninitRef);
    invoke-direct {v4, v0}, Ljava/lang/String;-><init>([B)V

    .line 83
    .local v4, temp:Ljava/lang/String;
    #v4=(Reference);
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method public Write(Ljava/lang/String;)V
    .locals 1
    .parameter "content"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 50
    const-string v0, ""

    #v0=(Reference);
    invoke-virtual {p0, p1, v0}, Lcom/kabam/billing/NotificationFileManager;->Write(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    return-void
.end method

.method public Write(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .parameter "content"
    .parameter "fileName"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 54
    iget-object v1, p0, Lcom/kabam/billing/NotificationFileManager;->mContext:Landroid/content/Context;

    #v1=(Reference);
    if-nez v1, :cond_0

    .line 62
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    .line 56
    :cond_0
    #v0=(Uninit);v2=(Uninit);v3=(Uninit);
    const-string v1, "NotificationFileManager Write content "

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "content="

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    if-eqz p2, :cond_1

    const-string v1, ""

    if-ne p2, v1, :cond_2

    .line 58
    :cond_1
    invoke-direct {p0}, Lcom/kabam/billing/NotificationFileManager;->GetFolderName()Ljava/lang/String;

    move-result-object p2

    .line 59
    :cond_2
    iget-object v1, p0, Lcom/kabam/billing/NotificationFileManager;->mContext:Landroid/content/Context;

    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v1, p2, v2}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v0

    .line 60
    .local v0, outStream:Ljava/io/FileOutputStream;
    #v0=(Reference);
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/FileOutputStream;->write([B)V

    .line 61
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    goto :goto_0
.end method

*/}
