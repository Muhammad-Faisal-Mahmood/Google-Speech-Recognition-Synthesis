/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.concurrent.Executor;

public final class gol
implements Runnable,
gpf {
    public gpc a;
    private gpc b;
    private final boolean c;
    private boolean d;
    private boolean e;
    private boolean f = false;

    public gol(gpc gpc2, boolean bl2) {
        this.a = gpc2;
        this.b = gpc2;
        this.c = fpk.h(Thread.currentThread());
        this.f = bl2;
    }

    private final void b() {
        boolean bl2 = true;
        this.d = true;
        boolean bl3 = this.c;
        gpc gpc2 = this.a;
        if (!bl3 || this.e || !fpk.g()) {
            bl2 = false;
        }
        gpc2.n(bl2);
        this.a = null;
    }

    public final void a(hpn hpn2) {
        if (!this.d) {
            if (!this.e) {
                this.e = true;
                this.a.p();
                hpn2.c(this, (Executor)hom.a);
                return;
            }
            throw new IllegalStateException("Signal is already attached to future");
        }
        throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void close() {
        gpc gpc2 = this.b;
        try {
            block12: {
                block11: {
                    this.b = null;
                    if (this.e) break block11;
                    if (this.d) break block12;
                    this.b();
                }
                if (this.f) {
                    gno.w(goj.a);
                }
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Span was already closed!");
            throw illegalStateException;
        }
        finally {
            if (gpc2 != null) {
                gpc2.close();
            }
        }
    }

    @Override
    public final void run() {
        if (!this.d && this.e) {
            this.b();
            return;
        }
        fpk.e(new gni(2));
    }
}

