package com.tapjoy; class TapjoyUtil {/*

.class public Lcom/tapjoy/TapjoyUtil;
.super Ljava/lang/Object;
.source "TapjoyUtil.java"


# static fields
.field private static final TAPJOY_UTIL:Ljava/lang/String; = "TapjoyUtil"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static SHA1(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .parameter "text"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .prologue
    .line 40
    const-string v0, "SHA-1"

    #v0=(Reference);
    invoke-static {v0, p0}, Lcom/tapjoy/TapjoyUtil;->hashAlgorithm(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static SHA256(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .parameter "text"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .prologue
    .line 55
    const-string v0, "SHA-256"

    #v0=(Reference);
    invoke-static {v0, p0}, Lcom/tapjoy/TapjoyUtil;->hashAlgorithm(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static buildDocument(Ljava/lang/String;)Lorg/w3c/dom/Document;
    .locals 8
    .parameter "xml"

    .prologue
    .line 122
    const/4 v0, 0x0

    .line 126
    .local v0, document:Lorg/w3c/dom/Document;
    :try_start_0
    #v0=(Null);
    invoke-static {}, Ljavax/xml/parsers/DocumentBuilderFactory;->newInstance()Ljavax/xml/parsers/DocumentBuilderFactory;

    move-result-object v3

    .line 130
    .local v3, factory:Ljavax/xml/parsers/DocumentBuilderFactory;
    #v3=(Reference);
    new-instance v4, Ljava/io/ByteArrayInputStream;

    #v4=(UninitRef);
    const-string v5, "UTF-8"

    #v5=(Reference);
    invoke-virtual {p0, v5}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 132
    .local v4, is:Ljava/io/InputStream;
    #v4=(Reference);
    invoke-virtual {v3}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;

    move-result-object v1

    .line 133
    .local v1, documentBuilder:Ljavax/xml/parsers/DocumentBuilder;
    #v1=(Reference);
    invoke-virtual {v1, v4}, Ljavax/xml/parsers/DocumentBuilder;->parse(Ljava/io/InputStream;)Lorg/w3c/dom/Document;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 140
    .end local v1           #documentBuilder:Ljavax/xml/parsers/DocumentBuilder;
    .end local v3           #factory:Ljavax/xml/parsers/DocumentBuilderFactory;
    .end local v4           #is:Ljava/io/InputStream;
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return-object v0

    .line 135
    :catch_0
    #v0=(Null);v2=(Uninit);v5=(Conflicted);v6=(Uninit);v7=(Uninit);
    move-exception v2

    .line 137
    .local v2, e:Ljava/lang/Exception;
    #v2=(Reference);
    const-string v5, "TapjoyUtil"

    #v5=(Reference);
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    const-string v7, "buildDocument exception: "

    #v7=(Reference);
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/tapjoy/TapjoyLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private static convertToHex([B)Ljava/lang/String;
    .locals 6
    .parameter "data"

    .prologue
    .line 91
    new-instance v0, Ljava/lang/StringBuffer;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 93
    .local v0, buf:Ljava/lang/StringBuffer;
    #v0=(Reference);
    const/4 v2, 0x0

    .local v2, i:I
    :goto_0
    #v1=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    array-length v5, p0

    #v5=(Integer);
    if-ge v2, v5, :cond_1

    .line 95
    aget-byte v5, p0, v2

    #v5=(Byte);
    ushr-int/lit8 v5, v5, 0x4

    #v5=(Integer);
    and-int/lit8 v1, v5, 0xf

    .line 96
    .local v1, halfbyte:I
    #v1=(Integer);
    const/4 v3, 0x0

    .local v3, two_halfs:I
    #v3=(Null);
    move v4, v3

    .line 100
    .end local v3           #two_halfs:I
    .local v4, two_halfs:I
    :goto_1
    #v3=(Integer);v4=(Integer);
    if-ltz v1, :cond_0

    const/16 v5, 0x9

    #v5=(PosByte);
    if-gt v1, v5, :cond_0

    .line 101
    add-int/lit8 v5, v1, 0x30

    #v5=(Integer);
    int-to-char v5, v5

    #v5=(Char);
    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 104
    :goto_2
    aget-byte v5, p0, v2

    #v5=(Byte);
    and-int/lit8 v1, v5, 0xf

    .line 107
    add-int/lit8 v3, v4, 0x1

    .end local v4           #two_halfs:I
    .restart local v3       #two_halfs:I
    const/4 v5, 0x1

    #v5=(One);
    if-lt v4, v5, :cond_2

    .line 93
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 103
    .end local v3           #two_halfs:I
    .restart local v4       #two_halfs:I
    :cond_0
    #v5=(Integer);
    add-int/lit8 v5, v1, -0xa

    add-int/lit8 v5, v5, 0x61

    int-to-char v5, v5

    #v5=(Char);
    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_2

    .line 110
    .end local v1           #halfbyte:I
    .end local v4           #two_halfs:I
    :cond_1
    #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Integer);
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    return-object v5

    .restart local v1       #halfbyte:I
    .restart local v3       #two_halfs:I
    :cond_2
    #v1=(Integer);v3=(Integer);v4=(Integer);v5=(One);
    move v4, v3

    .end local v3           #two_halfs:I
    .restart local v4       #two_halfs:I
    goto :goto_1
.end method

.method public static createBitmapFromView(Landroid/view/View;)Landroid/graphics/Bitmap;
    .locals 6
    .parameter "v"

    .prologue
    .line 207
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    #v2=(Reference);
    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    #v2=(Integer);
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    #v3=(Reference);
    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    #v3=(Integer);
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    #v4=(Reference);
    invoke-static {v2, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 208
    .local v0, b:Landroid/graphics/Bitmap;
    #v0=(Reference);
    new-instance v1, Landroid/graphics/Canvas;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 209
    .local v1, c:Landroid/graphics/Canvas;
    #v1=(Reference);
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result v4

    #v4=(Integer);
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {p0, v2, v3, v4, v5}, Landroid/view/View;->layout(IIII)V

    .line 210
    invoke-virtual {p0, v1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 211
    return-object v0
.end method

.method public static deleteFileOrDirectory(Ljava/io/File;)V
    .locals 7
    .parameter "fileOrDirectory"

    .prologue
    .line 187
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_0

    .line 189
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    .local v0, arr$:[Ljava/io/File;
    #v0=(Reference);
    array-length v3, v0

    .local v3, len$:I
    #v3=(Integer);
    const/4 v2, 0x0

    .local v2, i$:I
    :goto_0
    #v1=(Conflicted);v2=(Integer);
    if-ge v2, v3, :cond_0

    aget-object v1, v0, v2

    .line 190
    .local v1, child:Ljava/io/File;
    #v1=(Null);
    invoke-static {v1}, Lcom/tapjoy/TapjoyUtil;->deleteFileOrDirectory(Ljava/io/File;)V

    .line 189
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 193
    .end local v0           #arr$:[Ljava/io/File;
    .end local v1           #child:Ljava/io/File;
    .end local v2           #i$:I
    .end local v3           #len$:I
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    const-string v4, "TapjoyUtil"

    #v4=(Reference);
    const-string v5, "****************************************"

    #v5=(Reference);
    invoke-static {v4, v5}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    const-string v4, "TapjoyUtil"

    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    const-string v6, "deleteFileOrDirectory: "

    #v6=(Reference);
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    const-string v4, "TapjoyUtil"

    const-string v5, "****************************************"

    invoke-static {v4, v5}, Lcom/tapjoy/TapjoyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 197
    return-void
.end method

.method public static getNodeTrimValue(Lorg/w3c/dom/NodeList;)Ljava/lang/String;
    .locals 9
    .parameter "nodeList"

    .prologue
    const/4 v6, 0x0

    .line 151
    #v6=(Null);
    const/4 v7, 0x0

    #v7=(Null);
    invoke-interface {p0, v7}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lorg/w3c/dom/Element;

    .line 152
    .local v0, element:Lorg/w3c/dom/Element;
    const-string v5, ""

    .line 154
    .local v5, nodeValue:Ljava/lang/String;
    #v5=(Reference);
    if-eqz v0, :cond_2

    .line 156
    invoke-interface {v0}, Lorg/w3c/dom/Element;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object v2

    .line 158
    .local v2, itemNodeList:Lorg/w3c/dom/NodeList;
    #v2=(Reference);
    invoke-interface {v2}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v3

    .line 160
    .local v3, length:I
    #v3=(Integer);
    const/4 v1, 0x0

    .local v1, i:I
    :goto_0
    #v1=(Integer);v4=(Conflicted);v7=(Reference);v8=(Conflicted);
    if-ge v1, v3, :cond_1

    .line 162
    invoke-interface {v2, v1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v4

    .line 163
    .local v4, node:Lorg/w3c/dom/Node;
    #v4=(Reference);
    if-eqz v4, :cond_0

    .line 164
    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    #v7=(Reference);
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-interface {v4}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v8

    #v8=(Reference);
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 160
    :cond_0
    #v8=(Conflicted);
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 167
    .end local v4           #node:Lorg/w3c/dom/Node;
    :cond_1
    #v4=(Conflicted);
    if-eqz v5, :cond_2

    const-string v7, ""

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    #v7=(Boolean);
    if-nez v7, :cond_2

    .line 169
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    .line 176
    .end local v1           #i:I
    .end local v2           #itemNodeList:Lorg/w3c/dom/NodeList;
    .end local v3           #length:I
    :cond_2
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Reference);v7=(Conflicted);
    return-object v6
.end method

.method public static hashAlgorithm(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .parameter "hash"
    .parameter "text"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .prologue
    .line 72
    const/16 v2, 0x28

    #v2=(PosByte);
    new-array v1, v2, [B

    .line 75
    .local v1, sha1hash:[B
    #v1=(Reference);
    invoke-static {p0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    .line 76
    .local v0, md:Ljava/security/MessageDigest;
    #v0=(Reference);
    const-string v2, "iso-8859-1"

    #v2=(Reference);
    invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    #v4=(Integer);
    invoke-virtual {v0, v2, v3, v4}, Ljava/security/MessageDigest;->update([BII)V

    .line 77
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    .line 79
    invoke-static {v1}, Lcom/tapjoy/TapjoyUtil;->convertToHex([B)Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

*/}
