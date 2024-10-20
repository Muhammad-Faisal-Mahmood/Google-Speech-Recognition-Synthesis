/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager$NetworkCallback
 *  android.net.Network
 *  android.net.NetworkCapabilities
 *  android.os.Build$VERSION
 */
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.Objects;

public final class bfu
extends ConnectivityManager.NetworkCallback {
    final bfv a;

    public bfu(bfv bfv2) {
        this.a = bfv2;
    }

    public final void onCapabilitiesChanged(Network object, NetworkCapabilities networkCapabilities) {
        jse.e(object, "network");
        jse.e(networkCapabilities, "capabilities");
        bbi.a();
        object = bfw.a;
        Objects.toString(networkCapabilities);
        if (Build.VERSION.SDK_INT >= 28) {
            jse.e(networkCapabilities, "<this>");
            object = new bev(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), networkCapabilities.hasCapability(11) ^ true, networkCapabilities.hasCapability(18));
        } else {
            object = bfw.a(this.a.e);
        }
        this.a.f(object);
    }

    public final void onLost(Network object) {
        jse.e(object, "network");
        bbi.a();
        object = bfw.a;
        object = this.a;
        ((bfs)object).f(bfw.a(((bfv)object).e));
    }
}

