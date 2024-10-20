/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class cwl
implements hny {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ cwl(Object object, hwv hwv2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = hwv2;
    }

    public /* synthetic */ cwl(Object object, Object object2, int n2) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    @Override
    public final hpn a(Object object) {
        block23: {
            switch (this.c) {
                default: {
                    object = (Void)object;
                    if (!inw.a.b().v()) break;
                    object = this.a;
                    Object object2 = (cwz)this.b;
                    ((cwz)object2).m.d(1032);
                    object2 = ((cwz)object2).c;
                    object = ((cwj)object2).q(((cwj)object2).c.d(), gqk.d(new cvy(object2, object, 9)));
                    break block23;
                }
                case 19: {
                    object = (czp)object;
                    Object object3 = this.a;
                    return ((cwo)this.b).i((czp)object3, (czp)object, 1100);
                }
                case 18: {
                    Object object4 = this.b;
                    cwo cwo2 = (cwo)object4;
                    cxd cxd2 = cwo2.b;
                    object = (czp)object;
                    return fxf.ak(cwo2.b(cxd2.c()), new cwd(object4, (czp)object, (Comparator)this.a, 17), cwo2.c);
                }
                case 17: {
                    czp czp2 = (czp)object;
                    object = this.a;
                    return ((cwo)this.b).i((czp)object, czp2, 1100);
                }
                case 16: {
                    Object object5 = this.a;
                    cwo cwo3 = (cwo)object5;
                    cxd cxd3 = cwo3.b;
                    object = (czp)object;
                    return fxf.ak(cwo3.b(cxd3.g((ctt)this.b)), new cwl(object5, object, 11), cwo3.c);
                }
                case 15: {
                    czp czp3 = (czp)object;
                    object = this.a;
                    return ((cwo)this.b).i((czp)object, czp3, 1104);
                }
                case 14: {
                    Object object6 = this.b;
                    cwo cwo4 = (cwo)object6;
                    cxd cxd4 = cwo4.b;
                    object = (czp)object;
                    return fxf.ak(cwo4.b(cxd4.f((hav)this.a)), new cwl(object6, object, 19), cwo4.c);
                }
                case 13: {
                    Object object7;
                    Object object8;
                    object = (List)object;
                    ArrayList<hpn> arrayList = new ArrayList<hpn>();
                    Object object9 = object.iterator();
                    while (true) {
                        object8 = this.b;
                        if (!object9.hasNext()) break;
                        object7 = (ctt)object9.next();
                        arrayList.add(((cwo)object8).a.e((ctt)object7));
                    }
                    object7 = this.a;
                    object9 = crh.w(arrayList);
                    object7 = (Boolean)object7;
                    object8 = (cwo)object8;
                    return ((bzq)object9).v(new cvt((cwo)object8, (List)object, arrayList, (Boolean)object7, 2), ((cwo)object8).c);
                }
                case 12: {
                    Object object10 = this.a;
                    cwo cwo5 = (cwo)object10;
                    cxd cxd5 = cwo5.b;
                    object = (czp)object;
                    return fxf.ak(cwo5.b(cxd5.e((ctt)this.b)), new cwl(object10, object, 17), cwo5.c);
                }
                case 11: {
                    czp czp4 = (czp)object;
                    object = this.a;
                    return ((cwo)this.b).i((czp)object, czp4, 1102);
                }
                case 10: {
                    object = (czp)object;
                    Object object11 = this.a;
                    return ((cwo)this.b).i((czp)object11, (czp)object, 1101);
                }
                case 9: {
                    czp czp5 = (czp)object;
                    object = this.a;
                    return ((cwm)this.b).o((czp)object, czp5, 1090);
                }
                case 8: {
                    Object object12 = this.a;
                    cwm cwm2 = (cwm)object12;
                    cxa cxa2 = cwm2.a;
                    object = (czp)object;
                    return fxf.ak(cwm2.n(cxa2.a((cth)this.b)), new cvy(object12, object, 17), cwm2.b);
                }
                case 7: {
                    Object object13 = this.a;
                    cwm cwm3 = (cwm)object13;
                    cxa cxa3 = cwm3.a;
                    object = (czp)object;
                    return fxf.ak(cwm3.n(cxa3.g((ctq)this.b)), new cvy(object13, object, 13), cwm3.b);
                }
                case 6: {
                    object = (czp)object;
                    Object object14 = this.a;
                    return ((cwm)this.b).o((czp)object14, (czp)object, 1089);
                }
                case 5: {
                    Object object15 = this.b;
                    cwm cwm4 = (cwm)object15;
                    cxa cxa4 = cwm4.a;
                    object = (czp)object;
                    return fxf.ak(cwm4.n(cxa4.j((List)this.a)), new cvy(object15, object, 15), cwm4.b);
                }
                case 4: {
                    Object object16 = this.b;
                    cwm cwm5 = (cwm)object16;
                    cxa cxa5 = cwm5.a;
                    object = (czp)object;
                    return fxf.ak(cwm5.n(cxa5.d()), new cwd(object16, (czp)object, (Comparator)this.a, 15), cwm5.b);
                }
                case 3: {
                    czp czp6 = (czp)object;
                    object = this.a;
                    return ((cwm)this.b).o((czp)object, czp6, 1099);
                }
                case 2: {
                    Object object17 = this.a;
                    cwm cwm6 = (cwm)object17;
                    cxa cxa6 = cwm6.a;
                    object = (czp)object;
                    return fxf.ak(cwm6.n(cxa6.h((ctq)this.b)), new cwl(object17, object, 9), cwm6.b);
                }
                case 1: {
                    czp czp7 = (czp)object;
                    object = this.a;
                    return ((cwm)this.b).o((czp)object, czp7, 1097);
                }
                case 0: {
                    Object object18 = this.a;
                    cwm cwm7 = (cwm)object18;
                    cxa cxa7 = cwm7.a;
                    object = (czp)object;
                    return fxf.ak(cwm7.n(cxa7.i((ctq)this.b)), new cwl(object18, object, 6), cwm7.b);
                }
            }
            object = hpj.a;
        }
        return object;
    }
}

