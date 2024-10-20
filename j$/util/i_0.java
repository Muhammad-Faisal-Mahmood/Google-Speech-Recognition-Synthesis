/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.j_0;
import j$.util.m_0;
import j$.util.n;
import j$.util.p;
import j$.util.t;
import j$.util.z;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/*
 * Renamed from j$.util.i
 */
final class i_0
implements Iterator,
t {
    public final int a;
    private final Iterator b;

    public i_0(j_0 j_02) {
        this.a = 0;
        this.b = j_02.a.iterator();
    }

    public i_0(p p2) {
        this.a = 1;
        this.b = p2.a.iterator();
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            default: {
                consumer = new m_0(consumer);
                z.j(this.b, consumer);
                return;
            }
            case 0: 
        }
        z.j(this.b, consumer);
    }

    @Override
    public final boolean hasNext() {
        switch (this.a) {
            default: {
                return this.b.hasNext();
            }
            case 0: 
        }
        return this.b.hasNext();
    }

    public final Object next() {
        switch (this.a) {
            default: {
                return new n((Map.Entry)this.b.next());
            }
            case 0: 
        }
        return this.b.next();
    }

    @Override
    public final void remove() {
        switch (this.a) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 0: 
        }
        throw new UnsupportedOperationException();
    }
}

