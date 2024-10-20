/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public final class bvm {
    private static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/local/voicepack/ui/VoicePackEntryHelper");

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List a(bxf var0, btn var1_1, btj var2_4) {
        block33: {
            var9_5 = new ArrayList<izk>();
            var1_1 = var1_1.e();
            var8_6 = new ArrayList<E>();
            var11_7 = var1_1.a.iterator();
            block6: while (var11_7.hasNext()) {
                var12_10 = (buc)var11_7.next();
                var10_9 = var12_10.g.iterator();
                while (var10_9.hasNext()) {
                    var1_1 = var7_8 = bua.b(((bub)var10_9.next()).d);
                    if (var7_8 == null) {
                        var1_1 = bua.a;
                    }
                    if (var1_1 == bua.b) continue;
                    var8_6.add(var12_10);
                    continue block6;
                }
            }
            var7_8 = new bzb(var8_6);
            var1_1 = new ArrayList<E>();
            var7_8 = var7_8.a.iterator();
            block8: while (var7_8.hasNext()) {
                var8_6 = (buc)var7_8.next();
                var10_9 = var8_6.g.iterator();
                while (var10_9.hasNext()) {
                    if (!cab.f((bub)var10_9.next())) continue;
                    var1_1.add(var8_6);
                    continue block8;
                }
            }
            var10_9 = new bzb(var1_1).a();
            var7_8 = new HashMap<String, HashMap<K, V>>();
            try {
                var8_6 = ((Map)var2_4.c().get()).entrySet().iterator();
                while (true) {
                    var1_1 = var7_8;
                    if (var8_6.hasNext()) {
                        var1_1 = var8_6.next();
                        var11_7 = (bsw)var1_1.getValue();
                        if (var11_7.d) continue;
                        var7_8.put((String)var1_1.getKey(), var11_7);
                        continue;
                    }
                    break block33;
                    break;
                }
            }
            catch (InterruptedException var1_2) {
            }
            catch (ExecutionException var1_3) {
                // empty catch block
            }
            a.as(btj.a.g(), "Failed to get available public voices", "com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader", "getAvailablePublicVoicesInfo", '\u01ed', "VoiceDataDownloader.java", var1_1);
            var1_1 = new HashMap<K, V>();
        }
        var8_6 = new HashSet<K>(var10_9.keySet());
        var8_6.addAll(var1_1.keySet());
        var11_7 = new HashMap<Object, bvl>();
        var12_10 = var8_6.iterator();
        while (true) {
            if (!var12_10.hasNext()) break;
            var14_15 = (String)var12_10.next();
            var7_8 = (buc)var10_9.get(var14_15);
            var13_14 = (bsw)var1_1.get(var14_15);
            if (var7_8 != null) {
                var7_8 = gzx.o(brz.d((buc)var7_8));
            } else if (var13_14 != null) {
                var7_8 = var13_14.e;
            } else {
                ((heg)((heg)bvm.a.g()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/ui/VoicePackEntryHelper", "getAll", 75, "VoicePackEntryHelper.java")).u("Couldn't find locale of voice %s", var14_15);
                continue;
            }
            var5_13 = var7_8.size();
            var3_11 = 0;
            while (true) {
                if (var3_11 >= var5_13) ** break;
                var14_15 = (brx)var7_8.get(var3_11);
                var15_16 = (bvl)var11_7.get(var14_15);
                if (var15_16 == null) {
                    var4_12 = var13_14 != null ? 1 : 0;
                    var11_7.put(var14_15, new bvl(var4_12));
                } else {
                    var4_12 = var13_14 != null ? 1 : 0;
                    var15_16.a += var4_12;
                    ++var15_16.b;
                }
                ++var3_11;
            }
            break;
        }
        var13_14 = var8_6.iterator();
        while (true) {
            if (!var13_14.hasNext()) {
                Collections.sort(var9_5, new aog(15));
                return var9_5;
            }
            var14_15 = (String)var13_14.next();
            var12_10 = (bsw)var1_1.get(var14_15);
            var7_8 = (buc)var10_9.get(var14_15);
            if (var7_8 != null) {
                var8_6 = brz.d((buc)var7_8);
            } else if (var12_10 != null) {
                var7_8 = var12_10.a;
                var8_6 = var12_10.e;
            } else {
                ((heg)((heg)bvm.a.g()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/ui/VoicePackEntryHelper", "getAll", 103, "VoicePackEntryHelper.java")).u("Couldn't find locale of voice %s", var14_15);
                continue;
            }
            var15_16 = var8_6.iterator();
            while (true) {
                if (!var15_16.hasNext()) ** break;
                var16_18 = (brx)var15_16.next();
                var8_6 = (bvl)var11_7.get(var16_18);
                var4_12 = var8_6 != null && var8_6.a > 1 ? 2 : 0;
                var3_11 = var4_12;
                if (var8_6 != null) {
                    var3_11 = var4_12;
                    if (var8_6.b > 1) {
                        var3_11 = var4_12 | 1;
                    }
                }
                var4_12 = var3_11;
                if (var14_15.equals(var0.b(var16_18.toString()))) {
                    var4_12 = var3_11 | 8;
                }
                var3_11 = var4_12;
                if (var2_4.h((String)var14_15)) {
                    var3_11 = var4_12 | 16;
                }
                var8_6 = var2_4.k;
                synchronized (var8_6) {
                    var6_17 = var2_4.k.contains(var14_15);
                }
                var4_12 = var3_11;
                if (var6_17) {
                    var4_12 = var3_11 | 32;
                }
                var9_5.add(new izk((buc)var7_8, (bsw)var12_10, var4_12, var16_18));
            }
            break;
        }
    }
}

