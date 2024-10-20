/*
 * Decompiled with CFR 0.152.
 */
public final class cqk {
    public static int a(int n2, boolean bl2, boolean bl3) {
        n2 = n2 + n2 | bl2;
        return n2 + n2 | bl3;
    }

    public static final int b(int n2) {
        return n2 >> 2;
    }

    public static final boolean c(int n2) {
        return (n2 & 1) != 0;
    }

    public static final boolean d(int n2) {
        return (n2 & 2) != 0;
    }

    public static /* synthetic */ int e(int n2, int n3, boolean bl2, boolean bl3, int n4) {
        if ((n4 & 1) != 0) {
            n3 = cqk.b(n2);
        }
        if ((n4 & 2) != 0) {
            bl2 = cqk.d(n2);
        }
        if ((n4 & 4) != 0) {
            bl3 = cqk.c(n2);
        }
        return cqk.a(n3, bl2, bl3);
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

