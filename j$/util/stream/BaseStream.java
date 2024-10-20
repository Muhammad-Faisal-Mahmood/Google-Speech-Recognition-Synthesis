/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Spliterator;

public interface BaseStream<T, S extends BaseStream<T, S>>
extends AutoCloseable {
    public BaseStream a();

    @Override
    public void close();

    public Spliterator spliterator();
}

