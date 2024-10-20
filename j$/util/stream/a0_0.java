/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.L;
import j$.util.stream.M;
import j$.util.z;
import java.util.ArrayDeque;
import java.util.Comparator;

/*
 * Renamed from j$.util.stream.a0
 */
abstract class a0_0
implements Spliterator {
    L a;
    int b;
    Spliterator c;
    Spliterator d;
    ArrayDeque e;

    a0_0(M m2) {
        this.a = m2;
    }

    protected static L c(ArrayDeque arrayDeque) {
        L l2;
        while ((l2 = (L)arrayDeque.pollFirst()) != null) {
            if (l2.h() == 0) {
                if (l2.count() <= 0L) continue;
                return l2;
            }
            for (int i2 = l2.h() - 1; i2 >= 0; --i2) {
                arrayDeque.addFirst(l2.a(i2));
            }
        }
        return null;
    }

    @Override
    public final int a() {
        return 64;
    }

    @Override
    public final Spliterator b() {
        L l2 = this.a;
        if (l2 != null && this.d == null) {
            Object object = this.c;
            if (object != null) {
                return object.b();
            }
            if (this.b < l2.h() - 1) {
                object = this.a;
                int n2 = this.b;
                this.b = n2 + 1;
                return object.a(n2).spliterator();
            }
            this.a = object = this.a.a(this.b);
            if (object.h() == 0) {
                this.c = object = this.a.spliterator();
                return object.b();
            }
            object = this.a;
            this.b = 1;
            return object.a(0).spliterator();
        }
        return null;
    }

    @Override
    public final long d() {
        Object object = this.a;
        long l2 = 0L;
        if (object == null) {
            return 0L;
        }
        object = this.c;
        if (object != null) {
            return object.d();
        }
        for (int i2 = this.b; i2 < this.a.h(); ++i2) {
            l2 += this.a.a(i2).count();
        }
        return l2;
    }

    protected final ArrayDeque e() {
        ArrayDeque<L> arrayDeque = new ArrayDeque<L>(8);
        for (int i2 = this.a.h() - 1; i2 >= this.b; --i2) {
            arrayDeque.addFirst(this.a.a(i2));
        }
        return arrayDeque;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected final boolean f() {
        if (this.a == null) {
            return false;
        }
        if (this.d != null) return true;
        Object object = this.c;
        if (object != null) {
            this.d = object;
            return true;
        }
        this.e = object = this.e();
        if ((object = a0_0.c((ArrayDeque)object)) != null) {
            this.d = object.spliterator();
            return true;
        }
        this.a = null;
        return false;
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
}

