/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Collection$_EL;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.I;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public final class Collection$_CC {
    public static void $default$forEach(Collection object, Consumer consumer) {
        Objects.requireNonNull(consumer);
        object = object.iterator();
        while (object.hasNext()) {
            consumer.accept(object.next());
        }
    }

    public static Stream $default$parallelStream(Collection collection) {
        return I.o(Collection$_EL.b(collection), true);
    }

    public static boolean $default$removeIf(Collection object, Predicate predicate) {
        Objects.requireNonNull(predicate);
        object = object.iterator();
        boolean bl2 = false;
        while (object.hasNext()) {
            if (!predicate.test(object.next())) continue;
            object.remove();
            bl2 = true;
        }
        return bl2;
    }

    public static Spliterator $default$spliterator(Collection collection) {
        return Spliterators.spliterator(collection, 0);
    }

    public static Stream $default$stream(Collection collection) {
        return I.o(Collection$_EL.b(collection), false);
    }

    public static Object[] $default$toArray(Collection collection, IntFunction intFunction) {
        return collection.toArray((Object[])intFunction.apply(0));
    }
}

