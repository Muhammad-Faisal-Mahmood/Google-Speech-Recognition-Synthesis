/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.BroadcastReceiver$PendingResult
 *  android.content.Context
 *  android.content.Intent
 */
package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ConstraintProxyUpdateReceiver
extends BroadcastReceiver {
    public static final int a = 0;

    static {
        bbi.b("ConstrntProxyUpdtRecvr");
    }

    public final void onReceive(Context context, Intent intent) {
        String string = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(string)) {
            bbi.a();
            return;
        }
        string = this.goAsync();
        bdn.i((Context)context).k.a(new ai(intent, context, (BroadcastReceiver.PendingResult)string, 8));
    }
}

