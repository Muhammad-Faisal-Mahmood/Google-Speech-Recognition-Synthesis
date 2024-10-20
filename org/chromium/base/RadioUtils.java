/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager
 *  android.net.Network
 *  android.os.Build$VERSION
 *  android.os.Process
 *  android.telephony.TelephonyManager
 */
package org.chromium.base;

import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import android.os.Process;
import android.telephony.TelephonyManager;
import org.chromium.base.TraceEvent;

public class RadioUtils {
    private static Boolean a;
    private static Boolean b;

    private RadioUtils() {
    }

    private static int getCellDataActivity() {
        TraceEvent traceEvent = TraceEvent.a("RadioUtils::getCellDataActivity");
        try {
            int n2;
            TelephonyManager telephonyManager = (TelephonyManager)jjj.c.getSystemService("phone");
            try {
                n2 = telephonyManager.getDataActivity();
            }
            catch (SecurityException securityException) {
                n2 = -1;
            }
            return n2;
        }
        finally {
            if (traceEvent != null) {
                traceEvent.close();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static int getCellSignalLevel() {
        TraceEvent traceEvent = TraceEvent.a("RadioUtils::getCellSignalLevel");
        try {
            int n2;
            TelephonyManager telephonyManager = (TelephonyManager)jjj.c.getSystemService("phone");
            int n3 = -1;
            try {
                telephonyManager = fs$$ExternalSyntheticApiModelOutline0.m(telephonyManager);
                n2 = n3;
                if (telephonyManager == null) return n2;
                n2 = telephonyManager.getLevel();
                return n2;
            }
            catch (SecurityException securityException) {
                n2 = n3;
                return n2;
            }
        }
        finally {
            if (traceEvent != null) {
                traceEvent.close();
            }
        }
    }

    private static boolean isSupported() {
        if (Build.VERSION.SDK_INT >= 28) {
            boolean bl2;
            if (a == null) {
                bl2 = kmp.n(jjj.c, "android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0;
                a = bl2;
            }
            if (a.booleanValue()) {
                if (b == null) {
                    bl2 = kmp.n(jjj.c, "android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0;
                    b = bl2;
                }
                if (b.booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isWifiConnected() {
        boolean bl2;
        ConnectivityManager connectivityManager;
        TraceEvent traceEvent;
        block9: {
            Network network;
            block8: {
                traceEvent = TraceEvent.a("RadioUtils::isWifiConnected");
                connectivityManager = (ConnectivityManager)jjj.c.getSystemService("connectivity");
                network = connectivityManager.getActiveNetwork();
                bl2 = false;
                if (network != null) break block8;
            }
            connectivityManager = connectivityManager.getNetworkCapabilities(network);
            if (connectivityManager != null) break block9;
        }
        bl2 = connectivityManager.hasTransport(1);
        return bl2;
        finally {
            if (traceEvent != null) {
                traceEvent.close();
            }
        }
    }
}

