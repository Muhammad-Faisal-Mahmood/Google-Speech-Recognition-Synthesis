/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.A;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.stream.B0;
import j$.util.stream.I0;
import j$.util.stream.O0;
import j$.util.stream.Q0;
import j$.util.stream.a_0;
import j$.util.z;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

final class R0
extends O0
implements A {
    @Override
    public final Spliterator b() {
        return (A)super.b();
    }

    @Override
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        z.c(this, consumer);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final boolean g(IntConsumer var1_1) {
        block2: {
            block5: {
                block3: {
                    block4: {
                        Objects.requireNonNull(var1_1);
                        var7_2 = this.c();
                        if (!var7_2) break block2;
                        var8_3 = (I0)this.h;
                        var5_4 = this.g;
                        var4_5 = var8_3.b;
                        var3_6 = 0;
                        if (var4_5 != 0) break block3;
                        if (var5_4 >= (long)var8_3.a) break block4;
                        var2_7 = var3_6;
                        ** GOTO lbl-1000
                    }
                    throw new IndexOutOfBoundsException(Long.toString(var5_4));
                }
                if (var5_4 < var8_3.count()) {
                    for (var2_7 = 0; var2_7 <= var8_3.b; ++var2_7) {
                        if (var5_4 >= var8_3.c[var2_7] + (long)((int[])var8_3.e[var2_7]).length) continue;
                    }
                }
                break block5;
lbl-1000:
                // 2 sources

                {
                    var2_7 = var8_3.b == 0 && var2_7 == 0 ? ((int[])var8_3.d)[(int)var5_4] : ((int[][])var8_3.e)[var2_7][(int)(var5_4 - var8_3.c[var2_7])];
                    var1_1.accept(var2_7);
                    break block2;
                }
                throw new IndexOutOfBoundsException(Long.toString(var5_4));
            }
            throw new IndexOutOfBoundsException(Long.toString(var5_4));
        }
        return var7_2;
    }

    @Override
    final void i() {
        IntConsumer intConsumer = new I0();
        this.h = intConsumer;
        Objects.requireNonNull(intConsumer);
        intConsumer = new Q0(intConsumer, 0);
        this.e = this.b.v((B0)((Object)intConsumer));
        this.f = new a_0(5, this);
    }

    @Override
    final O0 j(Spliterator spliterator) {
        return new O0(this.b, spliterator, this.a);
    }

    @Override
    public final /* synthetic */ boolean o(Consumer consumer) {
        return z.i(this, consumer);
    }

    @Override
    public final void q(IntConsumer object) {
        if (this.h == null && !this.i) {
            Objects.requireNonNull(object);
            this.f();
            Objects.requireNonNull(object);
            Q0 q0 = new Q0((IntConsumer)object, 1);
            object = this.d;
            this.b.u((Spliterator)object, q0);
            this.i = true;
        } else {
            while (this.g((IntConsumer)object)) {
            }
        }
    }
}

