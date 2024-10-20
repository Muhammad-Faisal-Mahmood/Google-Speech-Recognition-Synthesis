/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;

public final class arl
implements apo {
    private apq a;
    private ars b;
    private boolean c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean g(app app2) {
        Object object = new arn();
        if (!((arn)object).b(app2, true)) return false;
        if ((((arn)object).a & 2) != 2) {
            return false;
        }
        int n2 = Math.min(((arn)object).e, 8);
        object = new aga(n2);
        app2.h(((aga)object).a, 0, n2);
        arl.h((aga)object);
        if (((aga)object).a() >= 5 && ((aga)object).h() == 127 && ((aga)object).o() == 1179402563L) {
            this.b = new ark();
            return true;
        }
        arl.h((aga)object);
        try {
            boolean bl2 = wd.s(1, (aga)object, true);
            if (bl2) {
                this.b = new art();
                return true;
            }
        }
        catch (aem aem2) {}
        arl.h((aga)object);
        if (!arp.d((aga)object, arp.a)) return false;
        this.b = new arp();
        return true;
    }

    private static void h(aga aga2) {
        aga2.v(0);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final int a(app var1_1, apy var2_2) {
        block17: {
            block18: {
                block19: {
                    block21: {
                        block20: {
                            abr.j(this.a);
                            var12_3 = this.b;
                            var3_4 = 1;
                            if (var12_3 == null) {
                                if (this.g((app)var1_1)) {
                                    var1_1.i();
                                } else {
                                    throw new aem("Failed to determine bitstream type", null, true, 1);
                                }
                            }
                            if (!this.c) {
                                var12_3 = this.a.y(0);
                                this.a.q();
                                var13_5 = this.b;
                                var13_5.d = this.a;
                                var13_5.c = var12_3;
                                var13_5.b(true);
                                this.c = true;
                            }
                            var12_3 = this.b;
                            abr.j(var12_3.c);
                            var4_6 = agf.a;
                            var4_6 = var12_3.i;
                            if (var4_6 == 0) break block18;
                            if (var4_6 == 1) break block19;
                            if (var4_6 != 2) lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    var3_4 = -1;
                                    break block17;
                                    break;
                                }
                            }
                            var6_7 = var12_3.e.a((app)var1_1);
                            if (var6_7 < 0L) break block20;
                            var2_2.a = var6_7;
                            break block17;
                        }
                        if (var6_7 < -1L) {
                            var12_3.g(-(var6_7 + 2L));
                        }
                        if (!var12_3.m) {
                            var2_2 = var12_3.e.b();
                            abr.j(var2_2);
                            var12_3.d.v((aqb)var2_2);
                            var12_3.m = true;
                        }
                        if (var12_3.l > 0L || var12_3.b.a((app)var1_1)) break block21;
                        var12_3.i = 3;
                        ** GOTO lbl-1000
                    }
                    var12_3.l = 0L;
                    var1_1 = var12_3.b.b;
                    var6_7 = var12_3.a((aga)var1_1);
                    if (var6_7 >= 0L && (var8_9 = var12_3.h) + var6_7 >= var12_3.f) {
                        var8_9 = var12_3.e(var8_9);
                        var12_3.c.l((aga)var1_1, var1_1.c);
                        var12_3.c.m(var8_9, 1, var1_1.c, 0, null);
                        var12_3.f = -1L;
                    }
                    var12_3.h += var6_7;
lbl52:
                    // 3 sources

                    while (true) {
                        var3_4 = 0;
                        break block17;
                        break;
                    }
                }
                var1_1.j((int)var12_3.g);
                var12_3.i = 2;
                return 0;
            }
            while (true) {
                if (!var12_3.b.a((app)var1_1)) {
                    var12_3.i = 3;
                    ** continue;
                }
                var2_2 = (apl)var1_1;
                var8_10 = var2_2.c;
                var6_8 = var12_3.g;
                var12_3.l = var8_10 - var6_8;
                if (!var12_3.c(var12_3.b.b, var6_8, var12_3.k)) break;
                var12_3.g = var2_2.c;
            }
            var1_1 = var12_3.k.a;
            var12_3.j = var1_1.E;
            if (!var12_3.n) {
                var12_3.c.h((adu)var1_1);
                var12_3.n = true;
            }
            if ((var1_1 = var12_3.k.b) != null) {
                var12_3.e = var1_1;
            } else {
                var8_10 = var2_2.b;
                if (var8_10 == -1L) {
                    var12_3.e = new arr();
                } else {
                    var1_1 = var12_3.b.a;
                    var5_11 = (var1_1.a & 4) != 0;
                    var10_12 = var12_3.g;
                    var4_6 = var1_1.d;
                    var3_4 = var1_1.e;
                    var6_8 = var1_1.b;
                    var12_3.e = new ari((ars)var12_3, var10_12, var8_10, var4_6 + var3_4, var6_8, var5_11);
                }
            }
            var12_3.i = 2;
            var2_2 = var12_3.b;
            var12_3 = var2_2.b;
            var1_1 = var12_3.a;
            if (((Object)var1_1).length == 65025) ** GOTO lbl52
            var12_3.t(Arrays.copyOf((byte[])var1_1, Math.max(65025, var12_3.c)), var2_2.b.c);
            ** while (true)
        }
        return var3_4;
    }

    @Override
    public final /* synthetic */ List b() {
        int n2 = gzx.d;
        return hct.a;
    }

    @Override
    public final void c(apq apq2) {
        this.a = apq2;
    }

    @Override
    public final void d(long l2, long l3) {
        ars ars2 = this.b;
        if (ars2 != null) {
            Object object = ars2.b;
            ((arm)object).a.a();
            ((arm)object).b.s(0);
            ((arm)object).c = -1;
            ((arm)object).d = false;
            if (l2 == 0L) {
                ars2.b(ars2.m ^ true);
                return;
            }
            if (ars2.i != 0) {
                ars2.f = ars2.f(l3);
                object = ars2.e;
                int n2 = agf.a;
                object.c(ars2.f);
                ars2.i = 2;
            }
        }
    }

    @Override
    public final boolean e(app app2) {
        try {
            boolean bl2 = this.g(app2);
            return bl2;
        }
        catch (aem aem2) {
            return false;
        }
    }

    @Override
    public final /* synthetic */ void f() {
    }
}

