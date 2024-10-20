/*
 * Decompiled with CFR 0.152.
 */
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.regex.Pattern;

public final class dmc {
    private static final guf b = guf.b('/');
    private static final Pattern c = Pattern.compile("^(\\*[a-z]+\\*).*");
    final ConcurrentHashMap a = new ConcurrentHashMap();

    static String a(String string) {
        List list = b.g(string);
        if (list.size() != 3) {
            ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer", "sanitizeSyncName", 56, "HashingNameSanitizer.java")).u("malformed sync name: %s", string);
            return "MALFORMED";
        }
        return (String)list.get(0);
    }

    /*
     * Unable to fully structure code
     */
    final kdl b(dmb var1_1, kdl var2_2) {
        block10: {
            block11: {
                block14: {
                    block12: {
                        block13: {
                            var7_3 = var2_2.e;
                            var6_4 = var7_3;
                            if (var7_3 == null) {
                                var6_4 = kdg.a;
                            }
                            if ((var6_4.b & 2) == 0) break block10;
                            var7_3 = var2_2.e;
                            var6_4 = var7_3;
                            if (var7_3 == null) {
                                var6_4 = kdg.a;
                            }
                            var7_3 = (hwp)var6_4.C(5);
                            var7_3.x((hwv)var6_4);
                            var8_5 = (hwp)var2_2.C(5);
                            var8_5.x((hwv)var2_2);
                            var6_4 = ((kdg)var7_3.b).d;
                            var9_6 = hqk.a((String)var6_4);
                            fxf.K(var9_6);
                            var2_2 = this.a;
                            var4_7 = var9_6;
                            if (var2_2.containsKey(var9_6)) break block11;
                            var3_8 = var1_1.ordinal();
                            if (var3_8 == 0) break block12;
                            if (var3_8 == 1) break block13;
                            if (var3_8 != 2) ** GOTO lbl39
                            var2_2 = "--";
                            break block14;
                        }
                        var2_2 = dmc.a((String)var6_4);
                        break block14;
                    }
                    var2_2 = dmc.c.matcher((CharSequence)var6_4);
                    if (var2_2.matches()) {
                        if (var6_4.startsWith("*sync*/")) {
                            var2_2 = "*sync*/".concat(String.valueOf(dmc.a(var6_4.substring(7))));
                        } else {
                            var2_2 = var2_2.group(1);
                            ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer", "sanitizeWakelockName", 77, "HashingNameSanitizer.java")).u("non-sync system task wakelock: %s", var2_2);
                        }
                    } else {
                        ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer", "sanitizeWakelockName", 82, "HashingNameSanitizer.java")).u("wakelock: %s", var6_4);
lbl39:
                        // 2 sources

                        var2_2 = var6_4;
                    }
                }
                var10_9 = hqk.a((String)var2_2);
                ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer", "rawHashFor", 135, "HashingNameSanitizer.java")).G("Sanitized Hash: [%s] %s -> %d", var1_1, var2_2, var10_9);
                ((heg)((heg)dkc.a.e()).j("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer", "rawHashFor", 136, "HashingNameSanitizer.java")).G("Raw Hash: [%s] %s -> %d", var1_1, var6_4, var9_6);
                if (var10_9 != null) {
                    this.a.putIfAbsent(var9_6, var10_9);
                }
            }
            if (!var7_3.b.B()) {
                var7_3.u();
            }
            var1_1 = var7_3.b;
            var2_2 = (kdg)var1_1;
            var2_2.b |= 1;
            var2_2.c = var4_7;
            if (!var1_1.B()) {
                var7_3.u();
            }
            var1_1 = (kdg)var7_3.b;
            var1_1.b &= -3;
            var1_1.d = kdg.a.d;
            if (!var8_5.b.B()) {
                var8_5.u();
            }
            var1_1 = (kdl)var8_5.b;
            var2_2 = (kdg)var7_3.o();
            var2_2.getClass();
            var1_1.e = var2_2;
            var1_1.b |= 4;
            return (kdl)var8_5.o();
        }
        return var2_2;
    }

    final kdl c(kdl hwv2) {
        hyg hyg2;
        hyg hyg3 = hyg2 = hwv2.e;
        if (hyg2 == null) {
            hyg3 = kdg.a;
        }
        hyg2 = hwv2;
        if ((((kdg)hyg3).b & 1) != 0) {
            hyg3 = hyg2 = hwv2.e;
            if (hyg2 == null) {
                hyg3 = kdg.a;
            }
            hyg2 = (hwp)((hwv)hyg3).C(5);
            ((hwp)hyg2).x((hwv)hyg3);
            Long l2 = (Long)this.a.get(((kdg)((hwp)hyg2).b).c);
            fxf.K(l2);
            hyg3 = (hwp)hwv2.C(5);
            ((hwp)hyg3).x(hwv2);
            long l3 = l2;
            if (!((hwp)hyg2).b.B()) {
                ((hwp)hyg2).u();
            }
            hwv2 = (kdg)((hwp)hyg2).b;
            ((kdg)hwv2).b |= 1;
            ((kdg)hwv2).c = l3;
            if (!((hwp)hyg3).b.B()) {
                ((hwp)hyg3).u();
            }
            hwv2 = (kdl)((hwp)hyg3).b;
            hyg2 = (kdg)((hwp)hyg2).o();
            hyg2.getClass();
            hwv2.e = hyg2;
            hwv2.b |= 4;
            hyg2 = (kdl)((hwp)hyg3).o();
        }
        return hyg2;
    }
}

