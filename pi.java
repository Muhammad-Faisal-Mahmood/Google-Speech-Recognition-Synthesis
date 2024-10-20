/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

final class pi {
    static final pi a = new pi(null, null);
    final Runnable b;
    final Executor c;
    pi next;

    public pi(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}

