/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Looper
 */
import android.os.Build;
import android.os.Looper;

public final class cof
implements Runnable {
    public final hqa a;

    public /* synthetic */ cof(hqa hqa2) {
        this.a = hqa2;
    }

    @Override
    public final void run() {
        hqa hqa2;
        block3: {
            hqa2 = this.a;
            Looper.prepare();
            Looper.loop();
            if ("robolectric".equals(Build.FINGERPRINT)) break block3;
            fpk.e(new bpw(11));
        }
        return;
        finally {
            hqa2.m(Looper.myLooper());
        }
    }
}

