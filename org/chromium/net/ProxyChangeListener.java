/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.ProxyInfo
 *  android.os.Handler
 *  android.os.Looper
 */
package org.chromium.net;

import J.N;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ProxyInfo;
import android.os.Handler;
import android.os.Looper;
import org.chromium.base.TraceEvent;
import org.chromium.net.ProxyChangeListener$ProxyReceiver;

public class ProxyChangeListener {
    private final Looper a;
    private final Handler b;
    private long c;
    private ProxyChangeListener$ProxyReceiver d;
    private BroadcastReceiver e;

    private ProxyChangeListener() {
        Looper looper;
        this.a = looper = Looper.myLooper();
        this.b = new Handler(looper);
    }

    public static kpg a(Intent intent) {
        if ((intent = intent.getExtras()) == null) {
            return null;
        }
        return kpg.a((ProxyInfo)intent.get("android.intent.extra.PROXY_INFO"));
    }

    public static ProxyChangeListener create() {
        return new ProxyChangeListener();
    }

    public static String getProperty(String string) {
        return System.getProperty(string);
    }

    public final void b(kpg kpg2) {
        long l2 = this.c;
        if (l2 == 0L) {
            return;
        }
        if (kpg2 != null) {
            String[] stringArray = kpg2.e;
            String string = kpg2.d;
            int n2 = kpg2.c;
            N.MyoFZt$2(l2, this, kpg2.b, n2, string, stringArray);
            return;
        }
        N.MCIk73GZ(l2, this);
    }

    public final void c(Runnable runnable) {
        if (this.a == Looper.myLooper()) {
            runnable.run();
            return;
        }
        this.b.post(runnable);
    }

    public void start(long l2) {
        TraceEvent traceEvent = TraceEvent.a("ProxyChangeListener.start");
        try {
            this.c = l2;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PROXY_CHANGE");
            BroadcastReceiver broadcastReceiver = new ProxyChangeListener$ProxyReceiver(this);
            this.d = broadcastReceiver;
            if (!jjj.af()) {
                Context context = jjj.c;
                broadcastReceiver = this.d;
                IntentFilter intentFilter2 = new IntentFilter();
                jjj.ag(context, broadcastReceiver, intentFilter2, 4);
            }
            this.e = broadcastReceiver = new kpf(this);
            jjj.ae(jjj.c, this.e, intentFilter);
            return;
        }
        finally {
            if (traceEvent != null) {
                traceEvent.close();
            }
        }
    }

    public void stop() {
        this.c = 0L;
        jjj.c.unregisterReceiver((BroadcastReceiver)this.d);
        BroadcastReceiver broadcastReceiver = this.e;
        if (broadcastReceiver != null) {
            jjj.c.unregisterReceiver(broadcastReceiver);
        }
        this.d = null;
        this.e = null;
    }
}

