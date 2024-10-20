/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteException
 *  hom
 */
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class bzq {
    public final Object a;

    public bzq() {
        this.a = new ArrayList();
    }

    public bzq(long l2, dau dau2) {
        guw guw2 = new guw();
        guw2.d(1);
        guw2.e(l2, TimeUnit.MILLISECONDS);
        guw2.f(4L);
        guw2.h(new dcw(dau2));
        this.a = guw2.a();
    }

    public bzq(gto gto2) {
        this.a = (cpa)gto2.f();
    }

    public bzq(iyh iyh2, iwx iwx2) {
        fxf.K(iyh2);
        this.a = iyh2;
        fxf.K(iwx2);
    }

    public bzq(Object object) {
        a.s(object, "Request message cannot be null");
        this.a = object;
    }

    public bzq(Object object, byte[] byArray) {
        this.a = object;
    }

    public bzq(Object object, char[] cArray) {
        this.a = object;
    }

    public bzq(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        stringBuilder.append(string);
        this.a = fvc.R(stringBuilder, arrayList);
    }

    public bzq(jnu jnu2) {
        jnu2.getClass();
        this.a = jnu2;
    }

    public bzq(jnu jnu2, byte[] byArray) {
        jnu2.getClass();
        this.a = jnu2;
    }

    public bzq(jnu jnu2, byte[] byArray, byte[] byArray2) {
        jnu2.getClass();
        this.a = jnu2;
    }

    public bzq(jnu jnu2, char[] cArray) {
        jnu2.getClass();
        this.a = jnu2;
    }

    public bzq(byte[] byArray) {
        this.a = DesugarCollections.synchronizedSet(new HashSet());
    }

    public final /* synthetic */ ebk A() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (ebk)hwv2;
    }

    public final /* synthetic */ eaq B() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (eaq)hwv2;
    }

    public final void C(eap eap2) {
        jse.e(eap2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        eaq eaq2 = (eaq)hyg2.b;
        hyg2 = eaq.a;
        eaq2.c = eap2.h;
        eaq2.b |= 1;
    }

    public final /* synthetic */ eco D() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (eco)hwv2;
    }

    public final void E(int n2) {
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (eco)hyg2.b;
        eco eco2 = eco.a;
        ((eco)hyg2).b |= 1;
        ((eco)hyg2).c = n2;
    }

    public final void F(Object object, Executor executor) {
        fxf.K(executor);
        if (object != null) {
            ((hod)this.a).a((AutoCloseable)object, executor);
        }
    }

    public final void G(hcr hcr2) {
        fxf.v(hcr2.b() ^ true, "range must not be empty, but was %s", hcr2);
        this.a.add(hcr2);
    }

    public final hpn H(hpn hpn2) {
        Object object = this.a;
        return hno.g(hpn2, gqk.d(new ezz(object, 20)), ((frp)object).c);
    }

    public final /* synthetic */ eun I() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (eun)hwv2;
    }

    public final void J(dzn dzn2) {
        jse.e(dzn2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (eun)hyg2.b;
        eun eun2 = eun.a;
        dzn2.getClass();
        ((eun)hyg2).c = dzn2;
        ((eun)hyg2).b = 6;
    }

    public final void K(eaf eaf2) {
        jse.e(eaf2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (eun)hyg2.b;
        eun eun2 = eun.a;
        eaf2.getClass();
        ((eun)hyg2).c = eaf2;
        ((eun)hyg2).b = 8;
    }

    public final void L(eag eag2) {
        jse.e(eag2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        eun eun2 = (eun)hyg2.b;
        hyg2 = eun.a;
        eag2.getClass();
        eun2.c = eag2;
        eun2.b = 4;
    }

    public final void M(euk euk2) {
        jse.e(euk2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (eun)hyg2.b;
        eun eun2 = eun.a;
        euk2.getClass();
        ((eun)hyg2).c = euk2;
        ((eun)hyg2).b = 1;
    }

    public final void N(eas eas2) {
        jse.e(eas2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        eun eun2 = (eun)hyg2.b;
        hyg2 = eun.a;
        eas2.getClass();
        eun2.c = eas2;
        eun2.b = 7;
    }

    public final /* synthetic */ eum O() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (eum)hwv2;
    }

    public final /* synthetic */ ese P() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (ese)hwv2;
    }

    public final /* synthetic */ erw Q() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (erw)hwv2;
    }

    public final void R(int n2) {
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        erw erw2 = (erw)hyg2.b;
        hyg2 = erw.a;
        erw2.b |= 4;
        erw2.g = n2;
    }

    public final void S(eqz eqz2) {
        jse.e(eqz2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        erw erw2 = (erw)hyg2.b;
        hyg2 = erw.a;
        erw2.e = eqz2.g;
        erw2.b |= 1;
    }

    public final void T(ebq ebq2) {
        jse.e(ebq2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        erw erw2 = (erw)hyg2.b;
        hyg2 = erw.a;
        ebq2.getClass();
        erw2.d = ebq2;
        erw2.c = 3;
    }

    public final void U(ebt ebt2) {
        jse.e(ebt2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        erw erw2 = (erw)hyg2.b;
        hyg2 = erw.a;
        ebt2.getClass();
        erw2.d = ebt2;
        erw2.c = 2;
    }

    public final void V(String string) {
        jse.e(string, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (erw)hyg2.b;
        erw erw2 = erw.a;
        string.getClass();
        ((erw)hyg2).b |= 2;
        ((erw)hyg2).f = string;
    }

    public final /* synthetic */ void W(gpm gpm2, Object object) {
        jse.e(gpm2, "extension");
        jse.e(object, "value");
        ((hwr)this.a).aH(gpm2, object);
    }

    public final hog X(hth hth2) {
        return ((fsi)this.a).b().b(gqk.e(new frw(hth2, 1)), (Executor)hom.a);
    }

    public final hpn Y(hth hth2) {
        return ((fsi)this.a).b().b(gqk.e(new frw(hth2, 0)), (Executor)hom.a).i();
    }

    public final ApplicationInfo a(String string, int n2) {
        return ((Context)this.a).getPackageManager().getApplicationInfo(string, n2);
    }

    public final PackageInfo b(String string, int n2) {
        return ((Context)this.a).getPackageManager().getPackageInfo(string, n2);
    }

    public final hpr c(hpr hpr2) {
        Object object = this.a;
        if (object == null) {
            return hpr2;
        }
        return object.a();
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     */
    public final dfd d(String string) {
        void var1_4;
        Cursor cursor;
        block16: {
            void var4_10;
            Cursor cursor2;
            block15: {
                block14: {
                    dfd dfd2;
                    cursor = null;
                    cursor2 = this.a.getReadableDatabase().query("pending_downloads", dfd.a, "download_id=?", new String[]{string}, null, null, null, null);
                    if (cursor2 == null) break block14;
                    cursor = cursor2;
                    if (!cursor2.moveToNext()) break block14;
                    cursor = cursor2;
                    try {
                        dfd2 = dfd.f(cursor2);
                    }
                    catch (SQLiteException sQLiteException) {
                        break block15;
                    }
                    cursor2.close();
                    return dfd2;
                }
                if (cursor2 != null) {
                    cursor2.close();
                }
                return null;
                catch (Throwable throwable) {
                    break block16;
                }
                catch (SQLiteException sQLiteException) {
                    cursor2 = null;
                }
            }
            cursor = cursor2;
            Object object = this.a;
            cursor = cursor2;
            cursor = cursor2;
            IOException iOException = new IOException(a.ai(string, "SqlitePendingDownloadQueue#get, SQL query failed, download: "), (Throwable)var4_10);
            cursor = cursor2;
            object.a(iOException);
            cursor = cursor2;
            try {
                throw iOException;
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        throw var1_4;
    }

    public final void e(String object) {
        try {
            this.a.getWritableDatabase().delete("pending_downloads", "download_id=?", new String[]{object});
            return;
        }
        catch (SQLiteException sQLiteException) {
            Object object2 = this.a;
            object = new IOException("SqlitePendingDownloadQueue#remove, SQL delete failed, download: ".concat(String.valueOf(object)), sQLiteException);
            object2.a((IOException)object);
            throw object;
        }
    }

    public final void f(dfd object) {
        int n2;
        block3: {
            try {
                n2 = this.a.getWritableDatabase().update("pending_downloads", ((dfd)object).c(), "download_id=?", new String[]{((dfd)object).i()});
                if (n2 != 1) break block3;
                return;
            }
            catch (SQLiteException sQLiteException) {
                Object object2 = this.a;
                object = new IOException("SqlitePendingDownloadQueue#update, SQL update failed, download: ".concat(((dfd)object).i()), sQLiteException);
                object2.a((IOException)object);
                throw object;
            }
        }
        Object object3 = this.a;
        IOException iOException = new IOException(String.format(Locale.US, "SqlitePendingDownloadQueue#update, SQL update failed, download: %s, updated %d.", ((dfd)object).i(), n2));
        object3.a(iOException);
        throw iOException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int g(Object object) {
        synchronized (this) {
            object = (Integer)this.a.k(object);
            if (object != null) return (Integer)object;
            return -1;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(Object object) {
        synchronized (this) {
            ((gvr)this.a).a.remove(object);
            return;
        }
    }

    public final void i(String object, Throwable throwable) {
        object = new dba(object, throwable, 0);
        ((cxv)this.a).a((dau)object);
    }

    public final void j(String object) {
        object = new dbc(object, 1);
        ((cxv)this.a).a((dau)object);
    }

    public final void k(Throwable object) {
        object = new dbc(object, 0);
        ((cxv)this.a).a((dau)object);
    }

    public final void l(ddn object, ded ded2, String string, dhu dhu2) {
        object = new dbd((ddn)object, ded2, string, dhu2, 0);
        ((cxv)this.a).a((dau)object);
    }

    public final void m(ddn object, int n2) {
        object = new dft((ddn)object, n2, 1);
        ((cxv)this.a).a((dau)object);
    }

    public final void n(ded object, String string, Throwable throwable) {
        object = new dcg((ded)object, string, throwable, 1);
        ((cxv)this.a).a((dau)object);
    }

    public final void o(ddn object, ded ded2, String string, boolean bl2) {
        object = new dbb((ddn)object, ded2, string, bl2);
        ((cxv)this.a).a((dau)object);
    }

    public final void p(String object, Throwable throwable) {
        object = new dba(object, throwable, 1);
        ((cxv)this.a).a((dau)object);
    }

    public final void q(String object) {
        object = new dbc(object, 2);
        ((cxv)this.a).a((dau)object);
    }

    public final void r(String object, Throwable throwable) {
        object = new dba(object, throwable, 2);
        ((cxv)this.a).a((dau)object);
    }

    public final void s(ddn object, ded ded2, String string, Throwable throwable) {
        object = new dbd((ddn)object, ded2, string, throwable, 2);
        ((cxv)this.a).a((dau)object);
    }

    public final void t(ddn object, ded ded2, String string, Throwable throwable) {
        object = new dbd((ddn)object, ded2, string, throwable, 1);
        ((cxv)this.a).a((dau)object);
    }

    public final hpn u(Callable callable, Executor executor) {
        callable = gqk.j(callable);
        return ((iuv)this.a).a(callable, executor);
    }

    public final hpn v(hnx hnx2, Executor executor) {
        hnx2 = gqk.c(hnx2);
        return ((iuv)this.a).b(hnx2, executor);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean w(Object object, eky object2) {
        synchronized (this) {
            int n2 = this.g(object);
            int n3 = 0;
            boolean bl2 = n2 == -1;
            if (bl2) {
                Object object3 = ((eky)object2).a;
                object2 = (dds)((eky)object2).b;
                ((dij)object3).a((dds)object2, 0);
            }
            object2 = this.a;
            if (!bl2) {
                n3 = n2 + 1;
            }
            object2.m(object, n3);
            return bl2;
        }
    }

    public final efa x(eae eae2) {
        eae2.getClass();
        ((cgw)this.a.b()).getClass();
        return new efa(eae2);
    }

    public final /* synthetic */ ebl y() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (ebl)hwv2;
    }

    public final void z(edf edf2) {
        jse.e(edf2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        ebl ebl2 = (ebl)hyg2.b;
        hyg2 = ebl.a;
        edf2.getClass();
        ebl2.c = edf2;
        ebl2.b |= 1;
    }
}

