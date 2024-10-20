/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicBoolean;

final class jhb
extends iwf {
    public final iwe a;
    final jhc b;
    private final AtomicBoolean c;

    public jhb(jhc jhc2, iwe iwe2) {
        this.b = jhc2;
        this.c = new AtomicBoolean(false);
        this.a = iwe2;
    }

    @Override
    public final iwb a(iwc iwc2) {
        if (this.c.compareAndSet(false, true)) {
            this.b.e.c().execute(new jel(this, 17));
        }
        return iwb.a;
    }
}

