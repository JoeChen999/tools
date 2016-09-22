package com.kabam.nanigans; class Nanigans$1 {/*

.class Lcom/kabam/nanigans/Nanigans$1;
.super Ljava/lang/Object;
.source "Nanigans.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kabam/nanigans/Nanigans;->trackNanigansEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kabam/nanigans/Nanigans;

.field private final synthetic val$attributionIdFinal:Ljava/lang/String;

.field private final synthetic val$eventParameter:[Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;

.field private final synthetic val$name:Ljava/lang/String;

.field private final synthetic val$type:Ljava/lang/String;

.field private final synthetic val$uid:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/kabam/nanigans/Nanigans;[Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/kabam/nanigans/Nanigans$1;->this$0:Lcom/kabam/nanigans/Nanigans;

    iput-object p2, p0, Lcom/kabam/nanigans/Nanigans$1;->val$eventParameter:[Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;

    iput-object p3, p0, Lcom/kabam/nanigans/Nanigans$1;->val$type:Ljava/lang/String;

    iput-object p4, p0, Lcom/kabam/nanigans/Nanigans$1;->val$attributionIdFinal:Ljava/lang/String;

    iput-object p5, p0, Lcom/kabam/nanigans/Nanigans$1;->val$uid:Ljava/lang/String;

    iput-object p6, p0, Lcom/kabam/nanigans/Nanigans$1;->val$name:Ljava/lang/String;

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 22

    .prologue
    .line 104
    new-instance v11, Ljava/util/ArrayList;

    #v11=(UninitRef);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v14, v0, Lcom/kabam/nanigans/Nanigans$1;->val$eventParameter:[Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;

    #v14=(Reference);
    if-nez v14, :cond_6

    const/4 v14, 0x0

    :goto_0
    #v14=(Integer);
    add-int/lit8 v14, v14, 0x6

    invoke-direct {v11, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 105
    .local v11, parameters:Ljava/util/List;,"Ljava/util/List<Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;>;"
    #v11=(Reference);
    new-instance v14, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;

    #v14=(UninitRef);
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/kabam/nanigans/Nanigans$1;->this$0:Lcom/kabam/nanigans/Nanigans;

    #v15=(Reference);
    const-string v16, "type"

    #v16=(Reference);
    const/16 v17, 0x1

    #v17=(One);
    move/from16 v0, v17

    #v0=(One);
    new-array v0, v0, [Ljava/lang/String;

    #v0=(Reference);
    move-object/from16 v17, v0

    #v17=(Reference);
    const/16 v18, 0x0

    #v18=(Null);
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kabam/nanigans/Nanigans$1;->val$type:Ljava/lang/String;

    move-object/from16 v19, v0

    #v19=(Reference);
    aput-object v19, v17, v18

    invoke-direct/range {v14 .. v17}, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;-><init>(Lcom/kabam/nanigans/Nanigans;Ljava/lang/String;[Ljava/lang/String;)V

    #v14=(Reference);
    invoke-interface {v11, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 106
    new-instance v14, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;

    #v14=(UninitRef);
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/kabam/nanigans/Nanigans$1;->this$0:Lcom/kabam/nanigans/Nanigans;

    const-string v16, "fb_app_id"

    const/16 v17, 0x1

    #v17=(One);
    move/from16 v0, v17

    #v0=(One);
    new-array v0, v0, [Ljava/lang/String;

    #v0=(Reference);
    move-object/from16 v17, v0

    #v17=(Reference);
    const/16 v18, 0x0

    invoke-static {}, Lcom/kabam/nanigans/Nanigans;->access$0()Ljava/lang/String;

    move-result-object v19

    aput-object v19, v17, v18

    invoke-direct/range {v14 .. v17}, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;-><init>(Lcom/kabam/nanigans/Nanigans;Ljava/lang/String;[Ljava/lang/String;)V

    #v14=(Reference);
    invoke-interface {v11, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/kabam/nanigans/Nanigans$1;->val$attributionIdFinal:Ljava/lang/String;

    if-eqz v14, :cond_0

    new-instance v14, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;

    #v14=(UninitRef);
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/kabam/nanigans/Nanigans$1;->this$0:Lcom/kabam/nanigans/Nanigans;

    const-string v16, "fb_attr_id"

    const/16 v17, 0x1

    #v17=(One);
    move/from16 v0, v17

    #v0=(One);
    new-array v0, v0, [Ljava/lang/String;

    #v0=(Reference);
    move-object/from16 v17, v0

    #v17=(Reference);
    const/16 v18, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kabam/nanigans/Nanigans$1;->val$attributionIdFinal:Ljava/lang/String;

    move-object/from16 v19, v0

    aput-object v19, v17, v18

    invoke-direct/range {v14 .. v17}, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;-><init>(Lcom/kabam/nanigans/Nanigans;Ljava/lang/String;[Ljava/lang/String;)V

    #v14=(Reference);
    invoke-interface {v11, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    :cond_0
    new-instance v14, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;

    #v14=(UninitRef);
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/kabam/nanigans/Nanigans$1;->this$0:Lcom/kabam/nanigans/Nanigans;

    const-string v16, "user_id"

    const/16 v17, 0x1

    #v17=(One);
    move/from16 v0, v17

    #v0=(One);
    new-array v0, v0, [Ljava/lang/String;

    #v0=(Reference);
    move-object/from16 v17, v0

    #v17=(Reference);
    const/16 v18, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kabam/nanigans/Nanigans$1;->val$uid:Ljava/lang/String;

    move-object/from16 v19, v0

    aput-object v19, v17, v18

    invoke-direct/range {v14 .. v17}, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;-><init>(Lcom/kabam/nanigans/Nanigans;Ljava/lang/String;[Ljava/lang/String;)V

    #v14=(Reference);
    invoke-interface {v11, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 109
    new-instance v14, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;

    #v14=(UninitRef);
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/kabam/nanigans/Nanigans$1;->this$0:Lcom/kabam/nanigans/Nanigans;

    const-string v16, "name"

    const/16 v17, 0x1

    #v17=(One);
    move/from16 v0, v17

    #v0=(One);
    new-array v0, v0, [Ljava/lang/String;

    #v0=(Reference);
    move-object/from16 v17, v0

    #v17=(Reference);
    const/16 v18, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kabam/nanigans/Nanigans$1;->val$name:Ljava/lang/String;

    move-object/from16 v19, v0

    aput-object v19, v17, v18

    invoke-direct/range {v14 .. v17}, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;-><init>(Lcom/kabam/nanigans/Nanigans;Ljava/lang/String;[Ljava/lang/String;)V

    #v14=(Reference);
    invoke-interface {v11, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    const/4 v12, 0x0

    .line 111
    .local v12, uniqueSeen:Z
    #v12=(Null);
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/kabam/nanigans/Nanigans$1;->val$eventParameter:[Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;

    if-eqz v14, :cond_1

    .line 112
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/kabam/nanigans/Nanigans$1;->val$eventParameter:[Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;

    array-length v0, v15

    #v0=(Integer);
    move/from16 v16, v0

    #v16=(Integer);
    const/4 v14, 0x0

    :goto_1
    #v6=(Conflicted);v12=(Boolean);v14=(Integer);v18=(Reference);
    move/from16 v0, v16

    if-lt v14, v0, :cond_7

    .line 119
    :cond_1
    #v0=(Conflicted);v14=(Conflicted);v16=(Conflicted);
    if-nez v12, :cond_2

    new-instance v14, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;

    #v14=(UninitRef);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v15, v0, Lcom/kabam/nanigans/Nanigans$1;->this$0:Lcom/kabam/nanigans/Nanigans;

    const-string v16, "unique"

    #v16=(Reference);
    const/16 v17, 0x1

    #v17=(One);
    move/from16 v0, v17

    #v0=(One);
    new-array v0, v0, [Ljava/lang/String;

    #v0=(Reference);
    move-object/from16 v17, v0

    #v17=(Reference);
    const/16 v18, 0x0

    #v18=(Null);
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v19

    const-string v20, "-"

    #v20=(Reference);
    const-string v21, ""

    #v21=(Reference);
    invoke-virtual/range {v19 .. v21}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    aput-object v19, v17, v18

    invoke-direct/range {v14 .. v17}, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;-><init>(Lcom/kabam/nanigans/Nanigans;Ljava/lang/String;[Ljava/lang/String;)V

    #v14=(Reference);
    invoke-interface {v11, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 120
    :cond_2
    #v0=(Conflicted);v14=(Conflicted);v16=(Conflicted);v18=(Reference);v20=(Conflicted);v21=(Conflicted);
    const/4 v9, 0x0

    .line 121
    .local v9, is:Ljava/io/InputStream;
    #v9=(Null);
    const/4 v3, 0x0

    .line 124
    .local v3, baos:Ljava/io/ByteArrayOutputStream;
    #v3=(Null);
    const/4 v1, 0x0

    .line 125
    .local v1, address:Ljava/lang/StringBuilder;
    :try_start_0
    #v1=(Null);
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7

    move-result-object v14

    #v14=(Reference);
    move-object v2, v1

    .end local v1           #address:Ljava/lang/StringBuilder;
    .local v2, address:Ljava/lang/StringBuilder;
    :cond_3
    :goto_2
    :try_start_1
    #v1=(Reference);v2=(Reference);v8=(Conflicted);v10=(Conflicted);v15=(Conflicted);
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    #v15=(Boolean);
    if-nez v15, :cond_a

    .line 139
    new-instance v13, Ljava/net/URL;

    #v13=(UninitRef);
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-direct {v13, v14}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 140
    .local v13, url:Ljava/net/URL;
    #v13=(Reference);
    invoke-virtual {v13}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object v9

    .line 141
    #v9=(Reference);
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_8

    .line 142
    .end local v3           #baos:Ljava/io/ByteArrayOutputStream;
    .local v4, baos:Ljava/io/ByteArrayOutputStream;
    #v4=(Reference);
    const/16 v14, 0x400

    :try_start_2
    #v14=(PosShort);
    new-array v5, v14, [B

    .line 143
    .local v5, buffer:[B
    :goto_3
    #v5=(Reference);v14=(Integer);v15=(Byte);
    invoke-virtual {v9, v5}, Ljava/io/InputStream;->read([B)I

    move-result v14

    const/4 v15, -0x1

    if-ne v14, v15, :cond_f

    .line 146
    sget-object v14, Ljava/lang/System;->out:Ljava/io/PrintStream;

    #v14=(Reference);
    new-instance v15, Ljava/lang/StringBuilder;

    #v15=(UninitRef);
    const-string v16, "TRACK EVENT REQUEST "

    #v16=(Reference);
    invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v15=(Reference);
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    const-string v16, ",RESPONSE: "

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    const-string v16, "UTF-8"

    move-object/from16 v0, v16

    #v0=(Reference);
    invoke-virtual {v4, v0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 150
    if-eqz v9, :cond_4

    :try_start_3
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6

    .line 151
    :cond_4
    :goto_4
    if-eqz v4, :cond_13

    :try_start_4
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    move-object v3, v4

    .line 153
    .end local v2           #address:Ljava/lang/StringBuilder;
    .end local v4           #baos:Ljava/io/ByteArrayOutputStream;
    .end local v5           #buffer:[B
    .end local v13           #url:Ljava/net/URL;
    .restart local v3       #baos:Ljava/io/ByteArrayOutputStream;
    :cond_5
    :goto_5
    #v0=(Conflicted);v2=(Conflicted);v3=(Reference);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
    return-void

    .line 104
    .end local v3           #baos:Ljava/io/ByteArrayOutputStream;
    .end local v9           #is:Ljava/io/InputStream;
    .end local v11           #parameters:Ljava/util/List;,"Ljava/util/List<Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;>;"
    .end local v12           #uniqueSeen:Z
    :cond_6
    #v0=(Reference);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(UninitRef);v12=(Uninit);v13=(Uninit);v14=(Reference);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/kabam/nanigans/Nanigans$1;->val$eventParameter:[Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;

    array-length v14, v14

    #v14=(Integer);
    goto/16 :goto_0

    .line 112
    .restart local v11       #parameters:Ljava/util/List;,"Ljava/util/List<Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;>;"
    .restart local v12       #uniqueSeen:Z
    :cond_7
    #v0=(Integer);v6=(Conflicted);v11=(Reference);v12=(Boolean);v15=(Reference);v16=(Integer);v17=(Reference);v18=(Reference);v19=(Reference);
    aget-object v6, v15, v14

    .line 113
    .local v6, currParam:Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;
    #v6=(Null);
    if-eqz v6, :cond_8

    invoke-static {v6}, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;->access$0(Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;)Ljava/lang/String;

    move-result-object v17

    if-eqz v17, :cond_8

    invoke-static {v6}, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;->access$1(Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;)[Ljava/lang/String;

    move-result-object v17

    if-nez v17, :cond_9

    .line 112
    :cond_8
    :goto_6
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_1

    .line 114
    :cond_9
    invoke-interface {v11, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 115
    if-nez v12, :cond_8

    invoke-static {v6}, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;->access$0(Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;)Ljava/lang/String;

    move-result-object v17

    const-string v18, "unique"

    invoke-virtual/range {v17 .. v18}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    goto :goto_6

    .line 125
    .end local v6           #currParam:Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;
    .restart local v2       #address:Ljava/lang/StringBuilder;
    .restart local v3       #baos:Ljava/io/ByteArrayOutputStream;
    .restart local v9       #is:Ljava/io/InputStream;
    :cond_a
    :try_start_5
    #v0=(Conflicted);v1=(Reference);v2=(Reference);v3=(Null);v6=(Conflicted);v8=(Conflicted);v9=(Null);v10=(Conflicted);v14=(Reference);v15=(Boolean);v16=(Conflicted);v20=(Conflicted);v21=(Conflicted);
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    #v10=(Reference);
    check-cast v10, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;

    .line 126
    .local v10, param:Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;
    if-eqz v10, :cond_3

    invoke-static {v10}, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;->access$0(Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;)Ljava/lang/String;

    move-result-object v15

    #v15=(Reference);
    if-eqz v15, :cond_3

    invoke-static {v10}, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;->access$1(Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;)[Ljava/lang/String;

    move-result-object v15

    if-eqz v15, :cond_3

    .line 127
    if-nez v2, :cond_b

    .line 128
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v15, "http://api.nanigans.com/mobile.php?"

    .line 127
    invoke-direct {v1, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_8

    .line 130
    .end local v2           #address:Ljava/lang/StringBuilder;
    .restart local v1       #address:Ljava/lang/StringBuilder;
    :goto_7
    :try_start_6
    #v1=(Reference);
    invoke-static {v10}, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;->access$1(Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;)[Ljava/lang/String;

    move-result-object v15

    array-length v15, v15

    #v15=(Integer);
    const/16 v16, 0x1

    #v16=(One);
    move/from16 v0, v16

    #v0=(One);
    if-ne v15, v0, :cond_c

    .line 131
    invoke-static {v10}, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;->access$0(Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;)Ljava/lang/String;

    move-result-object v15

    #v15=(Reference);
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    const-string v16, "="

    #v16=(Reference);
    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-static {v10}, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;->access$1(Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;)[Ljava/lang/String;

    move-result-object v16

    const/16 v17, 0x0

    #v17=(Null);
    aget-object v16, v16, v17

    #v16=(Null);
    const-string v17, "UTF-8"

    #v17=(Reference);
    invoke-static/range {v16 .. v17}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    #v16=(Reference);
    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_7

    move-object v2, v1

    .end local v1           #address:Ljava/lang/StringBuilder;
    .restart local v2       #address:Ljava/lang/StringBuilder;
    goto/16 :goto_2

    .line 129
    :cond_b
    :try_start_7
    #v0=(Conflicted);v16=(Conflicted);
    const-string v15, "&"

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_8

    move-object v1, v2

    .end local v2           #address:Ljava/lang/StringBuilder;
    .restart local v1       #address:Ljava/lang/StringBuilder;
    goto :goto_7

    .line 133
    :cond_c
    #v0=(One);v15=(Integer);v16=(One);
    const/4 v8, 0x0

    .local v8, i:I
    :goto_8
    :try_start_8
    #v8=(Integer);v15=(Conflicted);v16=(Conflicted);
    invoke-static {v10}, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;->access$1(Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;)[Ljava/lang/String;

    move-result-object v15

    #v15=(Reference);
    array-length v15, v15

    #v15=(Integer);
    if-lt v8, v15, :cond_d

    move-object v2, v1

    .end local v1           #address:Ljava/lang/StringBuilder;
    .restart local v2       #address:Ljava/lang/StringBuilder;
    goto/16 :goto_2

    .line 134
    .end local v2           #address:Ljava/lang/StringBuilder;
    .restart local v1       #address:Ljava/lang/StringBuilder;
    :cond_d
    if-eqz v8, :cond_e

    const-string v15, "&"

    #v15=(Reference);
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    :cond_e
    #v15=(Conflicted);
    invoke-static {v10}, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;->access$0(Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;)Ljava/lang/String;

    move-result-object v15

    #v15=(Reference);
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    const-string v16, "["

    #v16=(Reference);
    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v15

    const-string v16, "]="

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-static {v10}, Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;->access$1(Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;)[Ljava/lang/String;

    move-result-object v16

    aget-object v16, v16, v8

    #v16=(Null);
    const-string v17, "UTF-8"

    invoke-static/range {v16 .. v17}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    #v16=(Reference);
    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    .line 133
    add-int/lit8 v8, v8, 0x1

    goto :goto_8

    .line 144
    .end local v1           #address:Ljava/lang/StringBuilder;
    .end local v3           #baos:Ljava/io/ByteArrayOutputStream;
    .end local v8           #i:I
    .end local v10           #param:Lcom/kabam/nanigans/Nanigans$NanigansEventParameter;
    .restart local v2       #address:Ljava/lang/StringBuilder;
    .restart local v4       #baos:Ljava/io/ByteArrayOutputStream;
    .restart local v5       #buffer:[B
    .restart local v13       #url:Ljava/net/URL;
    :cond_f
    :try_start_9
    #v0=(Conflicted);v4=(Reference);v5=(Reference);v8=(Conflicted);v9=(Reference);v10=(Conflicted);v13=(Reference);v14=(Integer);v15=(Byte);v16=(Conflicted);
    invoke-virtual {v4, v5}, Ljava/io/ByteArrayOutputStream;->write([B)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    goto/16 :goto_3

    .line 147
    .end local v5           #buffer:[B
    :catch_0
    #v5=(Conflicted);v14=(Conflicted);v15=(Conflicted);
    move-exception v7

    #v7=(Reference);
    move-object v1, v2

    .end local v2           #address:Ljava/lang/StringBuilder;
    .restart local v1       #address:Ljava/lang/StringBuilder;
    move-object v3, v4

    .line 148
    .end local v4           #baos:Ljava/io/ByteArrayOutputStream;
    .end local v13           #url:Ljava/net/URL;
    .restart local v3       #baos:Ljava/io/ByteArrayOutputStream;
    .local v7, e:Ljava/lang/Exception;
    :goto_9
    :try_start_a
    #v2=(Conflicted);v3=(Reference);v4=(Conflicted);v13=(Conflicted);
    invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 150
    if-eqz v9, :cond_10

    :try_start_b
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_3

    .line 151
    :cond_10
    :goto_a
    if-eqz v3, :cond_5

    :try_start_c
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_1

    goto/16 :goto_5

    :catch_1
    move-exception v14

    #v14=(Reference);
    goto/16 :goto_5

    .line 149
    .end local v1           #address:Ljava/lang/StringBuilder;
    .end local v7           #e:Ljava/lang/Exception;
    :catchall_0
    #v1=(Conflicted);v7=(Conflicted);v14=(Conflicted);
    move-exception v14

    .line 150
    :goto_b
    #v14=(Reference);
    if-eqz v9, :cond_11

    :try_start_d
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_4

    .line 151
    :cond_11
    :goto_c
    if-eqz v3, :cond_12

    :try_start_e
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_5

    .line 152
    :cond_12
    :goto_d
    throw v14

    .line 151
    .end local v3           #baos:Ljava/io/ByteArrayOutputStream;
    .restart local v2       #address:Ljava/lang/StringBuilder;
    .restart local v4       #baos:Ljava/io/ByteArrayOutputStream;
    .restart local v5       #buffer:[B
    .restart local v13       #url:Ljava/net/URL;
    :catch_2
    #v0=(Reference);v1=(Reference);v2=(Reference);v3=(Null);v4=(Reference);v5=(Reference);v7=(Uninit);v13=(Reference);v15=(Reference);v16=(Reference);
    move-exception v14

    move-object v3, v4

    .end local v4           #baos:Ljava/io/ByteArrayOutputStream;
    .restart local v3       #baos:Ljava/io/ByteArrayOutputStream;
    #v3=(Reference);
    goto/16 :goto_5

    .line 150
    .end local v2           #address:Ljava/lang/StringBuilder;
    .end local v5           #buffer:[B
    .end local v13           #url:Ljava/net/URL;
    .restart local v1       #address:Ljava/lang/StringBuilder;
    .restart local v7       #e:Ljava/lang/Exception;
    :catch_3
    #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Reference);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
    move-exception v14

    #v14=(Reference);
    goto :goto_a

    .end local v1           #address:Ljava/lang/StringBuilder;
    .end local v7           #e:Ljava/lang/Exception;
    :catch_4
    #v1=(Conflicted);v7=(Conflicted);
    move-exception v15

    #v15=(Reference);
    goto :goto_c

    .line 151
    :catch_5
    #v15=(Conflicted);
    move-exception v15

    #v15=(Reference);
    goto :goto_d

    .line 150
    .end local v3           #baos:Ljava/io/ByteArrayOutputStream;
    .restart local v2       #address:Ljava/lang/StringBuilder;
    .restart local v4       #baos:Ljava/io/ByteArrayOutputStream;
    .restart local v5       #buffer:[B
    .restart local v13       #url:Ljava/net/URL;
    :catch_6
    #v0=(Reference);v1=(Reference);v2=(Reference);v3=(Null);v4=(Reference);v5=(Reference);v7=(Uninit);v13=(Reference);v16=(Reference);
    move-exception v14

    goto/16 :goto_4

    .line 149
    .end local v5           #buffer:[B
    :catchall_1
    #v0=(Conflicted);v5=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
    move-exception v14

    #v14=(Reference);
    move-object v3, v4

    .end local v4           #baos:Ljava/io/ByteArrayOutputStream;
    .restart local v3       #baos:Ljava/io/ByteArrayOutputStream;
    #v3=(Reference);
    goto :goto_b

    .line 147
    .end local v2           #address:Ljava/lang/StringBuilder;
    .end local v13           #url:Ljava/net/URL;
    .restart local v1       #address:Ljava/lang/StringBuilder;
    :catch_7
    #v2=(Conflicted);v3=(Null);v4=(Uninit);v5=(Uninit);v9=(Null);v13=(Uninit);v14=(Conflicted);
    move-exception v7

    #v7=(Reference);
    goto :goto_9

    .end local v1           #address:Ljava/lang/StringBuilder;
    .restart local v2       #address:Ljava/lang/StringBuilder;
    :catch_8
    #v1=(Conflicted);v2=(Reference);v4=(Conflicted);v7=(Uninit);v9=(Reference);v13=(Conflicted);v14=(Reference);
    move-exception v7

    #v7=(Reference);
    move-object v1, v2

    .end local v2           #address:Ljava/lang/StringBuilder;
    .restart local v1       #address:Ljava/lang/StringBuilder;
    #v1=(Reference);
    goto :goto_9

    .end local v1           #address:Ljava/lang/StringBuilder;
    .end local v3           #baos:Ljava/io/ByteArrayOutputStream;
    .restart local v2       #address:Ljava/lang/StringBuilder;
    .restart local v4       #baos:Ljava/io/ByteArrayOutputStream;
    .restart local v5       #buffer:[B
    .restart local v13       #url:Ljava/net/URL;
    :cond_13
    #v0=(Reference);v4=(Reference);v5=(Reference);v7=(Uninit);v13=(Reference);v15=(Reference);v16=(Reference);
    move-object v3, v4

    .end local v4           #baos:Ljava/io/ByteArrayOutputStream;
    .restart local v3       #baos:Ljava/io/ByteArrayOutputStream;
    #v3=(Reference);
    goto/16 :goto_5
.end method

*/}
