package com.unity3d.player.b; class a {/*

.class public Lcom/unity3d/player/b/a;
.super Ljava/lang/Object;


# static fields
.field private static final a:[B

.field private static final b:[B

.field private static synthetic c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const/16 v7, 0x2d

    #v7=(PosByte);
    const/4 v1, 0x1

    #v1=(One);
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v6, -0x5

    #v6=(Byte);
    const/16 v5, -0x9

    #v5=(Byte);
    const-class v0, Lcom/unity3d/player/b/a;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    sput-boolean v0, Lcom/unity3d/player/b/a;->c:Z

    const/16 v0, 0x40

    #v0=(PosByte);
    new-array v0, v0, [B

    #v0=(Reference);
    fill-array-data v0, :array_0

    sput-object v0, Lcom/unity3d/player/b/a;->a:[B

    const/16 v0, 0x40

    #v0=(PosByte);
    new-array v0, v0, [B

    #v0=(Reference);
    const/16 v3, 0x41

    #v3=(PosByte);
    aput-byte v3, v0, v2

    const/16 v3, 0x42

    aput-byte v3, v0, v1

    const/4 v3, 0x2

    const/16 v4, 0x43

    #v4=(PosByte);
    aput-byte v4, v0, v3

    const/4 v3, 0x3

    const/16 v4, 0x44

    aput-byte v4, v0, v3

    const/4 v3, 0x4

    const/16 v4, 0x45

    aput-byte v4, v0, v3

    const/4 v3, 0x5

    const/16 v4, 0x46

    aput-byte v4, v0, v3

    const/4 v3, 0x6

    const/16 v4, 0x47

    aput-byte v4, v0, v3

    const/4 v3, 0x7

    const/16 v4, 0x48

    aput-byte v4, v0, v3

    const/16 v3, 0x8

    const/16 v4, 0x49

    aput-byte v4, v0, v3

    const/16 v3, 0x9

    const/16 v4, 0x4a

    aput-byte v4, v0, v3

    const/16 v3, 0xa

    const/16 v4, 0x4b

    aput-byte v4, v0, v3

    const/16 v3, 0xb

    const/16 v4, 0x4c

    aput-byte v4, v0, v3

    const/16 v3, 0xc

    const/16 v4, 0x4d

    aput-byte v4, v0, v3

    const/16 v3, 0xd

    const/16 v4, 0x4e

    aput-byte v4, v0, v3

    const/16 v3, 0xe

    const/16 v4, 0x4f

    aput-byte v4, v0, v3

    const/16 v3, 0xf

    const/16 v4, 0x50

    aput-byte v4, v0, v3

    const/16 v3, 0x10

    const/16 v4, 0x51

    aput-byte v4, v0, v3

    const/16 v3, 0x11

    const/16 v4, 0x52

    aput-byte v4, v0, v3

    const/16 v3, 0x12

    const/16 v4, 0x53

    aput-byte v4, v0, v3

    const/16 v3, 0x13

    const/16 v4, 0x54

    aput-byte v4, v0, v3

    const/16 v3, 0x14

    const/16 v4, 0x55

    aput-byte v4, v0, v3

    const/16 v3, 0x15

    const/16 v4, 0x56

    aput-byte v4, v0, v3

    const/16 v3, 0x16

    const/16 v4, 0x57

    aput-byte v4, v0, v3

    const/16 v3, 0x17

    const/16 v4, 0x58

    aput-byte v4, v0, v3

    const/16 v3, 0x18

    const/16 v4, 0x59

    aput-byte v4, v0, v3

    const/16 v3, 0x19

    const/16 v4, 0x5a

    aput-byte v4, v0, v3

    const/16 v3, 0x1a

    const/16 v4, 0x61

    aput-byte v4, v0, v3

    const/16 v3, 0x1b

    const/16 v4, 0x62

    aput-byte v4, v0, v3

    const/16 v3, 0x1c

    const/16 v4, 0x63

    aput-byte v4, v0, v3

    const/16 v3, 0x1d

    const/16 v4, 0x64

    aput-byte v4, v0, v3

    const/16 v3, 0x1e

    const/16 v4, 0x65

    aput-byte v4, v0, v3

    const/16 v3, 0x1f

    const/16 v4, 0x66

    aput-byte v4, v0, v3

    const/16 v3, 0x20

    const/16 v4, 0x67

    aput-byte v4, v0, v3

    const/16 v3, 0x21

    const/16 v4, 0x68

    aput-byte v4, v0, v3

    const/16 v3, 0x22

    const/16 v4, 0x69

    aput-byte v4, v0, v3

    const/16 v3, 0x23

    const/16 v4, 0x6a

    aput-byte v4, v0, v3

    const/16 v3, 0x24

    const/16 v4, 0x6b

    aput-byte v4, v0, v3

    const/16 v3, 0x25

    const/16 v4, 0x6c

    aput-byte v4, v0, v3

    const/16 v3, 0x26

    const/16 v4, 0x6d

    aput-byte v4, v0, v3

    const/16 v3, 0x27

    const/16 v4, 0x6e

    aput-byte v4, v0, v3

    const/16 v3, 0x28

    const/16 v4, 0x6f

    aput-byte v4, v0, v3

    const/16 v3, 0x29

    const/16 v4, 0x70

    aput-byte v4, v0, v3

    const/16 v3, 0x2a

    const/16 v4, 0x71

    aput-byte v4, v0, v3

    const/16 v3, 0x2b

    const/16 v4, 0x72

    aput-byte v4, v0, v3

    const/16 v3, 0x2c

    const/16 v4, 0x73

    aput-byte v4, v0, v3

    const/16 v3, 0x74

    aput-byte v3, v0, v7

    const/16 v3, 0x2e

    const/16 v4, 0x75

    aput-byte v4, v0, v3

    const/16 v3, 0x2f

    const/16 v4, 0x76

    aput-byte v4, v0, v3

    const/16 v3, 0x30

    const/16 v4, 0x77

    aput-byte v4, v0, v3

    const/16 v3, 0x31

    const/16 v4, 0x78

    aput-byte v4, v0, v3

    const/16 v3, 0x32

    const/16 v4, 0x79

    aput-byte v4, v0, v3

    const/16 v3, 0x33

    const/16 v4, 0x7a

    aput-byte v4, v0, v3

    const/16 v3, 0x34

    const/16 v4, 0x30

    aput-byte v4, v0, v3

    const/16 v3, 0x35

    const/16 v4, 0x31

    aput-byte v4, v0, v3

    const/16 v3, 0x36

    const/16 v4, 0x32

    aput-byte v4, v0, v3

    const/16 v3, 0x37

    const/16 v4, 0x33

    aput-byte v4, v0, v3

    const/16 v3, 0x38

    const/16 v4, 0x34

    aput-byte v4, v0, v3

    const/16 v3, 0x39

    const/16 v4, 0x35

    aput-byte v4, v0, v3

    const/16 v3, 0x3a

    const/16 v4, 0x36

    aput-byte v4, v0, v3

    const/16 v3, 0x3b

    const/16 v4, 0x37

    aput-byte v4, v0, v3

    const/16 v3, 0x3c

    const/16 v4, 0x38

    aput-byte v4, v0, v3

    const/16 v3, 0x3d

    const/16 v4, 0x39

    aput-byte v4, v0, v3

    const/16 v3, 0x3e

    aput-byte v7, v0, v3

    const/16 v3, 0x3f

    const/16 v4, 0x5f

    aput-byte v4, v0, v3

    const/16 v0, 0x80

    #v0=(PosShort);
    new-array v0, v0, [B

    #v0=(Reference);
    fill-array-data v0, :array_1

    sput-object v0, Lcom/unity3d/player/b/a;->b:[B

    const/16 v0, 0x80

    #v0=(PosShort);
    new-array v0, v0, [B

    #v0=(Reference);
    aput-byte v5, v0, v2

    aput-byte v5, v0, v1

    const/4 v3, 0x2

    aput-byte v5, v0, v3

    const/4 v3, 0x3

    aput-byte v5, v0, v3

    const/4 v3, 0x4

    aput-byte v5, v0, v3

    const/4 v3, 0x5

    aput-byte v5, v0, v3

    const/4 v3, 0x6

    aput-byte v5, v0, v3

    const/4 v3, 0x7

    aput-byte v5, v0, v3

    const/16 v3, 0x8

    aput-byte v5, v0, v3

    const/16 v3, 0x9

    aput-byte v6, v0, v3

    const/16 v3, 0xa

    aput-byte v6, v0, v3

    const/16 v3, 0xb

    aput-byte v5, v0, v3

    const/16 v3, 0xc

    aput-byte v5, v0, v3

    const/16 v3, 0xd

    aput-byte v6, v0, v3

    const/16 v3, 0xe

    aput-byte v5, v0, v3

    const/16 v3, 0xf

    aput-byte v5, v0, v3

    const/16 v3, 0x10

    aput-byte v5, v0, v3

    const/16 v3, 0x11

    aput-byte v5, v0, v3

    const/16 v3, 0x12

    aput-byte v5, v0, v3

    const/16 v3, 0x13

    aput-byte v5, v0, v3

    const/16 v3, 0x14

    aput-byte v5, v0, v3

    const/16 v3, 0x15

    aput-byte v5, v0, v3

    const/16 v3, 0x16

    aput-byte v5, v0, v3

    const/16 v3, 0x17

    aput-byte v5, v0, v3

    const/16 v3, 0x18

    aput-byte v5, v0, v3

    const/16 v3, 0x19

    aput-byte v5, v0, v3

    const/16 v3, 0x1a

    aput-byte v5, v0, v3

    const/16 v3, 0x1b

    aput-byte v5, v0, v3

    const/16 v3, 0x1c

    aput-byte v5, v0, v3

    const/16 v3, 0x1d

    aput-byte v5, v0, v3

    const/16 v3, 0x1e

    aput-byte v5, v0, v3

    const/16 v3, 0x1f

    aput-byte v5, v0, v3

    const/16 v3, 0x20

    aput-byte v6, v0, v3

    const/16 v3, 0x21

    aput-byte v5, v0, v3

    const/16 v3, 0x22

    aput-byte v5, v0, v3

    const/16 v3, 0x23

    aput-byte v5, v0, v3

    const/16 v3, 0x24

    aput-byte v5, v0, v3

    const/16 v3, 0x25

    aput-byte v5, v0, v3

    const/16 v3, 0x26

    aput-byte v5, v0, v3

    const/16 v3, 0x27

    aput-byte v5, v0, v3

    const/16 v3, 0x28

    aput-byte v5, v0, v3

    const/16 v3, 0x29

    aput-byte v5, v0, v3

    const/16 v3, 0x2a

    aput-byte v5, v0, v3

    const/16 v3, 0x2b

    aput-byte v5, v0, v3

    const/16 v3, 0x2c

    aput-byte v5, v0, v3

    const/16 v3, 0x3e

    aput-byte v3, v0, v7

    const/16 v3, 0x2e

    aput-byte v5, v0, v3

    const/16 v3, 0x2f

    aput-byte v5, v0, v3

    const/16 v3, 0x30

    const/16 v4, 0x34

    aput-byte v4, v0, v3

    const/16 v3, 0x31

    const/16 v4, 0x35

    aput-byte v4, v0, v3

    const/16 v3, 0x32

    const/16 v4, 0x36

    aput-byte v4, v0, v3

    const/16 v3, 0x33

    const/16 v4, 0x37

    aput-byte v4, v0, v3

    const/16 v3, 0x34

    const/16 v4, 0x38

    aput-byte v4, v0, v3

    const/16 v3, 0x35

    const/16 v4, 0x39

    aput-byte v4, v0, v3

    const/16 v3, 0x36

    const/16 v4, 0x3a

    aput-byte v4, v0, v3

    const/16 v3, 0x37

    const/16 v4, 0x3b

    aput-byte v4, v0, v3

    const/16 v3, 0x38

    const/16 v4, 0x3c

    aput-byte v4, v0, v3

    const/16 v3, 0x39

    const/16 v4, 0x3d

    aput-byte v4, v0, v3

    const/16 v3, 0x3a

    aput-byte v5, v0, v3

    const/16 v3, 0x3b

    aput-byte v5, v0, v3

    const/16 v3, 0x3c

    aput-byte v5, v0, v3

    const/16 v3, 0x3d

    const/4 v4, -0x1

    #v4=(Byte);
    aput-byte v4, v0, v3

    const/16 v3, 0x3e

    aput-byte v5, v0, v3

    const/16 v3, 0x3f

    aput-byte v5, v0, v3

    const/16 v3, 0x40

    aput-byte v5, v0, v3

    const/16 v3, 0x41

    aput-byte v2, v0, v3

    const/16 v2, 0x42

    #v2=(PosByte);
    aput-byte v1, v0, v2

    const/16 v1, 0x43

    #v1=(PosByte);
    const/4 v2, 0x2

    aput-byte v2, v0, v1

    const/16 v1, 0x44

    const/4 v2, 0x3

    aput-byte v2, v0, v1

    const/16 v1, 0x45

    const/4 v2, 0x4

    aput-byte v2, v0, v1

    const/16 v1, 0x46

    const/4 v2, 0x5

    aput-byte v2, v0, v1

    const/16 v1, 0x47

    const/4 v2, 0x6

    aput-byte v2, v0, v1

    const/16 v1, 0x48

    const/4 v2, 0x7

    aput-byte v2, v0, v1

    const/16 v1, 0x49

    const/16 v2, 0x8

    aput-byte v2, v0, v1

    const/16 v1, 0x4a

    const/16 v2, 0x9

    aput-byte v2, v0, v1

    const/16 v1, 0x4b

    const/16 v2, 0xa

    aput-byte v2, v0, v1

    const/16 v1, 0x4c

    const/16 v2, 0xb

    aput-byte v2, v0, v1

    const/16 v1, 0x4d

    const/16 v2, 0xc

    aput-byte v2, v0, v1

    const/16 v1, 0x4e

    const/16 v2, 0xd

    aput-byte v2, v0, v1

    const/16 v1, 0x4f

    const/16 v2, 0xe

    aput-byte v2, v0, v1

    const/16 v1, 0x50

    const/16 v2, 0xf

    aput-byte v2, v0, v1

    const/16 v1, 0x51

    const/16 v2, 0x10

    aput-byte v2, v0, v1

    const/16 v1, 0x52

    const/16 v2, 0x11

    aput-byte v2, v0, v1

    const/16 v1, 0x53

    const/16 v2, 0x12

    aput-byte v2, v0, v1

    const/16 v1, 0x54

    const/16 v2, 0x13

    aput-byte v2, v0, v1

    const/16 v1, 0x55

    const/16 v2, 0x14

    aput-byte v2, v0, v1

    const/16 v1, 0x56

    const/16 v2, 0x15

    aput-byte v2, v0, v1

    const/16 v1, 0x57

    const/16 v2, 0x16

    aput-byte v2, v0, v1

    const/16 v1, 0x58

    const/16 v2, 0x17

    aput-byte v2, v0, v1

    const/16 v1, 0x59

    const/16 v2, 0x18

    aput-byte v2, v0, v1

    const/16 v1, 0x5a

    const/16 v2, 0x19

    aput-byte v2, v0, v1

    const/16 v1, 0x5b

    aput-byte v5, v0, v1

    const/16 v1, 0x5c

    aput-byte v5, v0, v1

    const/16 v1, 0x5d

    aput-byte v5, v0, v1

    const/16 v1, 0x5e

    aput-byte v5, v0, v1

    const/16 v1, 0x5f

    const/16 v2, 0x3f

    aput-byte v2, v0, v1

    const/16 v1, 0x60

    aput-byte v5, v0, v1

    const/16 v1, 0x61

    const/16 v2, 0x1a

    aput-byte v2, v0, v1

    const/16 v1, 0x62

    const/16 v2, 0x1b

    aput-byte v2, v0, v1

    const/16 v1, 0x63

    const/16 v2, 0x1c

    aput-byte v2, v0, v1

    const/16 v1, 0x64

    const/16 v2, 0x1d

    aput-byte v2, v0, v1

    const/16 v1, 0x65

    const/16 v2, 0x1e

    aput-byte v2, v0, v1

    const/16 v1, 0x66

    const/16 v2, 0x1f

    aput-byte v2, v0, v1

    const/16 v1, 0x67

    const/16 v2, 0x20

    aput-byte v2, v0, v1

    const/16 v1, 0x68

    const/16 v2, 0x21

    aput-byte v2, v0, v1

    const/16 v1, 0x69

    const/16 v2, 0x22

    aput-byte v2, v0, v1

    const/16 v1, 0x6a

    const/16 v2, 0x23

    aput-byte v2, v0, v1

    const/16 v1, 0x6b

    const/16 v2, 0x24

    aput-byte v2, v0, v1

    const/16 v1, 0x6c

    const/16 v2, 0x25

    aput-byte v2, v0, v1

    const/16 v1, 0x6d

    const/16 v2, 0x26

    aput-byte v2, v0, v1

    const/16 v1, 0x6e

    const/16 v2, 0x27

    aput-byte v2, v0, v1

    const/16 v1, 0x6f

    const/16 v2, 0x28

    aput-byte v2, v0, v1

    const/16 v1, 0x70

    const/16 v2, 0x29

    aput-byte v2, v0, v1

    const/16 v1, 0x71

    const/16 v2, 0x2a

    aput-byte v2, v0, v1

    const/16 v1, 0x72

    const/16 v2, 0x2b

    aput-byte v2, v0, v1

    const/16 v1, 0x73

    const/16 v2, 0x2c

    aput-byte v2, v0, v1

    const/16 v1, 0x74

    aput-byte v7, v0, v1

    const/16 v1, 0x75

    const/16 v2, 0x2e

    aput-byte v2, v0, v1

    const/16 v1, 0x76

    const/16 v2, 0x2f

    aput-byte v2, v0, v1

    const/16 v1, 0x77

    const/16 v2, 0x30

    aput-byte v2, v0, v1

    const/16 v1, 0x78

    const/16 v2, 0x31

    aput-byte v2, v0, v1

    const/16 v1, 0x79

    const/16 v2, 0x32

    aput-byte v2, v0, v1

    const/16 v1, 0x7a

    const/16 v2, 0x33

    aput-byte v2, v0, v1

    const/16 v1, 0x7b

    aput-byte v5, v0, v1

    const/16 v1, 0x7c

    aput-byte v5, v0, v1

    const/16 v1, 0x7d

    aput-byte v5, v0, v1

    const/16 v1, 0x7e

    aput-byte v5, v0, v1

    const/16 v1, 0x7f

    aput-byte v5, v0, v1

    return-void

    :cond_0
    #v0=(Boolean);v1=(One);v2=(Null);v3=(Uninit);v4=(Uninit);
    move v0, v2

    #v0=(Null);
    goto/16 :goto_0

    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);
    nop

    :array_0
    .array-data 0x1
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
        0x47t
        0x48t
        0x49t
        0x4at
        0x4bt
        0x4ct
        0x4dt
        0x4et
        0x4ft
        0x50t
        0x51t
        0x52t
        0x53t
        0x54t
        0x55t
        0x56t
        0x57t
        0x58t
        0x59t
        0x5at
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
        0x67t
        0x68t
        0x69t
        0x6at
        0x6bt
        0x6ct
        0x6dt
        0x6et
        0x6ft
        0x70t
        0x71t
        0x72t
        0x73t
        0x74t
        0x75t
        0x76t
        0x77t
        0x78t
        0x79t
        0x7at
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x2bt
        0x2ft
    .end array-data

    :array_1
    .array-data 0x1
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xfbt
        0xfbt
        0xf7t
        0xf7t
        0xfbt
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xfbt
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0x3et
        0xf7t
        0xf7t
        0xf7t
        0x3ft
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x3at
        0x3bt
        0x3ct
        0x3dt
        0xf7t
        0xf7t
        0xf7t
        0xfft
        0xf7t
        0xf7t
        0xf7t
        0x0t
        0x1t
        0x2t
        0x3t
        0x4t
        0x5t
        0x6t
        0x7t
        0x8t
        0x9t
        0xat
        0xbt
        0xct
        0xdt
        0xet
        0xft
        0x10t
        0x11t
        0x12t
        0x13t
        0x14t
        0x15t
        0x16t
        0x17t
        0x18t
        0x19t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0x1at
        0x1bt
        0x1ct
        0x1dt
        0x1et
        0x1ft
        0x20t
        0x21t
        0x22t
        0x23t
        0x24t
        0x25t
        0x26t
        0x27t
        0x28t
        0x29t
        0x2at
        0x2bt
        0x2ct
        0x2dt
        0x2et
        0x2ft
        0x30t
        0x31t
        0x32t
        0x33t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
        0xf7t
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method private static a([B[BI[B)I
    .locals 6

    const/16 v5, 0x3d

    #v5=(PosByte);
    const/4 v2, 0x3

    #v2=(PosByte);
    const/4 v4, 0x0

    #v4=(Null);
    const/4 v1, 0x2

    #v1=(PosByte);
    const/4 v0, 0x1

    #v0=(One);
    aget-byte v3, p0, v1

    #v3=(Byte);
    if-ne v3, v5, :cond_0

    aget-byte v1, p0, v4

    #v1=(Byte);
    aget-byte v1, p3, v1

    shl-int/lit8 v1, v1, 0x18

    #v1=(Integer);
    ushr-int/lit8 v1, v1, 0x6

    aget-byte v2, p0, v0

    #v2=(Byte);
    aget-byte v2, p3, v2

    shl-int/lit8 v2, v2, 0x18

    #v2=(Integer);
    ushr-int/lit8 v2, v2, 0xc

    or-int/2addr v1, v2

    ushr-int/lit8 v1, v1, 0x10

    #v1=(Char);
    int-to-byte v1, v1

    #v1=(Byte);
    aput-byte v1, p1, p2

    :goto_0
    #v0=(PosByte);v1=(Integer);
    return v0

    :cond_0
    #v0=(One);v1=(PosByte);v2=(PosByte);
    aget-byte v3, p0, v2

    if-ne v3, v5, :cond_1

    aget-byte v2, p0, v4

    #v2=(Byte);
    aget-byte v2, p3, v2

    shl-int/lit8 v2, v2, 0x18

    #v2=(Integer);
    ushr-int/lit8 v2, v2, 0x6

    aget-byte v0, p0, v0

    #v0=(Byte);
    aget-byte v0, p3, v0

    shl-int/lit8 v0, v0, 0x18

    #v0=(Integer);
    ushr-int/lit8 v0, v0, 0xc

    or-int/2addr v0, v2

    aget-byte v2, p0, v1

    #v2=(Byte);
    aget-byte v2, p3, v2

    shl-int/lit8 v2, v2, 0x18

    #v2=(Integer);
    ushr-int/lit8 v2, v2, 0x12

    #v2=(Char);
    or-int/2addr v0, v2

    ushr-int/lit8 v2, v0, 0x10

    int-to-byte v2, v2

    #v2=(Byte);
    aput-byte v2, p1, p2

    add-int/lit8 v2, p2, 0x1

    #v2=(Integer);
    ushr-int/lit8 v0, v0, 0x8

    int-to-byte v0, v0

    #v0=(Byte);
    aput-byte v0, p1, v2

    move v0, v1

    #v0=(PosByte);
    goto :goto_0

    :cond_1
    #v0=(One);v2=(PosByte);
    aget-byte v3, p0, v4

    aget-byte v3, p3, v3

    shl-int/lit8 v3, v3, 0x18

    #v3=(Integer);
    ushr-int/lit8 v3, v3, 0x6

    aget-byte v0, p0, v0

    #v0=(Byte);
    aget-byte v0, p3, v0

    shl-int/lit8 v0, v0, 0x18

    #v0=(Integer);
    ushr-int/lit8 v0, v0, 0xc

    or-int/2addr v0, v3

    aget-byte v1, p0, v1

    #v1=(Byte);
    aget-byte v1, p3, v1

    shl-int/lit8 v1, v1, 0x18

    #v1=(Integer);
    ushr-int/lit8 v1, v1, 0x12

    #v1=(Char);
    or-int/2addr v0, v1

    aget-byte v1, p0, v2

    #v1=(Byte);
    aget-byte v1, p3, v1

    shl-int/lit8 v1, v1, 0x18

    #v1=(Integer);
    ushr-int/lit8 v1, v1, 0x18

    #v1=(Char);
    or-int/2addr v0, v1

    shr-int/lit8 v1, v0, 0x10

    #v1=(Short);
    int-to-byte v1, v1

    #v1=(Byte);
    aput-byte v1, p1, p2

    add-int/lit8 v1, p2, 0x1

    #v1=(Integer);
    shr-int/lit8 v3, v0, 0x8

    int-to-byte v3, v3

    #v3=(Byte);
    aput-byte v3, p1, v1

    add-int/lit8 v1, p2, 0x2

    int-to-byte v0, v0

    #v0=(Byte);
    aput-byte v0, p1, v1

    move v0, v2

    #v0=(PosByte);
    goto :goto_0
.end method

.method public static a([B)Ljava/lang/String;
    .locals 14

    const/16 v13, 0xa

    #v13=(PosByte);
    const v12, 0x7fffffff

    #v12=(Integer);
    const/16 v11, 0x3d

    #v11=(PosByte);
    const/4 v1, 0x0

    #v1=(Null);
    array-length v5, p0

    #v5=(Integer);
    sget-object v6, Lcom/unity3d/player/b/a;->a:[B

    #v6=(Reference);
    add-int/lit8 v0, v5, 0x2

    #v0=(Integer);
    div-int/lit8 v0, v0, 0x3

    mul-int/lit8 v0, v0, 0x4

    div-int v2, v0, v12

    #v2=(Integer);
    add-int/2addr v0, v2

    new-array v7, v0, [B

    #v7=(Reference);
    add-int/lit8 v8, v5, -0x2

    #v8=(Integer);
    move v4, v1

    #v4=(Null);
    move v2, v1

    #v2=(Null);
    move v3, v1

    :goto_0
    #v2=(Integer);v3=(Integer);v4=(Integer);v9=(Conflicted);v10=(Conflicted);
    if-ge v3, v8, :cond_1

    add-int/lit8 v0, v3, 0x0

    aget-byte v0, p0, v0

    #v0=(Byte);
    shl-int/lit8 v0, v0, 0x18

    #v0=(Integer);
    ushr-int/lit8 v0, v0, 0x8

    add-int/lit8 v9, v3, 0x1

    #v9=(Integer);
    add-int/lit8 v9, v9, 0x0

    aget-byte v9, p0, v9

    #v9=(Byte);
    shl-int/lit8 v9, v9, 0x18

    #v9=(Integer);
    ushr-int/lit8 v9, v9, 0x10

    #v9=(Char);
    or-int/2addr v0, v9

    add-int/lit8 v9, v3, 0x2

    #v9=(Integer);
    add-int/lit8 v9, v9, 0x0

    aget-byte v9, p0, v9

    #v9=(Byte);
    shl-int/lit8 v9, v9, 0x18

    #v9=(Integer);
    ushr-int/lit8 v9, v9, 0x18

    #v9=(Char);
    or-int/2addr v0, v9

    ushr-int/lit8 v9, v0, 0x12

    aget-byte v9, v6, v9

    #v9=(Byte);
    aput-byte v9, v7, v2

    add-int/lit8 v9, v2, 0x1

    #v9=(Integer);
    ushr-int/lit8 v10, v0, 0xc

    #v10=(Integer);
    and-int/lit8 v10, v10, 0x3f

    aget-byte v10, v6, v10

    #v10=(Byte);
    aput-byte v10, v7, v9

    add-int/lit8 v9, v2, 0x2

    ushr-int/lit8 v10, v0, 0x6

    #v10=(Integer);
    and-int/lit8 v10, v10, 0x3f

    aget-byte v10, v6, v10

    #v10=(Byte);
    aput-byte v10, v7, v9

    add-int/lit8 v9, v2, 0x3

    and-int/lit8 v0, v0, 0x3f

    aget-byte v0, v6, v0

    #v0=(Byte);
    aput-byte v0, v7, v9

    add-int/lit8 v0, v4, 0x4

    #v0=(Integer);
    if-ne v0, v12, :cond_0

    add-int/lit8 v0, v2, 0x4

    aput-byte v13, v7, v0

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    move v0, v1

    :cond_0
    add-int/lit8 v3, v3, 0x3

    add-int/lit8 v2, v2, 0x4

    move v4, v0

    goto :goto_0

    :cond_1
    #v9=(Conflicted);v10=(Conflicted);
    if-ge v3, v5, :cond_3

    add-int/lit8 v8, v3, 0x0

    sub-int/2addr v5, v3

    if-lez v5, :cond_4

    aget-byte v0, p0, v8

    #v0=(Byte);
    shl-int/lit8 v0, v0, 0x18

    #v0=(Integer);
    ushr-int/lit8 v0, v0, 0x8

    move v3, v0

    :goto_1
    const/4 v0, 0x1

    #v0=(One);
    if-le v5, v0, :cond_5

    add-int/lit8 v0, v8, 0x1

    #v0=(Integer);
    aget-byte v0, p0, v0

    #v0=(Byte);
    shl-int/lit8 v0, v0, 0x18

    #v0=(Integer);
    ushr-int/lit8 v0, v0, 0x10

    :goto_2
    #v0=(Char);
    or-int/2addr v3, v0

    const/4 v0, 0x2

    #v0=(PosByte);
    if-le v5, v0, :cond_6

    add-int/lit8 v0, v8, 0x2

    #v0=(Integer);
    aget-byte v0, p0, v0

    #v0=(Byte);
    shl-int/lit8 v0, v0, 0x18

    #v0=(Integer);
    ushr-int/lit8 v0, v0, 0x18

    :goto_3
    #v0=(Char);
    or-int/2addr v0, v3

    #v0=(Integer);
    packed-switch v5, :pswitch_data_0

    :goto_4
    add-int/lit8 v0, v4, 0x4

    if-ne v0, v12, :cond_2

    add-int/lit8 v0, v2, 0x4

    aput-byte v13, v7, v0

    add-int/lit8 v2, v2, 0x1

    :cond_2
    add-int/lit8 v2, v2, 0x4

    :cond_3
    sget-boolean v0, Lcom/unity3d/player/b/a;->c:Z

    #v0=(Boolean);
    if-nez v0, :cond_7

    array-length v0, v7

    #v0=(Integer);
    if-eq v2, v0, :cond_7

    new-instance v0, Ljava/lang/AssertionError;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    #v0=(Reference);
    throw v0

    :cond_4
    #v0=(Integer);
    move v3, v1

    #v3=(Null);
    goto :goto_1

    :cond_5
    #v0=(One);v3=(Integer);
    move v0, v1

    #v0=(Null);
    goto :goto_2

    :cond_6
    #v0=(PosByte);
    move v0, v1

    #v0=(Null);
    goto :goto_3

    :pswitch_0
    #v0=(Integer);
    ushr-int/lit8 v3, v0, 0x12

    #v3=(Char);
    aget-byte v3, v6, v3

    #v3=(Byte);
    aput-byte v3, v7, v2

    add-int/lit8 v3, v2, 0x1

    #v3=(Integer);
    ushr-int/lit8 v5, v0, 0xc

    and-int/lit8 v5, v5, 0x3f

    aget-byte v5, v6, v5

    #v5=(Byte);
    aput-byte v5, v7, v3

    add-int/lit8 v3, v2, 0x2

    ushr-int/lit8 v5, v0, 0x6

    #v5=(Integer);
    and-int/lit8 v5, v5, 0x3f

    aget-byte v5, v6, v5

    #v5=(Byte);
    aput-byte v5, v7, v3

    add-int/lit8 v3, v2, 0x3

    and-int/lit8 v0, v0, 0x3f

    aget-byte v0, v6, v0

    #v0=(Byte);
    aput-byte v0, v7, v3

    goto :goto_4

    :pswitch_1
    #v0=(Integer);v5=(Integer);
    ushr-int/lit8 v3, v0, 0x12

    #v3=(Char);
    aget-byte v3, v6, v3

    #v3=(Byte);
    aput-byte v3, v7, v2

    add-int/lit8 v3, v2, 0x1

    #v3=(Integer);
    ushr-int/lit8 v5, v0, 0xc

    and-int/lit8 v5, v5, 0x3f

    aget-byte v5, v6, v5

    #v5=(Byte);
    aput-byte v5, v7, v3

    add-int/lit8 v3, v2, 0x2

    ushr-int/lit8 v0, v0, 0x6

    and-int/lit8 v0, v0, 0x3f

    aget-byte v0, v6, v0

    #v0=(Byte);
    aput-byte v0, v7, v3

    add-int/lit8 v0, v2, 0x3

    #v0=(Integer);
    aput-byte v11, v7, v0

    goto :goto_4

    :pswitch_2
    #v5=(Integer);
    ushr-int/lit8 v3, v0, 0x12

    #v3=(Char);
    aget-byte v3, v6, v3

    #v3=(Byte);
    aput-byte v3, v7, v2

    add-int/lit8 v3, v2, 0x1

    #v3=(Integer);
    ushr-int/lit8 v0, v0, 0xc

    and-int/lit8 v0, v0, 0x3f

    aget-byte v0, v6, v0

    #v0=(Byte);
    aput-byte v0, v7, v3

    add-int/lit8 v0, v2, 0x2

    #v0=(Integer);
    aput-byte v11, v7, v0

    add-int/lit8 v0, v2, 0x3

    aput-byte v11, v7, v0

    goto :goto_4

    :cond_7
    array-length v0, v7

    new-instance v2, Ljava/lang/String;

    #v2=(UninitRef);
    invoke-direct {v2, v7, v1, v0}, Ljava/lang/String;-><init>([BII)V

    #v2=(Reference);
    return-object v2

    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);p0=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static a(Ljava/lang/String;)[B
    .locals 2

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    #v0=(Reference);
    array-length v1, v0

    #v1=(Integer);
    invoke-static {v0, v1}, Lcom/unity3d/player/b/a;->a([BI)[B

    move-result-object v0

    return-object v0
.end method

.method private static a([BI)[B
    .locals 13

    const/16 v12, 0x3d

    #v12=(PosByte);
    const/4 v11, 0x4

    #v11=(PosByte);
    const/4 v10, 0x1

    #v10=(One);
    const/4 v1, 0x0

    #v1=(Null);
    sget-object v5, Lcom/unity3d/player/b/a;->b:[B

    #v5=(Reference);
    mul-int/lit8 v0, p1, 0x3

    #v0=(Integer);
    div-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0x2

    new-array v6, v0, [B

    #v6=(Reference);
    new-array v7, v11, [B

    #v7=(Reference);
    move v4, v1

    #v4=(Null);
    move v2, v1

    #v2=(Null);
    move v3, v1

    :goto_0
    #v2=(Integer);v3=(Integer);v4=(Integer);v8=(Conflicted);v9=(Conflicted);
    if-ge v4, p1, :cond_7

    add-int/lit8 v0, v4, 0x0

    aget-byte v0, p0, v0

    #v0=(Byte);
    and-int/lit8 v0, v0, 0x7f

    #v0=(Integer);
    int-to-byte v8, v0

    #v8=(Byte);
    aget-byte v0, v5, v8

    #v0=(Byte);
    const/4 v9, -0x5

    #v9=(Byte);
    if-lt v0, v9, :cond_6

    const/4 v9, -0x1

    if-lt v0, v9, :cond_b

    if-ne v8, v12, :cond_5

    sub-int v0, p1, v4

    #v0=(Integer);
    add-int/lit8 v8, p1, -0x1

    #v8=(Integer);
    add-int/lit8 v8, v8, 0x0

    aget-byte v8, p0, v8

    #v8=(Byte);
    and-int/lit8 v8, v8, 0x7f

    #v8=(Integer);
    int-to-byte v8, v8

    #v8=(Byte);
    if-eqz v2, :cond_0

    if-ne v2, v10, :cond_1

    :cond_0
    new-instance v0, Lcom/unity3d/player/b/b;

    #v0=(UninitRef);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "invalid padding byte \'=\' at byte offset "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/unity3d/player/b/b;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_1
    #v0=(Integer);v1=(Null);v2=(Integer);
    const/4 v9, 0x3

    #v9=(PosByte);
    if-ne v2, v9, :cond_2

    const/4 v9, 0x2

    if-gt v0, v9, :cond_3

    :cond_2
    if-ne v2, v11, :cond_4

    if-le v0, v10, :cond_4

    :cond_3
    new-instance v0, Lcom/unity3d/player/b/b;

    #v0=(UninitRef);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "padding byte \'=\' falsely signals end of encoded value at offset "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/unity3d/player/b/b;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_4
    #v0=(Integer);v1=(Null);v2=(Integer);
    if-eq v8, v12, :cond_7

    const/16 v0, 0xa

    #v0=(PosByte);
    if-eq v8, v0, :cond_7

    new-instance v0, Lcom/unity3d/player/b/b;

    #v0=(UninitRef);
    const-string v1, "encoded value has invalid trailing byte"

    #v1=(Reference);
    invoke-direct {v0, v1}, Lcom/unity3d/player/b/b;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_5
    #v0=(Byte);v1=(Null);v9=(Byte);
    add-int/lit8 v0, v2, 0x1

    #v0=(Integer);
    aput-byte v8, v7, v2

    if-ne v0, v11, :cond_a

    invoke-static {v7, v6, v3, v5}, Lcom/unity3d/player/b/a;->a([B[BI[B)I

    move-result v0

    add-int/2addr v0, v3

    move v2, v0

    move v0, v1

    :goto_1
    add-int/lit8 v3, v4, 0x1

    move v4, v3

    move v3, v2

    move v2, v0

    goto :goto_0

    :cond_6
    #v0=(Byte);
    new-instance v0, Lcom/unity3d/player/b/b;

    #v0=(UninitRef);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "Bad Base64 input character at "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int/lit8 v2, v4, 0x0

    #v2=(Integer);
    aget-byte v2, p0, v2

    #v2=(Byte);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "(decimal)"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/unity3d/player/b/b;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_7
    #v0=(Integer);v1=(Null);v2=(Integer);v8=(Conflicted);v9=(Conflicted);
    if-eqz v2, :cond_9

    if-ne v2, v10, :cond_8

    new-instance v0, Lcom/unity3d/player/b/b;

    #v0=(UninitRef);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "single trailing character at offset "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int/lit8 v2, p1, -0x1

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/unity3d/player/b/b;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_8
    #v0=(Integer);v1=(Null);
    aput-byte v12, v7, v2

    invoke-static {v7, v6, v3, v5}, Lcom/unity3d/player/b/a;->a([B[BI[B)I

    move-result v0

    add-int/2addr v3, v0

    :cond_9
    new-array v0, v3, [B

    #v0=(Reference);
    invoke-static {v6, v1, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0

    :cond_a
    #v0=(Integer);v8=(Byte);v9=(Byte);
    move v2, v3

    goto :goto_1

    :cond_b
    #v0=(Byte);
    move v0, v2

    #v0=(Integer);
    move v2, v3

    goto :goto_1
.end method

.method public static b([B)[B
    .locals 1

    array-length v0, p0

    #v0=(Integer);
    invoke-static {p0, v0}, Lcom/unity3d/player/b/a;->a([BI)[B

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

*/}
