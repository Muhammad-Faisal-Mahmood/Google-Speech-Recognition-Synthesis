/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Map;
import j$.util.Map$_CC;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public final class jpb
implements java.util.Map,
Serializable,
Map,
jsm {
    public static final jpb a = new jpb();
    private static final long serialVersionUID = 8246714829545688274L;

    private jpb() {
    }

    private final Object readResolve() {
        return a;
    }

    @Override
    public final void clear() {
        a.b();
    }

    @Override
    public final boolean containsKey(Object object) {
        return false;
    }

    public final Set entrySet() {
        return jpc.a;
    }

    @Override
    public final boolean equals(Object object) {
        return object instanceof java.util.Map && ((java.util.Map)object).isEmpty();
    }

    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map$_CC.$default$forEach(this, biConsumer);
    }

    public final /* synthetic */ Object getOrDefault(Object object, Object object2) {
        return Map$_CC.$default$getOrDefault(this, object, object2);
    }

    @Override
    public final int hashCode() {
        return 0;
    }

    @Override
    public final boolean isEmpty() {
        return true;
    }

    public final Set keySet() {
        return jpc.a;
    }

    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean remove(Object object, Object object2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "{}";
    }

    public final Collection values() {
        return jpa.a;
    }
}

