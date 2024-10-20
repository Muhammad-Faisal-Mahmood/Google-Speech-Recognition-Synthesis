/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

final class clb
implements Executor {
    @Override
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}

