/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.net.ConnectivityManager
 *  android.net.ConnectivityManager$NetworkCallback
 *  android.net.Network
 *  android.net.NetworkRequest
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Trace
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.Arrays;
import org.chromium.net.NetworkChangeNotifier;
import org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkConnectivityIntentFilter;

public final class kpb
extends BroadcastReceiver {
    public static final String a = "kpb";
    public final Handler b;
    public final NetworkChangeNotifierAutoDetect$NetworkConnectivityIntentFilter c;
    public final kpa d;
    public ConnectivityManager.NetworkCallback e;
    public koy f;
    public NetworkRequest g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final AmbientMode$AmbientController l;
    public bzo m;
    private final Looper n;
    private koz o;

    public kpb(AmbientMode$AmbientController object, kpa kpa2) {
        new knm("NetworkChangeNotifierAutoDetect.constructor");
        try {
            Object object2;
            Looper looper;
            this.n = looper = Looper.myLooper();
            this.b = object2 = new Handler(looper);
            this.l = object;
            looper = jjj.c;
            object = null;
            super((Context)looper, (byte[])null);
            this.m = object2;
            super(this);
            this.f = object2;
            super();
            this.g = object2.addCapability(12).removeCapability(15).build();
            if (Build.VERSION.SDK_INT >= 30) {
                super(this);
                this.e = object;
            } else {
                if (Build.VERSION.SDK_INT >= 28) {
                    super(this);
                }
                this.e = object;
            }
            this.g();
            super();
            this.c = object;
            this.i = false;
            this.j = false;
            this.d = kpa2;
            kpa2.b(this);
            this.j = true;
            return;
        }
        finally {
            try {
                Trace.endSection();
            }
            catch (Throwable throwable) {
                Throwable throwable2;
                throwable2.addSuppressed(throwable);
            }
        }
    }

    public static int a(int n2, int n3) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 4 && n2 != 5) {
                    if (n2 != 6) {
                        if (n2 != 7) {
                            if (n2 != 9) {
                                return 0;
                            }
                            return 1;
                        }
                        return 7;
                    }
                    return 5;
                }
            } else {
                return 2;
            }
        }
        if (n3 != 20) {
            switch (n3) {
                default: {
                    return 0;
                }
                case 13: {
                    return 5;
                }
                case 3: 
                case 5: 
                case 6: 
                case 8: 
                case 9: 
                case 10: 
                case 12: 
                case 14: 
                case 15: {
                    return 4;
                }
                case 1: 
                case 2: 
                case 4: 
                case 7: 
                case 11: 
            }
            return 3;
        }
        return 8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Network[] h(bzo bzo2, Network network) {
        Network[] networkArray;
        Network[] networkArray2 = networkArray = ((ConnectivityManager)bzo2.a).getAllNetworks();
        if (networkArray == null) {
            networkArray2 = new Network[]{};
        }
        int n2 = 0;
        for (int i2 = 0; i2 < networkArray2.length; ++i2) {
            Network network2 = networkArray2[i2];
            int n3 = n2;
            if (!network2.equals((Object)network)) {
                networkArray = bzo2.ak(network2);
                n3 = n2;
                if (networkArray != null) {
                    n3 = n2;
                    if (networkArray.hasCapability(12)) {
                        if (networkArray.hasTransport(4)) {
                            if (bzo.ap(network2)) return new Network[]{network2};
                            n3 = n2;
                        } else {
                            networkArray2[n2] = network2;
                            n3 = n2 + 1;
                        }
                    }
                }
            }
            n2 = n3;
        }
        return Arrays.copyOf(networkArray2, n2);
    }

    public final koz b() {
        new knm("NetworkChangeNotifierAutoDetect.getCurrentNetworkState");
        try {
            koz koz2 = this.o;
            return koz2;
        }
        finally {
            Trace.endSection();
        }
    }

    public final void c() {
        new knm("NetworkChangeNotifierAutoDetect.connectionTypeChanged");
        try {
            this.d(this.m.ao());
            return;
        }
        finally {
            Trace.endSection();
        }
    }

    public final void d(koz koz2) {
        int n2;
        Object object;
        block6: {
            block5: {
                if (koz2.c() != this.o.c() || !koz2.a.equals(this.o.a)) break block5;
                boolean bl2 = koz2.b;
                object = this.o;
                if (bl2 == ((koz)object).b && koz2.c.equals(((koz)object).c)) break block6;
            }
            this.l.y(koz2.c());
        }
        if (koz2.c() != this.o.c() || koz2.b() != this.o.b()) {
            object = this.l;
            n2 = koz2.b();
            ((NetworkChangeNotifier)((AmbientMode$AmbientController)object).a).b(n2);
        }
        if (koz2.a() != this.o.a()) {
            object = this.l;
            n2 = koz2.a();
            ((NetworkChangeNotifier)((AmbientMode$AmbientController)object).a).a(n2);
        }
        this.o = koz2;
    }

    public final void e(Runnable runnable) {
        if (this.n == Looper.myLooper()) {
            runnable.run();
            return;
        }
        this.b.post((Runnable)new kot((Object)this, runnable, 0));
    }

    public final void f() {
        if (!this.h) {
            return;
        }
        this.h = false;
        koy koy2 = this.f;
        if (koy2 != null) {
            this.m.an(koy2);
        }
        if ((koy2 = this.e) != null) {
            this.m.an(koy2);
            return;
        }
        jjj.c.unregisterReceiver((BroadcastReceiver)this);
    }

    public final void g() {
        new knm("NetworkChangeNotifierAutoDetect.updateCurrentNetworkState");
        try {
            this.o = this.m.ao();
            return;
        }
        finally {
            Trace.endSection();
        }
    }

    public final void onReceive(Context context, Intent intent) {
        this.e(new jhz((Object)this, 10));
    }
}

