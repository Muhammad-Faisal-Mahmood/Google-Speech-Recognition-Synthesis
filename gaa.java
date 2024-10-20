/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gda
 */
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class gaa
implements gte {
    public final Collection a;

    public /* synthetic */ gaa(Collection collection) {
        this.a = collection;
    }

    @Override
    public final Object apply(Object object) {
        int n2;
        Object object2;
        boolean bl2;
        object = (gam)object;
        hwp hwp2 = (hwp)((hwv)object).C(5);
        hwp2.x((hwv)object);
        Object object3 = (gam)hwp2.o();
        Map<fym, fze> map = new HashMap();
        Object object4 = this.a;
        Iterator iterator = object4.iterator();
        while (true) {
            fze fze2;
            block15: {
                gap gap2;
                boolean bl3 = iterator.hasNext();
                bl2 = false;
                if (!bl3) break;
                fze2 = (fze)iterator.next();
                Object object5 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((gam)hwp2.b).d)).values().iterator();
                while (object5.hasNext()) {
                    fze fze3;
                    gap2 = (gap)object5.next();
                    object = object2 = gap2.d;
                    if (object2 == null) {
                        object = fze.a;
                    }
                    if (!((fze)object).i.equals(fze2.i) || !((fze)object).c.equals(fze2.c)) continue;
                    object2 = (hwp)gap2.C(5);
                    ((hwp)object2).x(gap2);
                    if (!((hwp)object2).b.B()) {
                        ((hwp)object2).u();
                    }
                    object = (gap)((hwp)object2).b;
                    fze2.getClass();
                    object5 = ((gap)object).d;
                    if (object5 != null && object5 != (fze3 = fze.a)) {
                        object5 = (hwr)fze3.m((hwv)object5);
                        ((hwp)object5).x(fze2);
                        ((gap)object).d = (fze)((hwr)object5).aC();
                    } else {
                        ((gap)object).d = fze2;
                    }
                    ((gap)object).b = 2 | ((gap)object).b;
                    object = (gap)((hwp)object2).o();
                    hwp2.M(gap2.c, (gap)object);
                    n2 = gap2.c;
                    break block15;
                }
                object = gap.a.l();
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object2 = ((hwp)object).b;
                gap2 = (gap)object2;
                fze2.getClass();
                gap2.d = fze2;
                gap2.b = 2 | gap2.b;
                if (!((hwv)object2).B()) {
                    ((hwp)object).u();
                }
                object2 = (gap)((hwp)object).b;
                ((gap)object2).e = 0;
                ((gap)object2).b |= 4;
                object2 = hwp2.b;
                n2 = ((gam)object2).c;
                if (!((hwv)object2).B()) {
                    hwp2.u();
                }
                object2 = (gam)hwp2.b;
                ((gam)object2).b |= 1;
                ((gam)object2).c = n2 + 1;
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object2 = (gap)((hwp)object).b;
                ((gap)object2).b = 1 | ((gap)object2).b;
                ((gap)object2).c = n2;
                hwp2.M(n2, (gap)((hwp)object).o());
            }
            map.put(fym.a(n2, gda.a), fze2);
        }
        object = hac.i(map);
        if (object.size() == object4.size()) {
            bl2 = true;
        }
        fxf.B(bl2, "Provider had duplicate accounts.");
        object2 = new hat();
        object3 = DesugarCollections.unmodifiableMap(((gam)object3).d).values().iterator();
        while (object3.hasNext()) {
            ((hat)object2).j(fym.a(((gap)object3.next()).c, gda.a));
        }
        object = hav.n(hhk.o(((hat)object2).g(), ((hac)object).l()));
        object4 = new gzy();
        map = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((gam)hwp2.b).d));
        iterator = object.iterator();
        while (iterator.hasNext()) {
            object3 = (fym)iterator.next();
            object2 = ((fym)object3).a;
            if (!map.containsKey(object2) || (n2 = a.t(((gap)map.get((Object)object2)).e)) == 0 || n2 != 2) continue;
            ((gzy)object4).d(object3, (gap)map.get(object2));
        }
        object2 = ((gzy)object4).b();
        object = object.iterator();
        while (object.hasNext()) {
            n2 = ((fym)object.next()).a;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            ((gam)hwp2.b).b().remove(n2);
        }
        return new gab(object2, (gam)hwp2.o());
    }
}

