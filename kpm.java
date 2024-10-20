/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public abstract class kpm {
    private final Executor a;

    public kpm(Executor executor) {
        if (executor != null) {
            this.a = executor;
            return;
        }
        throw new IllegalStateException("Executor must not be null");
    }

    public abstract void a(kpo var1);

    public Executor b() {
        return this.a;
    }
}

