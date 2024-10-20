/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class hya
extends LinkedHashMap {
    public static final hya a;
    public boolean b = true;

    static {
        hya hya2;
        a = hya2 = new hya();
        hya2.c();
    }

    private hya() {
    }

    private hya(Map map) {
        super(map);
    }

    private static int d(Object object) {
        if (object instanceof byte[]) {
            int n2;
            byte[] byArray = (byte[])object;
            object = hxl.b;
            int n3 = byArray.length;
            n3 = n2 = hxl.b(n3, byArray, 0, n3);
            if (n2 == 0) {
                n3 = 1;
            }
            return n3;
        }
        if (!(object instanceof hwx)) {
            return object.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final hya a() {
        hya hya2 = this.isEmpty() ? new hya() : new hya((Map)this);
        return hya2;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void c() {
        this.b = false;
    }

    @Override
    public final void clear() {
        this.b();
        super.clear();
    }

    @Override
    public final Set entrySet() {
        Set<Object> set = this.isEmpty() ? Collections.emptySet() : super.entrySet();
        return set;
    }

    @Override
    public final boolean equals(Object object) {
        if (object instanceof Map) {
            if (this != (object = (Map)object)) {
                if (this.size() == object.size()) {
                    for (Map.Entry entry : this.entrySet()) {
                        if (object.containsKey(entry.getKey())) {
                            Object v2 = entry.getValue();
                            entry = object.get(entry.getKey());
                            boolean bl2 = v2 instanceof byte[] && entry instanceof byte[] ? Arrays.equals((byte[])v2, (byte[])entry) : v2.equals(entry);
                            if (bl2) continue;
                        }
                        break;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        Iterator iterator = this.entrySet().iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            int n3 = hya.d(entry.getKey());
            n2 += hya.d(entry.getValue()) ^ n3;
        }
        return n2;
    }

    @Override
    public final Object put(Object object, Object object2) {
        this.b();
        hxl.c(object);
        hxl.c(object2);
        return super.put(object, object2);
    }

    @Override
    public final void putAll(Map map) {
        this.b();
        for (Object k2 : map.keySet()) {
            hxl.c(k2);
            hxl.c(map.get(k2));
        }
        super.putAll(map);
    }

    @Override
    public final Object remove(Object object) {
        this.b();
        return super.remove(object);
    }
}

