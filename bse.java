/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.android.apps.speech.tts.googletts.dispatch.LanguageRegistry;
import com.google.android.apps.speech.tts.googletts.dispatch.VoicePolicyManager;
import j$.util.Collection$_EL;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class bse {
    private static final hei c = hei.m("com/google/android/apps/speech/tts/googletts/dispatch/RankedDispatcher");
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    private final LanguageRegistry d;
    private final VoicePolicyManager e;
    private final btn f;
    private final bxf g;
    private final bxt h;

    public bse(btn btn2, bxf bxf2, Context context) {
        this.f = btn2;
        this.g = bxf2;
        this.h = ((bsc)fvd.l(context, bsc.class)).Q();
        this.e = (VoicePolicyManager)((bsc)fvd.l(context, bsc.class)).x().b();
        this.d = ((bsc)fvd.l(context, bsc.class)).i();
        btn2.c(new bvg(this, 1));
    }

    /*
     * Unable to fully structure code
     */
    private final bso c(brv var1_1, List var2_2, int var3_3) {
        var6_4 = var2_2.iterator();
        var4_5 = false;
        while (var6_4.hasNext()) {
            block6: {
                block8: {
                    block7: {
                        var7_7 = (bsd)var6_4.next();
                        if (var7_7.a.v()) continue;
                        if (var1_1.m() && var1_1.i != null && !var7_7.a.l().equals(var1_1.i)) break;
                        if (var3_3 == 0) {
                            return var7_7.a;
                        }
                        if (var4_5 || var7_7.a.r()) break block6;
                        var2_2 = this.f;
                        var8_8 = var7_7.a;
                        var9_9 = var1_1.j;
                        if (var8_8.v()) ** GOTO lbl57
                        if (var8_8.q() == null) ** GOTO lbl56
                        if (var3_3 != 2) break block7;
                        var10_10 = var2_2.e;
                        var10_10.g();
                        var12_12 = var10_10.l;
                        var10_10 = var8_8.q();
                        var5_6 = var8_8.h().e;
                        var11_11 = new StringBuilder();
                        var11_11.append((String)var10_10);
                        var11_11.append("-r");
                        var11_11.append(var5_6);
                        if (!var12_12.contains(var11_11.toString())) break block7;
                        var2_2 = var2_2.a(var8_8);
                        ** GOTO lbl46
                    }
                    if (!var2_2.e.h(var8_8.h().c)) break block8;
                    ((heg)((heg)btn.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataManager", "downloadAsync", 239, "VoiceDataManager.java")).u("Already downloading %s, ignoring async download request...", var8_8.h().c);
                    ** GOTO lbl45
                }
                if (var8_8.v()) ** GOTO lbl55
                if (var8_8.q() != null) {
                    var9_9 = fxf.O(var9_9);
                    ((heg)((heg)btn.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataManager", "downloadAsync", 255, "VoiceDataManager.java")).u("Explicitly adding voicepack to downloads: %s", var8_8.q());
                    var11_11 = var2_2.e.m;
                    var10_10 = var8_8.q();
                    var11_11.a.add(var10_10);
                    var2_2.e.j(var8_8.h(), 3, var9_9, new buy(var2_2, 1));
lbl45:
                    // 2 sources

                    var2_2 = "";
lbl46:
                    // 2 sources

                    if (var2_2 != null && !var2_2.isEmpty()) {
                        var1_1 = var7_7.a.d();
                        var1_1.b(true);
                        var1_1.a = var2_2;
                        return var1_1.a();
                    }
                    if (var3_3 != 2) {
                        var4_5 = true;
                    }
                } else {
                    throw new IllegalArgumentException("Cannot download voice with no voicepack name");
lbl55:
                    // 1 sources

                    throw new IllegalArgumentException("Cannot initiate download for network voice");
lbl56:
                    // 1 sources

                    throw new IllegalArgumentException("Cannot download voice with no voicepack name");
lbl57:
                    // 1 sources

                    throw new IllegalArgumentException("Cannot initiate download for network voice");
                }
            }
            if (!var7_7.a.r()) continue;
            return var7_7.a;
        }
        return null;
    }

    private static final bso d(brv brv2, List object) {
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = (bsd)iterator.next();
            if (!((bsd)object).a.v()) continue;
            if (brv2.m() && brv2.i != null && !((bsd)object).a.l().equals(brv2.i)) break;
            return ((bsd)object).a;
        }
        return null;
    }

    public final Locale a(Locale locale) {
        Locale locale2 = this.d.a(locale);
        if (locale2 != null && !locale2.getLanguage().equals(locale.getLanguage())) {
            ((heg)((heg)c.f()).j("com/google/android/apps/speech/tts/googletts/dispatch/RankedDispatcher", "redirectIfLanguageDifferent", 226, "RankedDispatcher.java")).C("Redirect from %s to %s", locale, locale2);
            return locale2;
        }
        return locale;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ddl b(brv var1_1, int var2_2) {
        block61: {
            ((heg)((heg)bse.c.c()).j("com/google/android/apps/speech/tts/googletts/dispatch/RankedDispatcher", "dispatchOnLanguage", 242, "RankedDispatcher.java")).u("Dispatch on locale: %s", var1_1.d());
            var17_3 = this.a;
            synchronized (var17_3) {
                var3_4 = var1_1.b();
                var16_5 = this.a;
                var18_7 = var3_4;
                if (var16_5.get(var18_7) != null) {
                    var16_5 = (Set)this.a.get(var18_7);
                } else {
                    block59: {
                        var20_8 = new HashSet(this.f.b());
                        var19_9 = this.e;
                        var21_10 = iil.a.l();
                        var16_5 = Collection$_EL.stream((Collection)var20_8);
                        var22_11 = new bpf(2);
                        var21_10.T((Iterable)var16_5.map(var22_11).collect(gye.b));
                        var16_5 = (iil)var21_10.o();
                        var16_5 = fxf.O(var1_1.j);
                        var21_10 = var1_1.d().toLanguageTag();
                        var19_9.b();
                        var14_12 = var19_9.b;
                        if (var14_12 == 0L) {
                            ((heg)((heg)VoicePolicyManager.a.h()).j("com/google/android/apps/speech/tts/googletts/dispatch/VoicePolicyManager", "applyVoicePolicy", 191, "VoicePolicyManager.java")).r("Native voice policy not available.");
                        } else {
                            var21_10 = (ArrayList<bsd>)var19_9.nativeManagerApplyVoicePolicy(var14_12, (String)var16_5, (String)var21_10);
                            try {
                                var16_5 = hwj.a();
                                var16_5 = hwv.o(iil.a, (byte[])var21_10, 0, ((Object)var21_10).length, (hwj)var16_5);
                                hwv.D((hwv)var16_5);
                                var16_5 = (iil)var16_5;
                                break block59;
                            }
                            catch (hxn var16_6) {
                                a.as(VoicePolicyManager.a.g(), "Could not parse voice proto", "com/google/android/apps/speech/tts/googletts/dispatch/VoicePolicyManager", "applyVoicePolicy", '\u00cb', "VoicePolicyManager.java", var16_6);
                            }
                        }
                        var16_5 = null;
                    }
                    if (var16_5 == null) {
                        ((heg)((heg)VoicePolicyManager.a.h()).j("com/google/android/apps/speech/tts/googletts/dispatch/VoicePolicyManager", "applyVoicePolicy", 169, "VoicePolicyManager.java")).r("Failed to apply native voice policy. Defaulting to all voices blocked.");
                        var16_5 = hdc.a;
                    } else {
                        var16_5 = Collection$_EL.stream(var16_5.b);
                        var21_10 = new ArrayList<bsd>(3);
                        var16_5 = (hav)var16_5.map(var21_10).collect(gye.b);
                        var20_8 = Collection$_EL.stream((Collection)var20_8);
                        var21_10 = new ArrayList<bsd>(var16_5, 7);
                        var16_5 = (hav)var20_8.filter(var21_10).collect(gye.b);
                    }
                    var20_8 = Collection$_EL.stream((Collection)var16_5);
                    var16_5 = new bsk((VoicePolicyManager)var19_9, var1_1, 1);
                    var16_5 = Collection$_EL.stream((hav)var20_8.filter(var16_5).collect(gye.b));
                    var19_9 = new bod(var1_1, 4);
                    var16_5 = (hav)var16_5.filter(var19_9).collect(gye.b);
                    this.a.put(var18_7, var16_5);
                }
            }
            fxf.K(var16_5);
            var20_8 = this.b;
            synchronized (var20_8) {
                var4_13 = var1_1.b();
                var5_14 = var1_1.d().hashCode();
                var3_4 = true != var1_1.i() ? 4457 : 4441;
                var4_13 = (var4_13 * 41 + var5_14) * 41 + var3_4;
                var17_3 = var1_1.m;
                var3_4 = var4_13;
                if (var17_3 != null) {
                    var3_4 = var4_13 * 41 + var17_3.hashCode();
                }
                if ((var17_3 = this.b).get(var21_10 = Integer.valueOf((var3_4 * 41 + (var4_13 = true != var1_1.h() ? 1999 : 1993)) * 41 + (var5_14 = var2_2 == 0 ? 3919 : 3911))) != null) {
                    var16_5 = (Set)this.b.get(var21_10);
                } else {
                    var18_7 = new HashSet();
                    var19_9 = this.a(var1_1.d());
                    var17_3 = Locale.forLanguageTag(var19_9.getLanguage().replace('_', '-'));
                    if (var1_1.i()) {
                        ((heg)((heg)bse.c.c()).j("com/google/android/apps/speech/tts/googletts/dispatch/RankedDispatcher", "getAvailableVoicesForLanguages", 341, "RankedDispatcher.java")).r("Inter-language fallback disabled, restricting voices to requested locale only.");
                        var17_3 = var19_9;
                    }
                    var22_11 = Collection$_EL.stream((Collection)var16_5);
                    var23_15 = new bod(var17_3, 5);
                    var22_11 = var22_11.filter(var23_15);
                    Objects.requireNonNull(var18_7);
                    var17_3 = new bme(var18_7, 3);
                    var22_11.forEachOrdered(var17_3);
                    var17_3 = var1_1.m;
                    if (var17_3 != null) {
                        var23_15 = Collection$_EL.stream((Collection)var16_5);
                        var22_11 = new bod(var17_3, 6);
                        var17_3 = var23_15.filter(var22_11);
                        Objects.requireNonNull(var18_7);
                        var22_11 = new bme(var18_7, 3);
                        var17_3.forEachOrdered(var22_11);
                    }
                    if (var2_2 != 0 && var1_1.h() && !var19_9.getLanguage().equals("en")) {
                        var17_3 = Collection$_EL.stream((Collection)var16_5);
                        var16_5 = new boa(12);
                        var16_5 = var17_3.filter(var16_5);
                        Objects.requireNonNull(var18_7);
                        var17_3 = new bme(var18_7, 3);
                        var16_5.forEachOrdered(var17_3);
                    }
                    this.b.put(var21_10, var18_7);
                    var16_5 = var18_7;
                }
            }
            fxf.K(var16_5);
            var21_10 = new ArrayList<bsd>(var16_5.size());
            var22_11 = var1_1.d();
            var23_15 = new HashMap<K, V>();
            var18_7 = var1_1.m;
            var17_3 = var16_5.iterator();
            var16_5 = var18_7;
            while (true) {
                block65: {
                    block64: {
                        block62: {
                            block63: {
                                block60: {
                                    var6_16 = false;
                                    if (!var17_3.hasNext()) break;
                                    var24_24 = (bso)var17_3.next();
                                    if (!var1_1.g()) ** GOTO lbl-1000
                                    var18_7 = var1_1.i;
                                    fxf.K(var18_7);
                                    if (var18_7.equals(var24_24.l())) {
                                        var3_4 = 65536;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var3_4 = 0;
                                    }
                                    var5_14 = var3_4;
                                    if (var16_5 != null) {
                                        ((heg)((heg)bse.c.c()).j("com/google/android/apps/speech/tts/googletts/dispatch/RankedDispatcher", "scoreAndSortVoices", 419, "RankedDispatcher.java")).r("Dispatching based on language detection / localespan");
                                        var18_7 = var24_24.j();
                                        var7_17 = var18_7.size();
                                        var4_13 = 0;
                                        do {
                                            var5_14 = var3_4;
                                            if (var4_13 >= var7_17) break block60;
                                            var13_23 = brz.k((String)var18_7.get(var4_13))[0].equals(var16_5);
                                            ++var4_13;
                                        } while (!var13_23);
                                        var5_14 = var3_4 + 32768;
                                    }
                                }
                                var25_25 = this.d.a((Locale)var22_11);
                                var18_7 = var24_24.j();
                                var8_18 = var18_7.size();
                                var12_22 = 0;
                                var7_17 = var4_13 = (var3_4 = (var11_21 = 0));
                                var10_20 = var4_13;
                                var9_19 = var3_4;
                                var4_13 = var11_21;
                                var3_4 = var12_22;
                                while (var9_19 < var8_18) {
                                    var26_26 = (String)var18_7.get(var9_19);
                                    var27_27 = brz.g(var26_26);
                                    var13_23 = this.h.a.contains(var27_27);
                                    var10_20 |= brz.i(var27_27, (Locale)var22_11);
                                    var3_4 |= var27_27.getLanguage().equals(var22_11.getLanguage());
                                    var19_9 = var20_8 = (String)var23_15.get(var26_26);
                                    if (var20_8 == null) {
                                        var19_9 = this.g.b(var27_27.toString());
                                        var23_15.put(var26_26, var19_9);
                                    }
                                    var4_13 |= var24_24.l().equals(var19_9);
                                    var7_17 = var27_27.equals(var25_25) | var7_17;
                                    ++var9_19;
                                    var6_16 |= var13_23;
                                }
                                var8_18 = 1 != var10_20 ? 0 : 16384;
                                var3_4 = 1 != var3_4 ? 0 : 8192;
                                var13_23 = var1_1.k.contains(((String)var24_24.j().get(0)).toLowerCase(Locale.getDefault()));
                                var3_4 = var5_14 = var5_14 + var8_18 + var3_4;
                                if (!var13_23) break block62;
                                var3_4 = var5_14;
                                if (!var1_1.f()) break block62;
                                if (var24_24.e() == bty.d) break block63;
                                var18_7 = cab.a;
                                if (var24_24.e() == bty.e) break block63;
                                var3_4 = var5_14;
                                if (var24_24.e() != bty.f) break block62;
                            }
                            var3_4 = var5_14 + 256;
                        }
                        var5_14 = var3_4;
                        if (var7_17 != 0) {
                            var5_14 = var3_4 + 128;
                        }
                        var3_4 = true != var6_16 ? 0 : 64;
                        var4_13 = 1 != var4_13 ? 0 : 16;
                        var13_23 = var24_24.s();
                        var3_4 = var4_13 = var5_14 + var3_4 + var4_13;
                        if (var13_23) {
                            var3_4 = var4_13 + 8;
                        }
                        var4_13 = var3_4;
                        if (var24_24.u() == 2) {
                            var4_13 = var3_4 + 4;
                        }
                        if (var24_24.e() == bty.e) break block64;
                        var3_4 = var4_13;
                        if (var24_24.e() != bty.b) break block65;
                    }
                    var3_4 = var4_13 + 2;
                }
                var4_13 = var3_4;
                if (!var24_24.v()) {
                    var4_13 = var3_4 + 1;
                }
                var21_10.add(new bsd(var24_24, var4_13));
            }
            Collections.sort(var21_10, Collections.<T>reverseOrder());
            var17_3 = var21_10.iterator();
            while (var17_3.hasNext()) {
                var16_5 = (bsd)var17_3.next();
                if (var16_5.a.v()) continue;
                var17_3 = var16_5.a.l();
                break block61;
            }
            var17_3 = "";
        }
        var4_13 = var21_10.size();
        for (var3_4 = 0; var3_4 < var4_13; ++var3_4) {
            var18_7 = (bsd)var21_10.get(var3_4);
            if (!var18_7.a.l().equals(var17_3)) continue;
            if (var18_7.a.f() == btz.c && iss.d() || var18_7.a.f() == btz.d && iss.e()) {
                var18_7.b += 4096;
            }
            var16_5 = iss.c() != false ? bua.e : (itb.c() != false ? bua.d : (isv.c() != false ? bua.f : bua.c));
            if (var18_7.a.g() == var16_5) {
                var18_7.b += 2048;
            }
            if (var18_7.a.g() == bua.c) continue;
            var18_7.b += 1024;
        }
        Collections.sort(var21_10, Collections.<T>reverseOrder());
        if (brt.b()) {
            var17_3 = new StringBuilder("Scores:");
            var18_7 = var21_10.iterator();
            var3_4 = 0;
            while (var18_7.hasNext()) {
                var16_5 = (bsd)var18_7.next();
                if (var3_4 >= 8) break;
                var17_3.append(" ");
                var17_3.append(var16_5.a.m());
                var17_3.append(" ");
                var17_3.append(var16_5.b);
                ++var3_4;
            }
            ((heg)((heg)bse.c.f()).j("com/google/android/apps/speech/tts/googletts/dispatch/RankedDispatcher", "dispatchOnLanguage", 302, "RankedDispatcher.java")).u("%s", var17_3);
        }
        if (var1_1.j()) {
            ((heg)((heg)bse.c.c()).j("com/google/android/apps/speech/tts/googletts/dispatch/RankedDispatcher", "dispatch", 169, "RankedDispatcher.java")).r("Dispatch local only");
            var17_3 = this.c(var1_1, var21_10, var2_2);
            var16_5 = null;
        } else if (var1_1.l()) {
            ((heg)((heg)bse.c.c()).j("com/google/android/apps/speech/tts/googletts/dispatch/RankedDispatcher", "dispatch", 172, "RankedDispatcher.java")).r("Dispatch network only");
            var16_5 = bse.d(var1_1, var21_10);
            var17_3 = null;
        } else {
            if (var1_1.k()) {
                ((heg)((heg)bse.c.c()).j("com/google/android/apps/speech/tts/googletts/dispatch/RankedDispatcher", "dispatch", 176, "RankedDispatcher.java")).r("Dispatch network first");
            } else {
                ((heg)((heg)bse.c.c()).j("com/google/android/apps/speech/tts/googletts/dispatch/RankedDispatcher", "dispatch", 178, "RankedDispatcher.java")).r("Dispatch local first");
            }
            var17_3 = this.c(var1_1, var21_10, var2_2);
            var16_5 = bse.d(var1_1, var21_10);
        }
        if (var16_5 != null && var17_3 != null) {
            var16_5 = var1_1.k() ? new ddl((bso)var16_5, (bso)var17_3) : new ddl((bso)var17_3, null);
        } else if (var16_5 != null) {
            ((heg)((heg)bse.c.c()).j("com/google/android/apps/speech/tts/googletts/dispatch/RankedDispatcher", "dispatch", 193, "RankedDispatcher.java")).r("Local voice not installed, we will not be able to do local fallback");
            var16_5 = new ddl((bso)var16_5, null);
        } else if (var17_3 != null) {
            ((heg)((heg)bse.c.c()).j("com/google/android/apps/speech/tts/googletts/dispatch/RankedDispatcher", "dispatch", 196, "RankedDispatcher.java")).r("No network voice found, will fall back to local immediately");
            var16_5 = new ddl((bso)var17_3, null);
        } else {
            ((heg)((heg)bse.c.c()).j("com/google/android/apps/speech/tts/googletts/dispatch/RankedDispatcher", "dispatch", 199, "RankedDispatcher.java")).r("No local or network voice found, failing dispatch");
            var16_5 = null;
        }
        if (var16_5 != null) return var16_5;
        if (var1_1.g()) {
            ((heg)((heg)bse.c.c()).j("com/google/android/apps/speech/tts/googletts/dispatch/RankedDispatcher", "dispatch", 204, "RankedDispatcher.java")).C("Could not find voice for %s and voice name %s", var1_1.d(), var1_1.i);
            if (var1_1.m() == false) return var16_5;
            if (var21_10.isEmpty() == false) throw new bsp();
            return var16_5;
        }
        ((heg)((heg)bse.c.c()).j("com/google/android/apps/speech/tts/googletts/dispatch/RankedDispatcher", "dispatch", 211, "RankedDispatcher.java")).u("Could not find voice for %s", var1_1.d());
        return var16_5;
    }
}

