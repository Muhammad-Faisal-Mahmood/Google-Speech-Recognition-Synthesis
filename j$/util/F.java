/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.B;
import j$.util.M;
import j$.util.Objects;
import j$.util.u;
import j$.util.z;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

final class F
extends z
implements B {
    @Override
    public final void forEachRemaining(Consumer consumer) {
        block4: {
            block3: {
                block2: {
                    if (!(consumer instanceof DoubleConsumer)) break block2;
                    Objects.requireNonNull((DoubleConsumer)((Object)consumer));
                    break block3;
                }
                if (M.a) break block4;
                Objects.requireNonNull(consumer);
                Objects.requireNonNull(new u(consumer));
            }
            return;
        }
        M.a(F.class, "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
        throw null;
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
        block4: {
            block3: {
                block2: {
                    if (!(consumer instanceof DoubleConsumer)) break block2;
                    Objects.requireNonNull((DoubleConsumer)((Object)consumer));
                    break block3;
                }
                if (M.a) break block4;
                Objects.requireNonNull(consumer);
                Objects.requireNonNull(new u(consumer));
            }
            return false;
        }
        M.a(F.class, "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
        throw null;
    }
}

