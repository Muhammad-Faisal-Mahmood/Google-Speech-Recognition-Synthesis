/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.z;
import java.util.Comparator;
import java.util.function.Consumer;

final class I
extends z
implements Spliterator {
    @Override
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
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
        Objects.requireNonNull(consumer);
        return false;
    }
}

