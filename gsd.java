/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;

public final class gsd {
    public static final gup a;

    static {
        gup gup2;
        try {
            SystemClock.elapsedRealtimeNanos();
            gup2 = new gsb();
        }
        catch (Throwable throwable) {
            SystemClock.elapsedRealtime();
            gup2 = new gsc();
        }
        a = gup2;
    }
}

