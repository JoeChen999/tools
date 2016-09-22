package com.google.android.apps.analytics; class CustomVariableBuffer {/*

.class Lcom/google/android/apps/analytics/CustomVariableBuffer;
.super Ljava/lang/Object;


# instance fields
.field private customVariables:[Lcom/google/android/apps/analytics/CustomVariable;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x5

    #v0=(PosByte);
    new-array v0, v0, [Lcom/google/android/apps/analytics/CustomVariable;

    #v0=(Reference);
    iput-object v0, p0, Lcom/google/android/apps/analytics/CustomVariableBuffer;->customVariables:[Lcom/google/android/apps/analytics/CustomVariable;

    return-void
.end method

.method private throwOnInvalidIndex(I)V
    .locals 2

    const/4 v0, 0x1

    #v0=(One);
    if-lt p1, v0, :cond_0

    const/4 v0, 0x5

    #v0=(PosByte);
    if-le p1, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "Index must be between 1 and 5 inclusive."

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_1
    #v0=(PosByte);v1=(Uninit);
    return-void
.end method


# virtual methods
.method public clearCustomVariableAt(I)V
    .locals 3

    invoke-direct {p0, p1}, Lcom/google/android/apps/analytics/CustomVariableBuffer;->throwOnInvalidIndex(I)V

    iget-object v0, p0, Lcom/google/android/apps/analytics/CustomVariableBuffer;->customVariables:[Lcom/google/android/apps/analytics/CustomVariable;

    #v0=(Reference);
    add-int/lit8 v1, p1, -0x1

    #v1=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    aput-object v2, v0, v1

    return-void
.end method

.method public getCustomVariableArray()[Lcom/google/android/apps/analytics/CustomVariable;
    .locals 1

    iget-object v0, p0, Lcom/google/android/apps/analytics/CustomVariableBuffer;->customVariables:[Lcom/google/android/apps/analytics/CustomVariable;

    #v0=(Reference);
    invoke-virtual {v0}, [Lcom/google/android/apps/analytics/CustomVariable;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/apps/analytics/CustomVariable;

    return-object v0
.end method

.method public getCustomVariableAt(I)Lcom/google/android/apps/analytics/CustomVariable;
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/apps/analytics/CustomVariableBuffer;->throwOnInvalidIndex(I)V

    iget-object v0, p0, Lcom/google/android/apps/analytics/CustomVariableBuffer;->customVariables:[Lcom/google/android/apps/analytics/CustomVariable;

    #v0=(Reference);
    add-int/lit8 v1, p1, -0x1

    #v1=(Integer);
    aget-object v0, v0, v1

    #v0=(Null);
    return-object v0
.end method

.method public hasCustomVariables()Z
    .locals 3

    const/4 v1, 0x0

    #v1=(Null);
    move v0, v1

    :goto_0
    #v0=(Integer);v2=(Conflicted);
    iget-object v2, p0, Lcom/google/android/apps/analytics/CustomVariableBuffer;->customVariables:[Lcom/google/android/apps/analytics/CustomVariable;

    #v2=(Reference);
    array-length v2, v2

    #v2=(Integer);
    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lcom/google/android/apps/analytics/CustomVariableBuffer;->customVariables:[Lcom/google/android/apps/analytics/CustomVariable;

    #v2=(Reference);
    aget-object v2, v2, v0

    #v2=(Null);
    if-eqz v2, :cond_1

    const/4 v1, 0x1

    :cond_0
    #v1=(Boolean);v2=(Integer);
    return v1

    :cond_1
    #v1=(Null);v2=(Null);
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public isIndexAvailable(I)Z
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/apps/analytics/CustomVariableBuffer;->throwOnInvalidIndex(I)V

    iget-object v0, p0, Lcom/google/android/apps/analytics/CustomVariableBuffer;->customVariables:[Lcom/google/android/apps/analytics/CustomVariable;

    #v0=(Reference);
    add-int/lit8 v1, p1, -0x1

    #v1=(Integer);
    aget-object v0, v0, v1

    #v0=(Null);
    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Null);
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setCustomVariable(Lcom/google/android/apps/analytics/CustomVariable;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/apps/analytics/CustomVariable;->getIndex()I

    move-result v0

    #v0=(Integer);
    invoke-direct {p0, v0}, Lcom/google/android/apps/analytics/CustomVariableBuffer;->throwOnInvalidIndex(I)V

    iget-object v0, p0, Lcom/google/android/apps/analytics/CustomVariableBuffer;->customVariables:[Lcom/google/android/apps/analytics/CustomVariable;

    #v0=(Reference);
    invoke-virtual {p1}, Lcom/google/android/apps/analytics/CustomVariable;->getIndex()I

    move-result v1

    #v1=(Integer);
    add-int/lit8 v1, v1, -0x1

    aput-object p1, v0, v1

    return-void
.end method

*/}
