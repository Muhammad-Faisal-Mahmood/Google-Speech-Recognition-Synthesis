/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class hbf
extends hdx {
    final Iterator a;

    public hbf(Iterator iterator) {
        this.a = iterator;
    }

    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final Object next() {
        return this.a.next();
    }
}

