/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class hwr
extends hwp
implements hwt {
    public hwr() {
        throw null;
    }

    public hwr(hws hws2) {
        super(hws2);
    }

    public final hws aC() {
        if (!((hws)this.b).B()) {
            return (hws)this.b;
        }
        ((hws)this.b).r.f();
        return (hws)super.p();
    }

    public final void aD(Iterable iterable) {
        if (!this.b.B()) {
            ((hwp)this).u();
        }
        ihi ihi2 = (ihi)this.b;
        Object object = ihi.a;
        object = ihi2.e;
        if (!object.c()) {
            ihi2.e = hwv.s((hxk)object);
        }
        hvc.g(iterable, ihi2.e);
    }

    public final void aE(hwr hwt2) {
        if (!this.b.B()) {
            ((hwp)this).u();
        }
        idj idj2 = (idj)this.b;
        hwt2 = (ida)((hwp)((Object)hwt2)).o();
        Object object = idj.a;
        hwt2.getClass();
        object = idj2.b;
        if (!object.c()) {
            idj2.b = hwv.s((hxk)object);
        }
        idj2.b.add(hwt2);
    }

    public final void aF(hwp hyg2) {
        if (!this.b.B()) {
            ((hwp)this).u();
        }
        ier ier2 = (ier)this.b;
        hyg2 = (ieq)((hwp)hyg2).o();
        Object object = ier.a;
        hyg2.getClass();
        object = ier2.c;
        if (!object.c()) {
            ier2.c = hwv.s((hxk)object);
        }
        ier2.c.add(hyg2);
    }

    @Override
    public final Object aG(gpm gpm2) {
        throw null;
    }

    public final void aH(gpm gpm2, Object iterator) {
        ArrayList<Object> arrayList = hwv.defaultInstanceMap;
        if (gpm2.c == this.a) {
            if (!this.b.B()) {
                ((hwp)this).u();
            }
            ArrayList<Object> arrayList2 = arrayList = ((hws)this.b).r;
            if (((hwl)((Object)arrayList)).c) {
                arrayList2 = ((hwl)((Object)arrayList)).d();
                ((hws)this.b).r = arrayList2;
            }
            hwu hwu2 = (hwu)gpm2.a;
            if (hwu2.d) {
                arrayList = iterator;
                if (hwu2.a() == hzn.h) {
                    arrayList = new ArrayList<Object>();
                    iterator = ((List)((Object)iterator)).iterator();
                    while (iterator.hasNext()) {
                        arrayList.add(gpm2.m(iterator.next()));
                    }
                }
            } else {
                arrayList = gpm2.m(iterator);
            }
            ((hwl)((Object)arrayList2)).n(hwu2, arrayList);
            return;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    @Override
    public final void u() {
        super.u();
        if (((hws)this.b).r != hwl.a) {
            hws hws2 = (hws)this.b;
            hws2.r = hws2.r.d();
        }
    }
}

