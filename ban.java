/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class ban
implements ThreadFactory {
    final boolean a;
    private final AtomicInteger b;

    public ban(boolean bl2) {
        this.a = bl2;
        this.b = new AtomicInteger(0);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        jse.e(runnable, "runnable");
        StringBuilder stringBuilder = new StringBuilder();
        String string = true != this.a ? "androidx.work-" : "WM.task-";
        stringBuilder.append(string);
        stringBuilder.append(this.b.incrementAndGet());
        return new Thread(runnable, stringBuilder.toString());
    }
}

