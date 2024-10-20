/*
 * Decompiled with CFR 0.152.
 */
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public final class epm {
    private static final hei a = hei.m("com/google/android/libraries/search/audio/microphone/registry/AudioSessionsRegistry");
    private static final epn b = new epn(ebs.c, ebp.b, "the associated audio client is already inactive");
    private static final epn c;
    private static final epn d;
    private final emj e;
    private final enu f;
    private final jvb g;
    private final boolean h;
    private final List i;
    private final List j;
    private final elp k;
    private final dtu l;
    private final eqe m;
    private final czh n;
    private final czh o;

    static {
        new epn(ebs.p, ebp.x, "the associated audio parent is already inactive");
        c = new epn(ebs.i, ebp.o, "the associated audio route is already inactive");
        d = new epn(ebs.ah, ebp.L, "ambient session cannot start due to a conflict with another active session");
    }

    public epm(cqq cqq2, emj emj2, enu enu2, czh czh2, czh czh3, dtu dtu2, eqe eqe2, jvb jvb2, boolean bl2, elp elp2, cqq cqq3) {
        jse.e(cqq2, "audioSessionAssembler");
        jse.e(emj2, "micUpdateReporter");
        jse.e(enu2, "audioSessionToMicStateUpdater");
        jse.e(dtu2, "tokenGenerator");
        jse.e(jvb2, "lightweightScope");
        jse.e(elp2, "timeoutTracker");
        jse.e(cqq3, "audioSessionsReducerFactory");
        this.e = emj2;
        this.f = enu2;
        this.o = czh2;
        this.n = czh3;
        this.l = dtu2;
        this.m = eqe2;
        this.g = jvb2;
        this.h = bl2;
        this.k = elp2;
        this.i = new ArrayList();
        this.j = new ArrayList();
    }

    private final void k(epe object) {
        Object object2;
        eph eph2 = (eph)object;
        object = object2 = eph2.b.b.c;
        if (object2 == null) {
            object = eip.a;
        }
        Object object3 = this.o;
        jse.d(object, "getClientInfo(...)");
        Object object4 = eph2.a;
        int n2 = eph2.d;
        object2 = eph2.f;
        Object object5 = eph2.c;
        long l2 = n2;
        object5 = ((eqb)object5).b;
        ((czh)object3).a.m((eip)object, (eaj)object4, l2, (eao)object2, (ekk)object5);
        object4 = eph2.a;
        object = eph2.b;
        int n3 = eph2.d;
        n2 = ((epc)object).a;
        object = object2 = ((epc)object).b.c;
        if (object2 == null) {
            object = eip.a;
        }
        object5 = ((czh)object3).d;
        l2 = n3;
        object2 = object4.c();
        object5 = (evo)object5;
        hhk.T((hpn)object2, gqk.g(new daq((evo)object5, n2, l2, (eip)object, 3)), ((evo)object5).b);
        hhk.T(((eai)object4.d()).a(), gqk.g(new daq((evo)object5, n2, l2, (eip)object, 2)), ((evo)object5).b);
        object4 = ((czh)object3).b;
        object3 = eph2.a;
        object = object2 = eph2.b.b.c;
        if (object2 == null) {
            object = eip.a;
        }
        object5 = new boa(18);
        ebs ebs2 = ebs.ad;
        hpn hpn2 = object3.c();
        object2 = (enc)object4;
        hhk.T(hpn2, gqk.g(new emz((enc)object2, (Predicate)object5, (eip)object, ebs2, 0)), ((enc)object2).c);
        object5 = new boa(19);
        object4 = ebp.I;
        hhk.T(((eai)object3.d()).a(), gqk.g(new emz((enc)object2, (Predicate)object5, (eip)object, (Enum)object4, 2)), ((enc)object2).c);
        object2 = this.e;
        object = eph2.a;
        ((emj)object2).a(2, hno.f(object.c(), gqk.b(new dti(9)), ((emj)object2).a), hno.f(((eai)object.d()).a(), gqk.b(new dti(10)), ((emj)object2).a));
        if (eph2.g) {
            this.f.h(eph2.a, -1, dww.i(efs.a));
        }
    }

    private static final eph l(ebs ebs2, ebp ebp2) {
        return new eph(new eku(ebs2, ebp2), null, null, 0, null, null, true, 62);
    }

    private final void m(ebv object) {
        Object object2 = new ArrayList();
        Iterator iterator = this.j.iterator();
        if (!iterator.hasNext()) {
            jns.E(this.j, new mz(object2, 19));
            object2 = object2.iterator();
            if (!object2.hasNext()) {
                return;
            }
            iterator = (epi)object2.next();
            object2 = (heg)a.f().h(hfo.a, "ALT.AudioSessionsRegy").j("com/google/android/libraries/search/audio/microphone/registry/AudioSessionsRegistry", "markStopped", 402, "AudioSessionsRegistry.kt");
            ((Enum)object).name();
            int n2 = ((epi)((Object)iterator)).a;
            throw null;
        }
        object = (epi)iterator.next();
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final epe a(int n2) {
        synchronized (this) {
            epe epe22;
            block4: {
                for (epe epe22 : this.i) {
                    if (((epf)epe22).d != n2) continue;
                    break block4;
                }
                epe22 = null;
            }
            epe22 = epe22;
            if (epe22 != null) return epe22;
            return eph.h(epm.l(ebs.h, ebp.c), null, null, n2, null, 119);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final epe b(epc object, int n2) {
        synchronized (this) {
            if (!((epc)object).c) return this.a(n2);
            return eph.h(epm.l(ebs.c, ebp.b), (epc)object, null, n2, null, 117);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final epi c(int n2) {
        synchronized (this) {
            epi epi22;
            for (epi epi22 : this.j) {
                int n3 = ((epi)epi22).a;
                if (n2 != 0) continue;
                return epi22;
            }
            epi22 = null;
            return epi22;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List d() {
        synchronized (this) {
            Object object = this.i;
            ArrayList<epx> arrayList = new ArrayList<epx>(jns.B((Iterable)object));
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                Object object2;
                epe epe2 = (epe)iterator.next();
                object = object2 = epe2.d().b.c;
                if (object2 == null) {
                    object = eip.a;
                }
                jse.d(object, "getClientInfo(...)");
                int n2 = epe2.a();
                object2 = new eop(epe2, 4);
                epx epx2 = new epx((eip)object, n2, (jqz)object2, epe2.c());
                arrayList.add(epx2);
            }
            return arrayList;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(epc object, int n2, ebv ebv2, boolean bl2) {
        synchronized (this) {
            jse.e(object, "client");
            jse.e(ebv2, "reason");
            if (!((epc)object).c) {
                epf epf2;
                block7: {
                    for (Object object2 : this.i) {
                        epf2 = (epf)object2;
                        if (epf2.b.a != ((epc)object).a || epf2.d != n2) continue;
                        object = object2;
                        break block7;
                    }
                    object = null;
                }
                epf2 = (epf)object;
                if (epf2 != null) {
                    Object object2;
                    object2 = this.i;
                    object = new epl(n2, 0);
                    jns.E(object2, (jrk)object);
                    ((heg)a.f().h(hfo.a, "ALT.AudioSessionsRegy").j("com/google/android/libraries/search/audio/microphone/registry/AudioSessionsRegistry", "markStopped", 420, "AudioSessionsRegistry.kt")).G("#audio# stopping(%s) audio session(%d) for %s", ebv2.name(), epf2.d, epf2.b.a());
                    Object object3 = this.o;
                    jse.e(ebv2, "reason");
                    object = object2 = epf2.b.b.c;
                    if (object2 == null) {
                        object = eip.a;
                    }
                    object2 = ((czh)object3).a;
                    jse.d(object, "getClientInfo(...)");
                    object2.u((eip)object, epf2.d);
                    object3 = ((czh)object3).d;
                    bzo bzo2 = dox.o(ece.a.l());
                    bzo2.B(ech.e);
                    bzo2.D(epf2.b.a);
                    bzo2.F(epf2.d);
                    bzo2.G(ebv2);
                    object = object2 = epf2.b.b.c;
                    if (object2 == null) {
                        object = eip.a;
                    }
                    bzo2.C((eip)object);
                    object = bzo2.y();
                    ((evo)object3).d((ece)object);
                    jvf.j(epf2.f);
                    this.k.a(cqq.ao(epf2));
                    this.m.A(epf2.d, ebv2);
                    return;
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(epc object, ebv ebv2) {
        synchronized (this) {
            jse.e(ebv2, "reason");
            Object object2 = new ArrayList();
            for (Object t2 : this.i) {
                if (((epf)t2).b.a != ((epc)object).a) continue;
                object2.add(t2);
            }
            object = object2.iterator();
            while (true) {
                if (!object.hasNext()) {
                    this.m(ebv2);
                    return;
                }
                object2 = (epf)object.next();
                this.e(((epf)object2).b, ((epf)object2).d, ebv2, true);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(eqb object, ebv ebv2) {
        synchronized (this) {
            jse.e(ebv2, "reason");
            Object object2 = new ArrayList();
            for (Object t2 : this.i) {
                if (((epf)t2).c.a != ((eqb)object).a) continue;
                object2.add(t2);
            }
            object2 = object2.iterator();
            while (object2.hasNext()) {
                object = (epf)object2.next();
                this.e(((epf)object).b, ((epf)object).d, ebv2, false);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean h(eal ... ealArray) {
        synchronized (this) {
            epf epf2;
            jse.e(ealArray, "intents");
            Object object = this.i;
            boolean bl2 = object.isEmpty();
            boolean bl3 = false;
            if (bl2) {
                return bl3;
            }
            Iterator iterator = object.iterator();
            do {
                bl2 = bl3;
                if (!iterator.hasNext()) return bl2;
                epf2 = (epf)iterator.next();
                eal eal2 = eal.b(epf2.b.b.d);
                object = eal2;
                if (eal2 != null) continue;
                object = eal.a;
            } while (!jns.U(ealArray, object) || (bl2 = ((eai)epf2.a.d()).a().isDone()));
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final epi i() {
        synchronized (this) {
            Object object = this.j.iterator();
            boolean bl2 = object.hasNext();
            if (!bl2) {
                return null;
            }
            object = (epi)object.next();
            throw null;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public final epe j(epc var1_1, eqb var2_2, eao var3_3, eqe var4_4) {
        synchronized (this) {
            block46: {
                block47: {
                    block49: {
                        block48: {
                            block44: {
                                jse.e(var3_4, "params");
                                var7_6 = this.l.h();
                                var14_7 = epm.a;
                                ((heg)var14_7.f().h(hfo.a, "ALT.AudioSessionsRegy").j("com/google/android/libraries/search/audio/microphone/registry/AudioSessionsRegistry", "startAudioSession$java_com_google_android_libraries_search_audio_microphone_registry_audio_sessions_registry", 150, "AudioSessionsRegistry.kt")).x("#audio# starting audio session(%d) for %s", var7_6, var1_1.a());
                                jse.e(var3_4, "params");
                                var12_9 = var13_8 = var1_1.b.c;
                                if (var13_8 == null) {
                                    var12_9 = eip.a;
                                }
                                var15_10 = this.o;
                                jse.d(var12_9, "getClientInfo(...)");
                                var10_11 = var7_6;
                                var13_8 = Duration.ofNanos(cgw.o());
                                jse.d(var13_8, "ofNanos(...)");
                                var15_10.a.t((eip)var12_9, var10_11, (Duration)var13_8);
                                var16_12 = dox.o(ece.a.l());
                                var16_12.B(ech.d);
                                jse.e(var3_4, "value");
                                var12_9 = var16_12.a;
                                if (!((hwp)var12_9).b.B()) {
                                    ((hwp)var12_9).u();
                                }
                                var12_9 = (ece)((hwp)var12_9).b;
                                var3_4.getClass();
                                var12_9.d = var3_4;
                                var12_9.c = 201;
                                var16_12.D(var1_1.a);
                                var12_9 = var13_8 = var1_1.b.c;
                                if (var13_8 == null) {
                                    var12_9 = eip.a;
                                }
                                var13_8 = var15_10.d;
                                var16_12.C((eip)var12_9);
                                var16_12.E(var2_3.a);
                                var16_12.F(var10_11);
                                var12_9 = var16_12.y();
                                ((evo)var13_8).d((ece)var12_9);
                                ((heg)var14_7.f().h(hfo.a, "ALT.AudioSessionsRegy").j("com/google/android/libraries/search/audio/microphone/registry/AudioSessionsRegistry", "enforceConcurrencyStateOnNewAudioSession", 272, "AudioSessionsRegistry.kt")).u("#audio# enforcing concurrency state on new audio session of %s", var1_1.a());
                                for (Object var12_9 : this.i) {
                                    if (((epf)var12_9).b.a != var1_1.a) continue;
                                    break block44;
                                }
                                var12_9 = null;
                            }
                            var13_8 = (epf)var12_9;
                            if (var13_8 != null) {
                                var12_9 = ebv.c;
                                var9_13 = jse.i(null, null);
                                var5_14 = var13_8.d;
                                this.e(var13_8.b, var5_14, (ebv)var12_9, var9_13 ^ true);
                            }
                            var12_9 = var4_5.a;
                            var14_7 = new ArrayList();
                            var16_12 = var12_9.iterator();
                            while (true) {
                                block45: {
                                    var9_13 = var16_12.hasNext();
                                    var6_15 = 0;
                                    if (!var9_13) break;
                                    var15_10 = var16_12.next();
                                    var17_17 = (epx)var15_10;
                                    var12_9 = var13_8 = var1_1.b.c;
                                    if (var13_8 == null) {
                                        var12_9 = eip.a;
                                    }
                                    jse.d(var12_9, "getClientInfo(...)");
                                    var18_18 = var2_3.b;
                                    var5_14 = var17_17.b;
                                    var13_8 = ewl.a;
                                    jse.e(var18_18, "audioRouteData");
                                    jse.e(var3_4, "params");
                                    var13_8 = ewl.b(var18_18, (eao)var3_4);
                                    if (var13_8 != null && var13_8.b == var5_14) lbl-1000:
                                    // 3 sources

                                    {
                                        while (true) {
                                            var5_14 = 1;
                                            break block45;
                                            break;
                                        }
                                    }
                                    if (eay.a(var2_3.b.b.b) == eay.f) ** GOTO lbl-1000
                                    var8_16 = a.w(((ecw)var17_17.d).h);
                                    if (var8_16 == 0) {
                                        var5_14 = var6_15;
                                    } else {
                                        var5_14 = var6_15;
                                        if (var8_16 == 2) {
                                            if (var12_9.b == 34 && this.h) ** break;
                                            ** continue;
                                            var5_14 = var6_15;
                                        }
                                    }
                                }
                                if (var5_14 != 0) continue;
                                var14_7.add(var15_10);
                            }
                            var12_9 = var14_7.iterator();
                            while (var12_9.hasNext()) {
                                var14_7 = (epx)var12_9.next();
                                ((heg)epm.a.f().h(hfo.a, "ALT.AudioSessionsRegy").j("com/google/android/libraries/search/audio/microphone/registry/AudioSessionsRegistry", "enforceConcurrencyStateOnNewAudioSession", 295, "AudioSessionsRegistry.kt")).s("#audio# hotword session(%s) has insufficient concurrent mode, stopping", var14_7.b);
                                var13_8 = var4_5.b;
                                if (var13_8 == null) continue;
                                var13_8.b(var14_7.b, ebv.c);
                            }
                            if (var1_1.c) {
                                var4_5 = epm.b;
                            } else if (var2_3.c) {
                                var4_5 = epm.c;
                            } else {
                                var4_5 = var12_9 = eal.b(var1_1.b.d);
                                if (var12_9 == null) {
                                    var4_5 = eal.a;
                                }
                                var4_5 = var4_5 == eal.b && this.h(new eal[]{eal.a, eal.c}) != false ? epm.d : null;
                            }
                            var12_9 = var4_5;
                            if (var4_5 != null) break block47;
                            var13_8 = this.n;
                            jse.e(var3_4, "params");
                            var4_5 = var12_9 = var13_8.l();
                            if (var12_9 == null) {
                                var4_5 = var3_4.j != false && ((enx)var13_8.d).c() == false ? new epn(ebs.k, ebp.q, "record audio OP not allowed") : null;
                            }
                            var12_9 = var4_5;
                            if (var4_5 == null) {
                                var4_5 = var12_9 = var3_4.g;
                                if (var12_9 == null) {
                                    var4_5 = eae.a;
                                }
                                var12_9 = var4_5.c != 1999 ? null : new epn(ebs.g, ebp.n, "using hotword audio source is not allowed");
                            }
                            if (var12_9 != null) break block48;
                            var4_5 = var12_9 = edc.b(var3_4.k);
                            if (var12_9 == null) {
                                var4_5 = edc.a;
                            }
                            jse.d(var4_5, "getMicOccupiedBehavior(...)");
                            var5_14 = var4_5.ordinal();
                            if (var5_14 == 0) ** GOTO lbl-1000
                            if (var5_14 == 1) ** GOTO lbl133
                            if (var5_14 == 2) {
                                var9_13 = var13_8.c.a(era.a);
                            } else {
                                var1_1 = new joa();
                                throw var1_1;
lbl133:
                                // 1 sources

                                var9_13 = var13_8.c.a(era.b);
                            }
                            if (var9_13) {
                                var15_10 = ebs.n;
                                var14_7 = ebp.v;
                                var4_5 = var13_8 = edc.b(var3_4.k);
                                if (var13_8 == null) {
                                    var4_5 = edc.a;
                                }
                                Objects.toString(var4_5);
                                var4_5 = var12_9 = new epn((ebs)var15_10, (ebp)var14_7, "mic occupied per ".concat(String.valueOf(var4_5)));
                            } else lbl-1000:
                            // 2 sources

                            {
                                var4_5 = null;
                            }
                            break block49;
                        }
                        var4_5 = var12_9;
                    }
                    var12_9 = var4_5;
                    if (var4_5 != null) break block47;
                    if (var3_4.c != 17 || !((Boolean)var3_4.d).booleanValue()) ** GOTO lbl-1000
                    var4_5 = var12_9 = var3_4.g;
                    if (var12_9 == null) {
                        var4_5 = eae.a;
                    }
                    var4_5 = var12_9 = var4_5.h;
                    if (var12_9 == null) {
                        var4_5 = eac.a;
                    }
                    if (var4_5.d) {
                        var12_9 = new epn(ebs.S, ebp.w, "setting acoustic_echo_cancellation_enabled when enable_voice_dsp_hotword_mic is set, not allowed");
                    } else lbl-1000:
                    // 2 sources

                    {
                        var12_9 = null;
                    }
                }
                if (var12_9 == null) {
                    ((heg)epm.a.f().h(hfo.a, "ALT.AudioSessionsRegy").j("com/google/android/libraries/search/audio/microphone/registry/AudioSessionsRegistry", "handleAudioSessionStartConditions", 232, "AudioSessionsRegistry.kt")).s("#audio# audio session(%d) OK to start", var7_6);
                    var4_5 = null;
                } else {
                    ((heg)epm.a.h().h(hfo.a, "ALT.AudioSessionsRegy").j("com/google/android/libraries/search/audio/microphone/registry/AudioSessionsRegistry", "handleAudioSessionStartConditions", 238, "AudioSessionsRegistry.kt")).G("#audio# audio session(%d) start conditions failed for %s: %s", var7_6, var1_1.a(), var12_9.c);
                    var4_5 = var12_9.b;
                    var4_5 = eph.h(epm.l(var12_9.a, (ebp)var4_5), (epc)var1_1, (eqb)var2_3, var7_6, (eao)var3_4, 81);
                    this.k((epe)var4_5);
                }
                if (var4_5 == null) break block46;
                {
                    catch (Throwable var1_2) {}
                }
                {
                    throw var1_2;
                }
                return var4_5;
            }
            var4_5 = this.f;
            if (var7_6 == -1) {
                ((heg)enu.a.h().h(hfo.a, "ALT.SessionMicUpdater").j("com/google/android/libraries/search/audio/microphone/AudioSessionToMicStateUpdater", "reportUpcomingAudioRequestSession", 75, "AudioSessionToMicStateUpdater.kt")).r("#audio# unexpected inactive token, skip reporting");
            } else {
                var13_8 = var4_5.b;
                var12_9 = euf.z(erv.a.l());
                var12_9.O(eqz.b);
                var12_9.Q(var4_5.f(var7_6));
                var12_9.P(eqw.b);
                var13_8.d(var12_9.N());
            }
            var13_8 = this.m;
            var5_14 = var1_1.a;
            var4_5 = var1_1.b;
            var4_5 = var12_9 = var4_5.c;
            if (var12_9 == null) {
                var4_5 = eip.a;
            }
            jse.d(var4_5, "getClientInfo(...)");
            var14_7 = new eqg(var5_14, (eip)var4_5);
            var12_9 = var2_3.a();
            var4_5 = new eqm(var7_6, (eao)var3_4, false);
            var12_9 = var13_8.x((eqg)var14_7, (eqv)var12_9, (eqm)var4_5);
            var4_5 = new eph((eaj)var12_9, (epc)var1_1, (eqb)var2_3, var7_6, null, (eao)var3_4, false, 64);
            this.k((epe)var4_5);
            var2_3 = this.g;
            var3_4 = new epk(this, (epc)var1_1, var7_6, 1);
            cqq.ah((epz)var4_5, (jvb)var2_3, (jrk)var3_4);
            var2_3 = this.g;
            var3_4 = new epk(this, (epc)var1_1, var7_6, 0);
            var12_9 = cqq.ag((eqa)var4_5, (jvb)var2_3, (jrk)var3_4);
            var13_8 = this.k;
            var14_7 = cqq.ao((epe)var4_5);
            var2_3 = var3_4 = var4_5.f.g;
            if (var3_4 == null) {
                var2_3 = eae.a;
            }
            if ((var2_3.b & 128) != 0) {
                var2_3 = var3_4 = var4_5.f.g;
                if (var3_4 == null) {
                    var2_3 = eae.a;
                }
                var2_3 = hhk.W(var2_3.i);
            } else {
                var2_3 = epg.a;
            }
            var3_4 = new epj(this, (epc)var1_1, var7_6);
            var13_8.b((String)var14_7, (Duration)var2_3, (elo)var3_4);
            var3_4 = this.i;
            var14_7 = var4_5.a;
            var15_10 = var4_5.b;
            var2_3 = var4_5.c;
            var5_14 = var4_5.d;
            var13_8 = var4_5.f;
            var9_13 = var4_5.g;
            var1_1 = new epf((eaj)var14_7, (epc)var15_10, (eqb)var2_3, var5_14, null, (eao)var13_8, var9_13, (jwi)var12_9);
            var3_4.add(var1_1);
            return var4_5;
        }
    }
}

