/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class aga {
    public byte[] a;
    public int b;
    public int c;

    static {
        hav.j(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    }

    public aga() {
        this.a = agf.f;
    }

    public aga(int n2) {
        this.a = new byte[n2];
        this.c = n2;
    }

    public aga(byte[] byArray) {
        this.a = byArray;
        this.c = byArray.length;
    }

    public aga(byte[] byArray, int n2) {
        this.a = byArray;
        this.c = n2;
    }

    public final int a() {
        return this.c - this.b;
    }

    public final int b() {
        return this.a.length;
    }

    public final int c() {
        int n2;
        int n3;
        int n4;
        byte[] byArray = this.a;
        int n5 = this.b;
        this.b = n4 = n5 + 1;
        byte by2 = byArray[n5];
        this.b = n3 = n5 + 2;
        n4 = byArray[n4];
        this.b = n2 = n5 + 3;
        n3 = byArray[n3];
        this.b = n5 + 4;
        return byArray[n2] & 0xFF | ((by2 & 0xFF) << 24 | (n4 & 0xFF) << 16 | (n3 & 0xFF) << 8);
    }

    public final int d() {
        int n2;
        int n3;
        int n4;
        byte[] byArray = this.a;
        int n5 = this.b;
        this.b = n4 = n5 + 1;
        byte by2 = byArray[n5];
        this.b = n3 = n5 + 2;
        n4 = byArray[n4];
        this.b = n2 = n5 + 3;
        n3 = byArray[n3];
        this.b = n5 + 4;
        return (byArray[n2] & 0xFF) << 24 | ((n4 & 0xFF) << 8 | by2 & 0xFF | (n3 & 0xFF) << 16);
    }

    public final int e() {
        int n2 = this.d();
        if (n2 >= 0) {
            return n2;
        }
        throw new IllegalStateException(a.af(n2, "Top bit not zero: "));
    }

    public final int f() {
        int n2;
        byte[] byArray = this.a;
        int n3 = this.b;
        this.b = n2 = n3 + 1;
        byte by2 = byArray[n3];
        this.b = n3 + 2;
        return (byArray[n2] & 0xFF) << 8 | by2 & 0xFF;
    }

    public final int g() {
        return this.h() << 21 | this.h() << 14 | this.h() << 7 | this.h();
    }

    public final int h() {
        byte[] byArray = this.a;
        int n2 = this.b;
        this.b = n2 + 1;
        return byArray[n2] & 0xFF;
    }

    public final int i() {
        int n2;
        int n3;
        byte[] byArray = this.a;
        int n4 = this.b;
        this.b = n3 = n4 + 1;
        byte by2 = byArray[n4];
        this.b = n2 = n4 + 2;
        n3 = byArray[n3];
        this.b = n4 + 3;
        return byArray[n2] & 0xFF | ((by2 & 0xFF) << 16 | (n3 & 0xFF) << 8);
    }

    public final int j() {
        int n2 = this.c();
        if (n2 >= 0) {
            return n2;
        }
        throw new IllegalStateException(a.af(n2, "Top bit not zero: "));
    }

    public final int k() {
        int n2;
        byte[] byArray = this.a;
        int n3 = this.b;
        this.b = n2 = n3 + 1;
        byte by2 = byArray[n3];
        this.b = n3 + 2;
        return byArray[n2] & 0xFF | (by2 & 0xFF) << 8;
    }

    public final long l() {
        int n2;
        int n3;
        byte[] byArray = this.a;
        int n4 = this.b;
        this.b = n3 = n4 + 1;
        long l2 = byArray[n4];
        this.b = n2 = n4 + 2;
        long l3 = byArray[n3];
        this.b = n3 = n4 + 3;
        long l4 = byArray[n2];
        this.b = n2 = n4 + 4;
        long l5 = byArray[n3];
        this.b = n3 = n4 + 5;
        long l6 = byArray[n2];
        this.b = n2 = n4 + 6;
        long l7 = byArray[n3];
        this.b = n3 = n4 + 7;
        long l8 = byArray[n2];
        this.b = n4 + 8;
        return ((long)byArray[n3] & 0xFFL) << 56 | ((l8 & 0xFFL) << 48 | ((l3 & 0xFFL) << 8 | l2 & 0xFFL | (l4 & 0xFFL) << 16 | (l5 & 0xFFL) << 24 | (l6 & 0xFFL) << 32 | (l7 & 0xFFL) << 40));
    }

    public final long m() {
        int n2;
        int n3;
        byte[] byArray = this.a;
        int n4 = this.b;
        this.b = n3 = n4 + 1;
        long l2 = byArray[n4];
        this.b = n2 = n4 + 2;
        long l3 = byArray[n3];
        this.b = n3 = n4 + 3;
        long l4 = byArray[n2];
        this.b = n4 + 4;
        return ((long)byArray[n3] & 0xFFL) << 24 | (l2 & 0xFFL | (l3 & 0xFFL) << 8 | (l4 & 0xFFL) << 16);
    }

    public final long n() {
        int n2;
        int n3;
        int n4;
        byte[] byArray = this.a;
        int n5 = this.b;
        this.b = n4 = n5 + 1;
        long l2 = byArray[n5];
        this.b = n3 = n5 + 2;
        long l3 = byArray[n4];
        this.b = n4 = n5 + 3;
        long l4 = byArray[n3];
        this.b = n3 = n5 + 4;
        long l5 = byArray[n4];
        this.b = n2 = n5 + 5;
        long l6 = byArray[n3];
        this.b = n4 = n5 + 6;
        long l7 = byArray[n2];
        this.b = n3 = n5 + 7;
        long l8 = byArray[n4];
        this.b = n5 + 8;
        return (long)byArray[n3] & 0xFFL | ((l2 & 0xFFL) << 56 | (l3 & 0xFFL) << 48 | (l4 & 0xFFL) << 40 | (l5 & 0xFFL) << 32 | (l6 & 0xFFL) << 24 | (l7 & 0xFFL) << 16 | (l8 & 0xFFL) << 8);
    }

    public final long o() {
        int n2;
        int n3;
        byte[] byArray = this.a;
        int n4 = this.b;
        this.b = n3 = n4 + 1;
        long l2 = byArray[n4];
        this.b = n2 = n4 + 2;
        long l3 = byArray[n3];
        this.b = n3 = n4 + 3;
        long l4 = byArray[n2];
        this.b = n4 + 4;
        return (long)byArray[n3] & 0xFFL | ((l2 & 0xFFL) << 24 | (l3 & 0xFFL) << 16 | (l4 & 0xFFL) << 8);
    }

    public final String p(int n2) {
        return this.q(n2, StandardCharsets.UTF_8);
    }

    public final String q(int n2, Charset object) {
        byte[] byArray = this.a;
        int n3 = this.b;
        object = new String(byArray, n3, n2, (Charset)object);
        this.b = n3 + n2;
        return object;
    }

    public final void r(byte[] byArray, int n2, int n3) {
        System.arraycopy(this.a, this.b, byArray, n2, n3);
        this.b += n3;
    }

    public final void s(int n2) {
        byte[] byArray = this.b() < n2 ? new byte[n2] : this.a;
        this.t(byArray, n2);
    }

    public final void t(byte[] byArray, int n2) {
        this.a = byArray;
        this.c = n2;
        this.b = 0;
    }

    public final void u(int n2) {
        boolean bl2;
        boolean bl3 = bl2 = false;
        if (n2 >= 0) {
            bl3 = bl2;
            if (n2 <= this.a.length) {
                bl3 = true;
            }
        }
        abr.d(bl3);
        this.c = n2;
    }

    public final void v(int n2) {
        boolean bl2;
        boolean bl3 = bl2 = false;
        if (n2 >= 0) {
            bl3 = bl2;
            if (n2 <= this.c) {
                bl3 = true;
            }
        }
        abr.d(bl3);
        this.b = n2;
    }

    public final void w(int n2) {
        this.v(this.b + n2);
    }
}

