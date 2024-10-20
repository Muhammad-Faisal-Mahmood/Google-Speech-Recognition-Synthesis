/*
 * Decompiled with CFR 0.152.
 */
public final class hzw {
    static {
        hyg hyg2 = hzb.a.l();
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        hyg hyg3 = ((hwp)hyg2).b;
        ((hzb)hyg3).b = -62135596800L;
        if (!((hwv)hyg3).B()) {
            ((hwp)hyg2).u();
        }
        ((hzb)((hwp)hyg2).b).c = 0;
        hyg2 = (hzb)((hwp)hyg2).o();
        hyg2 = hzb.a.l();
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        hyg3 = ((hwp)hyg2).b;
        ((hzb)hyg3).b = 253402300799L;
        if (!((hwv)hyg3).B()) {
            ((hwp)hyg2).u();
        }
        ((hzb)((hwp)hyg2).b).c = 999999999;
        hyg2 = (hzb)((hwp)hyg2).o();
        hyg3 = hzb.a.l();
        if (!((hwp)hyg3).b.B()) {
            ((hwp)hyg3).u();
        }
        hyg2 = ((hwp)hyg3).b;
        ((hzb)hyg2).b = 0L;
        if (!((hwv)hyg2).B()) {
            ((hwp)hyg3).u();
        }
        ((hzb)((hwp)hyg3).b).c = 0;
        hyg2 = (hzb)((hwp)hyg3).o();
        new hzv();
        hzw.g("now");
        hzw.g("getEpochSecond");
        hzw.g("getNano");
    }

    public static long a(hzb hzb2) {
        hzw.e(hzb2);
        return hhk.ap(hhk.aq(hzb2.b, 1000L), hzb2.c / 1000000);
    }

    public static hzb b(long l2) {
        return hzw.d(l2 / 1000L, (int)(l2 % 1000L * 1000000L));
    }

    public static hzb c(long l2) {
        return hzw.d(l2 / 1000000000L, (int)(l2 % 1000000000L));
    }

    static hzb d(long l2, int n2) {
        block6: {
            int n3;
            long l3;
            block8: {
                block7: {
                    if (!hzw.f(l2)) break block6;
                    if (n2 <= -1000000000) break block7;
                    l3 = l2;
                    n3 = n2;
                    if (n2 < 1000000000) break block8;
                }
                l3 = hhk.ap(l2, n2 / 1000000000);
                n3 = n2 % 1000000000;
            }
            l2 = l3;
            n2 = n3;
            if (n3 < 0) {
                n2 = n3 + 1000000000;
                l2 = hhk.ar(l3, 1L);
            }
            hyg hyg2 = hzb.a.l();
            if (!hyg2.b.B()) {
                hyg2.u();
            }
            hwv hwv2 = hyg2.b;
            ((hzb)hwv2).b = l2;
            if (!hwv2.B()) {
                hyg2.u();
            }
            ((hzb)hyg2.b).c = n2;
            hyg2 = (hzb)hyg2.o();
            hzw.e((hzb)hyg2);
            return hyg2;
        }
        throw new IllegalArgumentException(String.format("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", l2));
    }

    public static void e(hzb hzb2) {
        long l2 = hzb2.b;
        boolean bl2 = hzw.f(l2);
        int n2 = hzb2.c;
        if (bl2 && n2 >= 0 && n2 < 1000000000) {
            return;
        }
        throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", l2, n2));
    }

    private static boolean f(long l2) {
        return l2 >= -62135596800L && l2 <= 253402300799L;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void g(String string) {
        try {
            Class.forName("java.time.Instant").getMethod(string, null);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

