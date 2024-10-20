/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager$NetworkCallback
 *  android.net.Network
 *  android.net.NetworkCapabilities
 */
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

public final class bet
extends ConnectivityManager.NetworkCallback {
    final jwi a;
    final jyh b;

    public bet(jwi jwi2, jyh jyh2) {
        this.a = jwi2;
        this.b = jyh2;
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        jse.e(network, "network");
        jse.e(networkCapabilities, "networkCapabilities");
        jvf.j(this.a);
        bbi.a();
        long l2 = bfa.a;
        this.b.g(beq.a);
    }

    public final void onLost(Network object) {
        jse.e(object, "network");
        jvf.j(this.a);
        bbi.a();
        long l2 = bfa.a;
        object = new ber(7);
        this.b.g(object);
    }
}

