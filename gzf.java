/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class gzf
extends gzg
implements Map {
    protected gzf() {
    }

    protected abstract Map b();

    @Override
    public final void clear() {
        this.b().clear();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.b().containsKey(object);
    }

    @Override
    public boolean containsValue(Object object) {
        return this.b().containsValue(object);
    }

    public Set entrySet() {
        return this.b().entrySet();
    }

    @Override
    public boolean equals(Object object) {
        return object == this || this.b().equals(object);
        {
        }
    }

    public Object get(Object object) {
        return this.b().get(object);
    }

    @Override
    public int hashCode() {
        return this.b().hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.b().isEmpty();
    }

    public Set keySet() {
        return this.b().keySet();
    }

    public final Object put(Object object, Object object2) {
        return this.b().put(object, object2);
    }

    public final void putAll(Map map) {
        this.b().putAll(map);
    }

    public final Object remove(Object object) {
        return this.b().remove(object);
    }

    @Override
    public int size() {
        return this.b().size();
    }

    public final Collection values() {
        return this.b().values();
    }
}

