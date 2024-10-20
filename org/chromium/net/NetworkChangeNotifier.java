/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Network
 *  android.os.Trace
 */
package org.chromium.net;

import J.N;
import android.net.Network;
import android.os.Trace;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.ArrayList;

public class NetworkChangeNotifier {
    public static NetworkChangeNotifier a;
    private final ArrayList b = new ArrayList();
    private final knb c = new knb();
    private kpb d;
    private int e = 0;
    private int f = 0;

    protected NetworkChangeNotifier() {
    }

    public static void fakeConnectionCostChanged(int n2) {
        NetworkChangeNotifier.setAutoDetectConnectivityState(false);
        a.a(n2);
    }

    public static void fakeConnectionSubtypeChanged(int n2) {
        NetworkChangeNotifier.setAutoDetectConnectivityState(false);
        a.b(n2);
    }

    public static void fakeDefaultNetwork(long l2, int n2) {
        NetworkChangeNotifier.setAutoDetectConnectivityState(false);
        a.i(n2, l2);
    }

    public static void fakeNetworkConnected(long l2, int n2) {
        NetworkChangeNotifier.setAutoDetectConnectivityState(false);
        a.c(l2, n2);
    }

    public static void fakeNetworkDisconnected(long l2) {
        NetworkChangeNotifier.setAutoDetectConnectivityState(false);
        a.d(l2);
    }

    public static void fakeNetworkSoonToBeDisconnected(long l2) {
        NetworkChangeNotifier.setAutoDetectConnectivityState(false);
        a.e(l2);
    }

    public static void fakePurgeActiveNetworkList(long[] lArray) {
        NetworkChangeNotifier.setAutoDetectConnectivityState(false);
        a.f(lArray);
    }

    public static void forceConnectivityState(boolean bl2) {
        int n2 = 0;
        NetworkChangeNotifier.setAutoDetectConnectivityState(false);
        NetworkChangeNotifier networkChangeNotifier = a;
        boolean bl3 = networkChangeNotifier.e != 6;
        if (bl3 != bl2) {
            if (!bl2) {
                n2 = 6;
            }
            networkChangeNotifier.h(n2);
            networkChangeNotifier.b(bl2 ^ 1);
        }
    }

    private final void i(int n2, long l2) {
        Object object = this.b;
        int n3 = object.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            N.MbPIImnU((Long)object.get(i2), this, n2, l2);
        }
        object = new kna(this.c);
        while (object.hasNext()) {
            ((kos)object.next()).a();
        }
    }

    public static NetworkChangeNotifier init() {
        if (a == null) {
            a = new NetworkChangeNotifier();
        }
        return a;
    }

    public static void setAutoDetectConnectivityState(boolean bl2) {
        a.g(bl2, new kpk());
    }

    public final void a(int n2) {
        ArrayList arrayList = this.b;
        int n3 = arrayList.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            N.Mg0W7eRL((Long)arrayList.get(i2), this, n2);
        }
    }

    public void addNativeObserver(long l2) {
        this.b.add(l2);
    }

    public final void b(int n2) {
        ArrayList arrayList = this.b;
        int n3 = arrayList.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            N.MCEqyWQ0((Long)arrayList.get(i2), this, n2);
        }
    }

    public final void c(long l2, int n2) {
        ArrayList arrayList = this.b;
        int n3 = arrayList.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            N.MBT1i5cd((Long)arrayList.get(i2), this, l2, n2);
        }
    }

    public final void d(long l2) {
        ArrayList arrayList = this.b;
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            N.MDpuHJTB((Long)arrayList.get(i2), this, l2);
        }
    }

    public final void e(long l2) {
        ArrayList arrayList = this.b;
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            N.MiJIMrTb((Long)arrayList.get(i2), this, l2);
        }
    }

    public final void f(long[] lArray) {
        ArrayList arrayList = this.b;
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            N.MpF$179U((Long)arrayList.get(i2), this, lArray);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void g(boolean var1_1, kpa var2_2) {
        block7: {
            new knm("NetworkChangeNotifier.setAutoDetectConnectivityStateInternal");
            if (!var1_1) ** GOTO lbl15
            if (this.d == null) {
                var4_5 = new AmbientMode$AmbientController(this);
                this.d = var5_4 = new kpb(var4_5, var2_2 /* !! */ );
                var5_4.g();
                var2_2 /* !! */  = this.d.b();
                this.h(var2_2 /* !! */ .c());
                this.f = var3_7 = var2_2 /* !! */ .a();
                this.a(var3_7);
                this.b(var2_2 /* !! */ .b());
            }
            break block7;
lbl15:
            // 1 sources

            var2_2 /* !! */  = this.d;
            if (var2_2 /* !! */  == null) break block7;
            try {
                var2_2 /* !! */ .d.a();
                var2_2 /* !! */ .f();
                this.d = null;
            }
            catch (Throwable var4_6) {
                throw var4_6;
            }
            finally {
                Trace.endSection();
            }
        }
        return;
    }

    public int getCurrentConnectionCost() {
        return this.f;
    }

    public int getCurrentConnectionSubtype() {
        int n2;
        kpb kpb2;
        block6: {
            new knm("NetworkChangeNotifier.getCurrentConnectionSubtype");
            kpb2 = this.d;
            if (kpb2 != null) break block6;
            n2 = 0;
        }
        kpb2.g();
        n2 = this.d.b().b();
        return n2;
        finally {
            Trace.endSection();
        }
    }

    public int getCurrentConnectionType() {
        return this.e;
    }

    public long getCurrentDefaultNetId() {
        kpb kpb2 = this.d;
        if (kpb2 != null && (kpb2 = kpb2.m.aj()) != null) {
            return kpb2.getNetworkHandle();
        }
        return -1L;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long[] getCurrentNetworksAndTypes() {
        new knm("NetworkChangeNotifierAutoDetect.getCurrentNetworksAndTypes");
        kpb kpb2 = this.d;
        int n2 = 0;
        if (kpb2 == null) {
            return new long[0];
        }
        new knm("NetworkChangeNotifierAutoDetect.getNetworksAndTypes");
        Network[] networkArray = kpb.h(kpb2.m, null);
        int n3 = networkArray.length;
        long[] lArray = new long[n3 + n3];
        int n4 = 0;
        while (true) {
            int n5 = n4;
            if (n2 >= n3) break;
            Network network = networkArray[n2];
            lArray[n5] = network.getNetworkHandle();
            n4 = n5 + 2;
            lArray[n5 + 1] = kpb2.m.ai(network);
            ++n2;
            continue;
            break;
        }
        Trace.endSection();
        return lArray;
        catch (Throwable throwable) {
            try {
                Trace.endSection();
                throw throwable;
            }
            catch (Throwable throwable2) {
                throwable.addSuppressed(throwable2);
                throw throwable;
            }
        }
        finally {
            Trace.endSection();
        }
    }

    public final void h(int n2) {
        this.e = n2;
        this.i(n2, this.getCurrentDefaultNetId());
    }

    public boolean registerNetworkCallbackFailed() {
        kpb kpb2 = this.d;
        if (kpb2 == null) {
            return false;
        }
        return kpb2.k;
    }

    public void removeNativeObserver(long l2) {
        this.b.remove(l2);
    }
}

