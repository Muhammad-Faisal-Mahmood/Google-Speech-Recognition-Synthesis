/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

final class hbx
extends hdx {
    final Iterator a;

    public hbx(Iterator iterator) {
        this.a = iterator;
    }

    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }
}

