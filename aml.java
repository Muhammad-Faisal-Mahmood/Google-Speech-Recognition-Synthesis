/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$CryptoInfo
 *  android.os.Bundle
 */
import android.media.MediaCodec;
import android.os.Bundle;

final class aml
implements alv {
    private final MediaCodec a;

    public aml(MediaCodec mediaCodec) {
        this.a = mediaCodec;
    }

    @Override
    public final void a() {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override
    public final void d() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void f(int n2, int n3, long l2, int n4) {
        this.a.queueInputBuffer(n2, 0, n3, l2, n4);
    }

    @Override
    public final void g(int n2, ahu ahu2, long l2) {
        ahu2 = ahu2.e;
        this.a.queueSecureInputBuffer(n2, 0, (MediaCodec.CryptoInfo)ahu2, l2, 0);
    }
}

