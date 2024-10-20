/*
 * Decompiled with CFR 0.152.
 */
package j$.util.function;

import j$.util.Objects;
import java.util.function.LongConsumer;

public final class g
implements LongConsumer {
    public final LongConsumer a;
    public final LongConsumer b;

    public /* synthetic */ g(LongConsumer longConsumer, LongConsumer longConsumer2) {
        this.a = longConsumer;
        this.b = longConsumer2;
    }

    @Override
    public final void accept(long l2) {
        this.a.accept(l2);
        this.b.accept(l2);
    }

    public final LongConsumer andThen(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new g(this, longConsumer);
    }
}

