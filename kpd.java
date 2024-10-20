/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public abstract class kpd {
    public kpd(Executor executor) {
        if (executor != null) {
            return;
        }
        throw new IllegalStateException("Executor must not be null");
    }

    public Executor a() {
        throw null;
    }

    public abstract void b(int var1, long var2, int var4);
}

