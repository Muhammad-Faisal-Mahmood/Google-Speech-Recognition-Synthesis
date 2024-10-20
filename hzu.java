/*
 * Decompiled with CFR 0.152.
 */
public final class hzu {
    public static final hwg a;

    static {
        hyg hyg2 = hwg.a.l();
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        hyg hyg3 = ((hwp)hyg2).b;
        ((hwg)hyg3).b = -315576000000L;
        if (!((hwv)hyg3).B()) {
            ((hwp)hyg2).u();
        }
        ((hwg)((hwp)hyg2).b).c = -999999999;
        hyg2 = (hwg)((hwp)hyg2).o();
        hyg2 = hwg.a.l();
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        hyg3 = ((hwp)hyg2).b;
        ((hwg)hyg3).b = 315576000000L;
        if (!((hwv)hyg3).B()) {
            ((hwp)hyg2).u();
        }
        ((hwg)((hwp)hyg2).b).c = 999999999;
        hyg2 = (hwg)((hwp)hyg2).o();
        hyg3 = hwg.a.l();
        if (!((hwp)hyg3).b.B()) {
            ((hwp)hyg3).u();
        }
        hyg2 = ((hwp)hyg3).b;
        ((hwg)hyg2).b = 0L;
        if (!((hwv)hyg2).B()) {
            ((hwp)hyg3).u();
        }
        ((hwg)((hwp)hyg3).b).c = 0;
        a = (hwg)((hwp)hyg3).o();
    }

    public static hwg a(long l2) {
        return hzu.c(l2 / 1000L, (int)(l2 % 1000L * 1000000L));
    }

    public static hwg b(long l2) {
        return hzu.c(l2 / 1000000000L, (int)(l2 % 1000000000L));
    }

    public static hwg c(long l2, int n2) {
        int n3;
        long l3;
        block10: {
            block9: {
                if (n2 <= -1000000000) break block9;
                l3 = l2;
                n3 = n2;
                if (n2 < 1000000000) break block10;
            }
            l3 = hhk.ap(l2, n2 / 1000000000);
            n3 = n2 % 1000000000;
        }
        l2 = l3;
        n2 = n3;
        if (l3 > 0L) {
            l2 = l3;
            n2 = n3;
            if (n3 < 0) {
                n2 = n3 + 1000000000;
                l2 = l3 - 1L;
            }
        }
        l3 = l2;
        n3 = n2;
        if (l2 < 0L) {
            l3 = l2;
            n3 = n2;
            if (n2 > 0) {
                n3 = n2 - 1000000000;
                l3 = l2 + 1L;
            }
        }
        hyg hyg2 = hwg.a.l();
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hwv hwv2 = hyg2.b;
        ((hwg)hwv2).b = l3;
        if (!hwv2.B()) {
            hyg2.u();
        }
        ((hwg)hyg2.b).c = n3;
        hyg2 = (hwg)hyg2.o();
        hzu.d((hwg)hyg2);
        return hyg2;
    }

    public static void d(hwg hwg2) {
        long l2;
        long l3;
        long l4 = hwg2.b;
        int n2 = hwg2.c;
        if (l4 >= -315576000000L && l4 <= 315576000000L && (long)n2 >= -999999999L && n2 < 1000000000 && ((l3 = (l2 = l4 - 0L) == 0L ? 0 : (l2 < 0L ? -1 : 1)) >= 0 && n2 >= 0 || l3 <= 0 && n2 <= 0)) {
            return;
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", l4, n2));
    }
}

