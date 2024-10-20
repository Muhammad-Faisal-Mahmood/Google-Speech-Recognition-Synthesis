/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

/*
 * Renamed from j$.util.stream.f
 */
abstract class f_0 {
    protected int a;
    protected int b;
    protected long[] c;

    public abstract void clear();

    public final long count() {
        int n2 = this.b;
        long l2 = n2 == 0 ? (long)this.a : this.c[n2] + (long)this.a;
        return l2;
    }
}

