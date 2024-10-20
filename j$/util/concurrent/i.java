/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.util.Collection$_CC;
import j$.util.Set;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.a_0;
import j$.util.concurrent.b;
import j$.util.concurrent.h;
import j$.util.concurrent.j;
import j$.util.concurrent.l;
import j$.util.concurrent.q;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public final class i
extends b
implements java.util.Set,
Set {
    private static final long serialVersionUID = 7249069246763182397L;

    @Override
    public final boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean contains(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public final boolean equals(Object object) {
        boolean bl2 = object instanceof java.util.Set && ((object = (java.util.Set)object) == this || this.containsAll((Collection)object) && object.containsAll(this));
        return bl2;
    }

    @Override
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        Object object = this.a.a;
        if (object != null) {
            q q2 = new q((l[])object, ((l[])object).length, 0, ((l[])object).length);
            while ((object = q2.c()) != null) {
                consumer.accept(object.b);
            }
        }
    }

    @Override
    public final int hashCode() {
        Iterator iterator = this.iterator();
        int n2 = 0;
        while (((a_0)((Object)iterator)).hasNext()) {
            n2 += ((h)iterator).next().hashCode();
        }
        return n2;
    }

    @Override
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        l[] lArray = concurrentHashMap.a;
        int n2 = lArray == null ? 0 : lArray.length;
        return new h(lArray, n2, n2, concurrentHashMap, 0);
    }

    @Override
    public final /* synthetic */ Stream parallelStream() {
        return Collection$_CC.$default$parallelStream(this);
    }

    @Override
    public final boolean remove(Object object) {
        boolean bl2 = this.a.remove(object) != null;
        return bl2;
    }

    @Override
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection$_CC.$default$removeIf(this, predicate);
    }

    @Override
    public final Spliterator spliterator() {
        l[] lArray = this.a;
        long l2 = lArray.j();
        lArray = lArray.a;
        int n2 = lArray == null ? 0 : lArray.length;
        if (l2 < 0L) {
            l2 = 0L;
        }
        return new j(lArray, n2, 0, n2, l2, 0);
    }

    @Override
    public final /* synthetic */ Stream stream() {
        return Collection$_CC.$default$stream(this);
    }

    @Override
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection$_CC.$default$toArray(this, intFunction);
    }
}

