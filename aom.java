/*
 * Decompiled with CFR 0.152.
 */
final class aom
extends aov
implements Comparable {
    private final int e;
    private final int f;

    public aom(int n2, aex aex2, int n3, aop aop2, int n4) {
        super(0, aex2, n3);
        this.e = vy.l(n4, aop2.q) ? 1 : 0;
        this.f = this.d.a();
    }

    public final int a(aom aom2) {
        return Integer.compare(this.f, aom2.f);
    }

    @Override
    public final int b() {
        return this.e;
    }
}

