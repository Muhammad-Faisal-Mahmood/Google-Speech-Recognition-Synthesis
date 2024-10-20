/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Objects;
import j$.util.function.g;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

public final class x
implements LongConsumer {
    public final Consumer a;

    public /* synthetic */ x(Consumer consumer) {
        this.a = consumer;
    }

    @Override
    public final void accept(long l2) {
        this.a.accept(l2);
    }

    public final LongConsumer andThen(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new g(this, longConsumer);
    }
}

