/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import java.util.Set;

final class agy
extends gzf {
    private final Map a;

    public agy(Map map) {
        this.a = map;
    }

    @Override
    protected final /* synthetic */ Object a() {
        return this.a;
    }

    @Override
    protected final Map b() {
        return this.a;
    }

    @Override
    public final boolean containsKey(Object object) {
        return object != null && super.containsKey(object);
    }

    @Override
    public final boolean containsValue(Object object) {
        return fvd.K(new hbv(this.entrySet().iterator()), object);
    }

    @Override
    public final Set entrySet() {
        return hhk.r(this.a.entrySet(), new agx(1));
    }

    @Override
    public final boolean equals(Object object) {
        return object != null && fvd.s(this, object);
    }

    @Override
    public final /* synthetic */ Object get(Object object) {
        if (object == null) {
            return null;
        }
        return (List)this.a.get(object);
    }

    @Override
    public final int hashCode() {
        return hhk.n(((gzf)this).entrySet());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean isEmpty() {
        boolean bl2;
        boolean bl3 = this.a.isEmpty();
        boolean bl4 = bl2 = true;
        if (bl3) return bl4;
        if (super.size() != 1) return false;
        if (!super.containsKey(null)) return false;
        return bl2;
    }

    @Override
    public final Set keySet() {
        return hhk.r(this.a.keySet(), new agx(0));
    }

    @Override
    public final int size() {
        return super.size() - super.containsKey(null);
    }
}

