/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class krv
implements Executor {
    private final Executor a;

    public krv(Executor executor) {
        this.a = executor;
    }

    @Override
    public final void execute(Runnable object) {
        kru kru2 = new kru((Runnable)object, Thread.currentThread());
        this.a.execute(kru2);
        object = kru2.b;
        if (object == null) {
            kru2.a = null;
            return;
        }
        throw object;
    }
}

