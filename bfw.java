/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager
 *  android.net.Network
 *  android.net.NetworkInfo
 */
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;

public final class bfw {
    public static final String a = bbi.b("NetworkStateTracker");

    public static final bev a(ConnectivityManager connectivityManager) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        NetworkInfo networkInfo;
        block5: {
            block4: {
                jse.e(connectivityManager, "<this>");
                networkInfo = connectivityManager.getActiveNetworkInfo();
                bl4 = true;
                bl3 = networkInfo != null && networkInfo.isConnected();
                jse.e(connectivityManager, "<this>");
                jse.e(connectivityManager, "<this>");
                Network network = connectivityManager.getActiveNetwork();
                jse.e(connectivityManager, "<this>");
                network = connectivityManager.getNetworkCapabilities(network);
                if (network == null) break block4;
                try {
                    bl2 = network.hasCapability(16);
                    break block5;
                }
                catch (SecurityException securityException) {
                    bbi.a().d(a, "Unable to validate active network", securityException);
                }
            }
            bl2 = false;
        }
        boolean bl5 = connectivityManager.isActiveNetworkMetered();
        if (networkInfo == null || networkInfo.isRoaming()) {
            bl4 = false;
        }
        return new bev(bl3, bl2, bl5, bl4);
    }
}

