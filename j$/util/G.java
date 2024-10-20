/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.A;
import j$.util.Objects;
import j$.util.z;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

final class G
extends z
implements A {
    @Override
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        z.c(this, consumer);
    }

    @Override
    public final boolean g(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
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

    @Override
    public final /* synthetic */ boolean o(Consumer consumer) {
        return z.i(this, consumer);
    }

    @Override
    public final void q(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
    }
}

