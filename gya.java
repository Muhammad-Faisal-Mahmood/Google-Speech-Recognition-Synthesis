/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class gya
extends gxp
implements hce {
    private static final long serialVersionUID = 7431625294878419160L;

    protected gya(Map map) {
        super(map);
    }

    @Override
    public final Collection c(Object object, Collection collection) {
        return new gxo(this, object, (Set)collection);
    }

    @Override
    public final void m(Object object, Object object2) {
        throw null;
    }
}

