/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public final class ob
extends oi {
    public final HashMap a = new HashMap();

    @Override
    public final oe a(Object object) {
        return (oe)this.a.get(object);
    }

    @Override
    public final Object b(Object object) {
        Object object2 = super.b(object);
        this.a.remove(object);
        return object2;
    }

    public final boolean c(Object object) {
        return this.a.containsKey(object);
    }
}

