/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Process
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewTreeObserver$OnDrawListener
 */
import android.content.Context;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Future;

public final class dpw
implements Runnable {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ dpw(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    public /* synthetic */ dpw(Object object, Object object2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final void run() {
        var1_1 = this.c;
        var2_2 = null;
        switch (var1_1) {
            default: {
                var2_2 = ((fff)this.a).a;
                var3_3 = this.b;
                var2_2.c.i((fex)var3_3);
                return;
            }
            case 19: {
                var2_2 = ((fff)this.b).a;
                var3_4 = this.a;
                var2_2.c.g((fgd)var3_4);
                return;
            }
            case 18: {
                var2_2 = (heg)((heg)fat.a.f().h(hfo.a, "LanguagePackCBTrigger")).j("com/google/android/libraries/speech/modeldownload/languagepacks/signals/DownloaderCallbacksTrigger", "onInstallRequest", 104, "DownloaderCallbacksTrigger.java");
                var3_5 = ((ezj)this.b).b();
                var4_15 = this.a;
                var2_2.C("Triggering callback on request of [%s]: %s", var3_5, var4_15.getClass().getName());
                var4_15.a();
                return;
            }
            case 17: {
                var3_6 = (heg)((heg)fat.a.f().h(hfo.a, "LanguagePackCBTrigger")).j("com/google/android/libraries/speech/modeldownload/languagepacks/signals/DownloaderCallbacksTrigger", "onUninstallComplete", 79, "DownloaderCallbacksTrigger.java");
                var2_2 = ((ezj)this.b).b();
                var4_16 = this.a;
                var3_6.C("Triggering callback on uninstall of [%s]: %s", var2_2, var4_16.getClass().getName());
                var4_16.a();
                return;
            }
            case 16: {
                var2_2 = (heg)((heg)fat.a.f().h(hfo.a, "LanguagePackCBTrigger")).j("com/google/android/libraries/speech/modeldownload/languagepacks/signals/DownloaderCallbacksTrigger", "onInstallComplete", 54, "DownloaderCallbacksTrigger.java");
                var3_7 = ((ezj)this.b).b();
                var4_17 = this.a;
                var2_2.C("Triggering callback on installation of [%s]: %s", var3_7, var4_17.getClass().getName());
                var4_17.a();
                return;
            }
            case 15: {
                var3_8 = this.b;
                jse.e(var3_8, "$storedAudioId");
                var2_2 = (evw)this.a;
                var3_8 = new eht((evw)var2_2, (ecl)var3_8, null, 7);
                var2_2.f.j((jro)var3_8);
                return;
            }
            case 14: {
                var3_9 = this.b;
                var2_2 = ebg.I;
                var1_1 = ((ekl)var3_9).b;
                ((euu)this.a).c.M(var1_1, (ebg)var2_2);
                return;
            }
            case 13: {
                ((euu)this.a).c.O(((ekm)this.b).b, ebv.r);
                return;
            }
            case 12: {
                ((euu)this.a).c.K(((eki)this.b).a, eap.g);
                return;
            }
            case 11: {
                var3_10 = (egw)this.a;
                var2_2 = (eeb)var3_10.c.f();
                var4_18 = this.b;
                if (var2_2 == null) {
                    var2_2 = (ewq)var3_10.d.c();
                }
                while (true) {
                    var1_1 = var3_10.b;
                    var6_26 = new byte[var1_1];
                    var5_23 = var4_18.a((byte[])var6_26, var1_1);
                    if (!var5_23.c()) ** GOTO lbl93
                    var4_18 = var3_10.e;
                    var6_26 = crh.K(var2_2);
                    if (var5_23.c()) {
                        var1_1 = var5_23.a;
                        var5_23 = var4_18.a;
                        var3_10 = var1_1;
                        var5_23.f((String)var6_26, (Integer)var3_10);
                        var5_23 = var4_18.d;
                        var6_26 = dox.n(ecf.a.l());
                        var7_28 = doc.c(ebw.a.l());
                        var7_28.m(ecd.e);
                        var8_30 /* !! */  = (hwp)var7_28.a;
                        if (!var8_30 /* !! */ .b.B()) {
                            var8_30 /* !! */ .u();
                        }
                        var8_30 /* !! */  = (ebw)var8_30 /* !! */ .b;
                        var8_30 /* !! */ .b |= 8;
                        var8_30 /* !! */ .f = var1_1;
                        var6_26.w(var7_28.j());
                        var6_26 = var6_26.v();
                        ((evo)var5_23).e((ecf)var6_26);
                        var5_23 = (enc)var4_18.b;
                        var4_18 = (eng)var5_23.b.b();
                        var5_23 = (String)var5_23.d.a();
                        ((fsx)var4_18.p.a()).b(new Object[]{var5_23, var3_10});
                    } else {
                        throw new IllegalStateException("This is not an error");
lbl93:
                        // 1 sources

                        if (var5_23.a > 0) {
                            var2_2.g((eft)var5_23, (byte[])var6_26);
                            continue;
                        }
                    }
                    ** GOTO lbl108
                    break;
                }
                catch (IOException var4_19) {
                    var5_23 = var3_10.e;
                    var3_10 = crh.K(var2_2);
                    var7_29 = dox.n(ecf.a.l());
                    var6_26 = doc.c(ebw.a.l());
                    var6_26.m(ecd.f);
                    var7_29.w(var6_26.j());
                    var6_26 = var7_29.v();
                    ((evo)var5_23.d).e((ecf)var6_26);
                    var5_23.a.f((String)var3_10, null);
                    ((heg)((heg)egw.a.h().h(hfo.a, "ALT.AudioStreamReader")).i(var4_19).j("com/google/android/libraries/search/audio/audiostreamreader/AudioStreamReader", "startBufferingInternal", 81, "AudioStreamReader.kt")).r("#audio# IOException reading from the AudioStream.");
                }
lbl108:
                // 3 sources

                var2_2.f();
                return;
            }
            case 10: {
                var2_2 = this.b;
                jse.e(var2_2, "$audioData");
                ((eei)this.a).a.b((dzn)var2_2);
                return;
            }
            case 9: {
                var3_11 = (eeb)this.b;
                var4_20 = var3_11.g;
                var2_2 = this.a;
                var4_20 = var4_20.b();
                if (var4_20 != null) {
                    var3_11.e((eee)var2_2, (dzn)var4_20);
                }
                var4_20 = dox.g(dzn.a.l());
                var5_24 = dox.k(dzt.a.l());
                var5_24.u(dzu.b);
                var4_20.g(var5_24.t());
                var3_11.e((eee)var2_2, var4_20.e());
                return;
            }
            case 8: {
                var2_2 = this.a;
                try {
                    hhk.S((Future)var2_2);
                    return;
                }
                catch (Exception var3_12) {
                    var2_2 = this.b;
                    var4_21 = new StringBuilder("Failed to store account on flag read for: ");
                    var4_21.append(((dvr)var2_2).b);
                    var4_21.append(" which may lead to stale flags.");
                    Log.w((String)"MobStoreFlagStore", (String)var4_21.toString(), (Throwable)var3_12);
                    return;
                }
            }
            case 7: {
                var2_2 = this.a;
                ((dvr)this.b).c((hpn)var2_2);
                return;
            }
            case 6: {
                var3_13 = (dua)this.b;
                if (!var3_13.c.getPackageName().equals("com.android.vending")) {
                    var2_2 = this.a;
                    if (!dvt.a(var3_13.c).containsKey(var2_2)) {
                        Log.e((String)"PhenotypeCombinedFlags", (String)a.aj((String)var2_2, "Config package ", " cannot use PROCESS_STABLE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags."));
                    }
                }
                return;
            }
            case 5: {
                var4_22 = dvz.a((Context)this.b);
                for (Map.Entry<K, V> var6_27 : var4_22.getAll().entrySet()) {
                    if (!(var6_27.getValue() instanceof String)) continue;
                    var3_14 = this.a;
                    if (!var6_27.getValue().equals(var3_14)) continue;
                    var3_14 = var2_2;
                    if (var2_2 == null) {
                        var3_14 = var4_22.edit();
                    }
                    var3_14.remove((String)var6_27.getKey());
                    var2_2 = var3_14;
                }
                if (var2_2 != null) {
                    var2_2.commit();
                }
                return;
            }
            case 4: {
                var2_2 = this.a;
                ((dsp)this.b).a((iku)var2_2);
                return;
            }
            case 3: {
                ((View)this.b).getViewTreeObserver().removeOnDrawListener((ViewTreeObserver.OnDrawListener)this.a);
                return;
            }
            case 2: {
                var2_2 = ((djt)this.b).a;
                ((dpx)this.a).b.d.a(6, (String)var2_2);
                return;
            }
            case 1: {
                var1_1 = ((dkb)this.b).a;
                if (var1_1 != 0) {
                    Process.setThreadPriority((int)var1_1);
                }
                this.a.run();
                return;
            }
            case 0: 
        }
        var2_2 = ((djt)this.b).a;
        ((dpx)this.a).b.d.a(5, (String)var2_2);
    }
}

