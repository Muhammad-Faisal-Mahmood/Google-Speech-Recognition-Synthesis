/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class bsz
implements dbv {
    private static final hei c = hei.m("com/google/android/apps/speech/tts/googletts/local/voicepack/TtsSlicingStrategy");
    public final List a;
    private final gzx d;
    private final String e;
    private final bxf f;
    private final bxt g;

    public bsz(bxf bxf2, dgg dgg2, bsy bsy2, bsy bsy3, bsy bsy4, String string, bxt bxt2) {
        this.f = bxf2;
        this.e = string;
        this.g = bxt2;
        this.a = new ArrayList();
        int n2 = gzx.d;
        this.d = gzx.j(dgg2, bsy2, bsy3, bsy4);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final dbu a(dbx var1_1) {
        var5_2 = dbu.e();
        var6_3 = new HashSet<E>();
        var8_4 = new HashMap<Object, den>();
        var7_5 = new HashMap<K, V>();
        for (den var10_10 : var1_1.h()) {
            block10: {
                block14: {
                    block11: {
                        block15: {
                            block12: {
                                block13: {
                                    var1_1 = var10_10.i().substring(0, var10_10.i().lastIndexOf("-"));
                                    if (this.g.d().contains(var1_1) && !this.a.contains(var1_1)) continue;
                                    var1_1 = var10_10.i().contains("-seanet") != false ? bua.d : (var10_10.i().contains("-lemonbalm") != false ? bua.e : (var10_10.i().contains("-locomel") != false ? bua.f : bua.c));
                                    var4_9 = var10_10.i().contains("-darwinnjaneiro") != false ? btz.c : (var10_10.i().contains("-darwinnrio") != false ? btz.d : btz.b);
                                    var2_7 = var1_1.ordinal();
                                    if (var2_7 == 2) break block10;
                                    if (var2_7 == 3) break block11;
                                    if (var2_7 == 4) break block12;
                                    if (var2_7 != 5) break block13;
                                    var3_8 = isv.c();
                                    break block14;
                                }
                                throw new IllegalArgumentException("Unknown voice type");
                            }
                            var2_7 = var4_9.ordinal();
                            if (var2_7 == 1) break block15;
                            if (var2_7 == 2) ** GOTO lbl27
                            if (var2_7 == 3) {
                                var3_8 = iss.e();
                            } else {
                                throw new IllegalArgumentException("Unknown voice platform");
lbl27:
                                // 1 sources

                                var3_8 = iss.d();
                            }
                            break block14;
                        }
                        var3_8 = iss.c();
                        break block14;
                    }
                    var3_8 = itb.c();
                }
                if (!var3_8) {
                    ((heg)((heg)bsz.c.c()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/TtsSlicingStrategy", "generateTargetPacks", 116, "TtsSlicingStrategy.java")).u("Excluding unsupported voicepack %s", var10_10.i());
                    continue;
                }
            }
            var6_3.add(var10_10);
            var1_1 = var10_10.i().replace("-darwinnjaneiro", "").replace("-darwinnrio", "");
            if (var4_9 == btz.b) {
                var8_4.put(var1_1, var10_10);
                continue;
            }
            var7_5.put(var1_1, var10_10);
        }
        for (Object var1_1 : var8_4.keySet()) {
            if (!var7_5.containsKey(var1_1)) continue;
            ((heg)((heg)bsz.c.c()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/TtsSlicingStrategy", "generateTargetPacks", 124, "TtsSlicingStrategy.java")).C("Removing CPU pack %s in favor of DarwiNN pack %s", var8_4.get(var1_1), var7_5.get(var1_1));
            var6_3.remove(var8_4.get(var1_1));
        }
        var1_1 = var6_3.iterator();
        while (var1_1.hasNext()) {
            var4_9 = (den)var1_1.next();
            var7_5 = this.f;
            var6_3 = this.d;
            var3_8 = var7_5.i();
            for (var2_7 = 0; var2_7 < ((hct)var6_3).c; ++var2_7) {
                var7_5 = ((dej)var6_3.get(var2_7)).d((den)var4_9);
                if (var7_5 == null) continue;
                ** GOTO lbl-1000
            }
            if (new File(gtk.c(File.separatorChar).e(this.e, var4_9.j(), new Object[]{var4_9.i()})).isDirectory()) lbl-1000:
            // 2 sources

            {
                var2_7 = 1;
            } else {
                var2_7 = 0;
            }
            if (!var3_8 && var2_7 == 0) continue;
            var2_7 = true != this.f.h() ? 2 : 1;
            var6_3 = der.g();
            var6_3.f((den)var4_9);
            var6_3.d(var2_7);
            var5_2.b(var6_3.a());
        }
        return var5_2.a();
    }

    @Override
    public final /* synthetic */ void b() {
    }
}

