/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.a_0;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

public final class List$_CC {
    public static void $default$replaceAll(List object, UnaryOperator unaryOperator) {
        Objects.requireNonNull(unaryOperator);
        object = object.listIterator();
        while (object.hasNext()) {
            object.set(unaryOperator.apply(object.next()));
        }
    }

    public static void $default$sort(List object3, Comparator object2) {
        Object[] objectArray = object3.toArray();
        Arrays.sort(objectArray, object2);
        object2 = object3.listIterator();
        for (Object object3 : objectArray) {
            object2.next();
            object2.set(object3);
        }
    }

    public static Spliterator $default$spliterator(List list) {
        if (list instanceof RandomAccess) {
            return new a_0(list);
        }
        return Spliterators.spliterator(list, 16);
    }
}

