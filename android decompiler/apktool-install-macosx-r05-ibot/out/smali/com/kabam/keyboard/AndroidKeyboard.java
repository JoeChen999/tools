package com.kabam.keyboard; class AndroidKeyboard {/*

.class public Lcom/kabam/keyboard/AndroidKeyboard;
.super Ljava/lang/Object;
.source "AndroidKeyboard.java"


# instance fields
.field mActivity:Landroid/app/Activity;

.field mText:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1
    .parameter "activity"

    .prologue
    const/4 v0, 0x0

    .line 18
    #v0=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    #p0=(Reference);
    iput-object v0, p0, Lcom/kabam/keyboard/AndroidKeyboard;->mText:Landroid/widget/EditText;

    .line 17
    iput-object v0, p0, Lcom/kabam/keyboard/AndroidKeyboard;->mActivity:Landroid/app/Activity;

    .line 20
    iput-object p1, p0, Lcom/kabam/keyboard/AndroidKeyboard;->mActivity:Landroid/app/Activity;

    .line 21
    invoke-direct {p0}, Lcom/kabam/keyboard/AndroidKeyboard;->CreateText()V

    .line 22
    return-void
.end method

.method private CreateText()V
    .locals 4

    .prologue
    .line 26
    const-string v2, "ming CreateText"

    #v2=(Reference);
    const-string v3, "ming CreateText begin"

    #v3=(Reference);
    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    iget-object v2, p0, Lcom/kabam/keyboard/AndroidKeyboard;->mActivity:Landroid/app/Activity;

    if-nez v2, :cond_0

    .line 96
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    .line 34
    :cond_0
    :try_start_0
    #v0=(Uninit);v1=(Uninit);
    new-instance v0, Lcom/kabam/keyboard/AndroidKeyboard$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/kabam/keyboard/AndroidKeyboard$1;-><init>(Lcom/kabam/keyboard/AndroidKeyboard;)V

    .line 84
    .local v0, action:Ljava/lang/Runnable;
    #v0=(Reference);
    iget-object v2, p0, Lcom/kabam/keyboard/AndroidKeyboard;->mActivity:Landroid/app/Activity;

    invoke-virtual {v2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    .end local v0           #action:Ljava/lang/Runnable;
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);
    const-string v2, "ming CreateText"

    const-string v3, "ming CreateText end"

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 86
    :catch_0
    #v1=(Uninit);
    move-exception v1

    .line 88
    .local v1, ex:Ljava/lang/Exception;
    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1
.end method


# virtual methods
.method public AndroidChangeInputBoxAtx(FFFF)V
    .locals 2
    .parameter "x"
    .parameter "y"
    .parameter "width"
    .parameter "height"

    .prologue
    .line 100
    const-string v0, "ming AndroidShowInputBoxAtx"

    #v0=(Reference);
    const-string v1, "ming AndroidShowInputBoxAtx begin"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/kabam/keyboard/AndroidKeyboard;->AndroidShowInputBoxAtx(FFFF)V

    .line 102
    const-string v0, "ming AndroidShowInputBoxAtx"

    const-string v1, "ming AndroidShowInputBoxAtx end"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 104
    return-void
.end method

.method public AndroidGetInputBoxText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 154
    iget-object v0, p0, Lcom/kabam/keyboard/AndroidKeyboard;->mText:Landroid/widget/EditText;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public AndroidHideInputBox()V
    .locals 2

    .prologue
    .line 135
    new-instance v0, Lcom/kabam/keyboard/AndroidKeyboard$3;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/kabam/keyboard/AndroidKeyboard$3;-><init>(Lcom/kabam/keyboard/AndroidKeyboard;)V

    .line 148
    .local v0, action:Ljava/lang/Runnable;
    #v0=(Reference);
    iget-object v1, p0, Lcom/kabam/keyboard/AndroidKeyboard;->mActivity:Landroid/app/Activity;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 150
    return-void
.end method

.method public AndroidSetInputBoxText(Ljava/lang/String;)V
    .locals 2
    .parameter "text"

    .prologue
    .line 159
    new-instance v0, Lcom/kabam/keyboard/AndroidKeyboard$4;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p1}, Lcom/kabam/keyboard/AndroidKeyboard$4;-><init>(Lcom/kabam/keyboard/AndroidKeyboard;Ljava/lang/String;)V

    .line 171
    .local v0, action:Ljava/lang/Runnable;
    #v0=(Reference);
    iget-object v1, p0, Lcom/kabam/keyboard/AndroidKeyboard;->mActivity:Landroid/app/Activity;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 173
    return-void
.end method

.method public AndroidShowContextMenu()V
    .locals 2

    .prologue
    .line 176
    new-instance v0, Lcom/kabam/keyboard/AndroidKeyboard$5;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/kabam/keyboard/AndroidKeyboard$5;-><init>(Lcom/kabam/keyboard/AndroidKeyboard;)V

    .line 185
    .local v0, action:Ljava/lang/Runnable;
    #v0=(Reference);
    iget-object v1, p0, Lcom/kabam/keyboard/AndroidKeyboard;->mActivity:Landroid/app/Activity;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 186
    return-void
.end method

.method public AndroidShowInputBoxAtx(FFFF)V
    .locals 6
    .parameter "x"
    .parameter "y"
    .parameter "width"
    .parameter "height"

    .prologue
    .line 108
    new-instance v0, Lcom/kabam/keyboard/AndroidKeyboard$2;

    #v0=(UninitRef);
    move-object v1, p0

    #v1=(Reference);
    move v2, p1

    #v2=(Float);
    move v3, p2

    #v3=(Float);
    move v4, p3

    #v4=(Float);
    move v5, p4

    #v5=(Float);
    invoke-direct/range {v0 .. v5}, Lcom/kabam/keyboard/AndroidKeyboard$2;-><init>(Lcom/kabam/keyboard/AndroidKeyboard;FFFF)V

    .line 128
    .local v0, action:Ljava/lang/Runnable;
    #v0=(Reference);
    iget-object v1, p0, Lcom/kabam/keyboard/AndroidKeyboard;->mActivity:Landroid/app/Activity;

    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 131
    return-void
.end method

.method public GetHeight()I
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Lcom/kabam/keyboard/AndroidKeyboard;->mText:Landroid/widget/EditText;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 191
    iget-object v0, p0, Lcom/kabam/keyboard/AndroidKeyboard;->mText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getHeight()I

    move-result v0

    .line 192
    :goto_0
    #v0=(Integer);
    return v0

    :cond_0
    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

*/}
