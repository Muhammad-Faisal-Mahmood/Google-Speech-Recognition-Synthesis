/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientDelegate;
import java.io.File;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public final class dca
implements hny {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    private final int g;

    public /* synthetic */ dca(cwj cwj2, ctq ctq2, ctf ctf2, ctt ctt2, ctj ctj2, cth cth2, int n2) {
        this.g = n2;
        this.d = cwj2;
        this.c = ctq2;
        this.e = ctf2;
        this.b = ctt2;
        this.f = ctj2;
        this.a = cth2;
    }

    public /* synthetic */ dca(egg egg2, String string, gzx gzx2, List list, dbu dbu2, dfj dfj2, int n2) {
        this.g = n2;
        this.a = egg2;
        this.b = string;
        this.c = gzx2;
        this.d = list;
        this.e = dbu2;
        this.f = dfj2;
    }

    public /* synthetic */ dca(kpo kpo2, AmbientDelegate ambientDelegate, Iterator iterator, den den2, File file, ddn ddn2, int n2) {
        this.g = n2;
        this.c = kpo2;
        this.f = ambientDelegate;
        this.d = iterator;
        this.a = den2;
        this.b = file;
        this.e = ddn2;
    }

    public /* synthetic */ dca(kpo kpo2, ddn ddn2, ddn ddn3, AmbientDelegate ambientDelegate, ddn ddn4, den den2, int n2) {
        this.g = n2;
        this.d = kpo2;
        this.e = ddn2;
        this.a = ddn3;
        this.b = ambientDelegate;
        this.f = ddn4;
        this.c = den2;
    }

    public /* synthetic */ dca(kpo kpo2, ddn ddn2, ddn ddn3, AmbientDelegate ambientDelegate, den den2, ddn ddn4, int n2) {
        this.g = n2;
        this.d = kpo2;
        this.e = ddn2;
        this.a = ddn3;
        this.b = ambientDelegate;
        this.c = den2;
        this.f = ddn4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a(Object object) {
        int n2 = this.g;
        Object object2 = null;
        boolean bl2 = true;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 == 2) {
                    object = (Void)object;
                    object = ((dco)this.a).b;
                    ddb.a();
                    ((dcx)((AmbientDelegate)this.b).c).a();
                    object2 = this.d;
                    Object object3 = this.f;
                    Object object4 = this.c;
                    object = (ddn)this.e;
                    object4 = (den)object4;
                    object3 = (ddn)object3;
                    ((kpo)object2).b((ddn)object, (ddn)object3, (den)object4);
                    return hhk.K(null);
                }
                if (n2 == 3) {
                    object = (Void)object;
                    object2 = (AmbientDelegate)this.b;
                    Object object5 = ((AmbientDelegate)object2).b;
                    Object object6 = this.a;
                    Object object7 = this.e;
                    object = (kpo)this.d;
                    Object object8 = (dfu)((kpo)object).c;
                    object7 = (ddn)object7;
                    File file = ((dfu)object8).e((ddn)object7);
                    object6 = (ddn)object6;
                    object8 = ((dfu)object8).e((ddn)object6);
                    Object object9 = (dgx)object5;
                    des des2 = ((dgx)object9).d();
                    fxf.K(des2);
                    object5 = ((dgx)object9).g().b;
                    ((hfk)ddd.c.l().j("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "unpack", 510, "FetchPipeline.java")).G("Unpacking fetched file %s to staged file %s with unpacker %s", dec.e(file), dec.e((File)object8), crh.n(des2));
                    object9 = ((dgx)object9).c().f();
                    ddn ddn2 = ((den)object9).o();
                    String string = ((dco)ddn2).b;
                    ddb.a();
                    fxf.K(object5);
                    object8 = hhk.L(hno.g(hmv.g(des2.b((den)object9, (String)object5, file, (File)object8), Throwable.class, new cvq((kpo)object, (ddn)object7, ddn2, (den)object9, 19), (Executor)((kpo)object).b), new dca((kpo)object, (ddn)object7, ddn2, (AmbientDelegate)object2, (ddn)object6, (den)object9, 2), (Executor)((kpo)object).b));
                    object7 = this.c;
                    ddn ddn3 = (ddn)this.f;
                    return hno.g((hpn)object8, new cvu((kpo)object, (AmbientDelegate)object2, (den)object7, (ddn)object6, ddn3, 3), (Executor)((kpo)object).b);
                }
                object = (Void)object;
                AmbientDelegate ambientDelegate = (AmbientDelegate)this.f;
                ((dcx)ambientDelegate.c).a();
                object2 = this.d;
                if (!object2.hasNext()) return hhk.K(null);
                object = this.e;
                Object object10 = this.b;
                Object object11 = this.a;
                return ((kpo)this.c).k((Iterator)object2, (den)object11, (File)object10, (ddn)object, ambientDelegate);
            }
            object = (Void)object;
            Object object12 = this.a;
            Object object13 = this.f;
            Object object14 = this.b;
            Object object15 = this.e;
            Object object16 = this.c;
            Object object17 = this.d;
            try {
                egg egg2 = ((cwj)object17).j;
                n2 = ((cth)object12).p;
                hxk hxk2 = ((cth)object12).q;
                object = object2 = ((cth)object12).i;
                if (object2 == null) {
                    object = hvi.a;
                }
                object = egg2.p((ctq)object16, (ctf)object15, (ctt)object14, (ctj)object13, n2, hxk2, (hvi)object);
            }
            catch (RuntimeException runtimeException) {
                object = css.a();
                ((kqr)object).b = csr.c;
                ((kqr)object).d = runtimeException;
                return hhk.J(((kqr)object).a());
            }
            object2 = (cwj)object17;
            ctf ctf2 = (ctf)object15;
            object14 = (ctt)object14;
            return ((cwj)object2).q((hpn)object, new cvq((cwj)object2, (cth)object12, ctf2, (ctt)object14, 2));
        }
        object = (Void)object;
        object = this.c;
        Object object18 = this.b;
        Object object19 = (egg)this.a;
        Object object20 = (dcj)((egg)object19).d;
        String string = (String)object18;
        object20 = ((dcj)object20).a(string);
        object19 = ((egg)object19).e(string, (List)object);
        ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/Superpacks", "requestSlices", 1754, "Superpacks.java")).G("Merging %d synced packs with current selection of %d packs using strategy: %s", ((hct)this.d).c, object19.size(), object20);
        Object object21 = this.e;
        object20 = ((dbu)object21).d();
        Object object22 = this.f;
        object = object2;
        if (object22 != null) {
            object = ((dfj)object22).b;
        }
        dax dax2 = (dax)object21;
        object2 = dax2.c;
        boolean bl3 = dax2.b;
        object19 = gzx.u(dcm.a, (Iterable)object19);
        object20 = gzx.u(dcm.a, (Iterable)object20);
        object22 = new gzs();
        gzs gzs2 = new gzs();
        dec.l((Collection)object19, (Collection)object20, new dcl((gzs)object22, gzs2), dcm.a);
        object22 = ((gzs)object22).g();
        gzx gzx2 = gzs2.g();
        boolean bl4 = bl2;
        if (!((AbstractCollection)object22).isEmpty()) return hhk.K(new daz((gzx)object19, (gzx)object20, (gzx)object22, gzx2, bl4, bl3, (byte[])object2));
        bl4 = bl2;
        if (!gzx2.isEmpty()) return hhk.K(new daz((gzx)object19, (gzx)object20, (gzx)object22, gzx2, bl4, bl3, (byte[])object2));
        if (!Arrays.equals((byte[])object, (byte[])object2)) {
            bl4 = bl2;
            return hhk.K(new daz((gzx)object19, (gzx)object20, (gzx)object22, gzx2, bl4, bl3, (byte[])object2));
        }
        bl4 = false;
        return hhk.K(new daz((gzx)object19, (gzx)object20, (gzx)object22, gzx2, bl4, bl3, (byte[])object2));
    }
}

