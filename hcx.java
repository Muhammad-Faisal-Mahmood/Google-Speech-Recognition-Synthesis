/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;

final class hcx
extends gzx {
    private final transient Object[] a;
    private final transient int b;
    private final transient int c;

    public hcx(Object[] objectArray, int n2, int n3) {
        this.a = objectArray;
        this.b = n2;
        this.c = n3;
    }

    public final Object get(int n2) {
        fxf.J(n2, this.c);
        int n3 = this.b;
        return Objects.requireNonNull(this.a[n2 + n2 + n3]);
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final int size() {
        return this.c;
    }

    @Override
    public Object writeReplace() {
        return super.writeReplace();
    }
}

