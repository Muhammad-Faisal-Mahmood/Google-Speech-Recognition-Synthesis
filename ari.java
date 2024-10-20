/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.io.IOException;

final class ari
implements aro {
    public final long a;
    public final long b;
    public final ars c;
    public long d;
    private final arn e;
    private int f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    public ari(ars ars2, long l2, long l3, long l4, long l5, boolean bl2) {
        boolean bl3 = l2 >= 0L && l3 > l2;
        abr.d(bl3);
        this.c = ars2;
        this.a = l2;
        this.b = l3;
        if (l4 != l3 - l2 && !bl2) {
            this.f = 0;
        } else {
            this.d = l5;
            this.f = 4;
        }
        this.e = new arn();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final long a(app var1_1) {
        block26: {
            block25: {
                block24: {
                    var2_2 = this.f;
                    if (var2_2 == 0) break block24;
                    if (var2_2 != 1) {
                        if (var2_2 != 2) {
                            if (var2_2 != 3) {
                                return -1L;
                            }
                        } else {
                            var6_3 = this.i;
                            var4_5 = this.j;
                            if (var6_3 == var4_5) {
                                while (true) {
                                    var4_5 = -1L;
                                    break;
                                }
                            } else {
                                var16_7 = (apl)var1_1;
                                var6_3 = var16_7.c;
                                if (!this.e.d(var1_1, var4_5)) {
                                    var4_5 = this.i;
                                    if (var4_5 == var6_3) {
                                        throw new IOException("No ogg page can be found.");
                                    }
                                } else {
                                    this.e.b(var1_1, false);
                                    var1_1.i();
                                    var8_11 = this.h;
                                    var17_9 = this.e;
                                    var4_5 = var17_9.b;
                                    var3_10 = var17_9.d + var17_9.e;
                                    if ((var2_2 = (int)((cfr_temp_0 = (var8_11 -= var4_5) - 0L) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) >= 0 && var8_11 < 72000L) ** continue;
                                    if (var2_2 < 0) {
                                        this.j = var6_3;
                                        this.l = var4_5;
                                    } else {
                                        var6_3 = var3_10;
                                        this.i = var16_7.c + var6_3;
                                        this.k = var4_5;
                                    }
                                    var10_12 = this.j;
                                    var6_3 = this.i;
                                    var12_13 = var10_12 - var6_3;
                                    if (var12_13 < 100000L) {
                                        this.j = var6_3;
                                        var4_5 = var6_3;
                                    } else {
                                        var14_14 = var3_10;
                                        var4_5 = var2_2 <= 0 ? 2L : 1L;
                                        var4_5 = agf.h(var16_7.c - var14_14 * var4_5 + var8_11 * var12_13 / (this.l - this.k), var6_3, var10_12 - 1L);
                                    }
                                }
                            }
                            if (var4_5 != -1L) {
                                return var4_5;
                            }
                            this.f = 3;
                        }
                        while (true) {
                            this.e.c(var1_1);
                            this.e.b(var1_1, false);
                            var16_7 = this.e;
                            if (var16_7.b > this.h) {
                                var1_1.i();
                                this.f = 4;
                                return -(this.k + 2L);
                            }
                            var1_1.j(var16_7.d + var16_7.e);
                            this.i = ((apl)var1_1).c;
                            this.k = this.e.b;
                        }
                    }
                    break block25;
                }
                this.g = var6_4 = ((apl)var1_1).c;
                this.f = 1;
                var4_6 = this.b - 65307L;
                if (var4_6 > var6_4) break block26;
            }
            this.e.a();
            if (this.e.c(var1_1)) {
                this.e.b(var1_1, false);
                var16_8 = this.e;
                var1_1.j(var16_8.d + var16_8.e);
                var4_6 = this.e.b;
                while (true) {
                    var16_8 = this.e;
                    if ((var16_8.a & 4) == 4 || !var16_8.c(var1_1) || ((apl)var1_1).c >= this.b || !this.e.b(var1_1, true)) break;
                    var16_8 = this.e;
                    if (!wc.r(var1_1, var16_8.d + var16_8.e)) break;
                    var4_6 = this.e.b;
                }
                this.d = var4_6;
                this.f = 4;
                return this.g;
            }
            throw new EOFException();
        }
        return var4_6;
    }

    @Override
    public final void c(long l2) {
        this.h = agf.h(l2, 0L, this.d - 1L);
        this.f = 2;
        this.i = this.a;
        this.j = this.b;
        this.k = 0L;
        this.l = this.d;
    }
}

