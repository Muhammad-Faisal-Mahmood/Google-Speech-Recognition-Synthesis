/*
 * Decompiled with CFR 0.152.
 */
final class gzw
extends gzx {
    final transient int a;
    final transient int b;
    final gzx c;

    public gzw(gzx gzx2, int n2, int n3) {
        this.c = gzx2;
        this.a = n2;
        this.b = n3;
    }

    @Override
    public final gzx c(int n2, int n3) {
        fxf.z(n2, n3, this.b);
        int n4 = this.a;
        return this.c.c(n2 + n4, n3 + n4);
    }

    @Override
    public final int d() {
        return this.c.e() + this.a + this.b;
    }

    @Override
    public final int e() {
        return this.c.e() + this.a;
    }

    public final Object get(int n2) {
        fxf.J(n2, this.b);
        int n3 = this.a;
        return this.c.get(n2 + n3);
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final Object[] m() {
        return this.c.m();
    }

    @Override
    public final int size() {
        return this.b;
    }

    @Override
    public Object writeReplace() {
        return super.writeReplace();
    }
}

