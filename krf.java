/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class krf
implements ThreadFactory {
    public final int a;

    public krf(int n2) {
        this.a = n2;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        return Executors.defaultThreadFactory().newThread(new kot((Object)this, (Object)runnable, 9, null));
    }
}

