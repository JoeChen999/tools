package com.unity3d.player; class p {/*

.class public final Lcom/unity3d/player/p;
.super Landroid/app/Dialog;

# interfaces
.implements Landroid/text/TextWatcher;
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/unity3d/player/UnityPlayer;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/unity3d/player/UnityPlayer;Ljava/lang/String;IZZZLjava/lang/String;)V
    .locals 6

    const/4 v0, 0x0

    #v0=(Null);
    const/4 v5, 0x1

    #v5=(One);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    #p0=(Reference);
    iput-object v0, p0, Lcom/unity3d/player/p;->a:Landroid/content/Context;

    iput-object v0, p0, Lcom/unity3d/player/p;->b:Lcom/unity3d/player/UnityPlayer;

    iput-object p1, p0, Lcom/unity3d/player/p;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/unity3d/player/p;->b:Lcom/unity3d/player/UnityPlayer;

    invoke-virtual {p0}, Lcom/unity3d/player/p;->getWindow()Landroid/view/Window;

    move-result-object v0

    #v0=(Reference);
    const/16 v1, 0x50

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Landroid/view/Window;->setGravity(I)V

    invoke-virtual {p0}, Lcom/unity3d/player/p;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/Window;->requestFeature(I)Z

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    #v0=(UninitRef);
    invoke-direct {v0, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    #v0=(Reference);
    invoke-virtual {p0}, Lcom/unity3d/player/p;->getWindow()Landroid/view/Window;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lcom/unity3d/player/p;->createSoftInputView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/unity3d/player/p;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/unity3d/player/p;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x2

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    const v0, 0x3f050001

    #v0=(Integer);
    invoke-virtual {p0, v0}, Lcom/unity3d/player/p;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/EditText;

    const v1, 0x3f050002

    #v1=(Integer);
    invoke-virtual {p0, v1}, Lcom/unity3d/player/p;->findViewById(I)Landroid/view/View;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/widget/Button;

    const/4 v3, 0x6

    #v3=(PosByte);
    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setImeOptions(I)V

    invoke-virtual {v0, p3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, p8}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    if-eqz p5, :cond_3

    const v3, 0x8000

    #v3=(Char);
    move v4, v3

    :goto_0
    #v4=(Char);
    if-eqz p6, :cond_4

    const/high16 v3, 0x2

    :goto_1
    #v3=(Integer);
    or-int/2addr v3, v4

    if-eqz p7, :cond_0

    const/16 v2, 0x80

    :cond_0
    #v2=(PosShort);
    or-int/2addr v2, v3

    #v2=(Integer);
    if-ltz p4, :cond_1

    const/4 v3, 0x7

    #v3=(PosByte);
    if-le p4, v3, :cond_5

    :cond_1
    :goto_2
    #v3=(Integer);
    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setInputType(I)V

    invoke-virtual {v0, p0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-virtual {v0}, Landroid/widget/EditText;->getInputType()I

    move-result v2

    invoke-static {}, Landroid/text/method/TextKeyListener;->getInstance()Landroid/text/method/TextKeyListener;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setKeyListener(Landroid/text/method/KeyListener;)V

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setRawInputType(I)V

    invoke-virtual {v0, v5}, Landroid/widget/EditText;->setClickable(Z)V

    if-nez p6, :cond_2

    invoke-virtual {v0}, Landroid/widget/EditText;->selectAll()V

    :cond_2
    invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v1, Lcom/unity3d/player/p$1;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/unity3d/player/p$1;-><init>(Lcom/unity3d/player/p;)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    return-void

    :cond_3
    #v2=(Null);v3=(PosByte);v4=(Uninit);
    move v4, v2

    #v4=(Null);
    goto :goto_0

    :cond_4
    #v3=(Char);v4=(Char);
    move v3, v2

    #v3=(Null);
    goto :goto_1

    :cond_5
    #v2=(Integer);v3=(PosByte);
    const/16 v3, 0x8

    new-array v3, v3, [I

    #v3=(Reference);
    fill-array-data v3, :array_0

    aget v3, v3, p4

    #v3=(Integer);
    or-int/2addr v2, v3

    goto :goto_2

    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);p4=(Unknown);p5=(Unknown);p6=(Unknown);p7=(Unknown);p8=(Unknown);
    nop

    :array_0
    .array-data 0x4
        0x1t 0x0t 0x0t 0x0t
        0x1t 0x40t 0x0t 0x0t
        0x2t 0x30t 0x0t 0x0t
        0x11t 0x0t 0x0t 0x0t
        0x2t 0x0t 0x0t 0x0t
        0x3t 0x0t 0x0t 0x0t
        0x61t 0x0t 0x0t 0x0t
        0x21t 0x0t 0x0t 0x0t
    .end array-data
.end method

.method private a()Ljava/lang/String;
    .locals 1

    const v0, 0x3f050001

    #v0=(Integer);
    invoke-virtual {p0, v0}, Lcom/unity3d/player/p;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/EditText;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/unity3d/player/p;)Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lcom/unity3d/player/p;->a()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic a(Lcom/unity3d/player/p;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/unity3d/player/p;->b:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, p1, v1}, Lcom/unity3d/player/UnityPlayer;->reportSoftInputStr(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic b(Lcom/unity3d/player/p;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/unity3d/player/p;->a:Landroid/content/Context;

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    iget-object v0, p0, Lcom/unity3d/player/p;->b:Lcom/unity3d/player/UnityPlayer;

    #v0=(Reference);
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v0, v1, v2}, Lcom/unity3d/player/UnityPlayer;->reportSoftInputStr(Ljava/lang/String;I)V

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method protected final createSoftInputView()Landroid/view/View;
    .locals 10

    const v9, 0x3f050002

    #v9=(Integer);
    const v8, 0x3f050001

    #v8=(Integer);
    const/16 v7, 0xf

    #v7=(PosByte);
    const/4 v3, -0x1

    #v3=(Byte);
    const/4 v6, -0x2

    #v6=(Byte);
    new-instance v1, Landroid/widget/RelativeLayout;

    #v1=(UninitRef);
    iget-object v0, p0, Lcom/unity3d/player/p;->a:Landroid/content/Context;

    #v0=(Reference);
    invoke-direct {v1, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    #v1=(Reference);
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    #v0=(UninitRef);
    invoke-direct {v0, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    #v0=(Reference);
    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Lcom/unity3d/player/p$2;

    #v0=(UninitRef);
    iget-object v2, p0, Lcom/unity3d/player/p;->a:Landroid/content/Context;

    #v2=(Reference);
    invoke-direct {v0, p0, v2}, Lcom/unity3d/player/p$2;-><init>(Lcom/unity3d/player/p;Landroid/content/Context;)V

    #v0=(Reference);
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    #v2=(UninitRef);
    invoke-direct {v2, v3, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    #v2=(Reference);
    invoke-virtual {v2, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v2, v3, v9}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0, v8}, Landroid/widget/EditText;->setId(I)V

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    new-instance v0, Landroid/widget/Button;

    #v0=(UninitRef);
    iget-object v2, p0, Lcom/unity3d/player/p;->a:Landroid/content/Context;

    invoke-direct {v0, v2}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    iget-object v2, p0, Lcom/unity3d/player/p;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const-string v3, "ok"

    #v3=(Reference);
    const-string v4, "string"

    #v4=(Reference);
    const-string v5, "android"

    #v5=(Reference);
    invoke-virtual {v2, v3, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v0, v2}, Landroid/widget/Button;->setText(I)V

    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    #v2=(UninitRef);
    invoke-direct {v2, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    #v2=(Reference);
    invoke-virtual {v2, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 v3, 0xb

    #v3=(PosByte);
    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0, v9}, Landroid/widget/Button;->setId(I)V

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    new-instance v2, Lcom/unity3d/player/p$3;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Lcom/unity3d/player/p$3;-><init>(Lcom/unity3d/player/p;)V

    #v2=(Reference);
    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    return-object v1
.end method

.method public final onBackPressed()V
    .locals 3

    invoke-direct {p0}, Lcom/unity3d/player/p;->a()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/p;->b:Lcom/unity3d/player/UnityPlayer;

    #v1=(Reference);
    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v1, v0, v2}, Lcom/unity3d/player/UnityPlayer;->reportSoftInputStr(Ljava/lang/String;I)V

    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 3

    invoke-direct {p0}, Lcom/unity3d/player/p;->a()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    iget-object v1, p0, Lcom/unity3d/player/p;->b:Lcom/unity3d/player/UnityPlayer;

    #v1=(Reference);
    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v1, v0, v2}, Lcom/unity3d/player/UnityPlayer;->reportSoftInputStr(Ljava/lang/String;I)V

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

*/}
