/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class dkb
implements ThreadFactory {
    public final int a;
    private final AtomicInteger b = new AtomicInteger(1);
    private final String c;

    public dkb(int n2) {
        this.a = n2;
        this.c = "Primes";
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        runnable = new dpw(this, runnable, 1, null);
        int n2 = this.b.getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.c);
        stringBuilder.append("-");
        stringBuilder.append(n2);
        runnable = new Thread(runnable, stringBuilder.toString());
        if (((Thread)runnable).isDaemon()) {
            ((Thread)runnable).setDaemon(false);
        }
        return runnable;
    }
}

