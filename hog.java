/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

public final class hog {
    public static final hpm a = new hpm(hog.class);
    public final AtomicReference b = new AtomicReference<hof>(hof.a);
    public final hod c;
    public final hph d;

    public hog(hpn hpn2) {
        this(hpn2, new hod());
    }

    public hog(hpn hpn2, hod hod2) {
        this.d = hph.q(hpn2);
        this.c = hod2;
    }

    public static void g(AutoCloseable autoCloseable, Executor executor) {
        if (autoCloseable != null) {
            try {
                gjf gjf2 = new gjf(autoCloseable, 14);
                executor.execute(gjf2);
                return;
            }
            catch (RejectedExecutionException rejectedExecutionException) {
                hpm hpm2 = a;
                if (hpm2.a().isLoggable(Level.WARNING)) {
                    hpm2.a().logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", String.format("while submitting close to %s; will close inline", executor), rejectedExecutionException);
                }
                hog.g(autoCloseable, (Executor)hom.a);
            }
        }
    }

    private final hog j(hph object) {
        object = new hog((hpn)object);
        this.d(((hog)object).c);
        return object;
    }

    public final hog a(hoe object, Executor executor) {
        object = new hoa(this, object, 0);
        return this.j((hph)hno.g(this.d, (hny)object, executor));
    }

    public final hog b(hoc object, Executor executor) {
        object = new hoa(this, object, 2);
        return this.j((hph)hno.g(this.d, (hny)object, executor));
    }

    public final hpn c() {
        gtf gtf2 = new gtf();
        return hhk.L(hno.f(this.d, gtf2, (Executor)hom.a));
    }

    public final void d(hod hod2) {
        this.e(hof.a, hof.b);
        hod2.a(this.c, (Executor)hom.a);
    }

    public final void e(hof hof2, hof hof3) {
        fxf.G(this.h(hof2, hof3), "Expected state to be %s, but it was %s", (Object)hof2, (Object)hof3);
    }

    public final void f() {
        a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "close", "closing {0}", this);
        this.c.close();
    }

    protected final void finalize() {
        if (((hof)((Object)this.b.get())).equals((Object)hof.a)) {
            a.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ClosingFuture", "finalize", "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            this.i();
        }
    }

    public final boolean h(hof hof2, hof hof3) {
        return a.l(this.b, (Object)hof2, (Object)hof3);
    }

    public final hph i() {
        block4: {
            block5: {
                block6: {
                    block7: {
                        block3: {
                            block2: {
                                if (!this.h(hof.a, hof.c)) break block2;
                                a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "finishToFuture", "will close {0}", this);
                                this.d.c(new gjf(this, 15, null), (Executor)hom.a);
                                break block3;
                            }
                            int n2 = ((hof)((Object)this.b.get())).ordinal();
                            if (n2 == 0) break block4;
                            if (n2 == 1) break block5;
                            if (n2 == 2 || n2 == 3 || n2 == 4) break block6;
                            if (n2 == 5) break block7;
                        }
                        return this.d;
                    }
                    throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
                }
                throw new IllegalStateException("Cannot call finishToFuture() twice");
            }
            throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
        }
        throw new AssertionError();
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("state", this.b.get());
        gtn2.a(this.d);
        return gtn2.toString();
    }
}

