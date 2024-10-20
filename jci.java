/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

final class jci
extends itz {
    public static final double a;
    private static final Logger k;
    public final ixb b;
    public final Executor c;
    public final jby d;
    public final ius e;
    public jcc f;
    public itw g;
    public jcj h;
    public final ScheduledExecutorService i;
    public iuw j = iuw.b;
    private final boolean l;
    private final boolean m;
    private boolean n;
    private boolean o;
    private final jfe p;

    static {
        k = Logger.getLogger(jci.class.getName());
        "gzip".getBytes(Charset.forName("US-ASCII"));
        a = TimeUnit.SECONDS.toNanos(1L);
    }

    public jci(ixb object, Executor executor, itw itw2, jfe jfe2, ScheduledExecutorService scheduledExecutorService, jby jby2) {
        Object object2 = iug.a;
        this.b = object;
        object2 = object.b;
        System.identityHashCode(this);
        int n2 = jnr.a;
        object2 = hom.a;
        boolean bl2 = false;
        if (executor == object2) {
            this.c = new jii();
            this.l = true;
        } else {
            this.c = new jim(executor);
            this.l = false;
        }
        this.d = jby2;
        this.e = ius.k();
        object = object.a;
        if (object == ixa.a || object == ixa.c) {
            bl2 = true;
        }
        this.m = bl2;
        this.g = itw2;
        this.p = jfe2;
        this.i = scheduledExecutorService;
    }

    private final void g(Object object) {
        block7: {
            boolean bl2 = this.h != null;
            fxf.B(bl2, "Not started");
            fxf.B(this.n ^ true, "call was cancelled");
            fxf.B(this.o ^ true, "call was half-closed");
            try {
                jcj jcj2 = this.h;
                if (jcj2 instanceof jid) {
                    jcj2 = (jid)jcj2;
                    Object object2 = ((jid)jcj2).q;
                    if (((jhy)object2).a) {
                        ((jhy)object2).f.a.n(((jid)jcj2).e.b(object));
                    } else {
                        object2 = new jhs((jid)jcj2, object);
                        ((jid)jcj2).s((jhu)object2);
                    }
                } else {
                    jcj2.n(this.b.b(object));
                }
                if (this.m) break block7;
            }
            catch (Error error) {
                this.h.c(iyh.c.e("Client sendMessage() failed with Error"));
                throw error;
            }
            catch (RuntimeException runtimeException) {
                this.h.c(iyh.c.d(runtimeException).e("Failed to stream message"));
                return;
            }
            this.h.d();
        }
        return;
    }

    @Override
    public final void a(fvc object, iwx object2) {
        int n2 = jnr.a;
        boolean bl2 = this.h == null;
        fxf.B(bl2, "Already started");
        fxf.B(this.n ^ true, "call was cancelled");
        a.s(object, "observer");
        a.s(object2, "headers");
        if (!this.e.i()) {
            Object object3;
            Object object4;
            Object object5;
            Object object6 = (iuc[])this.g.g(jgb.a);
            if (object6 != null) {
                object5 = object6.b;
                if (object5 != null) {
                    object5 = iut.c(object5.longValue(), TimeUnit.NANOSECONDS);
                    object4 = this.g.b;
                    if (object4 == null || object5.a((iut)object4) < 0) {
                        this.g = this.g.b((iut)object5);
                    }
                }
                if ((object5 = object6.c) != null) {
                    if (object5.booleanValue()) {
                        object5 = itw.a(this.g);
                        object5.e = Boolean.TRUE;
                        object5 = new itw((itu)object5);
                    } else {
                        object5 = itw.a(this.g);
                        object5.e = Boolean.FALSE;
                        object5 = new itw((itu)object5);
                    }
                    this.g = object5;
                }
                if ((object5 = object6.d) != null) {
                    object3 = this.g;
                    object4 = ((itw)object3).e;
                    this.g = object4 != null ? ((itw)object3).d(Math.min((Integer)object4, object6.d)) : ((itw)object3).d(object5.intValue());
                }
                if ((object3 = object6.e) != null) {
                    object4 = this.g;
                    object5 = ((itw)object4).f;
                    this.g = object5 != null ? ((itw)object4).e(Math.min(object5.intValue(), object6.e)) : ((itw)object4).e((Integer)object3);
                }
            }
            object4 = iud.a;
            object5 = this.j;
            ((iwx)object2).e(jeb.g);
            ((iwx)object2).e(jeb.c);
            if (object4 != iud.a) {
                ((iwx)object2).g(jeb.c, "identity");
            }
            ((iwx)object2).e(jeb.d);
            object5 = object5.c;
            if (((Object)object5).length != 0) {
                ((iwx)object2).g(jeb.d, object5);
            }
            ((iwx)object2).e(jeb.e);
            ((iwx)object2).e(jeb.f);
            object3 = this.b();
            bl2 = object3 != null && ((iut)object3).equals(this.e.b());
            object5 = new jcc(this, (iut)object3, bl2);
            this.f = object5;
            if (object3 != null && object5.c <= 0L) {
                object5 = jeb.l(this.g, 0, false);
                object2 = "Context";
                if (!bl2) {
                    object2 = "CallOptions";
                }
                object6 = (Long)this.g.g(iuc.f);
                double d2 = this.f.c;
                double d3 = a;
                d2 /= d3;
                d3 = object6 == null ? 0.0 : (double)object6.longValue() / d3;
                object2 = String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", object2, d2, d3);
                this.h = new jdq(iyh.e.e((String)object2), (iuc[])object5);
            } else {
                jfe jfe2 = this.p;
                ixb ixb2 = this.b;
                itw itw2 = this.g;
                ius ius2 = this.e;
                if (!jfe2.b.P) {
                    object6 = jeb.l(itw2, 0, false);
                    object5 = ius2.a();
                    try {
                        object2 = jfe2.b.y.b(ixb2, (iwx)object2, itw2, (iuc[])object6);
                    }
                    finally {
                        ius2.f((ius)object5);
                    }
                } else {
                    object6 = (jgb)itw2.g(jgb.a);
                    object5 = object6 == null ? null : object6.f;
                    object6 = object6 == null ? null : object6.g;
                    object2 = new jid(jfe2, ixb2, (iwx)object2, itw2, (jie)object5, (jec)object6, ius2);
                }
                this.h = object2;
            }
            if (this.l) {
                this.h.f();
            }
            if ((object2 = this.g.e) != null) {
                this.h.k((Integer)object2);
            }
            if ((object2 = this.g.f) != null) {
                this.h.l((Integer)object2);
            }
            if (object3 != null) {
                this.h.i((iut)object3);
            }
            this.h.h((iuf)object4);
            this.h.j(this.j);
            this.d.b();
            this.h.m(new jch(this, (fvc)object));
            object2 = this.f;
            if (!((jcc)object2).e) {
                if (((jcc)object2).b && !((jcc)object2).a && (object = ((jcc)object2).f.i) != null) {
                    ((jcc)object2).d = object.schedule(new jey((Runnable)object2), ((jcc)object2).c, TimeUnit.NANOSECONDS);
                }
                ((jcc)object2).f.e.d((ium)object2, (Executor)hom.a);
                if (((jcc)object2).e) {
                    ((jcc)object2).c();
                }
            }
            return;
        }
        this.h = jgo.a;
        this.c.execute(new jcb(this, (fvc)object));
    }

    public final iut b() {
        iut iut2;
        iut iut3;
        block6: {
            block5: {
                block4: {
                    iut3 = this.g.b;
                    iut2 = this.e.b();
                    if (iut3 != null) break block4;
                    iut3 = iut2;
                    break block5;
                }
                if (iut2 != null) break block6;
            }
            return iut3;
        }
        iut3.d(iut2);
        if (!iut3.e(iut2)) {
            return iut2;
        }
        return iut3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c(String object, Throwable object2) {
        int n2 = jnr.a;
        Object object3 = object2;
        if (object == null) {
            object3 = object2;
            if (object2 == null) {
                object3 = new CancellationException("Cancelled without a message or cause");
                k.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", (Throwable)object3);
            }
        }
        if (this.n) {
            return;
        }
        this.n = true;
        try {
            if (this.h != null) {
                object2 = iyh.c;
                object = object != null ? ((iyh)object2).e((String)object) : ((iyh)object2).e("Call cancelled without message");
                object2 = object;
                if (object3 != null) {
                    object2 = ((iyh)object).d((Throwable)object3);
                }
                this.h.c((iyh)object2);
            }
            if ((object = this.f) == null) return;
            ((jcc)object).c();
            return;
        }
        catch (Throwable throwable) {
            object2 = this.f;
            if (object2 == null) {
                throw throwable;
            }
            ((jcc)object2).c();
            throw throwable;
        }
    }

    @Override
    public final void d() {
        int n2 = jnr.a;
        boolean bl2 = this.h != null;
        fxf.B(bl2, "Not started");
        fxf.B(this.n ^ true, "call was cancelled");
        fxf.B(this.o ^ true, "call already half-closed");
        this.o = true;
        this.h.e();
    }

    @Override
    public final void e(int n2) {
        int n3 = jnr.a;
        boolean bl2 = this.h != null;
        fxf.B(bl2, "Not started");
        fxf.r(true, "Number requested must be non-negative");
        this.h.g(n2);
    }

    @Override
    public final void f(Object object) {
        int n2 = jnr.a;
        this.g(object);
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("method", this.b);
        return gtn2.toString();
    }
}

