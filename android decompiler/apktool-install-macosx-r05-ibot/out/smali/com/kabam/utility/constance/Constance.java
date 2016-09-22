package com.kabam.utility.constance; class Constance {/*

.class public Lcom/kabam/utility/constance/Constance;
.super Ljava/lang/Object;
.source "Constance.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kabam/utility/constance/Constance$PurchaseState;,
        Lcom/kabam/utility/constance/Constance$ResponseCode;
    }
.end annotation


# static fields
.field public static final ACTION_ADCOME:Ljava/lang/String; = "ADCOME"

.field public static final ACTION_CONFIRM_NOTIFICATION:Ljava/lang/String; = "CONFIRM_NOTIFICATION"

.field public static final ACTION_GET_PURCHASE_INFORMATION:Ljava/lang/String; = "GET_PURCHASE_INFORMATION"

.field public static final ACTION_INSTALL_REFERRER:Ljava/lang/String; = "com.android.vending.INSTALL_REFERRER"

.field public static final ACTION_NOTIFICATION:Ljava/lang/String; = "com.kabam.notification"

.field public static final ACTION_NOTIFY:Ljava/lang/String; = "com.android.vending.billing.IN_APP_NOTIFY"

.field public static final ACTION_PURCHASE_STATE_CHANGED:Ljava/lang/String; = "com.android.vending.billing.PURCHASE_STATE_CHANGED"

.field public static final ACTION_RESPONSE_CODE:Ljava/lang/String; = "com.android.vending.billing.RESPONSE_CODE"

.field public static final ACTION_RESTORE_TRANSACTIONS:Ljava/lang/String; = "RESTORE_TRANSACTIONS"

.field public static final AdwordsID:Ljava/lang/String; = "UA-35699114-1"

.field public static final AlreadyPurchased:Ljava/lang/String; = "already purchased"

.field public static final BILLING_REQUEST_API_VERSION:Ljava/lang/String; = "API_VERSION"

.field public static final BILLING_REQUEST_DEVELOPER_PAYLOAD:Ljava/lang/String; = "DEVELOPER_PAYLOAD"

.field public static final BILLING_REQUEST_ITEM_ID:Ljava/lang/String; = "ITEM_ID"

.field public static final BILLING_REQUEST_ITEM_TYPE:Ljava/lang/String; = "ITEM_TYPE"

.field public static final BILLING_REQUEST_METHOD:Ljava/lang/String; = "BILLING_REQUEST"

.field public static final BILLING_REQUEST_NONCE:Ljava/lang/String; = "NONCE"

.field public static final BILLING_REQUEST_NOTIFY_IDS:Ljava/lang/String; = "NOTIFY_IDS"

.field public static final BILLING_REQUEST_PACKAGE_NAME:Ljava/lang/String; = "PACKAGE_NAME"

.field public static BILLING_RESPONSE_INVALID_REQUEST_ID:J = 0x0L

.field public static final BILLING_RESPONSE_PURCHASE_INTENT:Ljava/lang/String; = "PURCHASE_INTENT"

.field public static final BILLING_RESPONSE_REQUEST_ID:Ljava/lang/String; = "REQUEST_ID"

.field public static final BILLING_RESPONSE_RESPONSE_CODE:Ljava/lang/String; = "RESPONSE_CODE"

.field public static final BillingV3Request:I = 0x6e

.field public static final CHECK_BILLING_SUPPORTED:Ljava/lang/String; = "CHECK_BILLING_SUPPORTED"

.field public static final CONFIRM_NOTIFICATIONS:Ljava/lang/String; = "CONFIRM_NOTIFICATIONS"

.field public static CarrierNameKey:Ljava/lang/String; = null

.field public static final ChartBoostID:Ljava/lang/String; = "507ca53d17ba47912d000001"

.field public static final ChartBoostSignature:Ljava/lang/String; = "0e2534c7611a00211f660563fac3d4c9a80617e6"

.field public static final DEBUG:Z = true

.field public static Default:Ljava/lang/String; = null

.field public static EMail:I = 0x0

.field public static Facebook:I = 0x0

.field public static final FacebookID:Ljava/lang/String; = "256425107811295"

.field public static FacebookLoginDenied:Ljava/lang/String; = null

.field public static FileName:Ljava/lang/String; = null

.field public static final FirstChatKey:Ljava/lang/String; = "firstchat"

.field public static final FirstLoginKey:Ljava/lang/String; = "firstlogin"

.field public static final GET_PURCHASE_INFORMATION:Ljava/lang/String; = "GET_PURCHASE_INFORMATION"

.field public static final Game:Ljava/lang/String; = "fortress"

.field public static final INAPP_REQUEST_ID:Ljava/lang/String; = "request_id"

.field public static final INAPP_RESPONSE_CODE:Ljava/lang/String; = "response_code"

.field public static final INAPP_SIGNATURE:Ljava/lang/String; = "inapp_signature"

.field public static final INAPP_SIGNED_DATA:Ljava/lang/String; = "inapp_signed_data"

.field public static final IS_SUPPORTED:Ljava/lang/String; = "IS_SUPPORTED"

.field public static final ITEM_TYPE_INAPP:Ljava/lang/String; = "inapp"

.field public static final IsForUnity:Z = true

.field public static final IsLocalVerify:Z = false

.field public static final IsOnlySupportV2:Z = false

.field public static final JSONAttribute_Cents:Ljava/lang/String; = "cents"

.field public static final JSONAttribute_ExternalTrkid:Ljava/lang/String; = "externalTrkid"

.field public static final JSONAttribute_Itunes_Productid:Ljava/lang/String; = "itunes_productid"

.field public static final JSONAttribute_Key:Ljava/lang/String; = "key"

.field public static final JSONAttribute_Names:Ljava/lang/String; = "description"

.field public static final JSONAttribute_NotificationId:Ljava/lang/String; = "notificationId"

.field public static final JSONAttribute_Payoutid:Ljava/lang/String; = "payoutid"

.field public static final JSONAttribute_PurchaseState:Ljava/lang/String; = "purchaseState"

.field public static final JSONNode_Orders:Ljava/lang/String; = "orders"

.field public static final JSONNode_PackageData:Ljava/lang/String; = "packageData"

.field public static final JSONNode_Packages:Ljava/lang/String; = "packages"

.field public static final MARKET_BILLING_SERVICE_ACTION:Ljava/lang/String; = "com.android.vending.billing.MarketBillingService.BIND"

.field public static final MATID:Ljava/lang/String; = "885"

.field public static final MATKey:Ljava/lang/String; = "5fe62a47e94a9edb757022c4f72e6386"

.field public static MCCKey:Ljava/lang/String; = null

.field public static MNCKey:Ljava/lang/String; = null

.field public static MacAddressKey:Ljava/lang/String; = null

.field public static ManufactorKey:Ljava/lang/String; = null

.field public static ModalKey:Ljava/lang/String; = null

.field public static final NOTIFICATION_ID:Ljava/lang/String; = "notification_id"

.field public static NeedGooglePlayFlag:Ljava/lang/String; = null

.field public static final NotSupported:Ljava/lang/String; = "not supported"

.field public static final NotificationClass:Ljava/lang/Class; = null

.field public static final NotificationDisplayTimeScope:I = 0x5265c00

.field public static final NotificationLogo:I = 0x7f020001

.field public static final NotificationMessageKey:Ljava/lang/String; = "messagekey"

.field public static final NotificationTitle:Ljava/lang/String; = "Hobbit: KoM"

.field public static OSNameKey:Ljava/lang/String; = null

.field public static OSVersionKey:Ljava/lang/String; = null

.field public static OpenUDID:Ljava/lang/String; = null

.field public static final PublicKey:Ljava/lang/String; = "Ming Cai\'s public key."

.field public static final PurchasedStateInvalid:I = -0x1

.field public static final REQUEST_PURCHASE:Ljava/lang/String; = "REQUEST_PURCHASE"

.field public static final RESTORE_TRANSACTIONS:Ljava/lang/String; = "RESTORE_TRANSACTIONS"

.field public static SMS:I = 0x0

.field public static SMSNotSupportedKey:Ljava/lang/String; = null

.field public static final SiteID:Ljava/lang/String; = "4880"

.field public static SystemLanguageISOKey:Ljava/lang/String; = null

.field public static SystemLanguageKey:Ljava/lang/String; = null

.field public static final TapJoyAppID:Ljava/lang/String; = "25459e5b-9bf7-4812-bd34-cfcc907210ad"

.field public static final TapJoyScretKey:Ljava/lang/String; = "zdTg28wtp7XJH2OxN4IG"

.field public static final TempFolderName:Ljava/lang/String; = "CamelotTemp"

.field public static final TrackMobileURL:Ljava/lang/String; = "http://www.hobbitmobile.com/ajax/playerDeviceLog.php"

.field public static UDID:Ljava/lang/String; = null

.field public static final canAdwords:Z = true

.field public static final canChartboost:Z = true

.field public static final canEntryTag:Z = true

.field public static final canMAT:Z = true

.field public static final canNanigans:Z = true

.field public static final canTapjoy:Z = true

.field public static final php:Ljava/lang/String; = "http://www.hobbitmobile.com/entrytag.php"

.field public static final recorderphp:Ljava/lang/String; = "http://www.hobbitmobile.com/entrytag.php"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 12
    const-string v0, "DeviceInformation"

    #v0=(Reference);
    sput-object v0, Lcom/kabam/utility/constance/Constance;->FileName:Ljava/lang/String;

    .line 14
    const-string v0, "UNKNOWN"

    sput-object v0, Lcom/kabam/utility/constance/Constance;->Default:Ljava/lang/String;

    .line 16
    const-string v0, "KMAC0"

    sput-object v0, Lcom/kabam/utility/constance/Constance;->MacAddressKey:Ljava/lang/String;

    .line 17
    const-string v0, "KMANUFACTOR"

    sput-object v0, Lcom/kabam/utility/constance/Constance;->ManufactorKey:Ljava/lang/String;

    .line 18
    const-string v0, "KMODEL"

    sput-object v0, Lcom/kabam/utility/constance/Constance;->ModalKey:Ljava/lang/String;

    .line 19
    const-string v0, "KOSNAME"

    sput-object v0, Lcom/kabam/utility/constance/Constance;->OSNameKey:Ljava/lang/String;

    .line 20
    const-string v0, "KOSVERSION"

    sput-object v0, Lcom/kabam/utility/constance/Constance;->OSVersionKey:Ljava/lang/String;

    .line 21
    const-string v0, "KSYSLANGUAGE"

    sput-object v0, Lcom/kabam/utility/constance/Constance;->SystemLanguageKey:Ljava/lang/String;

    .line 22
    const-string v0, "SystemLanguageISO"

    sput-object v0, Lcom/kabam/utility/constance/Constance;->SystemLanguageISOKey:Ljava/lang/String;

    .line 23
    const-string v0, "KCARRIERNAME"

    sput-object v0, Lcom/kabam/utility/constance/Constance;->CarrierNameKey:Ljava/lang/String;

    .line 24
    const-string v0, "KMNC"

    sput-object v0, Lcom/kabam/utility/constance/Constance;->MNCKey:Ljava/lang/String;

    .line 25
    const-string v0, "KMCC"

    sput-object v0, Lcom/kabam/utility/constance/Constance;->MCCKey:Ljava/lang/String;

    .line 26
    const-string v0, "OPENUDID"

    sput-object v0, Lcom/kabam/utility/constance/Constance;->OpenUDID:Ljava/lang/String;

    .line 27
    const-string v0, "KUDID"

    sput-object v0, Lcom/kabam/utility/constance/Constance;->UDID:Ljava/lang/String;

    .line 32
    const/4 v0, 0x2

    #v0=(PosByte);
    sput v0, Lcom/kabam/utility/constance/Constance;->Facebook:I

    .line 33
    const/4 v0, 0x3

    sput v0, Lcom/kabam/utility/constance/Constance;->EMail:I

    .line 34
    const/4 v0, 0x4

    sput v0, Lcom/kabam/utility/constance/Constance;->SMS:I

    .line 41
    const-string v0, "NeedGooglePlay"

    #v0=(Reference);
    sput-object v0, Lcom/kabam/utility/constance/Constance;->NeedGooglePlayFlag:Ljava/lang/String;

    .line 124
    const-wide/16 v0, -0x1

    #v0=(LongLo);v1=(LongHi);
    sput-wide v0, Lcom/kabam/utility/constance/Constance;->BILLING_RESPONSE_INVALID_REQUEST_ID:J

    .line 170
    const-string v0, "Error.SMS_invite"

    #v0=(Reference);
    sput-object v0, Lcom/kabam/utility/constance/Constance;->SMSNotSupportedKey:Ljava/lang/String;

    .line 171
    const-string v0, "Error.No_Facebook"

    sput-object v0, Lcom/kabam/utility/constance/Constance;->FacebookLoginDenied:Ljava/lang/String;

    .line 193
    const-class v0, Lcom/kabam/fortress/KBNActivity;

    sput-object v0, Lcom/kabam/utility/constance/Constance;->NotificationClass:Ljava/lang/Class;

    .line 7
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

*/}
