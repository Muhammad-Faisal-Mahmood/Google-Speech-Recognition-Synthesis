/*
 * Decompiled with CFR 0.152.
 */
package com.google.audio.hearing.common;

public final class OggOpusEncoder {
    private static final hei b = hei.m("com/google/audio/hearing/common/OggOpusEncoder");
    public long a = 0L;

    static {
        try {
            System.loadLibrary("ogg_opus_encoder");
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            a.as(b.h(), "System did not find libogg_opus_encoder.so! Make sure your JVM explicitly loads this lib, particularly if you are on Android.", "com/google/audio/hearing/common/OggOpusEncoder", "<clinit>", 'M', "OggOpusEncoder.java", unsatisfiedLinkError);
        }
    }

    private native byte[] flush(long var1);

    private native void free(long var1);

    public final byte[] a() {
        long l2 = this.a;
        if (l2 != 0L) {
            byte[] byArray = this.flush(l2);
            this.free(this.a);
            this.a = 0L;
            return byArray;
        }
        ((heg)((heg)b.g()).j("com/google/audio/hearing/common/OggOpusEncoder", "flushAndStop", 53, "OggOpusEncoder.java")).r("stop() called multiple times or without call to initialize()!");
        return new byte[0];
    }

    protected final void finalize() {
        super.finalize();
        if (this.a != 0L) {
            ((heg)((heg)b.g()).j("com/google/audio/hearing/common/OggOpusEncoder", "finalize", 62, "OggOpusEncoder.java")).r("Native OggOpusEncoder resources weren't cleaned up. You must call stop()!");
            this.free(this.a);
        }
    }

    public native long init(int var1, int var2, int var3, boolean var4);

    public native byte[] processAudioBytes(long var1, byte[] var3, int var4, int var5);
}

