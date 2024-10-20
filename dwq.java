/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.os.StrictMode$ThreadPolicy$Builder
 */
import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import java.io.IOException;

public final class dwq {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public final Context c;
    public final gui d;
    public final gui e;
    public final gui f;
    public final gui g;
    public final Uri h;
    public volatile dvh i;
    public final Uri j;
    public volatile dvi k;
    private final gui l;

    public dwq(Context object, gui gui2, gui object2, gui gui3) {
        this.c = object;
        this.e = gui2;
        this.d = gui3;
        this.f = object2;
        object2 = new fps((Context)object);
        ((fps)object2).d("phenotype_storage_info");
        ((fps)object2).e("storage-info.pb");
        this.h = ((fps)object2).a();
        object = new fps((Context)object);
        ((fps)object).d("phenotype_storage_info");
        ((fps)object).e("device-encrypted-storage-info.pb");
        int n2 = crt.a;
        ((fps)object).c();
        this.j = ((fps)object).a();
        this.g = fvd.ap(new dty(this, 8));
        this.l = fvd.ap(new dty(gui2, 9));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final dvh a() {
        dvh dvh2;
        dvh dvh3 = dvh2 = this.i;
        if (dvh2 != null) return dvh3;
        Object object = a;
        synchronized (object) {
            dvh3 = dvh2 = this.i;
            if (dvh2 != null) return dvh3;
            dvh3 = dvh.b;
            fqp fqp2 = fqp.b(dvh3);
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            dvh2 = new StrictMode.ThreadPolicy.Builder(threadPolicy);
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)dvh2.permitDiskReads().build());
            try {
                dvh2 = (dvh)((bmu)this.f.a()).w(this.h, fqp2);
                dvh3 = dvh2;
            }
            catch (IOException iOException) {
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            }
            finally {
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            }
            this.i = dvh3;
            return dvh3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final dvi b() {
        dvi dvi2;
        dvi dvi3 = dvi2 = this.k;
        if (dvi2 != null) return dvi3;
        Object object = b;
        synchronized (object) {
            dvi3 = dvi2 = this.k;
            if (dvi2 != null) return dvi3;
            dvi3 = dvi.b;
            fqp fqp2 = fqp.b(dvi3);
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            dvi2 = new StrictMode.ThreadPolicy.Builder(threadPolicy);
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)dvi2.permitDiskReads().build());
            try {
                dvi2 = (dvi)((bmu)this.f.a()).w(this.j, fqp2);
                dvi3 = dvi2;
            }
            catch (IOException iOException) {
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            }
            finally {
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            }
            this.k = dvi3;
            return dvi3;
        }
    }

    public final hpn c(boolean bl2) {
        hpr hpr2 = (hpr)this.e.a();
        fxf.K(hpr2);
        hpn hpn2 = bl2 ? hhk.L((hpn)this.l.a()) : hpj.a;
        return hno.g(hph.q(hpn2), new cyc(this, 13), hpr2);
    }

    public final boolean d() {
        return (this.b().c & 1) != 0;
    }

    public final boolean e() {
        return (this.a().c & 1) != 0;
    }
}

