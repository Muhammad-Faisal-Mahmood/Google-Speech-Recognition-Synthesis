/*
 * Decompiled with CFR 0.152.
 */
public final class jyn
implements jyx,
jyq {
    private final jro a;

    public jyn() {
        throw null;
    }

    public jyn(jro jro2) {
        this.a = jro2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final Object a(jyy var1_1, jqb var2_2) {
        block11: {
            block12: {
                block10: {
                    if (!(var2_2 instanceof jym)) ** GOTO lbl-1000
                    var4_4 = (jym)var2_2;
                    var3_6 = var4_4.c;
                    if ((var3_6 & -2147483648) != 0) {
                        var4_4.c = var3_6 + -2147483648;
                        var2_2 = var4_4;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var2_2 = new jym(this, (jqb)var2_2);
                    }
                    var4_4 = var2_2.a;
                    var5_7 = jqh.a;
                    var3_6 = var2_2.c;
                    if (var3_6 != 0) {
                        if (var3_6 == 1) {
                            var1_1 = var2_2.d;
                            try {
                                jns.ak(var4_4);
                                break block10;
                            }
                            catch (Throwable var2_3) {
                                var4_4 = var1_1;
                                var1_1 = var2_3;
                                break block11;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jns.ak(var4_4);
                    var1_1 = new kah((jyy)var1_1, var2_2.d());
                    var2_2.d = var1_1;
                    var2_2.c = 1;
                    var2_2 = var4_4 = this.a.b(var1_1, var2_2);
                    try {
                        if (var4_4 != jqh.a) {
                            var2_2 = jon.a;
                        }
                        if (var2_2 == var5_7) break block12;
                    }
                    catch (Throwable var4_5) {
                        var2_2 = var1_1;
                        var1_1 = var4_5;
                        var4_4 = var2_2;
                    }
                }
                var1_1.g();
                return jon.a;
            }
            return var5_7;
        }
        var4_4.g();
        throw var1_1;
    }
}

