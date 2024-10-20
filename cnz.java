/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;

public final class cnz {
    public static final boolean a;

    static {
        boolean bl2;
        try {
            SystemClock.elapsedRealtimeNanos();
            bl2 = true;
        }
        catch (Throwable throwable) {
            bl2 = false;
        }
        a = bl2;
    }
}

