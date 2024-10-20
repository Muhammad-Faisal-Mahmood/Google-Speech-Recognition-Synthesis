/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.chromium.net.ProxyChangeListener;

public class ProxyChangeListener$ProxyReceiver
extends BroadcastReceiver {
    public final ProxyChangeListener a;

    public ProxyChangeListener$ProxyReceiver(ProxyChangeListener proxyChangeListener) {
        this.a = proxyChangeListener;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
            this.a.c(new kph(this, intent));
        }
    }
}

