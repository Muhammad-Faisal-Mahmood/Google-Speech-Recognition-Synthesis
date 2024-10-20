/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class gym
extends AbstractSet {
    final gyp a;

    public gym(gyp gyp2) {
        this.a = gyp2;
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final boolean contains(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public final Iterator iterator() {
        Object object = this.a;
        Map map = ((gyp)object).j();
        object = map != null ? map.keySet().iterator() : new gyh((gyp)object);
        return object;
    }

    @Override
    public final boolean remove(Object object) {
        block4: {
            boolean bl2;
            block3: {
                block2: {
                    Map map = this.a.j();
                    if (map == null) break block2;
                    bl2 = map.keySet().remove(object);
                    break block3;
                }
                if (this.a.f(object) != gyp.a) break block4;
                bl2 = false;
            }
            return bl2;
        }
        return true;
    }

    @Override
    public final int size() {
        return this.a.size();
    }
}

