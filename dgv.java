/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  hom
 */
import android.net.Uri;
import java.io.File;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class dgv
implements dej {
    public static final hka a = new dgr();
    public final ScheduledExecutorService b;
    public final Map c;
    public final cxv d = new cxv((Executor)hom.a);
    private final List e;

    public dgv(ScheduledExecutorService scheduledExecutorService, List list) {
        this.c = new HashMap();
        this.b = scheduledExecutorService;
        this.e = list;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a(ddn object) {
        ((hfk)ddd.a.m().j("com/google/android/libraries/micore/superpacks/packs/DownloadFetcher", "cancel", 121, "DownloadFetcher.java")).u("Download fetcher cancelling %s", object);
        synchronized (this) {
            dgu dgu2 = (dgu)this.c.get(object);
            if (dgu2 == null) {
                return hhk.K(null);
            }
            synchronized (dgu2) {
                object = dgu2.f;
                if (object != null) {
                } else {
                    dwm dwm2 = dgu2.j;
                    Object object2 = dgu2.c;
                    object = ((File)object2).getParentFile();
                    fxf.K(object);
                    object2 = ((File)object2).getName();
                    ((djj)dwm2.e).d((File)object, (String)object2);
                    object = new hqa();
                    dgu2.f = object;
                    return dgu2.f;
                }
            }
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn b(den object, deh object2, File serializable) {
        Object object3 = ((den)object).g();
        Object object4 = (String)fvd.O((Iterable)object3, null);
        ((hfk)ddd.a.m().j("com/google/android/libraries/micore/superpacks/packs/DownloadFetcher", "fetch", 99, "DownloadFetcher.java")).H("Download fetcher fetching %s to %s with params %s, url: %s", object, serializable, object2, object4);
        if (((AbstractCollection)object3).isEmpty()) {
            throw new IllegalArgumentException("Manifest has no download URLs");
        }
        synchronized (this) {
            Object object5;
            object3 = object5 = (dgu)this.c.get(((den)object).o());
            if (object5 == null) {
                object3 = object2;
                if (object2 == null) {
                    object3 = deh.f;
                }
                object2 = new dgu(this, this.e((String)object4), (den)object, (deh)object3, (File)serializable);
                this.c.put(((den)object).o(), object2);
                synchronized (object2) {
                    object5 = new aim(object2, 8);
                    int n2 = ((hct)((dgu)object2).a.g()).c;
                    serializable = new hjv(n2);
                    object3 = ((dgu)object2).d;
                    object4 = ((dgu)object2).h.b;
                    object = a;
                    Object object6 = hkb.a;
                    object6 = gup.a;
                    Object object7 = gto.i(object4);
                    fxf.B(true, "Either executor or scheduledExecutorService needs to be set.");
                    object7 = ((gtt)object7).a;
                    object4 = new hkb((gui)object5, (hjy)serializable, (gtq)object3, (Executor)object7, (ScheduledExecutorService)object7, (gup)object6, (hka)object);
                    object = new bdr(object2, 7);
                    ((dgu)object2).g = crh.v((hpn)object4, (Callable)object, ((dgu)object2).h.b);
                }
                object3 = object2;
            }
            synchronized (object3) {
                return ((dgu)object3).g;
            }
        }
    }

    @Override
    public final String c() {
        return "DownloadFetcher";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final elq d(den den2) {
        if (den2.g().isEmpty()) {
            return null;
        }
        try {
            this.e((String)fvd.O(den2.g(), null));
            return elq.b(den2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    final dwm e(String string) {
        for (dwm dwm2 : this.e) {
            if (string == null) continue;
            try {
                boolean bl2;
                String string2 = Uri.parse((String)string).normalizeScheme().getScheme();
                if (!"http".equals(string2) && !(bl2 = "https".equals(string2))) continue;
                return dwm2;
            }
            catch (Exception exception) {
                ((hfk)((hfk)((hfk)ddd.a.h()).i(exception)).j("com/google/android/libraries/micore/superpacks/packs/HttpDownloadProtocol", "canHandle", 184, "HttpDownloadProtocol.java")).u("Exception while attemption to parse URL %s", string);
            }
        }
        throw new IllegalArgumentException(String.format("No registered download protocol could support URL %s", string));
    }
}

