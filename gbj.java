/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Service
 *  android.os.Build$VERSION
 */
import android.app.Notification;
import android.app.Service;
import android.os.Build;
import java.util.IdentityHashMap;
import java.util.Iterator;

public final class gbj {
    public static final hei a = hei.m("com/google/apps/tiktok/concurrent/ForegroundServiceTracker");
    public final Object b = new Object();
    public final IdentityHashMap c = new IdentityHashMap(10);
    public final gzi d = new gzi();
    public final hch e = new gzj();
    public gbi f;
    public Service g;
    public int h;
    public gbg i;
    private final gbe j;

    public gbj(hpr hpr2, gbe gbe2, Class clazz) {
        new hpz(hpr2);
        this.j = gbe2;
        fxf.K(clazz);
        this.f = gbi.a;
    }

    public final void a(Service service, Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            int n2;
            boolean bl2 = this.e.isEmpty();
            int n3 = 0;
            if (bl2) {
                gbe gbe2 = this.j;
                int n4 = Build.VERSION.SDK_INT;
                n2 = gbe2.c.g() ? ((gbd)gbe2.c.c()).a() : gbe2.b.getApplicationInfo().targetSdkVersion;
                boolean bl3 = true;
                if (n2 >= 34) {
                    bl2 = true;
                } else {
                    ((heg)gbe.a.f().j("com/google/apps/tiktok/concurrent/DefaultForegroundServiceType", "isTargetSdkAtLeastU", 61, "DefaultForegroundServiceType.kt")).v("targetSdk (%d) >= VERSION_CODES.UPSIDE_DOWN_CAKE (%d) == false", n2, 34);
                    bl2 = false;
                }
                if (n4 < 34) {
                    bl3 = false;
                }
                if (!bl3 || !bl2) {
                    ((heg)gbe.a.f().j("com/google/apps/tiktok/concurrent/DefaultForegroundServiceType", "get", 33, "DefaultForegroundServiceType.kt")).F("BuildCompat.isAtLeastU()=%b, isTargetSdkAtLeastU()=%b", bl3, bl2);
                }
                n2 = bl3 && bl2 ? 2048 : 0;
            } else {
                Iterator iterator = this.e.i().iterator();
                n2 = 0;
                while (iterator.hasNext()) {
                    n2 |= ((Integer)iterator.next()).intValue();
                }
            }
            if (n2 == 0) {
                ((heg)((heg)a.f()).j("com/google/apps/tiktok/concurrent/ForegroundServiceTracker", "startShortService", 370, "ForegroundServiceTracker.java")).r("starting foregroundService with type=none");
                n2 = n3;
            }
            dp$$ExternalSyntheticApiModelOutline0.m(service, 174344743, notification, n2);
            return;
        }
        service.startForeground(174344743, notification);
    }

    public final void b() {
        gbi gbi2 = this.f;
        boolean bl2 = gbi2 == gbi.c;
        fxf.E(bl2, "Destroyed in wrong state %s", (Object)gbi2);
        this.f = gbi.a;
        this.g.stopForeground(true);
        this.i = null;
        this.g.stopSelf(this.h);
        this.g = null;
    }
}

