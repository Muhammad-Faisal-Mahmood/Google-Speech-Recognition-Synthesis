/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.util.concurrent.a_0;
import j$.util.concurrent.k;
import j$.util.concurrent.l;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class d
extends a_0
implements Iterator {
    public final Object next() {
        l l2 = this.b;
        if (l2 != null) {
            Object object = l2.b;
            Object object2 = l2.c;
            this.j = l2;
            this.c();
            return new k(object, object2, this.i);
        }
        throw new NoSuchElementException();
    }
}

