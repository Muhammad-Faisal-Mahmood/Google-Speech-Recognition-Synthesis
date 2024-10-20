/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.IntentFilter
 */
package org.chromium.net;

import android.content.IntentFilter;

public class NetworkChangeNotifierAutoDetect$NetworkConnectivityIntentFilter
extends IntentFilter {
    public NetworkChangeNotifierAutoDetect$NetworkConnectivityIntentFilter() {
        this.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    }
}

