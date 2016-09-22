package com.mobileapptracker; class MATProvider {/*

.class public Lcom/mobileapptracker/MATProvider;
.super Landroid/content/ContentProvider;
.source "MATProvider.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mobileapptracker/MATProvider$DatabaseHelper;
    }
.end annotation


# static fields
.field private static final DATABASE_CREATE:Ljava/lang/String; = "create table referrer_apps (_id integer primary key autoincrement, publisher_package_name text not null, tracking_id text, unique(publisher_package_name) on conflict replace);"

.field private static final DATABASE_NAME:Ljava/lang/String; = "MAT"

.field private static final DATABASE_TABLE:Ljava/lang/String; = "referrer_apps"

.field private static final DATABASE_VERSION:I = 0x1

.field public static final PUBLISHER_PACKAGE_NAME:Ljava/lang/String; = "publisher_package_name"

.field private static final REFERRER_APPS:I = 0x1

.field public static final TRACKING_ID:Ljava/lang/String; = "tracking_id"

.field public static final _ID:Ljava/lang/String; = "_id"

.field private static final uriMatcher:Landroid/content/UriMatcher;


# instance fields
.field private matDB:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 25
    new-instance v0, Landroid/content/UriMatcher;

    #v0=(UninitRef);
    const/4 v1, -0x1

    #v1=(Byte);
    invoke-direct {v0, v1}, Landroid/content/UriMatcher;-><init>(I)V

    #v0=(Reference);
    sput-object v0, Lcom/mobileapptracker/MATProvider;->uriMatcher:Landroid/content/UriMatcher;

    .line 26
    sget-object v0, Lcom/mobileapptracker/MATProvider;->uriMatcher:Landroid/content/UriMatcher;

    const-string v1, "*"

    #v1=(Reference);
    const-string v2, "referrer_apps"

    #v2=(Reference);
    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 4
    .parameter "uri"
    .parameter "selection"
    .parameter "selectionArgs"

    .prologue
    .line 63
    const/4 v0, 0x0

    .line 64
    .local v0, count:I
    #v0=(Null);
    sget-object v1, Lcom/mobileapptracker/MATProvider;->uriMatcher:Landroid/content/UriMatcher;

    #v1=(Reference);
    invoke-virtual {v1, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v1

    #v1=(Integer);
    packed-switch v1, :pswitch_data_0

    .line 71
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 72
    #v1=(UninitRef);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "Unknown URI "

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 71
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    throw v1

    .line 66
    :pswitch_0
    #v1=(Integer);v2=(Uninit);v3=(Uninit);
    iget-object v1, p0, Lcom/mobileapptracker/MATProvider;->matDB:Landroid/database/sqlite/SQLiteDatabase;

    .line 67
    #v1=(Reference);
    const-string v2, "referrer_apps"

    .line 66
    #v2=(Reference);
    invoke-virtual {v1, v2, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    .line 74
    #v0=(Integer);
    invoke-virtual {p0}, Lcom/mobileapptracker/MATProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v1, p1, v2}, Landroid/content/ContentResolver;->notifyChange(Landroid/net/Uri;Landroid/database/ContentObserver;)V

    .line 75
    return v0

    .line 64
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 3
    .parameter "uri"

    .prologue
    .line 80
    sget-object v0, Lcom/mobileapptracker/MATProvider;->uriMatcher:Landroid/content/UriMatcher;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v0

    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    .line 85
    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "Unsupported URI: "

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 83
    :pswitch_0
    #v0=(Integer);v1=(Uninit);v2=(Uninit);
    const-string v0, "vnd.android.cursor.dir/vnd.mobileapptracker.referrer_apps "

    #v0=(Reference);
    return-object v0

    .line 80
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 6
    .parameter "uri"
    .parameter "values"

    .prologue
    .line 92
    iget-object v3, p0, Lcom/mobileapptracker/MATProvider;->matDB:Landroid/database/sqlite/SQLiteDatabase;

    #v3=(Reference);
    const-string v4, "referrer_apps"

    #v4=(Reference);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v3, v4, v5, p2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v1

    .line 95
    .local v1, rowID:J
    #v1=(LongLo);v2=(LongHi);
    const-wide/16 v3, 0x0

    #v3=(LongLo);v4=(LongHi);
    cmp-long v3, v1, v3

    #v3=(Byte);
    if-lez v3, :cond_0

    .line 96
    invoke-static {p1, v1, v2}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v0

    .line 97
    .local v0, _uri:Landroid/net/Uri;
    #v0=(Reference);
    invoke-virtual {p0}, Lcom/mobileapptracker/MATProvider;->getContext()Landroid/content/Context;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const/4 v4, 0x0

    #v4=(Null);
    invoke-virtual {v3, v0, v4}, Landroid/content/ContentResolver;->notifyChange(Landroid/net/Uri;Landroid/database/ContentObserver;)V

    .line 98
    return-object v0

    .line 100
    .end local v0           #_uri:Landroid/net/Uri;
    :cond_0
    #v0=(Uninit);v3=(Byte);v4=(LongHi);
    new-instance v3, Landroid/database/SQLException;

    #v3=(UninitRef);
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    const-string v5, "Failed to insert row into "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/database/SQLException;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    throw v3
.end method

.method public onCreate()Z
    .locals 3

    .prologue
    .line 105
    invoke-virtual {p0}, Lcom/mobileapptracker/MATProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 106
    .local v0, context:Landroid/content/Context;
    #v0=(Reference);
    new-instance v1, Lcom/mobileapptracker/MATProvider$DatabaseHelper;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Lcom/mobileapptracker/MATProvider$DatabaseHelper;-><init>(Landroid/content/Context;)V

    .line 107
    .local v1, dbHelper:Lcom/mobileapptracker/MATProvider$DatabaseHelper;
    #v1=(Reference);
    invoke-virtual {v1}, Lcom/mobileapptracker/MATProvider$DatabaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    #v2=(Reference);
    iput-object v2, p0, Lcom/mobileapptracker/MATProvider;->matDB:Landroid/database/sqlite/SQLiteDatabase;

    .line 108
    iget-object v2, p0, Lcom/mobileapptracker/MATProvider;->matDB:Landroid/database/sqlite/SQLiteDatabase;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    :goto_0
    #v2=(Boolean);
    return v2

    :cond_0
    #v2=(Reference);
    const/4 v2, 0x1

    #v2=(One);
    goto :goto_0
.end method

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 9
    .parameter "uri"
    .parameter "projection"
    .parameter "selection"
    .parameter "selectionArgs"
    .parameter "sortOrder"

    .prologue
    const/4 v5, 0x0

    .line 113
    #v5=(Null);
    new-instance v0, Landroid/database/sqlite/SQLiteQueryBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/database/sqlite/SQLiteQueryBuilder;-><init>()V

    .line 114
    .local v0, sqlBuilder:Landroid/database/sqlite/SQLiteQueryBuilder;
    #v0=(Reference);
    const-string v1, "referrer_apps"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteQueryBuilder;->setTables(Ljava/lang/String;)V

    .line 116
    if-eqz p5, :cond_0

    const-string v1, ""

    if-ne p5, v1, :cond_1

    .line 117
    :cond_0
    const-string p5, "publisher_package_name"

    .line 120
    :cond_1
    iget-object v1, p0, Lcom/mobileapptracker/MATProvider;->matDB:Landroid/database/sqlite/SQLiteDatabase;

    move-object v2, p2

    #v2=(Reference);
    move-object v3, p3

    #v3=(Reference);
    move-object v4, p4

    #v4=(Reference);
    move-object v6, v5

    #v6=(Null);
    move-object v7, p5

    .line 119
    #v7=(Reference);
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteQueryBuilder;->query(Landroid/database/sqlite/SQLiteDatabase;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 129
    .local v8, c:Landroid/database/Cursor;
    #v8=(Reference);
    invoke-virtual {p0}, Lcom/mobileapptracker/MATProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-interface {v8, v1, p1}, Landroid/database/Cursor;->setNotificationUri(Landroid/content/ContentResolver;Landroid/net/Uri;)V

    .line 130
    return-object v8
.end method

.method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 4
    .parameter "uri"
    .parameter "values"
    .parameter "selection"
    .parameter "selectionArgs"

    .prologue
    .line 135
    const/4 v0, 0x0

    .line 136
    .local v0, count:I
    #v0=(Null);
    sget-object v1, Lcom/mobileapptracker/MATProvider;->uriMatcher:Landroid/content/UriMatcher;

    #v1=(Reference);
    invoke-virtual {v1, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v1

    #v1=(Integer);
    packed-switch v1, :pswitch_data_0

    .line 144
    new-instance v1, Ljava/lang/IllegalArgumentException;

    #v1=(UninitRef);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "Unknown URI "

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    throw v1

    .line 138
    :pswitch_0
    #v1=(Integer);v2=(Uninit);v3=(Uninit);
    iget-object v1, p0, Lcom/mobileapptracker/MATProvider;->matDB:Landroid/database/sqlite/SQLiteDatabase;

    .line 139
    #v1=(Reference);
    const-string v2, "referrer_apps"

    .line 138
    #v2=(Reference);
    invoke-virtual {v1, v2, p2, p3, p4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    .line 146
    #v0=(Integer);
    invoke-virtual {p0}, Lcom/mobileapptracker/MATProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v1, p1, v2}, Landroid/content/ContentResolver;->notifyChange(Landroid/net/Uri;Landroid/database/ContentObserver;)V

    .line 147
    return v0

    .line 136
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

*/}
