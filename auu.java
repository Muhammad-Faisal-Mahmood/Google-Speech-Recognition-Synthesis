/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

final class auu
implements jyy {
    final jsj a;
    final jyy b;
    final String[] c;
    final int[] d;

    public auu(jsj jsj2, jyy jyy2, String[] stringArray, int[] nArray) {
        this.a = jsj2;
        this.b = jyy2;
        this.c = stringArray;
        this.d = nArray;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object b(int[] var1_1, jqb var2_2) {
        block11: {
            block13: {
                block14: {
                    block12: {
                        block10: {
                            if (!(var2_2 instanceof aut)) ** GOTO lbl-1000
                            var7_3 /* !! */  = (aut)var2_2;
                            var3_4 = var7_3 /* !! */ .c;
                            if ((var3_4 & -2147483648) != 0) {
                                var7_3 /* !! */ .c = var3_4 + -2147483648;
                                var2_2 = var7_3 /* !! */ ;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var2_2 = new aut(this, (jqb)var2_2);
                            }
                            var8_5 = var2_2.a;
                            var7_3 /* !! */  = jqh.a;
                            var3_4 = var2_2.c;
                            if (var3_4 == 0) break block10;
                            if (var3_4 == 1) ** GOTO lbl19
                            if (var3_4 == 2) {
                                var1_1 = var2_2.e;
                                var2_2 = var2_2.d;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl19:
                                // 1 sources

                                var1_1 = var2_2.e;
                                var2_2 = var2_2.d;
                            }
                            jns.ak(var8_5);
                            break block11;
                        }
                        jns.ak(var8_5);
                        var11_6 = this.a;
                        if (var11_6.a != null) break block12;
                        var9_7 = this.b;
                        var8_5 = jns.T(this.c);
                        var2_2.d = this;
                        var2_2.e = var1_1;
                        var2_2.c = 1;
                        if (var9_7.bJ(var8_5, (jqb)var2_2) != var7_3 /* !! */ ) break block13;
                        break block14;
                    }
                    var12_9 = this.c;
                    var10_10 = this.d;
                    var8_5 = new ArrayList<E>();
                    var5_11 = var12_9.length;
                    var4_12 = 0;
                    var3_4 = 0;
                    while (var4_12 < var5_11) {
                        var9_8 = var12_9[var4_12];
                        var13_14 = var11_6.a;
                        if (var13_14 != null) {
                            var6_13 = var10_10[var3_4];
                            if ((var13_14 = (Object)((int[])var13_14))[var6_13] != var1_1[var6_13]) {
                                var8_5.add(var9_8);
                            }
                            ++var4_12;
                            ++var3_4;
                            continue;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    if (var8_5.isEmpty()) break block13;
                    var9_8 = this.b;
                    var8_5 = jns.x(var8_5);
                    var2_2.d = this;
                    var2_2.e = var1_1;
                    var2_2.c = 2;
                    if (var9_8.bJ(var8_5, (jqb)var2_2) != var7_3 /* !! */ ) break block13;
                }
                return var7_3 /* !! */ ;
            }
            var2_2 = this;
        }
        var2_2.a.a = var1_1;
        return jon.a;
    }
}

