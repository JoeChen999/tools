package com.google.android.apps.analytics; class Event {/*

.class Lcom/google/android/apps/analytics/Event;
.super Ljava/lang/Object;


# static fields
.field static final INSTALL_EVENT_CATEGORY:Ljava/lang/String; = "__##GOOGLEINSTALL##__"

.field static final ITEM_CATEGORY:Ljava/lang/String; = "__##GOOGLEITEM##__"

.field static final PAGEVIEW_EVENT_CATEGORY:Ljava/lang/String; = "__##GOOGLEPAGEVIEW##__"

.field static final TRANSACTION_CATEGORY:Ljava/lang/String; = "__##GOOGLETRANSACTION##__"


# instance fields
.field final accountId:Ljava/lang/String;

.field final action:Ljava/lang/String;

.field private adHitId:I

.field private anonymizeIp:Z

.field final category:Ljava/lang/String;

.field customVariableBuffer:Lcom/google/android/apps/analytics/CustomVariableBuffer;

.field final eventId:J

.field private item:Lcom/google/android/apps/analytics/Item;

.field final label:Ljava/lang/String;

.field private randomVal:I

.field final screenHeight:I

.field final screenWidth:I

.field private timestampCurrent:I

.field private timestampFirst:I

.field private timestampPrevious:I

.field private transaction:Lcom/google/android/apps/analytics/Transaction;

.field private useServerTime:Z

.field private userId:I

.field final value:I

.field private visits:I


# direct methods
.method constructor <init>(JLjava/lang/String;IIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-wide p1, p0, Lcom/google/android/apps/analytics/Event;->eventId:J

    iput-object p3, p0, Lcom/google/android/apps/analytics/Event;->accountId:Ljava/lang/String;

    iput p4, p0, Lcom/google/android/apps/analytics/Event;->randomVal:I

    iput p5, p0, Lcom/google/android/apps/analytics/Event;->timestampFirst:I

    iput p6, p0, Lcom/google/android/apps/analytics/Event;->timestampPrevious:I

    iput p7, p0, Lcom/google/android/apps/analytics/Event;->timestampCurrent:I

    iput p8, p0, Lcom/google/android/apps/analytics/Event;->visits:I

    iput-object p9, p0, Lcom/google/android/apps/analytics/Event;->category:Ljava/lang/String;

    iput-object p10, p0, Lcom/google/android/apps/analytics/Event;->action:Ljava/lang/String;

    iput-object p11, p0, Lcom/google/android/apps/analytics/Event;->label:Ljava/lang/String;

    iput p12, p0, Lcom/google/android/apps/analytics/Event;->value:I

    iput p14, p0, Lcom/google/android/apps/analytics/Event;->screenHeight:I

    iput p13, p0, Lcom/google/android/apps/analytics/Event;->screenWidth:I

    const/4 v0, -0x1

    #v0=(Byte);
    iput v0, p0, Lcom/google/android/apps/analytics/Event;->userId:I

    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/google/android/apps/analytics/Event;->useServerTime:Z

    return-void
.end method

.method constructor <init>(Lcom/google/android/apps/analytics/Event;Ljava/lang/String;)V
    .locals 16

    move-object/from16 v0, p1

    #v0=(Reference);
    iget-wide v2, v0, Lcom/google/android/apps/analytics/Event;->eventId:J

    #v2=(LongLo);v3=(LongHi);
    move-object/from16 v0, p1

    iget v5, v0, Lcom/google/android/apps/analytics/Event;->randomVal:I

    #v5=(Integer);
    move-object/from16 v0, p1

    iget v6, v0, Lcom/google/android/apps/analytics/Event;->timestampFirst:I

    #v6=(Integer);
    move-object/from16 v0, p1

    iget v7, v0, Lcom/google/android/apps/analytics/Event;->timestampPrevious:I

    #v7=(Integer);
    move-object/from16 v0, p1

    iget v8, v0, Lcom/google/android/apps/analytics/Event;->timestampCurrent:I

    #v8=(Integer);
    move-object/from16 v0, p1

    iget v9, v0, Lcom/google/android/apps/analytics/Event;->visits:I

    #v9=(Integer);
    move-object/from16 v0, p1

    iget-object v10, v0, Lcom/google/android/apps/analytics/Event;->category:Ljava/lang/String;

    #v10=(Reference);
    move-object/from16 v0, p1

    iget-object v11, v0, Lcom/google/android/apps/analytics/Event;->action:Ljava/lang/String;

    #v11=(Reference);
    move-object/from16 v0, p1

    iget-object v12, v0, Lcom/google/android/apps/analytics/Event;->label:Ljava/lang/String;

    #v12=(Reference);
    move-object/from16 v0, p1

    iget v13, v0, Lcom/google/android/apps/analytics/Event;->value:I

    #v13=(Integer);
    move-object/from16 v0, p1

    iget v14, v0, Lcom/google/android/apps/analytics/Event;->screenWidth:I

    #v14=(Integer);
    move-object/from16 v0, p1

    iget v15, v0, Lcom/google/android/apps/analytics/Event;->screenHeight:I

    #v15=(Integer);
    move-object/from16 v1, p0

    #v1=(UninitThis);
    move-object/from16 v4, p2

    #v4=(Reference);
    invoke-direct/range {v1 .. v15}, Lcom/google/android/apps/analytics/Event;-><init>(JLjava/lang/String;IIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V

    #v1=(Reference);p0=(Reference);
    move-object/from16 v0, p1

    iget v1, v0, Lcom/google/android/apps/analytics/Event;->adHitId:I

    #v1=(Integer);
    move-object/from16 v0, p0

    iput v1, v0, Lcom/google/android/apps/analytics/Event;->adHitId:I

    move-object/from16 v0, p1

    iget v1, v0, Lcom/google/android/apps/analytics/Event;->userId:I

    move-object/from16 v0, p0

    iput v1, v0, Lcom/google/android/apps/analytics/Event;->userId:I

    move-object/from16 v0, p1

    iget-boolean v1, v0, Lcom/google/android/apps/analytics/Event;->anonymizeIp:Z

    #v1=(Boolean);
    move-object/from16 v0, p0

    iput-boolean v1, v0, Lcom/google/android/apps/analytics/Event;->anonymizeIp:Z

    move-object/from16 v0, p1

    iget-boolean v1, v0, Lcom/google/android/apps/analytics/Event;->useServerTime:Z

    move-object/from16 v0, p0

    iput-boolean v1, v0, Lcom/google/android/apps/analytics/Event;->useServerTime:Z

    move-object/from16 v0, p1

    iget-object v1, v0, Lcom/google/android/apps/analytics/Event;->customVariableBuffer:Lcom/google/android/apps/analytics/CustomVariableBuffer;

    #v1=(Reference);
    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/google/android/apps/analytics/Event;->customVariableBuffer:Lcom/google/android/apps/analytics/CustomVariableBuffer;

    move-object/from16 v0, p1

    iget-object v1, v0, Lcom/google/android/apps/analytics/Event;->transaction:Lcom/google/android/apps/analytics/Transaction;

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/google/android/apps/analytics/Event;->transaction:Lcom/google/android/apps/analytics/Transaction;

    move-object/from16 v0, p1

    iget-object v1, v0, Lcom/google/android/apps/analytics/Event;->item:Lcom/google/android/apps/analytics/Item;

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/google/android/apps/analytics/Event;->item:Lcom/google/android/apps/analytics/Item;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V
    .locals 15

    const-wide/16 v1, -0x1

    #v1=(LongLo);v2=(LongHi);
    const/4 v4, -0x1

    #v4=(Byte);
    const/4 v5, -0x1

    #v5=(Byte);
    const/4 v6, -0x1

    #v6=(Byte);
    const/4 v7, -0x1

    #v7=(Byte);
    const/4 v8, -0x1

    #v8=(Byte);
    move-object v0, p0

    #v0=(UninitThis);
    move-object/from16 v3, p1

    #v3=(Reference);
    move-object/from16 v9, p2

    #v9=(Reference);
    move-object/from16 v10, p3

    #v10=(Reference);
    move-object/from16 v11, p4

    #v11=(Reference);
    move/from16 v12, p5

    #v12=(Integer);
    move/from16 v13, p6

    #v13=(Integer);
    move/from16 v14, p7

    #v14=(Integer);
    invoke-direct/range {v0 .. v14}, Lcom/google/android/apps/analytics/Event;-><init>(JLjava/lang/String;IIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V

    #v0=(Reference);p0=(Reference);
    return-void
.end method


# virtual methods
.method getAdHitId()I
    .locals 1

    iget v0, p0, Lcom/google/android/apps/analytics/Event;->adHitId:I

    #v0=(Integer);
    return v0
.end method

.method getAnonymizeIp()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/apps/analytics/Event;->anonymizeIp:Z

    #v0=(Boolean);
    return v0
.end method

.method public getCustomVariableBuffer()Lcom/google/android/apps/analytics/CustomVariableBuffer;
    .locals 1

    iget-object v0, p0, Lcom/google/android/apps/analytics/Event;->customVariableBuffer:Lcom/google/android/apps/analytics/CustomVariableBuffer;

    #v0=(Reference);
    return-object v0
.end method

.method public getItem()Lcom/google/android/apps/analytics/Item;
    .locals 1

    iget-object v0, p0, Lcom/google/android/apps/analytics/Event;->item:Lcom/google/android/apps/analytics/Item;

    #v0=(Reference);
    return-object v0
.end method

.method getRandomVal()I
    .locals 1

    iget v0, p0, Lcom/google/android/apps/analytics/Event;->randomVal:I

    #v0=(Integer);
    return v0
.end method

.method getTimestampCurrent()I
    .locals 1

    iget v0, p0, Lcom/google/android/apps/analytics/Event;->timestampCurrent:I

    #v0=(Integer);
    return v0
.end method

.method getTimestampFirst()I
    .locals 1

    iget v0, p0, Lcom/google/android/apps/analytics/Event;->timestampFirst:I

    #v0=(Integer);
    return v0
.end method

.method getTimestampPrevious()I
    .locals 1

    iget v0, p0, Lcom/google/android/apps/analytics/Event;->timestampPrevious:I

    #v0=(Integer);
    return v0
.end method

.method public getTransaction()Lcom/google/android/apps/analytics/Transaction;
    .locals 1

    iget-object v0, p0, Lcom/google/android/apps/analytics/Event;->transaction:Lcom/google/android/apps/analytics/Transaction;

    #v0=(Reference);
    return-object v0
.end method

.method getUseServerTime()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/apps/analytics/Event;->useServerTime:Z

    #v0=(Boolean);
    return v0
.end method

.method getUserId()I
    .locals 1

    iget v0, p0, Lcom/google/android/apps/analytics/Event;->userId:I

    #v0=(Integer);
    return v0
.end method

.method getVisits()I
    .locals 1

    iget v0, p0, Lcom/google/android/apps/analytics/Event;->visits:I

    #v0=(Integer);
    return v0
.end method

.method public isSessionInitialized()Z
    .locals 2

    iget v0, p0, Lcom/google/android/apps/analytics/Event;->timestampFirst:I

    #v0=(Integer);
    const/4 v1, -0x1

    #v1=(Byte);
    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method setAdHitId(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/apps/analytics/Event;->adHitId:I

    return-void
.end method

.method setAnonymizeIp(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/apps/analytics/Event;->anonymizeIp:Z

    return-void
.end method

.method public setCustomVariableBuffer(Lcom/google/android/apps/analytics/CustomVariableBuffer;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/apps/analytics/Event;->customVariableBuffer:Lcom/google/android/apps/analytics/CustomVariableBuffer;

    return-void
.end method

.method public setItem(Lcom/google/android/apps/analytics/Item;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/apps/analytics/Event;->category:Ljava/lang/String;

    #v0=(Reference);
    const-string v1, "__##GOOGLEITEM##__"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    #v0=(UninitRef);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "Attempted to add an item to an event of type "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/apps/analytics/Event;->category:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_0
    #v0=(Boolean);v2=(Uninit);
    iput-object p1, p0, Lcom/google/android/apps/analytics/Event;->item:Lcom/google/android/apps/analytics/Item;

    return-void
.end method

.method setRandomVal(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/apps/analytics/Event;->randomVal:I

    return-void
.end method

.method setTimestampCurrent(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/apps/analytics/Event;->timestampCurrent:I

    return-void
.end method

.method setTimestampFirst(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/apps/analytics/Event;->timestampFirst:I

    return-void
.end method

.method setTimestampPrevious(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/apps/analytics/Event;->timestampPrevious:I

    return-void
.end method

.method public setTransaction(Lcom/google/android/apps/analytics/Transaction;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/apps/analytics/Event;->category:Ljava/lang/String;

    #v0=(Reference);
    const-string v1, "__##GOOGLETRANSACTION##__"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    #v0=(UninitRef);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "Attempted to add a transction to an event of type "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/apps/analytics/Event;->category:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_0
    #v0=(Boolean);v2=(Uninit);
    iput-object p1, p0, Lcom/google/android/apps/analytics/Event;->transaction:Lcom/google/android/apps/analytics/Transaction;

    return-void
.end method

.method setUseServerTime(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/apps/analytics/Event;->useServerTime:Z

    return-void
.end method

.method setUserId(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/apps/analytics/Event;->userId:I

    return-void
.end method

.method setVisits(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/apps/analytics/Event;->visits:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, "id:"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/google/android/apps/analytics/Event;->eventId:J

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "random:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/google/android/apps/analytics/Event;->randomVal:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "timestampCurrent:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/google/android/apps/analytics/Event;->timestampCurrent:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "timestampPrevious:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/google/android/apps/analytics/Event;->timestampPrevious:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "timestampFirst:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/google/android/apps/analytics/Event;->timestampFirst:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "visits:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/google/android/apps/analytics/Event;->visits:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "value:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/google/android/apps/analytics/Event;->value:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "category:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/apps/analytics/Event;->category:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "action:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/apps/analytics/Event;->action:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "label:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/apps/analytics/Event;->label:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "width:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/google/android/apps/analytics/Event;->screenWidth:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "height:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/google/android/apps/analytics/Event;->screenHeight:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

*/}
