/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.stream.B0;
import j$.util.stream.x0;
import java.util.function.Consumer;

/*
 * Renamed from j$.util.stream.v0
 */
final class v0_0
extends x0 {
    @Override
    public final void forEach(Consumer consumer) {
        if (!this.k()) {
            this.s().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override
    public final void forEachOrdered(Consumer consumer) {
        if (!this.k()) {
            this.s().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }

    @Override
    final boolean p() {
        throw new UnsupportedOperationException();
    }

    @Override
    final B0 q(int n2, B0 b0) {
        throw new UnsupportedOperationException();
    }
}

