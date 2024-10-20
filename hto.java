/*
 * Decompiled with CFR 0.152.
 */
public final class hto
implements hsy {
    private static final hfn a = hfn.o("xRPC");
    private htp b;
    private ixa c;
    private dlm d;

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
        this.c = ((ixb)((gpm)object).b).a;
        Object object2 = hqx.a;
        object = (itw)((gpm)object).a;
        this.d = new dlm((Object)((hqw)((itw)object).g((itv)object2)).j, null);
        object2 = ((itw)object).g(htp.b);
        boolean bl2 = true;
        boolean bl3 = object2 == null;
        fxf.v(bl3, "Unexpected option %s already set.", htp.b);
        bl3 = ((itw)object).g(htn.a) == null ? bl2 : false;
        fxf.v(bl3, "Unexpected option %s already set.", htn.a);
        this.b = new htp((hrf)((itw)object).g(hrf.a));
        object = ((itw)object).f(htp.b, this.b).f(htn.a, this.b);
        return new htl(htk.a, null, null, (itw)object);
    }

    @Override
    public final htl d(bzq bzq2) {
        if (this.c.equals((Object)ixa.b) || this.c.equals((Object)ixa.d)) {
            this.b.h.incrementAndGet();
        }
        return htl.a;
    }

    @Override
    public final void e(bzq object) {
        boolean bl2;
        Object object2;
        try {
            object2 = this.b;
            object = ((iyh)object.a).n;
            bl2 = ((htp)object2).m.getAndSet(object) == null;
        }
        catch (Throwable throwable) {
            ((hfk)((hfk)((hfk)a.g()).i(throwable)).j("com/google/frameworks/client/data/android/metrics/MetricsRecordingInterceptor", "startOnCompleteProcessing", 82, "MetricsRecordingInterceptor.java")).r("Failed to record RPC metrics");
            return;
        }
        fxf.B(bl2, "Already recorded result.");
        object2 = this.d;
        object = this.b;
        if (((Boolean)((gum)((dlm)object2).a).a).booleanValue() && ((htp)object).e.get()) {
            djv djv2 = djv.a();
            object2 = dql.a(null, ((htp)object).c.a());
            boolean bl3 = ((htp)object).d.get();
            fxf.q(true);
            fxf.q(true);
            ((dql)object2).q = 1;
            ((dql)object2).r = bl3 ? 1 : 0;
            djv2.d((dql)object2);
        }
    }

    @Override
    public final void f(dlm dlm2) {
        if (!this.c.equals((Object)ixa.c) && !this.c.equals((Object)ixa.d)) {
            return;
        }
        this.b.g.incrementAndGet();
    }

    @Override
    public final /* synthetic */ void g(dlm dlm2) {
    }
}

