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

public final class bjy
extends BroadcastReceiver {
    private final Thread a;

    public bjy(Thread thread) {
        this.a = thread;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_UNLOCKED".equals(intent.getAction())) {
            this.a.start();
        }
    }
}

