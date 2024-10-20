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

public final class bfp
extends BroadcastReceiver {
    final bfq a;

    public bfp(bfq bfq2) {
        this.a = bfq2;
    }

    public final void onReceive(Context context, Intent intent) {
        jse.e(context, "context");
        jse.e(intent, "intent");
        this.a.c(intent);
    }
}

