/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.stream.D;
import j$.util.stream.E;
import java.util.function.Predicate;

final class B
extends D {
    final E c;
    final Predicate d;

    B(E e2, Predicate predicate) {
        this.c = e2;
        this.d = predicate;
        super(e2);
    }

    public final void accept(Object object) {
        boolean bl2;
        if (!this.a && (bl2 = this.d.test(object)) == E.m((E)((Object)(object = this.c)))) {
            this.a = true;
            this.b = E.g((E)((Object)object));
        }
    }
}

