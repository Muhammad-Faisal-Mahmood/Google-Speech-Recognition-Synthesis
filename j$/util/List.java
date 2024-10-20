/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Collection;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.UnaryOperator;

public interface List<E>
extends Collection<E> {
    public void replaceAll(UnaryOperator<E> var1);

    public void sort(Comparator<? super E> var1);

    @Override
    public Spliterator<E> spliterator();
}

