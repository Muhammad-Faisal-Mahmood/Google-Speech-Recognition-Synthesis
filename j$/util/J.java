/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.A;
import j$.util.Spliterator;
import j$.util.z;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

final class J
implements A {
    private final int[] a;
    private int b;
    private final int c;
    private final int d;

    public J(int[] nArray, int n2, int n3, int n4) {
        this.a = nArray;
        this.b = n2;
        this.c = n3;
        this.d = n4 | 0x4040;
    }

    @Override
    public final int a() {
        return this.d;
    }

    @Override
    public final Spliterator b() {
        J j2;
        int n2 = this.b;
        int n3 = this.c + n2 >>> 1;
        if (n2 >= n3) {
            j2 = null;
        } else {
            this.b = n3;
            int n4 = this.d;
            j2 = new J(this.a, n2, n3, n4);
        }
        return j2;
    }

    @Override
    public final long d() {
        return this.c - this.b;
    }

    @Override
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        z.c(this, consumer);
    }

    @Override
    public final boolean g(IntConsumer intConsumer) {
        intConsumer.getClass();
        int n2 = this.b;
        if (n2 >= 0 && n2 < this.c) {
            this.b = n2 + 1;
            intConsumer.accept(this.a[n2]);
            return true;
        }
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
        if (z.f(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override
    public final /* synthetic */ boolean o(Consumer consumer) {
        return z.i(this, consumer);
    }

    @Override
    public final void q(IntConsumer intConsumer) {
        intConsumer.getClass();
        int[] nArray = this.a;
        int n2 = nArray.length;
        int n3 = this.c;
        if (n2 >= n3 && (n2 = this.b) >= 0) {
            this.b = n3;
            if (n2 < n3) {
                int n4;
                do {
                    intConsumer.accept(nArray[n2]);
                    n2 = n4 = n2 + 1;
                } while (n4 < n3);
            }
        }
    }
}

