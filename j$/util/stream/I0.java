/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.nio.file.attribute.a;
import j$.util.A;
import j$.util.Spliterators;
import j$.util.stream.H0;
import j$.util.stream.Y0;
import j$.util.stream.f_0;
import j$.util.z;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

class I0
extends f_0
implements IntConsumer,
Iterable {
    Object d = new int[16];
    Object[] e;

    I0() {
    }

    protected static void m(Object object, int n2, int n3, IntConsumer intConsumer) {
        object = (int[])object;
        while (n2 < n3) {
            intConsumer.accept((int)object[n2]);
            ++n2;
        }
    }

    @Override
    public void accept(int n2) {
        int n3 = this.a;
        Object object = this.d;
        if (n3 == ((int[])object).length) {
            int n4;
            Object object2;
            if (this.e == null) {
                object2 = new int[8][];
                this.e = (Object[])object2;
                this.c = new long[8];
                object2[0] = (int[])object;
            }
            if ((n3 = (n4 = this.b) + 1) >= ((int[][])(object2 = (Object)this.e)).length || object2[n3] == null) {
                long l2;
                if (n4 == 0) {
                    l2 = ((int[])object).length;
                } else {
                    l2 = this.c[n4];
                    l2 = (long)object2[n4].length + l2;
                }
                this.n(l2 + 1L);
            }
            this.a = 0;
            this.b = n3 = this.b + 1;
            this.d = this.e[n3];
        }
        object = (int[])this.d;
        n3 = this.a;
        this.a = n3 + 1;
        object[n3] = n2;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.nio.file.attribute.a.a(this, intConsumer);
    }

    public Object b() {
        long l2 = this.count();
        if (l2 < 0x7FFFFFF7L) {
            int[] nArray = new int[(int)l2];
            this.k(0, nArray);
            return nArray;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override
    public final void clear() {
        Object[] objectArray = this.e;
        if (objectArray != null) {
            this.d = objectArray[0];
            this.e = null;
            this.c = null;
        }
        this.a = 0;
        this.b = 0;
    }

    public final void forEach(Consumer consumer) {
        block4: {
            block3: {
                block2: {
                    if (!(consumer instanceof IntConsumer)) break block2;
                    this.l((IntConsumer)((Object)consumer));
                    break block3;
                }
                if (Y0.a) break block4;
                z.c((H0)this.o(), consumer);
            }
            return;
        }
        Y0.a(this.getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
        throw null;
    }

    public final Iterator iterator() {
        return Spliterators.d(this.o());
    }

    public void k(int n2, Object object) {
        long l2 = n2;
        long l3 = this.count() + l2;
        if (l3 <= (long)((int[])object).length && l3 >= l2) {
            if (this.b == 0) {
                System.arraycopy(this.d, 0, object, n2, this.a);
            } else {
                int n3;
                for (n3 = 0; n3 < this.b; ++n3) {
                    Object object2 = this.e[n3];
                    System.arraycopy(object2, 0, object, n2, ((int[])object2).length);
                    n2 += ((int[])this.e[n3]).length;
                }
                n3 = this.a;
                if (n3 > 0) {
                    System.arraycopy(this.d, 0, object, n2, n3);
                }
            }
            return;
        }
        throw new IndexOutOfBoundsException("does not fit");
    }

    public void l(IntConsumer intConsumer) {
        for (int i2 = 0; i2 < this.b; ++i2) {
            Object object = this.e[i2];
            I0.m(object, 0, ((int[])object).length, intConsumer);
        }
        I0.m(this.d, 0, this.a, intConsumer);
    }

    protected final void n(long l2) {
        int n2 = this.b;
        long l3 = n2 == 0 ? (long)((int[])this.d).length : this.c[n2] + (long)((int[])this.e[n2]).length;
        if (l2 > l3) {
            Object object;
            if (this.e == null) {
                object = new int[8][];
                this.e = (Object[])object;
                this.c = new long[8];
                object[0] = (int[])this.d;
            }
            ++n2;
            while (l2 > l3) {
                int n3;
                object = this.e;
                if (n2 >= ((int[][])object).length) {
                    n3 = ((int[][])object).length * 2;
                    this.e = Arrays.copyOf(object, n3);
                    this.c = Arrays.copyOf(this.c, n3);
                }
                n3 = n2 != 0 && n2 != 1 ? Math.min(n2 + 3, 30) : 4;
                n3 = 1 << n3;
                object = this.e;
                object[n2] = new int[n3];
                long[] lArray = this.c;
                int n4 = n2 - 1;
                lArray[n2] = lArray[n4] + (long)object[n4].length;
                l3 += (long)n3;
                ++n2;
            }
        }
    }

    public A o() {
        return new H0(this, 0, this.b, 0, this.a);
    }

    public final String toString() {
        int[] nArray = (int[])this.b();
        if (nArray.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", this.getClass().getSimpleName(), nArray.length, this.b, Arrays.toString(nArray));
        }
        int[] nArray2 = Arrays.copyOf(nArray, 200);
        return String.format("%s[length=%d, chunks=%d]%s...", this.getClass().getSimpleName(), nArray.length, this.b, Arrays.toString(nArray2));
    }
}

