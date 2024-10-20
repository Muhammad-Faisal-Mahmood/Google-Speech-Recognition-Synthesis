/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public class hcn {
    transient Object[] a;
    transient int[] b;
    transient int c;
    transient int d;
    public transient int[] e;
    transient long[] f;
    private transient float g;
    private transient int h;

    public hcn() {
        this.n(3);
    }

    public hcn(int n2) {
        this(n2, null);
    }

    public hcn(int n2, byte[] byArray) {
        this.n(n2);
    }

    public hcn(hcn hcn2) {
        this.n(hcn2.c);
        int n2 = hcn2.a();
        while (n2 != -1) {
            this.o(hcn2.h(n2), hcn2.c(n2));
            n2 = hcn2.e(n2);
        }
    }

    private static int q(long l2) {
        return (int)(l2 >>> 32);
    }

    private final int r() {
        return this.e.length - 1;
    }

    private static long s(long l2, int n2) {
        return l2 & 0xFFFFFFFF00000000L | (long)n2 & 0xFFFFFFFFL;
    }

    private final void t(int n2) {
        if (this.e.length >= 0x40000000) {
            this.h = Integer.MAX_VALUE;
            return;
        }
        float f2 = n2;
        float f3 = this.g;
        int[] nArray = hcn.u(n2);
        long[] lArray = this.f;
        int n3 = nArray.length;
        for (n2 = 0; n2 < this.c; ++n2) {
            int n4 = hcn.q(lArray[n2]);
            int n5 = n3 - 1 & n4;
            int n6 = nArray[n5];
            nArray[n5] = n2;
            long l2 = n6;
            lArray[n2] = (long)n4 << 32 | l2 & 0xFFFFFFFFL;
        }
        this.h = (int)(f2 * f3) + 1;
        this.e = nArray;
    }

    private static int[] u(int n2) {
        int[] nArray = new int[n2];
        Arrays.fill(nArray, -1);
        return nArray;
    }

    public int a() {
        if (this.c == 0) {
            return -1;
        }
        return 0;
    }

    public final int b(Object object) {
        int n2 = this.d(object);
        if (n2 == -1) {
            return 0;
        }
        return this.b[n2];
    }

    final int c(int n2) {
        fxf.J(n2, this.c);
        return this.b[n2];
    }

    final int d(Object object) {
        int n2 = fvd.X(object);
        int n3 = this.e[this.r() & n2];
        while (n3 != -1) {
            long l2 = this.f[n3];
            if (hcn.q(l2) == n2 && a.k(object, this.a[n3])) {
                return n3;
            }
            n3 = (int)l2;
        }
        return -1;
    }

    public int e(int n2) {
        if (++n2 < this.c) {
            return n2;
        }
        return -1;
    }

    public final int f(Object object, int n2) {
        int n3 = this.r() & n2;
        int n4 = this.e[n3];
        if (n4 != -1) {
            int n5 = -1;
            while (true) {
                if (hcn.q(this.f[n4]) == n2 && a.k(object, this.a[n4])) {
                    n2 = this.b[n4];
                    if (n5 == -1) {
                        this.e[n3] = (int)this.f[n4];
                    } else {
                        object = this.f;
                        object[n5] = hcn.s((long)object[n5], (int)object[n4]);
                    }
                    this.k(n4);
                    --this.c;
                    ++this.d;
                    return n2;
                }
                int n6 = (int)this.f[n4];
                if (n6 == -1) break;
                n5 = n4;
                n4 = n6;
            }
        }
        return 0;
    }

    final int g(int n2) {
        return this.f(this.a[n2], hcn.q(this.f[n2]));
    }

    final Object h(int n2) {
        fxf.J(n2, this.c);
        return this.a[n2];
    }

    final void i(int n2) {
        if (n2 > this.f.length) {
            this.l(n2);
        }
        if (n2 >= this.h) {
            n2 = Integer.highestOneBit(n2 - 1);
            this.t(Math.max(2, n2 + n2));
        }
    }

    public void j(int n2, Object object, int n3, int n4) {
        long l2 = n4;
        this.f[n2] = l2 << 32 | 0xFFFFFFFFL;
        this.a[n2] = object;
        this.b[n2] = n3;
    }

    public void k(int n2) {
        int n3 = this.c - 1;
        if (n2 < n3) {
            Object object;
            Object[] objectArray = this.a;
            objectArray[n2] = objectArray[n3];
            int[] nArray = this.b;
            nArray[n2] = nArray[n3];
            objectArray[n3] = null;
            nArray[n3] = 0;
            objectArray = this.f;
            objectArray[n2] = object = objectArray[n3];
            objectArray[n3] = -1L;
            objectArray = this.e;
            int n4 = hcn.q((long)object) & this.r();
            Object object2 = objectArray[n4];
            if (object2 != n3) {
                while ((n4 = (int)(object = (objectArray = (Object[])this.f)[object2])) != n3) {
                    object2 = n4;
                }
                objectArray[object2] = hcn.s((long)object, n2);
                return;
            }
            objectArray[n4] = n2;
            return;
        }
        this.a[n2] = null;
        this.b[n2] = 0;
        this.f[n2] = -1L;
    }

    public void l(int n2) {
        this.a = Arrays.copyOf(this.a, n2);
        this.b = Arrays.copyOf(this.b, n2);
        long[] lArray = this.f;
        int n3 = lArray.length;
        lArray = Arrays.copyOf(lArray, n2);
        if (n2 > n3) {
            Arrays.fill(lArray, n3, n2, -1L);
        }
        this.f = lArray;
    }

    final void m(int n2, int n3) {
        fxf.J(n2, this.c);
        this.b[n2] = n3;
    }

    public void n(int n2) {
        boolean bl2 = n2 >= 0;
        fxf.r(bl2, "Initial capacity must be non-negative");
        fxf.r(true, "Illegal load factor");
        int n3 = fvd.Y(n2);
        this.e = hcn.u(n3);
        this.g = 1.0f;
        this.a = new Object[n2];
        this.b = new int[n2];
        long[] lArray = new long[n2];
        Arrays.fill(lArray, -1L);
        this.f = lArray;
        this.h = Math.max(1, (int)((float)n3));
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void o(Object object, int n2) {
        int n3;
        if (n2 <= 0) {
            throw new IllegalArgumentException(a.af(n2, "count must be positive but was: "));
        }
        long[] lArray = this.f;
        Object[] objectArray = this.a;
        int[] nArray = this.b;
        int n4 = fvd.X(object);
        int n5 = this.r() & n4;
        int n6 = this.c;
        int[] nArray2 = this.e;
        int n7 = n3 = nArray2[n5];
        if (n3 == -1) {
            nArray2[n5] = n6;
        } else {
            while (true) {
                long l2;
                if (hcn.q(l2 = lArray[n7]) == n4 && a.k(object, objectArray[n7])) {
                    n3 = nArray[n7];
                    nArray[n7] = n2;
                    return;
                }
                n3 = (int)l2;
                if (n3 == -1) {
                    lArray[n7] = hcn.s(l2, n6);
                    break;
                }
                n7 = n3;
            }
        }
        n3 = Integer.MAX_VALUE;
        if (n6 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int n8 = n6 + 1;
        n5 = this.f.length;
        if (n8 > n5) {
            n7 = Math.max(1, n5 >>> 1) + n5;
            if (n7 < 0) {
                n7 = n3;
            }
            if (n7 != n5) {
                this.l(n7);
            }
        }
        this.j(n6, object, n2, n4);
        this.c = n8;
        if (n6 >= this.h) {
            n2 = this.e.length;
            this.t(n2 + n2);
        }
        ++this.d;
    }

    final hci p(int n2) {
        fxf.J(n2, this.c);
        return new hci(this, n2);
    }
}

