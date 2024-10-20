/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

final class jlx {
    public final klm a;
    jlv[] b;
    int c;
    public int d;
    private int e;

    public jlx(klm klm2) {
        jlv[] jlvArray = new jlv[8];
        this.b = jlvArray;
        this.d = jlvArray.length - 1;
        this.a = klm2;
    }

    public final void a(jlv jlv2) {
        jlv[] jlvArray;
        int n2;
        int n3;
        int n4 = jlv2.h;
        if (n4 > 4096) {
            Arrays.fill(this.b, null);
            this.d = this.b.length - 1;
            this.c = 0;
            this.e = 0;
            return;
        }
        int n5 = this.e + n4 - 4096;
        if (n5 > 0) {
            int n6;
            n3 = 0;
            for (n2 = this.b.length - 1; n2 >= (n6 = this.d) && n5 > 0; --n2) {
                n6 = this.b[n2].h;
                n5 -= n6;
                this.e -= n6;
                --this.c;
                ++n3;
            }
            jlvArray = this.b;
            n2 = n6 + 1;
            System.arraycopy(jlvArray, n2, jlvArray, n2 + n3, this.c);
            this.d += n3;
        }
        if ((n2 = this.c) + 1 > (n3 = (jlvArray = this.b).length)) {
            jlv[] jlvArray2 = new jlv[n3 + n3];
            System.arraycopy(jlvArray, 0, jlvArray2, n3, n3);
            this.d = this.b.length - 1;
            this.b = jlvArray2;
        }
        n3 = this.d;
        this.d = n3 - 1;
        this.b[n3] = jlv2;
        ++this.c;
        this.e += n4;
    }

    final void b(klp klp2) {
        this.c(klp2.b(), 127, 0);
        this.a.B(klp2);
    }

    final void c(int n2, int n3, int n4) {
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
}

