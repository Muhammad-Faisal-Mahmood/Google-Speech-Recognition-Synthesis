/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class ny
implements Executor {
    private final int a;

    public ny(int n2) {
        this.a = n2;
    }

    @Override
    public final void execute(Runnable runnable) {
        if (this.a != 0) {
            new Thread(runnable).start();
            return;
        }
        ((oa)nz.v().b).b.execute(runnable);
    }
}

