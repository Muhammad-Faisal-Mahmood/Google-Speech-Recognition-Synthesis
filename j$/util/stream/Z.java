/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.stream.a0_0;
import java.util.ArrayDeque;
import java.util.function.Consumer;

final class Z
extends a0_0 {
    @Override
    public final void forEachRemaining(Consumer consumer) {
        if (this.a == null) {
            return;
        }
        if (this.d == null) {
            Object object = this.c;
            if (object == null) {
                ArrayDeque arrayDeque = this.e();
                while ((object = a0_0.c(arrayDeque)) != null) {
                    object.forEach(consumer);
                }
                this.a = null;
            } else {
                object.forEachRemaining(consumer);
            }
        } else {
            while (this.o(consumer)) {
            }
        }
    }

    @Override
    public final boolean o(Consumer consumer) {
        if (!this.f()) {
            return false;
        }
        boolean bl2 = this.d.o(consumer);
        if (!bl2) {
            Object object;
            if (this.c == null && (object = a0_0.c(this.e)) != null) {
                this.d = object = object.spliterator();
                return object.o(consumer);
            }
            this.a = null;
        }
        return bl2;
    }
}

