/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class kis {
    public int a = 4096;
    public final List b = new ArrayList();
    public final klo c;
    public kir[] d;
    public int e;
    public int f;
    private int g;

    public kis(kmk kirArray) {
        this.c = new kme((kmk)kirArray);
        kirArray = new kir[8];
        this.d = kirArray;
        this.g = kirArray.length - 1;
    }

    public static final boolean h(int n2) {
        if (n2 >= 0) {
            kir[] kirArray = kiu.a;
            int n3 = kiu.a.length;
            if (n2 <= 60) {
                return true;
            }
        }
        return false;
    }

    private final int i() {
        return khb.z(this.c.d());
    }

    public final int a(int n2) {
        return this.g + 1 + n2;
    }

    public final int b(int n2, int n3) {
        if ((n2 &= n3) >= n3) {
            int n4;
            n2 = 0;
            while (((n4 = this.i()) & 0x80) != 0) {
                n3 += (n4 & 0x7F) << n2;
                n2 += 7;
            }
            return n3 + (n4 << n2);
        }
        return n2;
    }

    public final klp c(int n2) {
        Object object;
        block4: {
            block3: {
                block2: {
                    if (!kis.h(n2)) break block2;
                    object = kiu.a;
                    object = kiu.a[n2].g;
                    break block3;
                }
                object = kiu.a;
                int n3 = kiu.a.length;
                n3 = this.a(n2 - 61);
                if (n3 < 0 || n3 >= ((kir[])(object = this.d)).length) break block4;
                object = object[n3];
                jse.b(object);
                object = ((kir)object).g;
            }
            return object;
        }
        object = new StringBuilder("Header index too large ");
        ((StringBuilder)object).append(n2 + 1);
        throw new IOException(((StringBuilder)object).toString());
    }

    public final klp d() {
        Object object;
        int n2 = this.i();
        long l2 = this.b(n2, 127);
        if ((n2 & 0x80) == 128) {
            int n3;
            Object object2;
            klm klm2 = new klm();
            object = kju.a;
            klo klo2 = this.c;
            object = kju.c;
            int n4 = 0;
            long l3 = 0L;
            n2 = 0;
            while (true) {
                object2 = object;
                if (l3 >= l2) break;
                int n5 = khb.z(klo2.d());
                n2 += 8;
                while (true) {
                    n3 = n4 << 8 | n5;
                    if (n2 < 8) break;
                    int n6 = n2 - 8;
                    object = ((nh)object).c;
                    jse.b(object);
                    object = ((nh[])object)[n3 >>> n6 & 0xFF];
                    jse.b(object);
                    if (((nh)object).c == null) {
                        klm2.F(((nh)object).b);
                        n2 -= ((nh)object).a;
                        object = kju.c;
                        continue;
                    }
                    n2 = n6;
                }
                ++l3;
                n4 = n3;
            }
            for (n3 = n2; n3 > 0; n3 -= ((nh)object).a) {
                object = ((nh)object2).c;
                jse.b(object);
                object = ((nh[])object)[n4 << 8 - n3 & 0xFF];
                jse.b(object);
                if (((nh)object).c != null || ((nh)object).a > n3) break;
                klm2.F(((nh)object).b);
                object2 = kju.c;
            }
            object = klm2.o();
        } else {
            object = this.c.p(l2);
        }
        return object;
    }

    public final void e() {
        jns.ac(this.d, null);
        this.g = this.d.length - 1;
        this.e = 0;
        this.f = 0;
    }

    public final void f(int n2) {
        if (n2 > 0) {
            Object object;
            int n3;
            int n4 = 0;
            int n5 = n2;
            n2 = n4;
            for (n3 = this.d.length - 1; n3 >= (n4 = this.g) && n5 > 0; --n3) {
                object = this.d[n3];
                jse.b(object);
                n4 = object.i;
                n5 -= n4;
                this.f -= n4;
                --this.e;
                ++n2;
            }
            object = this.d;
            n3 = n4 + 1;
            System.arraycopy(object, n3, object, n3 + n2, this.e);
            this.g += n2;
        }
    }

    public final void g(kir kir2) {
        this.b.add(kir2);
        int n2 = kir2.i;
        int n3 = this.a;
        if (n2 > n3) {
            this.e();
            return;
        }
        this.f(this.f + n2 - n3);
        n3 = this.e;
        kir[] kirArray = this.d;
        int n4 = kirArray.length;
        if (n3 + 1 > n4) {
            kir[] kirArray2 = new kir[n4 + n4];
            System.arraycopy(kirArray, 0, kirArray2, n4, n4);
            this.g = this.d.length - 1;
            this.d = kirArray2;
        }
        n3 = this.g;
        this.g = n3 - 1;
        this.d[n3] = kir2;
        ++this.e;
        this.f += n2;
    }
}

