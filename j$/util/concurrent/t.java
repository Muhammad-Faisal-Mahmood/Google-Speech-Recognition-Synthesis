/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.util.Collection;
import j$.util.Collection$_CC;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.a_0;
import j$.util.concurrent.b;
import j$.util.concurrent.h;
import j$.util.concurrent.j;
import j$.util.concurrent.l;
import j$.util.concurrent.q;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

final class t
extends b
implements Collection {
    private static final long serialVersionUID = 2249069246763182397L;

    public final boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean contains(Object object) {
        return this.a.containsValue(object);
    }

    @Override
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        Object object = this.a.a;
        if (object != null) {
            q q2 = new q((l[])object, ((l[])object).length, 0, ((l[])object).length);
            while ((object = q2.c()) != null) {
                consumer.accept(object.c);
            }
        }
    }

    @Override
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        l[] lArray = concurrentHashMap.a;
        int n2 = lArray == null ? 0 : lArray.length;
        return new h(lArray, n2, n2, concurrentHashMap, 1);
    }

    public final /* synthetic */ Stream parallelStream() {
        return Collection$_CC.$default$parallelStream(this);
    }

    @Override
    public final boolean remove(Object object) {
        if (object != null) {
            a_0 a_02;
            Iterator iterator = this.iterator();
            while ((a_02 = (a_0)((Object)iterator)).hasNext()) {
                if (!object.equals(((h)iterator).next())) continue;
                a_02.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean removeAll(java.util.Collection collection) {
        a_0 a_02;
        collection.getClass();
        Iterator iterator = this.iterator();
        boolean bl2 = false;
        while ((a_02 = (a_0)((Object)iterator)).hasNext()) {
            if (!collection.contains(((h)iterator).next())) continue;
            a_02.remove();
            bl2 = true;
        }
        return bl2;
    }

    public final boolean removeIf(Predicate predicate) {
        ConcurrentHashMap concurrentHashMap = this.a;
        concurrentHashMap.getClass();
        predicate.getClass();
        Object object = concurrentHashMap.a;
        boolean bl2 = false;
        boolean bl3 = false;
        if (object != null) {
            object = new q((l[])object, ((l[])object).length, 0, ((l[])object).length);
            while (true) {
                Object object2 = ((q)object).c();
                bl2 = bl3;
                if (object2 == null) break;
                Object object3 = ((l)object2).b;
                object2 = ((l)object2).c;
                if (!predicate.test(object2) || concurrentHashMap.g(object3, null, object2) == null) continue;
                bl3 = true;
            }
        }
        return bl2;
    }

    public final Spliterator spliterator() {
        l[] lArray = this.a;
        long l2 = lArray.j();
        lArray = lArray.a;
        int n2 = lArray == null ? 0 : lArray.length;
        if (l2 < 0L) {
            l2 = 0L;
        }
        return new j(lArray, n2, 0, n2, l2, 1);
    }

    public final /* synthetic */ Stream stream() {
        return Collection$_CC.$default$stream(this);
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection$_CC.$default$toArray(this, intFunction);
    }
}

