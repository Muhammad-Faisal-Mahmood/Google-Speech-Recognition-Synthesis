/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  libcore.io.Memory
 */
import libcore.io.Memory;
import sun.misc.Unsafe;

final class hzh
extends hzi {
    public hzh(Unsafe unsafe) {
        super(unsafe);
    }

    @Override
    public final byte a(long l2) {
        return Memory.peekByte((long)l2);
    }

    @Override
    public final double b(Object object, long l2) {
        return Double.longBitsToDouble(this.k(object, l2));
    }

    @Override
    public final float c(Object object, long l2) {
        return Float.intBitsToFloat(this.j(object, l2));
    }

    @Override
    public final void d(long l2, byte[] byArray, long l3, long l4) {
        Memory.peekByteArray((long)l2, (byte[])byArray, (int)((int)l3), (int)((int)l4));
    }

    @Override
    public final void e(Object object, long l2, boolean bl2) {
        if (hzj.c) {
            hzj.o(object, l2, (byte)(bl2 ? 1 : 0));
            return;
        }
        hzj.p(object, l2, (byte)(bl2 ? 1 : 0));
    }

    @Override
    public final void f(Object object, long l2, byte by2) {
        if (hzj.c) {
            hzj.o(object, l2, by2);
            return;
        }
        hzj.p(object, l2, by2);
    }

    @Override
    public final void g(Object object, long l2, double d2) {
        this.m(object, l2, Double.doubleToLongBits(d2));
    }

    @Override
    public final void h(Object object, long l2, float f2) {
        this.l(object, l2, Float.floatToIntBits(f2));
    }

    @Override
    public final boolean i(Object object, long l2) {
        if (hzj.c) {
            return hzj.x(object, l2);
        }
        return hzj.y(object, l2);
    }
}

