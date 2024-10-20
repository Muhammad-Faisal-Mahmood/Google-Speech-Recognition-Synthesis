/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

public final class apl
implements app {
    public final byte[] a;
    public final long b;
    public long c;
    public byte[] d;
    public int e;
    public int f;
    private final adn g;

    static {
        aeg.b("media3.extractor");
    }

    public apl(adn adn2, long l2, long l3) {
        this.g = adn2;
        this.c = l2;
        this.b = l3;
        this.d = new byte[65536];
        this.a = new byte[4096];
    }

    private final void m(int n2) {
        int n3;
        this.f = n3 = this.f - n2;
        this.e = 0;
        byte[] byArray = this.d;
        byte[] byArray2 = n3 < byArray.length - 524288 ? new byte[65536 + n3] : byArray;
        System.arraycopy(byArray, n2, byArray2, 0, n3);
        this.d = byArray2;
    }

    @Override
    public final int a(byte[] byArray, int n2, int n3) {
        int n4;
        int n5 = n4 = this.b(byArray, n2, n3);
        if (n4 == 0) {
            n5 = this.c(byArray, n2, n3, 0, true);
        }
        this.g(n5);
        return n5;
    }

    public final int b(byte[] byArray, int n2, int n3) {
        int n4 = this.f;
        if (n4 == 0) {
            return 0;
        }
        n3 = Math.min(n4, n3);
        System.arraycopy(this.d, 0, byArray, n2, n3);
        this.m(n3);
        return n3;
    }

    public final int c(byte[] byArray, int n2, int n3, int n4, boolean bl2) {
        if (!Thread.interrupted()) {
            if ((n2 = this.g.a(byArray, n2 + n4, n3 - n4)) == -1) {
                if (n4 == 0 && bl2) {
                    return -1;
                }
                throw new EOFException();
            }
            return n4 + n2;
        }
        throw new InterruptedIOException();
    }

    public final int d(int n2) {
        n2 = Math.min(this.f, n2);
        this.m(n2);
        return n2;
    }

    @Override
    public final long e() {
        return this.c + (long)this.e;
    }

    @Override
    public final void f(int n2) {
        this.k(n2, false);
    }

    public final void g(int n2) {
        if (n2 != -1) {
            this.c += (long)n2;
        }
    }

    @Override
    public final void h(byte[] byArray, int n2, int n3) {
        this.l(byArray, n2, n3, false);
    }

    @Override
    public final void i() {
        this.e = 0;
    }

    @Override
    public final void j(int n2) {
        int n3 = this.d(n2);
        while (n3 < n2 && n3 != -1) {
            n3 = this.c(this.a, -n3, Math.min(n2, n3 + 4096), n3, false);
        }
        this.g(n3);
    }

    public final boolean k(int n2, boolean bl2) {
        int n3 = this.e + n2;
        int n4 = this.d.length;
        if (n3 > n4) {
            n3 = agf.c(n4 + n4, 65536 + n3, n3 + 524288);
            this.d = Arrays.copyOf(this.d, n3);
        }
        n3 = this.f - this.e;
        while (n3 < n2) {
            if ((n3 = this.c(this.d, this.e, n2, n3, bl2)) == -1) {
                return false;
            }
            this.f = this.e + n3;
        }
        this.e += n2;
        return true;
    }

    @Override
    public final boolean l(byte[] byArray, int n2, int n3, boolean bl2) {
        if (!this.k(n3, bl2)) {
            return false;
        }
        System.arraycopy(this.d, this.e - n3, byArray, n2, n3);
        return true;
    }
}

