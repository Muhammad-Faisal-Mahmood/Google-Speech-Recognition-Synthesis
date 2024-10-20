/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class knp
implements ThreadFactory {
    private final AtomicInteger a;
    private final int b;

    public knp(int n2) {
        this.b = n2;
        this.a = new AtomicInteger(1);
    }

    public knp(int n2, byte[] byArray) {
        this.b = n2;
        this.a = new AtomicInteger(0);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        if (this.b != 0) {
            runnable = new Thread(runnable);
            StringBuilder stringBuilder = new StringBuilder("arch_disk_io_");
            stringBuilder.append(this.a.getAndIncrement());
            ((Thread)runnable).setName(stringBuilder.toString());
            return runnable;
        }
        int n2 = this.a.getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder("CrAsyncTask #");
        stringBuilder.append(n2);
        return new Thread(runnable, stringBuilder.toString());
    }
}

