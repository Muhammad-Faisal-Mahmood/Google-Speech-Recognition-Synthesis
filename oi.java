/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class oi
implements Iterable {
    public oe b;
    public oe c;
    public final WeakHashMap d = new WeakHashMap();
    public int e = 0;

    protected oe a(Object object) {
        oe oe2 = this.b;
        while (oe2 != null && !oe2.a.equals(object)) {
            oe2 = oe2.c;
        }
        return oe2;
    }

    public Object b(Object object) {
        Object object2;
        if ((object = this.a(object)) == null) {
            return null;
        }
        --this.e;
        if (!this.d.isEmpty()) {
            object2 = this.d.keySet().iterator();
            while (object2.hasNext()) {
                ((oh)object2.next()).aR((oe)object);
            }
        }
        object2 = ((oe)object).d;
        oe oe2 = ((oe)object).c;
        if (object2 != null) {
            ((oe)object2).c = oe2;
        } else {
            this.b = oe2;
        }
        oe2 = ((oe)object).c;
        if (oe2 != null) {
            oe2.d = object2;
        } else {
            this.c = object2;
        }
        ((oe)object).c = null;
        ((oe)object).d = null;
        return ((oe)object).b;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final oe d(Object object, Object object2) {
        object = new oe(object, object2);
        ++this.e;
        object2 = this.c;
        if (object2 == null) {
            this.b = object;
        } else {
            ((oe)object2).c = object;
            ((oe)object).d = object2;
        }
        this.c = object;
        return object;
    }

    public final of e() {
        of of2 = new of(this);
        this.d.put(of2, false);
        return of2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof oi)) {
            return false;
        }
        object = (oi)object;
        if (this.e != ((oi)object).e) {
            return false;
        }
        Iterator iterator = this.iterator();
        Iterator iterator2 = ((oi)object).iterator();
        while (iterator.hasNext() && iterator2.hasNext()) {
            block8: {
                Map.Entry entry;
                block7: {
                    entry = ((og)iterator).c();
                    Map.Entry entry2 = ((og)iterator2).c();
                    object = entry2;
                    if (entry != null) break block7;
                    if (entry2 != null) break block8;
                    object = null;
                }
                if (entry == null || entry.equals(object)) continue;
            }
            return false;
        }
        return !iterator.hasNext() && !iterator2.hasNext();
    }

    public final Object f(Object object, Object object2) {
        oe oe2 = this.a(object);
        if (oe2 != null) {
            return oe2.b;
        }
        this.d(object, object2);
        return null;
    }

    public final int hashCode() {
        Iterator iterator = this.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            n2 += ((og)iterator).c().hashCode();
        }
        return n2;
    }

    public final Iterator iterator() {
        oc oc2 = new oc(this.b, this.c);
        this.d.put(oc2, false);
        return oc2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(((og)iterator).c().toString());
            if (!iterator.hasNext()) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

