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
import java.util.Objects;

public class RescheduleReceiver
extends BroadcastReceiver {
    private static final String a = bbi.b("RescheduleReceiver");

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onReceive(Context object, Intent intent) {
        bdn bdn2;
        bbi.a();
        Objects.toString(intent);
        try {
            bdn2 = bdn.i(object);
            intent = this.goAsync();
            object = bdn.a;
            synchronized (object) {
            }
        }
        catch (IllegalStateException illegalStateException) {
            bbi.a().d(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", illegalStateException);
            return;
        }
        {
            BroadcastReceiver.PendingResult pendingResult = bdn2.h;
            if (pendingResult != null) {
                pendingResult.finish();
            }
            bdn2.h = intent;
            if (bdn2.g) {
                bdn2.h.finish();
                bdn2.h = null;
            }
            return;
        }
    }
}

