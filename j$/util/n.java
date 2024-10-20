/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Objects;
import java.util.Map;

final class n
implements Map.Entry {
    private Map.Entry a;

    n(Map.Entry entry) {
        this.a = Objects.requireNonNull(entry);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return true;
        }
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        object = (Map.Entry)object;
        Map.Entry entry = this.a;
        Object k2 = entry.getKey();
        Object k3 = object.getKey();
        if (k2 == null) {
            if (k3 != null) return false;
            bl2 = true;
        } else {
            bl2 = k2.equals(k3);
        }
        if (!bl2) return false;
        entry = entry.getValue();
        object = object.getValue();
        if (entry == null) {
            if (object != null) return false;
            bl2 = true;
        } else {
            bl2 = ((Object)entry).equals(object);
        }
        if (!bl2) return false;
        return bl3;
    }

    public final Object getKey() {
        return this.a.getKey();
    }

    public final Object getValue() {
        return this.a.getValue();
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Object setValue(Object object) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.a.toString();
    }
}

