/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

final class gyo
extends AbstractCollection {
    final gyp a;

    public gyo(gyp gyp2) {
        this.a = gyp2;
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final Iterator iterator() {
        Object object = this.a;
        Map map = ((gyp)object).j();
        object = map != null ? map.values().iterator() : new gyj((gyp)object);
        return object;
    }

    @Override
    public final int size() {
        return this.a.size();
    }
}

