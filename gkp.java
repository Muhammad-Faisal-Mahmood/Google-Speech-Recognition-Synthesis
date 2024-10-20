/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.net.NetworkInfo$DetailedState
 *  android.os.Process
 */
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;

public final class gkp
implements gkn {
    private final ConnectivityManager a;
    private final int b;

    public gkp(Context context, ConnectivityManager connectivityManager, int n2) {
        this.b = n2;
        if (context.checkPermission("android.permission.INTERNET", Process.myPid(), Process.myUid()) == 0) {
            boolean bl2 = context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0;
            fxf.B(bl2, "An app using the NETWORK_UNMETERED sync constraint must have the ACCESS_NETWORK_STATE permission.");
        }
        this.a = connectivityManager;
    }

    public gkp(Context context, ConnectivityManager connectivityManager, int n2, byte[] byArray) {
        this.b = n2;
        if (context.checkPermission("android.permission.INTERNET", Process.myPid(), Process.myUid()) == 0) {
            boolean bl2 = context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0;
            fxf.B(bl2, "An app using the NETWORK_CONNECTED sync constraint must have the ACCESS_NETWORK_STATE permission.");
        }
        this.a = connectivityManager;
    }

    @Override
    public final boolean a() {
        if (this.b != 0) {
            NetworkInfo networkInfo = this.a.getActiveNetworkInfo();
            return networkInfo != null && networkInfo.isConnected() && networkInfo.getDetailedState() != NetworkInfo.DetailedState.BLOCKED;
        }
        ConnectivityManager connectivityManager = this.a;
        boolean bl2 = connectivityManager.isActiveNetworkMetered();
        connectivityManager = connectivityManager.getActiveNetworkInfo();
        return !bl2 && connectivityManager != null && connectivityManager.isConnected() && connectivityManager.getDetailedState() != NetworkInfo.DetailedState.BLOCKED;
    }
}

