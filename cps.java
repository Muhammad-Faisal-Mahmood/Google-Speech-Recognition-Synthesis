/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class cps
implements ThreadFactory {
    private final cpt a;
    private final cpv b;
    private final AtomicInteger c;

    public cps(cpv cpv2, ThreadFactory threadFactory) {
        this.b = cpv2;
        this.a = new cpt(threadFactory);
        this.c = new AtomicInteger(1000);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Thread newThread(Runnable object) {
        int n2;
        Thread thread = this.a.newThread((Runnable)object);
        if (!cpu.b()) return thread;
        cpt cpt2 = this.a;
        object = cpt2.a;
        synchronized (object) {
            n2 = cpt2.a.size();
        }
        if (n2 < 1000) return thread;
        int n3;
        while (n2 >= (n3 = this.c.get())) {
            if (!this.c.compareAndSet(n3, n3 + n3)) continue;
            object = new cpy(a.ah(n2, "Number of blocking threads ", " exceeds starvation threshold of 1000"));
            cpu.a(this.b, this.a.a(), (RuntimeException)object);
        }
        return thread;
    }
}

