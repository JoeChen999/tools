package org.fmod; class FMODAudioDevice {/*

.class public Lorg/fmod/FMODAudioDevice;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static a:I

.field private static n:I

.field private static o:I

.field private static p:I


# instance fields
.field private b:Ljava/lang/Thread;

.field private c:Landroid/media/AudioTrack;

.field private d:Z

.field private e:Z

.field private f:Ljava/nio/ByteBuffer;

.field private g:Landroid/media/AudioRecord;

.field private h:Z

.field private i:Z

.field private j:I

.field private k:I

.field private l:I

.field private m:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v1, 0x2

    #v1=(PosByte);
    sput v1, Lorg/fmod/FMODAudioDevice;->a:I

    const/4 v0, 0x1

    #v0=(One);
    sput v0, Lorg/fmod/FMODAudioDevice;->n:I

    sput v1, Lorg/fmod/FMODAudioDevice;->o:I

    const/4 v0, 0x3

    #v0=(PosByte);
    sput v0, Lorg/fmod/FMODAudioDevice;->p:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-object v1, p0, Lorg/fmod/FMODAudioDevice;->b:Ljava/lang/Thread;

    iput-object v1, p0, Lorg/fmod/FMODAudioDevice;->c:Landroid/media/AudioTrack;

    iput-boolean v0, p0, Lorg/fmod/FMODAudioDevice;->d:Z

    iput-boolean v0, p0, Lorg/fmod/FMODAudioDevice;->e:Z

    iput-object v1, p0, Lorg/fmod/FMODAudioDevice;->f:Ljava/nio/ByteBuffer;

    iput-object v1, p0, Lorg/fmod/FMODAudioDevice;->g:Landroid/media/AudioRecord;

    iput-boolean v0, p0, Lorg/fmod/FMODAudioDevice;->h:Z

    iput-boolean v0, p0, Lorg/fmod/FMODAudioDevice;->i:Z

    iput v0, p0, Lorg/fmod/FMODAudioDevice;->j:I

    iput v0, p0, Lorg/fmod/FMODAudioDevice;->k:I

    iput v0, p0, Lorg/fmod/FMODAudioDevice;->l:I

    iput v0, p0, Lorg/fmod/FMODAudioDevice;->m:I

    return-void
.end method

.method private native fmodGetInfo(I)I
.end method

.method private native fmodInitJni()I
.end method

.method private native fmodProcess(Ljava/nio/ByteBuffer;)I
.end method

.method private native fmodProcessMicData(Ljava/nio/ByteBuffer;I)I
.end method

.method private sleep(I)V
    .locals 2

    int-to-long v0, p1

    :try_start_0
    #v0=(LongLo);v1=(LongHi);
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v0=(Conflicted);
    return-void

    :catch_0
    #v0=(LongLo);
    move-exception v0

    #v0=(Reference);
    goto :goto_0
.end method


# virtual methods
.method public run()V
    .locals 13

    const/4 v4, 0x2

    #v4=(PosByte);
    const/4 v1, 0x3

    #v1=(PosByte);
    const/4 v12, 0x0

    #v12=(Null);
    const/4 v6, 0x1

    #v6=(One);
    const/4 v11, 0x0

    #v11=(Null);
    move-object v0, v12

    #v0=(Null);
    move-object v3, v12

    :goto_0
    #v0=(Reference);v2=(Conflicted);v3=(Reference);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    iget-boolean v2, p0, Lorg/fmod/FMODAudioDevice;->e:Z

    #v2=(Boolean);
    if-eqz v2, :cond_d

    iget-boolean v2, p0, Lorg/fmod/FMODAudioDevice;->d:Z

    if-nez v2, :cond_5

    invoke-direct {p0, v11}, Lorg/fmod/FMODAudioDevice;->fmodGetInfo(I)I

    move-result v2

    #v2=(Integer);
    if-lez v2, :cond_4

    iget-object v0, p0, Lorg/fmod/FMODAudioDevice;->c:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/fmod/FMODAudioDevice;->c:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    iput-object v12, p0, Lorg/fmod/FMODAudioDevice;->c:Landroid/media/AudioTrack;

    :cond_0
    invoke-static {v2, v1, v4}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result v5

    #v5=(Integer);
    sget v0, Lorg/fmod/FMODAudioDevice;->n:I

    #v0=(Integer);
    invoke-direct {p0, v0}, Lorg/fmod/FMODAudioDevice;->fmodGetInfo(I)I

    move-result v0

    sget v3, Lorg/fmod/FMODAudioDevice;->o:I

    #v3=(Integer);
    invoke-direct {p0, v3}, Lorg/fmod/FMODAudioDevice;->fmodGetInfo(I)I

    move-result v3

    mul-int v7, v0, v3

    #v7=(Integer);
    mul-int/lit8 v7, v7, 0x2

    sget v8, Lorg/fmod/FMODAudioDevice;->a:I

    #v8=(Integer);
    mul-int/2addr v7, v8

    if-le v7, v5, :cond_1

    mul-int/2addr v3, v0

    mul-int/lit8 v3, v3, 0x2

    sget v5, Lorg/fmod/FMODAudioDevice;->a:I

    mul-int/2addr v5, v3

    :cond_1
    mul-int/lit8 v0, v0, 0x2

    sget v3, Lorg/fmod/FMODAudioDevice;->a:I

    mul-int/2addr v0, v3

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v8

    #v8=(Reference);
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    new-array v7, v0, [B

    #v7=(Reference);
    new-instance v0, Landroid/media/AudioTrack;

    #v0=(UninitRef);
    move v3, v1

    #v3=(PosByte);
    invoke-direct/range {v0 .. v6}, Landroid/media/AudioTrack;-><init>(IIIIII)V

    #v0=(Reference);
    iput-object v0, p0, Lorg/fmod/FMODAudioDevice;->c:Landroid/media/AudioTrack;

    iget-object v0, p0, Lorg/fmod/FMODAudioDevice;->c:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getState()I

    move-result v0

    #v0=(Integer);
    if-ne v0, v6, :cond_2

    move v0, v6

    :goto_1
    #v0=(Boolean);
    iput-boolean v0, p0, Lorg/fmod/FMODAudioDevice;->d:Z

    iget-boolean v0, p0, Lorg/fmod/FMODAudioDevice;->d:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lorg/fmod/FMODAudioDevice;->c:Landroid/media/AudioTrack;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    move-object v0, v7

    move-object v3, v8

    #v3=(Reference);
    goto :goto_0

    :cond_2
    #v0=(Integer);v3=(PosByte);
    move v0, v11

    #v0=(Null);
    goto :goto_1

    :cond_3
    #v0=(Boolean);
    const-string v0, "FMOD"

    #v0=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "AudioTrack failed to initialize (status "

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lorg/fmod/FMODAudioDevice;->c:Landroid/media/AudioTrack;

    invoke-virtual {v3}, Landroid/media/AudioTrack;->getState()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-object v0, v7

    move-object v3, v8

    goto/16 :goto_0

    :cond_4
    #v2=(Integer);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    invoke-direct {p0, v6}, Lorg/fmod/FMODAudioDevice;->sleep(I)V

    goto/16 :goto_0

    :cond_5
    #v2=(Boolean);
    sget v2, Lorg/fmod/FMODAudioDevice;->p:I

    #v2=(Integer);
    invoke-direct {p0, v2}, Lorg/fmod/FMODAudioDevice;->fmodGetInfo(I)I

    move-result v2

    if-ne v2, v6, :cond_9

    invoke-direct {p0, v3}, Lorg/fmod/FMODAudioDevice;->fmodProcess(Ljava/nio/ByteBuffer;)I

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v2

    invoke-virtual {v3, v0, v11, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    iget-object v2, p0, Lorg/fmod/FMODAudioDevice;->c:Landroid/media/AudioTrack;

    #v2=(Reference);
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v2, v0, v11, v5}, Landroid/media/AudioTrack;->write([BII)I

    invoke-virtual {v3, v11}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-object v2, v3

    :goto_2
    #v5=(Conflicted);
    iget-boolean v3, p0, Lorg/fmod/FMODAudioDevice;->i:Z

    #v3=(Boolean);
    if-eqz v3, :cond_8

    iget-object v3, p0, Lorg/fmod/FMODAudioDevice;->g:Landroid/media/AudioRecord;

    #v3=(Reference);
    if-nez v3, :cond_6

    new-instance v5, Landroid/media/AudioRecord;

    #v5=(UninitRef);
    iget v7, p0, Lorg/fmod/FMODAudioDevice;->l:I

    #v7=(Integer);
    iget v8, p0, Lorg/fmod/FMODAudioDevice;->m:I

    #v8=(Integer);
    iget v9, p0, Lorg/fmod/FMODAudioDevice;->k:I

    #v9=(Integer);
    iget v10, p0, Lorg/fmod/FMODAudioDevice;->j:I

    #v10=(Integer);
    invoke-direct/range {v5 .. v10}, Landroid/media/AudioRecord;-><init>(IIIII)V

    #v5=(Reference);
    iput-object v5, p0, Lorg/fmod/FMODAudioDevice;->g:Landroid/media/AudioRecord;

    :cond_6
    #v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    iget-object v3, p0, Lorg/fmod/FMODAudioDevice;->g:Landroid/media/AudioRecord;

    invoke-virtual {v3}, Landroid/media/AudioRecord;->getState()I

    move-result v3

    #v3=(Integer);
    if-ne v3, v6, :cond_7

    iget v3, p0, Lorg/fmod/FMODAudioDevice;->j:I

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    #v3=(Reference);
    iput-object v3, p0, Lorg/fmod/FMODAudioDevice;->f:Ljava/nio/ByteBuffer;

    iget-object v3, p0, Lorg/fmod/FMODAudioDevice;->f:Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v11}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    :try_start_0
    iget-object v3, p0, Lorg/fmod/FMODAudioDevice;->g:Landroid/media/AudioRecord;

    invoke-virtual {v3}, Landroid/media/AudioRecord;->startRecording()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_7
    :goto_3
    #v3=(Conflicted);
    iput-boolean v11, p0, Lorg/fmod/FMODAudioDevice;->i:Z

    :cond_8
    iget-object v3, p0, Lorg/fmod/FMODAudioDevice;->g:Landroid/media/AudioRecord;

    #v3=(Reference);
    if-eqz v3, :cond_c

    iget-boolean v3, p0, Lorg/fmod/FMODAudioDevice;->h:Z

    #v3=(Boolean);
    if-eqz v3, :cond_a

    :try_start_1
    iget-object v3, p0, Lorg/fmod/FMODAudioDevice;->g:Landroid/media/AudioRecord;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/media/AudioRecord;->stop()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_4
    iget-object v3, p0, Lorg/fmod/FMODAudioDevice;->g:Landroid/media/AudioRecord;

    invoke-virtual {v3}, Landroid/media/AudioRecord;->release()V

    iput-object v12, p0, Lorg/fmod/FMODAudioDevice;->g:Landroid/media/AudioRecord;

    iput-object v12, p0, Lorg/fmod/FMODAudioDevice;->f:Ljava/nio/ByteBuffer;

    iput-boolean v11, p0, Lorg/fmod/FMODAudioDevice;->h:Z

    move-object v3, v2

    goto/16 :goto_0

    :cond_9
    #v2=(Integer);
    iput-boolean v11, p0, Lorg/fmod/FMODAudioDevice;->d:Z

    move-object v0, v12

    #v0=(Null);
    move-object v2, v12

    #v2=(Null);
    goto :goto_2

    :catch_0
    #v0=(Reference);v2=(Reference);
    move-exception v3

    const-string v5, "FMOD"

    #v5=(Reference);
    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    #v7=(Reference);
    const-string v8, "failed to startRecording(): "

    #v8=(Reference);
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v3}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :catch_1
    #v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    move-exception v3

    #v3=(Reference);
    const-string v5, "FMOD"

    #v5=(Reference);
    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    #v7=(Reference);
    const-string v8, "failed to stop(): "

    #v8=(Reference);
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v3}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_a
    #v3=(Boolean);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    iget-object v3, p0, Lorg/fmod/FMODAudioDevice;->g:Landroid/media/AudioRecord;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/media/AudioRecord;->getRecordingState()I

    move-result v3

    #v3=(Integer);
    if-ne v3, v1, :cond_b

    iget-object v3, p0, Lorg/fmod/FMODAudioDevice;->g:Landroid/media/AudioRecord;

    #v3=(Reference);
    iget-object v5, p0, Lorg/fmod/FMODAudioDevice;->f:Ljava/nio/ByteBuffer;

    #v5=(Reference);
    iget-object v7, p0, Lorg/fmod/FMODAudioDevice;->f:Ljava/nio/ByteBuffer;

    #v7=(Reference);
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v7

    #v7=(Integer);
    invoke-virtual {v3, v5, v7}, Landroid/media/AudioRecord;->read(Ljava/nio/ByteBuffer;I)I

    move-result v3

    #v3=(Integer);
    iget-object v5, p0, Lorg/fmod/FMODAudioDevice;->f:Ljava/nio/ByteBuffer;

    invoke-direct {p0, v5, v3}, Lorg/fmod/FMODAudioDevice;->fmodProcessMicData(Ljava/nio/ByteBuffer;I)I

    iget-object v3, p0, Lorg/fmod/FMODAudioDevice;->f:Ljava/nio/ByteBuffer;

    #v3=(Reference);
    invoke-virtual {v3, v11}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-object v3, v2

    goto/16 :goto_0

    :cond_b
    #v3=(Integer);v5=(Conflicted);v7=(Conflicted);
    invoke-direct {p0, v6}, Lorg/fmod/FMODAudioDevice;->sleep(I)V

    :cond_c
    #v3=(Conflicted);
    move-object v3, v2

    #v3=(Reference);
    goto/16 :goto_0

    :cond_d
    #v2=(Boolean);
    iget-object v0, p0, Lorg/fmod/FMODAudioDevice;->c:Landroid/media/AudioTrack;

    if-eqz v0, :cond_f

    iget-boolean v0, p0, Lorg/fmod/FMODAudioDevice;->d:Z

    #v0=(Boolean);
    if-eqz v0, :cond_e

    iget-object v0, p0, Lorg/fmod/FMODAudioDevice;->c:Landroid/media/AudioTrack;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    :cond_e
    #v0=(Conflicted);
    iput-object v12, p0, Lorg/fmod/FMODAudioDevice;->c:Landroid/media/AudioTrack;

    :cond_f
    return-void
.end method

.method public start()V
    .locals 2

    iget-object v0, p0, Lorg/fmod/FMODAudioDevice;->b:Ljava/lang/Thread;

    #v0=(Reference);
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lorg/fmod/FMODAudioDevice;->stop()V

    :cond_0
    new-instance v0, Ljava/lang/Thread;

    #v0=(UninitRef);
    const-string v1, "FMODAudioDevice"

    #v1=(Reference);
    invoke-direct {v0, p0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    #v0=(Reference);
    iput-object v0, p0, Lorg/fmod/FMODAudioDevice;->b:Ljava/lang/Thread;

    iget-object v0, p0, Lorg/fmod/FMODAudioDevice;->b:Ljava/lang/Thread;

    const/16 v1, 0xa

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setPriority(I)V

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lorg/fmod/FMODAudioDevice;->e:Z

    invoke-direct {p0}, Lorg/fmod/FMODAudioDevice;->fmodInitJni()I

    iget-object v0, p0, Lorg/fmod/FMODAudioDevice;->b:Ljava/lang/Thread;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public startAudioRecord(III)I
    .locals 2

    const/4 v0, 0x2

    #v0=(PosByte);
    iput v0, p0, Lorg/fmod/FMODAudioDevice;->k:I

    iput p1, p0, Lorg/fmod/FMODAudioDevice;->l:I

    iput p2, p0, Lorg/fmod/FMODAudioDevice;->m:I

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lorg/fmod/FMODAudioDevice;->i:Z

    iget v0, p0, Lorg/fmod/FMODAudioDevice;->k:I

    #v0=(Integer);
    invoke-static {p1, p2, v0}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    move-result v0

    div-int/lit16 v1, p1, 0x113a

    #v1=(Integer);
    mul-int/2addr v0, v1

    iput v0, p0, Lorg/fmod/FMODAudioDevice;->j:I

    iget v0, p0, Lorg/fmod/FMODAudioDevice;->j:I

    return v0
.end method

.method public stop()V
    .locals 1

    :goto_0
    iget-object v0, p0, Lorg/fmod/FMODAudioDevice;->b:Ljava/lang/Thread;

    #v0=(Reference);
    if-eqz v0, :cond_0

    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lorg/fmod/FMODAudioDevice;->e:Z

    :try_start_0
    iget-object v0, p0, Lorg/fmod/FMODAudioDevice;->b:Ljava/lang/Thread;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lorg/fmod/FMODAudioDevice;->b:Ljava/lang/Thread;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    #v0=(Reference);
    move-exception v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public stopAudioRecord()V
    .locals 1

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lorg/fmod/FMODAudioDevice;->h:Z

    return-void
.end method

*/}
