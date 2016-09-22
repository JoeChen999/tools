package com.kabam.keyboard; class AndroidKeyboard$4 {/*

.class Lcom/kabam/keyboard/AndroidKeyboard$4;
.super Ljava/lang/Object;
.source "AndroidKeyboard.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kabam/keyboard/AndroidKeyboard;->AndroidSetInputBoxText(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kabam/keyboard/AndroidKeyboard;

.field private final synthetic val$text:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/kabam/keyboard/AndroidKeyboard;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/kabam/keyboard/AndroidKeyboard$4;->this$0:Lcom/kabam/keyboard/AndroidKeyboard;

    iput-object p2, p0, Lcom/kabam/keyboard/AndroidKeyboard$4;->val$text:Ljava/lang/String;

    .line 159
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 166
    iget-object v0, p0, Lcom/kabam/keyboard/AndroidKeyboard$4;->this$0:Lcom/kabam/keyboard/AndroidKeyboard;

    #v0=(Reference);
    iget-object v0, v0, Lcom/kabam/keyboard/AndroidKeyboard;->mText:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/kabam/keyboard/AndroidKeyboard$4;->val$text:Ljava/lang/String;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 167
    return-void
.end method

*/}
