/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.HandlerThread
 */
import android.os.HandlerThread;

public final class alj
implements gui {
    public final int a;
    private final int b;

    public /* synthetic */ alj(int n2, int n3) {
        this.b = n3;
        this.a = n2;
    }

    @Override
    public final Object a() {
        if (this.b != 0) {
            return new HandlerThread(all.d(this.a, "ExoPlayer:MediaCodecAsyncAdapter:"));
        }
        return new HandlerThread(all.d(this.a, "ExoPlayer:MediaCodecQueueingThread:"));
    }
}

