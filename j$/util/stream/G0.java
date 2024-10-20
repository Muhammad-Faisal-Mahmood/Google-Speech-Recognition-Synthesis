/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.J0;
import j$.util.z;
import java.util.Comparator;
import java.util.function.Consumer;

final class G0
implements Spliterator {
    int a;
    final int b;
    int c;
    final int d;
    Object[] e;
    final J0 f;

    G0(J0 objectArray, int n2, int n3, int n4, int n5) {
        this.f = objectArray;
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
        Object[][] objectArray2 = objectArray.e;
        objectArray = objectArray2 == null ? objectArray.d : objectArray2[n2];
        this.e = objectArray;
    }

    @Override
    public final int a() {
        return 16464;
    }

    @Override
    public final Spliterator b() {
        int n2 = this.a;
        int n3 = this.b;
        if (n2 < n3) {
            int n4 = this.c;
            Object object = this.f;
            object = new G0((J0)object, n2, n3 - 1, n4, ((J0)object).e[n3 - 1].length);
            this.a = n3;
            this.c = 0;
            this.e = this.f.e[n3];
            return object;
        }
        Spliterator spliterator = null;
        if (n2 == n3) {
            n2 = this.c;
            n3 = (this.d - n2) / 2;
            if (n3 == 0) {
                return null;
            }
            spliterator = Spliterators.g(this.e, n2, n2 + n3, 1040);
            this.c += n3;
        }
        return spliterator;
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

    @Override
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int n2 = this.a;
        int n3 = this.d;
        int n4 = this.b;
        if (n2 < n4 || n2 == n4 && this.c < n3) {
            Object[] objectArray;
            int n5 = this.c;
            while (true) {
                objectArray = this.f;
                if (n2 >= n4) break;
                objectArray = objectArray.e[n2];
                while (n5 < objectArray.length) {
                    consumer.accept(objectArray[n5]);
                    ++n5;
                }
                ++n2;
                n5 = 0;
            }
            objectArray = this.a == n4 ? this.e : objectArray.e[n4];
            while (n5 < n3) {
                consumer.accept(objectArray[n5]);
                ++n5;
            }
            this.a = n4;
            this.c = n3;
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
    public final boolean o(Consumer objectArray) {
        Objects.requireNonNull(objectArray);
        int n2 = this.a;
        int n3 = this.b;
        if (n2 >= n3 && (n2 != n3 || this.c >= this.d)) {
            return false;
        }
        Object[] objectArray2 = this.e;
        n2 = this.c;
        this.c = n2 + 1;
        objectArray.accept(objectArray2[n2]);
        if (this.c == this.e.length) {
            this.c = 0;
            this.a = n2 = this.a + 1;
            objectArray = this.f.e;
            if (objectArray != null && n2 <= n3) {
                this.e = objectArray[n2];
            }
        }
        return true;
    }
}

