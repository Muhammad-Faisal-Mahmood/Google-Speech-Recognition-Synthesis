/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import j$.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.logging.Level;

abstract class hns
extends hnw {
    private static final hpm b = new hpm(hns.class);
    private gzm c;
    private final boolean d;
    private final boolean e;

    public hns(gzm gzm2, boolean bl2, boolean bl3) {
        super(gzm2.size());
        fxf.K(gzm2);
        this.c = gzm2;
        this.d = bl2;
        this.e = bl3;
    }

    private final void t(int n2, Future future) {
        try {
            this.e(n2, a.h(future));
            return;
        }
        catch (Throwable throwable) {
            this.u(throwable);
            return;
        }
        catch (ExecutionException executionException) {
            this.u(executionException.getCause());
            return;
        }
    }

    private final void u(Throwable throwable) {
        fxf.K(throwable);
        if (this.d && !this.n(throwable)) {
            Set set;
            Set set2 = set = this.seenExceptions;
            if (set == null) {
                set2 = hhk.s();
                ((hnw)this).d(set2);
                hnw.a.b(this, set2);
                set2 = Objects.requireNonNull(this.seenExceptions);
            }
            if (hns.w(set2, throwable)) {
                hns.v(throwable);
                return;
            }
        }
        if (throwable instanceof Error) {
            hns.v(throwable);
        }
    }

    private static void v(Throwable throwable) {
        String string = true != throwable instanceof Error ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error";
        b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", string, throwable);
    }

    private static boolean w(Set set, Throwable throwable) {
        while (throwable != null) {
            if (!set.add(throwable)) {
                return false;
            }
            throwable = throwable.getCause();
        }
        return true;
    }

    @Override
    protected final String a() {
        gzm gzm2 = this.c;
        if (gzm2 != null) {
            return "futures=".concat(((Object)gzm2).toString());
        }
        return super.a();
    }

    @Override
    protected final void b() {
        Object object = this.c;
        this.s(hnr.a);
        boolean bl2 = this.isCancelled();
        boolean bl3 = object != null;
        if (bl2 & bl3) {
            bl2 = this.p();
            object = ((gzm)object).k();
            while (object.hasNext()) {
                ((Future)object.next()).cancel(bl2);
            }
        }
    }

    @Override
    public final void d(Set set) {
        fxf.K(set);
        if (!this.isCancelled()) {
            hns.w(set, Objects.requireNonNull(this.i()));
        }
    }

    public abstract void e(int var1, Object var2);

    public final void f(gzm object) {
        int n2 = hnw.a.a(this);
        int n3 = 0;
        boolean bl2 = n2 >= 0;
        fxf.B(bl2, "Less than 0 remaining futures");
        if (n2 == 0) {
            if (object != null) {
                hdx hdx2 = ((gzm)object).k();
                while (hdx2.hasNext()) {
                    object = (Future)hdx2.next();
                    if (!object.isCancelled()) {
                        this.t(n3, (Future)object);
                    }
                    ++n3;
                }
            }
            this.seenExceptions = null;
            this.g();
            this.s(hnr.b);
        }
    }

    public abstract void g();

    final void q() {
        Objects.requireNonNull(this.c);
        if (this.c.isEmpty()) {
            this.g();
            return;
        }
        if (this.d) {
            hdx hdx2 = this.c.k();
            int n2 = 0;
            while (hdx2.hasNext()) {
                hpn hpn2 = (hpn)hdx2.next();
                if (hpn2.isDone()) {
                    this.r(n2, hpn2);
                } else {
                    hpn2.c(new hnp(this, n2, hpn2), (Executor)hom.a);
                }
                ++n2;
            }
        } else {
            gzm gzm2 = this.e ? this.c : null;
            hnq hnq2 = new hnq(this, gzm2);
            hdx hdx3 = this.c.k();
            while (hdx3.hasNext()) {
                hpn hpn3 = (hpn)hdx3.next();
                if (hpn3.isDone()) {
                    this.f(gzm2);
                    continue;
                }
                hpn3.c(hnq2, (Executor)hom.a);
            }
        }
    }

    public final void r(int n2, hpn hpn2) {
        try {
            if (hpn2.isCancelled()) {
                this.c = null;
                this.cancel(false);
            } else {
                this.t(n2, hpn2);
            }
            return;
        }
        finally {
            this.f(null);
        }
    }

    public void s(hnr hnr2) {
        fxf.K((Object)hnr2);
        this.c = null;
    }
}

