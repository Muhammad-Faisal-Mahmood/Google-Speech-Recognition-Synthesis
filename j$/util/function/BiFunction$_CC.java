/*
 * Decompiled with CFR 0.152.
 */
package j$.util.function;

import j$.util.Objects;
import j$.util.concurrent.y;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class BiFunction$_CC {
    public static BiFunction $default$andThen(BiFunction biFunction, Function function) {
        Objects.requireNonNull(function);
        return new y(biFunction, function);
    }
}

