/*
 * Decompiled with CFR 0.152.
 */
package j$.util.function;

import j$.util.Objects;
import j$.util.function.a;
import j$.util.function.b;
import java.util.function.BiPredicate;

public final class BiPredicate$_CC {
    public static BiPredicate $default$and(BiPredicate biPredicate, BiPredicate biPredicate2) {
        Objects.requireNonNull(biPredicate2);
        return new b(biPredicate, biPredicate2, 1);
    }

    public static BiPredicate $default$negate(BiPredicate biPredicate) {
        return new a(biPredicate);
    }

    public static BiPredicate $default$or(BiPredicate biPredicate, BiPredicate biPredicate2) {
        Objects.requireNonNull(biPredicate2);
        return new b(biPredicate, biPredicate2, 0);
    }
}

