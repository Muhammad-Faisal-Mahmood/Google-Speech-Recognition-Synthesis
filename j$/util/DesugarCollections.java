/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.d_0;
import j$.util.e_0;
import j$.util.f_0;
import j$.util.j_0;
import j$.util.l_0;
import j$.util.q;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

public class DesugarCollections {
    public static <T> List<T> synchronizedList(List<T> e_02) {
        e_02 = e_02 instanceof RandomAccess ? new e_0(e_02) : new e_0(e_02);
        return e_02;
    }

    public static <K, V> Map<K, V> synchronizedMap(Map<K, V> map) {
        return new f_0(map);
    }

    public static <T> Set<T> synchronizedSet(Set<T> set) {
        return new d_0(set);
    }

    public static <T> Collection<T> unmodifiableCollection(Collection<? extends T> collection) {
        return new j_0(collection);
    }

    public static <T> List<T> unmodifiableList(List<? extends T> l_02) {
        l_02 = l_02 instanceof RandomAccess ? new l_0(l_02) : new l_0(l_02);
        return l_02;
    }

    public static <K, V> Map<K, V> unmodifiableMap(Map<? extends K, ? extends V> map) {
        return new q(map);
    }

    public static <T> Set<T> unmodifiableSet(Set<? extends T> set) {
        return new j_0(set);
    }
}

