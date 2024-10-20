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
import java.util.concurrent.atomic.AtomicBoolean;

public final class crs
extends BroadcastReceiver {
    final AtomicBoolean a;
    final Context b;
    final Runnable c;
    final po d;

    public crs(AtomicBoolean atomicBoolean, Context context, Runnable runnable, po po2) {
        this.a = atomicBoolean;
        this.b = context;
        this.c = runnable;
        this.d = po2;
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.a.compareAndSet(false, true)) {
            this.b.unregisterReceiver((BroadcastReceiver)this);
            this.c.run();
            this.d.c(null);
        }
    }
}

