/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class jel
implements Runnable {
    final Object a;
    private final int b;

    public jel(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public /* synthetic */ jel(jgx jgx2, int n2, byte[] byArray) {
        this.b = n2;
        this.a = jgx2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        int n2 = this.b;
        long l2 = 0L;
        int n3 = 1;
        boolean bl2 = true;
        int n4 = 1;
        int n5 = 0;
        switch (n2) {
            default: {
                jid.x((jid)((jho)this.a).f);
                Object object = (jid)((jho)this.a).f;
                jcl jcl2 = ((jid)object).v;
                Object object2 = ((jid)object).F;
                object = ((bmu)object2).c;
                Object object3 = ((bmu)object2).b;
                object2 = (iwx)((bmu)object2).a;
                object3 = (jck)((Object)object3);
                jcl2.a((iyh)object, (jck)((Object)object3), (iwx)object2);
                return;
            }
            case 19: {
                Object object = this.a;
                jel jel2 = new jel(object, 18);
                ((jhm)object).b.execute(jel2);
                return;
            }
            case 18: {
                jhm jhm2 = (jhm)this.a;
                if (!jhm2.e) {
                    jhm2.f = null;
                    return;
                }
                l2 = jhm2.a();
                Object object = this.a;
                jhm2 = (jhm)object;
                if ((l2 = jhm2.d - l2) > 0L) {
                    jhm2.f = jhm2.a.schedule(new jel(object, 19), l2, TimeUnit.NANOSECONDS);
                    return;
                }
                jhm2.e = false;
                jhm2.f = null;
                jhm2.c.run();
                return;
            }
            case 17: {
                ((jhb)this.a).a.a();
                return;
            }
            case 16: {
                ((iwh)this.a).d();
                return;
            }
            case 15: {
                jgx jgx2 = (jgx)this.a;
                jgx2.n = null;
                if (!jgx2.h.e()) return;
                ((iwh)this.a).d();
                return;
            }
            case 14: {
                ((jbk)this.a).f.h(jfs.c);
                return;
            }
            case 13: {
                Object object = this.a;
                Object object4 = ((jfo)object).f.c.w;
                if (object4 == null) return;
                object4.remove(object);
                if (!((jfo)this.a).f.c.w.isEmpty()) return;
                object4 = ((jfo)this.a).f.c;
                ((jfs)object4).Q.c(((jfs)object4).x, false);
                object4 = ((jfo)this.a).f.c;
                ((jfs)object4).w = null;
                if (!((jfs)object4).A.get()) return;
                object4 = this.a;
                object = jfs.b;
                ((jfo)object4).f.c.z.a((iyh)object);
                return;
            }
            case 12: {
                ((jfp)this.a).c.g();
                return;
            }
            case 11: {
                Object object = (jfp)this.a;
                if (((jfp)object).c.w != null) return;
                if (((jfp)object).a.get() == jfs.e) {
                    ((jfp)this.a).a.set(null);
                }
                Object object5 = this.a;
                object = jfs.b;
                ((jfp)object5).c.z.a((iyh)object);
                return;
            }
            case 10: {
                jfs jfs2 = ((jfk)this.a).b;
                jfs2.m.c();
                if (!jfs2.s) return;
                jfs2.r.b();
                return;
            }
            case 9: {
                jfs jfs3 = (jfs)this.a;
                if (jfs3.t == null) {
                    return;
                }
                jfs3.j(true);
                jfs3.y.a(null);
                jfs3.G.a(2, "Entering IDLE state");
                jfs3.o.a(iui.d);
                jeg jeg2 = jfs3.Q;
                Object object = jfs3.x;
                jdf jdf2 = jfs3.y;
                n3 = n5;
                while (n3 < 2) {
                    Object object6 = (new Object[]{object, jdf2})[n3];
                    if (jeg2.a.contains(object6)) {
                        jfs3.g();
                        return;
                    }
                    ++n3;
                }
                return;
            }
            case 8: {
                ((jfs)this.a).G.a(2, "Entering SHUTDOWN state");
                Object object = this.a;
                iui iui2 = iui.e;
                ((jfs)object).o.a(iui2);
                return;
            }
            case 7: {
                ((jfs)this.a).f(true);
                return;
            }
            case 6: {
                hom hom2;
                Object object;
                Object object7 = this.a;
                synchronized (object7) {
                    object = this.a;
                    ((jex)object).d = null;
                    n3 = ((jex)object).g;
                    if (n3 == 2) {
                        ((jex)object).g = 4;
                        ((jex)object).c = hom2 = ((jex)object).a.schedule(((jex)object).e, 0L, TimeUnit.NANOSECONDS);
                        n3 = 1;
                    } else {
                        if (n3 == 3) {
                            ((jex)object).d = hom2 = ((jex)object).a.schedule(((jex)object).f, -((jex)object).b.a(TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS);
                            ((jex)this.a).g = 2;
                        }
                        n3 = 0;
                    }
                }
                if (n3 == 0) return;
                object7 = ((jex)this.a).h;
                object = ((dml)object7).a;
                AmbientModeSupport$AmbientController ambientModeSupport$AmbientController = new AmbientModeSupport$AmbientController(object7);
                Object object8 = ((jks)object).j;
                hom2 = hom.a;
                synchronized (object8) {
                    bl2 = ((jks)object).h != null;
                    fxf.A(bl2);
                    if (((jks)object).r) {
                        ((jks)object).g();
                        jef.b(ambientModeSupport$AmbientController, (Executor)hom2);
                        return;
                    }
                    object7 = ((jks)object).q;
                    if (object7 != null) {
                        n3 = 0;
                    } else {
                        l2 = ((jks)object).e.nextLong();
                        Object object9 = new guh();
                        ((guh)object9).d();
                        ((jks)object).q = object7 = new jef(l2, (guh)object9);
                        object9 = ((jks)object).A;
                        ++((jjv)object9).e;
                        n3 = n4;
                    }
                    if (n3 != 0) {
                        ((jks)object).h.d(false, (int)(l2 >>> 32), (int)l2);
                    }
                }
                synchronized (object7) {
                    if (!((jef)object7).d) {
                        ((jef)object7).c.put(ambientModeSupport$AmbientController, hom2);
                        return;
                    }
                    object = ((jef)object7).e != null ? new iuk(ambientModeSupport$AmbientController, 19) : new gni(7);
                }
                jef.a((Executor)hom2, (Runnable)object);
                return;
            }
            case 5: {
                Object object;
                Object object10 = this.a;
                synchronized (object10) {
                    object = this.a;
                    if (((jex)object).g != 6) {
                        ((jex)object).g = 6;
                    } else {
                        n3 = 0;
                    }
                }
                if (n3 == 0) return;
                object = this.a;
                object10 = iyh.k.e("Keepalive failed. The connection is likely gone");
                ((jex)object).h.a.p((iyh)object10);
                return;
            }
            case 4: {
                jes jes2 = (jes)this.a;
                jcu jcu2 = jes2.a;
                jes2.c.k.remove(jcu2);
                if (((jes)this.a).c.o.a != iui.e) return;
                if (!((jes)this.a).c.k.isEmpty()) return;
                ((jes)this.a).c.f();
                return;
            }
            case 3: {
                Object object = (jes)this.a;
                Object object11 = ((jes)object).c;
                ((jeu)object11).r = null;
                if (((jeu)object11).p == null) {
                    Object object12 = ((jeu)object11).m;
                    object = ((jes)object).a;
                    if (object12 != object) return;
                    ((jeu)object11).n = object;
                    jeu.j(((jes)this.a).c);
                    object11 = ((jes)this.a).c;
                    ((jeu)object11).q = ((jeu)object11).g.a();
                    object12 = this.a;
                    object11 = iui.b;
                    ((jes)object12).c.d((iui)((Object)object11));
                    return;
                }
                if (((jeu)object11).n != null) {
                    bl2 = false;
                }
                fxf.B(bl2, "Unexpected non-null activeTransport");
                jes jes3 = (jes)this.a;
                object11 = jes3.c.p;
                jes3.a.o((iyh)object11);
                return;
            }
            case 2: {
                ((jeu)this.a).d.a(2, "Terminated");
                Object object = this.a;
                jeq jeq2 = ((jeu)object).a;
                ((jbk)jeq2.b).i.v.remove(object);
                ivk.c(((jbk)jeq2.b).i.H.e, (ivm)object);
                ((jbk)jeq2.b).i.h();
                return;
            }
            case 1: {
                if (((jeu)this.a).o.a != iui.d) return;
                ((jeu)this.a).d.a(2, "CONNECTING as requested");
                Object object = this.a;
                iui iui3 = iui.a;
                ((jeu)object).d(iui3);
                ((jeu)this.a).i();
                return;
            }
            case 0: 
        }
        jeu jeu2 = (jeu)((jdg)this.a).a;
        jgf jgf2 = jeu2.j;
        jeu2.t = null;
        jeu2.j = null;
        jgf2.o(iyh.k.e("InternalSubchannel closed transport due to address change"));
    }
}

