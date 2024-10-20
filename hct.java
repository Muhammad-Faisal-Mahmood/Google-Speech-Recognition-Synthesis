/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;

public final class hct
extends gzx {
    public static final gzx a = new hct(new Object[0], 0);
    final transient Object[] b;
    public final transient int c;

    public hct(Object[] objectArray, int n2) {
        this.b = objectArray;
        this.c = n2;
    }

    @Override
    public final int b(Object[] objectArray, int n2) {
        System.arraycopy(this.b, 0, objectArray, n2, this.c);
        return n2 + this.c;
    }

    @Override
    public final int d() {
        return this.c;
    }

    @Override
    public final int e() {
        return 0;
    }

    public final Object get(int n2) {
        fxf.J(n2, this.c);
        return Objects.requireNonNull(this.b[n2]);
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final Object[] m() {
        return this.b;
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

