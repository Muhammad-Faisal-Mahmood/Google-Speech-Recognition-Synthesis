/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Service
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.IBinder
 */
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;

public class gau
extends Service {
    public bmu a;

    public final bmu a() {
        bmu bmu2 = this.a;
        if (bmu2 != null) {
            return bmu2;
        }
        jse.h("registry");
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final void dump(FileDescriptor object, PrintWriter printWriter, String[] object2) {
        jse.e(printWriter, "writer");
        object2 = this.a().S(((Object)((Object)this)).getClass());
        object = ((gbj)object2).b;
        synchronized (object) {
            object2 = ((gbj)object2).c.entrySet().iterator();
            while (object2.hasNext()) {
                printWriter.println(((Map.Entry)object2.next()).toString());
            }
            return;
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        jse.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
    }

    public final void onCreate() {
        super.onCreate();
        ((gat)fvd.l((Context)this, gat.class)).z(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int onStartCommand(Intent object, int n2, int n3) {
        gbj gbj2 = this.a().S(((Object)((Object)this)).getClass());
        Object object2 = gbj2.b;
        synchronized (object2) {
            if (object == null) {
                if (gbj2.f != gbi.a) return 2;
                this.stopSelf(n3);
                return 2;
            }
            gbj2.g = this;
            gbj2.h = n3;
            gbj2.f = gbi.c;
            if (gbj2.c.isEmpty()) {
                gbj2.a(this, (Notification)object.getParcelableExtra("fallback_notification"));
                gbj2.b();
            } else {
                gbg gbg2 = gbj2.i;
                fxf.B(gbj2.c.isEmpty() ^ true, "Can't select a best notification if thare are none");
                Iterator iterator = gbj2.c.values().iterator();
                object = null;
                while (iterator.hasNext()) {
                    gbg gbg3 = (gbg)iterator.next();
                    if (object != null) {
                        n2 = gbg3.b;
                        if (gbg2 != gbg3) continue;
                        n2 = gbg2.b;
                    }
                    object = gbg3;
                }
                gbj2.i = object;
                object = gbj2.i.a;
                gbj2.a(this, null);
            }
            return 2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onTimeout(int n2) {
        gbj gbj2 = this.a().S(((Object)((Object)this)).getClass());
        Object object = gbj2.b;
        synchronized (object) {
            if (gbj2.f.ordinal() == 2) {
                gbj2.b();
                Object object2 = new gbh();
                Object object3 = gbj2.d.n();
                Object object4 = new hat();
                object3 = object3.iterator();
                while (object3.hasNext()) {
                    ((hat)object4).j(((gqn)object3.next()).a);
                }
                object3 = ((hat)object4).g();
                object4 = new gqq((Throwable)object2, new StackTraceElement[0]);
                object2 = new gzy();
                Iterator iterator = object3.iterator();
                while (iterator.hasNext()) {
                    object3 = (gpc)iterator.next();
                    gqq gqq2 = new gqq(null, gqq.l((gpc)object3, null));
                    ((Throwable)object4).addSuppressed(gqq2);
                    ((gzy)object2).d(object3, gqq2);
                }
                object2 = ((gzy)object2).b();
                gqq.h((hac)object2);
                gqq.f((hac)object2);
                a.as(gbj.a.g(), "Timeout elapsed", "com/google/apps/tiktok/concurrent/ForegroundServiceTracker", "onTimeout", '\u01b5', "ForegroundServiceTracker.java", (Throwable)object4);
                gbj2.e.clear();
                gbj2.d.k();
            }
            return;
        }
    }
}

