/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Map$_EL;
import j$.util.j_0;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

final class q
implements java.util.Map,
Serializable,
Map {
    private static final long serialVersionUID = -1034234728574286014L;
    private final java.util.Map a;
    private transient Set b;
    private transient Set c;
    private transient Collection d;

    q(java.util.Map map) {
        map.getClass();
        this.a = map;
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final Object compute(Object object, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    public final Object computeIfAbsent(Object object, Function function) {
        throw new UnsupportedOperationException();
    }

    public final Object computeIfPresent(Object object, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean containsKey(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public final boolean containsValue(Object object) {
        return this.a.containsValue(object);
    }

    public final Set entrySet() {
        if (this.c == null) {
            this.c = new j_0(this.a.entrySet());
        }
        return this.c;
    }

    @Override
    public final boolean equals(Object object) {
        boolean bl2 = object == this || this.a.equals(object);
        return bl2;
    }

    public final void forEach(BiConsumer biConsumer) {
        Map$_EL.a(this.a, biConsumer);
    }

    public final Object get(Object object) {
        return this.a.get(object);
    }

    public final Object getOrDefault(Object object, Object object2) {
        return Map$_EL.getOrDefault(this.a, object, object2);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Set keySet() {
        if (this.b == null) {
            this.b = DesugarCollections.unmodifiableSet(this.a.keySet());
        }
        return this.b;
    }

    public final Object merge(Object object, Object object2, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    public final Object put(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    public final Object putIfAbsent(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    public final Object remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean remove(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    public final Object replace(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    public final boolean replace(Object object, Object object2, Object object3) {
        throw new UnsupportedOperationException();
    }

    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    public final String toString() {
        return this.a.toString();
    }

    public final Collection values() {
        if (this.d == null) {
            this.d = DesugarCollections.unmodifiableCollection(this.a.values());
        }
        return this.d;
    }
}

