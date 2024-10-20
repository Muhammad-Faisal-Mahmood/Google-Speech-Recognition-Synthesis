/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

/*
 * Renamed from con
 */
public final class con_
implements Runnable {
    public final Executor a;
    public final Runnable b;
    public final hqa c;

    public /* synthetic */ con_(Executor executor, Runnable runnable, hqa hqa2) {
        this.a = executor;
        this.b = runnable;
        this.c = hqa2;
    }

    @Override
    public final void run() {
        com com2 = new com(this.b, this.c);
        this.a.execute(com2);
    }
}

