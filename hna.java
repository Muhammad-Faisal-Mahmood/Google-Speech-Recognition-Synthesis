/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

final class hna {
    static final hna a = new hna();
    final Runnable b;
    final Executor c;
    hna next;

    public hna() {
        this.b = null;
        this.c = null;
    }

    public hna(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}

