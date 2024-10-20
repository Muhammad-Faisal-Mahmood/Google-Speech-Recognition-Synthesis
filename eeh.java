/*
 * Decompiled with CFR 0.152.
 */
public final class eeh
implements eee {
    private final eee a;
    private int b;

    public eeh(eee eee2, int n2) {
        this.a = eee2;
        this.b = n2;
    }

    @Override
    public final void b(dzn hwv2) {
        int n2;
        jse.e(hwv2, "audioData");
        if (this.b > 0 && (n2 = hwv2.c) != 2) {
            Object object = n2 == 1 ? (dzm)hwv2.d : dzm.a;
            n2 = ((dzm)object).c.d();
            if (this.b < n2) {
                object = (hwp)hwv2.C(5);
                ((hwp)object).x(hwv2);
                object = dox.g((hwp)object);
                cxt cxt2 = dox.f(dzm.a.l());
                hwv2 = hwv2.c == 1 ? (dzm)hwv2.d : dzm.a;
                cxt2.d(((dzm)hwv2).c.v(this.b));
                ((cxt)object).f(cxt2.c());
                hwv2 = ((cxt)object).e();
                this.a.b((dzn)hwv2);
            }
            this.b -= n2;
            return;
        }
        this.a.b((dzn)hwv2);
    }
}

