/*
 * Decompiled with CFR 0.152.
 */
package j$.util.function;

import j$.util.Objects;
import j$.util.function.a;
import j$.util.function.i;
import java.util.function.Predicate;

public final class Predicate$_CC {
    public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new i(predicate, predicate2, 0);
    }

    public static Predicate $default$negate(Predicate predicate) {
        return new a(predicate);
    }

    public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new i(predicate, predicate2, 1);
    }
}

