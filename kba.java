/*
 * Decompiled with CFR 0.152.
 */
public final class kba {
    public static final kbt a = new kbt("UNDEFINED");
    public static final kbt b = new kbt("REUSABLE_CLAIMED");

    /*
     * Unable to fully structure code
     */
    public static final void a(jqb var0, Object var1_3) {
        block19: {
            block21: {
                block20: {
                    if (!(var0 instanceof kaz)) break block19;
                    var4_5 = (kaz)var0;
                    var0 = jsl.n(var1_3);
                    if (var4_5.a.b(var4_5.d())) {
                        var4_5.c = var0;
                        var4_5.e = 1;
                        var4_5.a.a(var4_5.d(), var4_5);
                        return;
                    }
                    var2_6 = jve.a;
                    var3_7 = jxc.a;
                    var3_7 = jxc.a();
                    if (var3_7.o()) {
                        var4_5.c = var0;
                        var4_5.e = 1;
                        var3_7.m(var4_5);
                        return;
                    }
                    var3_7.n(true);
                    var0 = (jwi)var4_5.d().get(jwi.c);
                    if (var0 == null) ** GOTO lbl25
                    if (var0.s()) break block20;
                    var4_5.bD(jns.aj(var0.p()));
                    ** GOTO lbl37
                }
                var0 = var4_5.b;
                var6_8 = var4_5.d;
                var5_9 = var0.d();
                var6_8 = kbv.b(var5_9, var6_8);
                var0 = var6_8 != kbv.a ? jux.c((jqb)var0, var5_9, var6_8) : null;
                var4_5.b.bD(var1_3);
                if (var0 == null) ** GOTO lbl36
                if (!var0.S()) break block21;
lbl36:
                // 2 sources

                kbv.c(var5_9, var6_8);
            }
            while (var2_6 = var3_7.q()) {
            }
            var3_7.l(true);
            return;
            {
                catch (Throwable var0_1) {
                    try {
                        var4_5.E(var0_1);
                        return;
                    }
                    finally {
                        var3_7.l(true);
                    }
                }
            }
            catch (Throwable var1_4) {
                block22: {
                    if (var0 == null) ** GOTO lbl53
                    if (!var0.S()) break block22;
lbl53:
                    // 2 sources

                    kbv.c(var5_9, var6_8);
                }
                throw var1_4;
            }
        }
        var0.bD(var1_3);
    }
}

