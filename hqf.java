/*
 * Decompiled with CFR 0.152.
 */
final class hqf
extends hpl {
    final hqh a;
    private final hnx b;

    public hqf(hqh hqh2, hnx hnx2) {
        this.a = hqh2;
        fxf.K(hnx2);
        this.b = hnx2;
    }

    @Override
    public final String b() {
        return this.b.toString();
    }

    @Override
    public final void d(Throwable throwable) {
        this.a.n(throwable);
    }

    @Override
    public final boolean g() {
        return this.a.isDone();
    }
}

