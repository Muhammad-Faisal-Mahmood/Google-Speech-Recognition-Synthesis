/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager$NetworkCallback
 *  android.net.LinkProperties
 *  android.net.Network
 */
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;

final class kov
extends ConnectivityManager.NetworkCallback {
    final kpb a;

    public kov(kpb kpb2) {
        this.a = kpb2;
    }

    public final void onAvailable(Network object) {
        object = this.a;
        if (((kpb)((Object)object)).h) {
            ((kpb)((Object)object)).c();
        }
    }

    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.onAvailable(null);
    }

    public final void onLost(Network network) {
        this.onAvailable(null);
    }
}

