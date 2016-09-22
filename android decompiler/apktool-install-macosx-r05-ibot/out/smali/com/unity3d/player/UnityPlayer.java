package com.unity3d.player; class UnityPlayer {/*

.class public Lcom/unity3d/player/UnityPlayer;
.super Landroid/widget/FrameLayout;

# interfaces
.implements Landroid/hardware/Camera$PreviewCallback;
.implements Landroid/opengl/GLSurfaceView$Renderer;


# static fields
.field private static Q:Lcom/unity3d/player/b;

.field public static currentActivity:Landroid/app/Activity;

.field private static o:Z

.field private static p:Z


# instance fields
.field private A:I

.field private B:Ljava/lang/String;

.field private C:Landroid/net/NetworkInfo;

.field private D:Lcom/unity3d/player/a/e;

.field private E:Z

.field private F:Z

.field private G:Z

.field private H:Landroid/os/Bundle;

.field private I:Ljava/util/Map;

.field private J:Z

.field private K:Z

.field private L:Z

.field private M:Ljava/lang/Runnable;

.field private N:Landroid/widget/ProgressBar;

.field private O:Ljava/lang/Runnable;

.field private P:Ljava/lang/Runnable;

.field private R:F

.field private S:F

.field private T:Ljava/lang/reflect/Method;

.field private U:Ljava/util/LinkedHashMap;

.field private V:Landroid/content/BroadcastReceiver;

.field private W:Z

.field private Z:I

.field a:Lcom/unity3d/player/p;

.field private aa:Z

.field private b:Z

.field private c:Z

.field private final d:Lcom/unity3d/player/e;

.field private e:Landroid/os/Bundle;

.field private f:Landroid/content/SharedPreferences;

.field private g:Landroid/content/ContextWrapper;

.field private h:Z

.field private i:Lcom/unity3d/player/UnityGL;

.field private j:Landroid/os/PowerManager$WakeLock;

.field private k:Landroid/hardware/SensorManager;

.field private l:Landroid/view/WindowManager;

.field private m:Lorg/fmod/FMODAudioDevice;

.field private n:Landroid/os/Vibrator;

.field private q:Z

.field private r:Z

.field private s:I

.field private t:I

.field private u:I

.field private v:I

.field private w:Z

.field private x:I

.field private y:Z

.field private final z:Lcom/unity3d/player/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    sput-object v1, Lcom/unity3d/player/UnityPlayer;->currentActivity:Landroid/app/Activity;

    const/4 v0, 0x0

    #v0=(Null);
    sput-boolean v0, Lcom/unity3d/player/UnityPlayer;->o:Z

    const/4 v0, 0x1

    #v0=(One);
    sput-boolean v0, Lcom/unity3d/player/UnityPlayer;->p:Z

    sput-object v1, Lcom/unity3d/player/UnityPlayer;->Q:Lcom/unity3d/player/b;

    new-instance v0, Lcom/unity3d/player/b;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/unity3d/player/b;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/unity3d/player/UnityPlayer;->Q:Lcom/unity3d/player/b;

    return-void
.end method

.method public constructor <init>(Landroid/content/ContextWrapper;)V
    .locals 7

    const/4 v6, -0x1

    #v6=(Byte);
    const/4 v4, 0x0

    #v4=(Null);
    const/4 v1, 0x1

    #v1=(One);
    const/4 v0, 0x0

    #v0=(Null);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    #p0=(Reference);
    iput-boolean v2, p0, Lcom/unity3d/player/UnityPlayer;->b:Z

    iput-boolean v2, p0, Lcom/unity3d/player/UnityPlayer;->c:Z

    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->e:Landroid/os/Bundle;

    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->f:Landroid/content/SharedPreferences;

    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->n:Landroid/os/Vibrator;

    iput-boolean v2, p0, Lcom/unity3d/player/UnityPlayer;->q:Z

    iput-boolean v1, p0, Lcom/unity3d/player/UnityPlayer;->r:Z

    iput v2, p0, Lcom/unity3d/player/UnityPlayer;->u:I

    iput v2, p0, Lcom/unity3d/player/UnityPlayer;->v:I

    iput-boolean v2, p0, Lcom/unity3d/player/UnityPlayer;->w:Z

    iput v6, p0, Lcom/unity3d/player/UnityPlayer;->x:I

    iput-boolean v2, p0, Lcom/unity3d/player/UnityPlayer;->y:Z

    iput v2, p0, Lcom/unity3d/player/UnityPlayer;->A:I

    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->B:Ljava/lang/String;

    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->C:Landroid/net/NetworkInfo;

    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->D:Lcom/unity3d/player/a/e;

    iput-boolean v2, p0, Lcom/unity3d/player/UnityPlayer;->E:Z

    iput-boolean v2, p0, Lcom/unity3d/player/UnityPlayer;->F:Z

    iput-boolean v2, p0, Lcom/unity3d/player/UnityPlayer;->G:Z

    new-instance v3, Landroid/os/Bundle;

    #v3=(UninitRef);
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    #v3=(Reference);
    iput-object v3, p0, Lcom/unity3d/player/UnityPlayer;->H:Landroid/os/Bundle;

    new-instance v3, Ljava/util/HashMap;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    #v3=(Reference);
    iput-object v3, p0, Lcom/unity3d/player/UnityPlayer;->I:Ljava/util/Map;

    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->a:Lcom/unity3d/player/p;

    iput-boolean v1, p0, Lcom/unity3d/player/UnityPlayer;->J:Z

    iput-boolean v2, p0, Lcom/unity3d/player/UnityPlayer;->K:Z

    iput-boolean v2, p0, Lcom/unity3d/player/UnityPlayer;->L:Z

    new-instance v3, Lcom/unity3d/player/r;

    #v3=(UninitRef);
    invoke-direct {v3, p0}, Lcom/unity3d/player/r;-><init>(Lcom/unity3d/player/UnityPlayer;)V

    #v3=(Reference);
    iput-object v3, p0, Lcom/unity3d/player/UnityPlayer;->M:Ljava/lang/Runnable;

    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->N:Landroid/widget/ProgressBar;

    new-instance v3, Lcom/unity3d/player/s;

    #v3=(UninitRef);
    invoke-direct {v3, p0}, Lcom/unity3d/player/s;-><init>(Lcom/unity3d/player/UnityPlayer;)V

    #v3=(Reference);
    iput-object v3, p0, Lcom/unity3d/player/UnityPlayer;->O:Ljava/lang/Runnable;

    new-instance v3, Lcom/unity3d/player/t;

    #v3=(UninitRef);
    invoke-direct {v3, p0}, Lcom/unity3d/player/t;-><init>(Lcom/unity3d/player/UnityPlayer;)V

    #v3=(Reference);
    iput-object v3, p0, Lcom/unity3d/player/UnityPlayer;->P:Ljava/lang/Runnable;

    iput v4, p0, Lcom/unity3d/player/UnityPlayer;->R:F

    iput v4, p0, Lcom/unity3d/player/UnityPlayer;->S:F

    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->T:Ljava/lang/reflect/Method;

    new-instance v3, Lcom/unity3d/player/UnityPlayer$18;

    #v3=(UninitRef);
    invoke-direct {v3, p0}, Lcom/unity3d/player/UnityPlayer$18;-><init>(Lcom/unity3d/player/UnityPlayer;)V

    #v3=(Reference);
    iput-object v3, p0, Lcom/unity3d/player/UnityPlayer;->V:Landroid/content/BroadcastReceiver;

    iput-boolean v2, p0, Lcom/unity3d/player/UnityPlayer;->W:Z

    iput v1, p0, Lcom/unity3d/player/UnityPlayer;->Z:I

    iput-boolean v1, p0, Lcom/unity3d/player/UnityPlayer;->aa:Z

    iput-object p1, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    :try_start_0
    const-string v3, "android.app.NativeActivity"

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    iget-object v4, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v4=(Reference);
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    #v3=(Boolean);
    iput-boolean v3, p0, Lcom/unity3d/player/UnityPlayer;->h:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    :goto_0
    #v3=(Conflicted);
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    #v3=(Integer);
    const/16 v4, 0x9

    #v4=(PosByte);
    if-lt v3, v4, :cond_0

    new-instance v0, Lcom/unity3d/player/c;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Lcom/unity3d/player/c;-><init>(Landroid/content/ContextWrapper;)V

    :cond_0
    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->d:Lcom/unity3d/player/e;

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getPackageName()Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    instance-of v0, p1, Landroid/app/Activity;

    #v0=(Boolean);
    if-eqz v0, :cond_1

    move-object v0, p1

    #v0=(Reference);
    check-cast v0, Landroid/app/Activity;

    sput-object v0, Lcom/unity3d/player/UnityPlayer;->currentActivity:Landroid/app/Activity;

    sget-object v0, Lcom/unity3d/player/UnityPlayer;->currentActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->e:Landroid/os/Bundle;

    const/4 v0, 0x3

    #v0=(PosByte);
    new-array v0, v0, [Ljava/lang/String;

    #v0=(Reference);
    const-string v4, "com.unity3d.player.UnityPlayerActivity"

    #v4=(Reference);
    aput-object v4, v0, v2

    const-string v4, "com.unity3d.player.UnityPlayerNativeActivity"

    aput-object v4, v0, v1

    const/4 v4, 0x2

    #v4=(PosByte);
    sget-object v5, Lcom/unity3d/player/UnityPlayer;->currentActivity:Landroid/app/Activity;

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v0, v4

    invoke-static {p1, v0}, Lcom/unity3d/player/UnityPlayerProxyActivity;->copyPlayerPrefs(Landroid/content/Context;[Ljava/lang/String;)V

    :cond_1
    #v0=(Conflicted);v5=(Conflicted);
    invoke-virtual {p1, v3, v2}, Landroid/content/ContextWrapper;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->f:Landroid/content/SharedPreferences;

    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayer;->b()V

    const-string v0, "apk"

    iget-object v3, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    invoke-virtual {v3}, Landroid/content/ContextWrapper;->getPackageCodePath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "mono"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    sget-object v0, Lcom/unity3d/player/UnityPlayer;->Q:Lcom/unity3d/player/b;

    invoke-virtual {v0}, Lcom/unity3d/player/b;->a()I

    move-result v0

    #v0=(Integer);
    and-int/lit8 v3, v0, 0x2

    #v3=(Integer);
    if-eqz v3, :cond_3

    and-int/lit16 v3, v0, 0x80

    if-eqz v3, :cond_2

    and-int/lit8 v0, v0, 0x8

    if-nez v0, :cond_3

    :cond_2
    const/4 v0, 0x6

    #v0=(PosByte);
    const-string v3, "CPU features not supported! (no ARMv6+ / VFP)"

    #v3=(Reference);
    invoke-static {v0, v3}, Lcom/unity3d/player/f;->Log(ILjava/lang/String;)V

    :goto_1
    #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getPackageCodePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/unity3d/player/UnityPlayer;->nativeFile(Ljava/lang/String;)V

    new-instance v0, Lcom/unity3d/player/h;

    #v0=(UninitRef);
    invoke-direct {v0, p1, p0}, Lcom/unity3d/player/h;-><init>(Landroid/content/Context;Lcom/unity3d/player/UnityPlayer;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->z:Lcom/unity3d/player/h;

    :try_start_1
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    new-instance v3, Ljava/lang/String;

    #v3=(UninitRef);
    const-string v4, "Y29tLmFuZHJvaWQudmVuZGluZy5DSEVDS19MSUNFTlNF"

    #v4=(Reference);
    invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B

    move-result-object v4

    invoke-static {v4}, Lcom/unity3d/player/b/a;->b([B)[B

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/String;-><init>([B)V

    #v3=(Reference);
    invoke-virtual {v0, v3}, Landroid/content/ContextWrapper;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    if-ne v6, v0, :cond_4

    move v0, v1

    :goto_2
    #v0=(Boolean);
    iput-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->G:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :goto_3
    #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    :cond_3
    #v0=(Integer);v3=(Integer);v4=(PosByte);
    sput-boolean v1, Lcom/unity3d/player/UnityPlayer;->o:Z

    :try_start_2
    const-string v0, "unity"

    #v0=(Reference);
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catch_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    const/4 v3, 0x5

    #v3=(PosByte);
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    #v4=(Reference);
    const-string v5, "Unable to load libraries: "

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/unity3d/player/f;->Log(ILjava/lang/String;)V

    sput-boolean v2, Lcom/unity3d/player/UnityPlayer;->o:Z

    goto :goto_1

    :cond_4
    #v0=(Integer);v3=(Reference);v5=(Conflicted);
    move v0, v2

    #v0=(Null);
    goto :goto_2

    :catch_1
    #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    move-exception v0

    #v0=(Reference);
    iput-boolean v1, p0, Lcom/unity3d/player/UnityPlayer;->G:Z

    goto :goto_3

    :catch_2
    #v0=(Null);v4=(Reference);v5=(Uninit);
    move-exception v3

    #v3=(Reference);
    goto/16 :goto_0
.end method

.method public static native UnitySendMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method static synthetic a(Lcom/unity3d/player/UnityPlayer;I)I
    .locals 0

    iput p1, p0, Lcom/unity3d/player/UnityPlayer;->x:I

    return p1
.end method

.method static synthetic a(Lcom/unity3d/player/UnityPlayer;Landroid/widget/ProgressBar;)Landroid/widget/ProgressBar;
    .locals 0

    iput-object p1, p0, Lcom/unity3d/player/UnityPlayer;->N:Landroid/widget/ProgressBar;

    return-object p1
.end method

.method private a(Ljava/lang/String;Ljava/io/File;)Ljava/lang/String;
    .locals 3

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v1=(Reference);
    const-string v2, "android.permission.WRITE_EXTERNAL_STORAGE"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/content/ContextWrapper;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    if-nez v1, :cond_1

    const-string v1, "mounted"

    #v1=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    #v0=(Reference);
    new-instance v1, Ljava/io/File;

    #v1=(UninitRef);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/Android/data/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    invoke-virtual {v2}, Landroid/content/ContextWrapper;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    :goto_0
    #v0=(Reference);v1=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Conflicted);
    invoke-virtual {p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    goto :goto_0
.end method

.method private a(IZ)V
    .locals 8

    const/4 v7, 0x1

    #v7=(One);
    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->h:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    new-instance v1, Lcom/unity3d/player/g;

    #v1=(UninitRef);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    check-cast v0, Landroid/app/Activity;

    invoke-direct {v1, v0}, Lcom/unity3d/player/g;-><init>(Landroid/app/Activity;)V

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/unity3d/player/g;->a()Z

    move-result v0

    #v0=(Boolean);
    invoke-virtual {p0, v0}, Lcom/unity3d/player/UnityPlayer;->nativeForwardEventsToDalvik(Z)V

    :cond_0
    #v1=(Conflicted);
    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayer;->initJni()V

    const-string v0, "power"

    #v0=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Landroid/content/ContextWrapper;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    const/16 v1, 0x1a

    #v1=(PosByte);
    const-string v2, "DoNotDimScreen"

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->j:Landroid/os/PowerManager$WakeLock;

    new-instance v0, Lcom/unity3d/player/PlayerPrefs;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->f:Landroid/content/SharedPreferences;

    #v1=(Reference);
    invoke-direct {v0, v1}, Lcom/unity3d/player/PlayerPrefs;-><init>(Landroid/content/SharedPreferences;)V

    #v0=(Reference);
    const-class v0, Lcom/unity3d/player/WWW;

    invoke-direct {p0, v0}, Lcom/unity3d/player/UnityPlayer;->nativeInitWWW(Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    if-nez v0, :cond_1

    new-instance v0, Lcom/unity3d/player/UnityPlayer$17;

    #v0=(UninitRef);
    iget-object v2, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    const/4 v5, 0x0

    #v5=(Null);
    move-object v1, p0

    move v3, p1

    #v3=(Integer);
    move v4, p2

    #v4=(Boolean);
    move-object v6, p0

    #v6=(Reference);
    invoke-direct/range {v0 .. v6}, Lcom/unity3d/player/UnityPlayer$17;-><init>(Lcom/unity3d/player/UnityPlayer;Landroid/content/Context;IZZLandroid/view/View;)V

    #v0=(Reference);
    invoke-virtual {v0, v7}, Lcom/unity3d/player/q;->setFocusable(Z)V

    invoke-virtual {v0, v7}, Lcom/unity3d/player/q;->setFocusableInTouchMode(Z)V

    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    :cond_1
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    invoke-interface {v0, p0}, Lcom/unity3d/player/UnityGL;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    const-string v1, "sensor"

    invoke-virtual {v0, v1}, Landroid/content/ContextWrapper;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/ContextWrapper;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->l:Landroid/view/WindowManager;

    invoke-virtual {p0}, Lcom/unity3d/player/UnityPlayer;->getSettings()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "splash_mode"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    new-instance v2, Lcom/unity3d/player/UnityPlayer$19;

    #v2=(UninitRef);
    invoke-direct {v2, p0, p1, v0}, Lcom/unity3d/player/UnityPlayer$19;-><init>(Lcom/unity3d/player/UnityPlayer;II)V

    #v2=(Reference);
    invoke-interface {v1, v2}, Lcom/unity3d/player/UnityGL;->queueEvent(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->e:Landroid/os/Bundle;

    #v0=(Reference);
    invoke-direct {p0, v0}, Lcom/unity3d/player/UnityPlayer;->nativeSetExtras(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->d:Lcom/unity3d/player/e;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->h:Z

    #v0=(Boolean);
    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->d:Lcom/unity3d/player/e;

    #v0=(Reference);
    invoke-interface {v0}, Lcom/unity3d/player/e;->b()Landroid/graphics/RectF;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v1

    #v1=(Float);
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    #v0=(Float);
    invoke-direct {p0, v1, v0}, Lcom/unity3d/player/UnityPlayer;->nativeEnableTouchpad(FF)V

    :cond_2
    #v0=(Conflicted);v1=(Conflicted);
    invoke-virtual {p0}, Lcom/unity3d/player/UnityPlayer;->resume()V

    invoke-virtual {p0, v7}, Lcom/unity3d/player/UnityPlayer;->windowFocusChanged(Z)V

    return-void
.end method

.method static synthetic a(Lcom/unity3d/player/UnityPlayer;)V
    .locals 0

    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayer;->c()V

    return-void
.end method

.method static synthetic a(Lcom/unity3d/player/UnityPlayer;FF)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/unity3d/player/UnityPlayer;->nativeSetMousePosition(FF)V

    return-void
.end method

.method static synthetic a(Lcom/unity3d/player/UnityPlayer;FFF)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/unity3d/player/UnityPlayer;->nativeSetMouseDelta(FFF)V

    return-void
.end method

.method static synthetic a(Lcom/unity3d/player/UnityPlayer;IFFI)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/unity3d/player/UnityPlayer;->nativeQueueGUIEvent(IFFI)V

    return-void
.end method

.method static synthetic a(Lcom/unity3d/player/UnityPlayer;IFFIJI)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lcom/unity3d/player/UnityPlayer;->nativeTouch(IFFIJI)V

    return-void
.end method

.method static synthetic a(Lcom/unity3d/player/UnityPlayer;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/unity3d/player/UnityPlayer;->nativeInit(II)V

    return-void
.end method

.method static synthetic a(Lcom/unity3d/player/UnityPlayer;IIF)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/unity3d/player/UnityPlayer;->nativeSetJoystickPosition(IIF)V

    return-void
.end method

.method static synthetic a(Lcom/unity3d/player/UnityPlayer;IIZII)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/unity3d/player/UnityPlayer;->nativeKeyState(IIZII)V

    return-void
.end method

.method static synthetic a(Lcom/unity3d/player/UnityPlayer;IZ)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/unity3d/player/UnityPlayer;->a(IZ)V

    return-void
.end method

.method static synthetic a(Lcom/unity3d/player/UnityPlayer;I[BII)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/unity3d/player/UnityPlayer;->nativeVideoFrameCallback(I[BII)V

    return-void
.end method

.method static synthetic a(Lcom/unity3d/player/UnityPlayer;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/unity3d/player/UnityPlayer;->nativeSetInputString(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    instance-of v0, v0, Landroid/app/Activity;

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_0
    #v0=(Boolean);v1=(Uninit);
    const/4 v0, 0x5

    #v0=(PosByte);
    const-string v1, "Not running Unity from an Activity; ignored..."

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/unity3d/player/f;->Log(ILjava/lang/String;)V

    goto :goto_0
.end method

.method private a(Z)V
    .locals 7

    const/16 v6, 0xb

    #v6=(PosByte);
    const/16 v5, 0xa

    #v5=(PosByte);
    const/16 v4, 0x9

    #v4=(PosByte);
    const/4 v3, 0x4

    #v3=(PosByte);
    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->W:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Integer);
    return-void

    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(PosByte);
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    #v0=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->z:Lcom/unity3d/player/h;

    #v1=(Reference);
    iget-object v2, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    #v2=(Reference);
    invoke-virtual {v2, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    iget v3, p0, Lcom/unity3d/player/UnityPlayer;->Z:I

    #v3=(Integer);
    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->z:Lcom/unity3d/player/h;

    iget-object v2, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    invoke-virtual {v2, v4}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    iget v3, p0, Lcom/unity3d/player/UnityPlayer;->Z:I

    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->z:Lcom/unity3d/player/h;

    iget-object v2, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    invoke-virtual {v2, v5}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    iget v3, p0, Lcom/unity3d/player/UnityPlayer;->Z:I

    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->z:Lcom/unity3d/player/h;

    iget-object v2, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    invoke-virtual {v2, v6}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    iget v3, p0, Lcom/unity3d/player/UnityPlayer;->Z:I

    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    goto :goto_0

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(PosByte);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    #v0=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->z:Lcom/unity3d/player/h;

    #v1=(Reference);
    iget-object v2, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    #v2=(Reference);
    invoke-virtual {v2, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->z:Lcom/unity3d/player/h;

    iget-object v2, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    invoke-virtual {v2, v4}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->z:Lcom/unity3d/player/h;

    iget-object v2, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    invoke-virtual {v2, v5}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->z:Lcom/unity3d/player/h;

    iget-object v2, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    invoke-virtual {v2, v6}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    goto :goto_0
.end method

.method static synthetic a()Z
    .locals 1

    const/4 v0, 0x1

    #v0=(One);
    sput-boolean v0, Lcom/unity3d/player/UnityPlayer;->o:Z

    return v0
.end method

.method private a(ILandroid/view/KeyEvent;)Z
    .locals 8

    const/4 v4, 0x0

    #v4=(Null);
    const/4 v7, 0x1

    #v7=(One);
    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->q:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Boolean);v5=(Conflicted);v6=(Conflicted);v7=(Boolean);
    return v7

    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);v5=(Uninit);v6=(Uninit);v7=(One);
    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->w:Z

    if-eqz v0, :cond_1

    move v7, v4

    #v7=(Null);
    goto :goto_0

    :cond_1
    #v7=(One);
    const/16 v0, 0x19

    #v0=(PosByte);
    if-eq p1, v0, :cond_2

    const/16 v0, 0x18

    if-ne p1, v0, :cond_4

    :cond_2
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_3

    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v7

    #v7=(Boolean);
    goto :goto_0

    :cond_3
    #v7=(One);
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v7

    #v7=(Boolean);
    goto :goto_0

    :cond_4
    #v0=(PosByte);v7=(One);
    const/4 v0, 0x4

    if-ne p1, v0, :cond_6

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v0

    #v0=(Integer);
    const/4 v1, 0x2

    #v1=(PosByte);
    if-ne v0, v1, :cond_6

    const/16 p1, 0x65

    #p1=(PosByte);
    move v2, p1

    :goto_1
    #v1=(Conflicted);v2=(Integer);p1=(Integer);
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/KeyEvent;->getUnicodeChar(I)I

    move-result v3

    #v3=(Integer);
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_5

    move v4, v7

    :cond_5
    #v4=(Boolean);
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getScanCode()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v6

    #v6=(Integer);
    new-instance v0, Lcom/unity3d/player/UnityPlayer$3;

    #v0=(UninitRef);
    move-object v1, p0

    #v1=(Reference);
    invoke-direct/range {v0 .. v6}, Lcom/unity3d/player/UnityPlayer$3;-><init>(Lcom/unity3d/player/UnityPlayer;IIZII)V

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/unity3d/player/UnityPlayer;->queueEvent(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_6
    #v0=(Integer);v1=(Conflicted);v2=(Uninit);v3=(Uninit);v4=(Null);v5=(Uninit);v6=(Uninit);
    move v2, p1

    #v2=(Integer);
    goto :goto_1
.end method

.method private a(Landroid/view/MotionEvent;)Z
    .locals 13

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v10

    #v10=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    move v9, v0

    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Integer);v11=(Conflicted);v12=(Conflicted);
    if-ge v9, v10, :cond_4

    if-nez v9, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v1, v0, 0xff

    #v1=(Integer);
    shr-int/lit8 v1, v1, 0x8

    if-ne v9, v1, :cond_2

    and-int/lit16 v2, v0, 0xff

    :goto_1
    #v2=(Integer);
    invoke-virtual {p1, v9}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    #v4=(Float);
    invoke-virtual {p1, v9}, Landroid/view/MotionEvent;->getY(I)F

    move-result v5

    #v5=(Float);
    iget v6, p0, Lcom/unity3d/player/UnityPlayer;->R:F

    #v6=(Integer);
    iget v7, p0, Lcom/unity3d/player/UnityPlayer;->S:F

    #v7=(Integer);
    const/4 v1, 0x0

    #v1=(Null);
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xc

    #v3=(PosByte);
    if-lt v0, v3, :cond_3

    :try_start_0
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->T:Ljava/lang/reflect/Method;

    #v0=(Reference);
    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v3, "getAxisValue"

    #v3=(Reference);
    const/4 v8, 0x2

    #v8=(PosByte);
    new-array v8, v8, [Ljava/lang/Class;

    #v8=(Reference);
    const/4 v11, 0x0

    #v11=(Null);
    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    #v12=(Reference);
    aput-object v12, v8, v11

    const/4 v11, 0x1

    #v11=(One);
    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v12, v8, v11

    invoke-virtual {v0, v3, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->T:Ljava/lang/reflect/Method;

    :cond_0
    #v3=(Conflicted);v8=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->T:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->T:Ljava/lang/reflect/Method;

    const/4 v3, 0x2

    #v3=(PosByte);
    new-array v3, v3, [Ljava/lang/Object;

    #v3=(Reference);
    const/4 v8, 0x0

    #v8=(Null);
    const/16 v11, 0x9

    #v11=(PosByte);
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    #v11=(Reference);
    aput-object v11, v3, v8

    const/4 v8, 0x1

    #v8=(One);
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v3, v8

    invoke-virtual {v0, p1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_2
    #v0=(Float);v3=(Conflicted);v8=(Conflicted);v11=(Conflicted);
    move v8, v0

    :goto_3
    #v0=(Conflicted);v8=(Float);
    new-instance v0, Lcom/unity3d/player/UnityPlayer$5;

    #v0=(UninitRef);
    const/4 v3, 0x0

    #v3=(Null);
    move-object v1, p0

    #v1=(Reference);
    invoke-direct/range {v0 .. v8}, Lcom/unity3d/player/UnityPlayer$5;-><init>(Lcom/unity3d/player/UnityPlayer;IIFFFFF)V

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/unity3d/player/UnityPlayer;->queueEvent(Ljava/lang/Runnable;)V

    iput v4, p0, Lcom/unity3d/player/UnityPlayer;->R:F

    iput v5, p0, Lcom/unity3d/player/UnityPlayer;->S:F

    :cond_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    add-int/lit8 v0, v9, 0x1

    #v0=(Integer);
    move v9, v0

    goto :goto_0

    :cond_2
    #v1=(Integer);
    const/4 v2, 0x2

    #v2=(PosByte);
    goto :goto_1

    :catch_0
    #v0=(Conflicted);v1=(Null);v2=(Integer);v4=(Float);v5=(Float);v6=(Integer);v7=(Integer);
    move-exception v0

    :cond_3
    move v8, v1

    #v8=(Null);
    goto :goto_3

    :cond_4
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    const/4 v0, 0x1

    #v0=(One);
    return v0

    :cond_5
    #v0=(Reference);v1=(Null);v2=(Integer);v4=(Float);v5=(Float);v6=(Integer);v7=(Integer);
    move v0, v1

    #v0=(Null);
    goto :goto_2
.end method

.method static synthetic a(Lcom/unity3d/player/UnityPlayer;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/unity3d/player/UnityPlayer;->y:Z

    return p1
.end method

.method static synthetic b(Lcom/unity3d/player/UnityPlayer;)I
    .locals 1

    iget v0, p0, Lcom/unity3d/player/UnityPlayer;->x:I

    #v0=(Integer);
    return v0
.end method

.method private b()V
    .locals 9

    const/4 v7, 0x1

    #v7=(One);
    const/4 v2, 0x0

    :try_start_0
    #v2=(Null);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "bin/Data/settings.xml"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    move-result-object v1

    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v1, v3}, Lorg/xmlpull/v1/XmlPullParserFactory;->setNamespaceAware(Z)V

    invoke-virtual {v1}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v4

    #v4=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-interface {v4, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    #v0=(Integer);
    move-object v1, v2

    move-object v3, v2

    :goto_0
    #v1=(Reference);v3=(Reference);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
    if-eq v0, v7, :cond_7

    const/4 v5, 0x2

    #v5=(PosByte);
    if-ne v0, v5, :cond_3

    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x0

    #v0=(Null);
    move v8, v0

    #v8=(Null);
    move-object v0, v1

    #v0=(Reference);
    move v1, v8

    :goto_1
    #v1=(Integer);
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v5

    #v5=(Integer);
    if-ge v1, v5, :cond_1

    invoke-interface {v4, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    const-string v6, "name"

    #v6=(Reference);
    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    #v5=(Boolean);
    if-eqz v5, :cond_0

    invoke-interface {v4, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    #v5=(Integer);v6=(Conflicted);
    move-object v1, v0

    :cond_2
    :goto_2
    #v0=(Conflicted);v1=(Reference);v5=(Conflicted);v8=(Conflicted);
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    #v0=(Integer);
    goto :goto_0

    :cond_3
    #v5=(PosByte);
    const/4 v5, 0x3

    if-ne v0, v5, :cond_4

    move-object v3, v2

    #v3=(Null);
    goto :goto_2

    :cond_4
    #v3=(Reference);
    const/4 v5, 0x4

    if-ne v0, v5, :cond_2

    if-eqz v1, :cond_2

    const-string v0, "integer"

    #v0=(Reference);
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->H:Landroid/os/Bundle;

    #v0=(Reference);
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v0, v1, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_5
    :goto_3
    #v0=(Conflicted);v5=(Conflicted);
    move-object v1, v2

    #v1=(Null);
    goto :goto_2

    :cond_6
    #v0=(Boolean);v1=(Reference);v5=(PosByte);
    const-string v0, "string"

    #v0=(Reference);
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->H:Landroid/os/Bundle;

    #v0=(Reference);
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {v0, v1, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    move-exception v0

    #v0=(Reference);
    const/4 v1, 0x6

    #v1=(PosByte);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "Unable to locate player settings. "

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/unity3d/player/f;->Log(ILjava/lang/String;)V

    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayer;->c()V

    :cond_7
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_8
    :try_start_1
    #v0=(Boolean);v1=(Reference);v2=(Null);v4=(Reference);v5=(PosByte);
    const-string v0, "bool"

    #v0=(Reference);
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->H:Landroid/os/Bundle;

    #v0=(Reference);
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-static {v5}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v5

    #v5=(Boolean);
    invoke-virtual {v0, v1, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_3

    :cond_9
    #v0=(Boolean);v5=(PosByte);
    const-string v0, "float"

    #v0=(Reference);
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->H:Landroid/os/Bundle;

    #v0=(Reference);
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v5

    #v5=(Float);
    invoke-virtual {v0, v1, v5}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3
.end method

.method static synthetic b(Lcom/unity3d/player/UnityPlayer;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/unity3d/player/UnityPlayer;->nativeFocusChanged(Z)V

    return-void
.end method

.method private b(Z)V
    .locals 4

    const/4 v3, 0x2

    #v3=(PosByte);
    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->aa:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    #v0=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->z:Lcom/unity3d/player/h;

    #v1=(Reference);
    iget-object v2, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    #v2=(Reference);
    invoke-virtual {v2, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    goto :goto_0

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(PosByte);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    #v0=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->z:Lcom/unity3d/player/h;

    #v1=(Reference);
    iget-object v2, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    #v2=(Reference);
    invoke-virtual {v2, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    goto :goto_0
.end method

.method private b(Landroid/view/MotionEvent;)Z
    .locals 6

    const/4 v5, 0x1

    #v5=(One);
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0xc

    #v1=(PosByte);
    if-ge v0, v1, :cond_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return v5

    :cond_0
    #v0=(Integer);v1=(PosByte);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->T:Ljava/lang/reflect/Method;

    #v0=(Reference);
    if-nez v0, :cond_1

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getAxisValue"

    #v1=(Reference);
    const/4 v2, 0x2

    #v2=(PosByte);
    new-array v2, v2, [Ljava/lang/Class;

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    #v4=(Reference);
    aput-object v4, v2, v3

    const/4 v3, 0x1

    #v3=(One);
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->T:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    new-instance v0, Lcom/unity3d/player/UnityPlayer$6;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p1}, Lcom/unity3d/player/UnityPlayer$6;-><init>(Lcom/unity3d/player/UnityPlayer;Landroid/view/MotionEvent;)V

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/unity3d/player/UnityPlayer;->queueEvent(Ljava/lang/Runnable;)V

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic b(Lcom/unity3d/player/UnityPlayer;I)[Ljava/lang/Integer;
    .locals 2

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->U:Ljava/util/LinkedHashMap;

    #v0=(Reference);
    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/unity3d/player/UnityPlayer;->getConnectedJoysticks()[I

    :cond_0
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->U:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Integer;

    if-eqz v0, :cond_2

    :cond_1
    :goto_0
    return-object v0

    :cond_2
    invoke-virtual {p0}, Lcom/unity3d/player/UnityPlayer;->getConnectedJoysticks()[I

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->U:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Integer;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method static synthetic c(Lcom/unity3d/player/UnityPlayer;)Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->H:Landroid/os/Bundle;

    #v0=(Reference);
    return-object v0
.end method

.method private c()V
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    instance-of v0, v0, Landroid/app/Activity;

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_0
    #v0=(Conflicted);
    return-void
.end method

.method static synthetic c(Lcom/unity3d/player/UnityPlayer;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/unity3d/player/UnityPlayer;->E:Z

    return p1
.end method

.method private d()V
    .locals 2

    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->L:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->J:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->K:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->K:Z

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    #v0=(Reference);
    instance-of v0, v0, Lcom/unity3d/player/q;

    #v0=(Boolean);
    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    #v0=(Reference);
    check-cast v0, Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/unity3d/player/UnityPlayer;->addView(Landroid/view/View;)V

    :cond_2
    #v0=(Conflicted);
    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->q:Z

    #v0=(Boolean);
    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    #v0=(Reference);
    new-instance v1, Lcom/unity3d/player/UnityPlayer$22;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/unity3d/player/UnityPlayer$22;-><init>(Lcom/unity3d/player/UnityPlayer;)V

    #v1=(Reference);
    invoke-interface {v0, v1}, Lcom/unity3d/player/UnityGL;->queueEvent(Ljava/lang/Runnable;)V

    :cond_3
    #v0=(Conflicted);v1=(Conflicted);
    sget-boolean v0, Lcom/unity3d/player/UnityPlayer;->p:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->m:Lorg/fmod/FMODAudioDevice;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Lorg/fmod/FMODAudioDevice;

    #v0=(UninitRef);
    invoke-direct {v0}, Lorg/fmod/FMODAudioDevice;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->m:Lorg/fmod/FMODAudioDevice;

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->m:Lorg/fmod/FMODAudioDevice;

    invoke-virtual {v0}, Lorg/fmod/FMODAudioDevice;->start()V

    goto :goto_0
.end method

.method static synthetic d(Lcom/unity3d/player/UnityPlayer;Z)V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, v0, p1}, Lcom/unity3d/player/UnityPlayer;->nativeSetMouseButton(IZ)V

    return-void
.end method

.method static synthetic d(Lcom/unity3d/player/UnityPlayer;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->y:Z

    #v0=(Boolean);
    return v0
.end method

.method static synthetic e(Lcom/unity3d/player/UnityPlayer;)V
    .locals 0

    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayer;->nativeDone()V

    return-void
.end method

.method static synthetic e(Lcom/unity3d/player/UnityPlayer;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/unity3d/player/UnityPlayer;->c:Z

    return p1
.end method

.method static synthetic f(Lcom/unity3d/player/UnityPlayer;)Z
    .locals 1

    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayer;->nativePause()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method static synthetic g(Lcom/unity3d/player/UnityPlayer;)V
    .locals 0

    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayer;->nativeResume()V

    return-void
.end method

.method static synthetic h(Lcom/unity3d/player/UnityPlayer;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->L:Z

    #v0=(Boolean);
    return v0
.end method

.method static synthetic i(Lcom/unity3d/player/UnityPlayer;)Lcom/unity3d/player/UnityGL;
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    #v0=(Reference);
    return-object v0
.end method

.method private final native initJni()V
.end method

.method static synthetic j(Lcom/unity3d/player/UnityPlayer;)Z
    .locals 1

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->F:Z

    return v0
.end method

.method static synthetic k(Lcom/unity3d/player/UnityPlayer;)I
    .locals 1

    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayer;->nativeActivityIndicatorStyle()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method static synthetic l(Lcom/unity3d/player/UnityPlayer;)Landroid/widget/ProgressBar;
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->N:Landroid/widget/ProgressBar;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic m(Lcom/unity3d/player/UnityPlayer;)Landroid/content/ContextWrapper;
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic n(Lcom/unity3d/player/UnityPlayer;)I
    .locals 1

    iget v0, p0, Lcom/unity3d/player/UnityPlayer;->t:I

    #v0=(Integer);
    return v0
.end method

.method private final native nativeActivityIndicatorStyle()I
.end method

.method private final native nativeDone()V
.end method

.method private final native nativeEnableTouchpad(FF)V
.end method

.method private final native nativeFile(Ljava/lang/String;)V
.end method

.method private final native nativeFocusChanged(Z)V
.end method

.method private final native nativeGetGLContext()Ljava/lang/String;
.end method

.method private final native nativeGetGLScreen()Ljava/lang/String;
.end method

.method private final native nativeGetLicensePolicy()I
.end method

.method private final native nativeInit(II)V
.end method

.method private final native nativeInitWWW(Ljava/lang/Class;)V
.end method

.method private final native nativeIsAutorotationOn()Z
.end method

.method private final native nativeJoyButtonState(IIZ)V
.end method

.method private final native nativeKeyState(IIZII)V
.end method

.method private final native nativePause()Z
.end method

.method private final native nativeQueueGUIEvent(IFFI)V
.end method

.method private final native nativeRecreateGfxState()V
.end method

.method private final native nativeRender()Z
.end method

.method private final native nativeRequested32bitDisplayBuffer()Z
.end method

.method private final native nativeRequestedAA()I
.end method

.method private final native nativeResize(IIII)V
.end method

.method private final native nativeResume()V
.end method

.method private final native nativeSetExtras(Landroid/os/Bundle;)V
.end method

.method private final native nativeSetInputString(Ljava/lang/String;)V
.end method

.method private final native nativeSetJoystickPosition(IIF)V
.end method

.method private final native nativeSetMouseButton(IZ)V
.end method

.method private final native nativeSetMouseDelta(FFF)V
.end method

.method private final native nativeSetMousePosition(FF)V
.end method

.method private final native nativeSetTouchDeltaY(F)V
.end method

.method private final native nativeSoftInputClosed()V
.end method

.method private final native nativeTouch(IFFIJI)V
.end method

.method private final native nativeVideoFrameCallback(I[BII)V
.end method

.method static synthetic o(Lcom/unity3d/player/UnityPlayer;)Ljava/lang/reflect/Method;
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->T:Ljava/lang/reflect/Method;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic p(Lcom/unity3d/player/UnityPlayer;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->b:Z

    #v0=(Boolean);
    return v0
.end method

.method static synthetic q(Lcom/unity3d/player/UnityPlayer;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->c:Z

    #v0=(Boolean);
    return v0
.end method

.method static synthetic r(Lcom/unity3d/player/UnityPlayer;)V
    .locals 0

    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayer;->nativeSoftInputClosed()V

    return-void
.end method

.method static synthetic s(Lcom/unity3d/player/UnityPlayer;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->w:Z

    #v0=(Boolean);
    return v0
.end method

.method private final native unityAndroidInit(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method private final native unityAndroidPrepareGameLoop()V
.end method


# virtual methods
.method protected Location_IsServiceEnabledByUser()Z
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->z:Lcom/unity3d/player/h;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/unity3d/player/h;->a()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method protected Location_SetDesiredAccuracy(F)V
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->z:Lcom/unity3d/player/h;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/unity3d/player/h;->b(F)V

    return-void
.end method

.method protected Location_SetDistanceFilter(F)V
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->z:Lcom/unity3d/player/h;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/unity3d/player/h;->a(F)V

    return-void
.end method

.method protected Location_StartUpdatingLocation()V
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->z:Lcom/unity3d/player/h;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/unity3d/player/h;->b()V

    return-void
.end method

.method protected Location_StopUpdatingLocation()V
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->z:Lcom/unity3d/player/h;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/unity3d/player/h;->c()V

    return-void
.end method

.method protected canUse32bitDisplayBuffer()Z
    .locals 1

    invoke-static {}, Lcom/unity3d/player/q;->b()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method protected closeCamera(I)V
    .locals 3

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->I:Ljava/util/Map;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    #v1=(Reference);v2=(Conflicted);
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/unity3d/player/a;

    invoke-virtual {v0}, Lcom/unity3d/player/a;->e()I

    move-result v2

    #v2=(Integer);
    if-ne v2, p1, :cond_0

    invoke-virtual {v0}, Lcom/unity3d/player/a;->f()V

    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->I:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/unity3d/player/a;->a()Landroid/hardware/Camera;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    #v0=(Conflicted);v2=(Conflicted);
    return-void
.end method

.method public configurationChanged(Landroid/content/res/Configuration;)V
    .locals 3

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    #v0=(Reference);
    instance-of v0, v0, Landroid/view/SurfaceView;

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    #v0=(Reference);
    check-cast v0, Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SurfaceHolder;->setSizeFromLayout()V

    :cond_0
    #v0=(Conflicted);
    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->c:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    iget v0, p1, Landroid/content/res/Configuration;->hardKeyboardHidden:I

    #v0=(Integer);
    const/4 v1, 0x2

    #v1=(PosByte);
    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    const-string v1, "input_method"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/ContextWrapper;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    const/4 v1, 0x0

    #v1=(Null);
    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    :cond_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void
.end method

.method protected dispatchTouchEvent(IIIFFJI)Z
    .locals 9

    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->q:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(One);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return v0

    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->h:Z

    if-nez v0, :cond_1

    and-int/lit16 v5, p2, 0xff

    #v5=(Integer);
    const v0, 0xff00

    #v0=(Char);
    and-int/2addr v0, p2

    #v0=(Integer);
    shr-int/lit8 v0, v0, 0x8

    if-ne p1, v0, :cond_2

    :goto_1
    new-instance v0, Lcom/unity3d/player/UnityPlayer$4;

    #v0=(UninitRef);
    move-object v1, p0

    #v1=(Reference);
    move v2, p3

    #v2=(Integer);
    move v3, p4

    #v3=(Float);
    move v4, p5

    #v4=(Float);
    move-wide v6, p6

    #v6=(LongLo);v7=(LongHi);
    move/from16 v8, p8

    #v8=(Integer);
    invoke-direct/range {v0 .. v8}, Lcom/unity3d/player/UnityPlayer$4;-><init>(Lcom/unity3d/player/UnityPlayer;IFFIJI)V

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/unity3d/player/UnityPlayer;->queueEvent(Ljava/lang/Runnable;)V

    :cond_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0

    :cond_2
    #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Integer);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    const/4 v5, 0x2

    #v5=(PosByte);
    goto :goto_1
.end method

.method protected forwardMotionEventToDalvik(JJII[I[FIFFIIIII[J[F)V
    .locals 20

    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v1, v0, Lcom/unity3d/player/UnityPlayer;->d:Lcom/unity3d/player/e;

    #v1=(Reference);
    if-eqz v1, :cond_0

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/unity3d/player/UnityPlayer;->d:Lcom/unity3d/player/e;

    move-wide/from16 v2, p1

    #v2=(LongLo);v3=(LongHi);
    move-wide/from16 v4, p3

    #v4=(LongLo);v5=(LongHi);
    move/from16 v6, p5

    #v6=(Integer);
    move/from16 v7, p6

    #v7=(Integer);
    move-object/from16 v8, p7

    #v8=(Reference);
    move-object/from16 v9, p8

    #v9=(Reference);
    move/from16 v10, p9

    #v10=(Integer);
    move/from16 v11, p10

    #v11=(Float);
    move/from16 v12, p11

    #v12=(Float);
    move/from16 v13, p12

    #v13=(Integer);
    move/from16 v14, p13

    #v14=(Integer);
    move/from16 v15, p14

    #v15=(Integer);
    move/from16 v16, p15

    #v16=(Integer);
    move/from16 v17, p16

    #v17=(Integer);
    move-object/from16 v18, p17

    #v18=(Reference);
    move-object/from16 v19, p18

    #v19=(Reference);
    invoke-interface/range {v1 .. v19}, Lcom/unity3d/player/e;->a(JJII[I[FIFFIIIII[J[F)V

    :cond_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);
    return-void
.end method

.method protected getCPUType()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/unity3d/player/UnityPlayer;->Q:Lcom/unity3d/player/b;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/unity3d/player/b;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected getCacheDir()Ljava/lang/String;
    .locals 2

    const-string v0, "/cache"

    #v0=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getCacheDir()Ljava/io/File;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/unity3d/player/UnityPlayer;->a(Ljava/lang/String;Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected getConnectedJoysticks()[I
    .locals 12

    const/4 v4, 0x0

    #v4=(Null);
    const v11, 0x1000010

    #v11=(Integer);
    const/4 v10, -0x1

    #v10=(Byte);
    const/4 v3, 0x0

    #v3=(Null);
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0x9

    #v1=(PosByte);
    if-ge v0, v1, :cond_0

    move-object v0, v4

    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v4=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    return-object v0

    :cond_0
    :try_start_0
    #v0=(Integer);v1=(PosByte);v2=(Uninit);v4=(Null);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Byte);
    const-string v0, "android.view.InputDevice"

    #v0=(Reference);
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    #v6=(Reference);
    const-string v0, "getDeviceIds"

    const/4 v1, 0x0

    #v1=(Null);
    new-array v1, v1, [Ljava/lang/Class;

    #v1=(Reference);
    invoke-virtual {v6, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    #v1=(Null);
    new-array v1, v1, [Ljava/lang/Object;

    #v1=(Reference);
    invoke-virtual {v0, v6, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    invoke-static {v0}, Ljava/util/Arrays;->sort([I)V

    move v5, v3

    #v5=(Null);
    move v2, v3

    :goto_1
    #v1=(Conflicted);v2=(Integer);v5=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    array-length v1, v0

    #v1=(Integer);
    if-ge v5, v1, :cond_3

    const-string v1, "getDevice"

    #v1=(Reference);
    const/4 v7, 0x1

    #v7=(One);
    new-array v7, v7, [Ljava/lang/Class;

    #v7=(Reference);
    const/4 v8, 0x0

    #v8=(Null);
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    #v9=(Reference);
    aput-object v9, v7, v8

    invoke-virtual {v6, v1, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v7, 0x1

    #v7=(One);
    new-array v7, v7, [Ljava/lang/Object;

    #v7=(Reference);
    const/4 v8, 0x0

    aget v9, v0, v5

    #v9=(Integer);
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    #v9=(Reference);
    aput-object v9, v7, v8

    invoke-virtual {v1, v6, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    const-string v8, "getSources"

    #v8=(Reference);
    const/4 v9, 0x0

    #v9=(Null);
    new-array v9, v9, [Ljava/lang/Class;

    #v9=(Reference);
    invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    const/4 v8, 0x0

    #v8=(Null);
    new-array v8, v8, [Ljava/lang/Object;

    #v8=(Reference);
    invoke-virtual {v7, v1, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    #v1=(Integer);
    and-int/2addr v1, v11

    if-ne v1, v11, :cond_1

    add-int/lit8 v1, v2, 0x1

    :goto_2
    add-int/lit8 v2, v5, 0x1

    move v5, v2

    move v2, v1

    goto :goto_1

    :cond_1
    const/4 v1, -0x1

    #v1=(Byte);
    aput v1, v0, v5

    move v1, v2

    #v1=(Integer);
    goto :goto_2

    :cond_2
    #v1=(Reference);v8=(Null);
    const/4 v1, -0x1

    #v1=(Byte);
    aput v1, v0, v5

    move v1, v2

    #v1=(Integer);
    goto :goto_2

    :cond_3
    #v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    new-array v5, v2, [I

    #v5=(Reference);
    move v6, v3

    #v6=(Null);
    move v2, v3

    :goto_3
    #v6=(Integer);
    array-length v1, v0

    if-ge v6, v1, :cond_4

    aget v1, v0, v6

    if-eq v1, v10, :cond_8

    add-int/lit8 v1, v2, 0x1

    aget v7, v0, v6

    #v7=(Integer);
    aput v7, v5, v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_4
    #v7=(Conflicted);
    add-int/lit8 v2, v6, 0x1

    move v6, v2

    move v2, v1

    goto :goto_3

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v0, v4

    #v0=(Null);
    goto/16 :goto_0

    :cond_4
    #v0=(Reference);v1=(Integer);v2=(Integer);v5=(Reference);v6=(Integer);
    new-instance v0, Ljava/util/LinkedHashMap;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->U:Ljava/util/LinkedHashMap;

    array-length v4, v5

    #v4=(Integer);
    move v2, v3

    #v2=(Null);
    move v0, v3

    :goto_5
    #v0=(Integer);v2=(Integer);v6=(Conflicted);v10=(Conflicted);
    if-ge v2, v4, :cond_7

    aget v6, v5, v2

    #v6=(Integer);
    invoke-virtual {p0, v6}, Lcom/unity3d/player/UnityPlayer;->getJoystickAxes(I)[I

    move-result-object v7

    #v7=(Reference);
    if-eqz v7, :cond_6

    array-length v1, v7

    add-int/lit8 v1, v1, 0x1

    new-array v8, v1, [Ljava/lang/Integer;

    #v8=(Reference);
    add-int/lit8 v1, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    #v0=(Reference);
    aput-object v0, v8, v3

    move v0, v3

    :goto_6
    #v0=(Integer);
    array-length v9, v7

    #v9=(Integer);
    if-ge v0, v9, :cond_5

    add-int/lit8 v9, v0, 0x1

    aget v10, v7, v0

    #v10=(Integer);
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    #v10=(Reference);
    aput-object v10, v8, v9

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_5
    #v10=(Conflicted);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->U:Ljava/util/LinkedHashMap;

    #v0=(Reference);
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    #v6=(Reference);
    invoke-virtual {v0, v6, v8}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v0, v1

    :cond_6
    #v0=(Integer);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_5

    :cond_7
    #v7=(Conflicted);
    move-object v0, v5

    #v0=(Reference);
    goto/16 :goto_0

    :cond_8
    #v4=(Null);v6=(Integer);v10=(Byte);
    move v1, v2

    goto :goto_4
.end method

.method protected getDeviceOrientation()I
    .locals 8

    const/4 v7, 0x2

    #v7=(PosByte);
    const/16 v4, 0x9

    #v4=(PosByte);
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v1, 0x1

    #v1=(One);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->l:Landroid/view/WindowManager;

    #v0=(Reference);
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getOrientation()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {p0}, Lcom/unity3d/player/UnityPlayer;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    #v0=(Integer);
    if-ne v0, v7, :cond_1

    move v0, v1

    :goto_0
    #v0=(Boolean);
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    #v3=(Integer);
    if-lt v3, v4, :cond_2

    const/16 v3, 0x8

    :goto_1
    #v3=(PosByte);
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    #v6=(Integer);
    if-lt v6, v4, :cond_3

    :goto_2
    if-nez v5, :cond_4

    if-eqz v0, :cond_0

    move v1, v2

    :cond_0
    :goto_3
    #v1=(PosByte);v2=(PosByte);
    return v1

    :cond_1
    #v0=(Integer);v1=(One);v2=(Null);v3=(Uninit);v6=(Uninit);
    move v0, v2

    #v0=(Null);
    goto :goto_0

    :cond_2
    #v0=(Boolean);v3=(Integer);
    move v3, v2

    #v3=(Null);
    goto :goto_1

    :cond_3
    #v3=(PosByte);v6=(Integer);
    move v4, v1

    #v4=(One);
    goto :goto_2

    :cond_4
    #v4=(PosByte);
    if-ne v5, v1, :cond_6

    if-eqz v0, :cond_5

    move v1, v2

    #v1=(Null);
    goto :goto_3

    :cond_5
    #v1=(One);
    move v1, v4

    #v1=(PosByte);
    goto :goto_3

    :cond_6
    #v1=(One);
    if-ne v5, v7, :cond_8

    if-eqz v0, :cond_7

    move v1, v3

    #v1=(PosByte);
    goto :goto_3

    :cond_7
    #v1=(One);
    move v1, v4

    #v1=(PosByte);
    goto :goto_3

    :cond_8
    #v1=(One);
    const/4 v2, 0x3

    #v2=(PosByte);
    if-ne v5, v2, :cond_0

    if-eqz v0, :cond_0

    move v1, v4

    #v1=(PosByte);
    goto :goto_3
.end method

.method protected getDeviceUniqueIdentifier()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->B:Ljava/lang/String;

    #v0=(Reference);
    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    const-string v1, "phone"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/ContextWrapper;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->B:Ljava/lang/String;

    :cond_0
    #v1=(Conflicted);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->B:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    #v1=(Integer);
    if-eqz v1, :cond_1

    :goto_0
    #v1=(Conflicted);
    return-object v0

    :catch_0
    move-exception v0

    #v0=(Reference);
    const/4 v0, 0x5

    #v0=(PosByte);
    const-string v1, "android.permission.READ_PHONE_STATE not available?"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/unity3d/player/f;->Log(ILjava/lang/String;)V

    :cond_1
    #v0=(Conflicted);v1=(Conflicted);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "android_id"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method protected getFilesDir()Ljava/lang/String;
    .locals 2

    const-string v0, "/files"

    #v0=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/unity3d/player/UnityPlayer;->a(Ljava/lang/String;Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected getGyroUpdateDelay()I
    .locals 1

    iget v0, p0, Lcom/unity3d/player/UnityPlayer;->Z:I

    #v0=(Integer);
    return v0
.end method

.method protected getInternetReachability()I
    .locals 3

    const/4 v1, 0x0

    :try_start_0
    #v1=(Null);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->C:Landroid/net/NetworkInfo;

    #v0=(Reference);
    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    const-string v2, "connectivity"

    #v2=(Reference);
    invoke-virtual {v0, v2}, Landroid/content/ContextWrapper;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->C:Landroid/net/NetworkInfo;

    :cond_0
    #v2=(Conflicted);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->C:Landroid/net/NetworkInfo;

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    #v0=(Integer);
    return v0

    :cond_1
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_2

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_2
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    #v0=(Integer);
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    const/4 v0, 0x5

    #v0=(PosByte);
    const-string v2, "android.permission.ACCESS_NETWORK_STATE not available?"

    #v2=(Reference);
    invoke-static {v0, v2}, Lcom/unity3d/player/f;->Log(ILjava/lang/String;)V

    move v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method protected getIsGyroAvailable()Z
    .locals 2

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.sensor.gyroscope"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method protected getIsGyroEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->W:Z

    #v0=(Boolean);
    return v0
.end method

.method protected getJoystickAxes(I)[I
    .locals 11

    const v10, 0x1000010

    #v10=(Integer);
    const/4 v1, 0x0

    #v1=(Null);
    const/4 v2, 0x0

    #v2=(Null);
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v3, 0x9

    #v3=(PosByte);
    if-ge v0, v3, :cond_0

    :goto_0
    #v0=(Conflicted);v1=(Reference);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    return-object v1

    :cond_0
    :try_start_0
    #v0=(Integer);v1=(Null);v2=(Null);v3=(PosByte);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    const-string v0, "android.view.InputDevice"

    #v0=(Reference);
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v3, "getDevice"

    #v3=(Reference);
    const/4 v4, 0x1

    #v4=(One);
    new-array v4, v4, [Ljava/lang/Class;

    #v4=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    #v6=(Reference);
    aput-object v6, v4, v5

    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/4 v4, 0x1

    #v4=(One);
    new-array v4, v4, [Ljava/lang/Object;

    #v4=(Reference);
    const/4 v5, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-virtual {v3, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-string v4, "getMotionRanges"

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Class;

    #v5=(Reference);
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/4 v4, 0x0

    #v4=(Null);
    new-array v4, v4, [Ljava/lang/Object;

    #v4=(Reference);
    invoke-virtual {v3, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    #v3=(Integer);
    new-array v5, v3, [I

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v3, v2

    :cond_1
    :goto_1
    #v0=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    #v7=(Reference);
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    #v0=(Reference);
    const-string v4, "getSource"

    #v4=(Reference);
    const/4 v8, 0x0

    #v8=(Null);
    new-array v8, v8, [Ljava/lang/Class;

    #v8=(Reference);
    invoke-virtual {v0, v4, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v4, 0x0

    #v4=(Null);
    new-array v4, v4, [Ljava/lang/Object;

    #v4=(Reference);
    invoke-virtual {v0, v7, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    #v0=(Integer);
    and-int/2addr v0, v10

    if-ne v0, v10, :cond_1

    add-int/lit8 v4, v3, 0x1

    #v4=(Integer);
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    #v0=(Reference);
    const-string v8, "getAxis"

    const/4 v9, 0x0

    #v9=(Null);
    new-array v9, v9, [Ljava/lang/Class;

    #v9=(Reference);
    invoke-virtual {v0, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v8, 0x0

    #v8=(Null);
    new-array v8, v8, [Ljava/lang/Object;

    #v8=(Reference);
    invoke-virtual {v0, v7, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    #v0=(Integer);
    aput v0, v5, v3

    move v3, v4

    goto :goto_1

    :cond_2
    #v0=(Boolean);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    new-array v0, v3, [I

    :goto_2
    #v0=(Reference);v2=(Integer);
    if-ge v2, v3, :cond_3

    aget v4, v5, v2

    #v4=(Integer);
    aput v4, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    #v4=(Conflicted);
    invoke-static {v0}, Ljava/util/Arrays;->sort([I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_3
    #v3=(Conflicted);
    move-object v1, v0

    #v1=(Reference);
    goto/16 :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Null);v5=(Conflicted);v6=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_0

    :cond_4
    #v2=(Null);v3=(Reference);v4=(Reference);v5=(Null);v6=(Reference);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    move-object v0, v1

    #v0=(Null);
    goto :goto_3
.end method

.method protected getJoystickName(I)Ljava/lang/String;
    .locals 6

    const/4 v1, 0x0

    #v1=(Null);
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v2, 0x9

    #v2=(PosByte);
    if-ge v0, v2, :cond_0

    :goto_0
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-object v1

    :cond_0
    :try_start_0
    #v0=(Integer);v1=(Null);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    const-string v0, "android.view.InputDevice"

    #v0=(Reference);
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v2, "getDevice"

    #v2=(Reference);
    const/4 v3, 0x1

    #v3=(One);
    new-array v3, v3, [Ljava/lang/Class;

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    #v5=(Reference);
    aput-object v5, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v3, 0x1

    #v3=(One);
    new-array v3, v3, [Ljava/lang/Object;

    #v3=(Reference);
    const/4 v4, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "getName"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Class;

    #v4=(Reference);
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v3, 0x0

    #v3=(Null);
    new-array v3, v3, [Ljava/lang/Object;

    #v3=(Reference);
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    move-object v1, v0

    #v1=(Reference);
    goto :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Null);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :cond_1
    #v2=(Reference);v3=(Reference);v4=(Null);v5=(Reference);
    move-object v0, v1

    #v0=(Null);
    goto :goto_1
.end method

.method protected getNumCameras()I
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->d:Lcom/unity3d/player/e;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->d:Lcom/unity3d/player/e;

    invoke-interface {v0}, Lcom/unity3d/player/e;->a()I

    move-result v0

    :goto_0
    #v0=(Integer);
    return v0

    :cond_0
    #v0=(Reference);
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method

.method protected getOrientation()I
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    instance-of v0, v0, Landroid/app/Activity;

    #v0=(Boolean);
    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Integer);
    return v0

    :cond_0
    #v0=(Boolean);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getRequestedOrientation()I

    move-result v0

    #v0=(Integer);
    goto :goto_0
.end method

.method protected getPackageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getPackageName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected getScreenDPI()F
    .locals 2

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    instance-of v0, v0, Landroid/app/Activity;

    #v0=(Boolean);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Float);v1=(Conflicted);
    return v0

    :cond_0
    #v0=(Boolean);v1=(Uninit);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    check-cast v0, Landroid/app/Activity;

    new-instance v1, Landroid/util/DisplayMetrics;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    #v1=(Reference);
    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    iget v0, v1, Landroid/util/DisplayMetrics;->xdpi:F

    #v0=(Integer);
    iget v1, v1, Landroid/util/DisplayMetrics;->ydpi:F

    #v1=(Integer);
    add-float/2addr v0, v1

    #v0=(Float);
    const/high16 v1, 0x3f00

    mul-float/2addr v0, v1

    goto :goto_0
.end method

.method protected getScreenTimeout()I
    .locals 3

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "screen_off_timeout"

    #v1=(Reference);
    const/16 v2, 0x3a98

    #v2=(PosShort);
    invoke-static {v0, v1, v2}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    #v0=(Integer);
    div-int/lit16 v0, v0, 0x3e8

    return v0
.end method

.method public getSettings()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->H:Landroid/os/Bundle;

    #v0=(Reference);
    return-object v0
.end method

.method protected getTotalMemory()I
    .locals 1

    sget-object v0, Lcom/unity3d/player/UnityPlayer;->Q:Lcom/unity3d/player/b;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/unity3d/player/b;->c()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method protected hasWakeLock()Z
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->j:Landroid/os/PowerManager$WakeLock;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method protected hideSoftInput()V
    .locals 1

    new-instance v0, Lcom/unity3d/player/UnityPlayer$9;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/unity3d/player/UnityPlayer$9;-><init>(Lcom/unity3d/player/UnityPlayer;)V

    #v0=(Reference);
    invoke-direct {p0, v0}, Lcom/unity3d/player/UnityPlayer;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public init(IZ)V
    .locals 4

    const/4 v3, 0x0

    #v3=(Null);
    sget-boolean v0, Lcom/unity3d/player/UnityPlayer;->o:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    new-instance v0, Landroid/app/AlertDialog$Builder;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v1=(Reference);
    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    const-string v1, "Failure to initialize!"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "OK"

    new-instance v2, Lcom/unity3d/player/UnityPlayer$1;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Lcom/unity3d/player/UnityPlayer$1;-><init>(Lcom/unity3d/player/UnityPlayer;)V

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "Your hardware does not support this application, sorry!"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog;->setCancelable(Z)V

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    #v0=(Reference);
    const-string v1, "samsung"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0x8

    #v1=(PosByte);
    if-ge v0, v1, :cond_1

    sget-object v0, Lcom/unity3d/player/UnityPlayer;->Q:Lcom/unity3d/player/b;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/unity3d/player/b;->a()I

    move-result v0

    #v0=(Integer);
    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_1

    sput-boolean v3, Lcom/unity3d/player/UnityPlayer;->o:Z

    new-instance v0, Landroid/app/AlertDialog$Builder;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v1=(Reference);
    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    const-string v1, "Old Android OS detected!"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "OK"

    new-instance v2, Lcom/unity3d/player/UnityPlayer$16;

    #v2=(UninitRef);
    invoke-direct {v2, p0, p1, p2}, Lcom/unity3d/player/UnityPlayer$16;-><init>(Lcom/unity3d/player/UnityPlayer;IZ)V

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "This application requires at least Android OS version 2.2 on Samsung devices. Your device seems to be running an older OS version.\nPlease contact your carrier or the hardware vendor and ask them how to install a more recent version. It is a simple process that your provider\'s customer service can help you with."

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog;->setCancelable(Z)V

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto :goto_0

    :cond_1
    #v0=(Integer);v1=(Conflicted);v2=(Uninit);
    invoke-direct {p0, p1, p2}, Lcom/unity3d/player/UnityPlayer;->a(IZ)V

    goto :goto_0
.end method

.method protected initCamera(IIII)[I
    .locals 4

    :try_start_0
    new-instance v1, Lcom/unity3d/player/a;

    #v1=(UninitRef);
    invoke-direct {v1, p1, p2, p3, p4}, Lcom/unity3d/player/a;-><init>(IIII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    #v1=(Reference);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->I:Ljava/util/Map;

    #v0=(Reference);
    invoke-virtual {v1}, Lcom/unity3d/player/a;->a()Landroid/hardware/Camera;

    move-result-object v2

    #v2=(Reference);
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, p0}, Lcom/unity3d/player/a;->a(Landroid/hardware/Camera$PreviewCallback;)V

    invoke-virtual {v1}, Lcom/unity3d/player/a;->a()Landroid/hardware/Camera;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V

    const/4 v0, 0x2

    #v0=(PosByte);
    new-array v0, v0, [I

    #v0=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v1}, Lcom/unity3d/player/a;->c()I

    move-result v3

    #v3=(Integer);
    aput v3, v0, v2

    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v1}, Lcom/unity3d/player/a;->d()I

    move-result v1

    #v1=(Integer);
    aput v1, v0, v2

    :goto_0
    #v2=(Conflicted);v3=(Conflicted);
    return-object v0

    :catch_0
    move-exception v0

    #v0=(Reference);
    const/4 v1, 0x6

    #v1=(PosByte);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "Camera failed to open: "

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/unity3d/player/f;->Log(ILjava/lang/String;)V

    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method protected isCameraFrontFacing(I)Z
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->d:Lcom/unity3d/player/e;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->d:Lcom/unity3d/player/e;

    invoke-interface {v0, p1}, Lcom/unity3d/player/e;->a(I)Z

    move-result v0

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method protected isCompassAvailable()Z
    .locals 2

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.sensor.compass"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method protected isCompassEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->aa:Z

    #v0=(Boolean);
    return v0
.end method

.method protected loadLibrary(Ljava/lang/String;)Z
    .locals 5

    const/4 v4, 0x6

    #v4=(PosByte);
    const/4 v0, 0x0

    :try_start_0
    #v0=(Null);
    invoke-static {p1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return v0

    :catch_0
    #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    move-exception v1

    #v1=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "Unable to find "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lcom/unity3d/player/f;->Log(ILjava/lang/String;)V

    goto :goto_0

    :catch_1
    #v1=(Uninit);v2=(Uninit);
    move-exception v1

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "Unknown error "

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lcom/unity3d/player/f;->Log(ILjava/lang/String;)V

    goto :goto_0
.end method

.method final native nativeAttitude(FFFFJ)V
.end method

.method final native nativeCompass(FFFFFD)V
.end method

.method final native nativeDeviceOrientation(I)V
.end method

.method final native nativeForwardEventsToDalvik(Z)V
.end method

.method final native nativeGravity(FFFJ)V
.end method

.method final native nativeGyro(FFFJ)V
.end method

.method final native nativeJoystickRemoved()V
.end method

.method final native nativeLinearAcc(FFFJ)V
.end method

.method final native nativeSensor(FFFJ)V
.end method

.method protected native nativeSetLocation(FFFFD)V
.end method

.method protected native nativeSetLocationStatus(I)V
.end method

.method public onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 9

    const/4 v2, 0x0

    #v2=(Null);
    const/4 v3, 0x1

    #v3=(One);
    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->w:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Null);v3=(One);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->G:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->D:Lcom/unity3d/player/a/e;

    #v0=(Reference);
    if-nez v0, :cond_2

    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayer;->nativeGetGLContext()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Ljava/lang/String;

    #v1=(UninitRef);
    const-string v4, "android.opengl.GLSurfaceView$GLWrapper"

    #v4=(Reference);
    invoke-direct {v1, v4}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    new-instance v4, Lcom/unity3d/player/a/i;

    #v4=(UninitRef);
    iget-object v5, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v5=(Reference);
    new-instance v6, Lcom/unity3d/player/a/a;

    #v6=(UninitRef);
    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    iget-object v7, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v7=(Reference);
    invoke-virtual {v7}, Landroid/content/ContextWrapper;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayer;->nativeGetGLScreen()Ljava/lang/String;

    move-result-object v8

    #v8=(Reference);
    invoke-direct {v6, v1, v7, v8}, Lcom/unity3d/player/a/a;-><init>([BLjava/lang/String;Ljava/lang/String;)V

    #v6=(Reference);
    invoke-direct {v4, v5, v6}, Lcom/unity3d/player/a/i;-><init>(Landroid/content/Context;Lcom/unity3d/player/a/h;)V

    :try_start_0
    #v4=(Reference);
    new-instance v1, Lcom/unity3d/player/a/e;

    #v1=(UninitRef);
    iget-object v5, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    invoke-direct {v1, v5, v4, v0}, Lcom/unity3d/player/a/e;-><init>(Landroid/content/Context;Lcom/unity3d/player/a/i;Ljava/lang/String;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/unity3d/player/UnityPlayer;->D:Lcom/unity3d/player/a/e;

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->D:Lcom/unity3d/player/a/e;

    new-instance v1, Lcom/unity3d/player/UnityPlayer$2;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/unity3d/player/UnityPlayer$2;-><init>(Lcom/unity3d/player/UnityPlayer;)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/unity3d/player/a/e;->a(Lcom/unity3d/player/a/f;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayer;->nativeRender()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_3

    iput-boolean v3, p0, Lcom/unity3d/player/UnityPlayer;->w:Z

    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayer;->c()V

    goto :goto_0

    :catch_0
    #v0=(Reference);v4=(Reference);v5=(Reference);v6=(Reference);v7=(Reference);v8=(Reference);
    move-exception v0

    iput-boolean v3, p0, Lcom/unity3d/player/UnityPlayer;->G:Z

    goto :goto_1

    :cond_3
    #v0=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    iget v0, p0, Lcom/unity3d/player/UnityPlayer;->A:I

    #v0=(Integer);
    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/unity3d/player/UnityPlayer;->A:I

    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->q:Z

    #v0=(Boolean);
    if-nez v0, :cond_5

    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->r:Z

    if-eqz v0, :cond_4

    iput-boolean v2, p0, Lcom/unity3d/player/UnityPlayer;->r:Z

    goto :goto_0

    :cond_4
    const-string v0, "assets/bin/"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    iget-object v4, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/content/ContextWrapper;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v4

    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "/lib"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/unity3d/player/UnityPlayer;->unityAndroidInit(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean v3, p0, Lcom/unity3d/player/UnityPlayer;->q:Z

    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayer;->unityAndroidPrepareGameLoop()V

    iget v0, p0, Lcom/unity3d/player/UnityPlayer;->s:I

    #v0=(Integer);
    iget v1, p0, Lcom/unity3d/player/UnityPlayer;->t:I

    #v1=(Integer);
    iget v4, p0, Lcom/unity3d/player/UnityPlayer;->s:I

    #v4=(Integer);
    iget v5, p0, Lcom/unity3d/player/UnityPlayer;->t:I

    #v5=(Integer);
    invoke-direct {p0, v0, v1, v4, v5}, Lcom/unity3d/player/UnityPlayer;->nativeResize(IIII)V

    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayer;->nativeResume()V

    invoke-virtual {p0, v3}, Lcom/unity3d/player/UnityPlayer;->windowFocusChanged(Z)V

    :cond_5
    #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    #v0=(Reference);
    instance-of v0, v0, Lcom/unity3d/player/q;

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/unity3d/player/UnityPlayer;->canUse32bitDisplayBuffer()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayer;->nativeRequested32bitDisplayBuffer()Z

    move-result v0

    move v1, v0

    :goto_2
    #v1=(Boolean);
    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayer;->nativeRequestedAA()I

    move-result v0

    #v0=(Integer);
    iget v4, p0, Lcom/unity3d/player/UnityPlayer;->x:I

    #v4=(Integer);
    if-eq v4, v0, :cond_6

    iput v0, p0, Lcom/unity3d/player/UnityPlayer;->x:I

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    #v0=(Reference);
    check-cast v0, Lcom/unity3d/player/q;

    iget v2, p0, Lcom/unity3d/player/UnityPlayer;->x:I

    #v2=(Integer);
    invoke-virtual {v0, v2}, Lcom/unity3d/player/q;->a(I)V

    move v2, v3

    :cond_6
    #v0=(Conflicted);v2=(Boolean);
    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->y:Z

    #v0=(Boolean);
    if-eq v0, v1, :cond_8

    iput-boolean v1, p0, Lcom/unity3d/player/UnityPlayer;->y:Z

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    #v0=(Reference);
    check-cast v0, Lcom/unity3d/player/q;

    iget-boolean v1, p0, Lcom/unity3d/player/UnityPlayer;->y:Z

    invoke-virtual {v0, v1}, Lcom/unity3d/player/q;->a(Z)V

    :goto_3
    #v0=(Conflicted);v3=(Boolean);
    if-eqz v3, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->M:Ljava/lang/Runnable;

    #v0=(Reference);
    invoke-direct {p0, v0}, Lcom/unity3d/player/UnityPlayer;->a(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    :cond_7
    #v0=(Boolean);v1=(Conflicted);v2=(Null);v3=(One);v4=(Conflicted);
    move v1, v2

    #v1=(Null);
    goto :goto_2

    :cond_8
    #v1=(Boolean);v2=(Boolean);v4=(Integer);
    move v3, v2

    #v3=(Boolean);
    goto :goto_3
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/unity3d/player/UnityPlayer;->a(ILandroid/view/KeyEvent;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public onKeyPreIme(ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->c:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const/4 v0, 0x4

    #v0=(PosByte);
    if-ne p1, v0, :cond_0

    invoke-direct {p0, p1, p2}, Lcom/unity3d/player/UnityPlayer;->a(ILandroid/view/KeyEvent;)Z

    move-result v0

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(PosByte);
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onKeyPreIme(ILandroid/view/KeyEvent;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/unity3d/player/UnityPlayer;->a(ILandroid/view/KeyEvent;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method protected onNativeKey(JJIIIIIIIIZ)Z
    .locals 13

    new-instance v1, Landroid/view/KeyEvent;

    #v1=(UninitRef);
    move-wide v2, p1

    #v2=(LongLo);v3=(LongHi);
    move-wide/from16 v4, p3

    #v4=(LongLo);v5=(LongHi);
    move/from16 v6, p5

    #v6=(Integer);
    move/from16 v7, p6

    #v7=(Integer);
    move/from16 v8, p7

    #v8=(Integer);
    move/from16 v9, p8

    #v9=(Integer);
    move/from16 v10, p9

    #v10=(Integer);
    move/from16 v11, p10

    #v11=(Integer);
    move/from16 v12, p11

    #v12=(Integer);
    invoke-direct/range {v1 .. v12}, Landroid/view/KeyEvent;-><init>(JJIIIIIII)V

    #v1=(Reference);
    move/from16 v0, p6

    #v0=(Integer);
    invoke-direct {p0, v0, v1}, Lcom/unity3d/player/UnityPlayer;->a(ILandroid/view/KeyEvent;)Z

    move-result v1

    #v1=(Boolean);
    return v1
.end method

.method public onPreviewFrame([BLandroid/hardware/Camera;)V
    .locals 7

    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->w:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->I:Ljava/util/Map;

    #v0=(Reference);
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    #v6=(Reference);
    check-cast v6, Lcom/unity3d/player/a;

    if-eqz v6, :cond_0

    invoke-virtual {v6}, Lcom/unity3d/player/a;->c()I

    move-result v4

    #v4=(Integer);
    invoke-virtual {v6}, Lcom/unity3d/player/a;->d()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v6}, Lcom/unity3d/player/a;->e()I

    move-result v2

    #v2=(Integer);
    new-instance v0, Lcom/unity3d/player/UnityPlayer$11;

    #v0=(UninitRef);
    move-object v1, p0

    #v1=(Reference);
    move-object v3, p1

    #v3=(Reference);
    invoke-direct/range {v0 .. v5}, Lcom/unity3d/player/UnityPlayer$11;-><init>(Lcom/unity3d/player/UnityPlayer;I[BII)V

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/unity3d/player/UnityPlayer;->queueEvent(Ljava/lang/Runnable;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0x8

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    invoke-virtual {v6}, Lcom/unity3d/player/a;->b()[B

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p2, v0}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    goto :goto_0
.end method

.method public onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 4

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    #v0=(Reference);
    instance-of v0, v0, Landroid/view/SurfaceView;

    #v0=(Boolean);
    if-eqz v0, :cond_2

    iget v0, p0, Lcom/unity3d/player/UnityPlayer;->u:I

    #v0=(Integer);
    if-nez v0, :cond_0

    iget v0, p0, Lcom/unity3d/player/UnityPlayer;->v:I

    if-eqz v0, :cond_2

    :cond_0
    iget v0, p0, Lcom/unity3d/player/UnityPlayer;->u:I

    if-ne v0, p2, :cond_1

    iget v0, p0, Lcom/unity3d/player/UnityPlayer;->v:I

    if-eq v0, p3, :cond_2

    :cond_1
    iget v0, p0, Lcom/unity3d/player/UnityPlayer;->u:I

    iget v1, p0, Lcom/unity3d/player/UnityPlayer;->v:I

    #v1=(Integer);
    invoke-virtual {p0, v0, v1}, Lcom/unity3d/player/UnityPlayer;->setScreenSize(II)V

    :cond_2
    #v1=(Conflicted);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    #v0=(Reference);
    instance-of v0, v0, Landroid/view/View;

    #v0=(Boolean);
    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    #v0=(Reference);
    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    #v1=(Integer);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    :goto_0
    #v0=(Integer);
    iput p2, p0, Lcom/unity3d/player/UnityPlayer;->s:I

    iput p3, p0, Lcom/unity3d/player/UnityPlayer;->t:I

    invoke-direct {p0, p2, p3, v1, v0}, Lcom/unity3d/player/UnityPlayer;->nativeResize(IIII)V

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    instance-of v0, v0, Landroid/app/Activity;

    #v0=(Boolean);
    if-eqz v0, :cond_4

    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0}, Lcom/unity3d/player/UnityPlayer;->getSettings()Landroid/os/Bundle;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "hide_status_bar"

    #v2=(Reference);
    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_3

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    check-cast v0, Landroid/app/Activity;

    new-instance v1, Landroid/graphics/Rect;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    #v1=(Reference);
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    iget v0, v1, Landroid/graphics/Rect;->top:I

    #v0=(Integer);
    int-to-float v0, v0

    :cond_3
    #v0=(Float);v1=(Conflicted);
    invoke-direct {p0, v0}, Lcom/unity3d/player/UnityPlayer;->nativeSetTouchDeltaY(F)V

    :cond_4
    #v2=(Conflicted);v3=(Conflicted);
    return-void

    :cond_5
    #v0=(Boolean);v2=(Uninit);v3=(Uninit);
    move v0, p3

    #v0=(Integer);
    move v1, p2

    #v1=(Integer);
    goto :goto_0
.end method

.method public onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 0

    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayer;->nativeRecreateGfxState()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 14

    const/4 v9, 0x1

    #v9=(One);
    const/4 v11, 0x0

    #v11=(Null);
    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->q:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    move v0, v9

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    return v0

    :cond_0
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v10=(Uninit);v12=(Uninit);v13=(Uninit);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->d:Lcom/unity3d/player/e;

    #v0=(Reference);
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->d:Lcom/unity3d/player/e;

    invoke-interface {v0, p1}, Lcom/unity3d/player/e;->a(Landroid/view/MotionEvent;)I

    move-result v8

    :goto_1
    #v8=(Integer);
    const/16 v0, 0x2002

    #v0=(PosShort);
    if-ne v8, v0, :cond_2

    invoke-direct {p0, p1}, Lcom/unity3d/player/UnityPlayer;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0

    :cond_1
    #v0=(Reference);v8=(Uninit);
    const/16 v8, 0x1002

    #v8=(PosShort);
    goto :goto_1

    :cond_2
    #v0=(PosShort);v8=(Integer);
    const v0, 0x1000010

    #v0=(Integer);
    if-ne v8, v0, :cond_3

    invoke-direct {p0, p1}, Lcom/unity3d/player/UnityPlayer;->b(Landroid/view/MotionEvent;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0

    :cond_3
    #v0=(Integer);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v12

    #v12=(Integer);
    move v1, v11

    :goto_2
    #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v10=(Conflicted);v13=(Conflicted);
    if-ge v1, v12, :cond_5

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v3

    #v3=(Integer);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result v13

    #v13=(Integer);
    move v10, v11

    :goto_3
    #v10=(Integer);
    if-ge v10, v13, :cond_4

    const/4 v2, 0x2

    #v2=(PosByte);
    invoke-virtual {p1, v1, v10}, Landroid/view/MotionEvent;->getHistoricalX(II)F

    move-result v4

    #v4=(Float);
    invoke-virtual {p1, v1, v10}, Landroid/view/MotionEvent;->getHistoricalY(II)F

    move-result v5

    #v5=(Float);
    invoke-virtual {p1, v10}, Landroid/view/MotionEvent;->getHistoricalEventTime(I)J

    move-result-wide v6

    #v6=(LongLo);v7=(LongHi);
    move-object v0, p0

    #v0=(Reference);
    invoke-virtual/range {v0 .. v8}, Lcom/unity3d/player/UnityPlayer;->dispatchTouchEvent(IIIFFJI)Z

    add-int/lit8 v0, v10, 0x1

    #v0=(Integer);
    move v10, v0

    goto :goto_3

    :cond_4
    #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    #v4=(Float);
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v5

    #v5=(Float);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v6

    #v6=(LongLo);v7=(LongHi);
    move-object v0, p0

    #v0=(Reference);
    invoke-virtual/range {v0 .. v8}, Lcom/unity3d/player/UnityPlayer;->dispatchTouchEvent(IIIFFJI)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_5
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v10=(Conflicted);v13=(Conflicted);
    move v0, v9

    #v0=(One);
    goto :goto_0
.end method

.method protected openURL(Ljava/lang/String;)V
    .locals 4

    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    const-string v1, "android.intent.action.VIEW"

    #v1=(Reference);
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {v1}, Landroid/net/Uri;->isRelative()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    new-instance v1, Ljava/io/File;

    #v1=(UninitRef);
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v2

    #v2=(Reference);
    invoke-static {p1}, Landroid/webkit/MimeTypeMap;->getFileExtensionFromUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v2, v3}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Landroid/content/ContextWrapper;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public pause()V
    .locals 5

    const/4 v4, 0x0

    #v4=(Null);
    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->J:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    sget-boolean v0, Lcom/unity3d/player/UnityPlayer;->o:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->J:Z

    iput-boolean v4, p0, Lcom/unity3d/player/UnityPlayer;->K:Z

    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->w:Z

    #v0=(Boolean);
    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->I:Ljava/util/Map;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    #v1=(Reference);
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/unity3d/player/a;

    invoke-virtual {v0}, Lcom/unity3d/player/a;->f()V

    goto :goto_1

    :cond_2
    #v0=(Boolean);v1=(Conflicted);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->m:Lorg/fmod/FMODAudioDevice;

    #v0=(Reference);
    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->m:Lorg/fmod/FMODAudioDevice;

    invoke-virtual {v0}, Lorg/fmod/FMODAudioDevice;->stop()V

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->m:Lorg/fmod/FMODAudioDevice;

    :cond_3
    #v0=(Reference);
    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->q:Z

    #v0=(Boolean);
    if-eqz v0, :cond_4

    new-instance v0, Ljava/util/concurrent/Semaphore;

    #v0=(UninitRef);
    invoke-direct {v0, v4}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    #v0=(Reference);
    iget-boolean v1, p0, Lcom/unity3d/player/UnityPlayer;->w:Z

    #v1=(Boolean);
    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    #v1=(Reference);
    new-instance v2, Lcom/unity3d/player/UnityPlayer$20;

    #v2=(UninitRef);
    invoke-direct {v2, p0, v0}, Lcom/unity3d/player/UnityPlayer$20;-><init>(Lcom/unity3d/player/UnityPlayer;Ljava/util/concurrent/Semaphore;)V

    #v2=(Reference);
    invoke-interface {v1, v2}, Lcom/unity3d/player/UnityGL;->queueEvent(Ljava/lang/Runnable;)V

    :goto_2
    const-wide/16 v1, 0xa

    :try_start_0
    #v1=(LongLo);v2=(LongHi);
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    #v3=(Reference);
    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_3
    #v1=(Conflicted);v3=(Conflicted);
    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->drainPermits()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_4

    invoke-virtual {p0}, Lcom/unity3d/player/UnityPlayer;->quit()V

    :cond_4
    #v2=(Conflicted);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->V:Landroid/content/BroadcastReceiver;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/ContextWrapper;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    instance-of v0, v0, Lcom/unity3d/player/q;

    #v0=(Boolean);
    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    #v0=(Reference);
    check-cast v0, Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/unity3d/player/UnityPlayer;->removeView(Landroid/view/View;)V

    :cond_5
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    #v0=(Reference);
    invoke-interface {v0}, Lcom/unity3d/player/UnityGL;->onPause()V

    invoke-virtual {p0, v4}, Lcom/unity3d/player/UnityPlayer;->setWakeLock(Z)V

    invoke-direct {p0, v4}, Lcom/unity3d/player/UnityPlayer;->a(Z)V

    invoke-direct {p0, v4}, Lcom/unity3d/player/UnityPlayer;->b(Z)V

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->z:Lcom/unity3d/player/h;

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->z:Lcom/unity3d/player/h;

    invoke-virtual {v0}, Lcom/unity3d/player/h;->d()V

    goto/16 :goto_0

    :cond_6
    #v1=(Boolean);v2=(Uninit);v3=(Uninit);
    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    #v1=(Reference);
    new-instance v2, Lcom/unity3d/player/UnityPlayer$21;

    #v2=(UninitRef);
    invoke-direct {v2, p0, v0}, Lcom/unity3d/player/UnityPlayer$21;-><init>(Lcom/unity3d/player/UnityPlayer;Ljava/util/concurrent/Semaphore;)V

    #v2=(Reference);
    invoke-interface {v1, v2}, Lcom/unity3d/player/UnityGL;->queueEvent(Ljava/lang/Runnable;)V

    goto :goto_2

    :catch_0
    #v1=(LongLo);v2=(LongHi);v3=(Conflicted);
    move-exception v1

    #v1=(Reference);
    goto :goto_3
.end method

.method protected queueEvent(Ljava/lang/Runnable;)V
    .locals 2

    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->q:Z

    #v0=(Boolean);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);
    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->w:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    #v0=(Reference);
    new-instance v1, Lcom/unity3d/player/UnityPlayer$15;

    #v1=(UninitRef);
    invoke-direct {v1, p0, p1}, Lcom/unity3d/player/UnityPlayer$15;-><init>(Lcom/unity3d/player/UnityPlayer;Ljava/lang/Runnable;)V

    #v1=(Reference);
    invoke-interface {v0, v1}, Lcom/unity3d/player/UnityGL;->queueEvent(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public quit()V
    .locals 1

    sget-boolean v0, Lcom/unity3d/player/UnityPlayer;->o:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/unity3d/player/UnityPlayer;->removeAllViews()V

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    #v0=(Reference);
    invoke-interface {v0}, Lcom/unity3d/player/UnityGL;->a()V

    :cond_0
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->D:Lcom/unity3d/player/a/e;

    #v0=(Reference);
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->D:Lcom/unity3d/player/a/e;

    invoke-virtual {v0}, Lcom/unity3d/player/a/e;->a()V

    :cond_1
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->D:Lcom/unity3d/player/a/e;

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    #v0=(Integer);
    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    return-void
.end method

.method protected reportSoftInputStr(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x1

    #v0=(One);
    if-ne p2, v0, :cond_0

    invoke-virtual {p0}, Lcom/unity3d/player/UnityPlayer;->hideSoftInput()V

    :cond_0
    new-instance v0, Lcom/unity3d/player/UnityPlayer$10;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p1, p2}, Lcom/unity3d/player/UnityPlayer$10;-><init>(Lcom/unity3d/player/UnityPlayer;Ljava/lang/String;I)V

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/unity3d/player/UnityPlayer;->queueEvent(Ljava/lang/Runnable;)V

    return-void
.end method

.method public resume()V
    .locals 6

    const/4 v5, 0x0

    #v5=(Null);
    const/4 v4, 0x1

    #v4=(One);
    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->J:Z

    #v0=(Boolean);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    sget-boolean v0, Lcom/unity3d/player/UnityPlayer;->o:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->J:Z

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->I:Ljava/util/Map;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    #v1=(Reference);
    new-instance v2, Ljava/util/HashMap;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    :goto_1
    #v2=(Reference);v3=(Conflicted);
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/unity3d/player/a;

    invoke-virtual {v0, p0}, Lcom/unity3d/player/a;->b(Landroid/hardware/Camera$PreviewCallback;)V

    invoke-virtual {v0}, Lcom/unity3d/player/a;->a()Landroid/hardware/Camera;

    move-result-object v3

    #v3=(Reference);
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    #v0=(Boolean);v3=(Conflicted);
    iput-object v2, p0, Lcom/unity3d/player/UnityPlayer;->I:Ljava/util/Map;

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    #v0=(Reference);
    invoke-interface {v0}, Lcom/unity3d/player/UnityGL;->onResume()V

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->V:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    #v2=(UninitRef);
    const-string v3, "android.hardware.usb.action.USB_DEVICE_DETACHED"

    #v3=(Reference);
    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/content/ContextWrapper;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/unity3d/player/UnityPlayer;->z:Lcom/unity3d/player/h;

    iget-object v2, p0, Lcom/unity3d/player/UnityPlayer;->k:Landroid/hardware/SensorManager;

    invoke-virtual {v2, v4}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    invoke-virtual {v0, v1, v2, v4}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    invoke-direct {p0, v4}, Lcom/unity3d/player/UnityPlayer;->a(Z)V

    invoke-direct {p0, v4}, Lcom/unity3d/player/UnityPlayer;->b(Z)V

    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayer;->d()V

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->z:Lcom/unity3d/player/h;

    invoke-virtual {v0}, Lcom/unity3d/player/h;->e()V

    iput-object v5, p0, Lcom/unity3d/player/UnityPlayer;->B:Ljava/lang/String;

    iput-object v5, p0, Lcom/unity3d/player/UnityPlayer;->C:Landroid/net/NetworkInfo;

    goto :goto_0
.end method

.method protected setCompassEnabled(Z)V
    .locals 3

    const/4 v1, 0x1

    #v1=(One);
    const/4 v0, 0x0

    #v0=(Null);
    iget-boolean v2, p0, Lcom/unity3d/player/UnityPlayer;->aa:Z

    #v2=(Boolean);
    if-ne v2, p1, :cond_0

    :goto_0
    #v0=(Conflicted);
    return-void

    :cond_0
    #v0=(Null);
    if-eqz p1, :cond_2

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/unity3d/player/UnityPlayer;->isCompassAvailable()Z

    move-result v2

    if-eqz v2, :cond_1

    move v0, v1

    :cond_1
    #v0=(Boolean);
    iput-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->aa:Z

    invoke-direct {p0, v1}, Lcom/unity3d/player/UnityPlayer;->b(Z)V

    goto :goto_0

    :cond_2
    #v0=(Null);
    invoke-direct {p0, v0}, Lcom/unity3d/player/UnityPlayer;->b(Z)V

    iput-boolean p1, p0, Lcom/unity3d/player/UnityPlayer;->aa:Z

    new-instance v0, Lcom/unity3d/player/UnityPlayer$14;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/unity3d/player/UnityPlayer$14;-><init>(Lcom/unity3d/player/UnityPlayer;)V

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/unity3d/player/UnityPlayer;->queueEvent(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method protected setGyroEnabled(Z)V
    .locals 3

    const/4 v1, 0x1

    #v1=(One);
    const/4 v0, 0x0

    #v0=(Null);
    iget-boolean v2, p0, Lcom/unity3d/player/UnityPlayer;->W:Z

    #v2=(Boolean);
    if-ne v2, p1, :cond_0

    :goto_0
    #v0=(Conflicted);
    return-void

    :cond_0
    #v0=(Null);
    if-eqz p1, :cond_2

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/unity3d/player/UnityPlayer;->getIsGyroAvailable()Z

    move-result v2

    if-eqz v2, :cond_1

    move v0, v1

    :cond_1
    #v0=(Boolean);
    iput-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->W:Z

    invoke-direct {p0, v1}, Lcom/unity3d/player/UnityPlayer;->a(Z)V

    goto :goto_0

    :cond_2
    #v0=(Null);
    invoke-direct {p0, v0}, Lcom/unity3d/player/UnityPlayer;->a(Z)V

    iput-boolean p1, p0, Lcom/unity3d/player/UnityPlayer;->W:Z

    new-instance v0, Lcom/unity3d/player/UnityPlayer$13;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/unity3d/player/UnityPlayer$13;-><init>(Lcom/unity3d/player/UnityPlayer;)V

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/unity3d/player/UnityPlayer;->queueEvent(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method protected setGyroUpdateDelay(I)V
    .locals 0

    iput p1, p0, Lcom/unity3d/player/UnityPlayer;->Z:I

    return-void
.end method

.method protected setHideInputField(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/unity3d/player/UnityPlayer;->b:Z

    return-void
.end method

.method protected setOrientation(I)V
    .locals 3

    const/16 v2, 0x9

    #v2=(PosByte);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    instance-of v0, v0, Landroid/app/Activity;

    #v0=(Boolean);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getRequestedOrientation()I

    move-result v1

    #v1=(Integer);
    if-eq p1, v1, :cond_0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v1, v2, :cond_2

    if-eq p1, v2, :cond_0

    const/16 v1, 0x8

    #v1=(PosByte);
    if-eq p1, v1, :cond_0

    :cond_2
    #v1=(Integer);
    invoke-virtual {v0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    goto :goto_0
.end method

.method protected setScreenSize(II)V
    .locals 4

    const/4 v3, -0x1

    #v3=(Byte);
    const/4 v2, 0x0

    #v2=(Null);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    #v0=(Reference);
    instance-of v0, v0, Landroid/view/SurfaceView;

    #v0=(Boolean);
    if-nez v0, :cond_0

    const/4 v0, 0x5

    #v0=(PosByte);
    const-string v1, "setScreenSize: Unable to retrieve surface holder"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/unity3d/player/f;->Log(ILjava/lang/String;)V

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Reference);
    return-void

    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(Null);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    #v0=(Reference);
    check-cast v0, Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    #v1=(Reference);
    invoke-interface {v1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getWidth()I

    move-result v1

    #v1=(Integer);
    if-ne v1, p1, :cond_1

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHeight()I

    move-result v1

    if-eq v1, p2, :cond_2

    :cond_1
    if-ne p1, v3, :cond_3

    if-ne p2, v3, :cond_3

    :cond_2
    const/4 v1, 0x1

    :goto_1
    #v1=(Boolean);
    if-eqz v1, :cond_4

    iput v2, p0, Lcom/unity3d/player/UnityPlayer;->u:I

    iput v2, p0, Lcom/unity3d/player/UnityPlayer;->v:I

    :goto_2
    new-instance v2, Lcom/unity3d/player/UnityPlayer$7;

    #v2=(UninitRef);
    invoke-direct {v2, v1, v0, p1, p2}, Lcom/unity3d/player/UnityPlayer$7;-><init>(ZLandroid/view/SurfaceView;II)V

    #v2=(Reference);
    invoke-direct {p0, v2}, Lcom/unity3d/player/UnityPlayer;->a(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_3
    #v1=(Integer);v2=(Null);
    move v1, v2

    #v1=(Null);
    goto :goto_1

    :cond_4
    #v1=(Boolean);
    iput p1, p0, Lcom/unity3d/player/UnityPlayer;->u:I

    iput p2, p0, Lcom/unity3d/player/UnityPlayer;->v:I

    goto :goto_2
.end method

.method protected setWakeLock(Z)V
    .locals 1

    invoke-virtual {p0}, Lcom/unity3d/player/UnityPlayer;->hasWakeLock()Z

    move-result v0

    #v0=(Boolean);
    if-ne p1, v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);
    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->j:Landroid/os/PowerManager$WakeLock;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    goto :goto_0

    :cond_2
    #v0=(Boolean);
    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->j:Landroid/os/PowerManager$WakeLock;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    goto :goto_0
.end method

.method protected showBuildSetup()Z
    .locals 1

    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->E:Z

    #v0=(Boolean);
    return v0
.end method

.method protected showRuntimeSetup()Z
    .locals 1

    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->F:Z

    #v0=(Boolean);
    return v0
.end method

.method protected showSoftInput(Ljava/lang/String;IZZZZLjava/lang/String;)V
    .locals 10

    new-instance v0, Lcom/unity3d/player/UnityPlayer$8;

    #v0=(UninitRef);
    move-object v1, p0

    #v1=(Reference);
    move-object v2, p0

    #v2=(Reference);
    move-object v3, p1

    #v3=(Reference);
    move v4, p2

    #v4=(Integer);
    move v5, p3

    #v5=(Boolean);
    move v6, p4

    #v6=(Boolean);
    move v7, p5

    #v7=(Boolean);
    move/from16 v8, p6

    #v8=(Boolean);
    move-object/from16 v9, p7

    #v9=(Reference);
    invoke-direct/range {v0 .. v9}, Lcom/unity3d/player/UnityPlayer$8;-><init>(Lcom/unity3d/player/UnityPlayer;Lcom/unity3d/player/UnityPlayer;Ljava/lang/String;IZZZZLjava/lang/String;)V

    #v0=(Reference);
    invoke-direct {p0, v0}, Lcom/unity3d/player/UnityPlayer;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected showVideoPlayer(Ljava/lang/String;IIIZ)V
    .locals 3

    new-instance v1, Landroid/content/Intent;

    #v1=(UninitRef);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    const-class v2, Lcom/unity3d/player/VideoPlayer;

    #v2=(Reference);
    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    #v1=(Reference);
    const-string v0, "fileName"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "backgroundColor"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v0, "controlMode"

    invoke-virtual {v1, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v0, "scalingMode"

    invoke-virtual {v1, v0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v0, "isURL"

    invoke-virtual {v1, v0, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    instance-of v0, v0, Landroid/app/Activity;

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    #v0=(Reference);
    check-cast v0, Landroid/app/Activity;

    const-string v2, "screenOrientation"

    invoke-virtual {v0}, Landroid/app/Activity;->getRequestedOrientation()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v0, "autorotationOn"

    #v0=(Reference);
    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayer;->nativeIsAutorotationOn()Z

    move-result v2

    #v2=(Boolean);
    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :goto_0
    const-string v0, "wakeLock"

    invoke-virtual {p0}, Lcom/unity3d/player/UnityPlayer;->hasWakeLock()Z

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const/high16 v0, 0x1

    #v0=(Integer);
    invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    new-instance v0, Lcom/unity3d/player/UnityPlayer$12;

    #v0=(UninitRef);
    invoke-direct {v0, p0, v1}, Lcom/unity3d/player/UnityPlayer$12;-><init>(Lcom/unity3d/player/UnityPlayer;Landroid/content/Intent;)V

    #v0=(Reference);
    invoke-direct {p0, v0}, Lcom/unity3d/player/UnityPlayer;->a(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    #v0=(Boolean);v2=(Reference);
    const-string v0, "screenOrientation"

    #v0=(Reference);
    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v0, "autorotationOn"

    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    goto :goto_0
.end method

.method protected startActivityIndicator()V
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->O:Ljava/lang/Runnable;

    #v0=(Reference);
    invoke-direct {p0, v0}, Lcom/unity3d/player/UnityPlayer;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected stopActivityIndicator()V
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->P:Ljava/lang/Runnable;

    #v0=(Reference);
    invoke-direct {p0, v0}, Lcom/unity3d/player/UnityPlayer;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected vibrate(I)V
    .locals 3

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->n:Landroid/os/Vibrator;

    #v0=(Reference);
    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->g:Landroid/content/ContextWrapper;

    const-string v1, "vibrator"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/ContextWrapper;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    iput-object v0, p0, Lcom/unity3d/player/UnityPlayer;->n:Landroid/os/Vibrator;

    :cond_0
    #v1=(Conflicted);
    if-nez p1, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->n:Landroid/os/Vibrator;

    invoke-virtual {v0}, Landroid/os/Vibrator;->cancel()V

    :goto_0
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    :cond_1
    #v0=(Reference);v2=(Uninit);
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->n:Landroid/os/Vibrator;

    int-to-long v1, p1

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v0, v1, v2}, Landroid/os/Vibrator;->vibrate(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    #v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    const/4 v0, 0x5

    #v0=(PosByte);
    const-string v1, "android.permission.VIBRATE not available?"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/unity3d/player/f;->Log(ILjava/lang/String;)V

    goto :goto_0
.end method

.method public windowFocusChanged(Z)V
    .locals 2

    iput-boolean p1, p0, Lcom/unity3d/player/UnityPlayer;->L:Z

    iget-boolean v0, p0, Lcom/unity3d/player/UnityPlayer;->q:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayer;->i:Lcom/unity3d/player/UnityGL;

    #v0=(Reference);
    new-instance v1, Lcom/unity3d/player/UnityPlayer$23;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/unity3d/player/UnityPlayer$23;-><init>(Lcom/unity3d/player/UnityPlayer;)V

    #v1=(Reference);
    invoke-interface {v0, v1}, Lcom/unity3d/player/UnityGL;->queueEvent(Ljava/lang/Runnable;)V

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayer;->d()V

    return-void
.end method

*/}
