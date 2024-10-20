/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class huc
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final jnu d;
    private final jnu e;
    private final jnu f;
    private final jnu g;
    private final jnu h;
    private final jnu i;
    private final jnu j;
    private final jnu k;
    private final jnu l;
    private final jnu m;
    private final jnu n;

    public huc(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, jnu jnu10, jnu jnu11, jnu jnu12, jnu jnu13, jnu jnu14, jnu jnu15) {
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
        this.e = jnu6;
        this.f = jnu7;
        this.g = jnu8;
        this.h = jnu9;
        this.i = jnu10;
        this.j = jnu11;
        this.k = jnu12;
        this.l = jnu13;
        this.m = jnu14;
        this.n = jnu15;
    }

    public final hqw a() {
        Context context = ((ilt)this.a).a();
        Object object = (cgw)this.b.b();
        Object object2 = (ScheduledExecutorService)this.c.b();
        Object object3 = (Executor)this.d.b();
        Object object4 = (Executor)this.e.b();
        AmbientModeSupport$AmbientController ambientModeSupport$AmbientController = ((hqy)this.f).a();
        Object object5 = (gto)((imc)this.g).a;
        gto gto2 = (gto)((imc)this.h).a;
        Object object6 = (gto)((imc)this.i).a;
        Object object7 = (gto)((imc)this.j).a;
        Object object8 = (Set)((imc)this.k).a;
        Object object9 = (gto)((imc)this.l).a;
        Object object10 = new gum(false);
        hqv hqv2 = new hqv();
        hqv2.i = object10;
        hqv2.j = object10;
        hqv2.k = object10;
        hqv2.l = new gum(TimeUnit.MINUTES.toMillis(30L));
        hqv2.a(0x400000);
        hqv2.p = Long.MAX_VALUE;
        hqv2.r = (byte)(hqv2.r | 2);
        hqv2.q = hrk.a;
        hqv2.r = (byte)(hqv2.r | 4);
        hqv2.a = context;
        if (object != null) {
            hqv2.s = object;
            if (object3 != null) {
                hqv2.b = object3;
                hqv2.e = object2;
                hqv2.c = object3;
                if (object4 != null) {
                    hqv2.d = object4;
                    hqv2.t = ambientModeSupport$AmbientController;
                    hqv2.f = (hrn)((gto)object5).f();
                    hqv2.m = (hrc)gto2.f();
                    hqv2.g = (hre)((gto)object6).f();
                    hqv2.n = (hrw)((gto)object7).f();
                    object4 = object8.isEmpty() ? null : hub.a.d(new TreeSet(object8));
                    object7 = this.n;
                    object5 = this.m;
                    hqv2.h = object4;
                    hqv2.u = (fvc)((gto)object9).f();
                    hqv2.i = new eyd(object5, 13);
                    hqv2.a((Integer)((gto)((imc)object7).a).e(0x400000));
                    if (hqv2.r == 7 && (object4 = hqv2.a) != null && (object8 = hqv2.s) != null && (object = hqv2.t) != null && (object10 = hqv2.b) != null && (object6 = hqv2.c) != null && (object9 = hqv2.d) != null && (object5 = hqv2.i) != null && (object3 = hqv2.j) != null && (object7 = hqv2.k) != null && (object2 = hqv2.l) != null) {
                        object4 = new hqw((Context)object4, (cgw)object8, (AmbientModeSupport$AmbientController)object, (Executor)object10, (Executor)object6, (Executor)object9, hqv2.e, hqv2.f, hqv2.g, hqv2.h, (gui)object5, (gui)object3, (gui)object7, (gui)object2, hqv2.m, hqv2.n, hqv2.o, hqv2.p, hqv2.q, hqv2.u);
                        boolean bl2 = ((hqw)object4).f == null || ((hqw)object4).d != null;
                        fxf.B(bl2, "If authContextManager is set, networkExecutor must be set.");
                        return object4;
                    }
                    object4 = new StringBuilder();
                    if (hqv2.a == null) {
                        ((StringBuilder)object4).append(" context");
                    }
                    if (hqv2.s == null) {
                        ((StringBuilder)object4).append(" clock");
                    }
                    if (hqv2.t == null) {
                        ((StringBuilder)object4).append(" transport");
                    }
                    if (hqv2.b == null) {
                        ((StringBuilder)object4).append(" transportExecutor");
                    }
                    if (hqv2.c == null) {
                        ((StringBuilder)object4).append(" ioExecutor");
                    }
                    if (hqv2.d == null) {
                        ((StringBuilder)object4).append(" networkExecutor");
                    }
                    if (hqv2.i == null) {
                        ((StringBuilder)object4).append(" recordNetworkMetricsToPrimes");
                    }
                    if (hqv2.j == null) {
                        ((StringBuilder)object4).append(" recordCachingMetricsToPrimes");
                    }
                    if (hqv2.k == null) {
                        ((StringBuilder)object4).append(" recordBandwidthMetrics");
                    }
                    if (hqv2.l == null) {
                        ((StringBuilder)object4).append(" grpcIdleTimeoutMillis");
                    }
                    if ((hqv2.r & 1) == 0) {
                        ((StringBuilder)object4).append(" maxMessageSize");
                    }
                    if ((hqv2.r & 2) == 0) {
                        ((StringBuilder)object4).append(" grpcKeepAliveTimeMillis");
                    }
                    if ((hqv2.r & 4) == 0) {
                        ((StringBuilder)object4).append(" grpcKeepAliveTimeoutMillis");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(object4.toString()));
                }
                throw new NullPointerException("Null networkExecutor");
            }
            throw new NullPointerException("Null transportExecutor");
        }
        throw new NullPointerException("Null clock");
    }
}

