/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public final class evt
implements evq {
    final evu a;
    private final evq b;
    private final evp c;
    private final List d;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public evt(evu object, ecm ecm2) {
        Object object2;
        jse.e(ecm2, "metadata");
        this.a = object;
        Object object3 = ema.a;
        jse.d(object3, "storingDestination");
        object3 = object2 = elz.b(((ely)fvc.aF((hwt)ecm2, (gpm)object3)).c);
        if (object2 == null) {
            object3 = elz.a;
        }
        int n2 = ((Enum)object3).ordinal();
        Object var6_6 = null;
        if (n2 != 0 && n2 != 1) {
            if (n2 != 2) throw new joa();
            object2 = null;
        } else {
            object3 = ((evu)object).b;
            jse.e(ecm2, "metadata");
            object2 = new evv((evw)object3, ecm2, ((evw)object3).e.i());
        }
        this.b = object2;
        object3 = var6_6;
        if (((evu)object).c.b) {
            object3 = ema.a;
            jse.d(object3, "storingDestination");
            elz elz2 = elz.b(((ely)fvc.aF((hwt)ecm2, (gpm)object3)).c);
            object3 = elz2;
            if (elz2 == null) {
                object3 = elz.a;
            }
            n2 = ((Enum)object3).ordinal();
            object3 = var6_6;
            if (n2 != 0) {
                if (n2 != 1 && n2 != 2) {
                    throw new joa();
                }
                object = ((evu)object).c;
                jse.e(ecm2, "metadata");
                object3 = ((ewc)object).b ? new ewb((ewc)object, ecm2) : ewc.a;
            }
        }
        this.c = object3;
        this.d = jns.f(object2, object3);
    }

    private static final hpn d(List arrayList3) {
        ArrayList arrayList = new ArrayList();
        for (Object t2 : arrayList3) {
            if (t2 == null) continue;
            arrayList.add(t2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object t3 : arrayList) {
            if (((hpn)t3).isCancelled()) continue;
            arrayList2.add(t3);
        }
        if (arrayList2.isEmpty()) {
            return hhk.I();
        }
        return fxf.aB(arrayList2).C(new evs(0), (Executor)hom.a);
    }

    @Override
    public final hpn a() {
        Object object = this.d;
        ArrayList<Object> arrayList = new ArrayList<Object>(jns.B((Iterable)object));
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = (evp)iterator.next();
            object = object != null ? object.a() : null;
            arrayList.add(object);
        }
        return evt.d(arrayList);
    }

    @Override
    public final hpn b(dzn dzn2) {
        jse.e(dzn2, "audioData");
        Object object = this.d;
        ArrayList<Object> arrayList = new ArrayList<Object>(jns.B((Iterable)object));
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = (evp)iterator.next();
            object = object != null ? object.b(dzn2) : null;
            arrayList.add(object);
        }
        return evt.d(arrayList);
    }

    @Override
    public final hpn c(hvu hvu2) {
        jse.e(hvu2, "bytes");
        Object object = this.d;
        ArrayList<Object> arrayList = new ArrayList<Object>(jns.B((Iterable)object));
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = (evp)iterator.next();
            object = object != null ? object.c(hvu2) : null;
            arrayList.add(object);
        }
        return evt.d(arrayList);
    }
}

