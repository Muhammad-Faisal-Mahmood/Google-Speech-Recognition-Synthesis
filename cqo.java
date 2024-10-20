/*
 * Decompiled with CFR 0.152.
 */
public final class cqo {
    public static final int a(long l2) {
        return cqo.j(l2, 0);
    }

    public static final int b(long l2) {
        return cqo.j(l2, 1);
    }

    public static final int c(long l2) {
        return cqo.j(l2, 2);
    }

    public static final int d(long l2) {
        int n2;
        int n3 = n2 = cqo.b(l2);
        if (n2 == -21) {
            n3 = cqo.c(l2);
        }
        int n4 = cqo.a(l2);
        n2 = n3;
        if (n4 != -21) {
            n2 = jse.l(n4, n3);
        }
        n3 = n2;
        if (!cqo.h(l2)) {
            n3 = cqd.a(n2);
            if (n3 > 0 && n3 <= 10) {
                n3 = cqd.a[n3 - 1];
            } else {
                throw new IllegalArgumentException(a.af(n3, "Invalid java priority: "));
            }
        }
        return n3;
    }

    public static final long e(long l2) {
        return l2 & 0x7FFFFFFFFFFL;
    }

    public static final boolean f(long l2) {
        return (l2 >>> 61 & 1L) == 1L;
    }

    public static final boolean g(long l2) {
        return (l2 >>> 62 & 1L) == 1L;
    }

    public static final boolean h(long l2) {
        return l2 >>> 63 == 1L;
    }

    public static /* synthetic */ long i(long l2, boolean bl2, boolean bl3, boolean bl4, int n2, int n3, long l3, int n4) {
        int n5;
        block5: {
            if ((n4 & 1) != 0) {
                bl2 = cqo.h(l2);
            }
            if ((n4 & 2) != 0) {
                bl3 = cqo.g(l2);
            }
            if ((n4 & 4) != 0) {
                bl4 = cqo.f(l2);
            }
            if ((n4 & 8) != 0) {
                n2 = cqo.c(l2);
            }
            n5 = (n4 & 0x10) != 0 ? cqo.b(l2) : 0;
            if ((n4 & 0x20) != 0) {
                n3 = cqo.a(l2);
            }
            if ((n4 & 0x40) == 0) break block5;
            l3 = cqo.e(l2);
        }
        return crh.b(bl2, bl3, bl4, n2, n5, n3, l3);
    }

    private static final int j(long l2, int n2) {
        return ((int)(l2 >>> n2 * 6 + 43) & 0x3F) - 21;
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

