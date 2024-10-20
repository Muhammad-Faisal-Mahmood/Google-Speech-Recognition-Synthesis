/*
 * Decompiled with CFR 0.152.
 */
public final class drp
implements hnx {
    public final drr a;
    public final String b;
    public final long c;
    public final drn d;

    public /* synthetic */ drp(drr drr2, String string, long l2, drn drn2) {
        this.a = drr2;
        this.b = string;
        this.c = l2;
        this.d = drn2;
    }

    @Override
    public final hpn a() {
        Object object;
        Object object2 = this.a;
        if (!((dsj)((drr)object2).e.a()).a()) {
            ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "recordSystemHealthMetricInBackground", 435, "TimerMetricServiceImpl.java")).r("TimerMetric not recorded, metric was rejected by sampling configuration.");
            object = hpj.a;
        } else {
            Object object3;
            Object object4 = this.d;
            long l2 = this.c;
            object = ((drm)((drr)object2).c.b()).b;
            dmt dmt2 = ((drr)object2).b;
            object = dmq.a();
            ((fhc)object).g(true);
            ((fhc)object).e = l2;
            Object object5 = (gto)((drr)object2).d.b();
            object2 = kfl.a.l();
            boolean bl2 = (Boolean)((gto)object5).b(new cxc(20)).e(false);
            object5 = kfm.a.l();
            if (bl2) {
                object3 = ((drn)object4).b;
                l2 = ((dmy)object3).b.b - ((dmy)object3).a.b;
            } else {
                l2 = ((drn)object4).a();
            }
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            hwv hwv2 = ((hwp)object5).b;
            object3 = (kfm)hwv2;
            ((kfm)object3).b = 1 | ((kfm)object3).b;
            ((kfm)object3).c = l2;
            int n2 = ((drn)object4).d;
            if (!hwv2.B()) {
                ((hwp)object5).u();
            }
            object4 = (kfm)((hwp)object5).b;
            ((kfm)object4).d = 0;
            ((kfm)object4).b |= 2;
            object5 = (kfm)((hwp)object5).o();
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            object4 = this.b;
            object3 = (kfl)((hwp)object2).b;
            object5.getClass();
            ((kfl)object3).g = object5;
            ((kfl)object3).b |= 0x10;
            ((fhc)object).i((kfl)((hwp)object2).o());
            ((fhc)object).b = object4;
            ((fhc)object).d = null;
            object = dmt2.b(((fhc)object).e());
        }
        return object;
    }
}

