/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;

public final class hwb
extends hwd {
    private final byte[] a;
    private final int b;
    private int c;

    public hwb(byte[] byArray, int n2, int n3) {
        if (byArray != null) {
            int n4 = byArray.length;
            int n5 = n2 + n3;
            if ((n2 | n3 | n4 - n5) >= 0) {
                this.a = byArray;
                this.c = n2;
                this.b = n5;
                return;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", n4, n2, n3));
        }
        throw new NullPointerException("buffer");
    }

    @Override
    public final void A(int n2, int n3) {
        this.C(hzo.c(n2, n3));
    }

    @Override
    public final void B(int n2, int n3) {
        this.A(n2, 0);
        this.C(n3);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void C(int var1_1) {
        while (true) lbl-1000:
        // 2 sources

        {
            if ((var1_1 & -128) == 0) {
                var3_3 = this.a;
                var2_2 = this.c;
                this.c = var2_2 + 1;
                var3_3[var2_2] = (byte)var1_1;
                return;
            }
            var3_3 = this.a;
            var2_2 = this.c;
            this.c = var2_2 + 1;
            break;
        }
        catch (IndexOutOfBoundsException var3_4) {
            throw new hwc(this.c, this.b, 1, var3_4);
        }
        {
            var3_3[var2_2] = (byte)((var1_1 | 128) & 255);
            var1_1 >>>= 7;
            ** while (true)
        }
    }

    @Override
    public final void D(int n2, long l2) {
        this.A(n2, 0);
        this.E(l2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void E(long var1_1) {
        var5_2 = var1_1;
        if (hwd.e) {
            var5_2 = var1_1;
            if (this.b() >= 10) {
                while (true) {
                    var3_3 = (int)var1_1;
                    if ((var1_1 & -128L) == 0L) {
                        var7_6 = this.a;
                        var4_5 = this.c;
                        this.c = var4_5 + 1;
                        hzj.n(var7_6, var4_5, (byte)var3_3);
                        return;
                    }
                    var7_6 = this.a;
                    var4_5 = this.c;
                    this.c = var4_5 + 1;
                    hzj.n(var7_6, var4_5, (byte)((var3_3 | 128) & 255));
                    var1_1 >>>= 7;
                }
            }
        }
        while (true) lbl-1000:
        // 2 sources

        {
            if ((var5_2 & -128L) == 0L) {
                var7_7 = this.a;
                var3_4 = this.c;
                this.c = var3_4 + 1;
                var7_7[var3_4] = (byte)var5_2;
                return;
            }
            var7_7 = this.a;
            var3_4 = this.c;
            this.c = var3_4 + 1;
            break;
        }
        catch (IndexOutOfBoundsException var7_8) {
            throw new hwc(this.c, this.b, 1, var7_8);
        }
        {
            var7_7[var3_4] = (byte)(((int)var5_2 | 128) & 255);
            var5_2 >>>= 7;
            ** while (true)
        }
    }

    @Override
    public final void F(byte[] byArray, int n2) {
        this.C(n2);
        this.c(byArray, 0, n2);
    }

    @Override
    public final void a(byte[] byArray, int n2, int n3) {
        this.c(byArray, n2, n3);
    }

    @Override
    public final int b() {
        return this.b - this.c;
    }

    public final void c(byte[] byArray, int n2, int n3) {
        try {
            System.arraycopy(byArray, n2, this.a, this.c, n3);
            this.c += n3;
            return;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new hwc(this.c, this.b, n3, indexOutOfBoundsException);
        }
    }

    @Override
    public final void i() {
    }

    @Override
    public final void j(byte by2) {
        int n2 = this.c;
        try {
            byte[] byArray = this.a;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new hwc(n2, this.b, 1, indexOutOfBoundsException);
        }
        byArray[n2] = by2;
        this.c = n2 + 1;
    }

    @Override
    public final void l(int n2, boolean bl2) {
        this.A(n2, 0);
        this.j((byte)(bl2 ? 1 : 0));
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
        this.A(n2, 5);
        this.p(n3);
    }

    @Override
    public final void p(int n2) {
        int n3 = this.c;
        try {
            byte[] byArray = this.a;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new hwc(n3, this.b, 4, indexOutOfBoundsException);
        }
        byArray[n3] = (byte)(n2 & 0xFF);
        byArray[n3 + 1] = (byte)(n2 >> 8 & 0xFF);
        byArray[n3 + 2] = (byte)(n2 >> 16 & 0xFF);
        byArray[n3 + 3] = (byte)(n2 >> 24 & 0xFF);
        this.c = n3 + 4;
    }

    @Override
    public final void q(int n2, long l2) {
        this.A(n2, 1);
        this.r(l2);
    }

    @Override
    public final void r(long l2) {
        int n2 = this.c;
        try {
            byte[] byArray = this.a;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new hwc(n2, this.b, 8, indexOutOfBoundsException);
        }
        byArray[n2] = (byte)((int)l2 & 0xFF);
        byArray[n2 + 1] = (byte)((int)(l2 >> 8) & 0xFF);
        byArray[n2 + 2] = (byte)((int)(l2 >> 16) & 0xFF);
        byArray[n2 + 3] = (byte)((int)(l2 >> 24) & 0xFF);
        byArray[n2 + 4] = (byte)((int)(l2 >> 32) & 0xFF);
        byArray[n2 + 5] = (byte)((int)(l2 >> 40) & 0xFF);
        byArray[n2 + 6] = (byte)((int)(l2 >> 48) & 0xFF);
        byArray[n2 + 7] = (byte)((int)(l2 >> 56) & 0xFF);
        this.c = n2 + 8;
    }

    @Override
    public final void s(int n2, int n3) {
        this.A(n2, 0);
        this.t(n3);
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void z(String string) {
        int n2 = this.c;
        try {
            int n3 = hwb.ab(string.length() * 3);
            int n4 = hwb.ab(string.length());
            if (n4 == n3) {
                this.c = n3 = n2 + n4;
                n3 = hzl.a(string, this.a, n3, this.b());
                this.c = n2;
                this.C(n3 - n2 - n4);
                this.c = n3;
                return;
            }
            this.C(hzl.b(string));
            this.c = hzl.a(string, this.a, this.c, this.b());
            return;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new hwc(indexOutOfBoundsException);
        }
        catch (hzk hzk2) {
            this.c = n2;
            this.ai(string, hzk2);
            return;
        }
    }
}

