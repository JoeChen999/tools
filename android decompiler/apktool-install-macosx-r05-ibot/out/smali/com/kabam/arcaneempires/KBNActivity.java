package com.kabam.arcaneempires; class KBNActivity {/*

.class public Lcom/kabam/arcaneempires/KBNActivity;
.super Lcom/unity3d/player/UnityPlayerActivity;
.source "KBNActivity.java"


# instance fields
.field mActivity:Landroid/app/Activity;

.field mBuy:Landroid/widget/Button;

.field mCanceled:Landroid/widget/Button;

.field mPurchased:Landroid/widget/Button;

.field mText:Landroid/widget/EditText;

.field mUnavailable:Landroid/widget/Button;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 25
    #v0=(Null);
    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayerActivity;-><init>()V

    .line 27
    #p0=(Reference);
    iput-object v0, p0, Lcom/kabam/arcaneempires/KBNActivity;->mPurchased:Landroid/widget/Button;

    .line 28
    iput-object v0, p0, Lcom/kabam/arcaneempires/KBNActivity;->mCanceled:Landroid/widget/Button;

    .line 29
    iput-object v0, p0, Lcom/kabam/arcaneempires/KBNActivity;->mUnavailable:Landroid/widget/Button;

    .line 31
    iput-object v0, p0, Lcom/kabam/arcaneempires/KBNActivity;->mBuy:Landroid/widget/Button;

    .line 32
    iput-object v0, p0, Lcom/kabam/arcaneempires/KBNActivity;->mText:Landroid/widget/EditText;

    .line 33
    iput-object v0, p0, Lcom/kabam/arcaneempires/KBNActivity;->mActivity:Landroid/app/Activity;

    .line 25
    return-void
.end method


# virtual methods
.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1
    .parameter "event"

    .prologue
    .line 59
    invoke-super {p0, p1}, Lcom/unity3d/player/UnityPlayerActivity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public finish()V
    .locals 0

    .prologue
    .line 64
    invoke-super {p0}, Lcom/unity3d/player/UnityPlayerActivity;->finish()V

    .line 65
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1
    .parameter "requestCode"
    .parameter "resultCode"
    .parameter "data"

    .prologue
    .line 140
    invoke-super {p0, p1, p2, p3}, Lcom/unity3d/player/UnityPlayerActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 141
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0, p1, p2, p3}, Lcom/kabam/utility/Provider;->ProvideFacebookAuthorizeCallBack(IILandroid/content/Intent;)V

    .line 142
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideGooglePlayV3()Lcom/kabam/billing/GooglePlayV3;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/kabam/billing/GooglePlayV3;->OnActivityResult(IILandroid/content/Intent;)V

    .line 143
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .prologue
    .line 41
    const-string v0, "pressed"

    #v0=(Reference);
    const-string v1, "back button pressed."

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .parameter "savedInstanceState"

    .prologue
    .line 73
    invoke-super {p0, p1}, Lcom/unity3d/player/UnityPlayerActivity;->onCreate(Landroid/os/Bundle;)V

    .line 76
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideGooglePlayV3()Lcom/kabam/billing/GooglePlayV3;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kabam/billing/GooglePlayV3;->OnCreate(Landroid/app/Activity;)V

    .line 78
    invoke-static {p0}, Lcom/kabam/billing/BillingInApp;->Create(Landroid/app/Activity;)V

    .line 79
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kabam/utility/Provider;->SetActivity(Landroid/app/Activity;)V

    .line 80
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-static {}, Lcom/kabam/billing/BillingInApp;->Instance()Lcom/kabam/billing/BillingInApp;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/kabam/utility/Provider;->SetBillingInApp(Lcom/kabam/billing/BillingInApp;)V

    .line 82
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideAdwords()Lcom/kabam/ad/Adwords;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kabam/ad/Adwords;->Initialize(Landroid/app/Activity;)V

    .line 83
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideMAT()Lcom/kabam/ad/MATracker;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kabam/ad/MATracker;->Initialize(Landroid/app/Activity;)V

    .line 84
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    const-string v1, "256425107811295"

    invoke-virtual {v0, p0, v1}, Lcom/kabam/utility/Provider;->ProvideNewFacebookSender(Landroid/app/Activity;Ljava/lang/String;)Lcom/kabam/facebook/FacebookSender;

    .line 86
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideTapJoy()Lcom/kabam/tapjoy/TapJoy;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kabam/tapjoy/TapJoy;->OnCreate(Landroid/app/Activity;)V

    .line 87
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kabam/utility/Provider;->ProvideTrackFirstLogin(Landroid/app/Activity;)V

    .line 88
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 106
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideTapJoy()Lcom/kabam/tapjoy/TapJoy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/tapjoy/TapJoy;->OnDestroy()V

    .line 107
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->GetBillingInApp()Lcom/kabam/billing/BillingInApp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/billing/BillingInApp;->UnBind()V

    .line 108
    invoke-super {p0}, Lcom/unity3d/player/UnityPlayerActivity;->onDestroy()V

    .line 109
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideAdwords()Lcom/kabam/ad/Adwords;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/ad/Adwords;->Destroy()V

    .line 110
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideGooglePlayV3()Lcom/kabam/billing/GooglePlayV3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/billing/GooglePlayV3;->OnDestroy()V

    .line 113
    const-string v0, "activity"

    const-string v1, "destroy the activity."

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 114
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2
    .parameter "keyCode"
    .parameter "event"

    .prologue
    .line 125
    const-string v0, "activity"

    #v0=(Reference);
    const-string v1, "on key down begin"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    const/4 v0, 0x4

    #v0=(PosByte);
    if-ne p1, v0, :cond_0

    .line 129
    const-string v0, "activity"

    #v0=(Reference);
    const-string v1, "on key down in"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    const-string v0, ""

    invoke-static {v0}, Lcom/kabam/utility/UnitySender;->SendBackButtonClicked(Ljava/lang/String;)V

    .line 131
    const/4 v0, 0x0

    .line 134
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(PosByte);
    invoke-super {p0, p1, p2}, Lcom/unity3d/player/UnityPlayerActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 118
    invoke-super {p0}, Lcom/unity3d/player/UnityPlayerActivity;->onPause()V

    .line 119
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/kabam/utility/Provider;->ProvideTapJoy()Lcom/kabam/tapjoy/TapJoy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kabam/tapjoy/TapJoy;->OnPause()V

    .line 120
    return-void
.end method

.method public onResume()V
    .locals 3

    .prologue
    .line 93
    invoke-super {p0}, Lcom/unity3d/player/UnityPlayerActivity;->onResume()V

    .line 96
    const-string v0, "activity"

    #v0=(Reference);
    const-string v1, "notified."

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    invoke-static {p0}, Lcom/kabam/ad/AndroidChartboost;->OnResume(Landroid/app/Activity;)V

    .line 101
    new-instance v0, Landroid/view/KeyEvent;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    const/4 v2, 0x7

    #v2=(PosByte);
    invoke-direct {v0, v1, v2}, Landroid/view/KeyEvent;-><init>(II)V

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/kabam/arcaneempires/KBNActivity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 102
    return-void
.end method

*/}
