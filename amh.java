/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodecInfo
 *  android.media.MediaCodecList
 */
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

final class amh {
    public MediaCodecInfo[] a;
    private final int b;

    public amh(boolean bl2) {
        this.b = bl2 ? 1 : 0;
    }

    public final void a() {
        if (this.a == null) {
            this.a = new MediaCodecList(this.b).getCodecInfos();
        }
    }
}

