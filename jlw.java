/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class jlw {
    public final List a = new ArrayList();
    public final klo b;
    public int c;
    public int d;
    jlv[] e;
    int f;
    int g;
    int h;

    public jlw(kmk kmk2) {
        jlv[] jlvArray = new jlv[8];
        this.e = jlvArray;
        this.f = jlvArray.length - 1;
        this.g = 0;
        this.h = 0;
        this.c = 4096;
        this.d = 4096;
        this.b = new kme(kmk2);
    }

    public static final boolean g(int n2) {
        if (n2 >= 0) {
            int n3 = jly.b.length;
            if (n2 <= 60) {
                return true;
            }
        }
        return false;
    }

    private final int h() {
        return this.b.d() & 0xFF;
    }

    private final void i() {
        Arrays.fill(this.e, null);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    private final void j(int n2) {
        if (n2 > 0) {
            int n3 = 0;
            int n4 = n2;
            n2 = n3;
            for (int i2 = this.e.length - 1; i2 >= (n3 = this.f) && n4 > 0; --i2) {
                n3 = this.e[i2].h;
                n4 -= n3;
                this.h -= n3;
                --this.g;
                ++n2;
            }
            jlv[] jlvArray = this.e;
            n4 = n3 + 1;
            System.arraycopy(jlvArray, n4, jlvArray, n4 + n2, this.g);
            this.f += n2;
        }
    }

    public final int a(int n2) {
        return this.f + 1 + n2;
    }

    final int b(int n2, int n3) {
        if ((n2 &= n3) >= n3) {
            int n4;
            n2 = 0;
            while (((n4 = this.h()) & 0x80) != 0) {
                n3 += (n4 & 0x7F) << n2;
                n2 += 7;
            }
            return n3 + (n4 << n2);
        }
        return n2;
    }

    public final klp c(int n2) {
        Object object;
        if (jlw.g(n2)) {
            return jly.b[n2].f;
        }
        int n3 = jly.b.length;
        n3 = this.a(n2 - 61);
        if (n3 >= 0 && n3 < ((jlv[])(object = this.e)).length) {
            return object[n3].f;
        }
        object = new StringBuilder("Header index too large ");
        ((StringBuilder)object).append(n2 + 1);
        throw new IOException(((StringBuilder)object).toString());
    }

    final klp d() {
        int n2 = this.h();
        long l2 = this.b(n2, 127);
        if ((n2 & 0x80) == 128) {
            int n3;
            Object object;
            Object object2 = this.b;
            jme jme2 = jme.a;
            byte[] byArray = object2.A(l2);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            object2 = jme2.b;
            int n4 = 0;
            int n5 = 0;
            n2 = 0;
            while (true) {
                object = object2;
                if (n4 >= byArray.length) break;
                byte by2 = byArray[n4];
                n2 += 8;
                while (true) {
                    n3 = n5 << 8 | by2 & 0xFF;
                    if (n2 < 8) break;
                    int n6 = n2 - 8;
                    object2 = ((nh[])((nh)object2).c)[n3 >>> n6 & 0xFF];
                    if (((nh)object2).c == null) {
                        byteArrayOutputStream.write(((nh)object2).b);
                        n2 -= ((nh)object2).a;
                        object2 = jme2.b;
                        continue;
                    }
                    n2 = n6;
                }
                ++n4;
                n5 = n3;
            }
            for (n3 = n2; n3 > 0; n3 -= ((nh)object2).a) {
                object2 = ((nh[])((nh)object).c)[n5 << 8 - n3 & 0xFF];
                if (((nh)object2).c != null || ((nh)object2).a > n3) break;
                byteArrayOutputStream.write(((nh)object2).b);
                object = jme2.b;
            }
            return klp.f(byteArrayOutputStream.toByteArray());
        }
        return this.b.p(l2);
    }

    public final void e() {
        int n2 = this.d;
        int n3 = this.h;
        if (n2 < n3) {
            if (n2 == 0) {
                this.i();
                return;
            }
            this.j(n3 - n2);
        }
    }

    public final void f(jlv jlv2) {
        this.a.add(jlv2);
        int n2 = jlv2.h;
        int n3 = this.d;
        if (n2 > n3) {
            this.i();
            return;
        }
        this.j(this.h + n2 - n3);
        int n4 = this.g;
        jlv[] jlvArray = this.e;
        n3 = jlvArray.length;
        if (n4 + 1 > n3) {
            jlv[] jlvArray2 = new jlv[n3 + n3];
            System.arraycopy(jlvArray, 0, jlvArray2, n3, n3);
            this.f = this.e.length - 1;
            this.e = jlvArray2;
        }
        n3 = this.f;
        this.f = n3 - 1;
        this.e[n3] = jlv2;
        ++this.g;
        this.h += n2;
    }
}

