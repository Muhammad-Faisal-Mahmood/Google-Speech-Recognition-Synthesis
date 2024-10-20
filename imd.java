/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class imd
implements Map {
    private final Map a;

    public imd(Map map) {
        this.a = map;
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override
    public final boolean containsKey(Object object) {
        if (object instanceof Class) {
            return this.a.containsKey(((Class)object).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    @Override
    public final boolean containsValue(Object object) {
        return this.a.containsValue(object);
    }

    public final Set entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    public final Object get(Object object) {
        if (object instanceof Class) {
            return this.a.get(((Class)object).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Set keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    public final Object remove(Object object) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override
    public final int size() {
        return ((hcy)this.a).c;
    }

    public final Collection values() {
        return ((hac)this.a).g();
    }
}

