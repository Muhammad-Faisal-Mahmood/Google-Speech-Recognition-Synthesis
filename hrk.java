/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class hrk {
    public static final long a = TimeUnit.SECONDS.toMillis(20L);
    public final Context b;
    public final URI c;
    public final Executor d;
    public final Executor e;
    public final ScheduledExecutorService f;
    public final String g;
    public final gui h;
    public final hrc i;
    public final Integer j;
    public final Integer k;
    public final long l;
    public final int m;
    private final long n;
    private final long o;
    private final fvc p;

    public hrk() {
        throw null;
    }

    public hrk(Context context, URI uRI, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, String string, gui gui2, hrc hrc2, Integer n2, Integer n3, long l2, int n4, long l3, long l4, fvc fvc2) {
        this.b = context;
        this.c = uRI;
        this.d = executor;
        this.e = executor2;
        this.f = scheduledExecutorService;
        this.g = string;
        this.h = gui2;
        this.i = hrc2;
        this.j = n2;
        this.k = n3;
        this.l = l2;
        this.m = n4;
        this.n = l3;
        this.o = l4;
        this.p = fvc2;
    }

    public final boolean equals(Object object) {
        block4: {
            block6: {
                Object object2;
                block5: {
                    if (object == this) {
                        return true;
                    }
                    if (!(object instanceof hrk)) break block4;
                    object = (hrk)object;
                    if (!this.b.equals(((hrk)object).b) || !this.c.equals(((hrk)object).c) || !this.d.equals(((hrk)object).d) || !this.e.equals(((hrk)object).e) || !((object2 = this.f) == null ? ((hrk)object).f == null : object2.equals(((hrk)object).f)) || !((object2 = this.g) == null ? ((hrk)object).g == null : ((String)object2).equals(((hrk)object).g)) || !this.h.equals(((hrk)object).h) || !((object2 = this.i) == null ? ((hrk)object).i == null : object2.equals(((hrk)object).i)) || !((object2 = this.j) == null ? ((hrk)object).j == null : ((Integer)object2).equals(((hrk)object).j)) || !((object2 = this.k) == null ? ((hrk)object).k == null : ((Integer)object2).equals(((hrk)object).k)) || this.l != ((hrk)object).l || this.m != ((hrk)object).m || this.n != ((hrk)object).n || this.o != ((hrk)object).o) break block4;
                    object2 = this.p;
                    object = ((hrk)object).p;
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
        int n2 = this.b.hashCode();
        int n3 = this.c.hashCode();
        int n4 = this.d.hashCode();
        int n5 = this.e.hashCode();
        Object object = this.f;
        int n6 = 0;
        int n7 = object == null ? 0 : object.hashCode();
        object = this.g;
        int n8 = object == null ? 0 : ((String)object).hashCode();
        int n9 = this.h.hashCode();
        object = this.i;
        int n10 = object == null ? 0 : object.hashCode();
        object = this.j;
        int n11 = object == null ? 0 : ((Integer)object).hashCode();
        object = this.k;
        int n12 = object == null ? 0 : ((Integer)object).hashCode();
        long l2 = this.l;
        int n13 = (int)(l2 ^ l2 >>> 32);
        int n14 = this.m;
        l2 = this.n;
        int n15 = (int)(l2 ^ l2 >>> 32);
        l2 = this.o;
        int n16 = (int)(l2 ^ l2 >>> 32);
        object = this.p;
        if (object != null) {
            n6 = object.hashCode();
        }
        return ((((((((((((((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ n7) * 1000003 ^ n8) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n13) * 1000003 ^ n14) * 1000003 ^ n15) * 1000003 ^ n16) * 1000003 ^ n6;
    }

    public final String toString() {
        Object object = this.p;
        Object object2 = this.i;
        Object object3 = this.h;
        Object object4 = this.f;
        Object object5 = this.e;
        Object object6 = this.d;
        Object object7 = this.c;
        String string = String.valueOf(this.b);
        object7 = String.valueOf(object7);
        object6 = String.valueOf(object6);
        object5 = String.valueOf(object5);
        object4 = String.valueOf(object4);
        object3 = String.valueOf(object3);
        object2 = String.valueOf(object2);
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("TransportConfig{applicationContext=");
        stringBuilder.append(string);
        stringBuilder.append(", uri=");
        stringBuilder.append((String)object7);
        stringBuilder.append(", networkExecutor=");
        stringBuilder.append((String)object6);
        stringBuilder.append(", transportExecutor=");
        stringBuilder.append((String)object5);
        stringBuilder.append(", transportScheduledExecutorService=");
        stringBuilder.append((String)object4);
        stringBuilder.append(", userAgentOverride=");
        stringBuilder.append(this.g);
        stringBuilder.append(", recordNetworkMetricsToPrimes=");
        stringBuilder.append((String)object3);
        stringBuilder.append(", grpcServiceConfig=");
        stringBuilder.append((String)object2);
        stringBuilder.append(", trafficStatsUid=");
        stringBuilder.append(this.j);
        stringBuilder.append(", trafficStatsTag=");
        stringBuilder.append(this.k);
        stringBuilder.append(", grpcIdleTimeoutMillis=");
        stringBuilder.append(this.l);
        stringBuilder.append(", maxMessageSize=");
        stringBuilder.append(this.m);
        stringBuilder.append(", grpcKeepAliveTimeMillis=");
        stringBuilder.append(this.n);
        stringBuilder.append(", grpcKeepAliveTimeoutMillis=");
        stringBuilder.append(this.o);
        stringBuilder.append(", channelCredentials=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

