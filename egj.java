/*
 * Decompiled with CFR 0.152.
 */
public final class egj {
    private static final dzs f;
    public final gto a;
    public final long b;
    public final egg c;
    public final cxv d;
    public final cxv e;

    static {
        hwp hwp2 = dzs.a.l();
        dzp dzp2 = dzp.a;
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        dzs dzs2 = (dzs)hwp2.b;
        dzp2.getClass();
        dzs2.c = dzp2;
        dzs2.b = 3;
        f = (dzs)hwp2.o();
    }

    public egj(egg egg2, cxv cxv2, gto gto2, cxv cxv3, long l2) {
        this.c = egg2;
        this.d = cxv2;
        this.a = gto2;
        this.e = cxv3;
        this.b = l2;
    }

    public static void a(gto object) {
        if (((gto)object).g()) {
            object = ((gto)object).c();
            dzs dzs2 = f;
            ((els)object).a(dzs2);
        }
    }

    public final efo b() {
        if (this.a.g()) {
            return ((efy)this.a.c()).b();
        }
        return null;
    }
}

