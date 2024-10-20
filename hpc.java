/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class hpc
implements Runnable {
    final Future a;
    final hpb b;

    public hpc(Future future, hpb hpb2) {
        this.a = future;
        this.b = hpb2;
    }

    @Override
    public final void run() {
        Object object = this.a;
        if (object instanceof hqi && (object = ((hqi)object).i()) != null) {
            this.b.a((Throwable)object);
            return;
        }
        try {
            object = hhk.S(this.a);
            this.b.b(object);
            return;
        }
        catch (Throwable throwable) {
            this.b.a(throwable);
            return;
        }
        catch (ExecutionException executionException) {
            this.b.a(executionException.getCause());
            return;
        }
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.a(this.b);
        return gtn2.toString();
    }
}

