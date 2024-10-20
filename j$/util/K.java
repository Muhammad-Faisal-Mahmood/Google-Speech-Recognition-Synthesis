/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.E;
import j$.util.Spliterator;
import j$.util.z;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

class K
implements Spliterator {
    private final Collection a;
    private Iterator b;
    private final int c;
    private long d;
    private int e;

    public K(Collection collection, int n2) {
        this.a = collection;
        this.b = null;
        int n3 = n2;
        if ((n2 & 0x1000) == 0) {
            n3 = n2 | 0x4040;
        }
        this.c = n3;
    }

    @Override
    public final int a() {
        return this.c;
    }

    @Override
    public final Spliterator b() {
        long l2;
        Object[] objectArray;
        Iterator iterator = this.b;
        if (iterator == null) {
            objectArray = this.a;
            this.b = iterator = objectArray.iterator();
            this.d = l2 = (long)objectArray.size();
        } else {
            l2 = this.d;
        }
        if (l2 > 1L && iterator.hasNext()) {
            int n2;
            int n3;
            int n4 = n3 = this.e + 1024;
            if ((long)n3 > l2) {
                n4 = (int)l2;
            }
            n3 = n4;
            if (n4 > 0x2000000) {
                n3 = 0x2000000;
            }
            objectArray = new Object[n3];
            n4 = 0;
            do {
                objectArray[n4] = iterator.next();
                n2 = n4 + 1;
                if (n2 >= n3) break;
                n4 = n2;
            } while (iterator.hasNext());
            this.e = n2;
            l2 = this.d;
            if (l2 != Long.MAX_VALUE) {
                this.d = l2 - (long)n2;
            }
            return new E(objectArray, 0, n2, this.c);
        }
        return null;
    }

    @Override
    public final long d() {
        if (this.b == null) {
            long l2;
            Collection collection = this.a;
            this.b = collection.iterator();
            this.d = l2 = (long)collection.size();
            return l2;
        }
        return this.d;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Object object = this.b;
        Iterator iterator = object;
        if (object == null) {
            object = this.a;
            this.b = iterator = object.iterator();
            this.d = object.size();
        }
        z.j(iterator, consumer);
    }

    @Override
    public final /* synthetic */ boolean k(int n2) {
        return z.f(this, n2);
    }

    @Override
    public final /* synthetic */ long l() {
        return z.e(this);
    }

    @Override
    public Comparator m() {
        if (z.f(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override
    public final boolean o(Consumer consumer) {
        consumer.getClass();
        if (this.b == null) {
            Collection collection = this.a;
            this.b = collection.iterator();
            this.d = collection.size();
        }
        if (this.b.hasNext()) {
            consumer.accept(this.b.next());
            return true;
        }
        return false;
    }
}

