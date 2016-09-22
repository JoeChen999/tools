package com.kabam.keyboard; class AndroidKeyboard$3 {/*

.class Lcom/kabam/keyboard/AndroidKeyboard$3;
.super Ljava/lang/Object;
.source "AndroidKeyboard.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kabam/keyboard/AndroidKeyboard;->AndroidHideInputBox()V
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
    iput-object p1, p0, Lcom/kabam/keyboard/AndroidKeyboard$3;->this$0:Lcom/kabam/keyboard/AndroidKeyboard;

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 142
    iget-object v1, p0, Lcom/kabam/keyboard/AndroidKeyboard$3;->this$0:Lcom/kabam/keyboard/AndroidKeyboard;

    #v1=(Reference);
    iget-object v1, v1, Lcom/kabam/keyboard/AndroidKeyboard;->mActivity:Landroid/app/Activity;

    const-string v2, "input_method"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 143
    .local v0, manager:Landroid/view/inputmethod/InputMethodManager;
    iget-object v1, p0, Lcom/kabam/keyboard/AndroidKeyboard$3;->this$0:Lcom/kabam/keyboard/AndroidKeyboard;

    iget-object v1, v1, Lcom/kabam/keyboard/AndroidKeyboard;->mText:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x2

    #v2=(PosByte);
    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 144
    return-void
.end method

*/}
