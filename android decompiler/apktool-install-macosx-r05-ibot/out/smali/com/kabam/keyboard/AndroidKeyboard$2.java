package com.kabam.keyboard; class AndroidKeyboard$2 {/*

.class Lcom/kabam/keyboard/AndroidKeyboard$2;
.super Ljava/lang/Object;
.source "AndroidKeyboard.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kabam/keyboard/AndroidKeyboard;->AndroidShowInputBoxAtx(FFFF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kabam/keyboard/AndroidKeyboard;

.field private final synthetic val$height:F

.field private final synthetic val$width:F

.field private final synthetic val$x:F

.field private final synthetic val$y:F


# direct methods
.method constructor <init>(Lcom/kabam/keyboard/AndroidKeyboard;FFFF)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/kabam/keyboard/AndroidKeyboard$2;->this$0:Lcom/kabam/keyboard/AndroidKeyboard;

    iput p2, p0, Lcom/kabam/keyboard/AndroidKeyboard$2;->val$x:F

    iput p3, p0, Lcom/kabam/keyboard/AndroidKeyboard$2;->val$y:F

    iput p4, p0, Lcom/kabam/keyboard/AndroidKeyboard$2;->val$width:F

    iput p5, p0, Lcom/kabam/keyboard/AndroidKeyboard$2;->val$height:F

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    .line 113
    iget v5, p0, Lcom/kabam/keyboard/AndroidKeyboard$2;->val$x:F

    #v5=(Integer);
    float-to-int v3, v5

    .line 114
    .local v3, xx:I
    #v3=(Integer);
    iget v5, p0, Lcom/kabam/keyboard/AndroidKeyboard$2;->val$y:F

    float-to-int v4, v5

    .line 115
    .local v4, yy:I
    #v4=(Integer);
    iget v5, p0, Lcom/kabam/keyboard/AndroidKeyboard$2;->val$width:F

    float-to-int v2, v5

    .line 116
    .local v2, w:I
    #v2=(Integer);
    iget v5, p0, Lcom/kabam/keyboard/AndroidKeyboard$2;->val$height:F

    float-to-int v0, v5

    .line 118
    .local v0, h:I
    #v0=(Integer);
    new-instance v1, Landroid/widget/AbsoluteLayout$LayoutParams;

    #v1=(UninitRef);
    invoke-direct {v1, v2, v0, v3, v4}, Landroid/widget/AbsoluteLayout$LayoutParams;-><init>(IIII)V

    .line 121
    .local v1, params:Landroid/view/ViewGroup$LayoutParams;
    #v1=(Reference);
    iget-object v5, p0, Lcom/kabam/keyboard/AndroidKeyboard$2;->this$0:Lcom/kabam/keyboard/AndroidKeyboard;

    #v5=(Reference);
    iget-object v5, v5, Lcom/kabam/keyboard/AndroidKeyboard;->mText:Landroid/widget/EditText;

    invoke-virtual {v5, v1}, Landroid/widget/EditText;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 123
    const-string v5, "ming AndroidChangeInputBoxAtx"

    const-string v6, "ming AndroidChangeInputBoxAtx end"

    #v6=(Reference);
    invoke-static {v5, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 124
    return-void
.end method

*/}
