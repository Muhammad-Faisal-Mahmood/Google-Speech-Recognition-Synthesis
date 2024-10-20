/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public abstract class bfq
extends bfs {
    private final BroadcastReceiver e;

    public bfq(Context context, czh czh2) {
        jse.e(context, "context");
        super(context, czh2);
        this.e = new bfp(this);
    }

    public abstract IntentFilter a();

    public abstract void c(Intent var1);

    @Override
    public final void d() {
        bbi.a();
        int n2 = bfr.a;
        this.getClass().getSimpleName();
        this.a.registerReceiver(this.e, this.a());
    }

    @Override
    public final void e() {
        bbi.a();
        int n2 = bfr.a;
        this.getClass().getSimpleName();
        this.a.unregisterReceiver(this.e);
    }
}

