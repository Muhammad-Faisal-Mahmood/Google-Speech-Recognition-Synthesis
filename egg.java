/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.util.Log
 *  hom
 */
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

public final class egg {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public egg(Context context, cuv cuv2, cxl cxl2, bmu bmu2, dmu dmu2, gto gto2, gto gto3, cyu cyu2, cqq cqq2, cwk cwk2, gto gto4, Executor executor, fvc fvc2) {
        this.k = context;
        this.d = cuv2;
        this.f = cxl2;
        this.g = bmu2;
        this.m = dmu2;
        this.c = gto2;
        this.i = gto3;
        this.j = cyu2;
        this.h = cqq2;
        this.e = cwk2;
        this.l = gto4;
        this.a = executor;
        this.b = fvc2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public egg(dch object7) {
        Object object2;
        Object object3;
        this.f = new cxv((Executor)hom.a);
        cxv cxv2 = new cxv((Executor)hom.a);
        this.e = cxv2;
        this.a = new AtomicBoolean(false);
        this.k = object3 = ((dch)object7).a;
        Object object4 = object3;
        dfp dfp2 = dfp.b((Context)object3);
        this.m = dfp2;
        object3 = object4 = ((dch)object7).f;
        if (object4 == null) {
            object3 = ddv.a;
        }
        this.l = object3;
        Object object5 = dda.a;
        dcj dcj2 = new dcj(((dch)object7).g);
        this.d = dcj2;
        object4 = object2 = ((dch)object7).h;
        if (object2 == null) {
            object4 = new File(((dch)object7).a.getFilesDir(), "superpacks");
        }
        Object object6 = new dfl(dfp2);
        object2 = dcj2;
        this.c = object5 = new dfu((File)object4, (dfa)object6, (dda)object5, dcj2);
        object4 = (dfu)object5;
        object4 = ((dfu)object5).b;
        synchronized (object4) {
            object2 = (dfu)object5;
            if (((dfu)object5).c.containsKey("manifests")) {
                object7 = new IllegalArgumentException(a.ai("manifests", "Namespace is already registered: "));
                throw object7;
            }
            object2 = (dfu)object5;
            object2 = ((dfu)object5).c;
            object6 = new dgc("manifests", 0L, true);
            object2.put("manifests", object6);
        }
        object4 = object2 = ((dch)object7).k;
        if (object2 == null) {
            object4 = new ddl();
            ((ddl)object4).e(((dch)object7).i);
            ((ddl)object4).a = dbl.a;
            object4 = ((ddl)object4).d();
        }
        object4 = new bmu((dbl)object4, ((dch)object7).e, null);
        object2 = (dfu)object5;
        this.h = new czh((dfu)object5, (bmu)object4);
        this.g = object6 = new dfn(dfp2);
        ddk ddk2 = new ddk(((dch)object7).b);
        object2 = new ddk(((dch)object7).c);
        ddk ddk3 = new ddk(((dch)object7).d);
        object4 = object3;
        if (object3 == null) {
            object3 = new ivg(null);
            ((ivg)object3).h("superpacks-packs-control-%d");
            object4 = hhk.E(Executors.newSingleThreadExecutor(ivg.i((ivg)object3)));
        }
        int n2 = ((dch)object7).j;
        object7 = ((dch)object7).i;
        object3 = dcj2;
        object3 = (dfu)object5;
        this.i = object7 = new dhl((dfu)object5, ddk2, (ddk)object2, ddk3, (hpq)object4, (dfi)object6, dcj2, n2, (gzx)object7);
        this.b = new dfo(dfp2);
        this.j = new dev(new dfm(dfp2));
        object3 = new bzq((Object)cxv2, null);
        object4 = (dfu)object5;
        ((dfu)object5).g.c(object3);
        object4 = dfp2;
        dfp2.a.c(object3);
        object4 = (dhl)object7;
        ((cxv)((kpo)((dhl)object7).g).f).c(object3);
        object3 = (dhl)object7;
        for (Object object7 : ((AmbientMode$AmbientController)((dhl)object7).j).h()) {
            if (!(object7 instanceof din)) continue;
            object7 = (din)object7;
            return;
        }
    }

    public egg(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, jnu jnu10, jnu jnu11, jnu jnu12, jnu jnu13, jnu jnu14) {
        jnu2.getClass();
        this.a = jnu2;
        jnu3.getClass();
        this.b = jnu3;
        jnu4.getClass();
        this.c = jnu4;
        jnu5.getClass();
        this.d = jnu5;
        jnu6.getClass();
        this.e = jnu6;
        jnu7.getClass();
        this.f = jnu7;
        jnu8.getClass();
        this.g = jnu8;
        jnu9.getClass();
        this.h = jnu9;
        jnu10.getClass();
        this.i = jnu10;
        jnu11.getClass();
        this.j = jnu11;
        jnu12.getClass();
        this.k = jnu12;
        jnu13.getClass();
        this.l = jnu13;
        jnu14.getClass();
        this.m = jnu14;
    }

    public static String d(String string) {
        return String.valueOf(string).concat("-manifest");
    }

    public final egf a(efx efx2, gto gto2, emm emm2) {
        efx2.getClass();
        Context context = ((ilt)this.a).a();
        Object object = this.c;
        Object object2 = this.b.b();
        dml dml2 = (dml)object.b();
        dml2.getClass();
        object = (cxt)this.d.b();
        object.getClass();
        Object object3 = this.f;
        Object object4 = this.e.b();
        gto gto3 = (gto)((imc)object3).a;
        gto3.getClass();
        gto gto4 = (gto)((imc)this.g).a;
        gto4.getClass();
        gto gto5 = (gto)((imc)this.h).a;
        gto5.getClass();
        gto gto6 = (gto)((imc)this.i).a;
        gto6.getClass();
        object3 = (gto)((imc)this.j).a;
        object3.getClass();
        Object object5 = this.l;
        Object object6 = this.k.b();
        egi egi2 = (egi)object5.b();
        egi2.getClass();
        object5 = ((end)this.m).a();
        object4 = (efu)object4;
        return new egf(efx2, gto2, emm2, context, (dpq)object2, dml2, (cxt)object, (efu)object4, gto3, gto4, gto5, gto6, (gto)object3, (edh)object6, egi2, (czh)object5);
    }

    public final dbx b(String object, int n2, String string) {
        Object object2;
        block4: {
            object2 = null;
            Object object3 = null;
            if (n2 >= 0) {
                object2 = object3;
                object2 = object3 = ((czh)this.h).d((String)object, n2);
                if (object3 != null) break block4;
                object2 = object3;
                try {
                    ((hfk)((hfk)ddd.a.h()).j("com/google/android/libraries/micore/superpacks/Superpacks", "getSuperpackManifest", 1915, "Superpacks.java")).A("Manifest for %s is not available, version: %d", object, n2);
                    object2 = object3;
                }
                catch (dbo dbo2) {
                    ((hfk)((hfk)((hfk)ddd.a.h()).i(dbo2)).j("com/google/android/libraries/micore/superpacks/Superpacks", "getSuperpackManifest", 1923, "Superpacks.java")).A("Failed to parse manifest for %s, version: %d", object, n2);
                    object3 = this.e;
                    object = new dce((String)object, n2, string, dbo2, 1);
                    ((cxv)object3).a((dau)object);
                }
            }
        }
        return object2;
    }

    public final hpn c(ded ded2, ddr object) {
        dcq dcq2 = (dcq)object;
        String string = dcq2.b;
        String string2 = dcq2.a;
        int n2 = dcq2.g;
        int n3 = dcq2.f;
        int n4 = dcq2.e;
        int n5 = dcq2.d;
        object = hhk.P(new dbz(this, ded2, string2, dcq2.c, n5, n4, n3, n2, (ddr)object, string), (Executor)this.l);
        if (((cxv)this.f).b()) {
            return object;
        }
        return hmv.g((hpn)object, Throwable.class, new cxe((Object)this, (Object)ded2, object, 7, null), (Executor)this.l);
    }

    public final List e(String object, List object2) {
        Serializable serializable = new ArrayList();
        ((ReentrantLock)((czh)this.h).c).lock();
        try {
            hdy hdy2 = ((gzx)object2).v();
            while (hdy2.hasNext()) {
                object2 = (ddo)hdy2.next();
                dbx dbx2 = this.b((String)object, ((ddo)object2).a(), "openPacks");
                if (dbx2 != null) {
                    String string = ((dco)((ddo)object2).b()).b;
                    if (!((day)dbx2).c.containsKey(string) && !((day)dbx2).c.containsKey(den.q(string))) {
                        object2 = String.valueOf(object2);
                        serializable = new StringBuilder();
                        ((StringBuilder)serializable).append("The manifest does not contain ");
                        ((StringBuilder)serializable).append((String)object2);
                        object = new ddg(((StringBuilder)serializable).toString());
                        throw object;
                    }
                    serializable.add(dbx2.g(((dco)((ddo)object2).b()).b));
                    continue;
                }
                object2 = String.valueOf(object2);
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append("A manifest could not be found for ");
                ((StringBuilder)serializable).append((String)object2);
                object = new ddg(((StringBuilder)serializable).toString());
                throw object;
            }
            return serializable;
        }
        finally {
            ((ReentrantLock)((czh)this.h).c).unlock();
        }
    }

    public final void f() {
        if (((AtomicBoolean)this.a).getAndSet(true)) {
            return;
        }
        this.m.getReadableDatabase();
    }

    public final void g(String string, dbv dbv2) {
        ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/Superpacks", "registerSlicingStrategy", 348, "Superpacks.java")).C("Registering slicing strategy for %s: %s", string, dbv2);
        ((dcj)this.d).e(string, dbv2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(String string) {
        ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/Superpacks", "setQuota", 314, "Superpacks.java")).C("Setting quota for %s to %s", string, dec.c(0xC800000L));
        Object object = this.c;
        Object object2 = ((dfu)object).b;
        synchronized (object2) {
            if (!((dfu)object).c.containsKey(string)) {
                Map map = ((dfu)object).c;
                object = new dgc(string, 0xC800000L, false);
                map.put(string, object);
                return;
            }
            long l2 = ((dgc)((dfu)object).c.get((Object)string)).b;
            if (l2 != 0xC800000L) {
                ((hfk)((hfk)ddd.a.h()).j("com/google/android/libraries/micore/superpacks/gc/FileManager", "registerNamespace", 215, "FileManager.java")).G("Namespace %s is already registered with different quota!(%s instead of the requested %s). The new quota will be ignored as this operation is not yet supported", string, dec.c(l2), dec.c(0xC800000L));
            }
            return;
        }
    }

    public final void i(String object, List object2) {
        if (((dcj)this.d).b((String)object) != dbs.a) {
            object = object2.iterator();
            while (object.hasNext()) {
                object2 = (den)object.next();
            }
        }
    }

    public final hpn j(ctt ctt2) {
        return fxf.ak(this.f.e(ctt2), new cww(this, ctt2, 7, null), (Executor)this.a);
    }

    public final hpn k() {
        Object object;
        Object object2;
        block6: {
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    object2 = this.k;
                    object = fpu.a;
                    object = fvc.K("*.lease", ((Context)object2).getPackageName(), 0L);
                    ((bmu)this.g).z((Uri)object);
                    ((cyu)this.j).d(1077);
                }
                catch (IOException iOException) {
                    cyr.j(iOException, "%s: Failed to release the leases in the android shared storage", "SharedFileManager");
                    ((cyu)this.j).d(1078);
                }
                catch (fqb fqb2) {
                    if (!Log.isLoggable((String)"MDD", (int)2)) break block6;
                    cyr.a("%s: Failed to release the leases in the android shared storage. UnsupportedFileStorageOperation was thrown", "SharedFileManager");
                }
            }
        }
        try {
            object = this.g;
            object2 = this.k;
            gto gto2 = (gto)this.l;
            object2 = crh.c((Context)object2, gto2);
            ((bmu)object).D((Uri)object2);
        }
        catch (IOException iOException) {
            this.d.a();
        }
        return hpj.a;
    }

    public final hpn l(ctt ctt2, String string, int n2, long l2, String string2, ctq ctq2, ctf ctf2, cti cti2, ctj ctj2, int n3, List list, hvi hvi2) {
        return fxf.ak(this.o(ctt2), new cxh(this, ctt2, string, ctf2, cti2, ctq2, n2, l2, string2, ctj2, n3, list, hvi2, 1), (Executor)this.a);
    }

    public final hpn m(ctt ctt2) {
        return fxf.aj(this.n(new hdq(ctt2)), new cws(ctt2, 18), (Executor)hom.a);
    }

    public final hpn n(hav hav2) {
        return dah.e(this.f.f(hav2)).g(new cww(this, hav2, 10), (Executor)this.a);
    }

    public final hpn o(ctt ctt2) {
        return fxf.ak(this.f.e(ctt2), new cwu(ctt2, 12), (Executor)this.a);
    }

    public final hpn p(ctq object, ctf ctf2, ctt ctt2, ctj ctj2, int n2, List list, hvi hvi2) {
        int n3;
        cyr.d("%s: startDownload called for %s", "SharedFileManager", ctf2.d);
        if (ctf2.d.startsWith("inlinefile")) {
            object = css.a();
            ((kqr)object).b = csr.Q;
            ((kqr)object).c = "downloading a file with an inlinefile scheme is not supported, use importFiles instead.";
            return hhk.J(((kqr)object).a());
        }
        hpn hpn2 = this.o(ctt2);
        int n4 = n3 = a.t(ctt2.f);
        if (n3 == 0) {
            n4 = 1;
        }
        Object object2 = this.k;
        Object object3 = this.d;
        object2 = cqq.r((Context)((Context)object2), (cuv)object3).d >= cwq.c.d && ((gto)this.c).g() && ((cux)((gto)this.c).c()).b() != 1 ? this.r(ctf2.l, 0, n4) : hhk.K(null);
        object3 = crh.z(new hpn[]{hpn2, object2}).u(new cmq((Object)hpn2, object2, (Object)ctf2, 2, null), (Executor)hom.a);
        hpn hpn3 = fxf.ak((hpn)object3, new cxe(this, ctt2, ctf2, 0), (Executor)this.a);
        hpn hpn4 = fxf.ak(this.e.g((ctq)object), new buf(10), (Executor)this.a);
        return dah.e(crh.z(new hpn[]{hpn2, object2, object3, hpn3, hpn4}).v(new evs(1), (Executor)hom.a)).g(new cxf(this, hpn2, (hpn)object2, (hpn)object3, hpn3, hpn4, ctf2, (ctq)object, ctt2, ctj2, n2, list, hvi2), (Executor)this.a).d(cxk.class, new cww(this, ctt2, 6, null), (Executor)this.a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void q(ctq ctq2, Uri uri) {
        if (!((gto)this.i).g()) return;
        try {
            long l2 = ((bmu)this.g).u(uri);
            if (l2 <= 0L) return;
            ((daa)((gto)this.i).c()).h(ctq2.c, l2);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public final hpn r(List list, int n2, int n3) {
        int n4;
        if (n2 == list.size()) {
            return hhk.K(null);
        }
        cti cti2 = (cti)list.get(n2);
        int n5 = n4 = a.w(cti2.f);
        if (n4 == 0) {
            n5 = 1;
        }
        if (n5 != ((cux)((gto)this.c).c()).b()) {
            return this.r(list, n2 + 1, n3);
        }
        hwp hwp2 = ctt.a.l();
        hwv hwv2 = cti2.g;
        Object object = hwv2;
        if (hwv2 == null) {
            object = cte.a;
        }
        object = ((cte)object).b;
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv2 = hwp2.b;
        ctt ctt2 = (ctt)hwv2;
        object.getClass();
        ctt2.b |= 4;
        ctt2.e = object;
        if (!hwv2.B()) {
            hwp2.u();
        }
        object = (ctt)hwp2.b;
        ((ctt)object).f = n3 - 1;
        ((ctt)object).b |= 8;
        object = (ctt)hwp2.o();
        return fxf.ak(this.f.e((ctt)object), new cxi(this, (ctt)object, cti2, list, n2, n3), (Executor)this.a);
    }

    public final hpn s(int n2, String object, String string) {
        if ((object = crh.f((Context)this.k, n2, (String)object, string, (cuv)this.d, (gto)this.l, false)) == null) {
            cyr.g("%s: Failed to get file uri!", "SharedFileManager");
            object = css.a();
            ((kqr)object).b = csr.v;
            return hhk.J(((kqr)object).a());
        }
        return hhk.K(object);
    }
}

