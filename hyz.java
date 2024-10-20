/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

final class hyz
extends AbstractMap {
    public Object[] a;
    public int b;
    public Map c = Collections.emptyMap();
    public boolean d;
    public Map e = Collections.emptyMap();
    private volatile hyy f;

    private final int f(Comparable comparable) {
        int n2 = this.b;
        int n3 = n2 - 1;
        int n4 = 0;
        int n5 = n3;
        int n6 = n4;
        if (n3 >= 0) {
            n6 = comparable.compareTo(((hyw)this.a[n3]).a);
            if (n6 > 0) {
                return -(n2 + 1);
            }
            if (n6 != 0) {
                n5 = n3;
                n6 = n4;
            } else {
                return n3;
            }
        }
        while (n6 <= n5) {
            n3 = (n6 + n5) / 2;
            n4 = comparable.compareTo(((hyw)this.a[n3]).a);
            if (n4 < 0) {
                n5 = n3 - 1;
                continue;
            }
            if (n4 > 0) {
                n6 = n3 + 1;
                continue;
            }
            return n3;
        }
        return -(n6 + 1);
    }

    private final SortedMap g() {
        this.e();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap;
            this.c = treeMap = new TreeMap();
            TreeMap treeMap2 = treeMap;
            this.e = treeMap.descendingMap();
        }
        return (SortedMap)this.c;
    }

    public final Iterable a() {
        Set<Object> set = this.c.isEmpty() ? Collections.emptySet() : this.c.entrySet();
        return set;
    }

    public final Object b(Comparable comparable, Object object) {
        Object object2;
        this.e();
        int n2 = this.f(comparable);
        if (n2 >= 0) {
            return ((hyw)this.a[n2]).setValue(object);
        }
        this.e();
        if (this.a == null) {
            this.a = new Object[16];
        }
        if ((n2 = -(n2 + 1)) >= 16) {
            return this.g().put(comparable, object);
        }
        if (this.b == 16) {
            object2 = (hyw)this.a[15];
            this.b = 15;
            this.g().put(object2.a, object2.b);
        }
        object2 = this.a;
        int n3 = ((Object[])object2).length;
        System.arraycopy(object2, n2, object2, n2 + 1, 15 - n2);
        this.a[n2] = new hyw(this, comparable, object);
        ++this.b;
        return null;
    }

    public final Object c(int n2) {
        this.e();
        Object object = this.a;
        Object object2 = ((hyw)object[n2]).b;
        System.arraycopy(object, n2 + 1, object, n2, this.b - n2 - 1);
        --this.b;
        if (!this.c.isEmpty()) {
            object = this.g().entrySet().iterator();
            Object[] objectArray = this.a;
            n2 = this.b++;
            Map.Entry entry = (Map.Entry)object.next();
            objectArray[n2] = new hyw(this, (Comparable)entry.getKey(), entry.getValue());
            object.remove();
        }
        return object2;
    }

    @Override
    public final void clear() {
        this.e();
        if (this.b != 0) {
            this.a = null;
            this.b = 0;
        }
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
    }

    @Override
    public final boolean containsKey(Object object) {
        return this.f((Comparable)(object = (Comparable)object)) >= 0 || this.c.containsKey(object);
        {
        }
    }

    public final Map.Entry d(int n2) {
        if (n2 < this.b) {
            return (hyw)this.a[n2];
        }
        throw new ArrayIndexOutOfBoundsException(n2);
    }

    public final void e() {
        if (!this.d) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public final Set entrySet() {
        if (this.f == null) {
            this.f = new hyy(this);
        }
        return this.f;
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof hyz)) {
            return super.equals(object);
        }
        object = (hyz)object;
        int n2 = this.size();
        if (n2 == ((hyz)object).size()) {
            int n3 = this.b;
            if (n3 == ((hyz)object).b) {
                for (int i2 = 0; i2 < n3; ++i2) {
                    if (this.d(i2).equals(((hyz)object).d(i2))) continue;
                    return false;
                }
                if (n3 != n2) {
                    return this.c.equals(((hyz)object).c);
                }
                return true;
            }
            return this.entrySet().equals(((hyz)object).entrySet());
        }
        return false;
    }

    @Override
    public final Object get(Object object) {
        int n2 = this.f((Comparable)(object = (Comparable)object));
        if (n2 >= 0) {
            return ((hyw)this.a[n2]).b;
        }
        return this.c.get(object);
    }

    @Override
    public final int hashCode() {
        int n2;
        int n3 = this.b;
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            n4 += this.a[n2].hashCode();
        }
        n2 = n4;
        if (this.c.size() > 0) {
            n2 = n4 + this.c.hashCode();
        }
        return n2;
    }

    @Override
    public final Object remove(Object object) {
        this.e();
        object = (Comparable)object;
        int n2 = this.f((Comparable)object);
        if (n2 >= 0) {
            return this.c(n2);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(object);
    }

    @Override
    public final int size() {
        return this.b + this.c.size();
    }
}

