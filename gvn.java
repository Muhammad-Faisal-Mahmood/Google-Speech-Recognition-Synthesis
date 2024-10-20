/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Map;

final class gvn
extends gva {
    final gwr b;

    public gvn(gwr gwr2) {
        this.b = gwr2;
        super(gwr2);
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Object object2 = (object = (Map.Entry)object).getKey();
        if (object2 == null) {
            return false;
        }
        Object object3 = this.b.get(object2);
        if (object3 != null) {
            object2 = this.b;
            if (((gwr)object2).i.c(object = object.getValue(), object3)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        return new gvm(this.b);
    }

    @Override
    public final boolean remove(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        return (object = entry.getKey()) != null && this.b.remove(object, entry.getValue());
    }
}

