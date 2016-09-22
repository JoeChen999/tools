package com.google.android.apps.analytics; class NetworkDispatcher {/*

.class Lcom/google/android/apps/analytics/NetworkDispatcher;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/apps/analytics/Dispatcher;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/apps/analytics/NetworkDispatcher$1;,
        Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;
    }
.end annotation


# static fields
.field private static final GOOGLE_ANALYTICS_HOST_NAME:Ljava/lang/String; = "www.google-analytics.com"

.field private static final GOOGLE_ANALYTICS_HOST_PORT:I = 0x50

.field private static final MAX_EVENTS_PER_PIPELINE:I = 0x1e

.field private static final MAX_GET_LENGTH:I = 0x7f4

.field private static final MAX_POST_LENGTH:I = 0x2000

.field private static final MAX_SEQUENTIAL_REQUESTS:I = 0x5

.field private static final MIN_RETRY_INTERVAL:J = 0x2L

.field private static final USER_AGENT_TEMPLATE:Ljava/lang/String; = "%s/%s (Linux; U; Android %s; %s-%s; %s Build/%s)"


# instance fields
.field private dispatcherThread:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

.field private dryRun:Z

.field private final googleAnalyticsHost:Lorg/apache/http/HttpHost;

.field private final userAgent:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "GoogleAnalytics"

    #v0=(Reference);
    const-string v1, "1.4.2"

    #v1=(Reference);
    invoke-direct {p0, v0, v1}, Lcom/google/android/apps/analytics/NetworkDispatcher;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "www.google-analytics.com"

    #v0=(Reference);
    const/16 v1, 0x50

    #v1=(PosByte);
    invoke-direct {p0, p1, p2, v0, v1}, Lcom/google/android/apps/analytics/NetworkDispatcher;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    #p0=(Reference);
    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 5

    const/4 v4, 0x0

    #v4=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-boolean v4, p0, Lcom/google/android/apps/analytics/NetworkDispatcher;->dryRun:Z

    new-instance v0, Lorg/apache/http/HttpHost;

    #v0=(UninitRef);
    invoke-direct {v0, p3, p4}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher;->googleAnalyticsHost:Lorg/apache/http/HttpHost;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "%s/%s (Linux; U; Android %s; %s-%s; %s Build/%s)"

    #v2=(Reference);
    const/4 v0, 0x7

    #v0=(PosByte);
    new-array v3, v0, [Ljava/lang/Object;

    #v3=(Reference);
    aput-object p1, v3, v4

    const/4 v0, 0x1

    #v0=(One);
    aput-object p2, v3, v0

    const/4 v0, 0x2

    #v0=(PosByte);
    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    #v4=(Reference);
    aput-object v4, v3, v0

    const/4 v4, 0x3

    #v4=(PosByte);
    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_0

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    :goto_0
    aput-object v0, v3, v4

    const/4 v4, 0x4

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    :goto_1
    aput-object v0, v3, v4

    const/4 v0, 0x5

    #v0=(PosByte);
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    aput-object v1, v3, v0

    const/4 v0, 0x6

    sget-object v1, Landroid/os/Build;->ID:Ljava/lang/String;

    aput-object v1, v3, v0

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher;->userAgent:Ljava/lang/String;

    return-void

    :cond_0
    const-string v0, "en"

    goto :goto_0

    :cond_1
    const-string v0, ""

    goto :goto_1
.end method

.method static synthetic access$200(Lcom/google/android/apps/analytics/NetworkDispatcher;)Lorg/apache/http/HttpHost;
    .locals 1

    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher;->googleAnalyticsHost:Lorg/apache/http/HttpHost;

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public dispatchHits([Lcom/google/android/apps/analytics/Hit;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher;->dispatcherThread:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    #v0=(Reference);
    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher;->dispatcherThread:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    invoke-virtual {v0, p1}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->dispatchHits([Lcom/google/android/apps/analytics/Hit;)V

    goto :goto_0
.end method

.method getUserAgent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher;->userAgent:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public init(Lcom/google/android/apps/analytics/Dispatcher$Callbacks;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/apps/analytics/NetworkDispatcher;->stop()V

    new-instance v0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/google/android/apps/analytics/NetworkDispatcher;->userAgent:Ljava/lang/String;

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-direct {v0, p1, v1, p0, v2}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;-><init>(Lcom/google/android/apps/analytics/Dispatcher$Callbacks;Ljava/lang/String;Lcom/google/android/apps/analytics/NetworkDispatcher;Lcom/google/android/apps/analytics/NetworkDispatcher$1;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher;->dispatcherThread:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher;->dispatcherThread:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    invoke-virtual {v0}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->start()V

    return-void
.end method

.method public init(Lcom/google/android/apps/analytics/Dispatcher$Callbacks;Lcom/google/android/apps/analytics/PipelinedRequester;Lcom/google/android/apps/analytics/HitStore;)V
    .locals 6

    invoke-virtual {p0}, Lcom/google/android/apps/analytics/NetworkDispatcher;->stop()V

    new-instance v0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    #v0=(UninitRef);
    iget-object v3, p0, Lcom/google/android/apps/analytics/NetworkDispatcher;->userAgent:Ljava/lang/String;

    #v3=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    move-object v1, p1

    #v1=(Reference);
    move-object v2, p2

    #v2=(Reference);
    move-object v4, p0

    #v4=(Reference);
    invoke-direct/range {v0 .. v5}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;-><init>(Lcom/google/android/apps/analytics/Dispatcher$Callbacks;Lcom/google/android/apps/analytics/PipelinedRequester;Ljava/lang/String;Lcom/google/android/apps/analytics/NetworkDispatcher;Lcom/google/android/apps/analytics/NetworkDispatcher$1;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher;->dispatcherThread:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher;->dispatcherThread:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    invoke-virtual {v0}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->start()V

    return-void
.end method

.method public isDryRun()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher;->dryRun:Z

    #v0=(Boolean);
    return v0
.end method

.method public setDryRun(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/apps/analytics/NetworkDispatcher;->dryRun:Z

    return-void
.end method

.method public stop()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher;->dispatcherThread:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher;->dispatcherThread:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    invoke-virtual {v0}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher;->dispatcherThread:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    invoke-virtual {v0}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher;->dispatcherThread:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    :cond_0
    #v0=(Reference);
    return-void
.end method

.method waitForThreadLooper()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher;->dispatcherThread:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->getLooper()Landroid/os/Looper;

    :goto_0
    iget-object v0, p0, Lcom/google/android/apps/analytics/NetworkDispatcher;->dispatcherThread:Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;

    iget-object v0, v0, Lcom/google/android/apps/analytics/NetworkDispatcher$DispatcherThread;->handlerExecuteOnDispatcherThread:Landroid/os/Handler;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/Thread;->yield()V

    goto :goto_0

    :cond_0
    return-void
.end method

*/}
