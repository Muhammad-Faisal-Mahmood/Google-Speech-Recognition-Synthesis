/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Objects;
import j$.util.function.c;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public final class u
implements DoubleConsumer {
    public final Consumer a;

    public /* synthetic */ u(Consumer consumer) {
        this.a = consumer;
    }

    @Override
    public final void accept(double d2) {
        this.a.accept(d2);
    }

    public final DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new c(this, doubleConsumer);
    }
}

