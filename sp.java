/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.NotificationManager
 *  android.content.Context
 */
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;

public final class sp {
    public static final Object a = new Object();
    public static String b;
    public static Set c;
    private static final Object e;
    private static so f;
    public final NotificationManager d;
    private final Context g;

    static {
        c = new HashSet();
        e = new Object();
    }

    public sp(Context context) {
        this.g = context;
        this.d = (NotificationManager)context.getSystemService("notification");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(int n2, Notification object) {
        Object object2 = object.extras;
        if (object2 != null && object2.getBoolean("android.support.useSideChannel")) {
            object2 = new sm(this.g.getPackageName(), n2, (Notification)object);
            object = e;
            synchronized (object) {
                if (f == null) {
                    so so2;
                    f = so2 = new so(this.g.getApplicationContext());
                }
                sp.f.a.obtainMessage(0, object2).sendToTarget();
            }
            this.d.cancel(null, n2);
            return;
        }
        this.d.notify(null, n2, object);
    }
}

