/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.stream.B0;
import j$.util.stream.J0;
import j$.util.stream.O0;
import j$.util.stream.S0;
import j$.util.stream.a_0;
import java.util.function.Consumer;

final class T0
extends O0 {
    @Override
    public final void forEachRemaining(Consumer consumer) {
        if (this.h == null && !this.i) {
            Objects.requireNonNull(consumer);
            this.f();
            Objects.requireNonNull(consumer);
            consumer = new S0(consumer, 1);
            Spliterator spliterator = this.d;
            this.b.u(spliterator, (B0)consumer);
            this.i = true;
        } else {
            while (this.o(consumer)) {
            }
        }
    }

    @Override
    final void i() {
        Consumer consumer = new J0();
        this.h = consumer;
        Objects.requireNonNull(consumer);
        consumer = new S0(consumer, 0);
        this.e = this.b.v((B0)consumer);
        this.f = new a_0(6, this);
    }

    @Override
    final O0 j(Spliterator spliterator) {
        return new O0(this.b, spliterator, this.a);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean o(Consumer consumer) {
        void var8_8;
        boolean bl2;
        block4: {
            Objects.requireNonNull(consumer);
            bl2 = this.c();
            if (!bl2) return bl2;
            J0 j0 = (J0)this.h;
            long l2 = this.g;
            if (j0.b == 0) {
                if (l2 >= (long)j0.a) throw new IndexOutOfBoundsException(Long.toString(l2));
                Object object = j0.d[(int)l2];
            } else {
                if (l2 >= j0.count()) throw new IndexOutOfBoundsException(Long.toString(l2));
                int n2 = 0;
                while (n2 <= j0.b) {
                    Object[] objectArray = j0.e[n2];
                    long l3 = j0.c[n2];
                    if (l2 < (long)objectArray.length + l3) {
                        Object object = objectArray[(int)(l2 - l3)];
                        break block4;
                    }
                    ++n2;
                }
                throw new IndexOutOfBoundsException(Long.toString(l2));
            }
        }
        consumer.accept(var8_8);
        return bl2;
    }
}

