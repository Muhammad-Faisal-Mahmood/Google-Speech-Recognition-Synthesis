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
import org.chromium.base.TraceEvent;

public final class koy
extends ConnectivityManager.NetworkCallback {
    public Network a;
    public final kpb b;

    public koy(kpb kpb2) {
        this.b = kpb2;
    }

    private final boolean a(Network network, NetworkCapabilities networkCapabilities) {
        return this.b(network) || networkCapabilities == null || networkCapabilities.hasTransport(4) && !bzo.ap(network);
        {
        }
    }

    private final boolean b(Network network) {
        Network network2 = this.a;
        return network2 != null && !network2.equals((Object)network);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onAvailable(Network object) {
        TraceEvent traceEvent = TraceEvent.a("NetworkChangeNotifierCallback::onAvailable");
        try {
            Network network;
            NetworkCapabilities networkCapabilities = this.b.m.ak((Network)object);
            if (this.a((Network)object, networkCapabilities)) {
                return;
            }
            boolean bl2 = networkCapabilities.hasTransport(4) && ((network = this.a) == null || !object.equals((Object)network));
            if (bl2) {
                this.a = object;
            }
            long l2 = object.getNetworkHandle();
            int n2 = this.b.m.ai((Network)object);
            object = this.b;
            kow kow2 = new kow(this, l2, n2, bl2);
            ((kpb)((Object)object)).e(kow2);
            return;
        }
        finally {
            if (traceEvent != null) {
                traceEvent.close();
            }
        }
    }

    public final void onCapabilitiesChanged(Network object, NetworkCapabilities object2) {
        TraceEvent traceEvent = TraceEvent.a("NetworkChangeNotifierCallback::onCapabilitiesChanged");
        try {
            if (!this.a((Network)object, (NetworkCapabilities)object2)) {
                object2 = kpb.a;
                long l2 = object.getNetworkHandle();
                int n2 = this.b.m.ai((Network)object);
                object = this.b;
                object2 = new kox(this, l2, n2, 0);
                ((kpb)((Object)object)).e((Runnable)object2);
            }
            return;
        }
        finally {
            if (traceEvent != null) {
                traceEvent.close();
            }
        }
    }

    public final void onLosing(Network object, int n2) {
        TraceEvent traceEvent = TraceEvent.a("NetworkChangeNotifierCallback::onLosing");
        try {
            if (!this.a((Network)object, this.b.m.ak((Network)object))) {
                long l2 = object.getNetworkHandle();
                object = this.b;
                knf knf2 = new knf((Object)this, l2, 2);
                ((kpb)((Object)object)).e(knf2);
            }
            return;
        }
        finally {
            if (traceEvent != null) {
                traceEvent.close();
            }
        }
    }

    public final void onLost(Network object) {
        block10: {
            int n2;
            TraceEvent traceEvent = TraceEvent.a("NetworkChangeNotifierCallback::onLost");
            if (this.b((Network)object)) {
                break block10;
            }
            kpb kpb2 = this.b;
            kot kot2 = new kot((Object)this, object, 2, null);
            kpb2.e(kot2);
            if (this.a == null) break block10;
            this.a = null;
            object = kpb.h(this.b.m, (Network)object);
            int n3 = ((Network[])object).length;
            for (n2 = 0; n2 < n3; ++n2) {
                this.onAvailable(object[n2]);
                continue;
            }
            try {
                this.b.g();
                n2 = this.b.b().c();
                kpb2 = this.b;
                object = new cdw((Object)this, n2, 13, null);
                kpb2.e((Runnable)object);
            }
            catch (Throwable throwable) {
                throw throwable;
            }
            finally {
                if (traceEvent != null) {
                    traceEvent.close();
                }
            }
        }
        return;
    }
}

