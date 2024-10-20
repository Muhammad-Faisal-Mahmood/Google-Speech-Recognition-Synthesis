/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

final class jgv
extends iwf {
    final jgx a;
    private final jgx b;
    private final AtomicBoolean c;

    public jgv(jgx jgx2, jgx jgx3) {
        this.a = jgx2;
        this.c = new AtomicBoolean(false);
        this.b = jgx3;
    }

    @Override
    public final iwb a(iwc object) {
        if (this.c.compareAndSet(false, true)) {
            Object object2 = this.a;
            object = this.b;
            object2 = ((jgx)object2).f.c();
            Objects.requireNonNull(object);
            ((iym)object2).execute(new jel((jgx)object, 16, null));
        }
        return iwb.a;
    }
}

