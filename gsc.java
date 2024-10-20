/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;

final class gsc
extends gup {
    @Override
    public final long a() {
        return SystemClock.elapsedRealtime() * 1000000L;
    }
}

