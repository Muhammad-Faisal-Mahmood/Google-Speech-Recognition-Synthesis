/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Context
 *  android.os.Binder
 *  android.speech.tts.SynthesisCallback
 *  android.speech.tts.SynthesisRequest
 *  android.speech.tts.Voice
 *  gqv
 */
package com.google.android.apps.speech.tts.googletts.service;

import android.app.Service;
import android.content.Context;
import android.os.Binder;
import android.speech.tts.SynthesisCallback;
import android.speech.tts.SynthesisRequest;
import android.speech.tts.Voice;
import com.google.android.apps.speech.tts.googletts.dispatch.VoicePolicyManager;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class GoogleTtsService
extends bwn {
    private bwk a;
    private boolean b;
    private final goi c = new goi((Service)this);

    @Deprecated
    public GoogleTtsService() {
        fpk.c();
    }

    public final bwk a() {
        bwk bwk2 = this.a;
        if (bwk2 != null) {
            return bwk2;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void onCreate() {
        block21: {
            block22: {
                var1_1 = this.c.c();
                this.b = true;
                fxf.A(this.getApplication() instanceof ghv);
                if (this.a != null) break block21;
                if (!this.b) break block22;
                var3_3 = fxf.aq("CreateComponent");
                {
                    block24: {
                        block23: {
                            catch (Throwable var2_11) {
                                throw var2_11;
                            }
                            try {
                                this.bn();
                            }
                            catch (Throwable var2_9) {
                                try {
                                    var3_3.close();
                                    throw var2_9;
                                }
                                catch (Throwable var3_6) {
                                    var2_9.addSuppressed(var3_6);
                                    throw var2_9;
                                }
                            }
                            {
                                var3_3.close();
                                var2_7 = fxf.aq("CreatePeer");
                            }
                            try {
                                try {
                                    var6_12 = this.bn();
                                }
                                catch (ClassCastException var3_5) {
                                    var4_16 = new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", var3_5);
                                    throw var4_16;
                                }
                                var3_3 = ((bre)var6_12).a;
                                if (!(var3_3 instanceof GoogleTtsService)) break block23;
                                var3_3 = (GoogleTtsService)var3_3;
                                idi.m(var3_3);
                                var5_13 = ((bre)var6_12).b;
                                var4_14 = var5_13.J;
                                var8_17 = (bwp)var5_13.o.b();
                                var7_18 = (bvo)((bre)var6_12).b.K.b();
                                var5_13 = (bwq)((bre)var6_12).b.r.b();
                                var9_19 = (bxf)((bre)var6_12).b.q.b();
                                var10_20 = (bxt)((bre)var6_12).b.p.b();
                                var10_20 = (btn)((bre)var6_12).b.t.b();
                                var11_21 = (VoicePolicyManager)((bre)var6_12).b.u.b();
                                var12_22 = (Context)((bre)var6_12).b.n.b();
                                this.a = var6_12 = new bwk((GoogleTtsService)var3_3, (jnu)var4_14, var8_17, var7_18, (bwq)var5_13, var9_19, (btn)var10_20, var11_21, var12_22);
                            }
                            catch (Throwable var3_4) {
                                break block24;
                            }
                            ** try [egrp 5[TRYBLOCK] [6 : 301->316)] { 
lbl50:
                            // 1 sources

                            var2_7.close();
                            this.a.n = this;
                            break block21;
                        }
                        var4_15 = new IllegalStateException(a.at(var3_3, bwk.class, "Attempt to inject a Service wrapper of type "));
                        throw var4_15;
                    }
                    try {
                        var2_7.close();
                        throw var3_4;
                    }
                    catch (Throwable var2_8) {}
                    {
                        var3_4.addSuppressed(var2_8);
                        throw var3_4;
                    }
                }
            }
            var2_10 = new IllegalStateException("createPeer() called outside of onCreate");
            throw var2_10;
        }
        var3_3 = this.a();
        var2_7 = djv.a().b();
        var4_14 = kh.j((Context)var3_3.h).versionName;
        ((heg)((heg)bwk.a.f()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTtsServicePeer", "onCreate", 100, "GoogleTtsServicePeer.java")).u("Creating Google TTS service, version %s", var4_14);
        var3_3.d = var4_14 = new bzs();
        var5_13 = new ArrayList(2);
        var5_13.add(var3_3.e.b());
        if (!var3_3.d.b((Context)var3_3.b)) {
            var5_13.add(var3_3.e.b());
        }
        var4_14 = new bss((List)var5_13);
        var3_3.i.b = Executors.newFixedThreadPool(2);
        var3_3.c = var5_13 = new bwi(var3_3.g, (bss)var4_14, var3_3.i, var3_3.l, var3_3.f, var3_3.k, var3_3.d, (Context)var3_3.b);
        var3_3.j.set(true);
        super.onCreate();
        var3_3 = djv.a();
        var4_14 = new djt("Service.onCreate");
        var3_3.e((drn)var2_7, (djt)var4_14);
        this.b = false;
        return;
lbl88:
        // 1 sources

        finally {
            try {
                var1_1.close();
            }
            catch (Throwable var1_2) {
                var2_11.addSuppressed(var1_2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onDestroy() {
        gpf gpf2 = this.c.e();
        try {
            bwk bwk2 = this.a();
            if (!bwk2.j.get()) {
                ((heg)((heg)bwk.a.h()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTtsServicePeer", "onDestroy", 206, "GoogleTtsServicePeer.java")).r("onDestroy() called while disconnected.");
                return;
            }
            bwk2.m.a();
            Object object = bwk2.c;
            ((bwi)object).b.a();
            object = ((bwi)object).c;
            ((bvo)object).b.shutdownNow();
            try {
                if (!((bvo)object).b.awaitTermination(5L, TimeUnit.SECONDS)) {
                    ((heg)((heg)bvo.a.g()).j("com/google/android/apps/speech/tts/googletts/network/NetworkSynthesizer", "destroy", 119, "NetworkSynthesizer.java")).r("Network tasks did not terminate within timeout.");
                }
            }
            catch (InterruptedException interruptedException) {
                a.as(bvo.a.g(), "Thread interrupted while waiting for tasks to complete.", "com/google/android/apps/speech/tts/googletts/network/NetworkSynthesizer", "destroy", 'z', "NetworkSynthesizer.java", interruptedException);
            }
            super.onDestroy();
            bwk2.j.compareAndSet(true, false);
            return;
        }
        finally {
            gpf2.close();
        }
    }

    public final String onGetDefaultVoiceNameFor(String object, String object2, String object3) {
        Object object4;
        block10: {
            object3 = this.c.d("onGetDefaultVoiceNameFor");
            object4 = this.a();
            if (((bwk)object4).j.get()) break block10;
            ((heg)((heg)bwk.a.h()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTtsServicePeer", "onGetDefaultVoiceNameFor", 304, "GoogleTtsServicePeer.java")).r("onGetDefaultVoiceNameFor() called while disconnected.");
            object = "";
        }
        drn drn2 = djv.a().b();
        Object object5 = new Locale((String)object, (String)object2);
        object5 = brz.h((Locale)object5).getLanguage();
        object = new Locale((String)object5, (String)object2);
        object2 = fxf.T(brz.h((Locale)object).getCountry());
        object = ((bwk)object4).c;
        object4 = ((bwk)object4).d.a(((bwk)object4).h.getPackageManager(), Binder.getCallingUid());
        object4 = ((bwi)object).m.g((String)object5, (String)object2, "NetworkFirst", ((bwi)object).k.a((String)object4), true, (String)object4);
        if (object4 != null) {
            object = String.valueOf(brz.c((String)((bso)object4).j().get(0))).concat("-language");
            ((heg)((heg)bwi.a.f()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTTSServiceImpl", "onGetDefaultVoiceNameFor", 473, "GoogleTTSServiceImpl.java")).H("For default lang %s-%s is name %s (%s)", object5, object2, object, ((bso)object4).m());
        } else {
            ((heg)((heg)bwi.a.f()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTTSServiceImpl", "onGetDefaultVoiceNameFor", 477, "GoogleTTSServiceImpl.java")).C("No voice found for locale %s-%s", object5, object2);
            object = null;
        }
        object5 = djv.a();
        object2 = new djt("GetDefaultVoiceNameFor");
        ((djv)object5).e(drn2, (djt)object2);
        return object;
        finally {
            try {
                object3.close();
            }
            catch (Throwable throwable) {
                Throwable throwable2;
                throwable2.addSuppressed(throwable);
            }
        }
    }

    protected final Set onGetFeaturesForLanguage(String hashSet, String object, String object2) {
        object2 = this.c.d("onGetFeaturesForLanguage");
        try {
            Object object3 = this.a();
            if (!((bwk)object3).j.get()) {
                ((heg)((heg)bwk.a.h()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTtsServicePeer", "onGetFeaturesForLanguage", 253, "GoogleTtsServicePeer.java")).r("onGetFeaturesForLanguage() called while disconnected.");
                hashSet = hdc.a;
            } else {
                drn drn2 = djv.a().b();
                Object object4 = new Locale((String)((Object)hashSet), (String)object);
                object4 = brz.h((Locale)object4).getLanguage();
                hashSet = new HashSet<String>((String)object4, (String)object);
                object = fxf.T(brz.h((Locale)((Object)hashSet)).getCountry());
                bwi bwi2 = ((bwk)object3).c;
                object3 = ((bwk)object3).d.a(((bwk)object3).h.getPackageManager(), Binder.getCallingUid());
                hashSet = new HashSet<String>();
                bso bso2 = bwi2.m.g((String)object4, (String)object, "NetworkFirst", bwi2.k.a((String)object3), false, (String)object3);
                if (bso2 != null) {
                    boolean bl2 = bso2.v();
                    if (bl2) {
                        hashSet.add("networkTts");
                    } else {
                        hashSet.add("embeddedTts");
                    }
                    if (bso2.v() && (object = bwi2.m.g((String)object4, (String)object, "LocalOnly", bwi2.k.a((String)object3), false, (String)object3)) != null) {
                        if (((bso)object).v()) {
                            hashSet.add("networkTts");
                        } else {
                            hashSet.add("embeddedTts");
                        }
                    }
                }
                object = djv.a();
                object4 = new djt("GetFeaturesForLanguage");
                ((djv)object).e(drn2, (djt)object4);
            }
            return hashSet;
        }
        finally {
            object2.close();
        }
    }

    protected final String[] onGetLanguage() {
        gpf gpf2 = this.c.d("onGetLanguage");
        try {
            String[] stringArray = this.a();
            boolean bl2 = stringArray.j.get();
            if (!bl2) {
                ((heg)((heg)bwk.a.h()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTtsServicePeer", "onGetLanguage", 134, "GoogleTtsServicePeer.java")).r("onGetLanguage() called while disconnected.");
                stringArray = new String[]{"", "", ""};
            } else {
                stringArray = stringArray.c;
                Object object = stringArray.h;
                if (object == null) {
                    ((heg)((heg)bwi.a.g()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTTSServiceImpl", "onGetLanguage", 404, "GoogleTTSServiceImpl.java")).r("onGetLanguage called before setLanguage, returning en-US.");
                    stringArray = new String[]{"eng", "usa", ""};
                } else {
                    object = brz.g((String)object);
                    ((heg)((heg)bwi.a.f()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTTSServiceImpl", "onGetLanguage", 409, "GoogleTTSServiceImpl.java")).G("Current locale is %s, returning %s-%s", stringArray.h, ((Locale)object).getISO3Language(), ((Locale)object).getISO3Country());
                    stringArray = new String[]{((Locale)object).getISO3Language(), ((Locale)object).getISO3Country(), ""};
                }
            }
            return stringArray;
        }
        finally {
            try {
                gpf2.close();
            }
            catch (Throwable throwable) {
                Throwable throwable2;
                throwable2.addSuppressed(throwable);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List onGetVoices() {
        var21_1 = this.c.d("onGetVoices");
        try {
            block22: {
                var6_2 = this.a();
                if (!var6_2.j.get()) {
                    ((heg)((heg)bwk.a.h()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTtsServicePeer", "onGetVoices", 282, "GoogleTtsServicePeer.java")).r("onGetVoices() called while disconnected.");
                    var1_4 = gzx.d;
                    var5_6 = hct.a;
                    return var5_6;
                }
                var5_6 = var6_2.d.a(var6_2.h.getPackageManager(), Binder.getCallingUid());
                var22_8 = djv.a().b();
                var6_2 = var6_2.c;
                var7_9 = var6_2.j;
                var8_10 = var6_2.k.a((String)var5_6);
                var12_11 = var7_9.h.l().a();
                var11_12 = var7_9.c;
                var24_13 = new HashSet<Object>();
                var9_14 = new HashSet();
                var9_14.add("notInstalled");
                var9_14.add("networkTimeoutMs");
                var9_14.add("networkRetriesCount");
                var6_2 = new AbstractCollection();
                var6_2.add("networkTimeoutMs");
                var6_2.add("networkRetriesCount");
                var5_6 = new AbstractCollection();
                var5_6.add("notInstalled");
                var5_6.add("networkTimeoutMs");
                var5_6.add("networkRetriesCount");
                var5_6.add("legacySetLanguageVoice");
                var10_15 = new HashSet<String>();
                var10_15.add("networkTimeoutMs");
                var10_15.add("networkRetriesCount");
                var10_15.add("legacySetLanguageVoice");
                var25_16 = new HashSet<E>();
                var23_17 = new HashSet<E>();
                var13_18 = var12_11.entrySet().iterator();
                block5: while (true) {
                    if (!var13_18.hasNext()) {
                        var9_14 = var25_16.iterator();
                        break block22;
                    }
                    var26_29 = (buc)var13_18.next().getValue();
                    var4_21 = var11_12.containsKey(var26_29.c);
                    var27_30 = brz.g(brz.c((String)var26_29.d.get(0)));
                    var14_22 = var26_29.g.iterator();
                    var1_5 = 0;
                    block6: while (true) {
                        block25: {
                            block23: {
                                block24: {
                                    if (!var14_22.hasNext()) break block23;
                                    var15_23 = (bub)var14_22.next();
                                    var12_11 = var16_24 = bua.b(var15_23.d);
                                    if (var16_24 == null) {
                                        var12_11 = bua.a;
                                    }
                                    if (var12_11 != bua.e) break block24;
                                    var19_27 = var8_10;
                                    var17_25 = var7_9;
                                    var18_26 = var9_14;
                                    var16_24 = var6_2;
                                    var20_28 = var5_6;
                                    var2_19 = var1_5;
                                    if (!iss.c()) break block25;
                                }
                                var16_24 = var15_23.k.iterator();
                                var12_11 = var5_6;
                                var5_6 = var9_14;
                                var9_14 = var16_24;
                                break block5;
                            }
                            if (var1_5 == 0) continue block5;
                            var25_16.addAll(var26_29.d);
                            if (!var4_21) continue block5;
                            var23_17.addAll(var26_29.d);
                            continue block5;
                        }
                        while (true) {
                            var8_10 = var19_27;
                            var7_9 = var17_25;
                            var9_14 = var18_26;
                            var6_2 = var16_24;
                            var5_6 = var20_28;
                            var1_5 = var2_19;
                            continue block6;
                            break;
                        }
                        break;
                    }
                    break;
                }
                while (true) {
                    var19_27 = var8_10;
                    var17_25 = var7_9;
                    var18_26 = var5_6;
                    var16_24 = var6_2;
                    var20_28 = var12_11;
                    var2_19 = var1_5;
                    if (!var9_14.hasNext()) ** continue;
                    var17_25 = (bub)var9_14.next();
                    if (!var8_10.contains(((String)var26_29.d.get(0)).toLowerCase(Locale.getDefault())) && !cab.f((bub)var17_25)) continue;
                    var19_27 = var17_25.f;
                    if ((var15_23.c & 2048) != 0) {
                        var1_5 = var2_19 = blf.f(var15_23.n);
                        if (var2_19 == 0) {
                            var1_5 = 1;
                        }
                    } else {
                        var1_5 = 3;
                    }
                    var16_24 = true != var4_21 ? var5_6 : var6_2;
                    var3_20 = var17_25.c;
                    var17_25 = var18_26 = bua.b(var15_23.d);
                    if (var18_26 == null) {
                        var17_25 = bua.a;
                    }
                    var18_26 = var7_9.f;
                    if (var17_25 != bua.b) {
                        var17_25 = String.valueOf(var19_27);
                        var2_19 = var18_26.c(var1_5);
                        var20_28 = new Voice(var17_25.concat("-local"), var27_30, var2_19, 200, false, var16_24);
                        var24_13.add(var20_28);
                    }
                    if ((var3_20 & 128) != 0) {
                        var17_25 = String.valueOf(var19_27);
                        var1_5 = var18_26.c(var1_5);
                        var19_27 = new Voice(var17_25.concat("-network"), var27_30, var1_5, 200, true, var16_24);
                        var24_13.add(var19_27);
                    }
                    var1_5 = 1;
                }
            }
            while (var9_14.hasNext()) {
                var6_2 = brz.c((String)var9_14.next());
                var8_10 = String.valueOf(var6_2);
                var11_12 = brz.g((String)var6_2);
                var6_2 = true != var23_17.contains(var6_2) ? var5_6 : var10_15;
                var7_9 = new Voice(var8_10.concat("-language"), (Locale)var11_12, 400, 200, false, var6_2);
                var24_13.add(var7_9);
            }
            var5_6 = gzx.o(var24_13);
            var7_9 = djv.a();
            var6_2 = new AbstractCollection("GetVoices");
            var7_9.e(var22_8, (djt)var6_2);
            return var5_6;
        }
        finally {
            var21_1.close();
        }
    }

    protected final int onIsLanguageAvailable(String object, String object2, String object3) {
        int n2;
        bwk bwk2;
        block6: {
            object3 = this.c.d("onIsLanguageAvailable");
            bwk2 = this.a();
            if (bwk2.j.get()) break block6;
            ((heg)((heg)bwk.a.h()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTtsServicePeer", "onIsLanguageAvailable", 149, "GoogleTtsServicePeer.java")).r("onIsLanguageAvailable() called while disconnected.");
            n2 = -2;
        }
        drn drn2 = djv.a().b();
        Locale locale = new Locale((String)object, (String)object2);
        object = brz.h(locale).getLanguage();
        locale = new Locale((String)object, (String)object2);
        object2 = fxf.T(brz.h(locale).getCountry());
        n2 = bwk2.c.b((String)object, (String)object2, bwk2.d.a(bwk2.h.getPackageManager(), Binder.getCallingUid()));
        object = djv.a();
        object2 = new djt("IsLanguageAvailable");
        ((djv)object).e(drn2, (djt)object2);
        return n2;
        finally {
            object3.close();
        }
    }

    /*
     * Unable to fully structure code
     */
    public final int onIsValidVoiceName(String var1_1) {
        block10: {
            block11: {
                var5_3 = this.c.d("onIsValidVoiceName");
                var8_5 = this.a();
                var4_6 = var8_5.j.get();
                var2_7 = -1;
                if (var4_6) ** GOTO lbl10
                ((heg)((heg)bwk.a.h()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTtsServicePeer", "onIsValidVoiceName", 331, "GoogleTtsServicePeer.java")).r("onIsValidVoiceName() called while disconnected.");
                break block10;
lbl10:
                // 1 sources

                var6_8 = djv.a().b();
                var7_9 = var8_5.c;
                var8_5 = var8_5.d.a(var8_5.h.getPackageManager(), Binder.getCallingUid());
                var9_10 = var7_9.m;
                if (!var1_1.contains("language")) break block11;
                var3_11 = var7_9.c(var9_10, (var1_1 = brz.e((String)var1_1)).getLanguage(), var1_1.getCountry(), (String)var8_5);
                ** if (var3_11 != 0 && var3_11 != 1) goto lbl20
lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_7 = 0;
                        ** GOTO lbl37
                        break;
                    }
                }
lbl20:
                // 1 sources

                ** GOTO lbl37
            }
            try {
                var7_9 = var9_10.h((String)var1_1, null, null, var7_9.k.a((String)var8_5), (String)var8_5);
                if (var7_9 == null) ** GOTO lbl36
            }
            catch (Throwable var1_2) {
                try {
                    var5_3.close();
                }
                catch (Throwable var5_4) {
                    var1_2.addSuppressed(var5_4);
                }
                throw var1_2;
            }
            if (var1_1.contains(var7_9.l())) {
                ((heg)((heg)bwi.a.f()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTTSServiceImpl", "onIsValidVoiceName", 516, "GoogleTTSServiceImpl.java")).u("onIsValidVoiceName(%s): SUCCESS", var1_1);
                ** continue;
            }
lbl36:
            // 3 sources

            ((heg)((heg)bwi.a.f()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTTSServiceImpl", "onIsValidVoiceName", 519, "GoogleTTSServiceImpl.java")).u("onIsValidVoiceName(%s): ERROR", var1_1);
lbl37:
            // 3 sources

            var1_1 = djv.a();
            var7_9 = new djt("IsValidVoiceName");
            var1_1.e(var6_8, (djt)var7_9);
        }
        var5_3.close();
        return var2_7;
    }

    protected final int onLoadLanguage(String string, String string2, String object) {
        int n2;
        block9: {
            Object object2;
            block8: {
                object = this.c.d("onLoadLanguage");
                object2 = this.a();
                if (((bwk)object2).j.get()) break block8;
                ((heg)((heg)bwk.a.h()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTtsServicePeer", "onLoadLanguage", 174, "GoogleTtsServicePeer.java")).r("onLoadLanguage() called while disconnected.");
                n2 = -2;
            }
            ((bwk)object2).m.a();
            Object object3 = new Locale(string, string2);
            string = brz.h((Locale)object3).getLanguage();
            object3 = new Locale(string, string2);
            string2 = fxf.T(brz.h((Locale)object3).getCountry());
            object3 = ((bwk)object2).c;
            Object object4 = ((bwk)object2).d.a(((bwk)object2).h.getPackageManager(), Binder.getCallingUid());
            object2 = ((bwi)object3).m.f(null, string, string2, "LocalOnly", 1, ((bwi)object3).k.a((String)object4), false, (String)object4);
            if (object2 != null) {
                ((bwi)object3).h = (String)((bso)object2).j().get(0);
                ((heg)((heg)bwi.a.c()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTTSServiceImpl", "onLoadLanguage", 362, "GoogleTTSServiceImpl.java")).u("Loading voice %s", ((bso)object2).m());
                object4 = new ivu(null);
                bss bss2 = ((bwi)object3).b;
                bws bws2 = new bws();
                bss2.d((bso)object2, bws2, (ivu)object4);
                ((bwi)object3).f.e((ivu)object4);
                n2 = ((bwi)object3).a((bso)object2, brz.f(string, string2));
                break block9;
            }
            n2 = ((bwi)object3).b(string, string2, (String)object4);
        }
        return n2;
        finally {
            try {
                object.close();
            }
            catch (Throwable throwable) {
                Throwable throwable2;
                throwable2.addSuppressed(throwable);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int onLoadVoice(String object) {
        gpf gpf2 = this.c.d("onLoadVoice");
        try {
            Object object2 = this.a();
            boolean bl2 = ((bwk)object2).j.get();
            int n2 = -2;
            if (!bl2) {
                ((heg)((heg)bwk.a.h()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTtsServicePeer", "onLoadVoice", 353, "GoogleTtsServicePeer.java")).r("onLoadVoice() called while disconnected.");
            } else {
                bwi bwi2 = ((bwk)object2).c;
                object2 = ((bwk)object2).d.a(((bwk)object2).h.getPackageManager(), Binder.getCallingUid());
                if ((object2 = bwi2.m.f((String)object, null, null, "LocalOnly", 1, bwi2.k.a((String)object2), true, (String)object2)) != null) {
                    bwi2.h = (String)((bso)object2).j().get(0);
                    ivu ivu2 = new ivu(null);
                    bss bss2 = bwi2.b;
                    object = new bws();
                    bss2.d((bso)object2, (bws)object, ivu2);
                    bwi2.f.e(ivu2);
                    n2 = 1;
                }
            }
            gpf2.close();
            return n2;
        }
        catch (Throwable throwable) {
            try {
                gpf2.close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                throwable.addSuppressed(throwable2);
            }
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final void onStop() {
        gpf gpf2 = this.c.d("onStop");
        Object object = this.a();
        if (!((bwk)object).j.get()) {
            ((heg)((heg)bwk.a.h()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTtsServicePeer", "onStop", 193, "GoogleTtsServicePeer.java")).r("onStop() called while disconnected.");
            return;
        }
        ((bwk)object).m.a();
        object = ((bwk)object).c;
        Object object2 = ((bwi)object).b;
        ((bss)object2).b = true;
        object2 = ((bss)object2).a.iterator();
        while (object2.hasNext()) {
            ((bsr)object2.next()).e = true;
        }
        Object object3 = ((bwi)object).c;
        object2 = ((bvo)object3).c;
        synchronized (object2) {
            Future future = ((bvo)object3).d;
            if (future == null) break block13;
            future.cancel(false);
        }
        {
            block13: {
            }
            ((bvo)object3).e = true;
            object3 = ((bvo)object3).f;
            if (object3 != null) {
                ((bvs)object3).z(-2);
            }
        }
        try {
            if (!itk.c()) return;
            ((bwi)object).e.c = true;
            return;
        }
        finally {
            gpf2.close();
        }
    }

    /*
     * Exception decompiling
     */
    protected final void onSynthesizeText(SynthesisRequest var1_1, SynthesisCallback var2_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [7 : 451->481)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final void onTrimMemory(int n2) {
        gpf gpf2;
        block10: {
            Object object;
            block11: {
                goi goi2 = this.c;
                object = goi2.a();
                gpc gpc2 = gno.b();
                gpf2 = goi2.b("TrimMemory");
                gpf2 = new gog(fxf.at(goi2.f("onTrimMemory"), gqv.a, (gop)object), gpf2, gpc2);
                object = this.a();
                if (!((bwk)object).j.get()) {
                    ((heg)((heg)bwk.a.h()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTtsServicePeer", "onTrimMemory", 367, "GoogleTtsServicePeer.java")).r("onTrimMemory() called while disconnected.");
                    break block10;
                }
                object = ((bwk)object).c;
                ((heg)((heg)bwi.a.f()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTTSServiceImpl", "onTrimMemory", 586, "GoogleTTSServiceImpl.java")).u("Cache enabled: %b", itk.c());
                if (!itk.c()) break block10;
                if (n2 < 20) break block11;
                ((heg)((heg)bwi.a.f()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTTSServiceImpl", "onTrimMemory", 591, "GoogleTTSServiceImpl.java")).r("Flushing cache");
                ((bwi)object).e.a();
                break block10;
            }
            if (n2 >= 15) {
                if (((bwi)object).g.b(((bwi)object).d)) {
                    ((heg)((heg)bwi.a.f()).j("com/google/android/apps/speech/tts/googletts/service/GoogleTTSServiceImpl", "onTrimMemory", 597, "GoogleTTSServiceImpl.java")).r("Flushing cache (low ram device)");
                    ((bwi)object).e.a();
                    break block10;
                }
                ((bwi)object).e.b.l();
            }
        }
        return;
        finally {
            gpf2.close();
        }
    }
}

