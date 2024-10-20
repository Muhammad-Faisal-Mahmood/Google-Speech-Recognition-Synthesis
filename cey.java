/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ServiceConnection
 *  android.os.IBinder
 */
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class cey
implements ServiceConnection {
    final cfc a;
    private final int b;

    public cey(cfc cfc2, int n2) {
        this.a = cfc2;
        this.b = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void onServiceConnected(ComponentName object, IBinder object2) {
        if (object2 == null) {
            object2 = this.a;
            object = object2.d;
            // MONITORENTER : object
            int n2 = object2.h;
            // MONITOREXIT : object
            if (n2 == 3) {
                object2.l = true;
                n2 = 5;
            } else {
                n2 = 4;
            }
            object = object2.c;
            object.sendMessage(object.obtainMessage(n2, object2.n.get(), 16));
            return;
        }
        Object object3 = this.a.e;
        // MONITORENTER : object3
        cfc cfc2 = this.a;
        object = object2.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        object = object != null && object instanceof cfx ? (cfx)object : new cfx((IBinder)object2);
        cfc2.o = object;
        // MONITOREXIT : object3
        this.a.w(0, null, this.b);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceDisconnected(ComponentName object) {
        object = this.a.e;
        synchronized (object) {
            this.a.o = null;
        }
        object = this.a;
        int n2 = this.b;
        object = object.c;
        object.sendMessage(object.obtainMessage(6, n2, 1));
    }
}

