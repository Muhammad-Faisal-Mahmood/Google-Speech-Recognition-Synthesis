/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.media.AudioAttributes$Builder
 *  android.media.AudioFormat
 *  android.media.AudioFormat$Builder
 *  android.media.AudioRecord
 *  android.media.AudioRecord$Builder
 *  android.media.audiofx.AcousticEchoCanceler
 */
package com.google.android.libraries.assistant.soda;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

class AudioInput {
    private static final hei a = hei.m("com/google/android/libraries/assistant/soda/AudioInput");
    private final long b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private int g;
    private final int h;
    private final boolean i;
    private final boolean j;
    private int k = 0;
    private AudioRecord l;
    private ByteBuffer m;
    private ByteBuffer n;
    private final int o;
    private final boolean p;
    private boolean q = false;
    private elr r;
    private eae s;
    private final cgw t;

    public AudioInput(long l2, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2, boolean bl3, boolean bl4) {
        cgw cgw2;
        this.t = cgw2 = new cgw();
        new crh(cgw2);
        this.r = null;
        this.s = null;
        this.b = l2;
        this.h = n2;
        this.c = n3;
        this.d = n4;
        this.e = n5;
        this.f = n6;
        this.o = n7;
        this.p = bl2;
        this.i = bl3;
        this.j = bl4;
        ((heg)((heg)a.f()).j("com/google/android/libraries/assistant/soda/AudioInput", "<init>", 142, "AudioInput.java")).U(l2, n2, n3, n4, n5, n6, n7, bl2, bl3, bl4);
    }

    private final void a() {
        AudioRecord audioRecord = this.l;
        if (audioRecord != null) {
            audioRecord.release();
            this.l = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private final boolean b(int n2, int n3, int n4) {
        void var4_7;
        block8: {
            hei hei2;
            block12: {
                block10: {
                    AudioRecord.Builder builder;
                    block11: {
                        block9: {
                            block7: {
                                hei2 = a;
                                ((heg)((heg)hei2.c()).j("com/google/android/libraries/assistant/soda/AudioInput", "createAudioRecord", 371, "AudioInput.java")).s("Creating AudioRecord for source : %d", this.c);
                                try {
                                    builder = new AudioRecord.Builder();
                                    builder = builder.setAudioSource(this.c);
                                    AudioFormat.Builder builder2 = new AudioFormat.Builder();
                                    builder = builder.setAudioFormat(builder2.setSampleRate(this.d).setChannelMask(n2).setEncoding(n3).build()).setBufferSizeInBytes(n4).build();
                                    this.l = builder;
                                    if (builder != null) break block7;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    // empty catch block
                                }
                                ((heg)((heg)hei2.g()).j("com/google/android/libraries/assistant/soda/AudioInput", "createAudioRecord", 389, "AudioInput.java")).r("Init: Cannot create AudioRecord instance!");
                                return false;
                            }
                            if (builder.getState() != 1) {
                                ((heg)((heg)hei2.g()).j("com/google/android/libraries/assistant/soda/AudioInput", "createAudioRecord", 394, "AudioInput.java")).r("Init: AudioRecord instance state not INITIALIZED");
                                this.a();
                                return false;
                            }
                            if (!this.j) break block8;
                            if (AcousticEchoCanceler.isAvailable()) break block9;
                            ((heg)((heg)hei2.g()).j("com/google/android/libraries/assistant/soda/AudioInput", "applyAcousticEchoCancellerAudioEffect", 350, "AudioInput.java")).r("Init: AcousticEchoCanceler is not available");
                            break block10;
                        }
                        builder = AcousticEchoCanceler.create((int)this.l.getAudioSessionId());
                        if (builder != null) break block11;
                        ((heg)((heg)hei2.h()).j("com/google/android/libraries/assistant/soda/AudioInput", "applyAcousticEchoCancellerAudioEffect", 357, "AudioInput.java")).r("Init: AcousticEchoCanceler is null");
                        break block10;
                    }
                    if (builder.setEnabled(true) == 0) break block12;
                    ((heg)((heg)hei2.g()).j("com/google/android/libraries/assistant/soda/AudioInput", "applyAcousticEchoCancellerAudioEffect", 361, "AudioInput.java")).r("Init: AcousticEchoCanceler.setEnabled failed");
                }
                this.a();
                return false;
            }
            ((heg)((heg)hei2.f()).j("com/google/android/libraries/assistant/soda/AudioInput", "applyAcousticEchoCancellerAudioEffect", 365, "AudioInput.java")).r("Init: Enabled AcousticEchoCanceler");
        }
        return true;
        ((heg)((heg)a.g()).j("com/google/android/libraries/assistant/soda/AudioInput", "createAudioRecord", 385, "AudioInput.java")).u("Init: Cannot create AudioRecord instance: %s", var4_7.getMessage());
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean c(int n2, int n3, int n4, int n5) {
        try {
            block5: {
                GenericDeclaration genericDeclaration = Integer.TYPE;
                genericDeclaration = AudioRecord.class.getConstructor(new Class[]{AudioAttributes.class, AudioFormat.class, genericDeclaration, genericDeclaration});
                Method method = AudioAttributes.Builder.class.getMethod("setInternalCapturePreset", Integer.TYPE);
                AudioFormat.Builder builder = new AudioFormat.Builder();
                builder = builder.setChannelMask(n2).setEncoding(n3).setSampleRate(this.d).build();
                AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
                method.invoke((Object)builder2, this.c);
                method = builder2.build();
                try {
                    genericDeclaration = (AudioRecord)((Constructor)genericDeclaration).newInstance(method, builder, n4, n5);
                    this.l = genericDeclaration;
                    if (genericDeclaration == null) break block5;
                }
                catch (IllegalAccessException | InstantiationException | InvocationTargetException reflectiveOperationException) {
                    ((heg)((heg)a.g()).j("com/google/android/libraries/assistant/soda/AudioInput", "createHotwordSourceAudioRecord", 453, "AudioInput.java")).r("Exception while invoking new AudioRecord");
                    return false;
                }
                if (genericDeclaration.getState() != 1) {
                    ((heg)((heg)a.g()).j("com/google/android/libraries/assistant/soda/AudioInput", "createHotwordSourceAudioRecord", 458, "AudioInput.java")).r("Failed to initialize AudioRecord");
                    this.a();
                    return false;
                }
            }
            return true;
        }
        catch (Exception exception) {
            ((heg)((heg)a.g()).j("com/google/android/libraries/assistant/soda/AudioInput", "createHotwordSourceAudioRecord", 464, "AudioInput.java")).s("Failed to construct AudioRecord for capture session %d", this.o);
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean d(int n2, int n3) {
        int n4 = this.g;
        try {
            block8: {
                GenericDeclaration genericDeclaration = Integer.TYPE;
                genericDeclaration = AudioRecord.class.getConstructor(new Class[]{AudioAttributes.class, AudioFormat.class, genericDeclaration, genericDeclaration});
                Method method = AudioAttributes.Builder.class.getMethod("setInternalCapturePreset", Integer.TYPE);
                AudioFormat.Builder builder = new AudioFormat.Builder();
                if (n2 != 16 && n2 != 12) {
                    if (n2 != 15) {
                        ((heg)((heg)a.g()).j("com/google/android/libraries/assistant/soda/AudioInput", "createLoopbackAudioRecord", 310, "AudioInput.java")).s("Invalid loopback channelConfig: %d", n2);
                        return false;
                    }
                    builder.setChannelIndexMask(15);
                } else {
                    builder.setChannelMask(n2);
                }
                builder.setEncoding(n3);
                builder.setSampleRate(this.d);
                builder = builder.build();
                AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
                method.invoke((Object)builder2, this.c);
                method = builder2.build();
                try {
                    genericDeclaration = (AudioRecord)((Constructor)genericDeclaration).newInstance(method, builder, n4 * 5, 0);
                    this.l = genericDeclaration;
                    if (genericDeclaration == null) break block8;
                }
                catch (IllegalAccessException | InstantiationException | InvocationTargetException reflectiveOperationException) {
                    ((heg)((heg)a.g()).j("com/google/android/libraries/assistant/soda/AudioInput", "createLoopbackAudioRecord", 329, "AudioInput.java")).r("Exception while invoking new AudioRecord for loopback");
                    return false;
                }
                if (genericDeclaration.getState() != 1) {
                    ((heg)((heg)a.g()).j("com/google/android/libraries/assistant/soda/AudioInput", "createLoopbackAudioRecord", 334, "AudioInput.java")).r("Failed to initialize AudioRecord for loopback");
                    this.a();
                    return false;
                }
            }
            return true;
        }
        catch (Exception exception) {
            ((heg)((heg)a.g()).j("com/google/android/libraries/assistant/soda/AudioInput", "createLoopbackAudioRecord", 340, "AudioInput.java")).r("Failed to construct AudioRecord for loopback session");
            return false;
        }
    }

    private native void nativeCacheDirectBufferAddress(long var1, ByteBuffer var3, ByteBuffer var4);

    private int readBuffer() {
        int n2;
        block11: {
            this.m.clear();
            AudioRecord audioRecord = this.l;
            if (audioRecord == null) {
                ((heg)((heg)a.g()).j("com/google/android/libraries/assistant/soda/AudioInput", "readBuffer", 546, "AudioInput.java")).r("Cannot read audio, no audio record!");
                return -1;
            }
            if (this.i) {
                int n3 = this.m.capacity();
                ByteBuffer byteBuffer = ByteBuffer.allocateDirect(n3);
                int n4 = 0;
                int n5 = 0;
                while (true) {
                    n2 = n4;
                    if (this.q) break block11;
                    byteBuffer.clear();
                    audioRecord = this.l;
                    n2 = n4;
                    if (audioRecord == null || (n2 = audioRecord.read(byteBuffer, n3 - n4, 1)) < 0) break block11;
                    if (n2 == 0) {
                        n2 = n4;
                        if (++n5 >= 6) break block11;
                        n2 = n5;
                    } else {
                        byteBuffer.position(n2);
                        byteBuffer.flip();
                        this.m.put(byteBuffer);
                        n4 += n2;
                        n2 = n4;
                        if (n4 == this.m.capacity()) break block11;
                        n2 = 0;
                    }
                    try {
                        Thread.sleep(this.h);
                        n5 = n2;
                    }
                    catch (InterruptedException interruptedException) {
                        Thread.currentThread().interrupt();
                        n2 = n4;
                        break block11;
                    }
                }
            }
            ByteBuffer byteBuffer = this.m;
            n2 = audioRecord.read(byteBuffer, byteBuffer.capacity());
        }
        if (n2 < 0) {
            ((heg)((heg)a.g()).j("com/google/android/libraries/assistant/soda/AudioInput", "readBuffer", 556, "AudioInput.java")).s("ReadBuffer: read failed with error: %d", n2);
            return -1;
        }
        if (n2 == 0) {
            n2 = this.k;
            if (n2 >= 10) {
                ((heg)((heg)a.g()).j("com/google/android/libraries/assistant/soda/AudioInput", "readBuffer", 560, "AudioInput.java")).r("ReadBuffer: too many consecutive zero byte buffers.");
                this.k = 0;
                return -1;
            }
            this.k = n2 + 1;
            return 0;
        }
        this.k = 0;
        this.n.position(0);
        this.n.putLong(crh.Q(this.r.a((int)n2).a) / 1000L);
        if (n2 != this.m.capacity()) {
            ((heg)((heg)a.c()).j("com/google/android/libraries/assistant/soda/AudioInput", "readBuffer", 571, "AudioInput.java")).v("ReadBuffer: got only %d/%d", n2, this.m.capacity());
        }
        return n2;
    }

    private void stop() {
        AudioRecord audioRecord;
        this.q = true;
        if (this.l != null) {
            ((heg)((heg)a.f()).j("com/google/android/libraries/assistant/soda/AudioInput", "stop", 508, "AudioInput.java")).r("Stopping recording");
        }
        if ((audioRecord = this.l) != null) {
            audioRecord.stop();
        }
        this.a();
        this.r = null;
        this.q = false;
    }

    /*
     * Unable to fully structure code
     */
    public boolean start() {
        block20: {
            block16: {
                block23: {
                    block22: {
                        block21: {
                            block17: {
                                block18: {
                                    block19: {
                                        block15: {
                                            block14: {
                                                var3_1 = this.f;
                                                if (var3_1 != 2) break block14;
                                                var2_2 = 2;
                                                break block15;
                                            }
                                            if (var3_1 != 4) break block16;
                                            var2_2 = 4;
                                        }
                                        var4_3 = this.e;
                                        if (var4_3 == 1) break block17;
                                        if (var4_3 == 2) break block18;
                                        if (var4_3 == 4) break block19;
                                        ((heg)((heg)AudioInput.a.g()).j("com/google/android/libraries/assistant/soda/AudioInput", "initialize", 190, "AudioInput.java")).s("Unsupported number of channels: %d", this.e);
                                        break block20;
                                    }
                                    var1_4 = 15;
                                    break block21;
                                }
                                var1_4 = 12;
                                break block21;
                            }
                            var1_4 = 16;
                        }
                        var5_5 = this.d * this.h / 1000;
                        this.g = var3_1 = var4_3 * var3_1 * var5_5;
                        try {
                            var8_6 = ByteBuffer.allocateDirect(var3_1);
                            this.m = var8_6;
                        }
                        catch (IllegalArgumentException var8_8) {
                            ((heg)((heg)AudioInput.a.g()).j("com/google/android/libraries/assistant/soda/AudioInput", "initialize", 204, "AudioInput.java")).u("Init: Cannot create mPcmBuffer: %s", var8_8.getMessage());
                        }
                        if (this.g == var8_6.capacity()) break block22;
                        ((heg)((heg)AudioInput.a.g()).j("com/google/android/libraries/assistant/soda/AudioInput", "initialize", 208, "AudioInput.java")).v("Init: Allocated buffer's size=%d is different from requested size=%d", this.m.capacity(), this.g);
                        break block20;
                    }
                    this.m.order(ByteOrder.nativeOrder());
                    var8_6 = ByteBuffer.allocateDirect(8);
                    this.n = var8_6;
                    var8_6.order(ByteOrder.BIG_ENDIAN);
                    var8_6 = eae.a.l();
                    var3_1 = this.d;
                    if (!var8_6.b.B()) {
                        var8_6.u();
                    }
                    var9_9 = var8_6.b;
                    var10_10 = (eae)var9_9;
                    var10_10.b = 2 | var10_10.b;
                    var10_10.d = var3_1;
                    if (!var9_9.B()) {
                        var8_6.u();
                    }
                    var10_10 = var8_6.b;
                    var9_9 = var10_10;
                    var9_9.b = 4 | var9_9.b;
                    var9_9.e = var1_4;
                    if (!var10_10.B()) {
                        var8_6.u();
                    }
                    var9_9 = (eae)var8_6.b;
                    var9_9.b |= 8;
                    var9_9.f = var2_2;
                    var10_10 = ead.a.l();
                    var3_1 = this.h;
                    if (!var10_10.b.B()) {
                        var10_10.u();
                    }
                    var9_9 = (ead)var10_10.b;
                    var9_9.b |= 1;
                    var9_9.c = var3_1 * 100;
                    if (!var8_6.b.B()) {
                        var8_6.u();
                    }
                    var9_9 = (eae)var8_6.b;
                    var10_10 = (ead)var10_10.o();
                    var10_10.getClass();
                    var9_9.j = var10_10;
                    var9_9.b |= 256;
                    this.s = (eae)var8_6.o();
                    if (!this.p) break block23;
                    var7_11 = this.d(var1_4, var2_2);
                    ** GOTO lbl87
                }
                var6_12 = AudioRecord.getMinBufferSize((int)this.d, (int)var1_4, (int)var2_2);
                if (var6_12 != -1 && var6_12 != -2) {
                    var3_1 = var4_3 = var6_12 * 5;
                    if (var4_3 < this.g * 5) {
                        ((heg)((heg)AudioInput.a.f()).j("com/google/android/libraries/assistant/soda/AudioInput", "initialize", 252, "AudioInput.java")).v("Init: calculated AudioRecord internal buffer size (%d) is smaller than expected buffer size (%d). Rounding up.", var4_3, this.g * 5);
                        var3_1 = this.g * 5;
                    }
                    ((heg)((heg)AudioInput.a.f()).j("com/google/android/libraries/assistant/soda/AudioInput", "initialize", 259, "AudioInput.java")).I("Init: mPcmBuffer capacity=%d(%d frames) internalBufferSize=%d minInternalBufferSize=%d mBytesPerReadBuffer=%d", this.m.capacity(), var5_5, var3_1, var6_12, this.g);
                    var4_3 = this.o;
                    var7_11 = var4_3 >= 0 ? this.c(var1_4, var2_2, 320000, var4_3) : (this.c == 1999 ? this.c(var1_4, var2_2, var3_1, 0) : this.b(var1_4, var2_2, var3_1));
lbl87:
                    // 2 sources

                    if (var7_11) {
                        this.nativeCacheDirectBufferAddress(this.b, this.m, this.n);
                        var8_6 = this.l;
                        if (var8_6 != null) {
                            try {
                                var8_6.startRecording();
                                this.k = 0;
                            }
                            catch (IllegalStateException var8_7) {
                                this.a();
                                ((heg)((heg)AudioInput.a.g()).j("com/google/android/libraries/assistant/soda/AudioInput", "start", 490, "AudioInput.java")).u("Cannot start, startRecording() failed: %s", var8_7.getMessage());
                                return false;
                            }
                            this.r = new elr(this.l, this.s);
                            return true;
                        }
                        ((heg)((heg)AudioInput.a.g()).j("com/google/android/libraries/assistant/soda/AudioInput", "start", 482, "AudioInput.java")).r("Cannot start, no audio record!");
                        return false;
                    }
                } else {
                    ((heg)((heg)AudioInput.a.g()).j("com/google/android/libraries/assistant/soda/AudioInput", "initialize", 246, "AudioInput.java")).r("Init: AudioRecord.getMinBufferSize returned error!");
                }
                break block20;
                break block20;
            }
            ((heg)((heg)AudioInput.a.g()).j("com/google/android/libraries/assistant/soda/AudioInput", "initialize", 170, "AudioInput.java")).s("Unsupported sample size %d", this.f);
        }
        ((heg)((heg)AudioInput.a.g()).j("com/google/android/libraries/assistant/soda/AudioInput", "start", 477, "AudioInput.java")).r("Cannot start, initialization failed!");
        return false;
    }
}

