/*
 * Decompiled with CFR 0.152.
 */
final class aow
extends aov {
    public final boolean e;
    public final aop f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final int q;
    private final int r;

    /*
     * Unable to fully structure code
     */
    public aow(int var1_1, aex var2_2, int var3_3, aop var4_4, int var5_5, boolean var6_6) {
        block23: {
            block24: {
                block22: {
                    var9_7 = 0;
                    super(0, (aex)var2_2, var3_3);
                    this.f = var4_4;
                    var8_8 = true != var4_4.m ? 16 : 24;
                    if (var6_6) {
                        var2_2 = this.d;
                        var1_1 = var2_2.v;
                        var1_1 = var2_2.w;
                        var7_9 = var2_2.x;
                        var1_1 = var2_2.j;
                        var10_10 = true;
                    } else {
                        var10_10 = false;
                    }
                    this.e = var10_10;
                    if (!var6_6) ** GOTO lbl-1000
                    var2_2 = this.d;
                    var1_1 = var2_2.v;
                    var1_1 = var2_2.w;
                    var7_9 = var2_2.x;
                    var1_1 = var2_2.j;
                    if (var1_1 == -1 || var1_1 >= 0) {
                        var6_6 = true;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var6_6 = false;
                    }
                    this.g = var6_6;
                    this.h = vy.l(var5_5, false);
                    var2_2 = this.d;
                    var7_9 = var2_2.x;
                    this.i = false;
                    this.j = var2_2.j;
                    this.k = var2_2.a();
                    var1_1 = this.d.f;
                    this.m = aox.b(0, 0);
                    var1_1 = this.d.f;
                    this.n = true;
                    var1_1 = 0;
                    while (true) {
                        var11_11 = var4_4.d;
                        if (var1_1 >= ((hct)var11_11).c) break;
                        var2_2 = this.d.o;
                        if (var2_2 == null || !var2_2.equals(var11_11.get(var1_1))) {
                            ++var1_1;
                            continue;
                        }
                        break block22;
                        break;
                    }
                    var1_1 = 0x7FFFFFFF;
                }
                this.l = var1_1;
                var6_6 = vy.i(var5_5) == 128;
                this.o = var6_6;
                var6_6 = vy.k(var5_5) == 64;
                this.p = var6_6;
                var2_2 = this.d;
                var4_4 = var2_2.o;
                if (var4_4 == null) {
                    while (true) {
                        var3_3 = 0;
                        break block23;
                        break;
                    }
                }
                var1_1 = var4_4.hashCode();
                var3_3 = 4;
                switch (var1_1) {
                    default: {
                        break;
                    }
                    case 1599127257: {
                        if (!var4_4.equals("video/x-vnd.on2.vp9")) break;
                        var1_1 = 3;
                        break block24;
                    }
                    case 1331836730: {
                        if (!var4_4.equals("video/avc")) break;
                        var1_1 = 4;
                        break block24;
                    }
                    case -1662541442: {
                        if (!var4_4.equals("video/hevc")) break;
                        var1_1 = 2;
                        break block24;
                    }
                    case -1662735862: {
                        if (!var4_4.equals("video/av01")) break;
                        var1_1 = 1;
                        break block24;
                    }
                    case -1851077871: {
                        if (!var4_4.equals("video/dolby-vision")) break;
                        var1_1 = 0;
                        break block24;
                    }
                }
                var1_1 = -1;
            }
            if (var1_1 != 0) {
                if (var1_1 != 1) {
                    if (var1_1 != 2) {
                        if (var1_1 != 3) {
                            if (var1_1 != 4) ** continue;
                            var3_3 = 1;
                        } else {
                            var3_3 = 2;
                        }
                    } else {
                        var3_3 = 3;
                    }
                }
            } else {
                var3_3 = 5;
            }
        }
        this.q = var3_3;
        var1_1 = var2_2.f;
        var4_4 = this.f;
        var1_1 = vy.l(var5_5, var4_4.q) == false ? var9_7 : ((var6_6 = this.e) == false && var4_4.l == false ? var9_7 : (vy.l(var5_5, false) != false && this.g != false && var6_6 != false && var2_2.j != -1 && (var5_5 & var8_8) != 0 ? 2 : 1));
        this.r = var1_1;
    }

    @Override
    public final int b() {
        return this.r;
    }
}

