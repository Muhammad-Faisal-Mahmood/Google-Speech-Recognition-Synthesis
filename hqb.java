/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class hqb
implements ThreadFactory {
    final ThreadFactory a;
    final String b;
    final AtomicLong c;
    final Boolean d;
    final Integer e;

    public hqb(ThreadFactory threadFactory, String string, AtomicLong atomicLong, Boolean bl2, Integer n2) {
        this.a = threadFactory;
        this.b = string;
        this.c = atomicLong;
        this.d = bl2;
        this.e = n2;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        runnable = this.a.newThread(runnable);
        Objects.requireNonNull(runnable);
        Object object = this.b;
        if (object != null) {
            ((Thread)runnable).setName(ivg.f((String)object, Objects.requireNonNull(this.c).getAndIncrement()));
        }
        if ((object = this.d) != null) {
            ((Boolean)object).booleanValue();
            ((Thread)runnable).setDaemon(true);
        }
        if ((object = this.e) != null) {
            ((Thread)runnable).setPriority((Integer)object);
        }
        return runnable;
    }
}

