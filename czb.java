/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;

public final class czb
implements Callable {
    public final czd a;
    public final Map b;
    public final Map c;
    public final AtomicLong d;
    public final int e;

    public /* synthetic */ czb(czd czd2, Map map, Map map2, AtomicLong atomicLong, int n2) {
        this.a = czd2;
        this.b = map;
        this.c = map2;
        this.d = atomicLong;
        this.e = n2;
    }

    public final Object call() {
        long l2;
        int n2;
        Object object;
        hwp hwp2 = hme.a.l();
        Object object2 = this.b;
        Object object3 = object2.keySet().iterator();
        Object object4 = this.a;
        while (object3.hasNext()) {
            Object object5 = (String)object3.next();
            object = (czc)object2.get(object5);
            Object object6 = guf.c("|").g((CharSequence)object5);
            hyg hyg2 = hlq.a.l();
            Object object7 = (String)object6.get(0);
            if (!((hwp)hyg2).b.B()) {
                ((hwp)hyg2).u();
            }
            hwv hwv2 = (hlq)((hwp)hyg2).b;
            object7.getClass();
            ((hlq)hwv2).b |= 1;
            ((hlq)hwv2).c = object7;
            object7 = (String)object6.get(1);
            if (!((hwp)hyg2).b.B()) {
                ((hwp)hyg2).u();
            }
            hwv2 = ((hwp)hyg2).b;
            object6 = hwv2;
            object7.getClass();
            ((hlq)object6).b = 4 | ((hlq)object6).b;
            ((hlq)object6).e = object7;
            n2 = ((czc)object).e;
            if (!hwv2.B()) {
                ((hwp)hyg2).u();
            }
            object7 = ((hwp)hyg2).b;
            object6 = (hlq)object7;
            ((hlq)object6).b |= 8;
            ((hlq)object6).f = n2;
            n2 = ((czc)object).f;
            if (!((hwv)object7).B()) {
                ((hwp)hyg2).u();
            }
            object6 = this.c;
            object7 = (hlq)((hwp)hyg2).b;
            ((hlq)object7).b |= 0x10;
            ((hlq)object7).g = n2;
            if ((object5 = (cth)object6.get(object5)) == null) {
                if (!((hwp)hyg2).b.B()) {
                    ((hwp)hyg2).u();
                }
                object5 = (hlq)((hwp)hyg2).b;
                ((hlq)object5).b |= 2;
                ((hlq)object5).d = -1;
            } else {
                n2 = ((cth)object5).f;
                if (!((hwp)hyg2).b.B()) {
                    ((hwp)hyg2).u();
                }
                object6 = ((hwp)hyg2).b;
                object7 = (hlq)object6;
                ((hlq)object7).b |= 2;
                ((hlq)object7).d = n2;
                l2 = ((cth)object5).s;
                if (!((hwv)object6).B()) {
                    ((hwp)hyg2).u();
                }
                object7 = ((hwp)hyg2).b;
                object6 = (hlq)object7;
                ((hlq)object6).b |= 0x40;
                ((hlq)object6).i = l2;
                object5 = ((cth)object5).t;
                if (!((hwv)object7).B()) {
                    ((hwp)hyg2).u();
                }
                object7 = (hlq)((hwp)hyg2).b;
                object5.getClass();
                ((hlq)object7).b |= 0x80;
                ((hlq)object7).j = object5;
            }
            hyg2 = (hlq)((hwp)hyg2).o();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object5 = (hme)hwp2.b;
            hyg2.getClass();
            object7 = ((hme)object5).c;
            if (!object7.c()) {
                ((hme)object5).c = hwv.s((hxk)object7);
            }
            ((hme)object5).c.add(hyg2);
            l2 = ((czc)object).a;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            hyg2 = (hme)hwp2.b;
            object5 = ((hme)hyg2).d;
            if (!object5.c()) {
                ((hme)hyg2).d = hwv.r((hxe)object5);
            }
            ((hme)hyg2).d.e(l2);
            l2 = ((czc)object).b;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            hyg2 = (hme)hwp2.b;
            object5 = ((hme)hyg2).e;
            if (!object5.c()) {
                ((hme)hyg2).e = hwv.r((hxe)object5);
            }
            ((hme)hyg2).e.e(l2);
            l2 = ((czc)object).c;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            hyg2 = (hme)hwp2.b;
            object5 = ((hme)hyg2).f;
            if (!object5.c()) {
                ((hme)hyg2).f = hwv.r((hxe)object5);
            }
            ((hme)hyg2).f.e(l2);
            l2 = ((czc)object).d;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            hyg2 = (hme)hwp2.b;
            object = ((hme)hyg2).g;
            if (!object.c()) {
                ((hme)hyg2).g = hwv.r((hxe)object);
            }
            ((hme)hyg2).g.e(l2);
        }
        l2 = this.d.get();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        object2 = (hme)hwp2.b;
        ((hme)object2).b |= 1;
        ((hme)object2).h = l2;
        long l3 = 0L;
        object = crh.c(((czd)object4).b, ((czd)object4).d);
        l2 = l3;
        try {
            if (((czd)object4).h.B((Uri)object)) {
                object2 = ((czd)object4).h;
                object3 = new fqk(4);
                l2 = (Long)((bmu)object2).w((Uri)object, (fpp)object3);
            }
        }
        catch (IOException iOException) {
            cyr.j(iOException, "%s: Failed to call Mobstore to compute MDD Directory bytes used!", "StorageLogger");
            ((czd)object4).c.a();
            l2 = l3;
        }
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        object2 = hwp2.b;
        object4 = (hme)object2;
        ((hme)object4).b |= 2;
        ((hme)object4).i = l2;
        if (!((hwv)object2).B()) {
            hwp2.u();
        }
        n2 = this.e;
        object4 = (hme)hwp2.b;
        ((hme)object4).b |= 4;
        ((hme)object4).j = n2;
        return (hme)hwp2.o();
    }
}

