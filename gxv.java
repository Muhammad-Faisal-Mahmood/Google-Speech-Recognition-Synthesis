/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

final class gxv
extends AbstractCollection {
    final gxw a;

    public gxv(gxw gxw2) {
        this.a = gxw2;
    }

    @Override
    public final void clear() {
        this.a.k();
    }

    @Override
    public final boolean contains(Object object) {
        boolean bl2;
        block1: {
            Iterator iterator = this.a.o().values().iterator();
            while (iterator.hasNext()) {
                if (!((Collection)iterator.next()).contains(object)) continue;
                bl2 = true;
                break block1;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public final Iterator iterator() {
        return this.a.g();
    }

    @Override
    public final int size() {
        return this.a.e();
    }
}

