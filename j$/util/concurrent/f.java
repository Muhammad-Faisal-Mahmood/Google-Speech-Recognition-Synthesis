/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.k;
import j$.util.concurrent.l;
import j$.util.concurrent.q;
import j$.util.z;
import java.util.Comparator;
import java.util.function.Consumer;

final class f
extends q
implements Spliterator {
    final ConcurrentHashMap i;
    long j;

    f(l[] lArray, int n2, int n3, int n4, long l2, ConcurrentHashMap concurrentHashMap) {
        super(lArray, n2, n3, n4);
        this.i = concurrentHashMap;
        this.j = l2;
    }

    @Override
    public final int a() {
        return 4353;
    }

    @Override
    public final Spliterator b() {
        Object object;
        int n2 = this.f;
        int n3 = this.g;
        int n4 = n2 + n3 >>> 1;
        if (n4 <= n2) {
            object = null;
        } else {
            long l2;
            l[] lArray = this.a;
            this.g = n4;
            this.j = l2 = this.j >>> 1;
            object = this.i;
            object = new f(lArray, this.h, n4, n3, l2, (ConcurrentHashMap)object);
        }
        return object;
    }

    @Override
    public final long d() {
        return this.j;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        l l2;
        consumer.getClass();
        while ((l2 = this.c()) != null) {
            consumer.accept(new k(l2.b, l2.c, this.i));
        }
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
    public final Comparator m() {
        throw new IllegalStateException();
    }

    @Override
    public final boolean o(Consumer consumer) {
        consumer.getClass();
        l l2 = this.c();
        if (l2 == null) {
            return false;
        }
        consumer.accept(new k(l2.b, l2.c, this.i));
        return true;
    }
}

