/*
 * Decompiled with CFR 0.152.
 */
final class aru
implements arv {
    private static final int[] a = new int[]{-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] b = new int[]{7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, Short.MAX_VALUE};
    private final apq c;
    private final aqe d;
    private final ary e;
    private final int f;
    private final byte[] g;
    private final aga h;
    private final int i;
    private final adu j;
    private int k;
    private long l;
    private int m;
    private long n;

    public aru(apq object, aqe aqe2, ary ary2) {
        int n2;
        int n3;
        this.c = object;
        this.d = aqe2;
        this.e = ary2;
        this.i = n3 = Math.max(1, ary2.c / 10);
        object = new aga(ary2.f);
        ((aga)object).f();
        this.f = n2 = ((aga)object).f();
        int n4 = ary2.b;
        int n5 = (ary2.d - n4 * 4) * 8 / (ary2.e * n4) + 1;
        if (n2 == n5) {
            n5 = agf.b(n3, n2);
            this.g = new byte[ary2.d * n5];
            this.h = new aga(n5 * ((n2 + n2) * n4));
            n2 = ary2.c * ary2.d * 8 / n2;
            object = new adt();
            ((adt)object).a("audio/raw");
            ((adt)object).h = n2;
            ((adt)object).i = n2;
            ((adt)object).n = (n3 + n3) * n4;
            ((adt)object).B = ary2.b;
            ((adt)object).C = ary2.c;
            ((adt)object).D = 2;
            this.j = new adu((adt)object);
            return;
        }
        throw new aem(a.an(n2, n5, "Expected frames per block: ", "; got: "), null, true, 1);
    }

    private final int d(int n2) {
        int n3 = this.e.b;
        return n2 / (n3 + n3);
    }

    private final int e(int n2) {
        return (n2 + n2) * this.e.b;
    }

    private final void f(int n2) {
        long l2 = this.e.c;
        long l3 = this.l;
        l2 = agf.j(this.n, 1000000L, l2);
        int n3 = this.e(n2);
        int n4 = this.m;
        this.d.m(l3 + l2, 1, n3, n4 - n3, null);
        this.n += (long)n2;
        this.m -= n3;
    }

    @Override
    public final void a(int n2, long l2) {
        arz arz2 = new arz(this.e, this.f, n2, l2);
        this.c.v(arz2);
        this.d.h(this.j);
    }

    @Override
    public final void b(long l2) {
        this.k = 0;
        this.l = l2;
        this.m = 0;
        this.n = 0L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final boolean c(app var1_1, long var2_2) {
        var4_3 = this.d(this.m);
        var4_3 = agf.b(this.i - var4_3, this.f) * this.e.d;
        if (var2_2 == 0L) {
            while (true) {
                var17_4 = true;
                break;
            }
        } else {
            var17_4 = false;
        }
        while (!var17_4 && (var5_5 = this.k) < var4_3) {
            var5_5 = (int)Math.min((long)(var4_3 - var5_5), var2_2);
            if ((var5_5 = var1_1.a(this.g, this.k, var5_5)) == -1) ** continue;
            this.k += var5_5;
        }
        var14_6 = this.k / this.e.d;
        if (var14_6 > 0) {
            var1_1 = this.g;
            var18_7 = this.h;
            block2: for (var4_3 = 0; var4_3 < var14_6; ++var4_3) {
                var5_5 = 0;
                while (true) {
                    var20_19 = this.e;
                    var15_16 = var20_19.b;
                    if (var5_5 >= var15_16) continue block2;
                    var19_18 = var18_7.a;
                    var7_9 = var20_19.d;
                    var6_8 = var7_9 / var15_16 - 4;
                    var16_17 = var4_3 * var7_9 + var5_5 * 4;
                    var9_11 /* !! */  = var1_1[var16_17 + 1];
                    var10_12 = var1_1[var16_17];
                    var7_9 = Math.min(var1_1[var16_17 + 2] & 255, 88);
                    var11_13 = aru.b[var7_9];
                    var8_10 = this.f * var4_3 * var15_16 + var5_5;
                    var9_11 /* !! */  = (short)((var9_11 /* !! */  & 255) << 8 | var10_12 & 255);
                    var10_12 = (reference)(var8_10 + var8_10);
                    var19_18[var10_12] = (byte)(var9_11 /* !! */  & 255);
                    var19_18[var10_12 + true] = (byte)(var9_11 /* !! */  >> 8);
                    for (var8_10 = 0; var8_10 < var6_8 + var6_8; ++var8_10) {
                        var12_14 = var1_1[var15_16 * 4 + var16_17 + var8_10 / 8 * var15_16 * 4 + var8_10 / 2 % 4];
                        var12_14 = var8_10 % 2 == 0 ? (Object)(var12_14 & 15) : (Object)((var12_14 & 255) >> 4);
                        var13_15 = var12_14 & 7;
                        var11_13 = var13_15 = (var13_15 + var13_15 + 1) * var11_13 >> 3;
                        if ((var12_14 & 8) != 0) {
                            var11_13 = -var13_15;
                        }
                        var9_11 /* !! */  = agf.c((int)(var9_11 /* !! */  + var11_13), -32768, 32767);
                        var19_18[var10_12 += var15_16 + var15_16] = (byte)(var9_11 /* !! */  & 255);
                        var19_18[var10_12 + true] = (byte)(var9_11 /* !! */  >> 8);
                        var7_9 = agf.c(var7_9 + aru.a[var12_14], 0, 88);
                        var11_13 = aru.b[var7_9];
                    }
                    ++var5_5;
                }
            }
            var4_3 = this.e(this.f * var14_6);
            var18_7.v(0);
            var18_7.u(var4_3);
            this.k -= var14_6 * this.e.d;
            var18_7 = this.h;
            var1_1 = this.d;
            var4_3 = var18_7.c;
            var1_1.l(var18_7, var4_3);
            this.m = var4_3 = this.m + var4_3;
            var4_3 = this.d(var4_3);
            var5_5 = this.i;
            if (var4_3 >= var5_5) {
                this.f(var5_5);
            }
        }
        if (var17_4 && (var4_3 = this.d(this.m)) > 0) {
            this.f(var4_3);
        }
        return var17_4;
    }
}

