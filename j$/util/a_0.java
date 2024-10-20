/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.z;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.function.Consumer;

/*
 * Renamed from j$.util.a
 */
final class a_0
implements Spliterator {
    private final List a;
    private int b;
    private int c;

    private a_0(a_0 a_02, int n2, int n3) {
        this.a = a_02.a;
        this.b = n2;
        this.c = n3;
    }

    a_0(List list) {
        this.a = list;
        this.b = 0;
        this.c = -1;
    }

    private int c() {
        int n2;
        int n3 = n2 = this.c;
        if (n2 < 0) {
            this.c = n3 = this.a.size();
        }
        return n3;
    }

    @Override
    public final int a() {
        return 16464;
    }

    @Override
    public final Spliterator b() {
        a_0 a_02;
        int n2 = this.c();
        int n3 = this.b;
        if (n3 >= (n2 = n2 + n3 >>> 1)) {
            a_02 = null;
        } else {
            this.b = n2;
            a_02 = new a_0(this, n3, n2);
        }
        return a_02;
    }

    @Override
    public final long d() {
        return this.c() - this.b;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int n2 = this.c();
        this.b = n2;
        for (int i2 = this.b; i2 < n2; ++i2) {
            List list = this.a;
            try {
                list = list.get(i2);
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw new ConcurrentModificationException();
            }
            consumer.accept(list);
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
        int n2 = this.c();
        int n3 = this.b;
        if (n3 < n2) {
            this.b = n3 + 1;
            List list = this.a;
            try {
                list = list.get(n3);
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                throw new ConcurrentModificationException();
            }
            consumer.accept(list);
            return true;
        }
        return false;
    }
}

