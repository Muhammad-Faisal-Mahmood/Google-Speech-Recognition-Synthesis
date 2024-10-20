/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

public interface Spliterator<T> {
    public int a();

    public Spliterator b();

    public long d();

    public void forEachRemaining(Consumer var1);

    public boolean k(int var1);

    public long l();

    public Comparator m();

    public boolean o(Consumer var1);
}

