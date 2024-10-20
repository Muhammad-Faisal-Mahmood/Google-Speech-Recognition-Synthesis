/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.stream.H;
import j$.util.stream.I;
import j$.util.stream.J0;
import j$.util.stream.L;
import java.util.function.IntFunction;

/*
 * Renamed from j$.util.stream.e0
 */
final class e0_0
extends J0
implements L,
H {
    @Override
    public final L a(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final /* synthetic */ void accept(int n2) {
        I.c();
        throw null;
    }

    @Override
    public final void c() {
    }

    @Override
    public final Object[] d(IntFunction objectArray) {
        long l2 = this.count();
        if (l2 < 0x7FFFFFF7L) {
            objectArray = (Object[])objectArray.apply((int)l2);
            this.g(objectArray, 0);
            return objectArray;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override
    public final void e(long l2) {
        this.clear();
        this.m(l2);
    }

    @Override
    public final void g(Object[] objectArray, int n2) {
        long l2 = n2;
        long l3 = this.count() + l2;
        if (l3 <= (long)objectArray.length && l3 >= l2) {
            if (this.b == 0) {
                System.arraycopy(this.d, 0, objectArray, n2, this.a);
            } else {
                int n3;
                for (n3 = 0; n3 < this.b; ++n3) {
                    Object[] objectArray2 = this.e[n3];
                    System.arraycopy(objectArray2, 0, objectArray, n2, objectArray2.length);
                    n2 += this.e[n3].length;
                }
                n3 = this.a;
                if (n3 > 0) {
                    System.arraycopy(this.d, 0, objectArray, n2, n3);
                }
            }
            return;
        }
        throw new IndexOutOfBoundsException("does not fit");
    }

    @Override
    public final /* synthetic */ int h() {
        return 0;
    }

    @Override
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override
    public final L p() {
        return this;
    }
}

