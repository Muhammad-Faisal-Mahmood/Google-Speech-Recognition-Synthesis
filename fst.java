/*
 * Decompiled with CFR 0.152.
 */
final class fst
implements fsr {
    long a = 0L;

    @Override
    public final hun a() {
        hwp hwp2 = hun.a.l();
        long l2 = this.a;
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hun hun2 = (hun)hwp2.b;
        hun2.b = 1;
        hun2.c = l2;
        return (hun)hwp2.o();
    }

    public final boolean equals(Object object) {
        return object instanceof fst && this.a == ((fst)object).a;
    }

    public final int hashCode() {
        return Long.valueOf(this.a).hashCode();
    }

    public final String toString() {
        return Long.toString(this.a);
    }
}

