/*
 * Decompiled with CFR 0.152.
 */
package j$.util.function;

import j$.util.Objects;
import j$.util.function.d;
import java.util.function.Function;

public final class Function$_CC {
    public static Function $default$andThen(Function function, Function function2) {
        Objects.requireNonNull(function2);
        return new d(function, function2, 0);
    }

    public static Function $default$compose(Function function, Function function2) {
        Objects.requireNonNull(function2);
        return new d(function, function2, 1);
    }
}

