/*
 * Decompiled with CFR 0.152.
 */
public final class jtw
implements Comparable {
    public static final long a;
    public static final long b;

    static {
        int n2 = jtx.a;
        a = jsl.i(0x3FFFFFFFFFFFFFFFL);
        b = jsl.i(-4611686018427387903L);
    }

    public static final long a(long l2) {
        return l2 >> 1;
    }

    public static final long b(long l2, long l3) {
        if (jtw.f(l2)) {
            if (!jtw.c(l3) && (l3 ^ l2) < 0L) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return l2;
        }
        if (jtw.f(l3)) {
            return l3;
        }
        if (((int)l2 & 1) == ((int)l3 & 1)) {
            long l4 = jtw.a(l2);
            l3 = jtw.a(l3);
            boolean bl2 = jtw.e(l2);
            l2 = l4 + l3;
            if (bl2) {
                if (new jsy(-4611686018426999999L, 4611686018426999999L).b(l2)) {
                    int n2 = jtx.a;
                    l2 += l2;
                } else {
                    l2 = jsl.i(jsl.k(l2));
                }
            } else if (new jsy(-4611686018426L, 4611686018426L).b(l2)) {
                l2 = jsl.j(l2);
                int n3 = jtx.a;
                l2 += l2;
            } else {
                l2 = jsl.i(jse.o(l2, -4611686018427387903L, 0x3FFFFFFFFFFFFFFFL));
            }
        } else {
            l2 = jtw.d(l2) ? jtw.g(jtw.a(l2), jtw.a(l3)) : jtw.g(jtw.a(l3), jtw.a(l2));
        }
        return l2;
    }

    public static final boolean c(long l2) {
        return !jtw.f(l2);
    }

    public static final boolean d(long l2) {
        return ((int)l2 & 1) == 1;
    }

    public static final boolean e(long l2) {
        return ((int)l2 & 1) == 0;
    }

    public static final boolean f(long l2) {
        return l2 == a || l2 == b;
        {
        }
    }

    private static final long g(long l2, long l3) {
        jsy jsy2 = new jsy(-4611686018426L, 4611686018426L);
        long l4 = jsl.k(l3);
        if (jsy2.b(l2 += l4)) {
            l4 = jsl.j(l4);
            l2 = jsl.j(l2);
            int n2 = jtx.a;
            l2 += l3 - l4;
            l2 += l2;
        } else {
            l2 = jsl.i(jse.o(l2, -4611686018427387903L, 0x3FFFFFFFFFFFFFFFL));
        }
        return l2;
    }

    public final boolean equals(Object object) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}

