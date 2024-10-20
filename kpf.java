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
import org.chromium.net.ProxyChangeListener;

public final class kpf
extends BroadcastReceiver {
    private final ProxyChangeListener a;

    public kpf(ProxyChangeListener proxyChangeListener) {
        this.a = proxyChangeListener;
    }

    public final void onReceive(Context object, Intent intent) {
        if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
            object = this.a;
            ((ProxyChangeListener)object).c(new kot(object, intent, 3));
        }
    }
}

