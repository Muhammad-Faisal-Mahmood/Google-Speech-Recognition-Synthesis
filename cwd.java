/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class cwd
implements hny {
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;

    public /* synthetic */ cwd(cwj cwj2, List list, hny hny2, int n2) {
        this.d = n2;
        this.c = cwj2;
        this.a = list;
        this.b = hny2;
    }

    public /* synthetic */ cwd(Object object, ctq ctq2, cth cth2, int n2) {
        this.d = n2;
        this.a = object;
        this.b = ctq2;
        this.c = cth2;
    }

    public /* synthetic */ cwd(Object object, czp czp2, Comparator comparator, int n2) {
        this.d = n2;
        this.c = object;
        this.b = czp2;
        this.a = comparator;
    }

    public /* synthetic */ cwd(Object object, hwv hwv2, hwv hwv3, int n2) {
        this.d = n2;
        this.a = object;
        this.c = hwv2;
        this.b = hwv3;
    }

    public /* synthetic */ cwd(Object object, hwv hwv2, Object object2, int n2) {
        this.d = n2;
        this.b = object;
        this.c = hwv2;
        this.a = object2;
    }

    @Override
    public final hpn a(Object object) {
        block61: {
            cth cth2;
            switch (this.d) {
                default: {
                    cth2 = (cth)object;
                    if (cth2 != null) break;
                    object = hhk.K((Object)cwi.a);
                    break block61;
                }
                case 19: {
                    if (((Boolean)object).booleanValue()) {
                        Object object2 = this.a;
                        Object object3 = this.c;
                        Object object4 = this.b;
                        cwz cwz2 = (cwz)object4;
                        object = cwz2.c.g((ctq)object3, false);
                        object = dah.e((hpn)object).g(new cwd(object4, (hwv)object3, object2, 20), cwz2.i).g(new cww(object4, object, 1), cwz2.i);
                    } else {
                        object = hpj.a;
                    }
                    return object;
                }
                case 18: {
                    Object object5 = this.a;
                    cwo cwo2 = (cwo)object5;
                    cxd cxd2 = cwo2.b;
                    object = (czp)object;
                    Object object6 = this.b;
                    return fxf.ak(cwo2.b(cxd2.h((ctt)this.c, (ctv)object6)), new cwl(object5, object, 10), cwo2.c);
                }
                case 17: {
                    czp czp2 = (czp)object;
                    int n2 = cqq.q();
                    long l2 = n2;
                    object = this.b;
                    if (cyr.b(l2)) {
                        Object object7 = this.a;
                        Object object8 = this.c;
                        if (czp.d((czp)object, czp2, (Comparator)object7)) {
                            ((cwo)object8).d.c(1106, n2);
                        } else {
                            ((cwo)object8).d.c(1103, n2);
                        }
                    }
                    object = (czp)object;
                    if (((czp)object).a) {
                        object = (List)((czp)object).a();
                        fxf.K(object);
                        object = hhk.K(object);
                    } else {
                        object = ((czp)object).b();
                        fxf.K(object);
                        object = hhk.J((Throwable)object);
                    }
                    return object;
                }
                case 16: {
                    cwo cwo3 = (cwo)this.a;
                    cxd cxd3 = cwo3.b;
                    Boolean bl2 = (Boolean)object;
                    object = this.b;
                    return fxf.aj(cxd3.h((ctt)this.c, (ctv)object), new brk(bl2, 19), cwo3.c);
                }
                case 15: {
                    object = (czp)object;
                    Object object9 = this.a;
                    Object object10 = this.b;
                    return ((cwm)this.c).p((czp)object10, (czp)object, (Comparator)object9, 1092);
                }
                case 14: {
                    Object object11 = this.a;
                    cwm cwm2 = (cwm)object11;
                    cxa cxa2 = cwm2.a;
                    object = (czp)object;
                    Object object12 = this.c;
                    return fxf.ak(cwm2.n(cxa2.l((ctq)this.b, (cth)object12)), new cvy(object11, object, 20), cwm2.b);
                }
                case 13: {
                    object = (czp)object;
                    Object object13 = this.a;
                    Object object14 = this.b;
                    return ((cwm)this.c).p((czp)object14, (czp)object, (Comparator)object13, 1093);
                }
                case 12: {
                    if (!((Boolean)object).booleanValue()) {
                        object = this.c;
                        ((cwj)this.b).i.d(1036);
                        object = hhk.J(new IOException("Failed to write updated group: ".concat(String.valueOf(((ctq)object).c))));
                    } else {
                        object = this.a;
                    }
                    return object;
                }
                case 11: {
                    object = (gto)object;
                    object = ((cwj)this.a).c;
                    Object object15 = this.c;
                    return object.l((ctq)this.b, (cth)object15);
                }
                case 10: {
                    object = (cth)object;
                    if (object == null) {
                        object = hhk.K((Object)cwi.a);
                    } else {
                        Object object16 = this.a;
                        Object object17 = this.c;
                        cwj cwj2 = (cwj)this.b;
                        bzo bzo2 = new bzo(cwj2.i);
                        object = cwj2.B((ctq)object17, (cth)object, (hny)object16, bzo2);
                    }
                    return object;
                }
                case 9: {
                    object = (cxk)object;
                    cyr.g("%s: Missing file. Logging and deleting file group.", "FileGroupManager");
                    Object object18 = this.c;
                    object = (cwj)this.b;
                    cwj.z(1062, ((cwj)object).i, (cth)object18);
                    if (inw.a.b().d()) {
                        object18 = this.a;
                        object = ((cwj)object).q(((cwj)object).c.i(((cxr)object18).a), new buf(6));
                    } else {
                        object = hpj.a;
                    }
                    return object;
                }
                case 8: {
                    boolean bl3 = (Boolean)object;
                    Object object19 = this.b;
                    object = this.a;
                    if (!bl3) {
                        object19 = (ctq)object19;
                        cyr.i("%s: Failed to remove the downloaded version for group: '%s'; account: '%s'", "FileGroupManager", ((ctq)object19).c, ((ctq)object19).e);
                        ((cwj)object).i.d(1036);
                        object = hhk.J(new IOException("Failed to remove downloaded group: ".concat(String.valueOf(((ctq)object19).c))));
                    } else {
                        Object object20 = this.c;
                        cwj cwj3 = (cwj)object;
                        object = cwj3.q(cwj3.c.a((cth)object20), new btb(object, (ctq)object19, object20, 9));
                    }
                    return object;
                }
                case 7: {
                    boolean bl4 = (Boolean)object;
                    object = this.a;
                    if (!bl4) {
                        ctq ctq2 = (ctq)this.b;
                        cyr.i("%s: Failed to remove pending version for group: '%s'; account: '%s'", "FileGroupManager", ctq2.c, ctq2.e);
                        ((cwj)object).i.d(1036);
                        object = hhk.J(new IOException("Failed to remove pending group: ".concat(String.valueOf(ctq2.c))));
                    } else {
                        Object object21 = this.c;
                        object = ((cwj)object).h.a(gzx.q(object21));
                    }
                    return object;
                }
                case 6: {
                    if (((Boolean)object).booleanValue()) {
                        object = (hwv)this.b;
                        Object object22 = (hwp)((hwv)object).C(5);
                        ((hwp)object22).x((hwv)object);
                        if (!((hwp)object22).b.B()) {
                            ((hwp)object22).u();
                        }
                        Object object23 = this.c;
                        Object object24 = this.a;
                        Object object25 = (ctq)((hwp)object22).b;
                        Object object26 = ctq.a;
                        ((ctq)object25).b |= 8;
                        ((ctq)object25).f = false;
                        object26 = (ctq)((hwp)object22).o();
                        object25 = (cwj)object24;
                        object22 = ((cwj)object25).c.g((ctq)object26);
                        object26 = dah.e((hpn)object22).g(new btb(object24, (ctq)object26, object23, 18), ((cwj)object25).e).g(new cvv(object24, 2), ((cwj)object25).e);
                        object23 = (hwv)object23;
                        return ((cwj)object25).q(((dah)object26).g(new cvy(object24, (hwv)object23, 2), ((cwj)object25).e).g(new cvy(object24, object22, 3), ((cwj)object25).e), new btb((cwj)object25, (hwv)object23, (hwv)object, 11));
                    }
                    throw new IOException("Subscribing to group failed");
                }
                case 5: {
                    Object object27;
                    Object object28;
                    Iterator iterator = ((List)object).iterator();
                    while (true) {
                        object28 = this.a;
                        object27 = this.c;
                        if (!iterator.hasNext()) break;
                        Object object29 = this.b;
                        object = (ctq)iterator.next();
                        object27 = (cwj)object27;
                        object28.add(((cwj)object27).q(((cwj)object27).c.g((ctq)object), new cvy(object29, (hwv)object, 8)));
                    }
                    return crh.w((Iterable)object28).u(new cuh(6), ((cwj)object27).e);
                }
                case 4: {
                    object = (cth)object;
                    ctq ctq3 = (ctq)this.c;
                    cyr.d("%s: Received new config for group: %s", "FileGroupManager", ctq3.c);
                    Object object30 = hlq.a.l();
                    Object object31 = ((cth)object).d;
                    if (!((hwp)object30).b.B()) {
                        ((hwp)object30).u();
                    }
                    Object object32 = ((hwp)object30).b;
                    Object object33 = (hlq)object32;
                    object31.getClass();
                    ((hlq)object33).b |= 1;
                    ((hlq)object33).c = object31;
                    object33 = ((cth)object).e;
                    if (!((hwv)object32).B()) {
                        ((hwp)object30).u();
                    }
                    object31 = ((hwp)object30).b;
                    object32 = (hlq)object31;
                    object33.getClass();
                    ((hlq)object32).b = 4 | ((hlq)object32).b;
                    ((hlq)object32).e = object33;
                    int n3 = ((cth)object).f;
                    if (!((hwv)object31).B()) {
                        ((hwp)object30).u();
                    }
                    object33 = ((hwp)object30).b;
                    object32 = (hlq)object33;
                    ((hlq)object32).b |= 2;
                    ((hlq)object32).d = n3;
                    long l3 = ((cth)object).s;
                    if (!((hwv)object33).B()) {
                        ((hwp)object30).u();
                    }
                    object33 = ((hwp)object30).b;
                    object32 = (hlq)object33;
                    ((hlq)object32).b |= 0x40;
                    ((hlq)object32).i = l3;
                    object32 = ((cth)object).t;
                    if (!((hwv)object33).B()) {
                        ((hwp)object30).u();
                    }
                    object33 = this.a;
                    object31 = (hlq)((hwp)object30).b;
                    object32.getClass();
                    ((hlq)object31).b |= 0x80;
                    ((hlq)object31).j = object32;
                    object30 = (hlq)((hwp)object30).o();
                    object32 = hmf.a.l();
                    object33 = (hmh)((gto)object33).c();
                    if (!((hwp)object32).b.B()) {
                        ((hwp)object32).u();
                    }
                    object31 = (hmf)((hwp)object32).b;
                    ((hmf)object31).c = ((hmh)object33).a();
                    ((hmf)object31).b |= 1;
                    object32 = (hmf)((hwp)object32).o();
                    object33 = hls.a.l();
                    if (!((hwp)object33).b.B()) {
                        ((hwp)object33).u();
                    }
                    object31 = ((hwp)object33).b;
                    hls hls2 = (hls)object31;
                    object32.getClass();
                    hls2.t = object32;
                    hls2.d |= 0x200;
                    if (!((hwv)object31).B()) {
                        ((hwp)object33).u();
                    }
                    object32 = this.b;
                    object31 = (hls)((hwp)object33).b;
                    object30.getClass();
                    ((hls)object31).e = object30;
                    ((hls)object31).b |= 0x100;
                    l3 = cqq.o();
                    object30 = (cwj)object32;
                    ((cwj)object30).i.i(1018, (hwp)object33, l3);
                    return ((cwj)object30).q(((cwj)object30).o((cth)object, 0, ((cth)object).o.size()), new cwd(object32, ctq3, (cth)object, 6));
                }
                case 3: {
                    gto gto2 = (gto)object;
                    boolean bl5 = gto2.g();
                    Object object34 = this.b;
                    if (!bl5) {
                        cyr.d("%s: Received duplicate config for group: %s", "FileGroupManager", ((ctq)object34).c);
                        object = hhk.K(false);
                    } else {
                        Object object35;
                        Object object36 = this.c;
                        hyg hyg2 = (cth)object36;
                        object = object36;
                        if (cqq.ad((cth)hyg2)) {
                            int n4 = his.a;
                            object = hir.a.a();
                            object.e(((cth)hyg2).t);
                            object.e("|");
                            object.e(((ctq)object34).e);
                            object.e("|");
                            long l4 = ((cth)hyg2).s;
                            object35 = (hij)object;
                            ((hij)object35).a.putLong(l4);
                            ((hij)object35).b(8);
                            object = object.n().toString();
                            object = String.format("%s_%s", ((cth)hyg2).d, object);
                            hyg2 = (hwv)object36;
                            object36 = (hwp)((hwv)hyg2).C(5);
                            ((hwp)object36).x((hwv)hyg2);
                            if (!((hwp)object36).b.B()) {
                                ((hwp)object36).u();
                            }
                            hyg2 = (cth)((hwp)object36).b;
                            object.getClass();
                            ((cth)hyg2).b |= 0x80000;
                            ((cth)hyg2).w = object;
                            object = (cth)((hwp)object36).o();
                        }
                        object34 = (hwv)object34;
                        hyg2 = (hwp)((hwv)object34).C(5);
                        ((hwp)hyg2).x((hwv)object34);
                        if (!((hwp)hyg2).b.B()) {
                            ((hwp)hyg2).u();
                        }
                        object36 = this.a;
                        ctq ctq4 = (ctq)((hwp)hyg2).b;
                        object35 = ctq.a;
                        ctq4.b |= 8;
                        ctq4.f = false;
                        hyg2 = (ctq)((hwp)hyg2).o();
                        object35 = (cwj)object36;
                        object = ((cwj)object35).q(((cwj)object35).q(((cwj)object35).c.g((ctq)hyg2), new bps(object, 19)), new cwd(object36, (hwv)object34, gto2, 4));
                    }
                    return object;
                }
                case 2: {
                    object = (Boolean)object;
                    object = (hwv)this.b;
                    Object object37 = (hwp)((hwv)object).C(5);
                    ((hwp)object37).x((hwv)object);
                    if (!((hwp)object37).b.B()) {
                        ((hwp)object37).u();
                    }
                    Object object38 = this.c;
                    Object object39 = this.a;
                    ctq ctq5 = (ctq)((hwp)object37).b;
                    ctq ctq6 = ctq.a;
                    ctq5.b |= 8;
                    ctq5.f = false;
                    ctq6 = (ctq)((hwp)object37).o();
                    object37 = (cwj)object39;
                    return ((cwj)object37).q(((cwj)object37).c.g(ctq6), new cwd(object39, (hwv)object38, (hwv)object, 1));
                }
                case 1: {
                    hyg hyg3 = (cth)object;
                    object = this.c;
                    if (hyg3 != null) {
                        object = hhk.K(cwj.a((cth)object, (cth)hyg3));
                    } else {
                        Object object40 = (hwv)this.b;
                        hyg3 = (hwp)((hwv)object40).C(5);
                        ((hwp)hyg3).x((hwv)object40);
                        if (!((hwp)hyg3).b.B()) {
                            ((hwp)hyg3).u();
                        }
                        object40 = this.a;
                        ctq ctq7 = (ctq)((hwp)hyg3).b;
                        ctq ctq8 = ctq.a;
                        ctq7.b |= 8;
                        ctq7.f = true;
                        hyg3 = (ctq)((hwp)hyg3).o();
                        object40 = (cwj)object40;
                        object = ((cwj)object40).q(((cwj)object40).c.g((ctq)hyg3), new cvv(object, 0));
                    }
                    return object;
                }
                case 0: {
                    Object object41;
                    object = object41 = (ctr)object;
                    if (object41 == null) {
                        object = ctr.a;
                    }
                    if (((ctr)object).b) {
                        return hhk.K(null);
                    }
                    object41 = this.c;
                    Object object42 = this.b;
                    object = this.a;
                    object42 = (ctq)object42;
                    cyr.e("%s: Trying to add group %s that requires activation %s.", "FileGroupManager", ((ctq)object42).c, ((ctq)object42).d);
                    cwj.z(1055, ((cwj)object).i, (cth)object41);
                    throw new cvi();
                }
            }
            Object object43 = this.a;
            Object object44 = this.c;
            cwz cwz3 = (cwz)this.b;
            object = new bzo(cwz3.m);
            object = cwz3.c.B((ctq)object44, cth2, (hny)object43, (bzo)object);
        }
        return object;
    }
}

