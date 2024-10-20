/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

public final class jks
implements jcu,
jkc,
jlc {
    private static final Map D;
    public static final Logger a;
    public final jjv A;
    final ivf B;
    int C;
    private final ivn E;
    private int F;
    private final jim G;
    private final ScheduledExecutorService H;
    private final int I;
    private boolean J;
    private boolean K;
    private final jeg L;
    public final InetSocketAddress b;
    public final String c;
    public final String d;
    public final Random e = new Random();
    public final int f;
    public jge g;
    public jkd h;
    public jle i;
    public final Object j;
    public final Map k;
    public final Executor l;
    public int m;
    public jkr n;
    public its o;
    public iyh p;
    public jef q;
    public boolean r;
    public final SocketFactory s;
    public SSLSocketFactory t;
    public int u;
    public final Deque v;
    public final jli w;
    public jex x;
    public final Runnable y;
    public final int z;

    static {
        EnumMap<jlt, iyh> enumMap = new EnumMap<jlt, iyh>(jlt.class);
        enumMap.put(jlt.a, iyh.j.e("No error: A GRPC status of OK should have been sent"));
        enumMap.put(jlt.b, iyh.j.e("Protocol error"));
        enumMap.put(jlt.g, iyh.j.e("Internal error"));
        enumMap.put(jlt.h, iyh.j.e("Flow control error"));
        enumMap.put(jlt.i, iyh.j.e("Stream closed"));
        enumMap.put(jlt.j, iyh.j.e("Frame too large"));
        enumMap.put(jlt.k, iyh.k.e("Refused stream"));
        enumMap.put(jlt.l, iyh.c.e("Cancelled"));
        enumMap.put(jlt.m, iyh.j.e("Compression error"));
        enumMap.put(jlt.n, iyh.j.e("Connect error"));
        enumMap.put(jlt.o, iyh.g.e("Enhance your calm"));
        enumMap.put(jlt.p, iyh.f.e("Inadequate security"));
        D = DesugarCollections.unmodifiableMap(enumMap);
        a = Logger.getLogger(jks.class.getName());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public jks(jkj object, InetSocketAddress inetSocketAddress, String object2, String string, its its2, gui gui2, ivf ivf2, Runnable runnable) {
        Object object3;
        this.j = object3 = new Object();
        this.k = new HashMap();
        this.u = 0;
        this.v = new LinkedList();
        this.L = new jko(this);
        this.C = 30000;
        a.s(inetSocketAddress, "address");
        this.b = inetSocketAddress;
        this.c = object2;
        this.I = 0x400000;
        this.f = 65535;
        object2 = ((jkj)object).a;
        a.s(object2, "executor");
        this.l = object2;
        this.G = new jim(((jkj)object).a);
        object2 = ((jkj)object).b;
        a.s(object2, "scheduledExecutorService");
        this.H = object2;
        this.F = 3;
        this.s = SocketFactory.getDefault();
        this.t = ((jkj)object).c;
        object2 = ((jkj)object).d;
        a.s(object2, "connectionSpec");
        this.w = object2;
        a.s(gui2, "stopwatchFactory");
        this.d = jeb.e("okhttp", string);
        this.B = ivf2;
        this.y = runnable;
        this.z = Integer.MAX_VALUE;
        this.A = ((jkj)object).e.C();
        this.E = ivn.a(this.getClass(), inetSocketAddress.toString());
        object = its.a;
        object = new kpy(its.a);
        ((kpy)object).b(jdx.b, its2);
        this.o = ((kpy)object).a();
        // MONITORENTER : object3
        // MONITOREXIT : object3
    }

    static iyh e(jlt object) {
        iyh iyh2 = (iyh)D.get(object);
        if (iyh2 != null) {
            return iyh2;
        }
        iyh2 = iyh.d;
        int n2 = ((jlt)((Object)object)).s;
        object = new StringBuilder("Unknown http2 error code: ");
        ((StringBuilder)object).append(n2);
        return iyh2.e(((StringBuilder)object).toString());
    }

    public static String f(kmk object) {
        Object object2 = new klm();
        while (object.b((klm)object2, 1L) != -1L) {
            if (((klm)object2).c(((klm)object2).b - 1L) != 10) continue;
            long l2 = ((klm)object2).h((byte)10, 0L, Long.MAX_VALUE);
            if (l2 != -1L) {
                return kmn.a((klm)object2, l2);
            }
            object = new klm();
            ((klm)object2).M((klm)object, Math.min(32L, ((klm)object2).b));
            l2 = Math.min(((klm)object2).b, Long.MAX_VALUE);
            object = ((klm)object).o().d();
            object2 = new StringBuilder("\\n not found: limit=");
            ((StringBuilder)object2).append(l2);
            ((StringBuilder)object2).append(" content=");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append("\u2026");
            throw new EOFException(((StringBuilder)object2).toString());
        }
        throw new EOFException("\\n not found: ".concat(((klm)object2).o().d()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void s() {
        if (this.p == null) return;
        if (!this.k.isEmpty()) return;
        if (!this.v.isEmpty()) {
            return;
        }
        if (this.r) return;
        this.r = true;
        Object object2 = this.x;
        if (object2 != null) {
            ((jex)object2).d();
        }
        if ((object2 = this.q) != null) {
            Iterator iterator = this.g();
            synchronized (object2) {
                if (((jef)object2).d) {
                } else {
                    ((jef)object2).d = true;
                    ((jef)object2).e = iterator;
                    iterator = ((jef)object2).c;
                    ((jef)object2).c = null;
                    // MONITOREXIT @DISABLED, blocks:[2, 5, 7] lbl20 : MonitorExitStatement: MONITOREXIT : var1_1
                    for (Object object2 : iterator.entrySet()) {
                        jef.b((AmbientModeSupport$AmbientController)object2.getKey(), (Executor)object2.getValue());
                    }
                }
            }
            this.q = null;
        }
        if (!this.J) {
            this.J = true;
            this.h.g(jlt.a, new byte[0]);
        }
        this.h.close();
    }

    @Override
    public final void a(Throwable object) {
        object = iyh.k.d((Throwable)object);
        this.l(0, jlt.g, (iyh)object);
    }

    @Override
    public final ivn c() {
        return this.E;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Runnable d(jge object) {
        Object object2;
        this.g = object;
        Object object3 = new jkb(this.G, this);
        Object object4 = new jke((jkb)object3, new jmc(kmp.t((kmi)object3)));
        object = this.j;
        synchronized (object) {
            object2 = new jkd(this, (jlu)object4);
            this.h = object2;
            this.i = object4 = new jle(this, (jlu)object2);
        }
        object = new CountDownLatch(1);
        object2 = new CountDownLatch(1);
        object4 = new CyclicBarrier(2);
        this.G.execute(new jkq(this, (CountDownLatch)object, (CyclicBarrier)object4, (jkb)object3, (CountDownLatch)object2));
        this.l.execute(new jdg((CyclicBarrier)object4, (CountDownLatch)object2, 20));
        try {
            object3 = this.j;
            synchronized (object3) {
                object2 = this.h;
            }
        }
        catch (Throwable throwable) {
            ((CountDownLatch)object).countDown();
            throw throwable;
        }
        {
            try {
                ((jke)((jkd)object2).b).a.a();
            }
            catch (IOException iOException) {
                ((jkd)object2).a.a(iOException);
            }
            object4 = new khv();
            ((khv)object4).f(7, this.f);
            object2 = this.h;
            ((jkd)object2).c.i(2, (khv)object4);
            try {
                ((jke)((jkd)object2).b).a.j((khv)object4);
            }
            catch (IOException iOException) {
                ((jkd)object2).a.a(iOException);
            }
        }
        ((CountDownLatch)object).countDown();
        this.G.execute(new jhz(this, 8));
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Throwable g() {
        Object object = this.j;
        synchronized (object) {
            iyh iyh2 = this.p;
            if (iyh2 != null) {
                return new iyi(iyh2);
            }
            iyh2 = iyh.k.e("Connection closed");
            return new iyi(iyh2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void h(int n2, iyh iyh2, jck jck2, boolean bl2, jlt object, iwx iwx2) {
        Object object2 = this.j;
        synchronized (object2) {
            jkn jkn2 = (jkn)this.k.remove(n2);
            if (jkn2 != null) {
                if (object != null) {
                    this.h.e(n2, jlt.l);
                }
                if (iyh2 != null) {
                    jkm jkm2 = jkn2.f;
                    object = iwx2;
                    if (iwx2 == null) {
                        object = new iwx();
                    }
                    jkm2.m(iyh2, jck2, bl2, (iwx)object);
                }
                if (!this.q()) {
                    this.s();
                }
                this.i(jkn2);
            }
            return;
        }
    }

    public final void i(jkn jkn2) {
        if (this.K && this.v.isEmpty() && this.k.isEmpty()) {
            this.K = false;
            jex jex2 = this.x;
            if (jex2 != null) {
                jex2.c();
            }
        }
        if (jkn2.s) {
            this.L.c(jkn2, false);
        }
    }

    public final void j(jlt jlt2, String string) {
        this.l(0, jlt2, jks.e(jlt2).a(string));
    }

    public final void k(jkn jkn2) {
        if (!this.K) {
            this.K = true;
            jex jex2 = this.x;
            if (jex2 != null) {
                jex2.b();
            }
        }
        if (jkn2.s) {
            this.L.c(jkn2, true);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l(int n2, jlt object, iyh iyh2) {
        Object object2 = this.j;
        synchronized (object2) {
            Object object3;
            jck jck2;
            Map.Entry entry;
            if (this.p == null) {
                this.p = iyh2;
                this.g.c(iyh2);
            }
            if (object != null && !this.J) {
                this.J = true;
                this.h.g((jlt)((Object)object), new byte[0]);
            }
            Object object4 = this.k.entrySet().iterator();
            while (object4.hasNext()) {
                entry = object4.next();
                if ((Integer)entry.getKey() <= n2) continue;
                object4.remove();
                object = ((jkn)entry.getValue()).f;
                jck2 = jck.b;
                object3 = new iwx();
                ((jbi)object).m(iyh2, jck2, false, (iwx)object3);
                this.i((jkn)entry.getValue());
            }
            object3 = this.v.iterator();
            while (true) {
                if (!object3.hasNext()) {
                    this.v.clear();
                    this.s();
                    return;
                }
                object4 = (jkn)object3.next();
                entry = ((jkn)object4).f;
                jck2 = jck.d;
                object = new iwx();
                ((jbi)((Object)entry)).m(iyh2, jck2, true, (iwx)object);
                this.i((jkn)object4);
            }
        }
    }

    public final void m(jkn jkn2) {
        int n2 = jkn2.f.x;
        boolean bl2 = true;
        boolean bl3 = n2 == -1;
        fxf.B(bl3, "StreamId already assigned");
        n2 = this.F;
        this.k.put(n2, jkn2);
        this.k(jkn2);
        jkm jkm2 = jkn2.f;
        n2 = this.F;
        bl3 = jkm2.x == -1 ? bl2 : false;
        fxf.C(bl3, "the stream has been started with id %s", n2);
        jkm2.x = n2;
        Object object = jkm2.h;
        int n3 = ((jle)object).a;
        if (jkm2 != null) {
            jkm2.w = new jlb((jle)object, n2, n3, jkm2);
            jkm2.y.f.d();
            if (jkm2.u) {
                object = jkm2.g;
                n2 = jkm2.x;
                List list = jkm2.b;
                try {
                    ((jke)((jkd)object).b).a.h(false, n2, list);
                }
                catch (IOException iOException) {
                    ((jkd)object).a.a(iOException);
                }
                jkm2.y.d.a();
                jkm2.b = null;
                object = jkm2.c;
                if (((klm)object).b > 0L) {
                    jkm2.h.a(jkm2.d, jkm2.w, (klm)object, jkm2.e);
                }
                jkm2.u = false;
            }
            if (jkn2.r() != ixa.a && jkn2.r() != ixa.c) {
                this.h.c();
            } else {
                bl3 = jkn2.g;
            }
            n2 = this.F;
            if (n2 >= 0x7FFFFFFD) {
                this.F = Integer.MAX_VALUE;
                this.l(Integer.MAX_VALUE, jlt.a, iyh.k.e("Stream ids exhausted"));
                return;
            }
            this.F = n2 + 2;
            return;
        }
        throw new NullPointerException("stream");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final boolean n(int n2) {
        Object object = this.j;
        synchronized (object) {
            boolean bl2;
            int n3 = this.F;
            boolean bl3 = bl2 = false;
            if (n2 >= n3) return bl3;
            bl3 = bl2;
            if ((n2 & 1) != 1) return bl3;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void o(iyh iyh2) {
        Object object = this.j;
        synchronized (object) {
            if (this.p != null) {
                return;
            }
            this.p = iyh2;
            this.g.c(iyh2);
            this.s();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void p(iyh iyh2) {
        this.o(iyh2);
        Object object = this.j;
        synchronized (object) {
            Object object2;
            Object object3;
            Object object4;
            Object object5 = this.k.entrySet().iterator();
            while (object5.hasNext()) {
                object4 = object5.next();
                object5.remove();
                object3 = ((jkn)object4.getValue()).f;
                object2 = new iwx();
                ((jbi)object3).l(iyh2, false, (iwx)object2);
                this.i((jkn)object4.getValue());
            }
            object3 = this.v.iterator();
            while (true) {
                if (!object3.hasNext()) {
                    this.v.clear();
                    this.s();
                    return;
                }
                object5 = (jkn)object3.next();
                object2 = ((jkn)object5).f;
                jck jck2 = jck.d;
                object4 = new iwx();
                ((jbi)object2).m(iyh2, jck2, true, (iwx)object4);
                this.i((jkn)object5);
            }
        }
    }

    public final boolean q() {
        boolean bl2 = false;
        while (!this.v.isEmpty() && this.k.size() < this.u) {
            this.m((jkn)this.v.poll());
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final jlb[] r() {
        Object object = this.j;
        synchronized (object) {
            jlb[] jlbArray = new jlb[this.k.size()];
            Iterator iterator = this.k.values().iterator();
            int n2 = 0;
            while (iterator.hasNext()) {
                jlbArray[n2] = ((jkn)iterator.next()).f.f();
                ++n2;
            }
            return jlbArray;
        }
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.f("logId", this.E.a);
        gtn2.b("address", this.b);
        return gtn2.toString();
    }
}

