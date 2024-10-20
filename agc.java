/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.SystemClock
 */
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

public final class agc
implements afl {
    protected agc() {
    }

    @Override
    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public final afp b(Looper looper, Handler.Callback callback) {
        return new agd(new Handler(looper, callback));
    }
}

