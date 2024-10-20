/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.IntentFilter
 */
import android.content.BroadcastReceiver;
import android.content.IntentFilter;

abstract class eb {
    private BroadcastReceiver a;
    final eg c;

    public eb(eg eg2) {
        this.c = eg2;
    }

    public abstract IntentFilter a();

    public abstract void b();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void c() {
        BroadcastReceiver broadcastReceiver = this.a;
        if (broadcastReceiver != null) {
            try {
                this.c.k.unregisterReceiver(broadcastReceiver);
            }
            catch (IllegalArgumentException illegalArgumentException) {}
            this.a = null;
        }
    }

    final void d() {
        this.c();
        IntentFilter intentFilter = this.a();
        if (intentFilter.countActions() == 0) {
            return;
        }
        if (this.a == null) {
            this.a = new ea(this);
        }
        eg eg2 = this.c;
        BroadcastReceiver broadcastReceiver = this.a;
        eg2.k.registerReceiver(broadcastReceiver, intentFilter);
    }
}

