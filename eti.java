/*
 * Decompiled with CFR 0.152.
 */
public final class eti
implements esy {
    public po a;
    private final eaz b;
    private final hpn c;

    public eti(ebh ebh2) {
        hwp hwp2 = eaz.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        eaz eaz2 = (eaz)hwp2.b;
        ebh2.getClass();
        eaz2.c = ebh2;
        eaz2.b = 3;
        this.b = (eaz)hwp2.o();
        this.c = kl.o(new bwo(this, 6));
    }

    @Override
    public final ekk a() {
        gsl gsl2 = gsl.a;
        return new ekk(this.c, this.b, gsl2, gsl2);
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

