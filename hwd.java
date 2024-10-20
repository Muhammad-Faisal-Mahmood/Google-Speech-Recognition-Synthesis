/*
 * Decompiled with CFR 0.152.
 */
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class hwd
extends hvn {
    private static final Logger a = Logger.getLogger(hwd.class.getName());
    public static final boolean e = hzj.a;
    public dlm f;

    public static int G(int n2, hvu hvu2) {
        return hwd.Z(n2) + hwd.H(hvu2);
    }

    public static int H(hvu hvu2) {
        return hwd.P(hvu2.d());
    }

    public static int I(int n2, int n3) {
        return hwd.Z(n2) + hwd.L(n3);
    }

    @Deprecated
    static int J(int n2, hyf hyf2, hyu hyu2) {
        n2 = hwd.Z(n2);
        return n2 + n2 + ((hvd)hyf2).d(hyu2);
    }

    public static int K(int n2, int n3) {
        return hwd.Z(n2) + hwd.L(n3);
    }

    public static int L(int n2) {
        return hwd.ad(n2);
    }

    public static int M(int n2, long l2) {
        return hwd.Z(n2) + hwd.ad(l2);
    }

    public static int N(int n2, hxt hxt2) {
        return hwd.Z(n2) + hwd.O(hxt2);
    }

    public static int O(hxt hxt2) {
        int n2 = hxt2.b != null ? hxt2.b.d() : (hxt2.a != null ? hxt2.a.k() : 0);
        return hwd.P(n2);
    }

    static int P(int n2) {
        return hwd.ab(n2) + n2;
    }

    public static int Q(hyf hyf2) {
        return hwd.P(hyf2.k());
    }

    static int R(hyf hyf2, hyu hyu2) {
        return hwd.P(((hvd)hyf2).d(hyu2));
    }

    public static int S(int n2) {
        if (n2 > 4096) {
            return 4096;
        }
        return n2;
    }

    public static int T(int n2, int n3) {
        return hwd.Z(n2) + hwd.U(n3);
    }

    public static int U(int n2) {
        return hwd.ab(hwd.ae(n2));
    }

    public static int V(int n2, long l2) {
        return hwd.Z(n2) + hwd.W(l2);
    }

    public static int W(long l2) {
        return hwd.ad(hwd.af(l2));
    }

    public static int X(int n2, String string) {
        return hwd.Z(n2) + hwd.Y(string);
    }

    public static int Y(String string) {
        int n2;
        try {
            n2 = hzl.b(string);
        }
        catch (hzk hzk2) {
            n2 = string.getBytes(hxl.a).length;
        }
        return hwd.P(n2);
    }

    public static int Z(int n2) {
        return hwd.ab(hzo.c(n2, 0));
    }

    public static int aa(int n2, int n3) {
        return hwd.Z(n2) + hwd.ab(n3);
    }

    public static int ab(int n2) {
        return 352 - Integer.numberOfLeadingZeros(n2) * 9 >>> 6;
    }

    public static int ac(int n2, long l2) {
        return hwd.Z(n2) + hwd.ad(l2);
    }

    public static int ad(long l2) {
        return 640 - Long.numberOfLeadingZeros(l2) * 9 >>> 6;
    }

    public static int ae(int n2) {
        return n2 >> 31 ^ n2 + n2;
    }

    public static long af(long l2) {
        return l2 >> 63 ^ l2 + l2;
    }

    public static hwd ag(byte[] byArray) {
        return new hwb(byArray, 0, byArray.length);
    }

    public static int as(int n2) {
        return hwd.Z(n2) + 1;
    }

    public static int at(int n2) {
        return hwd.Z(n2) + 8;
    }

    public static int au(int n2) {
        return hwd.Z(n2) + 4;
    }

    public static int av(int n2) {
        return hwd.Z(n2) + 8;
    }

    public static int aw(int n2) {
        return hwd.Z(n2) + 4;
    }

    public static int ax(int n2) {
        return hwd.Z(n2) + 4;
    }

    public static int ay(int n2) {
        return hwd.Z(n2) + 8;
    }

    public abstract void A(int var1, int var2);

    public abstract void B(int var1, int var2);

    public abstract void C(int var1);

    public abstract void D(int var1, long var2);

    public abstract void E(long var1);

    public abstract void F(byte[] var1, int var2);

    @Override
    public abstract void a(byte[] var1, int var2, int var3);

    public final void ah() {
        if (this.b() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    final void ai(String object, hzk hzk2) {
        a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", hzk2);
        object = ((String)object).getBytes(hxl.a);
        try {
            int n2 = ((Object)object).length;
            this.C(n2);
            this.a((byte[])object, 0, n2);
            return;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new hwc(indexOutOfBoundsException);
        }
    }

    public final void aj(int n2, double d2) {
        this.q(n2, Double.doubleToRawLongBits(d2));
    }

    public final void ak(double d2) {
        this.r(Double.doubleToRawLongBits(d2));
    }

    public final void al(int n2, float f2) {
        this.o(n2, Float.floatToRawIntBits(f2));
    }

    public final void am(float f2) {
        this.p(Float.floatToRawIntBits(f2));
    }

    @Deprecated
    public final void an(hyf hyf2) {
        hyf2.aZ(this);
    }

    public final void ao(int n2, int n3) {
        this.B(n2, hwd.ae(n3));
    }

    public final void ap(int n2) {
        this.C(hwd.ae(n2));
    }

    public final void aq(int n2, long l2) {
        this.D(n2, hwd.af(l2));
    }

    public final void ar(long l2) {
        this.E(hwd.af(l2));
    }

    public abstract int b();

    public abstract void i();

    public abstract void j(byte var1);

    public abstract void l(int var1, boolean var2);

    public abstract void m(int var1, hvu var2);

    public abstract void n(hvu var1);

    public abstract void o(int var1, int var2);

    public abstract void p(int var1);

    public abstract void q(int var1, long var2);

    public abstract void r(long var1);

    public abstract void s(int var1, int var2);

    public abstract void t(int var1);

    public abstract void u(int var1, hyf var2, hyu var3);

    public abstract void v(hyf var1);

    public abstract void w(int var1, hyf var2);

    public abstract void x(int var1, hvu var2);

    public abstract void y(int var1, String var2);

    public abstract void z(String var1);
}

