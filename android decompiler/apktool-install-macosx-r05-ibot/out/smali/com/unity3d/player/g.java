package com.unity3d.player; class g {/*

.class public final Lcom/unity3d/player/g;
.super Ljava/lang/Object;


# instance fields
.field private final a:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    #v0=(Reference);
    invoke-virtual {p1}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {p1}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v2

    #v2=(Reference);
    const/16 v3, 0x80

    :try_start_0
    #v3=(PosShort);
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v3, v1, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    #v3=(Reference);
    if-eqz v3, :cond_0

    iget-object v0, v1, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    new-instance v1, Landroid/os/Bundle;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/unity3d/player/g;->a:Landroid/os/Bundle;

    return-void

    :catch_0
    #v4=(Uninit);
    move-exception v1

    const/4 v1, 0x6

    #v1=(PosByte);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "Unable to retreive meta data for activity \'"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/unity3d/player/f;->Log(ILjava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public final a()Z
    .locals 6

    iget-object v0, p0, Lcom/unity3d/player/g;->a:Landroid/os/Bundle;

    #v0=(Reference);
    const-string v1, "ForwardNativeEventsToDalvik"

    #v1=(Reference);
    const-string v2, "%s.%s"

    #v2=(Reference);
    const/4 v3, 0x2

    #v3=(PosByte);
    new-array v3, v3, [Ljava/lang/Object;

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    const-string v5, "unityplayer"

    #v5=(Reference);
    aput-object v5, v3, v4

    const/4 v4, 0x1

    #v4=(One);
    aput-object v1, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

*/}
