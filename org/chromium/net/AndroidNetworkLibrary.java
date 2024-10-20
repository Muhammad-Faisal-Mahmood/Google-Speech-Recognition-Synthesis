/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.ConnectivityManager
 *  android.net.LinkProperties
 *  android.net.Network
 *  android.net.NetworkCapabilities
 *  android.net.NetworkInfo
 *  android.net.TrafficStats
 *  android.net.wifi.WifiInfo
 *  android.net.wifi.WifiManager
 *  android.os.Build$VERSION
 *  android.os.ParcelFileDescriptor
 *  android.os.Process
 *  android.security.NetworkSecurityPolicy
 *  android.telephony.TelephonyManager
 *  android.util.Log
 */
package org.chromium.net;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.io.IOException;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.URLConnection;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.List;
import org.chromium.net.AndroidCertVerifyResult;
import org.chromium.net.DnsStatus;

public class AndroidNetworkLibrary {
    private static Boolean a;
    private static Boolean b;

    AndroidNetworkLibrary() {
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static DnsStatus a(Network object) {
        void var2_7;
        if (a == null) {
            boolean bl2 = kmp.n(jjj.c, "android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0;
            a = bl2;
        }
        if (!a.booleanValue()) {
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager)jjj.c.getSystemService("connectivity");
        if (connectivityManager == null) return null;
        Object object2 = object;
        if (object == null) {
            Network network = connectivityManager.getActiveNetwork();
        }
        if (var2_7 == null) return null;
        try {
            connectivityManager = connectivityManager.getLinkProperties((Network)var2_7);
            if (connectivityManager == null) return null;
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
        List list = connectivityManager.getDnsServers();
        String string = connectivityManager.getDomains();
        if (Build.VERSION.SDK_INT < 28) return new DnsStatus(list, false, "", string);
        return new DnsStatus(list, fs$$ExternalSyntheticApiModelOutline0.m((LinkProperties)connectivityManager), fs$$ExternalSyntheticApiModelOutline0.m((LinkProperties)connectivityManager), string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void addTestRootCertificate(byte[] object) {
        X509Certificate x509Certificate = kpx.a(object);
        object = kpx.d;
        synchronized (object) {
            kpx.d();
            KeyStore keyStore = kpx.b;
            String string = Integer.toString(keyStore.size());
            StringBuilder stringBuilder = new StringBuilder("root_cert_");
            stringBuilder.append(string);
            keyStore.setCertificateEntry(stringBuilder.toString(), x509Certificate);
            kpx.e();
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static WifiInfo b() {
        if (AndroidNetworkLibrary.c()) {
            if (Build.VERSION.SDK_INT < 31) return ((WifiManager)jjj.c.getSystemService("wifi")).getConnectionInfo();
            ConnectivityManager connectivityManager = (ConnectivityManager)jjj.c.getSystemService("connectivity");
            Network[] networkArray = connectivityManager.getAllNetworks();
            int n2 = networkArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(networkArray[i2]);
                if (networkCapabilities == null || !networkCapabilities.hasTransport(1) || (networkCapabilities = dp$$ExternalSyntheticApiModelOutline0.m(networkCapabilities)) == null || !(networkCapabilities instanceof WifiInfo)) continue;
                return (WifiInfo)networkCapabilities;
            }
            return null;
        } else {
            Intent intent = jjj.ae(jjj.c, null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            if (intent == null) return null;
            return (WifiInfo)intent.getParcelableExtra("wifiInfo");
        }
    }

    private static boolean c() {
        if (b == null) {
            boolean bl2 = kmp.n(jjj.c, "android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0;
            b = bl2;
        }
        return b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void clearTestRootCertificates() {
        Object object = kpx.d;
        synchronized (object) {
            kpx.d();
            try {
                kpx.b.load(null);
                kpx.e();
            }
            catch (IOException iOException) {}
            return;
        }
    }

    public static DnsStatus getCurrentDnsStatus() {
        return AndroidNetworkLibrary.a(null);
    }

    public static DnsStatus getDnsStatusForNetwork(long l2) {
        try {
            DnsStatus dnsStatus = AndroidNetworkLibrary.a(fs$$ExternalSyntheticApiModelOutline0.m(l2));
            return dnsStatus;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    private static boolean getIsCaptivePortal() {
        ConnectivityManager connectivityManager = (ConnectivityManager)jjj.c.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        Network network = connectivityManager.getActiveNetwork();
        if (network == null) {
            return false;
        }
        return (network = connectivityManager.getNetworkCapabilities(network)) != null && network.hasCapability(17);
    }

    private static boolean getIsRoaming() {
        NetworkInfo networkInfo = ((ConnectivityManager)jjj.c.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkInfo == null) {
            return false;
        }
        return networkInfo.isRoaming();
    }

    public static String getMimeTypeFromExtension(String string) {
        return URLConnection.guessContentTypeFromName("foo.".concat(String.valueOf(string)));
    }

    private static String getNetworkOperator() {
        TelephonyManager telephonyManager = (TelephonyManager)jjj.c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getNetworkOperator();
    }

    public static byte[][] getUserAddedRoots() {
        return kpx.f();
    }

    public static String getWifiSSID() {
        Object object = AndroidNetworkLibrary.b();
        if (object != null && (object = object.getSSID()) != null && !((String)object).equals("<unknown ssid>")) {
            return object;
        }
        return "";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int getWifiSignalLevel(int n2) {
        block4: {
            int n3;
            block6: {
                Context context;
                block5: {
                    context = jjj.c;
                    if (context == null || context.getContentResolver() == null) break block4;
                    if (!AndroidNetworkLibrary.c()) break block5;
                    context = AndroidNetworkLibrary.b();
                    if (context == null) break block4;
                    n3 = context.getRssi();
                    break block6;
                }
                try {
                    context = jjj.c;
                    IntentFilter intentFilter = new IntentFilter("android.net.wifi.RSSI_CHANGED");
                    context = jjj.ae(context, null, intentFilter);
                    if (context == null) break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    return -1;
                }
                n3 = context.getIntExtra("newRssi", Integer.MIN_VALUE);
            }
            if (n3 != Integer.MIN_VALUE && (n3 = WifiManager.calculateSignalLevel((int)n3, (int)n2)) >= 0 && n3 < n2) {
                return n3;
            }
        }
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean haveOnlyLoopbackAddresses() {
        Enumeration<NetworkInterface> enumeration;
        boolean bl2 = false;
        try {
            enumeration = NetworkInterface.getNetworkInterfaces();
            if (enumeration == null) return bl2;
        }
        catch (Exception exception) {
            ((Object)exception).toString();
            Log.w((String)"AndroidNetworkLibrary", (String)"could not get network interfaces: ".concat(((Object)exception).toString()));
            return false;
        }
        while (enumeration.hasMoreElements()) {
            NetworkInterface networkInterface = enumeration.nextElement();
            try {
                if (!networkInterface.isUp() || (bl2 = networkInterface.isLoopback())) continue;
                return false;
            }
            catch (SocketException socketException) {
            }
        }
        return true;
    }

    private static boolean isCleartextPermitted(String string) {
        try {
            boolean bl2 = ag$$ExternalSyntheticApiModelOutline1.m(NetworkSecurityPolicy.getInstance(), string);
            return bl2;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
    }

    private static boolean reportBadDefaultNetwork() {
        ConnectivityManager connectivityManager = (ConnectivityManager)jjj.c.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        connectivityManager.reportNetworkConnectivity(null, false);
        return true;
    }

    private static void tagSocket(int n2, int n3, int n4) {
        int n5 = TrafficStats.getThreadStatsTag();
        if (n4 != n5) {
            TrafficStats.setThreadStatsTag((int)n4);
        }
        if (n3 != -1) {
            kpp.b(n3);
        }
        ParcelFileDescriptor parcelFileDescriptor = ParcelFileDescriptor.adoptFd((int)n2);
        knw knw2 = new knw(parcelFileDescriptor.getFileDescriptor());
        TrafficStats.tagSocket((Socket)knw2);
        knw2.close();
        if (parcelFileDescriptor != null) {
            parcelFileDescriptor.detachFd();
        }
        if (n4 != n5) {
            TrafficStats.setThreadStatsTag((int)n5);
        }
        if (n3 != -1) {
            kpp.a();
        }
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] object, String string, String string2) {
        try {
            object = kpx.b(object, string, string2);
            return object;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return new AndroidCertVerifyResult(-1);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return new AndroidCertVerifyResult(-1);
        }
        catch (KeyStoreException keyStoreException) {
            return new AndroidCertVerifyResult(-1);
        }
    }
}

