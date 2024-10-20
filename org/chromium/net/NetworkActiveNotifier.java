/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager
 *  android.net.ConnectivityManager$OnNetworkActiveListener
 */
package org.chromium.net;

import J.N;
import android.net.ConnectivityManager;

public class NetworkActiveNotifier
implements ConnectivityManager.OnNetworkActiveListener {
    private final ConnectivityManager a;
    private final long b;
    private boolean c;

    private NetworkActiveNotifier(long l2) {
        this.b = l2;
        this.a = (ConnectivityManager)jjj.c.getSystemService("connectivity");
    }

    public static NetworkActiveNotifier build(long l2) {
        return new NetworkActiveNotifier(l2);
    }

    public void disableNotifications() {
        this.c = false;
        this.a.removeDefaultNetworkActiveListener((ConnectivityManager.OnNetworkActiveListener)this);
    }

    public void enableNotifications() {
        this.c = true;
        this.a.addDefaultNetworkActiveListener((ConnectivityManager.OnNetworkActiveListener)this);
    }

    public void fakeDefaultNetworkActive() {
        if (this.c) {
            this.onNetworkActive();
        }
    }

    public boolean isDefaultNetworkActive() {
        return this.a.isDefaultNetworkActive();
    }

    public final void onNetworkActive() {
        N.MSZPA7qE(this.b);
    }
}

