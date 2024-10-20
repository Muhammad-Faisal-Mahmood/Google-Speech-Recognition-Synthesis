/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.A;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.z;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

final class U0
implements A {
    private int a;
    private final int b;

    private U0(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    U0(int n2, int n3, int n4) {
        this(n2, n3);
    }

    @Override
    public final int a() {
        return 17749;
    }

    @Override
    public final Spliterator b() {
        U0 u0;
        long l2 = this.d();
        if (l2 <= 1L) {
            u0 = null;
        } else {
            int n2 = this.a;
            int n3 = l2 < 0x1000000L ? 2 : 8;
            this.a = n3 = (int)(l2 / (long)n3) + n2;
            u0 = new U0(n2, n3);
        }
        return u0;
    }

    @Override
    public final long d() {
        return (long)this.b - (long)this.a + (long)0;
    }

    @Override
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        z.c(this, consumer);
    }

    @Override
    public final boolean g(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        int n2 = this.a;
        if (n2 < this.b) {
            this.a = n2 + 1;
            intConsumer.accept(n2);
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
        return null;
    }

    @Override
    public final /* synthetic */ boolean o(Consumer consumer) {
        return z.i(this, consumer);
    }

    @Override
    public final void q(IntConsumer intConsumer) {
        int n2;
        Objects.requireNonNull(intConsumer);
        this.a = n2 = this.b;
        for (int i2 = this.a; i2 < n2; ++i2) {
            intConsumer.accept(i2);
        }
    }
}

