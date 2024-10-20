/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;

public class DiagnosticsReceiver
extends BroadcastReceiver {
    private static final String a = bbi.b("DiagnosticsRcvr");

    public final void onReceive(Context object, Intent object2) {
        if (object2 == null) {
            return;
        }
        bbi.a();
        try {
            object = bbx.d((Context)object);
            object2 = new bbl(DiagnosticsWorker.class);
            ((bbx)object).f(((bby)object2).e());
            return;
        }
        catch (IllegalStateException illegalStateException) {
            bbi.a().d(a, "WorkManager is not initialized", illegalStateException);
            return;
        }
    }
}

