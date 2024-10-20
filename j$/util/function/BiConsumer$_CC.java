/*
 * Decompiled with CFR 0.152.
 */
package j$.util.function;

import j$.util.Objects;
import j$.util.concurrent.y;
import java.util.function.BiConsumer;

public final class BiConsumer$_CC {
    public static BiConsumer $default$andThen(BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(biConsumer2);
        return new y(1, biConsumer, biConsumer2);
    }
}

