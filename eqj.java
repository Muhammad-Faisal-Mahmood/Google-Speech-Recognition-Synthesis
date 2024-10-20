/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public final class eqj {
    private static final hei f = hei.m("com/google/android/libraries/search/audio/microphone/source/registry/AudioSourceDataRegistry");
    public final Executor a;
    public final hou b;
    public final Set c;
    public final czh d;
    public final dlm e;
    private final enx g;
    private final enu h;
    private final jvb i;
    private final boolean j;
    private final List k;
    private final dpq l;
    private final dml m;
    private final fpo n;
    private final fpo o;
    private final bzb p;
    private final bmu q;

    public eqj(enx enx2, dml dml2, fpo fpo2, enu enu2, dpq dpq2, fpo fpo3, Executor executor, jvb jvb2, czh czh2, hou hou2, bmu bmu2, boolean bl2, dlm dlm2, bzb bzb2) {
        jse.e(enu2, "audioSessionToMicStateUpdater");
        jse.e(executor, "lightweightExecutor");
        jse.e(jvb2, "lightweightScope");
        jse.e(hou2, "audioExecutionSequencer");
        jse.e(bzb2, "sessionAudioStoreFactory");
        this.g = enx2;
        this.m = dml2;
        this.n = fpo2;
        this.h = enu2;
        this.l = dpq2;
        this.o = fpo3;
        this.a = executor;
        this.i = jvb2;
        this.d = czh2;
        this.b = hou2;
        this.q = bmu2;
        this.j = bl2;
        this.e = dlm2;
        this.p = bzb2;
        this.k = new ArrayList();
        this.c = new LinkedHashSet();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(jrk jrk2) {
        synchronized (this) {
            this.c.add(jrk2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(int n2, ebv ebv2) {
        synchronized (this) {
            eqh eqh22;
            block6: {
                jse.e(ebv2, "reason");
                for (eqh eqh22 : this.k) {
                    if (((eqh)eqh22).c.a != n2) continue;
                    break block6;
                }
                eqh22 = null;
            }
            eqh22 = eqh22;
            if (eqh22 == null) {
                return;
            }
            Object object = this.k;
            Object object2 = new epl(n2, 3);
            jns.E((List)object, (jrk)object2);
            ((heg)f.f().h(hfo.a, "ALT.AudioSrcDataRegy").j("com/google/android/libraries/search/audio/microphone/source/registry/AudioSourceDataRegistry", "markStopped", 428, "AudioSourceDataRegistry.kt")).A("#audio# stopping(%s) audio source session(%d)", ebv2.name(), eqh22.c.a);
            if (ebv2 == ebv.e) {
                object = this.d;
                object2 = eqh22.b.b;
                jse.e(object2, "clientInfo");
                object = (eng)((enc)((czh)object).b).b.b();
                object2 = eio.a(((eip)object2).b).name();
                ((fsx)((eng)object).n.a()).b(object2);
            }
            object2 = this.b;
            object = new ctz(eqh22, ebv2, 20);
            jse.d(((hou)object2).b(gqk.c((hnx)object), this.a), "submitAsync(...)");
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final eaj c(eqg var1_1, eqv var2_2, eqm var3_3, eqe var4_4) {
        synchronized (this) {
            block116: {
                block104: {
                    block117: {
                        block118: {
                            block119: {
                                block103: {
                                    block101: {
                                        block102: {
                                            block100: {
                                                var11_5 = eqj.f;
                                                ((heg)var11_5.f().h(hfo.a, "ALT.AudioSrcDataRegy").j("com/google/android/libraries/search/audio/microphone/source/registry/AudioSourceDataRegistry", "startAudioSessionSource$java_com_google_android_libraries_search_audio_microphone_source_registry_audio_source_data_registry", 123, "AudioSourceDataRegistry.kt")).G("#audio# starting audio source session(%d) on %s for %s", var3_3.a, var2_2.a(), var1_1.a());
                                                ((heg)var11_5.f().h(hfo.a, "ALT.AudioSrcDataRegy").j("com/google/android/libraries/search/audio/microphone/source/registry/AudioSourceDataRegistry", "enforceConcurrencyStateOnNewAudioSource", 208, "AudioSourceDataRegistry.kt")).u("#audio# enforcing concurrency state on a new audio source of %s", var1_1.a());
                                                for (Object var11_5 : this.k) {
                                                    if (((eqh)var11_5).b.a != var1_1.a) continue;
                                                    break block100;
                                                }
                                                var11_5 = null;
                                            }
                                            var11_5 = (eqh)var11_5;
                                            if (var11_5 != null) {
                                                this.b(var11_5.c.a, ebv.q);
                                            }
                                            var12_7 = var2_2.b;
                                            var11_5 = var3_3.b;
                                            var13_8 = ewl.a;
                                            var14_9 = ewl.b((ekk)var12_7, (eao)var11_5);
                                            if (var14_9 != null) {
                                                var15_12 = var4_4.a.iterator();
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                while (true) {
                                                    var12_7 = null;
                                                    break block101;
                                                    break;
                                                }
                                            }
                                            while (var15_12.hasNext()) {
                                                var12_7 = var15_12.next();
                                                var16_13 = (eqt)var12_7;
                                                var11_5 = var13_8 = var3_3.b.g;
                                                if (var13_8 == null) {
                                                    var11_5 = eae.a;
                                                }
                                                jse.d(var11_5, "getAudioLibInputParams(...)");
                                                var13_8 = var16_13.d;
                                                jse.e(var11_5, "expectedParams");
                                                if (!((epa)var13_8).g.g()) {
                                                    ((heg)ewl.a.h().h(hfo.a, "ALT.SeamlessUtils").j("com/google/android/libraries/search/audio/utils/SeamlessUtils", "canHandoff", 54, "SeamlessUtils.kt")).r("#audio# can't handoff, no handover handler found");
                                                    continue;
                                                }
                                                var5_10 = ((eou)((epa)var13_8).g.c()).b;
                                                var6_11 = var14_9.b;
                                                if (var5_10 != var6_11) {
                                                    ((heg)ewl.a.h().h(hfo.a, "ALT.SeamlessUtils").j("com/google/android/libraries/search/audio/utils/SeamlessUtils", "canHandoff", 62, "SeamlessUtils.kt")).v("#audio# can't handoff, id mismatch: current(%d), expected(%d)", var5_10, var6_11);
                                                    continue;
                                                }
                                                var13_8 = ((epa)var13_8).h;
                                                var6_11 = var13_8.d;
                                                var5_10 = var11_5.d;
                                                if (var6_11 != var5_10) {
                                                    ((heg)ewl.a.h().h(hfo.a, "ALT.SeamlessUtils").j("com/google/android/libraries/search/audio/utils/SeamlessUtils", "canHandoff", 71, "SeamlessUtils.kt")).v("#audio# can't handoff, sample rate mismatch: current(%d Hz), expected(%d Hz)", var6_11, var5_10);
                                                    continue;
                                                }
                                                var5_10 = var13_8.e;
                                                var6_11 = var11_5.e;
                                                if (!(ewl.b.contains(var6_11) == false ? var6_11 != var5_10 : ewl.b.contains(var5_10) == false)) {
                                                    var5_10 = var13_8.f;
                                                    var6_11 = var11_5.f;
                                                    if (var5_10 != var6_11) {
                                                        ((heg)ewl.a.h().h(hfo.a, "ALT.SeamlessUtils").j("com/google/android/libraries/search/audio/utils/SeamlessUtils", "canHandoff", 95, "SeamlessUtils.kt")).v("#audio# can't handoff, encoding mismatch: current(%d), expected(%d)", var5_10, var6_11);
                                                        continue;
                                                    }
                                                    if (var13_8.m != var11_5.m) {
                                                        ((heg)ewl.a.h().h(hfo.a, "ALT.SeamlessUtils").j("com/google/android/libraries/search/audio/utils/SeamlessUtils", "canHandoff", 105, "SeamlessUtils.kt")).F("#audio# can't handoff, push mechanism flag mismatch: current(%b), expected(%b)", var13_8.m, var11_5.m);
                                                        continue;
                                                    }
                                                    break block102;
                                                }
                                                ((heg)ewl.a.h().h(hfo.a, "ALT.SeamlessUtils").j("com/google/android/libraries/search/audio/utils/SeamlessUtils", "canHandoff", 83, "SeamlessUtils.kt")).v("#audio# can't handoff, channel config mismatch: current(%d), expected(%d)", var5_10, var6_11);
                                            }
                                            var12_7 = null;
                                        }
                                        if ((var11_5 = (eqt)var12_7) == null) {
                                            ((heg)eqj.f.f().h(hfo.a, "ALT.AudioSrcDataRegy").j("com/google/android/libraries/search/audio/microphone/source/registry/AudioSourceDataRegistry", "maybeHandoff", 235, "AudioSourceDataRegistry.kt")).s("#audio# session(%d) seamless start failed, starting normally", var3_3.a);
                                            ** continue;
                                        }
                                        ((heg)eqj.f.f().h(hfo.a, "ALT.AudioSrcDataRegy").j("com/google/android/libraries/search/audio/microphone/source/registry/AudioSourceDataRegistry", "maybeHandoff", 239, "AudioSourceDataRegistry.kt")).s("#audio# starting session(%d) seamlessly", var3_3.a);
                                        var5_10 = var14_9.c;
                                        var14_9 = new eow(var5_10);
                                        var12_7 = var11_5.d;
                                        var13_8 = new eov((eoy)var14_9, (eot)var12_7);
                                        var12_7 = var4_4.b;
                                        if (var12_7 != null) {
                                            var12_7.a(var11_5.a);
                                        }
                                        var12_7 = this.b;
                                        var11_5 = new cqg(var13_8, 14);
                                        var14_9 = var12_7.b(gqk.c((hnx)var11_5), this.a);
                                        jse.d(var14_9, "submitAsync(...)");
                                        var15_12 = this.g;
                                        var16_13 = var13_8.j();
                                        var5_10 = var3_3.a;
                                        var11_5 = var3_3.b;
                                        if (var11_5.e == 14) {
                                            var11_5 = var12_7 = eyf.b((Integer)var11_5.f);
                                            if (var12_7 == null) {
                                                var11_5 = eyf.a;
                                            }
                                        } else {
                                            var11_5 = eyf.a;
                                        }
                                        jse.d(var11_5, "getAttributionId(...)");
                                        var15_12.a((hpn)var14_9, (hpn)var16_13, var5_10, crh.G((eyf)var11_5));
                                        var12_7 = this.d;
                                        var11_5 = var1_1.b;
                                        var15_12 = var13_8.d().b();
                                        jse.e(var11_5, "clientInfo");
                                        jse.e(var14_9, "startResult");
                                        var12_7.y("SEAMLESS", (eip)var11_5, (hpn)var15_12, (hpn)var14_9);
                                        var12_7 = new eqn((eot)var13_8, (hpn)var14_9);
                                    }
                                    var11_5 = var12_7;
                                    if (var12_7 != null) break block104;
                                    var14_9 = new eqi(this, (eqv)var2_2, (eqm)var3_3, (eqg)var1_1, 0);
                                    if (!this.j || var1_1.b.b != 15) ** GOTO lbl246
                                    var13_8 = var4_4.a.iterator();
                                    while (var13_8.hasNext()) {
                                        block106: {
                                            block115: {
                                                block114: {
                                                    block113: {
                                                        block112: {
                                                            block111: {
                                                                block110: {
                                                                    block109: {
                                                                        block108: {
                                                                            block107: {
                                                                                block105: {
                                                                                    var12_7 = var13_8.next();
                                                                                    var15_12 = (eqt)var12_7;
                                                                                    var11_5 = var2_2.b;
                                                                                    var4_4 = var3_3.b;
                                                                                    jse.e(var11_5, "expectedRoute");
                                                                                    jse.e(var4_4, "expectedParams");
                                                                                    jse.e(var15_12, "sourceToShare");
                                                                                    var16_13 = eay.a(var15_12.c.b.b.b);
                                                                                    jse.d(var16_13, "getAudioRouteCase(...)");
                                                                                    if (eay.a(var11_5.b.b) == var16_13) break block105;
                                                                                    var5_10 = 7;
                                                                                    break block106;
                                                                                }
                                                                                if (var16_13 == eay.b) break block107;
                                                                                var5_10 = 3;
                                                                                break block106;
                                                                            }
                                                                            var11_5 = ean.a(var4_4.c);
                                                                            jse.d(var11_5, "getOptionalAudioInputModeCase(...)");
                                                                            var16_13 = ewm.a;
                                                                            if (var11_5 != ean.f) break block108;
                                                                            var11_5 = ecv.a(((ecw)var15_12.b).c);
                                                                            jse.d(var11_5, "getOptionalAudioInputModeCase(...)");
                                                                            if (var11_5 == ecv.c) break block109;
                                                                        }
                                                                        var5_10 = 6;
                                                                        break block106;
                                                                    }
                                                                    var5_10 = var4_4.b;
                                                                    if ((var5_10 & 2) == 0) break block110;
                                                                    var5_10 = 4;
                                                                    break block106;
                                                                }
                                                                if ((var5_10 & 4) == 0) break block111;
                                                                var5_10 = 5;
                                                                break block106;
                                                            }
                                                            var16_13 = ((epa)var15_12.d).h;
                                                            var4_4 = var11_5 = var4_4.g;
                                                            if (var11_5 == null) {
                                                                var4_4 = eae.a;
                                                            }
                                                            jse.d(var4_4, "getAudioLibInputParams(...)");
                                                            var5_10 = var6_11 = var16_13.c;
                                                            if (var6_11 == 1999) {
                                                                var5_10 = 6;
                                                            }
                                                            if (var5_10 == var4_4.c) break block112;
                                                            var5_10 = 8;
                                                            break block106;
                                                        }
                                                        if (var16_13.d == var4_4.d) break block113;
                                                        var5_10 = 10;
                                                        break block106;
                                                    }
                                                    var7_14 = var16_13.f;
                                                    if (var7_14 == var4_4.f) break block114;
                                                    var5_10 = 11;
                                                    break block106;
                                                }
                                                if (var16_13.m == var4_4.m) break block115;
                                                var5_10 = 9;
                                                break block106;
                                            }
                                            var5_10 = var4_4.e;
                                            var6_11 = var16_13.e;
                                            if (var5_10 == var6_11) ** GOTO lbl-1000
                                            try {
                                                var11_5 = ewj.b(var7_14);
                                            }
                                            catch (Throwable var11_6) {
                                                var11_5 = jns.aj(var11_6);
                                            }
                                            if (joe.a(var11_5) != null || !ewm.a.contains(var4_4.e) || !ewm.a.contains(var16_13.e)) {
                                                var5_10 = 12;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var5_10 = ((epa)var15_12.d).f.isDone() != false ? 2 : 1;
                                            }
                                        }
                                        if (var5_10 == 1) {
                                            var4_4 = var12_7;
                                            break block103;
                                        }
                                        var11_5 = (heg)eqj.f.c().h(hfo.a, "ALT.AudioSrcDataRegy").j("com/google/android/libraries/search/audio/microphone/source/registry/AudioSourceDataRegistry", "maybeShareHotword", 291, "AudioSourceDataRegistry.kt");
                                        var6_11 = var15_12.a;
                                        switch (var5_10) {
                                            default: {
                                                var4_4 = "CHANNELS_INCOMPATIBLE";
                                                break;
                                            }
                                            case 11: {
                                                var4_4 = "ENCODING_INCOMPATIBLE";
                                                break;
                                            }
                                            case 10: {
                                                var4_4 = "RATE_INCOMPATIBLE";
                                                break;
                                            }
                                            case 9: {
                                                var4_4 = "BUFFERS_INCOMPATIBLE";
                                                break;
                                            }
                                            case 8: {
                                                var4_4 = "SOURCE_INCOMPATIBLE";
                                                break;
                                            }
                                            case 7: {
                                                var4_4 = "ROUTES_INCOMPATIBLE";
                                                break;
                                            }
                                            case 6: {
                                                var4_4 = "INPUT_MODE_INCOMPATIBLE";
                                                break;
                                            }
                                            case 5: {
                                                var4_4 = "TALKBACK_MUTING_REQUESTED";
                                                break;
                                            }
                                            case 4: {
                                                var4_4 = "EMULATED_MODE_REQUESTED";
                                                break;
                                            }
                                            case 3: {
                                                var4_4 = "ROUTE_NOT_BUILTIN";
                                                break;
                                            }
                                            case 2: {
                                                var4_4 = "SOURCE_ALREADY_STOPPED";
                                            }
                                        }
                                        var11_5.x("#audio# not sharing hotword session(%d, %s)", var6_11, var4_4);
                                    }
                                    var4_4 = null;
                                }
                                var13_8 = (eqt)var4_4;
                                if (var13_8 != null) {
                                    ((heg)eqj.f.f().h(hfo.a, "ALT.AudioSrcDataRegy").j("com/google/android/libraries/search/audio/microphone/source/registry/AudioSourceDataRegistry", "maybeShareHotword", 299, "AudioSourceDataRegistry.kt")).s("#audio# sharing hotword source for session(%d)", var3_3.a);
                                    var4_4 = this.q;
                                    var12_7 = new eop(var13_8, 7);
                                    var11_5 = new eox((jqz)var12_7);
                                    var12_7 = var13_8.d;
                                    var13_8 = new eov((eoy)var11_5, (eot)var12_7);
                                    var13_8 = var4_4.G((eot)var13_8);
                                    var15_12 = var14_9.a(var13_8);
                                    var12_7 = this.g;
                                    var16_13 = var13_8.f;
                                    var5_10 = var3_3.a;
                                    var4_4 = var3_3.b;
                                    if (var4_4.e == 14) {
                                        var4_4 = var11_5 = eyf.b((Integer)var4_4.f);
                                        if (var11_5 == null) {
                                            var4_4 = eyf.a;
                                        }
                                    } else {
                                        var4_4 = eyf.a;
                                    }
                                    jse.d(var4_4, "getAttributionId(...)");
                                    var12_7.a((hpn)var15_12, (hpn)var16_13, var5_10, crh.G((eyf)var4_4));
                                    var4_4 = new eqn((eot)var13_8, (hpn)var15_12);
                                } else {
                                    ((heg)eqj.f.f().h(hfo.a, "ALT.AudioSrcDataRegy").j("com/google/android/libraries/search/audio/microphone/source/registry/AudioSourceDataRegistry", "maybeShareHotword", 295, "AudioSourceDataRegistry.kt")).s("#audio# no shareable hotword source for(%d)", var3_3.a);
lbl246:
                                    // 2 sources

                                    var4_4 = null;
                                }
                                if (var4_4 != null) break block116;
                                var4_4 = var2_2.b.b;
                                switch (eay.a(var4_4.b).ordinal()) {
                                    default: {
                                        break block117;
                                    }
                                    case 7: {
                                        var13_8 = this.o;
                                        var12_7 = var1_1.b;
                                        var15_12 = gto.h(var1_1.a);
                                        var5_10 = var3_3.a;
                                        var16_13 = this.l;
                                        var11_5 = var2_2.b;
                                        var16_13 = var16_13.a(edo.d, (ekk)var11_5);
                                        var4_4 = var4_4.b == 8 ? (ebi)var4_4.c : ebi.a;
                                        jse.d(var4_4, "getGacsAudioRoute(...)");
                                        var17_15 = var3_3.b;
                                        jse.e(var4_4, "<this>");
                                        jse.e(var17_15, "audioRequestMicInputParams");
                                        if ((1 & var4_4.b) != 0) {
                                            var4_4 = var11_5 = var4_4.c;
                                            if (var11_5 == null) {
                                                var4_4 = ebm.a;
                                            }
                                            jse.d(var4_4, "getPrecachedBufferId(...)");
                                            var4_4 = dpf.m((ebm)var4_4, var17_15);
                                        } else {
                                            var19_18 = dpf.s(edp.a.l());
                                            var18_20 = dpf.p(edq.a.l());
                                            var4_4 = var11_5 = var17_15.g;
                                            if (var11_5 == null) {
                                                var4_4 = eae.a;
                                            }
                                            var18_20.n((eae)var4_4);
                                            var19_18.t(var18_20.m());
                                            var4_4 = var19_18.r();
                                        }
                                        var4_4 = var13_8.d((eip)var12_7, (gto)var15_12, var5_10, (eds)var16_13, (edp)var4_4);
                                        break;
                                    }
                                    case 6: {
                                        var15_12 = this.o;
                                        var12_7 = var1_1.b;
                                        var13_8 = gto.h(var1_1.a);
                                        var5_10 = var3_3.a;
                                        var16_13 = this.l;
                                        var11_5 = var2_2.b;
                                        var16_13 = var16_13.a(edo.c, (ekk)var11_5);
                                        var4_4 = var4_4.b == 7 ? (ebf)var4_4.c : ebf.a;
                                        var4_4 = var11_5 = var4_4.c;
                                        if (var11_5 == null) {
                                            var4_4 = ebm.a;
                                        }
                                        jse.d(var4_4, "getPrecachedBufferId(...)");
                                        var4_4 = var15_12.d((eip)var12_7, (gto)var13_8, var5_10, (eds)var16_13, dpf.m((ebm)var4_4, var3_3.b));
                                        break;
                                    }
                                    case 5: {
                                        var15_12 = this.o;
                                        var12_7 = var1_1.b;
                                        var13_8 = gto.h(var1_1.a);
                                        var5_10 = var3_3.a;
                                        var11_5 = this.l;
                                        var16_13 = var2_2.b;
                                        var16_13 = var11_5.a(edo.b, (ekk)var16_13);
                                        var4_4 = var4_4.b == 6 ? (ebn)var4_4.c : ebn.a;
                                        var4_4 = var11_5 = var4_4.b;
                                        if (var11_5 == null) {
                                            var4_4 = ebm.a;
                                        }
                                        jse.d(var4_4, "getPrecachedBufferId(...)");
                                        var4_4 = var15_12.d((eip)var12_7, (gto)var13_8, var5_10, (eds)var16_13, dpf.m((ebm)var4_4, var3_3.b));
                                        break;
                                    }
                                    case 4: {
                                        var2_2 = crh.L((eaz)var4_4);
                                        var3_3 = new StringBuilder();
                                        var3_3.append("Route(");
                                        var3_3.append((String)var2_2);
                                        var3_3.append(") is unexpected");
                                        var1_1 = new IllegalStateException(var3_3.toString());
                                        throw var1_1;
                                    }
                                    case 3: {
                                        var13_8 = this.o;
                                        var12_7 = var1_1.b;
                                        var15_12 = gto.h(var1_1.a);
                                        var5_10 = var3_3.a;
                                        var11_5 = this.l;
                                        var16_13 = var2_2.b;
                                        var16_13 = var11_5.a(edo.a, (ekk)var16_13);
                                        var4_4 = var4_4.b == 4 ? (eba)var4_4.c : eba.a;
                                        jse.d(var4_4, "getBistoAudioRoute(...)");
                                        var17_16 = var3_3.b;
                                        jse.e(var4_4, "<this>");
                                        jse.e(var17_16, "audioRequestMicInputParams");
                                        if ((var4_4.b & 2) != 0) {
                                            var4_4 = var11_5 = var4_4.d;
                                            if (var11_5 == null) {
                                                var4_4 = ebm.a;
                                            }
                                            jse.d(var4_4, "getPrecachedBufferId(...)");
                                            var4_4 = dpf.m((ebm)var4_4, var17_16);
                                        } else {
                                            var18_21 = gto.h(doc.d((ebb)var4_4));
                                            jse.e(var17_16, "audioRequestMicInputParams");
                                            var4_4 = var11_5 = var17_16.g;
                                            if (var11_5 == null) {
                                                var4_4 = eae.a;
                                            }
                                            jse.d(var4_4, "getAudioLibInputParams(...)");
                                            var4_4 = dpf.n((gto)var18_21, (eae)var4_4);
                                            var11_5 = (hwp)var4_4.C(5);
                                            var11_5.x((hwv)var4_4);
                                            var18_21 = dpf.s((hwp)var11_5);
                                            if (var17_16.e == 14) {
                                                var4_4 = var11_5 = eyf.b((Integer)var17_16.f);
                                                if (var11_5 == null) {
                                                    var4_4 = eyf.a;
                                                }
                                            } else {
                                                var4_4 = eyf.a;
                                            }
                                            var18_21.s((eyf)var4_4);
                                            var4_4 = var18_21.r();
                                        }
                                        var4_4 = var13_8.d((eip)var12_7, (gto)var15_12, var5_10, (eds)var16_13, (edp)var4_4);
                                        break;
                                    }
                                    case 0: 
                                    case 1: 
                                    case 2: 
                                    case 8: {
                                        var17_17 = this.n;
                                        var16_13 = var3_3.b;
                                        var15_12 = var1_1.b;
                                        var18_22 = var2_2.b;
                                        var5_10 = var2_2.a;
                                        var7_14 = var3_3.a;
                                        var6_11 = var1_1.a;
                                        var19_19 = new emm((eip)var15_12, var5_10, var7_14, var6_11);
                                        var4_4 = var11_5 = var16_13.g;
                                        if (var11_5 == null) {
                                            var4_4 = eae.a;
                                        }
                                        if ((var4_4.b & 256) != 0) {
                                            var4_4 = var11_5 = var16_13.g;
                                            if (var11_5 == null) {
                                                var4_4 = eae.a;
                                            }
                                            var12_7 = new els((eae)var4_4);
                                            var11_5 = gto.i(var12_7);
                                        } else {
                                            var11_5 = gsl.a;
                                        }
                                        var20_23 = var17_17.f;
                                        var4_4 = var12_7 = var16_13.g;
                                        if (var12_7 == null) {
                                            var4_4 = eae.a;
                                        }
                                        var21_24 = new gzs();
                                        var12_7 = var17_17.c;
                                        var16_13.getClass();
                                        var13_8 = new efd((eao)var16_13, (dml)((bzq)var12_7).a.b());
                                        var21_24.h(var13_8);
                                        var22_25 = var17_17.e;
                                        var12_7 = var13_8 = var16_13.g;
                                        if (var13_8 == null) {
                                            var12_7 = eae.a;
                                        }
                                        var21_24.h(((bzq)var22_25).x((eae)var12_7));
                                        var22_25 = var17_17.a;
                                        var12_7 = var13_8 = var16_13.g;
                                        if (var13_8 == null) {
                                            var12_7 = eae.a;
                                        }
                                        var21_24.h(((dtu)var22_25).c((eae)var12_7));
                                        var12_7 = var21_24.g();
                                        var20_23 = ((dtu)var20_23).l((eae)var4_4, (gto)var11_5, (List)var12_7);
                                        var21_24 = var17_17.d;
                                        new efz(eio.a(var15_12.b));
                                        var4_4 = var13_8 = ((egj)var21_24).b();
                                        if (var13_8 == null) {
                                            if (var16_13.c == 5 && ((egj)var21_24).a.g()) {
                                                var12_7 = (efy)((egj)var21_24).a.c();
                                                if (var16_13.c == 5) {
                                                    var4_4 = (String)var16_13.d;
                                                }
                                                var4_4 = var12_7.a();
                                            } else if ((var16_13.b & 2) != 0 && var16_13.h) {
                                                var13_8 = ((egj)var21_24).e;
                                                var4_4 = var12_7 = var16_13.g;
                                                if (var12_7 == null) {
                                                    var4_4 = eae.a;
                                                }
                                                var4_4 = var13_8.g((eae)var4_4);
                                            } else {
                                                var12_7 = var16_13.c == 13 ? (edg)var16_13.d : edg.a;
                                                var4_4 = var13_8;
                                                if ((var12_7.b & 1) != 0) {
                                                    var12_7 = ((egj)var21_24).d;
                                                    var4_4 = var16_13.c == 13 ? (edg)var16_13.d : edg.a;
                                                    var4_4 = var12_7.f(var4_4.c);
                                                }
                                            }
                                        }
                                        if (var4_4 == null) ** GOTO lbl431
                                        egj.a((gto)var11_5);
                                        ** GOTO lbl490
lbl431:
                                        // 1 sources

                                        var22_25 = ((egj)var21_24).c;
                                        var13_8 = efx.a.l();
                                        var4_4 = var12_7 = var16_13.g;
                                        if (var12_7 == null) {
                                            var4_4 = eae.a;
                                        }
                                        if (!var13_8.b.B()) {
                                            var13_8.u();
                                        }
                                        var23_26 = var13_8.b;
                                        var12_7 = (efx)var23_26;
                                        var4_4.getClass();
                                        var12_7.e = var4_4;
                                        var12_7.b |= 1;
                                        var8_27 = ((egj)var21_24).b;
                                        if (!var23_26.B()) {
                                            var13_8.u();
                                        }
                                        var5_10 = (int)var8_27;
                                        var4_4 = (efx)var13_8.b;
                                        var4_4.b |= 64;
                                        var4_4.k = var5_10;
                                        if (var16_13.c == 10) {
                                            var10_28 = (Boolean)var16_13.d;
                                            if (!var13_8.b.B()) {
                                                var13_8.u();
                                            }
                                            var4_4 = (efx)var13_8.b;
                                            var4_4.b |= 4;
                                            var4_4.g = var10_28;
                                        }
                                        if (var16_13.c == 17) {
                                            if (!var13_8.b.B()) {
                                                var13_8.u();
                                            }
                                            var4_4 = (efx)var13_8.b;
                                            var4_4.b |= 8;
                                            var4_4.h = true;
                                        }
                                        if ((var6_11 = dpf.f(var5_10 = var16_13.e)) == 0) break block118;
                                        if (var6_11 != 1) ** GOTO lbl475
                                        var4_4 = var5_10 == 12 ? (edk)var16_13.f : edk.a;
                                        if (!var13_8.b.B()) {
                                            var13_8.u();
                                        }
                                        var12_7 = (efx)var13_8.b;
                                        var4_4.getClass();
                                        var12_7.d = var4_4;
                                        var12_7.c = 4;
                                        ** GOTO lbl489
lbl475:
                                        // 1 sources

                                        var6_11 = dpf.f(var5_10);
                                        if (var6_11 == 0) break block119;
                                        if (var6_11 == 2) {
                                            if (var5_10 == 14) {
                                                var4_4 = var12_7 = eyf.b((Integer)var16_13.f);
                                                if (var12_7 == null) {
                                                    var4_4 = eyf.a;
                                                }
                                            } else {
                                                var4_4 = eyf.a;
                                            }
                                            if (!var13_8.b.B()) {
                                                var13_8.u();
                                            }
                                            var12_7 = (efx)var13_8.b;
                                            var12_7.d = var4_4.a();
                                            var12_7.c = 6;
                                        }
lbl489:
                                        // 4 sources

                                        var4_4 = var22_25.a((efx)var13_8.o(), (gto)var11_5, var19_19);
lbl490:
                                        // 2 sources

                                        var12_7 = dww.h((ekk)var18_22, (efo)var4_4);
                                        var13_8 = var17_17.b;
                                        var4_4 = var11_5 = var16_13.g;
                                        if (var11_5 == null) {
                                            var4_4 = eae.a;
                                        }
                                        var15_12.getClass();
                                        var4_4.getClass();
                                        var16_13 = ((cya)var13_8).b;
                                        var17_17 = ((cya)var13_8).a;
                                        var16_13 = var16_13.b();
                                        var17_17 = (jvb)var17_17.b();
                                        var17_17.getClass();
                                        ((cgw)((cya)var13_8).e.b()).getClass();
                                        var18_22 = (dml)((imc)((cya)var13_8).c).a;
                                        var18_22.getClass();
                                        var13_8 = (dml)((imc)((cya)var13_8).d).a;
                                        var13_8.getClass();
                                        var4_4 = var11_5 = new eoq((eip)var15_12, (efo)var12_7, (egw)var20_23, (eae)var4_4, gsl.a, (bzb)var16_13, (jvb)var17_17, (dml)var18_22, (dml)var13_8);
                                    }
                                }
                                var4_4 = this.q.G((eot)var4_4);
                                var11_5 = new eqn((eot)var4_4, (hpn)var14_9.a(var4_4));
                                break block104;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    var1_1 = new joa();
                    throw var1_1;
                }
                var4_4 = var11_5;
            }
            var11_5 = this.i;
            var12_7 = this.a;
            var13_8 = new buf(18);
            var13_8 = gqk.d((hny)var13_8);
            var12_7 = hmv.g(var4_4.b, Throwable.class, var13_8, (Executor)var12_7);
            var13_8 = new aus((hpn)var12_7, null, 20, null);
            var11_5 = jse.ag((jvb)var11_5, (jro)var13_8);
            var13_8 = new mz(var12_7, 20);
            var11_5.w((jrk)var13_8);
            var14_9 = this.i;
            var16_13 = var4_4.a;
            var13_8 = var16_13.j();
            var12_7 = new eqp(this, (jvi)var11_5, (hpn)var13_8, (eot)var16_13, null, 1);
            var15_12 = jsd.n((jvb)var14_9, (jro)var12_7);
            var14_9 = this.m;
            var5_10 = var1_1.a;
            var6_11 = var3_3.a;
            var11_5 = var12_7 = var3_3.b.g;
            if (var12_7 == null) {
                var11_5 = eae.a;
            }
            jse.d(var11_5, "getAudioLibInputParams(...)");
            var16_13 = var16_13.b();
            jse.e(var11_5, "<this>");
            jse.e(var16_13, "sourceParams");
            var12_7 = (hwp)var16_13.C(5);
            var12_7.x((hwv)var16_13);
            var12_7 = dpf.k((hwp)var12_7);
            if ((var11_5.b & 128) != 0) {
                var8_27 = var11_5.i;
                var11_5 = var12_7.a;
                if (!((hwp)var11_5).b.B()) {
                    ((hwp)var11_5).u();
                }
                var11_5 = (eae)((hwp)var11_5).b;
                var11_5.b |= 128;
                var11_5.i = var8_27;
            }
            var12_7 = hhk.K(var12_7.i());
            jse.e(var15_12, "result");
            var16_13 = wl.q;
            var11_5 = new eex(var16_13, 3);
            var15_12 = fxf.aj((hpn)var15_12, (gte)var11_5, (Executor)hom.a);
            var13_8.getClass();
            var14_9 = (czh)var14_9.a.b();
            var14_9.getClass();
            var11_5 = new enz(var5_10, var6_11, (hpn)var12_7, (hpn)var15_12, (hpn)var13_8, (czh)var14_9);
            this.h.h((eaj)var11_5, var3_3.a, var4_4.a.d());
            this.d.o(var1_1.b, var4_4.a.b());
            var12_7 = this.k;
            var13_8 = var4_4.a;
            var4_4 = new eqh((eot)var13_8, (eqg)var1_1, (eqv)var2_2, (eqm)var3_3);
            var3_3 = var11_5.b;
            var1_1 = this.p;
            var13_8 = var4_4.b;
            var14_9 = var4_4.a.d().b();
            var15_12 = var4_4.a;
            var2_2 = var4_4.c;
            var15_12 = var15_12.b();
            var5_10 = var2_2.a;
            var1_1.x(var13_8.b, (hpn)var14_9, (hpn)var3_3, (eae)var15_12, var5_10).c();
            var12_7.add(var4_4);
            return var11_5;
        }
    }
}

