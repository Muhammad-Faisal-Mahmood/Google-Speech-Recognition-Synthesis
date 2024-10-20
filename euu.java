/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class euu
extends eue {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/service/impl/AudioServiceImpl");
    public final Executor b;
    public final czh c;
    private final dml d;
    private final cxu e;
    private final cxu f;
    private final bmu g;

    public euu(czh czh2, Executor executor, dml dml2, bmu bmu2, cxu cxu2, cxu cxu3) {
        this.c = czh2;
        this.b = executor;
        this.d = dml2;
        this.g = bmu2;
        this.e = cxu2;
        this.f = cxu3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(eam object, jnf object2) {
        synchronized (this) {
            Object object3;
            Object object4 = (heg)((heg)a.f().h(hfo.a, "ALT.AudioService")).j("com/google/android/libraries/search/audio/service/impl/AudioServiceImpl", "activateAudioRequestClient", 90, "AudioServiceImpl.java");
            Object object5 = object3 = ((eam)object).c;
            if (object3 == null) {
                object5 = eip.a;
            }
            object4.u("#audio# activate client(%s) remote request", crh.O((eip)object5));
            object4 = this.c.C((eam)object);
            object3 = this.f;
            int n2 = ((eki)object4).a;
            object5 = ((eki)object4).b;
            object = new dpw(this, object4, 12);
            object4 = ((eka)object5).c;
            object4.getClass();
            jvb jvb2 = (jvb)((cxu)object3).b.b();
            jvb2.getClass();
            object3 = (Executor)((cxu)object3).a.b();
            object3.getClass();
            object5 = new euw(n2, (hpn)object4, (Runnable)object, (jnf)object2, jvb2, (Executor)object3);
            if (((euw)object5).g.c()) {
                ((heg)euw.a.c().h(hfo.a, "ALT.GrpcClientRespSndr").j("com/google/android/libraries/search/audio/service/impl/StreamAudioClientResponseSender", "start", 50, "StreamAudioClientResponseSender.kt")).r("#audio# skipping sending due to already started");
                return;
            }
            ((heg)euw.a.c().h(hfo.a, "ALT.GrpcClientRespSndr").j("com/google/android/libraries/search/audio/service/impl/StreamAudioClientResponseSender", "start", 53, "StreamAudioClientResponseSender.kt")).s("#audio# starting sending client(%d) info", ((euw)object5).b);
            object = ((euw)object5).e;
            object2 = new esz((euw)object5, null, 4);
            jse.ah((jvb)object, null, null, (jro)object2, 3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b(eug hwv2, jnf jnf2) {
        synchronized (this) {
            eco eco2 = hwv2.b;
            hwv2 = eco2;
            if (eco2 == null) {
                hwv2 = eco.a;
            }
            int n2 = ((eco)hwv2).c;
            ((heg)((heg)a.f().h(hfo.a, "ALT.AudioService")).j("com/google/android/libraries/search/audio/service/impl/AudioServiceImpl", "deactivateClient", 108, "AudioServiceImpl.java")).s("#audio# deactivateClient, token=%d", n2);
            this.c.K(n2, eap.e);
            jnf2.c(hwh.a);
            jnf2.a();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c(eat object, jnf jnf2) {
        synchronized (this) {
            ((heg)((heg)a.f().h(hfo.a, "ALT.AudioService")).j("com/google/android/libraries/search/audio/service/impl/AudioServiceImpl", "getAudioRequestReadOnlyListeningSession", 357, "AudioServiceImpl.java")).s("#audio# get audio read only session(%s)", ((eat)object).b);
            Object object2 = ((czh)this.d.a).A((eat)object);
            Object object3 = ((ekt)object2).a;
            hpn hpn2 = object3.c();
            jrk jrk2 = ekr.a;
            object3 = ((eai)object3.d()).a();
            Object object4 = ((ekt)object2).a;
            object2 = ekr.b;
            object4 = object4.b();
            object = gto.i(((eat)object).b);
            bpw bpw2 = new bpw(13);
            this.g.F(hpn2, jrk2, (hpn)object3, (jrk)object2, (hpn)object4, (gto)object, bpw2, jnf2).k();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d(euj object, jnf jnf2) {
        synchronized (this) {
            Object object2;
            Object object3;
            Object object4 = gsl.a;
            int n2 = ((euj)object).b;
            if (n2 == 2) {
                n2 = ((eco)((euj)object).c).c;
                ((heg)((heg)a.f().h(hfo.a, "ALT.AudioService")).j("com/google/android/libraries/search/audio/service/impl/AudioServiceImpl", "startListening", 161, "AudioServiceImpl.java")).s("#audio# audio client(%d) start remote request", n2);
            } else {
                if (n2 != 4) {
                    ((heg)((heg)a.g().h(hfo.a, "ALT.AudioService")).j("com/google/android/libraries/search/audio/service/impl/AudioServiceImpl", "startListening", 167, "AudioServiceImpl.java")).r("#audio# not enough params for start remote request");
                    jnf2.a();
                    return;
                }
                object3 = gto.i((eau)((euj)object).c);
                object4 = ((euj)object).b == 4 ? (eau)((euj)object).c : eau.a;
                object4 = object2 = ((eau)object4).c;
                if (object2 == null) {
                    object4 = eco.a;
                }
                n2 = ((eco)object4).c;
                ((heg)((heg)a.f().h(hfo.a, "ALT.AudioService")).j("com/google/android/libraries/search/audio/service/impl/AudioServiceImpl", "startListening", 165, "AudioServiceImpl.java")).s("#audio# audio client(%d)'s route start remote request", n2);
                object4 = object3;
            }
            if (((gto)object4).g()) {
                object3 = this.c;
                object2 = ((gto)object4).c();
                object = object4 = ((euj)object).d;
                if (object4 == null) {
                    object = eao.a;
                }
                object = ((czh)object3).F((eau)object2, (eao)object);
            } else {
                object3 = this.c;
                object = object4 = ((euj)object).d;
                if (object4 == null) {
                    object = eao.a;
                }
                object = ((czh)object3).E(n2, (eao)object);
            }
            bmu bmu2 = this.g;
            Object object5 = ((ekj)object).a;
            object2 = object5.c();
            object4 = ekr.a;
            hpn hpn2 = ((eai)object5.d()).a();
            object3 = ekr.b;
            object5 = object5.b();
            gto gto2 = gto.i(((ekj)object).b);
            mp mp2 = new mp(this, n2, object, 5);
            bmu2.F((hpn)object2, (jrk)object4, hpn2, (jrk)object3, (hpn)object5, gto2, mp2, jnf2).k();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void e(euh object, jnf jnf2) {
        synchronized (this) {
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            if ((((euh)object).b & 2) != 0) {
                object4 = object5 = ((euh)object).d;
                if (object5 == null) {
                    object4 = ebl.a;
                }
                object3 = (heg)((heg)a.f().h(hfo.a, "ALT.AudioService")).j("com/google/android/libraries/search/audio/service/impl/AudioServiceImpl", "startListeningForHotword", 245, "AudioServiceImpl.java");
                object5 = object2 = ((ebl)object4).c;
                if (object2 == null) {
                    object5 = edf.a;
                }
                object3.s("#audio# hotword client's route(%d) start remote request", ((edf)object5).c);
                object3 = this.c;
                object5 = object2 = ((euh)object).c;
                if (object2 == null) {
                    object5 = ecw.a;
                }
                object4 = ((czh)object3).J((ebl)object4, (ecw)object5);
            } else {
                ((heg)((heg)a.f().h(hfo.a, "ALT.AudioService")).j("com/google/android/libraries/search/audio/service/impl/AudioServiceImpl", "startListeningForHotword", 252, "AudioServiceImpl.java")).r("#audio# hotword client start remote request");
                object2 = this.c;
                object4 = object5 = ((euh)object).c;
                if (object5 == null) {
                    object4 = ecw.a;
                }
                object4 = ((czh)object2).I((ecw)object4);
            }
            object2 = this.g;
            object5 = ((ekm)object4).a;
            object3 = object5.c();
            jrk jrk2 = ekr.c;
            hpn hpn2 = object5.a().a();
            jrk jrk3 = ekr.d;
            object = object5 = ((euh)object).c;
            if (object5 == null) {
                object = ecw.a;
            }
            object = object5 = ((ecw)object).e;
            if (object5 == null) {
                object = eae.a;
            }
            int n2 = ((ekm)object4).b;
            object5 = hhk.K(object);
            gto gto2 = gto.i(n2);
            object = new dpw(this, object4, 13);
            ((bmu)object2).F((hpn)object3, jrk2, hpn2, jrk3, (hpn)object5, gto2, (Runnable)object, jnf2).k();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void f(eul object, jnf jnf2) {
        synchronized (this) {
            eco eco2 = ((eul)object).b;
            Object object2 = eco2;
            if (eco2 == null) {
                object2 = eco.a;
            }
            int n2 = ((eco)object2).c;
            object = object2 = ((eul)object).c;
            if (object2 == null) {
                object = edf.a;
            }
            int n3 = ((edf)object).c;
            ((heg)((heg)a.f().h(hfo.a, "ALT.AudioService")).j("com/google/android/libraries/search/audio/service/impl/AudioServiceImpl", "stopListening", 206, "AudioServiceImpl.java")).s("#audio# stopListening sessionToken: %d", n3);
            object = this.c.D((int)n2, (int)n3).a.a().a();
            object2 = new eur(jnf2, n2, n3);
            hhk.T((hpn)object, gqk.g((hpb)object2), this.b);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void g(edf object, jnf jnf2) {
        synchronized (this) {
            int n2 = ((edf)object).c;
            ((heg)((heg)a.f().h(hfo.a, "ALT.AudioService")).j("com/google/android/libraries/search/audio/service/impl/AudioServiceImpl", "stopListeningForHotword", 279, "AudioServiceImpl.java")).s("#audio# stopListeningForHotword sessionToken: %d", n2);
            hpn hpn2 = this.c.H((int)n2).a.b().a();
            object = new eus(jnf2, n2, 0);
            hhk.T(hpn2, gqk.g((hpb)object), this.b);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void h(edf object, jnf jnf2) {
        synchronized (this) {
            int n2 = ((edf)object).c;
            ((heg)((heg)a.f().h(hfo.a, "ALT.AudioService")).j("com/google/android/libraries/search/audio/service/impl/AudioServiceImpl", "stopListeningForSeamlessMode", 315, "AudioServiceImpl.java")).s("#audio# stopListeningForSeamlessMode sessionToken: %d", n2);
            eky eky2 = this.c.H((int)n2).a.d();
            object = hhk.K((ecy)((hwp)eky2.b).o());
            eut eut2 = new eut(this, eky2, jnf2, n2, 0);
            hhk.T((hpn)object, gqk.g(eut2), this.b);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void i(eup object, jnf jnf2) {
        synchronized (this) {
            Object object2;
            ((heg)((heg)a.f().h(hfo.a, "ALT.AudioService")).j("com/google/android/libraries/search/audio/service/impl/AudioServiceImpl", "updateHotwordRoute", 139, "AudioServiceImpl.java")).r("#audio# update hotword client's route remote request");
            object = object2 = ((eup)object).b;
            if (object2 == null) {
                object = ebk.a;
            }
            Object object3 = this.c;
            object2 = this.e;
            object3 = ((czh)object3).G((ebk)object);
            int n2 = ((ekl)object3).b;
            hpn hpn2 = ((ekl)object3).a.a();
            object = new dpw(this, object3, 14);
            ((cxu)object2).g(n2, hpn2, (Runnable)object, jnf2).d();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void j(euq object, jnf jnf2) {
        synchronized (this) {
            Object object2;
            Object object3 = object2 = ((euq)object).b;
            if (object2 == null) {
                object3 = eco.a;
            }
            int n2 = ((eco)object3).c;
            ((heg)((heg)a.f().h(hfo.a, "ALT.AudioService")).j("com/google/android/libraries/search/audio/service/impl/AudioServiceImpl", "updateRoute", 118, "AudioServiceImpl.java")).s("#audio# update client's(%d) route remote request", n2);
            object2 = this.c;
            object = object3 = ((euq)object).c;
            if (object3 == null) {
                object = eaw.a;
            }
            object3 = ((czh)object2).B(n2, (eaw)object);
            object = this.e;
            int n3 = ((ekh)object3).b;
            object2 = ((ekh)object3).a.a();
            mp mp2 = new mp(this, n2, object3, 4);
            ((cxu)object).g(n3, (hpn)object2, mp2, jnf2).d();
            return;
        }
    }

    @Override
    public final void k(jnf jnf2) {
        jnf2.c(hwh.a);
    }
}

