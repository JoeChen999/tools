package com.unity3d.player; class VideoPlayer {/*

.class public Lcom/unity3d/player/VideoPlayer;
.super Landroid/app/Activity;

# interfaces
.implements Landroid/hardware/SensorEventListener;
.implements Landroid/media/MediaPlayer$OnBufferingUpdateListener;
.implements Landroid/media/MediaPlayer$OnCompletionListener;
.implements Landroid/media/MediaPlayer$OnPreparedListener;
.implements Landroid/media/MediaPlayer$OnVideoSizeChangedListener;
.implements Landroid/view/SurfaceHolder$Callback;
.implements Landroid/widget/MediaController$MediaPlayerControl;


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:Landroid/media/MediaPlayer;

.field private f:Landroid/widget/MediaController;

.field private g:Landroid/view/SurfaceView;

.field private h:Landroid/view/SurfaceHolder;

.field private i:Ljava/lang/String;

.field private j:I

.field private k:I

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Landroid/widget/FrameLayout;

.field private p:I

.field private q:Z

.field private r:I

.field private s:Landroid/os/PowerManager$WakeLock;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    #p0=(Reference);
    iput-boolean v0, p0, Lcom/unity3d/player/VideoPlayer;->m:Z

    iput-boolean v0, p0, Lcom/unity3d/player/VideoPlayer;->n:Z

    iput v0, p0, Lcom/unity3d/player/VideoPlayer;->p:I

    iput-boolean v0, p0, Lcom/unity3d/player/VideoPlayer;->q:Z

    iput v0, p0, Lcom/unity3d/player/VideoPlayer;->r:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/unity3d/player/VideoPlayer;->s:Landroid/os/PowerManager$WakeLock;

    return-void
.end method

.method private a()V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    :cond_0
    #v0=(Reference);
    iput v1, p0, Lcom/unity3d/player/VideoPlayer;->c:I

    iput v1, p0, Lcom/unity3d/player/VideoPlayer;->d:I

    iput-boolean v1, p0, Lcom/unity3d/player/VideoPlayer;->n:Z

    iput-boolean v1, p0, Lcom/unity3d/player/VideoPlayer;->m:Z

    return-void
.end method

.method private b()V
    .locals 1

    invoke-virtual {p0}, Lcom/unity3d/player/VideoPlayer;->isPlaying()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-direct {p0}, Lcom/unity3d/player/VideoPlayer;->c()V

    iget-boolean v0, p0, Lcom/unity3d/player/VideoPlayer;->q:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/unity3d/player/VideoPlayer;->start()V

    goto :goto_0
.end method

.method private c()V
    .locals 5

    const-string v0, "window"

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/unity3d/player/VideoPlayer;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/view/Display;->getWidth()I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Lcom/unity3d/player/VideoPlayer;->a:I

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/unity3d/player/VideoPlayer;->b:I

    iget v1, p0, Lcom/unity3d/player/VideoPlayer;->a:I

    iget v0, p0, Lcom/unity3d/player/VideoPlayer;->b:I

    iget v2, p0, Lcom/unity3d/player/VideoPlayer;->k:I

    #v2=(Integer);
    const/4 v3, 0x1

    #v3=(One);
    if-eq v2, v3, :cond_0

    iget v2, p0, Lcom/unity3d/player/VideoPlayer;->k:I

    const/4 v3, 0x2

    #v3=(PosByte);
    if-ne v2, v3, :cond_3

    :cond_0
    iget v2, p0, Lcom/unity3d/player/VideoPlayer;->c:I

    int-to-float v2, v2

    #v2=(Float);
    iget v3, p0, Lcom/unity3d/player/VideoPlayer;->d:I

    #v3=(Integer);
    int-to-float v3, v3

    #v3=(Float);
    div-float/2addr v2, v3

    iget v3, p0, Lcom/unity3d/player/VideoPlayer;->a:I

    #v3=(Integer);
    int-to-float v3, v3

    #v3=(Float);
    iget v4, p0, Lcom/unity3d/player/VideoPlayer;->b:I

    #v4=(Integer);
    int-to-float v4, v4

    #v4=(Float);
    div-float/2addr v3, v4

    cmpg-float v3, v3, v2

    #v3=(Byte);
    if-gtz v3, :cond_2

    iget v0, p0, Lcom/unity3d/player/VideoPlayer;->a:I

    int-to-float v0, v0

    #v0=(Float);
    div-float/2addr v0, v2

    float-to-int v0, v0

    :cond_1
    :goto_0
    #v0=(Integer);v2=(Integer);v4=(Conflicted);
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    #v2=(UninitRef);
    const/16 v3, 0x11

    #v3=(PosByte);
    invoke-direct {v2, v1, v0, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    #v2=(Reference);
    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->o:Landroid/widget/FrameLayout;

    #v0=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/VideoPlayer;->g:Landroid/view/SurfaceView;

    #v1=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/widget/FrameLayout;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_2
    #v0=(Integer);v1=(Integer);v2=(Float);v3=(Byte);v4=(Float);
    iget v1, p0, Lcom/unity3d/player/VideoPlayer;->b:I

    int-to-float v1, v1

    #v1=(Float);
    mul-float/2addr v1, v2

    float-to-int v1, v1

    #v1=(Integer);
    goto :goto_0

    :cond_3
    #v2=(Integer);v3=(PosByte);v4=(Uninit);
    iget v2, p0, Lcom/unity3d/player/VideoPlayer;->k:I

    if-nez v2, :cond_1

    iget v1, p0, Lcom/unity3d/player/VideoPlayer;->c:I

    iget v0, p0, Lcom/unity3d/player/VideoPlayer;->d:I

    goto :goto_0
.end method


# virtual methods
.method public canPause()Z
    .locals 1

    const/4 v0, 0x1

    #v0=(One);
    return v0
.end method

.method public canSeekBackward()Z
    .locals 1

    const/4 v0, 0x1

    #v0=(One);
    return v0
.end method

.method public canSeekForward()Z
    .locals 1

    const/4 v0, 0x1

    #v0=(One);
    return v0
.end method

.method public finish()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    invoke-virtual {p0, v0, v0}, Lcom/unity3d/player/VideoPlayer;->overridePendingTransition(II)V

    return-void
.end method

.method public getBufferPercentage()I
    .locals 1

    iget-boolean v0, p0, Lcom/unity3d/player/VideoPlayer;->l:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget v0, p0, Lcom/unity3d/player/VideoPlayer;->p:I

    :goto_0
    #v0=(Integer);
    return v0

    :cond_0
    #v0=(Boolean);
    const/16 v0, 0x64

    #v0=(PosByte);
    goto :goto_0
.end method

.method public getCurrentPosition()I
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    #v0=(Reference);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Integer);
    return v0

    :cond_0
    #v0=(Reference);
    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    #v0=(Integer);
    goto :goto_0
.end method

.method public getDuration()I
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    #v0=(Reference);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Integer);
    return v0

    :cond_0
    #v0=(Reference);
    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v0

    #v0=(Integer);
    goto :goto_0
.end method

.method public isPlaying()Z
    .locals 4

    const/4 v1, 0x1

    #v1=(One);
    const/4 v2, 0x0

    #v2=(Null);
    iget-boolean v0, p0, Lcom/unity3d/player/VideoPlayer;->n:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/unity3d/player/VideoPlayer;->m:Z

    if-eqz v0, :cond_1

    move v0, v1

    :goto_0
    iget-object v3, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    #v3=(Reference);
    if-nez v3, :cond_3

    if-nez v0, :cond_2

    :cond_0
    :goto_1
    #v1=(Boolean);v3=(Conflicted);
    return v1

    :cond_1
    #v1=(One);v3=(Uninit);
    move v0, v2

    #v0=(Null);
    goto :goto_0

    :cond_2
    #v0=(Boolean);v3=(Reference);
    move v1, v2

    #v1=(Null);
    goto :goto_1

    :cond_3
    #v1=(One);
    iget-object v3, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v3}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_0

    if-eqz v0, :cond_0

    move v1, v2

    #v1=(Null);
    goto :goto_1
.end method

.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public onBufferingUpdate(Landroid/media/MediaPlayer;I)V
    .locals 0

    iput p2, p0, Lcom/unity3d/player/VideoPlayer;->p:I

    return-void
.end method

.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 0

    invoke-virtual {p0}, Lcom/unity3d/player/VideoPlayer;->finish()V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-direct {p0}, Lcom/unity3d/player/VideoPlayer;->c()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 7

    const/16 v3, 0x400

    #v3=(PosShort);
    const/4 v0, 0x4

    #v0=(PosByte);
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/unity3d/player/VideoPlayer;->getIntent()Landroid/content/Intent;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "fileName"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    if-nez v2, :cond_0

    invoke-virtual {p0}, Lcom/unity3d/player/VideoPlayer;->finish()V

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-void

    :cond_0
    #v0=(PosByte);v1=(Reference);v2=(Integer);v3=(PosShort);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    const v2, 0x1030007

    invoke-virtual {p0, v2}, Lcom/unity3d/player/VideoPlayer;->setTheme(I)V

    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {p0, v2}, Lcom/unity3d/player/VideoPlayer;->requestWindowFeature(I)Z

    invoke-virtual {p0}, Lcom/unity3d/player/VideoPlayer;->getWindow()Landroid/view/Window;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2, v3, v3}, Landroid/view/Window;->setFlags(II)V

    const-string v2, "screenOrientation"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    const-string v3, "autorotationOn"

    #v3=(Reference);
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_1

    if-ne v2, v0, :cond_4

    :cond_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x9

    #v3=(PosByte);
    if-lt v2, v3, :cond_2

    const/16 v0, 0xa

    :cond_2
    invoke-virtual {p0, v0}, Lcom/unity3d/player/VideoPlayer;->setRequestedOrientation(I)V

    :goto_1
    const-string v0, "wakeLock"

    #v0=(Reference);
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_3

    const-string v0, "power"

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/unity3d/player/VideoPlayer;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    const/16 v2, 0x1a

    #v2=(PosByte);
    const-string v3, "videowakelock"

    #v3=(Reference);
    invoke-virtual {v0, v2, v3}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    iput-object v0, p0, Lcom/unity3d/player/VideoPlayer;->s:Landroid/os/PowerManager$WakeLock;

    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->s:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    :cond_3
    #v0=(Conflicted);v2=(Integer);v3=(Conflicted);
    const-string v0, "fileName"

    #v0=(Reference);
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "backgroundColor"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    const-string v3, "controlMode"

    #v3=(Reference);
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    #v3=(Integer);
    const-string v4, "scalingMode"

    #v4=(Reference);
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    const-string v5, "isURL"

    #v5=(Reference);
    invoke-virtual {v1, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    #v5=(Integer);
    if-nez v5, :cond_5

    invoke-virtual {p0}, Lcom/unity3d/player/VideoPlayer;->finish()V

    goto :goto_0

    :cond_4
    #v0=(PosByte);v1=(Reference);v3=(Boolean);v4=(Uninit);v5=(Uninit);
    invoke-virtual {p0, v2}, Lcom/unity3d/player/VideoPlayer;->setRequestedOrientation(I)V

    goto :goto_1

    :cond_5
    #v0=(Reference);v1=(Boolean);v3=(Integer);v4=(Integer);v5=(Integer);
    new-instance v5, Landroid/widget/FrameLayout;

    #v5=(UninitRef);
    invoke-direct {v5, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    #v5=(Reference);
    iput-object v5, p0, Lcom/unity3d/player/VideoPlayer;->o:Landroid/widget/FrameLayout;

    new-instance v5, Landroid/view/SurfaceView;

    #v5=(UninitRef);
    invoke-direct {v5, p0}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    #v5=(Reference);
    iput-object v5, p0, Lcom/unity3d/player/VideoPlayer;->g:Landroid/view/SurfaceView;

    iget-object v5, p0, Lcom/unity3d/player/VideoPlayer;->g:Landroid/view/SurfaceView;

    invoke-virtual {v5}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v5

    iput-object v5, p0, Lcom/unity3d/player/VideoPlayer;->h:Landroid/view/SurfaceHolder;

    iget-object v5, p0, Lcom/unity3d/player/VideoPlayer;->h:Landroid/view/SurfaceHolder;

    invoke-interface {v5, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    iget-object v5, p0, Lcom/unity3d/player/VideoPlayer;->h:Landroid/view/SurfaceHolder;

    const/4 v6, 0x3

    #v6=(PosByte);
    invoke-interface {v5, v6}, Landroid/view/SurfaceHolder;->setType(I)V

    iget-object v5, p0, Lcom/unity3d/player/VideoPlayer;->o:Landroid/widget/FrameLayout;

    invoke-virtual {v5, v2}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    iget-object v2, p0, Lcom/unity3d/player/VideoPlayer;->o:Landroid/widget/FrameLayout;

    #v2=(Reference);
    iget-object v5, p0, Lcom/unity3d/player/VideoPlayer;->g:Landroid/view/SurfaceView;

    invoke-virtual {v2, v5}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    iget-object v2, p0, Lcom/unity3d/player/VideoPlayer;->o:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v2}, Lcom/unity3d/player/VideoPlayer;->setContentView(Landroid/view/View;)V

    iput-object v0, p0, Lcom/unity3d/player/VideoPlayer;->i:Ljava/lang/String;

    iput v3, p0, Lcom/unity3d/player/VideoPlayer;->j:I

    iput v4, p0, Lcom/unity3d/player/VideoPlayer;->k:I

    iput-boolean v1, p0, Lcom/unity3d/player/VideoPlayer;->l:Z

    goto/16 :goto_0
.end method

.method protected onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    invoke-direct {p0}, Lcom/unity3d/player/VideoPlayer;->a()V

    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->s:Landroid/os/PowerManager$WakeLock;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->s:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/unity3d/player/VideoPlayer;->s:Landroid/os/PowerManager$WakeLock;

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    const/16 v0, 0x1a

    #v0=(PosByte);
    if-eq p1, v0, :cond_0

    const/16 v0, 0x52

    if-eq p1, v0, :cond_0

    const/16 v0, 0x19

    if-eq p1, v0, :cond_0

    const/16 v0, 0x18

    if-eq p1, v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_1
    #v0=(PosByte);
    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->f:Landroid/widget/MediaController;

    #v0=(Reference);
    if-eqz v0, :cond_3

    const/16 v0, 0x17

    #v0=(PosByte);
    if-eq p1, v0, :cond_2

    const/16 v0, 0x13

    if-eq p1, v0, :cond_2

    const/16 v0, 0x14

    if-eq p1, v0, :cond_2

    const/16 v0, 0x15

    if-eq p1, v0, :cond_2

    const/16 v0, 0x16

    if-ne p1, v0, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->f:Landroid/widget/MediaController;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2}, Landroid/widget/MediaController;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0

    :cond_3
    #v0=(Conflicted);
    invoke-virtual {p0}, Lcom/unity3d/player/VideoPlayer;->finish()V

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method

.method protected onPause()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    iget-boolean v0, p0, Lcom/unity3d/player/VideoPlayer;->q:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/unity3d/player/VideoPlayer;->pause()V

    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/unity3d/player/VideoPlayer;->q:Z

    :cond_0
    #v0=(Boolean);
    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    #v0=(Reference);
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/unity3d/player/VideoPlayer;->r:I

    :cond_1
    #v0=(Conflicted);
    return-void
.end method

.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 1

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/unity3d/player/VideoPlayer;->n:Z

    iget-boolean v0, p0, Lcom/unity3d/player/VideoPlayer;->n:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/unity3d/player/VideoPlayer;->m:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/unity3d/player/VideoPlayer;->b()V

    :cond_0
    return-void
.end method

.method protected onResume()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    iget-boolean v0, p0, Lcom/unity3d/player/VideoPlayer;->q:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/unity3d/player/VideoPlayer;->start()V

    :cond_0
    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 0

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->f:Landroid/widget/MediaController;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->f:Landroid/widget/MediaController;

    invoke-virtual {v0, p1}, Landroid/widget/MediaController;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
    return v0

    :cond_0
    #v0=(Reference);v1=(Uninit);v2=(Uninit);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    #v0=(Integer);
    and-int/lit16 v0, v0, 0xff

    iget v1, p0, Lcom/unity3d/player/VideoPlayer;->j:I

    #v1=(Integer);
    const/4 v2, 0x2

    #v2=(PosByte);
    if-ne v1, v2, :cond_1

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/unity3d/player/VideoPlayer;->finish()V

    :cond_1
    invoke-super {p0, p1}, Landroid/app/Activity;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public onVideoSizeChanged(Landroid/media/MediaPlayer;II)V
    .locals 1

    if-eqz p2, :cond_0

    if-nez p3, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);
    return-void

    :cond_1
    #v0=(Uninit);
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/unity3d/player/VideoPlayer;->m:Z

    iput p2, p0, Lcom/unity3d/player/VideoPlayer;->c:I

    iput p3, p0, Lcom/unity3d/player/VideoPlayer;->d:I

    iget-boolean v0, p0, Lcom/unity3d/player/VideoPlayer;->n:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/unity3d/player/VideoPlayer;->m:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/unity3d/player/VideoPlayer;->b()V

    goto :goto_0
.end method

.method public pause()V
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    #v0=(Reference);
    if-nez v0, :cond_0

    :goto_0
    #v0=(Conflicted);
    return-void

    :cond_0
    #v0=(Reference);
    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/unity3d/player/VideoPlayer;->q:Z

    goto :goto_0
.end method

.method public seekTo(I)V
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    #v0=(Reference);
    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->seekTo(I)V

    goto :goto_0
.end method

.method public start()V
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    #v0=(Reference);
    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/unity3d/player/VideoPlayer;->q:Z

    goto :goto_0
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    iput p3, p0, Lcom/unity3d/player/VideoPlayer;->a:I

    iput p4, p0, Lcom/unity3d/player/VideoPlayer;->b:I

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 8

    const/4 v7, 0x1

    #v7=(One);
    invoke-direct {p0}, Lcom/unity3d/player/VideoPlayer;->a()V

    :try_start_0
    new-instance v0, Landroid/media/MediaPlayer;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    iget-boolean v0, p0, Lcom/unity3d/player/VideoPlayer;->l:Z

    #v0=(Boolean);
    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    #v0=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/VideoPlayer;->i:Ljava/lang/String;

    #v1=(Reference);
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    :goto_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/unity3d/player/VideoPlayer;->h:Landroid/view/SurfaceHolder;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V

    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnBufferingUpdateListener(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V

    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x3

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V

    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V

    iget v0, p0, Lcom/unity3d/player/VideoPlayer;->j:I

    #v0=(Integer);
    if-eqz v0, :cond_0

    iget v0, p0, Lcom/unity3d/player/VideoPlayer;->j:I

    if-ne v0, v7, :cond_1

    :cond_0
    new-instance v0, Landroid/widget/MediaController;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/widget/MediaController;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/VideoPlayer;->f:Landroid/widget/MediaController;

    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->f:Landroid/widget/MediaController;

    invoke-virtual {v0, p0}, Landroid/widget/MediaController;->setMediaPlayer(Landroid/widget/MediaController$MediaPlayerControl;)V

    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->f:Landroid/widget/MediaController;

    iget-object v1, p0, Lcom/unity3d/player/VideoPlayer;->g:Landroid/view/SurfaceView;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/widget/MediaController;->setAnchorView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->f:Landroid/widget/MediaController;

    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Landroid/widget/MediaController;->setEnabled(Z)V

    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->f:Landroid/widget/MediaController;

    invoke-virtual {v0}, Landroid/widget/MediaController;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :cond_1
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);
    iget v0, p0, Lcom/unity3d/player/VideoPlayer;->r:I

    #v0=(Integer);
    invoke-virtual {p0, v0}, Lcom/unity3d/player/VideoPlayer;->seekTo(I)V

    return-void

    :cond_2
    :try_start_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    invoke-virtual {p0}, Lcom/unity3d/player/VideoPlayer;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    :try_start_2
    iget-object v1, p0, Lcom/unity3d/player/VideoPlayer;->i:Ljava/lang/String;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v6

    #v6=(Reference);
    iget-object v0, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v4

    #v4=(LongLo);v5=(LongHi);
    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V

    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    move-exception v0

    :try_start_3
    new-instance v0, Ljava/io/FileInputStream;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/unity3d/player/VideoPlayer;->i:Ljava/lang/String;

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/VideoPlayer;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;)V

    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_0

    :catch_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {p0}, Lcom/unity3d/player/VideoPlayer;->finish()V

    goto :goto_1
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 0

    invoke-direct {p0}, Lcom/unity3d/player/VideoPlayer;->a()V

    return-void
.end method

*/}
