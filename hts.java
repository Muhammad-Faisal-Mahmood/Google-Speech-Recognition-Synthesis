/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;

public final class hts
implements hsy {
    private static final hfn a = hfn.o("xRPC");
    private ixa b;
    private long c;
    private htp d;

    @Override
    public final /* synthetic */ htl a() {
        return htl.a;
    }

    @Override
    public final /* synthetic */ htl b(gpm gpm2) {
        return htl.a;
    }

    @Override
    public final htl c(gpm object) {
        this.b = ((ixb)((gpm)object).b).a;
        Object object2 = htp.b;
        object2 = (htp)((itw)((gpm)object).a).g((itv)object2);
        fxf.L(object2, "%s missing from CallOptions.", htp.b);
        this.d = object2;
        object2 = hqx.a;
        object = ((hqw)((itw)((gpm)object).a).g((itv)object2)).r;
        this.c = SystemClock.elapsedRealtime();
        return htl.a;
    }

    @Override
    public final /* synthetic */ htl d(bzq bzq2) {
        return htl.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void e(bzq object) {
        try {
            if (((iyh)((bzq)object).a).g()) {
                long l2 = SystemClock.elapsedRealtime() - this.c;
                boolean bl2 = this.b.equals((Object)ixa.a);
                boolean bl3 = true;
                boolean bl4 = true;
                if (bl2) {
                    if (l2 <= Integer.MAX_VALUE) {
                        object = this.d;
                        int n2 = (int)l2;
                        bl2 = n2 >= 0;
                        fxf.r(bl2, "Cannot record negative latency.");
                        bl2 = ((htp)object).i.getAndSet(n2) == -1 ? bl4 : false;
                        fxf.B(bl2, "Already recorded latency.");
                    } else {
                        ((hfk)((hfk)a.g()).j("com/google/frameworks/client/data/android/metrics/NetworkLatencyInterceptor", "startOnCompleteProcessing", 52, "NetworkLatencyInterceptor.java")).r("Recorded latency overflows Integer.MAX_VALUE, cannot be recorded");
                    }
                } else {
                    object = this.d;
                    bl2 = l2 >= 0L;
                    fxf.r(bl2, "Cannot record negative stream duration.");
                    bl2 = ((htp)object).l.getAndSet(l2) == -1L ? bl3 : false;
                    fxf.B(bl2, "Already recorded stream duration.");
                }
            }
            this.d.f.incrementAndGet();
            return;
        }
        catch (Throwable throwable) {
            ((hfk)((hfk)((hfk)a.g()).i(throwable)).j("com/google/frameworks/client/data/android/metrics/NetworkLatencyInterceptor", "startOnCompleteProcessing", 62, "NetworkLatencyInterceptor.java")).r("Failed to record network latency");
            return;
        }
    }

    @Override
    public final /* synthetic */ void f(dlm dlm2) {
    }

    @Override
    public final /* synthetic */ void g(dlm dlm2) {
    }
}

