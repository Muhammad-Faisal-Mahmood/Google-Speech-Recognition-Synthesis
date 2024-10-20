/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public final class cld
extends ckz {
    public final Object a = new Object();
    public boolean b;
    public volatile boolean c;
    public Exception d;
    public final jhw e = new jhw();
    private Object f;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final void o() {
        Object object;
        if (!this.b) return;
        Object object2 = this.a;
        // MONITORENTER : object2
        boolean bl2 = this.b;
        // MONITOREXIT : object2
        if (!bl2) {
            object = new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            throw object;
        }
        object2 = ((ckz)this).c();
        object = object2 == null ? (!((ckz)this).e() ? (this.c ? "cancellation" : "unknown issue") : "result ".concat(String.valueOf(String.valueOf(((ckz)this).d())))) : "failure";
        object = new ckt("Complete with: ".concat((String)object), (Throwable)object2);
        throw object;
    }

    @Override
    public final ckz a(ckq ckq2) {
        return ((ckz)this).b(clc.a, ckq2);
    }

    @Override
    public final ckz b(Executor object, ckq ckq2) {
        cld cld2 = new cld();
        object = new cks((Executor)object, ckq2, cld2);
        this.e.c((cla)object);
        this.j();
        return cld2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Exception c() {
        Object object = this.a;
        synchronized (object) {
            return this.d;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object d() {
        Object object = this.a;
        synchronized (object) {
            kl.aq(this.b, "Task is not yet complete");
            if (this.c) {
                CancellationException cancellationException = new CancellationException("Task is already canceled.");
                throw cancellationException;
            }
            Exception exception = this.d;
            if (exception == null) {
                return this.f;
            }
            cky cky2 = new cky(exception);
            throw cky2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean e() {
        Object object = this.a;
        synchronized (object) {
            boolean bl2;
            boolean bl3 = this.b;
            boolean bl4 = bl2 = false;
            if (!bl3) return bl4;
            bl4 = bl2;
            if (this.c) return bl4;
            bl4 = bl2;
            if (this.d != null) return bl4;
            return true;
        }
    }

    @Override
    public final void f(Executor object, cks cks2) {
        object = new cku((Executor)object, cks2, 0);
        this.e.c((cla)object);
        this.j();
    }

    @Override
    public final void g(Executor object, ckv ckv2) {
        object = new cku((Executor)object, ckv2, 2);
        this.e.c((cla)object);
        this.j();
    }

    @Override
    public final void h(Executor object, ckw ckw2) {
        object = new cku((Executor)object, ckw2, 3);
        this.e.c((cla)object);
        this.j();
    }

    @Override
    public final void i(Executor object, ckx ckx2) {
        object = new cku((Executor)object, ckx2, 4);
        this.e.c((cla)object);
        this.j();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j() {
        Object object = this.a;
        synchronized (object) {
            if (!this.b) {
                return;
            }
        }
        this.e.d(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k(Exception exception) {
        a.s(exception, "Exception must not be null");
        Object object = this.a;
        synchronized (object) {
            this.o();
            this.b = true;
            this.d = exception;
        }
        this.e.d(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l(Object object) {
        Object object2 = this.a;
        synchronized (object2) {
            this.o();
            this.b = true;
            this.f = object;
        }
        this.e.d(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void m() {
        Object object = this.a;
        synchronized (object) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.c = true;
        }
        this.e.d(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n(Object object) {
        Object object2 = this.a;
        synchronized (object2) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.f = object;
        }
        this.e.d(this);
    }
}

