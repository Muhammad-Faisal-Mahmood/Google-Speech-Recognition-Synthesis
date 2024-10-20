/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class hqw {
    public final Context a;
    public final Executor b;
    public final Executor c;
    public final Executor d;
    public final ScheduledExecutorService e;
    public final hrn f;
    public final hre g;
    public final String h;
    public final gui i;
    public final gui j;
    public final gui k;
    public final gui l;
    public final hrc m;
    public final hrw n;
    public final int o;
    public final long p;
    public final long q;
    public final cgw r;
    public final AmbientModeSupport$AmbientController s;
    public final fvc t;

    public hqw() {
        throw null;
    }

    public hqw(Context context, cgw cgw2, AmbientModeSupport$AmbientController ambientModeSupport$AmbientController, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, hrn hrn2, hre hre2, String string, gui gui2, gui gui3, gui gui4, gui gui5, hrc hrc2, hrw hrw2, int n2, long l2, long l3, fvc fvc2) {
        this.a = context;
        this.r = cgw2;
        this.s = ambientModeSupport$AmbientController;
        this.b = executor;
        this.c = executor2;
        this.d = executor3;
        this.e = scheduledExecutorService;
        this.f = hrn2;
        this.g = hre2;
        this.h = string;
        this.i = gui2;
        this.j = gui3;
        this.k = gui4;
        this.l = gui5;
        this.m = hrc2;
        this.n = hrw2;
        this.o = n2;
        this.p = l2;
        this.q = l3;
        this.t = fvc2;
    }

    public final boolean equals(Object object) {
        block4: {
            block6: {
                Object object2;
                block5: {
                    if (object == this) {
                        return true;
                    }
                    if (!(object instanceof hqw)) break block4;
                    object = (hqw)object;
                    if (!this.a.equals(((hqw)object).a) || !this.r.equals(((hqw)object).r) || !this.s.equals(((hqw)object).s) || !this.b.equals(((hqw)object).b) || !this.c.equals(((hqw)object).c) || !this.d.equals(((hqw)object).d) || !((object2 = this.e) == null ? ((hqw)object).e == null : object2.equals(((hqw)object).e)) || !((object2 = this.f) == null ? ((hqw)object).f == null : object2.equals(((hqw)object).f)) || !((object2 = this.g) == null ? ((hqw)object).g == null : object2.equals(((hqw)object).g)) || !((object2 = this.h) == null ? ((hqw)object).h == null : ((String)object2).equals(((hqw)object).h)) || !this.i.equals(((hqw)object).i) || !this.j.equals(((hqw)object).j) || !this.k.equals(((hqw)object).k) || !this.l.equals(((hqw)object).l) || !((object2 = this.m) == null ? ((hqw)object).m == null : object2.equals(((hqw)object).m)) || !((object2 = this.n) == null ? ((hqw)object).n == null : object2.equals(((hqw)object).n)) || this.o != ((hqw)object).o || this.p != ((hqw)object).p || this.q != ((hqw)object).q) break block4;
                    object2 = this.t;
                    object = ((hqw)object).t;
                    if (object2 != null) break block5;
                    if (object != null) break block4;
                    break block6;
                }
                if (!object2.equals(object)) break block4;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        int n3 = this.r.hashCode();
        int n4 = this.s.hashCode();
        int n5 = this.b.hashCode();
        int n6 = this.c.hashCode();
        int n7 = this.d.hashCode();
        Object object = this.e;
        int n8 = 0;
        int n9 = object == null ? 0 : object.hashCode();
        object = this.f;
        int n10 = object == null ? 0 : object.hashCode();
        object = this.g;
        int n11 = object == null ? 0 : object.hashCode();
        object = this.h;
        int n12 = object == null ? 0 : ((String)object).hashCode();
        int n13 = this.i.hashCode();
        int n14 = this.j.hashCode();
        int n15 = this.k.hashCode();
        int n16 = this.l.hashCode();
        object = this.m;
        int n17 = object == null ? 0 : object.hashCode();
        object = this.n;
        int n18 = object == null ? 0 : object.hashCode();
        int n19 = this.o;
        long l2 = this.p;
        int n20 = (int)(l2 ^ l2 >>> 32);
        l2 = this.q;
        int n21 = (int)(l2 ^ l2 >>> 32);
        object = this.t;
        if (object != null) {
            n8 = object.hashCode();
        }
        return (((((((((((((((((((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ n6) * 1000003 ^ n7) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n13) * 1000003 ^ n14) * 1000003 ^ n15) * 1000003 ^ n16) * -721379959 ^ n17) * 1000003 ^ n18) * 1000003 ^ n19) * 1000003 ^ n20) * 1000003 ^ n21) * 1000003 ^ n8;
    }

    public final String toString() {
        Object object = this.t;
        Object object2 = this.n;
        Object object3 = this.m;
        Object object4 = this.l;
        Object object5 = this.k;
        Object object6 = this.j;
        Object object7 = this.i;
        Object object8 = this.g;
        Object object9 = this.f;
        Object object10 = this.e;
        Object object11 = this.d;
        Object object12 = this.c;
        Object object13 = this.b;
        Object object14 = this.s;
        Object object15 = this.r;
        String string = String.valueOf(this.a);
        object15 = String.valueOf(object15);
        object14 = String.valueOf(object14);
        object13 = String.valueOf(object13);
        object12 = String.valueOf(object12);
        object11 = String.valueOf(object11);
        object10 = String.valueOf(object10);
        object9 = String.valueOf(object9);
        object8 = String.valueOf(object8);
        object7 = String.valueOf(object7);
        object6 = String.valueOf(object6);
        object5 = String.valueOf(object5);
        object4 = String.valueOf(object4);
        object3 = String.valueOf(object3);
        object2 = String.valueOf(object2);
        String string2 = String.valueOf(object);
        object = new StringBuilder("ChannelConfig{context=");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(", clock=");
        ((StringBuilder)object).append((String)object15);
        ((StringBuilder)object).append(", transport=");
        ((StringBuilder)object).append((String)object14);
        ((StringBuilder)object).append(", transportExecutor=");
        ((StringBuilder)object).append((String)object13);
        ((StringBuilder)object).append(", ioExecutor=");
        ((StringBuilder)object).append((String)object12);
        ((StringBuilder)object).append(", networkExecutor=");
        ((StringBuilder)object).append((String)object11);
        ((StringBuilder)object).append(", transportScheduledExecutor=");
        ((StringBuilder)object).append((String)object10);
        ((StringBuilder)object).append(", authContextManager=");
        ((StringBuilder)object).append((String)object9);
        ((StringBuilder)object).append(", rpcCacheProvider=");
        ((StringBuilder)object).append((String)object8);
        ((StringBuilder)object).append(", userAgentOverride=");
        ((StringBuilder)object).append(this.h);
        ((StringBuilder)object).append(", recordNetworkMetricsToPrimes=");
        ((StringBuilder)object).append((String)object7);
        ((StringBuilder)object).append(", recordCachingMetricsToPrimes=");
        ((StringBuilder)object).append((String)object6);
        ((StringBuilder)object).append(", recordBandwidthMetrics=");
        ((StringBuilder)object).append((String)object5);
        ((StringBuilder)object).append(", grpcIdleTimeoutMillis=");
        ((StringBuilder)object).append((String)object4);
        ((StringBuilder)object).append(", streamzConfig=null, grpcServiceConfig=");
        ((StringBuilder)object).append((String)object3);
        ((StringBuilder)object).append(", consistencyTokenConfig=");
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(", maxMessageSize=");
        ((StringBuilder)object).append(this.o);
        ((StringBuilder)object).append(", grpcKeepAliveTimeMillis=");
        ((StringBuilder)object).append(this.p);
        ((StringBuilder)object).append(", grpcKeepAliveTimeoutMillis=");
        ((StringBuilder)object).append(this.q);
        ((StringBuilder)object).append(", channelCredentials=");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("}");
        return ((StringBuilder)object).toString();
    }
}

