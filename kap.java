/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class kap
implements hpn {
    private final jwi a;
    private final hqa b;
    private boolean c;

    public kap(jwi jwi2) {
        this.a = jwi2;
        this.b = new hqa();
    }

    private static final void d(Object object) {
        if (!(object instanceof kao)) {
            return;
        }
        throw new CancellationException().initCause(((kao)object).a);
    }

    public final void a(Object object) {
        this.b.m(object);
    }

    public final void b(Throwable throwable) {
        if (throwable instanceof CancellationException) {
            this.b.m(new kao((CancellationException)throwable));
            return;
        }
        if (this.b.n(throwable)) {
            this.c = true;
        }
    }

    @Override
    public final void c(Runnable runnable, Executor executor) {
        this.b.c(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean bl2) {
        if (this.b.cancel(bl2)) {
            jvf.j(this.a);
            return true;
        }
        return false;
    }

    public final Object get() {
        Object object = this.b.get();
        kap.d(object);
        return object;
    }

    public final Object get(long l2, TimeUnit object) {
        object = this.b.get(l2, (TimeUnit)((Object)object));
        kap.d(object);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean isCancelled() {
        boolean bl2;
        boolean bl3 = this.b.isCancelled();
        boolean bl4 = bl2 = true;
        if (bl3) return bl4;
        if (!this.isDone()) return false;
        if (this.c) return false;
        try {
            bl4 = a.h(this.b) instanceof kao;
            if (!bl4) return false;
            return bl2;
        }
        catch (ExecutionException executionException) {
            this.c = true;
            return false;
        }
        catch (CancellationException cancellationException) {
            return bl2;
        }
    }

    @Override
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        StringBuilder stringBuilder;
        block7: {
            stringBuilder = new StringBuilder();
            stringBuilder.append(super.toString());
            stringBuilder.append("[status=");
            if (this.isDone()) {
                try {
                    Object object = a.h(this.b);
                    if (object instanceof kao) {
                        CancellationException cancellationException = ((kao)object).a;
                        object = new StringBuilder("CANCELLED, cause=[");
                        ((StringBuilder)object).append(cancellationException);
                        ((StringBuilder)object).append("]");
                        stringBuilder.append(((StringBuilder)object).toString());
                        break block7;
                    }
                    stringBuilder.append(a.ak(object, "SUCCESS, result=[", "]"));
                }
                catch (Throwable throwable) {
                    StringBuilder stringBuilder2 = new StringBuilder("UNKNOWN, cause=[");
                    stringBuilder2.append(throwable.getClass());
                    stringBuilder2.append(" thrown from get()]");
                    stringBuilder.append(stringBuilder2.toString());
                }
                catch (ExecutionException executionException) {
                    Throwable throwable = executionException.getCause();
                    StringBuilder stringBuilder3 = new StringBuilder("FAILURE, cause=[");
                    stringBuilder3.append(throwable);
                    stringBuilder3.append("]");
                    stringBuilder.append(stringBuilder3.toString());
                }
                catch (CancellationException cancellationException) {
                    stringBuilder.append("CANCELLED");
                }
            } else {
                hqa hqa2 = this.b;
                StringBuilder stringBuilder4 = new StringBuilder("PENDING, delegate=[");
                stringBuilder4.append(hqa2);
                stringBuilder4.append("]");
                stringBuilder.append(stringBuilder4.toString());
            }
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

