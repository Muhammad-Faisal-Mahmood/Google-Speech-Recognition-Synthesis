/*
 * Decompiled with CFR 0.152.
 */
public final class elb {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/core/common/ResultUtils");

    public static eas a(ebp object, ebv ebv2) {
        ebq ebq2 = elb.c((ebp)object);
        object = eas.a.l();
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        hwv hwv2 = ((hwp)object).b;
        eas eas2 = (eas)hwv2;
        ebq2.getClass();
        eas2.c = ebq2;
        eas2.b |= 1;
        if (!hwv2.B()) {
            ((hwp)object).u();
        }
        hwv2 = (eas)((hwp)object).b;
        ((eas)hwv2).d = ebv2.s;
        ((eas)hwv2).b |= 2;
        return (eas)((hwp)object).o();
    }

    public static eax b(ebo ebo2) {
        hwp hwp2 = eax.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        eax eax2 = (eax)hwp2.b;
        eax2.c = ebo2.z;
        eax2.b |= 1;
        return (eax)hwp2.o();
    }

    public static ebq c(ebp ebp2) {
        hwp hwp2 = ebq.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        ebq ebq2 = (ebq)hwp2.b;
        ebq2.c = ebp2.M;
        ebq2.b = 2;
        return (ebq)hwp2.o();
    }

    public static ebq d(ebr ebr2) {
        hwp hwp2 = ebq.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        ebq ebq2 = (ebq)hwp2.b;
        ebq2.c = ebr2.d;
        ebq2.b = 1;
        return (ebq)hwp2.o();
    }

    public static ebt e(ebs ebs2) {
        hwp hwp2 = ebt.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        ebt ebt2 = (ebt)hwp2.b;
        ebt2.c = ebs2.ai;
        ebt2.b = 2;
        return (ebt)hwp2.o();
    }

    public static ect f(ebp ebp2, ebv ebv2) {
        return new ekw(elb.c(ebp2), ebv2);
    }

    public static ecy g(ebp ebp2, ebv ebv2) {
        return elb.h(elb.c(ebp2), ebv2);
    }

    public static ecy h(ebq hwv2, ebv ebv2) {
        hwp hwp2 = ecy.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv hwv3 = hwp2.b;
        ecy ecy2 = (ecy)hwv3;
        hwv2.getClass();
        ecy2.c = hwv2;
        ecy2.b |= 1;
        if (!hwv3.B()) {
            hwp2.u();
        }
        hwv2 = (ecy)hwp2.b;
        ((ecy)hwv2).d = ebv2.s;
        ((ecy)hwv2).b |= 2;
        return (ecy)hwp2.o();
    }

    public static hpn i(ebo ebo2) {
        return hhk.K(elb.b(ebo2));
    }

    public static eky j(ebp ebp2, eda eda2, ebv ebv2) {
        return elb.k(elb.c(ebp2), eda2, ebv2);
    }

    public static eky k(ebq hwv2, eda eda2, ebv ebv2) {
        hwp hwp2 = ecy.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv hwv3 = hwp2.b;
        ecy ecy2 = (ecy)hwv3;
        hwv2.getClass();
        ecy2.c = hwv2;
        ecy2.b |= 1;
        if (!hwv3.B()) {
            hwp2.u();
        }
        hwv2 = (ecy)hwp2.b;
        ((ecy)hwv2).d = ebv2.s;
        ((ecy)hwv2).b |= 2;
        return new eky(hwp2, eda2);
    }

    public static dzv l(int n2) {
        hwp hwp2 = dzv.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        dzv dzv2 = (dzv)hwp2.b;
        dzv2.c = n2 - 1;
        dzv2.b |= 1;
        return (dzv)hwp2.o();
    }

    public static dzy m(int n2) {
        hwp hwp2 = dzy.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        dzy dzy2 = (dzy)hwp2.b;
        dzy2.c = n2 - 1;
        dzy2.b |= 1;
        return (dzy)hwp2.o();
    }

    public static dzy n(int n2, dzw dzw2) {
        hwp hwp2 = dzy.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv hwv2 = hwp2.b;
        dzy dzy2 = (dzy)hwv2;
        dzy2.c = n2 - 1;
        dzy2.b |= 1;
        if (!hwv2.B()) {
            hwp2.u();
        }
        dzy2 = (dzy)hwp2.b;
        dzy2.d = dzw2.e;
        dzy2.b |= 2;
        return (dzy)hwp2.o();
    }
}

