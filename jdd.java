/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class jdd
extends itz {
    private static final Logger c = Logger.getLogger(jdd.class.getName());
    private static final itz d = new jda();
    public final ius a;
    public itz b;
    private final ScheduledFuture e;
    private final Executor f;
    private volatile boolean g;
    private iyh h;
    private List i = new ArrayList();
    private jdc j;
    private fvc k;

    protected jdd(Executor object, ScheduledExecutorService scheduledExecutorService, iut iut2) {
        a.s(object, "callExecutor");
        this.f = object;
        a.s(scheduledExecutorService, "scheduler");
        object = ius.k();
        this.a = object;
        iut iut3 = ((ius)object).b();
        object = null;
        if (iut2 != null || iut3 != null) {
            Object object2;
            long l2 = iut2 != null ? iut2.b(TimeUnit.NANOSECONDS) : Long.MAX_VALUE;
            long l3 = l2;
            if (iut3 != null) {
                l3 = l2;
                if (iut3.b(TimeUnit.NANOSECONDS) < l2) {
                    l2 = iut3.b(TimeUnit.NANOSECONDS);
                    object2 = c;
                    l3 = l2;
                    if (((Logger)object2).isLoggable(Level.FINE)) {
                        object = new StringBuilder(String.format(Locale.US, "Call timeout set to '%d' ns, due to context deadline.", l2));
                        if (iut2 == null) {
                            ((StringBuilder)object).append(" Explicit call timeout was not set.");
                        } else {
                            l3 = iut2.b(TimeUnit.NANOSECONDS);
                            ((StringBuilder)object).append(String.format(Locale.US, " Explicit call timeout was '%d' ns.", l3));
                        }
                        ((Logger)object2).logp(Level.FINE, "io.grpc.internal.DelayedClientCall", "scheduleDeadlineIfNeeded", ((StringBuilder)object).toString());
                        l3 = l2;
                    }
                }
            }
            l2 = Math.abs(l3) / TimeUnit.SECONDS.toNanos(1L);
            long l4 = Math.abs(l3);
            long l5 = TimeUnit.SECONDS.toNanos(1L);
            object2 = new StringBuilder();
            boolean bl2 = iut2 == null ? true : (iut3 == null ? false : iut3.e(iut2));
            object = true != bl2 ? "CallOptions" : "Context";
            if (l3 < 0L) {
                ((StringBuilder)object2).append("ClientCall started after ");
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(" deadline was exceeded. Deadline has been exceeded for ");
            } else {
                ((StringBuilder)object2).append("Deadline ");
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(" will be exceeded in ");
            }
            ((StringBuilder)object2).append(l2);
            ((StringBuilder)object2).append(String.format(Locale.US, ".%09d", l4 % l5));
            ((StringBuilder)object2).append("s. ");
            object = scheduledExecutorService.schedule(new hsk((Object)this, object2, 16, null), l3, TimeUnit.NANOSECONDS);
        }
        this.e = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void j(Runnable runnable) {
        synchronized (this) {
            if (!this.g) {
                this.i.add(runnable);
                return;
            }
        }
        runnable.run();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void a(fvc fvc2, iwx iwx2) {
        boolean bl2 = this.k == null;
        fxf.B(bl2, "already started");
        // MONITORENTER : this
        a.s(fvc2, "listener");
        this.k = fvc2;
        iyh iyh2 = this.h;
        bl2 = this.g;
        fvc fvc3 = fvc2;
        if (!bl2) {
            fvc3 = new jdc(fvc2);
            this.j = fvc3;
        }
        // MONITOREXIT : this
        if (iyh2 != null) {
            this.f.execute(new jdb(this, fvc3, iyh2));
            return;
        }
        if (bl2) {
            this.b.a(fvc3, iwx2);
            return;
        }
        this.j(new hst(this, fvc3, iwx2, 9));
    }

    protected void b() {
    }

    @Override
    public final void c(String object, Throwable throwable) {
        Object object2 = iyh.c;
        object = object != null ? ((iyh)object2).e((String)object) : ((iyh)object2).e("Call cancelled without message");
        object2 = object;
        if (throwable != null) {
            object2 = ((iyh)object).d(throwable);
        }
        this.g((iyh)object2, false);
    }

    @Override
    public final void d() {
        this.j(new iuk(this, 8));
    }

    @Override
    public final void e(int n2) {
        if (this.g) {
            this.b.e(n2);
            return;
        }
        this.j(new cdw(this, n2, 9));
    }

    @Override
    public final void f(Object object) {
        if (this.g) {
            this.b.f(object);
            return;
        }
        this.j(new hsk((Object)this, object, 18, null));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void g(iyh iyh2, boolean bl2) {
        boolean bl3;
        fvc fvc2;
        // MONITORENTER : this
        if (this.b == null) {
            this.i(d);
            fvc2 = this.k;
            this.h = iyh2;
            bl3 = false;
        } else {
            if (bl2) {
                // MONITOREXIT : this
                return;
            }
            bl3 = true;
            fvc2 = null;
        }
        // MONITOREXIT : this
        if (bl3) {
            this.j(new hsk((Object)this, (Object)iyh2, 17, null));
        } else {
            if (fvc2 != null) {
                this.f.execute(new jdb(this, fvc2, iyh2));
            }
            this.h();
        }
        this.b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h() {
        Object object = new ArrayList();
        while (true) {
            List list;
            synchronized (this) {
                if (this.i.isEmpty()) {
                    this.i = null;
                    this.g = true;
                    object = this.j;
                    // MONITOREXIT @DISABLED, blocks:[3, 4, 7] lbl8 : MonitorExitStatement: MONITOREXIT : this
                    if (object != null) {
                        this.f.execute(new jcz(this, (jdc)object));
                    }
                    return;
                }
                list = this.i;
                this.i = object;
            }
            object = list.iterator();
            while (object.hasNext()) {
                ((Runnable)object.next()).run();
            }
            list.clear();
            object = list;
        }
    }

    public final void i(itz itz2) {
        Object object = this.b;
        boolean bl2 = object == null;
        fxf.E(bl2, "realCall already set to %s", object);
        object = this.e;
        if (object != null) {
            object.cancel(false);
        }
        this.b = itz2;
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("realCall", this.b);
        return gtn2.toString();
    }
}

