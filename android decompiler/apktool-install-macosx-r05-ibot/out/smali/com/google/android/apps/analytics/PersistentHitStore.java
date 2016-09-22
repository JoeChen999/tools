package com.google.android.apps.analytics; class PersistentHitStore {/*

.class Lcom/google/android/apps/analytics/PersistentHitStore;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/apps/analytics/HitStore;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;
    }
.end annotation


# static fields
.field private static final ACCOUNT_ID:Ljava/lang/String; = "account_id"

.field private static final ACTION:Ljava/lang/String; = "action"

.field private static final CATEGORY:Ljava/lang/String; = "category"

.field private static final CREATE_CUSTOM_VARIABLES_TABLE:Ljava/lang/String; = null

.field private static final CREATE_CUSTOM_VAR_CACHE_TABLE:Ljava/lang/String; = null

.field private static final CREATE_EVENTS_TABLE:Ljava/lang/String; = null

.field private static final CREATE_HITS_TABLE:Ljava/lang/String; = null

.field private static final CREATE_INSTALL_REFERRER_TABLE:Ljava/lang/String; = "CREATE TABLE install_referrer (referrer TEXT PRIMARY KEY NOT NULL);"

.field private static final CREATE_ITEM_EVENTS_TABLE:Ljava/lang/String; = null

.field private static final CREATE_REFERRER_TABLE:Ljava/lang/String; = "CREATE TABLE IF NOT EXISTS referrer (referrer TEXT PRIMARY KEY NOT NULL,timestamp_referrer INTEGER NOT NULL,referrer_visit INTEGER NOT NULL DEFAULT 1,referrer_index INTEGER NOT NULL DEFAULT 1);"

.field private static final CREATE_SESSION_TABLE:Ljava/lang/String; = null

.field private static final CREATE_TRANSACTION_EVENTS_TABLE:Ljava/lang/String; = null

.field private static final CUSTOMVAR_ID:Ljava/lang/String; = "cv_id"

.field private static final CUSTOMVAR_INDEX:Ljava/lang/String; = "cv_index"

.field private static final CUSTOMVAR_NAME:Ljava/lang/String; = "cv_name"

.field private static final CUSTOMVAR_SCOPE:Ljava/lang/String; = "cv_scope"

.field private static final CUSTOMVAR_VALUE:Ljava/lang/String; = "cv_value"

.field private static final CUSTOM_VARIABLE_COLUMN_TYPE:Ljava/lang/String; = "CHAR(64) NOT NULL"

.field private static final DATABASE_NAME:Ljava/lang/String; = "google_analytics.db"

.field private static final DATABASE_VERSION:I = 0x5

.field private static final EVENT_ID:Ljava/lang/String; = "event_id"

.field private static final HIT_ID:Ljava/lang/String; = "hit_id"

.field private static final HIT_STRING:Ljava/lang/String; = "hit_string"

.field private static final HIT_TIMESTAMP:Ljava/lang/String; = "hit_time"

.field private static final ITEM_CATEGORY:Ljava/lang/String; = "item_category"

.field private static final ITEM_COUNT:Ljava/lang/String; = "item_count"

.field private static final ITEM_ID:Ljava/lang/String; = "item_id"

.field private static final ITEM_NAME:Ljava/lang/String; = "item_name"

.field private static final ITEM_PRICE:Ljava/lang/String; = "item_price"

.field private static final ITEM_SKU:Ljava/lang/String; = "item_sku"

.field private static final LABEL:Ljava/lang/String; = "label"

.field private static final MAX_HITS:I = 0x3e8

.field private static final ORDER_ID:Ljava/lang/String; = "order_id"

.field private static final RANDOM_VAL:Ljava/lang/String; = "random_val"

.field static final REFERRER:Ljava/lang/String; = "referrer"

.field static final REFERRER_COLUMN:Ljava/lang/String; = "referrer"

.field static final REFERRER_INDEX:Ljava/lang/String; = "referrer_index"

.field static final REFERRER_VISIT:Ljava/lang/String; = "referrer_visit"

.field private static final SCREEN_HEIGHT:Ljava/lang/String; = "screen_height"

.field private static final SCREEN_WIDTH:Ljava/lang/String; = "screen_width"

.field private static final SHIPPING_COST:Ljava/lang/String; = "tran_shippingcost"

.field private static final STORE_ID:Ljava/lang/String; = "store_id"

.field private static final STORE_NAME:Ljava/lang/String; = "tran_storename"

.field private static final TIMESTAMP_CURRENT:Ljava/lang/String; = "timestamp_current"

.field private static final TIMESTAMP_FIRST:Ljava/lang/String; = "timestamp_first"

.field private static final TIMESTAMP_PREVIOUS:Ljava/lang/String; = "timestamp_previous"

.field static final TIMESTAMP_REFERRER:Ljava/lang/String; = "timestamp_referrer"

.field private static final TOTAL_COST:Ljava/lang/String; = "tran_totalcost"

.field private static final TOTAL_TAX:Ljava/lang/String; = "tran_totaltax"

.field private static final TRANSACTION_ID:Ljava/lang/String; = "tran_id"

.field private static final USER_ID:Ljava/lang/String; = "user_id"

.field private static final VALUE:Ljava/lang/String; = "value"

.field private static final VISITS:Ljava/lang/String; = "visits"


# instance fields
.field private anonymizeIp:Z

.field private databaseHelper:Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;

.field private volatile numStoredHits:I

.field private random:Ljava/util/Random;

.field private sampleRate:I

.field private sessionStarted:Z

.field private storeId:I

.field private timestampCurrent:J

.field private timestampFirst:J

.field private timestampPrevious:J

.field private useStoredVisitorVars:Z

.field private visitorCVCache:Lcom/google/android/apps/analytics/CustomVariableBuffer;

.field private visits:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v5, 0x1

    #v5=(One);
    const/4 v4, 0x0

    #v4=(Null);
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, "CREATE TABLE events ("

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    #v2=(Reference);
    const-string v3, "event_id"

    #v3=(Reference);
    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "user_id"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' CHAR(256) NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "account_id"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "random_val"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "timestamp_first"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "timestamp_previous"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "timestamp_current"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "visits"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' CHAR(256) NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "category"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' CHAR(256) NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "action"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' CHAR(256), "

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "label"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "value"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "screen_width"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER);"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "screen_height"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/apps/analytics/PersistentHitStore;->CREATE_EVENTS_TABLE:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, "CREATE TABLE IF NOT EXISTS session ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER PRIMARY KEY,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "timestamp_first"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "timestamp_previous"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "timestamp_current"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "visits"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER NOT NULL);"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "store_id"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/apps/analytics/PersistentHitStore;->CREATE_SESSION_TABLE:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, "CREATE TABLE custom_variables ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "cv_id"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "event_id"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "cv_index"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' CHAR(64) NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "cv_name"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' CHAR(64) NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "cv_value"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER NOT NULL);"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "cv_scope"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/apps/analytics/PersistentHitStore;->CREATE_CUSTOM_VARIABLES_TABLE:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, "CREATE TABLE IF NOT EXISTS custom_var_cache ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "cv_id"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "event_id"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "cv_index"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' CHAR(64) NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "cv_name"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' CHAR(64) NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "cv_value"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER NOT NULL);"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "cv_scope"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/apps/analytics/PersistentHitStore;->CREATE_CUSTOM_VAR_CACHE_TABLE:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, "CREATE TABLE transaction_events ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "tran_id"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "event_id"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' TEXT NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "order_id"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' TEXT,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "tran_storename"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' TEXT NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "tran_totalcost"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' TEXT,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "tran_totaltax"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' TEXT);"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "tran_shippingcost"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/apps/analytics/PersistentHitStore;->CREATE_TRANSACTION_EVENTS_TABLE:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, "CREATE TABLE item_events ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "item_id"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "event_id"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' TEXT NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "order_id"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' TEXT NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "item_sku"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' TEXT,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "item_name"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' TEXT,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "item_category"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' TEXT NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "item_price"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' TEXT NOT NULL);"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "item_count"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/apps/analytics/PersistentHitStore;->CREATE_ITEM_EVENTS_TABLE:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, "CREATE TABLE IF NOT EXISTS hits ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "hit_id"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' TEXT NOT NULL,"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "hit_string"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \'%s\' INTEGER NOT NULL);"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "hit_time"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/apps/analytics/PersistentHitStore;->CREATE_HITS_TABLE:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "google_analytics.db"

    #v0=(Reference);
    const/4 v1, 0x5

    #v1=(PosByte);
    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/apps/analytics/PersistentHitStore;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    #p0=(Reference);
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x5

    #v0=(PosByte);
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/apps/analytics/PersistentHitStore;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    #p0=(Reference);
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/16 v0, 0x64

    #v0=(PosByte);
    iput v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->sampleRate:I

    new-instance v0, Ljava/util/Random;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->random:Ljava/util/Random;

    new-instance v0, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;

    #v0=(UninitRef);
    invoke-direct {v0, p1, p2, p3, p0}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;-><init>(Landroid/content/Context;Ljava/lang/String;ILcom/google/android/apps/analytics/PersistentHitStore;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->databaseHelper:Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;

    invoke-virtual {p0}, Lcom/google/android/apps/analytics/PersistentHitStore;->loadExistingSession()V

    invoke-virtual {p0}, Lcom/google/android/apps/analytics/PersistentHitStore;->getVisitorVarBuffer()Lcom/google/android/apps/analytics/CustomVariableBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->visitorCVCache:Lcom/google/android/apps/analytics/CustomVariableBuffer;

    return-void
.end method

.method constructor <init>(Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/16 v0, 0x64

    #v0=(PosByte);
    iput v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->sampleRate:I

    new-instance v0, Ljava/util/Random;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->random:Ljava/util/Random;

    iput-object p1, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->databaseHelper:Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;

    invoke-virtual {p0}, Lcom/google/android/apps/analytics/PersistentHitStore;->loadExistingSession()V

    invoke-virtual {p0}, Lcom/google/android/apps/analytics/PersistentHitStore;->getVisitorVarBuffer()Lcom/google/android/apps/analytics/CustomVariableBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->visitorCVCache:Lcom/google/android/apps/analytics/CustomVariableBuffer;

    return-void
.end method

.method static synthetic access$000()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/apps/analytics/PersistentHitStore;->CREATE_EVENTS_TABLE:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$100()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/apps/analytics/PersistentHitStore;->CREATE_SESSION_TABLE:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$200()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/apps/analytics/PersistentHitStore;->CREATE_CUSTOM_VARIABLES_TABLE:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$300()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/apps/analytics/PersistentHitStore;->CREATE_CUSTOM_VAR_CACHE_TABLE:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$400()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/apps/analytics/PersistentHitStore;->CREATE_TRANSACTION_EVENTS_TABLE:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$500()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/apps/analytics/PersistentHitStore;->CREATE_ITEM_EVENTS_TABLE:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$600()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/apps/analytics/PersistentHitStore;->CREATE_HITS_TABLE:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$702(Lcom/google/android/apps/analytics/PersistentHitStore;Lcom/google/android/apps/analytics/CustomVariableBuffer;)Lcom/google/android/apps/analytics/CustomVariableBuffer;
    .locals 0

    iput-object p1, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->visitorCVCache:Lcom/google/android/apps/analytics/CustomVariableBuffer;

    return-object p1
.end method

.method static synthetic access$800(Lcom/google/android/apps/analytics/PersistentHitStore;Lcom/google/android/apps/analytics/Event;Landroid/database/sqlite/SQLiteDatabase;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/apps/analytics/PersistentHitStore;->putEvent(Lcom/google/android/apps/analytics/Event;Landroid/database/sqlite/SQLiteDatabase;Z)V

    return-void
.end method

.method static synthetic access$900(Landroid/database/sqlite/SQLiteDatabase;)Z
    .locals 1

    invoke-static {p0}, Lcom/google/android/apps/analytics/PersistentHitStore;->endTransaction(Landroid/database/sqlite/SQLiteDatabase;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method private static endTransaction(Landroid/database/sqlite/SQLiteDatabase;)Z
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return v0

    :catch_0
    move-exception v0

    #v0=(Reference);
    const-string v1, "GoogleAnalyticsTracker"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "exception ending transaction:"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method static formatReferrer(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    const/4 v5, 0x0

    #v5=(Null);
    const/4 v8, 0x2

    #v8=(PosByte);
    const/4 v1, 0x1

    #v1=(One);
    const/4 v2, 0x0

    #v2=(Null);
    if-nez p0, :cond_0

    move-object v0, v5

    :goto_0
    #v0=(Reference);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Uninit);v1=(One);v3=(Uninit);v4=(Uninit);v5=(Null);v6=(Uninit);v7=(Uninit);v8=(PosByte);
    const-string v0, "="

    #v0=(Reference);
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    :goto_1
    #v0=(Conflicted);
    invoke-static {p0}, Lcom/google/android/apps/analytics/Utils;->parseURLParameters(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    #v7=(Reference);
    const-string v0, "utm_campaign"

    #v0=(Reference);
    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    move v0, v1

    :goto_2
    #v0=(Boolean);
    const-string v3, "utm_medium"

    #v3=(Reference);
    invoke-interface {v7, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_5

    move v3, v1

    :goto_3
    #v3=(Boolean);
    const-string v4, "utm_source"

    #v4=(Reference);
    invoke-interface {v7, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_6

    move v4, v1

    :goto_4
    #v4=(Boolean);
    const-string v6, "gclid"

    #v6=(Reference);
    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_7

    move v6, v1

    :goto_5
    #v6=(Boolean);
    if-nez v6, :cond_8

    if-eqz v0, :cond_1

    if-eqz v3, :cond_1

    if-nez v4, :cond_8

    :cond_1
    const-string v0, "GoogleAnalyticsTracker"

    #v0=(Reference);
    const-string v1, "Badly formatted referrer missing campaign, medium and source or click ID"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-object v0, v5

    #v0=(Null);
    goto :goto_0

    :cond_2
    #v0=(Boolean);v1=(One);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);
    const-string v0, "%3D"

    #v0=(Reference);
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_3

    :try_start_0
    const-string v0, "UTF-8"

    #v0=(Reference);
    invoke-static {p0, v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p0

    goto :goto_1

    :catch_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v0, v5

    #v0=(Null);
    goto :goto_0

    :cond_3
    #v0=(Boolean);
    move-object v0, v5

    #v0=(Null);
    goto :goto_0

    :cond_4
    #v0=(Reference);v7=(Reference);
    move v0, v2

    #v0=(Null);
    goto :goto_2

    :cond_5
    #v0=(Boolean);v3=(Reference);
    move v3, v2

    #v3=(Null);
    goto :goto_3

    :cond_6
    #v3=(Boolean);v4=(Reference);
    move v4, v2

    #v4=(Null);
    goto :goto_4

    :cond_7
    #v4=(Boolean);v6=(Reference);
    move v6, v2

    #v6=(Null);
    goto :goto_5

    :cond_8
    #v6=(Boolean);
    const/4 v0, 0x7

    #v0=(PosByte);
    new-array v4, v0, [[Ljava/lang/String;

    #v4=(Reference);
    new-array v3, v8, [Ljava/lang/String;

    #v3=(Reference);
    const-string v0, "utmcid"

    #v0=(Reference);
    aput-object v0, v3, v2

    const-string v0, "utm_id"

    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v3, v1

    aput-object v3, v4, v2

    new-array v3, v8, [Ljava/lang/String;

    const-string v0, "utmcsr"

    aput-object v0, v3, v2

    const-string v0, "utm_source"

    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v3, v1

    aput-object v3, v4, v1

    new-array v3, v8, [Ljava/lang/String;

    const-string v0, "utmgclid"

    aput-object v0, v3, v2

    const-string v0, "gclid"

    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v3, v1

    aput-object v3, v4, v8

    const/4 v3, 0x3

    #v3=(PosByte);
    new-array v5, v8, [Ljava/lang/String;

    #v5=(Reference);
    const-string v0, "utmccn"

    aput-object v0, v5, v2

    const-string v0, "utm_campaign"

    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v5, v1

    aput-object v5, v4, v3

    const/4 v3, 0x4

    new-array v5, v8, [Ljava/lang/String;

    const-string v0, "utmcmd"

    aput-object v0, v5, v2

    const-string v0, "utm_medium"

    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v5, v1

    aput-object v5, v4, v3

    const/4 v3, 0x5

    new-array v5, v8, [Ljava/lang/String;

    const-string v0, "utmctr"

    aput-object v0, v5, v2

    const-string v0, "utm_term"

    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v5, v1

    aput-object v5, v4, v3

    const/4 v3, 0x6

    new-array v5, v8, [Ljava/lang/String;

    const-string v0, "utmcct"

    aput-object v0, v5, v2

    const-string v0, "utm_content"

    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v5, v1

    aput-object v5, v4, v3

    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    move v0, v2

    #v0=(Null);
    move v3, v1

    :goto_6
    #v0=(Integer);v3=(Boolean);v6=(Conflicted);v8=(Conflicted);
    array-length v6, v4

    #v6=(Integer);
    if-ge v0, v6, :cond_b

    aget-object v6, v4, v0

    #v6=(Null);
    aget-object v6, v6, v1

    if-eqz v6, :cond_9

    aget-object v6, v4, v0

    aget-object v6, v6, v1

    const-string v7, "+"

    const-string v8, "%20"

    #v8=(Reference);
    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    #v6=(Reference);
    const-string v7, " "

    const-string v8, "%20"

    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    if-eqz v3, :cond_a

    move v3, v2

    :goto_7
    aget-object v7, v4, v0

    #v7=(Null);
    aget-object v7, v7, v2

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    #v7=(Reference);
    const-string v8, "="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    #v8=(Conflicted);
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_a
    #v8=(Reference);
    const-string v7, "|"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_7

    :cond_b
    #v6=(Integer);v8=(Conflicted);
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    goto/16 :goto_0
.end method

.method private getAndUpdateReferrer(Landroid/database/sqlite/SQLiteDatabase;)Lcom/google/android/apps/analytics/Referrer;
    .locals 8

    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, p1}, Lcom/google/android/apps/analytics/PersistentHitStore;->readCurrentReferrer(Landroid/database/sqlite/SQLiteDatabase;)Lcom/google/android/apps/analytics/Referrer;

    move-result-object v1

    #v1=(Reference);
    if-nez v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    invoke-virtual {v1}, Lcom/google/android/apps/analytics/Referrer;->getTimeStamp()J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    const-wide/16 v4, 0x0

    #v4=(LongLo);v5=(LongHi);
    cmp-long v2, v2, v4

    #v2=(Byte);
    if-eqz v2, :cond_2

    move-object v0, v1

    #v0=(Reference);
    goto :goto_0

    :cond_2
    #v0=(Null);
    invoke-virtual {v1}, Lcom/google/android/apps/analytics/Referrer;->getIndex()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v1}, Lcom/google/android/apps/analytics/Referrer;->getReferrerString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Landroid/content/ContentValues;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    #v2=(Reference);
    const-string v3, "referrer"

    #v3=(Reference);
    invoke-virtual {v2, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "timestamp_referrer"

    iget-wide v6, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampCurrent:J

    #v6=(LongLo);v7=(LongHi);
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v3, "referrer_visit"

    iget v4, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->visits:I

    #v4=(Integer);
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v3, "referrer_index"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-direct {p0, p1, v2}, Lcom/google/android/apps/analytics/PersistentHitStore;->setReferrerDatabase(Landroid/database/sqlite/SQLiteDatabase;Landroid/content/ContentValues;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    new-instance v0, Lcom/google/android/apps/analytics/Referrer;

    #v0=(UninitRef);
    iget-wide v2, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampCurrent:J

    #v2=(LongLo);v3=(LongHi);
    iget v4, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->visits:I

    #v4=(Integer);
    invoke-direct/range {v0 .. v5}, Lcom/google/android/apps/analytics/Referrer;-><init>(Ljava/lang/String;JII)V

    #v0=(Reference);
    goto :goto_0
.end method

.method private putEvent(Lcom/google/android/apps/analytics/Event;Landroid/database/sqlite/SQLiteDatabase;Z)V
    .locals 6

    invoke-virtual {p1}, Lcom/google/android/apps/analytics/Event;->isSessionInitialized()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->random:Ljava/util/Random;

    #v0=(Reference);
    const v1, 0x7fffffff

    #v1=(Integer);
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    #v0=(Integer);
    invoke-virtual {p1, v0}, Lcom/google/android/apps/analytics/Event;->setRandomVal(I)V

    iget-wide v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampFirst:J

    #v0=(LongLo);v1=(LongHi);
    long-to-int v0, v0

    #v0=(Integer);
    invoke-virtual {p1, v0}, Lcom/google/android/apps/analytics/Event;->setTimestampFirst(I)V

    iget-wide v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampPrevious:J

    #v0=(LongLo);
    long-to-int v0, v0

    #v0=(Integer);
    invoke-virtual {p1, v0}, Lcom/google/android/apps/analytics/Event;->setTimestampPrevious(I)V

    iget-wide v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampCurrent:J

    #v0=(LongLo);
    long-to-int v0, v0

    #v0=(Integer);
    invoke-virtual {p1, v0}, Lcom/google/android/apps/analytics/Event;->setTimestampCurrent(I)V

    iget v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->visits:I

    invoke-virtual {p1, v0}, Lcom/google/android/apps/analytics/Event;->setVisits(I)V

    :cond_0
    #v1=(Conflicted);
    iget-boolean v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->anonymizeIp:Z

    #v0=(Boolean);
    invoke-virtual {p1, v0}, Lcom/google/android/apps/analytics/Event;->setAnonymizeIp(Z)V

    invoke-virtual {p1}, Lcom/google/android/apps/analytics/Event;->getUserId()I

    move-result v0

    #v0=(Integer);
    const/4 v1, -0x1

    #v1=(Byte);
    if-ne v0, v1, :cond_1

    iget v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->storeId:I

    invoke-virtual {p1, v0}, Lcom/google/android/apps/analytics/Event;->setUserId(I)V

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/google/android/apps/analytics/PersistentHitStore;->putCustomVariables(Lcom/google/android/apps/analytics/Event;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-direct {p0, p2}, Lcom/google/android/apps/analytics/PersistentHitStore;->getAndUpdateReferrer(Landroid/database/sqlite/SQLiteDatabase;)Lcom/google/android/apps/analytics/Referrer;

    move-result-object v1

    #v1=(Reference);
    iget-object v0, p1, Lcom/google/android/apps/analytics/Event;->accountId:Ljava/lang/String;

    #v0=(Reference);
    const-string v2, ","

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    array-length v0, v2

    #v0=(Integer);
    const/4 v3, 0x1

    #v3=(One);
    if-ne v0, v3, :cond_3

    invoke-virtual {p0, p1, v1, p2, p3}, Lcom/google/android/apps/analytics/PersistentHitStore;->writeEventToDatabase(Lcom/google/android/apps/analytics/Event;Lcom/google/android/apps/analytics/Referrer;Landroid/database/sqlite/SQLiteDatabase;Z)V

    :cond_2
    #v3=(Integer);v4=(Conflicted);v5=(Conflicted);
    return-void

    :cond_3
    #v3=(One);v4=(Uninit);v5=(Uninit);
    array-length v3, v2

    #v3=(Integer);
    const/4 v0, 0x0

    :goto_0
    #v4=(Conflicted);v5=(Conflicted);
    if-ge v0, v3, :cond_2

    aget-object v4, v2, v0

    #v4=(Null);
    new-instance v5, Lcom/google/android/apps/analytics/Event;

    #v5=(UninitRef);
    invoke-direct {v5, p1, v4}, Lcom/google/android/apps/analytics/Event;-><init>(Lcom/google/android/apps/analytics/Event;Ljava/lang/String;)V

    #v5=(Reference);
    invoke-virtual {p0, v5, v1, p2, p3}, Lcom/google/android/apps/analytics/PersistentHitStore;->writeEventToDatabase(Lcom/google/android/apps/analytics/Event;Lcom/google/android/apps/analytics/Referrer;Landroid/database/sqlite/SQLiteDatabase;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private setReferrerDatabase(Landroid/database/sqlite/SQLiteDatabase;Landroid/content/ContentValues;)Z
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    #v0=(Null);
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    const-string v1, "referrer"

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {p1, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    const-string v1, "referrer"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2, p2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    invoke-static {p1}, Lcom/google/android/apps/analytics/PersistentHitStore;->endTransaction(Landroid/database/sqlite/SQLiteDatabase;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return v0

    :catch_0
    #v0=(Null);
    move-exception v1

    :try_start_1
    #v1=(Reference);
    const-string v2, "GoogleAnalyticsTracker"

    #v2=(Reference);
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    invoke-static {p1}, Lcom/google/android/apps/analytics/PersistentHitStore;->endTransaction(Landroid/database/sqlite/SQLiteDatabase;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :catchall_0
    #v1=(Conflicted);v2=(Conflicted);
    move-exception v1

    #v1=(Reference);
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_1

    invoke-static {p1}, Lcom/google/android/apps/analytics/PersistentHitStore;->endTransaction(Landroid/database/sqlite/SQLiteDatabase;)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    throw v1

    :cond_2
    #v1=(Boolean);v2=(Null);v3=(Null);
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method


# virtual methods
.method public clearReferrer()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->databaseHelper:Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "referrer"

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v2=(Conflicted);v3=(Conflicted);
    return-void

    :catch_0
    move-exception v0

    #v0=(Reference);
    const-string v1, "GoogleAnalyticsTracker"

    #v1=(Reference);
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public declared-synchronized deleteHit(J)V
    .locals 7

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->numStoredHits:I

    #v0=(Integer);
    iget-object v1, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->databaseHelper:Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "hits"

    #v2=(Reference);
    const-string v3, "hit_id = ?"

    #v3=(Reference);
    const/4 v4, 0x1

    #v4=(One);
    new-array v4, v4, [Ljava/lang/String;

    #v4=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v6

    #v6=(Reference);
    aput-object v6, v4, v5

    invoke-virtual {v1, v2, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    sub-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->numStoredHits:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    monitor-exit p0

    return-void

    :catch_0
    move-exception v0

    :try_start_1
    #v0=(Reference);
    const-string v1, "GoogleAnalyticsTracker"

    #v1=(Reference);
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0
.end method

.method getCustomVariables(JLandroid/database/sqlite/SQLiteDatabase;)Lcom/google/android/apps/analytics/CustomVariableBuffer;
    .locals 10

    const/4 v8, 0x0

    #v8=(Null);
    new-instance v9, Lcom/google/android/apps/analytics/CustomVariableBuffer;

    #v9=(UninitRef);
    invoke-direct {v9}, Lcom/google/android/apps/analytics/CustomVariableBuffer;-><init>()V

    :try_start_0
    #v9=(Reference);
    const-string v1, "custom_variables"

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    const-string v3, "event_id= ?"

    #v3=(Reference);
    const/4 v0, 0x1

    #v0=(One);
    new-array v4, v0, [Ljava/lang/String;

    #v4=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v4, v0

    const/4 v5, 0x0

    #v5=(Null);
    const/4 v6, 0x0

    #v6=(Null);
    const/4 v7, 0x0

    #v7=(Null);
    move-object v0, p3

    #v0=(Reference);
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    :goto_0
    :try_start_1
    #v2=(Integer);v5=(Integer);
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/apps/analytics/CustomVariable;

    #v0=(UninitRef);
    const-string v2, "cv_index"

    #v2=(Reference);
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    const-string v3, "cv_name"

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    #v3=(Integer);
    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    const-string v4, "cv_value"

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    invoke-interface {v1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    const-string v5, "cv_scope"

    #v5=(Reference);
    invoke-interface {v1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    #v5=(Integer);
    invoke-interface {v1, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/apps/analytics/CustomVariable;-><init>(ILjava/lang/String;Ljava/lang/String;I)V

    #v0=(Reference);
    invoke-virtual {v9, v0}, Lcom/google/android/apps/analytics/CustomVariableBuffer;->setCustomVariable(Lcom/google/android/apps/analytics/CustomVariable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    move-exception v0

    :goto_1
    :try_start_2
    #v0=(Reference);v6=(Conflicted);v7=(Conflicted);
    const-string v2, "GoogleAnalyticsTracker"

    #v2=(Reference);
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_0
    :goto_2
    #v0=(Conflicted);v2=(Conflicted);
    return-object v9

    :cond_1
    #v0=(Boolean);v2=(Integer);v3=(Reference);v4=(Reference);v5=(Integer);v6=(Null);v7=(Null);
    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_2

    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v1, v8

    :goto_3
    #v1=(Reference);
    if-eqz v1, :cond_2

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_2
    throw v0

    :catchall_1
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_3

    :catch_1
    #v0=(Conflicted);v1=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v1, v8

    #v1=(Null);
    goto :goto_1
.end method

.method getDatabaseHelper()Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->databaseHelper:Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;

    #v0=(Reference);
    return-object v0
.end method

.method getItem(JLandroid/database/sqlite/SQLiteDatabase;)Lcom/google/android/apps/analytics/Item;
    .locals 9

    const/4 v8, 0x0

    :try_start_0
    #v8=(Null);
    const-string v1, "item_events"

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    const-string v3, "event_id= ?"

    #v3=(Reference);
    const/4 v0, 0x1

    #v0=(One);
    new-array v4, v0, [Ljava/lang/String;

    #v4=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v4, v0

    const/4 v5, 0x0

    #v5=(Null);
    const/4 v6, 0x0

    #v6=(Null);
    const/4 v7, 0x0

    #v7=(Null);
    move-object v0, p3

    #v0=(Reference);
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v7

    :try_start_1
    #v7=(Reference);
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/apps/analytics/Item$Builder;

    #v0=(UninitRef);
    const-string v1, "order_id"

    invoke-interface {v7, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    invoke-interface {v7, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "item_sku"

    #v2=(Reference);
    invoke-interface {v7, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    invoke-interface {v7, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    const-string v3, "item_price"

    invoke-interface {v7, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    #v3=(Integer);
    invoke-interface {v7, v3}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v3

    #v3=(DoubleLo);v4=(DoubleHi);
    const-string v5, "item_count"

    #v5=(Reference);
    invoke-interface {v7, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    #v5=(Integer);
    invoke-interface {v7, v5}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    #v5=(LongLo);v6=(LongHi);
    invoke-direct/range {v0 .. v6}, Lcom/google/android/apps/analytics/Item$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;DJ)V

    #v0=(Reference);
    const-string v1, "item_name"

    invoke-interface {v7, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    invoke-interface {v7, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/google/android/apps/analytics/Item$Builder;->setItemName(Ljava/lang/String;)Lcom/google/android/apps/analytics/Item$Builder;

    move-result-object v0

    const-string v1, "item_category"

    invoke-interface {v7, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    invoke-interface {v7, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/google/android/apps/analytics/Item$Builder;->setItemCategory(Ljava/lang/String;)Lcom/google/android/apps/analytics/Item$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/analytics/Item$Builder;->build()Lcom/google/android/apps/analytics/Item;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    if-eqz v7, :cond_0

    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    :cond_0
    :goto_0
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Boolean);v2=(Null);v3=(Reference);v4=(Reference);v5=(Null);v6=(Null);v7=(Reference);
    if-eqz v7, :cond_2

    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    :cond_2
    :goto_1
    #v0=(Conflicted);v2=(Reference);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move-object v0, v8

    #v0=(Null);
    goto :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v1, v8

    :goto_2
    :try_start_2
    #v1=(Reference);
    const-string v2, "GoogleAnalyticsTracker"

    #v2=(Reference);
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v1, :cond_2

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_1

    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v7, v8

    :goto_3
    #v7=(Reference);
    if-eqz v7, :cond_3

    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    :cond_3
    throw v0

    :catchall_1
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_3

    :catchall_2
    #v1=(Reference);v7=(Conflicted);
    move-exception v0

    move-object v7, v1

    #v7=(Reference);
    goto :goto_3

    :catch_1
    #v0=(Conflicted);v1=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v1, v7

    #v1=(Reference);
    goto :goto_2
.end method

.method public getNumStoredHits()I
    .locals 1

    iget v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->numStoredHits:I

    #v0=(Integer);
    return v0
.end method

.method public getNumStoredHitsFromDb()I
    .locals 5

    const/4 v2, 0x0

    #v2=(Null);
    const/4 v0, 0x0

    :try_start_0
    #v0=(Null);
    iget-object v1, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->databaseHelper:Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v3, "SELECT COUNT(*) from hits"

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    invoke-virtual {v1, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    #v2=(Reference);
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    const/4 v1, 0x0

    #v1=(Null);
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getLong(I)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    long-to-int v0, v0

    :cond_0
    #v0=(Integer);v1=(Conflicted);
    if-eqz v2, :cond_1

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_1
    :goto_0
    #v4=(Conflicted);
    return v0

    :catch_0
    #v0=(Null);v3=(Conflicted);
    move-exception v1

    :try_start_1
    #v1=(Reference);
    const-string v3, "GoogleAnalyticsTracker"

    #v3=(Reference);
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_1

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :catchall_0
    #v1=(Conflicted);v3=(Conflicted);
    move-exception v0

    #v0=(Reference);
    if-eqz v2, :cond_2

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_2
    throw v0
.end method

.method public getReferrer()Lcom/google/android/apps/analytics/Referrer;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->databaseHelper:Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/apps/analytics/PersistentHitStore;->readCurrentReferrer(Landroid/database/sqlite/SQLiteDatabase;)Lcom/google/android/apps/analytics/Referrer;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    #v1=(Conflicted);
    return-object v0

    :catch_0
    move-exception v0

    #v0=(Reference);
    const-string v1, "GoogleAnalyticsTracker"

    #v1=(Reference);
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public getSessionId()Ljava/lang/String;
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->sessionStarted:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Reference);v1=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Boolean);v1=(Uninit);
    iget-wide v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampCurrent:J

    #v0=(LongLo);v1=(LongHi);
    long-to-int v0, v0

    #v0=(Integer);
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    goto :goto_0
.end method

.method public getStoreId()I
    .locals 1

    iget v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->storeId:I

    #v0=(Integer);
    return v0
.end method

.method getTimestampCurrent()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampCurrent:J

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method getTimestampFirst()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampFirst:J

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method getTimestampPrevious()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampPrevious:J

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method getTransaction(JLandroid/database/sqlite/SQLiteDatabase;)Lcom/google/android/apps/analytics/Transaction;
    .locals 9

    const/4 v8, 0x0

    :try_start_0
    #v8=(Null);
    const-string v1, "transaction_events"

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    const-string v3, "event_id= ?"

    #v3=(Reference);
    const/4 v0, 0x1

    #v0=(One);
    new-array v4, v0, [Ljava/lang/String;

    #v4=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v4, v0

    const/4 v5, 0x0

    #v5=(Null);
    const/4 v6, 0x0

    #v6=(Null);
    const/4 v7, 0x0

    #v7=(Null);
    move-object v0, p3

    #v0=(Reference);
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/apps/analytics/Transaction$Builder;

    #v0=(UninitRef);
    const-string v2, "order_id"

    #v2=(Reference);
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    const-string v3, "tran_totalcost"

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    #v3=(Integer);
    invoke-interface {v1, v3}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v3

    #v3=(DoubleLo);v4=(DoubleHi);
    invoke-direct {v0, v2, v3, v4}, Lcom/google/android/apps/analytics/Transaction$Builder;-><init>(Ljava/lang/String;D)V

    #v0=(Reference);
    const-string v2, "tran_storename"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v0, v2}, Lcom/google/android/apps/analytics/Transaction$Builder;->setStoreName(Ljava/lang/String;)Lcom/google/android/apps/analytics/Transaction$Builder;

    move-result-object v0

    const-string v2, "tran_totaltax"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v2

    #v2=(DoubleLo);v3=(DoubleHi);
    invoke-virtual {v0, v2, v3}, Lcom/google/android/apps/analytics/Transaction$Builder;->setTotalTax(D)Lcom/google/android/apps/analytics/Transaction$Builder;

    move-result-object v0

    const-string v2, "tran_shippingcost"

    #v2=(Reference);
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v2

    #v2=(DoubleLo);
    invoke-virtual {v0, v2, v3}, Lcom/google/android/apps/analytics/Transaction$Builder;->setShippingCost(D)Lcom/google/android/apps/analytics/Transaction$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/analytics/Transaction$Builder;->build()Lcom/google/android/apps/analytics/Transaction;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_0
    :goto_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Boolean);v2=(Null);v3=(Reference);v4=(Reference);v5=(Null);v6=(Null);v7=(Null);
    if-eqz v1, :cond_2

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_2
    :goto_1
    #v0=(Conflicted);v2=(Reference);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move-object v0, v8

    #v0=(Null);
    goto :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v1, v8

    :goto_2
    :try_start_2
    #v1=(Reference);
    const-string v2, "GoogleAnalyticsTracker"

    #v2=(Reference);
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v1, :cond_2

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_1

    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v1, v8

    :goto_3
    #v1=(Reference);
    if-eqz v1, :cond_3

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_3
    throw v0

    :catchall_1
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_3

    :catch_1
    #v0=(Conflicted);v5=(Null);v6=(Null);v7=(Null);
    move-exception v0

    #v0=(Reference);
    goto :goto_2
.end method

.method public getVisitorCustomVar(I)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->visitorCVCache:Lcom/google/android/apps/analytics/CustomVariableBuffer;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/google/android/apps/analytics/CustomVariableBuffer;->getCustomVariableAt(I)Lcom/google/android/apps/analytics/CustomVariable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/apps/analytics/CustomVariable;->getScope()I

    move-result v1

    #v1=(Integer);
    const/4 v2, 0x1

    #v2=(One);
    if-eq v1, v2, :cond_1

    :cond_0
    #v1=(Conflicted);v2=(Conflicted);
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    #v1=(Integer);v2=(One);
    invoke-virtual {v0}, Lcom/google/android/apps/analytics/CustomVariable;->getValue()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getVisitorId()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->sessionStarted:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    const-string v0, "%d.%d"

    #v0=(Reference);
    const/4 v1, 0x2

    #v1=(PosByte);
    new-array v1, v1, [Ljava/lang/Object;

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    iget v3, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->storeId:I

    #v3=(Integer);
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v1, v2

    const/4 v2, 0x1

    #v2=(One);
    iget-wide v3, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampFirst:J

    #v3=(LongLo);v4=(LongHi);
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method getVisitorVarBuffer()Lcom/google/android/apps/analytics/CustomVariableBuffer;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->databaseHelper:Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/apps/analytics/PersistentHitStore;->getVisitorVarBuffer(Landroid/database/sqlite/SQLiteDatabase;)Lcom/google/android/apps/analytics/CustomVariableBuffer;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    #v1=(Conflicted);
    return-object v0

    :catch_0
    move-exception v0

    #v0=(Reference);
    const-string v1, "GoogleAnalyticsTracker"

    #v1=(Reference);
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcom/google/android/apps/analytics/CustomVariableBuffer;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/google/android/apps/analytics/CustomVariableBuffer;-><init>()V

    #v0=(Reference);
    goto :goto_0
.end method

.method getVisitorVarBuffer(Landroid/database/sqlite/SQLiteDatabase;)Lcom/google/android/apps/analytics/CustomVariableBuffer;
    .locals 10

    const/4 v8, 0x0

    #v8=(Null);
    new-instance v9, Lcom/google/android/apps/analytics/CustomVariableBuffer;

    #v9=(UninitRef);
    invoke-direct {v9}, Lcom/google/android/apps/analytics/CustomVariableBuffer;-><init>()V

    :try_start_0
    #v9=(Reference);
    const-string v1, "custom_var_cache"

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    const-string v3, "cv_scope= ?"

    #v3=(Reference);
    const/4 v0, 0x1

    #v0=(One);
    new-array v4, v0, [Ljava/lang/String;

    #v4=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    const/4 v5, 0x1

    #v5=(One);
    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v4, v0

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
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    :goto_0
    :try_start_1
    #v2=(Integer);v5=(Integer);
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/apps/analytics/CustomVariable;

    #v0=(UninitRef);
    const-string v2, "cv_index"

    #v2=(Reference);
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    const-string v3, "cv_name"

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    #v3=(Integer);
    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    const-string v4, "cv_value"

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    invoke-interface {v1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    const-string v5, "cv_scope"

    #v5=(Reference);
    invoke-interface {v1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    #v5=(Integer);
    invoke-interface {v1, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/apps/analytics/CustomVariable;-><init>(ILjava/lang/String;Ljava/lang/String;I)V

    #v0=(Reference);
    invoke-virtual {v9, v0}, Lcom/google/android/apps/analytics/CustomVariableBuffer;->setCustomVariable(Lcom/google/android/apps/analytics/CustomVariable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    move-exception v0

    :goto_1
    :try_start_2
    #v0=(Reference);v6=(Conflicted);v7=(Conflicted);
    const-string v2, "GoogleAnalyticsTracker"

    #v2=(Reference);
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_0
    :goto_2
    #v0=(Conflicted);v2=(Conflicted);
    return-object v9

    :cond_1
    #v0=(Boolean);v2=(Integer);v3=(Reference);v4=(Reference);v5=(Integer);v6=(Null);v7=(Null);
    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_2

    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v1, v8

    :goto_3
    #v1=(Reference);
    if-eqz v1, :cond_2

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_2
    throw v0

    :catchall_1
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_3

    :catch_1
    #v0=(Conflicted);v1=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v1, v8

    #v1=(Null);
    goto :goto_1
.end method

.method getVisits()I
    .locals 1

    iget v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->visits:I

    #v0=(Integer);
    return v0
.end method

.method public loadExistingSession()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->databaseHelper:Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/apps/analytics/PersistentHitStore;->loadExistingSession(Landroid/database/sqlite/SQLiteDatabase;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v1=(Conflicted);
    return-void

    :catch_0
    move-exception v0

    #v0=(Reference);
    const-string v1, "GoogleAnalyticsTracker"

    #v1=(Reference);
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public loadExistingSession(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 13

    const/4 v9, 0x1

    #v9=(One);
    const/4 v10, 0x0

    #v10=(Null);
    const-wide/16 v11, 0x0

    #v11=(LongLo);v12=(LongHi);
    const/4 v8, 0x0

    :try_start_0
    #v8=(Null);
    const-string v1, "session"

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

    move-result-object v1

    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_3

    const/4 v0, 0x0

    #v0=(Null);
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    iput-wide v2, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampFirst:J

    const/4 v0, 0x1

    #v0=(One);
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampPrevious:J

    const/4 v0, 0x2

    #v0=(PosByte);
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampCurrent:J

    const/4 v0, 0x3

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->visits:I

    const/4 v0, 0x4

    #v0=(PosByte);
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->storeId:I

    invoke-virtual {p0, p1}, Lcom/google/android/apps/analytics/PersistentHitStore;->readCurrentReferrer(Landroid/database/sqlite/SQLiteDatabase;)Lcom/google/android/apps/analytics/Referrer;

    move-result-object v0

    #v0=(Reference);
    iget-wide v2, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampFirst:J

    cmp-long v2, v2, v11

    #v2=(Byte);
    if-eqz v2, :cond_2

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/apps/analytics/Referrer;->getTimeStamp()J

    move-result-wide v2

    #v2=(LongLo);
    cmp-long v0, v2, v11

    #v0=(Byte);
    if-eqz v0, :cond_2

    :cond_0
    #v0=(Conflicted);v2=(Conflicted);
    move v0, v9

    :goto_0
    #v0=(Boolean);
    iput-boolean v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->sessionStarted:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1
    #v0=(Conflicted);
    if-eqz v1, :cond_1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_1
    :goto_2
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return-void

    :cond_2
    #v3=(LongHi);v4=(Null);v5=(Null);v6=(Null);v7=(Null);
    move v0, v10

    #v0=(Null);
    goto :goto_0

    :cond_3
    #v0=(Boolean);v2=(Null);v3=(Null);
    const/4 v0, 0x0

    :try_start_2
    #v0=(Null);
    iput-boolean v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->sessionStarted:Z

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->useStoredVisitorVars:Z

    new-instance v0, Ljava/security/SecureRandom;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/security/SecureRandom;->nextInt()I

    move-result v0

    #v0=(Integer);
    const v2, 0x7fffffff

    #v2=(Integer);
    and-int/2addr v0, v2

    iput v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->storeId:I

    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1

    :try_start_3
    new-instance v0, Landroid/content/ContentValues;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    #v0=(Reference);
    const-string v1, "timestamp_first"

    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v1, "timestamp_previous"

    const-wide/16 v2, 0x0

    #v2=(LongLo);
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v1, "timestamp_current"

    const-wide/16 v2, 0x0

    #v2=(LongLo);
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v1, "visits"

    const/4 v2, 0x0

    #v2=(Null);
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v1, "store_id"

    iget v2, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->storeId:I

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v1, "session"

    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {p1, v1, v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0

    move-object v1, v8

    #v1=(Null);
    goto :goto_1

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v1, v8

    :goto_3
    :try_start_4
    #v1=(Reference);
    const-string v2, "GoogleAnalyticsTracker"

    #v2=(Reference);
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz v1, :cond_1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_2

    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v1, v8

    :goto_4
    #v1=(Reference);
    if-eqz v1, :cond_4

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_4
    throw v0

    :catchall_1
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_4

    :catch_1
    #v0=(Conflicted);v4=(Null);v5=(Null);v6=(Null);v7=(Null);
    move-exception v0

    #v0=(Reference);
    goto :goto_3
.end method

.method public peekEvents(ILandroid/database/sqlite/SQLiteDatabase;I)[Lcom/google/android/apps/analytics/Event;
    .locals 19

    new-instance v18, Ljava/util/ArrayList;

    #v18=(UninitRef);
    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    #v18=(Reference);
    const/4 v11, 0x0

    :try_start_0
    #v11=(Null);
    const-string v3, "events"

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    const/4 v5, 0x0

    #v5=(Null);
    const/4 v6, 0x0

    #v6=(Null);
    const/4 v7, 0x0

    #v7=(Null);
    const/4 v8, 0x0

    #v8=(Null);
    const-string v9, "event_id"

    #v9=(Reference);
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v10

    #v10=(Reference);
    move-object/from16 v2, p2

    #v2=(Reference);
    invoke-virtual/range {v2 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v17

    :goto_0
    :try_start_1
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Reference);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Reference);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Reference);
    invoke-interface/range {v17 .. v17}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_7

    new-instance v2, Lcom/google/android/apps/analytics/Event;

    #v2=(UninitRef);
    const/4 v3, 0x0

    #v3=(Null);
    move-object/from16 v0, v17

    #v0=(Reference);
    invoke-interface {v0, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    #v3=(LongLo);v4=(LongHi);
    const/4 v5, 0x2

    #v5=(PosByte);
    move-object/from16 v0, v17

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    const/4 v6, 0x3

    #v6=(PosByte);
    move-object/from16 v0, v17

    invoke-interface {v0, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    #v6=(Integer);
    const/4 v7, 0x4

    #v7=(PosByte);
    move-object/from16 v0, v17

    invoke-interface {v0, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    #v7=(Integer);
    const/4 v8, 0x5

    #v8=(PosByte);
    move-object/from16 v0, v17

    invoke-interface {v0, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    #v8=(Integer);
    const/4 v9, 0x6

    #v9=(PosByte);
    move-object/from16 v0, v17

    invoke-interface {v0, v9}, Landroid/database/Cursor;->getInt(I)I

    move-result v9

    #v9=(Integer);
    const/4 v10, 0x7

    #v10=(PosByte);
    move-object/from16 v0, v17

    invoke-interface {v0, v10}, Landroid/database/Cursor;->getInt(I)I

    move-result v10

    #v10=(Integer);
    const/16 v11, 0x8

    #v11=(PosByte);
    move-object/from16 v0, v17

    invoke-interface {v0, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    #v11=(Reference);
    const/16 v12, 0x9

    #v12=(PosByte);
    move-object/from16 v0, v17

    invoke-interface {v0, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    #v12=(Reference);
    const/16 v13, 0xa

    #v13=(PosByte);
    move-object/from16 v0, v17

    invoke-interface {v0, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    #v13=(Reference);
    const/16 v14, 0xb

    #v14=(PosByte);
    move-object/from16 v0, v17

    invoke-interface {v0, v14}, Landroid/database/Cursor;->getInt(I)I

    move-result v14

    #v14=(Integer);
    const/16 v15, 0xc

    #v15=(PosByte);
    move-object/from16 v0, v17

    invoke-interface {v0, v15}, Landroid/database/Cursor;->getInt(I)I

    move-result v15

    #v15=(Integer);
    const/16 v16, 0xd

    #v16=(PosByte);
    move-object/from16 v0, v17

    move/from16 v1, v16

    #v1=(PosByte);
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v16

    #v16=(Integer);
    invoke-direct/range {v2 .. v16}, Lcom/google/android/apps/analytics/Event;-><init>(JLjava/lang/String;IIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V

    #v2=(Reference);
    const/4 v3, 0x1

    #v3=(One);
    move-object/from16 v0, v17

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v2, v3}, Lcom/google/android/apps/analytics/Event;->setUserId(I)V

    const-string v3, "event_id"

    #v3=(Reference);
    move-object/from16 v0, v17

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    #v3=(Integer);
    move-object/from16 v0, v17

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    #v3=(LongLo);
    const-string v5, "__##GOOGLETRANSACTION##__"

    iget-object v6, v2, Lcom/google/android/apps/analytics/Event;->category:Ljava/lang/String;

    #v6=(Reference);
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    #v5=(Boolean);
    if-eqz v5, :cond_2

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    #v1=(Reference);
    invoke-virtual {v0, v3, v4, v1}, Lcom/google/android/apps/analytics/PersistentHitStore;->getTransaction(JLandroid/database/sqlite/SQLiteDatabase;)Lcom/google/android/apps/analytics/Transaction;

    move-result-object v5

    #v5=(Reference);
    if-nez v5, :cond_0

    const-string v6, "GoogleAnalyticsTracker"

    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    #v7=(Reference);
    const-string v8, "missing expected transaction for event "

    #v8=(Reference);
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    #v3=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    invoke-virtual {v2, v5}, Lcom/google/android/apps/analytics/Event;->setTransaction(Lcom/google/android/apps/analytics/Transaction;)V

    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);
    move-object/from16 v0, v18

    #v0=(Reference);
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    :catch_0
    #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v6=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
    move-exception v2

    #v2=(Reference);
    move-object/from16 v3, v17

    :goto_2
    :try_start_2
    #v3=(Reference);v17=(Conflicted);
    const-string v4, "GoogleAnalyticsTracker"

    #v4=(Reference);
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v2, 0x0

    #v2=(Null);
    new-array v2, v2, [Lcom/google/android/apps/analytics/Event;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    #v2=(Reference);
    if-eqz v3, :cond_1

    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    :cond_1
    :goto_3
    #v3=(Conflicted);v4=(Conflicted);
    return-object v2

    :cond_2
    :try_start_3
    #v0=(Reference);v1=(PosByte);v3=(LongLo);v4=(LongHi);v5=(Boolean);v6=(Reference);v7=(Integer);v8=(Integer);v9=(Integer);v10=(Integer);v11=(Reference);v12=(Reference);v13=(Reference);v14=(Integer);v15=(Integer);v16=(Integer);v17=(Reference);
    const-string v5, "__##GOOGLEITEM##__"

    #v5=(Reference);
    iget-object v6, v2, Lcom/google/android/apps/analytics/Event;->category:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    #v5=(Boolean);
    if-eqz v5, :cond_5

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    #v1=(Reference);
    invoke-virtual {v0, v3, v4, v1}, Lcom/google/android/apps/analytics/PersistentHitStore;->getItem(JLandroid/database/sqlite/SQLiteDatabase;)Lcom/google/android/apps/analytics/Item;

    move-result-object v5

    #v5=(Reference);
    if-nez v5, :cond_3

    const-string v6, "GoogleAnalyticsTracker"

    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    #v7=(Reference);
    const-string v8, "missing expected item for event "

    #v8=(Reference);
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    #v3=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    invoke-virtual {v2, v5}, Lcom/google/android/apps/analytics/Event;->setItem(Lcom/google/android/apps/analytics/Item;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
    move-exception v2

    :goto_4
    #v2=(Reference);
    if-eqz v17, :cond_4

    invoke-interface/range {v17 .. v17}, Landroid/database/Cursor;->close()V

    :cond_4
    throw v2

    :cond_5
    #v0=(Reference);v1=(PosByte);v3=(LongLo);v4=(LongHi);v5=(Boolean);v6=(Reference);v7=(Integer);v8=(Integer);v9=(Integer);v10=(Integer);v11=(Reference);v12=(Reference);v13=(Reference);v14=(Integer);v15=(Integer);v16=(Integer);
    const/4 v5, 0x1

    #v5=(One);
    move/from16 v0, p3

    #v0=(Integer);
    if-le v0, v5, :cond_6

    :try_start_4
    move-object/from16 v0, p0

    #v0=(Reference);
    move-object/from16 v1, p2

    #v1=(Reference);
    invoke-virtual {v0, v3, v4, v1}, Lcom/google/android/apps/analytics/PersistentHitStore;->getCustomVariables(JLandroid/database/sqlite/SQLiteDatabase;)Lcom/google/android/apps/analytics/CustomVariableBuffer;

    move-result-object v3

    :goto_5
    #v0=(Conflicted);v1=(Conflicted);v3=(Reference);
    invoke-virtual {v2, v3}, Lcom/google/android/apps/analytics/Event;->setCustomVariableBuffer(Lcom/google/android/apps/analytics/CustomVariableBuffer;)V

    goto :goto_1

    :cond_6
    #v0=(Integer);v1=(PosByte);v3=(LongLo);
    new-instance v3, Lcom/google/android/apps/analytics/CustomVariableBuffer;

    #v3=(UninitRef);
    invoke-direct {v3}, Lcom/google/android/apps/analytics/CustomVariableBuffer;-><init>()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0

    #v3=(Reference);
    goto :goto_5

    :cond_7
    #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
    if-eqz v17, :cond_8

    invoke-interface/range {v17 .. v17}, Landroid/database/Cursor;->close()V

    :cond_8
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    move-result v2

    #v2=(Integer);
    new-array v2, v2, [Lcom/google/android/apps/analytics/Event;

    #v2=(Reference);
    move-object/from16 v0, v18

    #v0=(Reference);
    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lcom/google/android/apps/analytics/Event;

    goto :goto_3

    :catchall_1
    #v0=(Uninit);v1=(Uninit);v2=(Conflicted);v6=(Conflicted);v11=(Null);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);
    move-exception v2

    #v2=(Reference);
    move-object/from16 v17, v11

    #v17=(Null);
    goto :goto_4

    :catchall_2
    #v0=(Conflicted);v1=(Conflicted);v3=(Reference);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
    move-exception v2

    move-object/from16 v17, v3

    #v17=(Reference);
    goto :goto_4

    :catch_1
    #v0=(Uninit);v1=(Uninit);v2=(Conflicted);v3=(Conflicted);v11=(Null);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);
    move-exception v2

    #v2=(Reference);
    move-object v3, v11

    #v3=(Null);
    goto :goto_2
.end method

.method public peekHits()[Lcom/google/android/apps/analytics/Hit;
    .locals 1

    const/16 v0, 0x3e8

    #v0=(PosShort);
    invoke-virtual {p0, v0}, Lcom/google/android/apps/analytics/PersistentHitStore;->peekHits(I)[Lcom/google/android/apps/analytics/Hit;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public peekHits(I)[Lcom/google/android/apps/analytics/Hit;
    .locals 11

    const/4 v9, 0x0

    #v9=(Null);
    new-instance v10, Ljava/util/ArrayList;

    #v10=(UninitRef);
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    #v10=(Reference);
    iget-object v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->databaseHelper:Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "hits"

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
    const-string v7, "hit_id"

    #v7=(Reference);
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v8

    #v8=(Reference);
    invoke-virtual/range {v0 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    :goto_0
    :try_start_1
    #v2=(Reference);v3=(Conflicted);v4=(Conflicted);
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/apps/analytics/Hit;

    #v0=(UninitRef);
    const/4 v2, 0x1

    #v2=(One);
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-interface {v1, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    #v3=(LongLo);v4=(LongHi);
    invoke-direct {v0, v2, v3, v4}, Lcom/google/android/apps/analytics/Hit;-><init>(Ljava/lang/String;J)V

    #v0=(Reference);
    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    move-exception v0

    :goto_1
    :try_start_2
    #v0=(Reference);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    const-string v2, "GoogleAnalyticsTracker"

    #v2=(Reference);
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    #v0=(Null);
    new-array v0, v0, [Lcom/google/android/apps/analytics/Hit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    #v0=(Reference);
    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_0
    :goto_2
    return-object v0

    :cond_1
    #v0=(Boolean);v5=(Null);v6=(Null);v7=(Reference);v8=(Reference);
    if-eqz v1, :cond_2

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_2
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    new-array v0, v0, [Lcom/google/android/apps/analytics/Hit;

    #v0=(Reference);
    invoke-interface {v10, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/apps/analytics/Hit;

    goto :goto_2

    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v1, v9

    :goto_3
    #v1=(Reference);
    if-eqz v1, :cond_3

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_3
    throw v0

    :catchall_1
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_3

    :catch_1
    #v0=(Conflicted);v1=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v1, v9

    #v1=(Null);
    goto :goto_1
.end method

.method putCustomVariables(Lcom/google/android/apps/analytics/Event;Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 11

    const/4 v10, 0x5

    #v10=(PosByte);
    const/4 v1, 0x1

    #v1=(One);
    const-string v0, "__##GOOGLEITEM##__"

    #v0=(Reference);
    iget-object v2, p1, Lcom/google/android/apps/analytics/Event;->category:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    const-string v0, "__##GOOGLETRANSACTION##__"

    #v0=(Reference);
    iget-object v2, p1, Lcom/google/android/apps/analytics/Event;->category:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    return-void

    :cond_1
    :try_start_0
    #v0=(Boolean);v1=(One);v2=(Reference);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    invoke-virtual {p1}, Lcom/google/android/apps/analytics/Event;->getCustomVariableBuffer()Lcom/google/android/apps/analytics/CustomVariableBuffer;

    move-result-object v0

    #v0=(Reference);
    iget-boolean v2, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->useStoredVisitorVars:Z

    #v2=(Boolean);
    if-eqz v2, :cond_7

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/apps/analytics/CustomVariableBuffer;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/google/android/apps/analytics/CustomVariableBuffer;-><init>()V

    #v0=(Reference);
    invoke-virtual {p1, v0}, Lcom/google/android/apps/analytics/Event;->setCustomVariableBuffer(Lcom/google/android/apps/analytics/CustomVariableBuffer;)V

    :cond_2
    move v2, v1

    :goto_1
    #v2=(Integer);v3=(Conflicted);v4=(Conflicted);
    if-gt v2, v10, :cond_4

    iget-object v3, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->visitorCVCache:Lcom/google/android/apps/analytics/CustomVariableBuffer;

    #v3=(Reference);
    invoke-virtual {v3, v2}, Lcom/google/android/apps/analytics/CustomVariableBuffer;->getCustomVariableAt(I)Lcom/google/android/apps/analytics/CustomVariable;

    move-result-object v3

    invoke-virtual {v0, v2}, Lcom/google/android/apps/analytics/CustomVariableBuffer;->getCustomVariableAt(I)Lcom/google/android/apps/analytics/CustomVariable;

    move-result-object v4

    #v4=(Reference);
    if-eqz v3, :cond_3

    if-nez v4, :cond_3

    invoke-virtual {v0, v3}, Lcom/google/android/apps/analytics/CustomVariableBuffer;->setCustomVariable(Lcom/google/android/apps/analytics/CustomVariable;)V

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    #v3=(Conflicted);v4=(Conflicted);
    const/4 v2, 0x0

    #v2=(Null);
    iput-boolean v2, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->useStoredVisitorVars:Z

    move-object v2, v0

    :goto_2
    #v2=(Reference);
    if-eqz v2, :cond_0

    move v0, v1

    :goto_3
    #v0=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    if-gt v0, v10, :cond_0

    invoke-virtual {v2, v0}, Lcom/google/android/apps/analytics/CustomVariableBuffer;->isIndexAvailable(I)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_5

    invoke-virtual {v2, v0}, Lcom/google/android/apps/analytics/CustomVariableBuffer;->getCustomVariableAt(I)Lcom/google/android/apps/analytics/CustomVariable;

    move-result-object v3

    #v3=(Reference);
    new-instance v4, Landroid/content/ContentValues;

    #v4=(UninitRef);
    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    #v4=(Reference);
    const-string v5, "event_id"

    #v5=(Reference);
    const/4 v6, 0x0

    #v6=(Null);
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    #v6=(Reference);
    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v5, "cv_index"

    invoke-virtual {v3}, Lcom/google/android/apps/analytics/CustomVariable;->getIndex()I

    move-result v6

    #v6=(Integer);
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    #v6=(Reference);
    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v5, "cv_name"

    invoke-virtual {v3}, Lcom/google/android/apps/analytics/CustomVariable;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "cv_scope"

    invoke-virtual {v3}, Lcom/google/android/apps/analytics/CustomVariable;->getScope()I

    move-result v6

    #v6=(Integer);
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    #v6=(Reference);
    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v5, "cv_value"

    invoke-virtual {v3}, Lcom/google/android/apps/analytics/CustomVariable;->getValue()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "custom_var_cache"

    const-string v6, "cv_index = ?"

    const/4 v7, 0x1

    #v7=(One);
    new-array v7, v7, [Ljava/lang/String;

    #v7=(Reference);
    const/4 v8, 0x0

    #v8=(Null);
    invoke-virtual {v3}, Lcom/google/android/apps/analytics/CustomVariable;->getIndex()I

    move-result v9

    #v9=(Integer);
    invoke-static {v9}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v9

    #v9=(Reference);
    aput-object v9, v7, v8

    invoke-virtual {p2, v5, v4, v6, v7}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    invoke-virtual {v3}, Lcom/google/android/apps/analytics/CustomVariable;->getScope()I

    move-result v4

    #v4=(Integer);
    if-ne v4, v1, :cond_6

    iget-object v4, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->visitorCVCache:Lcom/google/android/apps/analytics/CustomVariableBuffer;

    #v4=(Reference);
    invoke-virtual {v4, v3}, Lcom/google/android/apps/analytics/CustomVariableBuffer;->setCustomVariable(Lcom/google/android/apps/analytics/CustomVariable;)V

    :cond_5
    :goto_4
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_6
    #v3=(Reference);v4=(Integer);v5=(Reference);v6=(Reference);v7=(Reference);v8=(Null);v9=(Reference);
    iget-object v4, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->visitorCVCache:Lcom/google/android/apps/analytics/CustomVariableBuffer;

    #v4=(Reference);
    invoke-virtual {v3}, Lcom/google/android/apps/analytics/CustomVariable;->getIndex()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v4, v3}, Lcom/google/android/apps/analytics/CustomVariableBuffer;->clearCustomVariableAt(I)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    move-exception v0

    #v0=(Reference);
    const-string v1, "GoogleAnalyticsTracker"

    #v1=(Reference);
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    :cond_7
    #v1=(One);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    move-object v2, v0

    #v2=(Reference);
    goto/16 :goto_2
.end method

.method public putEvent(Lcom/google/android/apps/analytics/Event;)V
    .locals 5

    iget v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->numStoredHits:I

    #v0=(Integer);
    const/16 v1, 0x3e8

    #v1=(PosShort);
    if-lt v0, v1, :cond_1

    const-string v0, "GoogleAnalyticsTracker"

    #v0=(Reference);
    const-string v1, "Store full. Not storing last event."

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    :cond_1
    #v0=(Integer);v1=(PosShort);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    iget v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->sampleRate:I

    const/16 v1, 0x64

    #v1=(PosByte);
    if-eq v0, v1, :cond_3

    invoke-virtual {p1}, Lcom/google/android/apps/analytics/Event;->getUserId()I

    move-result v0

    const/4 v1, -0x1

    #v1=(Byte);
    if-ne v0, v1, :cond_2

    iget v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->storeId:I

    :goto_1
    rem-int/lit16 v0, v0, 0x2710

    iget v1, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->sampleRate:I

    #v1=(Integer);
    mul-int/lit8 v1, v1, 0x64

    if-lt v0, v1, :cond_3

    invoke-static {}, Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;->getInstance()Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;->getDebug()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const-string v0, "GoogleAnalyticsTracker"

    #v0=(Reference);
    const-string v1, "User has been sampled out. Aborting hit."

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_2
    #v0=(Integer);v1=(Byte);
    invoke-virtual {p1}, Lcom/google/android/apps/analytics/Event;->getUserId()I

    move-result v0

    goto :goto_1

    :cond_3
    #v1=(Integer);
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->databaseHelper:Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    :try_start_1
    #v1=(Reference);
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    iget-boolean v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->sessionStarted:Z

    #v0=(Boolean);
    if-nez v0, :cond_4

    invoke-virtual {p0, v1}, Lcom/google/android/apps/analytics/PersistentHitStore;->storeUpdatedSession(Landroid/database/sqlite/SQLiteDatabase;)V

    :cond_4
    const/4 v0, 0x1

    #v0=(One);
    invoke-direct {p0, p1, v1, v0}, Lcom/google/android/apps/analytics/PersistentHitStore;->putEvent(Lcom/google/android/apps/analytics/Event;Landroid/database/sqlite/SQLiteDatabase;Z)V

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_5

    invoke-static {v1}, Lcom/google/android/apps/analytics/PersistentHitStore;->endTransaction(Landroid/database/sqlite/SQLiteDatabase;)Z

    :cond_5
    :goto_2
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    monitor-exit p0

    goto :goto_0

    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    #v0=(Conflicted);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    move-exception v0

    :try_start_3
    #v0=(Reference);
    const-string v1, "GoogleAnalyticsTracker"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "Can\'t get db: "

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catch_1
    #v0=(Conflicted);v2=(Uninit);v3=(Uninit);
    move-exception v0

    :try_start_4
    #v0=(Reference);
    const-string v2, "GoogleAnalyticsTracker"

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "putEventOuter:"

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
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_5

    invoke-static {v1}, Lcom/google/android/apps/analytics/PersistentHitStore;->endTransaction(Landroid/database/sqlite/SQLiteDatabase;)Z

    goto :goto_2

    :catchall_1
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_6

    invoke-static {v1}, Lcom/google/android/apps/analytics/PersistentHitStore;->endTransaction(Landroid/database/sqlite/SQLiteDatabase;)Z

    :cond_6
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0
.end method

.method readCurrentReferrer(Landroid/database/sqlite/SQLiteDatabase;)Lcom/google/android/apps/analytics/Referrer;
    .locals 9

    const/4 v8, 0x0

    :try_start_0
    #v8=(Null);
    const-string v1, "referrer"

    #v1=(Reference);
    const/4 v0, 0x4

    #v0=(PosByte);
    new-array v2, v0, [Ljava/lang/String;

    #v2=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    const-string v3, "referrer"

    #v3=(Reference);
    aput-object v3, v2, v0

    const/4 v0, 0x1

    #v0=(One);
    const-string v3, "timestamp_referrer"

    aput-object v3, v2, v0

    const/4 v0, 0x2

    #v0=(PosByte);
    const-string v3, "referrer_visit"

    aput-object v3, v2, v0

    const/4 v0, 0x3

    const-string v3, "referrer_index"

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

    move-result-object v6

    :try_start_1
    #v6=(Reference);
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_3

    const-string v0, "timestamp_referrer"

    #v0=(Reference);
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    const-string v0, "referrer_visit"

    #v0=(Reference);
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    #v4=(Integer);
    const-string v0, "referrer_index"

    #v0=(Reference);
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    #v5=(Integer);
    const-string v0, "referrer"

    #v0=(Reference);
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v0, Lcom/google/android/apps/analytics/Referrer;

    #v0=(UninitRef);
    invoke-direct/range {v0 .. v5}, Lcom/google/android/apps/analytics/Referrer;-><init>(Ljava/lang/String;JII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_0
    #v0=(Reference);v2=(Conflicted);v3=(Conflicted);
    if-eqz v6, :cond_0

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    :cond_0
    :goto_1
    #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return-object v0

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v1, v8

    :goto_2
    :try_start_2
    #v1=(Reference);
    const-string v2, "GoogleAnalyticsTracker"

    #v2=(Reference);
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v1, :cond_1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_1
    move-object v0, v8

    #v0=(Null);
    goto :goto_1

    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v6, v8

    :goto_3
    #v6=(Reference);
    if-eqz v6, :cond_2

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    :cond_2
    throw v0

    :catchall_1
    #v0=(Conflicted);v1=(Reference);v4=(Integer);v5=(Integer);v7=(Null);
    move-exception v0

    #v0=(Reference);
    goto :goto_3

    :catchall_2
    #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move-exception v0

    move-object v6, v1

    #v6=(Reference);
    goto :goto_3

    :catch_1
    #v0=(Conflicted);v4=(Integer);v5=(Integer);v7=(Null);
    move-exception v0

    #v0=(Reference);
    move-object v1, v6

    goto :goto_2

    :cond_3
    #v0=(Boolean);v2=(Reference);v3=(Null);v4=(Null);v5=(Null);
    move-object v0, v8

    #v0=(Null);
    goto :goto_0
.end method

.method public setAnonymizeIp(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->anonymizeIp:Z

    return-void
.end method

.method public setReferrer(Ljava/lang/String;)Z
    .locals 12

    const-wide/16 v2, 0x1

    #v2=(LongLo);v3=(LongHi);
    const-wide/16 v10, 0x0

    #v10=(LongLo);v11=(LongHi);
    const/4 v4, 0x0

    #v4=(Null);
    invoke-static {p1}, Lcom/google/android/apps/analytics/PersistentHitStore;->formatReferrer(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    if-nez v0, :cond_0

    move v0, v4

    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    return v0

    :cond_0
    :try_start_0
    #v0=(Reference);v1=(Uninit);v2=(LongLo);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    iget-object v1, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->databaseHelper:Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {p0, v5}, Lcom/google/android/apps/analytics/PersistentHitStore;->readCurrentReferrer(Landroid/database/sqlite/SQLiteDatabase;)Lcom/google/android/apps/analytics/Referrer;

    move-result-object v6

    #v6=(Reference);
    new-instance v7, Landroid/content/ContentValues;

    #v7=(UninitRef);
    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    #v7=(Reference);
    const-string v1, "referrer"

    invoke-virtual {v7, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "timestamp_referrer"

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v0, "referrer_visit"

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lcom/google/android/apps/analytics/Referrer;->getIndex()I

    move-result v0

    #v0=(Integer);
    int-to-long v0, v0

    #v0=(LongLo);v1=(LongHi);
    invoke-virtual {v6}, Lcom/google/android/apps/analytics/Referrer;->getTimeStamp()J

    move-result-wide v8

    #v8=(LongLo);v9=(LongHi);
    cmp-long v6, v8, v10

    #v6=(Byte);
    if-lez v6, :cond_1

    add-long/2addr v0, v2

    :cond_1
    :goto_1
    #v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    const-string v2, "referrer_index"

    #v2=(Reference);
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v7, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-direct {p0, v5, v7}, Lcom/google/android/apps/analytics/PersistentHitStore;->setReferrerDatabase(Landroid/database/sqlite/SQLiteDatabase;Landroid/content/ContentValues;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/apps/analytics/PersistentHitStore;->startNewVisit()V

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0

    :catch_0
    #v0=(Reference);v1=(Conflicted);v2=(LongLo);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    move-exception v0

    const-string v1, "GoogleAnalyticsTracker"

    #v1=(Reference);
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v4

    #v0=(Null);
    goto :goto_0

    :cond_2
    #v0=(Boolean);v1=(LongHi);v2=(Reference);v5=(Reference);v6=(Conflicted);v7=(Reference);v8=(Conflicted);v9=(Conflicted);
    move v0, v4

    #v0=(Null);
    goto :goto_0

    :cond_3
    #v0=(Reference);v1=(Reference);v2=(LongLo);v6=(Reference);v8=(Uninit);v9=(Uninit);
    move-wide v0, v2

    #v0=(LongLo);v1=(LongHi);
    goto :goto_1
.end method

.method public setSampleRate(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->sampleRate:I

    return-void
.end method

.method public declared-synchronized startNewVisit()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    #v0=(Null);
    iput-boolean v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->sessionStarted:Z

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->useStoredVisitorVars:Z

    invoke-virtual {p0}, Lcom/google/android/apps/analytics/PersistentHitStore;->getNumStoredHitsFromDb()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->numStoredHits:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0
.end method

.method storeUpdatedSession(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 9

    const-wide/16 v7, 0x3e8

    #v7=(LongLo);v8=(LongHi);
    const/4 v6, 0x1

    #v6=(One);
    const/4 v5, 0x0

    #v5=(Null);
    iget-object v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->databaseHelper:Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/google/android/apps/analytics/PersistentHitStore$DataBaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "session"

    #v1=(Reference);
    invoke-virtual {v0, v1, v5, v5}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    iget-wide v1, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampFirst:J

    #v1=(LongLo);v2=(LongHi);
    const-wide/16 v3, 0x0

    #v3=(LongLo);v4=(LongHi);
    cmp-long v1, v1, v3

    #v1=(Byte);
    if-nez v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    #v1=(LongLo);
    div-long/2addr v1, v7

    iput-wide v1, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampFirst:J

    iput-wide v1, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampPrevious:J

    iput-wide v1, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampCurrent:J

    iput v6, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->visits:I

    :goto_0
    #v1=(Conflicted);
    new-instance v1, Landroid/content/ContentValues;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    #v1=(Reference);
    const-string v2, "timestamp_first"

    #v2=(Reference);
    iget-wide v3, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampFirst:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v2, "timestamp_previous"

    iget-wide v3, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampPrevious:J

    #v3=(LongLo);
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v2, "timestamp_current"

    iget-wide v3, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampCurrent:J

    #v3=(LongLo);
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v2, "visits"

    iget v3, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->visits:I

    #v3=(Integer);
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "store_id"

    iget v3, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->storeId:I

    #v3=(Integer);
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "session"

    invoke-virtual {v0, v2, v5, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    iput-boolean v6, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->sessionStarted:Z

    return-void

    :cond_0
    #v1=(Byte);v2=(LongHi);v3=(LongLo);
    iget-wide v1, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampCurrent:J

    #v1=(LongLo);
    iput-wide v1, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampPrevious:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    div-long/2addr v1, v7

    iput-wide v1, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampCurrent:J

    iget-wide v1, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampCurrent:J

    iget-wide v3, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampPrevious:J

    cmp-long v1, v1, v3

    #v1=(Byte);
    if-nez v1, :cond_1

    iget-wide v1, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampCurrent:J

    #v1=(LongLo);
    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->timestampCurrent:J

    :cond_1
    #v1=(Conflicted);
    iget v1, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->visits:I

    #v1=(Integer);
    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->visits:I

    goto :goto_0
.end method

.method writeEventToDatabase(Lcom/google/android/apps/analytics/Event;Lcom/google/android/apps/analytics/Referrer;Landroid/database/sqlite/SQLiteDatabase;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/sqlite/SQLiteException;
        }
    .end annotation

    new-instance v2, Landroid/content/ContentValues;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    #v2=(Reference);
    invoke-static {p1, p2}, Lcom/google/android/apps/analytics/HitBuilder;->constructHitRequestPath(Lcom/google/android/apps/analytics/Event;Lcom/google/android/apps/analytics/Referrer;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "hit_string"

    #v1=(Reference);
    invoke-virtual {v2, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "hit_time"

    #v3=(Reference);
    if-eqz p4, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    :goto_0
    #v0=(LongLo);v1=(LongHi);
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v2, v3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v0, "hits"

    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p3, v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    iget v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->numStoredHits:I

    #v0=(Integer);
    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/apps/analytics/PersistentHitStore;->numStoredHits:I

    return-void

    :cond_0
    #v0=(Reference);v1=(Reference);
    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    goto :goto_0
.end method

*/}
