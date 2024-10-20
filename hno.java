/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public abstract class hno
extends hov
implements Runnable {
    hpn a;
    Object b;

    public hno(hpn hpn2, Object object) {
        fxf.K(hpn2);
        this.a = hpn2;
        this.b = object;
    }

    public static hpn f(hpn hpn2, gte object, Executor executor) {
        object = new hnn(hpn2, (gte)object);
        hpn2.c((Runnable)object, hhk.G(executor, (hnk)object));
        return object;
    }

    public static hpn g(hpn hpn2, hny object, Executor executor) {
        fxf.K(executor);
        object = new hnm(hpn2, (hny)object);
        hpn2.c((Runnable)object, hhk.G(executor, (hnk)object));
        return object;
    }

    @Override
    protected final String a() {
        Object object = this.a;
        Object object2 = this.b;
        CharSequence charSequence = super.a();
        object = object != null ? a.ar(object, "inputFuture=[", "], ") : "";
        if (object2 != null) {
            object2 = object2.toString();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append("function=[");
            ((StringBuilder)charSequence).append((String)object2);
            ((StringBuilder)charSequence).append("]");
            return ((StringBuilder)charSequence).toString();
        }
        if (charSequence != null) {
            return ((String)object).concat((String)charSequence);
        }
        return null;
    }

    @Override
    protected final void b() {
        this.l(this.a);
        this.a = null;
        this.b = null;
    }

    public abstract Object d(Object var1, Object var2);

    public abstract void e(Object var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Object object = this.a;
        Object object2 = this.b;
        boolean bl2 = this.isCancelled();
        boolean bl3 = true;
        boolean bl4 = object == null;
        if (object2 != null) {
            bl3 = false;
        }
        if (bl2 | bl4 | bl3) {
            return;
        }
        this.a = null;
        if (object.isCancelled()) {
            this.o((hpn)object);
            return;
        }
        try {
            object = hhk.S((Future)object);
        }
        catch (Error error) {
            this.n(error);
            return;
        }
        catch (Exception exception) {
            this.n(exception);
            return;
        }
        catch (ExecutionException executionException) {
            this.n(executionException.getCause());
            return;
        }
        catch (CancellationException cancellationException) {
            this.cancel(false);
            return;
        }
        try {
            object2 = this.d(object2, object);
            this.b = null;
            this.e(object2);
            return;
        }
        catch (Throwable throwable) {
            try {
                hhk.D(throwable);
                this.n(throwable);
                return;
            }
            finally {
                this.b = null;
            }
        }
    }
}

