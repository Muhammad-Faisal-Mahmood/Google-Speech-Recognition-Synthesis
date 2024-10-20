/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec$CryptoInfo
 */
import android.media.MediaCodec;

public final class ahu {
    public byte[] a;
    public int[] b;
    public int[] c;
    public int d;
    public final MediaCodec.CryptoInfo e;
    public final bxt f;

    public ahu() {
        MediaCodec.CryptoInfo cryptoInfo;
        this.e = cryptoInfo = new MediaCodec.CryptoInfo();
        int n2 = agf.a;
        this.f = new bxt(cryptoInfo);
    }
}

