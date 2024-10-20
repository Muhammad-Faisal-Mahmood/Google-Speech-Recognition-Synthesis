/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.A;
import j$.util.stream.B0;
import j$.util.stream.L;
import j$.util.stream.M0;
import j$.util.stream.N0;
import j$.util.stream.O;
import j$.util.stream.P0;
import j$.util.stream.b_0;
import j$.util.stream.h_0;
import j$.util.stream.k_0;
import j$.util.stream.l_0;
import j$.util.stream.m0_0;
import j$.util.stream.r;
import j$.util.stream.w0;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/*
 * Renamed from j$.util.stream.m
 */
final class m_0
extends w0 {
    static O x(b_0 b_02, Spliterator spliterator) {
        h_0 h_02 = new h_0(14);
        h_0 h_03 = new h_0(15);
        h_0 h_04 = new h_0(16);
        Objects.requireNonNull(h_02);
        Objects.requireNonNull(h_03);
        Objects.requireNonNull(h_04);
        return new O((Collection)new m0_0(N0.REFERENCE, h_04, h_03, h_02).b(b_02, spliterator));
    }

    @Override
    final L n(b_0 hashSet, Spliterator object, IntFunction object2) {
        if (M0.DISTINCT.s(((b_0)((Object)hashSet)).i())) {
            return ((b_0)((Object)hashSet)).c((Spliterator)object, false, (IntFunction)object2);
        }
        if (M0.ORDERED.s(((b_0)((Object)hashSet)).i())) {
            return m_0.x((b_0)((Object)hashSet), (Spliterator)object);
        }
        object2 = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        A a2 = new A(3, object2, concurrentHashMap);
        Objects.requireNonNull(a2);
        new r(a2, false).b((b_0)((Object)hashSet), (Spliterator)object);
        object = concurrentHashMap.keySet();
        hashSet = object;
        if (((AtomicBoolean)object2).get()) {
            hashSet = new HashSet<Object>((Collection<Object>)object);
            hashSet.add(null);
        }
        return new O(hashSet);
    }

    @Override
    final Spliterator o(b_0 b_02, Spliterator spliterator) {
        if (M0.DISTINCT.s(b_02.i())) {
            return b_02.w(spliterator);
        }
        if (M0.ORDERED.s(b_02.i())) {
            return m_0.x(b_02, spliterator).spliterator();
        }
        return new P0(b_02.w(spliterator));
    }

    @Override
    final B0 q(int n2, B0 b0) {
        Objects.requireNonNull(b0);
        if (M0.DISTINCT.s(n2)) {
            return b0;
        }
        if (M0.SORTED.s(n2)) {
            return new k_0(b0);
        }
        return new l_0(b0);
    }
}

