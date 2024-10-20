/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;
import java.util.concurrent.Callable;

public final class gma
implements Callable {
    public final long a;
    private final int b;

    public /* synthetic */ gma(long l2, int n2) {
        this.b = n2;
        this.a = l2;
    }

    public final Object call() {
        if (this.b != 0) {
            return this.a;
        }
        long l2 = this.a;
        return SystemClock.elapsedRealtime() - l2;
    }
}

