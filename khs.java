/*
 * Decompiled with CFR 0.152.
 */
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.lang.ref.Reference;

public final class khs
extends khd {
    final kht d;

    public khs(kht kht2, String string) {
        this.d = kht2;
        super(string);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final long a() {
        var10_1 = System.nanoTime();
        var17_2 = this.d;
        var18_3 = ((ConcurrentLinkedQueue)var17_2.d).iterator();
        jse.d(var18_3, "iterator(...)");
        var6_4 = -9223372036854775808L;
        var15_5 = null;
        var2_6 = 0;
        var1_7 = 0;
        while (true) {
            if (var18_3.hasNext()) {
                var16_12 = (khr)var18_3.next();
                jse.b(var16_12);
                synchronized (var16_12) {
                    var19_13 = khb.a;
                    var19_13 = var16_12.l;
                    var3_8 = 0;
                }
            } else {
                var8_11 = var17_2.a;
                if (var6_4 < var8_11 && var2_6 <= 5) {
                    if (var2_6 > 0) {
                        return var8_11 - var6_4;
                    }
                    if (var1_7 > 0) return var8_11;
                    return -1L;
                }
                jse.b(var15_5);
                synchronized (var15_5) {
                    var14_17 = var15_5.l.isEmpty();
                    var8_11 = 0L;
                    if (!var14_17) {
                        return var8_11;
                    }
                    var12_18 = var15_5.m;
                    if (var12_18 + var6_4 != var10_1) {
                        return var8_11;
                    }
                    var15_5.l();
                    ((ConcurrentLinkedQueue)var17_2.d).remove(var15_5);
                }
                khb.r(var15_5.a());
                if (!((ConcurrentLinkedQueue)var17_2.d).isEmpty()) {
                    return var8_11;
                }
                ((khf)var17_2.b).a();
                return 0L;
            }
            {
                while (var3_8 < var19_13.size()) {
                    var20_14 = (Reference)var19_13.get(var3_8);
                    if (var20_14.get() != null) {
                        ++var3_8;
                        continue;
                    }
                    jse.c(var20_14, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                    var20_14 = (khn)var20_14;
                    var22_16 = var16_12.a.a.i;
                    var21_15 /* !! */  = new StringBuilder();
                    var21_15 /* !! */ .append("A connection to ");
                    var21_15 /* !! */ .append(var22_16);
                    var21_15 /* !! */ .append(" was leaked. Did you forget to close a response body?");
                    var21_15 /* !! */  = var21_15 /* !! */ .toString();
                    kkf.b.h((String)var21_15 /* !! */ , var20_14.a);
                    var19_13.remove(var3_8);
                    var16_12.l();
                    if (!var19_13.isEmpty()) continue;
                    var16_12.m = var10_1 - var17_2.a;
                    ** GOTO lbl-1000
                }
                if (var19_13.size() > 0) {
                    var3_8 = var1_7 + 1;
                    var8_11 = var6_4;
                } else lbl-1000:
                // 2 sources

                {
                    var4_9 = var2_6 + 1;
                    var8_11 = var16_12.m;
                    var8_11 = var10_1 - var8_11;
                    var5_10 = var8_11 == var6_4 ? 0 : (var8_11 < var6_4 ? -1 : 1);
                    if (var5_10 > 0) {
                        var6_4 = var8_11;
                    }
                    var8_11 = var6_4;
                    var2_6 = var4_9;
                    var3_8 = var1_7;
                    if (var5_10 > 0) {
                        var15_5 = var16_12;
                        var3_8 = var1_7;
                        var2_6 = var4_9;
                        var8_11 = var6_4;
                    }
                }
            }
            var6_4 = var8_11;
            var1_7 = var3_8;
        }
    }
}

