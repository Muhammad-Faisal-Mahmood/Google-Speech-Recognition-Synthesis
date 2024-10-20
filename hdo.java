/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractSet;
import java.util.Collection;

abstract class hdo
extends AbstractSet {
    @Override
    public boolean removeAll(Collection collection) {
        return hhk.v(this, collection);
    }

    @Override
    public boolean retainAll(Collection collection) {
        fxf.K(collection);
        return super.retainAll(collection);
    }
}

