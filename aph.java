/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class aph {
    public static final bea e = new bea(2, -9223372036854775807L);
    public static final bea f = new bea(3, -9223372036854775807L);
    public final Executor a;
    public final Runnable b;
    public ape c;
    public IOException d;

    public aph() {
        ExecutorService executorService = Executors.newSingleThreadExecutor(new cod(1));
        this.a = executorService;
        Objects.requireNonNull(executorService);
        this.b = new akt(executorService, 6);
    }

    public final void a() {
        ape ape2 = this.c;
        abr.j(ape2);
        ape2.a(false);
    }

    public final boolean b() {
        return this.c != null;
    }
}

