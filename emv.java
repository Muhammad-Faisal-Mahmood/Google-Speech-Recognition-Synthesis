/*
 * Decompiled with CFR 0.152.
 */
import j$.time.Duration;

public final class emv
implements eml {
    public static final gpm a = kcs.j;
    private final emk b;
    private final jvb c;

    public emv(emk emk2, jvb jvb2) {
        jse.e(jvb2, "lightweightScope");
        this.b = emk2;
        this.c = jvb2;
    }

    public static final kcs A(eip object, kco enum_, eaz hyg2, ecq ecq2) {
        dml dml2 = jsl.B(kcs.a.l());
        dml2.t(cqq.aq((eip)object));
        dml2.u((kco)enum_);
        object = jsl.A(kcp.a.l());
        if (ecq2 != null) {
            ((dml)object).q(ecq2.b);
        }
        enum_ = cqq.ar((eaz)hyg2);
        jse.e(enum_, "value");
        hyg2 = (hwp)((dml)object).a;
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        hyg2 = (kcp)((hwp)hyg2).b;
        ((kcp)hyg2).d = ((kcq)enum_).j;
        ((kcp)hyg2).b |= 2;
        dml2.v(((dml)object).p());
        return dml2.r();
    }

    public static final kcs B(eip object, kco object2, ebv ebv2, Integer n2) {
        dml dml2 = jsl.B(kcs.a.l());
        dml2.t(cqq.aq((eip)object));
        dml2.u((kco)object2);
        object = jsl.A(kcp.a.l());
        if (n2 != null) {
            ((Number)n2).intValue();
            ((dml)object).q(n2);
        }
        jse.e(ebv2, "value");
        object2 = (hwp)((dml)object).a;
        if (!((hwp)object2).b.B()) {
            ((hwp)object2).u();
        }
        object2 = (kcp)((hwp)object2).b;
        ((kcp)object2).c = ebv2.s;
        ((kcp)object2).b |= 1;
        dml2.v(((dml)object).p());
        return dml2.r();
    }

    public static final String C(Integer n2) {
        String string = "hotword";
        if (n2 != null && (string = n2.toString()) == null) {
            return "hotword";
        }
        return string;
    }

    public static final dyj D(dyo dyk2, ebt object) {
        int n2 = ((ebt)object).b;
        if (n2 == 2) {
            ebs ebs2 = ebs.b((Integer)((ebt)object).c);
            object = ebs2;
            if (ebs2 == null) {
                object = ebs.a;
            }
            dyk2 = dyk2.a(((ebs)object).ai, "start_listening_failure");
        } else {
            if (n2 == 1) {
                ebu ebu2 = ebu.b((Integer)((ebt)object).c);
                object = ebu2;
                if (ebu2 == null) {
                    object = ebu.a;
                }
            } else {
                object = ebu.a;
            }
            dyk2 = dyk2.a(((ebu)object).e, "start_listening_success");
        }
        return dyk2;
    }

    public static final dyj E(dyn object, ebq object2) {
        int n2 = ((ebq)object2).b;
        if (n2 == 2) {
            ebp ebp2 = ebp.b((Integer)((ebq)object2).c);
            object2 = ebp2;
            if (ebp2 == null) {
                object2 = ebp.a;
            }
            object = ((dyn)object).a(((ebp)object2).M, "stop_listening_failure");
        } else {
            if (n2 == 1) {
                ebr ebr2 = ebr.b((Integer)((ebq)object2).c);
                object2 = ebr2;
                if (ebr2 == null) {
                    object2 = ebr.a;
                }
            } else {
                object2 = ebr.a;
            }
            object = ((dyn)object).a(((ebr)object2).d, "stop_listening_success");
        }
        return object;
    }

    public static final dyj F(dyn dyn2, ebo ebo2) {
        return dyn2.a(ebo2.z, "update_route_status");
    }

    public static final void G(dyj dyj2, long l2) {
        dyj2.r("listening", String.valueOf(l2));
    }

    private static final kcs H(int n2) {
        dml dml2 = jsl.B(kcs.a.l());
        dml dml3 = jse.av(kcm.a.l());
        hyg hyg2 = (hwp)dml3.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (kcm)hyg2.b;
        ((kcm)hyg2).b |= 2;
        ((kcm)hyg2).d = n2;
        dml2.s(dml3.w());
        return dml2.r();
    }

    private static final void I(dyj dyj2, String string) {
        dyj2.r("buffer", string);
    }

    public static final kcs z(eip hyg2, eaz object) {
        dml dml2 = jsl.B(kcs.a.l());
        dml2.t(cqq.aq((eip)hyg2));
        hyg2 = kcr.a.l();
        jse.e(hyg2, "builder");
        object = cqq.ar((eaz)object);
        jse.e(object, "value");
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        kcr kcr2 = (kcr)((hwp)hyg2).b;
        kcr2.c = ((kcq)object).j;
        kcr2.b |= 1;
        hyg2 = ((hwp)hyg2).o();
        jse.d(hyg2, "build(...)");
        hyg2 = (kcr)hyg2;
        jse.e(hyg2, "value");
        object = (hwp)dml2.a;
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        object = (kcs)((hwp)object).b;
        hyg2.getClass();
        ((kcs)object).f = hyg2;
        ((kcs)object).b |= 8;
        return dml2.r();
    }

    @Override
    public final void a(String string, int n2) {
        jse.e(string, "shortIdentity");
        Object object = dxt.p;
        jse.d(object, "AUDIO_BUFFER_CLOSED");
        object = ((dyn)object).c(1);
        emv.I((dyj)object, string);
        ((dyj)object).u(a, emv.H(n2));
        this.y((dyj)object, dww.n(eip.a.l()).p());
    }

    @Override
    public final void b(String string, int n2) {
        jse.e(string, "shortIdentity");
        dyj dyj2 = dxt.l.j();
        emv.I(dyj2, string);
        dyj2.u(a, emv.H(n2));
        this.y(dyj2, dww.n(eip.a.l()).p());
    }

    @Override
    public final void c(String string, int n2) {
        jse.e(string, "shortIdentity");
        dyj dyj2 = dxt.o.j();
        emv.I(dyj2, string);
        dyj2.u(a, emv.H(n2));
        this.y(dyj2, dww.n(eip.a.l()).p());
    }

    @Override
    public final void d(String string) {
        jse.e(string, "shortIdentity");
        dyj dyj2 = dxt.j.j();
        emv.I(dyj2, string);
        this.y(dyj2, dww.n(eip.a.l()).p());
    }

    @Override
    public final void e(String string, int n2) {
        jse.e(string, "shortIdentity");
        dyj dyj2 = dxt.n.j();
        emv.I(dyj2, string);
        dyj2.u(a, emv.H(n2));
        this.y(dyj2, dww.n(eip.a.l()).p());
    }

    @Override
    public final void f(String object, Integer object2) {
        dyj dyj2 = dxt.m.j();
        emv.I(dyj2, (String)object);
        if (object2 != null) {
            gpm gpm2 = a;
            object = jsl.B(kcs.a.l());
            dml dml2 = jse.av(kcm.a.l());
            Object object3 = dml2.a;
            int n2 = (Integer)object2;
            object2 = (hwp)object3;
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            object2 = (kcm)((hwp)object2).b;
            ((kcm)object2).b |= 1;
            ((kcm)object2).c = n2;
            ((dml)object).s(dml2.w());
            dyj2.u(gpm2, ((dml)object).r());
        }
        this.y(dyj2, dww.n(eip.a.l()).p());
    }

    @Override
    public final void g(String object, int n2) {
        jse.e(object, "shortIdentity");
        dyj dyj2 = dxt.k.j();
        emv.I(dyj2, (String)object);
        object = a;
        dml dml2 = jsl.B(kcs.a.l());
        dml dml3 = jse.av(kcm.a.l());
        hyg hyg2 = (hwp)dml3.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (kcm)hyg2.b;
        ((kcm)hyg2).b |= 4;
        ((kcm)hyg2).e = n2;
        dml2.s(dml3.w());
        dyj2.u((gpm)object, dml2.r());
        this.y(dyj2, dww.n(eip.a.l()).p());
    }

    @Override
    public final void h(eip eip2, int n2, dzx hwv2) {
        jse.e(eip2, "clientInfo");
        jse.e(hwv2, "params");
        dyj dyj2 = dxt.q.j();
        dyj2.r("focus_acquire", String.valueOf(n2));
        gpm gpm2 = a;
        dml dml2 = jsl.B(kcs.a.l());
        dml2.t(cqq.aq(eip2));
        hyg hyg2 = kck.a.l();
        jse.e(hyg2, "builder");
        hyg hyg3 = (hwp)hwv2.C(5);
        hyg3.x(hwv2);
        jse.e(hyg3, "builder");
        if ((((dzx)hwv2).b & 0x10) != 0) {
            if (!hyg3.b.B()) {
                hyg3.u();
            }
            hwv2 = (dzx)hyg3.b;
            ((dzx)hwv2).b &= 0xFFFFFFFD;
            ((dzx)hwv2).d = 3;
        }
        if (!hyg3.b.B()) {
            hyg3.u();
        }
        hwv2 = (dzx)hyg3.b;
        ((dzx)hwv2).f = null;
        ((dzx)hwv2).b &= 0xFFFFFFF7;
        hwv2 = hyg3.o();
        jse.d(hwv2, "build(...)");
        jse.e(hwv2, "value");
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg3 = (kck)hyg2.b;
        hwv2.getClass();
        ((kck)hyg3).c = hwv2;
        ((kck)hyg3).b |= 1;
        hwv2 = hyg2.o();
        jse.d(hwv2, "build(...)");
        hwv2 = (kck)hwv2;
        jse.e(hwv2, "value");
        hyg2 = (hwp)dml2.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (kcs)hyg2.b;
        hwv2.getClass();
        ((kcs)hyg2).h = hwv2;
        ((kcs)hyg2).b |= 0x40;
        dyj2.u(gpm2, dml2.r());
        this.y(dyj2, eip2);
    }

    @Override
    public final void i(eip eip2, int n2, dzw object) {
        jse.e(object, "reason");
        dyj dyj2 = dxt.s.j();
        dyj2.r("focus_release", String.valueOf(n2));
        gpm gpm2 = a;
        dml dml2 = jsl.B(kcs.a.l());
        dml2.t(cqq.aq(eip2));
        hyg hyg2 = kcl.a.l();
        jse.e(hyg2, "builder");
        jse.e(object, "value");
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        kcl kcl2 = (kcl)hyg2.b;
        kcl2.c = ((dzw)object).e;
        kcl2.b |= 1;
        object = hyg2.o();
        jse.d(object, "build(...)");
        object = (kcl)object;
        jse.e(object, "value");
        hyg2 = (hwp)dml2.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (kcs)hyg2.b;
        object.getClass();
        ((kcs)hyg2).i = object;
        ((kcs)hyg2).b |= 0x80;
        dyj2.u(gpm2, dml2.r());
        this.y(dyj2, eip2);
    }

    @Override
    public final void j(eip eip2) {
        jse.e(eip2, "clientInfo");
        this.y(dxt.x.j(), eip2);
    }

    @Override
    public final void k(eip eip2) {
        jse.e(eip2, "clientInfo");
        this.y(dxt.y.j(), eip2);
    }

    @Override
    public final void l(eip object, ecu ecu2, long l2, ekk object2) {
        jse.e(object, "clientInfo");
        jse.e(ecu2, "hotwordListeningSession");
        jse.e(object2, "routeData");
        object2 = new ems(this, (eip)object, l2, (ekk)object2, ecu2, null);
        jse.ah(this.c, null, null, (jro)object2, 3);
        object = new emt(this, (eip)object, l2, ecu2, null, 0);
        jse.ah(this.c, null, null, (jro)object, 3);
    }

    @Override
    public final void m(eip object, eaj eaj2, long l2, eao object2, ekk ekk2) {
        jse.e(object, "clientInfo");
        jse.e(eaj2, "audioRequestListeningSession");
        jse.e(object2, "params");
        jse.e(ekk2, "routeData");
        object2 = new emr(this, (eip)object, l2, ekk2, (eao)object2, eaj2, null);
        jse.ah(this.c, null, null, (jro)object2, 3);
        object = new emt(this, (eip)object, l2, eaj2, null, 1);
        jse.ah(this.c, null, null, (jro)object, 3);
    }

    @Override
    public final void n(eip eip2, Integer n2) {
        jse.e(eip2, "clientInfo");
        dyj dyj2 = dxt.a.j();
        dyj2.r("route_connect", emv.C(n2));
        this.y(dyj2, eip2);
    }

    @Override
    public final void o(eip object, Integer n2, eaz eaz2, hpn hpn2) {
        jse.e(object, "clientInfo");
        jse.e(eaz2, "audioRouteType");
        jse.e(hpn2, "disconnectStatus");
        object = new emu(this, (eip)object, n2, eaz2, hpn2, null, 1, null);
        jse.ah(this.c, null, null, (jro)object, 3);
    }

    @Override
    public final void p(eip eip2, Integer n2) {
        jse.e(eip2, "clientInfo");
        dyj dyj2 = dxt.c.j();
        dyj2.r("route_disconnect", emv.C(n2));
        this.y(dyj2, eip2);
    }

    @Override
    public final void q(eip eip2, hpn object, hpn hpn2, Integer n2, eaz eaz2) {
        jse.e(eip2, "clientInfo");
        jse.e(object, "connectStatus");
        jse.e(hpn2, "disconnectStatus");
        jse.e(eaz2, "audioRouteType");
        object = new emu(this, eip2, n2, eaz2, (hpn)object, null, 0);
        jse.ah(this.c, null, null, (jro)object, 3);
        this.o(eip2, n2, eaz2, hpn2);
    }

    @Override
    public final void r(eip eip2, Integer n2, eaz eaz2, ebo object) {
        jse.e(eip2, "clientInfo");
        jse.e(object, "status");
        dyn dyn2 = dxt.v;
        jse.d(dyn2, "AUDIO_ROUTE_INNER_CONNECT_DONE");
        object = emv.F(dyn2, (ebo)object);
        ((dyj)object).r("route_inner_connect", emv.C(n2));
        ((dyj)object).u(a, emv.z(eip2, eaz2));
        this.y((dyj)object, eip2);
    }

    @Override
    public final void s(eip eip2, Integer n2) {
        jse.e(eip2, "clientInfo");
        dyj dyj2 = dxt.u.j();
        dyj2.r("route_inner_connect", emv.C(n2));
        this.y(dyj2, eip2);
    }

    @Override
    public final void t(eip eip2, long l2, Duration duration) {
        jse.e(eip2, "clientInfo");
        jse.e(duration, "elapsedTime");
        dyj dyj2 = dxt.e.j();
        emv.G(dyj2, l2);
        dyj2.t(duration.toNanos());
        this.y(dyj2, eip2);
    }

    @Override
    public final void u(eip eip2, long l2) {
        jse.e(eip2, "clientInfo");
        dyj dyj2 = dxt.h.j();
        emv.G(dyj2, l2);
        this.y(dyj2, eip2);
    }

    @Override
    public final void v(emm emm2, ebt object) {
        jse.e(object, "status");
        dyk dyk2 = dxt.w;
        jse.d(dyk2, "ZLM_AUDIO_SOURCE_OPEN_DONE");
        dyk2 = emv.D((dyo)dyk2, (ebt)object);
        object = emm2.c;
        if (object != null) {
            ((dyj)dyk2).r("listening", ((Integer)object).toString());
        }
        this.y((dyj)dyk2, emm2.a);
    }

    @Override
    public final void w(eip object, int n2, efj efj2) {
        jse.e(object, "clientInfo");
        emq emq2 = new emq(this, (eip)object, n2, efj2, null, 1, null);
        jse.ah(this.c, null, null, emq2, 3);
        object = new emq(this, (eip)object, n2, efj2, null, 0);
        jse.ah(this.c, null, null, (jro)object, 3);
    }

    public final void x(eip eip2, long l2) {
        jse.e(eip2, "clientInfo");
        dyj dyj2 = dxt.g.j();
        emv.G(dyj2, l2);
        this.y(dyj2, eip2);
    }

    public final void y(dyj dyj2, eip object) {
        jse.e(object, "clientInfo");
        if (!emo.a.contains(dyj2.o())) {
            emk emk2 = this.b;
            String string = dyj2.o();
            if (eio.a(((eip)object).b) == eio.J) {
                ((fsx)((eng)((emo)emk2).b.b.b()).b.a()).b(string);
            }
            switch (eio.a(((eip)object).b).ordinal()) {
                default: {
                    throw new joa();
                }
                case 35: {
                    object = null;
                    break;
                }
                case 34: {
                    object = ((emo)emk2).c.b(exb.j);
                    break;
                }
                case 32: {
                    object = ((emo)emk2).c.b(exb.m);
                    break;
                }
                case 30: {
                    object = ((emo)emk2).c.b(exb.l);
                    break;
                }
                case 26: {
                    object = ((emo)emk2).c.b(exb.e);
                    break;
                }
                case 21: {
                    object = ((emo)emk2).c.b(exb.g);
                    break;
                }
                case 18: {
                    object = ((emo)emk2).c.b(exb.n);
                    break;
                }
                case 13: {
                    object = ((emo)emk2).c.b(exb.p);
                    break;
                }
                case 12: {
                    object = ((emo)emk2).c.b(exb.o);
                    break;
                }
                case 5: 
                case 8: 
                case 14: 
                case 15: 
                case 16: 
                case 17: 
                case 20: 
                case 22: 
                case 25: 
                case 27: 
                case 33: {
                    object = ((emo)emk2).c.b(exb.f);
                    break;
                }
                case 4: 
                case 6: 
                case 11: {
                    object = ((emo)emk2).c.b(exb.i);
                    break;
                }
                case 3: 
                case 10: {
                    object = ((emo)emk2).c.b(exb.k);
                    break;
                }
                case 2: 
                case 9: {
                    object = ((emo)emk2).c.b(exb.d);
                    break;
                }
                case 1: 
                case 7: {
                    object = ((emo)emk2).c.b(exb.h);
                    break;
                }
                case 0: 
                case 19: 
                case 23: 
                case 24: 
                case 28: 
                case 29: 
                case 31: {
                    object = ((emo)emk2).c.a(ewy.K);
                }
            }
            if (object != null) {
                object.a(dyj2);
            }
        }
    }
}

