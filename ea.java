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

final class ea
extends BroadcastReceiver {
    final eb a;

    public ea(eb eb2) {
        this.a = eb2;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.b();
    }
}

