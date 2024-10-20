/*
 * Decompiled with CFR 0.152.
 */
public final class eth
implements esy {
    private static final eaz b;
    public po a;
    private final hpn c;
    private final gto d;

    static {
        hwp hwp2 = eaz.a.l();
        ebe ebe2 = ebe.a;
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        eaz eaz2 = (eaz)hwp2.b;
        ebe2.getClass();
        eaz2.c = ebe2;
        eaz2.b = 2;
        b = (eaz)hwp2.o();
    }

    public eth(gto gto2) {
        this.d = gto2;
        this.c = kl.o(new bwo(this, 5));
    }

    @Override
    public final ekk a() {
        eaz eaz2 = b;
        gto gto2 = this.d;
        return new ekk(this.c, eaz2, gto2, gsl.a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn b() {
        synchronized (this) {
            if (!this.c.isDone()) return elb.i(ebo.b);
            return elb.i(ebo.f);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn c(ebg object) {
        synchronized (this) {
            if (this.c.isDone()) {
                return this.c;
            }
            hwp hwp2 = eav.a.l();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            eav eav2 = (eav)hwp2.b;
            eav2.c = ((ebg)object).J;
            eav2.b |= 1;
            object = (eav)hwp2.o();
            this.a.c(object);
            return this.c;
        }
    }

    @Override
    public final /* synthetic */ eln d() {
        return null;
    }

    @Override
    public final /* synthetic */ esy e() {
        return this;
    }
}

