/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicLong;

final class hee
extends hfe {
    public static final het a = new hec();
    public final AtomicLong b = new AtomicLong(-1L);

    @Override
    public final void a() {
        long l2 = -this.b.get();
        this.b.set(Math.max(l2, 0L));
    }
}

