/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class ceb
extends BroadcastReceiver {
    public Context a;
    private final eky b;

    public ceb(eky eky2) {
        this.b = eky2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        synchronized (this) {
            Context context = this.a;
            if (context != null) {
                context.unregisterReceiver((BroadcastReceiver)this);
            }
            this.a = null;
            return;
        }
    }

    public final void onReceive(Context object, Intent intent) {
        object = intent.getData();
        object = object != null ? object.getSchemeSpecificPart() : null;
        if ("com.google.android.gms".equals(object)) {
            this.b.a();
            this.a();
        }
    }
}

