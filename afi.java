/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class afi {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final short[] i;
    public short[] j;
    public int k;
    public short[] l;
    public int m;
    public short[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;

    public afi(int n2, int n3, float f2, float f3, int n4) {
        this.a = n2;
        this.b = n3;
        this.c = f2;
        this.d = f3;
        this.e = (float)n2 / (float)n4;
        this.f = n2 / 400;
        this.g = n2 /= 65;
        n2 += n2;
        this.h = n2;
        this.i = new short[n2];
        this.j = new short[n2 *= n3];
        this.l = new short[n2];
        this.n = new short[n2];
    }

    public static void d(int n2, int n3, short[] sArray, int n4, short[] sArray2, int n5, short[] sArray3, int n6) {
        for (int i2 = 0; i2 < n3; ++i2) {
            int n7 = n5 * n3 + i2;
            int n8 = n6 * n3 + i2;
            int n9 = n4 * n3 + i2;
            for (int i3 = 0; i3 < n2; ++i3) {
                sArray[n9] = (short)((sArray2[n7] * (n2 - i3) + sArray3[n8] * i3) / n2);
                n9 += n3;
                n7 += n3;
                n8 += n3;
            }
        }
    }

    public final int a(short[] sArray, int n2, int n3, int n4) {
        int n5 = 1;
        int n6 = 255;
        int n7 = 0;
        int n8 = 0;
        while (n3 <= n4) {
            int n9;
            int n10;
            int n11 = 0;
            for (n10 = 0; n10 < n3; ++n10) {
                n9 = this.b * n2;
                n11 += Math.abs(sArray[n9 + n10] - sArray[n9 + n3 + n10]);
            }
            n10 = n11 * n7;
            n9 = n5 * n3;
            if (n10 < n9) {
                n5 = n11;
            }
            if (n10 < n9) {
                n7 = n3;
            }
            if ((n9 = n11 * n6) > (n10 = n8 * n3)) {
                n8 = n11;
            }
            if (n9 > n10) {
                n6 = n3;
            }
            ++n3;
        }
        this.u = n5 / n7;
        this.v = n8 / n6;
        return n7;
    }

    public final void b(short[] sArray, int n2, int n3) {
        short[] sArray2 = this.e(this.l, this.m, n3);
        this.l = sArray2;
        int n4 = this.m;
        int n5 = this.b;
        System.arraycopy(sArray, n2 * n5, sArray2, n4 * n5, n3 * n5);
        this.m += n3;
    }

    public final void c(short[] sArray, int n2, int n3) {
        for (int i2 = 0; i2 < this.h / n3; ++i2) {
            int n4;
            int n5;
            int n6;
            int n7 = 0;
            for (n6 = 0; n6 < (n5 = (n4 = this.b) * n3); ++n6) {
                n7 += sArray[n4 * n2 + n5 * i2 + n6];
            }
            n6 = n7 / n5;
            this.i[i2] = (short)n6;
        }
    }

    public final short[] e(short[] sArray, int n2, int n3) {
        int n4 = sArray.length;
        int n5 = this.b;
        if (n2 + n3 <= (n4 /= n5)) {
            return sArray;
        }
        return Arrays.copyOf(sArray, (n4 * 3 / 2 + n3) * n5);
    }
}

