/*
 * Decompiled with CFR 0.152.
 */
final class gzu
extends gzx {
    private final transient gzx a;

    public gzu(gzx gzx2) {
        this.a = gzx2;
    }

    private final int x(int n2) {
        return this.size() - 1 - n2;
    }

    private final int y(int n2) {
        return this.size() - n2;
    }

    @Override
    public final gzx a() {
        return this.a;
    }

    @Override
    public final gzx c(int n2, int n3) {
        fxf.z(n2, n3, this.size());
        return this.a.c(this.y(n3), this.y(n2)).a();
    }

    @Override
    public final boolean contains(Object object) {
        return this.a.contains(object);
    }

    public final Object get(int n2) {
        fxf.J(n2, this.size());
        return this.a.get(this.x(n2));
    }

    @Override
    public final int indexOf(Object object) {
        int n2 = this.a.lastIndexOf(object);
        if (n2 >= 0) {
            return this.x(n2);
        }
        return -1;
    }

    @Override
    public final boolean l() {
        return this.a.l();
    }

    @Override
    public final int lastIndexOf(Object object) {
        int n2 = this.a.indexOf(object);
        if (n2 >= 0) {
            return this.x(n2);
        }
        return -1;
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override
    public Object writeReplace() {
        return super.writeReplace();
    }
}

