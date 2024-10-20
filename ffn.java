/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

final class ffn
implements jnf {
    final List a;
    final ffo b;
    private final Executor c;
    private final AtomicBoolean d;

    public ffn(ffo ffo2, List list) {
        this.a = list;
        this.b = ffo2;
        this.c = new hpz(ffo2.b);
        this.d = new AtomicBoolean();
    }

    @Override
    public final void a() {
        this.d.compareAndSet(false, true);
    }

    @Override
    public final void b(Throwable throwable) {
        if (!this.d.compareAndSet(false, true)) {
            return;
        }
        this.c.execute(gqk.i(new ffe((Object)this, (Object)throwable, 2, null)));
    }
}

