/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.net.ConnectivityManager
 *  android.util.Log
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.util.Log;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;

public final class djj {
    public static final String a = "djj";
    private static final gty d = new djd(1);
    private static final gty e = new djd(0);
    private static final gty f = new djd(2);
    protected final List b;
    public final dyr c;
    private final Context g;
    private final Executor h;
    private final djk i;
    private final ConnectivityManager j;
    private final Map k = new HashMap();
    private final Map l = new HashMap();
    private final Queue m = new ConcurrentLinkedQueue();
    private boolean n = false;
    private final BroadcastReceiver o;

    public djj(djk djk2, Context context, Executor executor, dyr dyr2) {
        this.b = new ArrayList();
        this.o = new dje(this);
        this.g = context;
        this.i = djk2;
        this.h = executor;
        this.c = dyr2;
        this.j = (ConnectivityManager)context.getSystemService("connectivity");
    }

    public static String a(File object, String string) {
        object = ((File)object).getAbsolutePath();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append("/");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void j(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) return;
        try {
            httpURLConnection.disconnect();
            return;
        }
        catch (IllegalStateException | NullPointerException runtimeException) {
            return;
        }
    }

    private static boolean o(Context context, String string) {
        return ye.e(context, string) == 0;
    }

    private static final void p(List object, gty gty2) {
        object = ((gzx)object).v();
        while (object.hasNext()) {
            gty2.a((djg)object.next());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final HttpURLConnection b(String object, String object2) {
        synchronized (this) {
            this.i.e();
            if (!djj.o(this.g, "android.permission.INTERNET")) {
                object = new IllegalStateException("Missing INTERNET permission, can't start download");
                throw object;
            }
            fxf.A(((djc)this.k.get(object)).f() ^ true);
            HttpURLConnection httpURLConnection = this.i.a((String)object2);
            object2 = this.c.b;
            if (object2 != null) {
                httpURLConnection.setRequestProperty("User-Agent", (String)object2);
            }
            this.l.put(object, httpURLConnection);
            return httpURLConnection;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final List c() {
        synchronized (this) {
            gzs gzs2 = new gzs();
            Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                djg djg2 = (djg)((WeakReference)iterator.next()).get();
                if (djg2 == null) {
                    iterator.remove();
                    continue;
                }
                gzs2.h(djg2);
            }
            return gzs2.g();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(File object, String object2) {
        synchronized (this) {
            Map map = this.k;
            object = djj.a((File)object, (String)object2);
            object2 = (djc)map.get(object);
            if (object2 != null) {
                ((djc)object2).d();
            }
            djj.j((HttpURLConnection)this.l.get(object));
            if (object2 != null) {
                this.g();
                return;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        synchronized (this) {
            this.i.b();
            this.i.c();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(djc object) {
        ((djc)object).c();
        synchronized (this) {
            boolean bl2 = this.m.isEmpty();
            this.m.add(object);
            if (bl2) {
                Context context = this.g;
                BroadcastReceiver broadcastReceiver = this.o;
                object = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(broadcastReceiver, (IntentFilter)object);
                this.n = true;
                this.g();
            }
            if (!this.m.containsAll(this.k.values())) return;
            object = this.c();
        }
        if (object == null) return;
        djj.p((List)object, d);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g() {
        synchronized (this) {
            this.m.size();
            Iterator iterator = this.m.iterator();
            while (iterator.hasNext()) {
                djc djc2 = (djc)iterator.next();
                if (!djc2.f() && !this.k(djc2.a())) continue;
                iterator.remove();
                djc2.b();
                this.i(djc2);
            }
            if (this.m.isEmpty() && this.n) {
                this.g.unregisterReceiver(this.o);
                this.n = false;
                return;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(djg djg2) {
        synchronized (this) {
            WeakReference<djg> weakReference = new WeakReference<djg>(djg2);
            this.b.add(weakReference);
            return;
        }
    }

    public final void i(djc object) {
        djj.p(this.c(), e);
        object = new djf(this, (djc)object);
        this.h.execute((Runnable)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean k(djb object) {
        synchronized (this) {
            djb djb2 = djb.c;
            if (object == djb2) {
                return true;
            }
            if (!djj.o(this.g, "android.permission.ACCESS_NETWORK_STATE")) {
                object = new IllegalStateException("Attempting to determine connectivity without the ACCESS_NETWORK_STATE permission.");
                throw object;
            }
            djb2 = this.j.getActiveNetworkInfo();
            if (djb2 != null && djb2.isAvailable()) {
                this.i.e();
                if (!djb2.isConnected()) {
                    return false;
                }
                int n2 = ((Enum)object).ordinal();
                if (n2 != 0) {
                    if (n2 != 1) {
                        Log.e((String)a, (String)"Unknown connectivity type checked: ".concat(String.valueOf(((Enum)object).name())));
                        return true;
                    }
                    return djb2.getType() == 0 || djb2.getType() == 4 || djb2.getType() == 6 || djb2.getType() == 7 || djb2.getType() == 1 || djb2.getType() == 9 || djb2.getType() == 16 || (n2 = djb2.getType()) == 17;
                    {
                    }
                }
                return !this.j.isActiveNetworkMetered() || djb2.getType() == 1 || djb2.getType() == 9 || (n2 = djb2.getType()) == 17;
                {
                }
            }
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final boolean l(djc object) {
        synchronized (this) {
            File file = ((djc)object).b;
            String string = ((djc)object).c;
            Map map = this.k;
            string = djj.a(file, string);
            if (map.containsKey(string)) {
                object = "Request is already being executed for key: ".concat(string);
                Log.i((String)a, (String)object);
                return false;
            }
            this.k.put(string, object);
            this.i((djc)object);
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void m(File list, String object, dja dja2, diz diz2, File file) {
        list = djj.a(list, (String)object);
        // MONITORENTER : this
        this.k.remove(list);
        this.l.remove(list);
        boolean bl2 = this.k.isEmpty();
        object = null;
        if (bl2) {
            object = this.c();
            list = null;
        } else {
            list = this.m.containsAll(this.k.values()) ? this.c() : null;
        }
        // MONITOREXIT : this
        if (diz2 == null) {
            dja2.b(file);
        } else {
            dja2.a(file, diz2);
        }
        if (object != null) {
            djj.p((List)object, f);
            return;
        }
        if (list == null) return;
        djj.p(list, d);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n(HttpURLConnection httpURLConnection, int n2) {
        synchronized (this) {
            if (n2 != -1) {
                this.i.d(httpURLConnection, n2);
                return;
            }
            return;
        }
    }
}

