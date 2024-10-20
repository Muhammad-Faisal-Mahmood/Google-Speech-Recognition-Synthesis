/*
 * Decompiled with CFR 0.152.
 */
package j$.util.function;

import j$.util.Objects;
import j$.util.concurrent.y;
import java.util.function.Consumer;

public final class Consumer$_CC {
    public static Consumer $default$andThen(Consumer consumer, Consumer consumer2) {
        Objects.requireNonNull(consumer2);
        return new y(3, consumer, consumer2);
    }
}

