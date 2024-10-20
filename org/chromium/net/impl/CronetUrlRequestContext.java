/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.ConditionVariable
 *  android.util.Log
 */
package org.chromium.net.impl;

import J.N;
import android.os.ConditionVariable;
import android.util.Log;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.impl.CronetLibraryLoader;
import org.chromium.net.impl.ImplVersion;

public class CronetUrlRequestContext
extends kqm {
    public static final String a = "CronetUrlRequestContext";
    private static final HashSet g = new HashSet();
    public final Object b;
    public long c;
    public Thread d;
    public final long e;
    public final kqx f;
    private final ConditionVariable h;
    private final AtomicInteger i;
    private final AtomicInteger j;
    private final boolean k;
    private final Object l;
    private final Object m;
    private final knb n;
    private final knb o;
    private final Map p;
    private final ConditionVariable q;
    private final String r;
    private long s;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public CronetUrlRequestContext(kqo object, long l2) {
        long l3;
        int n2;
        Object object2;
        Object object32;
        Object object4;
        Object object5;
        this.b = object5 = new Object();
        this.h = new ConditionVariable(false);
        this.i = new AtomicInteger(0);
        this.j = new AtomicInteger(0);
        this.l = new Object();
        this.m = new Object();
        this.n = new knb();
        this.o = new knb();
        this.p = new HashMap();
        this.q = new ConditionVariable();
        this.s = -1L;
        this.k = ((kqo)object).o;
        boolean bl2 = CronetLibraryLoader.b(((kqo)object).c, (kqo)object, false);
        if (((kqo)object).n() == 1) {
            object4 = ((kqo)object).h;
            this.r = object4;
            object32 = g;
            synchronized (object32) {
                if (!((HashSet)object32).add(object4)) {
                    object = new IllegalStateException("Disk cache storage path already in use");
                    throw object;
                }
            }
        } else {
            this.r = null;
        }
        synchronized (object5) {
            object4 = (bzo)CronetLibraryLoader.c().aa().get("Cronet_override_network_thread_priority");
            object32 = kpl.DEFAULT_INSTANCE.l();
            boolean bl3 = ((kqo)object).i;
            if (!((hwp)object32).b.B()) {
                ((hwp)object32).u();
            }
            hwv hwv2 = ((hwp)object32).b;
            object2 = (kpl)hwv2;
            ((kpl)object2).bitField0_ |= 4;
            ((kpl)object2).quicEnabled_ = bl3;
            bl3 = ((kqo)object).j;
            if (!hwv2.B()) {
                ((hwp)object32).u();
            }
            object2 = ((hwp)object32).b;
            hwv2 = object2;
            ((kpl)hwv2).bitField0_ |= 0x10;
            ((kpl)hwv2).http2Enabled_ = bl3;
            bl3 = ((kqo)object).k;
            if (!((hwv)object2).B()) {
                ((hwp)object32).u();
            }
            object2 = ((hwp)object32).b;
            hwv2 = (kpl)object2;
            ((kpl)hwv2).bitField0_ |= 0x20;
            ((kpl)hwv2).brotliEnabled_ = bl3;
            bl3 = ((kqo)object).l.f;
            if (!((hwv)object2).B()) {
                ((hwp)object32).u();
            }
            object2 = (kpl)((hwp)object32).b;
            ((kpl)object2).bitField0_ |= 0x40;
            ((kpl)object2).disableCache_ = bl3 ^ true;
            n2 = ((kqo)object).n();
            if (!((hwp)object32).b.B()) {
                ((hwp)object32).u();
            }
            hwv2 = ((hwp)object32).b;
            object2 = (kpl)hwv2;
            ((kpl)object2).bitField0_ |= 0x80;
            ((kpl)object2).httpCacheMode_ = n2;
            l3 = ((kqo)object).m;
            if (!hwv2.B()) {
                ((hwp)object32).u();
            }
            object2 = ((hwp)object32).b;
            hwv2 = (kpl)object2;
            ((kpl)hwv2).bitField0_ |= 0x100;
            ((kpl)hwv2).httpCacheMaxSize_ = l3;
            if (!((hwv)object2).B()) {
                ((hwp)object32).u();
            }
            object2 = ((hwp)object32).b;
            hwv2 = (kpl)object2;
            ((kpl)hwv2).bitField0_ |= 0x400;
            ((kpl)hwv2).mockCertVerifier_ = 0L;
            bl3 = ((kqo)object).o;
            if (!((hwv)object2).B()) {
                ((hwp)object32).u();
            }
            hwv2 = ((hwp)object32).b;
            object2 = (kpl)hwv2;
            ((kpl)object2).bitField0_ |= 0x800;
            ((kpl)object2).enableNetworkQualityEstimator_ = bl3;
            bl3 = ((kqo)object).f;
            if (!hwv2.B()) {
                ((hwp)object32).u();
            }
            object2 = (kpl)((hwp)object32).b;
            ((kpl)object2).bitField0_ |= 0x1000;
            ((kpl)object2).bypassPublicKeyPinningForLocalTrustAnchors_ = bl3;
            n2 = object4 != null ? (int)((bzo)object4).ad() : ((kqo)object).o(10);
            if (!((hwp)object32).b.B()) {
                ((hwp)object32).u();
            }
            object4 = ((hwp)object32).b;
            object2 = (kpl)object4;
            ((kpl)object2).bitField0_ |= 0x2000;
            ((kpl)object2).networkThreadPriority_ = n2;
            object2 = ((kqo)object).g;
            if (object2 != null) {
                if (!((hwv)object4).B()) {
                    ((hwp)object32).u();
                }
                object4 = (kpl)((hwp)object32).b;
                ((kpl)object4).bitField0_ |= 1;
                ((kpl)object4).userAgent_ = object2;
            }
            if ((object2 = ((kqo)object).h) != null) {
                if (!((hwp)object32).b.B()) {
                    ((hwp)object32).u();
                }
                object4 = (kpl)((hwp)object32).b;
                ((kpl)object4).bitField0_ |= 2;
                ((kpl)object4).storagePath_ = object2;
            }
            ((kqo)object).p();
            object2 = ((kqo)object).p();
            if (!((hwp)object32).b.B()) {
                ((hwp)object32).u();
            }
            object4 = ((hwp)object32).b;
            hwv2 = (kpl)object4;
            ((kpl)hwv2).bitField0_ |= 8;
            ((kpl)hwv2).quicDefaultUserAgentId_ = object2;
            object2 = ((kqo)object).n;
            if (object2 != null) {
                if (!((hwv)object4).B()) {
                    ((hwp)object32).u();
                }
                object4 = (kpl)((hwp)object32).b;
                ((kpl)object4).bitField0_ |= 0x200;
                ((kpl)object4).experimentalOptions_ = object2;
            }
            if ((l3 = N.MB3ntV7V(((kpl)((hwp)object32).o()).g())) == 0L) {
                object = new IllegalArgumentException("Experimental options parsing failed.");
                throw object;
            }
            for (Object object32 : ((kqo)object).d) {
                object4 = ((bjh)object32).c;
                n2 = ((bjh)object32).a;
                n2 = ((bjh)object32).b;
                N.MyRIv1Ij(l3, object4, 443, 443);
            }
            object4 = ((kqo)object).e.iterator();
            while (object4.hasNext()) {
                object32 = (bng)object4.next();
                N.Muq3ic6p(l3, ((bng)object32).b, ((bng)object32).d, ((bng)object32).a, ((Date)((bng)object32).c).getTime());
            }
            this.c = l3 = N.M135Cu0D(l3);
            if (l3 == 0L) {
                object = new NullPointerException("Context Adapter creation failed.");
                throw object;
            }
        }
        this.f = object4 = kqy.a(((kqo)object).c, ((kqo)object).q);
        this.e = l3 = ((kqx)object4).a();
        object5 = ((kqo)object).q();
        try {
            object2 = "Cronet/".concat(ImplVersion.getCronetVersionWithLastChange()).split("/")[1].split("@")[0];
            object32 = new kqw((String)object2);
            ((kqx)object4).e(l3, (kqs)object5, (kqw)object32, ((kqo)object).q);
        }
        catch (RuntimeException runtimeException) {
            Log.i((String)"cr_".concat(String.valueOf(a)), (String)"Error while trying to log CronetEngine creation: ", (Throwable)runtimeException);
        }
        object = bl2 ? new krd(this.f, ((kqs)object5).i, l2) : null;
        CronetLibraryLoader.a(new kot((Object)this, object, 7, null));
        if (object != null) {
            n2 = ((krd)object).a();
            object5 = ((krd)object).c;
            synchronized (object5) {
                ((kqu)((krd)object).c).b = n2;
                ((krd)object).b();
                return;
            }
        }
    }

    private void initNetworkThread() {
        this.d = Thread.currentThread();
        this.h.open();
        Thread.currentThread().setName("ChromiumNet");
    }

    private final void n() {
        if (this.c != 0L) {
            return;
        }
        throw new IllegalStateException("Engine is shut down.");
    }

    private static void o(Executor executor, Runnable runnable) {
        CronetUrlRequestContext.p(executor, runnable, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void onEffectiveConnectionTypeChanged(int n2) {
        Object object = this.l;
        // MONITORENTER : object
        // MONITOREXIT : object
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void onRTTOrThroughputEstimatesComputed(int n2, int n3, int n4) {
        Object object = this.l;
        // MONITORENTER : object
        // MONITOREXIT : object
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void onRttObservation(int n2, long l2, int n3) {
        Object object = this.l;
        synchronized (object) {
            Object object2 = this.n;
            kna kna2 = new kna((knb)object2);
            while (kna2.hasNext()) {
                object2 = (ksf)kna2.next();
                krc krc2 = new krc((ksf)object2, n2, l2, n3, 1);
                CronetUrlRequestContext.o(((kpd)object2).a(), krc2);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void onThroughputObservation(int n2, long l2, int n3) {
        Object object = this.l;
        synchronized (object) {
            Object object2 = this.o;
            kna kna2 = new kna((knb)object2);
            while (kna2.hasNext()) {
                object2 = (ksg)kna2.next();
                krc krc2 = new krc((ksg)object2, n2, l2, n3, 0);
                CronetUrlRequestContext.o(((kpe)object2).a(), krc2);
            }
            return;
        }
    }

    private static void p(Executor executor, Runnable runnable, ksb ksb2) {
        if (ksb2 != null) {
            ksb2.b();
        }
        try {
            kot kot2 = new kot((Object)runnable, (Object)ksb2, 6, null);
            executor.execute(kot2);
            return;
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            if (ksb2 != null) {
                ksb2.a();
            }
            Log.e((String)"cr_".concat(String.valueOf(a)), (String)"Exception posting task to executor", (Throwable)rejectedExecutionException);
            return;
        }
    }

    @Override
    public final URLConnection a(URL uRL) {
        if (Proxy.NO_PROXY.type() == Proxy.Type.DIRECT) {
            String string = uRL.getProtocol();
            if (!"http".equals(string) && !"https".equals(string)) {
                throw new UnsupportedOperationException("Unexpected protocol:".concat(String.valueOf(string)));
            }
            return new ksv(uRL, this);
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public final /* synthetic */ knx b(String string, kny kny2, Executor executor) {
        return new kqh(string, kny2, executor, this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c(kpm kpm2) {
        Object object = this.m;
        synchronized (object) {
            Map map = this.p;
            ksh ksh2 = new ksh(kpm2);
            map.put(kpm2, ksh2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d(kpd kpd2) {
        if (!this.k) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        Object object = this.l;
        synchronized (object) {
            Object object2;
            if (this.n.b()) {
                object2 = this.b;
                synchronized (object2) {
                    this.n();
                    N.MpnFLFF2(this.c, this, true);
                }
            }
            knb knb2 = this.n;
            object2 = new ksf(kpd2);
            knb2.c(object2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void e(kpe kpe2) {
        if (!this.k) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        Object object = this.l;
        synchronized (object) {
            Object object2;
            if (this.o.b()) {
                object2 = this.b;
                synchronized (object2) {
                    this.n();
                    N.MnPUhNKP(this.c, this, true);
                }
            }
            knb knb2 = this.o;
            object2 = new ksg(kpe2);
            knb2.c(object2);
            return;
        }
    }

    @Override
    public final /* synthetic */ jjj f(String string, kps kps2, Executor executor) {
        return new ksc(string, kps2, executor, this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final koh g(String string, kny object, Executor executor, String object2, List list, boolean bl2, Collection collection, boolean bl3, int n2, boolean bl4, int n3) {
        long l2 = this.s;
        object2 = this.b;
        synchronized (object2) {
            try {
                this.n();
            }
            finally {
                Object object3 = object2;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final kom h(String object, kps kps2, Executor executor, int n2, boolean bl2, boolean bl3, boolean bl4, int n3, boolean bl5, int n4, String string, ArrayList arrayList, kpq kpq2, Executor executor2) {
        long l2 = this.s;
        Object object2 = this.b;
        synchronized (object2) {
            try {
                this.n();
            }
            finally {
                Object object3 = object2;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long i() {
        Object object = this.b;
        synchronized (object) {
            this.n();
            return this.c;
        }
    }

    final void j() {
        this.i.decrementAndGet();
    }

    public final void k() {
        this.j.decrementAndGet();
    }

    public final void l() {
        this.j.incrementAndGet();
        this.i.incrementAndGet();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void m(kpo kpo2, ksb ksb2) {
        ArrayList arrayList = new ArrayList();
        Object object = this.m;
        synchronized (object) {
            arrayList.addAll(this.p.values());
        }
        int n2 = arrayList.size();
        int n3 = 0;
        while (n3 < n2) {
            object = (ksh)arrayList.get(n3);
            kot kot2 = new kot(object, (Object)kpo2, 8, null);
            CronetUrlRequestContext.p(((kpm)object).b(), kot2, ksb2);
            ++n3;
        }
        return;
    }

    public void stopNetLogCompleted() {
        this.q.open();
    }
}

