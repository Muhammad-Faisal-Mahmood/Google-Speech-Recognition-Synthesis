/*
 * Decompiled with CFR 0.152.
 */
final class hcz
extends hba {
    final hdb a;

    public hcz(hdb hdb2) {
        this.a = hdb2;
    }

    @Override
    public final Object a(int n2) {
        return this.a.b.h(n2);
    }

    @Override
    public final boolean contains(Object object) {
        return this.a.contains(object);
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final int size() {
        return this.a.b.c;
    }

    @Override
    public Object writeReplace() {
        return super.writeReplace();
    }
}

