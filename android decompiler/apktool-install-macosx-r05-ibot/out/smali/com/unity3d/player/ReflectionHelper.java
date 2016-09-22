package com.unity3d.player; class ReflectionHelper {/*

.class Lcom/unity3d/player/ReflectionHelper;
.super Ljava/lang/Object;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method private static a(Ljava/lang/Class;Ljava/lang/Class;)F
    .locals 1

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const/high16 v0, 0x3f80

    :goto_0
    #v0=(Integer);
    return v0

    :cond_0
    #v0=(Boolean);
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-nez v0, :cond_2

    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_1

    const/high16 v0, 0x3f00

    #v0=(Integer);
    goto :goto_0

    :catch_0
    #v0=(Boolean);
    move-exception v0

    :cond_1
    :try_start_1
    #v0=(Reference);
    invoke-virtual {p1, p0}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    if-eqz v0, :cond_2

    const v0, 0x3dcccccd

    #v0=(Integer);
    goto :goto_0

    :catch_1
    #v0=(Reference);
    move-exception v0

    :cond_2
    #v0=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method private static a(Ljava/lang/Class;[Ljava/lang/Class;[Ljava/lang/Class;)F
    .locals 6

    const/4 v1, 0x0

    #v1=(Null);
    array-length v0, p2

    #v0=(Integer);
    if-nez v0, :cond_0

    const v0, 0x3dcccccd

    :goto_0
    #v1=(Float);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return v0

    :cond_0
    #v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    if-nez p1, :cond_1

    move v0, v1

    :goto_1
    add-int/lit8 v0, v0, 0x1

    array-length v2, p2

    #v2=(Integer);
    if-eq v0, v2, :cond_2

    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0

    :cond_1
    #v0=(Integer);v2=(Uninit);
    array-length v0, p1

    goto :goto_1

    :cond_2
    #v2=(Integer);
    const/high16 v0, 0x3f80

    if-eqz p1, :cond_3

    array-length v4, p1

    #v4=(Integer);
    move v2, v1

    :goto_2
    #v1=(Integer);v3=(Conflicted);v5=(Conflicted);
    if-ge v1, v4, :cond_3

    aget-object v5, p1, v1

    #v5=(Null);
    add-int/lit8 v3, v2, 0x1

    #v3=(Integer);
    aget-object v2, p2, v2

    #v2=(Null);
    invoke-static {v5, v2}, Lcom/unity3d/player/ReflectionHelper;->a(Ljava/lang/Class;Ljava/lang/Class;)F

    move-result v2

    #v2=(Float);
    mul-float/2addr v0, v2

    #v0=(Float);
    add-int/lit8 v1, v1, 0x1

    move v2, v3

    #v2=(Integer);
    goto :goto_2

    :cond_3
    #v0=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    array-length v1, p2

    add-int/lit8 v1, v1, -0x1

    aget-object v1, p2, v1

    #v1=(Null);
    invoke-static {p0, v1}, Lcom/unity3d/player/ReflectionHelper;->a(Ljava/lang/Class;Ljava/lang/Class;)F

    move-result v1

    #v1=(Float);
    mul-float/2addr v0, v1

    #v0=(Float);
    goto :goto_0
.end method

.method private static a(Ljava/lang/String;[I)Ljava/lang/Class;
    .locals 4

    const/4 v2, 0x0

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Null);
    aget v0, p1, v2

    #v0=(Integer);
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    #v1=(Integer);
    if-ge v0, v1, :cond_b

    aget v0, p1, v2

    add-int/lit8 v1, v0, 0x1

    aput v1, p1, v2

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    #v0=(Char);
    const/16 v1, 0x28

    #v1=(PosByte);
    if-eq v0, v1, :cond_0

    const/16 v1, 0x29

    if-eq v0, v1, :cond_0

    const/16 v1, 0x4c

    if-ne v0, v1, :cond_1

    const/16 v0, 0x3b

    #v0=(PosByte);
    aget v1, p1, v2

    #v1=(Integer);
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    #v0=(Integer);
    const/4 v1, -0x1

    #v1=(Byte);
    if-eq v0, v1, :cond_b

    aget v1, p1, v2

    #v1=(Integer);
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    add-int/lit8 v0, v0, 0x1

    aput v0, p1, v2

    const/16 v0, 0x2f

    #v0=(PosByte);
    const/16 v2, 0x2e

    #v2=(PosByte);
    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    :try_start_0
    #v0=(Reference);
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Char);v1=(PosByte);v2=(Null);v3=(Uninit);
    const/16 v1, 0x5a

    if-ne v0, v1, :cond_2

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    #v0=(Reference);
    goto :goto_0

    :cond_2
    #v0=(Char);
    const/16 v1, 0x49

    if-ne v0, v1, :cond_3

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    #v0=(Reference);
    goto :goto_0

    :cond_3
    #v0=(Char);
    const/16 v1, 0x46

    if-ne v0, v1, :cond_4

    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    #v0=(Reference);
    goto :goto_0

    :cond_4
    #v0=(Char);
    const/16 v1, 0x56

    if-ne v0, v1, :cond_5

    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    #v0=(Reference);
    goto :goto_0

    :cond_5
    #v0=(Char);
    const/16 v1, 0x42

    if-ne v0, v1, :cond_6

    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    #v0=(Reference);
    goto :goto_0

    :cond_6
    #v0=(Char);
    const/16 v1, 0x53

    if-ne v0, v1, :cond_7

    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    #v0=(Reference);
    goto :goto_0

    :cond_7
    #v0=(Char);
    const/16 v1, 0x4a

    if-ne v0, v1, :cond_8

    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    #v0=(Reference);
    goto :goto_0

    :cond_8
    #v0=(Char);
    const/16 v1, 0x44

    if-ne v0, v1, :cond_9

    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    #v0=(Reference);
    goto :goto_0

    :cond_9
    #v0=(Char);
    const/16 v1, 0x5b

    if-ne v0, v1, :cond_a

    invoke-static {p0, p1}, Lcom/unity3d/player/ReflectionHelper;->a(Ljava/lang/String;[I)Ljava/lang/Class;

    move-result-object v0

    #v0=(Reference);
    invoke-static {v0, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    :cond_a
    #v0=(Char);
    const/4 v1, 0x5

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "parseType; "

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    #v0=(Reference);
    const-string v2, " is not known!"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/unity3d/player/f;->Log(ILjava/lang/String;)V

    :cond_b
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0

    :catch_0
    #v0=(Reference);v1=(Reference);v2=(PosByte);v3=(Uninit);
    move-exception v0

    goto :goto_1
.end method

.method private static a(Ljava/lang/String;)[Ljava/lang/Class;
    .locals 5

    const/4 v0, 0x0

    #v0=(Null);
    const/4 v1, 0x1

    #v1=(One);
    new-array v1, v1, [I

    #v1=(Reference);
    aput v0, v1, v0

    new-instance v2, Ljava/util/ArrayList;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    #v2=(Reference);v3=(Conflicted);v4=(Conflicted);
    aget v3, v1, v0

    #v3=(Integer);
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    #v4=(Integer);
    if-ge v3, v4, :cond_0

    invoke-static {p0, v1}, Lcom/unity3d/player/ReflectionHelper;->a(Ljava/lang/String;[I)Ljava/lang/Class;

    move-result-object v3

    #v3=(Reference);
    if-eqz v3, :cond_0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    #v3=(Conflicted);
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    new-array v3, v1, [Ljava/lang/Class;

    #v3=(Reference);
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    #v4=(Reference);
    move v1, v0

    :goto_1
    #v0=(Reference);v2=(Conflicted);
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/lang/Class;

    add-int/lit8 v2, v1, 0x1

    #v2=(Integer);
    aput-object v0, v3, v1

    move v1, v2

    goto :goto_1

    :cond_1
    #v0=(Boolean);v2=(Conflicted);
    return-object v3
.end method

.method protected static getConstructorID(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Constructor;
    .locals 9

    invoke-static {p1}, Lcom/unity3d/player/ReflectionHelper;->a(Ljava/lang/String;)[Ljava/lang/Class;

    move-result-object v5

    #v5=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p0}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v6

    #v6=(Reference);
    array-length v7, v6

    #v7=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    move v4, v0

    :goto_0
    #v0=(Float);v1=(Float);v2=(Conflicted);v4=(Integer);v8=(Conflicted);
    if-ge v4, v7, :cond_0

    aget-object v2, v6, v4

    #v2=(Null);
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    #v0=(Reference);
    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    #v8=(Reference);
    invoke-static {v0, v8, v5}, Lcom/unity3d/player/ReflectionHelper;->a(Ljava/lang/Class;[Ljava/lang/Class;[Ljava/lang/Class;)F

    move-result v0

    #v0=(Float);
    cmpl-float v8, v0, v1

    #v8=(Byte);
    if-lez v8, :cond_3

    const/high16 v1, 0x3f80

    #v1=(Integer);
    cmpl-float v1, v0, v1

    #v1=(Byte);
    if-eqz v1, :cond_1

    move-object v1, v2

    :goto_1
    #v1=(Null);
    add-int/lit8 v2, v4, 0x1

    #v2=(Integer);
    move v4, v2

    move-object v3, v1

    move v1, v0

    #v1=(Float);
    goto :goto_0

    :cond_0
    #v2=(Conflicted);v8=(Conflicted);
    move-object v2, v3

    :cond_1
    #v2=(Null);
    if-nez v2, :cond_2

    const/4 v0, 0x6

    #v0=(PosByte);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v3, "getConstructorID(\""

    #v3=(Reference);
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "\", \""

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "\") FAILED!"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/unity3d/player/f;->Log(ILjava/lang/String;)V

    :cond_2
    #v0=(Float);v1=(Conflicted);
    return-object v2

    :cond_3
    #v1=(Float);v3=(Null);v8=(Byte);
    move v0, v1

    move-object v1, v3

    #v1=(Null);
    goto :goto_1
.end method

.method protected static getFieldID(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Field;
    .locals 11

    const/4 v4, 0x0

    #v4=(Null);
    const/high16 v10, 0x3f80

    #v10=(Integer);
    invoke-static {p2}, Lcom/unity3d/player/ReflectionHelper;->a(Ljava/lang/String;)[Ljava/lang/Class;

    move-result-object v6

    #v6=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    move v1, v0

    #v1=(Null);
    move-object v0, v4

    :goto_0
    #v1=(Float);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v7

    #v7=(Reference);
    array-length v8, v7

    #v8=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    move v5, v2

    #v5=(Null);
    move-object v3, v0

    :goto_1
    #v0=(Float);v2=(Integer);v3=(Null);v5=(Integer);
    if-ge v5, v8, :cond_4

    aget-object v2, v7, v5

    #v2=(Null);
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v0

    #v0=(Integer);
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    #v0=(Boolean);
    if-ne p3, v0, :cond_3

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_3

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    #v0=(Reference);
    invoke-static {v0, v4, v6}, Lcom/unity3d/player/ReflectionHelper;->a(Ljava/lang/Class;[Ljava/lang/Class;[Ljava/lang/Class;)F

    move-result v0

    #v0=(Float);
    cmpl-float v9, v0, v1

    #v9=(Byte);
    if-lez v9, :cond_3

    cmpl-float v1, v0, v10

    #v1=(Byte);
    if-eqz v1, :cond_0

    move-object v1, v2

    :goto_2
    #v1=(Null);v9=(Conflicted);
    add-int/lit8 v2, v5, 0x1

    #v2=(Integer);
    move v5, v2

    move-object v3, v1

    move v1, v0

    #v1=(Float);
    goto :goto_1

    :cond_0
    #v1=(Byte);v2=(Null);v9=(Byte);
    move v1, v0

    #v1=(Float);
    move-object v0, v2

    :goto_3
    #v0=(Null);v2=(Integer);v9=(Conflicted);
    cmpl-float v2, v1, v10

    #v2=(Byte);
    if-eqz v2, :cond_1

    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_1

    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    move-result v2

    if-nez v2, :cond_1

    const-class v2, Ljava/lang/Object;

    #v2=(Reference);
    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_1

    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    #v2=(Reference);
    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_1

    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    goto :goto_0

    :cond_1
    #v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    if-nez v0, :cond_2

    const/4 v1, 0x6

    #v1=(PosByte);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "getFieldID(\""

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\", \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\") FAILED!"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/unity3d/player/f;->Log(ILjava/lang/String;)V

    :cond_2
    #v1=(Float);v2=(Conflicted);v3=(Conflicted);
    return-object v0

    :cond_3
    #v0=(Integer);v2=(Null);v3=(Null);v5=(Integer);v7=(Reference);v8=(Integer);
    move v0, v1

    #v0=(Float);
    move-object v1, v3

    #v1=(Null);
    goto :goto_2

    :cond_4
    #v1=(Float);v2=(Integer);
    move-object v0, v3

    #v0=(Null);
    goto :goto_3
.end method

.method protected static getMethodID(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;
    .locals 11

    const/high16 v9, 0x3f80

    #v9=(Integer);
    invoke-static {p2}, Lcom/unity3d/player/ReflectionHelper;->a(Ljava/lang/String;)[Ljava/lang/Class;

    move-result-object v5

    #v5=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    const/4 v0, 0x0

    #v0=(Null);
    move v10, v0

    #v10=(Null);
    move-object v0, v1

    move v1, v10

    :goto_0
    #v1=(Float);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v6

    #v6=(Reference);
    array-length v7, v6

    #v7=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    move v4, v2

    #v4=(Null);
    move-object v3, v0

    :goto_1
    #v0=(Float);v2=(Integer);v3=(Null);v4=(Integer);
    if-ge v4, v7, :cond_4

    aget-object v2, v6, v4

    #v2=(Null);
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v0

    #v0=(Integer);
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    #v0=(Boolean);
    if-ne p3, v0, :cond_3

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_3

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    #v8=(Reference);
    invoke-static {v0, v8, v5}, Lcom/unity3d/player/ReflectionHelper;->a(Ljava/lang/Class;[Ljava/lang/Class;[Ljava/lang/Class;)F

    move-result v0

    #v0=(Float);
    cmpl-float v8, v0, v1

    #v8=(Byte);
    if-lez v8, :cond_3

    cmpl-float v1, v0, v9

    #v1=(Byte);
    if-eqz v1, :cond_0

    move-object v1, v2

    :goto_2
    #v1=(Null);v8=(Conflicted);
    add-int/lit8 v2, v4, 0x1

    #v2=(Integer);
    move v4, v2

    move-object v3, v1

    move v1, v0

    #v1=(Float);
    goto :goto_1

    :cond_0
    #v1=(Byte);v2=(Null);v8=(Byte);
    move v1, v0

    #v1=(Float);
    move-object v0, v2

    :goto_3
    #v0=(Null);v2=(Integer);v8=(Conflicted);
    cmpl-float v2, v1, v9

    #v2=(Byte);
    if-eqz v2, :cond_1

    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_1

    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    move-result v2

    if-nez v2, :cond_1

    const-class v2, Ljava/lang/Object;

    #v2=(Reference);
    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_1

    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    #v2=(Reference);
    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_1

    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    goto :goto_0

    :cond_1
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    if-nez v0, :cond_2

    const/4 v1, 0x6

    #v1=(PosByte);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "getMethodID(\""

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\", \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\") FAILED!"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/unity3d/player/f;->Log(ILjava/lang/String;)V

    :cond_2
    #v1=(Float);v2=(Conflicted);v3=(Conflicted);
    return-object v0

    :cond_3
    #v0=(Integer);v2=(Null);v3=(Null);v4=(Integer);v6=(Reference);v7=(Integer);
    move v0, v1

    #v0=(Float);
    move-object v1, v3

    #v1=(Null);
    goto :goto_2

    :cond_4
    #v1=(Float);v2=(Integer);
    move-object v0, v3

    #v0=(Null);
    goto :goto_3
.end method

*/}
