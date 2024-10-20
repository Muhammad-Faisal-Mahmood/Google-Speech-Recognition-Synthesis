/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.A;
import j$.util.Comparator;
import j$.util.Comparator$_CC;
import j$.util.List;
import j$.util.List$_CC;
import j$.util.M;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.t;
import j$.util.v;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public abstract class z {
    public static void c(A a2, Consumer consumer) {
        block4: {
            block3: {
                block2: {
                    if (!(consumer instanceof IntConsumer)) break block2;
                    a2.q((IntConsumer)((Object)consumer));
                    break block3;
                }
                if (M.a) break block4;
                Objects.requireNonNull(consumer);
                a2.q(new v(consumer));
            }
            return;
        }
        M.a(a2.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
        throw null;
    }

    public static long e(Spliterator spliterator) {
        long l2 = (spliterator.a() & 0x40) == 0 ? -1L : spliterator.d();
        return l2;
    }

    public static boolean f(Spliterator spliterator, int n2) {
        boolean bl2 = (spliterator.a() & n2) == n2;
        return bl2;
    }

    public static boolean i(A a2, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return a2.g((IntConsumer)((Object)consumer));
        }
        if (!M.a) {
            Objects.requireNonNull(consumer);
            return a2.g(new v(consumer));
        }
        M.a(a2.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
        throw null;
    }

    public static void j(Iterator iterator, Consumer consumer) {
        if (iterator instanceof t) {
            ((t)((Object)iterator)).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (iterator.hasNext()) {
            consumer.accept(iterator.next());
        }
    }

    public static /* synthetic */ void p(java.util.List list, java.util.Comparator comparator) {
        if (list instanceof List) {
            ((List)((Object)list)).sort(comparator);
            return;
        }
        List$_CC.$default$sort(list, comparator);
    }

    public static /* synthetic */ java.util.Comparator r(java.util.Comparator comparator, java.util.Comparator comparator2) {
        if (comparator instanceof Comparator) {
            return ((Comparator)((Object)comparator)).thenComparing(comparator2);
        }
        return Comparator$_CC.$default$thenComparing(comparator, comparator2);
    }

    public int a() {
        return 16448;
    }

    public Spliterator b() {
        return null;
    }

    public long d() {
        return 0L;
    }

    public boolean h(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return false;
    }

    public void n(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
    }
}

