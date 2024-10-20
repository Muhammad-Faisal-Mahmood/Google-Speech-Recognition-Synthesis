/*
 * Decompiled with CFR 0.152.
 */
abstract class ars {
    public final arm b = new arm();
    public aqe c;
    public apq d;
    public aro e;
    public long f;
    public long g;
    public long h;
    public int i;
    public int j;
    public arq k = new arq();
    public long l;
    public boolean m;
    public boolean n;

    protected abstract long a(aga var1);

    protected void b(boolean bl2) {
        int n2;
        if (bl2) {
            this.k = new arq();
            this.g = 0L;
            n2 = 0;
        } else {
            n2 = 1;
        }
        this.i = n2;
        this.f = -1L;
        this.h = 0L;
    }

    protected abstract boolean c(aga var1, long var2, arq var4);

    protected final long e(long l2) {
        return l2 * 1000000L / (long)this.j;
    }

    protected final long f(long l2) {
        return (long)this.j * l2 / 1000000L;
    }

    protected void g(long l2) {
        this.h = l2;
    }
}

