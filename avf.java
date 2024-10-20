/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public final class avf
implements jyy {
    final jyy a;
    final aum b;
    final jrk c;

    public avf(jyy jyy2, aum aum2, jrk jrk2) {
        this.a = jyy2;
        this.b = aum2;
        this.c = jrk2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final Object bJ(Object var1_1, jqb var2_2) {
        block10: {
            block8: {
                block9: {
                    block5: {
                        block6: {
                            block7: {
                                if (!(var2_2 instanceof ave)) ** GOTO lbl-1000
                                var4_3 = (ave)var2_2;
                                var3_4 = var4_3.b;
                                if ((var3_4 & -2147483648) != 0) {
                                    var4_3.b = var3_4 + -2147483648;
                                    var2_2 = var4_3;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var2_2 = new ave(this, (jqb)var2_2);
                                }
                                var4_3 = var2_2.a;
                                var6_5 = jqh.a;
                                var3_4 = var2_2.b;
                                if (var3_4 == 0) break block5;
                                if (var3_4 == 1) break block6;
                                if (var3_4 != 2) break block7;
                                jns.ak(var4_3);
                                break block8;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        var1_1 = var2_2.c;
                        jns.ak(var4_3);
                        break block9;
                    }
                    jns.ak(var4_3);
                    var5_6 = this.a;
                    var1_1 = (Set)var1_1;
                    var1_1 = this.b;
                    var4_3 = this.c;
                    var2_2.c = var5_6;
                    var2_2.b = 1;
                    var4_3 = wf.h((aum)var1_1, true, (jrk)var4_3, (jqb)var2_2);
                    if (var4_3 == var6_5) break block10;
                    var1_1 = var5_6;
                }
                var2_2.c = null;
                var2_2.b = 2;
                if (var1_1.bJ(var4_3, (jqb)var2_2) == var6_5) break block10;
            }
            return jon.a;
        }
        return var6_5;
    }
}

