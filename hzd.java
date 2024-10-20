/*
 * Decompiled with CFR 0.152.
 */
final class hzd {
    private static volatile int a = 100;

    public static hze f(Object object) {
        return ((hwv)object).unknownFields;
    }

    public static void g(Object object, hze hze2) {
        ((hwv)object).unknownFields = hze2;
    }

    final boolean a(Object object, hvz hvz2, int n2) {
        int n3 = hvz2.a;
        int n4 = hzo.a(n3);
        if ((n3 = hzo.b(n3)) != 0) {
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) {
                        if (n3 != 4) {
                            if (n3 == 5) {
                                n2 = hvz2.e();
                                n4 = hzo.c(n4, 5);
                                ((hze)object).e(n4, n2);
                                return true;
                            }
                            throw new hxm();
                        }
                        return false;
                    }
                    hze hze2 = new hze();
                    n3 = hzo.c(n4, 4);
                    if (++n2 < a) {
                        while (hvz2.c() != Integer.MAX_VALUE && this.a(hze2, hvz2, n2)) {
                        }
                        if (n3 == hvz2.a) {
                            hze2.d();
                            n2 = hzo.c(n4, 3);
                            ((hze)object).e(n2, hze2);
                            return true;
                        }
                        throw new hxn("Protocol message end-group tag did not match expected tag.");
                    }
                    throw new hxn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
                this.c(object, n4, hvz2.o());
                return true;
            }
            long l2 = hvz2.j();
            n2 = hzo.c(n4, 1);
            ((hze)object).e(n2, l2);
            return true;
        }
        this.d(object, n4, hvz2.k());
        return true;
    }

    public final void e(Object object) {
        hzd.f(object).d();
    }
}

