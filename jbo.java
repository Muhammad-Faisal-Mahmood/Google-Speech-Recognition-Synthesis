/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicLong;

final class jbo
implements jez {
    private final AtomicLong a = new AtomicLong();

    @Override
    public final void a() {
        this.a.getAndAdd(1L);
    }
}

