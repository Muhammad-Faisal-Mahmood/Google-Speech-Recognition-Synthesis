/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

public final class cpf
implements Runnable {
    public final hqa a;
    public final Callable b;

    public /* synthetic */ cpf(hqa hqa2, Callable callable) {
        this.a = hqa2;
        this.b = callable;
    }

    @Override
    public final void run() {
        int n2 = cpi.b;
        hqa hqa2 = this.a;
        Callable callable = this.b;
        try {
            hqa2.m(callable.call());
            return;
        }
        catch (Exception exception) {
            hqa2.n(exception);
            throw new RuntimeException(exception);
        }
    }
}

