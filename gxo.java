/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Set;

final class gxo
extends gxl
implements Set {
    final gxp f;

    public gxo(gxp gxp2, Object object, Set set) {
        this.f = gxp2;
        super(gxp2, object, set, null);
    }

    @Override
    public final boolean removeAll(Collection object) {
        if (object.isEmpty()) {
            return false;
        }
        int n2 = this.size();
        boolean bl2 = hhk.v((Set)this.b, (Collection)object);
        if (bl2) {
            int n3 = this.b.size();
            object = this.f;
            ((gxp)object).b += n3 - n2;
            this.c();
        }
        return bl2;
    }
}

