/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;

public final class eqe {
    public final Object a;
    public final Object b;

    public eqe() {
        this((List)jpa.a, (jrk)null);
    }

    public eqe(epm epm2, epw epw2) {
        jse.e(epm2, "audioSessionsRegistry");
        jse.e(epw2, "hotwordSessionsRegistry");
        this.a = epm2;
        this.b = epw2;
    }

    public eqe(eqj eqj2, eqq eqq2) {
        jse.e(eqj2, "audioSourceDataRegistry");
        jse.e(eqq2, "hotwordSourceDataRegistry");
        this.a = eqj2;
        this.b = eqq2;
    }

    public eqe(etw etw2, euc euc2) {
        jse.e(etw2, "audioRoutesRegistry");
        jse.e(euc2, "hotwordRoutesRegistry");
        this.a = etw2;
        this.b = euc2;
    }

    public /* synthetic */ eqe(List list, int n2) {
        if ((n2 & 1) != 0) {
            list = jpa.a;
        }
        this(list, (jro)null);
    }

    public eqe(List list, jrk jrk2) {
        this.a = list;
        this.b = jrk2;
    }

    public eqe(List list, jro jro2) {
        jse.e(list, "sessions");
        this.a = list;
        this.b = jro2;
    }

    public eqe(jnu jnu2, jnu jnu3) {
        this.a = jnu2;
        this.b = jnu3;
    }

    public eqe(jnu jnu2, jnu jnu3, byte[] byArray) {
        jnu2.getClass();
        this.a = jnu2;
        jnu3.getClass();
        this.b = jnu3;
    }

    public eqe(jnu jnu2, jnu jnu3, byte[] byArray, byte[] byArray2) {
        jnu2.getClass();
        this.a = jnu2;
        jnu3.getClass();
        this.b = jnu3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void A(int n2, ebv ebv2) {
        synchronized (this) {
            jse.e(ebv2, "reason");
            ((eqj)this.a).b(n2, ebv2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void B(int n2, ebv ebv2) {
        synchronized (this) {
            jse.e(ebv2, "reason");
            ((eqq)this.b).d(n2, ebv2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final eky C(int n2, ebv object) {
        synchronized (this) {
            jse.e(object, "reason");
            return ((eqq)this.b).e(n2, (ebv)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final eaj a(int n2) {
        synchronized (this) {
            if (((epm)this.a).c(n2) != null) throw null;
            return ((epm)this.a).a(n2).b();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final eaj b(epc object, int n2) {
        synchronized (this) {
            ((epm)this.a).i();
            return ((epm)this.a).b((epc)object, n2).b();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final epp c(int n2) {
        synchronized (this) {
            return ((epw)this.b).a(n2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final epp d(ecw object, eqb eqb2) {
        synchronized (this) {
            jse.e(object, "params");
            eqe eqe2 = new eqe(((epm)this.a).d(), 2);
            return ((epw)this.b).f((ecw)object, eqb2, eqe2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(epc epc2, int n2, ebv ebv2) {
        synchronized (this) {
            jse.e(ebv2, "reason");
            ((epm)this.a).i();
            ((epm)this.a).e(epc2, n2, ebv2, false);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(epc epc2, ebv ebv2) {
        synchronized (this) {
            jse.e(ebv2, "reason");
            ((epm)this.a).f(epc2, ebv2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(int n2, ebv ebv2) {
        synchronized (this) {
            jse.e(ebv2, "reason");
            ((epw)this.b).c(n2, ebv2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(eqb eqb2, ebv ebv2) {
        synchronized (this) {
            jse.e(ebv2, "reason");
            ((epm)this.a).g(eqb2, ebv2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(eqb eqb2, ebv ebv2) {
        synchronized (this) {
            jse.e(ebv2, "reason");
            ((epw)this.b).d(eqb2, ebv2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean j(eal ... ealArray) {
        synchronized (this) {
            jse.e(ealArray, "intents");
            ealArray = Arrays.copyOf(ealArray, ealArray.length);
            return ((epm)this.a).h(ealArray);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final eky k(int n2, ebv object) {
        synchronized (this) {
            jse.e(object, "reason");
            return ((epw)this.b).e(n2, (ebv)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final epe l(epc object, eqb eqb2, eao eao2) {
        synchronized (this) {
            jse.e(eao2, "params");
            List list = ((epw)this.b).b();
            eqd eqd2 = new eqd(this);
            eqe eqe2 = new eqe(list, eqd2);
            return ((epm)this.a).j((epc)object, eqb2, eao2, eqe2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final etr m(etp object, Integer n2) {
        synchronized (this) {
            if (n2 == null) return ((etw)this.a).a((etp)object, n2, null);
            Object object2 = this.a;
            ((Number)n2).intValue();
            ((etw)object2).e();
            return ((etw)this.a).a((etp)object, n2, null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final etz n(ebk object) {
        synchronized (this) {
            jse.e(object, "params");
            return ((euc)this.b).a((ebk)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final etz o(Integer object) {
        synchronized (this) {
            return ((euc)this.b).b((Integer)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void p(etp etp2, int n2, ebg ebg2) {
        synchronized (this) {
            jse.e(ebg2, "reason");
            ((etw)this.a).e();
            ((etw)this.a).d(etp2, n2, ebg2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void q(etp etp2, ebg ebg2) {
        synchronized (this) {
            jse.e(ebg2, "reason");
            ((etw)this.a).b(etp2, ebg2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void r(int n2, ebg ebg2) {
        synchronized (this) {
            jse.e(ebg2, "reason");
            ((euc)this.b).d(n2, ebg2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void s(etp etp2) {
        synchronized (this) {
            ((etw)this.a).c(etp2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final etr t(etp object, eaw eaw2) {
        synchronized (this) {
            jse.e(eaw2, "params");
            cxt cxt2 = new cxt(((euc)this.b).c(), null);
            return ((etw)this.a).f((etp)object, eaw2, cxt2);
        }
    }

    public final etn u(esy esy2) {
        jvb jvb2 = (jvb)this.a.b();
        jvb2.getClass();
        ell ell2 = (ell)this.b.b();
        ell2.getClass();
        return new etn(esy2, jvb2, ell2);
    }

    public final etd v(eaz eaz2, edo edo2) {
        eaz2.getClass();
        edo2.getClass();
        bzo bzo2 = (bzo)this.a.b();
        bzo2.getClass();
        jvb jvb2 = (jvb)this.b.b();
        jvb2.getClass();
        return new etd(eaz2, edo2, gsl.a, bzo2, jvb2);
    }

    public final etd w(eaz eaz2, edo edo2, gto gto2) {
        edo2.getClass();
        bzo bzo2 = (bzo)this.a.b();
        bzo2.getClass();
        jvb jvb2 = (jvb)this.b.b();
        jvb2.getClass();
        return new etd(eaz2, edo2, gto2, bzo2, jvb2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final eaj x(eqg object, eqv eqv2, eqm eqm2) {
        synchronized (this) {
            Object object2 = this.b;
            List list = ((eqq)object2).b();
            eia eia2 = new eia(object2, 3, null);
            eqe eqe2 = new eqe(list, eia2);
            return ((eqj)this.a).c((eqg)object, eqv2, eqm2, eqe2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ecu y(eqv object, eqr eqr2) {
        synchronized (this) {
            return ((eqq)this.b).a((eqv)object, eqr2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void z(jrk jrk2) {
        synchronized (this) {
            ((eqj)this.a).a(jrk2);
            return;
        }
    }
}

