package com.google.android.apps.analytics; class CustomVariable {/*

.class Lcom/google/android/apps/analytics/CustomVariable;
.super Ljava/lang/Object;


# static fields
.field public static final INDEX_ERROR_MSG:Ljava/lang/String; = "Index must be between 1 and 5 inclusive."

.field public static final MAX_CUSTOM_VARIABLES:I = 0x5

.field public static final MAX_CUSTOM_VARIABLE_LENGTH:I = 0x40

.field public static final PAGE_SCOPE:I = 0x3

.field public static final SESSION_SCOPE:I = 0x2

.field public static final VISITOR_SCOPE:I = 0x1


# instance fields
.field private final index:I

.field private final name:Ljava/lang/String;

.field private final scope:I

.field private final value:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x3

    #v0=(PosByte);
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/android/apps/analytics/CustomVariable;-><init>(ILjava/lang/String;Ljava/lang/String;I)V

    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;I)V
    .locals 4

    const/4 v1, 0x1

    #v1=(One);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    if-eq p4, v1, :cond_0

    const/4 v0, 0x2

    #v0=(PosByte);
    if-eq p4, v0, :cond_0

    const/4 v0, 0x3

    if-eq p4, v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "Invalid Scope:"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_0
    #v0=(Conflicted);v1=(One);v2=(Uninit);
    if-lt p1, v1, :cond_1

    const/4 v0, 0x5

    #v0=(PosByte);
    if-le p1, v0, :cond_2

    :cond_1
    #v0=(Conflicted);
    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "Index must be between 1 and 5 inclusive."

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_2
    #v0=(PosByte);v1=(One);
    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_4

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "Invalid argument for name:  Cannot be empty"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_4
    #v0=(Integer);v1=(One);
    if-eqz p3, :cond_5

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_6

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "Invalid argument for value:  Cannot be empty"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_6
    #v0=(Integer);v1=(One);
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/apps/analytics/AnalyticsParameterEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    const/16 v1, 0x40

    #v1=(PosByte);
    if-le v0, v1, :cond_7

    new-instance v1, Ljava/lang/IllegalArgumentException;

    #v1=(UninitRef);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "Encoded form of name and value must not exceed 64 characters combined.  Character length: "

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    throw v1

    :cond_7
    #v0=(Integer);v1=(PosByte);v2=(Uninit);v3=(Uninit);
    iput p1, p0, Lcom/google/android/apps/analytics/CustomVariable;->index:I

    iput p4, p0, Lcom/google/android/apps/analytics/CustomVariable;->scope:I

    iput-object p2, p0, Lcom/google/android/apps/analytics/CustomVariable;->name:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/apps/analytics/CustomVariable;->value:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getIndex()I
    .locals 1

    iget v0, p0, Lcom/google/android/apps/analytics/CustomVariable;->index:I

    #v0=(Integer);
    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/apps/analytics/CustomVariable;->name:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getScope()I
    .locals 1

    iget v0, p0, Lcom/google/android/apps/analytics/CustomVariable;->scope:I

    #v0=(Integer);
    return v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/apps/analytics/CustomVariable;->value:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

*/}
