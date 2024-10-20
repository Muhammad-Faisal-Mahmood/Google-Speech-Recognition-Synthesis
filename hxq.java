/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

final class hxq
implements Map.Entry {
    public final Map.Entry a;

    public hxq(Map.Entry entry) {
        this.a = entry;
    }

    public final Object getKey() {
        return this.a.getKey();
    }

    public final Object getValue() {
        if ((hxs)this.a.getValue() == null) {
            return null;
        }
        throw null;
    }

    public final Object setValue(Object object) {
        if (object instanceof hyf) {
            hxs hxs2 = (hxs)this.a.getValue();
            hyf hyf2 = (hyf)object;
            object = hxs2.a;
            hxs2.b = null;
            hxs2.a = hyf2;
            return object;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}

