/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public interface Map<K, V> {
    public V compute(K var1, BiFunction<? super K, ? super V, ? extends V> var2);

    public V computeIfAbsent(K var1, Function<? super K, ? extends V> var2);

    public V computeIfPresent(K var1, BiFunction<? super K, ? super V, ? extends V> var2);

    public void forEach(BiConsumer<? super K, ? super V> var1);

    public V getOrDefault(Object var1, V var2);

    public V merge(K var1, V var2, BiFunction<? super V, ? super V, ? extends V> var3);

    public V putIfAbsent(K var1, V var2);

    public boolean remove(Object var1, Object var2);

    public V replace(K var1, V var2);

    public boolean replace(K var1, V var2, V var3);

    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> var1);
}

