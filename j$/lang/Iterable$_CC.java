/*
 * Decompiled with CFR 0.152.
 */
package j$.lang;

import j$.util.Objects;
import java.util.function.Consumer;

public final class Iterable$_CC {
    public static void $default$forEach(Iterable object, Consumer consumer) {
        Objects.requireNonNull(consumer);
        object = object.iterator();
        while (object.hasNext()) {
            consumer.accept(object.next());
        }
    }
}

