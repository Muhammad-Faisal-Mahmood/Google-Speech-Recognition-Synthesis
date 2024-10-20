/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class krl
implements Executor {
    public final Executor a;
    public final int b;
    public final boolean c;
    public final int d;

    public /* synthetic */ krl(Executor executor, int n2, boolean bl2, int n3) {
        this.a = executor;
        this.b = n2;
        this.c = bl2;
        this.d = n3;
    }

    @Override
    public final void execute(Runnable runnable) {
        runnable = new krm(this.b, this.c, this.d, runnable);
        this.a.execute(runnable);
    }
}

