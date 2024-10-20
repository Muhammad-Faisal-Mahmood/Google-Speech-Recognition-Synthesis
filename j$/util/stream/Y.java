/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.A;
import j$.util.B;
import j$.util.stream.K;
import j$.util.stream.a0_0;
import j$.util.z;
import java.util.ArrayDeque;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

final class Y
extends a0_0
implements A,
B {
    @Override
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        z.c(this, consumer);
    }

    public final void i(IntConsumer intConsumer) {
        if (this.a == null) {
            return;
        }
        if (this.d == null) {
            Object object = this.c;
            if (object == null) {
                K k2;
                object = this.e();
                while ((k2 = (K)a0_0.c((ArrayDeque)object)) != null) {
                    k2.l(intConsumer);
                }
                this.a = null;
            } else {
                ((B)object).n(intConsumer);
            }
        } else {
            while (this.j(intConsumer)) {
            }
        }
    }

    public final boolean j(IntConsumer intConsumer) {
        if (!this.f()) {
            return false;
        }
        boolean bl2 = ((B)this.d).h(intConsumer);
        if (!bl2) {
            Object object;
            if (this.c == null && (object = (K)a0_0.c(this.e)) != null) {
                this.d = object = object.spliterator();
                return object.h(intConsumer);
            }
            this.a = null;
        }
        return bl2;
    }

    @Override
    public final /* synthetic */ boolean o(Consumer consumer) {
        return z.i(this, consumer);
    }
}

