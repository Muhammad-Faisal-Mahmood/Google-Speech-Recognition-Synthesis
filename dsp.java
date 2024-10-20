/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.concurrent.Executor;

public final class dsp {
    private static final dsn d = dsn.a(Integer.MAX_VALUE);
    public volatile dst a = dss.a;
    public volatile boolean b = true;
    public volatile dsn c = d;

    public dsp(Context context, Executor executor, dss dss2, iku iku2, boolean bl2, gto gto2, jnu jnu2) {
        if (gto2.g()) {
            jnu2 = null;
        }
        dsp.b(new dso(this, context, iku2, executor, dss2, jnu2), executor);
    }

    public static void b(Runnable runnable, Executor executor) {
        executor.execute(runnable);
    }

    public final void a(iku object) {
        try {
            object = (dlv)object.b();
            this.b = object.b();
            this.c = dsn.a(object.a());
            return;
        }
        catch (Throwable throwable) {
            a.as(dkc.a.h(), "Couldn't get config", "com/google/android/libraries/performance/primes/sampling/Sampler", "fetchConfig", 'h', "Sampler.java", throwable);
            this.b = false;
            return;
        }
    }
}

