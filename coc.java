/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.StrictMode$ThreadPolicy
 */
import android.os.StrictMode;
import java.util.concurrent.ThreadFactory;

public final class coc
implements ThreadFactory {
    public final ThreadFactory a;
    public final StrictMode.ThreadPolicy b;

    public /* synthetic */ coc(ThreadFactory threadFactory, StrictMode.ThreadPolicy threadPolicy) {
        this.a = threadFactory;
        this.b = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        runnable = new ckr((Object)this.b, (Object)runnable, 9, null);
        return this.a.newThread(runnable);
    }
}

