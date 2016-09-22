package com.tapjoy; class TapjoyHardwareUtil {/*

.class public Lcom/tapjoy/TapjoyHardwareUtil;
.super Ljava/lang/Object;
.source "TapjoyHardwareUtil.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public getSerial()Ljava/lang/String;
    .locals 7

    .prologue
    .line 22
    const/4 v3, 0x0

    .line 26
    .local v3, serial:Ljava/lang/String;
    :try_start_0
    #v3=(Null);
    const-string v4, "android.os.Build"

    #v4=(Reference);
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 27
    .local v0, clazz:Ljava/lang/Class;,"Ljava/lang/Class<*>;"
    #v0=(Reference);
    const-string v4, "SERIAL"

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 29
    .local v2, field:Ljava/lang/reflect/Field;
    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->isAccessible()Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_0

    .line 30
    const/4 v4, 0x1

    #v4=(One);
    invoke-virtual {v2, v4}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 32
    :cond_0
    #v4=(Boolean);
    const-class v4, Landroid/os/Build;

    #v4=(Reference);
    invoke-virtual {v2, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 34
    #v3=(Reference);
    const-string v4, "TapjoyHardwareUtil"

    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    const-string v6, "serial: "

    #v6=(Reference);
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .end local v0           #clazz:Ljava/lang/Class;,"Ljava/lang/Class<*>;"
    .end local v2           #field:Ljava/lang/reflect/Field;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v6=(Conflicted);
    return-object v3

    .line 36
    :catch_0
    #v1=(Uninit);v4=(Conflicted);v5=(Conflicted);
    move-exception v1

    .line 38
    .local v1, e:Ljava/lang/Exception;
    #v1=(Reference);
    const-string v4, "TapjoyHardwareUtil"

    #v4=(Reference);
    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-static {v4, v5}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

*/}
