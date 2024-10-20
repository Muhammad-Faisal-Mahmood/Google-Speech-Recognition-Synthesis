/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class qb
implements Comparable {
    public static int a = 1;
    public boolean b;
    public int c = -1;
    int d = -1;
    public int e = 0;
    public float f;
    public boolean g = false;
    final float[] h = new float[9];
    final float[] i = new float[9];
    pw[] j = new pw[16];
    int k = 0;
    public int l = 0;
    boolean m = false;
    int n;

    public qb(int n2) {
        this.n = n2;
    }

    public final void a(pw pw2) {
        int n2;
        int n3;
        for (n3 = 0; n3 < (n2 = this.k); ++n3) {
            if (this.j[n3] != pw2) continue;
            return;
        }
        pw[] pwArray = this.j;
        n3 = pwArray.length;
        if (n2 >= n3) {
            this.j = Arrays.copyOf(pwArray, n3 + n3);
        }
        pwArray = this.j;
        n3 = this.k;
        pwArray[n3] = pw2;
        this.k = n3 + 1;
    }

    public final void b(pw pwArray) {
        int n2 = this.k;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.j[i2] != pwArray) continue;
            while (i2 < n2 - 1) {
                pwArray = this.j;
                int n3 = i2 + 1;
                pwArray[i2] = pwArray[n3];
                i2 = n3;
            }
            --this.k;
            return;
        }
    }

    public final void c() {
        this.n = 5;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = false;
        this.m = false;
        int n2 = this.k;
        for (int i2 = 0; i2 < n2; ++i2) {
            this.j[i2] = null;
        }
        this.k = 0;
        this.l = 0;
        this.b = false;
        Arrays.fill(this.i, 0.0f);
    }

    public final void d(px px2, float f2) {
        this.f = f2;
        this.g = true;
        this.m = false;
        int n2 = this.k;
        this.d = -1;
        for (int i2 = 0; i2 < n2; ++i2) {
            this.j[i2].c(px2, this, false);
        }
        this.k = 0;
    }

    public final void e(px px2, pw pw2) {
        int n2 = this.k;
        for (int i2 = 0; i2 < n2; ++i2) {
            this.j[i2].d(px2, pw2, false);
        }
        this.k = 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}

