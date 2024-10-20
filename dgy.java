/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;

public final class dgy
implements hny {
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    private final int i;

    public /* synthetic */ dgy(cwj cwj2, bzo bzo2, cth cth2, ctq ctq2, hny hny2, ctq ctq3, cth cth3, boolean bl2, int n2) {
        this.i = n2;
        this.c = cwj2;
        this.b = bzo2;
        this.d = cth2;
        this.h = ctq2;
        this.f = hny2;
        this.e = ctq3;
        this.g = cth3;
        this.a = bl2;
    }

    public /* synthetic */ dgy(dhn dhn2, Set set, boolean bl2, dfu dfu2, hpq hpq2, dfi dfi2, AmbientMode$AmbientController ambientMode$AmbientController, kpo kpo2, int n2) {
        this.i = n2;
        this.c = dhn2;
        this.f = set;
        this.a = bl2;
        this.g = dfu2;
        this.b = hpq2;
        this.d = dfi2;
        this.e = ambientMode$AmbientController;
        this.h = kpo2;
    }

    public /* synthetic */ dgy(kpo kpo2, AmbientDelegate ambientDelegate, ddn ddn2, den den2, boolean bl2, File file, ddn ddn3, ddn ddn4, int n2) {
        this.i = n2;
        this.b = kpo2;
        this.c = ambientDelegate;
        this.d = ddn2;
        this.e = den2;
        this.a = bl2;
        this.f = file;
        this.g = ddn3;
        this.h = ddn4;
    }

    @Override
    public final hpn a(Object object) {
        int n2 = this.i;
        if (n2 != 0) {
            boolean bl2 = false;
            if (n2 != 1) {
                object = (Boolean)object;
                if (this.f.isEmpty()) {
                    object = hpj.a;
                } else {
                    Object object2 = this.h;
                    Object object3 = this.e;
                    object = this.d;
                    Object object4 = this.b;
                    Object object5 = this.g;
                    bl2 = this.a;
                    Object object6 = this.c;
                    Object object7 = (dhn)object6;
                    Object object8 = ((dhn)object7).b;
                    if (((hct)object8).c == 1) {
                        object7 = ((dhn)object7).e((Collection)object8.get(0), bl2, (dfu)object5, (hpq)object4, (dfi)object, (AmbientMode$AmbientController)object3, (kpo)object2);
                        object5 = object;
                        object = object7;
                    } else {
                        HashMap hashMap = new HashMap();
                        object8 = hhk.K(new HashMap());
                        hdy hdy2 = ((gzx)((dhn)object7).b).v();
                        while (hdy2.hasNext()) {
                            Collection collection = (Collection)hdy2.next();
                            object8 = hno.g((hpn)object8, new dhm((dhn)object7, (hpn)object8, hashMap, (dfu)object5, collection, bl2, (hpq)object4, (dfi)object, (AmbientMode$AmbientController)object3, (kpo)object2), (Executor)object4);
                        }
                        object7 = hno.g((hpn)object8, new cyc(hashMap, 8), (Executor)object4);
                        object5 = object;
                        object = object7;
                    }
                    object = hno.g((hpn)object, new cxe(object6, object5, object4, 8, null), (Executor)object4);
                }
                return object;
            }
            Object object9 = (cwi)((Object)object);
            Object object10 = this.d;
            object = this.b;
            if (object9 == cwi.c) {
                ((bzo)object).j((cth)object10);
                object = hhk.K((Object)cwi.c);
            } else if (object9 == cwi.a) {
                ((bzo)object).k(1007, (cth)object10);
                object = hhk.K((Object)cwi.a);
            } else {
                boolean bl3 = this.a;
                Object object11 = this.g;
                Object object12 = this.e;
                Object object13 = this.f;
                Object object14 = this.h;
                Object object15 = this.c;
                if (object9 == cwi.b) {
                    bl2 = true;
                }
                fxf.q(bl2);
                ctq ctq2 = (ctq)object14;
                object9 = (cth)object10;
                dah dah2 = dah.e(object13.a(new cxr(ctq2, (cth)object9)));
                object13 = (cwj)object15;
                object10 = dah2.g(new cvq((cwj)object13, object, (cth)object9, ctq2, 8), ((cwj)object13).e).g(new cvy(object15, (hwv)object10, 5), ((cwj)object13).e).g(new btb(object15, (ctq)object12, object11, 20), ((cwj)object13).e).g(new cvy(object15, (hwv)object14, 6), ((cwj)object13).e).g(new cvv(object15, 4), ((cwj)object13).e);
                object11 = (cth)object11;
                object = ((dah)object10).f(new cwb(bl3, (bzo)object, (cth)object11), ((cwj)object13).e);
            }
            return object;
        }
        Object object16 = (dei)object;
        object = (AmbientDelegate)this.c;
        ((dcx)((AmbientDelegate)object).c).a();
        fxf.K(object16);
        Object object17 = this.d;
        kpo kpo2 = (kpo)this.b;
        Object object18 = kpo2.c;
        object16 = ((dei)object16).a;
        object18 = (dfu)object18;
        object17 = (ddn)object17;
        ((dfu)object18).l((ddn)object17, (String)object16);
        object16 = (den)this.e;
        object18 = ((den)object16).e();
        if (object18 != null) {
            ((dfu)kpo2.c).m((ddn)object17, (ded)object18);
        }
        if (this.a) {
            object18 = this.f;
            long l2 = dly.D((den)object16);
            kpo2.d((File)object18, l2);
        }
        object16 = this.h;
        return kpo2.i((ddn)object17, (ddn)this.g, (ddn)object16, (AmbientDelegate)object);
    }
}

