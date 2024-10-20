/*
 * Decompiled with CFR 0.152.
 */
final class hcw
extends hav {
    private final transient hac a;
    private final transient gzx b;

    public hcw(hac hac2, gzx gzx2) {
        this.a = hac2;
        this.b = gzx2;
    }

    @Override
    public final int b(Object[] objectArray, int n2) {
        return ((gzm)this.b).b(objectArray, n2);
    }

    @Override
    public final boolean contains(Object object) {
        return this.a.get(object) != null;
    }

    @Override
    public final gzx f() {
        return this.b;
    }

    @Override
    public final hdx k() {
        return this.b.v();
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final int size() {
        return ((hcy)this.a).c;
    }

    @Override
    public Object writeReplace() {
        return super.writeReplace();
    }
}

