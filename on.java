/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractSet;
import java.util.Iterator;

final class on
extends AbstractSet {
    final ot a;

    public on(ot ot2) {
        this.a = ot2;
    }

    @Override
    public final Iterator iterator() {
        return new oq(this.a);
    }

    @Override
    public final int size() {
        return this.a.f;
    }
}

