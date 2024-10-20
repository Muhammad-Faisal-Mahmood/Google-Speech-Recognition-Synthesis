/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;

final class hfh
extends hfe {
    public static final het a = new hff();
    public static final ThreadLocal b = new hfg();
    final AtomicInteger e = new AtomicInteger();

    @Override
    public final void a() {
        this.e.decrementAndGet();
    }
}

