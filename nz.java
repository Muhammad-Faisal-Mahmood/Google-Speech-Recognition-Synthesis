/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
import android.os.Looper;
import java.util.concurrent.Executor;

public final class nz
extends kh {
    public static final Executor a = new ny(0);
    private static volatile nz c;
    public final kh b;
    private final kh d;

    private nz() {
        super(null);
        oa oa2 = new oa();
        this.d = oa2;
        this.b = oa2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static nz v() {
        if (c != null) {
            return c;
        }
        synchronized (nz.class) {
            nz nz2;
            if (c != null) return c;
            c = nz2 = new nz();
            return c;
        }
    }

    public final boolean w() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}

