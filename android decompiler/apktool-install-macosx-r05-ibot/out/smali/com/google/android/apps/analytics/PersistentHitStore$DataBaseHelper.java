package com.google.android.apps.analytics; class PersistentHitStore$DataBaseHelper {/*

.class Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;
.super Landroid/database/sqlite/SQLiteOpenHelper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/apps/analytics/PersistentHitStore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "DataBaseHelper"
.end annotation


# instance fields
.field private final databaseVersion:I

.field private final store:Lcom/google/android/apps/analytics/PersistentHitStore;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/apps/analytics/PersistentHitStore;)V
    .locals 2

    const-string v0, "google_analytics.db"

    #v0=(Reference);
    const/4 v1, 0x5

    #v1=(PosByte);
    invoke-direct {p0, p1, v0, v1, p2}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;-><init>(Landroid/content/Context;Ljava/lang/String;ILcom/google/android/apps/analytics/PersistentHitStore;)V

    #p0=(Reference);
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/lang/String;ILcom/google/android/apps/analytics/PersistentHitStore;)V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, p2, v0, p3}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    #p0=(Reference);
    iput p3, p0, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->databaseVersion:I

    iput-object p4, p0, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->store:Lcom/google/android/apps/analytics/PersistentHitStore;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/apps/analytics/PersistentHitStore;)V
    .locals 1

    const/4 v0, 0x5

    #v0=(PosByte);
    invoke-direct {p0, p1, p2, v0, p3}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;-><init>(Landroid/content/Context;Ljava/lang/String;ILcom/google/android/apps/analytics/PersistentHitStore;)V

    #p0=(Reference);
    return-void
.end method

.method private createECommerceTables(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    const-string v0, "DROP TABLE IF EXISTS transaction_events;"

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/apps/analytics/PersistentHitStore;->access$400()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS item_events;"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/apps/analytics/PersistentHitStore;->access$500()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method private createHitTable(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    const-string v0, "DROP TABLE IF EXISTS hits;"

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/apps/analytics/PersistentHitStore;->access$600()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method private createReferrerTable(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    const-string v0, "DROP TABLE IF EXISTS referrer;"

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS referrer (referrer TEXT PRIMARY KEY NOT NULL,timestamp_referrer INTEGER NOT NULL,referrer_visit INTEGER NOT NULL DEFAULT 1,referrer_index INTEGER NOT NULL DEFAULT 1);"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method private fixReferrerTable(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 12

    const/4 v11, -0x1

    #v11=(Byte);
    const/4 v10, 0x0

    #v10=(Null);
    const/4 v8, 0x1

    #v8=(One);
    const/4 v9, 0x0

    :try_start_0
    #v9=(Null);
    const-string v1, "referrer"

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v4, 0x0

    #v4=(Null);
    const/4 v5, 0x0

    #v5=(Null);
    const/4 v6, 0x0

    #v6=(Null);
    const/4 v7, 0x0

    #v7=(Null);
    move-object v0, p1

    #v0=(Reference);
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    :try_start_1
    #v6=(Reference);
    invoke-interface {v6}, Landroid/database/Cursor;->getColumnNames()[Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    move v2, v10

    move v0, v10

    #v0=(Null);
    move v1, v10

    :goto_0
    #v0=(Boolean);v1=(Boolean);v2=(Integer);v4=(Boolean);v5=(Reference);
    array-length v4, v3

    #v4=(Integer);
    if-ge v2, v4, :cond_2

    aget-object v4, v3, v2

    #v4=(Null);
    const-string v5, "referrer_index"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_1

    move v1, v8

    :cond_0
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    aget-object v4, v3, v2

    #v4=(Null);
    const-string v5, "referrer_visit"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_0

    move v0, v8

    #v0=(One);
    goto :goto_1

    :cond_2
    #v0=(Boolean);v4=(Integer);
    if-eqz v1, :cond_3

    if-nez v0, :cond_5

    :cond_3
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_d

    const-string v0, "referrer_visit"

    #v0=(Reference);
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    const-string v0, "referrer_index"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    #v5=(Integer);
    new-instance v0, Lcom/google/android/apps/analytics/Referrer;

    #v0=(UninitRef);
    const-string v1, "referrer"

    #v1=(Reference);
    invoke-interface {v6, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    invoke-interface {v6, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "timestamp_referrer"

    #v2=(Reference);
    invoke-interface {v6, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    invoke-interface {v6, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    if-ne v4, v11, :cond_8

    move v4, v8

    :goto_2
    if-ne v5, v11, :cond_9

    move v5, v8

    :goto_3
    invoke-direct/range {v0 .. v5}, Lcom/google/android/apps/analytics/Referrer;-><init>(Ljava/lang/String;JII)V

    :goto_4
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    invoke-direct {p0, p1}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->createReferrerTable(Landroid/database/sqlite/SQLiteDatabase;)V

    if-eqz v0, :cond_4

    new-instance v1, Landroid/content/ContentValues;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    #v1=(Reference);
    const-string v2, "referrer"

    #v2=(Reference);
    invoke-virtual {v0}, Lcom/google/android/apps/analytics/Referrer;->getReferrerString()Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "timestamp_referrer"

    invoke-virtual {v0}, Lcom/google/android/apps/analytics/Referrer;->getTimeStamp()J

    move-result-wide v3

    #v3=(LongLo);v4=(LongHi);
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v2, "referrer_visit"

    invoke-virtual {v0}, Lcom/google/android/apps/analytics/Referrer;->getVisit()I

    move-result v3

    #v3=(Integer);
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "referrer_index"

    invoke-virtual {v0}, Lcom/google/android/apps/analytics/Referrer;->getIndex()I

    move-result v0

    #v0=(Integer);
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v0, "referrer"

    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {p1, v0, v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    :cond_4
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_5
    #v0=(Conflicted);
    if-eqz v6, :cond_6

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    :cond_6
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_7

    invoke-static {p1}, Lcom/google/android/apps/analytics/PersistentHitStore;->access$900(Landroid/database/sqlite/SQLiteDatabase;)Z

    :cond_7
    :goto_5
    #v6=(Conflicted);v7=(Conflicted);
    return-void

    :cond_8
    :try_start_2
    #v0=(UninitRef);v1=(Reference);v2=(LongLo);v3=(LongHi);v4=(Integer);v5=(Integer);v6=(Reference);v7=(Null);
    invoke-interface {v6, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    goto :goto_2

    :cond_9
    invoke-interface {v6, v5}, Landroid/database/Cursor;->getInt(I)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1

    move-result v5

    goto :goto_3

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v1, v9

    :goto_6
    :try_start_3
    #v1=(Reference);
    const-string v2, "GoogleAnalyticsTracker"

    #v2=(Reference);
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v1, :cond_a

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_a
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_7

    invoke-static {p1}, Lcom/google/android/apps/analytics/PersistentHitStore;->access$900(Landroid/database/sqlite/SQLiteDatabase;)Z

    goto :goto_5

    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v6, v9

    :goto_7
    #v6=(Reference);
    if-eqz v6, :cond_b

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    :cond_b
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_c

    invoke-static {p1}, Lcom/google/android/apps/analytics/PersistentHitStore;->access$900(Landroid/database/sqlite/SQLiteDatabase;)Z

    :cond_c
    throw v0

    :catchall_1
    #v0=(Conflicted);v1=(Conflicted);v7=(Null);
    move-exception v0

    #v0=(Reference);
    goto :goto_7

    :catchall_2
    #v1=(Reference);v6=(Conflicted);v7=(Conflicted);
    move-exception v0

    move-object v6, v1

    #v6=(Reference);
    goto :goto_7

    :catch_1
    #v0=(Conflicted);v1=(Conflicted);v7=(Null);
    move-exception v0

    #v0=(Reference);
    move-object v1, v6

    #v1=(Reference);
    goto :goto_6

    :cond_d
    #v0=(Boolean);v1=(Boolean);v2=(Integer);v3=(Reference);v4=(Integer);v5=(Reference);
    move-object v0, v9

    #v0=(Null);
    goto/16 :goto_4
.end method

.method private migrateEventsToHits(Landroid/database/sqlite/SQLiteDatabase;I)V
    .locals 5

    const/4 v1, 0x0

    #v1=(Null);
    iget-object v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->store:Lcom/google/android/apps/analytics/PersistentHitStore;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/google/android/apps/analytics/PersistentHitStore;->loadExistingSession(Landroid/database/sqlite/SQLiteDatabase;)V

    iget-object v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->store:Lcom/google/android/apps/analytics/PersistentHitStore;

    iget-object v2, p0, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->store:Lcom/google/android/apps/analytics/PersistentHitStore;

    #v2=(Reference);
    invoke-virtual {v2, p1}, Lcom/google/android/apps/analytics/PersistentHitStore;->getVisitorVarBuffer(Landroid/database/sqlite/SQLiteDatabase;)Lcom/google/android/apps/analytics/CustomVariableBuffer;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/android/apps/analytics/PersistentHitStore;->access$702(Lcom/google/android/apps/analytics/PersistentHitStore;Lcom/google/android/apps/analytics/CustomVariableBuffer;)Lcom/google/android/apps/analytics/CustomVariableBuffer;

    iget-object v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->store:Lcom/google/android/apps/analytics/PersistentHitStore;

    const/16 v2, 0x3e8

    #v2=(PosShort);
    invoke-virtual {v0, v2, p1, p2}, Lcom/google/android/apps/analytics/PersistentHitStore;->peekEvents(ILandroid/database/sqlite/SQLiteDatabase;I)[Lcom/google/android/apps/analytics/Event;

    move-result-object v2

    #v2=(Reference);
    move v0, v1

    :goto_0
    #v0=(Integer);v3=(Conflicted);v4=(Conflicted);
    array-length v3, v2

    #v3=(Integer);
    if-ge v0, v3, :cond_0

    iget-object v3, p0, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->store:Lcom/google/android/apps/analytics/PersistentHitStore;

    #v3=(Reference);
    aget-object v4, v2, v0

    #v4=(Null);
    invoke-static {v3, v4, p1, v1}, Lcom/google/android/apps/analytics/PersistentHitStore;->access$800(Lcom/google/android/apps/analytics/PersistentHitStore;Lcom/google/android/apps/analytics/Event;Landroid/database/sqlite/SQLiteDatabase;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    #v3=(Integer);v4=(Conflicted);
    const-string v0, "DELETE from events;"

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "DELETE from item_events;"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "DELETE from transaction_events;"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "DELETE from custom_variables;"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method private migratePreV4Referrer(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 13

    const/4 v8, 0x0

    :try_start_0
    #v8=(Null);
    const-string v1, "install_referrer"

    #v1=(Reference);
    const/4 v0, 0x1

    #v0=(One);
    new-array v2, v0, [Ljava/lang/String;

    #v2=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    const-string v3, "referrer"

    #v3=(Reference);
    aput-object v3, v2, v0

    const/4 v3, 0x0

    #v3=(Null);
    const/4 v4, 0x0

    #v4=(Null);
    const/4 v5, 0x0

    #v5=(Null);
    const/4 v6, 0x0

    #v6=(Null);
    const/4 v7, 0x0

    #v7=(Null);
    move-object v0, p1

    #v0=(Reference);
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v9

    #v9=(Reference);
    const-wide/16 v10, 0x0

    :try_start_1
    #v10=(LongLo);v11=(LongHi);
    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_6

    const/4 v0, 0x0

    #v0=(Null);
    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    #v12=(Reference);
    const-string v1, "session"

    const/4 v2, 0x0

    #v2=(Null);
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p1

    #v0=(Reference);
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    :try_start_2
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_5

    const/4 v0, 0x0

    #v0=(Null);
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    :goto_0
    #v0=(Boolean);v2=(LongLo);v3=(LongHi);
    new-instance v0, Landroid/content/ContentValues;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    #v0=(Reference);
    const-string v4, "referrer"

    #v4=(Reference);
    invoke-virtual {v0, v4, v12}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "timestamp_referrer"

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v0, v4, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v2, "referrer_visit"

    const/4 v3, 0x1

    #v3=(One);
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "referrer_index"

    const/4 v3, 0x1

    #v3=(One);
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "referrer"

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {p1, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_2

    :goto_1
    #v0=(Conflicted);v12=(Conflicted);
    if-eqz v9, :cond_0

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_0
    if-eqz v1, :cond_1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_1
    :goto_2
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Reference);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    return-void

    :catch_0
    #v1=(Conflicted);v2=(Conflicted);v8=(Null);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
    move-exception v0

    #v0=(Reference);
    move-object v1, v8

    :goto_3
    :try_start_3
    #v1=(Reference);v8=(Reference);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    const-string v2, "GoogleAnalyticsTracker"

    #v2=(Reference);
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-eqz v8, :cond_2

    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    :cond_2
    if-eqz v1, :cond_1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_2

    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v8=(Null);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
    move-exception v0

    #v0=(Reference);
    move-object v1, v8

    #v1=(Null);
    move-object v9, v8

    :goto_4
    #v1=(Reference);v8=(Reference);v9=(Reference);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    if-eqz v9, :cond_3

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_3
    if-eqz v1, :cond_4

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_4
    throw v0

    :catchall_1
    #v2=(Reference);v3=(Null);v4=(Null);v5=(Null);v6=(Null);v7=(Null);v8=(Null);v10=(LongLo);v11=(LongHi);
    move-exception v0

    move-object v1, v8

    #v1=(Null);
    goto :goto_4

    :catchall_2
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Reference);v12=(Reference);
    move-exception v0

    #v0=(Reference);
    goto :goto_4

    :catchall_3
    #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Reference);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    move-exception v0

    move-object v9, v8

    #v9=(Reference);
    goto :goto_4

    :catch_1
    #v2=(Reference);v3=(Null);v4=(Null);v5=(Null);v6=(Null);v7=(Null);v8=(Null);v10=(LongLo);v11=(LongHi);
    move-exception v0

    move-object v1, v8

    #v1=(Null);
    move-object v8, v9

    #v8=(Reference);
    goto :goto_3

    :catch_2
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Reference);v8=(Null);v12=(Reference);
    move-exception v0

    #v0=(Reference);
    move-object v8, v9

    #v8=(Reference);
    goto :goto_3

    :cond_5
    #v0=(Boolean);v2=(Null);v3=(Null);v4=(Null);v8=(Null);
    move-wide v2, v10

    #v2=(LongLo);v3=(LongHi);
    goto :goto_0

    :cond_6
    #v2=(Reference);v3=(Null);v12=(Uninit);
    move-object v1, v8

    #v1=(Null);
    goto :goto_1
.end method


# virtual methods
.method createCustomVariableTables(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 4

    const-string v0, "DROP TABLE IF EXISTS custom_variables;"

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/apps/analytics/PersistentHitStore;->access$200()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS custom_var_cache;"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/apps/analytics/PersistentHitStore;->access$300()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const/4 v0, 0x1

    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    const/4 v1, 0x5

    #v1=(PosByte);
    if-gt v0, v1, :cond_0

    new-instance v1, Landroid/content/ContentValues;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    #v1=(Reference);
    const-string v2, "event_id"

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "cv_index"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "cv_name"

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "cv_scope"

    const/4 v3, 0x3

    #v3=(PosByte);
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "cv_value"

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "custom_var_cache"

    const-string v3, "event_id"

    invoke-virtual {p1, v2, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    #v1=(PosByte);v2=(Conflicted);v3=(Conflicted);
    return-void
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    const-string v0, "DROP TABLE IF EXISTS events;"

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/apps/analytics/PersistentHitStore;->access$000()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS install_referrer;"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE install_referrer (referrer TEXT PRIMARY KEY NOT NULL);"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS session;"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/apps/analytics/PersistentHitStore;->access$100()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->databaseVersion:I

    #v0=(Integer);
    const/4 v1, 0x1

    #v1=(One);
    if-le v0, v1, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->createCustomVariableTables(Landroid/database/sqlite/SQLiteDatabase;)V

    :cond_0
    iget v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->databaseVersion:I

    const/4 v1, 0x2

    #v1=(PosByte);
    if-le v0, v1, :cond_1

    invoke-direct {p0, p1}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->createECommerceTables(Landroid/database/sqlite/SQLiteDatabase;)V

    :cond_1
    iget v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->databaseVersion:I

    const/4 v1, 0x3

    if-le v0, v1, :cond_2

    invoke-direct {p0, p1}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->createHitTable(Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-direct {p0, p1}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->createReferrerTable(Landroid/database/sqlite/SQLiteDatabase;)V

    :cond_2
    return-void
.end method

.method public onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 10

    const/4 v2, 0x0

    #v2=(Null);
    const-string v0, "GoogleAnalyticsTracker"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v3, "Downgrading database version from "

    #v3=(Reference);
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " to "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " not recommended."

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "CREATE TABLE IF NOT EXISTS referrer (referrer TEXT PRIMARY KEY NOT NULL,timestamp_referrer INTEGER NOT NULL,referrer_visit INTEGER NOT NULL DEFAULT 1,referrer_index INTEGER NOT NULL DEFAULT 1);"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/apps/analytics/PersistentHitStore;->access$600()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/apps/analytics/PersistentHitStore;->access$300()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/apps/analytics/PersistentHitStore;->access$100()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    new-instance v9, Ljava/util/HashSet;

    #v9=(UninitRef);
    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    #v9=(Reference);
    const-string v1, "custom_var_cache"

    move-object v0, p1

    move-object v3, v2

    #v3=(Null);
    move-object v4, v2

    #v4=(Null);
    move-object v5, v2

    #v5=(Null);
    move-object v6, v2

    #v6=(Null);
    move-object v7, v2

    #v7=(Null);
    move-object v8, v2

    #v8=(Null);
    invoke-virtual/range {v0 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    :goto_0
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    const-string v0, "cv_index"

    #v0=(Reference);
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    #v0=(Reference);
    invoke-interface {v9, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    #v0=(Conflicted);
    move-exception v0

    :try_start_1
    #v0=(Reference);
    const-string v2, "GoogleAnalyticsTracker"

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "Error on downgrade: "

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :goto_1
    #v0=(Conflicted);
    const/4 v0, 0x1

    #v0=(One);
    move v1, v0

    :goto_2
    #v0=(Integer);v1=(Integer);
    const/4 v0, 0x5

    #v0=(PosByte);
    if-gt v1, v0, :cond_2

    :try_start_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    #v0=(Reference);
    invoke-interface {v9, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    new-instance v0, Landroid/content/ContentValues;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    #v0=(Reference);
    const-string v2, "event_id"

    const/4 v3, 0x0

    #v3=(Null);
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "cv_index"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "cv_name"

    const-string v3, ""

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "cv_scope"

    const/4 v3, 0x3

    #v3=(PosByte);
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "cv_value"

    const-string v3, ""

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "custom_var_cache"

    const-string v3, "event_id"

    invoke-virtual {p1, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1

    :cond_0
    :goto_3
    #v0=(Conflicted);
    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_2

    :cond_1
    #v0=(Boolean);v1=(Reference);v2=(Null);v3=(Null);v4=(Null);
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_1

    :catchall_0
    #v0=(Conflicted);v2=(Reference);v3=(Conflicted);v4=(Reference);
    move-exception v0

    #v0=(Reference);
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    :catch_1
    #v0=(Conflicted);v1=(Integer);
    move-exception v0

    #v0=(Reference);
    const-string v2, "GoogleAnalyticsTracker"

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "Error inserting custom variable on downgrade: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_2
    #v0=(PosByte);
    return-void
.end method

.method public onOpen(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->isReadOnly()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const-string v0, "GoogleAnalyticsTracker"

    #v0=(Reference);
    const-string v1, "Warning: Need to update database, but it\'s read only."

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_0
    #v0=(Boolean);v1=(Uninit);
    invoke-direct {p0, p1}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->fixReferrerTable(Landroid/database/sqlite/SQLiteDatabase;)V

    goto :goto_0
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 3

    const/4 v2, 0x3

    #v2=(PosByte);
    const/4 v1, 0x2

    #v1=(PosByte);
    if-le p2, p3, :cond_1

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V

    :cond_0
    :goto_0
    #v0=(Conflicted);
    return-void

    :cond_1
    #v0=(Uninit);
    if-ge p2, v1, :cond_2

    const/4 v0, 0x1

    #v0=(One);
    if-le p3, v0, :cond_2

    invoke-virtual {p0, p1}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->createCustomVariableTables(Landroid/database/sqlite/SQLiteDatabase;)V

    :cond_2
    #v0=(Conflicted);
    if-ge p2, v2, :cond_3

    if-le p3, v1, :cond_3

    invoke-direct {p0, p1}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->createECommerceTables(Landroid/database/sqlite/SQLiteDatabase;)V

    :cond_3
    const/4 v0, 0x4

    #v0=(PosByte);
    if-ge p2, v0, :cond_0

    if-le p3, v2, :cond_0

    invoke-direct {p0, p1}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->createHitTable(Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-direct {p0, p1}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->createReferrerTable(Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-direct {p0, p1, p2}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->migrateEventsToHits(Landroid/database/sqlite/SQLiteDatabase;I)V

    invoke-direct {p0, p1}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->migratePreV4Referrer(Landroid/database/sqlite/SQLiteDatabase;)V

    goto :goto_0
.end method

*/}
