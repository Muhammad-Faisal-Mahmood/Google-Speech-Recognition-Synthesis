/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.concurrent.Executor;

public final class dso
implements Runnable {
    public final dsp a;
    public final Context b;
    public final iku c;
    public final Executor d;
    public final dss e;
    public final jnu f;

    public /* synthetic */ dso(dsp dsp2, Context context, iku iku2, Executor executor, dss dss2, jnu jnu2) {
        this.a = dsp2;
        this.b = context;
        this.c = iku2;
        this.d = executor;
        this.e = dss2;
        this.f = jnu2;
    }

    @Override
    public final void run() {
        dsp dsp2 = this.a;
        Object object = this.c;
        Object object2 = this.b;
        if (crt.e((Context)object2)) {
            dsp2.a((iku)object);
        } else {
            crt.b((Context)object2, new ai((Object)dsp2, object, (Object)this.d, 18, null));
        }
        if (dsp2.b) {
            object2 = this.f;
            object = this.e;
            if (object2 == null) {
                object2 = ket.a.l();
                if (!((hwp)object2).b.B()) {
                    ((hwp)object2).u();
                }
                ket ket2 = (ket)((hwp)object2).b;
                ket2.d = 2;
                ket2.b |= 4;
                dsp2.a = ((dss)object).a((ket)((hwp)object2).o());
                return;
            }
            try {
                dsp2.a = ((dss)object).a((ket)object2.b());
                return;
            }
            catch (Throwable throwable) {
                a.as(dkc.a.h(), "Couldn't get sampling strategy", "com/google/android/libraries/performance/primes/sampling/Sampler", "fetchSamplingParameters", '}', "Sampler.java", throwable);
                hwp hwp2 = ket.a.l();
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                hwv hwv2 = hwp2.b;
                ket ket3 = (ket)hwv2;
                ket3.b = 2 | ket3.b;
                ket3.c = 1L;
                if (!hwv2.B()) {
                    hwp2.u();
                }
                ket3 = (ket)hwp2.b;
                ket3.d = 3;
                ket3.b |= 4;
                dsp2.a = ((dss)object).a((ket)hwp2.o());
            }
        }
    }
}

