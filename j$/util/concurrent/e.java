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
import j$.util.concurrent.f;
import j$.util.concurrent.k;
import j$.util.concurrent.l;
import j$.util.concurrent.q;
import j$.util.stream.Stream;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

final class e
extends b
implements java.util.Set,
Set {
    private static final long serialVersionUID = 2249069246763182397L;

    @Override
    public final boolean add(Object object) {
        Map.Entry entry = (Map.Entry)object;
        object = entry.getKey();
        entry = entry.getValue();
        ConcurrentHashMap concurrentHashMap = this.a;
        boolean bl2 = false;
        if (concurrentHashMap.f(object, entry, false) == null) {
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public final boolean addAll(Collection collection) {
        Iterator iterator = collection.iterator();
        boolean bl2 = false;
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            collection = entry.getKey();
            if (this.a.f(collection, entry = entry.getValue(), false) != null) continue;
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public final boolean contains(Object object) {
        Object object2;
        boolean bl2 = object instanceof Map.Entry && (object2 = (object = (Map.Entry)object).getKey()) != null && (object2 = this.a.get(object2)) != null && (object = object.getValue()) != null && (object == object2 || object.equals(object2));
        return bl2;
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
            l l2;
            object = new q((l[])object, ((l[])object).length, 0, ((l[])object).length);
            while ((l2 = ((q)object).c()) != null) {
                consumer.accept(new k(l2.b, l2.c, this.a));
            }
        }
    }

    @Override
    public final int hashCode() {
        Object object = this.a.a;
        int n2 = 0;
        int n3 = 0;
        if (object != null) {
            object = new q((l[])object, ((l[])object).length, 0, ((l[])object).length);
            while (true) {
                l l2 = ((q)object).c();
                n2 = n3;
                if (l2 == null) break;
                n3 += l2.hashCode();
            }
        }
        return n2;
    }

    @Override
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        l[] lArray = concurrentHashMap.a;
        int n2 = lArray == null ? 0 : lArray.length;
        return new a_0(lArray, n2, n2, concurrentHashMap);
    }

    @Override
    public final /* synthetic */ Stream parallelStream() {
        return Collection$_CC.$default$parallelStream(this);
    }

    @Override
    public final boolean remove(Object object) {
        Map.Entry entry;
        boolean bl2 = object instanceof Map.Entry && (object = (entry = (Map.Entry)object).getKey()) != null && (entry = entry.getValue()) != null && this.a.remove(object, entry);
        return bl2;
    }

    @Override
    public final boolean removeIf(Predicate predicate) {
        ConcurrentHashMap concurrentHashMap = this.a;
        concurrentHashMap.getClass();
        predicate.getClass();
        Object object = concurrentHashMap.a;
        boolean bl2 = false;
        boolean bl3 = false;
        if (object != null) {
            q q2 = new q((l[])object, ((l[])object).length, 0, ((l[])object).length);
            while (true) {
                Object object2 = q2.c();
                bl2 = bl3;
                if (object2 == null) break;
                object = ((l)object2).b;
                object2 = ((l)object2).c;
                if (!predicate.test(new AbstractMap.SimpleImmutableEntry<l[], Object>((l[])object, object2)) || concurrentHashMap.g(object, null, object2) == null) continue;
                bl3 = true;
            }
        }
        return bl2;
    }

    @Override
    public final Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        long l2 = concurrentHashMap.j();
        l[] lArray = concurrentHashMap.a;
        int n2 = lArray == null ? 0 : lArray.length;
        long l3 = 0L;
        if (l2 < 0L) {
            l2 = l3;
        }
        return new f(lArray, n2, 0, n2, l2, concurrentHashMap);
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

