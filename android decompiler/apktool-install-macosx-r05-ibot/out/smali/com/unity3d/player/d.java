package com.unity3d.player; class d {/*

.class final Lcom/unity3d/player/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unity3d/player/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final a:Ljava/lang/reflect/Method;

.field private synthetic b:Lcom/unity3d/player/c;


# direct methods
.method constructor <init>(Lcom/unity3d/player/c;)V
    .locals 6

    iput-object p1, p0, Lcom/unity3d/player/d;->b:Lcom/unity3d/player/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    :try_start_0
    #v0=(Null);
    const-class v1, Landroid/view/View;

    #v1=(Reference);
    const-string v2, "dispatchGenericMotionEvent"

    #v2=(Reference);
    const/4 v3, 0x1

    #v3=(One);
    new-array v3, v3, [Ljava/lang/Class;

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    const-class v5, Landroid/view/MotionEvent;

    #v5=(Reference);
    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    #v0=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    iput-object v0, p0, Lcom/unity3d/player/d;->a:Ljava/lang/reflect/Method;

    return-void

    :catch_0
    #v0=(Null);v1=(Conflicted);
    move-exception v1

    #v1=(Reference);
    goto :goto_0
.end method

.method private a(Landroid/view/View;Landroid/view/MotionEvent;)V
    .locals 3

    iget-object v0, p0, Lcom/unity3d/player/d;->a:Ljava/lang/reflect/Method;

    #v0=(Reference);
    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/unity3d/player/d;->a:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    #v1=(One);
    new-array v1, v1, [Ljava/lang/Object;

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    aput-object p2, v1, v2

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public final run()V
    .locals 4

    :goto_0
    iget-object v0, p0, Lcom/unity3d/player/d;->b:Lcom/unity3d/player/c;

    #v0=(Reference);
    invoke-static {v0}, Lcom/unity3d/player/c;->a(Lcom/unity3d/player/c;)Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/MotionEvent;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/unity3d/player/d;->b:Lcom/unity3d/player/c;

    #v1=(Reference);
    iget-object v1, v1, Lcom/unity3d/player/c;->a:Landroid/content/ContextWrapper;

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getSource()I

    move-result v2

    #v2=(Integer);
    and-int/lit8 v3, v2, 0x2

    #v3=(Integer);
    if-eqz v3, :cond_0

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    and-int/lit16 v2, v2, 0xff

    packed-switch v2, :pswitch_data_0

    invoke-direct {p0, v1, v0}, Lcom/unity3d/player/d;->a(Landroid/view/View;Landroid/view/MotionEvent;)V

    goto :goto_0

    :pswitch_0
    invoke-virtual {v1, v0}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    goto :goto_0

    :cond_0
    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_1

    invoke-virtual {v1, v0}, Landroid/view/View;->dispatchTrackballEvent(Landroid/view/MotionEvent;)Z

    goto :goto_0

    :cond_1
    invoke-direct {p0, v1, v0}, Lcom/unity3d/player/d;->a(Landroid/view/View;Landroid/view/MotionEvent;)V

    goto :goto_0

    :cond_2
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

*/}