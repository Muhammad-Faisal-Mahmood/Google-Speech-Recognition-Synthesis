/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class eqq {
    private static final hei b = hei.m("com/google/android/libraries/search/audio/microphone/source/registry/HotwordSourceDataRegistry");
    public final dlm a;
    private final enu c;
    private final Executor d;
    private final jvb e;
    private final hou f;
    private final List g;
    private final dpq h;
    private final dml i;
    private final czh j;
    private final fpo k;
    private final fpo l;
    private final bzb m;
    private final bmu n;

    public eqq(dml dml2, fpo fpo2, enu enu2, dpq dpq2, fpo fpo3, Executor executor, jvb jvb2, czh czh2, hou hou2, bmu bmu2, dlm dlm2, bzb bzb2) {
        jse.e(enu2, "audioSessionToMicStateUpdater");
        jse.e(executor, "lightweightExecutor");
        jse.e(jvb2, "lightweightScope");
        jse.e(hou2, "audioExecutionSequencer");
        jse.e(bzb2, "sessionAudioStoreFactory");
        this.i = dml2;
        this.k = fpo2;
        this.c = enu2;
        this.h = dpq2;
        this.l = fpo3;
        this.d = executor;
        this.e = jvb2;
        this.j = czh2;
        this.f = hou2;
        this.n = bmu2;
        this.a = dlm2;
        this.m = bzb2;
        this.g = new ArrayList();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ecu a(eqv var1_1, eqr var2_2) {
        synchronized (this) {
            block41: {
                var9_3 = eqq.b;
                var7_4 = (heg)var9_3.f().h(hfo.a, "ALT.HotwordSrcDataRegy").j("com/google/android/libraries/search/audio/microphone/source/registry/HotwordSourceDataRegistry", "startHotwordSessionSource$java_com_google_android_libraries_search_audio_microphone_source_registry_hotword_source_data_registry", 100, "HotwordSourceDataRegistry.kt");
                var3_5 = var2_2.a;
                var8_6 = var1_1.a();
                var5_8 = var6_7 = var2_2.b.g;
                if (var6_7 == null) {
                    var5_8 = eip.a;
                }
                jse.d(var5_8, "getClientInfo(...)");
                var7_4.G("#audio# starting hotword source session(%d) on %s for %s", var3_5, var8_6, crh.O((eip)var5_8));
                ((heg)var9_3.f().h(hfo.a, "ALT.HotwordSrcDataRegy").j("com/google/android/libraries/search/audio/microphone/source/registry/HotwordSourceDataRegistry", "enforceConcurrencyStateOnNewHotwordSource", 176, "HotwordSourceDataRegistry.kt")).r("#audio# enforcing concurrency state on a new hotword source");
                var5_8 = (eqo)jns.l(this.g);
                if (var5_8 != null) {
                    this.d(var5_8.c.a, ebv.q);
                }
                var7_4 = var1_1.b.b;
                switch (eay.a(var7_4.b).ordinal()) {
                    default: {
                        break block41;
                    }
                    case 3: {
                        var9_3 = this.l;
                        var5_8 = var6_7 = var2_2.b.g;
                        if (var6_7 == null) {
                            var5_8 = eip.a;
                        }
                        var10_9 = gsl.a;
                        var3_5 = var2_2.a;
                        var8_6 = this.h;
                        var6_7 = var1_1.b;
                        var11_10 = var8_6.a(edo.a, (ekk)var6_7);
                        var6_7 = var7_4.b == 4 ? (eba)var7_4.c : eba.a;
                        jse.d(var6_7, "getBistoAudioRoute(...)");
                        var8_6 = var2_2.b;
                        jse.e(var6_7, "<this>");
                        jse.e(var8_6, "hotwordMicInputParams");
                        if ((var6_7.b & 2) != 0) {
                            var6_7 = var7_4 = var6_7.d;
                            if (var7_4 == null) {
                                var6_7 = ebm.a;
                            }
                            jse.d(var6_7, "getPrecachedBufferId(...)");
                            var7_4 = var8_6 = var8_6.e;
                            if (var8_6 == null) {
                                var7_4 = eae.a;
                            }
                            jse.d(var7_4, "getAudioLibInputParams(...)");
                            var6_7 = dpf.l((ebm)var6_7, (eae)var7_4);
                        } else {
                            var12_11 = gto.h(doc.d((ebb)var6_7));
                            var6_7 = var7_4 = var8_6.e;
                            if (var7_4 == null) {
                                var6_7 = eae.a;
                            }
                            jse.d(var6_7, "getAudioLibInputParams(...)");
                            var6_7 = dpf.n((gto)var12_11, (eae)var6_7);
                        }
                        var7_4 = gto.h(var2_2.a);
                        var5_8.getClass();
                        var6_7.getClass();
                        var8_6 = var9_3.c;
                        var12_11 = var9_3.a;
                        var8_6 = var8_6.b();
                        var12_11 = (jvb)var12_11.b();
                        var12_11.getClass();
                        var13_13 = var9_3.b;
                        var14_15 = var9_3.e;
                        var13_13 = ((eny)var13_13).a();
                        ((cgw)var14_15.b()).getClass();
                        var14_15 = (dml)((imc)var9_3.d).a;
                        var14_15.getClass();
                        var9_3 = (dml)((imc)var9_3.f).a;
                        var9_3.getClass();
                        var5_8 = new eoi((eip)var5_8, (gto)var10_9, var3_5, (eds)var11_10, (edp)var6_7, (gto)var7_4, (bzb)var8_6, (jvb)var12_11, (enx)var13_13, (dml)var14_15, (dml)var9_3);
                        ** GOTO lbl192
                    }
                    case 1: 
                    case 2: 
                    case 8: {
                        var10_9 = this.k;
                        var9_3 = var2_2.b;
                        var4_17 = var2_2.a;
                        var11_10 = var1_1.b;
                        var5_8 = var6_7 = var9_3.g;
                        if (var6_7 == null) {
                            var5_8 = eip.a;
                        }
                        jse.d(var5_8, "getClientInfo(...)");
                        var12_12 = new emm((eip)var5_8, var1_1.a, var2_2.a, null, 8);
                        var5_8 = var6_7 = var9_3.e;
                        if (var6_7 == null) {
                            var5_8 = eae.a;
                        }
                        if ((var5_8.b & 256) != 0) {
                            var5_8 = var6_7 = var9_3.e;
                            if (var6_7 == null) {
                                var5_8 = eae.a;
                            }
                            var7_4 = new els((eae)var5_8);
                            var6_7 = gto.i(var7_4);
                        } else {
                            var6_7 = gsl.a;
                        }
                        var13_14 = var10_9.f;
                        var5_8 = var7_4 = var9_3.e;
                        if (var7_4 == null) {
                            var5_8 = eae.a;
                        }
                        var14_16 = new gzs();
                        var15_18 = var10_9.e;
                        var7_4 = var8_6 = var9_3.e;
                        if (var8_6 == null) {
                            var7_4 = eae.a;
                        }
                        var14_16.h(((bzq)var15_18).x((eae)var7_4));
                        var15_18 = var10_9.a;
                        var7_4 = var8_6 = var9_3.e;
                        if (var8_6 == null) {
                            var7_4 = eae.a;
                        }
                        var14_16.h(((dtu)var15_18).c((eae)var7_4));
                        var7_4 = var14_16.g();
                        var13_14 = ((dtu)var13_14).l((eae)var5_8, (gto)var6_7, (List)var7_4);
                        var15_18 = var10_9.d;
                        var14_16 = var11_10.b;
                        var5_8 = var8_6 = ((egj)var15_18).b();
                        if (var8_6 == null) {
                            if ((var9_3.b & 2) != 0 && var9_3.f) {
                                var8_6 = ((egj)var15_18).e;
                                var5_8 = var7_4 = var9_3.e;
                                if (var7_4 == null) {
                                    var5_8 = eae.a;
                                }
                                var5_8 = var8_6.g((eae)var5_8);
                            } else {
                                var7_4 = var9_3.c == 13 ? (edg)var9_3.d : edg.a;
                                var5_8 = var8_6;
                                if ((var7_4.b & 1) != 0) {
                                    var7_4 = ((egj)var15_18).d;
                                    var5_8 = var9_3.c == 13 ? (edg)var9_3.d : edg.a;
                                    var5_8 = var7_4.f(var5_8.c);
                                }
                            }
                        }
                        if (var5_8 != null) {
                            egj.a((gto)var6_7);
                        } else {
                            var8_6 = ((egj)var15_18).c;
                            var15_18 = efx.a.l();
                            var5_8 = var7_4 = var9_3.e;
                            if (var7_4 == null) {
                                var5_8 = eae.a;
                            }
                            if (!var15_18.b.B()) {
                                var15_18.u();
                            }
                            var7_4 = (efx)var15_18.b;
                            var5_8.getClass();
                            var7_4.e = var5_8;
                            var7_4.b |= 1;
                            var5_8 = var14_16.b == 3 ? (ebh)var14_16.c : ebh.a;
                            if ((var5_8.b & 1) != 0) {
                                var5_8 = var14_16.b == 3 ? (ebh)var14_16.c : ebh.a;
                                var3_5 = var5_8.c;
                                if (!var15_18.b.B()) {
                                    var15_18.u();
                                }
                                var5_8 = (efx)var15_18.b;
                                var5_8.b |= 2;
                                var5_8.f = var3_5;
                            }
                            if (var9_3.c == 9) {
                                var5_8 = (ecz)var9_3.d;
                                if (!var15_18.b.B()) {
                                    var15_18.u();
                                }
                                var7_4 = (efx)var15_18.b;
                                var5_8.getClass();
                                var7_4.i = var5_8;
                                var7_4.b |= 16;
                            }
                            var5_8 = var8_6.a((efx)var15_18.o(), (gto)var6_7, (emm)var12_12);
                        }
                        var8_6 = dww.h((ekk)var11_10, (efo)var5_8);
                        var10_9 = var10_9.b;
                        var5_8 = var6_7 = var9_3.g;
                        if (var6_7 == null) {
                            var5_8 = eip.a;
                        }
                        var6_7 = var7_4 = var9_3.e;
                        if (var7_4 == null) {
                            var6_7 = eae.a;
                        }
                        var9_3 = gto.i(var4_17);
                        var5_8.getClass();
                        var6_7.getClass();
                        var11_10 = ((cya)var10_9).b;
                        var12_12 = ((cya)var10_9).a;
                        var11_10 = var11_10.b();
                        var14_16 = (jvb)var12_12.b();
                        var14_16.getClass();
                        ((cgw)((cya)var10_9).e.b()).getClass();
                        var12_12 = (dml)((imc)((cya)var10_9).c).a;
                        var12_12.getClass();
                        var10_9 = (dml)((imc)((cya)var10_9).d).a;
                        var10_9.getClass();
                        var5_8 = var7_4 = new eoq((eip)var5_8, (efo)var8_6, (egw)var13_14, (eae)var6_7, (gto)var9_3, (bzb)var11_10, (jvb)var14_16, (dml)var12_12, (dml)var10_9);
lbl192:
                        // 2 sources

                        var10_9 = this.n;
                        var9_3 = gto.h(var2_2.a);
                        var6_7 = var10_9.b.b();
                        var7_4 = (ell)var10_9.c.b();
                        var7_4.getClass();
                        var10_9 = (jvb)var10_9.a.b();
                        var10_9.getClass();
                        var8_6 = new epa((eot)var5_8, (gto)var9_3, (bzb)var6_7, (ell)var7_4, (jvb)var10_9);
                        var5_8 = this.f;
                        var6_7 = new cqg(var8_6, 16);
                        var5_8 = var5_8.b(gqk.c((hnx)var6_7), this.d);
                        jse.d(var5_8, "submitAsync(...)");
                        jse.e(var5_8, "result");
                        var6_7 = wl.r;
                        var7_4 = new eex(var6_7, 4);
                        var9_3 = fxf.aj((hpn)var5_8, (gte)var7_4, (Executor)hom.a);
                        var7_4 = this.j;
                        var5_8 = var6_7 = var2_2.b.g;
                        if (var6_7 == null) {
                            var5_8 = eip.a;
                        }
                        jse.d(var5_8, "getClientInfo(...)");
                        var6_7 = var8_6.i;
                        var10_9 = var1_1.b;
                        var6_7 = var6_7.b();
                        var10_9 = var10_9.b;
                        jse.e(var5_8, "clientInfo");
                        ((enc)var7_4.b).d((eip)var5_8, (hpn)var9_3, (eaz)var10_9);
                        var7_4.y("HOTWORD", (eip)var5_8, (hpn)var6_7, (hpn)var9_3);
                        var5_8 = new emx((czh)var7_4, (hpn)var6_7, (hpn)var9_3, null, 0);
                        jse.ah((jvb)var7_4.c, null, null, (jro)var5_8, 3);
                        var7_4 = new eqs((eot)var8_6, (hpn)var9_3);
                        var5_8 = this.e;
                        var9_3 = var7_4.b;
                        var6_7 = this.d;
                        var8_6 = new buf(17);
                        var8_6 = hmv.g((hpn)var9_3, Throwable.class, gqk.d((hny)var8_6), (Executor)var6_7);
                        var6_7 = new esz((hpn)var8_6, null, 1);
                        var6_7 = jse.ag((jvb)var5_8, (jro)var6_7);
                        var5_8 = new etv(var8_6, 1);
                        var6_7.w((jrk)var5_8);
                        var10_9 = var7_4.a;
                        var5_8 = ((eou)((epa)var10_9).g.c()).c;
                        var9_3 = this.e;
                        var8_6 = new eqp(this, (jvi)var6_7, (hpn)var5_8, (eot)var10_9, null, 0);
                        var10_9 = jsd.n((jvb)var9_3, (jro)var8_6);
                        var6_7 = this.i;
                        var3_5 = var2_2.a;
                        jse.e(var10_9, "result");
                        var8_6 = wl.p;
                        var9_3 = new eex(var8_6, 2);
                        var9_3 = fxf.aj((hpn)var10_9, (gte)var9_3, (Executor)hom.a);
                        var5_8.getClass();
                        var6_7 = (czh)var6_7.a.b();
                        var6_7.getClass();
                        var8_6 = new eod(var3_5, (hpn)var9_3, (hpn)var5_8, (czh)var6_7);
                        this.c.i((ecu)var8_6, var2_2.a, ((epa)var7_4.a).i);
                        var9_3 = this.j;
                        var5_8 = var6_7 = var2_2.b.g;
                        if (var6_7 == null) {
                            var5_8 = eip.a;
                        }
                        jse.d(var5_8, "getClientInfo(...)");
                        var9_3.o((eip)var5_8, ((epa)var7_4.a).h);
                        var5_8 = this.g;
                        var7_4 = var7_4.a;
                        var6_7 = new eqo((eot)var7_4, (eqv)var1_1, (eqr)var2_2);
                        var7_4 = var8_6.a;
                        var9_3 = this.m;
                        var1_1 = var2_2 = var6_7.c.b.g;
                        if (var2_2 == null) {
                            var1_1 = eip.a;
                        }
                        jse.d(var1_1, "getClientInfo(...)");
                        var2_2 = var6_7.a;
                        var11_10 = var6_7.a;
                        var10_9 = var6_7.c;
                        var11_10 = ((epa)var11_10).h;
                        var9_3.x((eip)var1_1, ((epa)var2_2).i.b(), (hpn)var7_4, (eae)var11_10, var10_9.a).c();
                        var5_8.add(var6_7);
                        return var8_6;
                    }
                    case 0: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                }
                var5_8 = crh.L((eaz)var7_4);
                var2_2 = new StringBuilder("Route(");
                var2_2.append((String)var5_8);
                var2_2.append(") is unexpected");
                var1_1 = new IllegalStateException(var2_2.toString());
                throw var1_1;
            }
            var1_1 = new joa();
            throw var1_1;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List b() {
        synchronized (this) {
            Object object = this.g;
            ArrayList<Object> arrayList = new ArrayList<Object>(jns.B((Iterable)object));
            object = object.iterator();
            while (object.hasNext()) {
                Object object2 = (eqo)object.next();
                Object object3 = ((eqo)object2).c;
                int n2 = ((eqr)object3).a;
                object3 = ((eqr)object3).b;
                eqv eqv2 = ((eqo)object2).b;
                eot eot2 = ((eqo)object2).a;
                object2 = new eqt(n2, object3, eqv2, eot2);
                arrayList.add(object2);
            }
            return arrayList;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(int n2) {
        synchronized (this) {
            epl epl22;
            block4: {
                for (epl epl22 : this.g) {
                    if (((eqo)((Object)epl22)).c.a != n2) continue;
                    break block4;
                }
                epl22 = null;
            }
            if ((eqo)((Object)epl22) == null) {
                ((heg)b.h().h(hfo.a, "ALT.HotwordSrcDataRegy").j("com/google/android/libraries/search/audio/microphone/source/registry/HotwordSourceDataRegistry", "handoverHotwordSource$java_com_google_android_libraries_search_audio_microphone_source_registry_hotword_source_data_registry", 255, "HotwordSourceDataRegistry.kt")).s("#audio# no hotword source session(%d) found for handover", n2);
                return;
            }
            List list = this.g;
            epl22 = new epl(n2, 4);
            jns.E(list, epl22);
            ((heg)b.f().h(hfo.a, "ALT.HotwordSrcDataRegy").j("com/google/android/libraries/search/audio/microphone/source/registry/HotwordSourceDataRegistry", "handoverHotwordSource$java_com_google_android_libraries_search_audio_microphone_source_registry_hotword_source_data_registry", 259, "HotwordSourceDataRegistry.kt")).s("#audio# hotword source session(%d) has been handed off", n2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(int n2, ebv ebv2) {
        synchronized (this) {
            Object object;
            Object object22;
            block9: {
                jse.e(ebv2, "reason");
                for (Object object22 : this.g) {
                    if (((eqo)object22).c.a != n2) continue;
                    break block9;
                }
                object22 = null;
            }
            eqo eqo2 = (eqo)object22;
            if (eqo2 == null) {
                return;
            }
            Object object3 = this.g;
            object22 = new epl(n2, 5);
            jns.E((List)object3, (jrk)object22);
            ((heg)b.f().h(hfo.a, "ALT.HotwordSrcDataRegy").j("com/google/android/libraries/search/audio/microphone/source/registry/HotwordSourceDataRegistry", "markStopped", 306, "HotwordSourceDataRegistry.kt")).A("#audio# stopping(%s) hotword source session(%d)", ebv2.name(), eqo2.c.a);
            if (ebv2 == ebv.h) {
                object = this.j;
                object22 = object3 = eqo2.c.b.g;
                if (object3 == null) {
                    object22 = eip.a;
                }
                jse.d(object22, "getClientInfo(...)");
                jse.e(object22, "clientInfo");
                object = ((czh)object).b;
                object3 = (eng)((enc)object).b.b();
                object = (String)((enc)object).d.a();
                object22 = eio.a(((eip)object22).b).name();
                ((fsx)((eng)object3).q.a()).b(object, object22);
            }
            if (ebv2 == ebv.e) {
                object = this.j;
                object22 = object3 = eqo2.c.b.g;
                if (object3 == null) {
                    object22 = eip.a;
                }
                jse.d(object22, "getClientInfo(...)");
                jse.e(object22, "clientInfo");
                object3 = (eng)((enc)((czh)object).b).b.b();
                object22 = eio.a(((eip)object22).b).name();
                ((fsx)((eng)object3).m.a()).b(object22);
            }
            object22 = this.f;
            object3 = new etu(eqo2, ebv2, 1);
            jse.d(((hou)object22).b(gqk.c((hnx)object3), this.d), "submitAsync(...)");
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final eky e(int n2, ebv object) {
        synchronized (this) {
            ebr ebr2;
            Object object2;
            Object object3;
            block8: {
                block7: {
                    jse.e(object, "reason");
                    object3 = this.g.iterator();
                    do {
                        boolean bl2 = object3.hasNext();
                        ebr2 = null;
                        if (!bl2) break block7;
                        object2 = object3.next();
                    } while (((eqo)object2).c.a != n2);
                    break block8;
                }
                object2 = null;
            }
            object3 = (eqo)object2;
            object2 = ebr2;
            if (object3 != null) {
                object3 = ((epa)((eqo)object3).a).g;
                object2 = ebr2;
                if (object3 != null) {
                    object2 = (eou)((gto)object3).f();
                }
            }
            if (object2 == null) {
                ((heg)b.f().h(hfo.a, "ALT.HotwordSrcDataRegy").j("com/google/android/libraries/search/audio/microphone/source/registry/HotwordSourceDataRegistry", "stopHotwordSourceSeamlessly$java_com_google_android_libraries_search_audio_microphone_source_registry_hotword_source_data_registry", 276, "HotwordSourceDataRegistry.kt")).x("#audio# no hotword source session(%d) to stop(%s) seamlessly, skipping", n2, ((Enum)object).name());
                return elb.j(ebp.e, dpf.q(eda.a.l()).o(), (ebv)object);
            }
            ((eou)object2).d.c(elb.h(elb.d(ebr.c), (ebv)object));
            ebr2 = ebr.c;
            object3 = dpf.q(eda.a.l());
            Object object4 = ((bzo)object3).a;
            if (!((hwp)object4).b.B()) {
                ((hwp)object4).u();
            }
            n2 = ((eou)object2).b;
            object2 = (eda)((hwp)object4).b;
            ((eda)object2).b |= 1;
            ((eda)object2).c = n2;
            object2 = ((bzo)object3).o();
            return elb.k(elb.d(ebr2), (eda)object2, (ebv)object);
        }
    }
}

