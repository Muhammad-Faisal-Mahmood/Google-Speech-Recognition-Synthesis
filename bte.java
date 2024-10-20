/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.util.Log
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.android.libraries.performance.primes.transmitter.LifeboatReceiver;
import j$.util.Collection$_EL;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public final class bte
implements gte {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ bte(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    public /* synthetic */ bte(Object object, Object object2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    public /* synthetic */ bte(String string, int n2) {
        this.c = n2;
        this.a = string;
        this.b = "";
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object apply(Object var1_1) {
        switch (this.c) {
            default: {
                var4_2 = (hav)var1_1;
                var3_17 = (fbt)this.a;
                var3_17.a.isPresent();
                var1_1 = this.b;
                if (((Optional)var1_1).isPresent() == false) return var4_2;
                var3_17.a.ifPresent(new bme(var1_1, 12));
                return var4_2;
            }
            case 19: {
                var3_18 = (hav)var1_1;
                var4_3 = (fbt)this.a;
                var4_3.a.isPresent();
                var1_1 = this.b;
                if (((Optional)var1_1).isPresent() == false) return var3_18;
                var4_3.a.ifPresent(new bme(var1_1, 11));
                return var3_18;
            }
            case 18: {
                var1_1 = (csg)var1_1;
                var3_19 = (hfk)((hfk)fbm.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "installPackageHelper", 251, "ZipfileLanguagePackSourceImpl.java");
                var1_1 = this.a;
                var3_19.u("LanguagePack downloaded (foreground) for %s", var1_1);
                var4_4 = this.b;
                var3_19 = dxv.T;
                var4_4 = (fbm)var4_4;
                var4_4.h.a((dyk)var3_19);
                var4_4.i.b((ezj)var1_1);
                return var1_1;
            }
            case 17: {
                var1_1 = (csg)var1_1;
                var3_20 = (hfk)((hfk)fbm.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "installPackage", 206, "ZipfileLanguagePackSourceImpl.java");
                var1_1 = this.a;
                var3_20.u("LanguagePack downloaded (background) for %s", var1_1);
                var4_5 = this.b;
                var3_20 = dxv.T;
                var4_5 = (fbm)var4_5;
                var4_5.h.a((dyk)var3_20);
                var4_5.i.b((ezj)var1_1);
                return var1_1;
            }
            case 16: {
                var1_1 = (Void)var1_1;
                var3_21 = (hfk)((hfk)fbm.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "deletePackage", 360, "ZipfileLanguagePackSourceImpl.java");
                var1_1 = this.a;
                var3_21.u("LanguagePack deleted for %s", var1_1);
                var4_6 = this.b;
                var3_21 = dxv.V;
                var4_6 = (fbm)var4_6;
                var4_6.h.a((dyk)var3_21);
                var4_6 = var4_6.i;
                var3_21 = (Set)((imc)var4_6.b).a;
                if (var3_21.isEmpty()) {
                    ((heg)((heg)fat.a.f().h(hfo.a, "LanguagePackCBTrigger")).j("com/google/android/libraries/speech/modeldownload/languagepacks/signals/DownloaderCallbacksTrigger", "onUninstallComplete", 68, "DownloaderCallbacksTrigger.java")).u("No #onUninstallComplete callbacks registered. Uninstallation finished for %s", ((ezj)var1_1).b());
                    return var1_1;
                }
                Collection$_EL.stream((Collection)var3_21).forEach(new fas(var4_6, var1_1, 2));
                return var1_1;
            }
            case 15: {
                var4_7 = (far)var1_1;
                var3_22 = Collection$_EL.stream(var4_7.b);
                var1_1 = this.b;
                var3_22 = var3_22.filter(new bod(var1_1, 14));
                var2_36 = gzx.d;
                var3_22 = (gzx)var3_22.collect(gye.a);
                if (var4_7.b.size() == var3_22.size()) {
                    var4_7 = this.a;
                    var5_38 = (hfk)((hfk)ezu.a.h()).j("com/google/android/libraries/speech/modeldownload/languagepacks/LanguagePackRequestState", "deleteRequest", 74, "LanguagePackRequestState.java");
                    var1_1 = ((faq)var1_1).d;
                    var5_38.C("[%s] LP request deletion found no match. Was API invoked properly? Locale: %s", ((ezu)var4_7).b, var1_1);
                }
                var1_1 = far.a.l();
                var1_1.I((Iterable)var3_22);
                return (far)var1_1.o();
            }
            case 14: {
                var4_8 /* !! */  = (dvn)var1_1;
                var1_1 = dvv.a;
                var1_1 = dvl.a;
                var5_39 = var4_8 /* !! */ .b;
                var3_23 = this.a;
                if (var5_39.containsKey(var3_23)) {
                    var1_1 = (dvl)var5_39.get(var3_23);
                }
                var5_39 = this.b;
                var6_48 = (hwp)var1_1.C(5);
                var6_48.x((hwv)var1_1);
                if (!DesugarCollections.unmodifiableList(((dvl)var6_48.b).c).contains(var5_39)) {
                    var6_48.F((String)var5_39);
                }
                var1_1 = (hwp)var4_8 /* !! */ .C(5);
                var1_1.x(var4_8 /* !! */ );
                if (!var6_48.b.B()) {
                    var6_48.u();
                }
                var4_8 /* !! */  = (dvl)var6_48.b;
                var4_8 /* !! */ .b = 1 | var4_8 /* !! */ .b;
                var4_8 /* !! */ .d = (String)var5_39;
                var4_8 /* !! */  = (dvl)var6_48.o();
                var1_1.G((String)var3_23, (dvl)var4_8 /* !! */ );
                return (dvn)var1_1.o();
            }
            case 13: {
                var1_1 = new gtp((String)var1_1, ((cag)this.a).h);
                return (dvo)((dvp)this.b).a.a.get(var1_1);
            }
            case 12: {
                var3_24 = (dsy)var1_1;
                var1_1 = (hwp)var3_24.C(5);
                var1_1.x((hwv)var3_24);
                var6_49 = (hwr)var1_1;
                if (!var6_49.b.B()) {
                    var6_49.u();
                }
                var3_24 = this.b;
                var1_1 = this.a;
                var5_40 = (dsy)var6_49.b;
                var4_9 = dsy.a;
                var3_24.getClass();
                var5_40.c = (kfl)var3_24;
                var5_40.b |= 1;
                var3_24 = (dsy)var6_49.o();
                var5_40 = (dwm)var1_1;
                var4_9 = var5_40.e.getClass().getName();
                var1_1 = new Intent();
                var5_40 = (Context)var5_40.c;
                var1_1.setComponent(new ComponentName((Context)var5_40, LifeboatReceiver.class));
                var1_1.setPackage(var5_40.getPackageName());
                var1_1.putExtra("Transmitters", new String[]{var4_9});
                var1_1.putExtra("MetricSnapshot", var3_24.g());
                var5_40.sendBroadcast((Intent)var1_1);
                return null;
            }
            case 11: {
                var4_10 = (ctx)var1_1;
                var3_25 = new ArrayList<ctt>();
                var1_1 = (hwp)var4_10.C(5);
                var1_1.x((hwv)var4_10);
                var5_41 = DesugarCollections.unmodifiableMap(var4_10.b).keySet().iterator();
                var6_50 = this.a;
                while (true) {
                    if (!var5_41.hasNext()) {
                        ((AtomicReference)this.b).set(var3_25);
                        return (ctx)var1_1.o();
                    }
                    var4_10 = (String)var5_41.next();
                    try {
                        var3_25.add(cqq.I((String)var4_10, ((cxd)var6_50).a, ((cxd)var6_50).b));
                    }
                    catch (czs var7_56) {
                        var1_1.E((String)var4_10);
                        cyr.q(var7_56, "Failed to deserialize newFileKey:".concat(String.valueOf(var4_10)));
                        var7_55 = ((cxd)var6_50).b;
                        guf.c("|").g((CharSequence)var4_10).size();
                        var7_55.a();
                    }
                }
            }
            case 10: {
                var3_26 = (ctx)var1_1;
                var1_1 = (hwp)var3_26.C(5);
                var1_1.x((hwv)var3_26);
                var3_26 = this.a;
                var1_1.D((String)this.b, (ctv)var3_26);
                return (ctx)var1_1.o();
            }
            case 9: {
                var5_42 = (ctx)var1_1;
                var3_27 = new gzy();
                var1_1 = ((hav)this.b).k();
                while (var1_1.hasNext() != false) {
                    var7_57 = this.a;
                    var4_11 = (ctt)var1_1.next();
                    var6_51 = DesugarCollections.unmodifiableMap(var5_42.b);
                    var8_60 = (cxd)var7_57;
                    var7_57 = var8_60.b;
                    if ((var6_51 = (ctv)var6_51.get(cqq.J(var4_11, var8_60.a, (cuv)var7_57))) == null) continue;
                    var3_27.d(var4_11, var6_51);
                }
                return var3_27.a();
            }
            case 8: {
                var3_28 = (cto)var1_1;
                var1_1 = (hwp)var3_28.C(5);
                var1_1.x((hwv)var3_28);
                var3_28 = this.a;
                var1_1.B((String)this.b, (cth)var3_28);
                return (cto)var1_1.o();
            }
            case 7: {
                var3_29 = (cto)var1_1;
                var1_1 = (hwp)var3_29.C(5);
                var1_1.x((hwv)var3_29);
                var3_29 = DesugarCollections.unmodifiableMap(var3_29.b).keySet().iterator();
                var5_43 = this.b;
                while (var3_29.hasNext() != false) {
                    var7_58 = (String)var3_29.next();
                    try {
                        var5_43.add(cqq.S(var7_58));
                    }
                    catch (czq var4_12) {
                        var6_52 = this.a;
                        cyr.q(var4_12, "Failed to deserialize groupKey:".concat(String.valueOf(var7_58)));
                        ((cxa)var6_52).a.a();
                        var1_1.C(var7_58);
                        cyr.c("%s: Deleting null file group ", "ProtoDataStoreFileGroupsMetadata");
                    }
                }
                return (cto)var1_1.o();
            }
            case 6: {
                var4_13 = (hac)var1_1;
                var3_30 = ((hac)this.b).k().k();
                while (true) {
                    var1_1 = this.a;
                    if (var3_30.hasNext() == false) return ((gzy)var1_1).a();
                    var5_44 = (Map.Entry)var3_30.next();
                    var6_53 = (ctt)var5_44.getValue();
                    if (var6_53 == null || !var4_13.containsKey(var6_53)) continue;
                    var5_44 = (ctf)var5_44.getKey();
                    var6_53 = (Uri)var4_13.get(var6_53);
                    ((gzy)var1_1).d(var5_44, var6_53);
                }
            }
            case 5: {
                if ((Boolean)var1_1 != false) return this.b;
                ((cwj)this.a).i.d(1036);
                return this.b;
            }
            case 4: {
                var3_31 = (hac)var1_1;
                var1_1 = this.a;
                var4_14 = (cwj)this.b;
                var1_1 = (cth)var1_1;
                var4_14 = var4_14.c(var4_14.b((cth)var1_1), (hac)var3_31);
                var5_45 = var1_1.o.iterator();
                do {
                    if (var5_45.hasNext()) continue;
                    return true;
                } while (var4_14.containsKey(var3_31 = (ctf)var5_45.next()));
                var1_1 = var1_1.d;
                var3_31 = var3_31.c;
                if (Log.isLoggable((String)"MDD", (int)5) == false) return false;
                Log.w((String)"MDD", (String)cyr.a("%s: Detected corruption of isolated structure for group %s %s", new Object[]{"FileGroupManager", var1_1, var3_31}));
                return false;
            }
            case 3: {
                var1_1 = ((List)var1_1).iterator();
                block33: while (true) {
                    var4_15 = this.b;
                    if (var1_1.hasNext() == false) return var4_15;
                    var6_54 = ((cxr)var1_1.next()).b;
                    if (!cqq.ad(var6_54)) continue;
                    var5_46 = var6_54.o.iterator();
                    while (true) {
                        if (var5_46.hasNext()) ** break;
                        continue block33;
                        var7_59 = this.a;
                        var3_32 = (ctf)var5_46.next();
                        var8_61 = (dmt)var7_59;
                        var7_59 = var8_61.a;
                        var8_61 = (gto)var8_61.f;
                        var4_15.add(cqq.W(cqq.X((Context)var7_59, (gto)var8_61, var6_54), var3_32));
                    }
                    break;
                }
            }
            case 2: {
                var1_1 = (hac)var1_1;
                var3_33 = this.b;
                var3_33 = dxv.av.b("timestamp", (String)var3_33).j();
                ((byu)this.a).f.a((dyk)var3_33);
                return var1_1;
            }
            case 1: {
                var1_1 = (Void)var1_1;
                var3_34 = (brq)this.b;
                var2_37 = var3_34.g;
                if (var2_37 == 0) throw null;
                if (var2_37 != 4) {
                    ((heg)((heg)brq.a.g()).j("com/google/android/apps/speech/tts/googletts/audio/ExoPlayerDecoder", "decodeWithDataSource", 340, "ExoPlayerDecoder.java")).r("Transitioning back to READY while not stopped.");
                }
                var1_1 = this.a;
                var3_34.g = 1;
                var1_1.a();
                return null;
            }
            case 0: 
        }
        var4_16 = this.a;
        var3_35 = ((btj)var4_16).j;
        var1_1 = (dcm)var1_1;
        var5_47 = this.b;
        synchronized (var3_35) {
            ((btj)var4_16).j.remove(((buc)var5_47).c);
            ((heg)((heg)btj.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader", "fetchVoiceInternal", 310, "VoiceDataDownloader.java")).r("Superpack download completed.");
            return var1_1;
        }
    }
}

