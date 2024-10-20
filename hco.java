/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class hco
extends hcn {
    transient long[] g;
    private transient int h;
    private transient int i;

    public hco() {
        super(3, null);
    }

    public hco(hcn hcn2) {
        ((hcn)this).n(hcn2.c);
        int n2 = hcn2.a();
        while (n2 != -1) {
            this.o(hcn2.h(n2), hcn2.c(n2));
            n2 = hcn2.e(n2);
        }
    }

    private final int q(int n2) {
        return (int)(this.g[n2] >>> 32);
    }

    private final int r(int n2) {
        return (int)this.g[n2];
    }

    private final void s(int n2, int n3) {
        long[] lArray;
        if (n2 == -2) {
            this.h = n3;
            n2 = -2;
        } else {
            lArray = this.g;
            lArray[n2] = lArray[n2] & 0xFFFFFFFF00000000L | (long)n3 & 0xFFFFFFFFL;
        }
        if (n3 == -2) {
            this.i = n2;
            return;
        }
        lArray = this.g;
        lArray[n3] = 0xFFFFFFFFL & lArray[n3] | (long)n2 << 32;
    }

    @Override
    public final int a() {
        int n2;
        int n3 = n2 = this.h;
        if (n2 == -2) {
            n3 = -1;
        }
        return n3;
    }

    @Override
    public final int e(int n2) {
        int n3;
        n2 = n3 = this.r(n2);
        if (n3 == -2) {
            n2 = -1;
        }
        return n2;
    }

    @Override
    public final void j(int n2, Object object, int n3, int n4) {
        super.j(n2, object, n3, n4);
        this.s(this.i, n2);
        this.s(n2, -2);
    }

    @Override
    public final void k(int n2) {
        int n3 = this.c - 1;
        this.s(this.q(n2), this.r(n2));
        if (n2 < n3) {
            this.s(this.q(n3), n2);
            this.s(n2, this.r(n3));
        }
        super.k(n2);
    }

    @Override
    public final void l(int n2) {
        super.l(n2);
        long[] lArray = this.g;
        int n3 = lArray.length;
        this.g = lArray = Arrays.copyOf(lArray, n2);
        Arrays.fill(lArray, n3, n2, -1L);
    }

    @Override
    public final void n(int n2) {
        super.n(n2);
        this.h = -2;
        this.i = -2;
        long[] lArray = new long[n2];
        this.g = lArray;
        Arrays.fill(lArray, -1L);
    }
}

