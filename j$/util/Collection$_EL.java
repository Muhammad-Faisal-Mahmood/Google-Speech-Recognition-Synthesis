/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Collection;
import j$.util.Collection$_CC;
import j$.util.List$_CC;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import j$.util.y;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;
import java.util.function.Predicate;

public final class Collection$_EL {
    public static /* synthetic */ Stream a(java.util.Collection collection) {
        if (collection instanceof Collection) {
            return ((Collection)((Object)collection)).parallelStream();
        }
        return Collection$_CC.$default$parallelStream(collection);
    }

    public static Spliterator b(java.util.Collection collection) {
        if (collection instanceof Collection) {
            return ((Collection)((Object)collection)).spliterator();
        }
        if (collection instanceof LinkedHashSet) {
            return Spliterators.spliterator((LinkedHashSet)collection, 17);
        }
        if (collection instanceof SortedSet) {
            collection = (SortedSet)collection;
            return new y((SortedSet)collection, collection);
        }
        if (collection instanceof Set) {
            return Spliterators.spliterator((Set)collection, 1);
        }
        if (collection instanceof List) {
            return List$_CC.$default$spliterator((List)collection);
        }
        return Collection$_CC.$default$spliterator(collection);
    }

    public static /* synthetic */ void forEach(java.util.Collection collection, Consumer consumer) {
        if (collection instanceof Collection) {
            ((Collection)((Object)collection)).forEach(consumer);
            return;
        }
        Collection$_CC.$default$forEach(collection, consumer);
    }

    public static /* synthetic */ boolean removeIf(java.util.Collection collection, Predicate predicate) {
        if (collection instanceof Collection) {
            return ((Collection)((Object)collection)).removeIf(predicate);
        }
        return Collection$_CC.$default$removeIf(collection, predicate);
    }

    public static /* synthetic */ Stream stream(java.util.Collection collection) {
        if (collection instanceof Collection) {
            return ((Collection)((Object)collection)).stream();
        }
        return Collection$_CC.$default$stream(collection);
    }
}

