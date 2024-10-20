/*
 * Decompiled with CFR 0.152.
 */
package j$.util.function;

import j$.util.Objects;
import java.util.function.DoubleConsumer;

public final class c
implements DoubleConsumer {
    public final DoubleConsumer a;
    public final DoubleConsumer b;

    public /* synthetic */ c(DoubleConsumer doubleConsumer, DoubleConsumer doubleConsumer2) {
        this.a = doubleConsumer;
        this.b = doubleConsumer2;
    }

    @Override
    public final void accept(double d2) {
        this.a.accept(d2);
        this.b.accept(d2);
    }

    public final DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new c(this, doubleConsumer);
    }
}

