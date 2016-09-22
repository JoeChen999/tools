package com.google.android.apps.analytics; class HitBuilder {/*

.class Lcom/google/android/apps/analytics/HitBuilder;
.super Ljava/lang/Object;


# static fields
.field static final FAKE_DOMAIN_HASH:Ljava/lang/String; = "1"

.field private static final GOOGLE_ANALYTICS_GIF_PATH:Ljava/lang/String; = "/__utm.gif"

.field private static final X10_PROJECT_NAMES:I = 0x8

.field private static final X10_PROJECT_SCOPES:I = 0xb

.field private static final X10_PROJECT_VALUES:I = 0x9


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method static appendCurrencyValue(Ljava/lang/StringBuilder;Ljava/lang/String;D)V
    .locals 6

    const-wide v4, 0x412e848000000000L

    #v4=(LongLo);v5=(LongHi);
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "="

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    mul-double v0, p2, v4

    #v0=(DoubleLo);v1=(DoubleHi);
    const-wide/high16 v2, 0x3fe0

    #v2=(LongLo);v3=(LongHi);
    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    div-double/2addr v0, v4

    const-wide/16 v2, 0x0

    cmpl-double v2, v0, v2

    #v2=(Byte);
    if-eqz v2, :cond_0

    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    #v0=(Conflicted);
    return-void
.end method

.method private static appendStringValue(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "="

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_0

    invoke-static {p2}, Lcom/google/android/apps/analytics/AnalyticsParameterEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    #v0=(Conflicted);
    return-void
.end method

.method private static constructEventRequestPath(Lcom/google/android/apps/analytics/Event;Lcom/google/android/apps/analytics/Referrer;)Ljava/lang/String;
    .locals 9

    const/4 v8, 0x2

    #v8=(PosByte);
    const/4 v7, 0x1

    #v7=(One);
    const/4 v6, 0x0

    #v6=(Null);
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "5(%s*%s"

    #v3=(Reference);
    new-array v4, v8, [Ljava/lang/Object;

    #v4=(Reference);
    iget-object v5, p0, Lcom/google/android/apps/analytics/Event;->category:Ljava/lang/String;

    #v5=(Reference);
    invoke-static {v5}, Lcom/google/android/apps/analytics/HitBuilder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    iget-object v5, p0, Lcom/google/android/apps/analytics/Event;->action:Ljava/lang/String;

    invoke-static {v5}, Lcom/google/android/apps/analytics/HitBuilder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v7

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/google/android/apps/analytics/Event;->label:Ljava/lang/String;

    if-eqz v3, :cond_0

    const-string v3, "*"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/apps/analytics/Event;->label:Ljava/lang/String;

    invoke-static {v4}, Lcom/google/android/apps/analytics/HitBuilder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/google/android/apps/analytics/Event;->value:I

    #v3=(Integer);
    const/4 v4, -0x1

    #v4=(Byte);
    if-le v3, v4, :cond_1

    const-string v3, "(%d)"

    #v3=(Reference);
    new-array v4, v7, [Ljava/lang/Object;

    #v4=(Reference);
    iget v5, p0, Lcom/google/android/apps/analytics/Event;->value:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v4, v6

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    #v3=(Conflicted);v4=(Conflicted);
    invoke-static {p0}, Lcom/google/android/apps/analytics/HitBuilder;->getCustomVariableParams(Lcom/google/android/apps/analytics/Event;)Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/__utm.gif"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "?utmwv=4.8.1ma"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "&utmn="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/android/apps/analytics/Event;->getRandomVal()I

    move-result v4

    #v4=(Integer);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "&utmt=event"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "&utme="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "&utmcs=UTF-8"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "&utmsr=%dx%d"

    new-array v3, v8, [Ljava/lang/Object;

    iget v4, p0, Lcom/google/android/apps/analytics/Event;->screenWidth:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    #v4=(Reference);
    aput-object v4, v3, v6

    iget v4, p0, Lcom/google/android/apps/analytics/Event;->screenHeight:I

    #v4=(Integer);
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    #v4=(Reference);
    aput-object v4, v3, v7

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "&utmul=%s-%s"

    new-array v3, v8, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v7

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&utmac="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/apps/analytics/Event;->accountId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&utmcc="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0, p1}, Lcom/google/android/apps/analytics/HitBuilder;->getEscapedCookieString(Lcom/google/android/apps/analytics/Event;Lcom/google/android/apps/analytics/Referrer;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/android/apps/analytics/Event;->getAdHitId()I

    move-result v0

    #v0=(Integer);
    if-eqz v0, :cond_2

    const-string v0, "&utmhid="

    #v0=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/apps/analytics/Event;->getAdHitId()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_2
    #v0=(Conflicted);v2=(Conflicted);
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public static constructHitRequestPath(Lcom/google/android/apps/analytics/Event;Lcom/google/android/apps/analytics/Referrer;)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, "__##GOOGLEPAGEVIEW##__"

    #v1=(Reference);
    iget-object v2, p0, Lcom/google/android/apps/analytics/Event;->category:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    invoke-static {p0, p1}, Lcom/google/android/apps/analytics/HitBuilder;->constructPageviewRequestPath(Lcom/google/android/apps/analytics/Event;Lcom/google/android/apps/analytics/Referrer;)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/apps/analytics/Event;->getAnonymizeIp()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    const-string v1, "&aip=1"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    #v1=(Conflicted);
    invoke-virtual {p0}, Lcom/google/android/apps/analytics/Event;->getUseServerTime()Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "&utmht="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    #v1=(Boolean);v2=(Reference);v3=(Uninit);
    const-string v1, "__##GOOGLEITEM##__"

    #v1=(Reference);
    iget-object v2, p0, Lcom/google/android/apps/analytics/Event;->category:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_3

    invoke-static {p0, p1}, Lcom/google/android/apps/analytics/HitBuilder;->constructItemRequestPath(Lcom/google/android/apps/analytics/Event;Lcom/google/android/apps/analytics/Referrer;)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_3
    #v1=(Boolean);
    const-string v1, "__##GOOGLETRANSACTION##__"

    #v1=(Reference);
    iget-object v2, p0, Lcom/google/android/apps/analytics/Event;->category:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_4

    invoke-static {p0, p1}, Lcom/google/android/apps/analytics/HitBuilder;->constructTransactionRequestPath(Lcom/google/android/apps/analytics/Event;Lcom/google/android/apps/analytics/Referrer;)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_4
    #v1=(Boolean);
    invoke-static {p0, p1}, Lcom/google/android/apps/analytics/HitBuilder;->constructEventRequestPath(Lcom/google/android/apps/analytics/Event;Lcom/google/android/apps/analytics/Referrer;)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method private static constructItemRequestPath(Lcom/google/android/apps/analytics/Event;Lcom/google/android/apps/analytics/Referrer;)Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, "/__utm.gif"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "?utmwv=4.8.1ma"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&utmn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/apps/analytics/Event;->getRandomVal()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "&utmt=item"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/android/apps/analytics/Event;->getItem()Lcom/google/android/apps/analytics/Item;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "&utmtid"

    #v2=(Reference);
    invoke-virtual {v1}, Lcom/google/android/apps/analytics/Item;->getOrderId()Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-static {v0, v2, v3}, Lcom/google/android/apps/analytics/HitBuilder;->appendStringValue(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "&utmipc"

    invoke-virtual {v1}, Lcom/google/android/apps/analytics/Item;->getItemSKU()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/google/android/apps/analytics/HitBuilder;->appendStringValue(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "&utmipn"

    invoke-virtual {v1}, Lcom/google/android/apps/analytics/Item;->getItemName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/google/android/apps/analytics/HitBuilder;->appendStringValue(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "&utmiva"

    invoke-virtual {v1}, Lcom/google/android/apps/analytics/Item;->getItemCategory()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/google/android/apps/analytics/HitBuilder;->appendStringValue(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "&utmipr"

    invoke-virtual {v1}, Lcom/google/android/apps/analytics/Item;->getItemPrice()D

    move-result-wide v3

    #v3=(DoubleLo);v4=(DoubleHi);
    invoke-static {v0, v2, v3, v4}, Lcom/google/android/apps/analytics/HitBuilder;->appendCurrencyValue(Ljava/lang/StringBuilder;Ljava/lang/String;D)V

    const-string v2, "&utmiqt="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/google/android/apps/analytics/Item;->getItemCount()J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    const-wide/16 v4, 0x0

    #v4=(LongLo);v5=(LongHi);
    cmp-long v2, v2, v4

    #v2=(Byte);
    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/google/android/apps/analytics/Item;->getItemCount()J

    move-result-wide v1

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    :cond_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    const-string v1, "&utmac="

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/apps/analytics/Event;->accountId:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&utmcc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0, p1}, Lcom/google/android/apps/analytics/HitBuilder;->getEscapedCookieString(Lcom/google/android/apps/analytics/Event;Lcom/google/android/apps/analytics/Referrer;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static constructPageviewRequestPath(Lcom/google/android/apps/analytics/Event;Lcom/google/android/apps/analytics/Referrer;)Ljava/lang/String;
    .locals 9

    const/4 v8, 0x2

    #v8=(PosByte);
    const/4 v7, 0x1

    #v7=(One);
    const/4 v6, 0x0

    #v6=(Null);
    const-string v0, ""

    #v0=(Reference);
    iget-object v1, p0, Lcom/google/android/apps/analytics/Event;->action:Ljava/lang/String;

    #v1=(Reference);
    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/google/android/apps/analytics/Event;->action:Ljava/lang/String;

    :cond_0
    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "/"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    #v1=(Conflicted);v2=(Conflicted);
    invoke-static {v0}, Lcom/google/android/apps/analytics/HitBuilder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lcom/google/android/apps/analytics/HitBuilder;->getCustomVariableParams(Lcom/google/android/apps/analytics/Event;)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "/__utm.gif"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "?utmwv=4.8.1ma"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "&utmn="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {p0}, Lcom/google/android/apps/analytics/Event;->getRandomVal()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    #v4=(Integer);
    if-lez v4, :cond_2

    const-string v4, "&utme="

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    #v4=(Conflicted);
    const-string v1, "&utmcs=UTF-8"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&utmsr=%dx%d"

    new-array v4, v8, [Ljava/lang/Object;

    #v4=(Reference);
    iget v5, p0, Lcom/google/android/apps/analytics/Event;->screenWidth:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v4, v6

    iget v5, p0, Lcom/google/android/apps/analytics/Event;->screenHeight:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v4, v7

    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&utmul=%s-%s"

    new-array v4, v8, [Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v4, v7

    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&utmp="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&utmac="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/apps/analytics/Event;->accountId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&utmcc="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0, p1}, Lcom/google/android/apps/analytics/HitBuilder;->getEscapedCookieString(Lcom/google/android/apps/analytics/Event;Lcom/google/android/apps/analytics/Referrer;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/android/apps/analytics/Event;->getAdHitId()I

    move-result v0

    #v0=(Integer);
    if-eqz v0, :cond_3

    const-string v0, "&utmhid="

    #v0=(Reference);
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/apps/analytics/Event;->getAdHitId()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_3
    #v0=(Conflicted);v1=(Conflicted);
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method private static constructTransactionRequestPath(Lcom/google/android/apps/analytics/Event;Lcom/google/android/apps/analytics/Referrer;)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, "/__utm.gif"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "?utmwv=4.8.1ma"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&utmn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/apps/analytics/Event;->getRandomVal()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "&utmt=tran"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/android/apps/analytics/Event;->getTransaction()Lcom/google/android/apps/analytics/Transaction;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "&utmtid"

    #v2=(Reference);
    invoke-virtual {v1}, Lcom/google/android/apps/analytics/Transaction;->getOrderId()Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-static {v0, v2, v3}, Lcom/google/android/apps/analytics/HitBuilder;->appendStringValue(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "&utmtst"

    invoke-virtual {v1}, Lcom/google/android/apps/analytics/Transaction;->getStoreName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/google/android/apps/analytics/HitBuilder;->appendStringValue(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "&utmtto"

    invoke-virtual {v1}, Lcom/google/android/apps/analytics/Transaction;->getTotalCost()D

    move-result-wide v3

    #v3=(DoubleLo);v4=(DoubleHi);
    invoke-static {v0, v2, v3, v4}, Lcom/google/android/apps/analytics/HitBuilder;->appendCurrencyValue(Ljava/lang/StringBuilder;Ljava/lang/String;D)V

    const-string v2, "&utmttx"

    invoke-virtual {v1}, Lcom/google/android/apps/analytics/Transaction;->getTotalTax()D

    move-result-wide v3

    invoke-static {v0, v2, v3, v4}, Lcom/google/android/apps/analytics/HitBuilder;->appendCurrencyValue(Ljava/lang/StringBuilder;Ljava/lang/String;D)V

    const-string v2, "&utmtsp"

    invoke-virtual {v1}, Lcom/google/android/apps/analytics/Transaction;->getShippingCost()D

    move-result-wide v3

    invoke-static {v0, v2, v3, v4}, Lcom/google/android/apps/analytics/HitBuilder;->appendCurrencyValue(Ljava/lang/StringBuilder;Ljava/lang/String;D)V

    const-string v1, "&utmtci"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/google/android/apps/analytics/HitBuilder;->appendStringValue(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "&utmtrg"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/google/android/apps/analytics/HitBuilder;->appendStringValue(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "&utmtco"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/google/android/apps/analytics/HitBuilder;->appendStringValue(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    const-string v1, "&utmac="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/apps/analytics/Event;->accountId:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&utmcc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0, p1}, Lcom/google/android/apps/analytics/HitBuilder;->getEscapedCookieString(Lcom/google/android/apps/analytics/Event;Lcom/google/android/apps/analytics/Referrer;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static createX10Project([Lcom/google/android/apps/analytics/CustomVariable;Ljava/lang/StringBuilder;I)V
    .locals 6

    const/4 v1, 0x0

    #v1=(Null);
    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    #v2=(Reference);
    const-string v3, "("

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v2, v0

    #v2=(One);
    move v0, v1

    :goto_0
    #v0=(Integer);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    array-length v3, p0

    #v3=(Integer);
    if-ge v0, v3, :cond_2

    aget-object v3, p0, v0

    #v3=(Null);
    if-eqz v3, :cond_0

    aget-object v3, p0, v0

    if-nez v2, :cond_1

    const-string v4, "*"

    #v4=(Reference);
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    #v4=(Conflicted);
    invoke-virtual {v3}, Lcom/google/android/apps/analytics/CustomVariable;->getIndex()I

    move-result v4

    #v4=(Integer);
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    #v4=(Reference);
    const-string v5, "!"

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    packed-switch p2, :pswitch_data_0

    :cond_0
    :goto_2
    :pswitch_0
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    #v3=(Null);
    move v2, v1

    #v2=(Null);
    goto :goto_1

    :pswitch_1
    #v2=(Boolean);v4=(Reference);v5=(Reference);
    invoke-virtual {v3}, Lcom/google/android/apps/analytics/CustomVariable;->getName()Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-static {v3}, Lcom/google/android/apps/analytics/HitBuilder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/apps/analytics/HitBuilder;->x10Escape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :pswitch_2
    #v3=(Null);
    invoke-virtual {v3}, Lcom/google/android/apps/analytics/CustomVariable;->getValue()Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-static {v3}, Lcom/google/android/apps/analytics/HitBuilder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/apps/analytics/HitBuilder;->x10Escape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :pswitch_3
    #v3=(Null);
    invoke-virtual {v3}, Lcom/google/android/apps/analytics/CustomVariable;->getScope()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_2
    #v4=(Conflicted);v5=(Conflicted);
    const-string v0, ")"

    #v0=(Reference);
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method private static encode(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/android/apps/analytics/AnalyticsParameterEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public static getCustomVariableParams(Lcom/google/android/apps/analytics/Event;)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    invoke-virtual {p0}, Lcom/google/android/apps/analytics/Event;->getCustomVariableBuffer()Lcom/google/android/apps/analytics/CustomVariableBuffer;

    move-result-object v1

    #v1=(Reference);
    if-nez v1, :cond_0

    const-string v0, ""

    :goto_0
    #v2=(Conflicted);
    return-object v0

    :cond_0
    #v2=(Uninit);
    invoke-virtual {v1}, Lcom/google/android/apps/analytics/CustomVariableBuffer;->hasCustomVariables()Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_1

    const-string v0, ""

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lcom/google/android/apps/analytics/CustomVariableBuffer;->getCustomVariableArray()[Lcom/google/android/apps/analytics/CustomVariable;

    move-result-object v1

    const/16 v2, 0x8

    #v2=(PosByte);
    invoke-static {v1, v0, v2}, Lcom/google/android/apps/analytics/HitBuilder;->createX10Project([Lcom/google/android/apps/analytics/CustomVariable;Ljava/lang/StringBuilder;I)V

    const/16 v2, 0x9

    invoke-static {v1, v0, v2}, Lcom/google/android/apps/analytics/HitBuilder;->createX10Project([Lcom/google/android/apps/analytics/CustomVariable;Ljava/lang/StringBuilder;I)V

    const/16 v2, 0xb

    invoke-static {v1, v0, v2}, Lcom/google/android/apps/analytics/HitBuilder;->createX10Project([Lcom/google/android/apps/analytics/CustomVariable;Ljava/lang/StringBuilder;I)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static getEscapedCookieString(Lcom/google/android/apps/analytics/Event;Lcom/google/android/apps/analytics/Referrer;)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, "__utma="

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/android/apps/analytics/Event;->getUserId()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/android/apps/analytics/Event;->getTimestampFirst()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/android/apps/analytics/Event;->getTimestampPrevious()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/android/apps/analytics/Event;->getTimestampCurrent()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/android/apps/analytics/Event;->getVisits()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    #v1=(Reference);
    const-string v2, ";"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_0

    const-string v1, "+__utmz="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/android/apps/analytics/Referrer;->getTimeStamp()J

    move-result-wide v1

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "."

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/android/apps/analytics/Referrer;->getVisit()I

    move-result v1

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/android/apps/analytics/Referrer;->getIndex()I

    move-result v1

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/android/apps/analytics/Referrer;->getReferrerString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ";"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/apps/analytics/HitBuilder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static x10Escape(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "\'"

    #v0=(Reference);
    const-string v1, "\'0"

    #v1=(Reference);
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ")"

    const-string v2, "\'1"

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "*"

    const-string v2, "\'2"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "!"

    const-string v2, "\'3"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

*/}
