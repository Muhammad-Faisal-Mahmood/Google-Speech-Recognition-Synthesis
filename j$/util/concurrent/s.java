/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.l;

final class s
extends l {
    s e;
    s f;
    s g;
    s h;
    boolean i;

    s(int n2, Object object, Object object2, l l2, s s2) {
        super(n2, object, object2, l2);
        this.e = s2;
    }

    @Override
    final l a(int n2, Object object) {
        return this.b(n2, object, null);
    }

    /*
     * Unable to fully structure code
     */
    final s b(int var1_1, Object var2_2, Class var3_3) {
        block5: {
            block3: {
                if (var2_2 == null) break block5;
                var7_4 = this;
                do {
                    block4: {
                        block12: {
                            block13: {
                                block11: {
                                    block10: {
                                        block7: {
                                            block9: {
                                                block8: {
                                                    block6: {
                                                        var8_8 = var7_4.f;
                                                        var6_7 = var7_4.g;
                                                        var4_5 = var7_4.a;
                                                        if (var4_5 <= var1_1) break block6;
                                                        var6_7 = var8_8;
                                                        break block7;
                                                    }
                                                    if (var4_5 < var1_1) break block8;
                                                    var9_9 = var7_4.b;
                                                    if (var9_9 == var2_2 || var9_9 != null && var2_2.equals(var9_9)) break block3;
                                                    if (var8_8 != null) break block9;
                                                }
                                                var5_6 = var6_7;
                                                break block4;
                                            }
                                            if (var6_7 != null) break block10;
                                            var6_7 = var8_8;
                                        }
lbl22:
                                        // 4 sources

                                        while (true) {
                                            var5_6 = var6_7;
                                            break block4;
                                            break;
                                        }
                                    }
                                    var5_6 = var3_3;
                                    if (var3_3 != null) break block11;
                                    var3_3 = var5_6 = ConcurrentHashMap.c(var2_2);
                                    if (var5_6 == null) break block12;
                                }
                                var4_5 = ConcurrentHashMap.g;
                                var4_5 = var9_9 != null && var9_9.getClass() == var5_6 ? ((Comparable)var2_2).compareTo(var9_9) : 0;
                                var3_3 = var5_6;
                                if (var4_5 == 0) break block12;
                                if (var4_5 >= 0) break block13;
                                var6_7 = var8_8;
                                var3_3 = var5_6;
                                ** GOTO lbl22
                            }
                            var3_3 = var5_6;
                            ** GOTO lbl22
                        }
                        var5_6 = var6_7.b(var1_1, var2_2, (Class)var3_3);
                        var6_7 = var8_8;
                        if (var5_6 != null) ** break;
                        ** continue;
                        return var5_6;
                    }
                    var7_4 = var5_6;
                } while (var5_6 != null);
                break block5;
            }
            return var7_4;
        }
        return null;
    }
}

