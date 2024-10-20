/*
 * Decompiled with CFR 0.152.
 */
import java.io.OutputStream;

public final class hwa
extends hwd {
    final byte[] a;
    final int b;
    int c;
    int d;
    private final OutputStream g;

    public hwa(OutputStream outputStream, int n2) {
        if (n2 >= 0) {
            byte[] byArray = new byte[Math.max(n2, 20)];
            this.a = byArray;
            this.b = byArray.length;
            if (outputStream != null) {
                this.g = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    private final void aA(int n2) {
        if (this.b - this.c < n2) {
            this.az();
        }
    }

    private final void az() {
        int n2 = this.c;
        this.g.write(this.a, 0, n2);
        this.c = 0;
    }

    @Override
    public final void A(int n2, int n3) {
        this.C(hzo.c(n2, n3));
    }

    @Override
    public final void B(int n2, int n3) {
        this.aA(20);
        this.f(n2, 0);
        this.g(n3);
    }

    @Override
    public final void C(int n2) {
        this.aA(5);
        this.g(n2);
    }

    @Override
    public final void D(int n2, long l2) {
        this.aA(20);
        this.f(n2, 0);
        this.h(l2);
    }

    @Override
    public final void E(long l2) {
        this.aA(10);
        this.h(l2);
    }

    @Override
    public final void F(byte[] byArray, int n2) {
        this.C(n2);
        this.k(byArray, 0, n2);
    }

    @Override
    public final void a(byte[] byArray, int n2, int n3) {
        this.k(byArray, n2, n3);
    }

    @Override
    public final int b() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    final void c(byte by2) {
        int n2 = this.c;
        this.c = n2 + 1;
        this.a[n2] = by2;
        ++this.d;
    }

    final void d(int n2) {
        int n3;
        int n4;
        int n5 = this.c;
        this.c = n4 = n5 + 1;
        byte by2 = (byte)(n2 & 0xFF);
        byte[] byArray = this.a;
        byArray[n5] = by2;
        this.c = n3 = n5 + 2;
        byArray[n4] = (byte)(n2 >> 8 & 0xFF);
        this.c = n4 = n5 + 3;
        byArray[n3] = (byte)(n2 >> 16 & 0xFF);
        this.c = n5 + 4;
        byArray[n4] = (byte)(n2 >> 24 & 0xFF);
        this.d += 4;
    }

    final void e(long l2) {
        int n2;
        int n3;
        int n4 = this.c;
        this.c = n3 = n4 + 1;
        byte by2 = (byte)(l2 & 0xFFL);
        byte[] byArray = this.a;
        byArray[n4] = by2;
        this.c = n2 = n4 + 2;
        byArray[n3] = (byte)(l2 >> 8 & 0xFFL);
        this.c = n3 = n4 + 3;
        byArray[n2] = (byte)(l2 >> 16 & 0xFFL);
        this.c = n2 = n4 + 4;
        byArray[n3] = (byte)(0xFFL & l2 >> 24);
        this.c = n3 = n4 + 5;
        byArray[n2] = (byte)((int)(l2 >> 32) & 0xFF);
        this.c = n2 = n4 + 6;
        byArray[n3] = (byte)((int)(l2 >> 40) & 0xFF);
        this.c = n3 = n4 + 7;
        byArray[n2] = (byte)((int)(l2 >> 48) & 0xFF);
        this.c = n4 + 8;
        byArray[n3] = (byte)((int)(l2 >> 56) & 0xFF);
        this.d += 8;
    }

    final void f(int n2, int n3) {
        this.g(hzo.c(n2, n3));
    }

    final void g(int n2) {
        int n3 = n2;
        if (hwd.e) {
            long l2 = this.c;
            while (true) {
                byte[] byArray;
                if ((n2 & 0xFFFFFF80) == 0) {
                    byArray = this.a;
                    n3 = this.c;
                    this.c = n3 + 1;
                    hzj.n(byArray, n3, (byte)n2);
                    long l3 = this.c;
                    this.d += (int)(l3 - l2);
                    return;
                }
                byArray = this.a;
                n3 = this.c;
                this.c = n3 + 1;
                hzj.n(byArray, n3, (byte)((n2 | 0x80) & 0xFF));
                n2 >>>= 7;
            }
        }
        while (true) {
            byte[] byArray;
            if ((n3 & 0xFFFFFF80) == 0) {
                byArray = this.a;
                n2 = this.c;
                this.c = n2 + 1;
                byArray[n2] = (byte)n3;
                ++this.d;
                return;
            }
            byArray = this.a;
            n2 = this.c;
            this.c = n2 + 1;
            byArray[n2] = (byte)((n3 | 0x80) & 0xFF);
            ++this.d;
            n3 >>>= 7;
        }
    }

    final void h(long l2) {
        long l3 = l2;
        if (hwd.e) {
            l3 = this.c;
            while (true) {
                int n2;
                byte[] byArray;
                int n3 = (int)l2;
                if ((l2 & 0xFFFFFFFFFFFFFF80L) == 0L) {
                    byArray = this.a;
                    n2 = this.c;
                    this.c = n2 + 1;
                    hzj.n(byArray, n2, (byte)n3);
                    l2 = this.c;
                    this.d += (int)(l2 - l3);
                    return;
                }
                byArray = this.a;
                n2 = this.c;
                this.c = n2 + 1;
                hzj.n(byArray, n2, (byte)((n3 | 0x80) & 0xFF));
                l2 >>>= 7;
            }
        }
        while (true) {
            int n4;
            byte[] byArray;
            int n5 = (int)l3;
            if ((l3 & 0xFFFFFFFFFFFFFF80L) == 0L) {
                byArray = this.a;
                n4 = this.c;
                this.c = n4 + 1;
                byArray[n4] = (byte)n5;
                ++this.d;
                return;
            }
            byArray = this.a;
            n4 = this.c;
            this.c = n4 + 1;
            byArray[n4] = (byte)((n5 | 0x80) & 0xFF);
            ++this.d;
            l3 >>>= 7;
        }
    }

    @Override
    public final void i() {
        if (this.c > 0) {
            this.az();
        }
    }

    @Override
    public final void j(byte by2) {
        if (this.c == this.b) {
            this.az();
        }
        this.c(by2);
    }

    public final void k(byte[] byArray, int n2, int n3) {
        int n4 = this.b;
        int n5 = this.c;
        if ((n4 -= n5) >= n3) {
            System.arraycopy(byArray, n2, this.a, n5, n3);
            this.c += n3;
            this.d += n3;
            return;
        }
        System.arraycopy(byArray, n2, this.a, n5, n4);
        n2 += n4;
        this.c = this.b;
        this.d += n4;
        this.az();
        n5 = this.b;
        if ((n3 -= n4) <= n5) {
            System.arraycopy(byArray, n2, this.a, 0, n3);
            this.c = n3;
        } else {
            this.g.write(byArray, n2, n3);
        }
        this.d += n3;
    }

    @Override
    public final void l(int n2, boolean bl2) {
        this.aA(11);
        this.f(n2, 0);
        this.c((byte)(bl2 ? 1 : 0));
    }

    @Override
    public final void m(int n2, hvu hvu2) {
        this.A(n2, 2);
        this.n(hvu2);
    }

    @Override
    public final void n(hvu hvu2) {
        this.C(hvu2.d());
        hvu2.m(this);
    }

    @Override
    public final void o(int n2, int n3) {
        this.aA(14);
        this.f(n2, 5);
        this.d(n3);
    }

    @Override
    public final void p(int n2) {
        this.aA(4);
        this.d(n2);
    }

    @Override
    public final void q(int n2, long l2) {
        this.aA(18);
        this.f(n2, 1);
        this.e(l2);
    }

    @Override
    public final void r(long l2) {
        this.aA(8);
        this.e(l2);
    }

    @Override
    public final void s(int n2, int n3) {
        this.aA(20);
        this.f(n2, 0);
        if (n3 >= 0) {
            this.g(n3);
            return;
        }
        this.h(n3);
    }

    @Override
    public final void t(int n2) {
        if (n2 >= 0) {
            this.C(n2);
            return;
        }
        this.E(n2);
    }

    @Override
    public final void u(int n2, hyf hyf2, hyu hyu2) {
        this.A(n2, 2);
        this.C(((hvd)hyf2).d(hyu2));
        hyu2.m(hyf2, this.f);
    }

    @Override
    public final void v(hyf hyf2) {
        this.C(hyf2.k());
        hyf2.aZ(this);
    }

    @Override
    public final void w(int n2, hyf hyf2) {
        this.A(1, 3);
        this.B(2, n2);
        this.A(3, 2);
        this.v(hyf2);
        this.A(1, 4);
    }

    @Override
    public final void x(int n2, hvu hvu2) {
        this.A(1, 3);
        this.B(2, n2);
        this.m(3, hvu2);
        this.A(1, 4);
    }

    @Override
    public final void y(int n2, String string) {
        this.A(n2, 2);
        this.z(string);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void z(String var1_1) {
        var4_2 = var1_1.length() * 3;
        var2_3 = hwa.ab(var4_2);
        var3_4 = var2_3 + var4_2;
        var5_5 = this.b;
        if (var3_4 > var5_5) {
            var6_6 = new byte[var4_2];
            var2_3 = hzl.a(var1_1, var6_6, 0, var4_2);
            this.C(var2_3);
            this.k(var6_6, 0, var2_3);
            return;
        }
        if (var3_4 > var5_5 - this.c) {
            this.az();
        }
        var4_2 = hwa.ab(var1_1.length());
        var3_4 = this.c;
        if (var4_2 != var2_3) ** GOTO lbl29
        var2_3 = var3_4 + var4_2;
        {
            catch (hzk var6_9) {
                this.ai(var1_1, var6_9);
                return;
            }
        }
        try {
            block9: {
                this.c = var2_3;
                var5_5 = hzl.a(var1_1, this.a, var2_3, this.b - var2_3);
                this.c = var3_4;
                var2_3 = var5_5 - var3_4 - var4_2;
                this.g(var2_3);
                this.c = var5_5;
                break block9;
lbl29:
                // 1 sources

                var2_3 = hzl.b(var1_1);
                this.g(var2_3);
                this.c = hzl.a(var1_1, this.a, this.c, var2_3);
            }
            this.d += var2_3;
            return;
        }
        catch (ArrayIndexOutOfBoundsException var7_10) {
            var6_7 = new hwc(var7_10);
            throw var6_7;
            catch (hzk var6_8) {
                this.d -= this.c - var3_4;
                this.c = var3_4;
                throw var6_8;
            }
        }
    }
}

