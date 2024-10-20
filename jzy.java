/*
 * Decompiled with CFR 0.152.
 */
final class jzy
implements jyy {
    final jxy a;
    final int b;

    public jzy(jxy jxy2, int n2) {
        this.a = jxy2;
        this.b = n2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final Object bJ(Object var1_1, jqb var2_3) {
        block21: {
            block19: {
                block23: {
                    block25: {
                        block24: {
                            block22: {
                                block20: {
                                    block16: {
                                        block17: {
                                            block18: {
                                                if (!(var2_3 instanceof jzx)) ** GOTO lbl-1000
                                                var5_4 /* !! */  = (jzx)var2_3;
                                                var3_5 = var5_4 /* !! */ .c;
                                                if ((var3_5 & -2147483648) != 0) {
                                                    var5_4 /* !! */ .c = var3_5 + -2147483648;
                                                    var2_3 = var5_4 /* !! */ ;
                                                } else lbl-1000:
                                                // 2 sources

                                                {
                                                    var2_3 = new jzx(this, (jqb)var2_3);
                                                }
                                                var6_6 = var2_3.a;
                                                var5_4 /* !! */  = jqh.a;
                                                var3_5 = var2_3.c;
                                                if (var3_5 == 0) break block16;
                                                if (var3_5 == 1) break block17;
                                                if (var3_5 != 2) break block18;
                                                jns.ak(var6_6);
                                                break block19;
                                            }
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        jns.ak(var6_6);
                                        break block20;
                                    }
                                    jns.ak(var6_6);
                                    var6_6 = this.a;
                                    var1_1 /* !! */  = new jpd(this.b, var1_1 /* !! */ );
                                    var2_3.c = 1;
                                    if (var6_6.e(var1_1 /* !! */ , (jqb)var2_3) == var5_4 /* !! */ ) break block21;
                                }
                                var2_3.c = 2;
                                var6_6 = var2_3.d();
                                jns.at((jqf)var6_6);
                                var1_1 /* !! */  = jjj.n((jqb)var2_3);
                                var1_1 /* !! */  = var1_1 /* !! */  instanceof kaz != false ? (kaz)var1_1 /* !! */  : null;
                                if (var1_1 /* !! */  != null) break block22;
                                var1_1 /* !! */  = jon.a;
                                break block23;
                            }
                            if (!var1_1 /* !! */ .a.b((jqf)var6_6)) break block24;
                            var1_1 /* !! */ .a((jqf)var6_6, jon.a);
                            break block25;
                        }
                        var7_7 = new jxk();
                        var1_1 /* !! */ .a(var6_6.plus((jqf)var7_7), jon.a);
                        if (!var7_7.a) break block25;
                        var7_7 = jon.a;
                        var4_9 = jve.a;
                        var6_6 = jxc.a;
                        var6_6 = jxc.a();
                        if (var6_6.p()) ** GOTO lbl65
                        if (var6_6.o()) {
                            var1_1 /* !! */ .c = var7_7;
                            var1_1 /* !! */ .e = 1;
                            var6_6.m((jvm)var1_1 /* !! */ );
                            var1_1 /* !! */  = jqh.a;
                        } else {
                            var6_6.n(true);
                            try {
                                var1_1 /* !! */ .run();
                                while (var4_9 = var6_6.q()) {
                                }
                            }
                            catch (Throwable var7_8) {
                                var1_1 /* !! */ .E(var7_8);
                            }
lbl65:
                            // 3 sources

                            var1_1 /* !! */  = jon.a;
                        }
                        break block23;
                        {
                            finally {
                                var6_6.l(true);
                            }
                        }
                    }
                    var1_1 /* !! */  = jqh.a;
                }
                if (var1_1 /* !! */  == jqh.a) {
                    jsd.j((jqb)var2_3);
                }
                var2_3 = var1_1 /* !! */ ;
                if (var1_1 /* !! */  != jqh.a) {
                    var2_3 = jon.a;
                }
                if (var2_3 == var5_4 /* !! */ ) break block21;
            }
            return jon.a;
        }
        return var5_4 /* !! */ ;
    }
}

