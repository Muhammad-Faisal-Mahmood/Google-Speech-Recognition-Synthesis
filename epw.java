/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public final class epw {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/microphone/registry/HotwordSessionsRegistry");
    private static final epn b = new epn(ebs.i, ebp.o, "the associated audio route is already inactive");
    private static final epn c = new epn(ebs.e, ebp.d, "not allowed while audio client is listening (concurrent mode insufficient)");
    private final emj d;
    private final enu e;
    private final jvb f;
    private final boolean g;
    private final List h;
    private final elp i;
    private final dtu j;
    private final eqe k;
    private final czh l;
    private final czh m;

    public epw(cqq cqq2, emj emj2, enu enu2, czh czh2, czh czh3, dtu dtu2, eqe eqe2, jvb jvb2, boolean bl2, elp elp2) {
        jse.e(cqq2, "audioSessionAssembler");
        jse.e(emj2, "micUpdateReporter");
        jse.e(enu2, "audioSessionToMicStateUpdater");
        jse.e(dtu2, "tokenGenerator");
        jse.e(jvb2, "lightweightScope");
        jse.e(elp2, "timeoutTracker");
        this.d = emj2;
        this.e = enu2;
        this.m = czh2;
        this.l = czh3;
        this.j = dtu2;
        this.k = eqe2;
        this.f = jvb2;
        this.g = bl2;
        this.i = elp2;
        this.h = new ArrayList();
    }

    private final void g(epp object) {
        Object object2;
        eps eps2 = (eps)object;
        object = object2 = eps2.c.g;
        if (object2 == null) {
            object = eip.a;
        }
        Object object3 = this.m;
        jse.d(object, "getClientInfo(...)");
        object2 = eps2.a;
        int n2 = eps2.d;
        Object object4 = eps2.b;
        long l2 = n2;
        object4 = ((eqb)object4).b;
        ((czh)object3).a.l((eip)object, (ecu)object2, l2, (ekk)object4);
        object4 = eps2.a;
        object = object2 = eps2.c.g;
        if (object2 == null) {
            object = eip.a;
        }
        Object object5 = ((czh)object3).d;
        n2 = eps2.d;
        object2 = object4.c();
        object5 = (evo)object5;
        l2 = n2;
        hhk.T((hpn)object2, gqk.g(new evn((evo)object5, l2, (eip)object, 0)), ((evo)object5).b);
        hhk.T(object4.a().a(), gqk.g(new evn((evo)object5, l2, (eip)object, 1)), ((evo)object5).b);
        object4 = ((czh)object3).b;
        object3 = eps2.a;
        object = object2 = eps2.c.g;
        if (object2 == null) {
            object = eip.a;
        }
        boa boa2 = new boa(16);
        object5 = ebs.af;
        hpn hpn2 = object3.c();
        object2 = (enc)object4;
        hhk.T(hpn2, gqk.g(new emz((enc)object2, boa2, (eip)object, (Enum)object5, 3)), ((enc)object2).c);
        object5 = new boa(17);
        object4 = ebp.J;
        hhk.T(object3.a().a(), gqk.g(new emz((enc)object2, (Predicate)object5, (eip)object, (Enum)object4, 4)), ((enc)object2).c);
        object = eps2.a;
        object4 = object.c();
        object2 = gqk.b(new dti(7));
        object3 = this.d;
        ((emj)object3).a(3, hno.f((hpn)object4, (gte)object2, ((emj)object3).a), hno.f(object.a().a(), gqk.b(new dti(8)), ((emj)object3).a));
        if (eps2.e) {
            this.e.i(eps2.a, -1, dww.i(efs.a));
        }
    }

    private static final eps h(ebs ebs2, ebp ebp2) {
        return new eps(new ekv(ebs2, ebp2), null, null, 0, true, 14);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final epp a(int n2) {
        synchronized (this) {
            epp epp22;
            block4: {
                for (epp epp22 : this.h) {
                    if (((epq)epp22).c != n2) continue;
                    break block4;
                }
                epp22 = null;
            }
            epp22 = epp22;
            if (epp22 != null) return epp22;
            return eps.e(epw.h(ebs.h, ebp.c), null, null, n2, 23);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List b() {
        synchronized (this) {
            Object object = this.h;
            ArrayList<epx> arrayList = new ArrayList<epx>(jns.B((Iterable)object));
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                Object object2;
                epp epp2 = (epp)iterator.next();
                object = object2 = epp2.c().g;
                if (object2 == null) {
                    object = eip.a;
                }
                jse.d(object, "getClientInfo(...)");
                int n2 = epp2.a();
                object2 = new eop(epp2, 5);
                epx epx2 = new epx((eip)object, n2, (jqz)object2, epp2.c());
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
    public final void c(int n2, ebv ebv2) {
        synchronized (this) {
            Object object2;
            block6: {
                jse.e(ebv2, "reason");
                for (Object object2 : this.h) {
                    if (((epq)object2).c != n2) continue;
                    break block6;
                }
                object2 = null;
            }
            epq epq2 = (epq)object2;
            if (epq2 == null) {
                return;
            }
            object2 = this.h;
            Object object3 = new epl(n2, 2);
            jns.E((List)object2, (jrk)object3);
            ((heg)a.f().h(hfo.a, "ALT.HotwordSessionsRegy").j("com/google/android/libraries/search/audio/microphone/registry/HotwordSessionsRegistry", "markStopped", 238, "HotwordSessionsRegistry.kt")).G("#audio# stopping(%s) hotword session(%d) for %s", ebv2.name(), epq2.c, cqq.ai(epq2.b));
            czh czh2 = this.m;
            jse.e(ebv2, "reason");
            object2 = object3 = epq2.b.g;
            if (object3 == null) {
                object2 = eip.a;
            }
            object3 = czh2.a;
            jse.d(object2, "getClientInfo(...)");
            object3.u((eip)object2, epq2.c);
            czh2.w(ech.l, epq2, ebv2);
            jvf.j(epq2.d);
            this.i.a(cqq.al(epq2));
            this.k.B(epq2.c, ebv2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(eqb object, ebv ebv2) {
        synchronized (this) {
            jse.e(ebv2, "reason");
            ArrayList arrayList = new ArrayList();
            for (Object t2 : this.h) {
                if (((epq)t2).a.a != ((eqb)object).a) continue;
                arrayList.add(t2);
            }
            object = arrayList.iterator();
            while (object.hasNext()) {
                this.c(((epq)object.next()).c, ebv2);
            }
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
            Object object2;
            Object object3;
            block5: {
                jse.e(object, "reason");
                object3 = this.h.iterator();
                while (object3.hasNext()) {
                    object2 = object3.next();
                    if (((epq)object2).c != n2) continue;
                    break block5;
                }
                object2 = null;
            }
            epq epq2 = (epq)object2;
            if (epq2 == null) {
                ((heg)a.f().h(hfo.a, "ALT.HotwordSessionsRegy").j("com/google/android/libraries/search/audio/microphone/registry/HotwordSessionsRegistry", "stopHotwordSessionSeamlessly$java_com_google_android_libraries_search_audio_microphone_registry_hotword_sessions_registry", 195, "HotwordSessionsRegistry.kt")).x("#audio# skipping hotword session(%d) seamless stop(%s), inactive", n2, ((Enum)object).name());
                object2 = this.m;
                jse.e(object, "reason");
                object3 = dox.o(ece.a.l());
                ((bzo)object3).B(ech.m);
                ((bzo)object3).F(n2);
                ((bzo)object3).G((ebv)object);
                object3 = ((bzo)object3).y();
                ((evo)((czh)object2).d).d((ece)object3);
                return elb.j(ebp.c, dpf.q(eda.a.l()).o(), (ebv)object);
            }
            Object object4 = this.m;
            jse.e(object, "reason");
            object2 = object3 = epq2.b.g;
            if (object3 == null) {
                object2 = eip.a;
            }
            object3 = ((czh)object4).a;
            jse.d(object2, "getClientInfo(...)");
            object3.u((eip)object2, epq2.c);
            ((czh)object4).w(ech.m, epq2, (ebv)object);
            object2 = this.i;
            object3 = new StringBuilder();
            ((StringBuilder)object3).append("hotword_session_seamless_handover_timeout:");
            ((StringBuilder)object3).append(epq2.c);
            object3 = ((StringBuilder)object3).toString();
            object4 = epr.a;
            epu epu2 = new epu(epq2, this);
            ((elp)object2).b((String)object3, (Duration)object4, epu2);
            return this.k.C(n2, (ebv)object);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final epp f(ecw var1_1, eqb var2_2, eqe var3_3) {
        synchronized (this) {
            block26: {
                block28: {
                    block27: {
                        jse.e(var1_1, "params");
                        var4_4 = this.j.h();
                        var11_5 = epw.a;
                        ((heg)var11_5.f().h(hfo.a, "ALT.HotwordSessionsRegy").j("com/google/android/libraries/search/audio/microphone/registry/HotwordSessionsRegistry", "startHotwordSession$java_com_google_android_libraries_search_audio_microphone_registry_hotword_sessions_registry", 81, "HotwordSessionsRegistry.kt")).x("#audio# starting hotword session(%d) for %s", var4_4, cqq.ai((ecw)var1_1));
                        jse.e(var1_1, "params");
                        var9_7 = var10_6 = var1_1.g;
                        if (var10_6 == null) {
                            var9_7 = eip.a;
                        }
                        var10_6 = this.m;
                        jse.d(var9_7, "getClientInfo(...)");
                        var7_8 = var4_4;
                        var12_9 = Duration.ofNanos(cgw.o());
                        jse.d(var12_9, "ofNanos(...)");
                        var10_6.a.t((eip)var9_7, var7_8, (Duration)var12_9);
                        var12_9 = dox.o(ece.a.l());
                        var12_9.B(ech.k);
                        jse.e(var1_1, "value");
                        var13_10 = var12_9.a;
                        if (!((hwp)var13_10).b.B()) {
                            ((hwp)var13_10).u();
                        }
                        var9_7 = var10_6.d;
                        var13_10 = (ece)((hwp)var13_10).b;
                        var1_1.getClass();
                        var13_10.d = var1_1;
                        var13_10.c = 202;
                        var12_9.E(var2_2.a);
                        var12_9.F(var7_8);
                        var12_9 = var12_9.y();
                        ((evo)var9_7).d((ece)var12_9);
                        var12_9 = var10_6.b;
                        var9_7 = var10_6 = var1_1.g;
                        if (var10_6 == null) {
                            var9_7 = eip.a;
                        }
                        ((enc)var12_9).e((eip)var9_7, "HOTWORD");
                        ((heg)var11_5.f().h(hfo.a, "ALT.HotwordSessionsRegy").j("com/google/android/libraries/search/audio/microphone/registry/HotwordSessionsRegistry", "enforceConcurrencyStateOnNewHotwordSession", 158, "HotwordSessionsRegistry.kt")).r("#audio# enforcing concurrency state on a new hotword session");
                        var9_7 = (epq)jns.l(this.h);
                        if (var9_7 != null) {
                            this.c(var9_7.c, ebv.d);
                        }
                        var6_11 = var2_2.c;
                        var10_6 = null;
                        if (!var6_11) break block27;
                        var3_3 = epw.b;
                        break block26;
                    }
                    var9_7 = var3_3.a;
                    if (var9_7 instanceof Collection && var9_7.isEmpty()) break block28;
                    var9_7 = var9_7.iterator();
                    while (var9_7.hasNext()) {
                        if (((Boolean)((epx)var9_7.next()).c.a()).booleanValue()) continue;
                        var5_12 = a.w(var1_1.h);
                        if (var5_12 == 0 || var5_12 != 2) ** GOTO lbl59
                        var3_3 = var3_3.a;
                        if (var3_3 instanceof Collection && var3_3.isEmpty()) break;
                        var3_3 = var3_3.iterator();
                        while (var3_3.hasNext()) {
                            if (((epx)var3_3.next()).a.b != 34 || !this.g) continue;
lbl59:
                            // 2 sources

                            var3_3 = epw.c;
                            break block26;
                        }
                        break block4;
                    }
                }
                var11_5 = this.l;
                jse.e(var1_1, "params");
                var3_3 = var9_7 = var11_5.l();
                if (var9_7 == null) {
                    var3_3 = var9_7 = var1_1.e;
                    if (var9_7 == null) {
                        var3_3 = eae.a;
                    }
                    var9_7 = var11_5.b;
                    var5_12 = var3_3.c;
                    var3_3 = euf.q((Context)((dml)var9_7).a) && var5_12 != 1999 ? new epn(ebs.j, ebp.p, a.ah(var5_12, "audio source ", " is not allowed")) : null;
                }
                var9_7 = var3_3;
                if (var3_3 == null) {
                    var9_7 = ((enx)var11_5.d).c() == false ? new epn(ebs.k, ebp.q, "record audio OP not allowed") : null;
                }
                if (var9_7 == null) {
                    var3_3 = var9_7 = var1_1.e;
                    if (var9_7 == null) {
                        var3_3 = eae.a;
                    }
                    var3_3 = var3_3.c == 1999 && !euf.q((Context)var11_5.a) ? new epn(ebs.m, ebp.s, "no CAPTURE_AUDIO_HOTWORD permission") : null;
                } else {
                    var3_3 = var9_7;
                }
            }
            if (var3_3 == null) {
                ((heg)epw.a.f().h(hfo.a, "ALT.HotwordSessionsRegy").j("com/google/android/libraries/search/audio/microphone/registry/HotwordSessionsRegistry", "handleHotwordSessionStartConditions", 136, "HotwordSessionsRegistry.kt")).s("#audio# hotword session(%d) OK to start", var4_4);
                var3_3 = null;
            } else {
                ((heg)epw.a.h().h(hfo.a, "ALT.HotwordSessionsRegy").j("com/google/android/libraries/search/audio/microphone/registry/HotwordSessionsRegistry", "handleHotwordSessionStartConditions", 142, "HotwordSessionsRegistry.kt")).G("#audio# hotword session(%d) start conditions failed for %s: %s", var4_4, cqq.ai((ecw)var1_1), var3_3.c);
                var9_7 = var3_3.b;
                var3_3 = eps.e(epw.h(var3_3.a, (ebp)var9_7), (eqb)var2_2, (ecw)var1_1, var4_4, 17);
                this.g((epp)var3_3);
            }
            if (var3_3 != null) {
                return var3_3;
            }
            var9_7 = this.e;
            if (var4_4 == -1) {
                ((heg)enu.a.h().h(hfo.a, "ALT.SessionMicUpdater").j("com/google/android/libraries/search/audio/microphone/AudioSessionToMicStateUpdater", "reportUpcomingHotwordSession", 90, "AudioSessionToMicStateUpdater.kt")).r("#audio# unexpected inactive token, skip reporting");
            } else {
                var11_5 = var9_7.b;
                var3_3 = euf.z(erv.a.l());
                var3_3.O(eqz.c);
                var3_3.Q(var9_7.g(var4_4));
                var3_3.P(eqw.b);
                var11_5.d(var3_3.N());
            }
            var3_3 = this.k;
            var11_5 = var2_2.a();
            var9_7 = new eqr(var4_4, (ecw)var1_1);
            var9_7 = var3_3.y((eqv)var11_5, (eqr)var9_7);
            var3_3 = new eps((ecu)var9_7, (eqb)var2_2, (ecw)var1_1, var4_4, false, 16);
            this.g((epp)var3_3);
            var6_11 = var3_3.e;
            if (var6_11) {
                return var3_3;
            }
            var1_1 = this.f;
            var2_2 = new epv(this, var4_4, 0);
            cqq.ah((epz)var3_3, (jvb)var1_1, (jrk)var2_2);
            var2_2 = this.f;
            var1_1 = new epv(this, var4_4, 2);
            var9_7 = cqq.ag((eqa)var3_3, (jvb)var2_2, (jrk)var1_1);
            var2_2 = var1_1 = var3_3.c.e;
            if (var1_1 == null) {
                var2_2 = eae.a;
            }
            var1_1 = var10_6;
            if ((var2_2.b & 128) != 0) {
                var1_1 = var2_2 = var3_3.c.e;
                if (var2_2 == null) {
                    var1_1 = eae.a;
                }
                var1_1 = hhk.W(var1_1.i);
            }
            if (var1_1 != null) {
                var11_5 = this.i;
                var10_6 = cqq.al((epp)var3_3);
                var2_2 = new ept(this, var4_4);
                var11_5.b((String)var10_6, (Duration)var1_1, (elo)var2_2);
            }
            var12_9 = this.h;
            var10_6 = var3_3.a;
            var1_1 = var3_3.b;
            var11_5 = var3_3.c;
            var4_4 = var3_3.d;
            var6_11 = var3_3.e;
            var2_2 = new epq((ecu)var10_6, (eqb)var1_1, (ecw)var11_5, var4_4, var6_11, (jwi)var9_7);
            var12_9.add(var2_2);
            return var3_3;
        }
    }
}

