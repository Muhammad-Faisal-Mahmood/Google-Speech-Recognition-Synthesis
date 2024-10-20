/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public final class its {
    public static final its a;
    private static final IdentityHashMap c;
    public final IdentityHashMap b;

    static {
        IdentityHashMap identityHashMap;
        c = identityHashMap = new IdentityHashMap();
        a = new its(identityHashMap);
    }

    public its(IdentityHashMap identityHashMap) {
        this.b = identityHashMap;
    }

    public final Object a(itr itr2) {
        return this.b.get(itr2);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (its)object;
            IdentityHashMap object22 = this.b;
            IdentityHashMap identityHashMap = ((its)object).b;
            if (object22.size() != identityHashMap.size()) {
                return false;
            }
            for (Map.Entry entry : this.b.entrySet()) {
                if (!((its)object).b.containsKey(entry.getKey())) {
                    return false;
                }
                if (a.k(entry.getValue(), ((its)object).b.get(entry.getKey()))) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator iterator = this.b.entrySet().iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            n2 += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return n2;
    }

    public final String toString() {
        return this.b.toString();
    }
}

