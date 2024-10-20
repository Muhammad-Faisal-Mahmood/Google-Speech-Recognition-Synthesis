/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.A;
import j$.util.B;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.I0;
import j$.util.z;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

final class H0
implements A,
B {
    int a;
    final int b;
    int c;
    final int d;
    Object e;
    final I0 f;
    final I0 g;

    H0(I0 object, int n2, int n3, int n4, int n5) {
        this.g = object;
        this.f = object;
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
        Object[] objectArray = ((I0)object).e;
        object = objectArray == null ? ((I0)object).d : objectArray[n2];
        this.e = object;
    }

    @Override
    public final int a() {
        return 16464;
    }

    @Override
    public final Spliterator b() {
        A a2;
        int n2 = this.a;
        int n3 = this.b;
        if (n2 < n3) {
            int n4 = n3 - 1;
            int n5 = this.c;
            I0 i0 = this.f;
            int n6 = ((int[])i0.e[n4]).length;
            a2 = new H0(this.g, n2, n4, n5, n6);
            this.a = n3;
            this.c = 0;
            this.e = i0.e[n3];
        } else {
            H0 h0;
            a2 = h0 = null;
            if (n2 == n3) {
                int n7 = this.c;
                int n8 = (this.d - n7) / 2;
                if (n8 == 0) {
                    a2 = h0;
                } else {
                    a2 = Spliterators.f((int[])this.e, n7, n7 + n8);
                    this.c += n8;
                }
            }
        }
        return a2;
    }

    public final void c(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        int n2 = this.a;
        int n3 = this.d;
        int n4 = this.b;
        if (n2 < n4 || n2 == n4 && this.c < n3) {
            Object object;
            I0 i0;
            int n5 = this.c;
            while (true) {
                i0 = this.f;
                if (n2 >= n4) break;
                object = i0.e[n2];
                I0.m(object, n5, ((int[])object).length, intConsumer);
                ++n2;
                n5 = 0;
            }
            object = this.a == n4 ? this.e : i0.e[n4];
            i0.getClass();
            I0.m(object, n5, n3, intConsumer);
            this.a = n4;
            this.c = n3;
        }
    }

    @Override
    public final long d() {
        long l2;
        int n2 = this.a;
        int n3 = this.d;
        int n4 = this.b;
        if (n2 == n4) {
            l2 = (long)n3 - (long)this.c;
        } else {
            long[] lArray = this.f.c;
            l2 = lArray[n4] + (long)n3 - lArray[n2] - (long)this.c;
        }
        return l2;
    }

    public final boolean e(IntConsumer objectArray) {
        Objects.requireNonNull(objectArray);
        int n2 = this.a;
        int n3 = this.b;
        if (n2 >= n3 && (n2 != n3 || this.c >= this.d)) {
            return false;
        }
        Object object = this.e;
        n2 = this.c;
        this.c = n2 + 1;
        objectArray.accept(((int[])object)[n2]);
        n2 = this.c;
        objectArray = this.e;
        object = this.f;
        object.getClass();
        if (n2 == ((int[])objectArray).length) {
            this.c = 0;
            this.a = n2 = this.a + 1;
            objectArray = ((I0)object).e;
            if (objectArray != null && n2 <= n3) {
                this.e = objectArray[n2];
            }
        }
        return true;
    }

    @Override
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        z.c(this, consumer);
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
    public final /* synthetic */ boolean o(Consumer consumer) {
        return z.i(this, consumer);
    }
}

