/*
 * Decompiled with CFR 0.152.
 */
package j$.util.function;

import j$.util.Objects;
import j$.util.function.h;
import java.util.function.LongUnaryOperator;

public final class LongUnaryOperator$_CC {
    public static LongUnaryOperator $default$andThen(LongUnaryOperator longUnaryOperator, LongUnaryOperator longUnaryOperator2) {
        Objects.requireNonNull(longUnaryOperator2);
        return new h(longUnaryOperator, longUnaryOperator2, 0);
    }

    public static LongUnaryOperator $default$compose(LongUnaryOperator longUnaryOperator, LongUnaryOperator longUnaryOperator2) {
        Objects.requireNonNull(longUnaryOperator2);
        return new h(longUnaryOperator, longUnaryOperator2, 1);
    }
}

