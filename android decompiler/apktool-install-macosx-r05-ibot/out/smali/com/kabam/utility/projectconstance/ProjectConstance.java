package com.kabam.utility.projectconstance; class ProjectConstance {/*

.class public Lcom/kabam/utility/projectconstance/ProjectConstance;
.super Ljava/lang/Object;
.source "ProjectConstance.java"


# static fields
.field public static final ACTION_NOTIFICATION:Ljava/lang/String; = "com.kabam.notification"

.field public static final AdwordsID:Ljava/lang/String; = "UA-35699114-1"

.field public static final AlreadyPurchased:Ljava/lang/String; = "already purchased"

.field public static final ChartBoostID:Ljava/lang/String; = "507ca53d17ba47912d000001"

.field public static final ChartBoostSignature:Ljava/lang/String; = "0e2534c7611a00211f660563fac3d4c9a80617e6"

.field public static EMail:I = 0x0

.field public static Facebook:I = 0x0

.field public static final FacebookID:Ljava/lang/String; = "256425107811295"

.field public static FacebookLoginDenied:Ljava/lang/String; = null

.field public static final FirstChatKey:Ljava/lang/String; = "firstchat"

.field public static final FirstLoginKey:Ljava/lang/String; = "firstlogin"

.field public static final Game:Ljava/lang/String; = "fortress"

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

.field public static final MATID:Ljava/lang/String; = "885"

.field public static final MATKey:Ljava/lang/String; = "5fe62a47e94a9edb757022c4f72e6386"

.field public static final NotSupported:Ljava/lang/String; = "not supported"

.field public static final NotificationClass:Ljava/lang/Class; = null

.field public static final NotificationDisplayTimeScope:I = 0x5265c00

.field public static final NotificationLogo:I = 0x7f020001

.field public static final NotificationMessageKey:Ljava/lang/String; = "messagekey"

.field public static final NotificationTitle:Ljava/lang/String; = "Hobbit: KoM"

.field public static final PublicKey:Ljava/lang/String; = "Ming Cai\'s public key."

.field public static SMS:I = 0x0

.field public static SMSNotSupportedKey:Ljava/lang/String; = null

.field public static final SiteID:Ljava/lang/String; = "4880"

.field public static final TapJoyAppID:Ljava/lang/String; = "25459e5b-9bf7-4812-bd34-cfcc907210ad"

.field public static final TapJoyScretKey:Ljava/lang/String; = "zdTg28wtp7XJH2OxN4IG"

.field public static final TempFolderName:Ljava/lang/String; = "CamelotTemp"

.field public static final TrackMobileURL:Ljava/lang/String; = "http://www.hobbitmobile.com/ajax/playerDeviceLog.php"

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
    .locals 1

    .prologue
    .line 35
    const-string v0, "Error.SMS_invite"

    #v0=(Reference);
    sput-object v0, Lcom/kabam/utility/projectconstance/ProjectConstance;->SMSNotSupportedKey:Ljava/lang/String;

    .line 36
    const-string v0, "Error.No_Facebook"

    sput-object v0, Lcom/kabam/utility/projectconstance/ProjectConstance;->FacebookLoginDenied:Ljava/lang/String;

    .line 45
    const/4 v0, 0x2

    #v0=(PosByte);
    sput v0, Lcom/kabam/utility/projectconstance/ProjectConstance;->Facebook:I

    .line 46
    const/4 v0, 0x3

    sput v0, Lcom/kabam/utility/projectconstance/ProjectConstance;->EMail:I

    .line 47
    const/4 v0, 0x4

    sput v0, Lcom/kabam/utility/projectconstance/ProjectConstance;->SMS:I

    .line 64
    const-class v0, Lcom/kabam/fortress/KBNActivity;

    #v0=(Reference);
    sput-object v0, Lcom/kabam/utility/projectconstance/ProjectConstance;->NotificationClass:Ljava/lang/Class;

    .line 6
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

*/}
