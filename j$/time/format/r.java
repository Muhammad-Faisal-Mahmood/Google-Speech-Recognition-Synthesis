/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.chrono.i_0;
import j$.time.format.B;
import j$.time.format.q;
import j$.time.format.u;
import j$.time.g;
import j$.time.i;
import j$.time.k;
import j$.time.temporal.a;
import j$.time.temporal.l;
import j$.time.temporal.m;
import j$.time.temporal.p;
import j$.time.x;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

final class r
extends q {
    private static final ConcurrentHashMap e = new ConcurrentHashMap();
    private final B c;
    private final boolean d;

    r(B b2, boolean bl2) {
        j$.time.temporal.r r2 = l.j();
        String string = String.valueOf((Object)b2);
        StringBuilder stringBuilder = new StringBuilder("ZoneText(");
        stringBuilder.append(string);
        stringBuilder.append(")");
        super(r2, stringBuilder.toString());
        new HashMap();
        new HashMap();
        this.c = Objects.requireNonNull(b2, "textStyle");
        this.d = bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final boolean g(u var1_1, StringBuilder var2_2) {
        block8: {
            block12: {
                block14: {
                    block13: {
                        block11: {
                            block10: {
                                block9: {
                                    var7_3 = (ZoneId)var1_1.f(l.k());
                                    if (var7_3 == null) {
                                        return false;
                                    }
                                    var5_4 = var7_3.l();
                                    var4_5 = var5_4;
                                    if (var7_3 instanceof x) break block8;
                                    var9_6 = var1_1.d();
                                    var3_7 = this.d;
                                    var6_8 = null;
                                    var4_5 = null;
                                    if (var3_7 != 0) ** GOTO lbl-1000
                                    if (!var9_6.e(a.INSTANT_SECONDS)) break block9;
                                    var3_7 = (int)var7_3.I().h(Instant.J((m)var9_6));
                                    break block10;
                                }
                                var10_9 = a.EPOCH_DAY;
                                if (!var9_6.e(var10_9) || !var9_6.e((p)(var8_10 = a.NANO_OF_DAY))) ** GOTO lbl-1000
                                var9_6 = i.Q(g.V(var9_6.B(var10_9)), k.Q(var9_6.B((p)var8_10)));
                                if (var7_3.I().f((i)var9_6) == null) {
                                    var8_10 = var7_3.I();
                                    var7_3 = ZonedDateTime.J((i)var9_6, (ZoneId)var7_3, null);
                                    var3_7 = (int)var8_10.h(Instant.ofEpochSecond(i_0.o((j$.time.chrono.k)var7_3), var7_3.b().N()));
                                } else lbl-1000:
                                // 3 sources

                                {
                                    var3_7 = 2;
                                }
                            }
                            var8_10 = var1_1.c();
                            var1_1 = B.NARROW;
                            var7_3 = this.c;
                            if (var7_3 != var1_1) break block11;
                            var1_1 = var6_8;
                            break block12;
                        }
                        var9_6 = r.e;
                        var6_8 = (String[])var9_6.get(var5_4);
                        var1_1 = var4_5;
                        if (var6_8 == null) break block13;
                        var4_5 = (Map)var6_8.get();
                        var1_1 = var4_5;
                        if (var4_5 == null) break block13;
                        var1_1 = var6_8 = (String[])var4_5.get(var8_10);
                        if (var6_8 != null) break block14;
                        var1_1 = var4_5;
                    }
                    var4_5 = TimeZone.getTimeZone(var5_4);
                    var6_8 = new String[]{var5_4, var4_5.getDisplayName(false, 1, (Locale)var8_10), var4_5.getDisplayName(false, 0, (Locale)var8_10), var4_5.getDisplayName(true, 1, (Locale)var8_10), var4_5.getDisplayName(true, 0, (Locale)var8_10), var5_4, var5_4};
                    var4_5 = var1_1;
                    if (var1_1 == null) {
                        var4_5 = new ConcurrentHashMap<K, V>();
                    }
                    var4_5.put(var8_10, var6_8);
                    var9_6.put(var5_4, new SoftReference<Object>(var4_5));
                    var1_1 = var6_8;
                }
                var1_1 = var3_7 != 0 ? (var3_7 != 1 ? var1_1[var7_3.g() + 5] : var1_1[var7_3.g() + 3]) : var1_1[var7_3.g() + 1];
            }
            var4_5 = var5_4;
            if (var1_1 != null) {
                var4_5 = var1_1;
            }
        }
        var2_2.append((String)var4_5);
        return true;
    }
}

