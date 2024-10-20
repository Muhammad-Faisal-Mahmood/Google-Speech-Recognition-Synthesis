/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

interface L {
    public L a(int var1);

    public long count();

    public Object[] d(IntFunction var1);

    public void forEach(Consumer var1);

    public void g(Object[] var1, int var2);

    public int h();

    public Spliterator spliterator();
}

