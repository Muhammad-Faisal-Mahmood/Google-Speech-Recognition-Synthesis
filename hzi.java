/*
 * Decompiled with CFR 0.152.
 */
import sun.misc.Unsafe;

abstract class hzi {
    final Unsafe a;

    public hzi(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract byte a(long var1);

    public abstract double b(Object var1, long var2);

    public abstract float c(Object var1, long var2);

    public abstract void d(long var1, byte[] var3, long var4, long var6);

    public abstract void e(Object var1, long var2, boolean var4);

    public abstract void f(Object var1, long var2, byte var4);

    public abstract void g(Object var1, long var2, double var4);

    public abstract void h(Object var1, long var2, float var4);

    public abstract boolean i(Object var1, long var2);

    public final int j(Object object, long l2) {
        return this.a.getInt(object, l2);
    }

    public final long k(Object object, long l2) {
        return this.a.getLong(object, l2);
    }

    public final void l(Object object, long l2, int n2) {
        this.a.putInt(object, l2, n2);
    }

    public final void m(Object object, long l2, long l3) {
        this.a.putLong(object, l2, l3);
    }
}

