/*
 * Decompiled with CFR 0.152.
 */
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class jpu
extends jow
implements Set,
Serializable,
jsn {
    public static final jpu a = new jpu(jpp.a);
    public final jpp b;

    public jpu() {
        this(new jpp());
    }

    public jpu(jpp jpp2) {
        jse.e(jpp2, "backing");
        this.b = jpp2;
    }

    private final Object writeReplace() {
        if (this.b.h) {
            return new jps(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override
    public final int a() {
        return this.b.g;
    }

    @Override
    public final boolean add(Object object) {
        return this.b.a(object) >= 0;
    }

    @Override
    public final boolean addAll(Collection collection) {
        jse.e(collection, "elements");
        this.b.f();
        return super.addAll(collection);
    }

    @Override
    public final void clear() {
        this.b.clear();
    }

    @Override
    public final boolean contains(Object object) {
        return this.b.containsKey(object);
    }

    @Override
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new jpo(this.b, 1, null);
    }

    @Override
    public final boolean remove(Object object) {
        return this.b.j(object);
    }

    @Override
    public final boolean removeAll(Collection collection) {
        jse.e(collection, "elements");
        this.b.f();
        return super.removeAll(collection);
    }

    @Override
    public final boolean retainAll(Collection collection) {
        jse.e(collection, "elements");
        this.b.f();
        return super.retainAll(collection);
    }
}

