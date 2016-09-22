package com.facebook.android; class Facebook {/*

.class public Lcom/facebook/android/Facebook;
.super Ljava/lang/Object;
.source "Facebook.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/android/Facebook$AutoPublishAsyncTask;,
        Lcom/facebook/android/Facebook$DialogListener;,
        Lcom/facebook/android/Facebook$ServiceListener;,
        Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;
    }
.end annotation


# static fields
.field private static final ANALYTICS_EVENT:Ljava/lang/String; = "event"

.field private static final APPLICATION_FIELDS:Ljava/lang/String; = "fields"

.field public static final ATTRIBUTION_ID_COLUMN_NAME:Ljava/lang/String; = "aid"

.field public static final ATTRIBUTION_ID_CONTENT_URI:Landroid/net/Uri; = null

.field private static final ATTRIBUTION_KEY:Ljava/lang/String; = "attribution"

.field private static final ATTRIBUTION_PREFERENCES:Ljava/lang/String; = "com.facebook.sdk.attributionTracking"

.field public static final CANCEL_URI:Ljava/lang/String; = "fbconnect://cancel"

.field private static final DEFAULT_AUTH_ACTIVITY_CODE:I = 0x7f99

.field protected static DIALOG_BASE_URL:Ljava/lang/String; = null

.field public static final EXPIRES:Ljava/lang/String; = "expires_in"

.field public static final FB_APP_SIGNATURE:Ljava/lang/String; = "30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2"

.field public static final FORCE_DIALOG_AUTH:I = -0x1

.field protected static GRAPH_BASE_URL:Ljava/lang/String; = null

.field private static final LOGIN:Ljava/lang/String; = "oauth"

.field private static final MOBILE_INSTALL_EVENT:Ljava/lang/String; = "MOBILE_APP_INSTALL"

.field private static final PUBLISH_ACTIVITY_PATH:Ljava/lang/String; = "%s/activities"

.field public static final REDIRECT_URI:Ljava/lang/String; = "fbconnect://success"

.field protected static RESTSERVER_URL:Ljava/lang/String; = null

.field public static final SINGLE_SIGN_ON_DISABLED:Ljava/lang/String; = "service_disabled"

.field private static final SUPPORTS_ATTRIBUTION:Ljava/lang/String; = "supports_attribution"

.field public static final TOKEN:Ljava/lang/String; = "access_token"


# instance fields
.field private final REFRESH_TOKEN_BARRIER:J

.field private mAccessExpires:J

.field private mAccessToken:Ljava/lang/String;

.field private mAppId:Ljava/lang/String;

.field private mAuthActivity:Landroid/app/Activity;

.field private mAuthActivityCode:I

.field private mAuthDialogListener:Lcom/facebook/android/Facebook$DialogListener;

.field private mAuthPermissions:[Ljava/lang/String;

.field private mAutoPublishAsyncTask:Lcom/facebook/android/Facebook$AutoPublishAsyncTask;

.field private mLastAccessUpdate:J

.field private shouldAutoPublishInstall:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 71
    const-string v0, "content://com.facebook.katana.provider.AttributionIdProvider"

    #v0=(Reference);
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 70
    sput-object v0, Lcom/facebook/android/Facebook;->ATTRIBUTION_ID_CONTENT_URI:Landroid/net/Uri;

    .line 91
    const-string v0, "https://m.facebook.com/dialog/"

    .line 90
    sput-object v0, Lcom/facebook/android/Facebook;->DIALOG_BASE_URL:Ljava/lang/String;

    .line 93
    const-string v0, "https://graph.facebook.com/"

    .line 92
    sput-object v0, Lcom/facebook/android/Facebook;->GRAPH_BASE_URL:Ljava/lang/String;

    .line 95
    const-string v0, "https://api.facebook.com/restserver.php"

    .line 94
    sput-object v0, Lcom/facebook/android/Facebook;->RESTSERVER_URL:Ljava/lang/String;

    .line 61
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3
    .parameter "appId"

    .prologue
    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    const/4 v2, 0x0

    .line 121
    #v2=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    #p0=(Reference);
    iput-object v2, p0, Lcom/facebook/android/Facebook;->mAccessToken:Ljava/lang/String;

    .line 98
    iput-wide v0, p0, Lcom/facebook/android/Facebook;->mLastAccessUpdate:J

    .line 99
    iput-wide v0, p0, Lcom/facebook/android/Facebook;->mAccessExpires:J

    .line 109
    const-wide/32 v0, 0x5265c00

    iput-wide v0, p0, Lcom/facebook/android/Facebook;->REFRESH_TOKEN_BARRIER:J

    .line 111
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/facebook/android/Facebook;->shouldAutoPublishInstall:Z

    .line 112
    iput-object v2, p0, Lcom/facebook/android/Facebook;->mAutoPublishAsyncTask:Lcom/facebook/android/Facebook$AutoPublishAsyncTask;

    .line 122
    if-nez p1, :cond_0

    .line 123
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 124
    #v0=(UninitRef);
    const-string v1, "You must specify your application ID when instantiating a Facebook object. See README for details."

    .line 123
    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 127
    :cond_0
    #v0=(One);v1=(LongHi);
    iput-object p1, p0, Lcom/facebook/android/Facebook;->mAppId:Ljava/lang/String;

    .line 128
    return-void
.end method

.method static synthetic access$0(Lcom/facebook/android/Facebook;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 97
    iget-object v0, p0, Lcom/facebook/android/Facebook;->mAccessToken:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$1(Lcom/facebook/android/Facebook;Ljava/lang/String;Landroid/content/Context;)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Lcom/facebook/android/FacebookError;,
            Ljava/net/MalformedURLException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1005
    invoke-static {p0, p1, p2}, Lcom/facebook/android/Facebook;->publishInstall(Lcom/facebook/android/Facebook;Ljava/lang/String;Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$2(Lcom/facebook/android/Facebook;Lcom/facebook/android/Facebook$AutoPublishAsyncTask;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 112
    iput-object p1, p0, Lcom/facebook/android/Facebook;->mAutoPublishAsyncTask:Lcom/facebook/android/Facebook$AutoPublishAsyncTask;

    return-void
.end method

.method static synthetic access$3(Lcom/facebook/android/Facebook;)Lcom/facebook/android/Facebook$DialogListener;
    .locals 1
    .parameter

    .prologue
    .line 105
    iget-object v0, p0, Lcom/facebook/android/Facebook;->mAuthDialogListener:Lcom/facebook/android/Facebook$DialogListener;

    #v0=(Reference);
    return-object v0
.end method

.method public static getAttributionId(Landroid/content/ContentResolver;)Ljava/lang/String;
    .locals 8
    .parameter "contentResolver"

    .prologue
    const/4 v3, 0x0

    .line 948
    #v3=(Null);
    const/4 v0, 0x1

    #v0=(One);
    new-array v2, v0, [Ljava/lang/String;

    #v2=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    const-string v1, "aid"

    #v1=(Reference);
    aput-object v1, v2, v0

    .line 949
    .local v2, projection:[Ljava/lang/String;
    sget-object v1, Lcom/facebook/android/Facebook;->ATTRIBUTION_ID_CONTENT_URI:Landroid/net/Uri;

    move-object v0, p0

    #v0=(Reference);
    move-object v4, v3

    #v4=(Null);
    move-object v5, v3

    #v5=(Null);
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 950
    .local v7, c:Landroid/database/Cursor;
    #v7=(Reference);
    if-eqz v7, :cond_0

    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    :cond_0
    #v0=(Conflicted);
    move-object v6, v3

    .line 955
    :goto_0
    #v6=(Reference);
    return-object v6

    .line 953
    :cond_1
    #v0=(Boolean);v6=(Uninit);
    const-string v0, "aid"

    #v0=(Reference);
    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 955
    .local v6, attributionId:Ljava/lang/String;
    #v6=(Reference);
    goto :goto_0
.end method

.method private static publishInstall(Lcom/facebook/android/Facebook;Ljava/lang/String;Landroid/content/Context;)V
    .locals 18
    .parameter "fb"
    .parameter "applicationId"
    .parameter "context"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Lcom/facebook/android/FacebookError;,
            Ljava/net/MalformedURLException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1008
    invoke-virtual/range {p2 .. p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v13

    #v13=(Reference);
    invoke-static {v13}, Lcom/facebook/android/Facebook;->getAttributionId(Landroid/content/ContentResolver;)Ljava/lang/String;

    move-result-object v2

    .line 1009
    .local v2, attributionId:Ljava/lang/String;
    #v2=(Reference);
    const-string v13, "com.facebook.sdk.attributionTracking"

    const/4 v14, 0x0

    #v14=(Null);
    move-object/from16 v0, p2

    #v0=(Reference);
    invoke-virtual {v0, v13, v14}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v8

    .line 1010
    .local v8, preferences:Landroid/content/SharedPreferences;
    #v8=(Reference);
    new-instance v13, Ljava/lang/StringBuilder;

    #v13=(UninitRef);
    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    #v14=(Reference);
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v13=(Reference);
    const-string v14, "ping"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 1011
    .local v7, pingKey:Ljava/lang/String;
    #v7=(Reference);
    const-wide/16 v13, 0x0

    #v13=(LongLo);v14=(LongHi);
    invoke-interface {v8, v7, v13, v14}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    .line 1012
    .local v5, lastPing:J
    #v5=(LongLo);v6=(LongHi);
    const-wide/16 v13, 0x0

    cmp-long v13, v5, v13

    #v13=(Byte);
    if-nez v13, :cond_1

    if-eqz v2, :cond_1

    .line 1013
    new-instance v12, Landroid/os/Bundle;

    #v12=(UninitRef);
    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    .line 1014
    .local v12, supportsAttributionParams:Landroid/os/Bundle;
    #v12=(Reference);
    const-string v13, "fields"

    #v13=(Reference);
    const-string v14, "supports_attribution"

    #v14=(Reference);
    invoke-virtual {v12, v13, v14}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1015
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    #v1=(Reference);
    invoke-virtual {v0, v1, v12}, Lcom/facebook/android/Facebook;->request(Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/facebook/android/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    .line 1016
    .local v11, supportResponse:Lorg/json/JSONObject;
    #v11=(Reference);
    const-string v13, "supports_attribution"

    invoke-virtual {v11, v13}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Ljava/lang/Boolean;

    .line 1018
    .local v3, doesSupportAttribution:Ljava/lang/Boolean;
    instance-of v13, v3, Ljava/lang/Boolean;

    #v13=(Boolean);
    if-nez v13, :cond_0

    .line 1019
    new-instance v13, Lorg/json/JSONException;

    .line 1020
    #v13=(UninitRef);
    const-string v14, "%s contains %s instead of a Boolean"

    const/4 v15, 0x2

    #v15=(PosByte);
    new-array v15, v15, [Ljava/lang/Object;

    #v15=(Reference);
    const/16 v16, 0x0

    #v16=(Null);
    const-string v17, "supports_attribution"

    #v17=(Reference);
    aput-object v17, v15, v16

    const/16 v16, 0x1

    #v16=(One);
    aput-object v3, v15, v16

    .line 1019
    invoke-static {v14, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    invoke-direct {v13, v14}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    #v13=(Reference);
    throw v13

    .line 1023
    :cond_0
    #v13=(Boolean);v15=(Uninit);v16=(Uninit);v17=(Uninit);
    check-cast v3, Ljava/lang/Boolean;

    .end local v3           #doesSupportAttribution:Ljava/lang/Boolean;
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    if-eqz v13, :cond_1

    .line 1024
    new-instance v9, Landroid/os/Bundle;

    #v9=(UninitRef);
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 1025
    .local v9, publishParams:Landroid/os/Bundle;
    #v9=(Reference);
    const-string v13, "event"

    #v13=(Reference);
    const-string v14, "MOBILE_APP_INSTALL"

    invoke-virtual {v9, v13, v14}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1026
    const-string v13, "attribution"

    invoke-virtual {v9, v13, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1028
    const-string v13, "%s/activities"

    const/4 v14, 0x1

    #v14=(One);
    new-array v14, v14, [Ljava/lang/Object;

    #v14=(Reference);
    const/4 v15, 0x0

    #v15=(Null);
    aput-object p1, v14, v15

    invoke-static {v13, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 1030
    .local v10, publishUrl:Ljava/lang/String;
    #v10=(Reference);
    const-string v13, "POST"

    move-object/from16 v0, p0

    invoke-virtual {v0, v10, v9, v13}, Lcom/facebook/android/Facebook;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 1033
    invoke-interface {v8}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    .line 1034
    .local v4, editor:Landroid/content/SharedPreferences$Editor;
    #v4=(Reference);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    #v13=(LongLo);v14=(LongHi);
    invoke-interface {v4, v7, v13, v14}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 1035
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1038
    .end local v4           #editor:Landroid/content/SharedPreferences$Editor;
    .end local v9           #publishParams:Landroid/os/Bundle;
    .end local v10           #publishUrl:Ljava/lang/String;
    .end local v11           #supportResponse:Lorg/json/JSONObject;
    .end local v12           #supportsAttributionParams:Landroid/os/Bundle;
    :cond_1
    #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
    return-void
.end method

.method private startDialogAuth(Landroid/app/Activity;[Ljava/lang/String;)V
    .locals 3
    .parameter "activity"
    .parameter "permissions"

    .prologue
    .line 363
    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 364
    .local v0, params:Landroid/os/Bundle;
    #v0=(Reference);
    array-length v1, p2

    #v1=(Integer);
    if-lez v1, :cond_0

    .line 365
    const-string v1, "scope"

    #v1=(Reference);
    const-string v2, ","

    #v2=(Reference);
    invoke-static {v2, p2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 367
    :cond_0
    #v1=(Conflicted);v2=(Conflicted);
    invoke-static {p1}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    .line 368
    const-string v1, "oauth"

    #v1=(Reference);
    new-instance v2, Lcom/facebook/android/Facebook$1;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Lcom/facebook/android/Facebook$1;-><init>(Lcom/facebook/android/Facebook;)V

    #v2=(Reference);
    invoke-virtual {p0, p1, v1, v0, v2}, Lcom/facebook/android/Facebook;->dialog(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/Facebook$DialogListener;)V

    .line 401
    return-void
.end method

.method private startSingleSignOn(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;I)Z
    .locals 5
    .parameter "activity"
    .parameter "applicationId"
    .parameter "permissions"
    .parameter "activityCode"

    .prologue
    .line 251
    const/4 v0, 0x1

    .line 252
    .local v0, didSucceed:Z
    #v0=(One);
    new-instance v2, Landroid/content/Intent;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 254
    .local v2, intent:Landroid/content/Intent;
    #v2=(Reference);
    const-string v3, "com.facebook.katana"

    .line 255
    #v3=(Reference);
    const-string v4, "com.facebook.katana.ProxyAuth"

    .line 254
    #v4=(Reference);
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 256
    const-string v3, "client_id"

    invoke-virtual {v2, v3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 257
    array-length v3, p3

    #v3=(Integer);
    if-lez v3, :cond_0

    .line 258
    const-string v3, "scope"

    #v3=(Reference);
    const-string v4, ","

    invoke-static {v4, p3}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 264
    :cond_0
    #v3=(Conflicted);
    invoke-direct {p0, p1, v2}, Lcom/facebook/android/Facebook;->validateActivityIntent(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_1

    .line 265
    const/4 v3, 0x0

    .line 277
    :goto_0
    #v0=(Boolean);v1=(Conflicted);
    return v3

    .line 268
    :cond_1
    #v0=(One);v1=(Uninit);
    iput-object p1, p0, Lcom/facebook/android/Facebook;->mAuthActivity:Landroid/app/Activity;

    .line 269
    iput-object p3, p0, Lcom/facebook/android/Facebook;->mAuthPermissions:[Ljava/lang/String;

    .line 270
    iput p4, p0, Lcom/facebook/android/Facebook;->mAuthActivityCode:I

    .line 272
    :try_start_0
    invoke-virtual {p1, v2, p4}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    #v0=(Boolean);v1=(Conflicted);
    move v3, v0

    .line 277
    goto :goto_0

    .line 273
    :catch_0
    #v0=(One);v1=(Uninit);
    move-exception v1

    .line 274
    .local v1, e:Landroid/content/ActivityNotFoundException;
    #v1=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_1
.end method

.method private validateActivityIntent(Landroid/content/Context;Landroid/content/Intent;)Z
    .locals 3
    .parameter "context"
    .parameter "intent"

    .prologue
    const/4 v1, 0x0

    .line 291
    #v1=(Null);
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2, p2, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v0

    .line 292
    .local v0, resolveInfo:Landroid/content/pm/ResolveInfo;
    #v0=(Reference);
    if-nez v0, :cond_0

    .line 296
    :goto_0
    #v1=(Boolean);
    return v1

    .line 298
    :cond_0
    #v1=(Null);
    iget-object v1, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    #v1=(Reference);
    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 296
    invoke-direct {p0, p1, v1}, Lcom/facebook/android/Facebook;->validateAppSignatureForPackage(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    goto :goto_0
.end method

.method private validateAppSignatureForPackage(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 9
    .parameter "context"
    .parameter "packageName"

    .prologue
    const/4 v3, 0x0

    .line 336
    :try_start_0
    #v3=(Null);
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 337
    #v4=(Reference);
    const/16 v5, 0x40

    .line 336
    #v5=(PosByte);
    invoke-virtual {v4, p2, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 342
    .local v1, packageInfo:Landroid/content/pm/PackageInfo;
    #v1=(Reference);
    iget-object v5, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    #v5=(Reference);
    array-length v6, v5

    #v6=(Integer);
    move v4, v3

    :goto_0
    #v2=(Conflicted);v4=(Integer);v7=(Conflicted);v8=(Conflicted);
    if-lt v4, v6, :cond_0

    .line 347
    .end local v1           #packageInfo:Landroid/content/pm/PackageInfo;
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v3=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return v3

    .line 338
    :catch_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    move-exception v0

    .line 339
    .local v0, e:Landroid/content/pm/PackageManager$NameNotFoundException;
    #v0=(Reference);
    goto :goto_1

    .line 342
    .end local v0           #e:Landroid/content/pm/PackageManager$NameNotFoundException;
    .restart local v1       #packageInfo:Landroid/content/pm/PackageInfo;
    :cond_0
    #v0=(Uninit);v1=(Reference);v2=(Conflicted);v4=(Integer);v5=(Reference);v6=(Integer);v7=(Conflicted);v8=(Conflicted);
    aget-object v2, v5, v4

    .line 343
    .local v2, signature:Landroid/content/pm/Signature;
    #v2=(Null);
    invoke-virtual {v2}, Landroid/content/pm/Signature;->toCharsString()Ljava/lang/String;

    move-result-object v7

    #v7=(Reference);
    const-string v8, "30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2"

    #v8=(Reference);
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    #v7=(Boolean);
    if-eqz v7, :cond_1

    .line 344
    const/4 v3, 0x1

    #v3=(One);
    goto :goto_1

    .line 342
    :cond_1
    #v3=(Null);
    add-int/lit8 v4, v4, 0x1

    goto :goto_0
.end method

.method private validateServiceIntent(Landroid/content/Context;Landroid/content/Intent;)Z
    .locals 3
    .parameter "context"
    .parameter "intent"

    .prologue
    const/4 v1, 0x0

    .line 313
    #v1=(Null);
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2, p2, v1}, Landroid/content/pm/PackageManager;->resolveService(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v0

    .line 314
    .local v0, resolveInfo:Landroid/content/pm/ResolveInfo;
    #v0=(Reference);
    if-nez v0, :cond_0

    .line 318
    :goto_0
    #v1=(Boolean);
    return v1

    .line 320
    :cond_0
    #v1=(Null);
    iget-object v1, v0, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    #v1=(Reference);
    iget-object v1, v1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 318
    invoke-direct {p0, p1, v1}, Lcom/facebook/android/Facebook;->validateAppSignatureForPackage(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    goto :goto_0
.end method


# virtual methods
.method public authorize(Landroid/app/Activity;Lcom/facebook/android/Facebook$DialogListener;)V
    .locals 2
    .parameter "activity"
    .parameter "listener"

    .prologue
    .line 136
    const/4 v0, 0x0

    #v0=(Null);
    new-array v0, v0, [Ljava/lang/String;

    #v0=(Reference);
    const/16 v1, 0x7f99

    #v1=(PosShort);
    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/facebook/android/Facebook;->authorize(Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/android/Facebook$DialogListener;)V

    .line 138
    return-void
.end method

.method public authorize(Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/android/Facebook$DialogListener;)V
    .locals 2
    .parameter "activity"
    .parameter "permissions"
    .parameter "activityCode"
    .parameter "listener"

    .prologue
    .line 217
    const/4 v0, 0x0

    .line 219
    .local v0, singleSignOnStarted:Z
    #v0=(Null);
    iput-object p4, p0, Lcom/facebook/android/Facebook;->mAuthDialogListener:Lcom/facebook/android/Facebook$DialogListener;

    .line 222
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {p0, v1}, Lcom/facebook/android/Facebook;->autoPublishAsync(Landroid/content/Context;)V

    .line 225
    if-ltz p3, :cond_0

    .line 226
    iget-object v1, p0, Lcom/facebook/android/Facebook;->mAppId:Ljava/lang/String;

    invoke-direct {p0, p1, v1, p2, p3}, Lcom/facebook/android/Facebook;->startSingleSignOn(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;I)Z

    move-result v0

    .line 230
    :cond_0
    #v0=(Boolean);
    if-nez v0, :cond_1

    .line 231
    invoke-direct {p0, p1, p2}, Lcom/facebook/android/Facebook;->startDialogAuth(Landroid/app/Activity;[Ljava/lang/String;)V

    .line 233
    :cond_1
    return-void
.end method

.method public authorize(Landroid/app/Activity;[Ljava/lang/String;Lcom/facebook/android/Facebook$DialogListener;)V
    .locals 1
    .parameter "activity"
    .parameter "permissions"
    .parameter "listener"

    .prologue
    .line 147
    const/16 v0, 0x7f99

    #v0=(PosShort);
    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/facebook/android/Facebook;->authorize(Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/android/Facebook$DialogListener;)V

    .line 148
    return-void
.end method

.method public authorizeCallback(IILandroid/content/Intent;)V
    .locals 7
    .parameter "requestCode"
    .parameter "resultCode"
    .parameter "data"

    .prologue
    const/4 v6, -0x1

    .line 417
    #v6=(Byte);
    iget v2, p0, Lcom/facebook/android/Facebook;->mAuthActivityCode:I

    #v2=(Integer);
    if-ne p1, v2, :cond_2

    .line 420
    if-ne p2, v6, :cond_9

    .line 423
    const-string v2, "error"

    #v2=(Reference);
    invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 424
    .local v1, error:Ljava/lang/String;
    #v1=(Reference);
    if-nez v1, :cond_0

    .line 425
    const-string v2, "error_type"

    invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 429
    :cond_0
    if-eqz v1, :cond_7

    .line 430
    const-string v2, "service_disabled"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_1

    .line 431
    const-string v2, "AndroidAuthKillSwitchException"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_3

    .line 432
    :cond_1
    const-string v2, "Facebook-authorize"

    #v2=(Reference);
    const-string v3, "Hosted auth currently disabled. Retrying dialog auth..."

    #v3=(Reference);
    invoke-static {v2, v3}, Lcom/facebook/android/Util;->logd(Ljava/lang/String;Ljava/lang/String;)V

    .line 434
    iget-object v2, p0, Lcom/facebook/android/Facebook;->mAuthActivity:Landroid/app/Activity;

    iget-object v3, p0, Lcom/facebook/android/Facebook;->mAuthPermissions:[Ljava/lang/String;

    invoke-direct {p0, v2, v3}, Lcom/facebook/android/Facebook;->startDialogAuth(Landroid/app/Activity;[Ljava/lang/String;)V

    .line 485
    .end local v1           #error:Ljava/lang/String;
    :cond_2
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-void

    .line 435
    .restart local v1       #error:Ljava/lang/String;
    :cond_3
    #v0=(Uninit);v1=(Reference);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Byte);
    const-string v2, "access_denied"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_4

    .line 436
    const-string v2, "OAuthAccessDeniedException"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_5

    .line 437
    :cond_4
    const-string v2, "Facebook-authorize"

    #v2=(Reference);
    const-string v3, "Login canceled by user."

    #v3=(Reference);
    invoke-static {v2, v3}, Lcom/facebook/android/Util;->logd(Ljava/lang/String;Ljava/lang/String;)V

    .line 438
    iget-object v2, p0, Lcom/facebook/android/Facebook;->mAuthDialogListener:Lcom/facebook/android/Facebook$DialogListener;

    invoke-interface {v2}, Lcom/facebook/android/Facebook$DialogListener;->onCancel()V

    goto :goto_0

    .line 440
    :cond_5
    #v2=(Boolean);v3=(Uninit);
    const-string v2, "error_description"

    #v2=(Reference);
    invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 441
    .local v0, description:Ljava/lang/String;
    #v0=(Reference);
    if-eqz v0, :cond_6

    .line 442
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 444
    :cond_6
    #v3=(Conflicted);
    const-string v2, "Facebook-authorize"

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    const-string v4, "Login failed: "

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/facebook/android/Util;->logd(Ljava/lang/String;Ljava/lang/String;)V

    .line 445
    iget-object v2, p0, Lcom/facebook/android/Facebook;->mAuthDialogListener:Lcom/facebook/android/Facebook$DialogListener;

    .line 446
    new-instance v3, Lcom/facebook/android/FacebookError;

    #v3=(UninitRef);
    invoke-direct {v3, v1}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;)V

    .line 445
    #v3=(Reference);
    invoke-interface {v2, v3}, Lcom/facebook/android/Facebook$DialogListener;->onFacebookError(Lcom/facebook/android/FacebookError;)V

    goto :goto_0

    .line 451
    .end local v0           #description:Ljava/lang/String;
    :cond_7
    #v0=(Uninit);v3=(Uninit);v4=(Uninit);
    const-string v2, "access_token"

    invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/facebook/android/Facebook;->setAccessToken(Ljava/lang/String;)V

    .line 452
    const-string v2, "expires_in"

    invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/facebook/android/Facebook;->setAccessExpiresIn(Ljava/lang/String;)V

    .line 453
    invoke-virtual {p0}, Lcom/facebook/android/Facebook;->isSessionValid()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_8

    .line 454
    const-string v2, "Facebook-authorize"

    .line 455
    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    const-string v4, "Login Success! access_token="

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 456
    #v3=(Reference);
    invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " expires="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 457
    invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessExpires()J

    move-result-wide v4

    #v4=(LongLo);v5=(LongHi);
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 455
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 454
    invoke-static {v2, v3}, Lcom/facebook/android/Util;->logd(Ljava/lang/String;Ljava/lang/String;)V

    .line 458
    iget-object v2, p0, Lcom/facebook/android/Facebook;->mAuthDialogListener:Lcom/facebook/android/Facebook$DialogListener;

    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/facebook/android/Facebook$DialogListener;->onComplete(Landroid/os/Bundle;)V

    goto/16 :goto_0

    .line 460
    :cond_8
    #v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    iget-object v2, p0, Lcom/facebook/android/Facebook;->mAuthDialogListener:Lcom/facebook/android/Facebook$DialogListener;

    #v2=(Reference);
    new-instance v3, Lcom/facebook/android/FacebookError;

    .line 461
    #v3=(UninitRef);
    const-string v4, "Failed to receive access token."

    #v4=(Reference);
    invoke-direct {v3, v4}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;)V

    .line 460
    #v3=(Reference);
    invoke-interface {v2, v3}, Lcom/facebook/android/Facebook$DialogListener;->onFacebookError(Lcom/facebook/android/FacebookError;)V

    goto/16 :goto_0

    .line 466
    .end local v1           #error:Ljava/lang/String;
    :cond_9
    #v1=(Uninit);v2=(Integer);v3=(Uninit);v4=(Uninit);
    if-nez p2, :cond_2

    .line 469
    if-eqz p3, :cond_a

    .line 470
    const-string v2, "Facebook-authorize"

    .line 471
    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    const-string v4, "Login failed: "

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    const-string v4, "error"

    invoke-virtual {p3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 470
    invoke-static {v2, v3}, Lcom/facebook/android/Util;->logd(Ljava/lang/String;Ljava/lang/String;)V

    .line 472
    iget-object v2, p0, Lcom/facebook/android/Facebook;->mAuthDialogListener:Lcom/facebook/android/Facebook$DialogListener;

    .line 473
    new-instance v3, Lcom/facebook/android/DialogError;

    .line 474
    #v3=(UninitRef);
    const-string v4, "error"

    invoke-virtual {p3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 475
    const-string v5, "error_code"

    #v5=(Reference);
    invoke-virtual {p3, v5, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 476
    #v5=(Integer);
    const-string v6, "failing_url"

    #v6=(Reference);
    invoke-virtual {p3, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 473
    invoke-direct {v3, v4, v5, v6}, Lcom/facebook/android/DialogError;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 472
    #v3=(Reference);
    invoke-interface {v2, v3}, Lcom/facebook/android/Facebook$DialogListener;->onError(Lcom/facebook/android/DialogError;)V

    goto/16 :goto_0

    .line 480
    :cond_a
    #v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Byte);
    const-string v2, "Facebook-authorize"

    #v2=(Reference);
    const-string v3, "Login canceled by user."

    #v3=(Reference);
    invoke-static {v2, v3}, Lcom/facebook/android/Util;->logd(Ljava/lang/String;Ljava/lang/String;)V

    .line 481
    iget-object v2, p0, Lcom/facebook/android/Facebook;->mAuthDialogListener:Lcom/facebook/android/Facebook$DialogListener;

    invoke-interface {v2}, Lcom/facebook/android/Facebook$DialogListener;->onCancel()V

    goto/16 :goto_0
.end method

.method autoPublishAsync(Landroid/content/Context;)V
    .locals 4
    .parameter "context"

    .prologue
    .line 1041
    const/4 v1, 0x0

    .line 1042
    .local v1, asyncTask:Lcom/facebook/android/Facebook$AutoPublishAsyncTask;
    #v1=(Null);
    monitor-enter p0

    .line 1043
    :try_start_0
    iget-object v3, p0, Lcom/facebook/android/Facebook;->mAutoPublishAsyncTask:Lcom/facebook/android/Facebook$AutoPublishAsyncTask;

    #v3=(Reference);
    if-nez v3, :cond_0

    .line 1045
    iget-object v0, p0, Lcom/facebook/android/Facebook;->mAppId:Ljava/lang/String;

    .line 1048
    .local v0, applicationId:Ljava/lang/String;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 1049
    new-instance v2, Lcom/facebook/android/Facebook$AutoPublishAsyncTask;

    #v2=(UninitRef);
    invoke-direct {v2, p0, v0, p1}, Lcom/facebook/android/Facebook$AutoPublishAsyncTask;-><init>(Lcom/facebook/android/Facebook;Ljava/lang/String;Landroid/content/Context;)V

    #v2=(Reference);
    iput-object v2, p0, Lcom/facebook/android/Facebook;->mAutoPublishAsyncTask:Lcom/facebook/android/Facebook$AutoPublishAsyncTask;

    .end local v1           #asyncTask:Lcom/facebook/android/Facebook$AutoPublishAsyncTask;
    .local v2, asyncTask:Lcom/facebook/android/Facebook$AutoPublishAsyncTask;
    move-object v1, v2

    .line 1042
    .end local v0           #applicationId:Ljava/lang/String;
    .end local v2           #asyncTask:Lcom/facebook/android/Facebook$AutoPublishAsyncTask;
    .restart local v1       #asyncTask:Lcom/facebook/android/Facebook$AutoPublishAsyncTask;
    :cond_0
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1054
    if-eqz v1, :cond_1

    .line 1055
    const/4 v3, 0x0

    #v3=(Null);
    new-array v3, v3, [Ljava/lang/Void;

    #v3=(Reference);
    invoke-virtual {v1, v3}, Lcom/facebook/android/Facebook$AutoPublishAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 1057
    :cond_1
    return-void

    .line 1042
    :catchall_0
    #v3=(Conflicted);
    move-exception v3

    :try_start_1
    #v3=(Reference);
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v3
.end method

.method public dialog(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/Facebook$DialogListener;)V
    .locals 4
    .parameter "context"
    .parameter "action"
    .parameter "parameters"
    .parameter "listener"

    .prologue
    .line 819
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    sget-object v3, Lcom/facebook/android/Facebook;->DIALOG_BASE_URL:Ljava/lang/String;

    #v3=(Reference);
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 820
    .local v0, endpoint:Ljava/lang/String;
    #v0=(Reference);
    const-string v2, "display"

    const-string v3, "touch"

    invoke-virtual {p3, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 821
    const-string v2, "redirect_uri"

    const-string v3, "fbconnect://success"

    invoke-virtual {p3, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 823
    const-string v2, "oauth"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_1

    .line 824
    const-string v2, "type"

    #v2=(Reference);
    const-string v3, "user_agent"

    invoke-virtual {p3, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 825
    const-string v2, "client_id"

    iget-object v3, p0, Lcom/facebook/android/Facebook;->mAppId:Ljava/lang/String;

    invoke-virtual {p3, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 830
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/android/Facebook;->isSessionValid()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    .line 831
    const-string v2, "access_token"

    #v2=(Reference);
    invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 833
    :cond_0
    #v2=(Conflicted);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    const-string v3, "?"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p3}, Lcom/facebook/android/Util;->encodeUrl(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 834
    .local v1, url:Ljava/lang/String;
    #v1=(Reference);
    const-string v2, "android.permission.INTERNET"

    invoke-virtual {p1, v2}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    if-eqz v2, :cond_2

    .line 836
    const-string v2, "Error"

    .line 837
    #v2=(Reference);
    const-string v3, "Application requires permission to access the Internet"

    .line 836
    invoke-static {p1, v2, v3}, Lcom/facebook/android/Util;->showAlert(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 841
    :goto_1
    return-void

    .line 827
    .end local v1           #url:Ljava/lang/String;
    :cond_1
    #v1=(Uninit);v2=(Boolean);
    const-string v2, "app_id"

    #v2=(Reference);
    iget-object v3, p0, Lcom/facebook/android/Facebook;->mAppId:Ljava/lang/String;

    invoke-virtual {p3, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 839
    .restart local v1       #url:Ljava/lang/String;
    :cond_2
    #v1=(Reference);v2=(Integer);
    new-instance v2, Lcom/facebook/android/FbDialog;

    #v2=(UninitRef);
    invoke-direct {v2, p1, v1, p4}, Lcom/facebook/android/FbDialog;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/android/Facebook$DialogListener;)V

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/facebook/android/FbDialog;->show()V

    goto :goto_1
.end method

.method public dialog(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/android/Facebook$DialogListener;)V
    .locals 1
    .parameter "context"
    .parameter "action"
    .parameter "listener"

    .prologue
    .line 796
    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/facebook/android/Facebook;->dialog(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/Facebook$DialogListener;)V

    .line 797
    return-void
.end method

.method public extendAccessToken(Landroid/content/Context;Lcom/facebook/android/Facebook$ServiceListener;)Z
    .locals 3
    .parameter "context"
    .parameter "serviceListener"

    .prologue
    .line 507
    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 509
    .local v0, intent:Landroid/content/Intent;
    #v0=(Reference);
    const-string v1, "com.facebook.katana"

    .line 510
    #v1=(Reference);
    const-string v2, "com.facebook.katana.platform.TokenRefreshService"

    .line 509
    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 515
    invoke-direct {p0, p1, v0}, Lcom/facebook/android/Facebook;->validateServiceIntent(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    .line 516
    const/4 v1, 0x0

    .line 519
    :goto_0
    #v2=(Conflicted);
    return v1

    .line 520
    :cond_0
    #v2=(Reference);
    new-instance v1, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;

    #v1=(UninitRef);
    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;-><init>(Lcom/facebook/android/Facebook;Landroid/content/Context;Lcom/facebook/android/Facebook$ServiceListener;)V

    .line 521
    #v1=(Reference);
    const/4 v2, 0x1

    .line 519
    #v2=(One);
    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v1

    #v1=(Boolean);
    goto :goto_0
.end method

.method public extendAccessTokenIfNeeded(Landroid/content/Context;Lcom/facebook/android/Facebook$ServiceListener;)Z
    .locals 1
    .parameter "context"
    .parameter "serviceListener"

    .prologue
    .line 531
    invoke-virtual {p0}, Lcom/facebook/android/Facebook;->shouldExtendAccessToken()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 532
    invoke-virtual {p0, p1, p2}, Lcom/facebook/android/Facebook;->extendAccessToken(Landroid/content/Context;Lcom/facebook/android/Facebook$ServiceListener;)Z

    move-result v0

    .line 534
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method

.method public getAccessExpires()J
    .locals 2

    .prologue
    .line 869
    iget-wide v0, p0, Lcom/facebook/android/Facebook;->mAccessExpires:J

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method public getAccessToken()Ljava/lang/String;
    .locals 1

    .prologue
    .line 859
    iget-object v0, p0, Lcom/facebook/android/Facebook;->mAccessToken:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getAppId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 934
    iget-object v0, p0, Lcom/facebook/android/Facebook;->mAppId:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getLastAccessUpdate()J
    .locals 2

    .prologue
    .line 879
    iget-wide v0, p0, Lcom/facebook/android/Facebook;->mLastAccessUpdate:J

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method public getShouldAutoPublishInstall()Z
    .locals 1

    .prologue
    .line 965
    iget-boolean v0, p0, Lcom/facebook/android/Facebook;->shouldAutoPublishInstall:Z

    #v0=(Boolean);
    return v0
.end method

.method public isSessionValid()Z
    .locals 4

    .prologue
    .line 847
    invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_1

    .line 848
    invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessExpires()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    cmp-long v0, v0, v2

    #v0=(Byte);
    if-eqz v0, :cond_0

    .line 849
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);
    invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessExpires()J

    move-result-wide v2

    cmp-long v0, v0, v2

    #v0=(Byte);
    if-gez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return v0

    :cond_1
    #v0=(Conflicted);
    const/4 v0, 0x0

    .line 847
    #v0=(Null);
    goto :goto_0
.end method

.method public logout(Landroid/content/Context;)Ljava/lang/String;
    .locals 4
    .parameter "context"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 648
    invoke-static {p1}, Lcom/facebook/android/Util;->clearCookies(Landroid/content/Context;)V

    .line 649
    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 650
    .local v0, b:Landroid/os/Bundle;
    #v0=(Reference);
    const-string v2, "method"

    #v2=(Reference);
    const-string v3, "auth.expireSession"

    #v3=(Reference);
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 651
    invoke-virtual {p0, v0}, Lcom/facebook/android/Facebook;->request(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v1

    .line 652
    .local v1, response:Ljava/lang/String;
    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {p0, v2}, Lcom/facebook/android/Facebook;->setAccessToken(Ljava/lang/String;)V

    .line 653
    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {p0, v2, v3}, Lcom/facebook/android/Facebook;->setAccessExpires(J)V

    .line 654
    return-object v1
.end method

.method public publishInstall(Landroid/content/Context;)Z
    .locals 4
    .parameter "context"

    .prologue
    .line 986
    :try_start_0
    iget-object v0, p0, Lcom/facebook/android/Facebook;->mAppId:Ljava/lang/String;

    .line 987
    .local v0, applicationId:Ljava/lang/String;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 988
    invoke-static {p0, v0, p1}, Lcom/facebook/android/Facebook;->publishInstall(Lcom/facebook/android/Facebook;Ljava/lang/String;Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 989
    const/4 v2, 0x1

    .line 995
    .end local v0           #applicationId:Ljava/lang/String;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);
    return v2

    .line 991
    :catch_0
    move-exception v1

    .line 993
    .local v1, e:Ljava/lang/Exception;
    #v1=(Reference);
    const-string v2, "Facebook-publish"

    #v2=(Reference);
    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-static {v2, v3}, Lcom/facebook/android/Util;->logd(Ljava/lang/String;Ljava/lang/String;)V

    .line 995
    .end local v1           #e:Ljava/lang/Exception;
    :cond_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    const/4 v2, 0x0

    #v2=(Null);
    goto :goto_0
.end method

.method public request(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 2
    .parameter "parameters"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 687
    const-string v0, "method"

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 688
    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "API method must be specified. (parameters must contain key \"method\" and value). See http://developers.facebook.com/docs/reference/rest/"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 692
    :cond_0
    #v0=(Boolean);v1=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    const-string v1, "GET"

    #v1=(Reference);
    invoke-virtual {p0, v0, p1, v1}, Lcom/facebook/android/Facebook;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public request(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .parameter "graphPath"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 713
    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    const-string v1, "GET"

    #v1=(Reference);
    invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/android/Facebook;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public request(Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;
    .locals 1
    .parameter "graphPath"
    .parameter "parameters"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 740
    const-string v0, "GET"

    #v0=(Reference);
    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/android/Facebook;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .parameter "graphPath"
    .parameter "params"
    .parameter "httpMethod"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;,
            Ljava/net/MalformedURLException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 770
    const-string v1, "format"

    #v1=(Reference);
    const-string v2, "json"

    #v2=(Reference);
    invoke-virtual {p2, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 771
    invoke-virtual {p0}, Lcom/facebook/android/Facebook;->isSessionValid()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 772
    const-string v1, "access_token"

    #v1=(Reference);
    invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 774
    :cond_0
    #v1=(Conflicted);
    if-eqz p1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    sget-object v2, Lcom/facebook/android/Facebook;->GRAPH_BASE_URL:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 776
    .local v0, url:Ljava/lang/String;
    :goto_0
    #v0=(Reference);v1=(Conflicted);
    invoke-static {v0, p3, p2}, Lcom/facebook/android/Util;->openUrl(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    return-object v1

    .line 775
    .end local v0           #url:Ljava/lang/String;
    :cond_1
    #v0=(Uninit);v1=(Conflicted);
    sget-object v0, Lcom/facebook/android/Facebook;->RESTSERVER_URL:Ljava/lang/String;

    #v0=(Reference);
    goto :goto_0
.end method

.method public setAccessExpires(J)V
    .locals 0
    .parameter "time"

    .prologue
    .line 914
    iput-wide p1, p0, Lcom/facebook/android/Facebook;->mAccessExpires:J

    .line 915
    return-void
.end method

.method public setAccessExpiresIn(Ljava/lang/String;)V
    .locals 8
    .parameter "expiresIn"

    .prologue
    .line 925
    if-eqz p1, :cond_0

    .line 926
    const-string v2, "0"

    #v2=(Reference);
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_1

    .line 927
    const-wide/16 v0, 0x0

    .line 929
    .local v0, expires:J
    :goto_0
    #v0=(LongLo);v1=(LongHi);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    invoke-virtual {p0, v0, v1}, Lcom/facebook/android/Facebook;->setAccessExpires(J)V

    .line 931
    .end local v0           #expires:J
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    .line 928
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    #v4=(LongLo);v5=(LongHi);
    const-wide/16 v6, 0x3e8

    #v6=(LongLo);v7=(LongHi);
    mul-long/2addr v4, v6

    add-long v0, v2, v4

    #v0=(LongLo);v1=(LongHi);
    goto :goto_0
.end method

.method public setAccessToken(Ljava/lang/String;)V
    .locals 2
    .parameter "token"

    .prologue
    .line 903
    iput-object p1, p0, Lcom/facebook/android/Facebook;->mAccessToken:Ljava/lang/String;

    .line 904
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/facebook/android/Facebook;->mLastAccessUpdate:J

    .line 905
    return-void
.end method

.method public setAppId(Ljava/lang/String;)V
    .locals 0
    .parameter "appId"

    .prologue
    .line 938
    iput-object p1, p0, Lcom/facebook/android/Facebook;->mAppId:Ljava/lang/String;

    .line 939
    return-void
.end method

.method public setShouldAutoPublishInstall(Z)V
    .locals 0
    .parameter "value"

    .prologue
    .line 973
    iput-boolean p1, p0, Lcom/facebook/android/Facebook;->shouldAutoPublishInstall:Z

    .line 974
    return-void
.end method

.method public setTokenFromCache(Ljava/lang/String;JJ)V
    .locals 0
    .parameter "accessToken"
    .parameter "accessExpires"
    .parameter "lastAccessUpdate"

    .prologue
    .line 892
    iput-object p1, p0, Lcom/facebook/android/Facebook;->mAccessToken:Ljava/lang/String;

    .line 893
    iput-wide p2, p0, Lcom/facebook/android/Facebook;->mAccessExpires:J

    .line 894
    iput-wide p4, p0, Lcom/facebook/android/Facebook;->mLastAccessUpdate:J

    .line 895
    return-void
.end method

.method public shouldExtendAccessToken()Z
    .locals 4

    .prologue
    .line 543
    invoke-virtual {p0}, Lcom/facebook/android/Facebook;->isSessionValid()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 544
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iget-wide v2, p0, Lcom/facebook/android/Facebook;->mLastAccessUpdate:J

    #v2=(LongLo);v3=(LongHi);
    sub-long/2addr v0, v2

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    #v0=(Byte);
    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return v0

    :cond_0
    #v0=(Byte);
    const/4 v0, 0x0

    .line 543
    #v0=(Null);
    goto :goto_0
.end method

*/}
