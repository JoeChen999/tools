package com.kabam.playv3; class IabHelper {/*

.class public Lcom/kabam/playv3/IabHelper;
.super Ljava/lang/Object;
.source "IabHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kabam/playv3/IabHelper$OnConsumeFinishedListener;,
        Lcom/kabam/playv3/IabHelper$OnConsumeMultiFinishedListener;,
        Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;,
        Lcom/kabam/playv3/IabHelper$OnIabSetupFinishedListener;,
        Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;
    }
.end annotation


# static fields
.field public static final BILLING_RESPONSE_RESULT_BILLING_UNAVAILABLE:I = 0x3

.field public static final BILLING_RESPONSE_RESULT_DEVELOPER_ERROR:I = 0x5

.field public static final BILLING_RESPONSE_RESULT_ERROR:I = 0x6

.field public static final BILLING_RESPONSE_RESULT_ITEM_ALREADY_OWNED:I = 0x7

.field public static final BILLING_RESPONSE_RESULT_ITEM_NOT_OWNED:I = 0x8

.field public static final BILLING_RESPONSE_RESULT_ITEM_UNAVAILABLE:I = 0x4

.field public static final BILLING_RESPONSE_RESULT_OK:I = 0x0

.field public static final BILLING_RESPONSE_RESULT_USER_CANCELED:I = -0x3ed

.field public static final GET_SKU_DETAILS_ITEM_LIST:Ljava/lang/String; = "ITEM_ID_LIST"

.field public static final GET_SKU_DETAILS_ITEM_TYPE_LIST:Ljava/lang/String; = "ITEM_TYPE_LIST"

.field public static final IABHELPER_BAD_RESPONSE:I = -0x3ea

.field public static final IABHELPER_ERROR_BASE:I = -0x3e8

.field public static final IABHELPER_MISSING_TOKEN:I = -0x3ef

.field public static final IABHELPER_REMOTE_EXCEPTION:I = -0x3e9

.field public static final IABHELPER_SEND_INTENT_FAILED:I = -0x3ec

.field public static final IABHELPER_UNKNOWN_ERROR:I = -0x3f0

.field public static final IABHELPER_UNKNOWN_PURCHASE_RESPONSE:I = -0x3ee

.field public static final IABHELPER_USER_CANCELLED:I = -0x3ed

.field public static final IABHELPER_VERIFICATION_FAILED:I = -0x3eb

.field public static final INAPP_CONTINUATION_TOKEN:Ljava/lang/String; = "INAPP_CONTINUATION_TOKEN"

.field public static final ITEM_TYPE_INAPP:Ljava/lang/String; = "inapp"

.field public static final RESPONSE_BUY_INTENT:Ljava/lang/String; = "BUY_INTENT"

.field public static final RESPONSE_CODE:Ljava/lang/String; = "RESPONSE_CODE"

.field public static final RESPONSE_GET_SKU_DETAILS_LIST:Ljava/lang/String; = "DETAILS_LIST"

.field public static final RESPONSE_INAPP_ITEM_LIST:Ljava/lang/String; = "INAPP_PURCHASE_ITEM_LIST"

.field public static final RESPONSE_INAPP_PURCHASE_DATA:Ljava/lang/String; = "INAPP_PURCHASE_DATA"

.field public static final RESPONSE_INAPP_PURCHASE_DATA_LIST:Ljava/lang/String; = "INAPP_PURCHASE_DATA_LIST"

.field public static final RESPONSE_INAPP_SIGNATURE:Ljava/lang/String; = "INAPP_DATA_SIGNATURE"

.field public static final RESPONSE_INAPP_SIGNATURE_LIST:Ljava/lang/String; = "INAPP_DATA_SIGNATURE_LIST"


# instance fields
.field mAsyncInProgress:Z

.field mAsyncOperation:Ljava/lang/String;

.field mContext:Landroid/content/Context;

.field mDebugLog:Z

.field mDebugTag:Ljava/lang/String;

.field mPurchaseListener:Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;

.field mRequestCode:I

.field mService:Lcom/android/vending/billing/IInAppBillingService;

.field mServiceConn:Landroid/content/ServiceConnection;

.field mSetupDone:Z

.field mSignatureBase64:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .parameter "ctx"

    .prologue
    const/4 v1, 0x0

    .line 173
    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    #p0=(Reference);
    iput-boolean v1, p0, Lcom/kabam/playv3/IabHelper;->mDebugLog:Z

    .line 92
    const-string v0, "IabHelper"

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/playv3/IabHelper;->mDebugTag:Ljava/lang/String;

    .line 95
    iput-boolean v1, p0, Lcom/kabam/playv3/IabHelper;->mSetupDone:Z

    .line 99
    iput-boolean v1, p0, Lcom/kabam/playv3/IabHelper;->mAsyncInProgress:Z

    .line 103
    const-string v0, ""

    iput-object v0, p0, Lcom/kabam/playv3/IabHelper;->mAsyncOperation:Ljava/lang/String;

    .line 116
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/kabam/playv3/IabHelper;->mSignatureBase64:Ljava/lang/String;

    .line 175
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/playv3/IabHelper;->mContext:Landroid/content/Context;

    .line 176
    const-string v0, "Ming Cai\'s public key."

    iput-object v0, p0, Lcom/kabam/playv3/IabHelper;->mSignatureBase64:Ljava/lang/String;

    .line 177
    const-string v0, "IAB helper created."

    invoke-virtual {p0, v0}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 178
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2
    .parameter "ctx"
    .parameter "base64PublicKey"

    .prologue
    const/4 v1, 0x0

    .line 168
    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    #p0=(Reference);
    iput-boolean v1, p0, Lcom/kabam/playv3/IabHelper;->mDebugLog:Z

    .line 92
    const-string v0, "IabHelper"

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/playv3/IabHelper;->mDebugTag:Ljava/lang/String;

    .line 95
    iput-boolean v1, p0, Lcom/kabam/playv3/IabHelper;->mSetupDone:Z

    .line 99
    iput-boolean v1, p0, Lcom/kabam/playv3/IabHelper;->mAsyncInProgress:Z

    .line 103
    const-string v0, ""

    iput-object v0, p0, Lcom/kabam/playv3/IabHelper;->mAsyncOperation:Ljava/lang/String;

    .line 116
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/kabam/playv3/IabHelper;->mSignatureBase64:Ljava/lang/String;

    .line 169
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/playv3/IabHelper;->mContext:Landroid/content/Context;

    .line 170
    const-string v0, "Ming Cai\'s public key."

    iput-object v0, p0, Lcom/kabam/playv3/IabHelper;->mSignatureBase64:Ljava/lang/String;

    .line 171
    const-string v0, "IAB helper created."

    invoke-virtual {p0, v0}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 172
    return-void
.end method

.method private RecordPurchase(Lcom/kabam/playv3/Inventory;Lcom/kabam/playv3/Purchase;Ljava/lang/String;)V
    .locals 2
    .parameter "inv"
    .parameter "purchase"
    .parameter "purchaseData"

    .prologue
    .line 924
    invoke-virtual {p2}, Lcom/kabam/playv3/Purchase;->getToken()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 926
    const-string v0, "BUG: empty/null token!"

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/kabam/playv3/IabHelper;->logWarn(Ljava/lang/String;)V

    .line 927
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    const-string v1, "Purchase data: "

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 931
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    invoke-virtual {p1, p2}, Lcom/kabam/playv3/Inventory;->addPurchase(Lcom/kabam/playv3/Purchase;)V

    .line 932
    return-void
.end method

.method public static getResponseDesc(I)Ljava/lang/String;
    .locals 5
    .parameter "code"

    .prologue
    .line 744
    const-string v3, "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned"

    .line 747
    #v3=(Reference);
    const-string v4, "/"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 748
    .local v0, iab_msgs:[Ljava/lang/String;
    #v0=(Reference);
    const-string v3, "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error"

    .line 755
    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 757
    .local v1, iabhelper_msgs:[Ljava/lang/String;
    #v1=(Reference);
    const/16 v3, -0x3e8

    #v3=(Short);
    if-gt p0, v3, :cond_1

    .line 759
    rsub-int v2, p0, -0x3e8

    .line 760
    .local v2, index:I
    #v2=(Integer);
    if-ltz v2, :cond_0

    array-length v3, v1

    #v3=(Integer);
    if-ge v2, v3, :cond_0

    aget-object v3, v1, v2

    .line 766
    .end local v2           #index:I
    :goto_0
    #v2=(Conflicted);v3=(Reference);
    return-object v3

    .line 761
    .restart local v2       #index:I
    :cond_0
    #v2=(Integer);v3=(Integer);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    const-string v4, ":Unknown IAB Helper Error"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 763
    .end local v2           #index:I
    :cond_1
    #v2=(Uninit);v3=(Short);
    if-ltz p0, :cond_2

    array-length v3, v0

    #v3=(Integer);
    if-lt p0, v3, :cond_3

    .line 764
    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    const-string v4, ":Unknown"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 766
    :cond_3
    #v3=(Integer);
    aget-object v3, v0, p0

    #v3=(Null);
    goto :goto_0
.end method


# virtual methods
.method checkSetupDone(Ljava/lang/String;)V
    .locals 4
    .parameter "operation"

    .prologue
    .line 775
    :try_start_0
    iget-boolean v1, p0, Lcom/kabam/playv3/IabHelper;->mSetupDone:Z

    #v1=(Boolean);
    if-nez v1, :cond_0

    .line 777
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "Illegal state for operation ("

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "): IAB helper is not set up."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/kabam/playv3/IabHelper;->logError(Ljava/lang/String;)V

    .line 778
    new-instance v1, Ljava/lang/IllegalStateException;

    #v1=(UninitRef);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "IAB helper is not set up. Can\'t perform operation: "

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 781
    :catch_0
    move-exception v0

    .line 783
    .local v0, ex:Ljava/lang/Exception;
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 785
    .end local v0           #ex:Ljava/lang/Exception;
    :cond_0
    #v0=(Conflicted);
    return-void
.end method

.method consume(Lcom/kabam/playv3/Purchase;)V
    .locals 8
    .parameter "itemInfo"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/kabam/playv3/IabException;
        }
    .end annotation

    .prologue
    .line 643
    const-string v4, "consume"

    #v4=(Reference);
    invoke-virtual {p0, v4}, Lcom/kabam/playv3/IabHelper;->checkSetupDone(Ljava/lang/String;)V

    .line 646
    :try_start_0
    invoke-virtual {p1}, Lcom/kabam/playv3/Purchase;->getToken()Ljava/lang/String;

    move-result-object v3

    .line 647
    .local v3, token:Ljava/lang/String;
    #v3=(Reference);
    invoke-virtual {p1}, Lcom/kabam/playv3/Purchase;->getSku()Ljava/lang/String;

    move-result-object v2

    .line 648
    .local v2, sku:Ljava/lang/String;
    #v2=(Reference);
    if-eqz v3, :cond_0

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_1

    .line 650
    :cond_0
    #v4=(Conflicted);
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    const-string v5, "Can\'t consume "

    #v5=(Reference);
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ". No token."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Lcom/kabam/playv3/IabHelper;->logError(Ljava/lang/String;)V

    .line 651
    new-instance v4, Lcom/kabam/playv3/IabException;

    #v4=(UninitRef);
    const/16 v5, -0x3ef

    #v5=(Short);
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    const-string v7, "PurchaseInfo is missing token for sku: "

    #v7=(Reference);
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 652
    #v6=(Reference);
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 651
    invoke-direct {v4, v5, v6}, Lcom/kabam/playv3/IabException;-><init>(ILjava/lang/String;)V

    #v4=(Reference);
    throw v4
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 667
    .end local v2           #sku:Ljava/lang/String;
    .end local v3           #token:Ljava/lang/String;
    :catch_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move-exception v0

    .line 669
    .local v0, e:Landroid/os/RemoteException;
    #v0=(Reference);
    new-instance v4, Lcom/kabam/playv3/IabException;

    #v4=(UninitRef);
    const/16 v5, -0x3e9

    #v5=(Short);
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    const-string v7, "Remote exception while consuming. PurchaseInfo: "

    #v7=(Reference);
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v6=(Reference);
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6, v0}, Lcom/kabam/playv3/IabException;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    #v4=(Reference);
    throw v4

    .line 655
    .end local v0           #e:Landroid/os/RemoteException;
    .restart local v2       #sku:Ljava/lang/String;
    .restart local v3       #token:Ljava/lang/String;
    :cond_1
    :try_start_1
    #v0=(Uninit);v1=(Uninit);v2=(Reference);v3=(Reference);v4=(Boolean);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    const-string v5, "Consuming sku: "

    #v5=(Reference);
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ", token: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 656
    iget-object v4, p0, Lcom/kabam/playv3/IabHelper;->mService:Lcom/android/vending/billing/IInAppBillingService;

    const/4 v5, 0x3

    #v5=(PosByte);
    iget-object v6, p0, Lcom/kabam/playv3/IabHelper;->mContext:Landroid/content/Context;

    #v6=(Reference);
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6, v3}, Lcom/android/vending/billing/IInAppBillingService;->consumePurchase(ILjava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 657
    .local v1, response:I
    #v1=(Integer);
    if-nez v1, :cond_2

    .line 659
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    const-string v5, "Successfully consumed sku: "

    #v5=(Reference);
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 671
    return-void

    .line 663
    :cond_2
    #v5=(PosByte);
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    const-string v5, "Error consuming consuming sku "

    #v5=(Reference);
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ". "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v1}, Lcom/kabam/playv3/IabHelper;->getResponseDesc(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 664
    new-instance v4, Lcom/kabam/playv3/IabException;

    #v4=(UninitRef);
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    const-string v6, "Error consuming sku "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v1, v5}, Lcom/kabam/playv3/IabException;-><init>(ILjava/lang/String;)V

    #v4=(Reference);
    throw v4
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
.end method

.method public consumeAsync(Lcom/kabam/playv3/Purchase;Lcom/kabam/playv3/IabHelper$OnConsumeFinishedListener;Landroid/app/Activity;)V
    .locals 5
    .parameter "purchase"
    .parameter "listener"
    .parameter "activity"

    .prologue
    .line 712
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v2

    #v2=(Reference);
    const-string v3, "consumeAsync"

    #v3=(Reference);
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    const-string v1, "purchase==null is "

    #v1=(Reference);
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    if-nez p1, :cond_1

    const/4 v1, 0x1

    :goto_0
    #v1=(Boolean);
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 713
    if-eqz p1, :cond_0

    .line 714
    invoke-virtual {p1}, Lcom/kabam/playv3/Purchase;->LogPurchase()V

    .line 716
    :cond_0
    const-string v1, "consume"

    invoke-virtual {p0, v1}, Lcom/kabam/playv3/IabHelper;->checkSetupDone(Ljava/lang/String;)V

    .line 717
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 718
    .local v0, purchases:Ljava/util/List;,"Ljava/util/List<Lcom/kabam/playv3/Purchase;>;"
    #v0=(Reference);
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 719
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p0, v0, p2, v1, p3}, Lcom/kabam/playv3/IabHelper;->consumeAsyncInternal(Ljava/util/List;Lcom/kabam/playv3/IabHelper$OnConsumeFinishedListener;Lcom/kabam/playv3/IabHelper$OnConsumeMultiFinishedListener;Landroid/app/Activity;)V

    .line 720
    return-void

    .line 712
    .end local v0           #purchases:Ljava/util/List;,"Ljava/util/List<Lcom/kabam/playv3/Purchase;>;"
    :cond_1
    #v0=(Uninit);v1=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0
.end method

.method public consumeAsync(Ljava/util/List;Lcom/kabam/playv3/IabHelper$OnConsumeMultiFinishedListener;Landroid/app/Activity;)V
    .locals 4
    .parameter
    .parameter "listener"
    .parameter "activity"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/kabam/playv3/Purchase;",
            ">;",
            "Lcom/kabam/playv3/IabHelper$OnConsumeMultiFinishedListener;",
            "Landroid/app/Activity;",
            ")V"
        }
    .end annotation

    .prologue
    .line 729
    .local p1, purchases:Ljava/util/List;,"Ljava/util/List<Lcom/kabam/playv3/Purchase;>;"
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "consumeAsync"

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    const-string v0, "multiple purchase==null is "

    #v0=(Reference);
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    if-nez p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 731
    const-string v0, "consume"

    invoke-virtual {p0, v0}, Lcom/kabam/playv3/IabHelper;->checkSetupDone(Ljava/lang/String;)V

    .line 732
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, p1, v0, p2, p3}, Lcom/kabam/playv3/IabHelper;->consumeAsyncInternal(Ljava/util/List;Lcom/kabam/playv3/IabHelper$OnConsumeFinishedListener;Lcom/kabam/playv3/IabHelper$OnConsumeMultiFinishedListener;Landroid/app/Activity;)V

    .line 733
    return-void

    .line 729
    :cond_0
    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method consumeAsyncInternal(Ljava/util/List;Lcom/kabam/playv3/IabHelper$OnConsumeFinishedListener;Lcom/kabam/playv3/IabHelper$OnConsumeMultiFinishedListener;Landroid/app/Activity;)V
    .locals 2
    .parameter
    .parameter "singleListener"
    .parameter "multiListener"
    .parameter "activity"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/kabam/playv3/Purchase;",
            ">;",
            "Lcom/kabam/playv3/IabHelper$OnConsumeFinishedListener;",
            "Lcom/kabam/playv3/IabHelper$OnConsumeMultiFinishedListener;",
            "Landroid/app/Activity;",
            ")V"
        }
    .end annotation

    .prologue
    .line 985
    .local p1, purchases:Ljava/util/List;,"Ljava/util/List<Lcom/kabam/playv3/Purchase;>;"
    const-string v1, "consume"

    #v1=(Reference);
    invoke-virtual {p0, v1}, Lcom/kabam/playv3/IabHelper;->flagStartAsync(Ljava/lang/String;)V

    .line 986
    new-instance v0, Lcom/kabam/playv3/IabHelper$3;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/kabam/playv3/IabHelper$3;-><init>(Lcom/kabam/playv3/IabHelper;Ljava/util/List;Lcom/kabam/playv3/IabHelper$OnConsumeFinishedListener;Lcom/kabam/playv3/IabHelper$OnConsumeMultiFinishedListener;)V

    .line 1029
    .local v0, action:Ljava/lang/Runnable;
    #v0=(Reference);
    invoke-virtual {p4, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1031
    return-void
.end method

.method public dispose()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 274
    #v2=(Null);
    const-string v0, "Disposing."

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 275
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/kabam/playv3/IabHelper;->mSetupDone:Z

    .line 276
    iget-object v0, p0, Lcom/kabam/playv3/IabHelper;->mServiceConn:Landroid/content/ServiceConnection;

    #v0=(Reference);
    if-eqz v0, :cond_1

    .line 278
    const-string v0, "Unbinding from service."

    invoke-virtual {p0, v0}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 279
    iget-object v0, p0, Lcom/kabam/playv3/IabHelper;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kabam/playv3/IabHelper;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/kabam/playv3/IabHelper;->mServiceConn:Landroid/content/ServiceConnection;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 280
    :cond_0
    #v1=(Conflicted);
    iput-object v2, p0, Lcom/kabam/playv3/IabHelper;->mServiceConn:Landroid/content/ServiceConnection;

    .line 281
    iput-object v2, p0, Lcom/kabam/playv3/IabHelper;->mService:Lcom/android/vending/billing/IInAppBillingService;

    .line 282
    iput-object v2, p0, Lcom/kabam/playv3/IabHelper;->mPurchaseListener:Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;

    .line 284
    :cond_1
    return-void
.end method

.method public enableDebugLogging(Z)V
    .locals 0
    .parameter "enable"

    .prologue
    .line 189
    iput-boolean p1, p0, Lcom/kabam/playv3/IabHelper;->mDebugLog:Z

    .line 190
    return-void
.end method

.method public enableDebugLogging(ZLjava/lang/String;)V
    .locals 0
    .parameter "enable"
    .parameter "tag"

    .prologue
    .line 184
    iput-boolean p1, p0, Lcom/kabam/playv3/IabHelper;->mDebugLog:Z

    .line 185
    iput-object p2, p0, Lcom/kabam/playv3/IabHelper;->mDebugTag:Ljava/lang/String;

    .line 186
    return-void
.end method

.method flagEndAsync()V
    .locals 2

    .prologue
    .line 837
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    const-string v1, "Ending async operation: "

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    iget-object v1, p0, Lcom/kabam/playv3/IabHelper;->mAsyncOperation:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 838
    const-string v0, ""

    iput-object v0, p0, Lcom/kabam/playv3/IabHelper;->mAsyncOperation:Ljava/lang/String;

    .line 839
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/kabam/playv3/IabHelper;->mAsyncInProgress:Z

    .line 840
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    const-string v1, "Ending async operation: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    iget-object v1, p0, Lcom/kabam/playv3/IabHelper;->mAsyncOperation:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 841
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    const-string v1, "Ending async operation: mAsyncInProgress"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    iget-boolean v1, p0, Lcom/kabam/playv3/IabHelper;->mAsyncInProgress:Z

    #v1=(Boolean);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 842
    return-void
.end method

.method flagStartAsync(Ljava/lang/String;)V
    .locals 3
    .parameter "operation"

    .prologue
    .line 827
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "Can\'t start async operation ("

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") because another async operation("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/kabam/playv3/IabHelper;->mAsyncOperation:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") is in progress."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 828
    .local v0, s:Ljava/lang/String;
    #v0=(Reference);
    iget-boolean v1, p0, Lcom/kabam/playv3/IabHelper;->mAsyncInProgress:Z

    #v1=(Boolean);
    if-eqz v1, :cond_0

    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "flagStartAsync"

    invoke-virtual {v1, v2, v0}, Lcom/kabam/utility/Provider;->ProvideLog(Ljava/lang/String;Ljava/lang/String;)V

    .line 830
    :cond_0
    #v1=(Conflicted);
    iput-object p1, p0, Lcom/kabam/playv3/IabHelper;->mAsyncOperation:Ljava/lang/String;

    .line 831
    const/4 v1, 0x1

    #v1=(One);
    iput-boolean v1, p0, Lcom/kabam/playv3/IabHelper;->mAsyncInProgress:Z

    .line 832
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "Starting async operation: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 833
    return-void
.end method

.method getResponseCodeFromBundle(Landroid/os/Bundle;)I
    .locals 4
    .parameter "b"

    .prologue
    .line 790
    const-string v1, "RESPONSE_CODE"

    #v1=(Reference);
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 791
    .local v0, o:Ljava/lang/Object;
    #v0=(Reference);
    if-nez v0, :cond_0

    .line 793
    const-string v1, "Bundle with null response code, assuming OK (known issue)"

    invoke-virtual {p0, v1}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 794
    const/4 v1, 0x0

    .line 797
    .end local v0           #o:Ljava/lang/Object;
    :goto_0
    #v1=(Integer);v2=(Conflicted);
    return v1

    .line 796
    .restart local v0       #o:Ljava/lang/Object;
    :cond_0
    #v1=(Reference);v2=(Uninit);
    instance-of v1, v0, Ljava/lang/Integer;

    #v1=(Boolean);
    if-eqz v1, :cond_1

    check-cast v0, Ljava/lang/Integer;

    .end local v0           #o:Ljava/lang/Object;
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    #v1=(Integer);
    goto :goto_0

    .line 797
    .restart local v0       #o:Ljava/lang/Object;
    :cond_1
    #v1=(Boolean);
    instance-of v1, v0, Ljava/lang/Long;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/Long;

    .end local v0           #o:Ljava/lang/Object;
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    #v1=(LongLo);v2=(LongHi);
    long-to-int v1, v1

    #v1=(Integer);
    goto :goto_0

    .line 800
    .restart local v0       #o:Ljava/lang/Object;
    :cond_2
    #v1=(Boolean);v2=(Uninit);
    const-string v1, "Unexpected type for bundle response code."

    #v1=(Reference);
    invoke-virtual {p0, v1}, Lcom/kabam/playv3/IabHelper;->logError(Ljava/lang/String;)V

    .line 801
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/kabam/playv3/IabHelper;->logError(Ljava/lang/String;)V

    .line 802
    new-instance v1, Ljava/lang/RuntimeException;

    #v1=(UninitRef);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "Unexpected type for bundle response code: "

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    throw v1
.end method

.method getResponseCodeFromIntent(Landroid/content/Intent;)I
    .locals 4
    .parameter "i"

    .prologue
    .line 809
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "RESPONSE_CODE"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 810
    .local v0, o:Ljava/lang/Object;
    #v0=(Reference);
    if-nez v0, :cond_0

    .line 812
    const-string v1, "Intent with no response code, assuming OK (known issue)"

    invoke-virtual {p0, v1}, Lcom/kabam/playv3/IabHelper;->logError(Ljava/lang/String;)V

    .line 813
    const/4 v1, 0x0

    .line 816
    .end local v0           #o:Ljava/lang/Object;
    :goto_0
    #v1=(Integer);v2=(Conflicted);
    return v1

    .line 815
    .restart local v0       #o:Ljava/lang/Object;
    :cond_0
    #v1=(Reference);v2=(Reference);
    instance-of v1, v0, Ljava/lang/Integer;

    #v1=(Boolean);
    if-eqz v1, :cond_1

    check-cast v0, Ljava/lang/Integer;

    .end local v0           #o:Ljava/lang/Object;
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    #v1=(Integer);
    goto :goto_0

    .line 816
    .restart local v0       #o:Ljava/lang/Object;
    :cond_1
    #v1=(Boolean);
    instance-of v1, v0, Ljava/lang/Long;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/Long;

    .end local v0           #o:Ljava/lang/Object;
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    #v1=(LongLo);v2=(LongHi);
    long-to-int v1, v1

    #v1=(Integer);
    goto :goto_0

    .line 819
    .restart local v0       #o:Ljava/lang/Object;
    :cond_2
    #v1=(Boolean);v2=(Reference);
    const-string v1, "Unexpected type for intent response code."

    #v1=(Reference);
    invoke-virtual {p0, v1}, Lcom/kabam/playv3/IabHelper;->logError(Ljava/lang/String;)V

    .line 820
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/kabam/playv3/IabHelper;->logError(Ljava/lang/String;)V

    .line 821
    new-instance v1, Ljava/lang/RuntimeException;

    #v1=(UninitRef);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "Unexpected type for intent response code: "

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    throw v1
.end method

.method public handleActivityResult(IILandroid/content/Intent;)Z
    .locals 10
    .parameter "requestCode"
    .parameter "resultCode"
    .parameter "data"

    .prologue
    .line 401
    iget v8, p0, Lcom/kabam/playv3/IabHelper;->mRequestCode:I

    #v8=(Integer);
    if-eq p1, v8, :cond_0

    const/4 v8, 0x0

    .line 500
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Boolean);v9=(Conflicted);
    return v8

    .line 403
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Integer);v9=(Uninit);
    const-string v8, "handleActivityResult"

    #v8=(Reference);
    invoke-virtual {p0, v8}, Lcom/kabam/playv3/IabHelper;->checkSetupDone(Ljava/lang/String;)V

    .line 406
    invoke-virtual {p0}, Lcom/kabam/playv3/IabHelper;->flagEndAsync()V

    .line 408
    if-nez p3, :cond_2

    .line 410
    const-string v8, "Null data in IAB activity result."

    invoke-virtual {p0, v8}, Lcom/kabam/playv3/IabHelper;->logError(Ljava/lang/String;)V

    .line 411
    new-instance v6, Lcom/kabam/playv3/IabResult;

    #v6=(UninitRef);
    const/16 v8, -0x3ea

    #v8=(Short);
    const-string v9, "Null data in IAB result"

    #v9=(Reference);
    invoke-direct {v6, v8, v9}, Lcom/kabam/playv3/IabResult;-><init>(ILjava/lang/String;)V

    .line 412
    .local v6, result:Lcom/kabam/playv3/IabResult;
    #v6=(Reference);
    iget-object v8, p0, Lcom/kabam/playv3/IabHelper;->mPurchaseListener:Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;

    #v8=(Reference);
    if-eqz v8, :cond_1

    iget-object v8, p0, Lcom/kabam/playv3/IabHelper;->mPurchaseListener:Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;

    const/4 v9, 0x0

    #v9=(Null);
    invoke-interface {v8, v6, v9}, Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;->onIabPurchaseFinished(Lcom/kabam/playv3/IabResult;Lcom/kabam/playv3/Purchase;)V

    .line 413
    :cond_1
    #v9=(Reference);
    const/4 v8, 0x1

    #v8=(One);
    goto :goto_0

    .line 416
    .end local v6           #result:Lcom/kabam/playv3/IabResult;
    :cond_2
    #v6=(Uninit);v8=(Reference);v9=(Uninit);
    invoke-virtual {p0, p3}, Lcom/kabam/playv3/IabHelper;->getResponseCodeFromIntent(Landroid/content/Intent;)I

    move-result v5

    .line 417
    .local v5, responseCode:I
    #v5=(Integer);
    const-string v8, "INAPP_PURCHASE_DATA"

    invoke-virtual {p3, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 418
    .local v4, purchaseData:Ljava/lang/String;
    #v4=(Reference);
    const-string v8, "INAPP_DATA_SIGNATURE"

    invoke-virtual {p3, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 420
    .local v0, dataSignature:Ljava/lang/String;
    #v0=(Reference);
    const/4 v8, -0x1

    #v8=(Byte);
    if-ne p2, v8, :cond_7

    if-nez v5, :cond_7

    .line 422
    const-string v8, "Successful resultcode from purchase activity."

    #v8=(Reference);
    invoke-virtual {p0, v8}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 423
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    const-string v9, "Purchase data: "

    #v9=(Reference);
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v8=(Reference);
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0, v8}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 424
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    const-string v9, "Data signature: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v8=(Reference);
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0, v8}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 425
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    const-string v9, "Extras: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v8=(Reference);
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0, v8}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 427
    if-eqz v4, :cond_3

    if-nez v0, :cond_5

    .line 429
    :cond_3
    const-string v8, "BUG: either purchaseData or dataSignature is null."

    invoke-virtual {p0, v8}, Lcom/kabam/playv3/IabHelper;->logError(Ljava/lang/String;)V

    .line 430
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    const-string v9, "Extras: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v8=(Reference);
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v9

    invoke-virtual {v9}, Landroid/os/Bundle;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0, v8}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 431
    new-instance v6, Lcom/kabam/playv3/IabResult;

    #v6=(UninitRef);
    const/16 v8, -0x3f0

    #v8=(Short);
    const-string v9, "IAB returned null purchaseData or dataSignature"

    invoke-direct {v6, v8, v9}, Lcom/kabam/playv3/IabResult;-><init>(ILjava/lang/String;)V

    .line 432
    .restart local v6       #result:Lcom/kabam/playv3/IabResult;
    #v6=(Reference);
    iget-object v8, p0, Lcom/kabam/playv3/IabHelper;->mPurchaseListener:Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;

    #v8=(Reference);
    if-eqz v8, :cond_4

    iget-object v8, p0, Lcom/kabam/playv3/IabHelper;->mPurchaseListener:Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;

    const/4 v9, 0x0

    #v9=(Null);
    invoke-interface {v8, v6, v9}, Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;->onIabPurchaseFinished(Lcom/kabam/playv3/IabResult;Lcom/kabam/playv3/Purchase;)V

    .line 433
    :cond_4
    #v9=(Reference);
    const/4 v8, 0x1

    #v8=(One);
    goto/16 :goto_0

    .line 436
    .end local v6           #result:Lcom/kabam/playv3/IabResult;
    :cond_5
    #v6=(Uninit);v8=(Reference);
    const/4 v2, 0x0

    .line 439
    .local v2, purchase:Lcom/kabam/playv3/Purchase;
    :try_start_0
    #v2=(Null);
    new-instance v3, Lcom/kabam/playv3/Purchase;

    #v3=(UninitRef);
    invoke-direct {v3, v4, v0}, Lcom/kabam/playv3/Purchase;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 440
    .end local v2           #purchase:Lcom/kabam/playv3/Purchase;
    .local v3, purchase:Lcom/kabam/playv3/Purchase;
    :try_start_1
    #v3=(Reference);
    invoke-virtual {v3}, Lcom/kabam/playv3/Purchase;->getSku()Ljava/lang/String;

    move-result-object v7

    .line 455
    .local v7, sku:Ljava/lang/String;
    #v7=(Reference);
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    const-string v9, "for Unity Sku is owned: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v8=(Reference);
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0, v8}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 456
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v8

    invoke-virtual {v8}, Lcom/kabam/utility/Provider;->ProvideInventory()Lcom/kabam/playv3/Inventory;

    move-result-object v8

    invoke-virtual {v8, v3}, Lcom/kabam/playv3/Inventory;->addPurchase(Lcom/kabam/playv3/Purchase;)V

    .line 457
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v8=(Reference);
    const-string v9, "@=>@"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/kabam/utility/UnitySender;->SendVerifyPayment(Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 458
    const/4 v8, 0x1

    #v8=(One);
    goto/16 :goto_0

    .line 463
    .end local v3           #purchase:Lcom/kabam/playv3/Purchase;
    .end local v7           #sku:Ljava/lang/String;
    .restart local v2       #purchase:Lcom/kabam/playv3/Purchase;
    :catch_0
    #v3=(Conflicted);v7=(Uninit);v8=(Reference);
    move-exception v1

    .line 465
    .local v1, e:Lorg/json/JSONException;
    :goto_1
    #v1=(Reference);v2=(Reference);v7=(Conflicted);v8=(Conflicted);
    const-string v8, "Failed to parse purchase data."

    #v8=(Reference);
    invoke-virtual {p0, v8}, Lcom/kabam/playv3/IabHelper;->logError(Ljava/lang/String;)V

    .line 466
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    .line 467
    new-instance v6, Lcom/kabam/playv3/IabResult;

    #v6=(UninitRef);
    const/16 v8, -0x3ea

    #v8=(Short);
    const-string v9, "Failed to parse purchase data."

    invoke-direct {v6, v8, v9}, Lcom/kabam/playv3/IabResult;-><init>(ILjava/lang/String;)V

    .line 468
    .restart local v6       #result:Lcom/kabam/playv3/IabResult;
    #v6=(Reference);
    iget-object v8, p0, Lcom/kabam/playv3/IabHelper;->mPurchaseListener:Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;

    #v8=(Reference);
    if-eqz v8, :cond_6

    iget-object v8, p0, Lcom/kabam/playv3/IabHelper;->mPurchaseListener:Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;

    const/4 v9, 0x0

    #v9=(Null);
    invoke-interface {v8, v6, v9}, Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;->onIabPurchaseFinished(Lcom/kabam/playv3/IabResult;Lcom/kabam/playv3/Purchase;)V

    .line 469
    :cond_6
    #v9=(Reference);
    const/4 v8, 0x1

    #v8=(One);
    goto/16 :goto_0

    .line 477
    .end local v1           #e:Lorg/json/JSONException;
    .end local v2           #purchase:Lcom/kabam/playv3/Purchase;
    .end local v6           #result:Lcom/kabam/playv3/IabResult;
    :cond_7
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Byte);v9=(Uninit);
    const/4 v8, -0x1

    if-ne p2, v8, :cond_9

    .line 480
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    const-string v9, "Result code was OK but in-app billing response was not OK: "

    #v9=(Reference);
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v8=(Reference);
    invoke-static {v5}, Lcom/kabam/playv3/IabHelper;->getResponseDesc(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0, v8}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 481
    iget-object v8, p0, Lcom/kabam/playv3/IabHelper;->mPurchaseListener:Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;

    if-eqz v8, :cond_8

    .line 483
    new-instance v6, Lcom/kabam/playv3/IabResult;

    #v6=(UninitRef);
    const-string v8, "Problem purchashing item."

    invoke-direct {v6, v5, v8}, Lcom/kabam/playv3/IabResult;-><init>(ILjava/lang/String;)V

    .line 484
    .restart local v6       #result:Lcom/kabam/playv3/IabResult;
    #v6=(Reference);
    iget-object v8, p0, Lcom/kabam/playv3/IabHelper;->mPurchaseListener:Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;

    const/4 v9, 0x0

    #v9=(Null);
    invoke-interface {v8, v6, v9}, Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;->onIabPurchaseFinished(Lcom/kabam/playv3/IabResult;Lcom/kabam/playv3/Purchase;)V

    .line 500
    .end local v6           #result:Lcom/kabam/playv3/IabResult;
    :cond_8
    :goto_2
    #v6=(Conflicted);v9=(Reference);
    const/4 v8, 0x1

    #v8=(One);
    goto/16 :goto_0

    .line 487
    :cond_9
    #v6=(Uninit);v8=(Byte);v9=(Uninit);
    if-nez p2, :cond_a

    .line 489
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    const-string v9, "Purchase canceled - Response: "

    #v9=(Reference);
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v8=(Reference);
    invoke-static {v5}, Lcom/kabam/playv3/IabHelper;->getResponseDesc(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0, v8}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 490
    new-instance v6, Lcom/kabam/playv3/IabResult;

    #v6=(UninitRef);
    const/16 v8, -0x3ed

    #v8=(Short);
    const-string v9, "User canceled."

    invoke-direct {v6, v8, v9}, Lcom/kabam/playv3/IabResult;-><init>(ILjava/lang/String;)V

    .line 491
    .restart local v6       #result:Lcom/kabam/playv3/IabResult;
    #v6=(Reference);
    iget-object v8, p0, Lcom/kabam/playv3/IabHelper;->mPurchaseListener:Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;

    #v8=(Reference);
    if-eqz v8, :cond_8

    iget-object v8, p0, Lcom/kabam/playv3/IabHelper;->mPurchaseListener:Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;

    const/4 v9, 0x0

    #v9=(Null);
    invoke-interface {v8, v6, v9}, Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;->onIabPurchaseFinished(Lcom/kabam/playv3/IabResult;Lcom/kabam/playv3/Purchase;)V

    goto :goto_2

    .line 495
    .end local v6           #result:Lcom/kabam/playv3/IabResult;
    :cond_a
    #v6=(Uninit);v8=(Byte);v9=(Uninit);
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    const-string v9, "Purchase failed. Result code: "

    #v9=(Reference);
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v8=(Reference);
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    .line 496
    const-string v9, ". Response: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-static {v5}, Lcom/kabam/playv3/IabHelper;->getResponseDesc(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 495
    invoke-virtual {p0, v8}, Lcom/kabam/playv3/IabHelper;->logError(Ljava/lang/String;)V

    .line 497
    new-instance v6, Lcom/kabam/playv3/IabResult;

    #v6=(UninitRef);
    const/16 v8, -0x3ee

    #v8=(Short);
    const-string v9, "Unknown purchase response."

    invoke-direct {v6, v8, v9}, Lcom/kabam/playv3/IabResult;-><init>(ILjava/lang/String;)V

    .line 498
    .restart local v6       #result:Lcom/kabam/playv3/IabResult;
    #v6=(Reference);
    iget-object v8, p0, Lcom/kabam/playv3/IabHelper;->mPurchaseListener:Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;

    #v8=(Reference);
    if-eqz v8, :cond_8

    iget-object v8, p0, Lcom/kabam/playv3/IabHelper;->mPurchaseListener:Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;

    const/4 v9, 0x0

    #v9=(Null);
    invoke-interface {v8, v6, v9}, Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;->onIabPurchaseFinished(Lcom/kabam/playv3/IabResult;Lcom/kabam/playv3/Purchase;)V

    goto :goto_2

    .line 463
    .end local v6           #result:Lcom/kabam/playv3/IabResult;
    .restart local v3       #purchase:Lcom/kabam/playv3/Purchase;
    :catch_1
    #v2=(Null);v3=(Reference);v6=(Uninit);v7=(Conflicted);v8=(Conflicted);v9=(Reference);
    move-exception v1

    #v1=(Reference);
    move-object v2, v3

    .end local v3           #purchase:Lcom/kabam/playv3/Purchase;
    .restart local v2       #purchase:Lcom/kabam/playv3/Purchase;
    #v2=(Reference);
    goto/16 :goto_1
.end method

.method public launchPurchaseFlow(Landroid/app/Activity;Ljava/lang/String;ILcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;)V
    .locals 6
    .parameter "act"
    .parameter "sku"
    .parameter "requestCode"
    .parameter "listener"

    .prologue
    .line 314
    const-string v5, ""

    #v5=(Reference);
    move-object v0, p0

    #v0=(Reference);
    move-object v1, p1

    #v1=(Reference);
    move-object v2, p2

    #v2=(Reference);
    move v3, p3

    #v3=(Integer);
    move-object v4, p4

    #v4=(Reference);
    invoke-virtual/range {v0 .. v5}, Lcom/kabam/playv3/IabHelper;->launchPurchaseFlow(Landroid/app/Activity;Ljava/lang/String;ILcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;Ljava/lang/String;)V

    .line 315
    return-void
.end method

.method public launchPurchaseFlow(Landroid/app/Activity;Ljava/lang/String;ILcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;Ljava/lang/String;)V
    .locals 13
    .parameter "act"
    .parameter "sku"
    .parameter "requestCode"
    .parameter "listener"
    .parameter "extraData"

    .prologue
    .line 336
    const-string v1, "launchPurchaseFlow"

    #v1=(Reference);
    invoke-virtual {p0, v1}, Lcom/kabam/playv3/IabHelper;->checkSetupDone(Ljava/lang/String;)V

    .line 337
    const-string v1, "launchPurchaseFlow"

    invoke-virtual {p0, v1}, Lcom/kabam/playv3/IabHelper;->flagStartAsync(Ljava/lang/String;)V

    .line 342
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "Constructing buy intent for "

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 343
    iget-object v1, p0, Lcom/kabam/playv3/IabHelper;->mService:Lcom/android/vending/billing/IInAppBillingService;

    const/4 v2, 0x3

    #v2=(PosByte);
    iget-object v3, p0, Lcom/kabam/playv3/IabHelper;->mContext:Landroid/content/Context;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const-string v5, "inapp"

    #v5=(Reference);
    move-object v4, p2

    #v4=(Reference);
    move-object/from16 v6, p5

    #v6=(Reference);
    invoke-interface/range {v1 .. v6}, Lcom/android/vending/billing/IInAppBillingService;->getBuyIntent(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v8

    .line 344
    .local v8, buyIntentBundle:Landroid/os/Bundle;
    #v8=(Reference);
    invoke-virtual {p0, v8}, Lcom/kabam/playv3/IabHelper;->getResponseCodeFromBundle(Landroid/os/Bundle;)I

    move-result v11

    .line 345
    .local v11, response:I
    #v11=(Integer);
    if-eqz v11, :cond_2

    .line 347
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "Unable to buy item, Error response: "

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-static {v11}, Lcom/kabam/playv3/IabHelper;->getResponseDesc(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/kabam/playv3/IabHelper;->logError(Ljava/lang/String;)V

    .line 349
    new-instance v12, Lcom/kabam/playv3/IabResult;

    #v12=(UninitRef);
    const-string v1, "Unable to buy item"

    invoke-direct {v12, v11, v1}, Lcom/kabam/playv3/IabResult;-><init>(ILjava/lang/String;)V

    .line 350
    .local v12, result:Lcom/kabam/playv3/IabResult;
    #v12=(Reference);
    if-eqz p4, :cond_0

    const/4 v1, 0x0

    #v1=(Null);
    move-object/from16 v0, p4

    #v0=(Reference);
    invoke-interface {v0, v12, v1}, Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;->onIabPurchaseFinished(Lcom/kabam/playv3/IabResult;Lcom/kabam/playv3/Purchase;)V

    .line 351
    :cond_0
    #v0=(Conflicted);v1=(Reference);
    const/4 v1, 0x7

    #v1=(PosByte);
    if-ne v11, v1, :cond_2

    .line 353
    const-string v1, "already purchased"

    #v1=(Reference);
    invoke-static {v1}, Lcom/kabam/utility/UnitySender;->ShowMessage(Ljava/lang/String;)V

    .line 383
    .end local v8           #buyIntentBundle:Landroid/os/Bundle;
    .end local v11           #response:I
    .end local v12           #result:Lcom/kabam/playv3/IabResult;
    :cond_1
    :goto_0
    #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    return-void

    .line 358
    .restart local v8       #buyIntentBundle:Landroid/os/Bundle;
    .restart local v11       #response:I
    :cond_2
    #v2=(Conflicted);v3=(Reference);v4=(Reference);v5=(Reference);v6=(Reference);v7=(Uninit);v8=(Reference);v9=(Uninit);v10=(Uninit);v11=(Integer);
    const-string v1, "BUY_INTENT"

    #v1=(Reference);
    invoke-virtual {v8, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v10

    #v10=(Reference);
    check-cast v10, Landroid/app/PendingIntent;

    .line 359
    .local v10, pendingIntent:Landroid/app/PendingIntent;
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "Launching buy intent for "

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ". Request code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v0, p3

    #v0=(Integer);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 360
    move/from16 v0, p3

    iput v0, p0, Lcom/kabam/playv3/IabHelper;->mRequestCode:I

    .line 361
    move-object/from16 v0, p4

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/playv3/IabHelper;->mPurchaseListener:Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;

    .line 362
    invoke-virtual {v10}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v2

    .line 363
    new-instance v4, Landroid/content/Intent;

    #v4=(UninitRef);
    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 364
    #v4=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    #v5=(Integer);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 365
    #v6=(Integer);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    #v7=(Integer);
    move-object v1, p1

    move/from16 v3, p3

    .line 362
    #v3=(Integer);
    invoke-virtual/range {v1 .. v7}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 367
    .end local v8           #buyIntentBundle:Landroid/os/Bundle;
    .end local v10           #pendingIntent:Landroid/app/PendingIntent;
    .end local v11           #response:I
    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    move-exception v9

    .line 369
    .local v9, e:Landroid/content/IntentSender$SendIntentException;
    #v9=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "SendIntentException while launching purchase flow for sku "

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/kabam/playv3/IabHelper;->logError(Ljava/lang/String;)V

    .line 370
    invoke-virtual {v9}, Landroid/content/IntentSender$SendIntentException;->printStackTrace()V

    .line 372
    new-instance v12, Lcom/kabam/playv3/IabResult;

    #v12=(UninitRef);
    const/16 v1, -0x3ec

    #v1=(Short);
    const-string v2, "Failed to send intent."

    invoke-direct {v12, v1, v2}, Lcom/kabam/playv3/IabResult;-><init>(ILjava/lang/String;)V

    .line 373
    .restart local v12       #result:Lcom/kabam/playv3/IabResult;
    #v12=(Reference);
    if-eqz p4, :cond_1

    const/4 v1, 0x0

    #v1=(Null);
    move-object/from16 v0, p4

    #v0=(Reference);
    invoke-interface {v0, v12, v1}, Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;->onIabPurchaseFinished(Lcom/kabam/playv3/IabResult;Lcom/kabam/playv3/Purchase;)V

    goto/16 :goto_0

    .line 375
    .end local v9           #e:Landroid/content/IntentSender$SendIntentException;
    .end local v12           #result:Lcom/kabam/playv3/IabResult;
    :catch_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v9=(Uninit);v12=(Conflicted);
    move-exception v9

    .line 377
    .local v9, e:Landroid/os/RemoteException;
    #v9=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "RemoteException while launching purchase flow for sku "

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/kabam/playv3/IabHelper;->logError(Ljava/lang/String;)V

    .line 378
    invoke-virtual {v9}, Landroid/os/RemoteException;->printStackTrace()V

    .line 380
    new-instance v12, Lcom/kabam/playv3/IabResult;

    #v12=(UninitRef);
    const/16 v1, -0x3e9

    #v1=(Short);
    const-string v2, "Remote exception while starting purchase flow"

    invoke-direct {v12, v1, v2}, Lcom/kabam/playv3/IabResult;-><init>(ILjava/lang/String;)V

    .line 381
    .restart local v12       #result:Lcom/kabam/playv3/IabResult;
    #v12=(Reference);
    if-eqz p4, :cond_1

    const/4 v1, 0x0

    #v1=(Null);
    move-object/from16 v0, p4

    #v0=(Reference);
    invoke-interface {v0, v12, v1}, Lcom/kabam/playv3/IabHelper$OnIabPurchaseFinishedListener;->onIabPurchaseFinished(Lcom/kabam/playv3/IabResult;Lcom/kabam/playv3/Purchase;)V

    goto/16 :goto_0
.end method

.method logDebug(Ljava/lang/String;)V
    .locals 1
    .parameter "msg"

    .prologue
    .line 1035
    iget-object v0, p0, Lcom/kabam/playv3/IabHelper;->mDebugTag:Ljava/lang/String;

    #v0=(Reference);
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1036
    return-void
.end method

.method logError(Ljava/lang/String;)V
    .locals 3
    .parameter "msg"

    .prologue
    .line 1040
    iget-object v0, p0, Lcom/kabam/playv3/IabHelper;->mDebugTag:Ljava/lang/String;

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "In-app billing error: "

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1041
    return-void
.end method

.method logWarn(Ljava/lang/String;)V
    .locals 3
    .parameter "msg"

    .prologue
    .line 1045
    iget-object v0, p0, Lcom/kabam/playv3/IabHelper;->mDebugTag:Ljava/lang/String;

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "In-app billing warning: "

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1046
    return-void
.end method

.method public queryInventory(ZLjava/util/List;)Lcom/kabam/playv3/Inventory;
    .locals 6
    .parameter "querySkuDetails"
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/kabam/playv3/Inventory;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/kabam/playv3/IabException;
        }
    .end annotation

    .prologue
    .line 516
    .local p2, moreSkus:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    const-string v3, "queryInventory"

    #v3=(Reference);
    invoke-virtual {p0, v3}, Lcom/kabam/playv3/IabHelper;->checkSetupDone(Ljava/lang/String;)V

    .line 519
    :try_start_0
    new-instance v1, Lcom/kabam/playv3/Inventory;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/kabam/playv3/Inventory;-><init>()V

    .line 520
    .local v1, inv:Lcom/kabam/playv3/Inventory;
    #v1=(Reference);
    const/4 v2, 0x0

    .line 522
    .local v2, r:I
    #v2=(Null);
    if-eqz p1, :cond_0

    .line 524
    invoke-virtual {p0, v1, p2}, Lcom/kabam/playv3/IabHelper;->querySkuDetails(Lcom/kabam/playv3/Inventory;Ljava/util/List;)I

    move-result v2

    .line 525
    #v2=(Integer);
    if-eqz v2, :cond_1

    .line 527
    new-instance v3, Lcom/kabam/playv3/IabException;

    #v3=(UninitRef);
    const-string v4, "Error refreshing inventory (querying prices of items)."

    #v4=(Reference);
    invoke-direct {v3, v2, v4}, Lcom/kabam/playv3/IabException;-><init>(ILjava/lang/String;)V

    #v3=(Reference);
    throw v3
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 541
    .end local v1           #inv:Lcom/kabam/playv3/Inventory;
    .end local v2           #r:I
    :catch_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    move-exception v0

    .line 543
    .local v0, e:Landroid/os/RemoteException;
    #v0=(Reference);
    new-instance v3, Lcom/kabam/playv3/IabException;

    #v3=(UninitRef);
    const/16 v4, -0x3e9

    #v4=(Short);
    const-string v5, "Remote exception while refreshing inventory."

    #v5=(Reference);
    invoke-direct {v3, v4, v5, v0}, Lcom/kabam/playv3/IabException;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    #v3=(Reference);
    throw v3

    .line 532
    .end local v0           #e:Landroid/os/RemoteException;
    .restart local v1       #inv:Lcom/kabam/playv3/Inventory;
    .restart local v2       #r:I
    :cond_0
    :try_start_1
    #v0=(Uninit);v1=(Reference);v2=(Null);v4=(Uninit);v5=(Uninit);
    invoke-virtual {p0, v1}, Lcom/kabam/playv3/IabHelper;->queryPurchases(Lcom/kabam/playv3/Inventory;)I

    move-result v2

    .line 533
    #v2=(Integer);
    if-eqz v2, :cond_1

    .line 535
    new-instance v3, Lcom/kabam/playv3/IabException;

    #v3=(UninitRef);
    const-string v4, "Error refreshing inventory (querying owned items)."

    #v4=(Reference);
    invoke-direct {v3, v2, v4}, Lcom/kabam/playv3/IabException;-><init>(ILjava/lang/String;)V

    #v3=(Reference);
    throw v3
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 545
    .end local v1           #inv:Lcom/kabam/playv3/Inventory;
    .end local v2           #r:I
    :catch_1
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    move-exception v0

    .line 547
    .local v0, e:Lorg/json/JSONException;
    #v0=(Reference);
    new-instance v3, Lcom/kabam/playv3/IabException;

    #v3=(UninitRef);
    const/16 v4, -0x3ea

    #v4=(Short);
    const-string v5, "Error parsing JSON response while refreshing inventory."

    #v5=(Reference);
    invoke-direct {v3, v4, v5, v0}, Lcom/kabam/playv3/IabException;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    #v3=(Reference);
    throw v3

    .line 539
    .end local v0           #e:Lorg/json/JSONException;
    .restart local v1       #inv:Lcom/kabam/playv3/Inventory;
    .restart local v2       #r:I
    :cond_1
    #v0=(Uninit);v1=(Reference);v2=(Integer);v4=(Uninit);v5=(Uninit);
    return-object v1
.end method

.method public queryInventoryAsync(Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;)V
    .locals 2
    .parameter "listener"

    .prologue
    .line 623
    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p0, v0, v1, p1}, Lcom/kabam/playv3/IabHelper;->queryInventoryAsync(ZLjava/util/List;Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;)V

    .line 624
    return-void
.end method

.method public queryInventoryAsync(ZLcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;)V
    .locals 1
    .parameter "querySkuDetails"
    .parameter "listener"

    .prologue
    .line 628
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, p1, v0, p2}, Lcom/kabam/playv3/IabHelper;->queryInventoryAsync(ZLjava/util/List;Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;)V

    .line 629
    return-void
.end method

.method public queryInventoryAsync(ZLjava/util/List;Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;)V
    .locals 2
    .parameter "querySkuDetails"
    .parameter
    .parameter "listener"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;",
            ")V"
        }
    .end annotation

    .prologue
    .line 581
    .local p2, moreSkus:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    const-string v1, "queryInventory"

    #v1=(Reference);
    invoke-virtual {p0, v1}, Lcom/kabam/playv3/IabHelper;->checkSetupDone(Ljava/lang/String;)V

    .line 582
    const-string v1, "refresh inventory"

    invoke-virtual {p0, v1}, Lcom/kabam/playv3/IabHelper;->flagStartAsync(Ljava/lang/String;)V

    .line 584
    new-instance v0, Lcom/kabam/playv3/IabHelper$2;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/kabam/playv3/IabHelper$2;-><init>(Lcom/kabam/playv3/IabHelper;ZLjava/util/List;Lcom/kabam/playv3/IabHelper$QueryInventoryFinishedListener;)V

    .line 617
    .local v0, action:Ljava/lang/Runnable;
    #v0=(Reference);
    invoke-static {}, Lcom/kabam/utility/Provider;->Instance()Lcom/kabam/utility/Provider;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kabam/utility/Provider;->GetActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 619
    return-void
.end method

.method queryPurchases(Lcom/kabam/playv3/Inventory;)I
    .locals 21
    .parameter "inv"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 848
    const-string v17, "Querying owned items..."

    #v17=(Reference);
    move-object/from16 v0, p0

    #v0=(Reference);
    move-object/from16 v1, v17

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 849
    new-instance v17, Ljava/lang/StringBuilder;

    #v17=(UninitRef);
    const-string v18, "Package name: "

    #v18=(Reference);
    invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v17=(Reference);
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kabam/playv3/IabHelper;->mContext:Landroid/content/Context;

    move-object/from16 v18, v0

    invoke-virtual/range {v18 .. v18}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v18

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 850
    const/4 v5, 0x1

    .line 851
    .local v5, hasMore:Z
    #v5=(One);
    const/16 v16, 0x0

    .line 852
    .local v16, verificationFailed:Z
    #v16=(Null);
    const/4 v4, 0x0

    .line 856
    .local v4, continueToken:Ljava/lang/String;
    :cond_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Reference);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v17=(Conflicted);v19=(Conflicted);v20=(Conflicted);
    new-instance v17, Ljava/lang/StringBuilder;

    #v17=(UninitRef);
    const-string v18, "Calling getPurchases with continuation token: "

    invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v17=(Reference);
    move-object/from16 v0, v17

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 857
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kabam/playv3/IabHelper;->mService:Lcom/android/vending/billing/IInAppBillingService;

    move-object/from16 v17, v0

    const/16 v18, 0x3

    #v18=(PosByte);
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kabam/playv3/IabHelper;->mContext:Landroid/content/Context;

    move-object/from16 v19, v0

    #v19=(Reference);
    invoke-virtual/range {v19 .. v19}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v19

    .line 858
    const-string v20, "inapp"

    .line 857
    #v20=(Reference);
    move-object/from16 v0, v17

    move/from16 v1, v18

    #v1=(PosByte);
    move-object/from16 v2, v19

    #v2=(Reference);
    move-object/from16 v3, v20

    #v3=(Reference);
    invoke-interface {v0, v1, v2, v3, v4}, Lcom/android/vending/billing/IInAppBillingService;->getPurchases(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v7

    .line 860
    .local v7, ownedItems:Landroid/os/Bundle;
    #v7=(Reference);
    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/kabam/playv3/IabHelper;->getResponseCodeFromBundle(Landroid/os/Bundle;)I

    move-result v12

    .line 861
    .local v12, response:I
    #v12=(Integer);
    new-instance v17, Ljava/lang/StringBuilder;

    #v17=(UninitRef);
    const-string v18, "Owned items response: "

    #v18=(Reference);
    invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v17=(Reference);
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v18

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 862
    if-eqz v12, :cond_1

    .line 864
    new-instance v17, Ljava/lang/StringBuilder;

    #v17=(UninitRef);
    const-string v18, "getPurchases() failed: "

    invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v17=(Reference);
    invoke-static {v12}, Lcom/kabam/playv3/IabHelper;->getResponseDesc(I)Ljava/lang/String;

    move-result-object v18

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 919
    .end local v12           #response:I
    :goto_0
    #v17=(Conflicted);
    return v12

    .line 867
    .restart local v12       #response:I
    :cond_1
    #v17=(Reference);
    const-string v17, "INAPP_PURCHASE_ITEM_LIST"

    move-object/from16 v0, v17

    invoke-virtual {v7, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v17

    #v17=(Boolean);
    if-eqz v17, :cond_2

    .line 868
    const-string v17, "INAPP_PURCHASE_DATA_LIST"

    #v17=(Reference);
    move-object/from16 v0, v17

    invoke-virtual {v7, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v17

    #v17=(Boolean);
    if-eqz v17, :cond_2

    .line 869
    const-string v17, "INAPP_DATA_SIGNATURE_LIST"

    #v17=(Reference);
    move-object/from16 v0, v17

    invoke-virtual {v7, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v17

    #v17=(Boolean);
    if-nez v17, :cond_3

    .line 871
    :cond_2
    const-string v17, "Bundle returned from getPurchases() doesn\'t contain required fields."

    #v17=(Reference);
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/kabam/playv3/IabHelper;->logError(Ljava/lang/String;)V

    .line 872
    const/16 v12, -0x3ea

    #v12=(Short);
    goto :goto_0

    .line 875
    :cond_3
    #v12=(Integer);v17=(Boolean);
    const-string v17, "INAPP_PURCHASE_ITEM_LIST"

    #v17=(Reference);
    move-object/from16 v0, v17

    invoke-virtual {v7, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v8

    .line 876
    .local v8, ownedSkus:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Ljava/lang/String;>;"
    #v8=(Reference);
    const-string v17, "INAPP_PURCHASE_DATA_LIST"

    move-object/from16 v0, v17

    invoke-virtual {v7, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v11

    .line 877
    .local v11, purchaseDataList:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Ljava/lang/String;>;"
    #v11=(Reference);
    const-string v17, "INAPP_DATA_SIGNATURE_LIST"

    move-object/from16 v0, v17

    invoke-virtual {v7, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v14

    .line 879
    .local v14, signatureList:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Ljava/lang/String;>;"
    #v14=(Reference);
    const/4 v6, 0x0

    .local v6, i:I
    :goto_1
    #v6=(Integer);
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v17

    #v17=(Integer);
    move/from16 v0, v17

    #v0=(Integer);
    if-lt v6, v0, :cond_4

    .line 915
    const-string v17, "INAPP_CONTINUATION_TOKEN"

    #v17=(Reference);
    move-object/from16 v0, v17

    #v0=(Reference);
    invoke-virtual {v7, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 916
    new-instance v17, Ljava/lang/StringBuilder;

    #v17=(UninitRef);
    const-string v18, "Continuation token: "

    invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v17=(Reference);
    move-object/from16 v0, v17

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 918
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v17

    .line 854
    #v17=(Boolean);
    if-eqz v17, :cond_0

    .line 919
    if-eqz v16, :cond_5

    const/16 v17, -0x3eb

    :goto_2
    #v17=(Short);
    move/from16 v12, v17

    #v12=(Short);
    goto :goto_0

    .line 881
    :cond_4
    #v0=(Integer);v12=(Integer);v17=(Integer);
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    #v10=(Reference);
    check-cast v10, Ljava/lang/String;

    .line 882
    .local v10, purchaseData:Ljava/lang/String;
    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    #v13=(Reference);
    check-cast v13, Ljava/lang/String;

    .line 883
    .local v13, signature:Ljava/lang/String;
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    #v15=(Reference);
    check-cast v15, Ljava/lang/String;

    .line 907
    .local v15, sku:Ljava/lang/String;
    new-instance v17, Ljava/lang/StringBuilder;

    #v17=(UninitRef);
    const-string v18, "for Unity Sku is owned: "

    invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v17=(Reference);
    move-object/from16 v0, v17

    #v0=(Reference);
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 908
    new-instance v17, Ljava/lang/StringBuilder;

    #v17=(UninitRef);
    invoke-static {v13}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v17=(Reference);
    const-string v18, "@=>@"

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    move-object/from16 v0, v17

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Lcom/kabam/utility/UnitySender;->SendVerifyPayment(Ljava/lang/String;)V

    .line 910
    new-instance v9, Lcom/kabam/playv3/Purchase;

    #v9=(UninitRef);
    invoke-direct {v9, v10, v13}, Lcom/kabam/playv3/Purchase;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 911
    .local v9, purchase:Lcom/kabam/playv3/Purchase;
    #v9=(Reference);
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v9, v10}, Lcom/kabam/playv3/IabHelper;->RecordPurchase(Lcom/kabam/playv3/Inventory;Lcom/kabam/playv3/Purchase;Ljava/lang/String;)V

    .line 879
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_1

    .line 919
    .end local v9           #purchase:Lcom/kabam/playv3/Purchase;
    .end local v10           #purchaseData:Ljava/lang/String;
    .end local v13           #signature:Ljava/lang/String;
    .end local v15           #sku:Ljava/lang/String;
    :cond_5
    #v9=(Conflicted);v10=(Conflicted);v13=(Conflicted);v15=(Conflicted);v17=(Boolean);
    const/16 v17, 0x0

    #v17=(Null);
    goto :goto_2
.end method

.method querySkuDetails(Lcom/kabam/playv3/Inventory;Ljava/util/List;)I
    .locals 11
    .parameter "inv"
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kabam/playv3/Inventory;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;,
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .local p2, moreSkus:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    const/4 v2, 0x0

    .line 936
    #v2=(Null);
    const-string v7, "Querying SKU details."

    #v7=(Reference);
    invoke-virtual {p0, v7}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 937
    new-instance v5, Ljava/util/ArrayList;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 939
    .local v5, skuList:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Ljava/lang/String;>;"
    #v5=(Reference);
    if-eqz p2, :cond_0

    invoke-virtual {v5, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 941
    :cond_0
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v7

    #v7=(Integer);
    if-nez v7, :cond_2

    .line 943
    const-string v7, "queryPrices: nothing to do because there are no SKUs."

    #v7=(Reference);
    invoke-virtual {p0, v7}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 975
    :cond_1
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    return v2

    .line 947
    :cond_2
    #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Integer);v8=(Uninit);v9=(Uninit);v10=(Uninit);
    new-instance v1, Landroid/os/Bundle;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 948
    .local v1, querySkus:Landroid/os/Bundle;
    #v1=(Reference);
    const-string v7, "ITEM_ID_LIST"

    #v7=(Reference);
    invoke-virtual {v1, v7, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 949
    iget-object v7, p0, Lcom/kabam/playv3/IabHelper;->mService:Lcom/android/vending/billing/IInAppBillingService;

    const/4 v8, 0x3

    #v8=(PosByte);
    iget-object v9, p0, Lcom/kabam/playv3/IabHelper;->mContext:Landroid/content/Context;

    #v9=(Reference);
    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v9

    .line 950
    const-string v10, "inapp"

    .line 949
    #v10=(Reference);
    invoke-interface {v7, v8, v9, v10, v1}, Lcom/android/vending/billing/IInAppBillingService;->getSkuDetails(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v4

    .line 952
    .local v4, skuDetails:Landroid/os/Bundle;
    #v4=(Reference);
    const-string v7, "DETAILS_LIST"

    invoke-virtual {v4, v7}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v7

    #v7=(Boolean);
    if-nez v7, :cond_4

    .line 954
    invoke-virtual {p0, v4}, Lcom/kabam/playv3/IabHelper;->getResponseCodeFromBundle(Landroid/os/Bundle;)I

    move-result v2

    .line 955
    .local v2, response:I
    #v2=(Integer);
    if-eqz v2, :cond_3

    .line 957
    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    const-string v8, "getSkuDetails() failed: "

    #v8=(Reference);
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v7=(Reference);
    invoke-static {v2}, Lcom/kabam/playv3/IabHelper;->getResponseDesc(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0, v7}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    goto :goto_0

    .line 962
    :cond_3
    #v7=(Boolean);v8=(PosByte);
    const-string v7, "getSkuDetails() returned a bundle with neither an error nor a detail list."

    #v7=(Reference);
    invoke-virtual {p0, v7}, Lcom/kabam/playv3/IabHelper;->logError(Ljava/lang/String;)V

    .line 963
    const/16 v2, -0x3ea

    #v2=(Short);
    goto :goto_0

    .line 967
    .end local v2           #response:I
    :cond_4
    #v2=(Null);v7=(Boolean);
    const-string v7, "DETAILS_LIST"

    #v7=(Reference);
    invoke-virtual {v4, v7}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 969
    .local v3, responseList:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Ljava/lang/String;>;"
    #v3=(Reference);
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    #v0=(Conflicted);v6=(Conflicted);v8=(Conflicted);
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    #v8=(Boolean);
    if-eqz v8, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    #v6=(Reference);
    check-cast v6, Ljava/lang/String;

    .line 971
    .local v6, thisResponse:Ljava/lang/String;
    new-instance v0, Lcom/kabam/playv3/SkuDetails;

    #v0=(UninitRef);
    invoke-direct {v0, v6}, Lcom/kabam/playv3/SkuDetails;-><init>(Ljava/lang/String;)V

    .line 972
    .local v0, d:Lcom/kabam/playv3/SkuDetails;
    #v0=(Reference);
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    const-string v9, "Got sku details: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v8=(Reference);
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0, v8}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 973
    invoke-virtual {p1, v0}, Lcom/kabam/playv3/Inventory;->addSkuDetails(Lcom/kabam/playv3/SkuDetails;)V

    goto :goto_1
.end method

.method public startSetup(Lcom/kabam/playv3/IabHelper$OnIabSetupFinishedListener;)V
    .locals 4
    .parameter "listener"

    .prologue
    .line 215
    iget-boolean v0, p0, Lcom/kabam/playv3/IabHelper;->mSetupDone:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    #v0=(UninitRef);
    const-string v1, "IAB helper is already set up."

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 218
    :cond_0
    #v0=(Boolean);v1=(Uninit);
    const-string v0, "Starting in-app billing setup."

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/kabam/playv3/IabHelper;->logDebug(Ljava/lang/String;)V

    .line 219
    new-instance v0, Lcom/kabam/playv3/IabHelper$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p1}, Lcom/kabam/playv3/IabHelper$1;-><init>(Lcom/kabam/playv3/IabHelper;Lcom/kabam/playv3/IabHelper$OnIabSetupFinishedListener;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/kabam/playv3/IabHelper;->mServiceConn:Landroid/content/ServiceConnection;

    .line 262
    iget-object v0, p0, Lcom/kabam/playv3/IabHelper;->mContext:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    #v1=(UninitRef);
    const-string v2, "com.android.vending.billing.InAppBillingService.BIND"

    #v2=(Reference);
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 263
    #v1=(Reference);
    iget-object v2, p0, Lcom/kabam/playv3/IabHelper;->mServiceConn:Landroid/content/ServiceConnection;

    const/4 v3, 0x1

    .line 262
    #v3=(One);
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 264
    return-void
.end method

*/}
