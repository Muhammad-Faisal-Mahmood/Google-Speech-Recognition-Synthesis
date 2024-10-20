/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public final class cyq
implements hny {
    public final int a;
    public final czh b;

    public /* synthetic */ cyq(czh czh2, int n2) {
        this.b = czh2;
        this.a = n2;
    }

    @Override
    public final hpn a(Object object) {
        object = (List)object;
        ArrayList<hpn> arrayList = new ArrayList<hpn>();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = (cxr)iterator.next();
            hwv hwv2 = ((cxr)object).a;
            cth cth2 = ((cxr)object).b;
            object = hlq.a.l();
            Object object2 = ((ctq)hwv2).c;
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            Object object3 = ((hwp)object).b;
            Object object4 = (hlq)object3;
            object2.getClass();
            ((hlq)object4).b |= 1;
            ((hlq)object4).c = object2;
            object4 = ((ctq)hwv2).d;
            if (!((hwv)object3).B()) {
                ((hwp)object).u();
            }
            object3 = ((hwp)object).b;
            object2 = (hlq)object3;
            object4.getClass();
            ((hlq)object2).b |= 4;
            ((hlq)object2).e = object4;
            int n2 = cth2.f;
            if (!((hwv)object3).B()) {
                ((hwp)object).u();
            }
            object3 = (hlq)((hwp)object).b;
            ((hlq)object3).b |= 2;
            ((hlq)object3).d = n2;
            n2 = cth2.o.size();
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object3 = (hlq)((hwp)object).b;
            ((hlq)object3).b |= 8;
            ((hlq)object3).f = n2;
            object3 = cth2.o.iterator();
            n2 = 0;
            while (object3.hasNext()) {
                if (!cqq.ac((ctf)object3.next())) continue;
                ++n2;
            }
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object3 = (hlq)((hwp)object).b;
            ((hlq)object3).b |= 0x10;
            ((hlq)object3).g = n2;
            boolean bl2 = ((ctq)hwv2).e.isEmpty();
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object4 = ((hwp)object).b;
            object3 = (hlq)object4;
            ((hlq)object3).b |= 0x20;
            ((hlq)object3).h = bl2 ^ true;
            long l2 = cth2.s;
            if (!((hwv)object4).B()) {
                ((hwp)object).u();
            }
            object4 = ((hwp)object).b;
            object3 = (hlq)object4;
            ((hlq)object3).b |= 0x40;
            ((hlq)object3).i = l2;
            object3 = cth2.t;
            if (!((hwv)object4).B()) {
                ((hwp)object).u();
            }
            object4 = (hlq)((hwp)object).b;
            object3.getClass();
            ((hlq)object4).b |= 0x80;
            ((hlq)object4).j = object3;
            object4 = (hlq)((hwp)object).o();
            object2 = hlx.a.l();
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            n2 = this.a;
            object = (hlx)((hwp)object2).b;
            ((hlx)object).b |= 8;
            ((hlx)object).f = n2;
            object = object3 = cth2.c;
            if (object3 == null) {
                object = ctg.a;
            }
            if ((((ctg)object).b & 2) != 0) {
                object = object3 = cth2.c;
                if (object3 == null) {
                    object = ctg.a;
                }
                l2 = ((ctg)object).d / 1000L;
                if (!((hwp)object2).b.B()) {
                    ((hwp)object2).u();
                }
                object = (hlx)((hwp)object2).b;
                ((hlx)object).b |= 2;
                ((hlx)object).d = l2;
            } else {
                if (!((hwp)object2).b.B()) {
                    ((hwp)object2).u();
                }
                object = (hlx)((hwp)object2).b;
                ((hlx)object).b |= 2;
                ((hlx)object).d = -1L;
            }
            czh czh2 = this.b;
            if (((ctq)hwv2).f) {
                if (!((hwp)object2).b.B()) {
                    ((hwp)object2).u();
                }
                hwv2 = ((hwp)object2).b;
                object = (hlx)hwv2;
                ((hlx)object).c = a.A(3);
                ((hlx)object).b |= 1;
                object = cth2.c;
                object3 = object == null ? ctg.a : object;
                if ((((ctg)object3).b & 4) != 0) {
                    object3 = object;
                    if (object == null) {
                        object3 = ctg.a;
                    }
                    l2 = ((ctg)object3).e / 1000L;
                    if (!hwv2.B()) {
                        ((hwp)object2).u();
                    }
                    object = (hlx)((hwp)object2).b;
                    ((hlx)object).b |= 4;
                    ((hlx)object).e = l2;
                } else {
                    if (!hwv2.B()) {
                        ((hwp)object2).u();
                    }
                    object = (hlx)((hwp)object2).b;
                    ((hlx)object).b |= 4;
                    ((hlx)object).e = -1L;
                }
                object = hhk.K((hlx)((hwp)object2).o());
            } else {
                if (!((hwp)object2).b.B()) {
                    ((hwp)object2).u();
                }
                object = (hlx)((hwp)object2).b;
                ((hlx)object).b |= 4;
                ((hlx)object).e = -1L;
                object = fxf.aj(((cwj)czh2.a).h(cth2), new cym(object2, 3), (Executor)czh2.d);
            }
            arrayList.add(fxf.aj((hpn)object, new cym(object4, 2), (Executor)czh2.d));
        }
        return hhk.H(arrayList);
    }
}

