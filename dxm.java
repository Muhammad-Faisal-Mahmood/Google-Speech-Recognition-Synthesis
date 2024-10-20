/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.Collection;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;

public final class dxm
implements dxi,
dxj {
    public static final hei a = hei.m("com/google/android/libraries/search/appflows/GenericAppFlowLogger");
    private static final Random j = new Random();
    private static final hpn k = hhk.K(iat.a);
    public final Object b = new Object();
    public final iku c;
    public final hav d;
    public final dxs e;
    public final dxk f;
    public final dxz g;
    public final dyb h;
    public final long i;
    private final Executor l;
    private final int m;
    private final gto n;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public dxm(gto object, gto object2, Set object3, cya object4, gto gto2, gto gto3, iku object5, dxs dxs2) {
        this.g = object = (dxz)((gto)object).e(dxz.b());
        this.h = (dyb)((gto)object2).e(dyb.b());
        this.d = hav.n((Collection)object3);
        this.c = object5;
        this.e = dxs2;
        this.m = (Integer)dxs2.g.e(0);
        this.l = new hpz(((dxz)object).b);
        this.i = j.nextLong();
        object = ((cya)object4).e.b();
        object2 = (gto)((imc)((cya)object4).a).a;
        object2.getClass();
        ((cgw)((cya)object4).b.b()).getClass();
        object5 = ((cya)object4).d.b();
        object3 = ((bqw)((cya)object4).c).a();
        object4 = (iuv)object5;
        this.f = object = new dxq((dpq)object, (gto)object2, (iuv)object4, (gto)object3, dxs2);
        if (dxs2.a) {
            ((dml)((gtt)gto2).a).b(dxs2.b, (dxk)object);
        }
        this.n = gto3;
        object2 = (dxq)object;
        object2 = ((dxq)object).a;
        synchronized (object2) {
            object3 = gto.i(this);
            object4 = (dxq)object;
            ((dxq)object).b = object3;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final hpn c(dyk object) {
        synchronized (this) {
            Object object2;
            long l2 = cgw.o();
            object.n().booleanValue();
            if (this.h.a && this.e.c && ((gto)(object2 = this.n)).g()) {
                object2 = (eyh)((gto)object2).c();
                jse.e(object, "event");
                jse.d(object.p(), "getOriginatingEnumClassName(...)");
                object.i();
                jse.d(iau.a, "privacyRequirements");
                object2 = object2.a();
            } else {
                object2 = k;
            }
            dxl dxl2 = new dxl(this, (dyk)object, l2);
            return fxf.ak((hpn)object2, dxl2, this.l);
        }
    }

    @Override
    public final void a(dyk dyk2) {
        int n2;
        hav hav2;
        if (this.h.d && ((hav2 = dyk2.i().b).contains(0) || this.m == 0 || !hav2.contains(-1) && (n2 = this.m) != -1 && !hav2.contains(n2))) {
            hhk.J(new IllegalArgumentException("Logger Ids of the logger and the event don't match or aren't set."));
            return;
        }
        fxf.al(this.c(dyk2), new fgl(1), (Executor)hom.a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn b(dzc dzc2) {
        if (dzc2.d) {
            return hpj.a;
        }
        Object object = dzc2.a;
        object = this.b;
        synchronized (object) {
            hdx hdx2 = this.e.f.k();
            while (hdx2.hasNext()) {
                ((dyi)hdx2.next()).b();
            }
            hdx2 = this.d.k();
            while (hdx2.hasNext()) {
                ((dyh)hdx2.next()).b();
            }
            return fxf.ai(new ctz(this, dzc2, 15, null), this.l);
        }
    }

    public final String toString() {
        return "Generic AppFlows Logger: ".concat(String.valueOf(this.e.b));
    }
}

