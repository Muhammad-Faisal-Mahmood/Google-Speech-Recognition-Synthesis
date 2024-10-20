/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Spliterator;
import j$.util.function.Consumer$_CC;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

final class C
implements Iterator,
Consumer {
    boolean a;
    Object b;
    final Spliterator c;

    C(Spliterator spliterator) {
        this.c = spliterator;
        this.a = false;
    }

    public final void accept(Object object) {
        this.a = true;
        this.b = object;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }

    @Override
    public final boolean hasNext() {
        if (!this.a) {
            this.c.o(this);
        }
        return this.a;
    }

    public final Object next() {
        if (!this.a && !this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}

