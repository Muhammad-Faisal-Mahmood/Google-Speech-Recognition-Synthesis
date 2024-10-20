/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaCodec$CryptoInfo
 *  android.media.MediaFormat
 *  android.os.Bundle
 */
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import java.nio.ByteBuffer;

public final class amk
implements alu {
    private final MediaCodec a;
    private final awf b;

    public amk(MediaCodec mediaCodec, awf awf2) {
        this.a = mediaCodec;
        this.b = awf2;
        if (agf.a >= 35 && awf2 != null) {
            awf2.f(mediaCodec);
        }
    }

    @Override
    public final int a() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int n2;
        while ((n2 = this.a.dequeueOutputBuffer(bufferInfo, 0L)) == -3) {
        }
        return n2;
    }

    @Override
    public final MediaFormat c() {
        return this.a.getOutputFormat();
    }

    @Override
    public final ByteBuffer e(int n2) {
        return this.a.getInputBuffer(n2);
    }

    @Override
    public final ByteBuffer f(int n2) {
        return this.a.getOutputBuffer(n2);
    }

    @Override
    public final void g() {
        this.a.flush();
    }

    @Override
    public final void h() {
        block4: {
            try {
                awf awf2;
                if (agf.a >= 30 && agf.a < 33) {
                    this.a.stop();
                }
                if (agf.a < 35 || (awf2 = this.b) == null) break block4;
                awf2.g(this.a);
            }
            catch (Throwable throwable) {
                awf awf3;
                if (agf.a >= 35 && (awf3 = this.b) != null) {
                    awf3.g(this.a);
                }
                this.a.release();
                throw throwable;
            }
        }
        this.a.release();
    }

    @Override
    public final void i(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override
    public final void j(int n2, int n3, long l2, int n4) {
        this.a.queueInputBuffer(n2, 0, n3, l2, n4);
    }

    @Override
    public final void k(int n2, ahu ahu2, long l2) {
        ahu2 = ahu2.e;
        this.a.queueSecureInputBuffer(n2, 0, (MediaCodec.CryptoInfo)ahu2, l2, 0);
    }

    @Override
    public final void l(int n2) {
        this.a.releaseOutputBuffer(n2, false);
    }

    @Override
    public final /* synthetic */ void m() {
    }
}

