/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager$NetworkCallback
 *  android.net.LinkProperties
 *  android.net.Network
 *  android.net.NetworkCapabilities
 */
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;

final class kou
extends ConnectivityManager.NetworkCallback {
    LinkProperties a;
    NetworkCapabilities b;
    final kpb c;

    public kou(kpb kpb2) {
        this.c = kpb2;
    }

    private final koz a(Network network) {
        int n2;
        String string;
        int n3;
        boolean bl2;
        block3: {
            block5: {
                block1: {
                    block7: {
                        block6: {
                            block4: {
                                block2: {
                                    bl2 = this.b.hasTransport(1);
                                    n3 = -1;
                                    if (bl2 || this.b.hasTransport(5)) break block1;
                                    if (!this.b.hasTransport(0)) break block2;
                                    string = this.c.m.am(network);
                                    if (string != null) {
                                        n3 = string.getSubtype();
                                    }
                                    n2 = n3;
                                    n3 = 0;
                                    break block3;
                                }
                                if (!this.b.hasTransport(3)) break block4;
                                n3 = 9;
                                break block5;
                            }
                            if (!this.b.hasTransport(2)) break block6;
                            n3 = 7;
                            break block5;
                        }
                        if (!this.b.hasTransport(4)) break block7;
                        string = this.c.m.al(network);
                        n3 = string != null ? string.getType() : 17;
                        break block5;
                    }
                    n3 = -1;
                    n2 = -1;
                    break block3;
                }
                n3 = 1;
            }
            n2 = -1;
        }
        bl2 = this.b.hasCapability(11);
        string = kpb.a;
        return new koz(true, n3, n2, bl2 ^ true, String.valueOf(network.getNetworkHandle()), fs$$ExternalSyntheticApiModelOutline0.m(this.a), fs$$ExternalSyntheticApiModelOutline0.m(this.a));
    }

    public final void onAvailable(Network network) {
        this.a = null;
        this.b = null;
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities object) {
        this.b = object;
        object = this.c;
        if (((kpb)((Object)object)).h && this.a != null && this.b != null) {
            ((kpb)((Object)object)).d(this.a(network));
        }
    }

    public final void onLinkPropertiesChanged(Network network, LinkProperties object) {
        this.a = object;
        object = this.c;
        if (((kpb)((Object)object)).h && this.a != null && this.b != null) {
            ((kpb)((Object)object)).d(this.a(network));
        }
    }

    public final void onLost(Network object) {
        this.a = null;
        this.b = null;
        object = this.c;
        if (((kpb)((Object)object)).h) {
            ((kpb)((Object)object)).d(new koz(false, -1, -1, false, null, false, ""));
        }
    }
}

