/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class kit {
    public final klm a;
    public int b;
    public boolean c;
    public int d;
    public kir[] e;
    public int f;
    public int g;
    public int h;

    public kit(klm kirArray) {
        this.a = kirArray;
        this.b = Integer.MAX_VALUE;
        this.d = 4096;
        kirArray = new kir[8];
        this.e = kirArray;
        this.f = kirArray.length - 1;
    }

    public final void a() {
        jns.ac(this.e, null);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    public final void b(kir kir2) {
        int n2 = kir2.i;
        int n3 = this.d;
        if (n2 > n3) {
            this.a();
            return;
        }
        this.e(this.h + n2 - n3);
        n3 = this.g;
        kir[] kirArray = this.e;
        int n4 = kirArray.length;
        if (n3 + 1 > n4) {
            kir[] kirArray2 = new kir[n4 + n4];
            System.arraycopy(kirArray, 0, kirArray2, n4, n4);
            this.f = this.e.length - 1;
            this.e = kirArray2;
        }
        n3 = this.f;
        this.f = n3 - 1;
        this.e[n3] = kir2;
        ++this.g;
        this.h += n2;
    }

    public final void c(klp klp2) {
        int n2;
        int n3;
        jse.e(klp2, "data");
        Object object = kju.a;
        jse.e(klp2, "bytes");
        int n4 = klp2.b();
        int n5 = 0;
        long l2 = 0L;
        for (n3 = 0; n3 < n4; ++n3) {
            n2 = khb.z(klp2.a(n3));
            l2 += (long)kju.b[n2];
        }
        n3 = klp2.b();
        if ((int)(l2 + 7L >> 3) < n3) {
            object = new klm();
            jse.e(klp2, "source");
            n4 = klp2.b();
            l2 = 0L;
            n3 = 0;
            while (n5 < n4) {
                long l3;
                n2 = khb.z(klp2.a(n5));
                int n6 = kju.a[n2];
                n2 = kju.b[n2];
                long l4 = n6;
                n3 += n2;
                while (true) {
                    l3 = l2 << n2 | l4;
                    if (n3 < 8) break;
                    ((klm)object).F((int)(l3 >> (n3 -= 8)));
                }
                ++n5;
                l2 = l3;
            }
            if (n3 > 0) {
                ((klm)object).F((int)(255L >>> n3 | l2 << 8 - n3));
            }
            klp2 = ((klm)object).o();
            this.d(klp2.b(), 127, 128);
            this.a.B(klp2);
            return;
        }
        this.d(klp2.b(), 127, 0);
        this.a.B(klp2);
    }

    public final void d(int n2, int n3, int n4) {
        if (n2 < n3) {
            this.a.F(n2 | n4);
            return;
        }
        this.a.F(n4 | n3);
        n2 -= n3;
        while (n2 >= 128) {
            this.a.F(0x80 | n2 & 0x7F);
            n2 >>>= 7;
        }
        this.a.F(n2);
    }

    public final void e(int n2) {
        if (n2 > 0) {
            Object[] objectArray;
            int n3;
            int n4 = 0;
            int n5 = n2;
            n2 = n4;
            for (n3 = this.e.length - 1; n3 >= (n4 = this.f) && n5 > 0; --n3) {
                objectArray = this.e[n3];
                jse.b(objectArray);
                n5 -= objectArray.i;
                n4 = this.h;
                objectArray = this.e[n3];
                jse.b(objectArray);
                this.h = n4 - objectArray.i;
                --this.g;
                ++n2;
            }
            objectArray = this.e;
            n3 = n4 + 1;
            System.arraycopy(objectArray, n3, objectArray, n3 + n2, this.g);
            objectArray = this.e;
            n3 = this.f + 1;
            Arrays.fill(objectArray, n3, n3 + n2, null);
            this.f += n2;
        }
    }
}

