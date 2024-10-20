/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public interface ConcurrentMap<K, V>
extends Map<K, V> {
    @Override
    public V compute(K var1, BiFunction<? super K, ? super V, ? extends V> var2);

    @Override
    public V computeIfAbsent(K var1, Function<? super K, ? extends V> var2);

    @Override
    public V computeIfPresent(K var1, BiFunction<? super K, ? super V, ? extends V> var2);

    @Override
    public void forEach(BiConsumer<? super K, ? super V> var1);

    @Override
    public V getOrDefault(Object var1, V var2);

    @Override
    public V merge(K var1, V var2, BiFunction<? super V, ? super V, ? extends V> var3);

    @Override
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> var1);
}

