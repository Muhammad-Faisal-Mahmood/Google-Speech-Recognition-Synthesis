/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractSet;

abstract class gva
extends AbstractSet {
    final gwr a;

    public gva(gwr gwr2) {
        this.a = gwr2;
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final int size() {
        return this.a.size();
    }
}

