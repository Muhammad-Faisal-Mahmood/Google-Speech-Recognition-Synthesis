/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ThreadFactory;

public final class crb
implements ThreadFactory {
    public final cqz a;
    private final ThreadFactory b;

    public crb(ThreadFactory threadFactory, cqz cqz2) {
        this.b = threadFactory;
        this.a = cqz2;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        runnable = new ckr((Object)this, (Object)runnable, 19, null);
        return this.b.newThread(runnable);
    }
}

