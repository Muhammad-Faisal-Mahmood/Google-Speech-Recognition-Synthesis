/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class cvv
implements hny {
    public final Object a;
    private final int b;

    public /* synthetic */ cvv(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final hpn a(Object object) {
        int n2 = this.b;
        Object object2 = true;
        switch (n2) {
            default: {
                object = (Void)object;
                return ((cwz)this.a).d.b();
            }
            case 19: {
                object = (Void)object;
                Object object3 = this.a;
                object = (cwz)object3;
                return fxf.ak(((cwz)object).e.a(), new cvv(object3, 18), ((cwz)object).i);
            }
            case 18: {
                object = (Void)object;
                return ((cwz)this.a).d.b();
            }
            case 17: {
                Object object4 = this.a;
                object2 = (cwo)object4;
                cxd cxd2 = ((cwo)object2).b;
                object = (czp)object;
                return fxf.ak(((cwo)object2).b(cxd2.a()), new cwl(object4, object, 15), ((cwo)object2).c);
            }
            case 16: {
                Object object5 = this.a;
                object2 = (cwo)object5;
                cxo cxo2 = ((cwo)object2).a;
                object = (Boolean)object;
                return fxf.ak(cxo2.c(), new cwl(object5, object, 13), ((cwo)object2).c);
            }
            case 15: {
                Object object6 = this.a;
                cwm cwm2 = (cwm)object6;
                object2 = cwm2.a;
                object = (czp)object;
                return fxf.ak(cwm2.n(((cxa)object2).e()), new cvy(object6, object, 19), cwm2.b);
            }
            case 14: {
                Object object7 = this.a;
                object2 = (cwm)object7;
                cxa cxa2 = ((cwm)object2).a;
                object = (czp)object;
                return fxf.ak(((cwm)object2).n(cxa2.k()), new cvy(object7, object, 16), ((cwm)object2).b);
            }
            case 13: {
                object2 = this.a;
                cwm cwm3 = (cwm)object2;
                cxa cxa3 = cwm3.a;
                object = (czp)object;
                return fxf.ak(cwm3.n(cxa3.b()), new cwl(object2, object, 3), cwm3.b);
            }
            case 12: {
                cxr cxr2 = (cxr)object;
                cth cth2 = cxr2.b;
                for (ctf ctf2 : cth2.o) {
                    int n3;
                    n2 = n3 = a.t(cth2.j);
                    if (n3 == 0) {
                        n2 = 1;
                    }
                    Object object8 = this.a;
                    object = crh.l(ctf2, n2);
                    cwj cwj2 = (cwj)object8;
                    egg egg2 = cwj2.j;
                    fxf.af(dah.e(egg2.o((ctt)object)).g(new cxe(egg2, (hwv)object, ctf2, 1), (Executor)egg2.a), cxk.class, new cwd(object8, (hwv)cth2, cxr2, 9), cwj2.e);
                }
                return hpj.a;
            }
            case 11: {
                object = (cth)object;
                object = object != null && (n2 = cqq.y(((cth)object).r)) != 0 && n2 != 1 ? ((dat)((gui)((cwj)this.a).g.c()).a()).b() : hhk.K(object2);
                return object;
            }
            case 10: {
                Object object9 = (cxr)object;
                object = ((cxr)object9).a;
                object9 = ((cxr)object9).b;
                if (((ctq)object).f && cqq.ad((cth)object9)) {
                    Object object10 = this.a;
                    if (cqq.j() && cqq.ad((cth)object9)) {
                        object = (cwj)object10;
                        object = dah.e(((cwj)object).k((cth)object9)).f(new bte(object10, object9, 4, null), ((cwj)object).e);
                    } else {
                        object = hhk.K(object2);
                    }
                    object9 = new cvy(object10, (hwv)object9, 12);
                    object = ((cwj)object10).q((hpn)object, (hny)object9);
                } else {
                    object = hpj.a;
                }
                return object;
            }
            case 9: {
                Object object11;
                Object object12 = (List)object;
                object = new ArrayList();
                object12 = object12.iterator();
                while (true) {
                    object11 = this.a;
                    if (!object12.hasNext()) break;
                    ctq ctq2 = (ctq)object12.next();
                    if (ctq2.f) continue;
                    object2 = (cwj)object11;
                    object.add(((cwj)object2).q(((cwj)object2).c.g(ctq2), new cvv(object11, 11)));
                }
                return crh.w((Iterable)object).u(new cuh(9), ((cwj)object11).e);
            }
            case 8: {
                if (!((Boolean)object).booleanValue()) {
                    ((cwj)this.a).i.d(1036);
                }
                return hpj.a;
            }
            case 7: {
                hac hac2 = (hac)object;
                object = (hac)hhk.S((Future)this.a);
                object2 = new HashMap();
                hdx hdx2 = ((hac)object).k().k();
                while (hdx2.hasNext()) {
                    object = (Map.Entry)hdx2.next();
                    if (!hac2.containsKey(object.getValue())) continue;
                    ctf ctf3 = (ctf)object.getKey();
                    ctp ctp2 = ctp.b(((ctv)hac2.get(object.getValue())).d);
                    object = ctp2;
                    if (ctp2 == null) {
                        object = ctp.a;
                    }
                    object2.put(ctf3, object);
                }
                return hhk.K(hac.i((Map)object2));
            }
            case 6: {
                object = hav.n(((hac)object).g());
                return ((cwj)this.a).j.f.f((hav)object);
            }
            case 5: {
                Object object13;
                Object object14 = (List)object;
                object = new ArrayList();
                Iterator iterator = object14.iterator();
                while (true) {
                    object13 = this.a;
                    if (!iterator.hasNext()) break;
                    object2 = (ctq)iterator.next();
                    cwj cwj3 = (cwj)object13;
                    object14 = ((ctq)object2).d;
                    if (cwj3.t((String)object14)) continue;
                    object.add(cwj3.q(cwj3.c.g((ctq)object2), new cvy(object13, (hwv)object2, 1)));
                }
                return crh.w((Iterable)object).u(new cuh(4), ((cwj)object13).e);
            }
            case 4: {
                Object object15 = (gto)object;
                if (!((gto)object15).g()) {
                    object = hpj.a;
                } else {
                    object = this.a;
                    cth cth3 = (cth)((gto)object15).c();
                    object15 = (cwj)object;
                    object = ((cwj)object15).q(((cwj)object15).c.a(cth3), new cvv(object, 8));
                }
                return object;
            }
            case 3: {
                object = (Void)object;
                throw (Throwable)this.a;
            }
            case 2: {
                if (!((Boolean)object).booleanValue()) {
                    ((cwj)this.a).i.d(1036);
                    object = hhk.J(new IOException("Failed to commit new group metadata to disk."));
                } else {
                    object = hpj.a;
                }
                return object;
            }
            case 1: {
                cyr.o((css)object, "%s: Unable to correct isolated structure, returning null instead of group %s", "FileGroupManager", ((cth)this.a).d);
                return hpj.a;
            }
            case 0: 
        }
        object = (cth)object;
        object = object == null ? gto.i(hmh.b) : cwj.a((cth)this.a, (cth)object);
        return hhk.K(object);
    }
}

