/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.nio.file.attribute.a;
import j$.util.A;
import j$.util.M;
import j$.util.Objects;
import j$.util.t;
import j$.util.v;
import j$.util.w;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

final class D
implements w,
IntConsumer,
t {
    boolean a;
    int b;
    final A c;

    D(A a2) {
        this.c = a2;
        this.a = false;
    }

    @Override
    public final void accept(int n2) {
        this.a = true;
        this.b = n2;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.nio.file.attribute.a.a(this, intConsumer);
    }

    @Override
    public final void forEachRemaining(Consumer object) {
        block7: {
            block6: {
                block5: {
                    if (!(object instanceof IntConsumer)) break block5;
                    object = (IntConsumer)object;
                    Objects.requireNonNull(object);
                    while (this.hasNext()) {
                        if (!this.a && !this.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        this.a = false;
                        object.accept(this.b);
                    }
                    break block6;
                }
                Objects.requireNonNull(object);
                if (!M.a) {
                    Objects.requireNonNull(object);
                    object = new v((Consumer)object);
                    Objects.requireNonNull(object);
                    while (this.hasNext()) {
                        if (!this.a && !this.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        this.a = false;
                        object.accept(this.b);
                    }
                }
                break block7;
            }
            return;
        }
        M.a(D.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
        throw null;
    }

    @Override
    public final boolean hasNext() {
        if (!this.a) {
            this.c.g(this);
        }
        return this.a;
    }

    public final Object next() {
        if (!M.a) {
            if (!this.a && !this.hasNext()) {
                throw new NoSuchElementException();
            }
            this.a = false;
            return this.b;
        }
        M.a(D.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }
}

