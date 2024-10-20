/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public final class etw {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/routing/registry/AudioRoutesRegistry");
    private static final ety d = new ety(ebs.c, ebp.b, ebg.i, ebo.c, "the associated audio client is already inactive");
    private static final ety e;
    private static final ety f;
    public final List b;
    public final czh c;
    private final eqe g;
    private final Executor h;
    private final hou i;
    private final boolean j;
    private final List k;
    private final dtu l;
    private final eqe m;
    private final eqe n;
    private final czh o;
    private final bzo p;

    static {
        new ety(ebs.i, ebp.o, ebg.F, ebo.j, "the associated route parent is already inactive");
        e = new ety(ebs.f, ebp.t, ebg.y, ebo.h, "the target audio route is unknown (handover failed?)");
        f = new ety(ebs.ah, ebp.L, ebg.z, ebo.h, "ambient route cannot connect due to a conflict with another active session");
    }

    public etw(cqq cqq2, czh czh2, dtu dtu2, bzo bzo2, eqe eqe2, czh czh3, eqe eqe3, eqe eqe4, dpg dpg2, Executor executor, hou hou2, eqe eqe5, boolean bl2) {
        jse.e(cqq2, "listeningSessionAssembler");
        jse.e(dtu2, "tokenGenerator");
        jse.e(dpg2, "hotwordUriChecker");
        jse.e(executor, "lightweightExecutor");
        jse.e(hou2, "audioExecutionSequencer");
        this.c = czh2;
        this.l = dtu2;
        this.p = bzo2;
        this.n = eqe2;
        this.o = czh3;
        this.g = eqe3;
        this.h = executor;
        this.i = hou2;
        this.m = eqe5;
        this.j = bl2;
        this.b = new ArrayList();
        this.k = new ArrayList();
        eqe4.z(new etv(this, 0));
    }

    private static final ett g(ebg ebg2) {
        return new ett(new ekz(ebg2), -1, ekk.a(), new etp(null), dpg.d(eaw.a.l()).h());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final etr a(etp object, Integer n2, Integer object22) {
        synchronized (this) {
            block6: {
                if (((etp)object).c) {
                    return ett.h(etw.g(ebg.i), euf.n(n2), (etp)object, null, 109);
                }
                for (Object object22 : this.b) {
                    int n3;
                    ets ets2 = (ets)object22;
                    int n4 = ((etp)object).a;
                    int n5 = ets2.d.a;
                    int n6 = n3 = 1;
                    if (n2 != null) {
                        n6 = ets2.b;
                        n6 = n2 == n6 ? n3 : 0;
                    }
                    if (n4 != n5 || n6 == 0) continue;
                    break block6;
                }
                object22 = null;
            }
            object22 = (ets)object22;
            if (object22 != null) return object22;
            return ett.h(etw.g(ebg.c), euf.n(n2), (etp)object, null, 109);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(etp object, ebg ebg2) {
        synchronized (this) {
            Object object22;
            jse.e(ebg2, "reason");
            Iterator iterator = new ArrayList();
            for (Object object22 : this.b) {
                if (((ets)object22).d.a != ((etp)object).a) continue;
                iterator.add(object22);
            }
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                object = (ets)iterator.next();
                this.d(((ets)object).d, ((ets)object).b, ebg2);
            }
            object = new ArrayList();
            iterator = this.k.iterator();
            if (iterator.hasNext()) {
                object = ((etq)iterator.next()).a;
                throw null;
            }
            object22 = this.k;
            iterator = new etv(object, 2);
            jns.E(object22, (jrk)((Object)iterator));
            object = object.iterator();
            boolean bl2 = object.hasNext();
            if (!bl2) {
                return;
            }
            object = (etq)object.next();
            iterator = (heg)a.f().h(hfo.a, "ALT.AudioRoutesRegy").j("com/google/android/libraries/search/audio/routing/registry/AudioRoutesRegistry", "markDisconnected", 528, "AudioRoutesRegistry.kt");
            ebg2.name();
            int n2 = ((etq)object).b;
            object = ((etq)object).a;
            throw null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(etp etp2) {
        synchronized (this) {
            int n2 = this.l.h();
            ((heg)a.f().h(hfo.a, "ALT.AudioRoutesRegy").j("com/google/android/libraries/search/audio/routing/registry/AudioRoutesRegistry", "initDefaultAudioClientRoute$java_com_google_android_libraries_search_audio_routing_registry_audio_routes_registry", 171, "AudioRoutesRegistry.kt")).x("#audio# initializing the default route(%d) for %s", n2, etp2.a());
            Object object = dpg.b(eau.a.l());
            Object object2 = dox.m(eco.a.l());
            ((bzq)object2).E(etp2.a);
            ((dlm)object).e(((bzq)object2).D());
            object2 = dpf.u(edf.a.l());
            ((cxt)object2).y(n2);
            ((dlm)object).f(((cxt)object2).x());
            object = ((dlm)object).d();
            eth eth2 = new eth(gsl.a);
            object2 = eth2.a().a;
            etf etf2 = this.p.T((eau)object, (hpn)object2);
            object = object2 = ((eau)object).d;
            if (object2 == null) {
                object = edf.a;
            }
            n2 = ((edf)object).c;
            object = dpg.d(eaw.a.l());
            ((dml)object).i(eth2.a().b);
            object2 = ((dml)object).h();
            object = new ets(eth2, etf2, n2, etp2, (eaw)object2);
            this.c.p((etr)object);
            this.b.add(object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(etp object, int n2, ebg ebg2) {
        synchronized (this) {
            jse.e(ebg2, "reason");
            if (!((etp)object).c) {
                ets ets2;
                block6: {
                    for (Object object2 : this.b) {
                        ets2 = (ets)object2;
                        if (ets2.d.a != ((etp)object).a || ets2.b != n2) continue;
                        object = object2;
                        break block6;
                    }
                    object = null;
                }
                ets2 = (ets)object;
                if (ets2 != null) {
                    Object object2;
                    object2 = this.b;
                    object = new epl(n2, 6);
                    jns.E(object2, (jrk)object);
                    object2 = (heg)a.f().h(hfo.a, "ALT.AudioRoutesRegy").j("com/google/android/libraries/search/audio/routing/registry/AudioRoutesRegistry", "markDisconnected", 545, "AudioRoutesRegistry.kt");
                    Object object3 = ebg2.name();
                    object = crh.N(ets2.e.b);
                    Object object4 = new StringBuilder();
                    ((StringBuilder)object4).append("route(token(");
                    ((StringBuilder)object4).append(ets2.b);
                    ((StringBuilder)object4).append("), ");
                    ((StringBuilder)object4).append((String)object);
                    ((StringBuilder)object4).append(")");
                    object2.G("#audio# disconnecting(%s) audio %s for %s", object3, ((StringBuilder)object4).toString(), ets2.d.a());
                    this.g.h(euf.p(ets2), ekr.j(ebg2));
                    object3 = this.c;
                    object4 = ets2.d;
                    object = object2 = ((etp)object4).b.c;
                    if (object2 == null) {
                        object = eip.a;
                    }
                    object2 = ((czh)object3).a;
                    jse.d(object, "getClientInfo(...)");
                    object2.p((eip)object, ((etp)object4).a);
                    object = this.i;
                    object2 = new etu(ets2, ebg2, 0);
                    gax.c(((hou)object).b(gqk.c((hnx)object2), this.h), "Disconnecting the audio route failed", new Object[0]);
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
    public final void e() {
        synchronized (this) {
            Object object = this.k.iterator();
            boolean bl2 = object.hasNext();
            if (!bl2) {
                return;
            }
            object = ((etq)object.next()).a;
            throw null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final etr f(etp object, eaw object2, cxt object3) {
        synchronized (this) {
            block32: {
                Object object4;
                int n2;
                czh czh2;
                Object object5;
                Object object6;
                Object object7;
                int n3;
                block31: {
                    jse.e(object2, "params");
                    n3 = this.l.h();
                    object7 = a;
                    ((heg)((hdz)object7).f().h(hfo.a, "ALT.AudioRoutesRegy").j("com/google/android/libraries/search/audio/routing/registry/AudioRoutesRegistry", "connectAudioRoute$java_com_google_android_libraries_search_audio_routing_registry_audio_routes_registry", 229, "AudioRoutesRegistry.kt")).G("#audio# updating to audio route(token(%d), %s) for %s", n3, euf.o((eaw)object2), ((etp)object).a());
                    jse.e(object2, "params");
                    object5 = object6 = ((etp)object).b.c;
                    if (object6 == null) {
                        object5 = eip.a;
                    }
                    czh2 = this.c;
                    jse.d(object5, "getClientInfo(...)");
                    n2 = ((etp)object).a;
                    czh2.a.n((eip)object5, n2);
                    object4 = dox.o(ece.a.l());
                    ((bzo)object4).B(ech.h);
                    ((bzo)object4).D(((etp)object).a);
                    jse.e(object2, "value");
                    object5 = ((bzo)object4).a;
                    if (!((hwp)object5).b.B()) {
                        ((hwp)object5).u();
                    }
                    object5 = (ece)((hwp)object5).b;
                    object2.getClass();
                    ((ece)object5).d = object2;
                    ((ece)object5).c = 204;
                    object5 = object6 = ((etp)object).b.c;
                    if (object6 == null) {
                        object5 = eip.a;
                    }
                    object6 = czh2.d;
                    ((bzo)object4).C((eip)object5);
                    ((bzo)object4).E(n3);
                    object5 = ((bzo)object4).y();
                    ((evo)object6).d((ece)object5);
                    ((heg)((hdz)object7).f().h(hfo.a, "ALT.AudioRoutesRegy").j("com/google/android/libraries/search/audio/routing/registry/AudioRoutesRegistry", "enforceConcurrencyStateOnNewAudioRoute", 332, "AudioRoutesRegistry.kt")).C("#audio# enforcing %s route(parent=%d) concurrency", ((etp)object).a(), null);
                    object6 = this.b.iterator();
                    while (object6.hasNext()) {
                        object5 = object6.next();
                        if (((ets)object5).d.a != ((etp)object).a) continue;
                        break block31;
                    }
                    object5 = null;
                }
                object5 = (ets)object5;
                if (object5 != null) {
                    object6 = ebg.d;
                    jse.i(null, null);
                    this.d(((ets)object5).d, ((ets)object5).b, (ebg)object6);
                }
                object5 = object6 = ((eaw)object2).c;
                if (object6 == null) {
                    object5 = eaz.a;
                }
                if (((eaz)object5).b == 5) {
                    object3 = (ekk)jns.l((List)((cxt)object3).a);
                    object3 = object3 != null ? ((ekk)object3).b : null;
                } else {
                    object3 = object5 = ((eaw)object2).c;
                    if (object5 == null) {
                        object3 = eaz.a;
                    }
                }
                boolean bl2 = ((etp)object).c;
                object6 = gto.h(object3);
                if (bl2) {
                    object3 = d;
                } else if (!((gto)object6).g()) {
                    object3 = e;
                } else {
                    object3 = object5 = eal.b(((etp)object).b.d);
                    if (object5 == null) {
                        object3 = eal.a;
                    }
                    object3 = object3 == eal.b && this.g.j(Arrays.copyOf(new eal[]{object5 = eal.a, object3 = eal.c}, 2)) ? f : null;
                }
                if (object3 == null) {
                    ((heg)a.f().h(hfo.a, "ALT.AudioRoutesRegy").j("com/google/android/libraries/search/audio/routing/registry/AudioRoutesRegistry", "handleAudioRouteUpdateConditions", 298, "AudioRoutesRegistry.kt")).x("#audio# audio route(token(%d), %s) OK to update", n3, euf.o((eaw)object2));
                    object3 = null;
                } else {
                    ((heg)a.h().h(hfo.a, "ALT.AudioRoutesRegy").j("com/google/android/libraries/search/audio/routing/registry/AudioRoutesRegistry", "handleAudioRouteUpdateConditions", 304, "AudioRoutesRegistry.kt")).H("#audio# updating to route(token(%d), %s) failed for %s: %s", n3, euf.o((eaw)object2), ((etp)object).a(), ((ety)object3).e);
                    object5 = ett.h(etw.g(((ety)object3).c), n3, (etp)object, (eaw)object2, 77);
                    this.c.p((etr)object5);
                    this.c.r(elb.i(((ety)object3).d), (etr)object5);
                    object3 = object5;
                }
                if (object3 != null) {
                    return object3;
                }
                object6 = (eaz)((gto)object6).c();
                switch (eay.a(((eaz)object6).b).ordinal()) {
                    default: {
                        break block32;
                    }
                    case 7: {
                        object5 = this.n;
                        object7 = edo.d;
                        object3 = ewl.a;
                        object3 = ((eqe)object5).w((eaz)object6, (edo)object7, ewl.a((eaw)object2));
                        break;
                    }
                    case 6: {
                        object3 = this.n.v((eaz)object6, edo.c);
                        break;
                    }
                    case 5: {
                        object3 = this.n.v((eaz)object6, edo.b);
                        break;
                    }
                    case 4: {
                        object3 = crh.L((eaz)object6);
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Route(");
                        ((StringBuilder)object2).append((String)object3);
                        ((StringBuilder)object2).append(") is unexpected");
                        object = new IllegalStateException(((StringBuilder)object2).toString());
                        throw object;
                    }
                    case 3: {
                        object7 = this.n;
                        object5 = edo.a;
                        object3 = ewl.a;
                        object3 = ((eqe)object7).w((eaz)object6, (edo)object5, ewl.a((eaw)object2));
                        break;
                    }
                    case 1: 
                    case 2: 
                    case 8: {
                        object5 = ewl.a;
                        object3 = new eth(ewl.a((eaw)object2));
                        break;
                    }
                    case 0: {
                        czh2 = this.o;
                        object3 = ((etp)object).b;
                        object3 = object5 = ((eam)object3).c;
                        if (object5 == null) {
                            object3 = eip.a;
                        }
                        jse.d(object3, "getClientInfo(...)");
                        object7 = new emm((eip)object3, n3, null, ((etp)object).a, 4);
                        object3 = ((eaz)object6).b == 1 ? (ebd)((eaz)object6).c : ebd.a;
                        object5 = object6 = ((etp)object).b.c;
                        if (object6 == null) {
                            object5 = eip.a;
                        }
                        n2 = ((eip)object5).b == 41 && this.j ? 2 : 1;
                        object3.getClass();
                        object5 = czh2.c;
                        object6 = czh2.b;
                        object5 = object5.b();
                        object4 = (jvb)object6.b();
                        object4.getClass();
                        object6 = (Executor)czh2.d.b();
                        object6.getClass();
                        czh2 = ((end)czh2.a).a();
                        object3 = new eif((emm)object7, (ebd)object3, n2, (gfl)object5, (jvb)object4, (Executor)object6, czh2);
                    }
                }
                object3 = this.m.u((esy)object3);
                ((heg)a.f().h(hfo.a, "ALT.AudioRoutesRegy").j("com/google/android/libraries/search/audio/routing/registry/AudioRoutesRegistry", "startAudioRouteConnection", 411, "AudioRoutesRegistry.kt")).G("#audio# starting connection to audio route(token(%d), %s) for %s", n3, crh.N(((etn)object3).d.b), ((etp)object).a());
                object6 = this.i;
                object5 = new etu(object3, this, 2, null);
                object5 = ((hou)object6).b(gqk.c((hnx)object5), this.h);
                jse.d(object5, "submitAsync(...)");
                object6 = dpg.b(eau.a.l());
                object7 = dox.m(eco.a.l());
                ((bzq)object7).E(((etp)object).a);
                ((dlm)object6).e(((bzq)object7).D());
                object7 = dpf.u(edf.a.l());
                ((cxt)object7).y(n3);
                ((dlm)object6).f(((cxt)object7).x());
                object6 = ((dlm)object6).d();
                object6 = this.p.T((eau)object6, ((etn)object3).d.a);
                object7 = new ets((esx)object3, (eak)object6, n3, (etp)object, (eaw)object2);
                this.c.r((hpn)object5, (etr)object7);
                this.b.add(object7);
                return object7;
            }
            object = new joa();
            throw object;
        }
    }
}

