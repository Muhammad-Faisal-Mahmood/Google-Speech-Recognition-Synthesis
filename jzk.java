/*
 * Decompiled with CFR 0.152.
 */
public final class jzk
implements jyy {
    final jyy a;
    final Object b;
    private final int c;

    public jzk(jyy jyy2, Object object, int n2) {
        this.c = n2;
        this.a = jyy2;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final Object bJ(Object var1_1, jqb var2_5) {
        block22: {
            block20: {
                block21: {
                    block17: {
                        block18: {
                            block19: {
                                block16: {
                                    block15: {
                                        block14: {
                                            if (this.c == 0) break block16;
                                            if (!(var2_5 instanceof jze)) ** GOTO lbl-1000
                                            var4_6 /* !! */  = (jze)var2_5;
                                            var3_8 = var4_6 /* !! */ .b;
                                            if ((var3_8 & -2147483648) != 0) {
                                                var4_6 /* !! */ .b = var3_8 + -2147483648;
                                                var2_5 = var4_6 /* !! */ ;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var2_5 = new jze(this, (jqb)var2_5);
                                            }
                                            var5_10 = var2_5.a;
                                            var4_6 /* !! */  = jqh.a;
                                            var3_8 = var2_5.b;
                                            if (var3_8 != 0) {
                                                if (var3_8 == 1) {
                                                    var2_5 = var2_5.d;
                                                    try {
                                                        jns.ak(var5_10);
                                                        break block14;
                                                    }
                                                    catch (Throwable var1_2) {
                                                        break block15;
                                                    }
                                                }
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            jns.ak(var5_10);
                                            try {
                                                var5_10 = this.a;
                                                var2_5.d = this;
                                                var2_5.b = 1;
                                                var1_1 = var5_10.bJ(var1_1, (jqb)var2_5);
                                                if (var1_1 != var4_6 /* !! */ ) break block14;
                                                return var4_6 /* !! */ ;
                                            }
                                            catch (Throwable var1_3) {
                                                var2_5 = this;
                                            }
                                        }
                                        return jon.a;
                                    }
                                    ((jsj)var2_5.b).a = var1_4;
                                    throw var1_4;
                                }
                                if (!(var2_5 instanceof jzj)) ** GOTO lbl-1000
                                var4_7 = (jzj)var2_5;
                                var3_9 = var4_7.b;
                                if ((var3_9 & -2147483648) != 0) {
                                    var4_7.b = var3_9 + -2147483648;
                                    var2_5 = var4_7;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var2_5 = new jzj(this, (jqb)var2_5);
                                }
                                var6_12 = var2_5.a;
                                var5_11 = jqh.a;
                                var3_9 = var2_5.b;
                                if (var3_9 == 0) break block17;
                                if (var3_9 == 1) break block18;
                                if (var3_9 != 2) break block19;
                                jns.ak(var6_12);
                                break block20;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        var4_7 = var2_5.e;
                        var1_1 = var2_5.d;
                        jns.ak(var6_12);
                        break block21;
                    }
                    jns.ak(var6_12);
                    var4_7 = this.a;
                    var6_12 = this.b;
                    var2_5.d = var1_1;
                    var2_5.e = var4_7;
                    var2_5.b = 1;
                    if (var6_12.b(var1_1, var2_5) == var5_11) break block22;
                }
                var2_5.d = null;
                var2_5.e = null;
                var2_5.b = 2;
                if (var4_7.bJ(var1_1, (jqb)var2_5) == var5_11) break block22;
            }
            return jon.a;
        }
        return var5_11;
    }
}

