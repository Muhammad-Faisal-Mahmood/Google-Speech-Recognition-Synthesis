/*
 * Decompiled with CFR 0.152.
 */
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

public final class jfs
extends iwk
implements ivm {
    public static final Logger a = Logger.getLogger(jfs.class.getName());
    static final iyh b;
    static final iyh c;
    public static final jgd d;
    public static final ivl e;
    public static final iwa f;
    public static final itz g;
    public final AtomicBoolean A;
    public boolean B;
    public volatile boolean C;
    public final jbx D;
    public final jby E;
    public final jca F;
    public final ity G;
    public final ivk H;
    public final jfp I;
    public jgd J;
    public final jgd K;
    public boolean L;
    public final boolean M;
    public final long N;
    public final long O;
    public final boolean P;
    final jeg Q;
    public final jfe R;
    public int S;
    public final dml T;
    private final String U;
    private final URI V;
    private final ixj W;
    private final ixc X;
    private final jgp Y;
    private final jfi Z;
    private final jfi aa;
    private final long ab;
    private final itx ac;
    private volatile iwf ad;
    private final Set ae;
    private final CountDownLatch af;
    private final jge ag;
    private final jhm ah;
    private final ksb ai;
    public final ivn h;
    public final jco i;
    public final jfq j;
    public final Executor k;
    public final jjt l;
    final iym m;
    public final iuw n;
    public final jcv o;
    public final List p;
    public final String q;
    public ixi r;
    public boolean s;
    public jfk t;
    public boolean u;
    public final Set v;
    public Collection w;
    public final Object x;
    public final jdf y;
    public final jfr z;

    static {
        iyh.k.e("Channel shutdownNow invoked");
        b = iyh.k.e("Channel shutdown invoked");
        c = iyh.k.e("Subchannel shutdown invoked");
        d = new jgd(null, new HashMap(), new HashMap(), null, null, null);
        e = new jfa();
        f = new jgq();
        g = new jfd();
    }

    public jfs(jfy object, jco object2, URI object3, ixj ixj2, jgp jgp2, gui gui2, List list, jjt jjt2) {
        boolean bl2;
        jfi jfi2;
        iym iym2;
        this.m = iym2 = new iym(new kmy(this, 1));
        this.o = new jcv();
        this.v = new HashSet(16, 0.75f);
        this.x = new Object();
        this.ae = new HashSet(1, 0.75f);
        this.z = new jfr(this);
        this.A = new AtomicBoolean(false);
        this.af = new CountDownLatch(1);
        this.S = 1;
        this.J = d;
        this.L = false;
        this.T = new dml(null, null);
        Object object4 = iut.c;
        jfh jfh2 = new jfh(this);
        this.ag = jfh2;
        this.Q = new jfj(this);
        this.R = object4 = new jfe(this);
        Object object5 = ((jfy)object).l;
        a.s(object5, "target");
        this.U = object5;
        Object object6 = ivn.b("Channel", (String)object5);
        this.h = object6;
        this.l = jjt2;
        Object object7 = ((jfy)object).g;
        a.s(object7, "executorPool");
        this.Y = object7;
        Object object8 = object7.a();
        a.s(object8, "executor");
        this.k = object8;
        object7 = ((jfy)object).h;
        a.s(object7, "offloadExecutorPool");
        this.aa = jfi2 = new jfi((jgp)object7);
        this.i = object7 = new jbw((jco)object2, jfi2);
        new jbw((jco)object2, jfi2);
        object2 = new jfq(object7.c());
        this.j = object2;
        long l2 = jjt2.a();
        Object object9 = new StringBuilder("Channel for '");
        ((StringBuilder)object9).append((String)object5);
        ((StringBuilder)object9).append("'");
        this.F = object6 = new jca((ivn)object6, l2, ((StringBuilder)object9).toString());
        this.G = object9 = new jbz((jca)object6, jjt2);
        object5 = jeb.m;
        this.P = bl2 = ((jfy)object).q;
        this.ai = object6 = new ksb(iwj.b());
        this.V = object3;
        this.W = ixj2;
        object6 = new ixh(bl2, (ksb)object6);
        fxf.K(object5);
        fxf.K(iym2);
        fxf.K(object2);
        fxf.K(object9);
        boolean bl3 = false;
        this.X = object2 = new ixc(443, (ixu)object5, iym2, (ixh)object6, (ScheduledExecutorService)object2, (ity)object9, jfi2);
        this.r = jfs.l((URI)object3, ixj2, (ixc)object2);
        this.Z = new jfi(jgp2);
        this.y = object2 = new jdf((Executor)object8, iym2);
        ((jdf)object2).f = jfh2;
        ((jdf)object2).c = new iuk(jfh2, 10);
        ((jdf)object2).d = new iuk(jfh2, 11);
        ((jdf)object2).e = new iuk(jfh2, 12);
        object2 = ((jfy)object).s;
        if (object2 != null) {
            object2 = ((ixh)object6).a((Map)object2);
            object3 = ((ixd)object2).a;
            bl2 = object3 == null;
            fxf.E(bl2, "Default config is invalid: %s", object3);
            this.K = object2 = (jgd)((ixd)object2).b;
            ((jfe)object4).a = ((jgd)object2).a;
        } else {
            this.K = null;
        }
        this.M = true;
        this.I = object2 = new jfp(this, this.r.a());
        this.ac = fvc.S((itx)object2, list);
        this.p = new ArrayList(((jfy)object).k);
        a.s(gui2, "stopwatchSupplier");
        l2 = ((jfy)object).p;
        if (l2 == -1L) {
            this.ab = -1L;
        } else {
            bl2 = bl3;
            if (l2 >= jfy.c) {
                bl2 = true;
            }
            fxf.u(bl2, "invalid idleTimeoutMillis %s", l2);
            this.ab = ((jfy)object).p;
        }
        this.ah = new jhm(new jel(this, 9), iym2, object7.c(), new guh());
        object2 = ((jfy)object).n;
        a.s(object2, "decompressorRegistry");
        this.n = object2;
        a.s(((jfy)object).o, "compressorRegistry");
        this.q = ((jfy)object).m;
        this.O = 0x1000000L;
        this.N = 0x100000L;
        this.D = object2 = new jfb(jjt2);
        this.E = object2.a();
        object = ((jfy)object).r;
        fxf.K(object);
        this.H = object;
        ivk.b(((ivk)object).d, this);
        kmp.O();
    }

    static ixi l(URI uRI, ixj object, ixc ixc2) {
        if ((object = ((ixe)object).a(uRI, ixc2)) != null) {
            return new jih((ixi)object, new jbu(ixc2.e, ixc2.c), ixc2.c);
        }
        throw new IllegalArgumentException("cannot create a NameResolver for ".concat(String.valueOf(String.valueOf(uRI))));
    }

    @Override
    public final itz a(ixb ixb2, itw itw2) {
        return this.ac.a(ixb2, itw2);
    }

    @Override
    public final String b() {
        return this.ac.b();
    }

    @Override
    public final ivn c() {
        return this.h;
    }

    public final Executor e(itw object) {
        Executor executor = ((itw)object).c;
        object = executor;
        if (executor == null) {
            object = this.k;
        }
        return object;
    }

    public final void f(boolean bl2) {
        ScheduledFuture scheduledFuture;
        jhm jhm2 = this.ah;
        jhm2.e = false;
        if (bl2 && (scheduledFuture = jhm2.f) != null) {
            scheduledFuture.cancel(false);
            jhm2.f = null;
        }
    }

    final void g() {
        this.m.c();
        if (!this.A.get() && !this.u) {
            if (!this.Q.a.isEmpty()) {
                this.f(false);
            } else {
                this.i();
            }
            if (this.t == null) {
                this.G.a(2, "Exiting idle mode");
                Object object = new jfk(this);
                ((jfk)object).a = new jbp(this.ai, (ivz)object);
                this.t = object;
                this.o.a(iui.a);
                object = new jfl(this, (jfk)object, this.r);
                this.r.d((ixf)object);
                this.s = true;
            }
        }
    }

    public final void h() {
        if (!this.C && this.A.get() && this.v.isEmpty() && this.ae.isEmpty()) {
            this.G.a(2, "Terminated");
            ivk.c(this.H.d, this);
            this.Y.b(this.k);
            this.Z.b();
            this.aa.b();
            this.i.close();
            this.C = true;
            this.af.countDown();
        }
    }

    public final void i() {
        long l2 = this.ab;
        if (l2 == -1L) {
            return;
        }
        jhm jhm2 = this.ah;
        long l3 = TimeUnit.MILLISECONDS.toNanos(l2);
        l2 = jhm2.a() + l3;
        jhm2.e = true;
        if (l2 - jhm2.d < 0L || jhm2.f == null) {
            ScheduledFuture scheduledFuture = jhm2.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            jhm2.f = jhm2.a.schedule(new jel(jhm2, 19), l3, TimeUnit.NANOSECONDS);
        }
        jhm2.d = l2;
    }

    public final void j(boolean bl2) {
        Object object;
        this.m.c();
        if (bl2) {
            fxf.B(this.s, "nameResolver is not started");
            boolean bl3 = this.t != null;
            fxf.B(bl3, "lbHelper is null");
        }
        if ((object = this.r) != null) {
            ((ixi)object).c();
            this.s = false;
            this.r = bl2 ? jfs.l(this.V, this.W, this.X) : null;
        }
        if ((object = this.t) != null) {
            object = ((jfk)object).a;
            ((jbp)object).b.e();
            ((jbp)object).b = null;
            this.t = null;
        }
        this.ad = null;
    }

    public final void k(iwf iwf2) {
        this.ad = iwf2;
        this.y.a(iwf2);
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.f("logId", this.h.a);
        gtn2.b("target", this.U);
        return gtn2.toString();
    }
}

