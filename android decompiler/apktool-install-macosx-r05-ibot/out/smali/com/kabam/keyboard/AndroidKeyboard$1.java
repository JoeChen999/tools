package com.kabam.keyboard; class AndroidKeyboard$1 {/*

.class Lcom/kabam/keyboard/AndroidKeyboard$1;
.super Ljava/lang/Object;
.source "AndroidKeyboard.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kabam/keyboard/AndroidKeyboard;->CreateText()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kabam/keyboard/AndroidKeyboard;


# direct methods
.method constructor <init>(Lcom/kabam/keyboard/AndroidKeyboard;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/kabam/keyboard/AndroidKeyboard$1;->this$0:Lcom/kabam/keyboard/AndroidKeyboard;

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    const/16 v5, 0x32

    #v5=(PosByte);
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v1, 0x1

    .line 40
    #v1=(One);
    const-string v3, "ming CreateText"

    #v3=(Reference);
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    const-string v0, "ming CreateText 1 mActivity == null"

    #v0=(Reference);
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    iget-object v0, p0, Lcom/kabam/keyboard/AndroidKeyboard$1;->this$0:Lcom/kabam/keyboard/AndroidKeyboard;

    iget-object v0, v0, Lcom/kabam/keyboard/AndroidKeyboard;->mActivity:Landroid/app/Activity;

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    #v0=(Boolean);
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    iget-object v0, p0, Lcom/kabam/keyboard/AndroidKeyboard$1;->this$0:Lcom/kabam/keyboard/AndroidKeyboard;

    new-instance v3, Landroid/widget/EditText;

    #v3=(UninitRef);
    iget-object v4, p0, Lcom/kabam/keyboard/AndroidKeyboard$1;->this$0:Lcom/kabam/keyboard/AndroidKeyboard;

    iget-object v4, v4, Lcom/kabam/keyboard/AndroidKeyboard;->mActivity:Landroid/app/Activity;

    invoke-direct {v3, v4}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    #v3=(Reference);
    iput-object v3, v0, Lcom/kabam/keyboard/AndroidKeyboard;->mText:Landroid/widget/EditText;

    .line 42
    const-string v0, "ming CreateText"

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    const-string v4, "ming CreateText 2 mText == null=>"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    iget-object v4, p0, Lcom/kabam/keyboard/AndroidKeyboard$1;->this$0:Lcom/kabam/keyboard/AndroidKeyboard;

    iget-object v4, v4, Lcom/kabam/keyboard/AndroidKeyboard;->mText:Landroid/widget/EditText;

    if-nez v4, :cond_0

    move v2, v1

    :cond_0
    #v2=(Boolean);
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    iget-object v0, p0, Lcom/kabam/keyboard/AndroidKeyboard$1;->this$0:Lcom/kabam/keyboard/AndroidKeyboard;

    iget-object v0, v0, Lcom/kabam/keyboard/AndroidKeyboard;->mText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->setSingleLine()V

    .line 45
    iget-object v0, p0, Lcom/kabam/keyboard/AndroidKeyboard$1;->this$0:Lcom/kabam/keyboard/AndroidKeyboard;

    iget-object v0, v0, Lcom/kabam/keyboard/AndroidKeyboard;->mText:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setClickable(Z)V

    .line 46
    iget-object v0, p0, Lcom/kabam/keyboard/AndroidKeyboard$1;->this$0:Lcom/kabam/keyboard/AndroidKeyboard;

    iget-object v0, v0, Lcom/kabam/keyboard/AndroidKeyboard;->mActivity:Landroid/app/Activity;

    iget-object v1, p0, Lcom/kabam/keyboard/AndroidKeyboard$1;->this$0:Lcom/kabam/keyboard/AndroidKeyboard;

    #v1=(Reference);
    iget-object v1, v1, Lcom/kabam/keyboard/AndroidKeyboard;->mText:Landroid/widget/EditText;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    #v2=(UninitRef);
    invoke-direct {v2, v5, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 81
    return-void

    :cond_1
    #v1=(One);v2=(Null);
    move v0, v2

    .line 40
    #v0=(Null);
    goto :goto_0
.end method

*/}
