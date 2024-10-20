/*
 * Decompiled with CFR 0.152.
 */
public final class jzg
implements jyx {
    final jyx a;
    final Object b;
    private final int c;

    public jzg(jyx jyx2, Object object, int n2) {
        this.c = n2;
        this.a = jyx2;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final Object a(jyy var1_1, jqb var2_2) {
        block17: {
            block25: {
                block26: {
                    block27: {
                        block18: {
                            block24: {
                                block22: {
                                    block23: {
                                        block19: {
                                            block20: {
                                                block21: {
                                                    var3_3 = this.c;
                                                    if (var3_3 == 0) break block18;
                                                    if (var3_3 != 1) {
                                                        var1_1 /* !! */  = new jzk((jyy)var1_1 /* !! */ , this.b, 0);
                                                        if ((var1_1 /* !! */  = this.a.a((jyy)var1_1 /* !! */ , (jqb)var2_2)) == jqh.a) {
                                                            return var1_1 /* !! */ ;
                                                        }
                                                        return jon.a;
                                                    }
                                                    if (!(var2_2 instanceof jzc)) ** GOTO lbl-1000
                                                    var8_4 = (jzc)var2_2;
                                                    var3_3 = var8_4.b;
                                                    if ((var3_3 & -2147483648) != 0) {
                                                        var8_4.b = var3_3 + -2147483648;
                                                        var2_2 = var8_4;
                                                    } else lbl-1000:
                                                    // 2 sources

                                                    {
                                                        var2_2 = new jzc(this, (jqb)var2_2);
                                                    }
                                                    var8_4 = var2_2.a;
                                                    var9_6 = jqh.a;
                                                    var3_3 = var2_2.b;
                                                    if (var3_3 == 0) break block19;
                                                    if (var3_3 == 1) break block20;
                                                    if (var3_3 != 2) break block21;
                                                    jns.ak(var8_4);
                                                    break block22;
                                                }
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            var1_1 /* !! */  = var2_2.e;
                                            jns.ak(var8_4);
                                            break block23;
                                        }
                                        jns.ak(var8_4);
                                        var8_4 = this.a;
                                        var2_2.e = this;
                                        var2_2.c = var1_1 /* !! */ ;
                                        var2_2.b = 1;
                                        var8_4 = jsd.q((jyx)var8_4, (jyy)var1_1 /* !! */ , (jqb)var2_2);
                                        if (var8_4 == var9_6) break block24;
                                        var1_1 /* !! */  = this;
                                    }
                                    var8_4 = (Throwable)var8_4;
                                    if (var8_4 == null) break block22;
                                    var1_1 /* !! */  = var1_1 /* !! */ .b;
                                    var2_2.e = null;
                                    var2_2.c = null;
                                    var2_2.b = 2;
                                    var1_1 /* !! */  = new evb(((evb)var1_1 /* !! */ ).b, (jqb)var2_2);
                                    var1_1 /* !! */ .a = var8_4;
                                    if (var1_1 /* !! */ .a(jon.a) == var9_6) break block24;
                                }
                                return jon.a;
                            }
                            return var9_6;
                        }
                        if (!(var2_2 instanceof jzf)) ** GOTO lbl-1000
                        var8_5 = (jzf)var2_2;
                        var3_3 = var8_5.b;
                        if ((var3_3 & -2147483648) != 0) {
                            var8_5.b = var3_3 + -2147483648;
                            var2_2 = var8_5;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var2_2 = new jzf(this, (jqb)var2_2);
                        }
                        var9_7 = var2_2.a;
                        var11_8 = jqh.a;
                        var3_3 = var2_2.b;
                        if (var3_3 == 0) break block25;
                        if (var3_3 == 1) break block26;
                        if (var3_3 != 2) break block27;
                        var4_9 = var2_2.f;
                        var10_10 = var2_2.e;
                        var8_5 = var2_2.d;
                        var1_1 /* !! */  = var2_2.g;
                        jns.ak(var9_7);
                        ** GOTO lbl118
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                var4_9 = var2_2.f;
                var8_5 = var2_2.d;
                var1_1 /* !! */  = var2_2.g;
                jns.ak(var9_7);
                ** GOTO lbl100
            }
            jns.ak(var9_7);
            var4_9 = 0L;
            var9_7 = this;
            var8_5 = var1_1 /* !! */ ;
            do {
                var1_1 /* !! */  = var9_7.a;
                var2_2.g = var9_7;
                var2_2.d = var8_5;
                var2_2.e = null;
                var2_2.f = var4_9;
                var2_2.b = 1;
                var10_10 = jsd.q((jyx)var1_1 /* !! */ , (jyy)var8_5, (jqb)var2_2);
                if (var10_10 == var11_8) {
                    var1_1 /* !! */  = var11_8;
                    break block17;
                }
                var1_1 /* !! */  = var9_7;
                var9_7 = var10_10;
lbl100:
                // 2 sources

                var10_10 = (Throwable)var9_7;
                if (var10_10 != null) {
                    var9_7 = var1_1 /* !! */ .b;
                    var9_7 = new Long(var4_9);
                    var2_2.g = var1_1 /* !! */ ;
                    var2_2.d = var8_5;
                    var2_2.e = var10_10;
                    var2_2.f = var4_9;
                    var2_2.b = 2;
                    var6_11 = var9_7.longValue();
                    var9_7 = new bcw((jqb)var2_2);
                    var9_7.b = var10_10;
                    var9_7.c = var6_11;
                    var9_7 = var12_12 = var9_7.a(jon.a);
                    if (var12_12 == var11_8) {
                        var1_1 /* !! */  = var11_8;
                        break block17;
                    } else {
                        ** GOTO lbl118
                    }
                }
                ** GOTO lbl123
lbl118:
                // 3 sources

                if (((Boolean)var9_7).booleanValue()) {
                    ++var4_9;
                    var3_3 = 1;
                } else {
                    throw (Throwable)var10_10;
lbl123:
                    // 1 sources

                    var3_3 = 0;
                }
                var9_7 = var1_1 /* !! */ ;
            } while (var3_3 != 0);
            var1_1 /* !! */  = jon.a;
        }
        return var1_1 /* !! */ ;
    }
}

