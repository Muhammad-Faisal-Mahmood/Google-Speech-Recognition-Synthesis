/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

public final class cvy
implements hny {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ cvy(Object object, hwv hwv2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = hwv2;
    }

    public /* synthetic */ cvy(Object object, Object object2, int n2) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    @Override
    public final hpn a(Object object) {
        switch (this.c) {
            default: {
                object = (czp)object;
                Object object2 = this.a;
                return ((cwm)this.b).o((czp)object2, (czp)object, 1088);
            }
            case 19: {
                object = (czp)object;
                Object object3 = this.a;
                return ((cwm)this.b).o((czp)object3, (czp)object, 1095);
            }
            case 18: {
                Object object4 = this.b;
                cwm cwm2 = (cwm)object4;
                cxa cxa2 = cwm2.a;
                object = (czp)object;
                return fxf.ak(cwm2.n(cxa2.m((List)this.a)), new cwl(object4, object, 1), cwm2.b);
            }
            case 17: {
                object = (czp)object;
                Object object5 = this.a;
                return ((cwm)this.b).o((czp)object5, (czp)object, 1096);
            }
            case 16: {
                object = (czp)object;
                Object object6 = this.a;
                return ((cwm)this.b).o((czp)object6, (czp)object, 1098);
            }
            case 15: {
                object = (czp)object;
                Object object7 = this.a;
                return ((cwm)this.b).o((czp)object7, (czp)object, 1094);
            }
            case 14: {
                Object object8 = this.b;
                cwm cwm3 = (cwm)object8;
                cxa cxa3 = cwm3.a;
                object = (czp)object;
                return fxf.ak(cwm3.n(cxa3.c()), new cwd(object8, (czp)object, (Comparator)this.a, 13), cwm3.b);
            }
            case 13: {
                czp czp2 = (czp)object;
                object = this.a;
                return ((cwm)this.b).o((czp)object, czp2, 1087);
            }
            case 12: {
                if (!((Boolean)object).booleanValue()) {
                    object = this.b;
                    cwj cwj2 = (cwj)this.a;
                    object = dah.e(cwj2.d((cth)object)).d(css.class, new cvv(object, 1), cwj2.e);
                } else {
                    object = hpj.a;
                }
                return object;
            }
            case 11: {
                if (!((Boolean)object).booleanValue()) {
                    object = this.b;
                    cwj.z(1036, ((cwj)this.a).i, (cth)object);
                }
                return hpj.a;
            }
            case 10: {
                object = (Void)object;
                Object object9 = this.b;
                if (object9 != null) {
                    Object object10 = this.a;
                    object = new hat();
                    cwj cwj3 = (cwj)object10;
                    object = cwj3.q(cwj3.p(cwj3.c.c(), new brk(object, 17)), new bpu(object10, object9, 20, null));
                } else {
                    object = hpj.a;
                }
                return object;
            }
            case 9: {
                Object object11 = (List)object;
                object = new ArrayList();
                Iterator iterator = object11.iterator();
                while (true) {
                    object11 = this.b;
                    if (!iterator.hasNext()) break;
                    ctq ctq2 = (ctq)iterator.next();
                    if (ctq2.f) continue;
                    Object object12 = this.a;
                    cwj cwj4 = (cwj)object11;
                    object.add(cwj4.q(cwj4.g(ctq2, false), new cwd(object11, (hwv)ctq2, object12, 10)));
                }
                return crh.w((Iterable)object).u(new cuh(8), ((cwj)object11).e);
            }
            case 8: {
                object = (cth)object;
                if (object != null) {
                    Object object13 = this.b;
                    object = this.a.a(new cxr((ctq)object13, (cth)object));
                } else {
                    object = hpj.a;
                }
                return object;
            }
            case 7: {
                object = (cwi)((Object)object);
                String string = ((cth)this.b).d;
                cwj cwj5 = (cwj)this.a;
                return cwj5.p(cwj5.h.c(string), new brk(object, 15));
            }
            case 6: {
                Object object14 = this.a;
                cwj cwj6 = (cwj)object14;
                cwk cwk2 = cwj6.c;
                object = (gto)object;
                return cwj6.p(cwk2.i((ctq)this.b), new bte(object14, object, 5));
            }
            case 5: {
                object = (Void)object;
                object = (cth)this.b;
                object = cqq.ad((cth)object) ? ((cwj)this.a).d((cth)object) : hpj.a;
                return object;
            }
            case 4: {
                object = (cth)object;
                if (object == null) {
                    object = this.b;
                    kqr kqr2 = css.a();
                    kqr2.b = csr.q;
                    kqr2.c = "Nothing to download for file group: ".concat(String.valueOf(((ctq)object).c));
                    object = hhk.J(kqr2.a());
                } else {
                    ((AtomicReference)this.a).set(object);
                    object = hhk.K(object);
                }
                return object;
            }
            case 3: {
                object = (Void)object;
                cth cth2 = (cth)hhk.S((Future)this.a);
                if (cth2 != null) {
                    Object object15 = this.b;
                    object = hlq.a.l();
                    Object object16 = cth2.d;
                    if (!((hwp)object).b.B()) {
                        ((hwp)object).u();
                    }
                    hyg hyg2 = ((hwp)object).b;
                    Object object17 = (hlq)hyg2;
                    object16.getClass();
                    ((hlq)object17).b |= 1;
                    ((hlq)object17).c = object16;
                    object16 = cth2.e;
                    if (!((hwv)hyg2).B()) {
                        ((hwp)object).u();
                    }
                    hyg2 = ((hwp)object).b;
                    object17 = (hlq)hyg2;
                    object16.getClass();
                    ((hlq)object17).b |= 4;
                    ((hlq)object17).e = object16;
                    int n2 = cth2.f;
                    if (!((hwv)hyg2).B()) {
                        ((hwp)object).u();
                    }
                    hyg2 = ((hwp)object).b;
                    object16 = (hlq)hyg2;
                    ((hlq)object16).b = 2 | ((hlq)object16).b;
                    ((hlq)object16).d = n2;
                    long l2 = cth2.s;
                    if (!((hwv)hyg2).B()) {
                        ((hwp)object).u();
                    }
                    hyg2 = ((hwp)object).b;
                    object16 = (hlq)hyg2;
                    ((hlq)object16).b |= 0x40;
                    ((hlq)object16).i = l2;
                    object16 = cth2.t;
                    if (!((hwv)hyg2).B()) {
                        ((hwp)object).u();
                    }
                    hyg2 = (hlq)((hwp)object).b;
                    object16.getClass();
                    ((hlq)hyg2).b |= 0x80;
                    ((hlq)hyg2).j = object16;
                    object16 = (hlq)((hwp)object).o();
                    hyg2 = cth2.c;
                    object = hyg2;
                    if (hyg2 == null) {
                        object = ctg.a;
                    }
                    n2 = ((ctg)object).g;
                    hyg2 = hmd.a.l();
                    if (!((hwp)hyg2).b.B()) {
                        ((hwp)hyg2).u();
                    }
                    object = (hmd)((hwp)hyg2).b;
                    ((hmd)object).b |= 1;
                    ((hmd)object).c = n2;
                    hmd hmd2 = (hmd)((hwp)hyg2).o();
                    object = hls.a.l();
                    if (!((hwp)object).b.B()) {
                        ((hwp)object).u();
                    }
                    object17 = ((hwp)object).b;
                    hyg2 = (hls)object17;
                    hmd2.getClass();
                    ((hls)hyg2).u = hmd2;
                    ((hls)hyg2).d |= 0x800;
                    if (!((hwv)object17).B()) {
                        ((hwp)object).u();
                    }
                    object15 = (cwj)object15;
                    object17 = ((cwj)object15).i;
                    hyg2 = (hls)((hwp)object).b;
                    object16.getClass();
                    ((hls)hyg2).e = object16;
                    ((hls)hyg2).b |= 0x100;
                    ((cyu)object17).i(1117, (hwp)object, cqq.o());
                    object = ((cwj)object15).h.a(gzx.q(cth2));
                } else {
                    object = hpj.a;
                }
                return object;
            }
            case 2: {
                object = (Void)object;
                object = ((cth)this.b).d;
                return ((cwj)this.a).h.c((String)object);
            }
            case 1: {
                if ((cth)object == null) {
                    object = hpj.a;
                } else {
                    Object object18 = this.b;
                    object = this.a;
                    ctq ctq3 = (ctq)object18;
                    cyr.e("%s: Deleting file group %s for uninstalled app %s", "FileGroupManager", ctq3.c, ctq3.d);
                    object18 = (cwj)object;
                    ((cwj)object18).i.d(1049);
                    object = ((cwj)object18).q(((cwj)object18).c.i(ctq3), new bps(object, 20));
                }
                return object;
            }
            case 0: 
        }
        object = (cth)object;
        if (object == null) {
            object = hpj.a;
        } else {
            Object object19 = this.b;
            Object object20 = this.a;
            object19 = (ctq)object19;
            cyr.e("%s: Deleting file group %s for removed account %s", "FileGroupManager", ((ctq)object19).c, ((ctq)object19).d);
            cwj cwj7 = (cwj)object20;
            cwj.z(1050, cwj7.i, (cth)object);
            object = cwj7.q(cwj7.c.i((ctq)object19), new cvy(object20, (hwv)object, 11));
        }
        return object;
    }
}

