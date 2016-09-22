package com.kabam.keyboard; class AndroidKeyboard$5 {/*

.class Lcom/kabam/keyboard/AndroidKeyboard$5;
.super Ljava/lang/Object;
.source "AndroidKeyboard.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kabam/keyboard/AndroidKeyboard;->AndroidShowContextMenu()V
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
    iput-object p1, p0, Lcom/kabam/keyboard/AndroidKeyboard$5;->this$0:Lcom/kabam/keyboard/AndroidKeyboard;

    .line 176
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 182
    iget-object v0, p0, Lcom/kabam/keyboard/AndroidKeyboard$5;->this$0:Lcom/kabam/keyboard/AndroidKeyboard;

    #v0=(Reference);
    iget-object v0, v0, Lcom/kabam/keyboard/AndroidKeyboard;->mText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->showContextMenu()Z

    .line 183
    return-void
.end method

*/}
