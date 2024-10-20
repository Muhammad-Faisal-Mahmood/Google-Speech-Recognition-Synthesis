/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;

public final class cyv
implements gte {
    @Override
    public final Object apply(Object object) {
        hwv hwv2;
        object = (List)object;
        hwp hwp2 = hmb.a.l();
        Iterator iterator = object.iterator();
        long l2 = 0L;
        long l3 = 0L;
        while (iterator.hasNext()) {
            ctl ctl2 = (ctl)iterator.next();
            Object object2 = hma.a.l();
            hyg hyg2 = hlq.a.l();
            hwv2 = ctl2.c;
            object = hwv2;
            if (hwv2 == null) {
                object = ctq.a;
            }
            object = ((ctq)object).d;
            if (!hyg2.b.B()) {
                hyg2.u();
            }
            hwv hwv3 = hyg2.b;
            hwv2 = (hlq)hwv3;
            object.getClass();
            ((hlq)hwv2).b |= 4;
            ((hlq)hwv2).e = object;
            hwv2 = ctl2.c;
            object = hwv2;
            if (hwv2 == null) {
                object = ctq.a;
            }
            object = ((ctq)object).c;
            if (!hwv3.B()) {
                hyg2.u();
            }
            hwv2 = hyg2.b;
            hwv3 = (hlq)hwv2;
            object.getClass();
            ((hlq)hwv3).b |= 1;
            ((hlq)hwv3).c = object;
            int n2 = ctl2.f;
            if (!hwv2.B()) {
                hyg2.u();
            }
            object = hyg2.b;
            hwv2 = (hlq)object;
            ((hlq)hwv2).b |= 2;
            ((hlq)hwv2).d = n2;
            long l4 = ctl2.d;
            if (!((hwv)object).B()) {
                hyg2.u();
            }
            hwv2 = hyg2.b;
            object = (hlq)hwv2;
            ((hlq)object).b |= 0x40;
            ((hlq)object).i = l4;
            object = ctl2.e;
            if (!hwv2.B()) {
                hyg2.u();
            }
            hwv2 = (hlq)hyg2.b;
            object.getClass();
            ((hlq)hwv2).b |= 0x80;
            ((hlq)hwv2).j = object;
            object = (hlq)hyg2.o();
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            hwv2 = ((hwp)object2).b;
            hyg2 = (hma)hwv2;
            object.getClass();
            ((hma)hyg2).c = object;
            ((hma)hyg2).b |= 1;
            l4 = ctl2.h;
            if (!hwv2.B()) {
                ((hwp)object2).u();
            }
            object = ((hwp)object2).b;
            hwv2 = (hma)object;
            ((hma)hwv2).b |= 2;
            ((hma)hwv2).d = l4;
            l4 = ctl2.g;
            if (!((hwv)object).B()) {
                ((hwp)object2).u();
            }
            object = (hma)((hwp)object2).b;
            ((hma)object).b |= 4;
            ((hma)object).e = l4;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object = (hmb)hwp2.b;
            hwv2 = (hma)((hwp)object2).o();
            hwv2.getClass();
            object2 = ((hmb)object).c;
            if (!object2.c()) {
                ((hmb)object).c = hwv.s((hxk)object2);
            }
            ((hmb)object).c.add(hwv2);
            l2 += ctl2.h;
            l3 += ctl2.g;
        }
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv2 = hwp2.b;
        object = (hmb)hwv2;
        ((hmb)object).b |= 1;
        ((hmb)object).d = l2;
        if (!hwv2.B()) {
            hwp2.u();
        }
        object = (hmb)hwp2.b;
        ((hmb)object).b |= 2;
        ((hmb)object).e = l3;
        return (hmb)hwp2.o();
    }
}

