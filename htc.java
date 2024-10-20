/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.concurrent.Executor;

public final class htc
implements Executor {
    private volatile Executor a;

    public htc(Executor executor) {
        this.a = executor;
    }

    public final void a() {
        this.a = hom.a;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}

